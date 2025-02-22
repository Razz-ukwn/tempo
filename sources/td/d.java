package td;

import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.EarningsModel;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import com.quickkonnect.silencio.ui.tabs.home.HomeFragment;
import ff.m;
import java.util.Arrays;
import nc.d1;
import rf.l;
import sf.j;
import sf.k;
import zd.g;

public final class d extends k implements l<g<EarningsResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f15614a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(HomeFragment homeFragment) {
        super(1);
        this.f15614a = homeFragment;
    }

    public final Object invoke(Object obj) {
        EarningsResponse earningsResponse;
        EarningsModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        HomeFragment homeFragment = this.f15614a;
        if (z10) {
            String str = gVar.f17949b;
            if (str != null) {
                String string = homeFragment.e0().getString(R.string.alert_title);
                j.e(string, "getString(R.string.alert_title)");
                zd.d.d(homeFragment, string, str, "OK", (String) null, false, b.f15612a, c.f15613a);
            }
        } else if (!(gVar instanceof g.b) && !(gVar instanceof g.c) && (gVar instanceof g.d) && (earningsResponse = (EarningsResponse) gVar.f17948a) != null && (data = earningsResponse.getData()) != null) {
            d1 d1Var = homeFragment.A0;
            j.c(d1Var);
            String format = String.format("%,.2f", Arrays.copyOf(new Object[]{data.getTotalWalletAmount()}, 1));
            j.e(format, "format(format, *args)");
            d1Var.f11655f.setText(format);
        }
        return m.f8717a;
    }
}
