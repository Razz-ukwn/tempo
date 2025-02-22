package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d8  reason: invalid package */
public final class d8 implements i5 {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4484c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final tf f4485a;

    /* renamed from: b  reason: collision with root package name */
    public final i5 f4486b;

    public d8(tf tfVar, i5 i5Var) {
        this.f4485a = tfVar;
        this.f4486b = i5Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i8 = wrap.getInt();
            if (i8 <= 0 || i8 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i8];
            wrap.get(bArr3, 0, i8);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] a10 = this.f4486b.a(bArr3, f4484c);
            String y10 = this.f4485a.y();
            AtomicReference atomicReference = i6.f4636a;
            p1 p1Var = q1.f4830b;
            return ((i5) ((r5) i6.f4636a.get()).a(i5.class, y10).c(q1.l(a10, 0, a10.length))).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
