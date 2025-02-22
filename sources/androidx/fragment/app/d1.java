package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import com.quickkonnect.silencio.R;
import d2.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import y1.e;

public abstract class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1926a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1927b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1928c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1929d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1930e = false;

    public static class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final o0 f1931h;

        public a(int i8, int i10, o0 o0Var, e eVar) {
            super(i8, i10, o0Var.f2054c, eVar);
            this.f1931h = o0Var;
        }

        public final void b() {
            super.b();
            this.f1931h.k();
        }

        public final void d() {
            int i8 = this.f1933b;
            o0 o0Var = this.f1931h;
            if (i8 == 2) {
                p pVar = o0Var.f2054c;
                View findFocus = pVar.f2066d0.findFocus();
                if (findFocus != null) {
                    pVar.n().m = findFocus;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + pVar);
                    }
                }
                View f02 = this.f1934c.f0();
                if (f02.getParent() == null) {
                    o0Var.b();
                    f02.setAlpha(0.0f);
                }
                if (f02.getAlpha() == 0.0f && f02.getVisibility() == 0) {
                    f02.setVisibility(4);
                }
                p.c cVar = pVar.f2070g0;
                f02.setAlpha(cVar == null ? 1.0f : cVar.f2097l);
            } else if (i8 == 3) {
                p pVar2 = o0Var.f2054c;
                View f03 = pVar2.f0();
                if (i0.J(2)) {
                    Log.v("FragmentManager", "Clearing focus " + f03.findFocus() + " on view " + f03 + " for Fragment " + pVar2);
                }
                f03.clearFocus();
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1932a;

        /* renamed from: b  reason: collision with root package name */
        public int f1933b;

        /* renamed from: c  reason: collision with root package name */
        public final p f1934c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f1935d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<e> f1936e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1937f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1938g = false;

        public b(int i8, int i10, p pVar, e eVar) {
            this.f1932a = i8;
            this.f1933b = i10;
            this.f1934c = pVar;
            eVar.b(new e1(this));
        }

        public final void a() {
            if (!this.f1937f) {
                this.f1937f = true;
                HashSet<e> hashSet = this.f1936e;
                if (hashSet.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(hashSet).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f1938g) {
                if (i0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1938g = true;
                Iterator it = this.f1935d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void c(int i8, int i10) {
            if (i10 != 0) {
                int i11 = i10 - 1;
                p pVar = this.f1934c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            if (i0.J(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pVar + " mFinalState = " + g1.f(this.f1932a) + " -> REMOVED. mLifecycleImpact  = " + f1.g(this.f1933b) + " to REMOVING.");
                            }
                            this.f1932a = 1;
                            this.f1933b = 3;
                        }
                    } else if (this.f1932a == 1) {
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + f1.g(this.f1933b) + " to ADDING.");
                        }
                        this.f1932a = 2;
                        this.f1933b = 2;
                    }
                } else if (this.f1932a != 1) {
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pVar + " mFinalState = " + g1.f(this.f1932a) + " -> " + g1.f(i8) + ". ");
                    }
                    this.f1932a = i8;
                }
            } else {
                throw null;
            }
        }

        public void d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + g1.f(this.f1932a) + "} {mLifecycleImpact = " + f1.g(this.f1933b) + "} {mFragment = " + this.f1934c + "}";
        }
    }

    public d1(ViewGroup viewGroup) {
        this.f1926a = viewGroup;
    }

    public static d1 f(ViewGroup viewGroup, h1 h1Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof d1) {
            return (d1) tag;
        }
        ((i0.e) h1Var).getClass();
        m mVar = new m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public final void a(int i8, int i10, o0 o0Var) {
        synchronized (this.f1927b) {
            e eVar = new e();
            b d10 = d(o0Var.f2054c);
            if (d10 != null) {
                d10.c(i8, i10);
                return;
            }
            a aVar = new a(i8, i10, o0Var, eVar);
            this.f1927b.add(aVar);
            aVar.f1935d.add(new b1(this, aVar));
            aVar.f1935d.add(new c1(this, aVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (!this.f1930e) {
            ViewGroup viewGroup = this.f1926a;
            WeakHashMap<View, d2.d1> weakHashMap = d2.i0.f7217a;
            if (!i0.g.b(viewGroup)) {
                e();
                this.f1929d = false;
                return;
            }
            synchronized (this.f1927b) {
                if (!this.f1927b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1928c);
                    this.f1928c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                        }
                        bVar.a();
                        if (!bVar.f1938g) {
                            this.f1928c.add(bVar);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f1927b);
                    this.f1927b.clear();
                    this.f1928c.addAll(arrayList2);
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((b) it2.next()).d();
                    }
                    b(arrayList2, this.f1929d);
                    this.f1929d = false;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final b d(p pVar) {
        Iterator<b> it = this.f1927b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1934c.equals(pVar) && !next.f1937f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (i0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1926a;
        WeakHashMap<View, d2.d1> weakHashMap = d2.i0.f7217a;
        boolean b10 = i0.g.b(viewGroup);
        synchronized (this.f1927b) {
            h();
            Iterator<b> it = this.f1927b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1928c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (i0.J(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1926a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(bVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar.a();
            }
            Iterator it3 = new ArrayList(this.f1927b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (i0.J(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f1926a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(bVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                bVar2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f1927b) {
            h();
            this.f1930e = false;
            int size = this.f1927b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f1927b.get(size);
                int c3 = g1.c(bVar.f1934c.f2066d0);
                if (bVar.f1932a == 2 && c3 != 2) {
                    p.c cVar = bVar.f1934c.f2070g0;
                    this.f1930e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator<b> it = this.f1927b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1933b == 2) {
                next.c(g1.b(next.f1934c.f0().getVisibility()), 1);
            }
        }
    }
}
