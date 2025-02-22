package k7;

import ab.a0;
import ab.o;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import jg.d0;
import jg.t;
import wg.h;
import yg.f;
import zf.a;

public final class g implements l, OnCompleteListener, f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10365a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10366b;

    public /* synthetic */ g(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f10366b = iVar;
        this.f10365a = taskCompletionSource;
    }

    public /* synthetic */ g(Object obj, Object obj2) {
        this.f10366b = obj;
        this.f10365a = obj2;
    }

    public final Object a(Object obj) {
        d0 d0Var = (d0) obj;
        ab.i iVar = (ab.i) this.f10366b;
        d0.a aVar = d0Var.f10068a;
        if (aVar == null) {
            h e10 = d0Var.e();
            t d10 = d0Var.d();
            Charset a10 = d10 == null ? null : d10.a(a.f17962b);
            if (a10 == null) {
                a10 = a.f17962b;
            }
            aVar = new d0.a(e10, a10);
            d0Var.f10068a = aVar;
        }
        iVar.getClass();
        hb.a aVar2 = new hb.a(aVar);
        aVar2.f9288b = iVar.f257k;
        try {
            Object a11 = ((a0) this.f10365a).a(aVar2);
            if (aVar2.k0() == 10) {
                return a11;
            }
            throw new o("JSON document was not fully consumed.");
        } finally {
            d0Var.close();
        }
    }

    public final void b(i iVar) {
        throw new IllegalStateException();
    }

    public final void onComplete(Task task) {
        f9.t tVar = (f9.t) this.f10366b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f10365a;
        synchronized (tVar.f8635f) {
            tVar.f8634e.remove(taskCompletionSource);
        }
    }

    public final i zza() {
        return (i) this.f10366b;
    }

    public final void zzb() {
        ((TaskCompletionSource) this.f10365a).trySetResult(null);
    }

    public /* synthetic */ g() {
        this.f10366b = new AtomicInteger();
        this.f10365a = new AtomicInteger();
    }
}
