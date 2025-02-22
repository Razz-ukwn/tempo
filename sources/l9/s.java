package l9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

public final class s extends n {
    public final /* synthetic */ IBinder B;
    public final /* synthetic */ u C;

    public s(u uVar, IBinder iBinder) {
        this.C = uVar;
        this.B = iBinder;
    }

    public final void b() {
        j jVar;
        u uVar = this.C;
        v vVar = uVar.f11022a;
        int i8 = i.f11018e;
        IBinder iBinder = this.B;
        if (iBinder == null) {
            jVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new h(iBinder);
        }
        vVar.m = jVar;
        v vVar2 = uVar.f11022a;
        vVar2.f11025b.a("linkToDeath", new Object[0]);
        try {
            vVar2.m.asBinder().linkToDeath(vVar2.f11033j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            m mVar = vVar2.f11025b;
            mVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", m.b(mVar.f11019a, "linkToDeath failed", objArr), e10);
            }
        }
        vVar2.f11030g = false;
        Iterator it = vVar2.f11027d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        vVar2.f11027d.clear();
    }
}
