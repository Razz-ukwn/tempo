package com.quickkonnect.silencio.models.response.menu;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class HistoryResponse extends BaseResponse {
    public static final int $stable = 8;
    @b("data")
    private final HistoryModel data;

    public HistoryResponse() {
        this((HistoryModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HistoryResponse(HistoryModel historyModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : historyModel);
    }

    public static /* synthetic */ HistoryResponse copy$default(HistoryResponse historyResponse, HistoryModel historyModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            historyModel = historyResponse.data;
        }
        return historyResponse.copy(historyModel);
    }

    public final HistoryModel component1() {
        return this.data;
    }

    public final HistoryResponse copy(HistoryModel historyModel) {
        return new HistoryResponse(historyModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HistoryResponse) && j.a(this.data, ((HistoryResponse) obj).data);
    }

    public final HistoryModel getData() {
        return this.data;
    }

    public int hashCode() {
        HistoryModel historyModel = this.data;
        if (historyModel == null) {
            return 0;
        }
        return historyModel.hashCode();
    }

    public String toString() {
        return "HistoryResponse(data=" + this.data + ')';
    }

    public HistoryResponse(HistoryModel historyModel) {
        this.data = historyModel;
    }
}
