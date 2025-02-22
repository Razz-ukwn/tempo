package z9;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ea.e;
import ga.d;
import ga.f;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class m implements Callable<Task<Void>> {
    public final /* synthetic */ p B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17853a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f17854b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f17855c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f17856d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f17857e = false;

    public m(p pVar, long j10, Throwable th, Thread thread, f fVar) {
        this.B = pVar;
        this.f17853a = j10;
        this.f17854b = th;
        this.f17855c = thread;
        this.f17856d = fVar;
    }

    public final Object call() {
        long j10 = this.f17853a;
        long j11 = j10 / 1000;
        p pVar = this.B;
        String e10 = pVar.e();
        if (e10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", (Throwable) null);
            return Tasks.forResult(null);
        }
        pVar.f17865c.d();
        Throwable th = this.f17854b;
        Thread thread = this.f17855c;
        i0 i0Var = pVar.f17873k;
        i0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, (Throwable) null);
        }
        i0Var.d(th, thread, e10, "crash", j11, true);
        try {
            e eVar = pVar.f17868f;
            String str = ".ae" + j10;
            eVar.getClass();
            if (new File(eVar.f7904b, str).createNewFile()) {
                f fVar = this.f17856d;
                pVar.c(false, fVar);
                new e(pVar.f17867e);
                p.a(pVar, e.f17817b);
                if (!pVar.f17864b.b()) {
                    return Tasks.forResult(null);
                }
                Executor executor = pVar.f17866d.f17827a;
                return ((d) fVar).f8918i.get().getTask().onSuccessTask(executor, new l(this, executor, e10));
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
        }
    }
}
