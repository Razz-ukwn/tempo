package jf;

import jf.f;
import jf.f.b;
import rf.l;
import sf.j;

public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public final l<f.b, E> f10006a;

    /* renamed from: b  reason: collision with root package name */
    public final f.c<?> f10007b;

    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        j.f(cVar, "baseKey");
        j.f(lVar, "safeCast");
        this.f10006a = lVar;
        this.f10007b = cVar instanceof b ? ((b) cVar).f10007b : cVar;
    }
}
