package d3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.activity.g;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.b0;
import androidx.fragment.app.i0;
import androidx.fragment.app.n;
import androidx.fragment.app.p;
import androidx.lifecycle.q;
import b3.d;
import b3.f0;
import b3.m;
import b3.m0;
import b3.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import sf.j;

@m0.b("dialog")
public final class c extends m0<a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f7289c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f7290d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f7291e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final b f7292f = new b(this);

    public static class a extends z implements d {
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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b3.f1261a);
            j.e(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.G = string;
            }
            obtainAttributes.recycle();
        }

        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.G;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    public c(Context context, i0 i0Var) {
        this.f7289c = context;
        this.f7290d = i0Var;
    }

    public final z a() {
        return new a(this);
    }

    public final void d(List list, f0 f0Var) {
        i0 i0Var = this.f7290d;
        if (i0Var.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b3.j jVar = (b3.j) it.next();
            a aVar = (a) jVar.f3084b;
            String str = aVar.G;
            if (str != null) {
                char charAt = str.charAt(0);
                Context context = this.f7289c;
                if (charAt == '.') {
                    str = context.getPackageName() + str;
                }
                b0 G = i0Var.G();
                context.getClassLoader();
                p a10 = G.a(str);
                j.e(a10, "fragmentManager.fragment…ader, className\n        )");
                if (n.class.isAssignableFrom(a10.getClass())) {
                    n nVar = (n) a10;
                    nVar.h0(jVar.f3085c);
                    nVar.f2075l0.a(this.f7292f);
                    nVar.s0(i0Var, jVar.B);
                    b().d(jVar);
                } else {
                    StringBuilder sb2 = new StringBuilder("Dialog destination ");
                    String str2 = aVar.G;
                    if (str2 != null) {
                        throw new IllegalArgumentException(g.a(sb2, str2, " is not an instance of DialogFragment").toString());
                    }
                    throw new IllegalStateException("DialogFragment class was not set".toString());
                }
            } else {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
        }
    }

    public final void e(m.a aVar) {
        q qVar;
        super.e(aVar);
        Iterator it = ((List) aVar.f3159e.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i0 i0Var = this.f7290d;
            if (hasNext) {
                b3.j jVar = (b3.j) it.next();
                n nVar = (n) i0Var.D(jVar.B);
                if (nVar == null || (qVar = nVar.f2075l0) == null) {
                    this.f7291e.add(jVar.B);
                } else {
                    qVar.a(this.f7292f);
                }
            } else {
                i0Var.f1978n.add(new a(this));
                return;
            }
        }
    }

    public final void i(b3.j jVar, boolean z10) {
        j.f(jVar, "popUpTo");
        i0 i0Var = this.f7290d;
        if (i0Var.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f3159e.getValue();
        for (b3.j jVar2 : gf.q.I0(list.subList(list.indexOf(jVar), list.size()))) {
            p D = i0Var.D(jVar2.B);
            if (D != null) {
                D.f2075l0.c(this.f7292f);
                ((n) D).n0();
            }
        }
        b().c(jVar, z10);
    }
}
