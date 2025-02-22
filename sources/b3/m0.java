package b3;

import android.os.Bundle;
import b3.m;
import b3.z;
import cb.d;
import ff.m;
import gf.p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import rf.l;
import sf.j;
import sf.k;
import yf.e;
import yf.n;
import yf.q;

public abstract class m0<D extends z> {

    /* renamed from: a  reason: collision with root package name */
    public p0 f3143a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3144b;

    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public static final class c extends k implements l<g0, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3145a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            g0 g0Var = (g0) obj;
            j.f(g0Var, "$this$navOptions");
            g0Var.f3061b = true;
            return m.f8717a;
        }
    }

    public abstract D a();

    public final p0 b() {
        p0 p0Var = this.f3143a;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public z c(D d10, Bundle bundle, f0 f0Var, a aVar) {
        return d10;
    }

    public void d(List list, f0 f0Var) {
        q qVar = new q(new p(list), new n0(this, f0Var));
        n nVar = n.f17392a;
        j.f(nVar, "predicate");
        e.a aVar = new e.a(new e(qVar, nVar));
        while (aVar.hasNext()) {
            b().d((j) aVar.next());
        }
    }

    public void e(m.a aVar) {
        this.f3143a = aVar;
        this.f3144b = true;
    }

    public void f(j jVar) {
        z zVar = jVar.f3084b;
        if (!(zVar instanceof z)) {
            zVar = null;
        }
        if (zVar != null) {
            c(zVar, (Bundle) null, d.T(c.f3145a), (a) null);
            b().b(jVar);
        }
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(j jVar, boolean z10) {
        j.f(jVar, "popUpTo");
        List list = (List) b().f3159e.getValue();
        if (list.contains(jVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            j jVar2 = null;
            while (j()) {
                jVar2 = (j) listIterator.previous();
                if (j.a(jVar2, jVar)) {
                    break;
                }
            }
            if (jVar2 != null) {
                b().c(jVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + jVar + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }
}
