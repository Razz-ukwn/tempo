package z9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ea.e;
import ga.d;
import j0.m;
import j0.n;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k7.g;
import m9.f;
import t.w2;
import y9.b;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17895a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f17896b;

    /* renamed from: c  reason: collision with root package name */
    public final g f17897c = new g();

    /* renamed from: d  reason: collision with root package name */
    public final long f17898d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public w2 f17899e;

    /* renamed from: f  reason: collision with root package name */
    public w2 f17900f;

    /* renamed from: g  reason: collision with root package name */
    public p f17901g;

    /* renamed from: h  reason: collision with root package name */
    public final g0 f17902h;

    /* renamed from: i  reason: collision with root package name */
    public final e f17903i;

    /* renamed from: j  reason: collision with root package name */
    public final b f17904j;

    /* renamed from: k  reason: collision with root package name */
    public final x9.a f17905k;

    /* renamed from: l  reason: collision with root package name */
    public final ExecutorService f17906l;
    public final g m;

    /* renamed from: n  reason: collision with root package name */
    public final w9.a f17907n;

    public class a implements Callable<Boolean> {
        public a() {
        }

        public final Object call() {
            try {
                w2 w2Var = x.this.f17899e;
                e eVar = (e) w2Var.f15269b;
                eVar.getClass();
                boolean delete = new File(eVar.f7904b, (String) w2Var.f15268a).delete();
                if (!delete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", (Throwable) null);
                }
                return Boolean.valueOf(delete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    public x(f fVar, g0 g0Var, w9.b bVar, c0 c0Var, m mVar, n nVar, e eVar, ExecutorService executorService) {
        this.f17896b = c0Var;
        fVar.a();
        this.f17895a = fVar.f11331a;
        this.f17902h = g0Var;
        this.f17907n = bVar;
        this.f17904j = mVar;
        this.f17905k = nVar;
        this.f17906l = executorService;
        this.f17903i = eVar;
        this.m = new g(executorService);
    }

    public static Task a(x xVar, ga.f fVar) {
        Task<Void> task;
        if (Boolean.TRUE.equals(xVar.m.f17830d.get())) {
            xVar.f17899e.d();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", (Throwable) null);
            }
            try {
                xVar.f17904j.a(new u(xVar));
                d dVar = (d) fVar;
                if (!dVar.b().f8900b.f8905a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", (Throwable) null);
                    }
                    task = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                } else {
                    if (!xVar.f17901g.d(dVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", (Throwable) null);
                    }
                    task = xVar.f17901g.f(dVar.f8918i.get().getTask());
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                task = Tasks.forException(e10);
            } catch (Throwable th) {
                xVar.c();
                throw th;
            }
            xVar.c();
            return task;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(d dVar) {
        Future<?> submit = this.f17906l.submit(new w(this, dVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", (Throwable) null);
        }
        try {
            submit.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        this.m.a(new a());
    }
}
