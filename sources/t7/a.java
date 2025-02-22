package t7;

import ag.m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b7.c;
import com.google.android.gms.internal.p000firebaseauthapi.sb;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import q7.p4;
import u6.q;
import z6.f;
import z6.h;

public final class a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f15429n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o  reason: collision with root package name */
    public static volatile ScheduledExecutorService f15430o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f15431p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f15432a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f15433b;

    /* renamed from: c  reason: collision with root package name */
    public int f15434c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f15435d;

    /* renamed from: e  reason: collision with root package name */
    public long f15436e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f15437f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f15438g = true;

    /* renamed from: h  reason: collision with root package name */
    public l7.a f15439h;

    /* renamed from: i  reason: collision with root package name */
    public final m f15440i = m.D;

    /* renamed from: j  reason: collision with root package name */
    public final String f15441j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f15442k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f15443l = new AtomicInteger(0);
    public final ScheduledExecutorService m;

    public a(Context context) {
        boolean z10;
        String packageName = context.getPackageName();
        q.g("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f15439h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.f15441j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        } else {
            this.f15441j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f15433b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = h.f17775a;
            synchronized (h.class) {
                Boolean bool = h.f17779e;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    Boolean valueOf = Boolean.valueOf(t1.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
                    h.f17779e = valueOf;
                    z10 = valueOf.booleanValue();
                }
            }
            if (z10) {
                packageName = f.b(packageName) ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo a10 = c.a(context).a(0, packageName);
                        if (a10 == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i8 = a10.uid;
                            workSource = new WorkSource();
                            h.a(workSource, i8, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f15433b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f15430o;
            if (scheduledExecutorService == null) {
                synchronized (f15431p) {
                    scheduledExecutorService = f15430o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f15430o = scheduledExecutorService;
                    }
                }
            }
            this.m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("expected a non-null reference", 0, 29);
        throw new sb(sb2.toString());
    }

    public final void a(long j10) {
        this.f15443l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f15429n), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f15432a) {
            try {
                if (!b()) {
                    this.f15439h = l7.a.f11011a;
                    this.f15433b.acquire();
                    this.f15440i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f15434c++;
                if (this.f15438g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                b bVar = (b) this.f15442k.get((Object) null);
                if (bVar == null) {
                    bVar = new b(0);
                    this.f15442k.put((Object) null, bVar);
                }
                bVar.f15444a++;
                this.f15440i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f15436e) {
                    this.f15436e = j11;
                    ScheduledFuture scheduledFuture = this.f15435d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f15435d = this.m.schedule(new p4(this, 2), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f15432a) {
            z10 = this.f15434c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f15443l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f15441j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f15432a) {
            try {
                if (this.f15438g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.f15442k.containsKey((Object) null)) {
                    b bVar = (b) this.f15442k.get((Object) null);
                    if (bVar != null) {
                        int i8 = bVar.f15444a - 1;
                        bVar.f15444a = i8;
                        if (i8 == 0) {
                            this.f15442k.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f15441j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f15437f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() > 0) {
                c cVar = (c) arrayList.get(0);
                throw null;
            }
        }
    }

    public final void e() {
        synchronized (this.f15432a) {
            if (b()) {
                if (this.f15438g) {
                    int i8 = this.f15434c - 1;
                    this.f15434c = i8;
                    if (i8 > 0) {
                        return;
                    }
                } else {
                    this.f15434c = 0;
                }
                d();
                for (b bVar : this.f15442k.values()) {
                    bVar.f15444a = 0;
                }
                this.f15442k.clear();
                ScheduledFuture scheduledFuture = this.f15435d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f15435d = null;
                    this.f15436e = 0;
                }
                if (this.f15433b.isHeld()) {
                    try {
                        this.f15433b.release();
                        if (this.f15439h != null) {
                            this.f15439h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f15441j).concat(" failed to release!"), e10);
                            if (this.f15439h != null) {
                                this.f15439h = null;
                            }
                            return;
                        }
                        throw e10;
                    } catch (Throwable th) {
                        if (this.f15439h != null) {
                            this.f15439h = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f15441j).concat(" should be held!"));
                }
            }
        }
    }
}
