package f9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

public final class q extends l {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f8625b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f8626c;

    public q(s sVar, IBinder iBinder) {
        this.f8626c = sVar;
        this.f8625b = iBinder;
    }

    public final void a() {
        g gVar;
        s sVar = this.f8626c;
        t tVar = sVar.f8628a;
        int i8 = f.f8615b;
        IBinder iBinder = this.f8625b;
        if (iBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new e(iBinder);
        }
        tVar.m = gVar;
        t tVar2 = sVar.f8628a;
        tVar2.f8631b.a("linkToDeath", new Object[0]);
        try {
            tVar2.m.asBinder().linkToDeath(tVar2.f8639j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            k kVar = tVar2.f8631b;
            kVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k.b(kVar.f8617a, "linkToDeath failed", objArr), e10);
            }
        }
        tVar2.f8636g = false;
        Iterator it = tVar2.f8633d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        tVar2.f8633d.clear();
    }
}
