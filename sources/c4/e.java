package c4;

import ag.g0;
import b4.g;
import c4.b;
import ff.m;
import h4.h;
import h4.l;
import jf.d;
import lf.i;
import rf.p;
import sf.v;
import x3.a;

@lf.e(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
public final class e extends i implements p<g0, d<? super b.a>, Object> {
    public final /* synthetic */ Object B;
    public final /* synthetic */ v<l> C;
    public final /* synthetic */ x3.b D;

    /* renamed from: a  reason: collision with root package name */
    public int f3684a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f3685b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v<g> f3686c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v<a> f3687d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f3688e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b bVar, v<g> vVar, v<a> vVar2, h hVar, Object obj, v<l> vVar3, x3.b bVar2, d<? super e> dVar) {
        super(2, dVar);
        this.f3685b = bVar;
        this.f3686c = vVar;
        this.f3687d = vVar2;
        this.f3688e = hVar;
        this.B = obj;
        this.C = vVar3;
        this.D = bVar2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f3685b, this.f3686c, this.f3687d, this.f3688e, this.B, this.C, this.D, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f3684a;
        if (i8 == 0) {
            cb.b.J(obj);
            b bVar = this.f3685b;
            x3.b bVar2 = this.D;
            this.f3684a = 1;
            obj = b.b(bVar, (b4.l) this.f3686c.f14957a, (a) this.f3687d.f14957a, this.f3688e, this.B, (l) this.C.f14957a, bVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
