package l9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class u implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f11022a;

    public /* synthetic */ u(v vVar) {
        this.f11022a = vVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        v vVar = this.f11022a;
        vVar.f11025b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        vVar.a().post(new s(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        v vVar = this.f11022a;
        vVar.f11025b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        vVar.a().post(new t(this));
    }
}
