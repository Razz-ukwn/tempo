package q7;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import u6.q;

public final class j5 extends x2 {
    public final ConcurrentHashMap B = new ConcurrentHashMap();
    public Activity C;
    public volatile boolean D;
    public volatile f5 E;
    public f5 F;
    public boolean G;
    public final Object H = new Object();

    /* renamed from: c  reason: collision with root package name */
    public volatile f5 f13138c;

    /* renamed from: d  reason: collision with root package name */
    public volatile f5 f13139d;

    /* renamed from: e  reason: collision with root package name */
    public f5 f13140e;

    public j5(x3 x3Var) {
        super(x3Var);
    }

    public final boolean l() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(q7.f5 r18, q7.f5 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r17.i()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0030
            long r8 = r1.f13002c
            long r10 = r2.f13002c
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0030
            java.lang.String r8 = r2.f13001b
            java.lang.String r9 = r1.f13001b
            boolean r8 = cb.c.n(r8, r9)
            if (r8 == 0) goto L_0x0030
            java.lang.String r8 = r2.f13000a
            java.lang.String r9 = r1.f13000a
            boolean r8 = cb.c.n(r8, r9)
            if (r8 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r8 = r6
            goto L_0x0031
        L_0x0030:
            r8 = r7
        L_0x0031:
            if (r22 == 0) goto L_0x0038
            q7.f5 r9 = r0.f13140e
            if (r9 == 0) goto L_0x0038
            r6 = r7
        L_0x0038:
            q7.k4 r9 = r0.f13121a
            if (r8 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x0044
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r5)
            goto L_0x0049
        L_0x0044:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0049:
            r13 = r8
            q7.a7.v(r1, r13, r7)
            if (r2 == 0) goto L_0x0068
            java.lang.String r5 = r2.f13000a
            if (r5 == 0) goto L_0x0058
            java.lang.String r8 = "_pn"
            r13.putString(r8, r5)
        L_0x0058:
            java.lang.String r5 = r2.f13001b
            if (r5 == 0) goto L_0x0061
            java.lang.String r8 = "_pc"
            r13.putString(r8, r5)
        L_0x0061:
            long r10 = r2.f13002c
            java.lang.String r2 = "_pi"
            r13.putLong(r2, r10)
        L_0x0068:
            r10 = 0
            if (r6 == 0) goto L_0x0088
            r2 = r9
            q7.x3 r2 = (q7.x3) r2
            q7.i6 r5 = r2.G
            q7.x3.k(r5)
            q7.g6 r5 = r5.f13126e
            long r14 = r5.f13086b
            long r14 = r3 - r14
            r5.f13086b = r3
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            q7.a7 r2 = r2.H
            q7.x3.j(r2)
            r2.t(r13, r14)
        L_0x0088:
            r2 = r9
            q7.x3 r2 = (q7.x3) r2
            q7.f r5 = r2.C
            boolean r5 = r5.s()
            if (r5 != 0) goto L_0x009a
            java.lang.String r5 = "_mst"
            r14 = 1
            r13.putLong(r5, r14)
        L_0x009a:
            boolean r5 = r1.f13004e
            if (r7 == r5) goto L_0x00a1
            java.lang.String r5 = "auto"
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r5 = "app"
        L_0x00a3:
            r14 = r5
            ag.m r5 = r2.J
            r5.getClass()
            long r15 = java.lang.System.currentTimeMillis()
            boolean r5 = r1.f13004e
            if (r5 == 0) goto L_0x00ba
            long r7 = r1.f13005f
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r11 = r7
            goto L_0x00bb
        L_0x00ba:
            r11 = r15
        L_0x00bb:
            q7.a5 r10 = r2.L
            q7.x3.k(r10)
            java.lang.String r15 = "_vs"
            r10.q(r11, r13, r14, r15)
        L_0x00c5:
            if (r6 == 0) goto L_0x00cd
            q7.f5 r2 = r0.f13140e
            r5 = 1
            r0.n(r2, r5, r3)
        L_0x00cd:
            r0.f13140e = r1
            boolean r2 = r1.f13004e
            if (r2 == 0) goto L_0x00d5
            r0.F = r1
        L_0x00d5:
            q7.x3 r9 = (q7.x3) r9
            q7.x5 r2 = r9.u()
            r2.i()
            r2.j()
            q7.z3 r3 = new q7.z3
            r4 = 4
            r3.<init>(r4, r2, r1)
            r2.u(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.j5.m(q7.f5, q7.f5, long, boolean, android.os.Bundle):void");
    }

    public final void n(f5 f5Var, boolean z10, long j10) {
        x3 x3Var = (x3) this.f13121a;
        z0 n2 = x3Var.n();
        x3Var.J.getClass();
        n2.l(SystemClock.elapsedRealtime());
        boolean z11 = f5Var != null && f5Var.f13003d;
        i6 i6Var = x3Var.G;
        x3.k(i6Var);
        if (i6Var.f13126e.a(z11, z10, j10) && f5Var != null) {
            f5Var.f13003d = false;
        }
    }

    public final f5 o(boolean z10) {
        j();
        i();
        if (!z10) {
            return this.f13140e;
        }
        f5 f5Var = this.f13140e;
        return f5Var != null ? f5Var : this.F;
    }

    public final String p(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        x3 x3Var = (x3) this.f13121a;
        x3Var.getClass();
        if (length2 <= 100) {
            return str;
        }
        x3Var.getClass();
        return str.substring(0, 100);
    }

    public final void q(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (((x3) this.f13121a).C.s() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.B.put(activity, new f5(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
        }
    }

    public final f5 r(Activity activity) {
        q.i(activity);
        f5 f5Var = (f5) this.B.get(activity);
        if (f5Var == null) {
            String p10 = p(activity.getClass());
            a7 a7Var = ((x3) this.f13121a).H;
            x3.j(a7Var);
            f5 f5Var2 = new f5(a7Var.m0(), (String) null, p10);
            this.B.put(activity, f5Var2);
            f5Var = f5Var2;
        }
        return this.E != null ? this.E : f5Var;
    }

    public final void s(Activity activity, f5 f5Var, boolean z10) {
        f5 f5Var2;
        f5 f5Var3 = f5Var;
        f5 f5Var4 = this.f13138c == null ? this.f13139d : this.f13138c;
        if (f5Var3.f13001b == null) {
            f5Var2 = new f5(f5Var3.f13000a, activity != null ? p(activity.getClass()) : null, f5Var3.f13002c, f5Var3.f13004e, f5Var3.f13005f);
        } else {
            f5Var2 = f5Var3;
        }
        this.f13139d = this.f13138c;
        this.f13138c = f5Var2;
        ((x3) this.f13121a).J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        w3 w3Var = ((x3) this.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new h5(this, f5Var2, f5Var4, elapsedRealtime, z10));
    }
}
