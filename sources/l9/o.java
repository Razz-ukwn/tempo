package l9;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class o implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f11021a;

    public /* synthetic */ o(v vVar) {
        this.f11021a = vVar;
    }

    public final void binderDied() {
        v vVar = this.f11021a;
        vVar.f11025b.a("reportBinderDeath", new Object[0]);
        r rVar = (r) vVar.f11032i.get();
        m mVar = vVar.f11025b;
        if (rVar != null) {
            mVar.a("calling onBinderDied", new Object[0]);
            rVar.a();
        } else {
            String str = vVar.f11026c;
            mVar.a("%s : Binder has died.", str);
            ArrayList arrayList = vVar.f11027d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n) it.next()).a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
            }
            arrayList.clear();
        }
        vVar.b();
    }
}
