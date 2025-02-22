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
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.tabs.wallet.WalletViewModel$getFriendList$1", f = "WalletViewModel.kt", l = {66}, m = "invokeSuspend")
public final class p extends i implements rf.p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WalletViewModel f17362b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(WalletViewModel walletViewModel, d<? super p> dVar) {
        super(2, dVar);
        this.f17362b = walletViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p(this.f17362b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17361a;
        WalletViewModel walletViewModel = this.f17362b;
        if (i8 == 0) {
            b.J(obj);
            if (zd.a.g(walletViewModel)) {
                mc.d dVar = walletViewModel.f7155g;
                this.f17361a = 1;
                obj = dVar.f11382a.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return m.f8717a;
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                walletViewModel.f7159k.k(new g.a(walletViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        walletViewModel.f7159k.k(walletViewModel.f((b0) obj));
        return m.f8717a;
    }
}
