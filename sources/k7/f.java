package k7;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import n7.c;
import u6.q;

public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f10362b;

    public f(r rVar, TaskCompletionSource taskCompletionSource) {
        this.f10362b = rVar;
        this.f10361a = taskCompletionSource;
    }

    public final void a(LocationResult locationResult) {
        List list = locationResult.f5660a;
        int size = list.size();
        this.f10361a.trySetResult(size == 0 ? null : (Location) list.get(size - 1));
        try {
            r rVar = this.f10362b;
            q.g("Listener type must not be empty", "GetCurrentLocation");
            rVar.F(new i.a(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
