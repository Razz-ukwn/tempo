package com.quickkonnect.silencio.models.response.auth;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class LoginWithPhoneResponseModel extends BaseResponse {
    public static final int $stable = 0;
    @b("data")
    private final UserModel data;

    public LoginWithPhoneResponseModel() {
        this((UserModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginWithPhoneResponseModel(UserModel userModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : userModel);
    }

    public static /* synthetic */ LoginWithPhoneResponseModel copy$default(LoginWithPhoneResponseModel loginWithPhoneResponseModel, UserModel userModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            userModel = loginWithPhoneResponseModel.data;
        }
        return loginWithPhoneResponseModel.copy(userModel);
    }

    public final UserModel component1() {
        return this.data;
    }

    public final LoginWithPhoneResponseModel copy(UserModel userModel) {
        return new LoginWithPhoneResponseModel(userModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginWithPhoneResponseModel) && j.a(this.data, ((LoginWithPhoneResponseModel) obj).data);
    }

    public final UserModel getData() {
        return this.data;
    }

    public int hashCode() {
        UserModel userModel = this.data;
        if (userModel == null) {
            return 0;
        }
        return userModel.hashCode();
    }

    public String toString() {
        return "LoginWithPhoneResponseModel(data=" + this.data + ')';
    }

    public LoginWithPhoneResponseModel(UserModel userModel) {
        this.data = userModel;
    }
}
