package com.quickkonnect.silencio.models.response.tabs;

import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class EarningsResponse extends BaseResponse {
    public static final int $stable = 0;
    private final EarningsModel data;

    public EarningsResponse() {
        this((EarningsModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EarningsResponse(EarningsModel earningsModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : earningsModel);
    }

    public static /* synthetic */ EarningsResponse copy$default(EarningsResponse earningsResponse, EarningsModel earningsModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            earningsModel = earningsResponse.data;
        }
        return earningsResponse.copy(earningsModel);
    }

    public final EarningsModel component1() {
        return this.data;
    }

    public final EarningsResponse copy(EarningsModel earningsModel) {
        return new EarningsResponse(earningsModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsResponse) && j.a(this.data, ((EarningsResponse) obj).data);
    }

    public final EarningsModel getData() {
        return this.data;
    }

    public int hashCode() {
        EarningsModel earningsModel = this.data;
        if (earningsModel == null) {
            return 0;
        }
        return earningsModel.hashCode();
    }

    public String toString() {
        return "EarningsResponse(data=" + this.data + ')';
    }

    public EarningsResponse(EarningsModel earningsModel) {
        this.data = earningsModel;
    }
}
