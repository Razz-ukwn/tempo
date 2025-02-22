package lc;

import ah.f;
import ah.o;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import com.quickkonnect.silencio.models.response.tabs.FriendListResponse;
import com.quickkonnect.silencio.models.response.tabs.HomeDashboardResponseModel;
import yg.b0;

public interface d {
    @o("user/wallet/pingInactiveUsers")
    Object a(jf.d<? super b0<BaseResponse>> dVar);

    @f("user/wallet/getFriendList")
    Object b(jf.d<? super b0<FriendListResponse>> dVar);

    @f("user/dashboard")
    Object c(jf.d<? super b0<HomeDashboardResponseModel>> dVar);

    @f("user/wallet/getEarnings")
    Object d(jf.d<? super b0<EarningsResponse>> dVar);
}
