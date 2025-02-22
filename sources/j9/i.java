package j9;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class i implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9873a;

    public /* synthetic */ i(p pVar) {
        this.f9873a = pVar;
    }

    public final void binderDied() {
        p pVar = this.f9873a;
        pVar.f9883b.a("reportBinderDeath", new Object[0]);
        l lVar = (l) pVar.f9890i.get();
        g gVar = pVar.f9883b;
        if (lVar != null) {
            gVar.a("calling onBinderDied", new Object[0]);
            lVar.zza();
        } else {
            String str = pVar.f9884c;
            gVar.a("%s : Binder has died.", str);
            ArrayList arrayList = pVar.f9885d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = ((h) it.next()).f9872a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            arrayList.clear();
        }
        pVar.b();
    }
}
