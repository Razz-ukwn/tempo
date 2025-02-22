package d3;

import android.util.Log;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import gf.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final /* synthetic */ class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f7288a;

    public /* synthetic */ b(c cVar) {
        this.f7288a = cVar;
    }

    public final void d(p pVar, j.a aVar) {
        Object obj;
        c cVar = this.f7288a;
        sf.j.f(cVar, "this$0");
        boolean z10 = false;
        if (aVar == j.a.ON_CREATE) {
            androidx.fragment.app.n nVar = (androidx.fragment.app.n) pVar;
            Iterable iterable = (Iterable) cVar.b().f3159e.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (sf.j.a(((b3.j) it.next()).B, nVar.V)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z10) {
                nVar.n0();
            }
        } else if (aVar == j.a.ON_STOP) {
            androidx.fragment.app.n nVar2 = (androidx.fragment.app.n) pVar;
            if (!nVar2.q0().isShowing()) {
                List list = (List) cVar.b().f3159e.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (sf.j.a(((b3.j) obj).B, nVar2.V)) {
                        break;
                    }
                }
                if (obj != null) {
                    b3.j jVar = (b3.j) obj;
                    if (!sf.j.a(q.C0(list), jVar)) {
                        Log.i("DialogFragmentNavigator", "Dialog " + nVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    cVar.i(jVar, false);
                    return;
                }
                throw new IllegalStateException(("Dialog " + nVar2 + " has already been popped off of the Navigation back stack").toString());
            }
        }
    }
}
