package b3;

import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import java.util.Iterator;

public final /* synthetic */ class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3098b;

    public /* synthetic */ l(Object obj, int i8) {
        this.f3097a = i8;
        this.f3098b = obj;
    }

    public final void d(p pVar, j.a aVar) {
        int i8 = this.f3097a;
        Object obj = this.f3098b;
        switch (i8) {
            case 0:
                m mVar = (m) obj;
                sf.j.f(mVar, "this$0");
                mVar.f3116q = aVar.a();
                if (mVar.f3103c != null) {
                    Iterator<j> it = mVar.f3107g.iterator();
                    while (it.hasNext()) {
                        j next = it.next();
                        next.getClass();
                        next.f3086d = aVar.a();
                        next.c();
                    }
                    return;
                }
                return;
            default:
                a aVar2 = (a) obj;
                sf.j.f(aVar2, "this$0");
                if (aVar == j.a.ON_START) {
                    aVar2.f2774f = true;
                    return;
                } else if (aVar == j.a.ON_STOP) {
                    aVar2.f2774f = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
