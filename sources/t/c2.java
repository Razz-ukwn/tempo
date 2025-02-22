package t;

import ff.m;
import rf.a;
import sf.k;
import u.c;

public final class c2 extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c<Object> f15002a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m0 f15003b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c2(m0 m0Var, c cVar) {
        super(0);
        this.f15002a = cVar;
        this.f15003b = m0Var;
    }

    public final Object d() {
        c<Object> cVar = this.f15002a;
        int i8 = cVar.f15634a;
        for (int i10 = 0; i10 < i8; i10++) {
            this.f15003b.r(cVar.get(i10));
        }
        return m.f8717a;
    }
}
