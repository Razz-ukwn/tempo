package b3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b3.z;
import cb.c;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.g;
import o.h;
import rf.l;
import sf.j;
import sf.k;
import yf.o;

public final class b0 extends z implements Iterable<z>, tf.a {
    public static final /* synthetic */ int K = 0;
    public final g<z> G = new g<>();
    public int H;
    public String I;
    public String J;

    public static final class a {

        /* renamed from: b3.b0$a$a  reason: collision with other inner class name */
        public static final class C0036a extends k implements l<z, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0036a f3029a = new C0036a();

            public C0036a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                z zVar = (z) obj;
                j.f(zVar, "it");
                if (!(zVar instanceof b0)) {
                    return null;
                }
                b0 b0Var = (b0) zVar;
                return b0Var.j(b0Var.H, true);
            }
        }

        public static z a(b0 b0Var) {
            j.f(b0Var, "<this>");
            Iterator it = yf.k.o0(b0Var.j(b0Var.H, true), C0036a.f3029a).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = it.next();
                }
                return (z) next;
            }
            throw new NoSuchElementException("Sequence is empty.");
        }
    }

    public static final class b implements Iterator<z>, tf.a {

        /* renamed from: a  reason: collision with root package name */
        public int f3030a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3031b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b0 f3032c;

        public b(b0 b0Var) {
            this.f3032c = b0Var;
        }

        public final boolean hasNext() {
            return this.f3030a + 1 < this.f3032c.G.j();
        }

        public final Object next() {
            if (hasNext()) {
                this.f3031b = true;
                g<z> gVar = this.f3032c.G;
                int i8 = this.f3030a + 1;
                this.f3030a = i8;
                z k10 = gVar.k(i8);
                j.e(k10, "nodes.valueAt(++index)");
                return k10;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f3031b) {
                g<z> gVar = this.f3032c.G;
                gVar.k(this.f3030a).f3202b = null;
                int i8 = this.f3030a;
                Object[] objArr = gVar.f12036c;
                Object obj = objArr[i8];
                Object obj2 = g.f12033e;
                if (obj != obj2) {
                    objArr[i8] = obj2;
                    gVar.f12034a = true;
                }
                this.f3030a = i8 - 1;
                this.f3031b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(m0<? extends b0> m0Var) {
        super(m0Var);
        j.f(m0Var, "navGraphNavigator");
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof b0)) {
            g<z> gVar = this.G;
            ArrayList s02 = o.s0(yf.k.n0(c.l(gVar)));
            b0 b0Var = (b0) obj;
            g<z> gVar2 = b0Var.G;
            h l10 = c.l(gVar2);
            while (l10.hasNext()) {
                s02.remove((z) l10.next());
            }
            return super.equals(obj) && gVar.j() == gVar2.j() && this.H == b0Var.H && s02.isEmpty();
        }
    }

    public final z.b g(w wVar) {
        z.b g10 = super.g(wVar);
        ArrayList arrayList = new ArrayList();
        b bVar = new b(this);
        while (bVar.hasNext()) {
            z.b g11 = ((z) bVar.next()).g(wVar);
            if (g11 != null) {
                arrayList.add(g11);
            }
        }
        return (z.b) q.D0(gf.l.b0(new z.b[]{g10, (z.b) q.D0(arrayList)}));
    }

    public final void h(Context context, AttributeSet attributeSet) {
        String str;
        j.f(context, "context");
        super.h(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b1.b.f2995d);
        j.e(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        l(obtainAttributes.getResourceId(0, 0));
        int i8 = this.H;
        if (i8 <= 16777215) {
            str = String.valueOf(i8);
        } else {
            try {
                str = context.getResources().getResourceName(i8);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i8);
            }
            j.e(str, "try {\n                co….toString()\n            }");
        }
        this.I = str;
        m mVar = m.f8717a;
        obtainAttributes.recycle();
    }

    public final int hashCode() {
        int i8 = this.H;
        g<z> gVar = this.G;
        int j10 = gVar.j();
        for (int i10 = 0; i10 < j10; i10++) {
            if (gVar.f12034a) {
                gVar.g();
            }
            i8 = (((i8 * 31) + gVar.f12035b[i10]) * 31) + gVar.k(i10).hashCode();
        }
        return i8;
    }

    public final void i(z zVar) {
        j.f(zVar, "node");
        int i8 = zVar.D;
        String str = zVar.E;
        boolean z10 = false;
        if ((i8 == 0 && str == null) ? false : true) {
            String str2 = this.E;
            if (str2 == null || (!j.a(str, str2))) {
                if (i8 != this.D) {
                    g<z> gVar = this.G;
                    z zVar2 = (z) gVar.h(i8, (Integer) null);
                    if (zVar2 != zVar) {
                        if (zVar.f3202b == null) {
                            z10 = true;
                        }
                        if (z10) {
                            if (zVar2 != null) {
                                zVar2.f3202b = null;
                            }
                            zVar.f3202b = this;
                            gVar.i(zVar.D, zVar);
                            return;
                        }
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Destination " + zVar + " cannot have the same id as graph " + this).toString());
            }
            throw new IllegalArgumentException(("Destination " + zVar + " cannot have the same route as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final Iterator<z> iterator() {
        return new b(this);
    }

    public final z j(int i8, boolean z10) {
        b0 b0Var;
        z zVar = (z) this.G.h(i8, (Integer) null);
        if (zVar != null) {
            return zVar;
        }
        if (!z10 || (b0Var = this.f3202b) == null) {
            return null;
        }
        return b0Var.j(i8, true);
    }

    public final z k(String str, boolean z10) {
        b0 b0Var;
        j.f(str, "route");
        z zVar = (z) this.G.h("android-app://androidx.navigation/".concat(str).hashCode(), (Integer) null);
        if (zVar != null) {
            return zVar;
        }
        if (!z10 || (b0Var = this.f3202b) == null) {
            return null;
        }
        if (!(zf.j.t0(str))) {
            return b0Var.k(str, true);
        }
        return null;
    }

    public final void l(int i8) {
        if (i8 != this.D) {
            if (this.J != null) {
                this.H = 0;
                this.J = null;
            }
            this.H = i8;
            this.I = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i8 + " cannot use the same id as the graph " + this).toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.J;
        z k10 = !(str == null || zf.j.t0(str)) ? k(str, true) : null;
        if (k10 == null) {
            k10 = j(this.H, true);
        }
        sb2.append(" startDestination=");
        if (k10 == null) {
            String str2 = this.J;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.I;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.H));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(k10.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }
}
