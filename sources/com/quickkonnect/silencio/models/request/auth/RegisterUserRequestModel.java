package com.quickkonnect.silencio.models.request.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s0.b0;
import sf.e;
import sf.j;

public final class RegisterUserRequestModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RegisterUserRequestModel> CREATOR = new Creator();
    private final String countryCode;
    private final String deviceToken;
    private final String deviceType;
    private final String email;
    private final String firstName;

    /* renamed from: id  reason: collision with root package name */
    private final String f6673id;
    private final String lastName;
    private final String nickName;
    private final String password;
    private final String phone;
    private final String referreId;
    private final String registrationType;
    private final String repeatPassword;

    public static final class Creator implements Parcelable.Creator<RegisterUserRequestModel> {
        public final RegisterUserRequestModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new RegisterUserRequestModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final RegisterUserRequestModel[] newArray(int i8) {
            return new RegisterUserRequestModel[i8];
        }
    }

    public RegisterUserRequestModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (e) null);
    }

    public RegisterUserRequestModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        j.f(str13, "deviceType");
        this.f6673id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.nickName = str4;
        this.email = str5;
        this.password = str6;
        this.repeatPassword = str7;
        this.countryCode = str8;
        this.phone = str9;
        this.registrationType = str10;
        this.referreId = str11;
        this.deviceToken = str12;
        this.deviceType = str13;
    }

    public static /* synthetic */ RegisterUserRequestModel copy$default(RegisterUserRequestModel registerUserRequestModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i8, Object obj) {
        RegisterUserRequestModel registerUserRequestModel2 = registerUserRequestModel;
        int i10 = i8;
        return registerUserRequestModel.copy((i10 & 1) != 0 ? registerUserRequestModel2.f6673id : str, (i10 & 2) != 0 ? registerUserRequestModel2.firstName : str2, (i10 & 4) != 0 ? registerUserRequestModel2.lastName : str3, (i10 & 8) != 0 ? registerUserRequestModel2.nickName : str4, (i10 & 16) != 0 ? registerUserRequestModel2.email : str5, (i10 & 32) != 0 ? registerUserRequestModel2.password : str6, (i10 & 64) != 0 ? registerUserRequestModel2.repeatPassword : str7, (i10 & 128) != 0 ? registerUserRequestModel2.countryCode : str8, (i10 & 256) != 0 ? registerUserRequestModel2.phone : str9, (i10 & 512) != 0 ? registerUserRequestModel2.registrationType : str10, (i10 & 1024) != 0 ? registerUserRequestModel2.referreId : str11, (i10 & 2048) != 0 ? registerUserRequestModel2.deviceToken : str12, (i10 & 4096) != 0 ? registerUserRequestModel2.deviceType : str13);
    }

    public final String component1() {
        return this.f6673id;
    }

    public final String component10() {
        return this.registrationType;
    }

    public final String component11() {
        return this.referreId;
    }

    public final String component12() {
        return this.deviceToken;
    }

    public final String component13() {
        return this.deviceType;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.nickName;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.password;
    }

    public final String component7() {
        return this.repeatPassword;
    }

    public final String component8() {
        return this.countryCode;
    }

    public final String component9() {
        return this.phone;
    }

    public final RegisterUserRequestModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str13;
        j.f(str14, "deviceType");
        return new RegisterUserRequestModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str14);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterUserRequestModel)) {
            return false;
        }
        RegisterUserRequestModel registerUserRequestModel = (RegisterUserRequestModel) obj;
        return j.a(this.f6673id, registerUserRequestModel.f6673id) && j.a(this.firstName, registerUserRequestModel.firstName) && j.a(this.lastName, registerUserRequestModel.lastName) && j.a(this.nickName, registerUserRequestModel.nickName) && j.a(this.email, registerUserRequestModel.email) && j.a(this.password, registerUserRequestModel.password) && j.a(this.repeatPassword, registerUserRequestModel.repeatPassword) && j.a(this.countryCode, registerUserRequestModel.countryCode) && j.a(this.phone, registerUserRequestModel.phone) && j.a(this.registrationType, registerUserRequestModel.registrationType) && j.a(this.referreId, registerUserRequestModel.referreId) && j.a(this.deviceToken, registerUserRequestModel.deviceToken) && j.a(this.deviceType, registerUserRequestModel.deviceType);
    }

    public final String getCountryCode() {
        return this.countryCode;
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

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.f6673id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getReferreId() {
        return this.referreId;
    }

    public final String getRegistrationType() {
        return this.registrationType;
    }

    public final String getRepeatPassword() {
        return this.repeatPassword;
    }

    public int hashCode() {
        String str = this.f6673id;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.password;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.repeatPassword;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.countryCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phone;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.registrationType;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.referreId;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.deviceToken;
        if (str12 != null) {
            i8 = str12.hashCode();
        }
        return this.deviceType.hashCode() + ((hashCode11 + i8) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RegisterUserRequestModel(id=");
        sb2.append(this.f6673id);
        sb2.append(", firstName=");
        sb2.append(this.firstName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", nickName=");
        sb2.append(this.nickName);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", repeatPassword=");
        sb2.append(this.repeatPassword);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", registrationType=");
        sb2.append(this.registrationType);
        sb2.append(", referreId=");
        sb2.append(this.referreId);
        sb2.append(", deviceToken=");
        sb2.append(this.deviceToken);
        sb2.append(", deviceType=");
        return b0.a(sb2, this.deviceType, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.f6673id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.nickName);
        parcel.writeString(this.email);
        parcel.writeString(this.password);
        parcel.writeString(this.repeatPassword);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.registrationType);
        parcel.writeString(this.referreId);
        parcel.writeString(this.deviceToken);
        parcel.writeString(this.deviceType);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterUserRequestModel(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, sf.e r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = r26
        L_0x0061:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "android"
            goto L_0x006a
        L_0x0068:
            r0 = r27
        L_0x006a:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r2
            r28 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sf.e):void");
    }
}
