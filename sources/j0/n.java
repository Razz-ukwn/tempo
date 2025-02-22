package j0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import cb.d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.f1;
import g2.c;
import java.io.File;
import java.util.concurrent.ExecutorService;
import sf.j;
import wa.h0;
import x9.a;
import z9.a0;
import z9.i0;
import z9.j0;

public final /* synthetic */ class n implements j, c, a, Continuation, OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9710b;

    public /* synthetic */ n(Object obj, int i8) {
        this.f9709a = i8;
        this.f9710b = obj;
    }

    public final void c(Bundle bundle) {
        ((v9.a) this.f9710b).f16340a.c(bundle);
    }

    public final double e(double d10) {
        int i8 = this.f9709a;
        Object obj = this.f9710b;
        switch (i8) {
            case 0:
                u uVar = (u) obj;
                j.f(uVar, "this$0");
                return uVar.m.e(f1.o(d10, (double) uVar.f9719e, (double) uVar.f9720f));
            default:
                v vVar = (v) obj;
                j.f(vVar, "$function");
                if (d10 >= vVar.f9735e) {
                    return Math.pow((vVar.f9732b * d10) + vVar.f9733c, vVar.f9731a) + vVar.f9736f;
                }
                return vVar.f9737g + (vVar.f9734d * d10);
        }
    }

    public final void onComplete(Task task) {
        h0.a((Intent) this.f9710b);
    }

    public final Object then(Task task) {
        boolean z10;
        int i8 = this.f9709a;
        Object obj = this.f9710b;
        switch (i8) {
            case 5:
                ((i0) obj).getClass();
                if (task.isSuccessful()) {
                    a0 a0Var = (a0) task.getResult();
                    d dVar = d.f3892c;
                    dVar.w("Crashlytics report successfully enqueued to DataTransport: " + a0Var.c());
                    File b10 = a0Var.b();
                    if (b10.delete()) {
                        dVar.w("Deleted report file: " + b10.getPath());
                    } else {
                        dVar.k0("Crashlytics could not delete report file: " + b10.getPath(), (Exception) null);
                    }
                    z10 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                ExecutorService executorService = j0.f17848a;
                if (task.isSuccessful()) {
                    taskCompletionSource.setResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.setException(task.getException());
                }
                return null;
        }
    }
}
