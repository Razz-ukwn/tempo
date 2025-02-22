package r3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.z;
import d2.d1;
import d2.i0;
import h0.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

public abstract class k implements Cloneable {
    public static final int[] Q = {2, 1, 3, 4};
    public static final a R = new a();
    public static final ThreadLocal<o.a<Animator, b>> S = new ThreadLocal<>();
    public final ArrayList<View> B = new ArrayList<>();
    public j1.c C = new j1.c(2);
    public j1.c D = new j1.c(2);
    public p E = null;
    public final int[] F = Q;
    public ArrayList<r> G;
    public ArrayList<r> H;
    public final ArrayList<Animator> I = new ArrayList<>();
    public int J = 0;
    public boolean K = false;
    public boolean L = false;
    public ArrayList<d> M = null;
    public ArrayList<Animator> N = new ArrayList<>();
    public c O;
    public z P = R;

    /* renamed from: a  reason: collision with root package name */
    public final String f13834a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f13835b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f13836c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f13837d = null;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<Integer> f13838e = new ArrayList<>();

    public class a extends z {
        public final Path l(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f13839a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13840b;

        /* renamed from: c  reason: collision with root package name */
        public final r f13841c;

        /* renamed from: d  reason: collision with root package name */
        public final e0 f13842d;

        /* renamed from: e  reason: collision with root package name */
        public final k f13843e;

        public b(View view, String str, k kVar, d0 d0Var, r rVar) {
            this.f13839a = view;
            this.f13840b = str;
            this.f13841c = rVar;
            this.f13842d = d0Var;
            this.f13843e = kVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a();

        void b();

        void c(k kVar);

        void d();

        void e(k kVar);
    }

    public static void f(j1.c cVar, View view, r rVar) {
        ((o.a) cVar.f9755a).put(view, rVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = (SparseArray) cVar.f9756b;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, (Object) null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        String k10 = i0.i.k(view);
        if (k10 != null) {
            if (((o.a) cVar.f9758d).containsKey(k10)) {
                ((o.a) cVar.f9758d).put(k10, null);
            } else {
                ((o.a) cVar.f9758d).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                o.d dVar = (o.d) cVar.f9757c;
                if (dVar.f12019a) {
                    dVar.f();
                }
                if (cb.b.o(dVar.f12020b, dVar.f12022d, itemIdAtPosition) >= 0) {
                    View view2 = (View) dVar.g((Long) null, itemIdAtPosition);
                    if (view2 != null) {
                        i0.d.r(view2, false);
                        dVar.i((Object) null, itemIdAtPosition);
                        return;
                    }
                    return;
                }
                i0.d.r(view, true);
                dVar.i(view, itemIdAtPosition);
            }
        }
    }

    public static o.a<Animator, b> r() {
        ThreadLocal<o.a<Animator, b>> threadLocal = S;
        o.a<Animator, b> aVar = threadLocal.get();
        if (aVar != null) {
            return aVar;
        }
        o.a<Animator, b> aVar2 = new o.a<>();
        threadLocal.set(aVar2);
        return aVar2;
    }

    public static boolean x(r rVar, r rVar2, String str) {
        Object obj = rVar.f13859a.get(str);
        Object obj2 = rVar2.f13859a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        this.B.remove(view);
    }

    public void B(ViewGroup viewGroup) {
        if (this.K) {
            if (!this.L) {
                ArrayList<Animator> arrayList = this.I;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size).resume();
                }
                ArrayList<d> arrayList2 = this.M;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.M.clone();
                    int size2 = arrayList3.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        ((d) arrayList3.get(i8)).d();
                    }
                }
            }
            this.K = false;
        }
    }

    public void C() {
        J();
        o.a<Animator, b> r10 = r();
        Iterator<Animator> it = this.N.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (r10.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new l(this, r10));
                    long j10 = this.f13836c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f13835b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f13837d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new m(this));
                    next.start();
                }
            }
        }
        this.N.clear();
        p();
    }

    public void D(long j10) {
        this.f13836c = j10;
    }

    public void E(c cVar) {
        this.O = cVar;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f13837d = timeInterpolator;
    }

    public void G(z zVar) {
        if (zVar == null) {
            this.P = R;
        } else {
            this.P = zVar;
        }
    }

    public void H() {
    }

    public void I(long j10) {
        this.f13835b = j10;
    }

    public final void J() {
        if (this.J == 0) {
            ArrayList<d> arrayList = this.M;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.M.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((d) arrayList2.get(i8)).e(this);
                }
            }
            this.L = false;
        }
        this.J++;
    }

    public String K(String str) {
        StringBuilder c3 = e.c(str);
        c3.append(getClass().getSimpleName());
        c3.append("@");
        c3.append(Integer.toHexString(hashCode()));
        c3.append(": ");
        String sb2 = c3.toString();
        if (this.f13836c != -1) {
            StringBuilder b10 = d.a.b(sb2, "dur(");
            b10.append(this.f13836c);
            b10.append(") ");
            sb2 = b10.toString();
        }
        if (this.f13835b != -1) {
            StringBuilder b11 = d.a.b(sb2, "dly(");
            b11.append(this.f13835b);
            b11.append(") ");
            sb2 = b11.toString();
        }
        if (this.f13837d != null) {
            StringBuilder b12 = d.a.b(sb2, "interp(");
            b12.append(this.f13837d);
            b12.append(") ");
            sb2 = b12.toString();
        }
        ArrayList<Integer> arrayList = this.f13838e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.B;
        if (size <= 0 && arrayList2.size() <= 0) {
            return sb2;
        }
        String c10 = h4.a.c(sb2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (i8 > 0) {
                    c10 = h4.a.c(c10, ", ");
                }
                StringBuilder c11 = e.c(c10);
                c11.append(arrayList.get(i8));
                c10 = c11.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 > 0) {
                    c10 = h4.a.c(c10, ", ");
                }
                StringBuilder c12 = e.c(c10);
                c12.append(arrayList2.get(i10));
                c10 = c12.toString();
            }
        }
        return h4.a.c(c10, ")");
    }

    public void a(d dVar) {
        if (this.M == null) {
            this.M = new ArrayList<>();
        }
        this.M.add(dVar);
    }

    public void b(View view) {
        this.B.add(view);
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.I;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<d> arrayList2 = this.M;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.M.clone();
            int size2 = arrayList3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((d) arrayList3.get(i8)).b();
            }
        }
    }

    public abstract void g(r rVar);

    public final void h(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                r rVar = new r(view);
                if (z10) {
                    j(rVar);
                } else {
                    g(rVar);
                }
                rVar.f13861c.add(this);
                i(rVar);
                if (z10) {
                    f(this.C, view, rVar);
                } else {
                    f(this.D, view, rVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    h(viewGroup.getChildAt(i8), z10);
                }
            }
        }
    }

    public void i(r rVar) {
    }

    public abstract void j(r rVar);

    public final void k(ViewGroup viewGroup, boolean z10) {
        l(z10);
        ArrayList<Integer> arrayList = this.f13838e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.B;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                View findViewById = viewGroup.findViewById(arrayList.get(i8).intValue());
                if (findViewById != null) {
                    r rVar = new r(findViewById);
                    if (z10) {
                        j(rVar);
                    } else {
                        g(rVar);
                    }
                    rVar.f13861c.add(this);
                    i(rVar);
                    if (z10) {
                        f(this.C, findViewById, rVar);
                    } else {
                        f(this.D, findViewById, rVar);
                    }
                }
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                View view = arrayList2.get(i10);
                r rVar2 = new r(view);
                if (z10) {
                    j(rVar2);
                } else {
                    g(rVar2);
                }
                rVar2.f13861c.add(this);
                i(rVar2);
                if (z10) {
                    f(this.C, view, rVar2);
                } else {
                    f(this.D, view, rVar2);
                }
            }
            return;
        }
        h(viewGroup, z10);
    }

    public final void l(boolean z10) {
        if (z10) {
            ((o.a) this.C.f9755a).clear();
            ((SparseArray) this.C.f9756b).clear();
            ((o.d) this.C.f9757c).a();
            return;
        }
        ((o.a) this.D.f9755a).clear();
        ((SparseArray) this.D.f9756b).clear();
        ((o.d) this.D.f9757c).a();
    }

    /* renamed from: m */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.N = new ArrayList<>();
            kVar.C = new j1.c(2);
            kVar.D = new j1.c(2);
            kVar.G = null;
            kVar.H = null;
            return kVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public void o(ViewGroup viewGroup, j1.c cVar, j1.c cVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        Animator n2;
        Animator animator;
        r rVar;
        View view;
        r rVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        o.a<Animator, b> r10 = r();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            r rVar3 = arrayList.get(i8);
            r rVar4 = arrayList2.get(i8);
            if (rVar3 != null && !rVar3.f13861c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f13861c.contains(this)) {
                rVar4 = null;
            }
            if (!(rVar3 == null && rVar4 == null)) {
                if ((rVar3 == null || rVar4 == null || v(rVar3, rVar4)) && (n2 = n(viewGroup2, rVar3, rVar4)) != null) {
                    if (rVar4 != null) {
                        String[] t2 = t();
                        view = rVar4.f13860b;
                        if (t2 != null && t2.length > 0) {
                            rVar2 = new r(view);
                            r rVar5 = (r) ((o.a) cVar2.f9755a).getOrDefault(view, null);
                            if (rVar5 != null) {
                                int i10 = 0;
                                while (i10 < t2.length) {
                                    HashMap hashMap = rVar2.f13859a;
                                    Animator animator3 = n2;
                                    String str = t2[i10];
                                    hashMap.put(str, rVar5.f13859a.get(str));
                                    i10++;
                                    n2 = animator3;
                                    t2 = t2;
                                }
                            }
                            Animator animator4 = n2;
                            int i11 = r10.f12032c;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    animator2 = animator4;
                                    break;
                                }
                                b orDefault = r10.getOrDefault(r10.i(i12), null);
                                if (orDefault.f13841c != null && orDefault.f13839a == view && orDefault.f13840b.equals(this.f13834a) && orDefault.f13841c.equals(rVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            j1.c cVar3 = cVar2;
                            animator2 = n2;
                            rVar2 = null;
                        }
                        animator = animator2;
                        rVar = rVar2;
                    } else {
                        j1.c cVar4 = cVar2;
                        view = rVar3.f13860b;
                        animator = n2;
                        rVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f13834a;
                        z zVar = v.f13865a;
                        d0 d0Var = new d0(viewGroup2);
                        b bVar = r0;
                        b bVar2 = new b(view, str2, this, d0Var, rVar);
                        r10.put(animator, bVar);
                        this.N.add(animator);
                    }
                    i8++;
                    viewGroup2 = viewGroup;
                }
            }
            j1.c cVar5 = cVar2;
            i8++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator5 = this.N.get(sparseIntArray.keyAt(i13));
                animator5.setStartDelay(animator5.getStartDelay() + (((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE));
            }
        }
    }

    public final void p() {
        int i8 = this.J - 1;
        this.J = i8;
        if (i8 == 0) {
            ArrayList<d> arrayList = this.M;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.M.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).c(this);
                }
            }
            for (int i11 = 0; i11 < ((o.d) this.C.f9757c).k(); i11++) {
                View view = (View) ((o.d) this.C.f9757c).l(i11);
                if (view != null) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.r(view, false);
                }
            }
            for (int i12 = 0; i12 < ((o.d) this.D.f9757c).k(); i12++) {
                View view2 = (View) ((o.d) this.D.f9757c).l(i12);
                if (view2 != null) {
                    WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                    i0.d.r(view2, false);
                }
            }
            this.L = true;
        }
    }

    public final r q(View view, boolean z10) {
        p pVar = this.E;
        if (pVar != null) {
            return pVar.q(view, z10);
        }
        ArrayList<r> arrayList = z10 ? this.G : this.H;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            }
            r rVar = arrayList.get(i8);
            if (rVar == null) {
                return null;
            }
            if (rVar.f13860b == view) {
                break;
            }
            i8++;
        }
        if (i8 < 0) {
            return null;
        }
        return (z10 ? this.H : this.G).get(i8);
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return K("");
    }

    public final r u(View view, boolean z10) {
        p pVar = this.E;
        if (pVar != null) {
            return pVar.u(view, z10);
        }
        return (r) ((o.a) (z10 ? this.C : this.D).f9755a).getOrDefault(view, null);
    }

    public boolean v(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] t2 = t();
        if (t2 != null) {
            int length = t2.length;
            int i8 = 0;
            while (i8 < length) {
                if (!x(rVar, rVar2, t2[i8])) {
                    i8++;
                }
            }
            return false;
        }
        for (String x10 : rVar.f13859a.keySet()) {
            if (x(rVar, rVar2, x10)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f13838e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.B;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public void y(View view) {
        if (!this.L) {
            ArrayList<Animator> arrayList = this.I;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).pause();
            }
            ArrayList<d> arrayList2 = this.M;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.M.clone();
                int size2 = arrayList3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((d) arrayList3.get(i8)).a();
                }
            }
            this.K = true;
        }
    }

    public void z(d dVar) {
        ArrayList<d> arrayList = this.M;
        if (arrayList != null) {
            arrayList.remove(dVar);
            if (this.M.size() == 0) {
                this.M = null;
            }
        }
    }
}
