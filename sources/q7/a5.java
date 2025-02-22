package q7;

import ag.m;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.platform.j3;
import com.google.android.gms.internal.measurement.kc;
import com.google.android.gms.internal.measurement.wa;
import com.google.android.gms.internal.measurement.xa;
import gc.b;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s6.k;
import u6.q;

public final class a5 extends x2 {
    public boolean B;
    public final AtomicReference C = new AtomicReference();
    public final Object D = new Object();
    public h E = new h((Boolean) null, (Boolean) null);
    public int F = 100;
    public final AtomicLong G = new AtomicLong(0);
    public long H = -1;
    public int I = 100;
    public final e7 J;
    public boolean K = true;
    public final i4 L = new i4((k4) this);

    /* renamed from: c  reason: collision with root package name */
    public z4 f12898c;

    /* renamed from: d  reason: collision with root package name */
    public j3 f12899d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet f12900e = new CopyOnWriteArraySet();

    public a5(x3 x3Var) {
        super(x3Var);
        this.J = new e7(x3Var);
    }

    public static /* bridge */ /* synthetic */ void C(a5 a5Var, h hVar, h hVar2) {
        boolean z10;
        g gVar = g.f13016c;
        g gVar2 = g.f13015b;
        g[] gVarArr = {gVar, gVar2};
        int i8 = 0;
        while (true) {
            if (i8 >= 2) {
                z10 = false;
                break;
            }
            g gVar3 = gVarArr[i8];
            if (!hVar2.f(gVar3) && hVar.f(gVar3)) {
                z10 = true;
                break;
            }
            i8++;
        }
        boolean g10 = hVar.g(hVar2, gVar, gVar2);
        if (z10 || g10) {
            ((x3) a5Var.f13121a).q().p();
        }
    }

    public static void D(a5 a5Var, h hVar, int i8, long j10, boolean z10, boolean z11) {
        a5Var.i();
        a5Var.j();
        int i10 = (j10 > a5Var.H ? 1 : (j10 == a5Var.H ? 0 : -1));
        k4 k4Var = a5Var.f13121a;
        if (i10 <= 0) {
            int i11 = a5Var.I;
            h hVar2 = h.f13093b;
            if (i11 <= i8) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.H.c(hVar, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        x3 x3Var = (x3) k4Var;
        g3 g3Var = x3Var.D;
        x3.j(g3Var);
        g3Var.i();
        if (g3Var.t(i8)) {
            SharedPreferences.Editor edit = g3Var.m().edit();
            edit.putString("consent_settings", hVar.e());
            edit.putInt("consent_source", i8);
            edit.apply();
            a5Var.H = j10;
            a5Var.I = i8;
            x5 u7 = x3Var.u();
            u7.i();
            u7.j();
            if (z10) {
                k4 k4Var2 = u7.f13121a;
                ((x3) k4Var2).getClass();
                ((x3) k4Var2).r().n();
            }
            if (u7.p()) {
                u7.u(new n5(u7, u7.r(false), 1));
            }
            if (z11) {
                x3Var.u().y(new AtomicReference());
                return;
            }
            return;
        }
        s2 s2Var2 = x3Var.E;
        x3.l(s2Var2);
        s2Var2.H.c(Integer.valueOf(i8), "Lower precedence consent source ignored, proposed source");
    }

    public final void A() {
        i();
        x3 x3Var = (x3) this.f13121a;
        g3 g3Var = x3Var.D;
        x3.j(g3Var);
        String a10 = g3Var.H.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                x3Var.J.getClass();
                y(System.currentTimeMillis(), (Object) null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a10) ? 0 : 1);
                x3Var.J.getClass();
                y(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        if (!x3Var.g() || !this.K) {
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.I.b("Updating Scion state (FE)");
            x5 u7 = x3Var.u();
            u7.i();
            u7.j();
            u7.u(new z3(5, u7, u7.r(true)));
            return;
        }
        s2 s2Var2 = x3Var.E;
        x3.l(s2Var2);
        s2Var2.I.b("Recording app launch after enabling measurement for the first time (FE)");
        E();
        ((xa) wa.f5574b.f5575a.zza()).zza();
        if (x3Var.C.r((String) null, g2.f13033f0)) {
            i6 i6Var = x3Var.G;
            x3.k(i6Var);
            i6Var.f13125d.a();
        }
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.q(new k(this, 1));
    }

    public final String B() {
        return (String) this.C.get();
    }

    public final void E() {
        i();
        j();
        x3 x3Var = (x3) this.f13121a;
        if (x3Var.i()) {
            if (x3Var.C.r((String) null, g2.Z)) {
                f fVar = x3Var.C;
                ((x3) fVar.f13121a).getClass();
                Boolean q10 = fVar.q("google_analytics_deferred_deep_link_enabled");
                if (q10 != null && q10.booleanValue()) {
                    s2 s2Var = x3Var.E;
                    x3.l(s2Var);
                    s2Var.I.b("Deferred Deep Link feature enabled.");
                    w3 w3Var = x3Var.F;
                    x3.l(w3Var);
                    w3Var.q(new p4(this, 0));
                }
            }
            x5 u7 = x3Var.u();
            u7.i();
            u7.j();
            c7 r10 = u7.r(true);
            ((x3) u7.f13121a).r().p(new byte[0], 3);
            u7.u(new t4(3, u7, r10));
            this.K = false;
            g3 g3Var = x3Var.D;
            x3.j(g3Var);
            g3Var.i();
            String string = g3Var.m().getString("previous_os_version", (String) null);
            ((x3) g3Var.f13121a).p().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = g3Var.m().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                x3Var.p().k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    p("auto", "_ou", bundle);
                }
            }
        }
    }

    public final boolean l() {
        return false;
    }

    public final void m(String str, String str2, Bundle bundle) {
        x3 x3Var = (x3) this.f13121a;
        x3Var.J.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        q.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.q(new z3(2, this, bundle2));
    }

