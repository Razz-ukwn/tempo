package b0;

import cb.d;
import ff.m;
import gf.q;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import rf.p;
import sf.j;
import sf.k;
import t.e0;

public final class x extends k implements p<Set<? extends Object>, h, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f2987a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(w wVar) {
        super(2);
        this.f2987a = wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        w wVar;
        boolean z10;
        Object obj3;
        Set set = (Set) obj;
        j.f(set, "applied");
        j.f((h) obj2, "<anonymous parameter 1>");
        do {
            wVar = this.f2987a;
            AtomicReference<Object> atomicReference = wVar.f2965b;
            Object obj4 = atomicReference.get();
            z10 = true;
            if (obj4 == null) {
                obj3 = set;
            } else if (obj4 instanceof Set) {
                obj3 = d.P((Set) obj4, set);
            } else if (obj4 instanceof List) {
                obj3 = q.G0(d.O(set), (Collection) obj4);
            } else {
                e0.c("Unexpected notification");
                throw null;
            }
            while (true) {
                if (!atomicReference.compareAndSet(obj4, obj3)) {
                    if (atomicReference.get() != obj4) {
                        z10 = false;
                        continue;
                        break;
                    }
                } else {
                    break;
                }
            }
        } while (!z10);
        if (w.a(wVar)) {
            wVar.f2964a.invoke(new a0(wVar));
        }
        return m.f8717a;
    }
}
