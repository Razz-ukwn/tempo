package kd;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorBottomSheet;
import ff.m;
import java.util.List;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorBottomSheet$setObservers$2", f = "ClaimCoinSourceOutdoorBottomSheet.kt", l = {83}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinSourceOutdoorBottomSheet f10414b;

    public static final class a implements g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinSourceOutdoorBottomSheet f10415a;

        public a(ClaimCoinSourceOutdoorBottomSheet claimCoinSourceOutdoorBottomSheet) {
            this.f10415a = claimCoinSourceOutdoorBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            nc.p pVar = this.f10415a.Q0;
            j.c(pVar);
            pVar.T.setEnabled(!((List) obj).isEmpty());
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ClaimCoinSourceOutdoorBottomSheet claimCoinSourceOutdoorBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f10414b = claimCoinSourceOutdoorBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f10414b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f10413a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = ClaimCoinSourceOutdoorBottomSheet.U0;
            ClaimCoinSourceOutdoorBottomSheet claimCoinSourceOutdoorBottomSheet = this.f10414b;
            y0 y0Var = claimCoinSourceOutdoorBottomSheet.u0().f6970h;
            a aVar2 = new a(claimCoinSourceOutdoorBottomSheet);
            this.f10413a = 1;
            if (y0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            cb.b.J(obj);
        }
        throw new r();
    }
}
