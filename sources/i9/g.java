package i9;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import j9.h;

public final class g extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9623b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f9624c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f9624c = iVar;
        this.f9623b = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface, j9.e] */
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f9623b;
        i iVar = this.f9624c;
        try {
            iVar.f9629a.m.K(iVar.f9630b, j.a(), new h(iVar, taskCompletionSource));
        } catch (RemoteException e10) {
            j9.g gVar = i.f9628c;
            Object[] objArr = {iVar.f9630b};
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", j9.g.b(gVar.f9871a, "error requesting in-app review for %s", objArr), e10);
            }
            taskCompletionSource.trySetException(new RuntimeException(e10));
        }
    }
}
