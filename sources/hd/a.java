package hd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet$setObservers$1", f = "ClaimCoinPlaceIndoorBottomSheet.kt", l = {70}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinPlaceIndoorBottomSheet f9298b;

    /* renamed from: hd.a$a  reason: collision with other inner class name */
    public static final class C0165a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0165a f9299a = new C0165a();

        public final Object m(Object obj, d dVar) {
            ((Boolean) obj).booleanValue();
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet, d<? super a> dVar) {
        super(2, dVar);
        this.f9298b = claimCoinPlaceIndoorBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f9298b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f9297a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ClaimCoinPlaceIndoorBottomSheet.T0;
            ClaimCoinPlaceIndoorViewModel.a aVar2 = this.f9298b.u0().f6916i;
            C0165a aVar3 = C0165a.f9299a;
            this.f9297a = 1;
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
