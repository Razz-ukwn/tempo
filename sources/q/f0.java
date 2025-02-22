package q;

import ff.m;
import q.a;
import rf.l;
import sf.k;
import sf.v;

public final class f0 extends k implements l<Long, m> {
    public final /* synthetic */ float B;
    public final /* synthetic */ l<i<Object, Object>, m> C;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v<i<Object, Object>> f12685a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12686b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object, Object> f12687c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f12688d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k<Object, Object> f12689e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(v vVar, Object obj, f fVar, p pVar, k kVar, float f10, a.C0249a aVar) {
        super(1);
        this.f12685a = vVar;
        this.f12686b = obj;
        this.f12687c = fVar;
        this.f12688d = pVar;
        this.f12689e = kVar;
        this.B = f10;
        this.C = aVar;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [q.p, java.lang.Object] */
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f12686b;
        f<Object, Object> fVar = this.f12687c;
        i iVar = new i(obj2, fVar.c(), this.f12688d, longValue, fVar.g(), longValue, new e0(this.f12689e));
        j0.c(iVar, longValue, this.B, this.f12687c, this.f12689e, this.C);
        this.f12685a.f14957a = iVar;
        return m.f8717a;
    }
}
