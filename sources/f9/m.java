package f9;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

public final /* synthetic */ class m implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f8619a;

    public /* synthetic */ m(t tVar) {
        this.f8619a = tVar;
    }

    public final void binderDied() {
        t tVar = this.f8619a;
        tVar.f8631b.a("reportBinderDeath", new Object[0]);
        p pVar = (p) tVar.f8638i.get();
        if (pVar != null) {
            tVar.f8631b.a("calling onBinderDied", new Object[0]);
            pVar.zza();
        } else {
            tVar.f8631b.a("%s : Binder has died.", tVar.f8632c);
            Iterator it = tVar.f8633d.iterator();
            while (it.hasNext()) {
                RemoteException remoteException = new RemoteException(String.valueOf(tVar.f8632c).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = ((l) it.next()).f8618a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            tVar.f8633d.clear();
        }
        synchronized (tVar.f8635f) {
            tVar.c();
        }
    }
}
