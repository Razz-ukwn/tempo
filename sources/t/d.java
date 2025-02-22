package t;

import e9.c;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import jf.f;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import sf.v;
import t.z1;

public final class d implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final rf.a<m> f15004a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15005b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public Throwable f15006c;

    /* renamed from: d  reason: collision with root package name */
    public List<a<?>> f15007d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<a<?>> f15008e = new ArrayList();

    public static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        public final l<Long, R> f15009a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.d<R> f15010b;

        public a(l lVar, ag.l lVar2) {
            j.f(lVar, "onFrame");
            this.f15009a = lVar;
            this.f15010b = lVar2;
        }
    }

    public static final class b extends k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f15011a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v<a<R>> f15012b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, v<a<R>> vVar) {
            super(1);
            this.f15011a = dVar;
            this.f15012b = vVar;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            d dVar = this.f15011a;
            Object obj2 = dVar.f15005b;
            v<a<R>> vVar = this.f15012b;
            synchronized (obj2) {
                List<a<?>> list = dVar.f15007d;
                T t2 = vVar.f14957a;
                if (t2 != null) {
                    list.remove((a) t2);
                } else {
                    j.l("awaiter");
                    throw null;
                }
            }
            return m.f8717a;
        }
    }

    public d(z1.e eVar) {
        this.f15004a = eVar;
    }

    public final <R> Object Y(l<? super Long, ? extends R> lVar, jf.d<? super R> dVar) {
        rf.a<m> aVar;
        ag.l lVar2 = new ag.l(1, c.g(dVar));
        lVar2.t();
        v vVar = new v();
        synchronized (this.f15005b) {
            Throwable th = this.f15006c;
            if (th != null) {
                lVar2.resumeWith(cb.b.u(th));
            } else {
                vVar.f14957a = new a(lVar, lVar2);
                boolean z10 = !this.f15007d.isEmpty();
                List<a<?>> list = this.f15007d;
                T t2 = vVar.f14957a;
                if (t2 != null) {
                    list.add((a) t2);
                    boolean z11 = !z10;
                    lVar2.v(new b(this, vVar));
                    if (z11 && (aVar = this.f15004a) != null) {
                        try {
                            aVar.d();
                        } catch (Throwable th2) {
                            synchronized (this.f15005b) {
                                if (this.f15006c == null) {
                                    this.f15006c = th2;
                                    List<a<?>> list2 = this.f15007d;
                                    int size = list2.size();
                                    for (int i8 = 0; i8 < size; i8++) {
                                        list2.get(i8).f15010b.resumeWith(cb.b.u(th2));
                                    }
                                    this.f15007d.clear();
                                    m mVar = m.f8717a;
                                }
                            }
                        }
                    }
                } else {
                    j.l("awaiter");
                    throw null;
                }
            }
        }
        return lVar2.s();
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f15005b) {
            z10 = !this.f15007d.isEmpty();
        }
        return z10;
    }

    public final void b(long j10) {
        R r10;
        synchronized (this.f15005b) {
            List<a<?>> list = this.f15007d;
            this.f15007d = this.f15008e;
            this.f15008e = list;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                a aVar = list.get(i8);
                aVar.getClass();
                try {
                    r10 = aVar.f15009a.invoke(Long.valueOf(j10));
                } catch (Throwable th) {
                    r10 = cb.b.u(th);
                }
                aVar.f15010b.resumeWith(r10);
            }
            list.clear();
            m mVar = m.f8717a;
        }
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        return f.b.a.a(this, cVar);
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        return f.b.a.b(this, cVar);
    }
}
