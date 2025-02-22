package z9;

import android.util.Log;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17882a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f17883b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f17884c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f17885d;

    public r(p pVar, long j10, Exception exc, Thread thread) {
        this.f17885d = pVar;
        this.f17882a = j10;
        this.f17883b = exc;
        this.f17884c = thread;
    }

    public final void run() {
        p pVar = this.f17885d;
        b0 b0Var = pVar.f17874l;
        if (!(b0Var != null && b0Var.f17801e.get())) {
            long j10 = this.f17882a / 1000;
            String e10 = pVar.e();
            if (e10 == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", (Throwable) null);
                return;
            }
            Throwable th = this.f17883b;
            Thread thread = this.f17884c;
            i0 i0Var = pVar.f17873k;
            i0Var.getClass();
            String concat = "Persisting non-fatal event for session ".concat(e10);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, (Throwable) null);
            }
            i0Var.d(th, thread, e10, "error", j10, false);
        }
    }
}
