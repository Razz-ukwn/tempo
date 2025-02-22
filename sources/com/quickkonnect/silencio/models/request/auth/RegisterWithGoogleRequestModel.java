package com.quickkonnect.silencio.models.request.auth;

import s0.b0;
import sf.e;
import sf.j;

public final class RegisterWithGoogleRequestModel {
    public static final int $stable = 0;
    private final String deviceToken;
    private final String deviceType;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String nickName;
    private final String referreId;
    private final String registrationType;

    public RegisterWithGoogleRequestModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (e) null);
    }

    public RegisterWithGoogleRequestModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        j.f(str8, "deviceType");
        this.firstName = str;
        this.lastName = str2;
        this.registrationType = str3;
        this.email = str4;
        this.nickName = str5;
        this.referreId = str6;
        this.deviceToken = str7;
        this.deviceType = str8;
    }

    public static /* synthetic */ RegisterWithGoogleRequestModel copy$default(RegisterWithGoogleRequestModel registerWithGoogleRequestModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, Object obj) {
        RegisterWithGoogleRequestModel registerWithGoogleRequestModel2 = registerWithGoogleRequestModel;
        int i10 = i8;
        return registerWithGoogleRequestModel.copy((i10 & 1) != 0 ? registerWithGoogleRequestModel2.firstName : str, (i10 & 2) != 0 ? registerWithGoogleRequestModel2.lastName : str2, (i10 & 4) != 0 ? registerWithGoogleRequestModel2.registrationType : str3, (i10 & 8) != 0 ? registerWithGoogleRequestModel2.email : str4, (i10 & 16) != 0 ? registerWithGoogleRequestModel2.nickName : str5, (i10 & 32) != 0 ? registerWithGoogleRequestModel2.referreId : str6, (i10 & 64) != 0 ? registerWithGoogleRequestModel2.deviceToken : str7, (i10 & 128) != 0 ? registerWithGoogleRequestModel2.deviceType : str8);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.registrationType;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.nickName;
    }

    public final String component6() {
        return this.referreId;
    }

    public final String component7() {
        return this.deviceToken;
    }

    public final String component8() {
        return this.deviceType;
    }

    public final RegisterWithGoogleRequestModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str8;
        j.f(str9, "deviceType");
        return new RegisterWithGoogleRequestModel(str, str2, str3, str4, str5, str6, str7, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterWithGoogleRequestModel)) {
            return false;
        }
        RegisterWithGoogleRequestModel registerWithGoogleRequestModel = (RegisterWithGoogleRequestModel) obj;
        return j.a(this.firstName, registerWithGoogleRequestModel.firstName) && j.a(this.lastName, registerWithGoogleRequestModel.lastName) && j.a(this.registrationType, registerWithGoogleRequestModel.registrationType) && j.a(this.email, registerWithGoogleRequestModel.email) && j.a(this.nickName, registerWithGoogleRequestModel.nickName) && j.a(this.referreId, registerWithGoogleRequestModel.referreId) && j.a(this.deviceToken, registerWithGoogleRequestModel.deviceToken) && j.a(this.deviceType, registerWithGoogleRequestModel.deviceType);
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

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getReferreId() {
        return this.referreId;
    }

    public final String getRegistrationType() {
        return this.registrationType;
    }

    public int hashCode() {
        String str = this.firstName;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.referreId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceToken;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return this.deviceType.hashCode() + ((hashCode6 + i8) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RegisterWithGoogleRequestModel(firstName=");
        sb2.append(this.firstName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", registrationType=");
        sb2.append(this.registrationType);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", nickName=");
        sb2.append(this.nickName);
        sb2.append(", referreId=");
        sb2.append(this.referreId);
        sb2.append(", deviceToken=");
        sb2.append(this.deviceToken);
        sb2.append(", deviceType=");
        return b0.a(sb2, this.deviceType, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterWithGoogleRequestModel(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, sf.e r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "android"
            goto L_0x003d
        L_0x003b:
            r0 = r17
        L_0x003d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r2
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.request.auth.RegisterWithGoogleRequestModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sf.e):void");
    }
}
