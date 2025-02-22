package com.quickkonnect.silencio.models.request.auth;

import s0.b0;
import sf.e;
import sf.j;

public final class LoginWithGoogleRequestModel {
    public static final int $stable = 0;
    private final String deviceToken;
    private final String deviceType;
    private final String email;
    private final String registrationType;

    public LoginWithGoogleRequestModel() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    public LoginWithGoogleRequestModel(String str, String str2, String str3, String str4) {
        j.f(str4, "deviceType");
        this.email = str;
        this.registrationType = str2;
        this.deviceToken = str3;
        this.deviceType = str4;
    }

    public static /* synthetic */ LoginWithGoogleRequestModel copy$default(LoginWithGoogleRequestModel loginWithGoogleRequestModel, String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = loginWithGoogleRequestModel.email;
        }
        if ((i8 & 2) != 0) {
            str2 = loginWithGoogleRequestModel.registrationType;
        }
        if ((i8 & 4) != 0) {
            str3 = loginWithGoogleRequestModel.deviceToken;
        }
        if ((i8 & 8) != 0) {
            str4 = loginWithGoogleRequestModel.deviceType;
        }
        return loginWithGoogleRequestModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.registrationType;
    }

    public final String component3() {
        return this.deviceToken;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final LoginWithGoogleRequestModel copy(String str, String str2, String str3, String str4) {
        j.f(str4, "deviceType");
        return new LoginWithGoogleRequestModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginWithGoogleRequestModel)) {
            return false;
        }
        LoginWithGoogleRequestModel loginWithGoogleRequestModel = (LoginWithGoogleRequestModel) obj;
        return j.a(this.email, loginWithGoogleRequestModel.email) && j.a(this.registrationType, loginWithGoogleRequestModel.registrationType) && j.a(this.deviceToken, loginWithGoogleRequestModel.deviceToken) && j.a(this.deviceType, loginWithGoogleRequestModel.deviceType);
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRegistrationType() {
        return this.registrationType;
    }

    public int hashCode() {
        String str = this.email;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.registrationType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceToken;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return this.deviceType.hashCode() + ((hashCode2 + i8) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginWithGoogleRequestModel(email=");
        sb2.append(this.email);
        sb2.append(", registrationType=");
        sb2.append(this.registrationType);
        sb2.append(", deviceToken=");
        sb2.append(this.deviceToken);
        sb2.append(", deviceType=");
        return b0.a(sb2, this.deviceType, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginWithGoogleRequestModel(String str, String str2, String str3, String str4, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? "android" : str4);
    }
}
