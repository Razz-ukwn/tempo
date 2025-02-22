package fa;

import a6.d;
import a6.f;
import android.os.SystemClock;
import android.util.Log;
import ba.b0;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.u;
import ga.b;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k7.g;
import z9.a0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final double f8651a;

    /* renamed from: b  reason: collision with root package name */
    public final double f8652b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8653c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8654d = SystemClock.elapsedRealtime();

    /* renamed from: e  reason: collision with root package name */
    public final int f8655e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayBlockingQueue f8656f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f8657g;

    /* renamed from: h  reason: collision with root package name */
    public final f<b0> f8658h;

    /* renamed from: i  reason: collision with root package name */
    public final g f8659i;

    /* renamed from: j  reason: collision with root package name */
    public int f8660j;

    /* renamed from: k  reason: collision with root package name */
    public long f8661k;

    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f8662a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<a0> f8663b;

        public a(a0 a0Var, TaskCompletionSource taskCompletionSource) {
            this.f8662a = a0Var;
            this.f8663b = taskCompletionSource;
        }

        public final void run() {
            c cVar = c.this;
            a0 a0Var = this.f8662a;
            cVar.b(a0Var, this.f8663b);
            boolean z10 = false;
            ((AtomicInteger) cVar.f8659i.f10365a).set(0);
            double min = Math.min(3600000.0d, Math.pow(cVar.f8652b, (double) cVar.a()) * (60000.0d / cVar.f8651a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(min / 1000.0d)}) + " s for report: " + a0Var.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public c(f<b0> fVar, b bVar, g gVar) {
        double d10 = bVar.f8902d;
        this.f8651a = d10;
        this.f8652b = bVar.f8903e;
        this.f8653c = ((long) bVar.f8904f) * 1000;
        this.f8658h = fVar;
        this.f8659i = gVar;
        int i8 = (int) d10;
        this.f8655e = i8;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i8);
        this.f8656f = arrayBlockingQueue;
        this.f8657g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f8660j = 0;
        this.f8661k = 0;
    }

    public final int a() {
        if (this.f8661k == 0) {
            this.f8661k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f8661k) / this.f8653c);
        int min = this.f8656f.size() == this.f8655e ? Math.min(100, this.f8660j + currentTimeMillis) : Math.max(0, this.f8660j - currentTimeMillis);
        if (this.f8660j != min) {
            this.f8660j = min;
            this.f8661k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(a0 a0Var, TaskCompletionSource<a0> taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + a0Var.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
        ((u) this.f8658h).a(new a6.a(a0Var.a(), d.f120c), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.f8654d < 2000, a0Var));
    }
}
