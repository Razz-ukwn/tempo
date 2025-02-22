package kotlinx.coroutines.flow;

import cb.b;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import rf.q;

@e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
public final class y extends i implements q<g<Object>, Object, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10685a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g f10686b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f10687c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p<Object, d<Object>, Object> f10688d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(p<Object, ? super d<Object>, ? extends Object> pVar, d<? super y> dVar) {
        super(3, dVar);
        this.f10688d = pVar;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        y yVar = new y(this.f10688d, (d) obj3);
        yVar.f10686b = (g) obj;
        yVar.f10687c = obj2;
        return yVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        g gVar;
        a aVar = a.f10464a;
        int i8 = this.f10685a;
        if (i8 == 0) {
            b.J(obj);
            gVar = this.f10686b;
            Object obj2 = this.f10687c;
            this.f10686b = gVar;
            this.f10685a = 1;
            obj = this.f10688d.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            gVar = this.f10686b;
            b.J(obj);
        } else if (i8 == 2) {
            b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f10686b = null;
        this.f10685a = 2;
        if (gVar.m(obj, this) == aVar) {
            return aVar;
        }
        return m.f8717a;
    }
}
