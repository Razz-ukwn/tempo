package id;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorBottomSheet;
import ff.m;
import java.util.List;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.l;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor.ClaimCoinPlaceOutdoorBottomSheet$setObservers$2", f = "ClaimCoinPlaceOutdoorBottomSheet.kt", l = {75}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9654a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinPlaceOutdoorBottomSheet f9655b;

    public static final class a implements g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinPlaceOutdoorBottomSheet f9656a;

        public a(ClaimCoinPlaceOutdoorBottomSheet claimCoinPlaceOutdoorBottomSheet) {
            this.f9656a = claimCoinPlaceOutdoorBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            l lVar = this.f9656a.Q0;
            j.c(lVar);
            lVar.T.setEnabled(!((List) obj).isEmpty());
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ClaimCoinPlaceOutdoorBottomSheet claimCoinPlaceOutdoorBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f9655b = claimCoinPlaceOutdoorBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f9655b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f9654a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = ClaimCoinPlaceOutdoorBottomSheet.T0;
            ClaimCoinPlaceOutdoorBottomSheet claimCoinPlaceOutdoorBottomSheet = this.f9655b;
            y0 y0Var = claimCoinPlaceOutdoorBottomSheet.u0().f6931g;
            a aVar2 = new a(claimCoinPlaceOutdoorBottomSheet);
            this.f9654a = 1;
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
