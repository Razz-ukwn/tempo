package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import androidx.lifecycle.j;
import java.util.ArrayList;
import ke.m;
import sf.j;
import u3.a;

@Deprecated
public abstract class p0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public final i0 f2099b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2100c;

    /* renamed from: d  reason: collision with root package name */
    public a f2101d = null;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<p.f> f2102e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<p> f2103f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public p f2104g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2105h;

    public p0(i0 i0Var) {
        this.f2099b = i0Var;
        this.f2100c = 1;
    }

    public final void a(int i8, Object obj) {
        ArrayList<p.f> arrayList;
        p pVar = (p) obj;
        a aVar = this.f2101d;
        i0 i0Var = this.f2099b;
        if (aVar == null) {
            i0Var.getClass();
            this.f2101d = new a(i0Var);
        }
        while (true) {
            arrayList = this.f2102e;
            if (arrayList.size() > i8) {
                break;
            }
            arrayList.add((Object) null);
        }
        arrayList.set(i8, pVar.C() ? i0Var.Z(pVar) : null);
        this.f2103f.set(i8, (Object) null);
        this.f2101d.l(pVar);
        if (pVar.equals(this.f2104g)) {
            this.f2104g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        a aVar = this.f2101d;
        if (aVar != null) {
            if (!this.f2105h) {
                try {
                    this.f2105h = true;
                    if (!aVar.f2112g) {
                        aVar.f2113h = false;
                        aVar.f1897q.y(aVar, true);
                        this.f2105h = false;
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } catch (Throwable th) {
                    this.f2105h = false;
                    throw th;
                }
            }
            this.f2101d = null;
        }
    }

    public final Object e(ViewGroup viewGroup, int i8) {
        p.f fVar;
        p pVar;
        ArrayList<p> arrayList = this.f2103f;
        if (arrayList.size() > i8 && (pVar = arrayList.get(i8)) != null) {
            return pVar;
        }
        if (this.f2101d == null) {
            i0 i0Var = this.f2099b;
            i0Var.getClass();
            this.f2101d = new a(i0Var);
        }
        p pVar2 = ((m) this).f10460i.get(i8);
        j.e(pVar2, "mFragmentList[position]");
        p pVar3 = pVar2;
        ArrayList<p.f> arrayList2 = this.f2102e;
        if (arrayList2.size() > i8 && (fVar = arrayList2.get(i8)) != null) {
            if (pVar3.P == null) {
                Bundle bundle = fVar.f2098a;
                if (bundle == null) {
                    bundle = null;
                }
                pVar3.f2061b = bundle;
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        while (arrayList.size() <= i8) {
            arrayList.add((Object) null);
        }
        pVar3.j0(false);
        int i10 = this.f2100c;
        if (i10 == 0) {
            pVar3.k0(false);
        }
        arrayList.set(i8, pVar3);
        this.f2101d.d(viewGroup.getId(), pVar3, (String) null, 1);
        if (i10 == 1) {
            this.f2101d.m(pVar3, j.b.f2280d);
        }
        return pVar3;
    }

    public final boolean f(View view, Object obj) {
        return ((p) obj).f2066d0 == view;
    }

    public final void g(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<p.f> arrayList = this.f2102e;
            arrayList.clear();
            ArrayList<p> arrayList2 = this.f2103f;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((p.f) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    p E = this.f2099b.E(bundle, str);
                    if (E != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add((Object) null);
                        }
                        E.j0(false);
                        arrayList2.set(parseInt, E);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    public final Parcelable h() {
        Bundle bundle;
        ArrayList<p.f> arrayList = this.f2102e;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            p.f[] fVarArr = new p.f[arrayList.size()];
            arrayList.toArray(fVarArr);
            bundle.putParcelableArray("states", fVarArr);
        } else {
            bundle = null;
        }
        int i8 = 0;
        while (true) {
            ArrayList<p> arrayList2 = this.f2103f;
            if (i8 >= arrayList2.size()) {
                return bundle;
            }
            p pVar = arrayList2.get(i8);
            if (pVar != null && pVar.C()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f2099b.U(bundle, q.a("f", i8), pVar);
            }
            i8++;
        }
    }

    public final void i(Object obj) {
        p pVar = (p) obj;
        p pVar2 = this.f2104g;
        if (pVar != pVar2) {
            i0 i0Var = this.f2099b;
            int i8 = this.f2100c;
            if (pVar2 != null) {
                pVar2.j0(false);
                if (i8 == 1) {
                    if (this.f2101d == null) {
                        i0Var.getClass();
                        this.f2101d = new a(i0Var);
                    }
                    this.f2101d.m(this.f2104g, j.b.f2280d);
                } else {
                    this.f2104g.k0(false);
                }
            }
            pVar.j0(true);
            if (i8 == 1) {
                if (this.f2101d == null) {
                    i0Var.getClass();
                    this.f2101d = new a(i0Var);
                }
                this.f2101d.m(pVar, j.b.f2281e);
            } else {
                pVar.k0(true);
            }
            this.f2104g = pVar;
        }
    }

    public final void j(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
