package com.google.android.gms.internal.p000firebaseauthapi;

import ag.b1;
import ag.m;
import androidx.fragment.app.q;
import androidx.fragment.app.z0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r8  reason: invalid package */
public abstract class r8 {

    /* renamed from: a  reason: collision with root package name */
    public final p8 f4876a;

    /* renamed from: b  reason: collision with root package name */
    public final p8 f4877b;

    public r8(byte[] bArr) {
        if (m.y(1)) {
            this.f4876a = a(bArr, 1);
            this.f4877b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract p8 a(byte[] bArr, int i8);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                int i8 = 0;
                byte[] bArr4 = new byte[32];
                this.f4877b.c(bArr, 0).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i10 = remaining % 16;
                int i11 = i10 == 0 ? remaining : (remaining + 16) - i10;
                ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i11);
                order.putLong(0);
                order.putLong((long) remaining);
                if (MessageDigest.isEqual(b1.j(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    p8 p8Var = this.f4876a;
                    p8Var.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    if (bArr.length == p8Var.a()) {
                        int remaining2 = byteBuffer.remaining();
                        int i12 = remaining2 / 64;
                        while (true) {
                            int i13 = i12 + 1;
                            if (i8 >= i13) {
                                return allocate.array();
                            }
                            ByteBuffer c3 = p8Var.c(bArr, p8Var.f4814b + i8);
                            if (i8 == i13 - 1) {
                                z0.i(allocate, byteBuffer, c3, remaining2 % 64);
                            } else {
                                z0.i(allocate, byteBuffer, c3, 64);
                            }
                            i8++;
                        }
                    } else {
                        throw new GeneralSecurityException(q.a("The nonce length (in bytes) must be ", p8Var.a()));
                    }
                } else {
                    throw new GeneralSecurityException("invalid MAC");
                }
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
