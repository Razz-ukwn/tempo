package hd;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet;
import ff.m;
import java.util.List;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.j;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet$setObservers$2", f = "ClaimCoinPlaceIndoorBottomSheet.kt", l = {75}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinPlaceIndoorBottomSheet f9301b;

    public static final class a implements g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinPlaceIndoorBottomSheet f9302a;

        public a(ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet) {
            this.f9302a = claimCoinPlaceIndoorBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            j jVar = this.f9302a.Q0;
            sf.j.c(jVar);
            jVar.T.setEnabled(!((List) obj).isEmpty());
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f9301b = claimCoinPlaceIndoorBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f9301b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f9300a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = ClaimCoinPlaceIndoorBottomSheet.T0;
            ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet = this.f9301b;
            y0 y0Var = claimCoinPlaceIndoorBottomSheet.u0().f6914g;
            a aVar2 = new a(claimCoinPlaceIndoorBottomSheet);
            this.f9300a = 1;
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
