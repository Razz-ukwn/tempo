package com.quickkonnect.silencio.models.request.auth;

import b3.x;
import s0.b0;
import sf.e;
import sf.j;

public final class LoginWithPhoneRequestModel {
    public static final int $stable = 0;
    private final String deviceToken;
    private final String deviceType;
    private final String nickName;
    private final String password;

    public LoginWithPhoneRequestModel(String str, String str2, String str3, String str4) {
        j.f(str, "nickName");
        j.f(str2, "password");
        j.f(str3, "deviceToken");
        j.f(str4, "deviceType");
        this.nickName = str;
        this.password = str2;
        this.deviceToken = str3;
        this.deviceType = str4;
    }

    public static /* synthetic */ LoginWithPhoneRequestModel copy$default(LoginWithPhoneRequestModel loginWithPhoneRequestModel, String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = loginWithPhoneRequestModel.nickName;
        }
        if ((i8 & 2) != 0) {
            str2 = loginWithPhoneRequestModel.password;
        }
        if ((i8 & 4) != 0) {
            str3 = loginWithPhoneRequestModel.deviceToken;
        }
        if ((i8 & 8) != 0) {
            str4 = loginWithPhoneRequestModel.deviceType;
        }
        return loginWithPhoneRequestModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.nickName;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.deviceToken;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final LoginWithPhoneRequestModel copy(String str, String str2, String str3, String str4) {
        j.f(str, "nickName");
        j.f(str2, "password");
        j.f(str3, "deviceToken");
        j.f(str4, "deviceType");
        return new LoginWithPhoneRequestModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginWithPhoneRequestModel)) {
            return false;
        }
        LoginWithPhoneRequestModel loginWithPhoneRequestModel = (LoginWithPhoneRequestModel) obj;
        return j.a(this.nickName, loginWithPhoneRequestModel.nickName) && j.a(this.password, loginWithPhoneRequestModel.password) && j.a(this.deviceToken, loginWithPhoneRequestModel.deviceToken) && j.a(this.deviceType, loginWithPhoneRequestModel.deviceType);
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.deviceType.hashCode() + x.a(this.deviceToken, x.a(this.password, this.nickName.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginWithPhoneRequestModel(nickName=");
        sb2.append(this.nickName);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", deviceToken=");
        sb2.append(this.deviceToken);
        sb2.append(", deviceType=");
        return b0.a(sb2, this.deviceType, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginWithPhoneRequestModel(String str, String str2, String str3, String str4, int i8, e eVar) {
        this(str, str2, str3, (i8 & 8) != 0 ? "android" : str4);
    }
}
