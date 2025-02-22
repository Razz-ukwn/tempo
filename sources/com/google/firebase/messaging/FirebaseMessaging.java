package com.google.firebase.messaging;

import a6.g;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.j;
import androidx.activity.l;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m9.f;
import na.d;
import oa.h;
import qa.b;
import u6.q;
import wa.b0;
import wa.e0;
import wa.f0;
import wa.m;
import wa.n;
import wa.o;
import wa.p;
import wa.s;
import wa.x;

public class FirebaseMessaging {

    /* renamed from: l  reason: collision with root package name */
    public static final long f6328l = TimeUnit.HOURS.toSeconds(8);
    public static a m;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: n  reason: collision with root package name */
    public static g f6329n;

    /* renamed from: o  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6330o;

    /* renamed from: a  reason: collision with root package name */
    public final f f6331a;

    /* renamed from: b  reason: collision with root package name */
    public final pa.a f6332b;

    /* renamed from: c  reason: collision with root package name */
    public final ra.f f6333c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f6334d;

    /* renamed from: e  reason: collision with root package name */
    public final p f6335e;

    /* renamed from: f  reason: collision with root package name */
    public final x f6336f;

    /* renamed from: g  reason: collision with root package name */
    public final a f6337g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f6338h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f6339i;

    /* renamed from: j  reason: collision with root package name */
    public final s f6340j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6341k;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f6342a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6343b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f6344c;

        public a(d dVar) {
            this.f6342a = dVar;
        }

        public final synchronized void a() {
            if (!this.f6343b) {
                Boolean b10 = b();
                this.f6344c = b10;
                if (b10 == null) {
                    this.f6342a.b(new o(this));
                }
                this.f6343b = true;
            }
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            f fVar = FirebaseMessaging.this.f6331a;
            fVar.a();
            Context context = fVar.f11331a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(f fVar, pa.a aVar, b<ya.g> bVar, b<h> bVar2, ra.f fVar2, g gVar, d dVar) {
        f fVar3 = fVar;
        pa.a aVar2 = aVar;
        fVar.a();
        Context context = fVar3.f11331a;
        s sVar = new s(context);
        p pVar = new p(fVar, sVar, bVar, bVar2, fVar2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a7.b("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a7.b("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a7.b("Firebase-Messaging-File-Io"));
        this.f6341k = false;
        f6329n = gVar;
        this.f6331a = fVar3;
        this.f6332b = aVar2;
        this.f6333c = fVar2;
        this.f6337g = new a(dVar);
        fVar.a();
        Context context2 = fVar3.f11331a;
        this.f6334d = context2;
        m mVar = new m();
        this.f6340j = sVar;
        this.f6335e = pVar;
        this.f6336f = new x(newSingleThreadExecutor);
        this.f6338h = scheduledThreadPoolExecutor;
        this.f6339i = threadPoolExecutor;
        fVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(mVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar2 != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new j(this, 11));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a7.b("Firebase-Messaging-Topics-Io"));
        int i8 = f0.f16581j;
        Tasks.call(scheduledThreadPoolExecutor2, new e0(context2, this, pVar, sVar, scheduledThreadPoolExecutor2)).addOnSuccessListener((Executor) scheduledThreadPoolExecutor, new j0.m(this, 6));
        scheduledThreadPoolExecutor.execute(new l(this, 8));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(b0 b0Var, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f6330o == null) {
                f6330o = new ScheduledThreadPoolExecutor(1, new a7.b("TAG"));
            }
            f6330o.schedule(b0Var, j10, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.b(FirebaseMessaging.class);
            q.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task<TContinuationResult> task;
        pa.a aVar = this.f6332b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            a.C0080a c3 = c();
            if (!f(c3)) {
                return c3.f6348a;
            }
            String a10 = s.a(this.f6331a);
            x xVar = this.f6336f;
            synchronized (xVar) {
                task = (Task) xVar.f16655b.getOrDefault(a10, null);
                if (task == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Making new request for: " + a10);
                    }
                    p pVar = this.f6335e;
                    task = pVar.a(pVar.c(s.a(pVar.f16632a), "*", new Bundle())).onSuccessTask(this.f6339i, new n(this, a10, c3)).continueWithTask(xVar.f16654a, new k6.l(xVar, a10));
                    xVar.f16655b.put(a10, task);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + a10);
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public final a.C0080a c() {
        a aVar;
        a.C0080a b10;
        Context context = this.f6334d;
        synchronized (FirebaseMessaging.class) {
            if (m == null) {
                m = new a(context);
            }
            aVar = m;
        }
        f fVar = this.f6331a;
        fVar.a();
        String f10 = "[DEFAULT]".equals(fVar.f11332b) ? "" : fVar.f();
        String a10 = s.a(this.f6331a);
        synchronized (aVar) {
            SharedPreferences sharedPreferences = aVar.f6346a;
            b10 = a.C0080a.b(sharedPreferences.getString(f10 + "|T|" + a10 + "|*", (String) null));
        }
        return b10;
    }

    public final void d() {
        pa.a aVar = this.f6332b;
        if (aVar != null) {
            aVar.a();
        } else if (f(c())) {
            synchronized (this) {
                if (!this.f6341k) {
                    e(0);
                }
            }
        }
    }

    public final synchronized void e(long j10) {
        b(new b0(this, Math.min(Math.max(30, 2 * j10), f6328l)), j10);
        this.f6341k = true;
    }

    public final boolean f(a.C0080a aVar) {
        String str;
        if (aVar == null) {
            return true;
        }
        s sVar = this.f6340j;
        synchronized (sVar) {
            if (sVar.f16642b == null) {
                sVar.d();
            }
            str = sVar.f16642b;
        }
        return (System.currentTimeMillis() > (aVar.f6350c + a.C0080a.f6347d) ? 1 : (System.currentTimeMillis() == (aVar.f6350c + a.C0080a.f6347d) ? 0 : -1)) > 0 || !str.equals(aVar.f6349b);
    }
}
