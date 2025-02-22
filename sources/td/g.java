package td;

import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.HomeDashboardModel;
import com.quickkonnect.silencio.models.response.tabs.HomeDashboardResponseModel;
import com.quickkonnect.silencio.ui.tabs.home.HomeFragment;
import ff.m;
import nc.d1;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class g extends k implements l<zd.g<HomeDashboardResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f15617a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(HomeFragment homeFragment) {
        super(1);
        this.f15617a = homeFragment;
    }

    public final Object invoke(Object obj) {
        HomeDashboardResponseModel homeDashboardResponseModel;
        HomeDashboardModel data;
        zd.g gVar = (zd.g) obj;
        boolean z10 = gVar instanceof g.a;
        HomeFragment homeFragment = this.f15617a;
        if (z10) {
            String str = gVar.f17949b;
            if (str != null) {
                String string = homeFragment.e0().getString(R.string.alert_title);
                j.e(string, "getString(R.string.alert_title)");
                d.d(homeFragment, string, str, "OK", (String) null, false, e.f15615a, f.f15616a);
            }
        } else if (!(gVar instanceof g.b) && !(gVar instanceof g.c) && (gVar instanceof g.d) && (homeDashboardResponseModel = (HomeDashboardResponseModel) gVar.f17948a) != null && (data = homeDashboardResponseModel.getData()) != null) {
            d1 d1Var = homeFragment.A0;
            j.c(d1Var);
            Double userCount = data.getUserCount();
            Integer num = null;
            d1Var.f11657h.setText(String.valueOf(userCount != null ? Integer.valueOf((int) userCount.doubleValue()) : null));
            d1 d1Var2 = homeFragment.A0;
            j.c(d1Var2);
            Double uploadCount = data.getUploadCount();
            d1Var2.f11659j.setText(String.valueOf(uploadCount != null ? Integer.valueOf((int) uploadCount.doubleValue()) : null));
            d1 d1Var3 = homeFragment.A0;
            j.c(d1Var3);
            Double totalHour = data.getTotalHour();
            d1Var3.f11656g.setText(String.valueOf(totalHour != null ? Integer.valueOf((int) totalHour.doubleValue()) : null));
            d1 d1Var4 = homeFragment.A0;
            j.c(d1Var4);
            Double noiceCoins = data.getNoiceCoins();
            if (noiceCoins != null) {
                num = Integer.valueOf((int) noiceCoins.doubleValue());
            }
            d1Var4.f11658i.setText(String.valueOf(num));
        }
        return m.f8717a;
    }
}
