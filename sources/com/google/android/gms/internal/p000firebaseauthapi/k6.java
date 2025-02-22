package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k6  reason: invalid package */
public final class k6 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4681a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b  reason: collision with root package name */
    public static final String f4682b = "type.googleapis.com/google.crypto.tink.AesGcmKey";

    static {
        new u6(0);
        new f7(1);
        new u6(2);
        new f7(0);
        new c8();
        new g8();
        new f7(2);
        new u6(3);
        int i8 = og.f4788a;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        i6.g(p6.f4808b);
        pc.a();
        boolean z10 = false;
        i6.f(new u6(0));
        ab abVar = z6.f5124a;
        xa xaVar = xa.f5079b;
        xaVar.e(z6.f5124a);
        xaVar.d(z6.f5125b);
        xaVar.c(z6.f5126c);
        xaVar.b(z6.f5127d);
        i6.f(new f7(1));
        xaVar.e(p7.f4809a);
        xaVar.d(p7.f4810b);
        xaVar.c(p7.f4811c);
        xaVar.b(p7.f4812d);
        if (!v8.a()) {
            i6.f(new f7(0));
            xaVar.e(j7.f4662a);
            xaVar.d(j7.f4663b);
            xaVar.c(j7.f4664c);
            xaVar.b(j7.f4665d);
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                z10 = true;
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            }
            if (z10) {
                i6.f(new u6(2));
                ab abVar2 = u7.f4985a;
                xa xaVar2 = xa.f5079b;
                xaVar2.e(u7.f4985a);
                xaVar2.d(u7.f4986b);
                xaVar2.c(u7.f4987c);
                xaVar2.b(u7.f4988d);
            }
            i6.f(new f7(2));
            ab abVar3 = z7.f5128a;
            xa xaVar3 = xa.f5079b;
            xaVar3.e(z7.f5128a);
            xaVar3.d(z7.f5129b);
            xaVar3.c(z7.f5130c);
            xaVar3.b(z7.f5131d);
            i6.f(new c8());
            i6.f(new g8());
            i6.f(new u6(3));
            xaVar3.e(k8.f4686a);
            xaVar3.d(k8.f4687b);
            xaVar3.c(k8.f4688c);
            xaVar3.b(k8.f4689d);
        }
    }
}
