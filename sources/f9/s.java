package f9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class s implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f8628a;

    public /* synthetic */ s(t tVar) {
        this.f8628a = tVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t tVar = this.f8628a;
        tVar.f8631b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        tVar.a().post(new q(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        t tVar = this.f8628a;
        tVar.f8631b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        tVar.a().post(new r(this));
    }
}
