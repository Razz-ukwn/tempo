package r4;

import ag.b1;
import f3.v;
import h5.h;
import h5.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m5.a;
import m5.d;
import p4.f;
import r4.j;
import r4.r;

public final class o<R> implements j.a<R>, a.d {
    public static final c V = new c();
    public final p B;
    public final u4.a C;
    public final u4.a D;
    public final u4.a E;
    public final u4.a F;
    public final AtomicInteger G;
    public f H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public w<?> M;
    public p4.a N;
    public boolean O;
    public s P;
    public boolean Q;
    public r<?> R;
    public j<R> S;
    public volatile boolean T;
    public boolean U;

    /* renamed from: a  reason: collision with root package name */
    public final e f13958a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f13959b;

    /* renamed from: c  reason: collision with root package name */
    public final r.a f13960c;

    /* renamed from: d  reason: collision with root package name */
    public final c2.d<o<?>> f13961d;

    /* renamed from: e  reason: collision with root package name */
    public final c f13962e;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f13963a;

        public a(h hVar) {
            this.f13963a = hVar;
        }

        public final void run() {
            i iVar = (i) this.f13963a;
            iVar.f9238b.a();
            synchronized (iVar.f9239c) {
                synchronized (o.this) {
                    e eVar = o.this.f13958a;
                    h hVar = this.f13963a;
                    eVar.getClass();
                    if (eVar.f13969a.contains(new d(hVar, l5.e.f10993b))) {
                        o oVar = o.this;
                        h hVar2 = this.f13963a;
                        oVar.getClass();
                        try {
                            ((i) hVar2).l(oVar.P, 5);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    o.this.d();
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final h f13965a;

        public b(h hVar) {
            this.f13965a = hVar;
        }

        public final void run() {
            i iVar = (i) this.f13965a;
            iVar.f9238b.a();
            synchronized (iVar.f9239c) {
                synchronized (o.this) {
                    e eVar = o.this.f13958a;
                    h hVar = this.f13965a;
                    eVar.getClass();
                    if (eVar.f13969a.contains(new d(hVar, l5.e.f10993b))) {
                        o.this.R.b();
                        o oVar = o.this;
                        h hVar2 = this.f13965a;
                        oVar.getClass();
                        try {
                            ((i) hVar2).n(oVar.R, oVar.N, oVar.U);
                            o.this.h(this.f13965a);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    o.this.d();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final h f13967a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f13968b;

        public d(h hVar, Executor executor) {
            this.f13967a = hVar;
            this.f13968b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f13967a.equals(((d) obj).f13967a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13967a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        public final List<d> f13969a;

        public e(ArrayList arrayList) {
            this.f13969a = arrayList;
        }

        public final Iterator<d> iterator() {
            return this.f13969a.iterator();
        }
    }

    public o() {
        throw null;
    }

    public o(u4.a aVar, u4.a aVar2, u4.a aVar3, u4.a aVar4, p pVar, r.a aVar5, a.c cVar) {
        c cVar2 = V;
        this.f13958a = new e(new ArrayList(2));
        this.f13959b = new d.a();
        this.G = new AtomicInteger();
        this.C = aVar;
        this.D = aVar2;
        this.E = aVar3;
        this.F = aVar4;
        this.B = pVar;
        this.f13960c = aVar5;
        this.f13961d = cVar;
        this.f13962e = cVar2;
    }

    public final synchronized void a(h hVar, Executor executor) {
        this.f13959b.a();
        e eVar = this.f13958a;
        eVar.getClass();
        eVar.f13969a.add(new d(hVar, executor));
        boolean z10 = true;
        if (this.O) {
            e(1);
            executor.execute(new b(hVar));
        } else if (this.Q) {
            e(1);
            executor.execute(new a(hVar));
        } else {
            if (this.T) {
                z10 = false;
            }
            b1.a("Cannot add callbacks to a cancelled EngineJob", z10);
        }
    }

    public final d.a b() {
        return this.f13959b;
    }

    public final void c() {
        if (!f()) {
            this.T = true;
            j<R> jVar = this.S;
            jVar.f13911a0 = true;
            h hVar = jVar.Y;
            if (hVar != null) {
                hVar.cancel();
            }
            p pVar = this.B;
            f fVar = this.H;
            n nVar = (n) pVar;
            synchronized (nVar) {
                v vVar = nVar.f13934a;
                vVar.getClass();
                Map map = (Map) (this.L ? vVar.f8517b : vVar.f8516a);
                if (equals(map.get(fVar))) {
                    map.remove(fVar);
                }
            }
        }
    }

    public final void d() {
        r<?> rVar;
        synchronized (this) {
            this.f13959b.a();
            b1.a("Not yet complete!", f());
            int decrementAndGet = this.G.decrementAndGet();
            b1.a("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                rVar = this.R;
                g();
            } else {
                rVar = null;
            }
        }
        if (rVar != null) {
            rVar.e();
        }
    }

    public final synchronized void e(int i8) {
        r<?> rVar;
        b1.a("Not yet complete!", f());
        if (this.G.getAndAdd(i8) == 0 && (rVar = this.R) != null) {
            rVar.b();
        }
    }

    public final boolean f() {
        return this.Q || this.O || this.T;
    }

    public final synchronized void g() {
        boolean a10;
        if (this.H != null) {
            this.f13958a.f13969a.clear();
            this.H = null;
            this.R = null;
            this.M = null;
            this.Q = false;
            this.T = false;
            this.O = false;
            this.U = false;
            j<R> jVar = this.S;
            j.e eVar = jVar.C;
            synchronized (eVar) {
                eVar.f13922a = true;
                a10 = eVar.a();
            }
            if (a10) {
                jVar.m();
            }
            this.S = null;
            this.P = null;
            this.N = null;
            this.f13961d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(h hVar) {
        boolean z10;
        this.f13959b.a();
        e eVar = this.f13958a;
        eVar.f13969a.remove(new d(hVar, l5.e.f10993b));
        if (this.f13958a.f13969a.isEmpty()) {
            c();
            if (!this.O) {
                if (!this.Q) {
                    z10 = false;
                    if (z10 && this.G.get() == 0) {
                        g();
                    }
                }
            }
            z10 = true;
            g();
        }
    }
}
