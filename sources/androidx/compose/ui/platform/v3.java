package androidx.compose.ui.platform;

import ff.m;
import rf.p;
import sf.k;
import t.e0;
import t.h;

public final class v3 extends k implements p<h, Integer, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f1482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p<h, Integer, m> f1483b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v3(WrappedComposition wrappedComposition, p<? super h, ? super Integer, m> pVar) {
        super(2);
        this.f1482a = wrappedComposition;
        this.f1483b = pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
            e0.b bVar = e0.f15020a;
            o0.a(this.f1482a.f1241a, this.f1483b, hVar, 8);
        } else {
            hVar.j();
        }
        return m.f8717a;
    }
}
