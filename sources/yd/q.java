package yd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel$pingInactiveUser$1", f = "WalletViewModel.kt", l = {87}, m = "invokeSuspend")
public final class q extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WalletViewModel f17364b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(WalletViewModel walletViewModel, d<? super q> dVar) {
        super(2, dVar);
        this.f17364b = walletViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new q(this.f17364b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17363a;
        WalletViewModel walletViewModel = this.f17364b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(walletViewModel);
            v<g<BaseResponse>> vVar = walletViewModel.f7160l;
            if (g10) {
                f.c(vVar);
                mc.d dVar = walletViewModel.f7155g;
                this.f17363a = 1;
                obj = dVar.f11382a.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(walletViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                walletViewModel.f7160l.k(new g.a(walletViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        walletViewModel.f7160l.k(walletViewModel.f((b0) obj));
        return m.f8717a;
    }
}
