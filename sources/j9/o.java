package j9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class o implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9880a;

    public /* synthetic */ o(p pVar) {
        this.f9880a = pVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p pVar = this.f9880a;
        pVar.f9883b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        pVar.a().post(new m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        p pVar = this.f9880a;
        pVar.f9883b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        pVar.a().post(new n(this));
    }
}
