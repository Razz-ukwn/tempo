package yg;

import ag.k;
import ag.l;
import cb.b;
import java.lang.reflect.Method;
import jg.x;
import sf.j;

public final class o implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17493a;

    public o(l lVar) {
        this.f17493a = lVar;
    }

    public final void a(b<Object> bVar, b0<Object> b0Var) {
        j.g(bVar, "call");
        j.g(b0Var, "response");
        boolean a10 = b0Var.a();
        k kVar = this.f17493a;
        if (a10) {
            T t2 = b0Var.f17446b;
            if (t2 == null) {
                x d10 = bVar.d();
                d10.getClass();
                Class<l> cls = l.class;
                l cast = cls.cast(d10.f10223e.get(cls));
                if (cast != null) {
                    StringBuilder sb2 = new StringBuilder("Response from ");
                    Method method = cast.f17489a;
                    j.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    j.b(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    kVar.resumeWith(b.u(new ff.b(sb2.toString())));
                    return;
                }
                ff.b bVar2 = new ff.b();
                j.j(j.class.getName(), bVar2);
                throw bVar2;
            }
            kVar.resumeWith(t2);
            return;
        }
        kVar.resumeWith(b.u(new j(b0Var)));
    }

    public final void b(b<Object> bVar, Throwable th) {
        j.g(bVar, "call");
        j.g(th, "t");
        this.f17493a.resumeWith(b.u(th));
    }
}
