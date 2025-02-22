package q7;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import s6.m;

@TargetApi(14)
public final class z4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a5 f13466a;

    public z4(a5 a5Var) {
        this.f13466a = a5Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d A[Catch:{ RuntimeException -> 0x00c5, all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9 A[Catch:{ RuntimeException -> 0x00c5, all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab A[Catch:{ RuntimeException -> 0x00c5, all -> 0x00c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r13, android.os.Bundle r14) {
        /*
            r12 = this;
            q7.a5 r0 = r12.f13466a
            q7.k4 r1 = r0.f13121a     // Catch:{ RuntimeException -> 0x00c5 }
            q7.x3 r1 = (q7.x3) r1     // Catch:{ RuntimeException -> 0x00c5 }
            q7.s2 r1 = r1.E     // Catch:{ RuntimeException -> 0x00c5 }
            q7.x3.l(r1)     // Catch:{ RuntimeException -> 0x00c5 }
            q7.q2 r1 = r1.J     // Catch:{ RuntimeException -> 0x00c5 }
            java.lang.String r2 = "onActivityCreated"
            r1.b(r2)     // Catch:{ RuntimeException -> 0x00c5 }
            android.content.Intent r1 = r13.getIntent()     // Catch:{ RuntimeException -> 0x00c5 }
            q7.k4 r2 = r0.f13121a
            if (r1 != 0) goto L_0x0025
            q7.x3 r2 = (q7.x3) r2
        L_0x001c:
            q7.j5 r0 = r2.K
        L_0x001e:
            q7.x3.k(r0)
            r0.q(r13, r14)
            return
        L_0x0025:
            com.google.android.gms.internal.measurement.pa r3 = com.google.android.gms.internal.measurement.pa.f5474b     // Catch:{ RuntimeException -> 0x00c5 }
            com.google.android.gms.internal.measurement.g5 r3 = r3.f5475a     // Catch:{ RuntimeException -> 0x00c5 }
            java.lang.Object r3 = r3.zza()     // Catch:{ RuntimeException -> 0x00c5 }
            com.google.android.gms.internal.measurement.qa r3 = (com.google.android.gms.internal.measurement.qa) r3     // Catch:{ RuntimeException -> 0x00c5 }
            r3.zza()     // Catch:{ RuntimeException -> 0x00c5 }
            r3 = r2
            q7.x3 r3 = (q7.x3) r3     // Catch:{ RuntimeException -> 0x00c5 }
            q7.f r3 = r3.C     // Catch:{ RuntimeException -> 0x00c5 }
            q7.f2 r4 = q7.g2.f13070y0     // Catch:{ RuntimeException -> 0x00c5 }
            r5 = 0
            boolean r3 = r3.r(r5, r4)     // Catch:{ RuntimeException -> 0x00c5 }
            if (r3 != 0) goto L_0x0045
            android.net.Uri r5 = r1.getData()     // Catch:{ RuntimeException -> 0x00c5 }
            goto L_0x006a
        L_0x0045:
            android.net.Uri r3 = r1.getData()     // Catch:{ RuntimeException -> 0x00c5 }
            if (r3 == 0) goto L_0x0054
            boolean r4 = r3.isHierarchical()     // Catch:{ RuntimeException -> 0x00c5 }
            if (r4 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r9 = r3
            goto L_0x006b
        L_0x0054:
            android.os.Bundle r3 = r1.getExtras()     // Catch:{ RuntimeException -> 0x00c5 }
            if (r3 == 0) goto L_0x006a
            java.lang.String r4 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ RuntimeException -> 0x00c5 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RuntimeException -> 0x00c5 }
            if (r4 != 0) goto L_0x006a
            android.net.Uri r5 = android.net.Uri.parse(r3)     // Catch:{ RuntimeException -> 0x00c5 }
        L_0x006a:
            r9 = r5
        L_0x006b:
            if (r9 == 0) goto L_0x00c7
            boolean r3 = r9.isHierarchical()     // Catch:{ RuntimeException -> 0x00c5 }
            if (r3 != 0) goto L_0x0074
            goto L_0x00c7
        L_0x0074:
            r3 = r2
            q7.x3 r3 = (q7.x3) r3     // Catch:{ RuntimeException -> 0x00c5 }
            q7.a7 r3 = r3.H     // Catch:{ RuntimeException -> 0x00c5 }
            q7.x3.j(r3)     // Catch:{ RuntimeException -> 0x00c5 }
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r1 = r1.getStringExtra(r3)     // Catch:{ RuntimeException -> 0x00c5 }
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r1)     // Catch:{ RuntimeException -> 0x00c5 }
            if (r3 != 0) goto L_0x009e
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r1)     // Catch:{ RuntimeException -> 0x00c5 }
            if (r3 != 0) goto L_0x009e
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r1 = r3.equals(r1)     // Catch:{ RuntimeException -> 0x00c5 }
            if (r1 == 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            java.lang.String r1 = "auto"
            goto L_0x00a0
        L_0x009e:
            java.lang.String r1 = "gs"
        L_0x00a0:
            r10 = r1
            java.lang.String r1 = "referrer"
            java.lang.String r11 = r9.getQueryParameter(r1)     // Catch:{ RuntimeException -> 0x00c5 }
            if (r14 != 0) goto L_0x00ab
            r1 = 1
            goto L_0x00ac
        L_0x00ab:
            r1 = 0
        L_0x00ac:
            r8 = r1
            r1 = r2
            q7.x3 r1 = (q7.x3) r1     // Catch:{ RuntimeException -> 0x00c5 }
            q7.w3 r1 = r1.F     // Catch:{ RuntimeException -> 0x00c5 }
            q7.x3.l(r1)     // Catch:{ RuntimeException -> 0x00c5 }
            q7.y4 r3 = new q7.y4     // Catch:{ RuntimeException -> 0x00c5 }
            r6 = r3
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x00c5 }
            r1.q(r3)     // Catch:{ RuntimeException -> 0x00c5 }
            q7.x3 r2 = (q7.x3) r2
            goto L_0x001c
        L_0x00c3:
            r1 = move-exception
            goto L_0x00e3
        L_0x00c5:
            r1 = move-exception
            goto L_0x00cb
        L_0x00c7:
            q7.x3 r2 = (q7.x3) r2
            goto L_0x001c
        L_0x00cb:
            q7.k4 r2 = r0.f13121a     // Catch:{ all -> 0x00c3 }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x00c3 }
            q7.s2 r2 = r2.E     // Catch:{ all -> 0x00c3 }
            q7.x3.l(r2)     // Catch:{ all -> 0x00c3 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.c(r1, r3)     // Catch:{ all -> 0x00c3 }
            q7.k4 r0 = r0.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.j5 r0 = r0.K
            goto L_0x001e
        L_0x00e3:
            q7.k4 r0 = r0.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.j5 r0 = r0.K
            q7.x3.k(r0)
            r0.q(r13, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.z4.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        j5 j5Var = ((x3) this.f13466a.f13121a).K;
        x3.k(j5Var);
        synchronized (j5Var.H) {
            if (activity == j5Var.C) {
                j5Var.C = null;
            }
        }
        if (((x3) j5Var.f13121a).C.s()) {
            j5Var.B.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        j5 j5Var = ((x3) this.f13466a.f13121a).K;
        x3.k(j5Var);
        synchronized (j5Var.H) {
            j5Var.G = false;
            j5Var.D = true;
        }
        ((x3) j5Var.f13121a).J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!((x3) j5Var.f13121a).C.s()) {
            j5Var.f13138c = null;
            w3 w3Var = ((x3) j5Var.f13121a).F;
            x3.l(w3Var);
            w3Var.q(new i5(j5Var, elapsedRealtime));
        } else {
            f5 r10 = j5Var.r(activity);
            j5Var.f13139d = j5Var.f13138c;
            j5Var.f13138c = null;
            w3 w3Var2 = ((x3) j5Var.f13121a).F;
            x3.l(w3Var2);
            w3Var2.q(new o4(j5Var, r10, elapsedRealtime));
        }
        i6 i6Var = ((x3) this.f13466a.f13121a).G;
        x3.k(i6Var);
        ((x3) i6Var.f13121a).J.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        w3 w3Var3 = ((x3) i6Var.f13121a).F;
        x3.l(w3Var3);
        w3Var3.q(new s4(i6Var, elapsedRealtime2, 1));
    }

    public final void onActivityResumed(Activity activity) {
        i6 i6Var = ((x3) this.f13466a.f13121a).G;
        x3.k(i6Var);
        ((x3) i6Var.f13121a).J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        w3 w3Var = ((x3) i6Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new d6(i6Var, elapsedRealtime));
        j5 j5Var = ((x3) this.f13466a.f13121a).K;
        x3.k(j5Var);
        synchronized (j5Var.H) {
            j5Var.G = true;
            if (activity != j5Var.C) {
                synchronized (j5Var.H) {
                    j5Var.C = activity;
                    j5Var.D = false;
                }
                if (((x3) j5Var.f13121a).C.s()) {
                    j5Var.E = null;
                    w3 w3Var2 = ((x3) j5Var.f13121a).F;
                    x3.l(w3Var2);
                    w3Var2.q(new m(j5Var, 2));
                }
            }
        }
        if (!((x3) j5Var.f13121a).C.s()) {
            j5Var.f13138c = j5Var.E;
            w3 w3Var3 = ((x3) j5Var.f13121a).F;
            x3.l(w3Var3);
            w3Var3.q(new p4(j5Var, 1));
            return;
        }
        j5Var.s(activity, j5Var.r(activity), false);
        z0 n2 = ((x3) j5Var.f13121a).n();
        ((x3) n2.f13121a).J.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        w3 w3Var4 = ((x3) n2.f13121a).F;
        x3.l(w3Var4);
        w3Var4.q(new b0(n2, elapsedRealtime2, 0));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f5 f5Var;
        j5 j5Var = ((x3) this.f13466a.f13121a).K;
        x3.k(j5Var);
        if (((x3) j5Var.f13121a).C.s() && bundle != null && (f5Var = (f5) j5Var.B.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", f5Var.f13002c);
            bundle2.putString("name", f5Var.f13000a);
            bundle2.putString("referrer_name", f5Var.f13001b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
