package pd;

import ag.g0;
import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import com.quickkonnect.silencio.ui.menu.history.HistoryFragment;
import com.quickkonnect.silencio.ui.menu.history.HistoryViewModel;
import f3.c2;
import f3.f;
import f3.x1;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.l0;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.menu.history.HistoryFragment$setObserver$1", f = "HistoryFragment.kt", l = {111}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12586a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HistoryFragment f12587b;

    @e(c = "com.quickkonnect.silencio.ui.menu.history.HistoryFragment$setObserver$1$1", f = "HistoryFragment.kt", l = {112}, m = "invokeSuspend")
    public static final class a extends i implements p<x1<AudioHistory>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f12588a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f12589b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ HistoryFragment f12590c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HistoryFragment historyFragment, d<? super a> dVar) {
            super(2, dVar);
            this.f12590c = historyFragment;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f12590c, dVar);
            aVar.f12589b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((x1) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f12588a;
            if (i8 == 0) {
                cb.b.J(obj);
                x1 x1Var = (x1) this.f12589b;
                j jVar = this.f12590c.B0;
                if (jVar != null) {
                    this.f12588a = 1;
                    f<T> fVar = jVar.f8071e;
                    fVar.f8183g.incrementAndGet();
                    f3.d dVar = fVar.f8182f;
                    dVar.getClass();
                    Object a10 = dVar.f8171g.a(0, new c2(dVar, x1Var, (d<? super c2>) null), this);
                    if (a10 != aVar) {
                        a10 = m.f8717a;
                    }
                    if (a10 != aVar) {
                        a10 = m.f8717a;
                    }
                    if (a10 != aVar) {
                        a10 = m.f8717a;
                    }
                    if (a10 == aVar) {
                        return aVar;
                    }
                } else {
                    j.l("adapter");
                    throw null;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(HistoryFragment historyFragment, d<? super b> dVar) {
        super(2, dVar);
        this.f12587b = historyFragment;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f12587b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f12586a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = HistoryFragment.E0;
            HistoryFragment historyFragment = this.f12587b;
            l0 l0Var = ((HistoryViewModel) historyFragment.C0.getValue()).f7076i;
            a aVar2 = new a(historyFragment, (d<? super a>) null);
            this.f12586a = 1;
            if (cb.d.t(l0Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
