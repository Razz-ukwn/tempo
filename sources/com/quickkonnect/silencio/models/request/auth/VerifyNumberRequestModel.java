package com.quickkonnect.silencio.models.request.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s0.b0;
import sf.e;
import sf.j;

public final class VerifyNumberRequestModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerifyNumberRequestModel> CREATOR = new Creator();
    private final String captcha;
    private final String code;
    private final String countryCode;
    private final String deviceType;
    private final String email;
    private final String phone;

    public static final class Creator implements Parcelable.Creator<VerifyNumberRequestModel> {
        public final VerifyNumberRequestModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new VerifyNumberRequestModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final VerifyNumberRequestModel[] newArray(int i8) {
            return new VerifyNumberRequestModel[i8];
        }
    }

    public VerifyNumberRequestModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (e) null);
    }

    public VerifyNumberRequestModel(String str, String str2, String str3, String str4, String str5, String str6) {
        j.f(str6, "deviceType");
        this.countryCode = str;
        this.phone = str2;
        this.email = str3;
        this.code = str4;
        this.captcha = str5;
        this.deviceType = str6;
    }

    public static /* synthetic */ VerifyNumberRequestModel copy$default(VerifyNumberRequestModel verifyNumberRequestModel, String str, String str2, String str3, String str4, String str5, String str6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = verifyNumberRequestModel.countryCode;
        }
        if ((i8 & 2) != 0) {
            str2 = verifyNumberRequestModel.phone;
        }
        String str7 = str2;
        if ((i8 & 4) != 0) {
            str3 = verifyNumberRequestModel.email;
        }
        String str8 = str3;
        if ((i8 & 8) != 0) {
            str4 = verifyNumberRequestModel.code;
        }
        String str9 = str4;
        if ((i8 & 16) != 0) {
            str5 = verifyNumberRequestModel.captcha;
        }
        String str10 = str5;
        if ((i8 & 32) != 0) {
            str6 = verifyNumberRequestModel.deviceType;
        }
        return verifyNumberRequestModel.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.countryCode;
    }

    public final String component2() {
        return this.phone;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.code;
    }

    public final String component5() {
        return this.captcha;
    }

    public final String component6() {
        return this.deviceType;
    }

    public final VerifyNumberRequestModel copy(String str, String str2, String str3, String str4, String str5, String str6) {
        j.f(str6, "deviceType");
        return new VerifyNumberRequestModel(str, str2, str3, str4, str5, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyNumberRequestModel)) {
            return false;
        }
        VerifyNumberRequestModel verifyNumberRequestModel = (VerifyNumberRequestModel) obj;
        return j.a(this.countryCode, verifyNumberRequestModel.countryCode) && j.a(this.phone, verifyNumberRequestModel.phone) && j.a(this.email, verifyNumberRequestModel.email) && j.a(this.code, verifyNumberRequestModel.code) && j.a(this.captcha, verifyNumberRequestModel.captcha) && j.a(this.deviceType, verifyNumberRequestModel.deviceType);
    }

    public final String getCaptcha() {
        return this.captcha;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.countryCode;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.captcha;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return this.deviceType.hashCode() + ((hashCode4 + i8) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyNumberRequestModel(countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", captcha=");
        sb2.append(this.captcha);
        sb2.append(", deviceType=");
        return b0.a(sb2, this.deviceType, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.countryCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        parcel.writeString(this.code);
        parcel.writeString(this.captcha);
        parcel.writeString(this.deviceType);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VerifyNumberRequestModel(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, sf.e r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r9
        L_0x0023:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x0029
            java.lang.String r10 = "android"
        L_0x0029:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sf.e):void");
    }
}
