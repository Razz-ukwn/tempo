package com.quickkonnect.silencio.models.response;

import bb.b;
import sf.e;
import sf.j;

public final class UpdateCheckResponse extends BaseResponse {
    public static final int $stable = 0;
    @b("data")
    private final UpdateCheckData data;

    public UpdateCheckResponse() {
        this((UpdateCheckData) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateCheckResponse(UpdateCheckData updateCheckData, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : updateCheckData);
    }

    public static /* synthetic */ UpdateCheckResponse copy$default(UpdateCheckResponse updateCheckResponse, UpdateCheckData updateCheckData, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            updateCheckData = updateCheckResponse.data;
        }
        return updateCheckResponse.copy(updateCheckData);
    }

    public final UpdateCheckData component1() {
        return this.data;
    }

    public final UpdateCheckResponse copy(UpdateCheckData updateCheckData) {
        return new UpdateCheckResponse(updateCheckData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCheckResponse) && j.a(this.data, ((UpdateCheckResponse) obj).data);
    }

    public final UpdateCheckData getData() {
        return this.data;
    }

    public int hashCode() {
        UpdateCheckData updateCheckData = this.data;
        if (updateCheckData == null) {
            return 0;
        }
        return updateCheckData.hashCode();
    }

    public String toString() {
        return "UpdateCheckResponse(data=" + this.data + ')';
    }

    public UpdateCheckResponse(UpdateCheckData updateCheckData) {
        this.data = updateCheckData;
    }
}
