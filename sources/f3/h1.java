package f3;

import cb.b;
import f3.m0;
import f3.q1;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.c1;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.p0;
import kotlinx.coroutines.flow.s;
import lf.e;
import lf.i;
import rf.q;
import sf.j;

@e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {229, 244}, m = "invokeSuspend")
public final class h1 extends i implements q<g<? super g0>, Integer, d<? super m>, Object> {
    public kotlinx.coroutines.sync.d B;
    public int C;

    /* renamed from: a  reason: collision with root package name */
    public int f8266a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g f8267b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8268c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f1 f8269d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o0 f8270e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1(o0 o0Var, f1 f1Var, d dVar) {
        super(3, dVar);
        this.f8269d = f1Var;
        this.f8270e = o0Var;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        f1 f1Var = this.f8269d;
        h1 h1Var = new h1(this.f8270e, f1Var, (d) obj3);
        h1Var.f8267b = (g) obj;
        h1Var.f8268c = obj2;
        return h1Var.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        g gVar;
        q1.a<Key, Value> aVar;
        kotlinx.coroutines.sync.d dVar;
        int i8;
        f fVar;
        o0 o0Var = this.f8270e;
        a aVar2 = a.f10464a;
        int i10 = this.f8266a;
        f1 f1Var = this.f8269d;
        boolean z10 = true;
        if (i10 == 0) {
            b.J(obj);
            gVar = this.f8267b;
            i8 = ((Number) this.f8268c).intValue();
            aVar = f1Var.f8206l;
            dVar = aVar.f8458a;
            this.f8267b = gVar;
            this.f8268c = aVar;
            this.B = dVar;
            this.C = i8;
            this.f8266a = 1;
            if (dVar.b(this) == aVar2) {
                return aVar2;
            }
        } else if (i10 == 1) {
            i8 = this.C;
            dVar = this.B;
            aVar = (q1.a) this.f8268c;
            gVar = this.f8267b;
            b.J(obj);
        } else if (i10 == 2) {
            b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            t0 t0Var = aVar.f8459b.f8457l;
            if (j.a(t0Var.a(o0Var), m0.c.f8366b)) {
                fVar = new h(new g0[0]);
            } else {
                if (!(t0Var.a(o0Var) instanceof m0.a)) {
                    t0Var.c(o0Var, m0.c.f8367c);
                }
                m mVar = m.f8717a;
                dVar.a((Object) null);
                p0 a10 = f1Var.f8203i.a(o0Var);
                int i11 = i8 == 0 ? 0 : 1;
                if (i11 < 0) {
                    z10 = false;
                }
                if (z10) {
                    fVar = new j1(new s(a10, i11), i8);
                } else {
                    throw new IllegalArgumentException(androidx.fragment.app.q.a("Drop count should be non-negative, but had ", i11).toString());
                }
            }
            this.f8267b = null;
            this.f8268c = null;
            this.B = null;
            this.f8266a = 2;
            if (!(gVar instanceof c1)) {
                Object a11 = fVar.a(gVar, this);
                if (a11 != aVar2) {
                    a11 = m.f8717a;
                }
                if (a11 == aVar2) {
                    return aVar2;
                }
                return m.f8717a;
            }
            throw ((c1) gVar).f10527a;
        } finally {
            dVar.a((Object) null);
        }
    }
}
