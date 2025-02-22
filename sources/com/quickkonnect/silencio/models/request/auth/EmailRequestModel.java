package com.quickkonnect.silencio.models.request.auth;

import android.os.Parcel;
import android.os.Parcelable;
import b3.x;
import s0.b0;
import sf.e;
import sf.j;

public final class EmailRequestModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EmailRequestModel> CREATOR = new Creator();
    private final String captcha;
    private final String code;
    private final String deviceType;
    private final String email;

    public static final class Creator implements Parcelable.Creator<EmailRequestModel> {
        public final EmailRequestModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new EmailRequestModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final EmailRequestModel[] newArray(int i8) {
            return new EmailRequestModel[i8];
        }
    }

    public EmailRequestModel() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    public EmailRequestModel(String str, String str2, String str3, String str4) {
        j.f(str3, "deviceType");
        this.email = str;
        this.captcha = str2;
        this.deviceType = str3;
        this.code = str4;
    }

    public static /* synthetic */ EmailRequestModel copy$default(EmailRequestModel emailRequestModel, String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = emailRequestModel.email;
        }
        if ((i8 & 2) != 0) {
            str2 = emailRequestModel.captcha;
        }
        if ((i8 & 4) != 0) {
            str3 = emailRequestModel.deviceType;
        }
        if ((i8 & 8) != 0) {
            str4 = emailRequestModel.code;
        }
        return emailRequestModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.captcha;
    }

    public final String component3() {
        return this.deviceType;
    }

    public final String component4() {
        return this.code;
    }

    public final EmailRequestModel copy(String str, String str2, String str3, String str4) {
        j.f(str3, "deviceType");
        return new EmailRequestModel(str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailRequestModel)) {
            return false;
        }
        EmailRequestModel emailRequestModel = (EmailRequestModel) obj;
        return j.a(this.email, emailRequestModel.email) && j.a(this.captcha, emailRequestModel.captcha) && j.a(this.deviceType, emailRequestModel.deviceType) && j.a(this.code, emailRequestModel.code);
    }

    public final String getCaptcha() {
        return this.captcha;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        String str = this.email;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.captcha;
        int a10 = x.a(this.deviceType, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.code;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return a10 + i8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmailRequestModel(email=");
        sb2.append(this.email);
        sb2.append(", captcha=");
        sb2.append(this.captcha);
        sb2.append(", deviceType=");
        sb2.append(this.deviceType);
        sb2.append(", code=");
        return b0.a(sb2, this.code, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.email);
        parcel.writeString(this.captcha);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.code);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmailRequestModel(String str, String str2, String str3, String str4, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? "android" : str3, (i8 & 8) != 0 ? null : str4);
    }
}
