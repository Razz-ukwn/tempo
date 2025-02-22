package l9;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

public final class p extends n {
    public final /* synthetic */ n B;
    public final /* synthetic */ v C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(v vVar, TaskCompletionSource taskCompletionSource, n nVar) {
        super(taskCompletionSource);
        this.C = vVar;
        this.B = nVar;
    }

    public final void b() {
        v vVar = this.C;
        IInterface iInterface = vVar.m;
        ArrayList arrayList = vVar.f11027d;
        n nVar = this.B;
        m mVar = vVar.f11025b;
        if (iInterface == null && !vVar.f11030g) {
            mVar.a("Initiate binding to the service.", new Object[0]);
            arrayList.add(nVar);
            u uVar = new u(vVar);
            vVar.f11035l = uVar;
            vVar.f11030g = true;
            if (!vVar.f11024a.bindService(vVar.f11031h, uVar, 1)) {
                mVar.a("Failed to bind to the service.", new Object[0]);
                vVar.f11030g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a(new w());
                }
                arrayList.clear();
            }
        } else if (vVar.f11030g) {
            mVar.a("Waiting to bind to the service.", new Object[0]);
            arrayList.add(nVar);
        } else {
            nVar.run();
        }
    }
}
