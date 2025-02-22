package d3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.b0;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import b3.f0;
import b3.m0;
import b3.z;
import ff.g;
import ff.m;
import gf.o;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import sf.j;

@m0.b("fragment")
public class d extends m0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f7293c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f7294d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7295e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f7296f = new LinkedHashSet();

    public static class a extends z {
        public String G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m0<? extends a> m0Var) {
            super(m0Var);
            j.f(m0Var, "fragmentNavigator");
        }

        public final boolean equals(Object obj) {
            return obj != null && (obj instanceof a) && super.equals(obj) && j.a(this.G, ((a) obj).G);
        }

        public final void h(Context context, AttributeSet attributeSet) {
            j.f(context, "context");
            super.h(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b3.f1262b);
            j.e(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.G = string;
            }
            m mVar = m.f8717a;
            obtainAttributes.recycle();
        }

        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.G;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.G;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            j.e(sb3, "sb.toString()");
            return sb3;
        }
    }

    public d(Context context, i0 i0Var, int i8) {
        this.f7293c = context;
        this.f7294d = i0Var;
        this.f7295e = i8;
    }

    public final z a() {
        return new a(this);
    }

    public final void d(List list, f0 f0Var) {
        i0 i0Var = this.f7294d;
        if (i0Var.O()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b3.j jVar = (b3.j) it.next();
            boolean isEmpty = ((List) b().f3159e.getValue()).isEmpty();
            if (f0Var != null && !isEmpty && f0Var.f3045b && this.f7296f.remove(jVar.B)) {
                i0Var.v(new i0.o(jVar.B), false);
                b().d(jVar);
            } else {
                androidx.fragment.app.a k10 = k(jVar, f0Var);
                if (!isEmpty) {
                    k10.c(jVar.B);
                }
                k10.g();
                b().d(jVar);
            }
        }
    }

    public final void f(b3.j jVar) {
        i0 i0Var = this.f7294d;
        if (i0Var.O()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a k10 = k(jVar, (f0) null);
        if (((List) b().f3159e.getValue()).size() > 1) {
            String str = jVar.B;
            i0Var.v(new i0.n(str, -1, 1), false);
            k10.c(str);
        }
        k10.g();
        b().b(jVar);
    }

    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f7296f;
            linkedHashSet.clear();
            o.p0(stringArrayList, linkedHashSet);
        }
    }

    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f7296f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return y1.d.a(new g("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    public final void i(b3.j jVar, boolean z10) {
        j.f(jVar, "popUpTo");
        i0 i0Var = this.f7294d;
        if (i0Var.O()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z10) {
            List list = (List) b().f3159e.getValue();
            b3.j jVar2 = (b3.j) q.u0(list);
            for (b3.j jVar3 : q.I0(list.subList(list.indexOf(jVar), list.size()))) {
                if (j.a(jVar3, jVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + jVar3);
                } else {
                    i0Var.v(new i0.p(jVar3.B), false);
                    this.f7296f.add(jVar3.B);
                }
            }
        } else {
            i0Var.v(new i0.n(jVar.B, -1, 1), false);
        }
        b().c(jVar, z10);
    }

    public final androidx.fragment.app.a k(b3.j jVar, f0 f0Var) {
        String str = ((a) jVar.f3084b).G;
        if (str != null) {
            int i8 = 0;
            char charAt = str.charAt(0);
            Context context = this.f7293c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            i0 i0Var = this.f7294d;
            b0 G = i0Var.G();
            context.getClassLoader();
            p a10 = G.a(str);
            j.e(a10, "fragmentManager.fragment…t.classLoader, className)");
            a10.h0(jVar.f3085c);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
            int i10 = f0Var != null ? f0Var.f3049f : -1;
            int i11 = f0Var != null ? f0Var.f3050g : -1;
            int i12 = f0Var != null ? f0Var.f3051h : -1;
            int i13 = f0Var != null ? f0Var.f3052i : -1;
            if (!(i10 == -1 && i11 == -1 && i12 == -1 && i13 == -1)) {
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 == -1) {
                    i12 = 0;
                }
                if (i13 != -1) {
                    i8 = i13;
                }
                aVar.f2107b = i10;
                aVar.f2108c = i11;
                aVar.f2109d = i12;
                aVar.f2110e = i8;
            }
            aVar.e(this.f7295e, a10, (String) null);
            aVar.n(a10);
            aVar.f2120p = true;
            return aVar;
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }
}
