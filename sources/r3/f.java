package r3;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import androidx.fragment.app.x0;
import java.util.ArrayList;
import java.util.List;
import r3.k;
import y1.e;

@SuppressLint({"RestrictedApi"})
public class f extends x0 {

    public class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f13823a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f13824b;

        public a(View view, ArrayList arrayList) {
            this.f13823a = view;
            this.f13824b = arrayList;
        }

        public final void a() {
        }

        public final void b() {
        }

        public final void c(k kVar) {
            kVar.z(this);
            this.f13823a.setVisibility(8);
            ArrayList arrayList = this.f13824b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((View) arrayList.get(i8)).setVisibility(0);
            }
        }

        public final void d() {
        }

        public final void e(k kVar) {
            kVar.z(this);
            kVar.a(this);
        }
    }

    public class b extends k.c {
    }

    public final void a(View view, Object obj) {
        ((k) obj).b(view);
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        k kVar = (k) obj;
        if (kVar != null) {
            int i8 = 0;
            if (kVar instanceof p) {
                p pVar = (p) kVar;
                int size = pVar.T.size();
                while (i8 < size) {
                    b((i8 < 0 || i8 >= pVar.T.size()) ? null : pVar.T.get(i8), arrayList);
                    i8++;
                }
                return;
            }
            if (!(!x0.h(kVar.f13838e) || !x0.h((List) null) || !x0.h((List) null)) && x0.h(kVar.B)) {
                int size2 = arrayList.size();
                while (i8 < size2) {
                    kVar.b(arrayList.get(i8));
                    i8++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (k) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof k;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        k kVar3 = (k) obj3;
        if (kVar != null && kVar2 != null) {
            p pVar = new p();
            pVar.L(kVar);
            pVar.L(kVar2);
            pVar.O(1);
            kVar = pVar;
        } else if (kVar == null) {
            kVar = kVar2 != null ? kVar2 : null;
        }
        if (kVar3 == null) {
            return kVar;
        }
        p pVar2 = new p();
        if (kVar != null) {
            pVar2.L(kVar);
        }
        pVar2.L(kVar3);
        return pVar2;
    }

    public final Object j(Object obj, Object obj2) {
        p pVar = new p();
        if (obj != null) {
            pVar.L((k) obj);
        }
        pVar.L((k) obj2);
        return pVar;
    }

    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((k) obj).a(new a(view, arrayList));
    }

    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((k) obj).a(new g(this, obj2, arrayList, obj3, arrayList2));
    }

    public final void m(View view, Object obj) {
        if (view != null) {
            x0.g(view, new Rect());
            ((k) obj).E(new e());
        }
    }

    public final void n(Object obj, Rect rect) {
        ((k) obj).E(new b());
    }

    public final void o(Object obj, e eVar, l lVar) {
        k kVar = (k) obj;
        eVar.b(new h(kVar));
        kVar.a(new i(lVar));
    }

    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        ArrayList<View> arrayList2 = pVar.B;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            x0.d(arrayList.get(i8), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            ArrayList<View> arrayList3 = pVar.B;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(pVar, arrayList, arrayList2);
        }
    }

    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.L((k) obj);
        return pVar;
    }

    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        k kVar = (k) obj;
        int i8 = 0;
        if (kVar instanceof p) {
            p pVar = (p) kVar;
            int size = pVar.T.size();
            while (i8 < size) {
                s((i8 < 0 || i8 >= pVar.T.size()) ? null : pVar.T.get(i8), arrayList, arrayList2);
                i8++;
            }
            return;
        }
        if (!(!x0.h(kVar.f13838e) || !x0.h((List) null) || !x0.h((List) null))) {
            ArrayList<View> arrayList3 = kVar.B;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i8 < size2) {
                    kVar.b(arrayList2.get(i8));
                    i8++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        kVar.A(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
