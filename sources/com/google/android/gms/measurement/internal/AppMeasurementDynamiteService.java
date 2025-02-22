package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.compose.ui.platform.j3;
import b1.b;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.z0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import q7.a5;
import q7.a7;
import q7.b0;
import q7.b7;
import q7.f5;
import q7.j5;
import q7.k4;
import q7.l5;
import q7.m4;
import q7.o4;
import q7.s;
import q7.s2;
import q7.s4;
import q7.t4;
import q7.v4;
import q7.w3;
import q7.x3;
import q7.z2;
import q7.z3;
import q7.z4;
import s6.n;
import s6.o;
import u6.q;

@DynamiteApi
public class AppMeasurementDynamiteService extends q0 {

    /* renamed from: a  reason: collision with root package name */
    public x3 f5666a = null;

    /* renamed from: b  reason: collision with root package name */
    public final a f5667b = new a();

    @EnsuresNonNull({"scion"})
    public final void b() {
        if (this.f5666a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j10) {
        b();
        this.f5666a.n().j(str, j10);
    }

    public final void c(String str, u0 u0Var) {
        b();
        a7 a7Var = this.f5666a.H;
        x3.j(a7Var);
        a7Var.H(str, u0Var);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.m(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.j();
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new i0((Object) a5Var, (Object) null, 4));
    }

    public void endAdUnitExposure(String str, long j10) {
        b();
        this.f5666a.n().k(str, j10);
    }

    public void generateEventId(u0 u0Var) {
        b();
        a7 a7Var = this.f5666a.H;
        x3.j(a7Var);
        long m02 = a7Var.m0();
        b();
        a7 a7Var2 = this.f5666a.H;
        x3.j(a7Var2);
        a7Var2.G(u0Var, m02);
    }

    public void getAppInstanceId(u0 u0Var) {
        b();
        w3 w3Var = this.f5666a.F;
        x3.l(w3Var);
        w3Var.q(new n((Object) this, (Object) u0Var, 7));
    }

    public void getCachedAppInstanceId(u0 u0Var) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        c(a5Var.B(), u0Var);
    }

    public void getConditionalUserProperties(String str, String str2, u0 u0Var) {
        b();
        w3 w3Var = this.f5666a.F;
        x3.l(w3Var);
        w3Var.q(new l5(this, u0Var, str, str2));
    }

