package com.google.android.gms.internal.p000firebaseauthapi;

import b2.c;
import com.google.android.gms.internal.p000firebaseauthapi.d1;
import com.google.android.gms.internal.p000firebaseauthapi.e1;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e1  reason: invalid package */
public abstract class e1<MessageType extends e1<MessageType, BuilderType>, BuilderType extends d1<MessageType, BuilderType>> implements o3 {
    protected int zza = 0;

    public final byte[] a() {
        try {
            p2 p2Var = (p2) this;
            int zzs = p2Var.zzs();
            byte[] bArr = new byte[zzs];
            Logger logger = y1.f5090b;
            v1 v1Var = new v1(bArr, zzs);
            p2Var.i(v1Var);
            if (zzs - v1Var.f5008f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public int c(z3 z3Var) {
        throw null;
    }

    public final p1 zzo() {
        try {
            p2 p2Var = (p2) this;
            int zzs = p2Var.zzs();
            p1 p1Var = q1.f4830b;
            byte[] bArr = new byte[zzs];
            Logger logger = y1.f5090b;
            v1 v1Var = new v1(bArr, zzs);
            p2Var.i(v1Var);
            if (zzs - v1Var.f5008f == 0) {
                return new p1(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }
}
