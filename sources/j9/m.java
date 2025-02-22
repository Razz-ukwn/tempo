package j9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

public final class m extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f9877b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f9878c;

    public m(o oVar, IBinder iBinder) {
        this.f9878c = oVar;
        this.f9877b = iBinder;
    }

    public final void a() {
        e eVar;
        o oVar = this.f9878c;
        p pVar = oVar.f9880a;
        int i8 = d.f9870a;
        IBinder iBinder = this.f9877b;
        if (iBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            eVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new c(iBinder);
        }
        pVar.m = eVar;
        p pVar2 = oVar.f9880a;
        pVar2.f9883b.a("linkToDeath", new Object[0]);
        try {
            pVar2.m.asBinder().linkToDeath(pVar2.f9891j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            g gVar = pVar2.f9883b;
            gVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", g.b(gVar.f9871a, "linkToDeath failed", objArr), e10);
            }
        }
        pVar2.f9888g = false;
        Iterator it = pVar2.f9885d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        pVar2.f9885d.clear();
    }
}
