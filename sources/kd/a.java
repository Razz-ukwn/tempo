package kd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorBottomSheet$setObservers$1", f = "ClaimCoinSourceOutdoorBottomSheet.kt", l = {78}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10410a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinSourceOutdoorBottomSheet f10411b;

    /* renamed from: kd.a$a  reason: collision with other inner class name */
    public static final class C0192a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0192a f10412a = new C0192a();

        public final Object m(Object obj, d dVar) {
            ((Boolean) obj).booleanValue();
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ClaimCoinSourceOutdoorBottomSheet claimCoinSourceOutdoorBottomSheet, d<? super a> dVar) {
        super(2, dVar);
        this.f10411b = claimCoinSourceOutdoorBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f10411b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f10410a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ClaimCoinSourceOutdoorBottomSheet.U0;
            ClaimCoinSourceOutdoorViewModel.a aVar2 = this.f10411b.u0().f6972j;
            C0192a aVar3 = C0192a.f10412a;
            this.f10410a = 1;
            if (aVar2.a(aVar3, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
