package com.quickkonnect.silencio.models.response.auth;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class VerifyInviteCodeResponse extends BaseResponse {
    public static final int $stable = 0;
    @b("data")
    private final VerifyInviteCodeResponseModel data;

    public VerifyInviteCodeResponse() {
        this((VerifyInviteCodeResponseModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyInviteCodeResponse(VerifyInviteCodeResponseModel verifyInviteCodeResponseModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : verifyInviteCodeResponseModel);
    }

    public static /* synthetic */ VerifyInviteCodeResponse copy$default(VerifyInviteCodeResponse verifyInviteCodeResponse, VerifyInviteCodeResponseModel verifyInviteCodeResponseModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            verifyInviteCodeResponseModel = verifyInviteCodeResponse.data;
        }
        return verifyInviteCodeResponse.copy(verifyInviteCodeResponseModel);
    }

    public final VerifyInviteCodeResponseModel component1() {
        return this.data;
    }

    public final VerifyInviteCodeResponse copy(VerifyInviteCodeResponseModel verifyInviteCodeResponseModel) {
        return new VerifyInviteCodeResponse(verifyInviteCodeResponseModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyInviteCodeResponse) && j.a(this.data, ((VerifyInviteCodeResponse) obj).data);
    }

    public final VerifyInviteCodeResponseModel getData() {
        return this.data;
    }

    public int hashCode() {
        VerifyInviteCodeResponseModel verifyInviteCodeResponseModel = this.data;
        if (verifyInviteCodeResponseModel == null) {
            return 0;
        }
        return verifyInviteCodeResponseModel.hashCode();
    }

    public String toString() {
        return "VerifyInviteCodeResponse(data=" + this.data + ')';
    }

    public VerifyInviteCodeResponse(VerifyInviteCodeResponseModel verifyInviteCodeResponseModel) {
        this.data = verifyInviteCodeResponseModel;
    }
}
