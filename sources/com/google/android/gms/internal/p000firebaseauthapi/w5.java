package com.google.android.gms.internal.p000firebaseauthapi;

import cb.c;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r3.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w5  reason: invalid package */
public final class w5 {

    /* renamed from: a  reason: collision with root package name */
    public final ag f5033a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5034b;

    /* renamed from: c  reason: collision with root package name */
    public final uc f5035c = uc.f4995b;

    public w5(ag agVar, List list) {
        this.f5033a = agVar;
        this.f5034b = list;
    }

    public static final w5 a(ag agVar) {
        if (agVar.t() > 0) {
            ArrayList arrayList = new ArrayList(agVar.t());
            for (yf yfVar : agVar.A()) {
                int t2 = yfVar.t();
                try {
                    try {
                        c a10 = xa.f5079b.a(lb.a(yfVar.u().y(), yfVar.u().x(), yfVar.u().u(), yfVar.x(), yfVar.x() == mg.RAW ? null : Integer.valueOf(yfVar.t())));
                        int C = yfVar.C() - 2;
                        if (!(C == 1 || C == 2)) {
                            if (C != 3) {
                                throw new GeneralSecurityException("Unknown key status");
                            }
                        }
                        int u7 = agVar.u();
                        arrayList.add(new v5(a10));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add((Object) null);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new sb("Creating a protokey serialization failed", e10);
                }
            }
            return new w5(agVar, Collections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX INFO: finally extract failed */
    public static final w5 f(s sVar, i5 i5Var) {
        byte[] bArr = new byte[0];
        try {
            c2 c2Var = c2.f4439b;
            ze v3 = ze.v((InputStream) sVar.f13862a, c2Var);
            ((InputStream) sVar.f13862a).close();
            if (v3.w().c() != 0) {
                try {
                    ag z10 = ag.z(i5Var.a(v3.w().m(), bArr), c2Var);
                    if (z10.t() > 0) {
                        return a(z10);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (w2 unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            } else {
                throw new GeneralSecurityException("empty keyset");
            }
        } catch (Throwable th) {
            ((InputStream) sVar.f13862a).close();
            throw th;
        }
    }

    public final w5 b() {
        ag agVar = this.f5033a;
        if (agVar != null) {
            wf v3 = ag.v();
            for (yf yfVar : agVar.A()) {
                rf u7 = yfVar.u();
                if (u7.u() == 3) {
                    String y10 = u7.y();
                    q1 x10 = u7.x();
                    m5 a10 = i6.a(y10);
                    if (a10 instanceof g6) {
                        rf a11 = ((g6) a10).a(x10);
                        String y11 = a11.y();
                        i6.a(y11).c(a11.x());
                        m2 m2Var = (m2) yfVar.n(5);
                        m2Var.g(yfVar);
                        xf xfVar = (xf) m2Var;
                        xfVar.j();
                        yf.y((yf) xfVar.f4729b, a11);
                        v3.j();
                        ag.C((ag) v3.f4729b, (yf) xfVar.h());
                    } else {
                        throw new GeneralSecurityException(b2.c.a("manager for key type ", y10, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            int u10 = agVar.u();
            v3.j();
            ((ag) v3.f4729b).zzd = u10;
            return a((ag) v3.h());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c() {
        /*
            r21 = this;
            r1 = r21
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.p000firebaseauthapi.i6.f4636a
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.wa r0 = com.google.android.gms.internal.p000firebaseauthapi.wa.f5049b     // Catch:{ GeneralSecurityException -> 0x000d }
            java.lang.Class r0 = r0.a()     // Catch:{ GeneralSecurityException -> 0x000d }
            r3 = r0
            goto L_0x000e
        L_0x000d:
            r3 = r2
        L_0x000e:
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.k5> r4 = com.google.android.gms.internal.p000firebaseauthapi.k5.class
            java.lang.String r5 = "No wrapper found for "
            if (r3 == 0) goto L_0x01fe
            int r0 = com.google.android.gms.internal.p000firebaseauthapi.j6.f4661a
            com.google.android.gms.internal.firebase-auth-api.ag r6 = r1.f5033a
            int r0 = r6.u()
            com.google.android.gms.internal.firebase-auth-api.t2 r7 = r6.A()
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
            r9 = 0
            r12 = r8
            r10 = r9
            r11 = r10
        L_0x0029:
            boolean r13 = r7.hasNext()
            r14 = 3
            if (r13 == 0) goto L_0x00bd
            java.lang.Object r13 = r7.next()
            com.google.android.gms.internal.firebase-auth-api.yf r13 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r13
            int r15 = r13.C()
            if (r15 != r14) goto L_0x0029
            boolean r14 = r13.B()
            if (r14 == 0) goto L_0x00a5
            com.google.android.gms.internal.firebase-auth-api.mg r14 = r13.x()
            com.google.android.gms.internal.firebase-auth-api.mg r15 = com.google.android.gms.internal.p000firebaseauthapi.mg.UNKNOWN_PREFIX
            if (r14 == r15) goto L_0x008d
            int r14 = r13.C()
            r15 = 2
            if (r14 == r15) goto L_0x0075
            int r14 = r13.t()
            if (r14 != r0) goto L_0x0063
            if (r11 != 0) goto L_0x005b
            r11 = r8
            goto L_0x0063
        L_0x005b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "keyset contains multiple primary keys"
            r0.<init>(r2)
            throw r0
        L_0x0063:
            com.google.android.gms.internal.firebase-auth-api.rf r13 = r13.u()
            int r13 = r13.u()
            r14 = 4
            if (r13 == r14) goto L_0x0070
            r13 = r9
            goto L_0x0071
        L_0x0070:
            r13 = r8
        L_0x0071:
            r12 = r12 & r13
            int r10 = r10 + 1
            goto L_0x0029
        L_0x0075:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r3 = r13.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r9] = r3
            java.lang.String r3 = "key %d has unknown status"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        L_0x008d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r3 = r13.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r9] = r3
            java.lang.String r3 = "key %d has unknown prefix"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        L_0x00a5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r3 = r13.t()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r9] = r3
            java.lang.String r3 = "key %d has no key data"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        L_0x00bd:
            if (r10 == 0) goto L_0x01f6
            if (r11 != 0) goto L_0x00cc
            if (r12 == 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "keyset doesn't contain a valid primary key"
            r0.<init>(r2)
            throw r0
        L_0x00cc:
            com.google.android.gms.internal.firebase-auth-api.b6 r7 = new com.google.android.gms.internal.firebase-auth-api.b6
            r7.<init>(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r7.f4420b
            if (r0 == 0) goto L_0x01ee
            com.google.android.gms.internal.firebase-auth-api.uc r0 = r1.f5035c
            r7.f4423e = r0
            r10 = r9
        L_0x00da:
            int r0 = r6.t()
            if (r10 >= r0) goto L_0x0181
            com.google.android.gms.internal.firebase-auth-api.yf r11 = r6.w(r10)
            int r0 = r11.C()
            if (r0 != r14) goto L_0x017d
            com.google.android.gms.internal.firebase-auth-api.rf r0 = r11.u()     // Catch:{ GeneralSecurityException -> 0x0109 }
            java.util.concurrent.atomic.AtomicReference r12 = com.google.android.gms.internal.p000firebaseauthapi.i6.f4636a     // Catch:{ GeneralSecurityException -> 0x0109 }
            java.lang.String r12 = r0.y()     // Catch:{ GeneralSecurityException -> 0x0109 }
            com.google.android.gms.internal.firebase-auth-api.q1 r0 = r0.x()     // Catch:{ GeneralSecurityException -> 0x0109 }
            java.util.concurrent.atomic.AtomicReference r13 = com.google.android.gms.internal.p000firebaseauthapi.i6.f4636a     // Catch:{ GeneralSecurityException -> 0x0109 }
            java.lang.Object r13 = r13.get()     // Catch:{ GeneralSecurityException -> 0x0109 }
            com.google.android.gms.internal.firebase-auth-api.r5 r13 = (com.google.android.gms.internal.p000firebaseauthapi.r5) r13     // Catch:{ GeneralSecurityException -> 0x0109 }
            com.google.android.gms.internal.firebase-auth-api.m5 r12 = r13.a(r3, r12)     // Catch:{ GeneralSecurityException -> 0x0109 }
            java.lang.Object r0 = r12.c(r0)     // Catch:{ GeneralSecurityException -> 0x0109 }
            goto L_0x0125
        L_0x0109:
            r0 = move-exception
            java.lang.String r12 = r0.getMessage()
            java.lang.String r13 = "No key manager found for key type "
            boolean r12 = r12.contains(r13)
            if (r12 != 0) goto L_0x0124
            java.lang.String r12 = r0.getMessage()
            java.lang.String r13 = " not supported by key manager of type "
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            throw r0
        L_0x0124:
            r0 = r2
        L_0x0125:
            java.util.List r12 = r1.f5034b
            java.lang.Object r13 = r12.get(r10)
            if (r13 == 0) goto L_0x013e
            java.lang.Object r12 = r12.get(r10)
            com.google.android.gms.internal.firebase-auth-api.v5 r12 = (com.google.android.gms.internal.p000firebaseauthapi.v5) r12
            cb.c r12 = r12.f5009a
            java.util.concurrent.atomic.AtomicReference r13 = com.google.android.gms.internal.p000firebaseauthapi.i6.f4636a     // Catch:{ GeneralSecurityException -> 0x013e }
            com.google.android.gms.internal.firebase-auth-api.wa r13 = com.google.android.gms.internal.p000firebaseauthapi.wa.f5049b     // Catch:{ GeneralSecurityException -> 0x013e }
            java.lang.Object r12 = r13.b(r12, r3)     // Catch:{ GeneralSecurityException -> 0x013e }
            goto L_0x013f
        L_0x013e:
            r12 = r2
        L_0x013f:
            if (r12 != 0) goto L_0x016c
            if (r0 == 0) goto L_0x0144
            goto L_0x016c
        L_0x0144:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = r3.toString()
            com.google.android.gms.internal.firebase-auth-api.rf r3 = r11.u()
            java.lang.String r3 = r3.y()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to get primitive "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " for key of type "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x016c:
            int r13 = r11.t()
            int r15 = r6.u()
            if (r13 != r15) goto L_0x017a
            r7.a(r12, r0, r11, r8)
            goto L_0x017d
        L_0x017a:
            r7.a(r12, r0, r11, r9)
        L_0x017d:
            int r10 = r10 + 1
            goto L_0x00da
        L_0x0181:
            java.util.concurrent.ConcurrentHashMap r0 = r7.f4420b
            if (r0 == 0) goto L_0x01e6
            com.google.android.gms.internal.firebase-auth-api.e6 r3 = new com.google.android.gms.internal.firebase-auth-api.e6
            java.util.ArrayList r6 = r7.f4421c
            com.google.android.gms.internal.firebase-auth-api.c6 r8 = r7.f4422d
            com.google.android.gms.internal.firebase-auth-api.uc r9 = r7.f4423e
            java.lang.Class r10 = r7.f4419a
            r15 = r3
            r16 = r0
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r10
            r15.<init>((java.util.concurrent.ConcurrentMap) r16, (java.util.ArrayList) r17, (com.google.android.gms.internal.p000firebaseauthapi.c6) r18, (com.google.android.gms.internal.p000firebaseauthapi.uc) r19, (java.lang.Class) r20)
            r7.f4420b = r2
            com.google.android.gms.internal.firebase-auth-api.wa r0 = com.google.android.gms.internal.p000firebaseauthapi.wa.f5049b
            java.util.concurrent.atomic.AtomicReference r0 = r0.f5050a
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.firebase-auth-api.jb r0 = (com.google.android.gms.internal.p000firebaseauthapi.jb) r0
            java.util.HashMap r0 = r0.f4670b
            boolean r2 = r0.containsKey(r4)
            if (r2 == 0) goto L_0x01d8
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.firebase-auth-api.f6 r0 = (com.google.android.gms.internal.p000firebaseauthapi.f6) r0
            java.lang.Class r2 = r0.zza()
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x01d0
            java.lang.Class r2 = r0.zza()
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x01d0
            java.lang.Object r0 = r0.a(r3)
            return r0
        L_0x01d0:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r0.<init>(r2)
            throw r0
        L_0x01d8:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = r4.toString()
            java.lang.String r2 = r5.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x01e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "build cannot be called twice"
            r0.<init>(r2)
            throw r0
        L_0x01ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "setAnnotations cannot be called after build"
            r0.<init>(r2)
            throw r0
        L_0x01f6:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "keyset must contain at least one ENABLED key"
            r0.<init>(r2)
            throw r0
        L_0x01fe:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = r4.getName()
            java.lang.String r2 = r5.concat(r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.w5.c():java.lang.Object");
    }

    public final void d(ga gaVar, i5 i5Var) {
        byte[] bArr = new byte[0];
        ag agVar = this.f5033a;
        byte[] b10 = i5Var.b(agVar.a(), bArr);
        try {
            if (ag.z(i5Var.a(b10, bArr), c2.f4439b).equals(agVar)) {
                int length = b10.length;
                ye t2 = ze.t();
                p1 l10 = q1.l(b10, 0, length);
                t2.j();
                ((ze) t2.f4729b).zzd = l10;
                eg a10 = j6.a(agVar);
                t2.j();
                ((ze) t2.f4729b).zze = a10;
                gaVar.a((ze) t2.h());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (w2 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(e.s r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.firebase-auth-api.ag r0 = r7.f5033a
            com.google.android.gms.internal.firebase-auth-api.t2 r1 = r0.A()
            java.util.Iterator r1 = r1.iterator()
        L_0x000a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.firebase-auth-api.yf r2 = (com.google.android.gms.internal.p000firebaseauthapi.yf) r2
            com.google.android.gms.internal.firebase-auth-api.rf r3 = r2.u()
            int r3 = r3.u()
            r4 = 2
            r5 = 1
            if (r3 == r5) goto L_0x0038
            com.google.android.gms.internal.firebase-auth-api.rf r3 = r2.u()
            int r3 = r3.u()
            if (r3 == r4) goto L_0x0038
            com.google.android.gms.internal.firebase-auth-api.rf r3 = r2.u()
            int r3 = r3.u()
            r6 = 3
            if (r3 == r6) goto L_0x0038
            goto L_0x000a
        L_0x0038:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.google.android.gms.internal.firebase-auth-api.rf r1 = r2.u()
            int r1 = r1.u()
            java.lang.String r1 = androidx.fragment.app.f1.e(r1)
            r3 = 0
            r0[r3] = r1
            com.google.android.gms.internal.firebase-auth-api.rf r1 = r2.u()
            java.lang.String r1 = r1.y()
            r0[r5] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r8.<init>(r0)
            throw r8
        L_0x005f:
            r8.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.w5.e(e.s):void");
    }

    public final String toString() {
        return j6.a(this.f5033a).toString();
    }
}
