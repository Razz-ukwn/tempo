package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ca  reason: invalid package */
public final class ca {

    /* renamed from: a  reason: collision with root package name */
    public Context f4461a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f4462b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f4463c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f4464d = null;

    /* renamed from: e  reason: collision with root package name */
    public ea f4465e = null;

    /* renamed from: f  reason: collision with root package name */
    public t5 f4466f = null;

    /* renamed from: g  reason: collision with root package name */
    public x5 f4467g;

    /* JADX INFO: finally extract failed */
    public static final x5 f(byte[] bArr) {
        s sVar = new s((Object) new ByteArrayInputStream(bArr));
        try {
            ag y10 = ag.y((InputStream) sVar.f13862a, c2.f4439b);
            ((InputStream) sVar.f13862a).close();
            ag agVar = w5.a(y10).f5033a;
            m2 m2Var = (m2) agVar.n(5);
            m2Var.g(agVar);
            return new x5((wf) m2Var);
        } catch (Throwable th) {
            ((InputStream) sVar.f13862a).close();
            throw th;
        }
    }

    public final void a(tf tfVar) {
        String y10 = tfVar.y();
        byte[] m = tfVar.x().m();
        mg w10 = tfVar.w();
        Object obj = da.f4488c;
        int ordinal = w10.ordinal();
        int i8 = 1;
        if (ordinal != 1) {
            i8 = 2;
            if (ordinal != 2) {
                i8 = 3;
                if (ordinal != 3) {
                    i8 = 4;
                    if (ordinal != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                }
            }
        }
        this.f4466f = t5.a(y10, m, i8);
    }

    public final void b(Context context, String str) {
        if (context != null) {
            this.f4461a = context;
            this.f4462b = "GenericIdpKeyset";
            this.f4463c = str;
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:56|57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        throw new java.io.CharConversionException(java.lang.String.format("can't read keyset; the pref value %s is not a valid hex string", new java.lang.Object[]{r2}));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00ef */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.p000firebaseauthapi.da c() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = r10.f4462b     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseauthapi.da.f4488c     // Catch:{ all -> 0x0112 }
            monitor-enter(r0)     // Catch:{ all -> 0x0112 }
            android.content.Context r1 = r10.f4461a     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = r10.f4462b     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = r10.f4463c     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0100
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0075 }
            r4 = 0
            if (r3 != 0) goto L_0x001c
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)     // Catch:{ all -> 0x0075 }
            goto L_0x0020
        L_0x001c:
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch:{ all -> 0x0075 }
        L_0x0020:
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            if (r1 != 0) goto L_0x0028
            goto L_0x0068
        L_0x0028:
            int r3 = r1.length()     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x00e7
            int r3 = r1.length()     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            int r3 = r3 / 2
            byte[] r5 = new byte[r3]     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            r6 = r4
        L_0x0039:
            if (r6 >= r3) goto L_0x0067
            int r7 = r6 + r6
            char r8 = r1.charAt(r7)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            r9 = 16
            int r8 = java.lang.Character.digit(r8, r9)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            int r7 = r7 + 1
            char r7 = r1.charAt(r7)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            int r7 = java.lang.Character.digit(r7, r9)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            r9 = -1
            if (r8 == r9) goto L_0x005f
            if (r7 == r9) goto L_0x005f
            int r8 = r8 * 16
            int r8 = r8 + r7
            byte r7 = (byte) r8     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            r5[r6] = r7     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            int r6 = r6 + 1
            goto L_0x0039
        L_0x005f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            java.lang.String r3 = "input is not hexadecimal"
            r1.<init>(r3)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            throw r1     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
        L_0x0067:
            r3 = r5
        L_0x0068:
            if (r3 != 0) goto L_0x00cc
            java.lang.String r1 = r10.f4464d     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0078
            com.google.android.gms.internal.firebase-auth-api.ea r1 = r10.d()     // Catch:{ all -> 0x0075 }
            r10.f4465e = r1     // Catch:{ all -> 0x0075 }
            goto L_0x0078
        L_0x0075:
            r1 = move-exception
            goto L_0x0108
        L_0x0078:
            com.google.android.gms.internal.firebase-auth-api.t5 r1 = r10.f4466f     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x00c4
            com.google.android.gms.internal.firebase-auth-api.x5 r1 = new com.google.android.gms.internal.firebase-auth-api.x5     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.wf r2 = com.google.android.gms.internal.p000firebaseauthapi.ag.v()     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.t5 r2 = r10.f4466f     // Catch:{ all -> 0x0075 }
            r1.b(r2)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.w5 r2 = r1.a()     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.ag r2 = r2.f5033a     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.eg r2 = com.google.android.gms.internal.p000firebaseauthapi.j6.a(r2)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.dg r2 = r2.u()     // Catch:{ all -> 0x0075 }
            int r2 = r2.t()     // Catch:{ all -> 0x0075 }
            r1.c(r2)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.ga r2 = new com.google.android.gms.internal.firebase-auth-api.ga     // Catch:{ all -> 0x0075 }
            android.content.Context r3 = r10.f4461a     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = r10.f4462b     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = r10.f4463c     // Catch:{ all -> 0x0075 }
            r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.ea r3 = r10.f4465e     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x00b8
            com.google.android.gms.internal.firebase-auth-api.w5 r3 = r1.a()     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.ea r4 = r10.f4465e     // Catch:{ all -> 0x0075 }
            r3.d(r2, r4)     // Catch:{ all -> 0x0075 }
            goto L_0x00c1
        L_0x00b8:
            com.google.android.gms.internal.firebase-auth-api.w5 r3 = r1.a()     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.ag r3 = r3.f5033a     // Catch:{ all -> 0x0075 }
            r2.b(r3)     // Catch:{ all -> 0x0075 }
        L_0x00c1:
            r10.f4467g = r1     // Catch:{ all -> 0x0075 }
            goto L_0x00df
        L_0x00c4:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "cannot read or generate keyset"
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x00cc:
            java.lang.String r1 = r10.f4464d     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x00d9
            java.lang.Object r1 = com.google.android.gms.internal.p000firebaseauthapi.da.f4488c     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.firebase-auth-api.x5 r1 = r10.e(r3)     // Catch:{ all -> 0x0075 }
            r10.f4467g = r1     // Catch:{ all -> 0x0075 }
            goto L_0x00df
        L_0x00d9:
            com.google.android.gms.internal.firebase-auth-api.x5 r1 = f(r3)     // Catch:{ all -> 0x0075 }
            r10.f4467g = r1     // Catch:{ all -> 0x0075 }
        L_0x00df:
            com.google.android.gms.internal.firebase-auth-api.da r1 = new com.google.android.gms.internal.firebase-auth-api.da     // Catch:{ all -> 0x0075 }
            r1.<init>(r10)     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            monitor-exit(r10)
            return r1
        L_0x00e7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            java.lang.String r3 = "Expected a string of even length"
            r1.<init>(r3)     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
            throw r1     // Catch:{ ClassCastException | IllegalArgumentException -> 0x00ef }
        L_0x00ef:
            java.io.CharConversionException r1 = new java.io.CharConversionException     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "can't read keyset; the pref value %s is not a valid hex string"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0075 }
            r5[r4] = r2     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = java.lang.String.format(r3, r5)     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0100:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "keysetName cannot be null"
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0108:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r1     // Catch:{ all -> 0x0112 }
        L_0x010a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "keysetName cannot be null"
            r0.<init>(r1)     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.ca.c():com.google.android.gms.internal.firebase-auth-api.da");
    }

    public final ea d() {
        Object obj = da.f4488c;
        fa faVar = new fa();
        try {
            boolean b10 = fa.b(this.f4464d);
            try {
                return faVar.zza(this.f4464d);
            } catch (GeneralSecurityException | ProviderException e10) {
                if (b10) {
                    Object obj2 = da.f4488c;
                    Log.w("da", "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f4464d}), e10);
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            Object obj3 = da.f4488c;
            Log.w("da", "cannot use Android Keystore, it'll be disabled", e11);
            return null;
        }
    }

    public final x5 e(byte[] bArr) {
        try {
            this.f4465e = new fa().zza(this.f4464d);
            try {
                ag agVar = w5.f(new s((Object) new ByteArrayInputStream(bArr)), this.f4465e).f5033a;
                m2 m2Var = (m2) agVar.n(5);
                m2Var.g(agVar);
                return new x5((wf) m2Var);
            } catch (IOException | GeneralSecurityException e10) {
                try {
                    return f(bArr);
                } catch (IOException unused) {
                    throw e10;
                }
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            try {
                x5 f10 = f(bArr);
                Object obj = da.f4488c;
                Log.w("da", "cannot use Android Keystore, it'll be disabled", e11);
                return f10;
            } catch (IOException unused2) {
                throw e11;
            }
        }
    }
}
