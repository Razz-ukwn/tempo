package jd;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorBottomSheet;
import ff.m;
import java.util.List;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.n;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorBottomSheet$setObservers$2", f = "ClaimCoinSourceIndoorBottomSheet.kt", l = {83}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinSourceIndoorBottomSheet f9979b;

    public static final class a implements g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClaimCoinSourceIndoorBottomSheet f9980a;

        public a(ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet) {
            this.f9980a = claimCoinSourceIndoorBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            n nVar = this.f9980a.Q0;
            j.c(nVar);
            nVar.T.setEnabled(!((List) obj).isEmpty());
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f9979b = claimCoinSourceIndoorBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f9979b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f9978a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = ClaimCoinSourceIndoorBottomSheet.U0;
            ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet = this.f9979b;
            y0 y0Var = claimCoinSourceIndoorBottomSheet.u0().f6950h;
            a aVar2 = new a(claimCoinSourceIndoorBottomSheet);
            this.f9978a = 1;
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
