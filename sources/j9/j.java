package j9;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import i9.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.internal.b0;

public final class j extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f9874b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f9875c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(p pVar, TaskCompletionSource taskCompletionSource, g gVar) {
        super(taskCompletionSource);
        this.f9875c = pVar;
        this.f9874b = gVar;
    }

    public final void a() {
        p pVar = this.f9875c;
        IInterface iInterface = pVar.m;
        ArrayList arrayList = pVar.f9885d;
        h hVar = this.f9874b;
        g gVar = pVar.f9883b;
        if (iInterface == null && !pVar.f9888g) {
            gVar.a("Initiate binding to the service.", new Object[0]);
            arrayList.add(hVar);
            o oVar = new o(pVar);
            pVar.f9893l = oVar;
            pVar.f9888g = true;
            if (!pVar.f9882a.bindService(pVar.f9889h, oVar, 1)) {
                gVar.a("Failed to bind to the service.", new Object[0]);
                pVar.f9888g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b0 b0Var = new b0();
                    TaskCompletionSource taskCompletionSource = ((h) it.next()).f9872a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(b0Var);
                    }
                }
                arrayList.clear();
            }
        } else if (pVar.f9888g) {
            gVar.a("Waiting to bind to the service.", new Object[0]);
            arrayList.add(hVar);
        } else {
            hVar.run();
        }
    }
}
