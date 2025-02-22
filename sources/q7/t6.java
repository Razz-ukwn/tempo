package q7;

import ag.m;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import cb.c;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.internal.measurement.i3;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.kc;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.ob;
import com.google.android.gms.internal.measurement.t2;
import com.google.android.gms.internal.measurement.tc;
import com.google.android.gms.internal.measurement.uc;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.internal.measurement.x3;
import e.s;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.a;
import q2.d;
import s6.o;
import u6.q;
import z6.b;

public final class t6 implements k4 {

    /* renamed from: b0  reason: collision with root package name */
    public static volatile t6 f13346b0;
    public b B;
    public final v6 C;
    public y2 D;
    public z5 E;
    public final p6 F;
    public j3 G;
    public final x3 H;
    public boolean I = false;
    public boolean J;
    public long K;
    public ArrayList L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public FileLock R;
    public FileChannel S;
    public ArrayList T;
    public ArrayList U;
    public long V;
    public final HashMap W;
    public final HashMap X;
    public f5 Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public final r3 f13347a;

    /* renamed from: a0  reason: collision with root package name */
    public final s f13348a0 = new s((Object) this);

    /* renamed from: b  reason: collision with root package name */
    public final y2 f13349b;

    /* renamed from: c  reason: collision with root package name */
    public k f13350c;

    /* renamed from: d  reason: collision with root package name */
    public a3 f13351d;

    /* renamed from: e  reason: collision with root package name */
    public l6 f13352e;

    public t6(u6 u6Var) {
        this.H = x3.t(u6Var.f13369a, (a1) null, (Long) null);
        this.V = -1;
        this.F = new p6(this);
        v6 v6Var = new v6(this);
        v6Var.k();
        this.C = v6Var;
        y2 y2Var = new y2(this, 0);
        y2Var.k();
        this.f13349b = y2Var;
        r3 r3Var = new r3(this);
        r3Var.k();
        this.f13347a = r3Var;
        this.W = new HashMap();
        this.X = new HashMap();
        h().q(new o(5, this, u6Var));
    }

    public static final boolean G(c7 c7Var) {
        return !TextUtils.isEmpty(c7Var.f12949b) || !TextUtils.isEmpty(c7Var.M);
    }

    public static final void H(n6 n6Var) {
        if (n6Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!n6Var.f13233c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(n6Var.getClass())));
        }
    }

    public static t6 N(Context context) {
        q.i(context);
        q.i(context.getApplicationContext());
        if (f13346b0 == null) {
            synchronized (t6.class) {
                if (f13346b0 == null) {
                    f13346b0 = new t6(new u6(context));
                }
            }
        }
        return f13346b0;
    }

    public static final void w(e3 e3Var, int i8, String str) {
        List r10 = e3Var.r();
        int i10 = 0;
        while (i10 < r10.size()) {
            if (!"_err".equals(((j3) r10.get(i10)).z())) {
                i10++;
            } else {
                return;
            }
        }
        i3 x10 = j3.x();
        x10.n("_err");
        x10.m(Long.valueOf((long) i8).longValue());
        i3 x11 = j3.x();
        x11.n("_ev");
        x11.l();
        j3.D((j3) x11.f5179b, str);
        e3Var.l();
        f3.D((f3) e3Var.f5179b, (j3) x10.j());
        e3Var.l();
        f3.D((f3) e3Var.f5179b, (j3) x11.j());
    }

    public static final void x(e3 e3Var, String str) {
        List r10 = e3Var.r();
        for (int i8 = 0; i8 < r10.size(); i8++) {
            if (str.equals(((j3) r10.get(i8)).z())) {
                e3Var.l();
                f3.G((f3) e3Var.f5179b, i8);
                return;
            }
        }
    }

    public final void A() {
        h().i();
        if (this.O || this.P || this.Q) {
            s2 e10 = e();
            e10.J.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.O), Boolean.valueOf(this.P), Boolean.valueOf(this.Q));
            return;
        }
        e().J.b("Stopping uploading service(s)");
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.L;
            q.i(arrayList2);
            arrayList2.clear();
        }
    }

    public final void B(n3 n3Var, long j10, boolean z10) {
        y6 y6Var;
        Object obj;
        k kVar = this.f13350c;
        H(kVar);
        String str = true != z10 ? "_lte" : "_se";
        y6 H2 = kVar.H(n3Var.r(), str);
        if (H2 == null || (obj = H2.f13454e) == null) {
            String r10 = n3Var.r();
            ((m) a()).getClass();
            y6Var = new y6(r10, "auto", str, System.currentTimeMillis(), Long.valueOf(j10));
        } else {
            String r11 = n3Var.r();
            ((m) a()).getClass();
            y6Var = new y6(r11, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j10));
        }
        w3 w10 = x3.w();
        w10.l();
        x3.B((x3) w10.f5179b, str);
        ((m) a()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        w10.l();
        x3.A((x3) w10.f5179b, currentTimeMillis);
        Object obj2 = y6Var.f13454e;
        long longValue = ((Long) obj2).longValue();
        w10.l();
        x3.E((x3) w10.f5179b, longValue);
        x3 x3Var = (x3) w10.j();
        int v3 = v6.v(n3Var, str);
        if (v3 >= 0) {
            n3Var.l();
            o3.B0((o3) n3Var.f5179b, v3, x3Var);
        } else {
            n3Var.l();
            o3.C0((o3) n3Var.f5179b, x3Var);
        }
        if (j10 > 0) {
            k kVar2 = this.f13350c;
            H(kVar2);
            kVar2.t(y6Var);
            e().J.d(true != z10 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x036c A[Catch:{ IllegalAccessException | InvocationTargetException -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0325  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurementJobService"
            q7.w3 r2 = r20.h()
            r2.i()
            r20.f()
            long r2 = r1.K
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0053
            z6.b r2 = r20.a()
            ag.m r2 = (ag.m) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r6 = r1.K
            long r2 = r2 - r6
            long r2 = java.lang.Math.abs(r2)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 - r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0051
            q7.s2 r0 = r20.e()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            q7.q2 r0 = r0.J
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.c(r2, r3)
            q7.a3 r0 = r20.M()
            r0.a()
            q7.l6 r0 = r1.f13352e
            H(r0)
            r0.m()
            return
        L_0x0051:
            r1.K = r4
        L_0x0053:
            q7.x3 r2 = r1.H
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x03f1
            boolean r2 = r20.E()
            if (r2 != 0) goto L_0x0063
            goto L_0x03f1
        L_0x0063:
            z6.b r2 = r20.a()
            ag.m r2 = (ag.m) r2
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r20.J()
            q7.f2 r6 = q7.g2.B
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            q7.k r6 = r1.f13350c
            H(r6)
            java.lang.String r10 = "select count(1) > 0 from raw_events where realtime = 1"
            long r10 = r6.w(r10, r7)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0095
            r6 = 1
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            if (r6 != 0) goto L_0x00af
            q7.k r6 = r1.f13350c
            H(r6)
            java.lang.String r12 = "select count(1) > 0 from queue where has_realtime = 1"
            long r12 = r6.w(r12, r7)
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r6 = 0
            goto L_0x00b0
        L_0x00af:
            r6 = 1
        L_0x00b0:
            if (r6 == 0) goto L_0x00f2
            q7.f r12 = r20.J()
            java.lang.String r13 = "debug.firebase.analytics.app"
            java.lang.String r12 = r12.j(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x00de
            java.lang.String r13 = ".none."
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00de
            r20.J()
            q7.f2 r12 = q7.g2.f13065w
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto L_0x0105
        L_0x00de:
            r20.J()
            q7.f2 r12 = q7.g2.f13063v
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto L_0x0105
        L_0x00f2:
            r20.J()
            q7.f2 r12 = q7.g2.f13061u
            java.lang.Object r12 = r12.a(r7)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r4, r12)
        L_0x0105:
            q7.z5 r14 = r1.E
            q7.d3 r14 = r14.C
            long r14 = r14.a()
            q7.z5 r10 = r1.E
            q7.d3 r10 = r10.D
            long r16 = r10.a()
            q7.k r10 = r1.f13350c
            H(r10)
            java.lang.String r11 = "select max(bundle_end_timestamp) from queue"
            long r10 = r10.y(r11, r7, r4)
            q7.k r4 = r1.f13350c
            H(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r18 = r12
            r12 = 0
            long r4 = r4.y(r5, r7, r12)
            long r4 = java.lang.Math.max(r10, r4)
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            q7.v6 r11 = r1.C
            if (r10 != 0) goto L_0x013b
            goto L_0x01b9
        L_0x013b:
            long r4 = r4 - r2
            long r4 = java.lang.Math.abs(r4)
            long r4 = r2 - r4
            long r14 = r14 - r2
            long r12 = java.lang.Math.abs(r14)
            long r12 = r2 - r12
            long r16 = r16 - r2
            long r14 = java.lang.Math.abs(r16)
            long r2 = r2 - r14
            long r8 = r8 + r4
            long r12 = java.lang.Math.max(r12, r2)
            if (r6 == 0) goto L_0x0163
            r14 = 0
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0163
            long r8 = java.lang.Math.min(r4, r12)
            long r8 = r8 + r18
        L_0x0163:
            H(r11)
            r14 = r18
            boolean r6 = r11.I(r12, r14)
            if (r6 != 0) goto L_0x0170
            long r8 = r12 + r14
        L_0x0170:
            r12 = 0
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x01be
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01be
            r4 = 0
        L_0x017b:
            r20.J()
            q7.f2 r5 = q7.g2.D
            java.lang.Object r5 = r5.a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            r6 = 20
            int r5 = java.lang.Math.min(r6, r5)
            if (r4 >= r5) goto L_0x01b9
            r5 = 1
            long r5 = r5 << r4
            r20.J()
            q7.f2 r10 = q7.g2.C
            java.lang.Object r10 = r10.a(r7)
            java.lang.Long r10 = (java.lang.Long) r10
            long r12 = r10.longValue()
            r14 = 0
            long r12 = java.lang.Math.max(r14, r12)
            long r12 = r12 * r5
            long r8 = r8 + r12
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b6
            goto L_0x01be
        L_0x01b6:
            int r4 = r4 + 1
            goto L_0x017b
        L_0x01b9:
            r2 = 0
            r8 = 0
            goto L_0x01c0
        L_0x01be:
            r2 = 0
        L_0x01c0:
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x03d6
            q7.y2 r2 = r1.f13349b
            H(r2)
            boolean r2 = r2.m()
            if (r2 == 0) goto L_0x0380
            q7.z5 r2 = r1.E
            q7.d3 r2 = r2.B
            long r2 = r2.a()
            r20.J()
            q7.f2 r4 = q7.g2.f13059t
            java.lang.Object r4 = r4.a(r7)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r12 = 0
            long r4 = java.lang.Math.max(r12, r4)
            H(r11)
            boolean r6 = r11.I(r2, r4)
            if (r6 != 0) goto L_0x01fa
            long r2 = r2 + r4
            long r8 = java.lang.Math.max(r8, r2)
        L_0x01fa:
            q7.a3 r2 = r20.M()
            r2.a()
            z6.b r2 = r20.a()
            ag.m r2 = (ag.m) r2
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r2
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x023c
            r20.J()
            q7.f2 r4 = q7.g2.f13067x
            java.lang.Object r4 = r4.a(r7)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r8 = java.lang.Math.max(r2, r4)
            q7.z5 r2 = r1.E
            q7.d3 r2 = r2.C
            z6.b r3 = r20.a()
            ag.m r3 = (ag.m) r3
            r3.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r2.b(r3)
        L_0x023c:
            q7.s2 r2 = r20.e()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            q7.q2 r2 = r2.J
            java.lang.String r4 = "Upload scheduled in approximately ms"
            r2.c(r3, r4)
            q7.l6 r2 = r1.f13352e
            H(r2)
            r2.j()
            q7.k4 r3 = r2.f13121a
            q7.x3 r3 = (q7.x3) r3
            r3.getClass()
            android.content.Context r4 = r3.f13419a
            boolean r5 = q7.a7.Y(r4)
            if (r5 != 0) goto L_0x026e
            q7.s2 r5 = r3.E
            q7.x3.l(r5)
            java.lang.String r6 = "Receiver not registered/enabled"
            q7.q2 r5 = r5.I
            r5.b(r6)
        L_0x026e:
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0287 }
            if (r5 != 0) goto L_0x0275
            goto L_0x0287
        L_0x0275:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0287 }
            r6.<init>(r4, r0)     // Catch:{ NameNotFoundException -> 0x0287 }
            r4 = 0
            android.content.pm.ServiceInfo r5 = r5.getServiceInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x0287 }
            if (r5 == 0) goto L_0x0287
            boolean r4 = r5.enabled     // Catch:{ NameNotFoundException -> 0x0287 }
            if (r4 == 0) goto L_0x0287
            r4 = 1
            goto L_0x0288
        L_0x0287:
            r4 = 0
        L_0x0288:
            if (r4 != 0) goto L_0x0296
            q7.s2 r4 = r3.E
            q7.x3.l(r4)
            java.lang.String r5 = "Service not registered/enabled"
            q7.q2 r4 = r4.I
            r4.b(r5)
        L_0x0296:
            r2.m()
            q7.s2 r4 = r3.E
            q7.x3.l(r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r6 = "Scheduling upload, millis"
            q7.q2 r4 = r4.J
            r4.c(r5, r6)
            ag.m r4 = r3.J
            r4.getClass()
            android.os.SystemClock.elapsedRealtime()
            q7.f2 r4 = q7.g2.f13069y
            java.lang.Object r4 = r4.a(r7)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r6 = 0
            long r4 = java.lang.Math.max(r6, r4)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x02dd
            q7.m r4 = r2.p()
            long r4 = r4.f13197c
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x02d3
            r4 = 1
            goto L_0x02d4
        L_0x02d3:
            r4 = 0
        L_0x02d4:
            if (r4 != 0) goto L_0x02dd
            q7.m r4 = r2.p()
            r4.c(r8)
        L_0x02dd:
            android.content.Context r3 = r3.f13419a
            android.content.ComponentName r4 = new android.content.ComponentName
            r4.<init>(r3, r0)
            int r0 = r2.n()
            android.os.PersistableBundle r2 = new android.os.PersistableBundle
            r2.<init>()
            java.lang.String r5 = "action"
            java.lang.String r6 = "com.google.android.gms.measurement.UPLOAD"
            r2.putString(r5, r6)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r0, r4)
            android.app.job.JobInfo$Builder r0 = r5.setMinimumLatency(r8)
            long r8 = r8 + r8
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r8)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r2)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.l0.f5380a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r3.getSystemService(r0)
            r4 = r0
            android.app.job.JobScheduler r4 = (android.app.job.JobScheduler) r4
            r4.getClass()
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.l0.f5380a
            if (r5 == 0) goto L_0x037c
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r3.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x0325
            goto L_0x037c
        L_0x0325:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.l0.f5381b
            if (r0 == 0) goto L_0x034c
            java.lang.Class<android.os.UserHandle> r3 = android.os.UserHandle.class
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            java.lang.Object r0 = r0.invoke(r3, r7)     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            if (r0 == 0) goto L_0x034c
            int r6 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x033d, InvocationTargetException -> 0x033b }
            goto L_0x034d
        L_0x033b:
            r0 = move-exception
            goto L_0x033e
        L_0x033d:
            r0 = move-exception
        L_0x033e:
            java.lang.String r3 = "JobSchedulerCompat"
            r6 = 6
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto L_0x034c
            java.lang.String r6 = "myUserId invocation illegal"
            android.util.Log.e(r3, r6, r0)
        L_0x034c:
            r6 = 0
        L_0x034d:
            java.lang.String r3 = "UploadAlarm"
            java.lang.String r0 = "com.google.android.gms"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            r8 = 0
            r7[r8] = r2     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            r8 = 1
            r7[r8] = r0     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            r6 = 2
            r7[r6] = r0     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            r0 = 3
            r7[r0] = r3     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            java.lang.Object r0 = r5.invoke(r4, r7)     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            if (r0 == 0) goto L_0x037f
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x0372, InvocationTargetException -> 0x0370 }
            goto L_0x037f
        L_0x0370:
            r0 = move-exception
            goto L_0x0373
        L_0x0372:
            r0 = move-exception
        L_0x0373:
            java.lang.String r5 = "error calling scheduleAsPackage"
            android.util.Log.e(r3, r5, r0)
            r4.schedule(r2)
            goto L_0x037f
        L_0x037c:
            r4.schedule(r2)
        L_0x037f:
            return
        L_0x0380:
            q7.s2 r0 = r20.e()
            java.lang.String r2 = "No network"
            q7.q2 r0 = r0.J
            r0.b(r2)
            q7.a3 r0 = r20.M()
            q7.t6 r2 = r0.f12891a
            r2.f()
            q7.w3 r3 = r2.h()
            r3.i()
            boolean r3 = r0.f12892b
            if (r3 == 0) goto L_0x03a0
            goto L_0x03cd
        L_0x03a0:
            q7.x3 r3 = r2.H
            android.content.Context r3 = r3.f13419a
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4.<init>(r5)
            r3.registerReceiver(r0, r4)
            q7.y2 r3 = r2.f13349b
            H(r3)
            boolean r3 = r3.m()
            r0.f12893c = r3
            q7.s2 r2 = r2.e()
            boolean r3 = r0.f12893c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            q7.q2 r2 = r2.J
            r2.c(r3, r4)
            r2 = 1
            r0.f12892b = r2
        L_0x03cd:
            q7.l6 r0 = r1.f13352e
            H(r0)
            r0.m()
            return
        L_0x03d6:
            q7.s2 r0 = r20.e()
            java.lang.String r2 = "Next upload time is 0"
            q7.q2 r0 = r0.J
            r0.b(r2)
            q7.a3 r0 = r20.M()
            r0.a()
            q7.l6 r0 = r1.f13352e
            H(r0)
            r0.m()
            return
        L_0x03f1:
            q7.s2 r0 = r20.e()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            q7.q2 r0 = r0.J
            r0.b(r2)
            q7.a3 r0 = r20.M()
            r0.a()
            q7.l6 r0 = r1.f13352e
            H(r0)
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.C():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: q7.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v3, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v5, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v6, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v10, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v11, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v12, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v24, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v28, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v17, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v18, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v19, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v20, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v22, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v23, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v13, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v142, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v144, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v145, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v191, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v192, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v142, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v145, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v146, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v149, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v150, resolved type: o.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v196, resolved type: q7.g7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v146, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v147, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v148, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v149, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v150, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v151, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v152, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v153, resolved type: q7.t6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v56, resolved type: o.a} */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r11v43 */
    /* JADX WARNING: type inference failed for: r5v65, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v98 */
    /* JADX WARNING: Code restructure failed: missing block: B:1134:0x1a2b, code lost:
        if (r9 > (((java.lang.Long) r11.a((java.lang.Object) null)).longValue() + r7)) goto L_0x1a2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a3d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a3f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a40, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a61, code lost:
        if (r1 == null) goto L_0x0a66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a6d, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0bd1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0bd2, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0bf4, code lost:
        if (r2 != null) goto L_0x0bf6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x1098, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:763:0x1099, code lost:
        r52 = r12;
        r43 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x10a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x10a5, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x10d4, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x12aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:851:0x12ab, code lost:
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x12cc, code lost:
        if (r6 == null) goto L_0x12d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x1429, code lost:
        if (r9 != false) goto L_0x1434;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1008:0x168e A[SYNTHETIC, Splitter:B:1008:0x168e] */
    /* JADX WARNING: Removed duplicated region for block: B:1013:0x16b7 A[SYNTHETIC, Splitter:B:1013:0x16b7] */
    /* JADX WARNING: Removed duplicated region for block: B:1083:0x1874 A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1086:0x188b A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1087:0x18a4  */
    /* JADX WARNING: Removed duplicated region for block: B:1116:0x196c A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1131:0x19e6 A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1154:0x1b0f A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1159:0x1b33 A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1164:0x1b64 A[Catch:{ all -> 0x186b, all -> 0x18cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:1179:0x1bc9 A[SYNTHETIC, Splitter:B:1179:0x1bc9] */
    /* JADX WARNING: Removed duplicated region for block: B:1222:0x08e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03df A[Catch:{ all -> 0x0100, all -> 0x058c }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b6 A[Catch:{ all -> 0x0100, all -> 0x058c }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04fc A[Catch:{ all -> 0x0100, all -> 0x058c }] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0815 A[SYNTHETIC, Splitter:B:384:0x0815] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x08d5 A[Catch:{ all -> 0x1bcd }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x090e A[SYNTHETIC, Splitter:B:422:0x090e] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x096d A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0987 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0a3f A[ExcHandler: all (r0v58 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:444:0x099f] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0a6d A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x0aad A[Catch:{ SQLiteException -> 0x0b1f }] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0aba A[SYNTHETIC, Splitter:B:514:0x0aba] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0b4c A[SYNTHETIC, Splitter:B:548:0x0b4c] */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0b56 A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0b5e A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0bd1 A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:558:0x0b87] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0d26 A[Catch:{ all -> 0x0d21, all -> 0x1448 }] */
    /* JADX WARNING: Removed duplicated region for block: B:622:0x0d37 A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0eef A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:766:0x10a4 A[ExcHandler: all (r0v13 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:710:0x0fdf] */
    /* JADX WARNING: Removed duplicated region for block: B:772:0x10c7 A[SYNTHETIC, Splitter:B:772:0x10c7] */
    /* JADX WARNING: Removed duplicated region for block: B:779:0x10d4 A[Catch:{ all -> 0x0d21, all -> 0x1448 }] */
    /* JADX WARNING: Removed duplicated region for block: B:785:0x10ea A[Catch:{ all -> 0x0d21, all -> 0x1448 }] */
    /* JADX WARNING: Removed duplicated region for block: B:808:0x11cd A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:850:0x12aa A[ExcHandler: all (r0v27 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:816:0x1211] */
    /* JADX WARNING: Removed duplicated region for block: B:863:0x12db A[Catch:{ all -> 0x0d21, all -> 0x1448 }] */
    /* JADX WARNING: Removed duplicated region for block: B:913:0x146c A[SYNTHETIC, Splitter:B:913:0x146c] */
    /* JADX WARNING: Removed duplicated region for block: B:929:0x14fc A[EDGE_INSN: B:929:0x14fc->B:930:? ?: BREAK  , SYNTHETIC, Splitter:B:929:0x14fc] */
    /* JADX WARNING: Removed duplicated region for block: B:936:0x151a A[Catch:{ all -> 0x0a68, all -> 0x1870 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(long r89) {
        /*
            r88 = this;
            r1 = r88
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "1"
            java.lang.String r4 = "_ai"
            q7.k r5 = r1.f13350c
            H(r5)
            r5.O()
            q7.r6 r5 = new q7.r6     // Catch:{ all -> 0x1bcd }
            r5.<init>(r1)     // Catch:{ all -> 0x1bcd }
            q7.k r6 = r1.f13350c     // Catch:{ all -> 0x1bcd }
            H(r6)     // Catch:{ all -> 0x1bcd }
            long r9 = r1.V     // Catch:{ all -> 0x1bcd }
            r7 = r89
            r11 = r5
            r6.u(r7, r9, r11)     // Catch:{ all -> 0x1bcd }
            java.util.ArrayList r6 = r5.f13308c     // Catch:{ all -> 0x1bcd }
            if (r6 == 0) goto L_0x1bd1
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x1bcd }
            if (r6 == 0) goto L_0x002e
            goto L_0x1bd1
        L_0x002e:
            com.google.android.gms.internal.measurement.o3 r6 = r5.f13306a     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.c7 r6 = r6.j()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.n3 r6 = (com.google.android.gms.internal.measurement.n3) r6     // Catch:{ all -> 0x1bcd }
            r6.l()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r8 = r6.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r8 = (com.google.android.gms.internal.measurement.o3) r8     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3.x0(r8)     // Catch:{ all -> 0x1bcd }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = -1
            r14 = 0
            r15 = -1
            r16 = 0
        L_0x0048:
            java.util.ArrayList r9 = r5.f13308c     // Catch:{ all -> 0x1bcd }
            int r9 = r9.size()     // Catch:{ all -> 0x1bcd }
            r17 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r8 = "_fr"
            java.lang.String r7 = "_et"
            r24 = r10
            java.lang.String r10 = "_e"
            r25 = r2
            q7.x3 r2 = r1.H
            r26 = r11
            q7.r3 r11 = r1.f13347a
            r27 = r13
            q7.v6 r13 = r1.C
            if (r12 >= r9) goto L_0x0591
            java.util.ArrayList r9 = r5.f13308c     // Catch:{ all -> 0x058c }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0587 }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.c7 r9 = r9.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.e3 r9 = (com.google.android.gms.internal.measurement.e3) r9     // Catch:{ all -> 0x058c }
            H(r11)     // Catch:{ all -> 0x058c }
            r28 = r12
            com.google.android.gms.internal.measurement.o3 r12 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r12 = r12.K1()     // Catch:{ all -> 0x058c }
            r29 = r14
            java.lang.String r14 = r9.q()     // Catch:{ all -> 0x058c }
            boolean r12 = r11.v(r12, r14)     // Catch:{ all -> 0x058c }
            java.lang.String r14 = "_err"
            if (r12 == 0) goto L_0x0117
            q7.s2 r7 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r7 = r7.p()     // Catch:{ all -> 0x058c }
            java.lang.String r8 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.o3 r10 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r10 = r10.K1()     // Catch:{ all -> 0x058c }
            q7.r2 r10 = q7.s2.r(r10)     // Catch:{ all -> 0x058c }
            q7.n2 r2 = r2.s()     // Catch:{ all -> 0x058c }
            java.lang.String r12 = r9.q()     // Catch:{ all -> 0x058c }
            java.lang.String r2 = r2.d(r12)     // Catch:{ all -> 0x058c }
            r7.d(r10, r2, r8)     // Catch:{ all -> 0x058c }
            H(r11)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r2 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r2 = r2.K1()     // Catch:{ all -> 0x058c }
            java.lang.String r7 = "measurement.upload.blacklist_internal"
            java.lang.String r2 = r11.f(r2, r7)     // Catch:{ all -> 0x0114 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0114 }
            if (r2 != 0) goto L_0x0103
            H(r11)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r2 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r2 = r2.K1()     // Catch:{ all -> 0x058c }
            java.lang.String r7 = "measurement.upload.blacklist_public"
            java.lang.String r2 = r11.f(r2, r7)     // Catch:{ all -> 0x0100 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x00db
            goto L_0x0103
        L_0x00db:
            java.lang.String r2 = r9.q()     // Catch:{ all -> 0x058c }
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x058c }
            if (r2 != 0) goto L_0x0103
            r88.P()     // Catch:{ all -> 0x058c }
            e.s r2 = r1.f13348a0     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r7 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r31 = r7.K1()     // Catch:{ all -> 0x058c }
            r32 = 11
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r9.q()     // Catch:{ all -> 0x058c }
            r35 = 0
            r30 = r2
            q7.a7.z(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x058c }
            goto L_0x0103
        L_0x0100:
            r0 = move-exception
            goto L_0x058d
        L_0x0103:
            r30 = r3
            r20 = r4
            r4 = r6
            r10 = r24
            r11 = r26
            r13 = r27
            r7 = r28
            r14 = r29
            goto L_0x0576
        L_0x0114:
            r0 = move-exception
            goto L_0x058d
        L_0x0117:
            java.lang.String r12 = r9.q()     // Catch:{ all -> 0x058c }
            r30 = r3
            java.lang.String[] r3 = cb.e.f3894a0     // Catch:{ all -> 0x0585 }
            r31 = r7
            java.lang.String[] r7 = cb.e.Y     // Catch:{ all -> 0x0585 }
            java.lang.String r3 = b1.b.p(r4, r3, r7)     // Catch:{ all -> 0x0585 }
            boolean r3 = r12.equals(r3)     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x01a2
            r9.l()     // Catch:{ all -> 0x019f }
            com.google.android.gms.internal.measurement.g7 r3 = r9.f5179b     // Catch:{ all -> 0x019f }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x019f }
            com.google.android.gms.internal.measurement.f3.H(r3, r4)     // Catch:{ all -> 0x019f }
            q7.s2 r3 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r3 = r3.o()     // Catch:{ all -> 0x058c }
            java.lang.String r7 = "Renaming ad_impression to _ai"
            r3.b(r7)     // Catch:{ all -> 0x058c }
            q7.s2 r3 = r88.e()     // Catch:{ all -> 0x058c }
            java.lang.String r3 = r3.v()     // Catch:{ all -> 0x058c }
            r7 = 5
            boolean r3 = android.util.Log.isLoggable(r3, r7)     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x01a2
            r3 = 0
        L_0x0154:
            com.google.android.gms.internal.measurement.g7 r7 = r9.f5179b     // Catch:{ all -> 0x019c }
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.f3) r7     // Catch:{ all -> 0x019c }
            int r7 = r7.u()     // Catch:{ all -> 0x019c }
            if (r3 >= r7) goto L_0x01a2
            java.lang.String r7 = "ad_platform"
            com.google.android.gms.internal.measurement.j3 r12 = r9.p(r3)     // Catch:{ all -> 0x058c }
            java.lang.String r12 = r12.z()     // Catch:{ all -> 0x058c }
            boolean r7 = r7.equals(r12)     // Catch:{ all -> 0x058c }
            if (r7 == 0) goto L_0x0199
            com.google.android.gms.internal.measurement.j3 r7 = r9.p(r3)     // Catch:{ all -> 0x058c }
            java.lang.String r7 = r7.A()     // Catch:{ all -> 0x058c }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x058c }
            if (r7 != 0) goto L_0x0199
            java.lang.String r7 = "admob"
            com.google.android.gms.internal.measurement.j3 r12 = r9.p(r3)     // Catch:{ all -> 0x058c }
            java.lang.String r12 = r12.A()     // Catch:{ all -> 0x058c }
            boolean r7 = r7.equalsIgnoreCase(r12)     // Catch:{ all -> 0x058c }
            if (r7 == 0) goto L_0x0199
            q7.s2 r7 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r7 = r7.q()     // Catch:{ all -> 0x058c }
            java.lang.String r12 = "AdMob ad impression logged from app. Potentially duplicative."
            r7.b(r12)     // Catch:{ all -> 0x058c }
        L_0x0199:
            int r3 = r3 + 1
            goto L_0x0154
        L_0x019c:
            r0 = move-exception
            goto L_0x058d
        L_0x019f:
            r0 = move-exception
            goto L_0x058d
        L_0x01a2:
            H(r11)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r3 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r3 = r3.K1()     // Catch:{ all -> 0x058c }
            java.lang.String r7 = r9.q()     // Catch:{ all -> 0x058c }
            boolean r3 = r11.u(r3, r7)     // Catch:{ all -> 0x058c }
            java.lang.String r7 = "_c"
            if (r3 != 0) goto L_0x01e6
            H(r13)     // Catch:{ all -> 0x058c }
            java.lang.String r11 = r9.q()     // Catch:{ all -> 0x058c }
            u6.q.f(r11)     // Catch:{ all -> 0x058c }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x058c }
            r20 = r4
            r4 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r4) goto L_0x01cd
            goto L_0x01d7
        L_0x01cd:
            java.lang.String r4 = "_ui"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x01d7
            r4 = 0
            goto L_0x01d8
        L_0x01d7:
            r4 = -1
        L_0x01d8:
            if (r4 == 0) goto L_0x01e8
            r32 = r6
            r34 = r10
            r6 = r13
            r33 = r15
            r10 = r24
            r4 = 0
            goto L_0x03dd
        L_0x01e6:
            r20 = r4
        L_0x01e8:
            r4 = 0
            r11 = 0
            r12 = 0
        L_0x01eb:
            r32 = r6
            com.google.android.gms.internal.measurement.g7 r6 = r9.f5179b     // Catch:{ all -> 0x0583 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x0583 }
            int r6 = r6.u()     // Catch:{ all -> 0x0583 }
            r33 = r15
            java.lang.String r15 = "_r"
            if (r4 >= r6) goto L_0x0271
            com.google.android.gms.internal.measurement.j3 r6 = r9.p(r4)     // Catch:{ all -> 0x058c }
            java.lang.String r6 = r6.z()     // Catch:{ all -> 0x058c }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x058c }
            if (r6 == 0) goto L_0x0230
            com.google.android.gms.internal.measurement.j3 r6 = r9.p(r4)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.c7 r6 = r6.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.i3 r6 = (com.google.android.gms.internal.measurement.i3) r6     // Catch:{ all -> 0x058c }
            r34 = r10
            r10 = 1
            r6.m(r10)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r6 = r6.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r6 = (com.google.android.gms.internal.measurement.j3) r6     // Catch:{ all -> 0x058c }
            r9.l()     // Catch:{ all -> 0x022d }
            com.google.android.gms.internal.measurement.g7 r10 = r9.f5179b     // Catch:{ all -> 0x022d }
            com.google.android.gms.internal.measurement.f3 r10 = (com.google.android.gms.internal.measurement.f3) r10     // Catch:{ all -> 0x022d }
            com.google.android.gms.internal.measurement.f3.C(r10, r4, r6)     // Catch:{ all -> 0x022d }
            r10 = r13
            r11 = 1
            goto L_0x0266
        L_0x022d:
            r0 = move-exception
            goto L_0x058d
        L_0x0230:
            r34 = r10
            com.google.android.gms.internal.measurement.j3 r6 = r9.p(r4)     // Catch:{ all -> 0x058c }
            java.lang.String r6 = r6.z()     // Catch:{ all -> 0x058c }
            boolean r6 = r15.equals(r6)     // Catch:{ all -> 0x058c }
            if (r6 == 0) goto L_0x0265
            com.google.android.gms.internal.measurement.j3 r6 = r9.p(r4)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.c7 r6 = r6.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.i3 r6 = (com.google.android.gms.internal.measurement.i3) r6     // Catch:{ all -> 0x058c }
            r10 = r13
            r12 = 1
            r6.m(r12)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r6 = r6.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r6 = (com.google.android.gms.internal.measurement.j3) r6     // Catch:{ all -> 0x058c }
            r9.l()     // Catch:{ all -> 0x0262 }
            com.google.android.gms.internal.measurement.g7 r12 = r9.f5179b     // Catch:{ all -> 0x0262 }
            com.google.android.gms.internal.measurement.f3 r12 = (com.google.android.gms.internal.measurement.f3) r12     // Catch:{ all -> 0x0262 }
            com.google.android.gms.internal.measurement.f3.C(r12, r4, r6)     // Catch:{ all -> 0x0262 }
            r12 = 1
            goto L_0x0266
        L_0x0262:
            r0 = move-exception
            goto L_0x058d
        L_0x0265:
            r10 = r13
        L_0x0266:
            int r4 = r4 + 1
            r13 = r10
            r6 = r32
            r15 = r33
            r10 = r34
            goto L_0x01eb
        L_0x0271:
            r34 = r10
            r10 = r13
            if (r11 != 0) goto L_0x02a2
            if (r3 == 0) goto L_0x02a2
            q7.s2 r4 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r4 = r4.o()     // Catch:{ all -> 0x058c }
            java.lang.String r6 = "Marking event as conversion"
            q7.n2 r11 = r2.s()     // Catch:{ all -> 0x058c }
            java.lang.String r13 = r9.q()     // Catch:{ all -> 0x058c }
            java.lang.String r11 = r11.d(r13)     // Catch:{ all -> 0x058c }
            r4.c(r11, r6)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.i3 r4 = com.google.android.gms.internal.measurement.j3.x()     // Catch:{ all -> 0x058c }
            r4.n(r7)     // Catch:{ all -> 0x058c }
            r6 = r10
            r10 = 1
            r4.m(r10)     // Catch:{ all -> 0x058c }
            r9.o(r4)     // Catch:{ all -> 0x058c }
            goto L_0x02a3
        L_0x02a2:
            r6 = r10
        L_0x02a3:
            if (r12 != 0) goto L_0x02cd
            q7.s2 r4 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r4 = r4.o()     // Catch:{ all -> 0x058c }
            java.lang.String r10 = "Marking event as real-time"
            q7.n2 r2 = r2.s()     // Catch:{ all -> 0x058c }
            java.lang.String r11 = r9.q()     // Catch:{ all -> 0x058c }
            java.lang.String r2 = r2.d(r11)     // Catch:{ all -> 0x058c }
            r4.c(r2, r10)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.i3 r2 = com.google.android.gms.internal.measurement.j3.x()     // Catch:{ all -> 0x058c }
            r2.n(r15)     // Catch:{ all -> 0x058c }
            r10 = 1
            r2.m(r10)     // Catch:{ all -> 0x058c }
            r9.o(r2)     // Catch:{ all -> 0x058c }
        L_0x02cd:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x058c }
            H(r2)     // Catch:{ all -> 0x058c }
            long r36 = r88.v()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r4 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r38 = r4.K1()     // Catch:{ all -> 0x058c }
            r39 = 0
            r40 = 1
            r35 = r2
            q7.i r2 = r35.E(r36, r38, r39, r40)     // Catch:{ all -> 0x058c }
            long r10 = r2.f13116e     // Catch:{ all -> 0x058c }
            q7.f r2 = r88.J()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r4 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r4 = r4.K1()     // Catch:{ all -> 0x058c }
            q7.f2 r12 = q7.g2.f13053q     // Catch:{ all -> 0x058c }
            int r2 = r2.l(r4, r12)     // Catch:{ all -> 0x058c }
            long r12 = (long) r2     // Catch:{ all -> 0x058c }
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0303
            x(r9, r15)     // Catch:{ all -> 0x058c }
            r10 = r24
            goto L_0x0304
        L_0x0303:
            r10 = 1
        L_0x0304:
            java.lang.String r2 = r9.q()     // Catch:{ all -> 0x058c }
            boolean r2 = q7.a7.X(r2)     // Catch:{ all -> 0x058c }
            if (r2 == 0) goto L_0x03dc
            if (r3 == 0) goto L_0x03dc
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x058c }
            H(r2)     // Catch:{ all -> 0x058c }
            long r36 = r88.v()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r4 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r38 = r4.K1()     // Catch:{ all -> 0x058c }
            r39 = 1
            r40 = 0
            r35 = r2
            q7.i r2 = r35.E(r36, r38, r39, r40)     // Catch:{ all -> 0x058c }
            long r11 = r2.f13114c     // Catch:{ all -> 0x058c }
            q7.f r2 = r88.J()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.o3 r4 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r4 = r4.K1()     // Catch:{ all -> 0x058c }
            q7.f2 r13 = q7.g2.f13051p     // Catch:{ all -> 0x058c }
            int r2 = r2.l(r4, r13)     // Catch:{ all -> 0x058c }
            r4 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x058c }
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x03dd
            q7.s2 r2 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r2 = r2.p()     // Catch:{ all -> 0x058c }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.o3 r11 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r11 = r11.K1()     // Catch:{ all -> 0x058c }
            q7.r2 r11 = q7.s2.r(r11)     // Catch:{ all -> 0x058c }
            r2.c(r11, r3)     // Catch:{ all -> 0x058c }
            r2 = 0
            r3 = 0
            r11 = 0
            r12 = -1
        L_0x035c:
            com.google.android.gms.internal.measurement.g7 r13 = r9.f5179b     // Catch:{ all -> 0x03d9 }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x03d9 }
            int r13 = r13.u()     // Catch:{ all -> 0x03d9 }
            if (r3 >= r13) goto L_0x038a
            com.google.android.gms.internal.measurement.j3 r13 = r9.p(r3)     // Catch:{ all -> 0x058c }
            java.lang.String r15 = r13.z()     // Catch:{ all -> 0x058c }
            boolean r15 = r7.equals(r15)     // Catch:{ all -> 0x058c }
            if (r15 == 0) goto L_0x037c
            com.google.android.gms.internal.measurement.c7 r2 = r13.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.i3 r2 = (com.google.android.gms.internal.measurement.i3) r2     // Catch:{ all -> 0x058c }
            r12 = r3
            goto L_0x0387
        L_0x037c:
            java.lang.String r13 = r13.z()     // Catch:{ all -> 0x058c }
            boolean r13 = r14.equals(r13)     // Catch:{ all -> 0x058c }
            if (r13 == 0) goto L_0x0387
            r11 = 1
        L_0x0387:
            int r3 = r3 + 1
            goto L_0x035c
        L_0x038a:
            if (r11 == 0) goto L_0x039d
            if (r2 == 0) goto L_0x039c
            r9.l()     // Catch:{ all -> 0x0399 }
            com.google.android.gms.internal.measurement.g7 r2 = r9.f5179b     // Catch:{ all -> 0x0399 }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x0399 }
            com.google.android.gms.internal.measurement.f3.G(r2, r12)     // Catch:{ all -> 0x0399 }
            goto L_0x03dd
        L_0x0399:
            r0 = move-exception
            goto L_0x058d
        L_0x039c:
            r2 = 0
        L_0x039d:
            if (r2 == 0) goto L_0x03c1
            com.google.android.gms.internal.measurement.c7 r2 = r2.clone()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.i3 r2 = (com.google.android.gms.internal.measurement.i3) r2     // Catch:{ all -> 0x058c }
            r2.n(r14)     // Catch:{ all -> 0x058c }
            r13 = 10
            r2.m(r13)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r2 = r2.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r2 = (com.google.android.gms.internal.measurement.j3) r2     // Catch:{ all -> 0x058c }
            r9.l()     // Catch:{ all -> 0x03be }
            com.google.android.gms.internal.measurement.g7 r3 = r9.f5179b     // Catch:{ all -> 0x03be }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x03be }
            com.google.android.gms.internal.measurement.f3.C(r3, r12, r2)     // Catch:{ all -> 0x03be }
            goto L_0x03dd
        L_0x03be:
            r0 = move-exception
            goto L_0x058d
        L_0x03c1:
            q7.s2 r2 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x058c }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.o3 r11 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r11 = r11.K1()     // Catch:{ all -> 0x058c }
            q7.r2 r11 = q7.s2.r(r11)     // Catch:{ all -> 0x058c }
            r2.c(r11, r3)     // Catch:{ all -> 0x058c }
            goto L_0x03dd
        L_0x03d9:
            r0 = move-exception
            goto L_0x058d
        L_0x03dc:
            r4 = r3
        L_0x03dd:
            if (r4 == 0) goto L_0x04aa
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x058c }
            java.util.List r3 = r9.r()     // Catch:{ all -> 0x058c }
            r2.<init>(r3)     // Catch:{ all -> 0x058c }
            r3 = 0
            r4 = -1
            r11 = -1
        L_0x03eb:
            int r12 = r2.size()     // Catch:{ all -> 0x058c }
            java.lang.String r13 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r12) goto L_0x041b
            java.lang.Object r12 = r2.get(r3)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r12 = (com.google.android.gms.internal.measurement.j3) r12     // Catch:{ all -> 0x058c }
            java.lang.String r12 = r12.z()     // Catch:{ all -> 0x058c }
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x058c }
            if (r12 == 0) goto L_0x0407
            r4 = r3
            goto L_0x0418
        L_0x0407:
            java.lang.Object r12 = r2.get(r3)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r12 = (com.google.android.gms.internal.measurement.j3) r12     // Catch:{ all -> 0x058c }
            java.lang.String r12 = r12.z()     // Catch:{ all -> 0x058c }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x058c }
            if (r12 == 0) goto L_0x0418
            r11 = r3
        L_0x0418:
            int r3 = r3 + 1
            goto L_0x03eb
        L_0x041b:
            r3 = -1
            if (r4 != r3) goto L_0x0420
            goto L_0x04aa
        L_0x0420:
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r3 = (com.google.android.gms.internal.measurement.j3) r3     // Catch:{ all -> 0x058c }
            boolean r3 = r3.O()     // Catch:{ all -> 0x058c }
            if (r3 != 0) goto L_0x045b
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r3 = (com.google.android.gms.internal.measurement.j3) r3     // Catch:{ all -> 0x058c }
            boolean r3 = r3.M()     // Catch:{ all -> 0x058c }
            if (r3 != 0) goto L_0x045b
            q7.s2 r2 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r2 = r2.q()     // Catch:{ all -> 0x058c }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.b(r3)     // Catch:{ all -> 0x058c }
            r9.l()     // Catch:{ all -> 0x0458 }
            com.google.android.gms.internal.measurement.g7 r2 = r9.f5179b     // Catch:{ all -> 0x0458 }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x0458 }
            com.google.android.gms.internal.measurement.f3.G(r2, r4)     // Catch:{ all -> 0x0458 }
            x(r9, r7)     // Catch:{ all -> 0x058c }
            r2 = 18
            w(r9, r2, r14)     // Catch:{ all -> 0x058c }
            goto L_0x04aa
        L_0x0458:
            r0 = move-exception
            goto L_0x058d
        L_0x045b:
            r3 = -1
            if (r11 != r3) goto L_0x045f
            goto L_0x0487
        L_0x045f:
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r2 = (com.google.android.gms.internal.measurement.j3) r2     // Catch:{ all -> 0x058c }
            java.lang.String r2 = r2.A()     // Catch:{ all -> 0x058c }
            int r3 = r2.length()     // Catch:{ all -> 0x058c }
            r11 = 3
            if (r3 != r11) goto L_0x0487
            r3 = 0
        L_0x0471:
            int r11 = r2.length()     // Catch:{ all -> 0x058c }
            if (r3 >= r11) goto L_0x04aa
            int r11 = r2.codePointAt(r3)     // Catch:{ all -> 0x058c }
            boolean r12 = java.lang.Character.isLetter(r11)     // Catch:{ all -> 0x058c }
            if (r12 == 0) goto L_0x0487
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x058c }
            int r3 = r3 + r11
            goto L_0x0471
        L_0x0487:
            q7.s2 r2 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r2 = r2.q()     // Catch:{ all -> 0x058c }
            java.lang.String r3 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.b(r3)     // Catch:{ all -> 0x058c }
            r9.l()     // Catch:{ all -> 0x04a7 }
            com.google.android.gms.internal.measurement.g7 r2 = r9.f5179b     // Catch:{ all -> 0x04a7 }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x04a7 }
            com.google.android.gms.internal.measurement.f3.G(r2, r4)     // Catch:{ all -> 0x04a7 }
            x(r9, r7)     // Catch:{ all -> 0x058c }
            r2 = 19
            w(r9, r2, r13)     // Catch:{ all -> 0x058c }
            goto L_0x04aa
        L_0x04a7:
            r0 = move-exception
            goto L_0x058d
        L_0x04aa:
            java.lang.String r2 = r9.q()     // Catch:{ all -> 0x058c }
            r3 = r34
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x058c }
            if (r2 == 0) goto L_0x04fc
            H(r6)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r2 = r9.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r2 = q7.v6.m(r2, r8)     // Catch:{ all -> 0x058c }
            if (r2 != 0) goto L_0x04f7
            if (r16 == 0) goto L_0x04ee
            long r2 = r16.n()     // Catch:{ all -> 0x058c }
            long r6 = r9.n()     // Catch:{ all -> 0x058c }
            long r2 = r2 - r6
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x058c }
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x04ee
            com.google.android.gms.internal.measurement.c7 r2 = r16.clone()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.e3 r2 = (com.google.android.gms.internal.measurement.e3) r2     // Catch:{ all -> 0x058c }
            boolean r3 = r1.F(r9, r2)     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x04ee
            r4 = r32
            r8 = r33
            r4.o(r8, r2)     // Catch:{ all -> 0x058c }
            r3 = r27
            goto L_0x0541
        L_0x04ee:
            r4 = r32
            r8 = r33
            r14 = r9
            r13 = r26
            goto L_0x0556
        L_0x04f7:
            r4 = r32
            r8 = r33
            goto L_0x0551
        L_0x04fc:
            r4 = r32
            r8 = r33
            java.lang.String r2 = "_vs"
            java.lang.String r3 = r9.q()     // Catch:{ all -> 0x058c }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x058c }
            if (r2 == 0) goto L_0x0551
            H(r6)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r2 = r9.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2     // Catch:{ all -> 0x058c }
            r7 = r31
            com.google.android.gms.internal.measurement.j3 r2 = q7.v6.m(r2, r7)     // Catch:{ all -> 0x058c }
            if (r2 != 0) goto L_0x0551
            if (r29 == 0) goto L_0x0547
            long r2 = r29.n()     // Catch:{ all -> 0x058c }
            long r6 = r9.n()     // Catch:{ all -> 0x058c }
            long r2 = r2 - r6
            long r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x058c }
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x0547
            com.google.android.gms.internal.measurement.c7 r2 = r29.clone()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.e3 r2 = (com.google.android.gms.internal.measurement.e3) r2     // Catch:{ all -> 0x058c }
            boolean r3 = r1.F(r2, r9)     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x0547
            r3 = r27
            r4.o(r3, r2)     // Catch:{ all -> 0x058c }
        L_0x0541:
            r13 = r3
            r15 = r8
            r14 = 0
            r16 = 0
            goto L_0x0557
        L_0x0547:
            r3 = r27
            r13 = r3
            r16 = r9
            r15 = r26
            r14 = r29
            goto L_0x0557
        L_0x0551:
            r3 = r27
            r13 = r3
            r14 = r29
        L_0x0556:
            r15 = r8
        L_0x0557:
            java.util.ArrayList r2 = r5.f13308c     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r3 = r9.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x058c }
            r7 = r28
            r2.set(r7, r3)     // Catch:{ all -> 0x0587 }
            int r11 = r26 + 1
            r4.l()     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.measurement.g7 r2 = r4.f5179b     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.measurement.o3 r2 = (com.google.android.gms.internal.measurement.o3) r2     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.measurement.g7 r3 = r9.j()     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.measurement.o3.O(r2, r3)     // Catch:{ all -> 0x0581 }
        L_0x0576:
            int r12 = r7 + 1
            r6 = r4
            r4 = r20
            r2 = r25
            r3 = r30
            goto L_0x0048
        L_0x0581:
            r0 = move-exception
            goto L_0x058d
        L_0x0583:
            r0 = move-exception
            goto L_0x058d
        L_0x0585:
            r0 = move-exception
            goto L_0x058d
        L_0x0587:
            r0 = move-exception
            r14 = r1
        L_0x0589:
            r1 = r0
            goto L_0x16b4
        L_0x058c:
            r0 = move-exception
        L_0x058d:
            r2 = r0
            r14 = r1
            goto L_0x16b3
        L_0x0591:
            r4 = r6
            r3 = r10
            r6 = r13
            r13 = r26
            r12 = 0
            r14 = 0
        L_0x0599:
            if (r12 >= r13) goto L_0x05ed
            com.google.android.gms.internal.measurement.g7 r9 = r4.f5179b     // Catch:{ all -> 0x05eb }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x05eb }
            com.google.android.gms.internal.measurement.f3 r9 = r9.F1(r12)     // Catch:{ all -> 0x05eb }
            java.lang.String r10 = r9.A()     // Catch:{ all -> 0x058c }
            boolean r10 = r3.equals(r10)     // Catch:{ all -> 0x058c }
            if (r10 == 0) goto L_0x05be
            H(r6)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r10 = q7.v6.m(r9, r8)     // Catch:{ all -> 0x058c }
            if (r10 == 0) goto L_0x05be
            r4.m(r12)     // Catch:{ all -> 0x058c }
            int r13 = r13 + -1
            int r12 = r12 + -1
            goto L_0x05e8
        L_0x05be:
            H(r6)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.j3 r9 = q7.v6.m(r9, r7)     // Catch:{ all -> 0x058c }
            if (r9 == 0) goto L_0x05e8
            boolean r10 = r9.O()     // Catch:{ all -> 0x058c }
            if (r10 == 0) goto L_0x05d6
            long r9 = r9.w()     // Catch:{ all -> 0x058c }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x058c }
            goto L_0x05d7
        L_0x05d6:
            r9 = 0
        L_0x05d7:
            if (r9 == 0) goto L_0x05e8
            long r28 = r9.longValue()     // Catch:{ all -> 0x058c }
            r26 = 0
            int r10 = (r28 > r26 ? 1 : (r28 == r26 ? 0 : -1))
            if (r10 <= 0) goto L_0x05e8
            long r9 = r9.longValue()     // Catch:{ all -> 0x058c }
            long r14 = r14 + r9
        L_0x05e8:
            r9 = 1
            int r12 = r12 + r9
            goto L_0x0599
        L_0x05eb:
            r0 = move-exception
            goto L_0x058d
        L_0x05ed:
            r3 = 0
            r1.B(r4, r14, r3)     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r3 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.l7 r3 = r3.H()     // Catch:{ all -> 0x1bcd }
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)     // Catch:{ all -> 0x1bcd }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x1bcd }
        L_0x0601:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x1bcd }
            java.lang.String r8 = "_s"
            java.lang.String r9 = "_se"
            if (r7 == 0) goto L_0x0627
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.f3 r7 = (com.google.android.gms.internal.measurement.f3) r7     // Catch:{ all -> 0x058c }
            java.lang.String r7 = r7.A()     // Catch:{ all -> 0x058c }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x058c }
            if (r7 == 0) goto L_0x0601
            q7.k r3 = r1.f13350c     // Catch:{ all -> 0x058c }
            H(r3)     // Catch:{ all -> 0x058c }
            java.lang.String r7 = r4.r()     // Catch:{ all -> 0x058c }
            r3.m(r7, r9)     // Catch:{ all -> 0x058c }
        L_0x0627:
            java.lang.String r3 = "_sid"
            int r3 = q7.v6.v(r4, r3)     // Catch:{ all -> 0x1bcd }
            if (r3 < 0) goto L_0x0634
            r3 = 1
            r1.B(r4, r14, r3)     // Catch:{ all -> 0x058c }
            goto L_0x065f
        L_0x0634:
            int r3 = q7.v6.v(r4, r9)     // Catch:{ all -> 0x1bcd }
            if (r3 < 0) goto L_0x065f
            r4.l()     // Catch:{ all -> 0x065c }
            com.google.android.gms.internal.measurement.g7 r7 = r4.f5179b     // Catch:{ all -> 0x065c }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x065c }
            com.google.android.gms.internal.measurement.o3.D0(r7, r3)     // Catch:{ all -> 0x065c }
            q7.s2 r3 = r88.e()     // Catch:{ all -> 0x058c }
            q7.q2 r3 = r3.n()     // Catch:{ all -> 0x058c }
            java.lang.String r7 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.o3 r9 = r5.f13306a     // Catch:{ all -> 0x058c }
            java.lang.String r9 = r9.K1()     // Catch:{ all -> 0x058c }
            q7.r2 r9 = q7.s2.r(r9)     // Catch:{ all -> 0x058c }
            r3.c(r9, r7)     // Catch:{ all -> 0x058c }
            goto L_0x065f
        L_0x065c:
            r0 = move-exception
            goto L_0x058d
        L_0x065f:
            H(r6)     // Catch:{ all -> 0x1bcd }
            q7.t6 r3 = r6.f13208b
            q7.k4 r7 = r6.f13121a
            r9 = r7
            q7.x3 r9 = (q7.x3) r9     // Catch:{ all -> 0x1bcd }
            q7.s2 r9 = r9.e()     // Catch:{ all -> 0x1bcd }
            q7.q2 r9 = r9.o()     // Catch:{ all -> 0x1bcd }
            java.lang.String r10 = "Checking account type status for ad personalization signals"
            r9.b(r10)     // Catch:{ all -> 0x1bcd }
            q7.r3 r9 = r3.f13347a     // Catch:{ all -> 0x1bcd }
            H(r9)     // Catch:{ all -> 0x1bcd }
            java.lang.String r10 = r4.r()     // Catch:{ all -> 0x1bcd }
            r9.i()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.t2 r9 = r9.s(r10)     // Catch:{ all -> 0x1bcd }
            if (r9 != 0) goto L_0x068a
            r9 = 0
            goto L_0x068e
        L_0x068a:
            boolean r9 = r9.K()     // Catch:{ all -> 0x1bcd }
        L_0x068e:
            if (r9 == 0) goto L_0x07ec
            q7.k r3 = r3.f13350c     // Catch:{ all -> 0x058c }
            H(r3)     // Catch:{ all -> 0x058c }
            java.lang.String r9 = r4.r()     // Catch:{ all -> 0x058c }
            q7.l4 r3 = r3.C(r9)     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x07ec
            boolean r3 = r3.y()     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x07ec
            r3 = r7
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x058c }
            q7.n r3 = r3.p()     // Catch:{ all -> 0x058c }
            java.lang.String r9 = "com.google"
            r3.i()     // Catch:{ all -> 0x07e9 }
            q7.k4 r10 = r3.f13121a     // Catch:{ all -> 0x07e9 }
            q7.x3 r10 = (q7.x3) r10     // Catch:{ all -> 0x07e9 }
            ag.m r14 = r10.J     // Catch:{ all -> 0x07e9 }
            android.content.Context r15 = r10.f13419a
            r14.getClass()     // Catch:{ all -> 0x07e9 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x07e9 }
            r16 = r5
            r14 = r6
            long r5 = r3.C     // Catch:{ all -> 0x07e9 }
            long r5 = r12 - r5
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1))
            if (r5 <= 0) goto L_0x06d1
            r5 = 0
            r3.B = r5     // Catch:{ all -> 0x07e9 }
        L_0x06d1:
            java.lang.Boolean r5 = r3.B     // Catch:{ all -> 0x07e9 }
            if (r5 != 0) goto L_0x0752
            java.lang.String r5 = "android.permission.GET_ACCOUNTS"
            int r5 = t1.a.a(r15, r5)     // Catch:{ all -> 0x07e9 }
            q7.s2 r6 = r10.E
            if (r5 == 0) goto L_0x06f1
            q7.x3.l(r6)     // Catch:{ all -> 0x07e9 }
            java.lang.String r5 = "Permission error checking for dasher/unicorn accounts"
            q7.q2 r6 = r6.F     // Catch:{ all -> 0x07e9 }
            r6.b(r5)     // Catch:{ all -> 0x07e9 }
            r3.C = r12     // Catch:{ all -> 0x07e9 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x07e9 }
            r3.B = r5     // Catch:{ all -> 0x07e9 }
        L_0x06ef:
            r3 = 0
            goto L_0x0756
        L_0x06f1:
            android.accounts.AccountManager r5 = r3.f13211e     // Catch:{ all -> 0x07e9 }
            if (r5 != 0) goto L_0x06fb
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r15)     // Catch:{ all -> 0x07e9 }
            r3.f13211e = r5     // Catch:{ all -> 0x07e9 }
        L_0x06fb:
            android.accounts.AccountManager r5 = r3.f13211e     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            java.lang.String r10 = "service_HOSTED"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            r15 = 0
            android.accounts.AccountManagerFuture r5 = r5.getAccountsByTypeAndFeatures(r9, r10, r15, r15)     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            java.lang.Object r5 = r5.getResult()     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            android.accounts.Account[] r5 = (android.accounts.Account[]) r5     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            if (r5 == 0) goto L_0x071b
            int r5 = r5.length     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            if (r5 <= 0) goto L_0x071b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            r3.B = r5     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            r3.C = r12     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
        L_0x0719:
            r3 = 1
            goto L_0x0756
        L_0x071b:
            android.accounts.AccountManager r5 = r3.f13211e     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            java.lang.String r10 = "service_uca"
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            r15 = 0
            android.accounts.AccountManagerFuture r5 = r5.getAccountsByTypeAndFeatures(r9, r10, r15, r15)     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            java.lang.Object r5 = r5.getResult()     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            android.accounts.Account[] r5 = (android.accounts.Account[]) r5     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            if (r5 == 0) goto L_0x074b
            int r5 = r5.length     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            if (r5 <= 0) goto L_0x074b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            r3.B = r5     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            r3.C = r12     // Catch:{ AuthenticatorException -> 0x073f, IOException -> 0x073d, OperationCanceledException -> 0x073a }
            goto L_0x0719
        L_0x073a:
            r0 = move-exception
        L_0x073b:
            r5 = r0
            goto L_0x0741
        L_0x073d:
            r0 = move-exception
            goto L_0x073b
        L_0x073f:
            r0 = move-exception
            goto L_0x073b
        L_0x0741:
            q7.x3.l(r6)     // Catch:{ all -> 0x07e9 }
            java.lang.String r9 = "Exception checking account types"
            q7.q2 r6 = r6.C     // Catch:{ all -> 0x07e9 }
            r6.c(r5, r9)     // Catch:{ all -> 0x07e9 }
        L_0x074b:
            r3.C = r12     // Catch:{ all -> 0x07e9 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x07e9 }
            r3.B = r5     // Catch:{ all -> 0x07e9 }
            goto L_0x06ef
        L_0x0752:
            boolean r3 = r5.booleanValue()     // Catch:{ all -> 0x07e9 }
        L_0x0756:
            if (r3 == 0) goto L_0x07ef
            r3 = r7
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x058c }
            q7.s2 r3 = r3.e()     // Catch:{ all -> 0x058c }
            q7.q2 r3 = r3.m()     // Catch:{ all -> 0x058c }
            java.lang.String r5 = "Turning off ad personalization due to account type"
            r3.b(r5)     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.w3 r3 = com.google.android.gms.internal.measurement.x3.w()     // Catch:{ all -> 0x058c }
            r3.l()     // Catch:{ all -> 0x07e6 }
            com.google.android.gms.internal.measurement.g7 r5 = r3.f5179b     // Catch:{ all -> 0x07e6 }
            com.google.android.gms.internal.measurement.x3 r5 = (com.google.android.gms.internal.measurement.x3) r5     // Catch:{ all -> 0x07e6 }
            r6 = r25
            com.google.android.gms.internal.measurement.x3.B(r5, r6)     // Catch:{ all -> 0x07e6 }
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x058c }
            q7.n r5 = r7.p()     // Catch:{ all -> 0x058c }
            long r9 = r5.m()     // Catch:{ all -> 0x058c }
            r3.l()     // Catch:{ all -> 0x07e3 }
            com.google.android.gms.internal.measurement.g7 r5 = r3.f5179b     // Catch:{ all -> 0x07e3 }
            com.google.android.gms.internal.measurement.x3 r5 = (com.google.android.gms.internal.measurement.x3) r5     // Catch:{ all -> 0x07e3 }
            com.google.android.gms.internal.measurement.x3.A(r5, r9)     // Catch:{ all -> 0x07e3 }
            r3.l()     // Catch:{ all -> 0x07e0 }
            com.google.android.gms.internal.measurement.g7 r5 = r3.f5179b     // Catch:{ all -> 0x07e0 }
            com.google.android.gms.internal.measurement.x3 r5 = (com.google.android.gms.internal.measurement.x3) r5     // Catch:{ all -> 0x07e0 }
            r9 = 1
            com.google.android.gms.internal.measurement.x3.E(r5, r9)     // Catch:{ all -> 0x07e0 }
            com.google.android.gms.internal.measurement.g7 r3 = r3.j()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.x3 r3 = (com.google.android.gms.internal.measurement.x3) r3     // Catch:{ all -> 0x058c }
            r5 = 0
        L_0x079f:
            com.google.android.gms.internal.measurement.g7 r7 = r4.f5179b     // Catch:{ all -> 0x07dd }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x07dd }
            int r7 = r7.t1()     // Catch:{ all -> 0x07dd }
            if (r5 >= r7) goto L_0x07cf
            com.google.android.gms.internal.measurement.g7 r7 = r4.f5179b     // Catch:{ all -> 0x07cc }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x07cc }
            com.google.android.gms.internal.measurement.x3 r7 = r7.I1(r5)     // Catch:{ all -> 0x07cc }
            java.lang.String r7 = r7.y()     // Catch:{ all -> 0x058c }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x058c }
            if (r7 == 0) goto L_0x07c9
            r4.l()     // Catch:{ all -> 0x07c6 }
            com.google.android.gms.internal.measurement.g7 r6 = r4.f5179b     // Catch:{ all -> 0x07c6 }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x07c6 }
            com.google.android.gms.internal.measurement.o3.B0(r6, r5, r3)     // Catch:{ all -> 0x07c6 }
            goto L_0x07ef
        L_0x07c6:
            r0 = move-exception
            goto L_0x058d
        L_0x07c9:
            int r5 = r5 + 1
            goto L_0x079f
        L_0x07cc:
            r0 = move-exception
            goto L_0x058d
        L_0x07cf:
            r4.l()     // Catch:{ all -> 0x07da }
            com.google.android.gms.internal.measurement.g7 r5 = r4.f5179b     // Catch:{ all -> 0x07da }
            com.google.android.gms.internal.measurement.o3 r5 = (com.google.android.gms.internal.measurement.o3) r5     // Catch:{ all -> 0x07da }
            com.google.android.gms.internal.measurement.o3.C0(r5, r3)     // Catch:{ all -> 0x07da }
            goto L_0x07ef
        L_0x07da:
            r0 = move-exception
            goto L_0x058d
        L_0x07dd:
            r0 = move-exception
            goto L_0x058d
        L_0x07e0:
            r0 = move-exception
            goto L_0x058d
        L_0x07e3:
            r0 = move-exception
            goto L_0x058d
        L_0x07e6:
            r0 = move-exception
            goto L_0x058d
        L_0x07e9:
            r0 = move-exception
            goto L_0x058d
        L_0x07ec:
            r16 = r5
            r14 = r6
        L_0x07ef:
            r4.l()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r3 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x1bcd }
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.gms.internal.measurement.o3.F0(r3, r5)     // Catch:{ all -> 0x1bcd }
            r4.l()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r3 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x1bcd }
            r5 = -9223372036854775808
            com.google.android.gms.internal.measurement.o3.G0(r3, r5)     // Catch:{ all -> 0x1bcd }
            r3 = 0
        L_0x080b:
            com.google.android.gms.internal.measurement.g7 r5 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r5 = (com.google.android.gms.internal.measurement.o3) r5     // Catch:{ all -> 0x1bcd }
            int r5 = r5.p1()     // Catch:{ all -> 0x1bcd }
            if (r3 >= r5) goto L_0x086d
            com.google.android.gms.internal.measurement.g7 r5 = r4.f5179b     // Catch:{ all -> 0x086a }
            com.google.android.gms.internal.measurement.o3 r5 = (com.google.android.gms.internal.measurement.o3) r5     // Catch:{ all -> 0x086a }
            com.google.android.gms.internal.measurement.f3 r5 = r5.F1(r3)     // Catch:{ all -> 0x086a }
            long r6 = r5.w()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r9 = r4.f5179b     // Catch:{ all -> 0x0867 }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x0867 }
            long r9 = r9.B1()     // Catch:{ all -> 0x0867 }
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x083f
            long r6 = r5.w()     // Catch:{ all -> 0x058c }
            r4.l()     // Catch:{ all -> 0x083c }
            com.google.android.gms.internal.measurement.g7 r9 = r4.f5179b     // Catch:{ all -> 0x083c }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x083c }
            com.google.android.gms.internal.measurement.o3.F0(r9, r6)     // Catch:{ all -> 0x083c }
            goto L_0x083f
        L_0x083c:
            r0 = move-exception
            goto L_0x058d
        L_0x083f:
            long r6 = r5.w()     // Catch:{ all -> 0x058c }
            com.google.android.gms.internal.measurement.g7 r9 = r4.f5179b     // Catch:{ all -> 0x0864 }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x0864 }
            long r9 = r9.x1()     // Catch:{ all -> 0x0864 }
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0861
            long r5 = r5.w()     // Catch:{ all -> 0x058c }
            r4.l()     // Catch:{ all -> 0x085e }
            com.google.android.gms.internal.measurement.g7 r7 = r4.f5179b     // Catch:{ all -> 0x085e }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x085e }
            com.google.android.gms.internal.measurement.o3.G0(r7, r5)     // Catch:{ all -> 0x085e }
            goto L_0x0861
        L_0x085e:
            r0 = move-exception
            goto L_0x058d
        L_0x0861:
            int r3 = r3 + 1
            goto L_0x080b
        L_0x0864:
            r0 = move-exception
            goto L_0x058d
        L_0x0867:
            r0 = move-exception
            goto L_0x058d
        L_0x086a:
            r0 = move-exception
            goto L_0x058d
        L_0x086d:
            r4.D()     // Catch:{ all -> 0x1bcd }
            r4.x()     // Catch:{ all -> 0x1bcd }
            q7.b r3 = r1.B     // Catch:{ all -> 0x1bcd }
            H(r3)     // Catch:{ all -> 0x1bcd }
            java.lang.String r5 = r4.r()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r6 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.l7 r6 = r6.H()     // Catch:{ all -> 0x1bcd }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r7 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.l7 r7 = r7.I()     // Catch:{ all -> 0x1bcd }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r9 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x1bcd }
            long r9 = r9.B1()     // Catch:{ all -> 0x1bcd }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.g7 r10 = r4.f5179b     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.o3 r10 = (com.google.android.gms.internal.measurement.o3) r10     // Catch:{ all -> 0x1bcd }
            long r12 = r10.x1()     // Catch:{ all -> 0x1bcd }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1bcd }
            java.lang.String r12 = "current_results"
            u6.q.f(r5)     // Catch:{ all -> 0x1bcd }
            u6.q.i(r6)     // Catch:{ all -> 0x1bcd }
            u6.q.i(r7)     // Catch:{ all -> 0x1bcd }
            r3.f12908d = r5     // Catch:{ all -> 0x1bcd }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x1bcd }
            r5.<init>()     // Catch:{ all -> 0x1bcd }
            r3.f12909e = r5     // Catch:{ all -> 0x1bcd }
            o.a r5 = new o.a     // Catch:{ all -> 0x1bcd }
            r5.<init>()     // Catch:{ all -> 0x1bcd }
            r3.B = r5     // Catch:{ all -> 0x1bcd }
            r3.C = r9     // Catch:{ all -> 0x1bcd }
            r3.D = r10     // Catch:{ all -> 0x1bcd }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x1bcd }
        L_0x08cf:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x1bcd }
            if (r9 == 0) goto L_0x08e7
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x1bcd }
            java.lang.String r9 = r9.A()     // Catch:{ all -> 0x1bcd }
            boolean r9 = r8.equals(r9)     // Catch:{ all -> 0x1bcd }
            if (r9 == 0) goto L_0x08cf
            r5 = 1
            goto L_0x08e8
        L_0x08e7:
            r5 = 0
        L_0x08e8:
            com.google.android.gms.internal.measurement.ma.a()     // Catch:{ all -> 0x1bcd }
            q7.k4 r8 = r3.f13121a     // Catch:{ all -> 0x1bcd }
            q7.x3 r8 = (q7.x3) r8     // Catch:{ all -> 0x1bcd }
            q7.f r9 = r8.o()     // Catch:{ all -> 0x1bcd }
            java.lang.String r10 = r3.f12908d     // Catch:{ all -> 0x1bcd }
            q7.f2 r13 = q7.g2.Y     // Catch:{ all -> 0x1bcd }
            boolean r9 = r9.r(r10, r13)     // Catch:{ all -> 0x1bcd }
            com.google.android.gms.internal.measurement.ma.a()     // Catch:{ all -> 0x1bcd }
            q7.f r10 = r8.o()     // Catch:{ all -> 0x1bcd }
            java.lang.String r13 = r3.f12908d     // Catch:{ all -> 0x1bcd }
            q7.f2 r15 = q7.g2.X     // Catch:{ all -> 0x1bcd }
            boolean r10 = r10.r(r13, r15)     // Catch:{ all -> 0x1bcd }
            q7.t6 r13 = r3.f13208b     // Catch:{ all -> 0x1bcd }
            if (r5 == 0) goto L_0x096d
            q7.k r15 = r13.L()     // Catch:{ all -> 0x1870 }
            r25 = r2
            java.lang.String r2 = r3.f12908d     // Catch:{ all -> 0x1870 }
            r15.j()     // Catch:{ all -> 0x1870 }
            r15.i()     // Catch:{ all -> 0x1870 }
            u6.q.f(r2)     // Catch:{ all -> 0x1870 }
            r38 = r11
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x1870 }
            r11.<init>()     // Catch:{ all -> 0x1870 }
            java.lang.String r1 = "current_session_count"
            r39 = r14
            r30 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x1870 }
            r11.put(r1, r14)     // Catch:{ all -> 0x1870 }
            android.database.sqlite.SQLiteDatabase r1 = r15.B()     // Catch:{ SQLiteException -> 0x094f }
            java.lang.String r14 = "events"
            r40 = r4
            java.lang.String r4 = "app_id = ?"
            r42 = r6
            r41 = r7
            r7 = 1
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x094b }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x094b }
            r1.update(r14, r11, r4, r6)     // Catch:{ SQLiteException -> 0x094b }
            goto L_0x0979
        L_0x094b:
            r0 = move-exception
            goto L_0x0956
        L_0x094d:
            r0 = move-exception
            goto L_0x0952
        L_0x094f:
            r0 = move-exception
            r40 = r4
        L_0x0952:
            r42 = r6
            r41 = r7
        L_0x0956:
            r1 = r0
            q7.k4 r4 = r15.f13121a     // Catch:{ all -> 0x1870 }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ all -> 0x1870 }
            q7.s2 r4 = r4.e()     // Catch:{ all -> 0x1870 }
            q7.q2 r4 = r4.n()     // Catch:{ all -> 0x1870 }
            q7.r2 r2 = q7.s2.r(r2)     // Catch:{ all -> 0x1870 }
            java.lang.String r6 = "Error resetting session-scoped event counts. appId"
            r4.d(r2, r1, r6)     // Catch:{ all -> 0x1870 }
            goto L_0x0979
        L_0x096d:
            r25 = r2
            r40 = r4
            r42 = r6
            r41 = r7
            r38 = r11
            r39 = r14
        L_0x0979:
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1870 }
            java.lang.String r2 = "Failed to merge filter. appId"
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.String r6 = "audience_id"
            java.lang.String r7 = "data"
            if (r10 == 0) goto L_0x0a71
            if (r9 == 0) goto L_0x0a71
            q7.k r1 = r13.L()     // Catch:{ all -> 0x1870 }
            q7.k4 r11 = r1.f13121a     // Catch:{ all -> 0x1870 }
            java.lang.String r14 = r3.f12908d     // Catch:{ all -> 0x1870 }
            u6.q.f(r14)     // Catch:{ all -> 0x1870 }
            o.a r15 = new o.a     // Catch:{ all -> 0x1870 }
            r15.<init>()     // Catch:{ all -> 0x1870 }
            android.database.sqlite.SQLiteDatabase r30 = r1.B()     // Catch:{ all -> 0x1870 }
            java.lang.String r31 = "event_filters"
            java.lang.String[] r32 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x0a43, all -> 0x0a3f }
            java.lang.String r33 = "app_id=?"
            r43 = r7
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0a3d, all -> 0x0a3f }
            r1 = 0
            r7[r1] = r14     // Catch:{ SQLiteException -> 0x0a3d, all -> 0x0a3f }
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r7
            android.database.Cursor r1 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x0a3d, all -> 0x0a3f }
            boolean r7 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0a39 }
            if (r7 == 0) goto L_0x0a2e
        L_0x09bf:
            r44 = r9
            r7 = 1
            byte[] r9 = r1.getBlob(r7)     // Catch:{ SQLiteException -> 0x0a29 }
            com.google.android.gms.internal.measurement.b2 r7 = com.google.android.gms.internal.measurement.c2.v()     // Catch:{ IOException -> 0x0a03 }
            com.google.android.gms.internal.measurement.c7 r7 = q7.v6.A(r7, r9)     // Catch:{ IOException -> 0x0a03 }
            com.google.android.gms.internal.measurement.b2 r7 = (com.google.android.gms.internal.measurement.b2) r7     // Catch:{ IOException -> 0x0a03 }
            com.google.android.gms.internal.measurement.g7 r7 = r7.j()     // Catch:{ IOException -> 0x0a03 }
            com.google.android.gms.internal.measurement.c2 r7 = (com.google.android.gms.internal.measurement.c2) r7     // Catch:{ IOException -> 0x0a03 }
            boolean r9 = r7.G()     // Catch:{ SQLiteException -> 0x0a29 }
            if (r9 != 0) goto L_0x09df
            r45 = r10
            goto L_0x0a19
        L_0x09df:
            r9 = 0
            int r30 = r1.getInt(r9)     // Catch:{ SQLiteException -> 0x0a29 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r30)     // Catch:{ SQLiteException -> 0x0a29 }
            java.lang.Object r30 = r15.get(r9)     // Catch:{ SQLiteException -> 0x0a29 }
            java.util.List r30 = (java.util.List) r30     // Catch:{ SQLiteException -> 0x0a29 }
            if (r30 != 0) goto L_0x09fb
            r45 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0a37 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x0a37 }
            r15.put(r9, r10)     // Catch:{ SQLiteException -> 0x0a37 }
            goto L_0x09ff
        L_0x09fb:
            r45 = r10
            r10 = r30
        L_0x09ff:
            r10.add(r7)     // Catch:{ SQLiteException -> 0x0a37 }
            goto L_0x0a19
        L_0x0a03:
            r0 = move-exception
            r45 = r10
            r7 = r0
            r9 = r11
            q7.x3 r9 = (q7.x3) r9     // Catch:{ SQLiteException -> 0x0a37 }
            q7.s2 r9 = r9.e()     // Catch:{ SQLiteException -> 0x0a37 }
            q7.q2 r9 = r9.n()     // Catch:{ SQLiteException -> 0x0a37 }
            q7.r2 r10 = q7.s2.r(r14)     // Catch:{ SQLiteException -> 0x0a37 }
            r9.d(r10, r7, r2)     // Catch:{ SQLiteException -> 0x0a37 }
        L_0x0a19:
            boolean r7 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0a37 }
            if (r7 != 0) goto L_0x0a24
            r1.close()     // Catch:{ all -> 0x1448 }
            goto L_0x0a78
        L_0x0a24:
            r9 = r44
            r10 = r45
            goto L_0x09bf
        L_0x0a29:
            r0 = move-exception
        L_0x0a2a:
            r45 = r10
        L_0x0a2c:
            r7 = r0
            goto L_0x0a4c
        L_0x0a2e:
            r44 = r9
            r45 = r10
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0a37 }
            goto L_0x0a63
        L_0x0a37:
            r0 = move-exception
            goto L_0x0a2c
        L_0x0a39:
            r0 = move-exception
            r44 = r9
            goto L_0x0a2a
        L_0x0a3d:
            r0 = move-exception
            goto L_0x0a46
        L_0x0a3f:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x0a6b
        L_0x0a43:
            r0 = move-exception
            r43 = r7
        L_0x0a46:
            r44 = r9
            r45 = r10
            r7 = r0
            r1 = 0
        L_0x0a4c:
            q7.x3 r11 = (q7.x3) r11     // Catch:{ all -> 0x0a68 }
            q7.s2 r9 = r11.e()     // Catch:{ all -> 0x0a68 }
            q7.q2 r9 = r9.n()     // Catch:{ all -> 0x0a68 }
            q7.r2 r10 = q7.s2.r(r14)     // Catch:{ all -> 0x0a68 }
            r9.d(r10, r7, r4)     // Catch:{ all -> 0x0a68 }
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0a68 }
            if (r1 == 0) goto L_0x0a66
        L_0x0a63:
            r1.close()     // Catch:{ all -> 0x1870 }
        L_0x0a66:
            r1 = r7
            goto L_0x0a77
        L_0x0a68:
            r0 = move-exception
            r9 = r1
            r1 = r0
        L_0x0a6b:
            if (r9 == 0) goto L_0x0a70
            r9.close()     // Catch:{ all -> 0x1870 }
        L_0x0a70:
            throw r1     // Catch:{ all -> 0x1870 }
        L_0x0a71:
            r43 = r7
            r44 = r9
            r45 = r10
        L_0x0a77:
            r15 = r1
        L_0x0a78:
            q7.k r1 = r13.L()     // Catch:{ all -> 0x1870 }
            q7.k4 r7 = r1.f13121a     // Catch:{ all -> 0x1870 }
            java.lang.String r9 = r3.f12908d     // Catch:{ all -> 0x1870 }
            r1.j()     // Catch:{ all -> 0x1870 }
            r1.i()     // Catch:{ all -> 0x1870 }
            u6.q.f(r9)     // Catch:{ all -> 0x1870 }
            android.database.sqlite.SQLiteDatabase r30 = r1.B()     // Catch:{ all -> 0x1870 }
            java.lang.String r31 = "audience_filter_values"
            java.lang.String[] r32 = new java.lang.String[]{r6, r12}     // Catch:{ SQLiteException -> 0x0b2c, all -> 0x0b25 }
            java.lang.String r33 = "app_id=?"
            r1 = 1
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0b2c, all -> 0x0b25 }
            r1 = 0
            r10[r1] = r9     // Catch:{ SQLiteException -> 0x0b2c, all -> 0x0b25 }
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r10
            android.database.Cursor r1 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x0b2c, all -> 0x0b25 }
            boolean r10 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0b1f }
            if (r10 != 0) goto L_0x0aba
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0b1f }
            r1.close()     // Catch:{ all -> 0x1870 }
            r47 = r4
            r46 = r12
            goto L_0x0b4f
        L_0x0aba:
            o.a r10 = new o.a     // Catch:{ SQLiteException -> 0x0b1f }
            r10.<init>()     // Catch:{ SQLiteException -> 0x0b1f }
        L_0x0abf:
            r11 = 0
            int r14 = r1.getInt(r11)     // Catch:{ SQLiteException -> 0x0b1f }
            r46 = r12
            r11 = 1
            byte[] r12 = r1.getBlob(r11)     // Catch:{ SQLiteException -> 0x0b1b }
            com.google.android.gms.internal.measurement.s3 r11 = com.google.android.gms.internal.measurement.t3.x()     // Catch:{ IOException -> 0x0ae7 }
            com.google.android.gms.internal.measurement.c7 r11 = q7.v6.A(r11, r12)     // Catch:{ IOException -> 0x0ae7 }
            com.google.android.gms.internal.measurement.s3 r11 = (com.google.android.gms.internal.measurement.s3) r11     // Catch:{ IOException -> 0x0ae7 }
            com.google.android.gms.internal.measurement.g7 r11 = r11.j()     // Catch:{ IOException -> 0x0ae7 }
            com.google.android.gms.internal.measurement.t3 r11 = (com.google.android.gms.internal.measurement.t3) r11     // Catch:{ IOException -> 0x0ae7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0b1b }
            r10.put(r12, r11)     // Catch:{ SQLiteException -> 0x0b1b }
            r47 = r4
            r30 = r10
            goto L_0x0b05
        L_0x0ae7:
            r0 = move-exception
            r11 = r0
            r12 = r7
            q7.x3 r12 = (q7.x3) r12     // Catch:{ SQLiteException -> 0x0b1b }
            q7.s2 r12 = r12.e()     // Catch:{ SQLiteException -> 0x0b1b }
            q7.q2 r12 = r12.n()     // Catch:{ SQLiteException -> 0x0b1b }
            r30 = r10
            java.lang.String r10 = "Failed to merge filter results. appId, audienceId, error"
            r47 = r4
            q7.r2 r4 = q7.s2.r(r9)     // Catch:{ SQLiteException -> 0x0b18 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0b18 }
            r12.e(r10, r4, r14, r11)     // Catch:{ SQLiteException -> 0x0b18 }
        L_0x0b05:
            boolean r4 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0b18 }
            if (r4 != 0) goto L_0x0b11
            r1.close()     // Catch:{ all -> 0x1448 }
            r7 = r30
            goto L_0x0b4f
        L_0x0b11:
            r10 = r30
            r12 = r46
            r4 = r47
            goto L_0x0abf
        L_0x0b18:
            r0 = move-exception
        L_0x0b19:
            r4 = r0
            goto L_0x0b33
        L_0x0b1b:
            r0 = move-exception
            r47 = r4
            goto L_0x0b19
        L_0x0b1f:
            r0 = move-exception
            r47 = r4
            r46 = r12
            goto L_0x0b19
        L_0x0b25:
            r0 = move-exception
            r1 = r0
            r9 = 0
            r5 = r88
            goto L_0x1bc7
        L_0x0b2c:
            r0 = move-exception
            r47 = r4
            r46 = r12
            r4 = r0
            r1 = 0
        L_0x0b33:
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x1bc2 }
            q7.s2 r7 = r7.e()     // Catch:{ all -> 0x1bc2 }
            q7.q2 r7 = r7.n()     // Catch:{ all -> 0x1bc2 }
            java.lang.String r10 = "Database error querying filter results. appId"
            q7.r2 r9 = q7.s2.r(r9)     // Catch:{ all -> 0x1bc2 }
            r7.d(r9, r4, r10)     // Catch:{ all -> 0x1bc2 }
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x1bc2 }
            if (r1 == 0) goto L_0x0b4f
            r1.close()     // Catch:{ all -> 0x1870 }
        L_0x0b4f:
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x1870 }
            r4 = 2
            if (r1 == 0) goto L_0x0b5e
            r48 = r2
        L_0x0b58:
            r52 = r6
            r51 = r8
            goto L_0x0ee1
        L_0x0b5e:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x1870 }
            java.util.Set r9 = r7.keySet()     // Catch:{ all -> 0x1870 }
            r1.<init>(r9)     // Catch:{ all -> 0x1870 }
            if (r5 == 0) goto L_0x0d2a
            java.lang.String r5 = r3.f12908d     // Catch:{ all -> 0x1870 }
            q7.k r9 = r13.L()     // Catch:{ all -> 0x1870 }
            java.lang.String r10 = r3.f12908d     // Catch:{ all -> 0x1870 }
            r9.j()     // Catch:{ all -> 0x1870 }
            r9.i()     // Catch:{ all -> 0x1870 }
            u6.q.f(r10)     // Catch:{ all -> 0x1870 }
            o.a r11 = new o.a     // Catch:{ all -> 0x1870 }
            r11.<init>()     // Catch:{ all -> 0x1870 }
            android.database.sqlite.SQLiteDatabase r12 = r9.B()     // Catch:{ all -> 0x1870 }
            java.lang.String r14 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r48 = r2
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0bcf, all -> 0x0bd1 }
            r4 = 0
            r2[r4] = r10     // Catch:{ SQLiteException -> 0x0bcf, all -> 0x0bd1 }
            r23 = 1
            r2[r23] = r10     // Catch:{ SQLiteException -> 0x0bcf, all -> 0x0bd1 }
            android.database.Cursor r2 = r12.rawQuery(r14, r2)     // Catch:{ SQLiteException -> 0x0bcf, all -> 0x0bd1 }
            boolean r12 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0bcc }
            if (r12 == 0) goto L_0x0bc7
        L_0x0b9a:
            int r12 = r2.getInt(r4)     // Catch:{ SQLiteException -> 0x0bcc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0bcc }
            java.lang.Object r12 = r11.get(r4)     // Catch:{ SQLiteException -> 0x0bcc }
            java.util.List r12 = (java.util.List) r12     // Catch:{ SQLiteException -> 0x0bcc }
            if (r12 != 0) goto L_0x0bb2
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0bcc }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0bcc }
            r11.put(r4, r12)     // Catch:{ SQLiteException -> 0x0bcc }
        L_0x0bb2:
            r4 = 1
            int r14 = r2.getInt(r4)     // Catch:{ SQLiteException -> 0x0bcc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0bcc }
            r12.add(r4)     // Catch:{ SQLiteException -> 0x0bcc }
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0bcc }
            if (r4 != 0) goto L_0x0bc5
            goto L_0x0bf6
        L_0x0bc5:
            r4 = 0
            goto L_0x0b9a
        L_0x0bc7:
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0bcc }
            goto L_0x0bf6
        L_0x0bcc:
            r0 = move-exception
            r4 = r0
            goto L_0x0bdb
        L_0x0bcf:
            r0 = move-exception
            goto L_0x0bd9
        L_0x0bd1:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x0d24
        L_0x0bd6:
            r0 = move-exception
            r48 = r2
        L_0x0bd9:
            r4 = r0
            r2 = 0
        L_0x0bdb:
            q7.k4 r9 = r9.f13121a     // Catch:{ all -> 0x0d21 }
            q7.x3 r9 = (q7.x3) r9     // Catch:{ all -> 0x0d21 }
            q7.s2 r9 = r9.e()     // Catch:{ all -> 0x0d21 }
            q7.q2 r9 = r9.n()     // Catch:{ all -> 0x0d21 }
            java.lang.String r11 = "Database error querying scoped filters. appId"
            q7.r2 r10 = q7.s2.r(r10)     // Catch:{ all -> 0x0d21 }
            r9.d(r10, r4, r11)     // Catch:{ all -> 0x0d21 }
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0d21 }
            if (r2 == 0) goto L_0x0bf9
        L_0x0bf6:
            r2.close()     // Catch:{ all -> 0x1448 }
        L_0x0bf9:
            u6.q.f(r5)     // Catch:{ all -> 0x1448 }
            o.a r2 = new o.a     // Catch:{ all -> 0x1448 }
            r2.<init>()     // Catch:{ all -> 0x1448 }
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x1448 }
            if (r4 == 0) goto L_0x0c09
            goto L_0x0d2d
        L_0x0c09:
            java.util.Set r4 = r7.keySet()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1448 }
        L_0x0c11:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1448 }
            if (r5 == 0) goto L_0x0d2d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x1448 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            java.lang.Object r10 = r7.get(r9)     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r10 = (com.google.android.gms.internal.measurement.t3) r10     // Catch:{ all -> 0x1448 }
            java.lang.Object r12 = r11.get(r9)     // Catch:{ all -> 0x1448 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x1448 }
            if (r12 == 0) goto L_0x0d14
            boolean r14 = r12.isEmpty()     // Catch:{ all -> 0x1448 }
            if (r14 == 0) goto L_0x0c3b
            goto L_0x0d14
        L_0x0c3b:
            q7.v6 r9 = r13.O()     // Catch:{ all -> 0x1448 }
            java.util.List r14 = r10.B()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.k7 r14 = (com.google.android.gms.internal.measurement.k7) r14     // Catch:{ all -> 0x1448 }
            java.util.List r9 = r9.D(r14, r12)     // Catch:{ all -> 0x1448 }
            boolean r14 = r9.isEmpty()     // Catch:{ all -> 0x1448 }
            if (r14 != 0) goto L_0x0d0f
            com.google.android.gms.internal.measurement.c7 r14 = r10.j()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.s3 r14 = (com.google.android.gms.internal.measurement.s3) r14     // Catch:{ all -> 0x1448 }
            r14.n()     // Catch:{ all -> 0x1448 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x1448 }
            r14.l()     // Catch:{ all -> 0x1448 }
            r30 = r4
            com.google.android.gms.internal.measurement.g7 r4 = r14.f5179b     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r4 = (com.google.android.gms.internal.measurement.t3) r4     // Catch:{ all -> 0x1448 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3.G(r4, r9)     // Catch:{ all -> 0x1448 }
            q7.v6 r4 = r13.O()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.k7 r9 = r10.D()     // Catch:{ all -> 0x1448 }
            java.util.List r4 = r4.D(r9, r12)     // Catch:{ all -> 0x1448 }
            r14.p()     // Catch:{ all -> 0x1448 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x1448 }
            r14.l()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.g7 r9 = r14.f5179b     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r9 = (com.google.android.gms.internal.measurement.t3) r9     // Catch:{ all -> 0x1448 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3.E(r9, r4)     // Catch:{ all -> 0x1448 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x1448 }
            r4.<init>()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.l7 r9 = r10.A()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x1448 }
        L_0x0c92:
            boolean r31 = r9.hasNext()     // Catch:{ all -> 0x1448 }
            if (r31 == 0) goto L_0x0cba
            java.lang.Object r31 = r9.next()     // Catch:{ all -> 0x1448 }
            r32 = r9
            r9 = r31
            com.google.android.gms.internal.measurement.d3 r9 = (com.google.android.gms.internal.measurement.d3) r9     // Catch:{ all -> 0x1448 }
            int r31 = r9.t()     // Catch:{ all -> 0x1448 }
            r33 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r31)     // Catch:{ all -> 0x1448 }
            boolean r11 = r12.contains(r11)     // Catch:{ all -> 0x1448 }
            if (r11 != 0) goto L_0x0cb5
            r4.add(r9)     // Catch:{ all -> 0x1448 }
        L_0x0cb5:
            r9 = r32
            r11 = r33
            goto L_0x0c92
        L_0x0cba:
            r33 = r11
            r14.m()     // Catch:{ all -> 0x1448 }
            r14.l()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.g7 r9 = r14.f5179b     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r9 = (com.google.android.gms.internal.measurement.t3) r9     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3.I(r9, r4)     // Catch:{ all -> 0x1448 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x1448 }
            r4.<init>()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.l7 r9 = r10.C()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x1448 }
        L_0x0cd6:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x1448 }
            if (r10 == 0) goto L_0x0cf4
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.v3 r10 = (com.google.android.gms.internal.measurement.v3) r10     // Catch:{ all -> 0x1448 }
            int r11 = r10.u()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x1448 }
            boolean r11 = r12.contains(r11)     // Catch:{ all -> 0x1448 }
            if (r11 != 0) goto L_0x0cd6
            r4.add(r10)     // Catch:{ all -> 0x1448 }
            goto L_0x0cd6
        L_0x0cf4:
            r14.o()     // Catch:{ all -> 0x1448 }
            r14.l()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.g7 r9 = r14.f5179b     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r9 = (com.google.android.gms.internal.measurement.t3) r9     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3.K(r9, r4)     // Catch:{ all -> 0x1448 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.g7 r5 = r14.j()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r5 = (com.google.android.gms.internal.measurement.t3) r5     // Catch:{ all -> 0x1448 }
            r2.put(r4, r5)     // Catch:{ all -> 0x1448 }
            goto L_0x0d1b
        L_0x0d0f:
            r30 = r4
            r33 = r11
            goto L_0x0d1b
        L_0x0d14:
            r30 = r4
            r33 = r11
            r2.put(r9, r10)     // Catch:{ all -> 0x1448 }
        L_0x0d1b:
            r4 = r30
            r11 = r33
            goto L_0x0c11
        L_0x0d21:
            r0 = move-exception
            r1 = r0
            r9 = r2
        L_0x0d24:
            if (r9 == 0) goto L_0x0d29
            r9.close()     // Catch:{ all -> 0x1448 }
        L_0x0d29:
            throw r1     // Catch:{ all -> 0x1448 }
        L_0x0d2a:
            r48 = r2
            r2 = r7
        L_0x0d2d:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x1870 }
        L_0x0d31:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x1870 }
            if (r4 == 0) goto L_0x0b58
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x1870 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x1870 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x1870 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1870 }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.t3 r5 = (com.google.android.gms.internal.measurement.t3) r5     // Catch:{ all -> 0x1870 }
            java.util.BitSet r9 = new java.util.BitSet     // Catch:{ all -> 0x1870 }
            r9.<init>()     // Catch:{ all -> 0x1870 }
            java.util.BitSet r10 = new java.util.BitSet     // Catch:{ all -> 0x1870 }
            r10.<init>()     // Catch:{ all -> 0x1870 }
            o.a r11 = new o.a     // Catch:{ all -> 0x1870 }
            r11.<init>()     // Catch:{ all -> 0x1870 }
            if (r5 == 0) goto L_0x0d9d
            int r12 = r5.t()     // Catch:{ all -> 0x1870 }
            if (r12 != 0) goto L_0x0d63
            goto L_0x0d9d
        L_0x0d63:
            com.google.android.gms.internal.measurement.l7 r12 = r5.A()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x1448 }
        L_0x0d6b:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x1448 }
            if (r14 == 0) goto L_0x0d9d
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.d3 r14 = (com.google.android.gms.internal.measurement.d3) r14     // Catch:{ all -> 0x1448 }
            boolean r30 = r14.A()     // Catch:{ all -> 0x1448 }
            if (r30 == 0) goto L_0x0d6b
            int r30 = r14.t()     // Catch:{ all -> 0x1448 }
            r49 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x1448 }
            boolean r30 = r14.z()     // Catch:{ all -> 0x1448 }
            if (r30 == 0) goto L_0x0d96
            long r30 = r14.u()     // Catch:{ all -> 0x1448 }
            java.lang.Long r14 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x1448 }
            goto L_0x0d97
        L_0x0d96:
            r14 = 0
        L_0x0d97:
            r11.put(r1, r14)     // Catch:{ all -> 0x1448 }
            r1 = r49
            goto L_0x0d6b
        L_0x0d9d:
            r49 = r1
            o.a r1 = new o.a     // Catch:{ all -> 0x1870 }
            r1.<init>()     // Catch:{ all -> 0x1870 }
            if (r5 == 0) goto L_0x0df4
            int r12 = r5.v()     // Catch:{ all -> 0x1448 }
            if (r12 != 0) goto L_0x0dad
            goto L_0x0df4
        L_0x0dad:
            com.google.android.gms.internal.measurement.l7 r12 = r5.C()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x1448 }
        L_0x0db5:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x1448 }
            if (r14 == 0) goto L_0x0df4
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.v3 r14 = (com.google.android.gms.internal.measurement.v3) r14     // Catch:{ all -> 0x1448 }
            boolean r30 = r14.B()     // Catch:{ all -> 0x1448 }
            if (r30 == 0) goto L_0x0df1
            int r30 = r14.t()     // Catch:{ all -> 0x1448 }
            if (r30 <= 0) goto L_0x0df1
            int r30 = r14.u()     // Catch:{ all -> 0x1448 }
            r50 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x1448 }
            int r30 = r14.t()     // Catch:{ all -> 0x1448 }
            r31 = r12
            r19 = -1
            int r12 = r30 + -1
            long r32 = r14.v(r12)     // Catch:{ all -> 0x1448 }
            java.lang.Long r12 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x1448 }
            r1.put(r2, r12)     // Catch:{ all -> 0x1448 }
            r12 = r31
            r2 = r50
            goto L_0x0db5
        L_0x0df1:
            r19 = -1
            goto L_0x0db5
        L_0x0df4:
            r50 = r2
            r19 = -1
            if (r5 == 0) goto L_0x0e4b
            r2 = 0
        L_0x0dfb:
            int r12 = r5.w()     // Catch:{ all -> 0x1448 }
            int r12 = r12 * 64
            if (r2 >= r12) goto L_0x0e4b
            com.google.android.gms.internal.measurement.k7 r12 = r5.D()     // Catch:{ all -> 0x1448 }
            boolean r12 = q7.v6.H(r2, r12)     // Catch:{ all -> 0x1448 }
            if (r12 == 0) goto L_0x0e39
            q7.s2 r12 = r8.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r12 = r12.o()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1448 }
            r51 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1448 }
            r52 = r6
            java.lang.String r6 = "Filter already evaluated. audience ID, filter ID"
            r12.d(r14, r8, r6)     // Catch:{ all -> 0x1448 }
            r10.set(r2)     // Catch:{ all -> 0x1448 }
            java.util.List r6 = r5.B()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.k7 r6 = (com.google.android.gms.internal.measurement.k7) r6     // Catch:{ all -> 0x1448 }
            boolean r6 = q7.v6.H(r2, r6)     // Catch:{ all -> 0x1448 }
            if (r6 == 0) goto L_0x0e3d
            r9.set(r2)     // Catch:{ all -> 0x1448 }
            goto L_0x0e44
        L_0x0e39:
            r52 = r6
            r51 = r8
        L_0x0e3d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1448 }
            r11.remove(r6)     // Catch:{ all -> 0x1448 }
        L_0x0e44:
            int r2 = r2 + 1
            r8 = r51
            r6 = r52
            goto L_0x0dfb
        L_0x0e4b:
            r52 = r6
            r51 = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1448 }
            java.lang.Object r5 = r7.get(r2)     // Catch:{ all -> 0x1448 }
            r33 = r5
            com.google.android.gms.internal.measurement.t3 r33 = (com.google.android.gms.internal.measurement.t3) r33     // Catch:{ all -> 0x1448 }
            if (r45 == 0) goto L_0x0eb9
            if (r44 == 0) goto L_0x0eb9
            java.lang.Object r2 = r15.get(r2)     // Catch:{ all -> 0x1448 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x1448 }
            if (r2 == 0) goto L_0x0eb9
            java.lang.Long r5 = r3.D     // Catch:{ all -> 0x1448 }
            if (r5 == 0) goto L_0x0eb9
            java.lang.Long r5 = r3.C     // Catch:{ all -> 0x1448 }
            if (r5 != 0) goto L_0x0e70
            goto L_0x0eb9
        L_0x0e70:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1448 }
        L_0x0e74:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x1448 }
            if (r5 == 0) goto L_0x0eb9
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.c2 r5 = (com.google.android.gms.internal.measurement.c2) r5     // Catch:{ all -> 0x1448 }
            int r6 = r5.u()     // Catch:{ all -> 0x1448 }
            java.lang.Long r8 = r3.D     // Catch:{ all -> 0x1448 }
            long r30 = r8.longValue()     // Catch:{ all -> 0x1448 }
            long r30 = r30 / r17
            boolean r5 = r5.E()     // Catch:{ all -> 0x1448 }
            if (r5 == 0) goto L_0x0e9a
            java.lang.Long r5 = r3.C     // Catch:{ all -> 0x1448 }
            long r30 = r5.longValue()     // Catch:{ all -> 0x1448 }
            long r30 = r30 / r17
        L_0x0e9a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1448 }
            boolean r6 = r11.containsKey(r5)     // Catch:{ all -> 0x1448 }
            if (r6 == 0) goto L_0x0eab
            java.lang.Long r6 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x1448 }
            r11.put(r5, r6)     // Catch:{ all -> 0x1448 }
        L_0x0eab:
            boolean r6 = r1.containsKey(r5)     // Catch:{ all -> 0x1448 }
            if (r6 == 0) goto L_0x0e74
            java.lang.Long r6 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x1448 }
            r1.put(r5, r6)     // Catch:{ all -> 0x1448 }
            goto L_0x0e74
        L_0x0eb9:
            q7.f7 r2 = new q7.f7     // Catch:{ all -> 0x1448 }
            java.lang.String r5 = r3.f12908d     // Catch:{ all -> 0x1448 }
            r30 = r2
            r31 = r3
            r32 = r5
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x1448 }
            o.a r1 = r3.B     // Catch:{ all -> 0x1448 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1448 }
            r1.put(r4, r2)     // Catch:{ all -> 0x1448 }
            r1 = r49
            r2 = r50
            r8 = r51
            r6 = r52
            goto L_0x0d31
        L_0x0ee1:
            boolean r1 = r42.isEmpty()     // Catch:{ all -> 0x1870 }
            java.lang.String r2 = "Skipping failed audience ID"
            if (r1 == 0) goto L_0x0eef
        L_0x0ee9:
            r14 = r47
            r47 = r2
            goto L_0x11c1
        L_0x0eef:
            q7.g7 r1 = new q7.g7     // Catch:{ all -> 0x1870 }
            r1.<init>(r3)     // Catch:{ all -> 0x1870 }
            o.a r4 = new o.a     // Catch:{ all -> 0x1870 }
            r4.<init>()     // Catch:{ all -> 0x1870 }
            java.util.Iterator r5 = r42.iterator()     // Catch:{ all -> 0x1870 }
        L_0x0efd:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x1870 }
            if (r6 == 0) goto L_0x0ee9
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x1870 }
            java.lang.String r7 = r3.f12908d     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r7 = r1.a(r6, r7)     // Catch:{ all -> 0x1870 }
            if (r7 == 0) goto L_0x0efd
            q7.k r8 = r13.L()     // Catch:{ all -> 0x1870 }
            java.lang.String r9 = r3.f12908d     // Catch:{ all -> 0x1870 }
            java.lang.String r10 = r7.A()     // Catch:{ all -> 0x1870 }
            java.lang.String r11 = r6.A()     // Catch:{ all -> 0x1870 }
            q7.p r11 = r8.G(r9, r11)     // Catch:{ all -> 0x1870 }
            if (r11 != 0) goto L_0x0f6a
            q7.k4 r8 = r8.f13121a     // Catch:{ all -> 0x1448 }
            q7.x3 r8 = (q7.x3) r8     // Catch:{ all -> 0x1448 }
            q7.s2 r11 = r8.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r11 = r11.p()     // Catch:{ all -> 0x1448 }
            q7.r2 r12 = q7.s2.r(r9)     // Catch:{ all -> 0x1448 }
            q7.n2 r8 = r8.s()     // Catch:{ all -> 0x1448 }
            java.lang.String r8 = r8.d(r10)     // Catch:{ all -> 0x1448 }
            java.lang.String r10 = "Event aggregate wasn't created during raw event logging. appId, event"
            r11.d(r12, r8, r10)     // Catch:{ all -> 0x1448 }
            q7.p r8 = new q7.p     // Catch:{ all -> 0x1448 }
            java.lang.String r55 = r6.A()     // Catch:{ all -> 0x1448 }
            r56 = 1
            r58 = 1
            r60 = 1
            long r62 = r6.w()     // Catch:{ all -> 0x1448 }
            r64 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r53 = r8
            r54 = r9
            r53.<init>(r54, r55, r56, r58, r60, r62, r64, r66, r67, r68, r69)     // Catch:{ all -> 0x1448 }
            r18 = r1
            r19 = r2
            r17 = r5
            goto L_0x0fa7
        L_0x0f6a:
            q7.p r8 = new q7.p     // Catch:{ all -> 0x1448 }
            java.lang.String r6 = r11.f13253a     // Catch:{ all -> 0x1448 }
            java.lang.String r9 = r11.f13254b     // Catch:{ all -> 0x1448 }
            long r14 = r11.f13255c     // Catch:{ all -> 0x1448 }
            r17 = 1
            long r73 = r14 + r17
            long r14 = r11.f13256d     // Catch:{ all -> 0x1448 }
            long r75 = r14 + r17
            long r14 = r11.f13257e     // Catch:{ all -> 0x1448 }
            long r77 = r14 + r17
            long r14 = r11.f13258f     // Catch:{ all -> 0x1448 }
            r12 = r1
            r10 = r2
            long r1 = r11.f13259g     // Catch:{ all -> 0x1448 }
            r17 = r5
            java.lang.Long r5 = r11.f13260h     // Catch:{ all -> 0x1448 }
            r18 = r12
            java.lang.Long r12 = r11.f13261i     // Catch:{ all -> 0x1448 }
            r19 = r10
            java.lang.Long r10 = r11.f13262j     // Catch:{ all -> 0x1448 }
            java.lang.Boolean r11 = r11.f13263k     // Catch:{ all -> 0x1448 }
            r70 = r8
            r71 = r6
            r72 = r9
            r79 = r14
            r81 = r1
            r83 = r5
            r84 = r12
            r85 = r10
            r86 = r11
            r70.<init>(r71, r72, r73, r75, r77, r79, r81, r83, r84, r85, r86)     // Catch:{ all -> 0x1448 }
        L_0x0fa7:
            q7.k r1 = r13.L()     // Catch:{ all -> 0x1448 }
            r1.p(r8)     // Catch:{ all -> 0x1448 }
            long r1 = r8.f13255c     // Catch:{ all -> 0x1448 }
            java.lang.String r5 = r7.A()     // Catch:{ all -> 0x1448 }
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x1448 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x1448 }
            if (r6 != 0) goto L_0x10d8
            q7.k r6 = r13.L()     // Catch:{ all -> 0x1448 }
            q7.k4 r9 = r6.f13121a     // Catch:{ all -> 0x1448 }
            java.lang.String r10 = r3.f12908d     // Catch:{ all -> 0x1448 }
            r6.j()     // Catch:{ all -> 0x1448 }
            r6.i()     // Catch:{ all -> 0x1448 }
            u6.q.f(r10)     // Catch:{ all -> 0x1448 }
            u6.q.f(r5)     // Catch:{ all -> 0x1448 }
            o.a r11 = new o.a     // Catch:{ all -> 0x1448 }
            r11.<init>()     // Catch:{ all -> 0x1448 }
            android.database.sqlite.SQLiteDatabase r30 = r6.B()     // Catch:{ all -> 0x1448 }
            java.lang.String r31 = "event_filters"
            r14 = r43
            r12 = r52
            java.lang.String[] r32 = new java.lang.String[]{r12, r14}     // Catch:{ SQLiteException -> 0x109e, all -> 0x10a4 }
            java.lang.String r33 = "app_id=? AND event_name=?"
            r6 = 2
            java.lang.String[] r15 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x1098, all -> 0x10a4 }
            r6 = 0
            r15[r6] = r10     // Catch:{ SQLiteException -> 0x1098, all -> 0x10a4 }
            r6 = 1
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x1098, all -> 0x10a4 }
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r15
            android.database.Cursor r6 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x1098, all -> 0x10a4 }
            boolean r15 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x1092 }
            if (r15 == 0) goto L_0x107c
        L_0x1000:
            r52 = r12
            r15 = 1
            byte[] r12 = r6.getBlob(r15)     // Catch:{ SQLiteException -> 0x1075 }
            com.google.android.gms.internal.measurement.b2 r15 = com.google.android.gms.internal.measurement.c2.v()     // Catch:{ IOException -> 0x1049 }
            com.google.android.gms.internal.measurement.c7 r12 = q7.v6.A(r15, r12)     // Catch:{ IOException -> 0x1049 }
            com.google.android.gms.internal.measurement.b2 r12 = (com.google.android.gms.internal.measurement.b2) r12     // Catch:{ IOException -> 0x1049 }
            com.google.android.gms.internal.measurement.g7 r12 = r12.j()     // Catch:{ IOException -> 0x1049 }
            com.google.android.gms.internal.measurement.c2 r12 = (com.google.android.gms.internal.measurement.c2) r12     // Catch:{ IOException -> 0x1049 }
            r15 = 0
            int r30 = r6.getInt(r15)     // Catch:{ SQLiteException -> 0x1041 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r30)     // Catch:{ SQLiteException -> 0x1041 }
            java.lang.Object r30 = r11.get(r15)     // Catch:{ SQLiteException -> 0x1041 }
            java.util.List r30 = (java.util.List) r30     // Catch:{ SQLiteException -> 0x1041 }
            if (r30 != 0) goto L_0x1033
            r43 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x103f }
            r14.<init>()     // Catch:{ SQLiteException -> 0x103f }
            r11.put(r15, r14)     // Catch:{ SQLiteException -> 0x103f }
            goto L_0x1037
        L_0x1033:
            r43 = r14
            r14 = r30
        L_0x1037:
            r14.add(r12)     // Catch:{ SQLiteException -> 0x103f }
            r30 = r11
            r11 = r48
            goto L_0x1063
        L_0x103f:
            r0 = move-exception
            goto L_0x1044
        L_0x1041:
            r0 = move-exception
            r43 = r14
        L_0x1044:
            r12 = r0
            r11 = r48
            goto L_0x10ae
        L_0x1049:
            r0 = move-exception
            r43 = r14
            r12 = r0
            r14 = r9
            q7.x3 r14 = (q7.x3) r14     // Catch:{ SQLiteException -> 0x1073 }
            q7.s2 r14 = r14.e()     // Catch:{ SQLiteException -> 0x1073 }
            q7.q2 r14 = r14.n()     // Catch:{ SQLiteException -> 0x1073 }
            q7.r2 r15 = q7.s2.r(r10)     // Catch:{ SQLiteException -> 0x1073 }
            r30 = r11
            r11 = r48
            r14.d(r15, r12, r11)     // Catch:{ SQLiteException -> 0x1090 }
        L_0x1063:
            boolean r12 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x1090 }
            if (r12 != 0) goto L_0x106a
            goto L_0x1088
        L_0x106a:
            r48 = r11
            r11 = r30
            r14 = r43
            r12 = r52
            goto L_0x1000
        L_0x1073:
            r0 = move-exception
            goto L_0x1078
        L_0x1075:
            r0 = move-exception
            r43 = r14
        L_0x1078:
            r11 = r48
        L_0x107a:
            r12 = r0
            goto L_0x10ae
        L_0x107c:
            r52 = r12
            r43 = r14
            r11 = r48
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x1090 }
            r30 = r9
        L_0x1088:
            r6.close()     // Catch:{ all -> 0x1448 }
            r6 = r30
            r14 = r47
            goto L_0x10cb
        L_0x1090:
            r0 = move-exception
            goto L_0x107a
        L_0x1092:
            r0 = move-exception
            r52 = r12
            r43 = r14
            goto L_0x1078
        L_0x1098:
            r0 = move-exception
            r52 = r12
            r43 = r14
            goto L_0x10a9
        L_0x109e:
            r0 = move-exception
            r52 = r12
            r43 = r14
            goto L_0x10a9
        L_0x10a4:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x10d2
        L_0x10a8:
            r0 = move-exception
        L_0x10a9:
            r11 = r48
            r6 = r0
            r12 = r6
            r6 = 0
        L_0x10ae:
            q7.x3 r9 = (q7.x3) r9     // Catch:{ all -> 0x10cf }
            q7.s2 r9 = r9.e()     // Catch:{ all -> 0x10cf }
            q7.q2 r9 = r9.n()     // Catch:{ all -> 0x10cf }
            q7.r2 r10 = q7.s2.r(r10)     // Catch:{ all -> 0x10cf }
            r14 = r47
            r9.d(r10, r12, r14)     // Catch:{ all -> 0x10cf }
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x10cf }
            if (r6 == 0) goto L_0x10ca
            r6.close()     // Catch:{ all -> 0x1448 }
        L_0x10ca:
            r6 = r9
        L_0x10cb:
            r4.put(r5, r6)     // Catch:{ all -> 0x1448 }
            goto L_0x10dc
        L_0x10cf:
            r0 = move-exception
            r1 = r0
            r9 = r6
        L_0x10d2:
            if (r9 == 0) goto L_0x10d7
            r9.close()     // Catch:{ all -> 0x1448 }
        L_0x10d7:
            throw r1     // Catch:{ all -> 0x1448 }
        L_0x10d8:
            r14 = r47
            r11 = r48
        L_0x10dc:
            java.util.Set r5 = r6.keySet()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x1448 }
        L_0x10e4:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x1448 }
            if (r9 == 0) goto L_0x11b3
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x1448 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x1448 }
            java.util.HashSet r10 = r3.f12909e     // Catch:{ all -> 0x1448 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1448 }
            boolean r10 = r10.contains(r12)     // Catch:{ all -> 0x1448 }
            if (r10 == 0) goto L_0x1110
            q7.s2 r9 = r51.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r9 = r9.o()     // Catch:{ all -> 0x1448 }
            r10 = r19
            r9.c(r12, r10)     // Catch:{ all -> 0x1448 }
            r19 = r10
            goto L_0x10e4
        L_0x1110:
            r10 = r19
            java.lang.Object r12 = r6.get(r12)     // Catch:{ all -> 0x1448 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x1448 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x1448 }
            r15 = 1
        L_0x111d:
            boolean r19 = r12.hasNext()     // Catch:{ all -> 0x1448 }
            if (r19 == 0) goto L_0x1192
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.c2 r15 = (com.google.android.gms.internal.measurement.c2) r15     // Catch:{ all -> 0x1448 }
            r19 = r4
            q7.h7 r4 = new q7.h7     // Catch:{ all -> 0x1448 }
            r42 = r5
            java.lang.String r5 = r3.f12908d     // Catch:{ all -> 0x1448 }
            r4.<init>(r3, r5, r9, r15)     // Catch:{ all -> 0x1448 }
            java.lang.Long r5 = r3.C     // Catch:{ all -> 0x1448 }
            r44 = r6
            java.lang.Long r6 = r3.D     // Catch:{ all -> 0x1448 }
            int r15 = r15.u()     // Catch:{ all -> 0x1448 }
            r48 = r11
            o.a r11 = r3.B     // Catch:{ all -> 0x1448 }
            r45 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1448 }
            r47 = r10
            r10 = 0
            java.lang.Object r11 = r11.getOrDefault(r12, r10)     // Catch:{ all -> 0x1448 }
            q7.f7 r11 = (q7.f7) r11     // Catch:{ all -> 0x1448 }
            if (r11 != 0) goto L_0x1156
            r37 = 0
            goto L_0x115e
        L_0x1156:
            java.util.BitSet r10 = r11.f13010d     // Catch:{ all -> 0x1448 }
            boolean r10 = r10.get(r15)     // Catch:{ all -> 0x1448 }
            r37 = r10
        L_0x115e:
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r1
            r36 = r8
            boolean r15 = r30.g(r31, r32, r33, r34, r36, r37)     // Catch:{ all -> 0x1448 }
            if (r15 == 0) goto L_0x1188
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1448 }
            q7.f7 r5 = r3.m(r5)     // Catch:{ all -> 0x1448 }
            r5.b(r4)     // Catch:{ all -> 0x1448 }
            r4 = r19
            r5 = r42
            r6 = r44
            r12 = r45
            r10 = r47
            r11 = r48
            goto L_0x111d
        L_0x1188:
            java.util.HashSet r4 = r3.f12909e     // Catch:{ all -> 0x1448 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1448 }
            r4.add(r5)     // Catch:{ all -> 0x1448 }
            goto L_0x119c
        L_0x1192:
            r19 = r4
            r42 = r5
            r44 = r6
            r47 = r10
            r48 = r11
        L_0x119c:
            if (r15 != 0) goto L_0x11a7
            java.util.HashSet r4 = r3.f12909e     // Catch:{ all -> 0x1448 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1448 }
            r4.add(r5)     // Catch:{ all -> 0x1448 }
        L_0x11a7:
            r4 = r19
            r5 = r42
            r6 = r44
            r19 = r47
            r11 = r48
            goto L_0x10e4
        L_0x11b3:
            r47 = r19
            r48 = r11
            r5 = r17
            r1 = r18
            r2 = r47
            r47 = r14
            goto L_0x0efd
        L_0x11c1:
            boolean r1 = r41.isEmpty()     // Catch:{ all -> 0x1870 }
            if (r1 == 0) goto L_0x11cd
        L_0x11c7:
            r11 = r43
            r10 = r52
            goto L_0x144b
        L_0x11cd:
            o.a r1 = new o.a     // Catch:{ all -> 0x1870 }
            r1.<init>()     // Catch:{ all -> 0x1870 }
            java.util.Iterator r2 = r41.iterator()     // Catch:{ all -> 0x1870 }
        L_0x11d6:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x1870 }
            if (r4 == 0) goto L_0x11c7
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.x3 r4 = (com.google.android.gms.internal.measurement.x3) r4     // Catch:{ all -> 0x1448 }
            java.lang.String r5 = r4.y()     // Catch:{ all -> 0x1448 }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x1448 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x1448 }
            if (r6 != 0) goto L_0x12df
            q7.k r6 = r13.L()     // Catch:{ all -> 0x1448 }
            q7.k4 r7 = r6.f13121a     // Catch:{ all -> 0x1448 }
            java.lang.String r8 = r3.f12908d     // Catch:{ all -> 0x1448 }
            r6.j()     // Catch:{ all -> 0x1448 }
            r6.i()     // Catch:{ all -> 0x1448 }
            u6.q.f(r8)     // Catch:{ all -> 0x1448 }
            u6.q.f(r5)     // Catch:{ all -> 0x1448 }
            o.a r9 = new o.a     // Catch:{ all -> 0x1448 }
            r9.<init>()     // Catch:{ all -> 0x1448 }
            android.database.sqlite.SQLiteDatabase r30 = r6.B()     // Catch:{ all -> 0x1448 }
            java.lang.String r31 = "property_filters"
            r11 = r43
            r10 = r52
            java.lang.String[] r32 = new java.lang.String[]{r10, r11}     // Catch:{ SQLiteException -> 0x12a6, all -> 0x12aa }
            java.lang.String r33 = "app_id=? AND property_name=?"
            r6 = 2
            java.lang.String[] r12 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x12a6, all -> 0x12aa }
            r6 = 0
            r12[r6] = r8     // Catch:{ SQLiteException -> 0x12a6, all -> 0x12aa }
            r6 = 1
            r12[r6] = r5     // Catch:{ SQLiteException -> 0x12a6, all -> 0x12aa }
            r35 = 0
            r36 = 0
            r37 = 0
            r34 = r12
            android.database.Cursor r6 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x12a6, all -> 0x12aa }
            boolean r12 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x12a2 }
            if (r12 == 0) goto L_0x1298
        L_0x1232:
            r12 = 1
            byte[] r15 = r6.getBlob(r12)     // Catch:{ SQLiteException -> 0x12a2 }
            com.google.android.gms.internal.measurement.j2 r12 = com.google.android.gms.internal.measurement.k2.v()     // Catch:{ IOException -> 0x126d }
            com.google.android.gms.internal.measurement.c7 r12 = q7.v6.A(r12, r15)     // Catch:{ IOException -> 0x126d }
            com.google.android.gms.internal.measurement.j2 r12 = (com.google.android.gms.internal.measurement.j2) r12     // Catch:{ IOException -> 0x126d }
            com.google.android.gms.internal.measurement.g7 r12 = r12.j()     // Catch:{ IOException -> 0x126d }
            com.google.android.gms.internal.measurement.k2 r12 = (com.google.android.gms.internal.measurement.k2) r12     // Catch:{ IOException -> 0x126d }
            r15 = 0
            int r17 = r6.getInt(r15)     // Catch:{ SQLiteException -> 0x12a2 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x12a2 }
            java.lang.Object r17 = r9.get(r15)     // Catch:{ SQLiteException -> 0x12a2 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x12a2 }
            if (r17 != 0) goto L_0x1263
            r18 = r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x129f }
            r2.<init>()     // Catch:{ SQLiteException -> 0x129f }
            r9.put(r15, r2)     // Catch:{ SQLiteException -> 0x129f }
            goto L_0x1267
        L_0x1263:
            r18 = r2
            r2 = r17
        L_0x1267:
            r2.add(r12)     // Catch:{ SQLiteException -> 0x129f }
            r17 = r9
            goto L_0x1287
        L_0x126d:
            r0 = move-exception
            r18 = r2
            r2 = r0
            r12 = r7
            q7.x3 r12 = (q7.x3) r12     // Catch:{ SQLiteException -> 0x129f }
            q7.s2 r12 = r12.e()     // Catch:{ SQLiteException -> 0x129f }
            q7.q2 r12 = r12.n()     // Catch:{ SQLiteException -> 0x129f }
            java.lang.String r15 = "Failed to merge filter"
            r17 = r9
            q7.r2 r9 = q7.s2.r(r8)     // Catch:{ SQLiteException -> 0x129f }
            r12.d(r9, r2, r15)     // Catch:{ SQLiteException -> 0x129f }
        L_0x1287:
            boolean r2 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x129f }
            if (r2 != 0) goto L_0x1293
            r6.close()     // Catch:{ all -> 0x1448 }
            r6 = r17
            goto L_0x12d2
        L_0x1293:
            r9 = r17
            r2 = r18
            goto L_0x1232
        L_0x1298:
            r18 = r2
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x129f }
            goto L_0x12ce
        L_0x129f:
            r0 = move-exception
        L_0x12a0:
            r2 = r0
            goto L_0x12b7
        L_0x12a2:
            r0 = move-exception
            r18 = r2
            goto L_0x12a0
        L_0x12a6:
            r0 = move-exception
            r18 = r2
            goto L_0x12b5
        L_0x12aa:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x12d9
        L_0x12ae:
            r0 = move-exception
            r18 = r2
            r11 = r43
            r10 = r52
        L_0x12b5:
            r2 = r0
            r6 = 0
        L_0x12b7:
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x12d6 }
            q7.s2 r7 = r7.e()     // Catch:{ all -> 0x12d6 }
            q7.q2 r7 = r7.n()     // Catch:{ all -> 0x12d6 }
            q7.r2 r8 = q7.s2.r(r8)     // Catch:{ all -> 0x12d6 }
            r7.d(r8, r2, r14)     // Catch:{ all -> 0x12d6 }
            java.util.Map r2 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x12d6 }
            if (r6 == 0) goto L_0x12d1
        L_0x12ce:
            r6.close()     // Catch:{ all -> 0x1448 }
        L_0x12d1:
            r6 = r2
        L_0x12d2:
            r1.put(r5, r6)     // Catch:{ all -> 0x1448 }
            goto L_0x12e5
        L_0x12d6:
            r0 = move-exception
            r1 = r0
            r9 = r6
        L_0x12d9:
            if (r9 == 0) goto L_0x12de
            r9.close()     // Catch:{ all -> 0x1448 }
        L_0x12de:
            throw r1     // Catch:{ all -> 0x1448 }
        L_0x12df:
            r18 = r2
            r11 = r43
            r10 = r52
        L_0x12e5:
            java.util.Set r2 = r6.keySet()     // Catch:{ all -> 0x1448 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1448 }
        L_0x12ed:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x1448 }
            if (r5 == 0) goto L_0x143c
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x1448 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x1448 }
            java.util.HashSet r7 = r3.f12909e     // Catch:{ all -> 0x1448 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            boolean r7 = r7.contains(r8)     // Catch:{ all -> 0x1448 }
            if (r7 == 0) goto L_0x131c
            q7.s2 r2 = r51.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r2 = r2.o()     // Catch:{ all -> 0x1448 }
            r7 = r47
            r2.c(r8, r7)     // Catch:{ all -> 0x1448 }
            r17 = r1
            r47 = r7
            goto L_0x143e
        L_0x131c:
            r7 = r47
            java.lang.Object r8 = r6.get(r8)     // Catch:{ all -> 0x1448 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x1448 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x1448 }
            r9 = 1
        L_0x1329:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x1448 }
            if (r12 == 0) goto L_0x1421
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.k2 r9 = (com.google.android.gms.internal.measurement.k2) r9     // Catch:{ all -> 0x1448 }
            q7.s2 r12 = r51.e()     // Catch:{ all -> 0x1448 }
            java.lang.String r12 = r12.v()     // Catch:{ all -> 0x1448 }
            r15 = 2
            boolean r12 = android.util.Log.isLoggable(r12, r15)     // Catch:{ all -> 0x1448 }
            if (r12 == 0) goto L_0x1395
            q7.s2 r12 = r51.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r12 = r12.o()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            boolean r17 = r9.C()     // Catch:{ all -> 0x1448 }
            if (r17 == 0) goto L_0x1367
            int r17 = r9.t()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x1448 }
            r19 = r2
            r87 = r17
            r17 = r1
            r1 = r87
            goto L_0x136c
        L_0x1367:
            r17 = r1
            r19 = r2
            r1 = 0
        L_0x136c:
            q7.n2 r2 = r51.s()     // Catch:{ all -> 0x1448 }
            r30 = r6
            java.lang.String r6 = r9.x()     // Catch:{ all -> 0x1448 }
            java.lang.String r2 = r2.f(r6)     // Catch:{ all -> 0x1448 }
            java.lang.String r6 = "Evaluating filter. audience, filter, property"
            r12.e(r6, r15, r1, r2)     // Catch:{ all -> 0x1448 }
            q7.s2 r1 = r51.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r1 = r1.o()     // Catch:{ all -> 0x1448 }
            q7.v6 r2 = r13.O()     // Catch:{ all -> 0x1448 }
            java.lang.String r2 = r2.C(r9)     // Catch:{ all -> 0x1448 }
            java.lang.String r6 = "Filter definition"
            r1.c(r2, r6)     // Catch:{ all -> 0x1448 }
            goto L_0x139b
        L_0x1395:
            r17 = r1
            r19 = r2
            r30 = r6
        L_0x139b:
            boolean r1 = r9.C()     // Catch:{ all -> 0x1448 }
            if (r1 == 0) goto L_0x13f7
            int r1 = r9.t()     // Catch:{ all -> 0x1448 }
            r2 = 256(0x100, float:3.59E-43)
            if (r1 <= r2) goto L_0x13aa
            goto L_0x13f7
        L_0x13aa:
            q7.j7 r1 = new q7.j7     // Catch:{ all -> 0x1448 }
            java.lang.String r2 = r3.f12908d     // Catch:{ all -> 0x1448 }
            r1.<init>(r3, r2, r5, r9)     // Catch:{ all -> 0x1448 }
            java.lang.Long r2 = r3.C     // Catch:{ all -> 0x1448 }
            java.lang.Long r6 = r3.D     // Catch:{ all -> 0x1448 }
            int r9 = r9.t()     // Catch:{ all -> 0x1448 }
            o.a r12 = r3.B     // Catch:{ all -> 0x1448 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            r47 = r7
            r7 = 0
            java.lang.Object r12 = r12.getOrDefault(r15, r7)     // Catch:{ all -> 0x1448 }
            q7.f7 r12 = (q7.f7) r12     // Catch:{ all -> 0x1448 }
            if (r12 != 0) goto L_0x13cc
            r7 = 0
            goto L_0x13d2
        L_0x13cc:
            java.util.BitSet r7 = r12.f13010d     // Catch:{ all -> 0x1448 }
            boolean r7 = r7.get(r9)     // Catch:{ all -> 0x1448 }
        L_0x13d2:
            boolean r9 = r1.g(r2, r6, r4, r7)     // Catch:{ all -> 0x1448 }
            if (r9 == 0) goto L_0x13ed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            q7.f7 r2 = r3.m(r2)     // Catch:{ all -> 0x1448 }
            r2.b(r1)     // Catch:{ all -> 0x1448 }
            r1 = r17
            r2 = r19
            r6 = r30
            r7 = r47
            goto L_0x1329
        L_0x13ed:
            java.util.HashSet r1 = r3.f12909e     // Catch:{ all -> 0x1448 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            r1.add(r2)     // Catch:{ all -> 0x1448 }
            goto L_0x1429
        L_0x13f7:
            r47 = r7
            q7.s2 r1 = r51.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r1 = r1.p()     // Catch:{ all -> 0x1448 }
            java.lang.String r2 = r3.f12908d     // Catch:{ all -> 0x1448 }
            q7.r2 r2 = q7.s2.r(r2)     // Catch:{ all -> 0x1448 }
            boolean r6 = r9.C()     // Catch:{ all -> 0x1448 }
            if (r6 == 0) goto L_0x1416
            int r6 = r9.t()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x1448 }
            goto L_0x1417
        L_0x1416:
            r6 = 0
        L_0x1417:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x1448 }
            java.lang.String r7 = "Invalid property filter ID. appId, id"
            r1.d(r2, r6, r7)     // Catch:{ all -> 0x1448 }
            goto L_0x142b
        L_0x1421:
            r17 = r1
            r19 = r2
            r30 = r6
            r47 = r7
        L_0x1429:
            if (r9 != 0) goto L_0x1434
        L_0x142b:
            java.util.HashSet r1 = r3.f12909e     // Catch:{ all -> 0x1448 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1448 }
            r1.add(r2)     // Catch:{ all -> 0x1448 }
        L_0x1434:
            r1 = r17
            r2 = r19
            r6 = r30
            goto L_0x12ed
        L_0x143c:
            r17 = r1
        L_0x143e:
            r52 = r10
            r43 = r11
            r1 = r17
            r2 = r18
            goto L_0x11d6
        L_0x1448:
            r0 = move-exception
            goto L_0x181c
        L_0x144b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x1870 }
            r1.<init>()     // Catch:{ all -> 0x1870 }
            o.a r2 = r3.B     // Catch:{ all -> 0x1870 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x1870 }
            java.util.HashSet r4 = r3.f12909e     // Catch:{ all -> 0x1870 }
            o.a$c r2 = (o.a.c) r2     // Catch:{ all -> 0x1870 }
            r2.removeAll(r4)     // Catch:{ all -> 0x1870 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1870 }
        L_0x1461:
            r4 = r2
            o.c r4 = (o.c) r4     // Catch:{ all -> 0x1870 }
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x1870 }
            java.lang.String r6 = "app_id"
            if (r5 == 0) goto L_0x14fc
            java.lang.Object r4 = r4.next()     // Catch:{ all -> 0x1448 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x1448 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x1448 }
            o.a r5 = r3.B     // Catch:{ all -> 0x1448 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1448 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ all -> 0x1448 }
            q7.f7 r5 = (q7.f7) r5     // Catch:{ all -> 0x1448 }
            u6.q.i(r5)     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.b3 r4 = r5.a(r4)     // Catch:{ all -> 0x1448 }
            r1.add(r4)     // Catch:{ all -> 0x1448 }
            q7.k r5 = r13.L()     // Catch:{ all -> 0x1448 }
            q7.k4 r12 = r5.f13121a     // Catch:{ all -> 0x1448 }
            java.lang.String r14 = r3.f12908d     // Catch:{ all -> 0x1448 }
            com.google.android.gms.internal.measurement.t3 r4 = r4.w()     // Catch:{ all -> 0x1448 }
            r5.j()     // Catch:{ all -> 0x1448 }
            r5.i()     // Catch:{ all -> 0x1448 }
            u6.q.f(r14)     // Catch:{ all -> 0x1448 }
            u6.q.i(r4)     // Catch:{ all -> 0x1448 }
            byte[] r4 = r4.e()     // Catch:{ all -> 0x1448 }
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x1448 }
            r15.<init>()     // Catch:{ all -> 0x1448 }
            r15.put(r6, r14)     // Catch:{ all -> 0x1448 }
            r15.put(r10, r9)     // Catch:{ all -> 0x1448 }
            r6 = r46
            r15.put(r6, r4)     // Catch:{ all -> 0x1448 }
            android.database.sqlite.SQLiteDatabase r4 = r5.B()     // Catch:{ SQLiteException -> 0x14e2 }
            java.lang.String r5 = "audience_filter_values"
            r7 = 0
            r9 = 5
            long r4 = r4.insertWithOnConflict(r5, r7, r15, r9)     // Catch:{ SQLiteException -> 0x14df }
            r7 = -1
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x14f8
            r4 = r12
            q7.x3 r4 = (q7.x3) r4     // Catch:{ SQLiteException -> 0x14df }
            q7.s2 r4 = r4.e()     // Catch:{ SQLiteException -> 0x14df }
            q7.q2 r4 = r4.n()     // Catch:{ SQLiteException -> 0x14df }
            java.lang.String r5 = "Failed to insert filter results (got -1). appId"
            q7.r2 r7 = q7.s2.r(r14)     // Catch:{ SQLiteException -> 0x14df }
            r4.c(r7, r5)     // Catch:{ SQLiteException -> 0x14df }
            goto L_0x14f8
        L_0x14df:
            r0 = move-exception
        L_0x14e0:
            r4 = r0
            goto L_0x14e5
        L_0x14e2:
            r0 = move-exception
            r9 = 5
            goto L_0x14e0
        L_0x14e5:
            q7.x3 r12 = (q7.x3) r12     // Catch:{ all -> 0x1448 }
            q7.s2 r5 = r12.e()     // Catch:{ all -> 0x1448 }
            q7.q2 r5 = r5.n()     // Catch:{ all -> 0x1448 }
            q7.r2 r7 = q7.s2.r(r14)     // Catch:{ all -> 0x1448 }
            java.lang.String r8 = "Error storing filter results. appId"
            r5.d(r7, r4, r8)     // Catch:{ all -> 0x1448 }
        L_0x14f8:
            r46 = r6
            goto L_0x1461
        L_0x14fc:
            r40.l()     // Catch:{ all -> 0x1870 }
            r2 = r40
            com.google.android.gms.internal.measurement.g7 r3 = r2.f5179b     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3.k0(r3, r1)     // Catch:{ all -> 0x186b }
            q7.f r1 = r88.J()     // Catch:{ all -> 0x1870 }
            r3 = r16
            com.google.android.gms.internal.measurement.o3 r4 = r3.f13306a     // Catch:{ all -> 0x1870 }
            java.lang.String r4 = r4.K1()     // Catch:{ all -> 0x1870 }
            boolean r1 = r1.u(r4)     // Catch:{ all -> 0x1870 }
            if (r1 == 0) goto L_0x1874
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x1870 }
            r1.<init>()     // Catch:{ all -> 0x1870 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x1870 }
            r4.<init>()     // Catch:{ all -> 0x1870 }
            q7.a7 r5 = r88.P()     // Catch:{ all -> 0x1870 }
            java.security.SecureRandom r5 = r5.r()     // Catch:{ all -> 0x1870 }
            r7 = 0
        L_0x152d:
            com.google.android.gms.internal.measurement.g7 r8 = r2.f5179b     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r8 = (com.google.android.gms.internal.measurement.o3) r8     // Catch:{ all -> 0x1870 }
            int r8 = r8.p1()     // Catch:{ all -> 0x186b }
            if (r7 >= r8) goto L_0x1821
            com.google.android.gms.internal.measurement.g7 r8 = r2.f5179b     // Catch:{ all -> 0x181b }
            com.google.android.gms.internal.measurement.o3 r8 = (com.google.android.gms.internal.measurement.o3) r8     // Catch:{ all -> 0x181b }
            com.google.android.gms.internal.measurement.f3 r8 = r8.F1(r7)     // Catch:{ all -> 0x181b }
            com.google.android.gms.internal.measurement.c7 r8 = r8.j()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.e3 r8 = (com.google.android.gms.internal.measurement.e3) r8     // Catch:{ all -> 0x1870 }
            java.lang.String r9 = r8.q()     // Catch:{ all -> 0x1870 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x1870 }
            java.lang.String r10 = "_efs"
            java.lang.String r12 = "_sr"
            if (r9 == 0) goto L_0x15d4
            H(r39)     // Catch:{ all -> 0x15ce }
            com.google.android.gms.internal.measurement.g7 r9 = r8.j()     // Catch:{ all -> 0x15ce }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x15ce }
            java.lang.String r13 = "_en"
            java.io.Serializable r9 = q7.v6.n(r9, r13)     // Catch:{ all -> 0x15ce }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x15ce }
            java.lang.Object r13 = r1.get(r9)     // Catch:{ all -> 0x15ce }
            q7.p r13 = (q7.p) r13     // Catch:{ all -> 0x15ce }
            if (r13 != 0) goto L_0x1588
            r14 = r88
            q7.k r13 = r14.f13350c     // Catch:{ all -> 0x15f6 }
            H(r13)     // Catch:{ all -> 0x15f6 }
            com.google.android.gms.internal.measurement.o3 r15 = r3.f13306a     // Catch:{ all -> 0x15f6 }
            java.lang.String r15 = r15.K1()     // Catch:{ all -> 0x15f6 }
            u6.q.i(r9)     // Catch:{ all -> 0x15f6 }
            q7.p r13 = r13.G(r15, r9)     // Catch:{ all -> 0x15f6 }
            if (r13 == 0) goto L_0x158a
            r1.put(r9, r13)     // Catch:{ all -> 0x15f6 }
            goto L_0x158a
        L_0x1588:
            r14 = r88
        L_0x158a:
            if (r13 == 0) goto L_0x15c5
            java.lang.Long r9 = r13.f13261i     // Catch:{ all -> 0x15f6 }
            if (r9 != 0) goto L_0x15c5
            java.lang.Long r9 = r13.f13262j     // Catch:{ all -> 0x15f6 }
            if (r9 == 0) goto L_0x15a6
            long r15 = r9.longValue()     // Catch:{ all -> 0x15f6 }
            r19 = 1
            int r9 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r9 <= 0) goto L_0x15a6
            H(r39)     // Catch:{ all -> 0x15f6 }
            java.lang.Long r9 = r13.f13262j     // Catch:{ all -> 0x15f6 }
            q7.v6.L(r8, r12, r9)     // Catch:{ all -> 0x15f6 }
        L_0x15a6:
            java.lang.Boolean r9 = r13.f13263k     // Catch:{ all -> 0x15f6 }
            if (r9 == 0) goto L_0x15bc
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x15f6 }
            if (r9 == 0) goto L_0x15bc
            H(r39)     // Catch:{ all -> 0x15f6 }
            r12 = 1
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x15f6 }
            q7.v6.L(r8, r10, r9)     // Catch:{ all -> 0x15f6 }
        L_0x15bc:
            com.google.android.gms.internal.measurement.g7 r9 = r8.j()     // Catch:{ all -> 0x15f6 }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x15f6 }
            r4.add(r9)     // Catch:{ all -> 0x15f6 }
        L_0x15c5:
            r2.o(r7, r8)     // Catch:{ all -> 0x15f6 }
            r16 = r6
            r43 = r11
            goto L_0x1760
        L_0x15ce:
            r0 = move-exception
            r14 = r88
        L_0x15d1:
            r2 = r0
            goto L_0x16b3
        L_0x15d4:
            r14 = r88
            H(r38)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r9 = r3.f13306a     // Catch:{ all -> 0x1870 }
            java.lang.String r9 = r9.K1()     // Catch:{ all -> 0x1870 }
            java.lang.String r13 = "measurement.account.time_zone_offset_minutes"
            r15 = r38
            java.lang.String r13 = r15.f(r9, r13)     // Catch:{ all -> 0x1870 }
            boolean r16 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x1870 }
            if (r16 != 0) goto L_0x1617
            long r19 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x15f8 }
            r16 = r6
            r43 = r11
            goto L_0x161d
        L_0x15f6:
            r0 = move-exception
            goto L_0x15d1
        L_0x15f8:
            r0 = move-exception
            r13 = r0
            r43 = r11
            q7.k4 r11 = r15.f13121a     // Catch:{ all -> 0x1614 }
            q7.x3 r11 = (q7.x3) r11     // Catch:{ all -> 0x1614 }
            q7.s2 r11 = r11.e()     // Catch:{ all -> 0x15f6 }
            q7.q2 r11 = r11.p()     // Catch:{ all -> 0x15f6 }
            r16 = r6
            java.lang.String r6 = "Unable to parse timezone offset. appId"
            q7.r2 r9 = q7.s2.r(r9)     // Catch:{ all -> 0x15f6 }
            r11.d(r9, r13, r6)     // Catch:{ all -> 0x15f6 }
            goto L_0x161b
        L_0x1614:
            r0 = move-exception
            goto L_0x0589
        L_0x1617:
            r16 = r6
            r43 = r11
        L_0x161b:
            r19 = 0
        L_0x161d:
            r88.P()     // Catch:{ all -> 0x1870 }
            long r30 = r8.n()     // Catch:{ all -> 0x1870 }
            r32 = 60000(0xea60, double:2.9644E-319)
            long r19 = r19 * r32
            long r30 = r19 + r30
            r6 = r10
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r30 / r28
            com.google.android.gms.internal.measurement.g7 r11 = r8.j()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r11 = (com.google.android.gms.internal.measurement.f3) r11     // Catch:{ all -> 0x1870 }
            r21 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x1870 }
            r30 = r6
            java.lang.String r6 = "_dbg"
            boolean r31 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x1870 }
            if (r31 != 0) goto L_0x167b
            java.util.List r11 = r11.B()     // Catch:{ all -> 0x15f6 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x15f6 }
        L_0x164f:
            boolean r31 = r11.hasNext()     // Catch:{ all -> 0x15f6 }
            if (r31 == 0) goto L_0x167b
            java.lang.Object r31 = r11.next()     // Catch:{ all -> 0x15f6 }
            com.google.android.gms.internal.measurement.j3 r31 = (com.google.android.gms.internal.measurement.j3) r31     // Catch:{ all -> 0x15f6 }
            r32 = r11
            java.lang.String r11 = r31.z()     // Catch:{ all -> 0x15f6 }
            boolean r11 = r6.equals(r11)     // Catch:{ all -> 0x15f6 }
            if (r11 == 0) goto L_0x1678
            long r31 = r31.w()     // Catch:{ all -> 0x15f6 }
            java.lang.Long r6 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x15f6 }
            boolean r6 = r13.equals(r6)     // Catch:{ all -> 0x15f6 }
            if (r6 != 0) goto L_0x1676
            goto L_0x167b
        L_0x1676:
            r6 = 1
            goto L_0x168c
        L_0x1678:
            r11 = r32
            goto L_0x164f
        L_0x167b:
            H(r15)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r6 = r3.f13306a     // Catch:{ all -> 0x1870 }
            java.lang.String r6 = r6.K1()     // Catch:{ all -> 0x1870 }
            java.lang.String r11 = r8.q()     // Catch:{ all -> 0x1870 }
            int r6 = r15.r(r6, r11)     // Catch:{ all -> 0x1870 }
        L_0x168c:
            if (r6 > 0) goto L_0x16b7
            q7.s2 r9 = r88.e()     // Catch:{ all -> 0x15f6 }
            q7.q2 r9 = r9.p()     // Catch:{ all -> 0x15f6 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.q()     // Catch:{ all -> 0x15f6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x15f6 }
            r9.d(r11, r6, r10)     // Catch:{ all -> 0x15f6 }
            com.google.android.gms.internal.measurement.g7 r6 = r8.j()     // Catch:{ all -> 0x15f6 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x15f6 }
            r4.add(r6)     // Catch:{ all -> 0x15f6 }
            r2.o(r7, r8)     // Catch:{ all -> 0x15f6 }
            r38 = r15
            goto L_0x1760
        L_0x16b3:
            r1 = r2
        L_0x16b4:
            r5 = r14
            goto L_0x1be4
        L_0x16b7:
            java.lang.String r11 = r8.q()     // Catch:{ all -> 0x1870 }
            java.lang.Object r11 = r1.get(r11)     // Catch:{ all -> 0x1870 }
            q7.p r11 = (q7.p) r11     // Catch:{ all -> 0x1870 }
            if (r11 != 0) goto L_0x1717
            q7.k r11 = r14.f13350c     // Catch:{ all -> 0x1870 }
            H(r11)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r13 = r3.f13306a     // Catch:{ all -> 0x1870 }
            java.lang.String r13 = r13.K1()     // Catch:{ all -> 0x1870 }
            r38 = r15
            java.lang.String r15 = r8.q()     // Catch:{ all -> 0x1870 }
            q7.p r11 = r11.G(r13, r15)     // Catch:{ all -> 0x1870 }
            if (r11 != 0) goto L_0x1719
            q7.s2 r11 = r88.e()     // Catch:{ all -> 0x1870 }
            q7.q2 r11 = r11.p()     // Catch:{ all -> 0x1870 }
            java.lang.String r13 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.o3 r15 = r3.f13306a     // Catch:{ all -> 0x1870 }
            java.lang.String r15 = r15.K1()     // Catch:{ all -> 0x1870 }
            java.lang.String r14 = r8.q()     // Catch:{ all -> 0x1870 }
            r11.d(r15, r14, r13)     // Catch:{ all -> 0x1870 }
            q7.p r11 = new q7.p     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r13 = r3.f13306a     // Catch:{ all -> 0x1870 }
            java.lang.String r50 = r13.K1()     // Catch:{ all -> 0x1870 }
            java.lang.String r51 = r8.q()     // Catch:{ all -> 0x1870 }
            r52 = 1
            r54 = 1
            r56 = 1
            long r58 = r8.n()     // Catch:{ all -> 0x1870 }
            r60 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r49 = r11
            r49.<init>(r50, r51, r52, r54, r56, r58, r60, r62, r63, r64, r65)     // Catch:{ all -> 0x1870 }
            goto L_0x1719
        L_0x1717:
            r38 = r15
        L_0x1719:
            H(r39)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.g7 r13 = r8.j()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r13 = (com.google.android.gms.internal.measurement.f3) r13     // Catch:{ all -> 0x1870 }
            java.lang.String r14 = "_eid"
            java.io.Serializable r13 = q7.v6.n(r13, r14)     // Catch:{ all -> 0x1870 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x1870 }
            if (r13 == 0) goto L_0x172e
            r14 = 1
            goto L_0x172f
        L_0x172e:
            r14 = 0
        L_0x172f:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x1870 }
            r15 = 1
            if (r6 != r15) goto L_0x1766
            com.google.android.gms.internal.measurement.g7 r6 = r8.j()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x1870 }
            r4.add(r6)     // Catch:{ all -> 0x1870 }
            boolean r6 = r14.booleanValue()     // Catch:{ all -> 0x1870 }
            if (r6 == 0) goto L_0x175d
            java.lang.Long r6 = r11.f13261i     // Catch:{ all -> 0x1870 }
            if (r6 != 0) goto L_0x1751
            java.lang.Long r6 = r11.f13262j     // Catch:{ all -> 0x1870 }
            if (r6 != 0) goto L_0x1751
            java.lang.Boolean r6 = r11.f13263k     // Catch:{ all -> 0x1870 }
            if (r6 == 0) goto L_0x175d
        L_0x1751:
            r6 = 0
            q7.p r9 = r11.a(r6, r6, r6)     // Catch:{ all -> 0x1870 }
            java.lang.String r6 = r8.q()     // Catch:{ all -> 0x1870 }
            r1.put(r6, r9)     // Catch:{ all -> 0x1870 }
        L_0x175d:
            r2.o(r7, r8)     // Catch:{ all -> 0x1870 }
        L_0x1760:
            r15 = r5
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x1812
        L_0x1766:
            int r15 = r5.nextInt(r6)     // Catch:{ all -> 0x1870 }
            if (r15 != 0) goto L_0x179f
            H(r39)     // Catch:{ all -> 0x1870 }
            r15 = r5
            long r5 = (long) r6     // Catch:{ all -> 0x1870 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x1870 }
            q7.v6.L(r8, r12, r5)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.g7 r6 = r8.j()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x1870 }
            r4.add(r6)     // Catch:{ all -> 0x1870 }
            boolean r6 = r14.booleanValue()     // Catch:{ all -> 0x1870 }
            if (r6 == 0) goto L_0x178c
            r6 = 0
            q7.p r11 = r11.a(r6, r5, r6)     // Catch:{ all -> 0x1870 }
        L_0x178c:
            java.lang.String r5 = r8.q()     // Catch:{ all -> 0x1870 }
            long r12 = r8.n()     // Catch:{ all -> 0x1870 }
            q7.p r6 = r11.b(r12, r9)     // Catch:{ all -> 0x1870 }
            r1.put(r5, r6)     // Catch:{ all -> 0x1870 }
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x180f
        L_0x179f:
            r15 = r5
            java.lang.Long r5 = r11.f13260h     // Catch:{ all -> 0x1870 }
            if (r5 == 0) goto L_0x17ac
            long r19 = r5.longValue()     // Catch:{ all -> 0x1870 }
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x17ba
        L_0x17ac:
            r88.P()     // Catch:{ all -> 0x1870 }
            long r31 = r8.m()     // Catch:{ all -> 0x1870 }
            long r19 = r19 + r31
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            long r19 = r19 / r28
        L_0x17ba:
            int r5 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x17fd
            H(r39)     // Catch:{ all -> 0x1870 }
            r19 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x1870 }
            r13 = r30
            q7.v6.L(r8, r13, r5)     // Catch:{ all -> 0x1870 }
            H(r39)     // Catch:{ all -> 0x1870 }
            long r5 = (long) r6     // Catch:{ all -> 0x1870 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x1870 }
            q7.v6.L(r8, r12, r5)     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.g7 r6 = r8.j()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ all -> 0x1870 }
            r4.add(r6)     // Catch:{ all -> 0x1870 }
            boolean r6 = r14.booleanValue()     // Catch:{ all -> 0x1870 }
            if (r6 == 0) goto L_0x17ed
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x1870 }
            r12 = 0
            q7.p r11 = r11.a(r12, r5, r6)     // Catch:{ all -> 0x1870 }
        L_0x17ed:
            java.lang.String r5 = r8.q()     // Catch:{ all -> 0x1870 }
            long r12 = r8.n()     // Catch:{ all -> 0x1870 }
            q7.p r6 = r11.b(r12, r9)     // Catch:{ all -> 0x1870 }
            r1.put(r5, r6)     // Catch:{ all -> 0x1870 }
            goto L_0x180f
        L_0x17fd:
            boolean r5 = r14.booleanValue()     // Catch:{ all -> 0x1870 }
            if (r5 == 0) goto L_0x180f
            java.lang.String r5 = r8.q()     // Catch:{ all -> 0x1870 }
            r6 = 0
            q7.p r9 = r11.a(r13, r6, r6)     // Catch:{ all -> 0x1870 }
            r1.put(r5, r9)     // Catch:{ all -> 0x1870 }
        L_0x180f:
            r2.o(r7, r8)     // Catch:{ all -> 0x1870 }
        L_0x1812:
            int r7 = r7 + 1
            r5 = r15
            r6 = r16
            r11 = r43
            goto L_0x152d
        L_0x181b:
            r0 = move-exception
        L_0x181c:
            r1 = r0
            r5 = r88
            goto L_0x1be4
        L_0x1821:
            r16 = r6
            r43 = r11
            int r5 = r4.size()     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.g7 r6 = r2.f5179b     // Catch:{ all -> 0x1870 }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x1870 }
            int r6 = r6.p1()     // Catch:{ all -> 0x186b }
            if (r5 >= r6) goto L_0x1843
            r2.l()     // Catch:{ all -> 0x1841 }
            com.google.android.gms.internal.measurement.g7 r5 = r2.f5179b     // Catch:{ all -> 0x1841 }
            com.google.android.gms.internal.measurement.o3 r5 = (com.google.android.gms.internal.measurement.o3) r5     // Catch:{ all -> 0x1841 }
            com.google.android.gms.internal.measurement.o3.x0(r5)     // Catch:{ all -> 0x1841 }
            r2.u(r4)     // Catch:{ all -> 0x1870 }
            goto L_0x1843
        L_0x1841:
            r0 = move-exception
            goto L_0x181c
        L_0x1843:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x1870 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x1870 }
        L_0x184b:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x1870 }
            if (r4 == 0) goto L_0x1868
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x1870 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x1870 }
            r5 = r88
            q7.k r6 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r6)     // Catch:{ all -> 0x18cb }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x18cb }
            q7.p r4 = (q7.p) r4     // Catch:{ all -> 0x18cb }
            r6.p(r4)     // Catch:{ all -> 0x18cb }
            goto L_0x184b
        L_0x1868:
            r5 = r88
            goto L_0x187a
        L_0x186b:
            r0 = move-exception
            goto L_0x1871
        L_0x186d:
            r1 = r0
            goto L_0x1be4
        L_0x1870:
            r0 = move-exception
        L_0x1871:
            r5 = r88
            goto L_0x186d
        L_0x1874:
            r5 = r88
            r16 = r6
            r43 = r11
        L_0x187a:
            com.google.android.gms.internal.measurement.o3 r1 = r3.f13306a     // Catch:{ all -> 0x18cb }
            java.lang.String r1 = r1.K1()     // Catch:{ all -> 0x18cb }
            q7.k r4 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r4)     // Catch:{ all -> 0x18cb }
            q7.l4 r4 = r4.C(r1)     // Catch:{ all -> 0x18cb }
            if (r4 != 0) goto L_0x18a4
            q7.s2 r4 = r88.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r4 = r4.n()     // Catch:{ all -> 0x18cb }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.o3 r7 = r3.f13306a     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = r7.K1()     // Catch:{ all -> 0x18cb }
            q7.r2 r7 = q7.s2.r(r7)     // Catch:{ all -> 0x18cb }
            r4.c(r7, r6)     // Catch:{ all -> 0x18cb }
            goto L_0x1962
        L_0x18a4:
            q7.x3 r6 = r4.f13162a
            com.google.android.gms.internal.measurement.g7 r7 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x18cb }
            int r7 = r7.p1()     // Catch:{ all -> 0x18cb }
            if (r7 <= 0) goto L_0x1962
            q7.w3 r7 = r6.F     // Catch:{ all -> 0x18cb }
            q7.x3.l(r7)     // Catch:{ all -> 0x18cb }
            r7.i()     // Catch:{ all -> 0x18cb }
            long r7 = r4.f13170i     // Catch:{ all -> 0x18cb }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x18cd
            r2.l()     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r9 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3.J0(r9, r7)     // Catch:{ all -> 0x18cb }
            goto L_0x18d0
        L_0x18cb:
            r0 = move-exception
            goto L_0x186d
        L_0x18cd:
            r2.A()     // Catch:{ all -> 0x18cb }
        L_0x18d0:
            q7.w3 r9 = r6.F     // Catch:{ all -> 0x18cb }
            q7.x3.l(r9)     // Catch:{ all -> 0x18cb }
            r9.i()     // Catch:{ all -> 0x18cb }
            long r9 = r4.f13169h     // Catch:{ all -> 0x18cb }
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x18e1
            goto L_0x18e2
        L_0x18e1:
            r7 = r9
        L_0x18e2:
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x18f1
            r2.l()     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r9 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3.H0(r9, r7)     // Catch:{ all -> 0x18cb }
            goto L_0x18f4
        L_0x18f1:
            r2.B()     // Catch:{ all -> 0x18cb }
        L_0x18f4:
            q7.w3 r7 = r6.F     // Catch:{ all -> 0x18cb }
            q7.x3.l(r7)     // Catch:{ all -> 0x18cb }
            r7.i()     // Catch:{ all -> 0x18cb }
            long r7 = r4.f13168g     // Catch:{ all -> 0x18cb }
            r9 = 1
            long r7 = r7 + r9
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x191c
            q7.s2 r7 = r6.E     // Catch:{ all -> 0x18cb }
            q7.x3.l(r7)     // Catch:{ all -> 0x18cb }
            java.lang.String r8 = r4.f13163b     // Catch:{ all -> 0x18cb }
            q7.r2 r8 = q7.s2.r(r8)     // Catch:{ all -> 0x18cb }
            java.lang.String r9 = "Bundle index overflow. appId"
            q7.q2 r7 = r7.E     // Catch:{ all -> 0x18cb }
            r7.c(r8, r9)     // Catch:{ all -> 0x18cb }
            r9 = r11
            goto L_0x191d
        L_0x191c:
            r9 = r7
        L_0x191d:
            r7 = 1
            r4.E = r7     // Catch:{ all -> 0x18cb }
            r4.f13168g = r9     // Catch:{ all -> 0x18cb }
            q7.w3 r6 = r6.F     // Catch:{ all -> 0x18cb }
            q7.x3.l(r6)     // Catch:{ all -> 0x18cb }
            r6.i()     // Catch:{ all -> 0x18cb }
            long r6 = r4.f13168g     // Catch:{ all -> 0x18cb }
            int r6 = (int) r6     // Catch:{ all -> 0x18cb }
            r2.l()     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r7 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r7 = (com.google.android.gms.internal.measurement.o3) r7     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3.f0(r7, r6)     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r6 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x18cb }
            long r6 = r6.B1()     // Catch:{ all -> 0x18cb }
            r4.u(r6)     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r6 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x18cb }
            long r6 = r6.x1()     // Catch:{ all -> 0x18cb }
            r4.s(r6)     // Catch:{ all -> 0x18cb }
            java.lang.String r6 = r4.D()     // Catch:{ all -> 0x18cb }
            if (r6 == 0) goto L_0x1957
            r2.p(r6)     // Catch:{ all -> 0x18cb }
            goto L_0x195a
        L_0x1957:
            r2.y()     // Catch:{ all -> 0x18cb }
        L_0x195a:
            q7.k r6 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r6)     // Catch:{ all -> 0x18cb }
            r6.o(r4)     // Catch:{ all -> 0x18cb }
        L_0x1962:
            com.google.android.gms.internal.measurement.g7 r4 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x18cb }
            int r4 = r4.p1()     // Catch:{ all -> 0x18cb }
            if (r4 <= 0) goto L_0x1b15
            r25.getClass()     // Catch:{ all -> 0x18cb }
            H(r38)     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r4 = r3.f13306a     // Catch:{ all -> 0x18cb }
            java.lang.String r4 = r4.K1()     // Catch:{ all -> 0x18cb }
            r6 = r38
            com.google.android.gms.internal.measurement.t2 r4 = r6.s(r4)     // Catch:{ all -> 0x18cb }
            if (r4 == 0) goto L_0x1996
            boolean r6 = r4.M()     // Catch:{ all -> 0x18cb }
            if (r6 != 0) goto L_0x1987
            goto L_0x1996
        L_0x1987:
            long r6 = r4.v()     // Catch:{ all -> 0x18cb }
            r2.l()     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r4 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3.q0(r4, r6)     // Catch:{ all -> 0x18cb }
            goto L_0x19c6
        L_0x1996:
            com.google.android.gms.internal.measurement.o3 r4 = r3.f13306a     // Catch:{ all -> 0x18cb }
            java.lang.String r4 = r4.z()     // Catch:{ all -> 0x18cb }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x18cb }
            if (r4 == 0) goto L_0x19af
            r2.l()     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.g7 r4 = r2.f5179b     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x18cb }
            r6 = -1
            com.google.android.gms.internal.measurement.o3.q0(r4, r6)     // Catch:{ all -> 0x18cb }
            goto L_0x19c6
        L_0x19af:
            q7.s2 r4 = r88.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r4 = r4.p()     // Catch:{ all -> 0x18cb }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.o3 r7 = r3.f13306a     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = r7.K1()     // Catch:{ all -> 0x18cb }
            q7.r2 r7 = q7.s2.r(r7)     // Catch:{ all -> 0x18cb }
            r4.c(r7, r6)     // Catch:{ all -> 0x18cb }
        L_0x19c6:
            q7.k r4 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r4)     // Catch:{ all -> 0x18cb }
            q7.k4 r6 = r4.f13121a
            com.google.android.gms.internal.measurement.g7 r2 = r2.j()     // Catch:{ all -> 0x18cb }
            com.google.android.gms.internal.measurement.o3 r2 = (com.google.android.gms.internal.measurement.o3) r2     // Catch:{ all -> 0x18cb }
            r4.i()     // Catch:{ all -> 0x18cb }
            r4.j()     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = r2.K1()     // Catch:{ all -> 0x18cb }
            u6.q.f(r7)     // Catch:{ all -> 0x18cb }
            boolean r7 = r2.b1()     // Catch:{ all -> 0x18cb }
            if (r7 == 0) goto L_0x1b0f
            r4.R()     // Catch:{ all -> 0x18cb }
            r7 = r6
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x18cb }
            z6.b r7 = r7.a()     // Catch:{ all -> 0x18cb }
            ag.m r7 = (ag.m) r7     // Catch:{ all -> 0x18cb }
            long r7 = r7.b()     // Catch:{ all -> 0x18cb }
            long r9 = r2.x1()     // Catch:{ all -> 0x18cb }
            r11 = r6
            q7.x3 r11 = (q7.x3) r11     // Catch:{ all -> 0x18cb }
            r11.getClass()     // Catch:{ all -> 0x18cb }
            q7.f2 r11 = q7.g2.E     // Catch:{ all -> 0x18cb }
            r12 = 0
            java.lang.Object r13 = r11.a(r12)     // Catch:{ all -> 0x18cb }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x18cb }
            long r12 = r13.longValue()     // Catch:{ all -> 0x18cb }
            long r12 = r7 - r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x1a2d
            long r9 = r2.x1()     // Catch:{ all -> 0x18cb }
            r12 = r6
            q7.x3 r12 = (q7.x3) r12     // Catch:{ all -> 0x18cb }
            r12.getClass()     // Catch:{ all -> 0x18cb }
            r12 = 0
            java.lang.Object r11 = r11.a(r12)     // Catch:{ all -> 0x18cb }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x18cb }
            long r11 = r11.longValue()     // Catch:{ all -> 0x18cb }
            long r11 = r11 + r7
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x1a51
        L_0x1a2d:
            r9 = r6
            q7.x3 r9 = (q7.x3) r9     // Catch:{ all -> 0x18cb }
            q7.s2 r9 = r9.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r9 = r9.p()     // Catch:{ all -> 0x18cb }
            java.lang.String r10 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r11 = r2.K1()     // Catch:{ all -> 0x18cb }
            q7.r2 r11 = q7.s2.r(r11)     // Catch:{ all -> 0x18cb }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x18cb }
            long r12 = r2.x1()     // Catch:{ all -> 0x18cb }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x18cb }
            r9.e(r10, r11, r7, r8)     // Catch:{ all -> 0x18cb }
        L_0x1a51:
            byte[] r7 = r2.e()     // Catch:{ all -> 0x18cb }
            q7.t6 r8 = r4.f13208b     // Catch:{ IOException -> 0x1af5 }
            q7.v6 r8 = r8.C     // Catch:{ IOException -> 0x1af5 }
            H(r8)     // Catch:{ IOException -> 0x1af5 }
            byte[] r7 = r8.K(r7)     // Catch:{ IOException -> 0x1af5 }
            r8 = r6
            q7.x3 r8 = (q7.x3) r8     // Catch:{ all -> 0x18cb }
            q7.s2 r8 = r8.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r8 = r8.o()     // Catch:{ all -> 0x18cb }
            java.lang.String r9 = "Saving bundle, size"
            int r10 = r7.length     // Catch:{ all -> 0x18cb }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x18cb }
            r8.c(r10, r9)     // Catch:{ all -> 0x18cb }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x18cb }
            r8.<init>()     // Catch:{ all -> 0x18cb }
            java.lang.String r9 = r2.K1()     // Catch:{ all -> 0x18cb }
            r10 = r16
            r8.put(r10, r9)     // Catch:{ all -> 0x18cb }
            java.lang.String r9 = "bundle_end_timestamp"
            long r10 = r2.x1()     // Catch:{ all -> 0x18cb }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x18cb }
            r8.put(r9, r10)     // Catch:{ all -> 0x18cb }
            r9 = r43
            r8.put(r9, r7)     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = "has_realtime"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x18cb }
            r8.put(r7, r9)     // Catch:{ all -> 0x18cb }
            boolean r7 = r2.h1()     // Catch:{ all -> 0x18cb }
            if (r7 == 0) goto L_0x1ab1
            java.lang.String r7 = "retry_count"
            int r9 = r2.r1()     // Catch:{ all -> 0x18cb }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x18cb }
            r8.put(r7, r9)     // Catch:{ all -> 0x18cb }
        L_0x1ab1:
            android.database.sqlite.SQLiteDatabase r4 = r4.B()     // Catch:{ SQLiteException -> 0x1adb }
            java.lang.String r7 = "queue"
            r9 = 0
            long r7 = r4.insert(r7, r9, r8)     // Catch:{ SQLiteException -> 0x1adb }
            r9 = -1
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x1b15
            r4 = r6
            q7.x3 r4 = (q7.x3) r4     // Catch:{ SQLiteException -> 0x1adb }
            q7.s2 r4 = r4.e()     // Catch:{ SQLiteException -> 0x1adb }
            q7.q2 r4 = r4.n()     // Catch:{ SQLiteException -> 0x1adb }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r2.K1()     // Catch:{ SQLiteException -> 0x1adb }
            q7.r2 r8 = q7.s2.r(r8)     // Catch:{ SQLiteException -> 0x1adb }
            r4.c(r8, r7)     // Catch:{ SQLiteException -> 0x1adb }
            goto L_0x1b15
        L_0x1adb:
            r0 = move-exception
            r4 = r0
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x18cb }
            q7.s2 r6 = r6.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r6 = r6.n()     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r2 = r2.K1()     // Catch:{ all -> 0x18cb }
            q7.r2 r2 = q7.s2.r(r2)     // Catch:{ all -> 0x18cb }
            r6.d(r2, r4, r7)     // Catch:{ all -> 0x18cb }
            goto L_0x1b15
        L_0x1af5:
            r0 = move-exception
            r4 = r0
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x18cb }
            q7.s2 r6 = r6.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r6 = r6.n()     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r2 = r2.K1()     // Catch:{ all -> 0x18cb }
            q7.r2 r2 = q7.s2.r(r2)     // Catch:{ all -> 0x18cb }
            r6.d(r2, r4, r7)     // Catch:{ all -> 0x18cb }
            goto L_0x1b15
        L_0x1b0f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x18cb }
            r1.<init>()     // Catch:{ all -> 0x18cb }
            throw r1     // Catch:{ all -> 0x18cb }
        L_0x1b15:
            q7.k r2 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r2)     // Catch:{ all -> 0x18cb }
            java.util.ArrayList r3 = r3.f13307b     // Catch:{ all -> 0x18cb }
            u6.q.i(r3)     // Catch:{ all -> 0x18cb }
            r2.i()     // Catch:{ all -> 0x18cb }
            r2.j()     // Catch:{ all -> 0x18cb }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x18cb }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x18cb }
            r6 = 0
        L_0x1b2d:
            int r7 = r3.size()     // Catch:{ all -> 0x18cb }
            if (r6 >= r7) goto L_0x1b4a
            if (r6 == 0) goto L_0x1b3a
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x18cb }
        L_0x1b3a:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x18cb }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x18cb }
            long r7 = r7.longValue()     // Catch:{ all -> 0x18cb }
            r4.append(r7)     // Catch:{ all -> 0x18cb }
            int r6 = r6 + 1
            goto L_0x1b2d
        L_0x1b4a:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x18cb }
            android.database.sqlite.SQLiteDatabase r6 = r2.B()     // Catch:{ all -> 0x18cb }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x18cb }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x18cb }
            int r6 = r3.size()     // Catch:{ all -> 0x18cb }
            if (r4 == r6) goto L_0x1b81
            q7.k4 r2 = r2.f13121a     // Catch:{ all -> 0x18cb }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x18cb }
            q7.s2 r2 = r2.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x18cb }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x18cb }
            int r3 = r3.size()     // Catch:{ all -> 0x18cb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x18cb }
            r2.d(r4, r3, r6)     // Catch:{ all -> 0x18cb }
        L_0x1b81:
            q7.k r2 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r2)     // Catch:{ all -> 0x18cb }
            android.database.sqlite.SQLiteDatabase r3 = r2.B()     // Catch:{ all -> 0x18cb }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x1b99 }
            r7 = 0
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x1b99 }
            r7 = 1
            r6[r7] = r1     // Catch:{ SQLiteException -> 0x1b99 }
            r3.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x1b99 }
            goto L_0x1bb0
        L_0x1b99:
            r0 = move-exception
            r3 = r0
            q7.k4 r2 = r2.f13121a     // Catch:{ all -> 0x18cb }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x18cb }
            q7.s2 r2 = r2.e()     // Catch:{ all -> 0x18cb }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x18cb }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            q7.r2 r1 = q7.s2.r(r1)     // Catch:{ all -> 0x18cb }
            r2.d(r1, r3, r4)     // Catch:{ all -> 0x18cb }
        L_0x1bb0:
            q7.k r1 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r1)     // Catch:{ all -> 0x18cb }
            r1.n()     // Catch:{ all -> 0x18cb }
            q7.k r1 = r5.f13350c
            H(r1)
            r1.P()
            r1 = 1
            return r1
        L_0x1bc2:
            r0 = move-exception
            r5 = r88
            r9 = r1
            r1 = r0
        L_0x1bc7:
            if (r9 == 0) goto L_0x1bcc
            r9.close()     // Catch:{ all -> 0x18cb }
        L_0x1bcc:
            throw r1     // Catch:{ all -> 0x18cb }
        L_0x1bcd:
            r0 = move-exception
            r5 = r1
            goto L_0x186d
        L_0x1bd1:
            r5 = r1
            q7.k r1 = r5.f13350c     // Catch:{ all -> 0x18cb }
            H(r1)     // Catch:{ all -> 0x18cb }
            r1.n()     // Catch:{ all -> 0x18cb }
            q7.k r1 = r5.f13350c
            H(r1)
            r1.P()
            r1 = 0
            return r1
        L_0x1be4:
            q7.k r2 = r5.f13350c
            H(r2)
            r2.P()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.D(long):boolean");
    }

    public final boolean E() {
        h().i();
        f();
        k kVar = this.f13350c;
        H(kVar);
        if (!(kVar.w("select count(1) > 0 from raw_events", (String[]) null) != 0)) {
            k kVar2 = this.f13350c;
            H(kVar2);
            return !TextUtils.isEmpty(kVar2.J());
        }
    }

    public final boolean F(e3 e3Var, e3 e3Var2) {
        q.a("_e".equals(e3Var.q()));
        v6 v6Var = this.C;
        H(v6Var);
        j3 m = v6.m((f3) e3Var.j(), "_sc");
        String str = null;
        String A = m == null ? null : m.A();
        H(v6Var);
        j3 m10 = v6.m((f3) e3Var2.j(), "_pc");
        if (m10 != null) {
            str = m10.A();
        }
        if (str == null || !str.equals(A)) {
            return false;
        }
        q.a("_e".equals(e3Var.q()));
        H(v6Var);
        j3 m11 = v6.m((f3) e3Var.j(), "_et");
        if (m11 == null || !m11.O() || m11.w() <= 0) {
            return true;
        }
        long w10 = m11.w();
        H(v6Var);
        j3 m12 = v6.m((f3) e3Var2.j(), "_et");
        if (m12 != null && m12.w() > 0) {
            w10 += m12.w();
        }
        H(v6Var);
        v6.L(e3Var2, "_et", Long.valueOf(w10));
        H(v6Var);
        v6.L(e3Var, "_fr", 1L);
        return true;
    }

    public final l4 I(c7 c7Var) {
        h().i();
        f();
        q.i(c7Var);
        String str = c7Var.f12948a;
        q.f(str);
        String str2 = c7Var.S;
        if (!str2.isEmpty()) {
            this.X.put(str, new s6(this, str2));
        }
        k kVar = this.f13350c;
        H(kVar);
        l4 C2 = kVar.C(str);
        h c3 = K(str).c(h.b(c7Var.R));
        g gVar = g.f13015b;
        boolean f10 = c3.f(gVar);
        boolean z10 = c7Var.K;
        String n2 = f10 ? this.E.n(str, z10) : "";
        g gVar2 = g.f13016c;
        if (C2 == null) {
            C2 = new l4(this.H, str);
            if (c3.f(gVar2)) {
                C2.b(Q(c3));
            }
            if (c3.f(gVar)) {
                C2.w(n2);
            }
        } else {
            if (c3.f(gVar) && n2 != null) {
                w3 w3Var = C2.f13162a.F;
                x3.l(w3Var);
                w3Var.i();
                if (!n2.equals(C2.f13166e)) {
                    C2.w(n2);
                    if (z10) {
                        z5 z5Var = this.E;
                        z5Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((c3.f(gVar) ? z5Var.m(str) : new Pair("", Boolean.FALSE)).first)) {
                            C2.b(Q(c3));
                            k kVar2 = this.f13350c;
                            H(kVar2);
                            if (kVar2.H(str, "_id") != null) {
                                k kVar3 = this.f13350c;
                                H(kVar3);
                                if (kVar3.H(str, "_lair") == null) {
                                    ((m) a()).getClass();
                                    y6 y6Var = new y6(c7Var.f12948a, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    k kVar4 = this.f13350c;
                                    H(kVar4);
                                    kVar4.t(y6Var);
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(C2.F()) && c3.f(gVar2)) {
                C2.b(Q(c3));
            }
        }
        C2.p(c7Var.f12949b);
        C2.a(c7Var.M);
        String str3 = c7Var.G;
        if (!TextUtils.isEmpty(str3)) {
            C2.o(str3);
        }
        long j10 = c7Var.f12952e;
        if (j10 != 0) {
            C2.q(j10);
        }
        String str4 = c7Var.f12950c;
        if (!TextUtils.isEmpty(str4)) {
            C2.d(str4);
        }
        C2.e(c7Var.F);
        String str5 = c7Var.f12951d;
        if (str5 != null) {
            C2.c(str5);
        }
        C2.m(c7Var.B);
        C2.v(c7Var.D);
        String str6 = c7Var.C;
        if (!TextUtils.isEmpty(str6)) {
            C2.r(str6);
        }
        x3 x3Var = C2.f13162a;
        w3 w3Var2 = x3Var.F;
        x3.l(w3Var2);
        w3Var2.i();
        boolean z11 = false;
        C2.E |= C2.f13176p != z10;
        C2.f13176p = z10;
        w3 w3Var3 = x3Var.F;
        x3.l(w3Var3);
        w3Var3.i();
        boolean z12 = C2.E;
        Boolean bool = C2.f13178r;
        Boolean bool2 = c7Var.N;
        C2.E = z12 | (!c.m(bool, bool2));
        C2.f13178r = bool2;
        C2.n(c7Var.O);
        kc.b();
        if (J().r((String) null, g2.f13041j0) || J().r(str, g2.f13045l0)) {
            w3 w3Var4 = x3Var.F;
            x3.l(w3Var4);
            w3Var4.i();
            boolean z13 = C2.E;
            String str7 = C2.f13181u;
            String str8 = c7Var.T;
            C2.E = z13 | (!c.m(str7, str8));
            C2.f13181u = str8;
        }
        ga gaVar = ga.f5297b;
        ((ha) gaVar.f5298a.zza()).zza();
        if (J().r((String) null, g2.f13039i0)) {
            C2.x(c7Var.P);
        } else {
            ((ha) gaVar.f5298a.zza()).zza();
            if (J().r((String) null, g2.f13037h0)) {
                C2.x((List) null);
            }
        }
        ((uc) tc.f5539b.f5540a.zza()).zza();
        if (J().r((String) null, g2.f13046m0)) {
            w3 w3Var5 = x3Var.F;
            x3.l(w3Var5);
            w3Var5.i();
            boolean z14 = C2.E;
            boolean z15 = C2.f13182v;
            boolean z16 = c7Var.U;
            C2.E = z14 | (z15 != z16);
            C2.f13182v = z16;
        }
        ob.a();
        if (J().r((String) null, g2.f13068x0)) {
            w3 w3Var6 = x3Var.F;
            x3.l(w3Var6);
            w3Var6.i();
            boolean z17 = C2.E;
            long j11 = C2.f13183w;
            long j12 = c7Var.V;
            if (j11 != j12) {
                z11 = true;
            }
            C2.E = z17 | z11;
            C2.f13183w = j12;
        }
        w3 w3Var7 = x3Var.F;
        x3.l(w3Var7);
        w3Var7.i();
        if (C2.E) {
            k kVar5 = this.f13350c;
            H(kVar5);
            kVar5.o(C2);
        }
        return C2;
    }

    public final f J() {
        x3 x3Var = this.H;
        q.i(x3Var);
        return x3Var.C;
    }

    public final h K(String str) {
        String str2;
        h hVar = h.f13093b;
        h().i();
        f();
        h hVar2 = (h) this.W.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        k kVar = this.f13350c;
        H(kVar);
        q.i(str);
        kVar.i();
        kVar.j();
        Cursor cursor = null;
        try {
            Cursor rawQuery = kVar.B().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            h b10 = h.b(str2);
            r(str, b10);
            return b10;
        } catch (SQLiteException e10) {
            s2 s2Var = ((x3) kVar.f13121a).E;
            x3.l(s2Var);
            s2Var.B.d("select consent_state from consent_settings where app_id=? limit 1;", e10, "Database error");
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final k L() {
        k kVar = this.f13350c;
        H(kVar);
        return kVar;
    }

    public final a3 M() {
        a3 a3Var = this.f13351d;
        if (a3Var != null) {
            return a3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final v6 O() {
        v6 v6Var = this.C;
        H(v6Var);
        return v6Var;
    }

    public final a7 P() {
        x3 x3Var = this.H;
        q.i(x3Var);
        a7 a7Var = x3Var.H;
        x3.j(a7Var);
        return a7Var;
    }

    public final String Q(h hVar) {
        if (!hVar.f(g.f13016c)) {
            return null;
        }
        byte[] bArr = new byte[16];
        P().r().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final b a() {
        x3 x3Var = this.H;
        q.i(x3Var);
        return x3Var.J;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r10 = this;
            q7.w3 r0 = r10.h()
            r0.i()
            r10.f()
            boolean r0 = r10.J
            if (r0 != 0) goto L_0x0199
            r0 = 1
            r10.J = r0
            q7.w3 r1 = r10.h()
            r1.i()
            java.nio.channels.FileLock r1 = r10.R
            q7.x3 r2 = r10.H
            r3 = 0
            java.lang.String r4 = "Storage concurrent access okay"
            if (r1 == 0) goto L_0x0032
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0028
            goto L_0x0032
        L_0x0028:
            q7.s2 r1 = r10.e()
            q7.q2 r1 = r1.J
            r1.b(r4)
            goto L_0x0066
        L_0x0032:
            q7.k r1 = r10.f13350c
            q7.k4 r1 = r1.f13121a
            q7.x3 r1 = (q7.x3) r1
            r1.getClass()
            android.content.Context r1 = r2.f13419a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "google_app_measurement.db"
            r5.<init>(r1, r6)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.lang.String r6 = "rw"
            r1.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            r10.S = r1     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            r10.R = r1     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            if (r1 == 0) goto L_0x0068
            q7.s2 r1 = r10.e()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            q7.q2 r1 = r1.J     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            r1.b(r4)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
        L_0x0066:
            r1 = r0
            goto L_0x009b
        L_0x0068:
            q7.s2 r1 = r10.e()     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            q7.q2 r1 = r1.B     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            java.lang.String r4 = "Storage concurrent data access panic"
            r1.b(r4)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0081, OverlappingFileLockException -> 0x0074 }
            goto L_0x009a
        L_0x0074:
            r1 = move-exception
            q7.s2 r4 = r10.e()
            java.lang.String r5 = "Storage lock already acquired"
            q7.q2 r4 = r4.E
            r4.c(r1, r5)
            goto L_0x009a
        L_0x0081:
            r1 = move-exception
            q7.s2 r4 = r10.e()
            java.lang.String r5 = "Failed to access storage lock file"
            q7.q2 r4 = r4.B
            r4.c(r1, r5)
            goto L_0x009a
        L_0x008e:
            r1 = move-exception
            q7.s2 r4 = r10.e()
            java.lang.String r5 = "Failed to acquire storage lock"
            q7.q2 r4 = r4.B
            r4.c(r1, r5)
        L_0x009a:
            r1 = r3
        L_0x009b:
            if (r1 == 0) goto L_0x0199
            java.nio.channels.FileChannel r1 = r10.S
            q7.w3 r4 = r10.h()
            r4.i()
            r4 = 0
            java.lang.String r6 = "Bad channel to read from"
            r7 = 4
            if (r1 == 0) goto L_0x00e9
            boolean r8 = r1.isOpen()
            if (r8 != 0) goto L_0x00b4
            goto L_0x00e9
        L_0x00b4:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r1.position(r4)     // Catch:{ IOException -> 0x00dc }
            int r1 = r1.read(r8)     // Catch:{ IOException -> 0x00dc }
            if (r1 == r7) goto L_0x00d4
            r8 = -1
            if (r1 == r8) goto L_0x00f2
            q7.s2 r8 = r10.e()     // Catch:{ IOException -> 0x00dc }
            q7.q2 r8 = r8.E     // Catch:{ IOException -> 0x00dc }
            java.lang.String r9 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00dc }
            r8.c(r1, r9)     // Catch:{ IOException -> 0x00dc }
            goto L_0x00f2
        L_0x00d4:
            r8.flip()     // Catch:{ IOException -> 0x00dc }
            int r3 = r8.getInt()     // Catch:{ IOException -> 0x00dc }
            goto L_0x00f2
        L_0x00dc:
            r1 = move-exception
            q7.s2 r8 = r10.e()
            java.lang.String r9 = "Failed to read from channel"
            q7.q2 r8 = r8.B
            r8.c(r1, r9)
            goto L_0x00f2
        L_0x00e9:
            q7.s2 r1 = r10.e()
            q7.q2 r1 = r1.B
            r1.b(r6)
        L_0x00f2:
            q7.k2 r1 = r2.q()
            r1.j()
            int r1 = r1.f13151e
            q7.w3 r2 = r10.h()
            r2.i()
            if (r3 <= r1) goto L_0x0118
            q7.s2 r0 = r10.e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            q7.q2 r0 = r0.B
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            r0.d(r2, r1, r3)
            return
        L_0x0118:
            if (r3 >= r1) goto L_0x0199
            java.nio.channels.FileChannel r2 = r10.S
            q7.w3 r8 = r10.h()
            r8.i()
            if (r2 == 0) goto L_0x017d
            boolean r8 = r2.isOpen()
            if (r8 != 0) goto L_0x012c
            goto L_0x017d
        L_0x012c:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r7)
            r6.putInt(r1)
            r6.flip()
            r2.truncate(r4)     // Catch:{ IOException -> 0x0170 }
            r2.write(r6)     // Catch:{ IOException -> 0x0170 }
            r2.force(r0)     // Catch:{ IOException -> 0x0170 }
            long r4 = r2.size()     // Catch:{ IOException -> 0x0170 }
            r6 = 4
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x015c
            q7.s2 r0 = r10.e()     // Catch:{ IOException -> 0x0170 }
            q7.q2 r0 = r0.B     // Catch:{ IOException -> 0x0170 }
            java.lang.String r4 = "Error writing to channel. Bytes written"
            long r5 = r2.size()     // Catch:{ IOException -> 0x0170 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x0170 }
            r0.c(r2, r4)     // Catch:{ IOException -> 0x0170 }
        L_0x015c:
            q7.s2 r0 = r10.e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            q7.q2 r0 = r0.J
            r0.d(r2, r1, r3)
            return
        L_0x0170:
            r0 = move-exception
            q7.s2 r2 = r10.e()
            java.lang.String r4 = "Failed to write to channel"
            q7.q2 r2 = r2.B
            r2.c(r0, r4)
            goto L_0x0186
        L_0x017d:
            q7.s2 r0 = r10.e()
            q7.q2 r0 = r0.B
            r0.b(r6)
        L_0x0186:
            q7.s2 r0 = r10.e()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            q7.q2 r0 = r0.B
            r0.d(r2, r1, r3)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.b():void");
    }

    public final d c() {
        throw null;
    }

    public final Context d() {
        return this.H.f13419a;
    }

    public final s2 e() {
        x3 x3Var = this.H;
        q.i(x3Var);
        s2 s2Var = x3Var.E;
        x3.l(s2Var);
        return s2Var;
    }

    public final void f() {
        if (!this.I) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void g(l4 l4Var) {
        a aVar;
        a aVar2;
        r3 r3Var = this.f13347a;
        h().i();
        if (!TextUtils.isEmpty(l4Var.I()) || !TextUtils.isEmpty(l4Var.C())) {
            Uri.Builder builder = new Uri.Builder();
            String I2 = l4Var.I();
            if (TextUtils.isEmpty(I2)) {
                I2 = l4Var.C();
            }
            a aVar3 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) g2.f13034g.a((Object) null)).encodedAuthority((String) g2.f13036h.a((Object) null)).path("config/app/".concat(String.valueOf(I2))).appendQueryParameter("platform", "android");
            ((x3) this.F.f13121a).C.n();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(77000)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String E2 = l4Var.E();
                q.i(E2);
                URL url = new URL(uri);
                e().J.c(E2, "Fetching remote configuration");
                H(r3Var);
                t2 s10 = r3Var.s(E2);
                H(r3Var);
                r3Var.i();
                String str = (String) r3Var.I.getOrDefault(E2, null);
                if (s10 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        aVar2 = new a();
                        aVar2.put("If-Modified-Since", str);
                    } else {
                        aVar2 = null;
                    }
                    H(r3Var);
                    r3Var.i();
                    String str2 = (String) r3Var.J.getOrDefault(E2, null);
                    if (!TextUtils.isEmpty(str2)) {
                        if (aVar2 == null) {
                            aVar2 = new a();
                        }
                        aVar3 = aVar2;
                        aVar3.put("If-None-Match", str2);
                    } else {
                        aVar = aVar2;
                        this.O = true;
                        y2 y2Var = this.f13349b;
                        H(y2Var);
                        i4 i4Var = new i4((k4) this);
                        y2Var.i();
                        y2Var.j();
                        w3 w3Var = ((x3) y2Var.f13121a).F;
                        x3.l(w3Var);
                        w3Var.p(new w2(y2Var, E2, url, (byte[]) null, aVar, i4Var));
                    }
                }
                aVar = aVar3;
                this.O = true;
                y2 y2Var2 = this.f13349b;
                H(y2Var2);
                i4 i4Var2 = new i4((k4) this);
                y2Var2.i();
                y2Var2.j();
                w3 w3Var2 = ((x3) y2Var2.f13121a).F;
                x3.l(w3Var2);
                w3Var2.p(new w2(y2Var2, E2, url, (byte[]) null, aVar, i4Var2));
            } catch (MalformedURLException unused) {
                e().B.d(s2.r(l4Var.E()), uri, "Failed to parse config URL. Not fetching. appId");
            }
        } else {
            String E3 = l4Var.E();
            q.i(E3);
            l(E3, 204, (Throwable) null, (byte[]) null, (Map) null);
        }
    }

    public final w3 h() {
        x3 x3Var = this.H;
        q.i(x3Var);
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        return w3Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r4 = r1.Z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(q7.s r20, q7.c7 r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            u6.q.i(r21)
            java.lang.String r2 = r0.f12948a
            u6.q.f(r2)
            q7.w3 r3 = r19.h()
            r3.i()
            r19.f()
            r3 = r20
            long r10 = r3.f13314d
            q7.t2 r3 = q7.t2.b(r20)
            q7.w3 r4 = r19.h()
            r4.i()
            q7.f5 r4 = r1.Y
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = r1.Z
            if (r4 == 0) goto L_0x0037
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            q7.f5 r4 = r1.Y
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            android.os.Bundle r5 = r3.f13335d
            r6 = 0
            q7.a7.v(r4, r5, r6)
            q7.s r3 = r3.a()
            q7.v6 r4 = r1.C
            H(r4)
            java.lang.String r4 = r0.f12949b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r12 = 1
            if (r4 == 0) goto L_0x005a
            java.lang.String r4 = r0.M
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x005a
            r4 = r6
            goto L_0x005b
        L_0x005a:
            r4 = r12
        L_0x005b:
            if (r4 != 0) goto L_0x005e
            return
        L_0x005e:
            boolean r4 = r0.D
            if (r4 != 0) goto L_0x0066
            r1.I(r0)
            return
        L_0x0066:
            java.util.List r4 = r0.P
            if (r4 == 0) goto L_0x00a3
            java.lang.String r5 = r3.f13311a
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0095
            q7.q r4 = r3.f13312b
            android.os.Bundle r4 = r4.w()
            java.lang.String r5 = "ga_safelisted"
            r7 = 1
            r4.putLong(r5, r7)
            q7.s r5 = new q7.s
            java.lang.String r14 = r3.f13311a
            q7.q r15 = new q7.q
            r15.<init>(r4)
            java.lang.String r4 = r3.f13313c
            long r7 = r3.f13314d
            r13 = r5
            r16 = r4
            r17 = r7
            r13.<init>(r14, r15, r16, r17)
            goto L_0x00a4
        L_0x0095:
            q7.s2 r0 = r19.e()
            java.lang.String r4 = "Dropping non-safelisted event. appId, event name, origin"
            q7.q2 r0 = r0.I
            java.lang.String r3 = r3.f13313c
            r0.e(r4, r2, r5, r3)
            return
        L_0x00a3:
            r13 = r3
        L_0x00a4:
            q7.k r3 = r1.f13350c
            H(r3)
            r3.O()
            q7.k r3 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r3)     // Catch:{ all -> 0x02f9 }
            u6.q.f(r2)     // Catch:{ all -> 0x02f9 }
            r3.i()     // Catch:{ all -> 0x02f9 }
            r3.j()     // Catch:{ all -> 0x02f9 }
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r5 = 2
            if (r4 >= 0) goto L_0x00de
            q7.k4 r3 = r3.f13121a     // Catch:{ all -> 0x02f9 }
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x02f9 }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x02f9 }
            q7.x3.l(r3)     // Catch:{ all -> 0x02f9 }
            q7.q2 r3 = r3.E     // Catch:{ all -> 0x02f9 }
            java.lang.String r7 = "Invalid time querying timed out conditional properties"
            q7.r2 r8 = q7.s2.r(r2)     // Catch:{ all -> 0x02f9 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f9 }
            r3.d(r8, r9, r7)     // Catch:{ all -> 0x02f9 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f9 }
            goto L_0x00ee
        L_0x00de:
            java.lang.String r7 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x02f9 }
            r8[r6] = r2     // Catch:{ all -> 0x02f9 }
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f9 }
            r8[r12] = r9     // Catch:{ all -> 0x02f9 }
            java.util.List r3 = r3.L(r7, r8)     // Catch:{ all -> 0x02f9 }
        L_0x00ee:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f9 }
        L_0x00f2:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x02f9 }
            q7.x3 r14 = r1.H
            if (r7 == 0) goto L_0x0139
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x02f9 }
            q7.c r7 = (q7.c) r7     // Catch:{ all -> 0x02f9 }
            if (r7 == 0) goto L_0x00f2
            q7.s2 r8 = r19.e()     // Catch:{ all -> 0x02f9 }
            q7.q2 r8 = r8.J     // Catch:{ all -> 0x02f9 }
            java.lang.String r9 = "User property timed out"
            java.lang.String r15 = r7.f12926a     // Catch:{ all -> 0x02f9 }
            q7.n2 r14 = r14.I     // Catch:{ all -> 0x02f9 }
            q7.w6 r12 = r7.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.String r12 = r12.f13410b     // Catch:{ all -> 0x02f9 }
            java.lang.String r12 = r14.f(r12)     // Catch:{ all -> 0x02f9 }
            q7.w6 r14 = r7.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.Object r14 = r14.w()     // Catch:{ all -> 0x02f9 }
            r8.e(r9, r15, r12, r14)     // Catch:{ all -> 0x02f9 }
            q7.s r8 = r7.C     // Catch:{ all -> 0x02f9 }
            if (r8 == 0) goto L_0x012b
            q7.s r9 = new q7.s     // Catch:{ all -> 0x02f9 }
            r9.<init>(r8, r10)     // Catch:{ all -> 0x02f9 }
            r1.u(r9, r0)     // Catch:{ all -> 0x02f9 }
        L_0x012b:
            q7.k r8 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r8)     // Catch:{ all -> 0x02f9 }
            q7.w6 r7 = r7.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.String r7 = r7.f13410b     // Catch:{ all -> 0x02f9 }
            r8.x(r2, r7)     // Catch:{ all -> 0x02f9 }
            r12 = 1
            goto L_0x00f2
        L_0x0139:
            q7.k r3 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r3)     // Catch:{ all -> 0x02f9 }
            u6.q.f(r2)     // Catch:{ all -> 0x02f9 }
            r3.i()     // Catch:{ all -> 0x02f9 }
            r3.j()     // Catch:{ all -> 0x02f9 }
            if (r4 >= 0) goto L_0x0166
            q7.k4 r3 = r3.f13121a     // Catch:{ all -> 0x02f9 }
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x02f9 }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x02f9 }
            q7.x3.l(r3)     // Catch:{ all -> 0x02f9 }
            q7.q2 r3 = r3.E     // Catch:{ all -> 0x02f9 }
            java.lang.String r7 = "Invalid time querying expired conditional properties"
            q7.r2 r8 = q7.s2.r(r2)     // Catch:{ all -> 0x02f9 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f9 }
            r3.d(r8, r9, r7)     // Catch:{ all -> 0x02f9 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f9 }
            goto L_0x0177
        L_0x0166:
            java.lang.String r7 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x02f9 }
            r8[r6] = r2     // Catch:{ all -> 0x02f9 }
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f9 }
            r12 = 1
            r8[r12] = r9     // Catch:{ all -> 0x02f9 }
            java.util.List r3 = r3.L(r7, r8)     // Catch:{ all -> 0x02f9 }
        L_0x0177:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02f9 }
            int r8 = r3.size()     // Catch:{ all -> 0x02f9 }
            r7.<init>(r8)     // Catch:{ all -> 0x02f9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02f9 }
        L_0x0184:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x02f9 }
            if (r8 == 0) goto L_0x01d1
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x02f9 }
            q7.c r8 = (q7.c) r8     // Catch:{ all -> 0x02f9 }
            if (r8 == 0) goto L_0x0184
            q7.s2 r9 = r19.e()     // Catch:{ all -> 0x02f9 }
            q7.q2 r9 = r9.J     // Catch:{ all -> 0x02f9 }
            java.lang.String r12 = "User property expired"
            java.lang.String r15 = r8.f12926a     // Catch:{ all -> 0x02f9 }
            q7.n2 r5 = r14.I     // Catch:{ all -> 0x02f9 }
            q7.w6 r6 = r8.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.String r6 = r6.f13410b     // Catch:{ all -> 0x02f9 }
            java.lang.String r5 = r5.f(r6)     // Catch:{ all -> 0x02f9 }
            q7.w6 r6 = r8.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.Object r6 = r6.w()     // Catch:{ all -> 0x02f9 }
            r9.e(r12, r15, r5, r6)     // Catch:{ all -> 0x02f9 }
            q7.k r5 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r5)     // Catch:{ all -> 0x02f9 }
            q7.w6 r6 = r8.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.String r6 = r6.f13410b     // Catch:{ all -> 0x02f9 }
            r5.m(r2, r6)     // Catch:{ all -> 0x02f9 }
            q7.s r5 = r8.G     // Catch:{ all -> 0x02f9 }
            if (r5 == 0) goto L_0x01c2
            r7.add(r5)     // Catch:{ all -> 0x02f9 }
        L_0x01c2:
            q7.k r5 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r5)     // Catch:{ all -> 0x02f9 }
            q7.w6 r6 = r8.f12928c     // Catch:{ all -> 0x02f9 }
            java.lang.String r6 = r6.f13410b     // Catch:{ all -> 0x02f9 }
            r5.x(r2, r6)     // Catch:{ all -> 0x02f9 }
            r5 = 2
            r6 = 0
            goto L_0x0184
        L_0x01d1:
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x02f9 }
        L_0x01d5:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02f9 }
            if (r5 == 0) goto L_0x01ea
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02f9 }
            q7.s r5 = (q7.s) r5     // Catch:{ all -> 0x02f9 }
            q7.s r6 = new q7.s     // Catch:{ all -> 0x02f9 }
            r6.<init>(r5, r10)     // Catch:{ all -> 0x02f9 }
            r1.u(r6, r0)     // Catch:{ all -> 0x02f9 }
            goto L_0x01d5
        L_0x01ea:
            q7.k r3 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r3)     // Catch:{ all -> 0x02f9 }
            q7.k4 r5 = r3.f13121a
            java.lang.String r6 = r13.f13311a     // Catch:{ all -> 0x02f9 }
            u6.q.f(r2)     // Catch:{ all -> 0x02f9 }
            u6.q.f(r6)     // Catch:{ all -> 0x02f9 }
            r3.i()     // Catch:{ all -> 0x02f9 }
            r3.j()     // Catch:{ all -> 0x02f9 }
            if (r4 >= 0) goto L_0x0225
            r3 = r5
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x02f9 }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x02f9 }
            q7.x3.l(r3)     // Catch:{ all -> 0x02f9 }
            q7.q2 r3 = r3.E     // Catch:{ all -> 0x02f9 }
            java.lang.String r4 = "Invalid time querying triggered conditional properties"
            q7.r2 r2 = q7.s2.r(r2)     // Catch:{ all -> 0x02f9 }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ all -> 0x02f9 }
            q7.n2 r5 = r5.I     // Catch:{ all -> 0x02f9 }
            java.lang.String r5 = r5.d(r6)     // Catch:{ all -> 0x02f9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02f9 }
            r3.e(r4, r2, r5, r6)     // Catch:{ all -> 0x02f9 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x02f9 }
            goto L_0x023b
        L_0x0225:
            java.lang.String r4 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x02f9 }
            r7 = 0
            r5[r7] = r2     // Catch:{ all -> 0x02f9 }
            r2 = 1
            r5[r2] = r6     // Catch:{ all -> 0x02f9 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x02f9 }
            r6 = 2
            r5[r6] = r2     // Catch:{ all -> 0x02f9 }
            java.util.List r2 = r3.L(r4, r5)     // Catch:{ all -> 0x02f9 }
        L_0x023b:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x02f9 }
            int r3 = r2.size()     // Catch:{ all -> 0x02f9 }
            r12.<init>(r3)     // Catch:{ all -> 0x02f9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02f9 }
        L_0x0248:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02f9 }
            if (r3 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02f9 }
            r15 = r3
            q7.c r15 = (q7.c) r15     // Catch:{ all -> 0x02f9 }
            if (r15 == 0) goto L_0x0248
            q7.w6 r3 = r15.f12928c     // Catch:{ all -> 0x02f9 }
            q7.y6 r9 = new q7.y6     // Catch:{ all -> 0x02f9 }
            java.lang.String r4 = r15.f12926a     // Catch:{ all -> 0x02f9 }
            u6.q.i(r4)     // Catch:{ all -> 0x02f9 }
            java.lang.String r5 = r15.f12927b     // Catch:{ all -> 0x02f9 }
            java.lang.String r6 = r3.f13410b     // Catch:{ all -> 0x02f9 }
            java.lang.Object r16 = r3.w()     // Catch:{ all -> 0x02f9 }
            u6.q.i(r16)     // Catch:{ all -> 0x02f9 }
            r3 = r9
            r7 = r10
            r17 = r2
            r2 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x02f9 }
            java.lang.Object r3 = r2.f13454e     // Catch:{ all -> 0x02f9 }
            java.lang.String r4 = r2.f13452c     // Catch:{ all -> 0x02f9 }
            q7.k r5 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r5)     // Catch:{ all -> 0x02f9 }
            boolean r5 = r5.t(r2)     // Catch:{ all -> 0x02f9 }
            if (r5 == 0) goto L_0x0298
            q7.s2 r5 = r19.e()     // Catch:{ all -> 0x02f9 }
            q7.q2 r5 = r5.J     // Catch:{ all -> 0x02f9 }
            java.lang.String r6 = "User property triggered"
            java.lang.String r7 = r15.f12926a     // Catch:{ all -> 0x02f9 }
            q7.n2 r8 = r14.I     // Catch:{ all -> 0x02f9 }
            java.lang.String r4 = r8.f(r4)     // Catch:{ all -> 0x02f9 }
            r5.e(r6, r7, r4, r3)     // Catch:{ all -> 0x02f9 }
            goto L_0x02af
        L_0x0298:
            q7.s2 r5 = r19.e()     // Catch:{ all -> 0x02f9 }
            q7.q2 r5 = r5.B     // Catch:{ all -> 0x02f9 }
            java.lang.String r6 = "Too many active user properties, ignoring"
            java.lang.String r7 = r15.f12926a     // Catch:{ all -> 0x02f9 }
            q7.r2 r7 = q7.s2.r(r7)     // Catch:{ all -> 0x02f9 }
            q7.n2 r8 = r14.I     // Catch:{ all -> 0x02f9 }
            java.lang.String r4 = r8.f(r4)     // Catch:{ all -> 0x02f9 }
            r5.e(r6, r7, r4, r3)     // Catch:{ all -> 0x02f9 }
        L_0x02af:
            q7.s r3 = r15.E     // Catch:{ all -> 0x02f9 }
            if (r3 == 0) goto L_0x02b6
            r12.add(r3)     // Catch:{ all -> 0x02f9 }
        L_0x02b6:
            q7.w6 r3 = new q7.w6     // Catch:{ all -> 0x02f9 }
            r3.<init>(r2)     // Catch:{ all -> 0x02f9 }
            r15.f12928c = r3     // Catch:{ all -> 0x02f9 }
            r2 = 1
            r15.f12930e = r2     // Catch:{ all -> 0x02f9 }
            q7.k r3 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r3)     // Catch:{ all -> 0x02f9 }
            r3.s(r15)     // Catch:{ all -> 0x02f9 }
            r2 = r17
            goto L_0x0248
        L_0x02cc:
            r1.u(r13, r0)     // Catch:{ all -> 0x02f9 }
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x02f9 }
        L_0x02d3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x02f9 }
            if (r3 == 0) goto L_0x02e8
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x02f9 }
            q7.s r3 = (q7.s) r3     // Catch:{ all -> 0x02f9 }
            q7.s r4 = new q7.s     // Catch:{ all -> 0x02f9 }
            r4.<init>(r3, r10)     // Catch:{ all -> 0x02f9 }
            r1.u(r4, r0)     // Catch:{ all -> 0x02f9 }
            goto L_0x02d3
        L_0x02e8:
            q7.k r0 = r1.f13350c     // Catch:{ all -> 0x02f9 }
            H(r0)     // Catch:{ all -> 0x02f9 }
            r0.n()     // Catch:{ all -> 0x02f9 }
            q7.k r0 = r1.f13350c
            H(r0)
            r0.P()
            return
        L_0x02f9:
            r0 = move-exception
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.i(q7.s, q7.c7):void");
    }

    public final void j(s sVar, String str) {
        s sVar2 = sVar;
        String str2 = str;
        k kVar = this.f13350c;
        H(kVar);
        l4 C2 = kVar.C(str2);
        if (C2 == null || TextUtils.isEmpty(C2.G())) {
            e().I.c(str2, "No app data available; dropping event");
            return;
        }
        Boolean z10 = z(C2);
        if (z10 == null) {
            if (!"_ui".equals(sVar2.f13311a)) {
                s2 e10 = e();
                e10.E.c(s2.r(str), "Could not find package. appId");
            }
        } else if (!z10.booleanValue()) {
            s2 e11 = e();
            e11.B.c(s2.r(str), "App version does not match; dropping event. appId");
            return;
        }
        String I2 = C2.I();
        String G2 = C2.G();
        long A = C2.A();
        x3 x3Var = C2.f13162a;
        w3 w3Var = x3Var.F;
        x3.l(w3Var);
        w3Var.i();
        String str3 = C2.f13173l;
        w3 w3Var2 = x3Var.F;
        x3.l(w3Var2);
        w3Var2.i();
        long j10 = C2.m;
        w3 w3Var3 = x3Var.F;
        x3.l(w3Var3);
        w3Var3.i();
        long j11 = C2.f13174n;
        w3 w3Var4 = x3Var.F;
        x3.l(w3Var4);
        w3Var4.i();
        boolean z11 = C2.f13175o;
        String H2 = C2.H();
        w3 w3Var5 = x3Var.F;
        x3.l(w3Var5);
        w3Var5.i();
        boolean y10 = C2.y();
        String C3 = C2.C();
        w3 w3Var6 = x3Var.F;
        x3.l(w3Var6);
        w3Var6.i();
        Boolean bool = C2.f13178r;
        long B2 = C2.B();
        Boolean bool2 = bool;
        w3 w3Var7 = x3Var.F;
        x3.l(w3Var7);
        w3Var7.i();
        ArrayList arrayList = C2.f13180t;
        String e12 = K(str2).e();
        boolean z12 = C2.z();
        w3 w3Var8 = x3Var.F;
        x3.l(w3Var8);
        w3Var8.i();
        c7 c7Var = r2;
        c7 c7Var2 = new c7(str, I2, G2, A, str3, j10, j11, (String) null, z11, false, H2, 0, 0, y10, false, C3, bool2, B2, arrayList, e12, "", (String) null, z12, C2.f13183w);
        k(sVar, c7Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        if (r5 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(q7.s r12, q7.c7 r13) {
        /*
            r11 = this;
            java.lang.String r0 = r13.f12948a
            u6.q.f(r0)
            q7.t2 r12 = q7.t2.b(r12)
            q7.a7 r0 = r11.P()
            q7.k r1 = r11.f13350c
            H(r1)
            java.lang.String r2 = r13.f12948a
            q7.k4 r3 = r1.f13121a
            r1.i()
            r1.j()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r1.B()     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            java.lang.String r6 = "select parameters from default_event_params where app_id=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            r8 = 0
            r7[r8] = r2     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x00d1, all -> 0x00ce }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x00cc }
            if (r6 != 0) goto L_0x0044
            r1 = r3
            q7.x3 r1 = (q7.x3) r1     // Catch:{ SQLiteException -> 0x00cc }
            q7.s2 r1 = r1.E     // Catch:{ SQLiteException -> 0x00cc }
            q7.x3.l(r1)     // Catch:{ SQLiteException -> 0x00cc }
            q7.q2 r1 = r1.J     // Catch:{ SQLiteException -> 0x00cc }
            java.lang.String r6 = "Default event parameters not found"
            r1.b(r6)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x00e3
        L_0x0044:
            byte[] r6 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.internal.measurement.e3 r7 = com.google.android.gms.internal.measurement.f3.x()     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.c7 r6 = q7.v6.A(r7, r6)     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.e3 r6 = (com.google.android.gms.internal.measurement.e3) r6     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.g7 r6 = r6.j()     // Catch:{ IOException -> 0x00b7 }
            com.google.android.gms.internal.measurement.f3 r6 = (com.google.android.gms.internal.measurement.f3) r6     // Catch:{ IOException -> 0x00b7 }
            q7.t6 r1 = r1.f13208b     // Catch:{ SQLiteException -> 0x00cc }
            r1.O()     // Catch:{ SQLiteException -> 0x00cc }
            java.util.List r1 = r6.B()     // Catch:{ SQLiteException -> 0x00cc }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00cc }
            r6.<init>()     // Catch:{ SQLiteException -> 0x00cc }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ SQLiteException -> 0x00cc }
        L_0x006a:
            boolean r7 = r1.hasNext()     // Catch:{ SQLiteException -> 0x00cc }
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = r1.next()     // Catch:{ SQLiteException -> 0x00cc }
            com.google.android.gms.internal.measurement.j3 r7 = (com.google.android.gms.internal.measurement.j3) r7     // Catch:{ SQLiteException -> 0x00cc }
            java.lang.String r8 = r7.z()     // Catch:{ SQLiteException -> 0x00cc }
            boolean r9 = r7.M()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x0088
            double r9 = r7.t()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putDouble(r8, r9)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x0088:
            boolean r9 = r7.N()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x0096
            float r7 = r7.u()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putFloat(r8, r7)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x0096:
            boolean r9 = r7.Q()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x00a4
            java.lang.String r7 = r7.A()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putString(r8, r7)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x00a4:
            boolean r9 = r7.O()     // Catch:{ SQLiteException -> 0x00cc }
            if (r9 == 0) goto L_0x006a
            long r9 = r7.w()     // Catch:{ SQLiteException -> 0x00cc }
            r6.putLong(r8, r9)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x006a
        L_0x00b2:
            r5.close()
            r4 = r6
            goto L_0x00e6
        L_0x00b7:
            r1 = move-exception
            r6 = r3
            q7.x3 r6 = (q7.x3) r6     // Catch:{ SQLiteException -> 0x00cc }
            q7.s2 r6 = r6.E     // Catch:{ SQLiteException -> 0x00cc }
            q7.x3.l(r6)     // Catch:{ SQLiteException -> 0x00cc }
            q7.q2 r6 = r6.B     // Catch:{ SQLiteException -> 0x00cc }
            java.lang.String r7 = "Failed to retrieve default event parameters. appId"
            q7.r2 r8 = q7.s2.r(r2)     // Catch:{ SQLiteException -> 0x00cc }
            r6.d(r8, r1, r7)     // Catch:{ SQLiteException -> 0x00cc }
            goto L_0x00e3
        L_0x00cc:
            r1 = move-exception
            goto L_0x00d3
        L_0x00ce:
            r12 = move-exception
            goto L_0x0147
        L_0x00d1:
            r1 = move-exception
            r5 = r4
        L_0x00d3:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x0145 }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x0145 }
            q7.x3.l(r3)     // Catch:{ all -> 0x0145 }
            q7.q2 r3 = r3.B     // Catch:{ all -> 0x0145 }
            java.lang.String r6 = "Error selecting default event parameters"
            r3.c(r1, r6)     // Catch:{ all -> 0x0145 }
            if (r5 == 0) goto L_0x00e6
        L_0x00e3:
            r5.close()
        L_0x00e6:
            android.os.Bundle r1 = r12.f13335d
            r0.w(r1, r4)
            q7.a7 r0 = r11.P()
            q7.f r1 = r11.J()
            r1.getClass()
            q7.f2 r3 = q7.g2.J
            r4 = 25
            r5 = 100
            int r1 = r1.m(r2, r3, r4, r5)
            r0.y(r12, r1)
            q7.s r12 = r12.a()
            java.lang.String r0 = r12.f13311a
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x0141
        L_0x0112:
            q7.q r0 = r12.f13312b
            android.os.Bundle r1 = r0.f13275a
            java.lang.String r2 = "_cis"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "referrer API v2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0141
            android.os.Bundle r0 = r0.f13275a
            java.lang.String r1 = "gclid"
            java.lang.String r5 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0141
            q7.w6 r0 = new q7.w6
            long r3 = r12.f13314d
            java.lang.String r7 = "auto"
            java.lang.String r6 = "_lgclid"
            r2 = r0
            r2.<init>(r3, r5, r6, r7)
            r11.s(r0, r13)
        L_0x0141:
            r11.i(r12, r13)
            return
        L_0x0145:
            r12 = move-exception
            r4 = r5
        L_0x0147:
            if (r4 == 0) goto L_0x014c
            r4.close()
        L_0x014c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.k(q7.s, q7.c7):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x00e1, all -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151 A[Catch:{ all -> 0x00e1, all -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015d A[Catch:{ all -> 0x00e1, all -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017d A[Catch:{ all -> 0x00e1, all -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0181 A[Catch:{ all -> 0x00e1, all -> 0x01a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            r9 = this;
            q7.w3 r0 = r9.h()
            r0.i()
            r9.f()
            u6.q.f(r10)
            r0 = 0
            if (r13 != 0) goto L_0x0012
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x01a3 }
        L_0x0012:
            q7.s2 r1 = r9.e()     // Catch:{ all -> 0x01a3 }
            q7.q2 r1 = r1.J     // Catch:{ all -> 0x01a3 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r13.length     // Catch:{ all -> 0x01a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01a3 }
            r1.c(r3, r2)     // Catch:{ all -> 0x01a3 }
            q7.k r1 = r9.f13350c     // Catch:{ all -> 0x01a3 }
            H(r1)     // Catch:{ all -> 0x01a3 }
            r1.O()     // Catch:{ all -> 0x01a3 }
            q7.k r1 = r9.f13350c     // Catch:{ all -> 0x00e1 }
            H(r1)     // Catch:{ all -> 0x00e1 }
            q7.l4 r1 = r1.C(r10)     // Catch:{ all -> 0x00e1 }
            r2 = 1
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 304(0x130, float:4.26E-43)
            if (r11 == r4) goto L_0x0041
            r4 = 204(0xcc, float:2.86E-43)
            if (r11 == r4) goto L_0x0041
            if (r11 != r5) goto L_0x0045
            r11 = r5
        L_0x0041:
            if (r12 != 0) goto L_0x0045
            r4 = r2
            goto L_0x0046
        L_0x0045:
            r4 = r0
        L_0x0046:
            if (r1 != 0) goto L_0x0059
            q7.s2 r11 = r9.e()     // Catch:{ all -> 0x00e1 }
            q7.q2 r11 = r11.E     // Catch:{ all -> 0x00e1 }
            java.lang.String r12 = "App does not exist in onConfigFetched. appId"
            q7.r2 r10 = q7.s2.r(r10)     // Catch:{ all -> 0x00e1 }
            r11.c(r10, r12)     // Catch:{ all -> 0x00e1 }
            goto L_0x0184
        L_0x0059:
            r6 = 404(0x194, float:5.66E-43)
            q7.r3 r7 = r9.f13347a
            r8 = 0
            if (r4 != 0) goto L_0x00e4
            if (r11 != r6) goto L_0x0064
            goto L_0x00e4
        L_0x0064:
            z6.b r13 = r9.a()     // Catch:{ all -> 0x00e1 }
            ag.m r13 = (ag.m) r13     // Catch:{ all -> 0x00e1 }
            r13.getClass()     // Catch:{ all -> 0x00e1 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e1 }
            q7.x3 r3 = r1.f13162a     // Catch:{ all -> 0x00e1 }
            q7.w3 r3 = r3.F     // Catch:{ all -> 0x00e1 }
            q7.x3.l(r3)     // Catch:{ all -> 0x00e1 }
            r3.i()     // Catch:{ all -> 0x00e1 }
            boolean r3 = r1.E     // Catch:{ all -> 0x00e1 }
            long r4 = r1.G     // Catch:{ all -> 0x00e1 }
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r2 = r0
        L_0x0085:
            r2 = r2 | r3
            r1.E = r2     // Catch:{ all -> 0x00e1 }
            r1.G = r13     // Catch:{ all -> 0x00e1 }
            q7.k r13 = r9.f13350c     // Catch:{ all -> 0x00e1 }
            H(r13)     // Catch:{ all -> 0x00e1 }
            r13.o(r1)     // Catch:{ all -> 0x00e1 }
            q7.s2 r13 = r9.e()     // Catch:{ all -> 0x00e1 }
            q7.q2 r13 = r13.J     // Catch:{ all -> 0x00e1 }
            java.lang.String r14 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00e1 }
            r13.d(r1, r12, r14)     // Catch:{ all -> 0x00e1 }
            H(r7)     // Catch:{ all -> 0x00e1 }
            r7.i()     // Catch:{ all -> 0x00e1 }
            o.a r12 = r7.I     // Catch:{ all -> 0x00e1 }
            r12.put(r10, r8)     // Catch:{ all -> 0x00e1 }
            q7.z5 r10 = r9.E     // Catch:{ all -> 0x00e1 }
            q7.d3 r10 = r10.D     // Catch:{ all -> 0x00e1 }
            z6.b r12 = r9.a()     // Catch:{ all -> 0x00e1 }
            ag.m r12 = (ag.m) r12     // Catch:{ all -> 0x00e1 }
            r12.getClass()     // Catch:{ all -> 0x00e1 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e1 }
            r10.b(r12)     // Catch:{ all -> 0x00e1 }
            r10 = 503(0x1f7, float:7.05E-43)
            if (r11 == r10) goto L_0x00c8
            r10 = 429(0x1ad, float:6.01E-43)
            if (r11 != r10) goto L_0x00dc
        L_0x00c8:
            q7.z5 r10 = r9.E     // Catch:{ all -> 0x00e1 }
            q7.d3 r10 = r10.B     // Catch:{ all -> 0x00e1 }
            z6.b r11 = r9.a()     // Catch:{ all -> 0x00e1 }
            ag.m r11 = (ag.m) r11     // Catch:{ all -> 0x00e1 }
            r11.getClass()     // Catch:{ all -> 0x00e1 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e1 }
            r10.b(r11)     // Catch:{ all -> 0x00e1 }
        L_0x00dc:
            r9.C()     // Catch:{ all -> 0x00e1 }
            goto L_0x0184
        L_0x00e1:
            r10 = move-exception
            goto L_0x019a
        L_0x00e4:
            if (r14 == 0) goto L_0x00ef
            java.lang.String r12 = "Last-Modified"
            java.lang.Object r12 = r14.get(r12)     // Catch:{ all -> 0x00e1 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x00e1 }
            goto L_0x00f0
        L_0x00ef:
            r12 = r8
        L_0x00f0:
            if (r12 == 0) goto L_0x00ff
            boolean r2 = r12.isEmpty()     // Catch:{ all -> 0x00e1 }
            if (r2 != 0) goto L_0x00ff
            java.lang.Object r12 = r12.get(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00e1 }
            goto L_0x0100
        L_0x00ff:
            r12 = r8
        L_0x0100:
            if (r14 == 0) goto L_0x010b
            java.lang.String r2 = "ETag"
            java.lang.Object r14 = r14.get(r2)     // Catch:{ all -> 0x00e1 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x00e1 }
            goto L_0x010c
        L_0x010b:
            r14 = r8
        L_0x010c:
            if (r14 == 0) goto L_0x011b
            boolean r2 = r14.isEmpty()     // Catch:{ all -> 0x00e1 }
            if (r2 != 0) goto L_0x011b
            java.lang.Object r14 = r14.get(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00e1 }
            goto L_0x011c
        L_0x011b:
            r14 = r8
        L_0x011c:
            if (r11 == r6) goto L_0x0128
            if (r11 != r5) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            H(r7)     // Catch:{ all -> 0x00e1 }
            r7.w(r10, r13, r12, r14)     // Catch:{ all -> 0x00e1 }
            goto L_0x0137
        L_0x0128:
            H(r7)     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.measurement.t2 r12 = r7.s(r10)     // Catch:{ all -> 0x00e1 }
            if (r12 != 0) goto L_0x0137
            H(r7)     // Catch:{ all -> 0x00e1 }
            r7.w(r10, r8, r8, r8)     // Catch:{ all -> 0x00e1 }
        L_0x0137:
            z6.b r12 = r9.a()     // Catch:{ all -> 0x00e1 }
            ag.m r12 = (ag.m) r12     // Catch:{ all -> 0x00e1 }
            r12.getClass()     // Catch:{ all -> 0x00e1 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e1 }
            r1.f(r12)     // Catch:{ all -> 0x00e1 }
            q7.k r12 = r9.f13350c     // Catch:{ all -> 0x00e1 }
            H(r12)     // Catch:{ all -> 0x00e1 }
            r12.o(r1)     // Catch:{ all -> 0x00e1 }
            if (r11 != r6) goto L_0x015d
            q7.s2 r11 = r9.e()     // Catch:{ all -> 0x00e1 }
            q7.q2 r11 = r11.G     // Catch:{ all -> 0x00e1 }
            java.lang.String r12 = "Config not found. Using empty config. appId"
            r11.c(r10, r12)     // Catch:{ all -> 0x00e1 }
            goto L_0x016c
        L_0x015d:
            q7.s2 r10 = r9.e()     // Catch:{ all -> 0x00e1 }
            q7.q2 r10 = r10.J     // Catch:{ all -> 0x00e1 }
            java.lang.String r12 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00e1 }
            r10.d(r11, r3, r12)     // Catch:{ all -> 0x00e1 }
        L_0x016c:
            q7.y2 r10 = r9.f13349b     // Catch:{ all -> 0x00e1 }
            H(r10)     // Catch:{ all -> 0x00e1 }
            boolean r10 = r10.m()     // Catch:{ all -> 0x00e1 }
            if (r10 == 0) goto L_0x0181
            boolean r10 = r9.E()     // Catch:{ all -> 0x00e1 }
            if (r10 == 0) goto L_0x0181
            r9.t()     // Catch:{ all -> 0x00e1 }
            goto L_0x0184
        L_0x0181:
            r9.C()     // Catch:{ all -> 0x00e1 }
        L_0x0184:
            q7.k r10 = r9.f13350c     // Catch:{ all -> 0x00e1 }
            H(r10)     // Catch:{ all -> 0x00e1 }
            r10.n()     // Catch:{ all -> 0x00e1 }
            q7.k r10 = r9.f13350c     // Catch:{ all -> 0x01a3 }
            H(r10)     // Catch:{ all -> 0x01a3 }
            r10.P()     // Catch:{ all -> 0x01a3 }
            r9.O = r0
            r9.A()
            return
        L_0x019a:
            q7.k r11 = r9.f13350c     // Catch:{ all -> 0x01a3 }
            H(r11)     // Catch:{ all -> 0x01a3 }
            r11.P()     // Catch:{ all -> 0x01a3 }
            throw r10     // Catch:{ all -> 0x01a3 }
        L_0x01a3:
            r10 = move-exception
            r9.O = r0
            r9.A()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x03b3 A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ce A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03e1 A[SYNTHETIC, Splitter:B:149:0x03e1] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x046f A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x048b A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04f5 A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01fe A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0258 A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0265 A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0273 A[Catch:{ RuntimeException -> 0x035a, all -> 0x0529 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(q7.c7 r30) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            java.lang.String r3 = "com.android.vending"
            java.lang.String r4 = "_sysu"
            java.lang.String r5 = "_sys"
            java.lang.String r6 = "_pfo"
            java.lang.String r0 = "_npa"
            java.lang.String r7 = "_uwa"
            java.lang.String r8 = "app_id=?"
            q7.w3 r9 = r29.h()
            r9.i()
            r29.f()
            u6.q.i(r30)
            java.lang.String r9 = r2.f12948a
            u6.q.f(r9)
            boolean r10 = G(r30)
            if (r10 == 0) goto L_0x0533
            q7.k r10 = r1.f13350c
            H(r10)
            q7.l4 r10 = r10.C(r9)
            r11 = 0
            java.lang.String r13 = r2.f12949b
            if (r10 == 0) goto L_0x0061
            java.lang.String r14 = r10.I()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0061
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x0061
            r10.f(r11)
            q7.k r14 = r1.f13350c
            H(r14)
            r14.o(r10)
            q7.r3 r10 = r1.f13347a
            H(r10)
            r10.i()
            o.a r10 = r10.D
            r10.remove(r9)
        L_0x0061:
            boolean r10 = r2.D
            if (r10 != 0) goto L_0x0069
            r29.I(r30)
            return
        L_0x0069:
            long r14 = r2.I
            int r10 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x007c
            z6.b r10 = r29.a()
            ag.m r10 = (ag.m) r10
            r10.getClass()
            long r14 = java.lang.System.currentTimeMillis()
        L_0x007c:
            q7.x3 r10 = r1.H
            q7.n r11 = r10.p()
            android.content.Context r10 = r10.f13419a
            r11.i()
            r12 = 0
            r11.B = r12
            r22 = r13
            r12 = 0
            r11.C = r12
            r11 = 1
            int r13 = r2.J
            if (r13 == 0) goto L_0x00ae
            if (r13 == r11) goto L_0x00ae
            q7.s2 r12 = r29.e()
            q7.r2 r11 = q7.s2.r(r9)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r23 = r10
            java.lang.String r10 = "Incorrect app type, assuming installed app. appId, appType"
            q7.q2 r12 = r12.E
            r12.d(r11, r13, r10)
            r13 = 0
            goto L_0x00b0
        L_0x00ae:
            r23 = r10
        L_0x00b0:
            q7.k r10 = r1.f13350c
            H(r10)
            r10.O()
            q7.k r10 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r10)     // Catch:{ all -> 0x0529 }
            q7.y6 r10 = r10.H(r9, r0)     // Catch:{ all -> 0x0529 }
            if (r10 == 0) goto L_0x00cd
            java.lang.String r11 = "auto"
            java.lang.String r12 = r10.f13451b     // Catch:{ all -> 0x0529 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0529 }
            if (r11 == 0) goto L_0x0103
        L_0x00cd:
            java.lang.Boolean r11 = r2.N     // Catch:{ all -> 0x0529 }
            if (r11 == 0) goto L_0x00fe
            q7.w6 r0 = new q7.w6     // Catch:{ all -> 0x0529 }
            java.lang.String r20 = "_npa"
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0529 }
            r12 = 1
            if (r12 == r11) goto L_0x00df
            r11 = 0
            goto L_0x00e1
        L_0x00df:
            r11 = 1
        L_0x00e1:
            java.lang.Long r19 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0529 }
            java.lang.String r21 = "auto"
            r16 = r0
            r17 = r14
            r16.<init>(r17, r19, r20, r21)     // Catch:{ all -> 0x0529 }
            if (r10 == 0) goto L_0x00fa
            java.lang.Object r10 = r10.f13454e     // Catch:{ all -> 0x0529 }
            java.lang.Long r11 = r0.f13412d     // Catch:{ all -> 0x0529 }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x0529 }
            if (r10 != 0) goto L_0x0103
        L_0x00fa:
            r1.s(r0, r2)     // Catch:{ all -> 0x0529 }
            goto L_0x0103
        L_0x00fe:
            if (r10 == 0) goto L_0x0103
            r1.o(r0, r2)     // Catch:{ all -> 0x0529 }
        L_0x0103:
            q7.k r0 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r0)     // Catch:{ all -> 0x0529 }
            u6.q.i(r9)     // Catch:{ all -> 0x0529 }
            q7.l4 r0 = r0.C(r9)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x01f4
            r29.P()     // Catch:{ all -> 0x0529 }
            java.lang.String r10 = r0.I()     // Catch:{ all -> 0x0529 }
            java.lang.String r11 = r2.M     // Catch:{ all -> 0x0529 }
            java.lang.String r12 = r0.C()     // Catch:{ all -> 0x0529 }
            r24 = r4
            r4 = r22
            boolean r4 = q7.a7.Z(r4, r10, r11, r12)     // Catch:{ all -> 0x0529 }
            if (r4 == 0) goto L_0x01f6
            q7.s2 r4 = r29.e()     // Catch:{ all -> 0x0529 }
            q7.q2 r4 = r4.E     // Catch:{ all -> 0x0529 }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r11 = r0.E()     // Catch:{ all -> 0x0529 }
            q7.r2 r11 = q7.s2.r(r11)     // Catch:{ all -> 0x0529 }
            r4.c(r11, r10)     // Catch:{ all -> 0x0529 }
            q7.k r4 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r4)     // Catch:{ all -> 0x0529 }
            q7.k4 r10 = r4.f13121a
            java.lang.String r11 = r0.E()     // Catch:{ all -> 0x0529 }
            r4.j()     // Catch:{ all -> 0x0529 }
            r4.i()     // Catch:{ all -> 0x0529 }
            u6.q.f(r11)     // Catch:{ all -> 0x0529 }
            android.database.sqlite.SQLiteDatabase r0 = r4.B()     // Catch:{ SQLiteException -> 0x01dc }
            r4 = 1
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01dc }
            r4 = 0
            r12[r4] = r11     // Catch:{ SQLiteException -> 0x01dc }
            java.lang.String r4 = "events"
            int r4 = r0.delete(r4, r8, r12)     // Catch:{ SQLiteException -> 0x01dc }
            r22 = r5
            java.lang.String r5 = "user_attributes"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "conditional_properties"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "apps"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "raw_events"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "raw_events_metadata"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "event_filters"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "property_filters"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "audience_filter_values"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            java.lang.String r5 = "consent_settings"
            int r5 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d6 }
            int r4 = r4 + r5
            com.google.android.gms.internal.measurement.za.a()     // Catch:{ SQLiteException -> 0x01d6 }
            r5 = r10
            q7.x3 r5 = (q7.x3) r5     // Catch:{ SQLiteException -> 0x01d6 }
            q7.f r5 = r5.C     // Catch:{ SQLiteException -> 0x01d6 }
            r25 = r6
            q7.f2 r6 = q7.g2.f13050o0     // Catch:{ SQLiteException -> 0x01d4 }
            r26 = r7
            r7 = 0
            boolean r5 = r5.r(r7, r6)     // Catch:{ SQLiteException -> 0x01d2 }
            if (r5 == 0) goto L_0x01bc
            java.lang.String r5 = "default_event_params"
            int r0 = r0.delete(r5, r8, r12)     // Catch:{ SQLiteException -> 0x01d2 }
            int r4 = r4 + r0
        L_0x01bc:
            if (r4 <= 0) goto L_0x01f2
            r0 = r10
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x01d2 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x01d2 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x01d2 }
            q7.q2 r0 = r0.J     // Catch:{ SQLiteException -> 0x01d2 }
            java.lang.String r5 = "Deleted application data. app, records"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x01d2 }
            r0.d(r11, r4, r5)     // Catch:{ SQLiteException -> 0x01d2 }
            goto L_0x01f2
        L_0x01d2:
            r0 = move-exception
            goto L_0x01e0
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
        L_0x01d7:
            r25 = r6
        L_0x01d9:
            r26 = r7
            goto L_0x01e0
        L_0x01dc:
            r0 = move-exception
            r22 = r5
            goto L_0x01d7
        L_0x01e0:
            q7.x3 r10 = (q7.x3) r10     // Catch:{ all -> 0x0529 }
            q7.s2 r4 = r10.E     // Catch:{ all -> 0x0529 }
            q7.x3.l(r4)     // Catch:{ all -> 0x0529 }
            q7.q2 r4 = r4.B     // Catch:{ all -> 0x0529 }
            java.lang.String r5 = "Error deleting application data. appId, error"
            q7.r2 r6 = q7.s2.r(r11)     // Catch:{ all -> 0x0529 }
            r4.d(r6, r0, r5)     // Catch:{ all -> 0x0529 }
        L_0x01f2:
            r0 = 0
            goto L_0x01fc
        L_0x01f4:
            r24 = r4
        L_0x01f6:
            r22 = r5
            r25 = r6
            r26 = r7
        L_0x01fc:
            if (r0 == 0) goto L_0x0253
            long r4 = r0.A()     // Catch:{ all -> 0x0529 }
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0215
            long r4 = r0.A()     // Catch:{ all -> 0x0529 }
            long r10 = r2.F     // Catch:{ all -> 0x0529 }
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0215
            r4 = 1
            goto L_0x0216
        L_0x0215:
            r4 = 0
        L_0x0216:
            java.lang.String r5 = r0.G()     // Catch:{ all -> 0x0529 }
            long r10 = r0.A()     // Catch:{ all -> 0x0529 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x022e
            if (r5 == 0) goto L_0x022e
            java.lang.String r0 = r2.f12950c     // Catch:{ all -> 0x0529 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x022e
            r0 = 1
            goto L_0x022f
        L_0x022e:
            r0 = 0
        L_0x022f:
            r0 = r0 | r4
            if (r0 == 0) goto L_0x0253
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0529 }
            r0.<init>()     // Catch:{ all -> 0x0529 }
            java.lang.String r4 = "_pv"
            r0.putString(r4, r5)     // Catch:{ all -> 0x0529 }
            q7.s r4 = new q7.s     // Catch:{ all -> 0x0529 }
            java.lang.String r17 = "_au"
            q7.q r5 = new q7.q     // Catch:{ all -> 0x0529 }
            r5.<init>(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r19 = "auto"
            r16 = r4
            r18 = r5
            r20 = r14
            r16.<init>(r17, r18, r19, r20)     // Catch:{ all -> 0x0529 }
            r1.i(r4, r2)     // Catch:{ all -> 0x0529 }
        L_0x0253:
            r29.I(r30)     // Catch:{ all -> 0x0529 }
            if (r13 != 0) goto L_0x0265
            q7.k r0 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r4 = "_f"
            q7.p r0 = r0.G(r9, r4)     // Catch:{ all -> 0x0529 }
            r4 = 0
            goto L_0x0271
        L_0x0265:
            q7.k r0 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r4 = "_v"
            q7.p r0 = r0.G(r9, r4)     // Catch:{ all -> 0x0529 }
            r4 = 1
        L_0x0271:
            if (r0 != 0) goto L_0x04f5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r14 / r5
            r10 = 1
            long r7 = r7 + r10
            long r7 = r7 * r5
            java.lang.String r5 = "_dac"
            java.lang.String r6 = "_et"
            java.lang.String r10 = "_r"
            java.lang.String r11 = "_c"
            boolean r12 = r2.L
            if (r4 != 0) goto L_0x04a7
            q7.w6 r0 = new q7.w6     // Catch:{ all -> 0x0529 }
            java.lang.String r20 = "_fot"
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0529 }
            java.lang.String r21 = "auto"
            r16 = r0
            r17 = r14
            r16.<init>(r17, r19, r20, r21)     // Catch:{ all -> 0x0529 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0529 }
            q7.w3 r0 = r29.h()     // Catch:{ all -> 0x0529 }
            r0.i()     // Catch:{ all -> 0x0529 }
            q7.j3 r0 = r1.G     // Catch:{ all -> 0x0529 }
            u6.q.i(r0)     // Catch:{ all -> 0x0529 }
            boolean r4 = r9.isEmpty()     // Catch:{ all -> 0x0529 }
            q7.x3 r7 = r0.f13136a
            if (r4 == 0) goto L_0x02c0
            q7.s2 r0 = r7.E     // Catch:{ all -> 0x0529 }
            q7.x3.l(r0)     // Catch:{ all -> 0x0529 }
            q7.q2 r0 = r0.F     // Catch:{ all -> 0x0529 }
            java.lang.String r3 = "Install Referrer Reporter was called with invalid app package name"
            r0.b(r3)     // Catch:{ all -> 0x0529 }
        L_0x02bc:
            r27 = r14
            goto L_0x037f
        L_0x02c0:
            q7.w3 r4 = r7.F     // Catch:{ all -> 0x0529 }
            q7.x3.l(r4)     // Catch:{ all -> 0x0529 }
            r4.i()     // Catch:{ all -> 0x0529 }
            boolean r4 = r0.a()     // Catch:{ all -> 0x0529 }
            if (r4 != 0) goto L_0x02db
            q7.s2 r0 = r7.E     // Catch:{ all -> 0x0529 }
            q7.x3.l(r0)     // Catch:{ all -> 0x0529 }
            q7.q2 r0 = r0.H     // Catch:{ all -> 0x0529 }
            java.lang.String r3 = "Install Referrer Reporter is not available"
            r0.b(r3)     // Catch:{ all -> 0x0529 }
            goto L_0x02bc
        L_0x02db:
            q7.i3 r4 = new q7.i3     // Catch:{ all -> 0x0529 }
            r4.<init>(r0, r9)     // Catch:{ all -> 0x0529 }
            q7.w3 r8 = r7.F     // Catch:{ all -> 0x0529 }
            android.content.Context r13 = r7.f13419a
            q7.x3.l(r8)     // Catch:{ all -> 0x0529 }
            r8.i()     // Catch:{ all -> 0x0529 }
            android.content.Intent r8 = new android.content.Intent     // Catch:{ all -> 0x0529 }
            java.lang.String r2 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r8.<init>(r2)     // Catch:{ all -> 0x0529 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ all -> 0x0529 }
            r27 = r14
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r2.<init>(r3, r14)     // Catch:{ all -> 0x0529 }
            r8.setComponent(r2)     // Catch:{ all -> 0x0529 }
            android.content.pm.PackageManager r2 = r13.getPackageManager()     // Catch:{ all -> 0x0529 }
            q7.s2 r7 = r7.E
            if (r2 != 0) goto L_0x0311
            q7.x3.l(r7)     // Catch:{ all -> 0x0529 }
            q7.q2 r0 = r7.F     // Catch:{ all -> 0x0529 }
            java.lang.String r2 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.b(r2)     // Catch:{ all -> 0x0529 }
            goto L_0x037f
        L_0x0311:
            r14 = 0
            java.util.List r2 = r2.queryIntentServices(r8, r14)     // Catch:{ all -> 0x0529 }
            if (r2 == 0) goto L_0x0375
            boolean r15 = r2.isEmpty()     // Catch:{ all -> 0x0529 }
            if (r15 != 0) goto L_0x0375
            java.lang.Object r2 = r2.get(r14)     // Catch:{ all -> 0x0529 }
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2     // Catch:{ all -> 0x0529 }
            android.content.pm.ServiceInfo r2 = r2.serviceInfo     // Catch:{ all -> 0x0529 }
            if (r2 == 0) goto L_0x037f
            java.lang.String r14 = r2.packageName     // Catch:{ all -> 0x0529 }
            java.lang.String r2 = r2.name     // Catch:{ all -> 0x0529 }
            if (r2 == 0) goto L_0x036a
            boolean r2 = r3.equals(r14)     // Catch:{ all -> 0x0529 }
            if (r2 == 0) goto L_0x036a
            boolean r0 = r0.a()     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x036a
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0529 }
            r0.<init>(r8)     // Catch:{ all -> 0x0529 }
            y6.a r2 = y6.a.b()     // Catch:{ RuntimeException -> 0x035a }
            r3 = 1
            boolean r0 = r2.a(r13, r0, r4, r3)     // Catch:{ RuntimeException -> 0x035a }
            q7.x3.l(r7)     // Catch:{ RuntimeException -> 0x035a }
            q7.q2 r2 = r7.J     // Catch:{ RuntimeException -> 0x035a }
            java.lang.String r3 = "Install Referrer Service is"
            if (r0 == 0) goto L_0x0354
            java.lang.String r0 = "available"
            goto L_0x0356
        L_0x0354:
            java.lang.String r0 = "not available"
        L_0x0356:
            r2.c(r0, r3)     // Catch:{ RuntimeException -> 0x035a }
            goto L_0x037f
        L_0x035a:
            r0 = move-exception
            q7.x3.l(r7)     // Catch:{ all -> 0x0529 }
            q7.q2 r2 = r7.B     // Catch:{ all -> 0x0529 }
            java.lang.String r3 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0529 }
            r2.c(r0, r3)     // Catch:{ all -> 0x0529 }
            goto L_0x037f
        L_0x036a:
            q7.x3.l(r7)     // Catch:{ all -> 0x0529 }
            q7.q2 r0 = r7.E     // Catch:{ all -> 0x0529 }
            java.lang.String r2 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.b(r2)     // Catch:{ all -> 0x0529 }
            goto L_0x037f
        L_0x0375:
            q7.x3.l(r7)     // Catch:{ all -> 0x0529 }
            q7.q2 r0 = r7.H     // Catch:{ all -> 0x0529 }
            java.lang.String r2 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.b(r2)     // Catch:{ all -> 0x0529 }
        L_0x037f:
            q7.w3 r0 = r29.h()     // Catch:{ all -> 0x0529 }
            r0.i()     // Catch:{ all -> 0x0529 }
            r29.f()     // Catch:{ all -> 0x0529 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0529 }
            r2.<init>()     // Catch:{ all -> 0x0529 }
            r3 = 1
            r2.putLong(r11, r3)     // Catch:{ all -> 0x0529 }
            r2.putLong(r10, r3)     // Catch:{ all -> 0x0529 }
            r3 = r26
            r7 = 0
            r2.putLong(r3, r7)     // Catch:{ all -> 0x0529 }
            r4 = r25
            r2.putLong(r4, r7)     // Catch:{ all -> 0x0529 }
            r10 = r22
            r2.putLong(r10, r7)     // Catch:{ all -> 0x0529 }
            r11 = r24
            r2.putLong(r11, r7)     // Catch:{ all -> 0x0529 }
            r7 = 1
            r2.putLong(r6, r7)     // Catch:{ all -> 0x0529 }
            if (r12 == 0) goto L_0x03b6
            r2.putLong(r5, r7)     // Catch:{ all -> 0x0529 }
        L_0x03b6:
            q7.k r0 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r0)     // Catch:{ all -> 0x0529 }
            u6.q.f(r9)     // Catch:{ all -> 0x0529 }
            r0.i()     // Catch:{ all -> 0x0529 }
            r0.j()     // Catch:{ all -> 0x0529 }
            long r12 = r0.z(r9)     // Catch:{ all -> 0x0529 }
            android.content.pm.PackageManager r0 = r23.getPackageManager()     // Catch:{ all -> 0x0529 }
            if (r0 != 0) goto L_0x03e1
            q7.s2 r0 = r29.e()     // Catch:{ all -> 0x0529 }
            q7.q2 r0 = r0.B     // Catch:{ all -> 0x0529 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            q7.r2 r5 = q7.s2.r(r9)     // Catch:{ all -> 0x0529 }
            r0.c(r5, r3)     // Catch:{ all -> 0x0529 }
            r14 = r30
            goto L_0x0485
        L_0x03e1:
            b7.b r0 = b7.c.a(r23)     // Catch:{ NameNotFoundException -> 0x03eb }
            r5 = 0
            android.content.pm.PackageInfo r7 = r0.b(r5, r9)     // Catch:{ NameNotFoundException -> 0x03eb }
            goto L_0x03fc
        L_0x03eb:
            r0 = move-exception
            q7.s2 r5 = r29.e()     // Catch:{ all -> 0x0529 }
            q7.q2 r5 = r5.B     // Catch:{ all -> 0x0529 }
            java.lang.String r6 = "Package info is null, first open report might be inaccurate. appId"
            q7.r2 r7 = q7.s2.r(r9)     // Catch:{ all -> 0x0529 }
            r5.d(r7, r0, r6)     // Catch:{ all -> 0x0529 }
            r7 = 0
        L_0x03fc:
            if (r7 == 0) goto L_0x044f
            long r5 = r7.firstInstallTime     // Catch:{ all -> 0x0529 }
            r14 = 0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x044f
            long r7 = r7.lastUpdateTime     // Catch:{ all -> 0x0529 }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x042e
            q7.f r0 = r29.J()     // Catch:{ all -> 0x0529 }
            q7.f2 r5 = q7.g2.f13029d0     // Catch:{ all -> 0x0529 }
            r6 = 0
            boolean r0 = r0.r(r6, r5)     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0427
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x042c
            r7 = 1
            r2.putLong(r3, r7)     // Catch:{ all -> 0x0529 }
            r12 = 0
            goto L_0x042c
        L_0x0427:
            r7 = 1
            r2.putLong(r3, r7)     // Catch:{ all -> 0x0529 }
        L_0x042c:
            r0 = 0
            goto L_0x0430
        L_0x042e:
            r6 = 0
            r0 = 1
        L_0x0430:
            q7.w6 r3 = new q7.w6     // Catch:{ all -> 0x0529 }
            java.lang.String r20 = "_fi"
            r5 = 1
            if (r5 == r0) goto L_0x043a
            r7 = 0
            goto L_0x043c
        L_0x043a:
            r7 = 1
        L_0x043c:
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0529 }
            java.lang.String r21 = "auto"
            r16 = r3
            r17 = r27
            r16.<init>(r17, r19, r20, r21)     // Catch:{ all -> 0x0529 }
            r14 = r30
            r1.s(r3, r14)     // Catch:{ all -> 0x0529 }
            goto L_0x0452
        L_0x044f:
            r14 = r30
            r6 = 0
        L_0x0452:
            b7.b r0 = b7.c.a(r23)     // Catch:{ NameNotFoundException -> 0x045c }
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r0.a(r3, r9)     // Catch:{ NameNotFoundException -> 0x045c }
            goto L_0x046d
        L_0x045c:
            r0 = move-exception
            q7.s2 r3 = r29.e()     // Catch:{ all -> 0x0529 }
            q7.q2 r3 = r3.B     // Catch:{ all -> 0x0529 }
            java.lang.String r5 = "Application info is null, first open report might be inaccurate. appId"
            q7.r2 r7 = q7.s2.r(r9)     // Catch:{ all -> 0x0529 }
            r3.d(r7, r0, r5)     // Catch:{ all -> 0x0529 }
            r0 = r6
        L_0x046d:
            if (r0 == 0) goto L_0x0485
            int r3 = r0.flags     // Catch:{ all -> 0x0529 }
            r5 = 1
            r3 = r3 & r5
            if (r3 == 0) goto L_0x047a
            r5 = 1
            r2.putLong(r10, r5)     // Catch:{ all -> 0x0529 }
        L_0x047a:
            int r0 = r0.flags     // Catch:{ all -> 0x0529 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0485
            r5 = 1
            r2.putLong(r11, r5)     // Catch:{ all -> 0x0529 }
        L_0x0485:
            r5 = 0
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x048e
            r2.putLong(r4, r12)     // Catch:{ all -> 0x0529 }
        L_0x048e:
            q7.s r0 = new q7.s     // Catch:{ all -> 0x0529 }
            java.lang.String r17 = "_f"
            q7.q r3 = new q7.q     // Catch:{ all -> 0x0529 }
            r3.<init>(r2)     // Catch:{ all -> 0x0529 }
            java.lang.String r19 = "auto"
            r16 = r0
            r18 = r3
            r20 = r27
            r16.<init>(r17, r18, r19, r20)     // Catch:{ all -> 0x0529 }
            r1.k(r0, r14)     // Catch:{ all -> 0x0529 }
            goto L_0x0518
        L_0x04a7:
            r27 = r14
            r14 = r2
            q7.w6 r0 = new q7.w6     // Catch:{ all -> 0x0529 }
            java.lang.String r20 = "_fvt"
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0529 }
            java.lang.String r21 = "auto"
            r16 = r0
            r17 = r27
            r16.<init>(r17, r19, r20, r21)     // Catch:{ all -> 0x0529 }
            r1.s(r0, r14)     // Catch:{ all -> 0x0529 }
            q7.w3 r0 = r29.h()     // Catch:{ all -> 0x0529 }
            r0.i()     // Catch:{ all -> 0x0529 }
            r29.f()     // Catch:{ all -> 0x0529 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0529 }
            r0.<init>()     // Catch:{ all -> 0x0529 }
            r2 = 1
            r0.putLong(r11, r2)     // Catch:{ all -> 0x0529 }
            r0.putLong(r10, r2)     // Catch:{ all -> 0x0529 }
            r0.putLong(r6, r2)     // Catch:{ all -> 0x0529 }
            if (r12 == 0) goto L_0x04dd
            r0.putLong(r5, r2)     // Catch:{ all -> 0x0529 }
        L_0x04dd:
            q7.s r2 = new q7.s     // Catch:{ all -> 0x0529 }
            java.lang.String r17 = "_v"
            q7.q r3 = new q7.q     // Catch:{ all -> 0x0529 }
            r3.<init>(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r19 = "auto"
            r16 = r2
            r18 = r3
            r20 = r27
            r16.<init>(r17, r18, r19, r20)     // Catch:{ all -> 0x0529 }
            r1.k(r2, r14)     // Catch:{ all -> 0x0529 }
            goto L_0x0518
        L_0x04f5:
            r27 = r14
            r14 = r2
            boolean r0 = r14.E     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x0518
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0529 }
            r0.<init>()     // Catch:{ all -> 0x0529 }
            q7.s r2 = new q7.s     // Catch:{ all -> 0x0529 }
            java.lang.String r17 = "_cd"
            q7.q r3 = new q7.q     // Catch:{ all -> 0x0529 }
            r3.<init>(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r19 = "auto"
            r16 = r2
            r18 = r3
            r20 = r27
            r16.<init>(r17, r18, r19, r20)     // Catch:{ all -> 0x0529 }
            r1.k(r2, r14)     // Catch:{ all -> 0x0529 }
        L_0x0518:
            q7.k r0 = r1.f13350c     // Catch:{ all -> 0x0529 }
            H(r0)     // Catch:{ all -> 0x0529 }
            r0.n()     // Catch:{ all -> 0x0529 }
            q7.k r0 = r1.f13350c
            H(r0)
            r0.P()
            return
        L_0x0529:
            r0 = move-exception
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            throw r0
        L_0x0533:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.m(q7.c7):void");
    }

    public final void n(c cVar, c7 c7Var) {
        q.i(cVar);
        q.f(cVar.f12926a);
        q.i(cVar.f12928c);
        q.f(cVar.f12928c.f13410b);
        h().i();
        f();
        if (G(c7Var)) {
            if (c7Var.D) {
                k kVar = this.f13350c;
                H(kVar);
                kVar.O();
                try {
                    I(c7Var);
                    String str = cVar.f12926a;
                    q.i(str);
                    k kVar2 = this.f13350c;
                    H(kVar2);
                    c D2 = kVar2.D(str, cVar.f12928c.f13410b);
                    x3 x3Var = this.H;
                    if (D2 != null) {
                        e().I.d(cVar.f12926a, x3Var.I.f(cVar.f12928c.f13410b), "Removing conditional user property");
                        k kVar3 = this.f13350c;
                        H(kVar3);
                        kVar3.x(str, cVar.f12928c.f13410b);
                        if (D2.f12930e) {
                            k kVar4 = this.f13350c;
                            H(kVar4);
                            kVar4.m(str, cVar.f12928c.f13410b);
                        }
                        s sVar = cVar.G;
                        if (sVar != null) {
                            q qVar = sVar.f13312b;
                            s q02 = P().q0(sVar.f13311a, qVar != null ? qVar.w() : null, D2.f12927b, sVar.f13314d, true);
                            q.i(q02);
                            u(q02, c7Var);
                        }
                    } else {
                        e().E.d(s2.r(cVar.f12926a), x3Var.I.f(cVar.f12928c.f13410b), "Conditional user property doesn't exist");
                    }
                    k kVar5 = this.f13350c;
                    H(kVar5);
                    kVar5.n();
                } finally {
                    k kVar6 = this.f13350c;
                    H(kVar6);
                    kVar6.P();
                }
            } else {
                I(c7Var);
            }
        }
    }

    public final void o(String str, c7 c7Var) {
        Boolean bool;
        h().i();
        f();
        if (G(c7Var)) {
            if (!c7Var.D) {
                I(c7Var);
            } else if (!"_npa".equals(str) || (bool = c7Var.N) == null) {
                s2 e10 = e();
                x3 x3Var = this.H;
                e10.I.c(x3Var.I.f(str), "Removing user property");
                k kVar = this.f13350c;
                H(kVar);
                kVar.O();
                try {
                    I(c7Var);
                    boolean equals = "_id".equals(str);
                    String str2 = c7Var.f12948a;
                    if (equals) {
                        k kVar2 = this.f13350c;
                        H(kVar2);
                        q.i(str2);
                        kVar2.m(str2, "_lair");
                    }
                    k kVar3 = this.f13350c;
                    H(kVar3);
                    q.i(str2);
                    kVar3.m(str2, str);
                    k kVar4 = this.f13350c;
                    H(kVar4);
                    kVar4.n();
                    e().I.c(x3Var.I.f(str), "User property removed");
                } finally {
                    k kVar5 = this.f13350c;
                    H(kVar5);
                    kVar5.P();
                }
            } else {
                e().I.b("Falling back to manifest metadata value for ad personalization");
                ((m) a()).getClass();
                s(new w6(System.currentTimeMillis(), Long.valueOf(true != bool.booleanValue() ? 0 : 1), "_npa", "auto"), c7Var);
            }
        }
    }

    public final void p(c7 c7Var) {
        if (this.T != null) {
            ArrayList arrayList = new ArrayList();
            this.U = arrayList;
            arrayList.addAll(this.T);
        }
        k kVar = this.f13350c;
        H(kVar);
        k4 k4Var = kVar.f13121a;
        String str = c7Var.f12948a;
        q.i(str);
        q.f(str);
        kVar.i();
        kVar.j();
        try {
            SQLiteDatabase B2 = kVar.B();
            String[] strArr = {str};
            int delete = B2.delete("apps", "app_id=?", strArr) + B2.delete("events", "app_id=?", strArr) + B2.delete("user_attributes", "app_id=?", strArr) + B2.delete("conditional_properties", "app_id=?", strArr) + B2.delete("raw_events", "app_id=?", strArr) + B2.delete("raw_events_metadata", "app_id=?", strArr) + B2.delete("queue", "app_id=?", strArr) + B2.delete("audience_filter_values", "app_id=?", strArr) + B2.delete("main_event_params", "app_id=?", strArr) + B2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.J.d(str, Integer.valueOf(delete), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error resetting analytics data. appId, error");
        }
        if (c7Var.D) {
            m(c7Var);
        }
    }

    public final void q(c cVar, c7 c7Var) {
        s sVar;
        q.i(cVar);
        q.f(cVar.f12926a);
        q.i(cVar.f12927b);
        q.i(cVar.f12928c);
        q.f(cVar.f12928c.f13410b);
        h().i();
        f();
        if (G(c7Var)) {
            if (!c7Var.D) {
                I(c7Var);
                return;
            }
            c cVar2 = new c(cVar);
            boolean z10 = false;
            cVar2.f12930e = false;
            k kVar = this.f13350c;
            H(kVar);
            kVar.O();
            try {
                k kVar2 = this.f13350c;
                H(kVar2);
                String str = cVar2.f12926a;
                q.i(str);
                c D2 = kVar2.D(str, cVar2.f12928c.f13410b);
                x3 x3Var = this.H;
                if (D2 != null) {
                    if (!D2.f12927b.equals(cVar2.f12927b)) {
                        e().E.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", x3Var.I.f(cVar2.f12928c.f13410b), cVar2.f12927b, D2.f12927b);
                    }
                }
                if (D2 != null && D2.f12930e) {
                    cVar2.f12927b = D2.f12927b;
                    cVar2.f12929d = D2.f12929d;
                    cVar2.D = D2.D;
                    cVar2.B = D2.B;
                    cVar2.E = D2.E;
                    cVar2.f12930e = true;
                    w6 w6Var = cVar2.f12928c;
                    cVar2.f12928c = new w6(D2.f12928c.f13411c, w6Var.w(), w6Var.f13410b, D2.f12928c.B);
                } else if (TextUtils.isEmpty(cVar2.B)) {
                    w6 w6Var2 = cVar2.f12928c;
                    cVar2.f12928c = new w6(cVar2.f12929d, w6Var2.w(), w6Var2.f13410b, cVar2.f12928c.B);
                    cVar2.f12930e = true;
                    z10 = true;
                }
                if (cVar2.f12930e) {
                    w6 w6Var3 = cVar2.f12928c;
                    String str2 = cVar2.f12926a;
                    q.i(str2);
                    String str3 = cVar2.f12927b;
                    String str4 = w6Var3.f13410b;
                    long j10 = w6Var3.f13411c;
                    Object w10 = w6Var3.w();
                    q.i(w10);
                    y6 y6Var = new y6(str2, str3, str4, j10, w10);
                    Object obj = y6Var.f13454e;
                    String str5 = y6Var.f13452c;
                    k kVar3 = this.f13350c;
                    H(kVar3);
                    if (kVar3.t(y6Var)) {
                        e().I.e("User property updated immediately", cVar2.f12926a, x3Var.I.f(str5), obj);
                    } else {
                        e().B.e("(2)Too many active user properties, ignoring", s2.r(cVar2.f12926a), x3Var.I.f(str5), obj);
                    }
                    if (z10 && (sVar = cVar2.E) != null) {
                        u(new s(sVar, cVar2.f12929d), c7Var);
                    }
                }
                k kVar4 = this.f13350c;
                H(kVar4);
                if (kVar4.s(cVar2)) {
                    e().I.e("Conditional property added", cVar2.f12926a, x3Var.I.f(cVar2.f12928c.f13410b), cVar2.f12928c.w());
                } else {
                    e().B.e("Too many conditional properties, ignoring", s2.r(cVar2.f12926a), x3Var.I.f(cVar2.f12928c.f13410b), cVar2.f12928c.w());
                }
                k kVar5 = this.f13350c;
                H(kVar5);
                kVar5.n();
            } finally {
                k kVar6 = this.f13350c;
                H(kVar6);
                kVar6.P();
            }
        }
    }

    public final void r(String str, h hVar) {
        h().i();
        f();
        this.W.put(str, hVar);
        k kVar = this.f13350c;
        H(kVar);
        k4 k4Var = kVar.f13121a;
        q.i(str);
        kVar.i();
        kVar.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", hVar.e());
        try {
            if (kVar.B().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.c(s2.r(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.d(s2.r(str), e10, "Error storing consent setting. appId, error");
        }
    }

    public final void s(w6 w6Var, c7 c7Var) {
        long j10;
        w6 w6Var2 = w6Var;
        c7 c7Var2 = c7Var;
        h().i();
        f();
        if (G(c7Var)) {
            if (!c7Var2.D) {
                I(c7Var2);
                return;
            }
            int j02 = P().j0(w6Var2.f13410b);
            s sVar = this.f13348a0;
            String str = w6Var2.f13410b;
            if (j02 != 0) {
                P();
                J();
                String p10 = a7.p(str, 24, true);
                int length = str != null ? str.length() : 0;
                P();
                a7.z(sVar, c7Var2.f12948a, j02, "_ev", p10, length);
                return;
            }
            int f02 = P().f0(w6Var.w(), str);
            if (f02 != 0) {
                P();
                J();
                String p11 = a7.p(str, 24, true);
                Object w10 = w6Var.w();
                int length2 = (w10 == null || (!(w10 instanceof String) && !(w10 instanceof CharSequence))) ? 0 : w10.toString().length();
                P();
                a7.z(sVar, c7Var2.f12948a, f02, "_ev", p11, length2);
                return;
            }
            Object n2 = P().n(w6Var.w(), str);
            if (n2 != null) {
                boolean equals = "_sid".equals(str);
                String str2 = c7Var2.f12948a;
                if (equals) {
                    long j11 = w6Var2.f13411c;
                    String str3 = w6Var2.B;
                    q.i(str2);
                    k kVar = this.f13350c;
                    H(kVar);
                    y6 H2 = kVar.H(str2, "_sno");
                    if (H2 != null) {
                        Object obj = H2.f13454e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            s(new w6(j11, Long.valueOf(j10 + 1), "_sno", str3), c7Var2);
                        }
                    }
                    if (H2 != null) {
                        e().E.c(H2.f13454e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    k kVar2 = this.f13350c;
                    H(kVar2);
                    p G2 = kVar2.G(str2, "_s");
                    if (G2 != null) {
                        s2 e10 = e();
                        long j12 = G2.f13255c;
                        e10.J.c(Long.valueOf(j12), "Backfill the session number. Last used session number");
                        j10 = j12;
                    } else {
                        j10 = 0;
                    }
                    s(new w6(j11, Long.valueOf(j10 + 1), "_sno", str3), c7Var2);
                }
                q.i(str2);
                String str4 = w6Var2.B;
                q.i(str4);
                y6 y6Var = new y6(str2, str4, w6Var2.f13410b, w6Var2.f13411c, n2);
                s2 e11 = e();
                x3 x3Var = this.H;
                n2 n2Var = x3Var.I;
                String str5 = y6Var.f13452c;
                e11.J.d(n2Var.f(str5), n2, "Setting user property");
                k kVar3 = this.f13350c;
                H(kVar3);
                kVar3.O();
                try {
                    boolean equals2 = "_id".equals(str5);
                    Object obj2 = y6Var.f13454e;
                    if (equals2) {
                        k kVar4 = this.f13350c;
                        H(kVar4);
                        y6 H3 = kVar4.H(str2, "_id");
                        if (H3 != null && !obj2.equals(H3.f13454e)) {
                            k kVar5 = this.f13350c;
                            H(kVar5);
                            kVar5.m(str2, "_lair");
                        }
                    }
                    I(c7Var2);
                    k kVar6 = this.f13350c;
                    H(kVar6);
                    boolean t2 = kVar6.t(y6Var);
                    k kVar7 = this.f13350c;
                    H(kVar7);
                    kVar7.n();
                    if (!t2) {
                        e().B.d(x3Var.I.f(str5), obj2, "Too many unique user properties are set. Ignoring user property");
                        P();
                        a7.z(sVar, c7Var2.f12948a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    k kVar8 = this.f13350c;
                    H(kVar8);
                    kVar8.P();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:317|318) */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x029b, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r7 = r7.subList(0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0331, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        e().n().d(q7.s2.r(r10), r9.a(), "Failed to parse upload URL. Not uploading. appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0778, code lost:
        if (r6 != null) goto L_0x077a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        if (r12 != null) goto L_0x012b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:317:0x06e8 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ca A[SYNTHETIC, Splitter:B:162:0x02ca] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d3 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x045a A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0474 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0496 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04f0 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04f2 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0526 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0528 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x052b A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0553 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0555 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0558 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05b2 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05d5 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05d7 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05da A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05e6 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05fc A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0704 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0784 A[Catch:{ all -> 0x0632, all -> 0x07a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x079e A[SYNTHETIC, Splitter:B:360:0x079e] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0612 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0136 A[Catch:{ all -> 0x0131, all -> 0x07a5 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:159:0x02b1=Splitter:B:159:0x02b1, B:148:0x0298=Splitter:B:148:0x0298, B:193:0x0338=Splitter:B:193:0x0338, B:317:0x06e8=Splitter:B:317:0x06e8, B:346:0x077a=Splitter:B:346:0x077a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r26 = this;
            r1 = r26
            q7.y2 r3 = r1.f13349b
            q7.x3 r2 = r1.H
            q7.w3 r4 = r26.h()
            r4.i()
            r26.f()
            r4 = 1
            r1.Q = r4
            r9 = 0
            r2.getClass()     // Catch:{ all -> 0x07a5 }
            q7.x5 r2 = r2.u()     // Catch:{ all -> 0x07a5 }
            java.lang.Boolean r2 = r2.f13434e     // Catch:{ all -> 0x07a5 }
            if (r2 != 0) goto L_0x002e
            q7.s2 r2 = r26.e()     // Catch:{ all -> 0x07a5 }
            q7.q2 r2 = r2.E     // Catch:{ all -> 0x07a5 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r2.b(r3)     // Catch:{ all -> 0x07a5 }
            r1.Q = r9
            goto L_0x0795
        L_0x002e:
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x07a5 }
            if (r2 == 0) goto L_0x0043
            q7.s2 r2 = r26.e()     // Catch:{ all -> 0x07a5 }
            q7.q2 r2 = r2.B     // Catch:{ all -> 0x07a5 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r2.b(r3)     // Catch:{ all -> 0x07a5 }
            r1.Q = r9
            goto L_0x0795
        L_0x0043:
            long r5 = r1.K     // Catch:{ all -> 0x07a5 }
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0052
            r26.C()     // Catch:{ all -> 0x07a5 }
            r1.Q = r9
            goto L_0x0795
        L_0x0052:
            q7.w3 r2 = r26.h()     // Catch:{ all -> 0x07a5 }
            r2.i()     // Catch:{ all -> 0x07a5 }
            java.util.ArrayList r2 = r1.T     // Catch:{ all -> 0x07a5 }
            if (r2 == 0) goto L_0x006c
            q7.s2 r2 = r26.e()     // Catch:{ all -> 0x07a5 }
            q7.q2 r2 = r2.J     // Catch:{ all -> 0x07a5 }
            java.lang.String r3 = "Uploading requested multiple times"
            r2.b(r3)     // Catch:{ all -> 0x07a5 }
            r1.Q = r9
            goto L_0x0795
        L_0x006c:
            H(r3)     // Catch:{ all -> 0x07a5 }
            boolean r2 = r3.m()     // Catch:{ all -> 0x07a5 }
            if (r2 != 0) goto L_0x0087
            q7.s2 r2 = r26.e()     // Catch:{ all -> 0x07a5 }
            q7.q2 r2 = r2.J     // Catch:{ all -> 0x07a5 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r2.b(r3)     // Catch:{ all -> 0x07a5 }
            r26.C()     // Catch:{ all -> 0x07a5 }
            r1.Q = r9
            goto L_0x0795
        L_0x0087:
            z6.b r2 = r26.a()     // Catch:{ all -> 0x07a5 }
            ag.m r2 = (ag.m) r2     // Catch:{ all -> 0x07a2 }
            r2.getClass()     // Catch:{ all -> 0x07a2 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x07a2 }
            q7.f r2 = r26.J()     // Catch:{ all -> 0x07a5 }
            q7.f2 r10 = q7.g2.S     // Catch:{ all -> 0x07a5 }
            r11 = 0
            int r2 = r2.l(r11, r10)     // Catch:{ all -> 0x07a5 }
            r26.J()     // Catch:{ all -> 0x07a5 }
            q7.f2 r10 = q7.g2.f13032f     // Catch:{ all -> 0x07a5 }
            java.lang.Object r10 = r10.a(r11)     // Catch:{ all -> 0x07a5 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x07a5 }
            long r12 = r10.longValue()     // Catch:{ all -> 0x07a5 }
            long r12 = r5 - r12
            r10 = r9
        L_0x00b1:
            if (r10 >= r2) goto L_0x00bc
            boolean r14 = r1.D(r12)     // Catch:{ all -> 0x07a5 }
            if (r14 == 0) goto L_0x00bc
            int r10 = r10 + 1
            goto L_0x00b1
        L_0x00bc:
            q7.z5 r2 = r1.E     // Catch:{ all -> 0x07a5 }
            q7.d3 r2 = r2.C     // Catch:{ all -> 0x07a5 }
            long r12 = r2.a()     // Catch:{ all -> 0x07a5 }
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00dd
            q7.s2 r2 = r26.e()     // Catch:{ all -> 0x07a5 }
            q7.q2 r2 = r2.I     // Catch:{ all -> 0x07a5 }
            java.lang.String r7 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r12 = r5 - r12
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x07a5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x07a5 }
            r2.c(r8, r7)     // Catch:{ all -> 0x07a5 }
        L_0x00dd:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x07a5 }
            H(r2)     // Catch:{ all -> 0x07a5 }
            java.lang.String r10 = r2.J()     // Catch:{ all -> 0x07a5 }
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x07a5 }
            r7 = -1
            if (r2 != 0) goto L_0x0708
            long r12 = r1.V     // Catch:{ all -> 0x07a5 }
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x013a
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x07a5 }
            H(r2)     // Catch:{ all -> 0x07a5 }
            android.database.sqlite.SQLiteDatabase r12 = r2.B()     // Catch:{ SQLiteException -> 0x0115, all -> 0x0112 }
            java.lang.String r13 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r12 = r12.rawQuery(r13, r11)     // Catch:{ SQLiteException -> 0x0115, all -> 0x0112 }
            boolean r13 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x010f }
            if (r13 != 0) goto L_0x010a
            goto L_0x012b
        L_0x010a:
            long r7 = r12.getLong(r9)     // Catch:{ SQLiteException -> 0x010f }
            goto L_0x012b
        L_0x010f:
            r0 = move-exception
            r13 = r0
            goto L_0x0118
        L_0x0112:
            r0 = move-exception
            r2 = r0
            goto L_0x0134
        L_0x0115:
            r0 = move-exception
            r13 = r0
            r12 = r11
        L_0x0118:
            q7.k4 r2 = r2.f13121a     // Catch:{ all -> 0x0131 }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x0131 }
            q7.s2 r2 = r2.e()     // Catch:{ all -> 0x0131 }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x0131 }
            java.lang.String r14 = "Error querying raw events"
            r2.c(r13, r14)     // Catch:{ all -> 0x0131 }
            if (r12 == 0) goto L_0x012e
        L_0x012b:
            r12.close()     // Catch:{ all -> 0x07a5 }
        L_0x012e:
            r1.V = r7     // Catch:{ all -> 0x07a5 }
            goto L_0x013a
        L_0x0131:
            r0 = move-exception
            r2 = r0
            r11 = r12
        L_0x0134:
            if (r11 == 0) goto L_0x0139
            r11.close()     // Catch:{ all -> 0x07a5 }
        L_0x0139:
            throw r2     // Catch:{ all -> 0x07a5 }
        L_0x013a:
            q7.f r2 = r26.J()     // Catch:{ all -> 0x07a5 }
            q7.f2 r7 = q7.g2.f13038i     // Catch:{ all -> 0x07a5 }
            int r2 = r2.l(r10, r7)     // Catch:{ all -> 0x07a5 }
            q7.f r7 = r26.J()     // Catch:{ all -> 0x07a5 }
            q7.f2 r8 = q7.g2.f13040j     // Catch:{ all -> 0x07a5 }
            int r7 = r7.l(r10, r8)     // Catch:{ all -> 0x07a5 }
            int r7 = java.lang.Math.max(r9, r7)     // Catch:{ all -> 0x07a5 }
            q7.k r8 = r1.f13350c     // Catch:{ all -> 0x07a5 }
            H(r8)     // Catch:{ all -> 0x07a5 }
            q7.k4 r12 = r8.f13121a
            r8.i()     // Catch:{ all -> 0x07a5 }
            r8.j()     // Catch:{ all -> 0x07a5 }
            if (r2 <= 0) goto L_0x0163
            r13 = r4
            goto L_0x0164
        L_0x0163:
            r13 = r9
        L_0x0164:
            u6.q.a(r13)     // Catch:{ all -> 0x07a5 }
            if (r7 <= 0) goto L_0x016b
            r13 = r4
            goto L_0x016c
        L_0x016b:
            r13 = r9
        L_0x016c:
            u6.q.a(r13)     // Catch:{ all -> 0x07a5 }
            u6.q.f(r10)     // Catch:{ all -> 0x07a5 }
            android.database.sqlite.SQLiteDatabase r14 = r8.B()     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r15 = "queue"
            java.lang.String r11 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r9 = "retry_count"
            java.lang.String[] r16 = new java.lang.String[]{r11, r13, r9}     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r17 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r11 = 0
            r9[r11] = r10     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r18 = r9
            android.database.Cursor r2 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            boolean r9 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x029f }
            if (r9 != 0) goto L_0x01ac
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x029f }
            r2.close()     // Catch:{ all -> 0x07a2 }
            r18 = r3
            r19 = r5
            goto L_0x02cd
        L_0x01ac:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x029f }
            r9.<init>()     // Catch:{ SQLiteException -> 0x029f }
            r11 = 0
        L_0x01b2:
            r13 = 0
            long r14 = r2.getLong(r13)     // Catch:{ SQLiteException -> 0x029f }
            byte[] r13 = r2.getBlob(r4)     // Catch:{ IOException -> 0x026a }
            q7.t6 r4 = r8.f13208b     // Catch:{ IOException -> 0x026a }
            q7.v6 r4 = r4.C     // Catch:{ IOException -> 0x026a }
            H(r4)     // Catch:{ IOException -> 0x026a }
            r17 = r8
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0251 }
            r8.<init>(r13)     // Catch:{ IOException -> 0x0251 }
            java.util.zip.GZIPInputStream r13 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0251 }
            r13.<init>(r8)     // Catch:{ IOException -> 0x0251 }
            r18 = r3
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x024d, SQLiteException -> 0x024b }
            r3.<init>()     // Catch:{ IOException -> 0x024d, SQLiteException -> 0x024b }
            r19 = r5
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0244 }
        L_0x01db:
            int r6 = r13.read(r5)     // Catch:{ IOException -> 0x0244 }
            if (r6 > 0) goto L_0x023b
            r13.close()     // Catch:{ IOException -> 0x0244 }
            r8.close()     // Catch:{ IOException -> 0x0244 }
            byte[] r3 = r3.toByteArray()     // Catch:{ IOException -> 0x0244 }
            boolean r4 = r9.isEmpty()     // Catch:{ SQLiteException -> 0x029d }
            if (r4 != 0) goto L_0x01f7
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x029d }
            int r4 = r4 + r11
            if (r4 <= r7) goto L_0x01f7
            goto L_0x0298
        L_0x01f7:
            com.google.android.gms.internal.measurement.n3 r4 = com.google.android.gms.internal.measurement.o3.G1()     // Catch:{ IOException -> 0x0224 }
            com.google.android.gms.internal.measurement.c7 r4 = q7.v6.A(r4, r3)     // Catch:{ IOException -> 0x0224 }
            com.google.android.gms.internal.measurement.n3 r4 = (com.google.android.gms.internal.measurement.n3) r4     // Catch:{ IOException -> 0x0224 }
            r5 = 2
            boolean r6 = r2.isNull(r5)     // Catch:{ SQLiteException -> 0x029d }
            if (r6 != 0) goto L_0x020f
            int r6 = r2.getInt(r5)     // Catch:{ SQLiteException -> 0x029d }
            r4.q(r6)     // Catch:{ SQLiteException -> 0x029d }
        L_0x020f:
            int r3 = r3.length     // Catch:{ SQLiteException -> 0x029d }
            int r11 = r11 + r3
            com.google.android.gms.internal.measurement.g7 r3 = r4.j()     // Catch:{ SQLiteException -> 0x029d }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ SQLiteException -> 0x029d }
            java.lang.Long r4 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x029d }
            android.util.Pair r3 = android.util.Pair.create(r3, r4)     // Catch:{ SQLiteException -> 0x029d }
            r9.add(r3)     // Catch:{ SQLiteException -> 0x029d }
            goto L_0x0286
        L_0x0224:
            r0 = move-exception
            r3 = r0
            r4 = r12
            q7.x3 r4 = (q7.x3) r4     // Catch:{ SQLiteException -> 0x029d }
            q7.s2 r4 = r4.e()     // Catch:{ SQLiteException -> 0x029d }
            q7.q2 r4 = r4.n()     // Catch:{ SQLiteException -> 0x029d }
            java.lang.String r5 = "Failed to merge queued bundle. appId"
            q7.r2 r6 = q7.s2.r(r10)     // Catch:{ SQLiteException -> 0x029d }
            r4.d(r6, r3, r5)     // Catch:{ SQLiteException -> 0x029d }
            goto L_0x0286
        L_0x023b:
            r21 = r8
            r8 = 0
            r3.write(r5, r8, r6)     // Catch:{ IOException -> 0x0244 }
            r8 = r21
            goto L_0x01db
        L_0x0244:
            r0 = move-exception
            goto L_0x0249
        L_0x0246:
            r3 = r0
            goto L_0x02b1
        L_0x0249:
            r3 = r0
            goto L_0x0255
        L_0x024b:
            r0 = move-exception
            goto L_0x02a2
        L_0x024d:
            r0 = move-exception
        L_0x024e:
            r19 = r5
            goto L_0x0249
        L_0x0251:
            r0 = move-exception
            r18 = r3
            goto L_0x024e
        L_0x0255:
            q7.k4 r4 = r4.f13121a     // Catch:{ IOException -> 0x0267 }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ IOException -> 0x0267 }
            q7.s2 r4 = r4.e()     // Catch:{ IOException -> 0x0267 }
            q7.q2 r4 = r4.n()     // Catch:{ IOException -> 0x0267 }
            java.lang.String r5 = "Failed to ungzip content"
            r4.c(r3, r5)     // Catch:{ IOException -> 0x0267 }
            throw r3     // Catch:{ IOException -> 0x0267 }
        L_0x0267:
            r0 = move-exception
        L_0x0268:
            r3 = r0
            goto L_0x0272
        L_0x026a:
            r0 = move-exception
            r18 = r3
            r19 = r5
            r17 = r8
            goto L_0x0268
        L_0x0272:
            r4 = r12
            q7.x3 r4 = (q7.x3) r4     // Catch:{ SQLiteException -> 0x029d }
            q7.s2 r4 = r4.e()     // Catch:{ SQLiteException -> 0x029d }
            q7.q2 r4 = r4.n()     // Catch:{ SQLiteException -> 0x029d }
            java.lang.String r5 = "Failed to unzip queued bundle. appId"
            q7.r2 r6 = q7.s2.r(r10)     // Catch:{ SQLiteException -> 0x029d }
            r4.d(r6, r3, r5)     // Catch:{ SQLiteException -> 0x029d }
        L_0x0286:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x029d }
            if (r3 == 0) goto L_0x0298
            if (r11 <= r7) goto L_0x028f
            goto L_0x0298
        L_0x028f:
            r8 = r17
            r3 = r18
            r5 = r19
            r4 = 1
            goto L_0x01b2
        L_0x0298:
            r2.close()     // Catch:{ all -> 0x07a2 }
            r7 = r9
            goto L_0x02cd
        L_0x029d:
            r0 = move-exception
            goto L_0x0246
        L_0x029f:
            r0 = move-exception
            r18 = r3
        L_0x02a2:
            r19 = r5
            goto L_0x0246
        L_0x02a5:
            r0 = move-exception
            r2 = r0
            r11 = 0
            goto L_0x0702
        L_0x02aa:
            r0 = move-exception
            r18 = r3
            r19 = r5
            r3 = r0
            r2 = 0
        L_0x02b1:
            q7.x3 r12 = (q7.x3) r12     // Catch:{ all -> 0x06ff }
            q7.s2 r4 = r12.e()     // Catch:{ all -> 0x06ff }
            q7.q2 r4 = r4.n()     // Catch:{ all -> 0x06ff }
            java.lang.String r5 = "Error querying bundles. appId"
            q7.r2 r6 = q7.s2.r(r10)     // Catch:{ all -> 0x06ff }
            r4.d(r6, r3, r5)     // Catch:{ all -> 0x06ff }
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x06ff }
            if (r2 == 0) goto L_0x02cd
            r2.close()     // Catch:{ all -> 0x07a2 }
        L_0x02cd:
            boolean r2 = r7.isEmpty()     // Catch:{ all -> 0x07a2 }
            if (r2 != 0) goto L_0x0792
            q7.h r2 = r1.K(r10)     // Catch:{ all -> 0x07a2 }
            q7.g r3 = q7.g.f13015b
            boolean r2 = r2.f(r3)     // Catch:{ all -> 0x07a2 }
            if (r2 == 0) goto L_0x0338
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x07a2 }
        L_0x02e3:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x07a2 }
            if (r4 == 0) goto L_0x0302
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x07a2 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x07a2 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            java.lang.String r5 = r4.D()     // Catch:{ all -> 0x07a2 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x07a2 }
            if (r5 != 0) goto L_0x02e3
            java.lang.String r2 = r4.D()     // Catch:{ all -> 0x07a2 }
            goto L_0x0303
        L_0x0302:
            r2 = 0
        L_0x0303:
            if (r2 == 0) goto L_0x0338
            r4 = 0
        L_0x0306:
            int r5 = r7.size()     // Catch:{ all -> 0x07a2 }
            if (r4 >= r5) goto L_0x0338
            java.lang.Object r5 = r7.get(r4)     // Catch:{ all -> 0x07a2 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x07a2 }
            java.lang.Object r5 = r5.first     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r5 = (com.google.android.gms.internal.measurement.o3) r5     // Catch:{ all -> 0x07a2 }
            java.lang.String r6 = r5.D()     // Catch:{ all -> 0x07a2 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x0321
            goto L_0x0335
        L_0x0321:
            java.lang.String r5 = r5.D()     // Catch:{ all -> 0x07a2 }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x07a2 }
            if (r5 != 0) goto L_0x0335
            r2 = 0
            java.util.List r7 = r7.subList(r2, r4)     // Catch:{ all -> 0x0331 }
            goto L_0x0338
        L_0x0331:
            r0 = move-exception
        L_0x0332:
            r2 = r0
            goto L_0x07a8
        L_0x0335:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x0338:
            com.google.android.gms.internal.measurement.l3 r2 = com.google.android.gms.internal.measurement.m3.t()     // Catch:{ all -> 0x07a2 }
            int r4 = r7.size()     // Catch:{ all -> 0x07a2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x07a2 }
            int r6 = r7.size()     // Catch:{ all -> 0x07a2 }
            r5.<init>(r6)     // Catch:{ all -> 0x07a2 }
            q7.f r6 = r26.J()     // Catch:{ all -> 0x07a2 }
            java.lang.String r8 = "gaia_collection_enabled"
            q7.e r6 = r6.f12983c     // Catch:{ all -> 0x07a2 }
            java.lang.String r6 = r6.f(r10, r8)     // Catch:{ all -> 0x07a2 }
            java.lang.String r8 = "1"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x0369
            q7.h r6 = r1.K(r10)     // Catch:{ all -> 0x07a2 }
            boolean r6 = r6.f(r3)     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x0369
            r6 = 1
            goto L_0x036a
        L_0x0369:
            r6 = 0
        L_0x036a:
            q7.h r8 = r1.K(r10)     // Catch:{ all -> 0x07a2 }
            boolean r3 = r8.f(r3)     // Catch:{ all -> 0x07a2 }
            q7.h r8 = r1.K(r10)     // Catch:{ all -> 0x07a2 }
            q7.g r9 = q7.g.f13016c     // Catch:{ all -> 0x07a2 }
            boolean r8 = r8.f(r9)     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.kc.b()     // Catch:{ all -> 0x07a2 }
            q7.f r9 = r26.J()     // Catch:{ all -> 0x07a2 }
            q7.f2 r11 = q7.g2.f13045l0     // Catch:{ all -> 0x07a2 }
            boolean r9 = r9.r(r10, r11)     // Catch:{ all -> 0x07a2 }
            r11 = 0
        L_0x038a:
            q7.v6 r12 = r1.C
            if (r11 >= r4) goto L_0x0635
            java.lang.Object r13 = r7.get(r11)     // Catch:{ all -> 0x07a2 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x07a2 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r13 = (com.google.android.gms.internal.measurement.o3) r13     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.c7 r13 = r13.j()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.n3 r13 = (com.google.android.gms.internal.measurement.n3) r13     // Catch:{ all -> 0x07a2 }
            java.lang.Object r14 = r7.get(r11)     // Catch:{ all -> 0x07a2 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x07a2 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x07a2 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x07a2 }
            r5.add(r14)     // Catch:{ all -> 0x07a2 }
            q7.f r14 = r26.J()     // Catch:{ all -> 0x07a2 }
            r14.n()     // Catch:{ all -> 0x07a2 }
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r14 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r14 = (com.google.android.gms.internal.measurement.o3) r14     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.X(r14)     // Catch:{ all -> 0x07a2 }
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r14 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r14 = (com.google.android.gms.internal.measurement.o3) r14     // Catch:{ all -> 0x07a2 }
            r15 = r7
            r17 = r8
            r7 = r19
            com.google.android.gms.internal.measurement.o3.E0(r14, r7)     // Catch:{ all -> 0x07a2 }
            r13.l()     // Catch:{ all -> 0x0632 }
            com.google.android.gms.internal.measurement.g7 r14 = r13.f5179b     // Catch:{ all -> 0x0632 }
            com.google.android.gms.internal.measurement.o3 r14 = (com.google.android.gms.internal.measurement.o3) r14     // Catch:{ all -> 0x0632 }
            com.google.android.gms.internal.measurement.o3.j0(r14)     // Catch:{ all -> 0x0632 }
            if (r6 != 0) goto L_0x03e1
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r14 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r14 = (com.google.android.gms.internal.measurement.o3) r14     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.J(r14)     // Catch:{ all -> 0x07a2 }
        L_0x03e1:
            if (r3 != 0) goto L_0x03e9
            r13.C()     // Catch:{ all -> 0x07a2 }
            r13.z()     // Catch:{ all -> 0x07a2 }
        L_0x03e9:
            if (r17 != 0) goto L_0x03f5
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r14 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r14 = (com.google.android.gms.internal.measurement.o3) r14     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.d0(r14)     // Catch:{ all -> 0x07a2 }
        L_0x03f5:
            q7.r3 r14 = r1.f13347a     // Catch:{ all -> 0x07a2 }
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r19 = r3
            o.a r3 = r14.f13299e     // Catch:{ all -> 0x07a2 }
            r20 = r6
            r6 = 0
            java.lang.Object r21 = r3.getOrDefault(r10, r6)     // Catch:{ all -> 0x07a2 }
            r6 = r21
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x041e
            r13.l()     // Catch:{ all -> 0x07a2 }
            r21 = r15
            com.google.android.gms.internal.measurement.g7 r15 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r15 = (com.google.android.gms.internal.measurement.o3) r15     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.w0(r15, r6)     // Catch:{ all -> 0x07a2 }
            goto L_0x0420
        L_0x041e:
            r21 = r15
        L_0x0420:
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r6 = 0
            java.lang.Object r15 = r3.getOrDefault(r10, r6)     // Catch:{ all -> 0x07a2 }
            java.lang.String r6 = "device_info"
            if (r15 == 0) goto L_0x0455
            r15 = 0
            java.lang.Object r22 = r3.getOrDefault(r10, r15)     // Catch:{ all -> 0x07a2 }
            r15 = r22
            java.util.Set r15 = (java.util.Set) r15     // Catch:{ all -> 0x07a2 }
            r22 = r4
            java.lang.String r4 = "device_model"
            boolean r4 = r15.contains(r4)     // Catch:{ all -> 0x07a2 }
            if (r4 != 0) goto L_0x0453
            r4 = 0
            java.lang.Object r15 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r15 = (java.util.Set) r15     // Catch:{ all -> 0x07a2 }
            boolean r4 = r15.contains(r6)     // Catch:{ all -> 0x07a2 }
            if (r4 != 0) goto L_0x0453
            goto L_0x0457
        L_0x0453:
            r4 = 1
            goto L_0x0458
        L_0x0455:
            r22 = r4
        L_0x0457:
            r4 = 0
        L_0x0458:
            if (r4 == 0) goto L_0x0464
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r4 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.P0(r4)     // Catch:{ all -> 0x07a2 }
        L_0x0464:
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r4 = 0
            java.lang.Object r15 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            if (r15 == 0) goto L_0x0492
            java.lang.Object r15 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r15 = (java.util.Set) r15     // Catch:{ all -> 0x07a2 }
            java.lang.String r4 = "os_version"
            boolean r4 = r15.contains(r4)     // Catch:{ all -> 0x07a2 }
            if (r4 != 0) goto L_0x0490
            r4 = 0
            java.lang.Object r15 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r15 = (java.util.Set) r15     // Catch:{ all -> 0x07a2 }
            boolean r4 = r15.contains(r6)     // Catch:{ all -> 0x07a2 }
            if (r4 != 0) goto L_0x0490
            goto L_0x0492
        L_0x0490:
            r4 = 1
            goto L_0x0493
        L_0x0492:
            r4 = 0
        L_0x0493:
            r6 = -1
            if (r4 == 0) goto L_0x04d2
            q7.f r4 = r26.J()     // Catch:{ all -> 0x07a2 }
            q7.f2 r15 = q7.g2.f13048n0     // Catch:{ all -> 0x07a2 }
            boolean r4 = r4.r(r10, r15)     // Catch:{ all -> 0x07a2 }
            if (r4 == 0) goto L_0x04c8
            com.google.android.gms.internal.measurement.g7 r4 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            java.lang.String r4 = r4.B()     // Catch:{ all -> 0x07a2 }
            boolean r15 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x07a2 }
            if (r15 != 0) goto L_0x04d2
            java.lang.String r15 = "."
            int r15 = r4.indexOf(r15)     // Catch:{ all -> 0x07a2 }
            if (r15 == r6) goto L_0x04d2
            r6 = 0
            java.lang.String r4 = r4.substring(r6, r15)     // Catch:{ all -> 0x07a2 }
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r6 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.M0(r6, r4)     // Catch:{ all -> 0x07a2 }
            goto L_0x04d2
        L_0x04c8:
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r4 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.N0(r4)     // Catch:{ all -> 0x07a2 }
        L_0x04d2:
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r4 = 0
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x04f2
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x07a2 }
            java.lang.String r4 = "user_id"
            boolean r4 = r6.contains(r4)     // Catch:{ all -> 0x07a2 }
            if (r4 == 0) goto L_0x04f2
            r4 = 1
            goto L_0x04f3
        L_0x04f2:
            r4 = 0
        L_0x04f3:
            if (r4 == 0) goto L_0x0508
            java.lang.String r4 = "_id"
            int r4 = q7.v6.v(r13, r4)     // Catch:{ all -> 0x07a2 }
            r6 = -1
            if (r4 == r6) goto L_0x0508
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r6 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.D0(r6, r4)     // Catch:{ all -> 0x07a2 }
        L_0x0508:
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r4 = 0
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x0528
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x07a2 }
            java.lang.String r4 = "google_signals"
            boolean r4 = r6.contains(r4)     // Catch:{ all -> 0x07a2 }
            if (r4 == 0) goto L_0x0528
            r4 = 1
            goto L_0x0529
        L_0x0528:
            r4 = 0
        L_0x0529:
            if (r4 == 0) goto L_0x0535
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r4 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.J(r4)     // Catch:{ all -> 0x07a2 }
        L_0x0535:
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r4 = 0
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x0555
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x07a2 }
            java.lang.String r4 = "app_instance_id"
            boolean r4 = r6.contains(r4)     // Catch:{ all -> 0x07a2 }
            if (r4 == 0) goto L_0x0555
            r4 = 1
            goto L_0x0556
        L_0x0555:
            r4 = 0
        L_0x0556:
            if (r4 == 0) goto L_0x05b2
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r4 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.d0(r4)     // Catch:{ all -> 0x07a2 }
            java.util.HashMap r4 = r1.X     // Catch:{ all -> 0x07a2 }
            java.lang.Object r6 = r4.get(r10)     // Catch:{ all -> 0x07a2 }
            q7.s6 r6 = (q7.s6) r6     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x0590
            q7.f r15 = r26.J()     // Catch:{ all -> 0x07a2 }
            r23 = r7
            q7.f2 r7 = q7.g2.U     // Catch:{ all -> 0x07a2 }
            long r7 = r15.o(r10, r7)     // Catch:{ all -> 0x07a2 }
            r15 = r11
            r25 = r12
            long r11 = r6.f13329b     // Catch:{ all -> 0x07a2 }
            long r7 = r7 + r11
            z6.b r11 = r26.a()     // Catch:{ all -> 0x07a2 }
            ag.m r11 = (ag.m) r11     // Catch:{ all -> 0x07a2 }
            r11.getClass()     // Catch:{ all -> 0x07a2 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x07a2 }
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x05a5
            goto L_0x0595
        L_0x0590:
            r23 = r7
            r15 = r11
            r25 = r12
        L_0x0595:
            q7.s6 r6 = new q7.s6     // Catch:{ all -> 0x07a2 }
            q7.a7 r7 = r26.P()     // Catch:{ all -> 0x07a2 }
            java.lang.String r7 = r7.o()     // Catch:{ all -> 0x07a2 }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x07a2 }
            r4.put(r10, r6)     // Catch:{ all -> 0x07a2 }
        L_0x05a5:
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r4 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            java.lang.String r6 = r6.f13328a     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.y0(r4, r6)     // Catch:{ all -> 0x07a2 }
            goto L_0x05b7
        L_0x05b2:
            r23 = r7
            r15 = r11
            r25 = r12
        L_0x05b7:
            H(r14)     // Catch:{ all -> 0x07a2 }
            r14.i()     // Catch:{ all -> 0x07a2 }
            r14.o(r10)     // Catch:{ all -> 0x07a2 }
            r4 = 0
            java.lang.Object r6 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            if (r6 == 0) goto L_0x05d7
            java.lang.Object r3 = r3.getOrDefault(r10, r4)     // Catch:{ all -> 0x07a2 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x07a2 }
            java.lang.String r4 = "enhanced_user_id"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x07a2 }
            if (r3 == 0) goto L_0x05d7
            r3 = 1
            goto L_0x05d8
        L_0x05d7:
            r3 = 0
        L_0x05d8:
            if (r3 == 0) goto L_0x05e4
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r3 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.v0(r3)     // Catch:{ all -> 0x07a2 }
        L_0x05e4:
            if (r9 != 0) goto L_0x05f0
            r13.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r3 = r13.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3.v0(r3)     // Catch:{ all -> 0x07a2 }
        L_0x05f0:
            q7.f r3 = r26.J()     // Catch:{ all -> 0x07a2 }
            q7.f2 r4 = q7.g2.V     // Catch:{ all -> 0x07a2 }
            boolean r3 = r3.r(r10, r4)     // Catch:{ all -> 0x07a2 }
            if (r3 == 0) goto L_0x0612
            com.google.android.gms.internal.measurement.g7 r3 = r13.j()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ all -> 0x07a2 }
            byte[] r3 = r3.e()     // Catch:{ all -> 0x07a2 }
            H(r25)     // Catch:{ all -> 0x07a2 }
            r4 = r25
            long r3 = r4.w(r3)     // Catch:{ all -> 0x07a2 }
            r13.n(r3)     // Catch:{ all -> 0x07a2 }
        L_0x0612:
            r2.l()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r3 = r2.f5179b     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.m3 r3 = (com.google.android.gms.internal.measurement.m3) r3     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r4 = r13.j()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.m3.x(r3, r4)     // Catch:{ all -> 0x07a2 }
            int r11 = r15 + 1
            r8 = r17
            r3 = r19
            r6 = r20
            r7 = r21
            r4 = r22
            r19 = r23
            goto L_0x038a
        L_0x0632:
            r0 = move-exception
            goto L_0x0332
        L_0x0635:
            r22 = r4
            r4 = r12
            r23 = r19
            q7.s2 r3 = r26.e()     // Catch:{ all -> 0x07a2 }
            java.lang.String r3 = r3.v()     // Catch:{ all -> 0x07a2 }
            r6 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r6)     // Catch:{ all -> 0x07a2 }
            if (r3 == 0) goto L_0x0657
            H(r4)     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r3 = r2.j()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.m3 r3 = (com.google.android.gms.internal.measurement.m3) r3     // Catch:{ all -> 0x07a2 }
            java.lang.String r11 = r4.B(r3)     // Catch:{ all -> 0x07a2 }
            goto L_0x0658
        L_0x0657:
            r11 = 0
        L_0x0658:
            H(r4)     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.g7 r3 = r2.j()     // Catch:{ all -> 0x07a2 }
            com.google.android.gms.internal.measurement.m3 r3 = (com.google.android.gms.internal.measurement.m3) r3     // Catch:{ all -> 0x07a2 }
            byte[] r6 = r3.e()     // Catch:{ all -> 0x07a2 }
            q7.p6 r3 = r1.F     // Catch:{ all -> 0x07a2 }
            q7.o6 r9 = r3.j(r10)     // Catch:{ all -> 0x07a2 }
            boolean r3 = r5.isEmpty()     // Catch:{ MalformedURLException -> 0x06e8 }
            r4 = 1
            r3 = r3 ^ r4
            u6.q.a(r3)     // Catch:{ MalformedURLException -> 0x06e8 }
            java.util.ArrayList r3 = r1.T     // Catch:{ MalformedURLException -> 0x06e8 }
            if (r3 == 0) goto L_0x0686
            q7.s2 r3 = r26.e()     // Catch:{ MalformedURLException -> 0x06e8 }
            q7.q2 r3 = r3.n()     // Catch:{ MalformedURLException -> 0x06e8 }
            java.lang.String r4 = "Set uploading progress before finishing the previous upload"
            r3.b(r4)     // Catch:{ MalformedURLException -> 0x06e8 }
            goto L_0x068d
        L_0x0686:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x06e8 }
            r3.<init>(r5)     // Catch:{ MalformedURLException -> 0x06e8 }
            r1.T = r3     // Catch:{ MalformedURLException -> 0x06e8 }
        L_0x068d:
            q7.z5 r3 = r1.E     // Catch:{ MalformedURLException -> 0x06e8 }
            q7.d3 r3 = r3.D     // Catch:{ MalformedURLException -> 0x06e8 }
            r4 = r23
            r3.b(r4)     // Catch:{ MalformedURLException -> 0x06e8 }
            java.lang.String r3 = "?"
            if (r22 <= 0) goto L_0x06a2
            com.google.android.gms.internal.measurement.o3 r2 = r2.m()     // Catch:{  }
            java.lang.String r3 = r2.K1()     // Catch:{ MalformedURLException -> 0x06e8 }
        L_0x06a2:
            q7.s2 r2 = r26.e()     // Catch:{ MalformedURLException -> 0x06e8 }
            q7.q2 r2 = r2.o()     // Catch:{ MalformedURLException -> 0x06e8 }
            java.lang.String r4 = "Uploading data. app, uncompressed size, data"
            int r5 = r6.length     // Catch:{ MalformedURLException -> 0x06e8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ MalformedURLException -> 0x06e8 }
            r2.e(r4, r3, r5, r11)     // Catch:{ MalformedURLException -> 0x06e8 }
            r2 = 1
            r1.P = r2     // Catch:{ MalformedURLException -> 0x06e8 }
            H(r18)     // Catch:{ MalformedURLException -> 0x06e8 }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x06e8 }
            java.lang.String r2 = r9.a()     // Catch:{ MalformedURLException -> 0x06e8 }
            r5.<init>(r2)     // Catch:{ MalformedURLException -> 0x06e8 }
            java.util.Map r7 = r9.b()     // Catch:{ MalformedURLException -> 0x06e8 }
            t.w2 r8 = new t.w2     // Catch:{ MalformedURLException -> 0x06e8 }
            r8.<init>((q7.k4) r1, (java.lang.String) r10)     // Catch:{ MalformedURLException -> 0x06e8 }
            r18.i()     // Catch:{ MalformedURLException -> 0x06e8 }
            r18.j()     // Catch:{ MalformedURLException -> 0x06e8 }
            r3 = r18
            q7.k4 r2 = r3.f13121a     // Catch:{ MalformedURLException -> 0x06e8 }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ MalformedURLException -> 0x06e8 }
            q7.w3 r11 = r2.h()     // Catch:{ MalformedURLException -> 0x06e8 }
            q7.w2 r12 = new q7.w2     // Catch:{ MalformedURLException -> 0x06e8 }
            r2 = r12
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ MalformedURLException -> 0x06e8 }
            r11.p(r12)     // Catch:{ MalformedURLException -> 0x06e8 }
            goto L_0x0792
        L_0x06e8:
            q7.s2 r2 = r26.e()     // Catch:{ all -> 0x07a2 }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x07a2 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            q7.r2 r4 = q7.s2.r(r10)     // Catch:{ all -> 0x07a2 }
            java.lang.String r5 = r9.a()     // Catch:{ all -> 0x07a2 }
            r2.d(r4, r5, r3)     // Catch:{ all -> 0x07a2 }
            goto L_0x0792
        L_0x06ff:
            r0 = move-exception
            r11 = r2
            r2 = r0
        L_0x0702:
            if (r11 == 0) goto L_0x0707
            r11.close()     // Catch:{ all -> 0x07a2 }
        L_0x0707:
            throw r2     // Catch:{ all -> 0x07a2 }
        L_0x0708:
            r4 = r5
            r2 = r7
            r1.V = r2     // Catch:{ all -> 0x07a2 }
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x07a2 }
            H(r2)     // Catch:{ all -> 0x07a2 }
            q7.k4 r3 = r2.f13121a
            r26.J()     // Catch:{ all -> 0x07a2 }
            q7.f2 r6 = q7.g2.f13032f     // Catch:{ all -> 0x07a2 }
            r7 = 0
            java.lang.Object r6 = r6.a(r7)     // Catch:{ all -> 0x07a2 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x07a2 }
            long r8 = r6.longValue()     // Catch:{ all -> 0x07a2 }
            long r5 = r4 - r8
            r2.i()     // Catch:{ all -> 0x07a2 }
            r2.j()     // Catch:{ all -> 0x07a2 }
            android.database.sqlite.SQLiteDatabase r2 = r2.B()     // Catch:{ SQLiteException -> 0x0766, all -> 0x0762 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0766, all -> 0x0762 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0766, all -> 0x0762 }
            r6 = 0
            r8[r6] = r5     // Catch:{ SQLiteException -> 0x0766, all -> 0x0762 }
            android.database.Cursor r6 = r2.rawQuery(r4, r8)     // Catch:{ SQLiteException -> 0x0766, all -> 0x0762 }
            boolean r2 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x075f }
            if (r2 != 0) goto L_0x0756
            r2 = r3
            q7.x3 r2 = (q7.x3) r2     // Catch:{ SQLiteException -> 0x075f }
            q7.s2 r2 = r2.e()     // Catch:{ SQLiteException -> 0x075f }
            q7.q2 r2 = r2.o()     // Catch:{ SQLiteException -> 0x075f }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r2.b(r4)     // Catch:{ SQLiteException -> 0x075f }
            goto L_0x077a
        L_0x0756:
            r2 = 0
            java.lang.String r11 = r6.getString(r2)     // Catch:{ SQLiteException -> 0x075f }
            r6.close()     // Catch:{ all -> 0x07a2 }
            goto L_0x077e
        L_0x075f:
            r0 = move-exception
            r2 = r0
            goto L_0x0769
        L_0x0762:
            r0 = move-exception
            r2 = r0
            r11 = r7
            goto L_0x079c
        L_0x0766:
            r0 = move-exception
            r2 = r0
            r6 = r7
        L_0x0769:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x0799 }
            q7.s2 r3 = r3.e()     // Catch:{ all -> 0x0799 }
            q7.q2 r3 = r3.n()     // Catch:{ all -> 0x0799 }
            java.lang.String r4 = "Error selecting expired configs"
            r3.c(r2, r4)     // Catch:{ all -> 0x0799 }
            if (r6 == 0) goto L_0x077d
        L_0x077a:
            r6.close()     // Catch:{ all -> 0x07a2 }
        L_0x077d:
            r11 = r7
        L_0x077e:
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x07a2 }
            if (r2 != 0) goto L_0x0792
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x07a2 }
            H(r2)     // Catch:{ all -> 0x07a2 }
            q7.l4 r2 = r2.C(r11)     // Catch:{ all -> 0x07a2 }
            if (r2 == 0) goto L_0x0792
            r1.g(r2)     // Catch:{ all -> 0x07a2 }
        L_0x0792:
            r2 = 0
            r1.Q = r2
        L_0x0795:
            r26.A()
            return
        L_0x0799:
            r0 = move-exception
            r2 = r0
            r11 = r6
        L_0x079c:
            if (r11 == 0) goto L_0x07a1
            r11.close()     // Catch:{ all -> 0x07a2 }
        L_0x07a1:
            throw r2     // Catch:{ all -> 0x07a2 }
        L_0x07a2:
            r0 = move-exception
            goto L_0x0332
        L_0x07a5:
            r0 = move-exception
            goto L_0x0332
        L_0x07a8:
            r3 = 0
            r1.Q = r3
            r26.A()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.t():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x039b A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03df A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03e2 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0443 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05df A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x061c A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x06a3 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x071b A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x072b A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0738 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0740 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x074d A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x078a A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x07a7 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x07b4 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x07f9 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x082c A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0831 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0839 A[SYNTHETIC, Splitter:B:244:0x0839] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08d2 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08ed A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0999 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x09ab A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x09ca A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0a4e A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0a6f A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0b7b A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0bf5 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }, LOOP:5: B:346:0x0bef->B:348:0x0bf5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0c60 A[Catch:{ SQLiteException -> 0x0c7b }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0c76  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0b8f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x023c A[SYNTHETIC, Splitter:B:64:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02b4 A[Catch:{ NumberFormatException -> 0x08ad, all -> 0x0cfd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(q7.s r42, q7.c7 r43) {
        /*
            r41 = this;
            r1 = r41
            r2 = r42
            r3 = r43
            java.lang.String r4 = "raw_events"
            java.lang.String r5 = "_sno"
            u6.q.i(r43)
            java.lang.String r6 = r3.f12950c
            java.lang.String r7 = r3.f12951d
            java.lang.String r8 = r3.f12948a
            u6.q.f(r8)
            long r9 = java.lang.System.nanoTime()
            q7.w3 r11 = r41.h()
            r11.i()
            r41.f()
            java.lang.String r11 = r3.f12948a
            q7.v6 r15 = r1.C
            H(r15)
            java.lang.String r14 = r3.f12949b
            boolean r12 = android.text.TextUtils.isEmpty(r14)
            r29 = 1
            r30 = r9
            java.lang.String r9 = r3.M
            if (r12 == 0) goto L_0x0041
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0041
            r10 = 0
            goto L_0x0043
        L_0x0041:
            r10 = r29
        L_0x0043:
            if (r10 != 0) goto L_0x0046
            return
        L_0x0046:
            boolean r10 = r3.D
            if (r10 == 0) goto L_0x0d08
            q7.r3 r12 = r1.f13347a
            H(r12)
            java.lang.String r13 = r2.f13311a
            boolean r17 = r12.v(r11, r13)
            r32 = r10
            e.s r10 = r1.f13348a0
            r33 = r9
            java.lang.String r9 = "_err"
            r34 = r6
            q7.x3 r6 = r1.H
            if (r17 == 0) goto L_0x010f
            q7.s2 r3 = r41.e()
            q7.q2 r3 = r3.p()
            q7.r2 r4 = q7.s2.r(r11)
            q7.n2 r5 = r6.s()
            java.lang.String r5 = r5.d(r13)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.d(r4, r5, r6)
            H(r12)
            java.lang.String r3 = "measurement.upload.blacklist_internal"
            java.lang.String r3 = r12.f(r11, r3)
            java.lang.String r4 = "1"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00b6
            H(r12)
            java.lang.String r3 = "measurement.upload.blacklist_public"
            java.lang.String r3 = r12.f(r11, r3)
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x009d
            goto L_0x00b6
        L_0x009d:
            boolean r3 = r9.equals(r13)
            if (r3 != 0) goto L_0x010e
            r41.P()
            java.lang.String r2 = r2.f13311a
            r14 = 11
            java.lang.String r15 = "_ev"
            r17 = 0
            r12 = r10
            r13 = r11
            r16 = r2
            q7.a7.z(r12, r13, r14, r15, r16, r17)
            return
        L_0x00b6:
            q7.k r2 = r1.f13350c
            H(r2)
            q7.l4 r2 = r2.C(r11)
            if (r2 == 0) goto L_0x010e
            q7.x3 r3 = r2.f13162a
            q7.w3 r4 = r3.F
            q7.x3.l(r4)
            r4.i()
            long r4 = r2.G
            q7.w3 r3 = r3.F
            q7.x3.l(r3)
            r3.i()
            long r6 = r2.F
            long r3 = java.lang.Math.max(r4, r6)
            z6.b r5 = r41.a()
            ag.m r5 = (ag.m) r5
            long r5 = r5.b()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r41.J()
            q7.f2 r5 = q7.g2.A
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x010e
            q7.s2 r3 = r41.e()
            q7.q2 r3 = r3.m()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.b(r4)
            r1.g(r2)
        L_0x010e:
            return
        L_0x010f:
            q7.t2 r2 = q7.t2.b(r42)
            q7.a7 r13 = r41.P()
            r17 = r12
            q7.f r12 = r41.J()
            r12.getClass()
            r18 = r14
            q7.f2 r14 = q7.g2.J
            r19 = r15
            r15 = 25
            r35 = r7
            r7 = 100
            int r7 = r12.m(r11, r14, r15, r7)
            r13.y(r2, r7)
            com.google.android.gms.internal.measurement.fb r7 = com.google.android.gms.internal.measurement.fb.f5276b
            com.google.android.gms.internal.measurement.g5 r7 = r7.f5277a
            java.lang.Object r7 = r7.zza()
            com.google.android.gms.internal.measurement.gb r7 = (com.google.android.gms.internal.measurement.gb) r7
            r7.zza()
            q7.f r7 = r41.J()
            q7.f2 r12 = q7.g2.f13062u0
            r13 = 0
            boolean r7 = r7.r(r13, r12)
            if (r7 == 0) goto L_0x015c
            q7.f r7 = r41.J()
            q7.f2 r12 = q7.g2.R
            r13 = 10
            r14 = 35
            int r7 = r7.m(r11, r12, r13, r14)
            goto L_0x015d
        L_0x015c:
            r7 = 0
        L_0x015d:
            java.util.TreeSet r12 = new java.util.TreeSet
            android.os.Bundle r13 = r2.f13335d
            java.util.Set r14 = r13.keySet()
            r12.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x016c:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x01b0
            java.lang.Object r14 = r12.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = "items"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L_0x016c
            q7.a7 r15 = r41.P()
            android.os.Parcelable[] r14 = r13.getParcelableArray(r14)
            r42 = r12
            com.google.android.gms.internal.measurement.fb r12 = com.google.android.gms.internal.measurement.fb.f5276b
            com.google.android.gms.internal.measurement.g5 r12 = r12.f5277a
            java.lang.Object r12 = r12.zza()
            com.google.android.gms.internal.measurement.gb r12 = (com.google.android.gms.internal.measurement.gb) r12
            r12.zza()
            q7.f r12 = r41.J()
            r20 = r13
            q7.f2 r13 = q7.g2.f13062u0
            r36 = r4
            r4 = 0
            boolean r12 = r12.r(r4, r13)
            r15.x(r14, r7, r12)
            r12 = r42
            r13 = r20
            r4 = r36
            goto L_0x016c
        L_0x01b0:
            r36 = r4
            q7.s r2 = r2.a()
            java.lang.String r4 = r2.f13311a
            q7.s2 r7 = r41.e()
            java.lang.String r7 = r7.v()
            r15 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r15)
            if (r7 == 0) goto L_0x01dc
            q7.s2 r7 = r41.e()
            q7.q2 r7 = r7.o()
            q7.n2 r12 = r6.s()
            java.lang.String r12 = r12.c(r2)
            java.lang.String r13 = "Logging event"
            r7.c(r12, r13)
        L_0x01dc:
            com.google.android.gms.internal.measurement.cb.a()
            q7.f r7 = r41.J()
            q7.f2 r12 = q7.g2.f13056r0
            r13 = 0
            r7.r(r13, r12)
            q7.k r7 = r1.f13350c
            H(r7)
            r7.O()
            r1.I(r3)     // Catch:{ all -> 0x0cfd }
            java.lang.String r7 = "ecommerce_purchase"
            boolean r7 = r7.equals(r4)     // Catch:{ all -> 0x0cfd }
            java.lang.String r12 = "refund"
            if (r7 != 0) goto L_0x020f
            java.lang.String r7 = "purchase"
            boolean r7 = r7.equals(r4)     // Catch:{ all -> 0x0cfd }
            if (r7 != 0) goto L_0x020f
            boolean r7 = r12.equals(r4)     // Catch:{ all -> 0x0cfd }
            if (r7 == 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r7 = 0
            goto L_0x0211
        L_0x020f:
            r7 = r29
        L_0x0211:
            java.lang.String r13 = "_iap"
            boolean r13 = r13.equals(r4)     // Catch:{ all -> 0x0cfd }
            q7.q r14 = r2.f13312b
            if (r13 != 0) goto L_0x022e
            if (r7 == 0) goto L_0x0220
            r7 = r29
            goto L_0x022e
        L_0x0220:
            r25 = r5
            r40 = r8
            r38 = r14
        L_0x0226:
            r39 = r17
            r37 = r18
            r42 = r19
            goto L_0x03d0
        L_0x022e:
            java.lang.String r13 = "currency"
            android.os.Bundle r15 = r14.f13275a     // Catch:{ all -> 0x0cfd }
            java.lang.String r13 = r15.getString(r13)     // Catch:{ all -> 0x0cfd }
            java.lang.String r15 = "value"
            android.os.Bundle r3 = r14.f13275a
            if (r7 == 0) goto L_0x02a1
            java.lang.Double r7 = r14.x()     // Catch:{ all -> 0x0cfd }
            double r20 = r7.doubleValue()     // Catch:{ all -> 0x0cfd }
            r22 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r20 = r20 * r22
            r24 = 0
            int r7 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r7 != 0) goto L_0x0262
            long r20 = r3.getLong(r15)     // Catch:{ all -> 0x0cfd }
            java.lang.Long r3 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0cfd }
            r7 = r14
            long r14 = r3.longValue()     // Catch:{ all -> 0x0cfd }
            double r14 = (double) r14     // Catch:{ all -> 0x0cfd }
            double r20 = r14 * r22
            goto L_0x0263
        L_0x0262:
            r7 = r14
        L_0x0263:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x027b
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r3 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x027b
            long r14 = java.lang.Math.round(r20)     // Catch:{ all -> 0x0cfd }
            boolean r3 = r12.equals(r4)     // Catch:{ all -> 0x0cfd }
            if (r3 == 0) goto L_0x02ae
            long r14 = -r14
            goto L_0x02ae
        L_0x027b:
            q7.s2 r2 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r2 = r2.p()     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            q7.r2 r4 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            java.lang.Double r5 = java.lang.Double.valueOf(r20)     // Catch:{ all -> 0x0cfd }
            r2.d(r4, r5, r3)     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r2.n()     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            return
        L_0x02a1:
            r7 = r14
            long r14 = r3.getLong(r15)     // Catch:{ all -> 0x0cfd }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cfd }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0cfd }
        L_0x02ae:
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0cfd }
            if (r3 != 0) goto L_0x03c8
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = r13.toUpperCase(r3)     // Catch:{ all -> 0x0cfd }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r3.matches(r12)     // Catch:{ all -> 0x0cfd }
            if (r12 == 0) goto L_0x03c8
            java.lang.String r12 = "_ltv_"
            java.lang.String r3 = r12.concat(r3)     // Catch:{ all -> 0x0cfd }
            q7.k r12 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r12)     // Catch:{ all -> 0x0cfd }
            q7.y6 r12 = r12.H(r11, r3)     // Catch:{ all -> 0x0cfd }
            if (r12 == 0) goto L_0x02d9
            java.lang.Object r12 = r12.f13454e     // Catch:{ all -> 0x0cfd }
            boolean r13 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0cfd }
            if (r13 != 0) goto L_0x02e6
        L_0x02d9:
            r25 = r5
            r38 = r7
            r39 = r17
            r37 = r18
            r42 = r19
            r5 = 0
            r7 = 2
            goto L_0x0322
        L_0x02e6:
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0cfd }
            long r12 = r12.longValue()     // Catch:{ all -> 0x0cfd }
            q7.y6 r20 = new q7.y6     // Catch:{ all -> 0x0cfd }
            r21 = r7
            java.lang.String r7 = r2.f13313c     // Catch:{ all -> 0x0cfd }
            z6.b r22 = r41.a()     // Catch:{ all -> 0x0cfd }
            ag.m r22 = (ag.m) r22     // Catch:{ all -> 0x0cfd }
            long r22 = r22.b()     // Catch:{ all -> 0x0cfd }
            long r12 = r12 + r14
            java.lang.Long r24 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0cfd }
            r15 = r17
            r12 = r20
            r14 = 0
            r13 = r11
            r25 = r5
            r5 = r14
            r37 = r18
            r38 = r21
            r14 = r7
            r39 = r15
            r42 = r19
            r7 = 2
            r15 = r3
            r16 = r22
            r18 = r24
            r12.<init>(r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0cfd }
            r40 = r8
        L_0x031e:
            r3 = r20
            goto L_0x0390
        L_0x0322:
            q7.k r12 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r12)     // Catch:{ all -> 0x0cfd }
            q7.f r13 = r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r7 = q7.g2.F     // Catch:{ all -> 0x0cfd }
            int r7 = r13.l(r11, r7)     // Catch:{ all -> 0x0cfd }
            int r7 = r7 + -1
            u6.q.f(r11)     // Catch:{ all -> 0x0cfd }
            r12.i()     // Catch:{ all -> 0x0cfd }
            r12.j()     // Catch:{ all -> 0x0cfd }
            android.database.sqlite.SQLiteDatabase r13 = r12.B()     // Catch:{ SQLiteException -> 0x035c }
            java.lang.String r5 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r40 = r8
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0359 }
            r16 = 0
            r8[r16] = r11     // Catch:{ SQLiteException -> 0x0359 }
            r8[r29] = r11     // Catch:{ SQLiteException -> 0x0359 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0359 }
            r16 = 2
            r8[r16] = r7     // Catch:{ SQLiteException -> 0x0359 }
            r13.execSQL(r5, r8)     // Catch:{ SQLiteException -> 0x0359 }
            goto L_0x0375
        L_0x0359:
            r0 = move-exception
        L_0x035a:
            r5 = r0
            goto L_0x0360
        L_0x035c:
            r0 = move-exception
            r40 = r8
            goto L_0x035a
        L_0x0360:
            q7.k4 r7 = r12.f13121a     // Catch:{ all -> 0x0cfd }
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x0cfd }
            q7.s2 r7 = r7.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r7 = r7.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r8 = "Error pruning currencies. appId"
            q7.r2 r12 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            r7.d(r12, r5, r8)     // Catch:{ all -> 0x0cfd }
        L_0x0375:
            q7.y6 r20 = new q7.y6     // Catch:{ all -> 0x0cfd }
            java.lang.String r5 = r2.f13313c     // Catch:{ all -> 0x0cfd }
            z6.b r7 = r41.a()     // Catch:{ all -> 0x0cfd }
            ag.m r7 = (ag.m) r7     // Catch:{ all -> 0x0cfd }
            long r16 = r7.b()     // Catch:{ all -> 0x0cfd }
            java.lang.Long r18 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0cfd }
            r12 = r20
            r13 = r11
            r14 = r5
            r15 = r3
            r12.<init>(r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0cfd }
            goto L_0x031e
        L_0x0390:
            q7.k r5 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r5)     // Catch:{ all -> 0x0cfd }
            boolean r5 = r5.t(r3)     // Catch:{ all -> 0x0cfd }
            if (r5 != 0) goto L_0x03d0
            q7.s2 r5 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r5 = r5.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r7 = "Too many unique user properties are set. Ignoring user property. appId"
            q7.r2 r8 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            q7.n2 r12 = r6.s()     // Catch:{ all -> 0x0cfd }
            java.lang.String r13 = r3.f13452c     // Catch:{ all -> 0x0cfd }
            java.lang.String r12 = r12.f(r13)     // Catch:{ all -> 0x0cfd }
            java.lang.Object r3 = r3.f13454e     // Catch:{ all -> 0x0cfd }
            r5.e(r7, r8, r12, r3)     // Catch:{ all -> 0x0cfd }
            r41.P()     // Catch:{ all -> 0x0cfd }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r12 = r10
            r13 = r11
            q7.a7.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0cfd }
            goto L_0x03d0
        L_0x03c8:
            r25 = r5
            r38 = r7
            r40 = r8
            goto L_0x0226
        L_0x03d0:
            boolean r3 = q7.a7.X(r4)     // Catch:{ all -> 0x0cfd }
            boolean r5 = r9.equals(r4)     // Catch:{ all -> 0x0cfd }
            r41.P()     // Catch:{ all -> 0x0cfd }
            r9 = r38
            if (r9 != 0) goto L_0x03e2
            r13 = 0
            goto L_0x040a
        L_0x03e2:
            android.os.Bundle r12 = r9.f13275a     // Catch:{ all -> 0x0cfd }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0cfd }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0cfd }
            r13 = 0
        L_0x03ee:
            boolean r15 = r12.hasNext()     // Catch:{ all -> 0x0cfd }
            if (r15 == 0) goto L_0x040a
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x0cfd }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0cfd }
            android.os.Bundle r7 = r9.f13275a     // Catch:{ all -> 0x0cfd }
            java.lang.Object r7 = r7.get(r15)     // Catch:{ all -> 0x0cfd }
            boolean r8 = r7 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0cfd }
            if (r8 == 0) goto L_0x03ee
            android.os.Parcelable[] r7 = (android.os.Parcelable[]) r7     // Catch:{ all -> 0x0cfd }
            int r7 = r7.length     // Catch:{ all -> 0x0cfd }
            long r7 = (long) r7     // Catch:{ all -> 0x0cfd }
            long r13 = r13 + r7
            goto L_0x03ee
        L_0x040a:
            q7.k r12 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r12)     // Catch:{ all -> 0x0cfd }
            long r7 = r41.v()     // Catch:{ all -> 0x0cfd }
            r26 = 1
            long r16 = r13 + r26
            r18 = 1
            r20 = 0
            r22 = 0
            r13 = r7
            r15 = r11
            r19 = r3
            r21 = r5
            q7.i r7 = r12.F(r13, r15, r16, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0cfd }
            long r12 = r7.f13113b     // Catch:{ all -> 0x0cfd }
            r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r8 = q7.g2.m     // Catch:{ all -> 0x0cfd }
            r14 = 0
            java.lang.Object r8 = r8.a(r14)     // Catch:{ all -> 0x0cfd }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0cfd }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0cfd }
            long r14 = (long) r8     // Catch:{ all -> 0x0cfd }
            long r12 = r12 - r14
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r14 = 1000(0x3e8, double:4.94E-321)
            if (r8 <= 0) goto L_0x0470
            long r12 = r12 % r14
            int r2 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x045f
            q7.s2 r2 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            q7.r2 r4 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            long r5 = r7.f13113b     // Catch:{ all -> 0x0cfd }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0cfd }
            r2.d(r4, r5, r3)     // Catch:{ all -> 0x0cfd }
        L_0x045f:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r2.n()     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            return
        L_0x0470:
            if (r3 == 0) goto L_0x04cd
            long r12 = r7.f13112a     // Catch:{ all -> 0x0cfd }
            r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r8 = q7.g2.f13049o     // Catch:{ all -> 0x0cfd }
            r14 = 0
            java.lang.Object r8 = r8.a(r14)     // Catch:{ all -> 0x0cfd }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0cfd }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0cfd }
            long r14 = (long) r8     // Catch:{ all -> 0x0cfd }
            long r12 = r12 - r14
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x04cd
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r3 != 0) goto L_0x04aa
            q7.s2 r3 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r3 = r3.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            q7.r2 r5 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            long r6 = r7.f13112a     // Catch:{ all -> 0x0cfd }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cfd }
            r3.d(r5, r6, r4)     // Catch:{ all -> 0x0cfd }
        L_0x04aa:
            r41.P()     // Catch:{ all -> 0x0cfd }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f13311a     // Catch:{ all -> 0x0cfd }
            r17 = 0
            r12 = r10
            r13 = r11
            r16 = r2
            q7.a7.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r2.n()     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            return
        L_0x04cd:
            r8 = 1000000(0xf4240, float:1.401298E-39)
            if (r5 == 0) goto L_0x051f
            long r12 = r7.f13115d     // Catch:{ all -> 0x0cfd }
            q7.f r5 = r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r14 = q7.g2.f13047n     // Catch:{ all -> 0x0cfd }
            r15 = r40
            int r5 = r5.l(r15, r14)     // Catch:{ all -> 0x0cfd }
            int r5 = java.lang.Math.min(r8, r5)     // Catch:{ all -> 0x0cfd }
            r14 = 0
            int r5 = java.lang.Math.max(r14, r5)     // Catch:{ all -> 0x0cfd }
            r38 = r9
            long r8 = (long) r5     // Catch:{ all -> 0x0cfd }
            long r12 = r12 - r8
            r8 = 0
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0523
            int r2 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x050e
            q7.s2 r2 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = "Too many error events logged. appId, count"
            q7.r2 r4 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            long r5 = r7.f13115d     // Catch:{ all -> 0x0cfd }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0cfd }
            r2.d(r4, r5, r3)     // Catch:{ all -> 0x0cfd }
        L_0x050e:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r2.n()     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            return
        L_0x051f:
            r38 = r9
            r15 = r40
        L_0x0523:
            android.os.Bundle r5 = r38.w()     // Catch:{ all -> 0x0cfd }
            q7.a7 r7 = r41.P()     // Catch:{ all -> 0x0cfd }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f13313c     // Catch:{ all -> 0x0cfd }
            r7.A(r5, r8, r9)     // Catch:{ all -> 0x0cfd }
            q7.a7 r7 = r41.P()     // Catch:{ all -> 0x0cfd }
            boolean r7 = r7.S(r11)     // Catch:{ all -> 0x0cfd }
            java.lang.String r8 = "_r"
            if (r7 == 0) goto L_0x0552
            q7.a7 r7 = r41.P()     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = "_dbg"
            java.lang.Long r12 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0cfd }
            r7.A(r5, r9, r12)     // Catch:{ all -> 0x0cfd }
            q7.a7 r7 = r41.P()     // Catch:{ all -> 0x0cfd }
            r7.A(r5, r8, r12)     // Catch:{ all -> 0x0cfd }
        L_0x0552:
            java.lang.String r7 = "_s"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0cfd }
            if (r4 == 0) goto L_0x0576
            q7.k r4 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r4)     // Catch:{ all -> 0x0cfd }
            r7 = r25
            q7.y6 r4 = r4.H(r15, r7)     // Catch:{ all -> 0x0cfd }
            if (r4 == 0) goto L_0x0576
            java.lang.Object r9 = r4.f13454e     // Catch:{ all -> 0x0cfd }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0cfd }
            if (r9 == 0) goto L_0x0576
            q7.a7 r9 = r41.P()     // Catch:{ all -> 0x0cfd }
            java.lang.Object r4 = r4.f13454e     // Catch:{ all -> 0x0cfd }
            r9.A(r5, r7, r4)     // Catch:{ all -> 0x0cfd }
        L_0x0576:
            q7.k r4 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r4)     // Catch:{ all -> 0x0cfd }
            q7.k4 r7 = r4.f13121a
            u6.q.f(r11)     // Catch:{ all -> 0x0cfd }
            r4.i()     // Catch:{ all -> 0x0cfd }
            r4.j()     // Catch:{ all -> 0x0cfd }
            android.database.sqlite.SQLiteDatabase r4 = r4.B()     // Catch:{ SQLiteException -> 0x05bf }
            r9 = r7
            q7.x3 r9 = (q7.x3) r9     // Catch:{ SQLiteException -> 0x05bf }
            q7.f r9 = r9.o()     // Catch:{ SQLiteException -> 0x05bf }
            q7.f2 r12 = q7.g2.f13055r     // Catch:{ SQLiteException -> 0x05bf }
            int r9 = r9.l(r11, r12)     // Catch:{ SQLiteException -> 0x05bf }
            r12 = 1000000(0xf4240, float:1.401298E-39)
            int r9 = java.lang.Math.min(r12, r9)     // Catch:{ SQLiteException -> 0x05bf }
            r14 = 0
            int r9 = java.lang.Math.max(r14, r9)     // Catch:{ SQLiteException -> 0x05ba }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x05ba }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x05ba }
            r13[r14] = r11     // Catch:{ SQLiteException -> 0x05ba }
            r13[r29] = r9     // Catch:{ SQLiteException -> 0x05ba }
            r9 = r36
            int r4 = r4.delete(r9, r12, r13)     // Catch:{ SQLiteException -> 0x05b8 }
            long r12 = (long) r4
            goto L_0x05d9
        L_0x05b8:
            r0 = move-exception
            goto L_0x05bd
        L_0x05ba:
            r0 = move-exception
            r9 = r36
        L_0x05bd:
            r4 = r0
            goto L_0x05c4
        L_0x05bf:
            r0 = move-exception
            r9 = r36
            r14 = 0
            goto L_0x05bd
        L_0x05c4:
            q7.x3 r7 = (q7.x3) r7     // Catch:{ all -> 0x0cfd }
            q7.s2 r7 = r7.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r7 = r7.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r12 = "Error deleting over the limit events. appId"
            q7.r2 r13 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            r7.d(r13, r4, r12)     // Catch:{ all -> 0x0cfd }
            r12 = 0
        L_0x05d9:
            r16 = 0
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x05f4
            q7.s2 r4 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r4 = r4.p()     // Catch:{ all -> 0x0cfd }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            q7.r2 r14 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0cfd }
            r4.d(r14, r12, r7)     // Catch:{ all -> 0x0cfd }
        L_0x05f4:
            q7.o r4 = new q7.o     // Catch:{ all -> 0x0cfd }
            q7.x3 r13 = r1.H     // Catch:{ all -> 0x0cfd }
            java.lang.String r14 = r2.f13313c     // Catch:{ all -> 0x0cfd }
            java.lang.String r7 = r2.f13311a     // Catch:{ all -> 0x0cfd }
            r36 = r8
            r38 = r9
            long r8 = r2.f13314d     // Catch:{ all -> 0x0cfd }
            r12 = r4
            r2 = 0
            r2 = r15
            r15 = r11
            r16 = r7
            r17 = r8
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0cfd }
            java.lang.String r5 = r4.f13235b     // Catch:{ all -> 0x0cfd }
            q7.k r7 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r7)     // Catch:{ all -> 0x0cfd }
            q7.p r7 = r7.G(r11, r5)     // Catch:{ all -> 0x0cfd }
            if (r7 != 0) goto L_0x06a3
            q7.k r7 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r7)     // Catch:{ all -> 0x0cfd }
            long r7 = r7.A(r11)     // Catch:{ all -> 0x0cfd }
            q7.f r9 = r41.J()     // Catch:{ all -> 0x0cfd }
            r9.getClass()     // Catch:{ all -> 0x0cfd }
            q7.f2 r12 = q7.g2.I     // Catch:{ all -> 0x0cfd }
            r13 = 500(0x1f4, float:7.0E-43)
            r14 = 2000(0x7d0, float:2.803E-42)
            int r9 = r9.m(r11, r12, r13, r14)     // Catch:{ all -> 0x0cfd }
            long r13 = (long) r9     // Catch:{ all -> 0x0cfd }
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x0681
            if (r3 == 0) goto L_0x0681
            q7.s2 r2 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            q7.r2 r4 = q7.s2.r(r11)     // Catch:{ all -> 0x0cfd }
            q7.n2 r6 = r6.s()     // Catch:{ all -> 0x0cfd }
            java.lang.String r5 = r6.d(r5)     // Catch:{ all -> 0x0cfd }
            q7.f r6 = r41.J()     // Catch:{ all -> 0x0cfd }
            r6.getClass()     // Catch:{ all -> 0x0cfd }
            r7 = 500(0x1f4, float:7.0E-43)
            r8 = 2000(0x7d0, float:2.803E-42)
            int r6 = r6.m(r11, r12, r7, r8)     // Catch:{ all -> 0x0cfd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0cfd }
            r2.e(r3, r4, r5, r6)     // Catch:{ all -> 0x0cfd }
            r41.P()     // Catch:{ all -> 0x0cfd }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r12 = r10
            r13 = r11
            q7.a7.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            return
        L_0x0681:
            q7.p r3 = new q7.p     // Catch:{ all -> 0x0cfd }
            java.lang.String r14 = r4.f13235b     // Catch:{ all -> 0x0cfd }
            long r7 = r4.f13237d     // Catch:{ all -> 0x0cfd }
            r15 = 0
            r17 = 0
            r19 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12 = r3
            r13 = r11
            r21 = r7
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)     // Catch:{ all -> 0x0cfd }
            r40 = r2
            r26 = r6
            goto L_0x06dd
        L_0x06a3:
            long r8 = r7.f13258f     // Catch:{ all -> 0x0cfd }
            q7.o r4 = r4.a(r6, r8)     // Catch:{ all -> 0x0cfd }
            long r13 = r4.f13237d     // Catch:{ all -> 0x0cfd }
            q7.p r3 = new q7.p     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = r7.f13253a     // Catch:{ all -> 0x0cfd }
            java.lang.String r10 = r7.f13254b     // Catch:{ all -> 0x0cfd }
            long r11 = r7.f13255c     // Catch:{ all -> 0x0cfd }
            r25 = r4
            long r4 = r7.f13256d     // Catch:{ all -> 0x0cfd }
            r40 = r2
            long r1 = r7.f13257e     // Catch:{ all -> 0x0cf9 }
            r15 = r1
            long r1 = r7.f13259g     // Catch:{ all -> 0x0cf9 }
            java.lang.Long r8 = r7.f13260h     // Catch:{ all -> 0x0cf9 }
            r26 = r6
            java.lang.Long r6 = r7.f13261i     // Catch:{ all -> 0x0cf9 }
            r22 = r6
            java.lang.Long r6 = r7.f13262j     // Catch:{ all -> 0x0cf9 }
            java.lang.Boolean r7 = r7.f13263k     // Catch:{ all -> 0x0cf9 }
            r21 = r8
            r8 = r3
            r17 = r13
            r13 = r4
            r19 = r1
            r23 = r6
            r24 = r7
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r21, r22, r23, r24)     // Catch:{ all -> 0x0cf9 }
            r1 = r41
            r4 = r25
        L_0x06dd:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r2.p(r3)     // Catch:{ all -> 0x0cfd }
            q7.w3 r2 = r41.h()     // Catch:{ all -> 0x0cfd }
            r2.i()     // Catch:{ all -> 0x0cfd }
            r41.f()     // Catch:{ all -> 0x0cfd }
            java.lang.String r2 = r4.f13234a
            u6.q.f(r2)     // Catch:{ all -> 0x0cfd }
            r3 = r40
            boolean r5 = r2.equals(r3)     // Catch:{ all -> 0x0cfd }
            u6.q.a(r5)     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.n3 r5 = com.google.android.gms.internal.measurement.o3.G1()     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.o0(r6)     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.L0(r6)     // Catch:{ all -> 0x0cfd }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0cfd }
            if (r6 != 0) goto L_0x0725
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.U(r6, r3)     // Catch:{ all -> 0x0cfd }
        L_0x0725:
            boolean r6 = android.text.TextUtils.isEmpty(r35)     // Catch:{ all -> 0x0cfd }
            if (r6 != 0) goto L_0x0738
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x0cfd }
            r7 = r35
            com.google.android.gms.internal.measurement.o3.T(r6, r7)     // Catch:{ all -> 0x0cfd }
            goto L_0x073a
        L_0x0738:
            r7 = r35
        L_0x073a:
            boolean r6 = android.text.TextUtils.isEmpty(r34)     // Catch:{ all -> 0x0cfd }
            if (r6 != 0) goto L_0x074d
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x0cfd }
            r8 = r34
            com.google.android.gms.internal.measurement.o3.V(r6, r8)     // Catch:{ all -> 0x0cfd }
            goto L_0x074f
        L_0x074d:
            r8 = r34
        L_0x074f:
            com.google.android.gms.internal.measurement.kc.b()     // Catch:{ all -> 0x0cfd }
            r6 = r43
            java.lang.String r9 = r6.T     // Catch:{ all -> 0x0cfd }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0cfd }
            if (r9 != 0) goto L_0x0781
            q7.f r9 = r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r10 = q7.g2.f13041j0     // Catch:{ all -> 0x0cfd }
            r11 = 0
            boolean r9 = r9.r(r11, r10)     // Catch:{ all -> 0x0cfd }
            if (r9 != 0) goto L_0x0775
            q7.f r9 = r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r10 = q7.g2.f13045l0     // Catch:{ all -> 0x0cfd }
            boolean r9 = r9.r(r3, r10)     // Catch:{ all -> 0x0cfd }
            if (r9 == 0) goto L_0x0781
        L_0x0775:
            java.lang.String r9 = r6.T     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r10 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r10 = (com.google.android.gms.internal.measurement.o3) r10     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.u0(r10, r9)     // Catch:{ all -> 0x0cfd }
        L_0x0781:
            long r9 = r6.F     // Catch:{ all -> 0x0cfd }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0795
            int r9 = (int) r9     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r10 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r10 = (com.google.android.gms.internal.measurement.o3) r10     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.n0(r10, r9)     // Catch:{ all -> 0x0cfd }
        L_0x0795:
            long r9 = r6.f12952e     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r11 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r11 = (com.google.android.gms.internal.measurement.o3) r11     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.W(r11, r9)     // Catch:{ all -> 0x0cfd }
            boolean r9 = android.text.TextUtils.isEmpty(r37)     // Catch:{ all -> 0x0cfd }
            if (r9 != 0) goto L_0x07b4
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r9 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x0cfd }
            r10 = r37
            com.google.android.gms.internal.measurement.o3.i0(r9, r10)     // Catch:{ all -> 0x0cfd }
            goto L_0x07b6
        L_0x07b4:
            r10 = r37
        L_0x07b6:
            u6.q.i(r3)     // Catch:{ all -> 0x0cfd }
            q7.h r9 = r1.K(r3)     // Catch:{ all -> 0x0cfd }
            java.lang.String r11 = r6.R     // Catch:{ all -> 0x0cfd }
            q7.h r11 = q7.h.b(r11)     // Catch:{ all -> 0x0cfd }
            q7.h r9 = r9.c(r11)     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = r9.e()     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r11 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r11 = (com.google.android.gms.internal.measurement.o3) r11     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.R(r11, r9)     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = r5.t()     // Catch:{ all -> 0x0cfd }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0cfd }
            if (r9 == 0) goto L_0x07f1
            boolean r9 = android.text.TextUtils.isEmpty(r33)     // Catch:{ all -> 0x0cfd }
            if (r9 != 0) goto L_0x07f1
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r9 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x0cfd }
            r11 = r33
            com.google.android.gms.internal.measurement.o3.M(r9, r11)     // Catch:{ all -> 0x0cfd }
        L_0x07f1:
            long r11 = r6.B     // Catch:{ all -> 0x0cfd }
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0803
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r9 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.e0(r9, r11)     // Catch:{ all -> 0x0cfd }
        L_0x0803:
            long r11 = r6.O     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r9 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r9 = (com.google.android.gms.internal.measurement.o3) r9     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.P(r9, r11)     // Catch:{ all -> 0x0cfd }
            H(r42)     // Catch:{ all -> 0x0cfd }
            r9 = r42
            q7.t6 r11 = r9.f13208b     // Catch:{ all -> 0x0cfd }
            q7.x3 r11 = r11.H     // Catch:{ all -> 0x0cfd }
            android.content.Context r11 = r11.d()     // Catch:{ all -> 0x0cfd }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ all -> 0x0cfd }
            android.net.Uri r12 = com.google.android.gms.internal.measurement.q4.a()     // Catch:{ all -> 0x0cfd }
            q7.u r13 = q7.u.f13353a     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.k4 r11 = com.google.android.gms.internal.measurement.k4.a(r11, r12, r13)     // Catch:{ all -> 0x0cfd }
            if (r11 != 0) goto L_0x0831
            java.util.Map r11 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0cfd }
            goto L_0x0835
        L_0x0831:
            java.util.Map r11 = r11.b()     // Catch:{ all -> 0x0cfd }
        L_0x0835:
            q7.k4 r12 = r9.f13121a
            if (r11 == 0) goto L_0x08cd
            boolean r13 = r11.isEmpty()     // Catch:{ all -> 0x0cfd }
            if (r13 == 0) goto L_0x0841
            goto L_0x08cd
        L_0x0841:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0cfd }
            r13.<init>()     // Catch:{ all -> 0x0cfd }
            q7.f2 r14 = q7.g2.Q     // Catch:{ all -> 0x0cfd }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0cfd }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0cfd }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0cfd }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x0cfd }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0cfd }
        L_0x085b:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x0cfd }
            if (r15 == 0) goto L_0x08c4
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x0cfd }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ all -> 0x0cfd }
            java.lang.Object r16 = r15.getKey()     // Catch:{ all -> 0x0cfd }
            r42 = r11
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0cfd }
            r16 = r2
            java.lang.String r2 = "measurement.id."
            boolean r2 = r11.startsWith(r2)     // Catch:{ all -> 0x0cfd }
            if (r2 == 0) goto L_0x08bf
            java.lang.Object r2 = r15.getValue()     // Catch:{ NumberFormatException -> 0x08ad }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x08ad }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x08ad }
            if (r2 == 0) goto L_0x08bf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x08ad }
            r13.add(r2)     // Catch:{ NumberFormatException -> 0x08ad }
            int r2 = r13.size()     // Catch:{ NumberFormatException -> 0x08ad }
            if (r2 < r14) goto L_0x08bf
            r2 = r12
            q7.x3 r2 = (q7.x3) r2     // Catch:{ NumberFormatException -> 0x08ad }
            q7.s2 r2 = r2.e()     // Catch:{ NumberFormatException -> 0x08ad }
            q7.q2 r2 = r2.p()     // Catch:{ NumberFormatException -> 0x08ad }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r15 = r13.size()     // Catch:{ NumberFormatException -> 0x08ad }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NumberFormatException -> 0x08ad }
            r2.c(r15, r11)     // Catch:{ NumberFormatException -> 0x08ad }
            goto L_0x08c6
        L_0x08ad:
            r0 = move-exception
            r2 = r0
            r11 = r12
            q7.x3 r11 = (q7.x3) r11     // Catch:{ all -> 0x0cfd }
            q7.s2 r11 = r11.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r11 = r11.p()     // Catch:{ all -> 0x0cfd }
            java.lang.String r15 = "Experiment ID NumberFormatException"
            r11.c(r2, r15)     // Catch:{ all -> 0x0cfd }
        L_0x08bf:
            r11 = r42
            r2 = r16
            goto L_0x085b
        L_0x08c4:
            r16 = r2
        L_0x08c6:
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x0cfd }
            if (r2 == 0) goto L_0x08d0
            goto L_0x08cf
        L_0x08cd:
            r16 = r2
        L_0x08cf:
            r13 = 0
        L_0x08d0:
            if (r13 == 0) goto L_0x08d5
            r5.v(r13)     // Catch:{ all -> 0x0cfd }
        L_0x08d5:
            q7.h r2 = r1.K(r3)     // Catch:{ all -> 0x0cfd }
            java.lang.String r11 = r6.R     // Catch:{ all -> 0x0cfd }
            q7.h r11 = q7.h.b(r11)     // Catch:{ all -> 0x0cfd }
            q7.h r2 = r2.c(r11)     // Catch:{ all -> 0x0cfd }
            q7.g r11 = q7.g.f13015b     // Catch:{ all -> 0x0cfd }
            boolean r13 = r2.f(r11)     // Catch:{ all -> 0x0cfd }
            boolean r14 = r6.K
            if (r13 == 0) goto L_0x093b
            if (r14 == 0) goto L_0x093b
            q7.z5 r13 = r1.E     // Catch:{ all -> 0x0cfd }
            r13.getClass()     // Catch:{ all -> 0x0cfd }
            boolean r15 = r2.f(r11)     // Catch:{ all -> 0x0cfd }
            if (r15 == 0) goto L_0x0901
            android.util.Pair r13 = r13.m(r3)     // Catch:{ all -> 0x0cfd }
            r17 = r4
            goto L_0x090c
        L_0x0901:
            android.util.Pair r13 = new android.util.Pair     // Catch:{ all -> 0x0cfd }
            java.lang.String r15 = ""
            r17 = r4
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0cfd }
            r13.<init>(r15, r4)     // Catch:{ all -> 0x0cfd }
        L_0x090c:
            java.lang.Object r4 = r13.first     // Catch:{ all -> 0x0cfd }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x0cfd }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0cfd }
            if (r4 != 0) goto L_0x093d
            if (r14 == 0) goto L_0x093d
            java.lang.Object r4 = r13.first     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r15 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r15 = (com.google.android.gms.internal.measurement.o3) r15     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.Y(r15, r4)     // Catch:{ all -> 0x0cfd }
            java.lang.Object r4 = r13.second     // Catch:{ all -> 0x0cfd }
            if (r4 == 0) goto L_0x093d
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0cfd }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r13 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r13 = (com.google.android.gms.internal.measurement.o3) r13     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.a0(r13, r4)     // Catch:{ all -> 0x0cfd }
            goto L_0x093d
        L_0x093b:
            r17 = r4
        L_0x093d:
            q7.n r4 = r26.p()     // Catch:{ all -> 0x0cfd }
            r4.k()     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r13 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r13 = (com.google.android.gms.internal.measurement.o3) r13     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.O0(r13, r4)     // Catch:{ all -> 0x0cfd }
            q7.n r4 = r26.p()     // Catch:{ all -> 0x0cfd }
            r4.k()     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r13 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r13 = (com.google.android.gms.internal.measurement.o3) r13     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.M0(r13, r4)     // Catch:{ all -> 0x0cfd }
            q7.n r4 = r26.p()     // Catch:{ all -> 0x0cfd }
            r15 = r12
            long r12 = r4.n()     // Catch:{ all -> 0x0cfd }
            int r4 = (int) r12     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r12 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r12 = (com.google.android.gms.internal.measurement.o3) r12     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.R0(r12, r4)     // Catch:{ all -> 0x0cfd }
            q7.n r4 = r26.p()     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = r4.o()     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r12 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r12 = (com.google.android.gms.internal.measurement.o3) r12     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.Q0(r12, r4)     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.ob.a()     // Catch:{ all -> 0x0cfd }
            q7.f r4 = r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r12 = q7.g2.f13068x0     // Catch:{ all -> 0x0cfd }
            r13 = 0
            boolean r4 = r4.r(r13, r12)     // Catch:{ all -> 0x0cfd }
            if (r4 == 0) goto L_0x09a5
            long r12 = r6.V     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r4 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.z0(r4, r12)     // Catch:{ all -> 0x0cfd }
        L_0x09a5:
            boolean r4 = r26.g()     // Catch:{ all -> 0x0cfd }
            if (r4 == 0) goto L_0x09bf
            r5.r()     // Catch:{ all -> 0x0cfd }
            r4 = 0
            boolean r12 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0cfd }
            if (r12 == 0) goto L_0x09b6
            goto L_0x09bf
        L_0x09b6:
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r2 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r2 = (com.google.android.gms.internal.measurement.o3) r2     // Catch:{ all -> 0x0cfd }
            r2 = 0
            throw r2     // Catch:{ all -> 0x0cfd }
        L_0x09bf:
            q7.k r4 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r4)     // Catch:{ all -> 0x0cfd }
            q7.l4 r4 = r4.C(r3)     // Catch:{ all -> 0x0cfd }
            if (r4 != 0) goto L_0x0a21
            q7.l4 r4 = new q7.l4     // Catch:{ all -> 0x0cfd }
            r12 = r26
            r4.<init>(r12, r3)     // Catch:{ all -> 0x0cfd }
            java.lang.String r12 = r1.Q(r2)     // Catch:{ all -> 0x0cfd }
            r4.b(r12)     // Catch:{ all -> 0x0cfd }
            java.lang.String r12 = r6.G     // Catch:{ all -> 0x0cfd }
            r4.o(r12)     // Catch:{ all -> 0x0cfd }
            r4.p(r10)     // Catch:{ all -> 0x0cfd }
            boolean r10 = r2.f(r11)     // Catch:{ all -> 0x0cfd }
            if (r10 == 0) goto L_0x09ef
            q7.z5 r10 = r1.E     // Catch:{ all -> 0x0cfd }
            java.lang.String r10 = r10.n(r3, r14)     // Catch:{ all -> 0x0cfd }
            r4.w(r10)     // Catch:{ all -> 0x0cfd }
        L_0x09ef:
            r10 = 0
            r4.t(r10)     // Catch:{ all -> 0x0cfd }
            r4.u(r10)     // Catch:{ all -> 0x0cfd }
            r4.s(r10)     // Catch:{ all -> 0x0cfd }
            r4.d(r8)     // Catch:{ all -> 0x0cfd }
            long r10 = r6.F     // Catch:{ all -> 0x0cfd }
            r4.e(r10)     // Catch:{ all -> 0x0cfd }
            r4.c(r7)     // Catch:{ all -> 0x0cfd }
            long r7 = r6.f12952e     // Catch:{ all -> 0x0cfd }
            r4.q(r7)     // Catch:{ all -> 0x0cfd }
            long r7 = r6.B     // Catch:{ all -> 0x0cfd }
            r4.m(r7)     // Catch:{ all -> 0x0cfd }
            r7 = r32
            r4.v(r7)     // Catch:{ all -> 0x0cfd }
            long r6 = r6.O     // Catch:{ all -> 0x0cfd }
            r4.n(r6)     // Catch:{ all -> 0x0cfd }
            q7.k r6 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r6)     // Catch:{ all -> 0x0cfd }
            r6.o(r4)     // Catch:{ all -> 0x0cfd }
        L_0x0a21:
            q7.g r6 = q7.g.f13016c     // Catch:{ all -> 0x0cfd }
            boolean r2 = r2.f(r6)     // Catch:{ all -> 0x0cfd }
            if (r2 == 0) goto L_0x0a44
            java.lang.String r2 = r4.F()     // Catch:{ all -> 0x0cfd }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0cfd }
            if (r2 != 0) goto L_0x0a44
            java.lang.String r2 = r4.F()     // Catch:{ all -> 0x0cfd }
            u6.q.i(r2)     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r6 = (com.google.android.gms.internal.measurement.o3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.c0(r6, r2)     // Catch:{ all -> 0x0cfd }
        L_0x0a44:
            java.lang.String r2 = r4.H()     // Catch:{ all -> 0x0cfd }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0cfd }
            if (r2 != 0) goto L_0x0a5f
            java.lang.String r2 = r4.H()     // Catch:{ all -> 0x0cfd }
            u6.q.i(r2)     // Catch:{ all -> 0x0cfd }
            r5.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r4 = r5.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3 r4 = (com.google.android.gms.internal.measurement.o3) r4     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.o3.m0(r4, r2)     // Catch:{ all -> 0x0cfd }
        L_0x0a5f:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            java.util.List r2 = r2.M(r3)     // Catch:{ all -> 0x0cfd }
            r13 = 0
        L_0x0a69:
            int r3 = r2.size()     // Catch:{ all -> 0x0cfd }
            if (r13 >= r3) goto L_0x0b14
            com.google.android.gms.internal.measurement.w3 r3 = com.google.android.gms.internal.measurement.x3.w()     // Catch:{ all -> 0x0cfd }
            java.lang.Object r4 = r2.get(r13)     // Catch:{ all -> 0x0cfd }
            q7.y6 r4 = (q7.y6) r4     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = r4.f13452c     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r6 = (com.google.android.gms.internal.measurement.x3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.B(r6, r4)     // Catch:{ all -> 0x0cfd }
            java.lang.Object r4 = r2.get(r13)     // Catch:{ all -> 0x0cfd }
            q7.y6 r4 = (q7.y6) r4     // Catch:{ all -> 0x0cfd }
            long r6 = r4.f13453d     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r4 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r4 = (com.google.android.gms.internal.measurement.x3) r4     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.A(r4, r6)     // Catch:{ all -> 0x0cfd }
            H(r9)     // Catch:{ all -> 0x0cfd }
            java.lang.Object r4 = r2.get(r13)     // Catch:{ all -> 0x0cfd }
            q7.y6 r4 = (q7.y6) r4     // Catch:{ all -> 0x0cfd }
            java.lang.Object r4 = r4.f13454e     // Catch:{ all -> 0x0cfd }
            u6.q.i(r4)     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r6 = (com.google.android.gms.internal.measurement.x3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.D(r6)     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r6 = (com.google.android.gms.internal.measurement.x3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.F(r6)     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r6 = (com.google.android.gms.internal.measurement.x3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.H(r6)     // Catch:{ all -> 0x0cfd }
            boolean r6 = r4 instanceof java.lang.String     // Catch:{ all -> 0x0cfd }
            if (r6 == 0) goto L_0x0ad4
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r6 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r6 = (com.google.android.gms.internal.measurement.x3) r6     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.C(r6, r4)     // Catch:{ all -> 0x0cfd }
            goto L_0x0b0d
        L_0x0ad4:
            boolean r6 = r4 instanceof java.lang.Long     // Catch:{ all -> 0x0cfd }
            if (r6 == 0) goto L_0x0ae9
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0cfd }
            long r6 = r4.longValue()     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r4 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r4 = (com.google.android.gms.internal.measurement.x3) r4     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.E(r4, r6)     // Catch:{ all -> 0x0cfd }
            goto L_0x0b0d
        L_0x0ae9:
            boolean r6 = r4 instanceof java.lang.Double     // Catch:{ all -> 0x0cfd }
            if (r6 == 0) goto L_0x0afe
            java.lang.Double r4 = (java.lang.Double) r4     // Catch:{ all -> 0x0cfd }
            double r6 = r4.doubleValue()     // Catch:{ all -> 0x0cfd }
            r3.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r4 = r3.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3 r4 = (com.google.android.gms.internal.measurement.x3) r4     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.x3.G(r4, r6)     // Catch:{ all -> 0x0cfd }
            goto L_0x0b0d
        L_0x0afe:
            r12 = r15
            q7.x3 r12 = (q7.x3) r12     // Catch:{ all -> 0x0cfd }
            q7.s2 r6 = r12.E     // Catch:{ all -> 0x0cfd }
            q7.x3.l(r6)     // Catch:{ all -> 0x0cfd }
            java.lang.String r7 = "Ignoring invalid (type) user attribute value"
            q7.q2 r6 = r6.B     // Catch:{ all -> 0x0cfd }
            r6.c(r4, r7)     // Catch:{ all -> 0x0cfd }
        L_0x0b0d:
            r5.w(r3)     // Catch:{ all -> 0x0cfd }
            int r13 = r13 + 1
            goto L_0x0a69
        L_0x0b14:
            q7.k r2 = r1.f13350c     // Catch:{ IOException -> 0x0caf }
            H(r2)     // Catch:{ IOException -> 0x0caf }
            com.google.android.gms.internal.measurement.g7 r3 = r5.j()     // Catch:{ IOException -> 0x0caf }
            com.google.android.gms.internal.measurement.o3 r3 = (com.google.android.gms.internal.measurement.o3) r3     // Catch:{ IOException -> 0x0caf }
            r2.i()     // Catch:{ IOException -> 0x0caf }
            r2.j()     // Catch:{ IOException -> 0x0caf }
            java.lang.String r4 = r3.K1()     // Catch:{ IOException -> 0x0caf }
            u6.q.f(r4)     // Catch:{ IOException -> 0x0caf }
            byte[] r4 = r3.e()     // Catch:{ IOException -> 0x0caf }
            q7.t6 r6 = r2.f13208b     // Catch:{ IOException -> 0x0caf }
            q7.v6 r6 = r6.C     // Catch:{ IOException -> 0x0caf }
            H(r6)     // Catch:{ IOException -> 0x0caf }
            long r6 = r6.w(r4)     // Catch:{ IOException -> 0x0caf }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ IOException -> 0x0caf }
            r8.<init>()     // Catch:{ IOException -> 0x0caf }
            java.lang.String r9 = "app_id"
            java.lang.String r10 = r3.K1()     // Catch:{ IOException -> 0x0caf }
            r8.put(r9, r10)     // Catch:{ IOException -> 0x0caf }
            java.lang.String r9 = "metadata_fingerprint"
            java.lang.Long r10 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x0caf }
            r8.put(r9, r10)     // Catch:{ IOException -> 0x0caf }
            java.lang.String r9 = "metadata"
            r8.put(r9, r4)     // Catch:{ IOException -> 0x0caf }
            android.database.sqlite.SQLiteDatabase r4 = r2.B()     // Catch:{ SQLiteException -> 0x0c93 }
            java.lang.String r9 = "raw_events_metadata"
            r10 = 4
            r11 = 0
            r4.insertWithOnConflict(r9, r11, r8, r10)     // Catch:{ SQLiteException -> 0x0c93 }
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r4 = r17
            q7.q r3 = r4.f13239f     // Catch:{ all -> 0x0cfd }
            android.os.Bundle r3 = r3.f13275a     // Catch:{ all -> 0x0cfd }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0cfd }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0cfd }
        L_0x0b75:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0cfd }
            if (r5 == 0) goto L_0x0b8f
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0cfd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0cfd }
            r8 = r36
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0cfd }
            if (r5 == 0) goto L_0x0b8c
            r5 = r16
            goto L_0x0bc3
        L_0x0b8c:
            r36 = r8
            goto L_0x0b75
        L_0x0b8f:
            H(r39)     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = r4.f13235b     // Catch:{ all -> 0x0cfd }
            r5 = r16
            r8 = r39
            boolean r3 = r8.u(r5, r3)     // Catch:{ all -> 0x0cfd }
            q7.k r8 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r8)     // Catch:{ all -> 0x0cfd }
            long r9 = r41.v()     // Catch:{ all -> 0x0cfd }
            java.lang.String r11 = r4.f13234a     // Catch:{ all -> 0x0cfd }
            r12 = 0
            r13 = 0
            q7.i r8 = r8.E(r9, r11, r12, r13)     // Catch:{ all -> 0x0cfd }
            if (r3 == 0) goto L_0x0bc1
            long r8 = r8.f13116e     // Catch:{ all -> 0x0cfd }
            q7.f r3 = r41.J()     // Catch:{ all -> 0x0cfd }
            q7.f2 r10 = q7.g2.f13053q     // Catch:{ all -> 0x0cfd }
            int r3 = r3.l(r5, r10)     // Catch:{ all -> 0x0cfd }
            long r10 = (long) r3     // Catch:{ all -> 0x0cfd }
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x0bc1
            goto L_0x0bc3
        L_0x0bc1:
            r29 = 0
        L_0x0bc3:
            r2.i()     // Catch:{ all -> 0x0cfd }
            r2.j()     // Catch:{ all -> 0x0cfd }
            u6.q.f(r5)     // Catch:{ all -> 0x0cfd }
            q7.t6 r3 = r2.f13208b     // Catch:{ all -> 0x0cfd }
            q7.v6 r3 = r3.C     // Catch:{ all -> 0x0cfd }
            H(r3)     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.e3 r8 = com.google.android.gms.internal.measurement.f3.x()     // Catch:{ all -> 0x0cfd }
            r8.l()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.g7 r9 = r8.f5179b     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.f3 r9 = (com.google.android.gms.internal.measurement.f3) r9     // Catch:{ all -> 0x0cfd }
            long r10 = r4.f13238e     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.f3.J(r10, r9)     // Catch:{ all -> 0x0cfd }
            q7.q r9 = r4.f13239f     // Catch:{ all -> 0x0cfd }
            android.os.Bundle r10 = r9.f13275a     // Catch:{ all -> 0x0cfd }
            java.util.Set r10 = r10.keySet()     // Catch:{ all -> 0x0cfd }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0cfd }
        L_0x0bef:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0cfd }
            if (r11 == 0) goto L_0x0c12
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0cfd }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.i3 r12 = com.google.android.gms.internal.measurement.j3.x()     // Catch:{ all -> 0x0cfd }
            r12.n(r11)     // Catch:{ all -> 0x0cfd }
            android.os.Bundle r13 = r9.f13275a     // Catch:{ all -> 0x0cfd }
            java.lang.Object r11 = r13.get(r11)     // Catch:{ all -> 0x0cfd }
            u6.q.i(r11)     // Catch:{ all -> 0x0cfd }
            r3.G(r12, r11)     // Catch:{ all -> 0x0cfd }
            r8.o(r12)     // Catch:{ all -> 0x0cfd }
            goto L_0x0bef
        L_0x0c12:
            com.google.android.gms.internal.measurement.g7 r3 = r8.j()     // Catch:{ all -> 0x0cfd }
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3     // Catch:{ all -> 0x0cfd }
            byte[] r3 = r3.e()     // Catch:{ all -> 0x0cfd }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0cfd }
            r8.<init>()     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = "app_id"
            r8.put(r9, r5)     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = "name"
            java.lang.String r10 = r4.f13235b     // Catch:{ all -> 0x0cfd }
            r8.put(r9, r10)     // Catch:{ all -> 0x0cfd }
            java.lang.String r9 = "timestamp"
            long r10 = r4.f13237d     // Catch:{ all -> 0x0cfd }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0cfd }
            r8.put(r9, r4)     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0cfd }
            r8.put(r4, r6)     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = "data"
            r8.put(r4, r3)     // Catch:{ all -> 0x0cfd }
            java.lang.String r3 = "realtime"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x0cfd }
            r8.put(r3, r4)     // Catch:{ all -> 0x0cfd }
            android.database.sqlite.SQLiteDatabase r3 = r2.B()     // Catch:{ SQLiteException -> 0x0c7b }
            r4 = r38
            r6 = 0
            long r3 = r3.insert(r4, r6, r8)     // Catch:{ SQLiteException -> 0x0c7b }
            r6 = -1
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0c76
            q7.k4 r3 = r2.f13121a     // Catch:{ SQLiteException -> 0x0c7b }
            q7.x3 r3 = (q7.x3) r3     // Catch:{ SQLiteException -> 0x0c7b }
            q7.s2 r3 = r3.e()     // Catch:{ SQLiteException -> 0x0c7b }
            q7.q2 r3 = r3.n()     // Catch:{ SQLiteException -> 0x0c7b }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            q7.r2 r6 = q7.s2.r(r5)     // Catch:{ SQLiteException -> 0x0c7b }
            r3.c(r6, r4)     // Catch:{ SQLiteException -> 0x0c7b }
            goto L_0x0cc6
        L_0x0c76:
            r2 = 0
            r1.K = r2     // Catch:{ all -> 0x0cfd }
            goto L_0x0cc6
        L_0x0c7b:
            r0 = move-exception
            r3 = r0
            q7.k4 r2 = r2.f13121a     // Catch:{ all -> 0x0cfd }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ all -> 0x0cfd }
            q7.s2 r2 = r2.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r2 = r2.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = "Error storing raw event. appId"
            q7.r2 r5 = q7.s2.r(r5)     // Catch:{ all -> 0x0cfd }
            r2.d(r5, r3, r4)     // Catch:{ all -> 0x0cfd }
            goto L_0x0cc6
        L_0x0c93:
            r0 = move-exception
            r4 = r0
            q7.k4 r2 = r2.f13121a     // Catch:{ IOException -> 0x0caf }
            q7.x3 r2 = (q7.x3) r2     // Catch:{ IOException -> 0x0caf }
            q7.s2 r2 = r2.e()     // Catch:{ IOException -> 0x0caf }
            q7.q2 r2 = r2.n()     // Catch:{ IOException -> 0x0caf }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r3 = r3.K1()     // Catch:{ IOException -> 0x0caf }
            q7.r2 r3 = q7.s2.r(r3)     // Catch:{ IOException -> 0x0caf }
            r2.d(r3, r4, r6)     // Catch:{ IOException -> 0x0caf }
            throw r4     // Catch:{ IOException -> 0x0caf }
        L_0x0caf:
            r0 = move-exception
            r2 = r0
            q7.s2 r3 = r41.e()     // Catch:{ all -> 0x0cfd }
            q7.q2 r3 = r3.n()     // Catch:{ all -> 0x0cfd }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r5.r()     // Catch:{ all -> 0x0cfd }
            q7.r2 r5 = q7.s2.r(r5)     // Catch:{ all -> 0x0cfd }
            r3.d(r5, r2, r4)     // Catch:{ all -> 0x0cfd }
        L_0x0cc6:
            q7.k r2 = r1.f13350c     // Catch:{ all -> 0x0cfd }
            H(r2)     // Catch:{ all -> 0x0cfd }
            r2.n()     // Catch:{ all -> 0x0cfd }
            q7.k r2 = r1.f13350c
            H(r2)
            r2.P()
            r41.C()
            q7.s2 r2 = r41.e()
            q7.q2 r2 = r2.o()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r30
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.c(r3, r4)
            return
        L_0x0cf9:
            r0 = move-exception
            r1 = r41
            goto L_0x0cfe
        L_0x0cfd:
            r0 = move-exception
        L_0x0cfe:
            r2 = r0
            q7.k r3 = r1.f13350c
            H(r3)
            r3.P()
            throw r2
        L_0x0d08:
            r6 = r3
            r1.I(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.t6.u(q7.s, q7.c7):void");
    }

    public final long v() {
        ((m) a()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        z5 z5Var = this.E;
        z5Var.j();
        z5Var.i();
        d3 d3Var = z5Var.E;
        long a10 = d3Var.a();
        if (a10 == 0) {
            a7 a7Var = ((x3) z5Var.f13121a).H;
            x3.j(a7Var);
            a10 = ((long) a7Var.r().nextInt(86400000)) + 1;
            d3Var.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    public final c7 y(String str) {
        String str2 = str;
        k kVar = this.f13350c;
        H(kVar);
        l4 C2 = kVar.C(str2);
        if (C2 == null || TextUtils.isEmpty(C2.G())) {
            e().I.c(str2, "No app data available; dropping");
            return null;
        }
        Boolean z10 = z(C2);
        if (z10 == null || z10.booleanValue()) {
            String I2 = C2.I();
            String G2 = C2.G();
            long A = C2.A();
            x3 x3Var = C2.f13162a;
            w3 w3Var = x3Var.F;
            x3.l(w3Var);
            w3Var.i();
            String str3 = C2.f13173l;
            w3 w3Var2 = x3Var.F;
            x3.l(w3Var2);
            w3Var2.i();
            long j10 = C2.m;
            w3 w3Var3 = x3Var.F;
            x3.l(w3Var3);
            w3Var3.i();
            long j11 = C2.f13174n;
            w3 w3Var4 = x3Var.F;
            x3.l(w3Var4);
            w3Var4.i();
            boolean z11 = C2.f13175o;
            String H2 = C2.H();
            w3 w3Var5 = x3Var.F;
            x3.l(w3Var5);
            w3Var5.i();
            boolean y10 = C2.y();
            String C3 = C2.C();
            w3 w3Var6 = x3Var.F;
            x3.l(w3Var6);
            w3Var6.i();
            Boolean bool = C2.f13178r;
            long B2 = C2.B();
            w3 w3Var7 = x3Var.F;
            x3.l(w3Var7);
            w3Var7.i();
            ArrayList arrayList = C2.f13180t;
            String e10 = K(str).e();
            boolean z12 = C2.z();
            w3 w3Var8 = x3Var.F;
            x3.l(w3Var8);
            w3Var8.i();
            ArrayList arrayList2 = arrayList;
            return new c7(str, I2, G2, A, str3, j10, j11, (String) null, z11, false, H2, 0, 0, y10, false, C3, bool, B2, arrayList2, e10, "", (String) null, z12, C2.f13183w);
        }
        s2 e11 = e();
        e11.B.c(s2.r(str), "App version does not match; dropping. appId");
        return null;
    }

    public final Boolean z(l4 l4Var) {
        try {
            int i8 = (l4Var.A() > -2147483648L ? 1 : (l4Var.A() == -2147483648L ? 0 : -1));
            x3 x3Var = this.H;
            if (i8 != 0) {
                if (l4Var.A() == ((long) b7.c.a(x3Var.f13419a).b(0, l4Var.E()).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = b7.c.a(x3Var.f13419a).b(0, l4Var.E()).versionName;
                String G2 = l4Var.G();
                if (G2 != null && G2.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
