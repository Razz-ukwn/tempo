package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import cb.c;
import com.google.android.gms.internal.measurement.aa;
import e.s;
import f1.i;
import h0.d;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlinx.coroutines.internal.v;
import q0.h;
import q7.e2;
import q7.g2;
import s0.r;
import s0.s0;
import sf.j;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g  reason: invalid package */
public final /* synthetic */ class g implements ka, e2 {
    public static final /* synthetic */ g B = new g();

    /* renamed from: a  reason: collision with root package name */
    public static final c4 f4557a = new c4();

    /* renamed from: b  reason: collision with root package name */
    public static final d4 f4558b = new d4();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ g f4559c = new g();

    /* renamed from: d  reason: collision with root package name */
    public static final v f4560d = new v("UNDEFINED");

    /* renamed from: e  reason: collision with root package name */
    public static final v f4561e = new v("REUSABLE_CLAIMED");

    public static final d b(r rVar) {
        j.f(rVar, "<this>");
        s0 d02 = rVar.d0();
        if (d02 != null) {
            return d02.n0(rVar, true);
        }
        long j10 = rVar.f12811c;
        return new d(0.0f, 0.0f, (float) ((int) (j10 >> 32)), (float) i.a(j10));
    }

    public static final d c(s0 s0Var) {
        return ((s0) d(s0Var)).n0(s0Var, true);
    }

    public static final h d(s0 s0Var) {
        s0 s0Var2;
        s0 d02 = s0Var.d0();
        while (true) {
            s0 s0Var3 = d02;
            s0Var2 = s0Var;
            s0Var = s0Var3;
            if (s0Var == null) {
                break;
            }
            d02 = s0Var.d0();
        }
        s0 s0Var4 = s0Var2.E;
        while (true) {
            s0 s0Var5 = s0Var2;
            s0Var2 = s0Var4;
            s0 s0Var6 = s0Var5;
            if (s0Var2 == null) {
                return s0Var6;
            }
            s0Var4 = s0Var2.E;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r5.D0() != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(jf.d r7, java.lang.Object r8, rf.l r9) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.internal.f
            if (r0 == 0) goto L_0x00bc
            kotlinx.coroutines.internal.f r7 = (kotlinx.coroutines.internal.f) r7
            java.lang.Throwable r0 = ff.h.a(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            if (r9 == 0) goto L_0x0015
            ag.x r0 = new ag.x
            r0.<init>(r8, r9)
            goto L_0x001d
        L_0x0015:
            r0 = r8
            goto L_0x001d
        L_0x0017:
            ag.w r9 = new ag.w
            r9.<init>(r0, r1)
            r0 = r9
        L_0x001d:
            jf.d<T> r9 = r7.f10710e
            r7.getContext()
            ag.c0 r2 = r7.f10709d
            boolean r3 = r2.H0()
            r4 = 1
            if (r3 == 0) goto L_0x0038
            r7.B = r0
            r7.f474c = r4
            jf.f r8 = r7.getContext()
            r2.F0(r8, r7)
            goto L_0x00bf
        L_0x0038:
            ag.y0 r2 = ag.i2.a()
            boolean r3 = r2.M0()
            if (r3 == 0) goto L_0x004b
            r7.B = r0
            r7.f474c = r4
            r2.K0(r7)
            goto L_0x00bf
        L_0x004b:
            r2.L0(r4)
            r3 = 0
            jf.f r5 = r7.getContext()     // Catch:{ all -> 0x0073 }
            ag.n1$b r6 = ag.n1.b.f447a     // Catch:{ all -> 0x0073 }
            jf.f$b r5 = r5.d(r6)     // Catch:{ all -> 0x0073 }
            ag.n1 r5 = (ag.n1) r5     // Catch:{ all -> 0x0073 }
            if (r5 == 0) goto L_0x0075
            boolean r6 = r5.c()     // Catch:{ all -> 0x0073 }
            if (r6 != 0) goto L_0x0075
            java.util.concurrent.CancellationException r1 = r5.F()     // Catch:{ all -> 0x0073 }
            r7.c(r0, r1)     // Catch:{ all -> 0x0073 }
            ff.h$a r0 = cb.b.u(r1)     // Catch:{ all -> 0x0073 }
            r7.resumeWith(r0)     // Catch:{ all -> 0x0073 }
            r1 = r4
            goto L_0x0075
        L_0x0073:
            r8 = move-exception
            goto L_0x00b0
        L_0x0075:
            if (r1 != 0) goto L_0x00a9
            java.lang.Object r0 = r7.C     // Catch:{ all -> 0x0073 }
            jf.f r1 = r9.getContext()     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = kotlinx.coroutines.internal.x.c(r1, r0)     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.internal.v r5 = kotlinx.coroutines.internal.x.f10740a     // Catch:{ all -> 0x0073 }
            if (r0 == r5) goto L_0x008a
            ag.p2 r5 = ag.a0.c(r9, r1, r0)     // Catch:{ all -> 0x0073 }
            goto L_0x008b
        L_0x008a:
            r5 = r3
        L_0x008b:
            r9.resumeWith(r8)     // Catch:{ all -> 0x009c }
            ff.m r8 = ff.m.f8717a     // Catch:{ all -> 0x009c }
            if (r5 == 0) goto L_0x0098
            boolean r8 = r5.D0()     // Catch:{ all -> 0x0073 }
            if (r8 == 0) goto L_0x00a9
        L_0x0098:
            kotlinx.coroutines.internal.x.a(r1, r0)     // Catch:{ all -> 0x0073 }
            goto L_0x00a9
        L_0x009c:
            r8 = move-exception
            if (r5 == 0) goto L_0x00a5
            boolean r9 = r5.D0()     // Catch:{ all -> 0x0073 }
            if (r9 == 0) goto L_0x00a8
        L_0x00a5:
            kotlinx.coroutines.internal.x.a(r1, r0)     // Catch:{ all -> 0x0073 }
        L_0x00a8:
            throw r8     // Catch:{ all -> 0x0073 }
        L_0x00a9:
            boolean r8 = r2.O0()     // Catch:{ all -> 0x0073 }
            if (r8 != 0) goto L_0x00a9
            goto L_0x00b3
        L_0x00b0:
            r7.h(r8, r3)     // Catch:{ all -> 0x00b7 }
        L_0x00b3:
            r2.J0(r4)
            goto L_0x00bf
        L_0x00b7:
            r7 = move-exception
            r2.J0(r4)
            throw r7
        L_0x00bc:
            r7.resumeWith(r8)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.g.e(jf.d, java.lang.Object, rf.l):void");
    }

    public static a1 f(r9.r rVar) {
        String str = rVar.B;
        if (!TextUtils.isEmpty(str)) {
            boolean z10 = rVar.f14147e;
            a1 a1Var = new a1();
            String str2 = rVar.f14146d;
            q.f(str2);
            a1Var.f4364a = str2;
            q.f(str);
            a1Var.f4367d = str;
            a1Var.B = z10;
            return a1Var;
        }
        boolean z11 = rVar.f14147e;
        a1 a1Var2 = new a1();
        String str3 = rVar.f14143a;
        q.f(str3);
        a1Var2.f4365b = str3;
        String str4 = rVar.f14144b;
        q.f(str4);
        a1Var2.f4366c = str4;
        a1Var2.B = z11;
        return a1Var2;
    }

    public static r9 g(lf lfVar) {
        if (lfVar.w() == 3) {
            return new o9(16);
        }
        if (lfVar.w() == 4) {
            return new o9(32);
        }
        if (lfVar.w() == 5) {
            return new p9();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static u9 h(lf lfVar) {
        if (lfVar.y() == 3) {
            return new s((Object) new q9("HmacSha256"));
        }
        if (lfVar.y() == 4) {
            return ba.a(1);
        }
        if (lfVar.y() == 5) {
            return ba.a(2);
        }
        if (lfVar.y() == 6) {
            return ba.a(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static q9 i(lf lfVar) {
        if (lfVar.x() == 3) {
            return new q9("HmacSha256");
        }
        if (lfVar.x() == 4) {
            return new q9("HmacSha384");
        }
        if (lfVar.x() == 5) {
            return new q9("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static boolean j(byte b10) {
        return b10 > -65;
    }

    public c a(nb nbVar) {
        i8 i8Var;
        ab abVar = k8.f4686a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                qg w10 = qg.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    mg mgVar = ((lb) nbVar).f4716e;
                    int ordinal = mgVar.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                i8Var = i8.f4645d;
                            } else if (ordinal != 4) {
                                int zza = mgVar.zza();
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                            }
                        }
                        i8Var = i8.f4644c;
                    } else {
                        i8Var = i8.f4643b;
                    }
                    return h8.o(i8Var, r3.s.i(w10.x().m()), ((lb) nbVar).B);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzl());
    }
}
