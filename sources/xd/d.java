package xd;

import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.EarningsModel;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import com.quickkonnect.silencio.ui.tabs.shop.ShopFragment;
import ff.m;
import java.util.Arrays;
import nc.g1;
import rf.l;
import sf.j;
import sf.k;
import zd.g;

public final class d extends k implements l<g<EarningsResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShopFragment f17067a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ShopFragment shopFragment) {
        super(1);
        this.f17067a = shopFragment;
    }

    public final Object invoke(Object obj) {
        EarningsResponse earningsResponse;
        EarningsModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        ShopFragment shopFragment = this.f17067a;
        if (z10) {
            String str = gVar.f17949b;
            if (str != null) {
                String string = shopFragment.e0().getString(R.string.alert_title);
                j.e(string, "getString(R.string.alert_title)");
                zd.d.d(shopFragment, string, str, "OK", (String) null, false, b.f17065a, c.f17066a);
            }
        } else if (!(gVar instanceof g.b) && !(gVar instanceof g.c) && (gVar instanceof g.d) && (earningsResponse = (EarningsResponse) gVar.f17948a) != null && (data = earningsResponse.getData()) != null) {
            g1 g1Var = shopFragment.A0;
            j.c(g1Var);
            String format = String.format("%,.2f", Arrays.copyOf(new Object[]{data.getTotalWalletAmount()}, 1));
            j.e(format, "format(format, *args)");
            g1Var.W.setText(format);
        }
        return m.f8717a;
    }
}
