package q;

import ff.m;
import rf.l;
import sf.j;
import sf.k;
import sf.v;

public final class h0 extends k implements l<Long, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v<i<Object, Object>> f12694a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f12695b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object, Object> f12696c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k<Object, Object> f12697d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l<i<Object, Object>, m> f12698e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(v<i<Object, Object>> vVar, float f10, f<Object, Object> fVar, k<Object, Object> kVar, l<? super i<Object, Object>, m> lVar) {
        super(1);
        this.f12694a = vVar;
        this.f12695b = f10;
        this.f12696c = fVar;
        this.f12697d = kVar;
        this.f12698e = lVar;
    }

    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        T t2 = this.f12694a.f14957a;
        j.c(t2);
        j0.c((i) t2, longValue, this.f12695b, this.f12696c, this.f12697d, this.f12698e);
        return m.f8717a;
    }
}
