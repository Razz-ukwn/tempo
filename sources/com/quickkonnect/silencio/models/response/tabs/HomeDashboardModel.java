package com.quickkonnect.silencio.models.response.tabs;

import sf.e;
import sf.j;

public final class HomeDashboardModel {
    public static final int $stable = 0;
    private final Double noiceCoins;
    private final Double totalHour;
    private final Double uploadCount;
    private final Double userCount;

    public HomeDashboardModel() {
        this((Double) null, (Double) null, (Double) null, (Double) null, 15, (e) null);
    }

    public HomeDashboardModel(Double d10, Double d11, Double d12, Double d13) {
        this.userCount = d10;
        this.uploadCount = d11;
        this.totalHour = d12;
        this.noiceCoins = d13;
    }

    public static /* synthetic */ HomeDashboardModel copy$default(HomeDashboardModel homeDashboardModel, Double d10, Double d11, Double d12, Double d13, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            d10 = homeDashboardModel.userCount;
        }
        if ((i8 & 2) != 0) {
            d11 = homeDashboardModel.uploadCount;
        }
        if ((i8 & 4) != 0) {
            d12 = homeDashboardModel.totalHour;
        }
        if ((i8 & 8) != 0) {
            d13 = homeDashboardModel.noiceCoins;
        }
        return homeDashboardModel.copy(d10, d11, d12, d13);
    }

    public final Double component1() {
        return this.userCount;
    }

    public final Double component2() {
        return this.uploadCount;
    }

    public final Double component3() {
        return this.totalHour;
    }

    public final Double component4() {
        return this.noiceCoins;
    }

    public final HomeDashboardModel copy(Double d10, Double d11, Double d12, Double d13) {
        return new HomeDashboardModel(d10, d11, d12, d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeDashboardModel)) {
            return false;
        }
        HomeDashboardModel homeDashboardModel = (HomeDashboardModel) obj;
        return j.a(this.userCount, homeDashboardModel.userCount) && j.a(this.uploadCount, homeDashboardModel.uploadCount) && j.a(this.totalHour, homeDashboardModel.totalHour) && j.a(this.noiceCoins, homeDashboardModel.noiceCoins);
    }

    public final Double getNoiceCoins() {
        return this.noiceCoins;
    }

    public final Double getTotalHour() {
        return this.totalHour;
    }

    public final Double getUploadCount() {
        return this.uploadCount;
    }

    public final Double getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        Double d10 = this.userCount;
        int i8 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.uploadCount;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.totalHour;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.noiceCoins;
        if (d13 != null) {
            i8 = d13.hashCode();
        }
        return hashCode3 + i8;
    }

    public String toString() {
        return "HomeDashboardModel(userCount=" + this.userCount + ", uploadCount=" + this.uploadCount + ", totalHour=" + this.totalHour + ", noiceCoins=" + this.noiceCoins + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeDashboardModel(Double d10, Double d11, Double d12, Double d13, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : d10, (i8 & 2) != 0 ? null : d11, (i8 & 4) != 0 ? null : d12, (i8 & 8) != 0 ? null : d13);
    }
}
