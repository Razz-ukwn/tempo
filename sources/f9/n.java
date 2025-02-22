package f9;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.h;
import k7.g;

public final class n extends l {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8620b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8621c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f8622d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f8623e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(h hVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f8623e = hVar;
        this.f8622d = str;
        this.f8621c = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [f9.g, android.os.IInterface] */
    public final void a() {
        switch (this.f8620b) {
            case 0:
                synchronized (((t) this.f8623e).f8635f) {
                    t tVar = (t) this.f8623e;
                    TaskCompletionSource taskCompletionSource = this.f8621c;
                    tVar.f8634e.add(taskCompletionSource);
                    taskCompletionSource.getTask().addOnCompleteListener(new g((Object) tVar, (Object) taskCompletionSource));
                    if (((t) this.f8623e).f8640k.getAndIncrement() > 0) {
                        ((t) this.f8623e).f8631b.a("Already connected to the service.", new Object[0]);
                    }
                    t.b((t) this.f8623e, (l) this.f8622d);
                }
                return;
            default:
                TaskCompletionSource taskCompletionSource2 = this.f8621c;
                Object obj = this.f8623e;
                Object obj2 = this.f8622d;
                try {
                    h hVar = (h) obj;
                    ((h) obj).f7889a.m.f(hVar.f7890b, h.a(hVar, (String) obj2), new e9.g((h) obj, taskCompletionSource2, (String) obj2));
                    return;
                } catch (RemoteException e10) {
                    k kVar = h.f7887e;
                    Object[] objArr = {(String) obj2};
                    kVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", k.b(kVar.f8617a, "requestUpdateInfo(%s)", objArr), e10);
                    }
                    taskCompletionSource2.trySetException(new RuntimeException(e10));
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(t tVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, n nVar) {
        super(taskCompletionSource);
        this.f8623e = tVar;
        this.f8621c = taskCompletionSource2;
        this.f8622d = nVar;
    }
}