    public final void n() {
        k4 k4Var = this.f13121a;
        if ((((x3) k4Var).f13419a.getApplicationContext() instanceof Application) && this.f12898c != null) {
            ((Application) ((x3) k4Var).f13419a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f12898c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b5, code lost:
        r2 = r0.f13138c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b7, code lost:
        r4 = ((q7.x3) r0.f13121a).H;
        q7.x3.j(r4);
        r12 = new q7.f5(r13, r14, r4.m0(), true, r26);
        r0.f13138c = r12;
        r0.f13139d = r2;
        r0.E = r12;
        ((q7.x3) r0.f13121a).J.getClass();
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = ((q7.x3) r0.f13121a).F;
        q7.x3.l(r6);
        r6.q(new q7.g5(r0, r1, r12, r2, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r5 > 100) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0130, code lost:
        if (r6 > 100) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0192, code lost:
        r2 = ((q7.x3) r0.f13121a).E;
        q7.x3.l(r2);
        r2 = r2.J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x019d, code lost:
        if (r13 != null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019f, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a2, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a3, code lost:
        if (r14 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a5, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a8, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a9, code lost:
        r2.d(r3, r4, "Logging screen view with name, class");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b0, code lost:
        if (r0.f13138c != null) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b2, code lost:
        r2 = r0.f13139d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            r0 = r22
            if (r23 != 0) goto L_0x000c
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r23
        L_0x000e:
            java.lang.String r2 = "screen_view"
            r3 = 0
            if (r0 == r2) goto L_0x00bc
            if (r0 == 0) goto L_0x001b
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00bc
        L_0x001b:
            if (r25 == 0) goto L_0x002a
            androidx.compose.ui.platform.j3 r2 = r11.f12899d
            if (r2 == 0) goto L_0x002a
            boolean r2 = q7.a7.W(r22)
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r9 = r3
            goto L_0x002c
        L_0x002a:
            r2 = 1
            r9 = r2
        L_0x002c:
            if (r21 != 0) goto L_0x0032
            java.lang.String r2 = "app"
            r4 = r2
            goto L_0x0034
        L_0x0032:
            r4 = r21
        L_0x0034:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r1)
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r7.get(r2)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0060
            android.os.Bundle r6 = new android.os.Bundle
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6.<init>(r5)
            r7.putBundle(r2, r6)
            goto L_0x0041
        L_0x0060:
            boolean r2 = r5 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x007c
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            r2 = r3
        L_0x0067:
            int r6 = r5.length
            if (r2 >= r6) goto L_0x0041
            r6 = r5[r2]
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x0079
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5[r2] = r8
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x0067
        L_0x007c:
            boolean r2 = r5 instanceof java.util.List
            if (r2 == 0) goto L_0x0041
            java.util.List r5 = (java.util.List) r5
            r2 = r3
        L_0x0083:
            int r6 = r5.size()
            if (r2 >= r6) goto L_0x0041
            java.lang.Object r6 = r5.get(r2)
            boolean r8 = r6 instanceof android.os.Bundle
            if (r8 == 0) goto L_0x009b
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r6 = (android.os.Bundle) r6
            r8.<init>(r6)
            r5.set(r2, r8)
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x009e:
            q7.k4 r1 = r11.f13121a
            q7.x3 r1 = (q7.x3) r1
            q7.w3 r12 = r1.F
            q7.x3.l(r12)
            q7.q4 r13 = new q7.q4
            r1 = r13
            r2 = r20
            r3 = r4
            r4 = r22
            r5 = r26
            r8 = r25
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r12.q(r13)
            return
        L_0x00bc:
            q7.k4 r0 = r11.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.j5 r0 = r0.K
            q7.x3.k(r0)
            java.lang.Object r2 = r0.H
            monitor-enter(r2)
            boolean r4 = r0.G     // Catch:{ all -> 0x018e }
            if (r4 != 0) goto L_0x00df
            q7.k4 r0 = r0.f13121a     // Catch:{ all -> 0x018e }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x018e }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x018e }
            q7.x3.l(r0)     // Catch:{ all -> 0x018e }
            q7.q2 r0 = r0.G     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.b(r1)     // Catch:{ all -> 0x018e }
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            goto L_0x01fe
        L_0x00df:
            java.lang.String r4 = "screen_name"
            java.lang.String r13 = r1.getString(r4)     // Catch:{ all -> 0x018e }
            r4 = 100
            if (r13 == 0) goto L_0x0117
            int r5 = r13.length()     // Catch:{ all -> 0x018e }
            if (r5 <= 0) goto L_0x00fc
            int r5 = r13.length()     // Catch:{ all -> 0x018e }
            q7.k4 r6 = r0.f13121a     // Catch:{ all -> 0x018e }
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x018e }
            r6.getClass()     // Catch:{ all -> 0x018e }
            if (r5 <= r4) goto L_0x0117
        L_0x00fc:
            q7.k4 r0 = r0.f13121a     // Catch:{ all -> 0x018e }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x018e }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x018e }
            q7.x3.l(r0)     // Catch:{ all -> 0x018e }
            q7.q2 r0 = r0.G     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r3 = r13.length()     // Catch:{ all -> 0x018e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x018e }
            r0.c(r3, r1)     // Catch:{ all -> 0x018e }
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            goto L_0x01fe
        L_0x0117:
            java.lang.String r5 = "screen_class"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ all -> 0x018e }
            if (r5 == 0) goto L_0x014d
            int r6 = r5.length()     // Catch:{ all -> 0x018e }
            if (r6 <= 0) goto L_0x0132
            int r6 = r5.length()     // Catch:{ all -> 0x018e }
            q7.k4 r7 = r0.f13121a     // Catch:{ all -> 0x018e }
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x018e }
            r7.getClass()     // Catch:{ all -> 0x018e }
            if (r6 <= r4) goto L_0x014d
        L_0x0132:
            q7.k4 r0 = r0.f13121a     // Catch:{ all -> 0x018e }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x018e }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x018e }
            q7.x3.l(r0)     // Catch:{ all -> 0x018e }
            q7.q2 r0 = r0.G     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r3 = r5.length()     // Catch:{ all -> 0x018e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x018e }
            r0.c(r3, r1)     // Catch:{ all -> 0x018e }
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            goto L_0x01fe
        L_0x014d:
            if (r5 != 0) goto L_0x0160
            android.app.Activity r4 = r0.C     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x015c
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x018e }
            java.lang.String r4 = r0.p(r4)     // Catch:{ all -> 0x018e }
            goto L_0x015e
        L_0x015c:
            java.lang.String r4 = "Activity"
        L_0x015e:
            r14 = r4
            goto L_0x0161
        L_0x0160:
            r14 = r5
        L_0x0161:
            q7.f5 r4 = r0.f13138c     // Catch:{ all -> 0x018e }
            boolean r5 = r0.D     // Catch:{ all -> 0x018e }
            if (r5 == 0) goto L_0x0191
            if (r4 == 0) goto L_0x0191
            r0.D = r3     // Catch:{ all -> 0x018e }
            java.lang.String r3 = r4.f13001b     // Catch:{ all -> 0x018e }
            boolean r3 = cb.c.n(r3, r14)     // Catch:{ all -> 0x018e }
            java.lang.String r4 = r4.f13000a     // Catch:{ all -> 0x018e }
            boolean r4 = cb.c.n(r4, r13)     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x0191
            if (r4 == 0) goto L_0x0191
            q7.k4 r0 = r0.f13121a     // Catch:{ all -> 0x018e }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ all -> 0x018e }
            q7.s2 r0 = r0.E     // Catch:{ all -> 0x018e }
            q7.x3.l(r0)     // Catch:{ all -> 0x018e }
            q7.q2 r0 = r0.G     // Catch:{ all -> 0x018e }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.b(r1)     // Catch:{ all -> 0x018e }
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            goto L_0x01fe
        L_0x018e:
            r0 = move-exception
            goto L_0x01ff
        L_0x0191:
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            q7.k4 r2 = r0.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r2 = r2.E
            q7.x3.l(r2)
            q7.q2 r2 = r2.J
            if (r13 != 0) goto L_0x01a2
            java.lang.String r3 = "null"
            goto L_0x01a3
        L_0x01a2:
            r3 = r13
        L_0x01a3:
            if (r14 != 0) goto L_0x01a8
            java.lang.String r4 = "null"
            goto L_0x01a9
        L_0x01a8:
            r4 = r14
        L_0x01a9:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.d(r3, r4, r5)
            q7.f5 r2 = r0.f13138c
            if (r2 != 0) goto L_0x01b5
            q7.f5 r2 = r0.f13139d
            goto L_0x01b7
        L_0x01b5:
            q7.f5 r2 = r0.f13138c
        L_0x01b7:
            q7.f5 r3 = new q7.f5
            q7.k4 r4 = r0.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.a7 r4 = r4.H
            q7.x3.j(r4)
            long r15 = r4.m0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r0.f13138c = r3
            r0.f13139d = r2
            r0.E = r3
            q7.k4 r4 = r0.f13121a
            q7.x3 r4 = (q7.x3) r4
            ag.m r4 = r4.J
            r4.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            q7.k4 r6 = r0.f13121a
            q7.x3 r6 = (q7.x3) r6
            q7.w3 r6 = r6.F
            q7.x3.l(r6)
            q7.g5 r7 = new q7.g5
            r21 = r7
            r22 = r0
            r23 = r1
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.q(r7)
        L_0x01fe:
            return
        L_0x01ff:
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a5.o(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void p(String str, String str2, Bundle bundle) {
        i();
        ((x3) this.f13121a).J.getClass();
        q(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void q(long j10, Bundle bundle, String str, String str2) {
        i();
        r(str, str2, j10, bundle, true, this.f12899d == null || a7.W(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r4v12, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r15v4, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.lang.String r26, java.lang.String r27, long r28, android.os.Bundle r30, boolean r31, boolean r32, boolean r33, java.lang.String r34) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r12 = r30
            r13 = r33
            u6.q.f(r26)
            u6.q.i(r30)
            r25.i()
            r25.j()
            q7.k4 r1 = r7.f13121a
            r14 = r1
            q7.x3 r14 = (q7.x3) r14
            boolean r0 = r14.g()
            if (r0 == 0) goto L_0x054d
            q7.k2 r0 = r14.q()
            java.util.List r0 = r0.E
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0032
            goto L_0x003f
        L_0x0032:
            q7.s2 r0 = r14.E
            q7.x3.l(r0)
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            q7.q2 r0 = r0.I
            r0.d(r9, r8, r1)
            return
        L_0x003f:
            boolean r0 = r7.B
            r15 = 0
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0098
            r7.B = r6
            r0 = r1
            q7.x3 r0 = (q7.x3) r0     // Catch:{ ClassNotFoundException -> 0x008c }
            boolean r0 = r0.f13426e     // Catch:{ ClassNotFoundException -> 0x008c }
            java.lang.String r2 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x005f
            r0 = r1
            q7.x3 r0 = (q7.x3) r0     // Catch:{ ClassNotFoundException -> 0x008c }
            android.content.Context r0 = r0.f13419a     // Catch:{ ClassNotFoundException -> 0x008c }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008c }
            java.lang.Class r0 = java.lang.Class.forName(r2, r6, r0)     // Catch:{ ClassNotFoundException -> 0x008c }
            goto L_0x0063
        L_0x005f:
            java.lang.Class r0 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x008c }
        L_0x0063:
            java.lang.String r2 = "initialize"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x007c }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r5] = r4     // Catch:{ Exception -> 0x007c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch:{ Exception -> 0x007c }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x007c }
            r3 = r1
            q7.x3 r3 = (q7.x3) r3     // Catch:{ Exception -> 0x007c }
            android.content.Context r3 = r3.f13419a     // Catch:{ Exception -> 0x007c }
            r2[r5] = r3     // Catch:{ Exception -> 0x007c }
            r0.invoke(r15, r2)     // Catch:{ Exception -> 0x007c }
            goto L_0x0098
        L_0x007c:
            r0 = move-exception
            q7.x3 r1 = (q7.x3) r1     // Catch:{ ClassNotFoundException -> 0x008c }
            q7.s2 r1 = r1.E     // Catch:{ ClassNotFoundException -> 0x008c }
            q7.x3.l(r1)     // Catch:{ ClassNotFoundException -> 0x008c }
            q7.q2 r1 = r1.E     // Catch:{ ClassNotFoundException -> 0x008c }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.c(r0, r2)     // Catch:{ ClassNotFoundException -> 0x008c }
            goto L_0x0098
        L_0x008c:
            q7.s2 r0 = r14.E
            q7.x3.l(r0)
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            q7.q2 r0 = r0.H
            r0.b(r1)
        L_0x0098:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00c6
            r14.getClass()
            java.lang.String r4 = r12.getString(r0)
            ag.m r0 = r14.J
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "auto"
            java.lang.String r16 = "_lgclid"
            r1 = r25
            r15 = r5
            r5 = r0
            r6 = r16
            r1.y(r2, r4, r5, r6)
            goto L_0x00c7
        L_0x00c6:
            r15 = r5
        L_0x00c7:
            r14.getClass()
            if (r31 == 0) goto L_0x00ec
            java.lang.String[] r0 = q7.a7.D
            r0 = r0[r15]
            boolean r0 = r0.equals(r9)
            r6 = 1
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x00ed
            q7.a7 r0 = r14.H
            q7.x3.j(r0)
            q7.g3 r1 = r14.D
            q7.x3.j(r1)
            q7.c3 r1 = r1.S
            android.os.Bundle r1 = r1.a()
            r0.w(r12, r1)
            goto L_0x00ed
        L_0x00ec:
            r6 = 1
        L_0x00ed:
            q7.i4 r0 = r7.L
            r1 = 40
            if (r13 != 0) goto L_0x016e
            r14.getClass()
            java.lang.String r2 = "_iap"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x016e
            q7.a7 r2 = r14.H
            q7.x3.j(r2)
            java.lang.String r3 = "event"
            boolean r4 = r2.Q(r3, r9)
            if (r4 != 0) goto L_0x010c
            goto L_0x0126
        L_0x010c:
            java.lang.String[] r4 = cb.e.Y
            java.lang.String[] r5 = cb.e.Z
            boolean r4 = r2.N(r3, r4, r5, r9)
            if (r4 != 0) goto L_0x0119
            r5 = 13
            goto L_0x0129
        L_0x0119:
            q7.k4 r4 = r2.f13121a
            q7.x3 r4 = (q7.x3) r4
            r4.getClass()
            boolean r2 = r2.K(r1, r3, r9)
            if (r2 != 0) goto L_0x0128
        L_0x0126:
            r5 = 2
            goto L_0x0129
        L_0x0128:
            r5 = r15
        L_0x0129:
            if (r5 == 0) goto L_0x016e
            q7.s2 r2 = r14.E
            q7.x3.l(r2)
            q7.n2 r3 = r14.I
            java.lang.String r3 = r3.d(r9)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            q7.q2 r2 = r2.D
            r2.c(r3, r4)
            q7.a7 r2 = r14.H
            q7.x3.j(r2)
            r14.getClass()
            r2.getClass()
            java.lang.String r1 = q7.a7.p(r9, r1, r6)
            if (r9 == 0) goto L_0x0153
            int r2 = r27.length()
            r15 = r2
        L_0x0153:
            q7.a7 r2 = r14.H
            q7.x3.j(r2)
            r3 = 0
            java.lang.String r4 = "_ev"
            r2.getClass()
            r26 = r0
            r27 = r3
            r28 = r5
            r29 = r4
            r30 = r1
            r31 = r15
            q7.a7.z(r26, r27, r28, r29, r30, r31)
            return
        L_0x016e:
            r14.getClass()
            q7.j5 r2 = r14.K
            q7.x3.k(r2)
            q7.f5 r2 = r2.o(r15)
            java.lang.String r3 = "_sc"
            if (r2 == 0) goto L_0x0186
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x0186
            r2.f13003d = r6
        L_0x0186:
            if (r31 == 0) goto L_0x018c
            if (r13 != 0) goto L_0x018c
            r4 = r6
            goto L_0x018d
        L_0x018c:
            r4 = r15
        L_0x018d:
            q7.a7.v(r2, r12, r4)
            java.lang.String r2 = "am"
            boolean r2 = r2.equals(r8)
            boolean r4 = q7.a7.W(r27)
            if (r31 == 0) goto L_0x01f0
            androidx.compose.ui.platform.j3 r5 = r7.f12899d
            if (r5 == 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01f0
            if (r2 == 0) goto L_0x01a7
            r16 = r6
            goto L_0x01f2
        L_0x01a7:
            q7.s2 r0 = r14.E
            q7.x3.l(r0)
            q7.n2 r1 = r14.I
            java.lang.String r1 = r1.d(r9)
            q7.n2 r2 = r14.I
            java.lang.String r2 = r2.b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            q7.q2 r0 = r0.I
            r0.d(r1, r2, r3)
            androidx.compose.ui.platform.j3 r0 = r7.f12899d
            u6.q.i(r0)
            androidx.compose.ui.platform.j3 r13 = r7.f12899d
            r13.getClass()
            java.lang.Object r0 = r13.f1338a     // Catch:{ RemoteException -> 0x01da }
            r1 = r0
            com.google.android.gms.internal.measurement.x0 r1 = (com.google.android.gms.internal.measurement.x0) r1     // Catch:{ RemoteException -> 0x01da }
            r2 = r28
            r4 = r30
            r5 = r26
            r6 = r27
            r1.k(r2, r4, r5, r6)     // Catch:{ RemoteException -> 0x01da }
            goto L_0x01ef
        L_0x01da:
            r0 = move-exception
            java.lang.Object r1 = r13.f1339b
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r1
            q7.x3 r1 = r1.f5666a
            if (r1 == 0) goto L_0x01ef
            q7.s2 r1 = r1.E
            q7.x3.l(r1)
            java.lang.String r2 = "Event interceptor threw exception"
            q7.q2 r1 = r1.E
            r1.c(r0, r2)
        L_0x01ef:
            return
        L_0x01f0:
            r16 = r2
        L_0x01f2:
            boolean r2 = r14.i()
            if (r2 == 0) goto L_0x054b
            q7.a7 r2 = r14.H
            q7.x3.j(r2)
            int r2 = r2.g0(r9)
            if (r2 == 0) goto L_0x0245
            q7.s2 r3 = r14.E
            q7.x3.l(r3)
            q7.n2 r4 = r14.I
            java.lang.String r4 = r4.d(r9)
            java.lang.String r5 = "Invalid event name. Event will not be logged (FE)"
            q7.q2 r3 = r3.D
            r3.c(r4, r5)
            q7.a7 r3 = r14.H
            q7.x3.j(r3)
            r14.getClass()
            r3.getClass()
            java.lang.String r1 = q7.a7.p(r9, r1, r6)
            if (r9 == 0) goto L_0x022b
            int r5 = r27.length()
            r15 = r5
        L_0x022b:
            q7.a7 r3 = r14.H
            q7.x3.j(r3)
            java.lang.String r4 = "_ev"
            r3.getClass()
            r26 = r0
            r27 = r34
            r28 = r2
            r29 = r4
            r30 = r1
            r31 = r15
            q7.a7.z(r26, r27, r28, r29, r30, r31)
            return
        L_0x0245:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r2 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r3, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            q7.a7 r2 = r14.H
            q7.x3.j(r2)
            android.os.Bundle r12 = r2.p0(r9, r12, r1, r13)
            u6.q.i(r12)
            r14.getClass()
            q7.j5 r1 = r14.K
            q7.x3.k(r1)
            q7.f5 r1 = r1.o(r15)
            java.lang.String r13 = "_ae"
            r4 = 0
            if (r1 == 0) goto L_0x02a3
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x02a3
            q7.i6 r1 = r14.G
            q7.x3.k(r1)
            q7.g6 r1 = r1.f13126e
            q7.i6 r2 = r1.f13088d
            q7.k4 r2 = r2.f13121a
            q7.x3 r2 = (q7.x3) r2
            ag.m r2 = r2.J
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = r1.f13086b
            long r6 = r2 - r6
            r1.f13086b = r2
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x02a3
            q7.a7 r1 = r14.H
            q7.x3.j(r1)
            r1.t(r12, r6)
        L_0x02a3:
            com.google.android.gms.internal.measurement.ja r1 = com.google.android.gms.internal.measurement.ja.f5342b
            com.google.android.gms.internal.measurement.g5 r1 = r1.f5343a
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.measurement.ka r1 = (com.google.android.gms.internal.measurement.ka) r1
            r1.zza()
            q7.f r1 = r14.C
            q7.f2 r2 = q7.g2.f13031e0
            r7 = 0
            boolean r1 = r1.r(r7, r2)
            if (r1 == 0) goto L_0x0344
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0321
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0321
            q7.a7 r1 = r14.H
            q7.x3.j(r1)
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = z6.f.b(r2)
            if (r3 == 0) goto L_0x02de
            r2 = r7
            goto L_0x02e4
        L_0x02de:
            if (r2 == 0) goto L_0x02e4
            java.lang.String r2 = r2.trim()
        L_0x02e4:
            q7.k4 r3 = r1.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.g3 r3 = r3.D
            q7.x3.j(r3)
            q7.f3 r3 = r3.P
            java.lang.String r3 = r3.a()
            if (r2 == r3) goto L_0x0300
            if (r2 == 0) goto L_0x02fe
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x02fe
            goto L_0x0300
        L_0x02fe:
            r6 = r15
            goto L_0x0301
        L_0x0300:
            r6 = 1
        L_0x0301:
            q7.k4 r1 = r1.f13121a
            if (r6 != 0) goto L_0x0312
            q7.x3 r1 = (q7.x3) r1
            q7.g3 r1 = r1.D
            q7.x3.j(r1)
            q7.f3 r1 = r1.P
            r1.b(r2)
            goto L_0x0344
        L_0x0312:
            q7.x3 r1 = (q7.x3) r1
            q7.s2 r0 = r1.E
            q7.x3.l(r0)
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            q7.q2 r0 = r0.I
            r0.b(r1)
            return
        L_0x0321:
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x0344
            q7.a7 r1 = r14.H
            q7.x3.j(r1)
            q7.k4 r1 = r1.f13121a
            q7.x3 r1 = (q7.x3) r1
            q7.g3 r1 = r1.D
            q7.x3.j(r1)
            q7.f3 r1 = r1.P
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0344
            r12.putString(r2, r1)
        L_0x0344:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r12)
            q7.g3 r1 = r14.D
            q7.x3.j(r1)
            q7.d3 r1 = r1.J
            long r1 = r1.a()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x03cd
            q7.g3 r1 = r14.D
            q7.x3.j(r1)
            boolean r1 = r1.s(r10)
            if (r1 == 0) goto L_0x03cd
            q7.g3 r1 = r14.D
            q7.x3.j(r1)
            q7.b3 r1 = r1.M
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x03cd
            q7.s2 r1 = r14.E
            q7.x3.l(r1)
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            q7.q2 r1 = r1.J
            r1.b(r2)
            ag.m r1 = r14.J
            r1.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r17 = "auto"
            java.lang.String r19 = "_sid"
            r20 = 0
            r1 = r25
            r7 = r4
            r4 = r20
            r5 = r17
            r31 = r6
            r15 = 1
            r6 = r19
            r1.y(r2, r4, r5, r6)
            ag.m r1 = r14.J
            r1.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_sno"
            r4 = 0
            r1 = r25
            r1.y(r2, r4, r5, r6)
            ag.m r1 = r14.J
            r1.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_se"
            r1 = r25
            r1.y(r2, r4, r5, r6)
            q7.g3 r1 = r14.D
            q7.x3.j(r1)
            q7.d3 r1 = r1.K
            r1.b(r7)
            goto L_0x03d1
        L_0x03cd:
            r7 = r4
            r31 = r6
            r15 = 1
        L_0x03d1:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r7)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x03f3
            q7.s2 r1 = r14.E
            q7.x3.l(r1)
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            q7.q2 r1 = r1.J
            r1.b(r2)
            q7.i6 r1 = r14.G
            q7.x3.k(r1)
            q7.h6 r1 = r1.f13125d
            r1.b(r15, r10)
        L_0x03f3:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r5 = 0
        L_0x0404:
            if (r5 >= r2) goto L_0x0451
            java.lang.Object r3 = r1.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x044e
            q7.a7 r4 = r14.H
            q7.x3.j(r4)
            java.lang.Object r4 = r12.get(r3)
            boolean r6 = r4 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0423
            android.os.Bundle[] r6 = new android.os.Bundle[r15]
            android.os.Bundle r4 = (android.os.Bundle) r4
            r7 = 0
            r6[r7] = r4
            goto L_0x0449
        L_0x0423:
            boolean r6 = r4 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0434
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r6 = r4.length
            java.lang.Class<android.os.Bundle[]> r7 = android.os.Bundle[].class
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6, r7)
            r6 = r4
            android.os.Bundle[] r6 = (android.os.Bundle[]) r6
            goto L_0x0449
        L_0x0434:
            boolean r6 = r4 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0448
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = r4.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r4 = r4.toArray(r6)
            r6 = r4
            android.os.Bundle[] r6 = (android.os.Bundle[]) r6
            goto L_0x0449
        L_0x0448:
            r6 = 0
        L_0x0449:
            if (r6 == 0) goto L_0x044e
            r12.putParcelableArray(r3, r6)
        L_0x044e:
            int r5 = r5 + 1
            goto L_0x0404
        L_0x0451:
            r7 = 0
        L_0x0452:
            int r1 = r31.size()
            if (r7 >= r1) goto L_0x051f
            r8 = r31
            java.lang.Object r1 = r8.get(r7)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r7 == 0) goto L_0x0467
            java.lang.String r2 = "_ep"
            r12 = r26
            goto L_0x046a
        L_0x0467:
            r12 = r26
            r2 = r9
        L_0x046a:
            r1.putString(r0, r12)
            if (r32 == 0) goto L_0x0478
            q7.a7 r3 = r14.H
            q7.x3.j(r3)
            android.os.Bundle r1 = r3.o0(r1)
        L_0x0478:
            r5 = r1
            q7.s r6 = new q7.s
            q7.q r3 = new q7.q
            r3.<init>(r5)
            r1 = r6
            r4 = r26
            r24 = r5
            r15 = r6
            r5 = r28
            r1.<init>(r2, r3, r4, r5)
            q7.x5 r1 = r14.u()
            r1.getClass()
            r1.i()
            r1.j()
            q7.k4 r2 = r1.f13121a
            r3 = r2
            q7.x3 r3 = (q7.x3) r3
            r3.getClass()
            q7.x3 r2 = (q7.x3) r2
            q7.m2 r2 = r2.r()
            r2.getClass()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            q7.t.a(r15, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x04d1
            q7.k4 r2 = r2.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r2 = r2.E
            q7.x3.l(r2)
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            q7.q2 r2 = r2.C
            r2.b(r3)
            r2 = 1
            r21 = 0
            goto L_0x04d9
        L_0x04d1:
            r3 = 0
            boolean r5 = r2.p(r4, r3)
            r21 = r5
            r2 = 1
        L_0x04d9:
            q7.c7 r20 = r1.r(r2)
            s6.i r2 = new s6.i
            r18 = r2
            r19 = r1
            r22 = r15
            r23 = r34
            r18.<init>((q7.x5) r19, (q7.c7) r20, (boolean) r21, (q7.s) r22, (java.lang.String) r23)
            r1.u(r2)
            r15 = r25
            if (r16 != 0) goto L_0x0518
            java.util.concurrent.CopyOnWriteArraySet r1 = r15.f12900e
            java.util.Iterator r18 = r1.iterator()
        L_0x04f7:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0518
            java.lang.Object r1 = r18.next()
            q7.m4 r1 = (q7.m4) r1
            android.os.Bundle r4 = new android.os.Bundle
            r6 = r24
            r4.<init>(r6)
            r2 = r28
            r5 = r26
            r19 = r6
            r6 = r27
            r1.a(r2, r4, r5, r6)
            r24 = r19
            goto L_0x04f7
        L_0x0518:
            int r7 = r7 + 1
            r31 = r8
            r15 = 1
            goto L_0x0452
        L_0x051f:
            r15 = r25
            r14.getClass()
            q7.j5 r0 = r14.K
            q7.x3.k(r0)
            r1 = 0
            q7.f5 r0 = r0.o(r1)
            if (r0 == 0) goto L_0x054c
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x054c
            q7.i6 r0 = r14.G
            q7.x3.k(r0)
            ag.m r1 = r14.J
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            q7.g6 r0 = r0.f13126e
            r3 = 1
            r0.a(r3, r3, r1)
            goto L_0x054c
        L_0x054b:
            r15 = r7
        L_0x054c:
            return
        L_0x054d:
            r15 = r7
            q7.s2 r0 = r14.E
            q7.x3.l(r0)
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            q7.q2 r0 = r0.I
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a5.r(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void s(boolean z10, long j10) {
        i();
        j();
        x3 x3Var = (x3) this.f13121a;
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.I.b("Resetting analytics data (FE)");
        i6 i6Var = x3Var.G;
        x3.k(i6Var);
        i6Var.i();
        g6 g6Var = i6Var.f13126e;
        g6Var.f13087c.a();
        g6Var.f13085a = 0;
        g6Var.f13086b = 0;
        kc.b();
        if (x3Var.C.r((String) null, g2.f13043k0)) {
            x3Var.q().p();
        }
        boolean g10 = x3Var.g();
        g3 g3Var = x3Var.D;
        x3.j(g3Var);
        g3Var.f13074e.b(j10);
        x3 x3Var2 = (x3) g3Var.f13121a;
        g3 g3Var2 = x3Var2.D;
        x3.j(g3Var2);
        if (!TextUtils.isEmpty(g3Var2.P.a())) {
            g3Var.P.b((String) null);
        }
        wa waVar = wa.f5574b;
        ((xa) waVar.f5575a.zza()).zza();
        f fVar = x3Var2.C;
        f2 f2Var = g2.f13033f0;
        if (fVar.r((String) null, f2Var)) {
            g3Var.J.b(0);
        }
        g3Var.K.b(0);
        if (!x3Var2.C.t()) {
            g3Var.r(!g10);
        }
        g3Var.Q.b((String) null);
        g3Var.R.b(0);
        g3Var.S.b((Bundle) null);
        if (z10) {
            x5 u7 = x3Var.u();
            u7.i();
            u7.j();
            c7 r10 = u7.r(false);
            k4 k4Var = u7.f13121a;
            ((x3) k4Var).getClass();
            ((x3) k4Var).r().n();
            u7.u(new n5(u7, r10, 0));
        }
        ((xa) waVar.f5575a.zza()).zza();
        if (x3Var.C.r((String) null, f2Var)) {
            i6 i6Var2 = x3Var.G;
            x3.k(i6Var2);
            i6Var2.f13125d.a();
        }
        this.K = !g10;
    }

    public final void t(Bundle bundle, long j10) {
        q.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        k4 k4Var = this.f13121a;
        if (!isEmpty) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.E.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Class<String> cls = String.class;
        m.t(bundle2, "app_id", cls, (Object) null);
        m.t(bundle2, "origin", cls, (Object) null);
        m.t(bundle2, "name", cls, (Object) null);
        m.t(bundle2, "value", Object.class, (Object) null);
        m.t(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        m.t(bundle2, "trigger_timeout", cls2, 0L);
        m.t(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        m.t(bundle2, "timed_out_event_params", cls3, (Object) null);
        m.t(bundle2, "triggered_event_name", cls, (Object) null);
        m.t(bundle2, "triggered_event_params", cls3, (Object) null);
        m.t(bundle2, "time_to_live", cls2, 0L);
        m.t(bundle2, "expired_event_name", cls, (Object) null);
        m.t(bundle2, "expired_event_params", cls3, (Object) null);
        q.f(bundle2.getString("name"));
        q.f(bundle2.getString("origin"));
        q.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        x3 x3Var = (x3) k4Var;
        a7 a7Var = x3Var.H;
        x3.j(a7Var);
        if (a7Var.j0(string) == 0) {
            a7 a7Var2 = x3Var.H;
            x3.j(a7Var2);
            if (a7Var2.f0(obj, string) == 0) {
                a7 a7Var3 = x3Var.H;
                x3.j(a7Var3);
                Object n2 = a7Var3.n(obj, string);
                if (n2 == null) {
                    s2 s2Var2 = x3Var.E;
                    x3.l(s2Var2);
                    s2Var2.B.d(x3Var.I.f(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                m.D(bundle2, n2);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    x3Var.getClass();
                    if (j11 > 15552000000L || j11 < 1) {
                        s2 s2Var3 = x3Var.E;
                        x3.l(s2Var3);
                        s2Var3.B.d(x3Var.I.f(string), Long.valueOf(j11), "Invalid conditional user property timeout");
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                x3Var.getClass();
                if (j12 > 15552000000L || j12 < 1) {
                    s2 s2Var4 = x3Var.E;
                    x3.l(s2Var4);
                    s2Var4.B.d(x3Var.I.f(string), Long.valueOf(j12), "Invalid conditional user property time to live");
                    return;
                }
                w3 w3Var = x3Var.F;
                x3.l(w3Var);
                w3Var.q(new t4(0, this, bundle2));
                return;
            }
            s2 s2Var5 = x3Var.E;
            x3.l(s2Var5);
            s2Var5.B.d(x3Var.I.f(string), obj, "Invalid conditional user property value");
            return;
        }
        s2 s2Var6 = x3Var.E;
        x3.l(s2Var6);
        s2Var6.B.c(x3Var.I.f(string), "Invalid conditional user property name");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(android.os.Bundle r7, int r8, long r9) {
        /*
            r6 = this;
            r6.j()
            q7.h r0 = q7.h.f13093b
            q7.g[] r0 = q7.g.values()
            int r1 = r0.length
            r2 = 0
        L_0x000b:
            r3 = 0
            if (r2 >= r1) goto L_0x003d
            r4 = r0[r2]
            java.lang.String r5 = r4.f13019a
            boolean r5 = r7.containsKey(r5)
            if (r5 == 0) goto L_0x003a
            java.lang.String r4 = r4.f13019a
            java.lang.String r4 = r7.getString(r4)
            if (r4 == 0) goto L_0x003a
            java.lang.String r5 = "granted"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x002b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x0035
        L_0x002b:
            java.lang.String r5 = "denied"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0035
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L_0x0035:
            if (r3 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r3 = r4
            goto L_0x003d
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x003d:
            if (r3 == 0) goto L_0x005b
            q7.k4 r0 = r6.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r1 = r0.E
            q7.x3.l(r1)
            java.lang.String r2 = "Ignoring invalid consent setting"
            q7.q2 r1 = r1.G
            r1.c(r3, r2)
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r1 = "Valid consent values are 'granted', 'denied'"
            q7.q2 r0 = r0.G
            r0.b(r1)
        L_0x005b:
            q7.h r7 = q7.h.a(r7)
            r6.v(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a5.u(android.os.Bundle, int, long):void");
    }

    public final void v(h hVar, int i8, long j10) {
        h hVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        h hVar3 = hVar;
        int i10 = i8;
        j();
        if (i10 != -10) {
            if (((Boolean) hVar3.f13094a.get(g.f13015b)) == null) {
                if (((Boolean) hVar3.f13094a.get(g.f13016c)) == null) {
                    s2 s2Var = ((x3) this.f13121a).E;
                    x3.l(s2Var);
                    s2Var.G.b("Discarding empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.D) {
            try {
                hVar2 = this.E;
                int i11 = this.F;
                h hVar4 = h.f13093b;
                z10 = false;
                if (i10 <= i11) {
                    z12 = hVar3.g(hVar2, (g[]) hVar3.f13094a.keySet().toArray(new g[0]));
                    g gVar = g.f13016c;
                    if (hVar3.f(gVar) && !this.E.f(gVar)) {
                        z10 = true;
                    }
                    hVar3 = hVar3.d(this.E);
                    this.E = hVar3;
                    this.F = i10;
                    z11 = z10;
                    z10 = true;
                } else {
                    z12 = false;
                    z11 = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z10) {
            s2 s2Var2 = ((x3) this.f13121a).E;
            x3.l(s2Var2);
            s2Var2.H.c(hVar3, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.G.getAndIncrement();
        if (z12) {
            this.C.set((Object) null);
            w3 w3Var = ((x3) this.f13121a).F;
            x3.l(w3Var);
            w3Var.r(new w4(this, hVar3, j10, i8, andIncrement, z11, hVar2));
            return;
        }
        x4 x4Var = new x4(this, hVar3, i8, andIncrement, z11, hVar2);
        if (i10 == 30 || i10 == -10) {
            w3 w3Var2 = ((x3) this.f13121a).F;
            x3.l(w3Var2);
            w3Var2.r(x4Var);
            return;
        }
        w3 w3Var3 = ((x3) this.f13121a).F;
        x3.l(w3Var3);
        w3Var3.q(x4Var);
    }

    public final void w(h hVar) {
        i();
        boolean z10 = (hVar.f(g.f13016c) && hVar.f(g.f13015b)) || ((x3) this.f13121a).u().p();
        x3 x3Var = (x3) this.f13121a;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.i();
        if (z10 != x3Var.Z) {
            x3 x3Var2 = (x3) this.f13121a;
            w3 w3Var2 = x3Var2.F;
            x3.l(w3Var2);
            w3Var2.i();
            x3Var2.Z = z10;
            g3 g3Var = ((x3) this.f13121a).D;
            x3.j(g3Var);
            g3Var.i();
            Boolean valueOf = g3Var.m().contains("measurement_enabled_from_api") ? Boolean.valueOf(g3Var.m().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                z(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void x(String str, String str2, Object obj, boolean z10, long j10) {
        int i8;
        String str3 = str2;
        Object obj2 = obj;
        int i10 = 0;
        k4 k4Var = this.f13121a;
        if (z10) {
            a7 a7Var = ((x3) k4Var).H;
            x3.j(a7Var);
            i8 = a7Var.j0(str2);
        } else {
            a7 a7Var2 = ((x3) k4Var).H;
            x3.j(a7Var2);
            if (a7Var2.Q("user property", str2)) {
                if (!a7Var2.N("user property", b.J, (String[]) null, str2)) {
                    i8 = 15;
                } else {
                    ((x3) a7Var2.f13121a).getClass();
                    if (a7Var2.K(24, "user property", str2)) {
                        i8 = 0;
                    }
                }
            }
            i8 = 6;
        }
        i4 i4Var = this.L;
        if (i8 != 0) {
            x3 x3Var = (x3) k4Var;
            a7 a7Var3 = x3Var.H;
            x3.j(a7Var3);
            x3Var.getClass();
            a7Var3.getClass();
            String p10 = a7.p(str2, 24, true);
            if (str3 != null) {
                i10 = str2.length();
            }
            a7 a7Var4 = x3Var.H;
            x3.j(a7Var4);
            a7Var4.getClass();
            a7.z(i4Var, (String) null, i8, "_ev", p10, i10);
            return;
        }
        String str4 = str == null ? "app" : str;
        if (obj2 != null) {
            x3 x3Var2 = (x3) k4Var;
            a7 a7Var5 = x3Var2.H;
            x3.j(a7Var5);
            int f02 = a7Var5.f0(obj, str2);
            if (f02 != 0) {
                a7 a7Var6 = x3Var2.H;
                x3.j(a7Var6);
                x3Var2.getClass();
                a7Var6.getClass();
                String p11 = a7.p(str2, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i10 = obj.toString().length();
                }
                a7 a7Var7 = x3Var2.H;
                x3.j(a7Var7);
                a7Var7.getClass();
                a7.z(i4Var, (String) null, f02, "_ev", p11, i10);
                return;
            }
            a7 a7Var8 = x3Var2.H;
            x3.j(a7Var8);
            Object n2 = a7Var8.n(obj, str2);
            if (n2 != null) {
                w3 w3Var = ((x3) k4Var).F;
                x3.l(w3Var);
                w3Var.q(new r4(this, str4, str2, n2, j10));
                return;
            }
            return;
        }
        w3 w3Var2 = ((x3) k4Var).F;
        x3.l(w3Var2);
        w3Var2.q(new r4(this, str4, str2, (Object) null, j10));
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(long r10, java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            u6.q.f(r13)
            u6.q.f(r14)
            r9.i()
            r9.j()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r14)
            r1 = 1
            q7.k4 r2 = r9.f13121a
            if (r0 == 0) goto L_0x0067
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0054
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0054
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r12 = r0.toLowerCase(r12)
            java.lang.String r14 = "false"
            boolean r12 = r14.equals(r12)
            r3 = 1
            if (r1 == r12) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r0 = r2
            q7.x3 r0 = (q7.x3) r0
            q7.g3 r0 = r0.D
            q7.x3.j(r0)
            long r5 = r12.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x004e
            java.lang.String r14 = "true"
        L_0x004e:
            q7.f3 r0 = r0.H
            r0.b(r14)
            goto L_0x0065
        L_0x0054:
            if (r12 != 0) goto L_0x0067
            r14 = r2
            q7.x3 r14 = (q7.x3) r14
            q7.g3 r14 = r14.D
            q7.x3.j(r14)
            q7.f3 r14 = r14.H
            java.lang.String r0 = "unset"
            r14.b(r0)
        L_0x0065:
            java.lang.String r14 = "_npa"
        L_0x0067:
            r6 = r12
            r7 = r14
            q7.x3 r2 = (q7.x3) r2
            boolean r12 = r2.g()
            if (r12 != 0) goto L_0x007e
            q7.s2 r10 = r2.E
            q7.x3.l(r10)
            java.lang.String r11 = "User property not set since app measurement is disabled"
            q7.q2 r10 = r10.J
            r10.b(r11)
            return
        L_0x007e:
            boolean r12 = r2.i()
            if (r12 != 0) goto L_0x0085
            return
        L_0x0085:
            q7.w6 r12 = new q7.w6
            r3 = r12
            r4 = r10
            r8 = r13
            r3.<init>(r4, r6, r7, r8)
            q7.x5 r10 = r2.u()
            r10.i()
            r10.j()
            q7.k4 r11 = r10.f13121a
            r13 = r11
            q7.x3 r13 = (q7.x3) r13
            r13.getClass()
            q7.x3 r11 = (q7.x3) r11
            q7.m2 r11 = r11.r()
            r11.getClass()
            android.os.Parcel r13 = android.os.Parcel.obtain()
            q7.x6.a(r12, r13)
            byte[] r14 = r13.marshall()
            r13.recycle()
            int r13 = r14.length
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r0) goto L_0x00cd
            q7.k4 r11 = r11.f13121a
            q7.x3 r11 = (q7.x3) r11
            q7.s2 r11 = r11.E
            q7.x3.l(r11)
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            q7.q2 r11 = r11.C
            r11.b(r13)
            r11 = 0
            goto L_0x00d1
        L_0x00cd:
            boolean r11 = r11.p(r14, r1)
        L_0x00d1:
            q7.c7 r13 = r10.r(r1)
            q7.m5 r14 = new q7.m5
            r14.<init>(r10, r13, r11, r12)
            r10.u(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.a5.y(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void z(Boolean bool, boolean z10) {
        i();
        j();
        x3 x3Var = (x3) this.f13121a;
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.I.c(bool, "Setting app measurement enabled (FE)");
        g3 g3Var = x3Var.D;
        x3.j(g3Var);
        g3Var.q(bool);
        if (z10) {
            g3 g3Var2 = x3Var.D;
            x3.j(g3Var2);
            g3Var2.i();
            SharedPreferences.Editor edit = g3Var2.m().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.i();
        if (x3Var.Z || (bool != null && !bool.booleanValue())) {
            A();
        }
    }
}