    public void getCurrentScreenClass(u0 u0Var) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        j5 j5Var = ((x3) a5Var.f13121a).K;
        x3.k(j5Var);
        f5 f5Var = j5Var.f13138c;
        c(f5Var != null ? f5Var.f13001b : null, u0Var);
    }

    public void getCurrentScreenName(u0 u0Var) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        j5 j5Var = ((x3) a5Var.f13121a).K;
        x3.k(j5Var);
        f5 f5Var = j5Var.f13138c;
        c(f5Var != null ? f5Var.f13000a : null, u0Var);
    }

    public void getGmpAppId(u0 u0Var) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        k4 k4Var = a5Var.f13121a;
        String str = ((x3) k4Var).f13421b;
        if (str == null) {
            try {
                str = b.q(((x3) k4Var).f13419a, ((x3) k4Var).O);
            } catch (IllegalStateException e10) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.c(e10, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        c(str, u0Var);
    }

    public void getMaxUserProperties(String str, u0 u0Var) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        q.f(str);
        ((x3) a5Var.f13121a).getClass();
        b();
        a7 a7Var = this.f5666a.H;
        x3.j(a7Var);
        a7Var.F(u0Var, 25);
    }

    public void getSessionId(u0 u0Var) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new t4(1, a5Var, u0Var));
    }

    public void getTestFlag(u0 u0Var, int i8) {
        b();
        if (i8 == 0) {
            a7 a7Var = this.f5666a.H;
            x3.j(a7Var);
            a5 a5Var = this.f5666a.L;
            x3.k(a5Var);
            AtomicReference atomicReference = new AtomicReference();
            w3 w3Var = ((x3) a5Var.f13121a).F;
            x3.l(w3Var);
            a7Var.H((String) w3Var.n(atomicReference, 15000, "String test flag value", new i0((Object) a5Var, (Object) atomicReference, 3)), u0Var);
        } else if (i8 == 1) {
            a7 a7Var2 = this.f5666a.H;
            x3.j(a7Var2);
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            w3 w3Var2 = ((x3) a5Var2.f13121a).F;
            x3.l(w3Var2);
            a7Var2.G(u0Var, ((Long) w3Var2.n(atomicReference2, 15000, "long test flag value", new o(3, a5Var2, atomicReference2))).longValue());
        } else if (i8 == 2) {
            a7 a7Var3 = this.f5666a.H;
            x3.j(a7Var3);
            a5 a5Var3 = this.f5666a.L;
            x3.k(a5Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            w3 w3Var3 = ((x3) a5Var3.f13121a).F;
            x3.l(w3Var3);
            double doubleValue = ((Double) w3Var3.n(atomicReference3, 15000, "double test flag value", new z3(3, a5Var3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                u0Var.q(bundle);
            } catch (RemoteException e10) {
                s2 s2Var = ((x3) a7Var3.f13121a).E;
                x3.l(s2Var);
                s2Var.E.c(e10, "Error returning double value to wrapper");
            }
        } else if (i8 == 3) {
            a7 a7Var4 = this.f5666a.H;
            x3.j(a7Var4);
            a5 a5Var4 = this.f5666a.L;
            x3.k(a5Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            w3 w3Var4 = ((x3) a5Var4.f13121a).F;
            x3.l(w3Var4);
            a7Var4.F(u0Var, ((Integer) w3Var4.n(atomicReference4, 15000, "int test flag value", new t4(2, a5Var4, atomicReference4))).intValue());
        } else if (i8 == 4) {
            a7 a7Var5 = this.f5666a.H;
            x3.j(a7Var5);
            a5 a5Var5 = this.f5666a.L;
            x3.k(a5Var5);
            AtomicReference atomicReference5 = new AtomicReference();
            w3 w3Var5 = ((x3) a5Var5.f13121a).F;
            x3.l(w3Var5);
            a7Var5.B(u0Var, ((Boolean) w3Var5.n(atomicReference5, 15000, "boolean test flag value", new n((Object) a5Var5, (Object) atomicReference5, 6))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, u0 u0Var) {
        b();
        w3 w3Var = this.f5666a.F;
        x3.l(w3Var);
        w3Var.q(new v4(this, u0Var, str, str2, z10));
    }

    public void initForTests(Map map) {
        b();
    }

    public void initialize(c7.a aVar, a1 a1Var, long j10) {
        x3 x3Var = this.f5666a;
        if (x3Var == null) {
            Context context = (Context) c7.b.P(aVar);
            q.i(context);
            this.f5666a = x3.t(context, a1Var, Long.valueOf(j10));
            return;
        }
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        s2Var.E.b("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(u0 u0Var) {
        b();
        w3 w3Var = this.f5666a.F;
        x3.l(w3Var);
        w3Var.q(new z3(6, this, u0Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.o(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, u0 u0Var, long j10) {
        b();
        q.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        s sVar = new s(str2, new q7.q(bundle), "app", j10);
        w3 w3Var = this.f5666a.F;
        x3.l(w3Var);
        w3Var.q(new l5(this, u0Var, sVar, str));
    }

    public void logHealthData(int i8, String str, c7.a aVar, c7.a aVar2, c7.a aVar3) {
        b();
        Object obj = null;
        Object P = aVar == null ? null : c7.b.P(aVar);
        Object P2 = aVar2 == null ? null : c7.b.P(aVar2);
        if (aVar3 != null) {
            obj = c7.b.P(aVar3);
        }
        s2 s2Var = this.f5666a.E;
        x3.l(s2Var);
        s2Var.w(i8, true, false, str, P, P2, obj);
    }

    public void onActivityCreated(c7.a aVar, Bundle bundle, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        z4 z4Var = a5Var.f12898c;
        if (z4Var != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            z4Var.onActivityCreated((Activity) c7.b.P(aVar), bundle);
        }
    }

    public void onActivityDestroyed(c7.a aVar, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        z4 z4Var = a5Var.f12898c;
        if (z4Var != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            z4Var.onActivityDestroyed((Activity) c7.b.P(aVar));
        }
    }

    public void onActivityPaused(c7.a aVar, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        z4 z4Var = a5Var.f12898c;
        if (z4Var != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            z4Var.onActivityPaused((Activity) c7.b.P(aVar));
        }
    }

    public void onActivityResumed(c7.a aVar, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        z4 z4Var = a5Var.f12898c;
        if (z4Var != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            z4Var.onActivityResumed((Activity) c7.b.P(aVar));
        }
    }

    public void onActivitySaveInstanceState(c7.a aVar, u0 u0Var, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        z4 z4Var = a5Var.f12898c;
        Bundle bundle = new Bundle();
        if (z4Var != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            z4Var.onActivitySaveInstanceState((Activity) c7.b.P(aVar), bundle);
        }
        try {
            u0Var.q(bundle);
        } catch (RemoteException e10) {
            s2 s2Var = this.f5666a.E;
            x3.l(s2Var);
            s2Var.E.c(e10, "Error returning bundle value to wrapper");
        }
    }

    public void onActivityStarted(c7.a aVar, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        if (a5Var.f12898c != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            Activity activity = (Activity) c7.b.P(aVar);
        }
    }

    public void onActivityStopped(c7.a aVar, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        if (a5Var.f12898c != null) {
            a5 a5Var2 = this.f5666a.L;
            x3.k(a5Var2);
            a5Var2.n();
            Activity activity = (Activity) c7.b.P(aVar);
        }
    }

    public void performAction(Bundle bundle, u0 u0Var, long j10) {
        b();
        u0Var.q((Bundle) null);
    }

    public void registerOnMeasurementEventListener(x0 x0Var) {
        Object obj;
        b();
        synchronized (this.f5667b) {
            obj = (m4) this.f5667b.getOrDefault(Integer.valueOf(x0Var.zzd()), null);
            if (obj == null) {
                obj = new b7(this, x0Var);
                this.f5667b.put(Integer.valueOf(x0Var.zzd()), obj);
            }
        }
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.j();
        if (!a5Var.f12900e.add(obj)) {
            s2 s2Var = ((x3) a5Var.f13121a).E;
            x3.l(s2Var);
            s2Var.E.b("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.C.set((Object) null);
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new s4(a5Var, j10, 0));
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        b();
        if (bundle == null) {
            s2 s2Var = this.f5666a.E;
            x3.l(s2Var);
            s2Var.B.b("Conditional user property must not be null");
            return;
        }
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.t(bundle, j10);
    }

    public void setConsent(Bundle bundle, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.r(new o4(a5Var, bundle, j10));
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.u(bundle, -20, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        if (r0 <= 100) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cf, code lost:
        if (r0 <= 100) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(c7.a r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.b()
            q7.x3 r6 = r2.f5666a
            q7.j5 r6 = r6.K
            q7.x3.k(r6)
            java.lang.Object r3 = c7.b.P(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            q7.k4 r7 = r6.f13121a
            q7.x3 r7 = (q7.x3) r7
            q7.f r7 = r7.C
            boolean r7 = r7.s()
            if (r7 != 0) goto L_0x002e
            q7.k4 r3 = r6.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.s2 r3 = r3.E
            q7.x3.l(r3)
            q7.q2 r3 = r3.G
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.b(r4)
            goto L_0x011c
        L_0x002e:
            q7.f5 r7 = r6.f13138c
            if (r7 != 0) goto L_0x0044
            q7.k4 r3 = r6.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.s2 r3 = r3.E
            q7.x3.l(r3)
            q7.q2 r3 = r3.G
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.b(r4)
            goto L_0x011c
        L_0x0044:
            java.util.concurrent.ConcurrentHashMap r0 = r6.B
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x005e
            q7.k4 r3 = r6.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.s2 r3 = r3.E
            q7.x3.l(r3)
            q7.q2 r3 = r3.G
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.b(r4)
            goto L_0x011c
        L_0x005e:
            if (r5 != 0) goto L_0x0068
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r6.p(r5)
        L_0x0068:
            java.lang.String r0 = r7.f13001b
            boolean r0 = cb.c.n(r0, r5)
            java.lang.String r7 = r7.f13000a
            boolean r7 = cb.c.n(r7, r4)
            if (r0 == 0) goto L_0x008b
            if (r7 != 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            q7.k4 r3 = r6.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.s2 r3 = r3.E
            q7.x3.l(r3)
            q7.q2 r3 = r3.G
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.b(r4)
            goto L_0x011c
        L_0x008b:
            r7 = 100
            if (r4 == 0) goto L_0x00bc
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x00a3
            int r0 = r4.length()
            q7.k4 r1 = r6.f13121a
            q7.x3 r1 = (q7.x3) r1
            r1.getClass()
            if (r0 > r7) goto L_0x00a3
            goto L_0x00bc
        L_0x00a3:
            q7.k4 r3 = r6.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.s2 r3 = r3.E
            q7.x3.l(r3)
            q7.q2 r3 = r3.G
            int r4 = r4.length()
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.c(r4, r5)
            goto L_0x011c
        L_0x00bc:
            if (r5 == 0) goto L_0x00eb
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00d2
            int r0 = r5.length()
            q7.k4 r1 = r6.f13121a
            q7.x3 r1 = (q7.x3) r1
            r1.getClass()
            if (r0 > r7) goto L_0x00d2
            goto L_0x00eb
        L_0x00d2:
            q7.k4 r3 = r6.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.s2 r3 = r3.E
            q7.x3.l(r3)
            q7.q2 r3 = r3.G
            int r4 = r5.length()
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.c(r4, r5)
            goto L_0x011c
        L_0x00eb:
            q7.k4 r7 = r6.f13121a
            q7.x3 r7 = (q7.x3) r7
            q7.s2 r7 = r7.E
            q7.x3.l(r7)
            q7.q2 r7 = r7.J
            if (r4 != 0) goto L_0x00fb
            java.lang.String r0 = "null"
            goto L_0x00fc
        L_0x00fb:
            r0 = r4
        L_0x00fc:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.d(r0, r5, r1)
            q7.f5 r7 = new q7.f5
            q7.k4 r0 = r6.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.a7 r0 = r0.H
            q7.x3.j(r0)
            long r0 = r0.m0()
            r7.<init>(r0, r4, r5)
            java.util.concurrent.ConcurrentHashMap r4 = r6.B
            r4.put(r3, r7)
            r4 = 1
            r6.s(r3, r7, r4)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(c7.a, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.j();
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new z2(1, a5Var, z10));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new i0(2, (Object) a5Var, (Object) bundle2));
    }

    public void setEventInterceptor(x0 x0Var) {
        b();
        boolean z10 = false;
        j3 j3Var = new j3(this, x0Var, 0);
        w3 w3Var = this.f5666a.F;
        x3.l(w3Var);
        if (w3Var.s()) {
            a5 a5Var = this.f5666a.L;
            x3.k(a5Var);
            a5Var.i();
            a5Var.j();
            j3 j3Var2 = a5Var.f12899d;
            if (j3Var != j3Var2) {
                if (j3Var2 == null) {
                    z10 = true;
                }
                q.k(z10, "EventInterceptor already set.");
            }
            a5Var.f12899d = j3Var;
            return;
        }
        w3 w3Var2 = this.f5666a.F;
        x3.l(w3Var2);
        w3Var2.q(new n((Object) this, (Object) j3Var, 9));
    }

    public void setInstanceIdProvider(z0 z0Var) {
        b();
    }

    public void setMeasurementEnabled(boolean z10, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        Boolean valueOf = Boolean.valueOf(z10);
        a5Var.j();
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new i0((Object) a5Var, (Object) valueOf, 4));
    }

    public void setMinimumSessionDuration(long j10) {
        b();
    }

    public void setSessionTimeoutDuration(long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        w3 w3Var = ((x3) a5Var.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new b0(a5Var, j10, 1));
    }

    public void setUserId(String str, long j10) {
        b();
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        k4 k4Var = a5Var.f13121a;
        if (str == null || !TextUtils.isEmpty(str)) {
            w3 w3Var = ((x3) k4Var).F;
            x3.l(w3Var);
            w3Var.q(new n(5, (Object) a5Var, (Object) str));
            a5Var.x((String) null, "_id", str, true, j10);
            return;
        }
        s2 s2Var = ((x3) k4Var).E;
        x3.l(s2Var);
        s2Var.E.b("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, c7.a aVar, boolean z10, long j10) {
        b();
        Object P = c7.b.P(aVar);
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.x(str, str2, P, z10, j10);
    }

    public void unregisterOnMeasurementEventListener(x0 x0Var) {
        Object obj;
        b();
        synchronized (this.f5667b) {
            obj = (m4) this.f5667b.remove(Integer.valueOf(x0Var.zzd()));
        }
        if (obj == null) {
            obj = new b7(this, x0Var);
        }
        a5 a5Var = this.f5666a.L;
        x3.k(a5Var);
        a5Var.j();
        if (!a5Var.f12900e.remove(obj)) {
            s2 s2Var = ((x3) a5Var.f13121a).E;
            x3.l(s2Var);
            s2Var.E.b("OnEventListener had not been registered");
        }
    }
}
