package com.quickkonnect.silencio.models.response.tabs;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class HomeDashboardResponseModel extends BaseResponse {
    public static final int $stable = 0;
    @b("data")
    private final HomeDashboardModel data;

    public HomeDashboardResponseModel() {
        this((HomeDashboardModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeDashboardResponseModel(HomeDashboardModel homeDashboardModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : homeDashboardModel);
    }

    public static /* synthetic */ HomeDashboardResponseModel copy$default(HomeDashboardResponseModel homeDashboardResponseModel, HomeDashboardModel homeDashboardModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            homeDashboardModel = homeDashboardResponseModel.data;
        }
        return homeDashboardResponseModel.copy(homeDashboardModel);
    }

    public final HomeDashboardModel component1() {
        return this.data;
    }

    public final HomeDashboardResponseModel copy(HomeDashboardModel homeDashboardModel) {
        return new HomeDashboardResponseModel(homeDashboardModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeDashboardResponseModel) && j.a(this.data, ((HomeDashboardResponseModel) obj).data);
    }

    public final HomeDashboardModel getData() {
        return this.data;
    }

    public int hashCode() {
        HomeDashboardModel homeDashboardModel = this.data;
        if (homeDashboardModel == null) {
            return 0;
        }
        return homeDashboardModel.hashCode();
    }

    public String toString() {
        return "HomeDashboardResponseModel(data=" + this.data + ')';
    }

    public HomeDashboardResponseModel(HomeDashboardModel homeDashboardModel) {
        this.data = homeDashboardModel;
    }
}
