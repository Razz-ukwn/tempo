package yd;

import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.EarningsModel;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment;
import ff.m;
import jf.f;
import nc.i1;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class f extends k implements l<g<EarningsResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WalletFragment f17351a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(WalletFragment walletFragment) {
        super(1);
        this.f17351a = walletFragment;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        WalletFragment walletFragment = this.f17351a;
        if (z10) {
            String str = gVar.f17949b;
            if (str != null) {
                String string = walletFragment.e0().getString(R.string.alert_title);
                j.e(string, "getString(R.string.alert_title)");
                d.d(walletFragment, string, str, "OK", (String) null, false, c.f17345a, d.f17346a);
            }
        } else if (gVar instanceof g.c) {
            walletFragment.E0 = true;
        } else if (gVar instanceof g.d) {
            EarningsResponse earningsResponse = (EarningsResponse) gVar.f17948a;
            EarningsModel data = earningsResponse != null ? earningsResponse.getData() : null;
            i1 i1Var = walletFragment.A0;
            j.c(i1Var);
            Object[] objArr = new Object[1];
            objArr[0] = data != null ? data.getTotalCoinsFromReferal() : null;
            i1Var.Z.setText(walletFragment.y(R.string.wallet_you_formatter, objArr));
            i1 i1Var2 = walletFragment.A0;
            j.c(i1Var2);
            Object[] objArr2 = new Object[1];
            objArr2[0] = data != null ? data.getTotalCoinsFromReferal() : null;
            i1Var2.W.setText(walletFragment.y(R.string.wallet_friends_formatter, objArr2));
            b.D(cb.d.I(walletFragment), (f.b) null, 0, new e(walletFragment, data, (jf.d<? super e>) null), 3);
        } else {
            boolean z11 = gVar instanceof g.b;
        }
        return m.f8717a;
    }
}
