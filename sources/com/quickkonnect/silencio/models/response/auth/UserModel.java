package com.quickkonnect.silencio.models.response.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s0.b0;
import sf.e;
import sf.j;

public final class UserModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UserModel> CREATOR = new Creator();
    private final String authToken;
    private final String avgTime;
    private final String countryCode;
    private final String createdAt;
    private final String email;
    private final String firstName;

    /* renamed from: id  reason: collision with root package name */
    private final String f6677id;
    private final String inviteCode;
    private final String lastLogin;
    private final String lastName;
    private final String nickName;
    private final String phone;
    private final String profileImg;
    private final String recordingCount;
    private final String recordingTime;
    private final String registrationType;
    private final String type;
    private final int uuid;
    private final String walletBalance;

    public static final class Creator implements Parcelable.Creator<UserModel> {
        public final UserModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new UserModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final UserModel[] newArray(int i8) {
            return new UserModel[i8];
        }
    }

    public UserModel() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (e) null);
    }

    public UserModel(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.uuid = i8;
        this.f6677id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.email = str4;
        this.nickName = str5;
        this.type = str6;
        this.registrationType = str7;
        this.countryCode = str8;
        this.phone = str9;
        this.walletBalance = str10;
        this.recordingTime = str11;
        this.recordingCount = str12;
        this.avgTime = str13;
        this.lastLogin = str14;
        this.authToken = str15;
        this.inviteCode = str16;
        this.profileImg = str17;
        this.createdAt = str18;
    }

    public static /* synthetic */ UserModel copy$default(UserModel userModel, int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i10, Object obj) {
        UserModel userModel2 = userModel;
        int i11 = i10;
        return userModel.copy((i11 & 1) != 0 ? userModel2.uuid : i8, (i11 & 2) != 0 ? userModel2.f6677id : str, (i11 & 4) != 0 ? userModel2.firstName : str2, (i11 & 8) != 0 ? userModel2.lastName : str3, (i11 & 16) != 0 ? userModel2.email : str4, (i11 & 32) != 0 ? userModel2.nickName : str5, (i11 & 64) != 0 ? userModel2.type : str6, (i11 & 128) != 0 ? userModel2.registrationType : str7, (i11 & 256) != 0 ? userModel2.countryCode : str8, (i11 & 512) != 0 ? userModel2.phone : str9, (i11 & 1024) != 0 ? userModel2.walletBalance : str10, (i11 & 2048) != 0 ? userModel2.recordingTime : str11, (i11 & 4096) != 0 ? userModel2.recordingCount : str12, (i11 & 8192) != 0 ? userModel2.avgTime : str13, (i11 & 16384) != 0 ? userModel2.lastLogin : str14, (i11 & 32768) != 0 ? userModel2.authToken : str15, (i11 & 65536) != 0 ? userModel2.inviteCode : str16, (i11 & 131072) != 0 ? userModel2.profileImg : str17, (i11 & 262144) != 0 ? userModel2.createdAt : str18);
    }

    public final int component1() {
        return this.uuid;
    }

    public final String component10() {
        return this.phone;
    }

    public final String component11() {
        return this.walletBalance;
    }

    public final String component12() {
        return this.recordingTime;
    }

    public final String component13() {
        return this.recordingCount;
    }

    public final String component14() {
        return this.avgTime;
    }

    public final String component15() {
        return this.lastLogin;
    }

    public final String component16() {
        return this.authToken;
    }

    public final String component17() {
        return this.inviteCode;
    }

    public final String component18() {
        return this.profileImg;
    }

    public final String component19() {
        return this.createdAt;
    }

    public final String component2() {
        return this.f6677id;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.nickName;
    }

    public final String component7() {
        return this.type;
    }

    public final String component8() {
        return this.registrationType;
    }

    public final String component9() {
        return this.countryCode;
    }

    public final UserModel copy(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        return new UserModel(i8, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserModel)) {
            return false;
        }
        UserModel userModel = (UserModel) obj;
        return this.uuid == userModel.uuid && j.a(this.f6677id, userModel.f6677id) && j.a(this.firstName, userModel.firstName) && j.a(this.lastName, userModel.lastName) && j.a(this.email, userModel.email) && j.a(this.nickName, userModel.nickName) && j.a(this.type, userModel.type) && j.a(this.registrationType, userModel.registrationType) && j.a(this.countryCode, userModel.countryCode) && j.a(this.phone, userModel.phone) && j.a(this.walletBalance, userModel.walletBalance) && j.a(this.recordingTime, userModel.recordingTime) && j.a(this.recordingCount, userModel.recordingCount) && j.a(this.avgTime, userModel.avgTime) && j.a(this.lastLogin, userModel.lastLogin) && j.a(this.authToken, userModel.authToken) && j.a(this.inviteCode, userModel.inviteCode) && j.a(this.profileImg, userModel.profileImg) && j.a(this.createdAt, userModel.createdAt);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getAvgTime() {
        return this.avgTime;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.f6677id;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final String getLastLogin() {
        return this.lastLogin;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getProfileImg() {
        return this.profileImg;
    }

    public final String getRecordingCount() {
        return this.recordingCount;
    }

    public final String getRecordingTime() {
        return this.recordingTime;
    }

    public final String getRegistrationType() {
        return this.registrationType;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUuid() {
        return this.uuid;
    }

    public final String getWalletBalance() {
        return this.walletBalance;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.uuid) * 31;
        String str = this.f6677id;
        int i8 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.registrationType;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.countryCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phone;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.walletBalance;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.recordingTime;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.recordingCount;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.avgTime;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastLogin;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.authToken;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.inviteCode;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.profileImg;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.createdAt;
        if (str18 != null) {
            i8 = str18.hashCode();
        }
        return hashCode18 + i8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserModel(uuid=");
        sb2.append(this.uuid);
        sb2.append(", id=");
        sb2.append(this.f6677id);
        sb2.append(", firstName=");
        sb2.append(this.firstName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", nickName=");
        sb2.append(this.nickName);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", registrationType=");
        sb2.append(this.registrationType);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", walletBalance=");
        sb2.append(this.walletBalance);
        sb2.append(", recordingTime=");
        sb2.append(this.recordingTime);
        sb2.append(", recordingCount=");
        sb2.append(this.recordingCount);
        sb2.append(", avgTime=");
        sb2.append(this.avgTime);
        sb2.append(", lastLogin=");
        sb2.append(this.lastLogin);
        sb2.append(", authToken=");
        sb2.append(this.authToken);
        sb2.append(", inviteCode=");
        sb2.append(this.inviteCode);
        sb2.append(", profileImg=");
        sb2.append(this.profileImg);
        sb2.append(", createdAt=");
        return b0.a(sb2, this.createdAt, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(this.uuid);
        parcel.writeString(this.f6677id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.email);
        parcel.writeString(this.nickName);
        parcel.writeString(this.type);
        parcel.writeString(this.registrationType);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.walletBalance);
        parcel.writeString(this.recordingTime);
        parcel.writeString(this.recordingCount);
        parcel.writeString(this.avgTime);
        parcel.writeString(this.lastLogin);
        parcel.writeString(this.authToken);
        parcel.writeString(this.inviteCode);
        parcel.writeString(this.profileImg);
        parcel.writeString(this.createdAt);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserModel(int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, sf.e r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0012
        L_0x0010:
            r2 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r27
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r28
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r29
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r30
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r31
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r32
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r33
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r34
        L_0x0072:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0078
            r3 = 0
            goto L_0x007a
        L_0x0078:
            r3 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r39
        L_0x00a6:
            r21 = r20
            r22 = r1
            r23 = r2
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r3
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.response.auth.UserModel.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sf.e):void");
    }
}
