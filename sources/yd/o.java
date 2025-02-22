package yd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel$getEarnings$1", f = "WalletViewModel.kt", l = {44}, m = "invokeSuspend")
public final class o extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17359a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WalletViewModel f17360b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(WalletViewModel walletViewModel, d<? super o> dVar) {
        super(2, dVar);
        this.f17360b = walletViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new o(this.f17360b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17359a;
        WalletViewModel walletViewModel = this.f17360b;
        if (i8 == 0) {
            b.J(obj);
            if (zd.a.g(walletViewModel)) {
                mc.d dVar = walletViewModel.f7155g;
                this.f17359a = 1;
                obj = dVar.f11382a.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                walletViewModel.f7158j.k(new g.a(walletViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                walletViewModel.f7158j.k(new g.a(walletViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        walletViewModel.f7158j.k(walletViewModel.f((b0) obj));
        return m.f8717a;
    }
}
