package com.quickkonnect.silencio.models.response.tabs;

import b3.x;
import bb.b;
import sf.j;

public final class FriendId {
    public static final int $stable = 8;
    @b("appleId")
    private final Object appleId;
    @b("authToken")
    private final String authToken;
    @b("avgTime")
    private final Double avgTime;
    @b("countryCode")
    private final String countryCode;
    @b("createdAt")
    private final Double createdAt;
    @b("deviceToken")
    private final String deviceToken;
    @b("email")
    private final String email;
    @b("firstName")
    private final String firstName;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f6681id;
    @b("inviteCode")
    private final String inviteCode;
    @b("isActive")
    private final Boolean isActive;
    @b("isDeleted")
    private final Boolean isDeleted;
    @b("lastLogin")
    private final Long lastLogin;
    @b("lastName")
    private final String lastName;
    @b("nickName")
    private final String nickName;
    @b("phone")
    private final String phone;
    @b("profileImg")
    private final String profileImg;
    @b("recordingCount")
    private final Double recordingCount;
    @b("recordingTime")
    private final Double recordingTime;
    @b("referredBy")
    private final String referredBy;
    @b("registrationType")
    private final String registrationType;
    @b("resetPasswordCode")
    private final Object resetPasswordCode;
    @b("resetPasswordToken")
    private final Object resetPasswordToken;
    @b("type")
    private final String type;
    @b("updatedAt")
    private final Long updatedAt;
    @b("walletBalance")
    private final Double walletBalance;

    public FriendId(Object obj, String str, Double d10, String str2, Double d11, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Long l10, String str8, String str9, String str10, String str11, Double d12, Double d13, String str12, String str13, Object obj2, Object obj3, String str14, Long l11, Double d14) {
        j.f(str6, "id");
        this.appleId = obj;
        this.authToken = str;
        this.avgTime = d10;
        this.countryCode = str2;
        this.createdAt = d11;
        this.deviceToken = str3;
        this.email = str4;
        this.firstName = str5;
        this.f6681id = str6;
        this.inviteCode = str7;
        this.isActive = bool;
        this.isDeleted = bool2;
        this.lastLogin = l10;
        this.lastName = str8;
        this.nickName = str9;
        this.phone = str10;
        this.profileImg = str11;
        this.recordingCount = d12;
        this.recordingTime = d13;
        this.referredBy = str12;
        this.registrationType = str13;
        this.resetPasswordCode = obj2;
        this.resetPasswordToken = obj3;
        this.type = str14;
        this.updatedAt = l11;
        this.walletBalance = d14;
    }

    public static /* synthetic */ FriendId copy$default(FriendId friendId, Object obj, String str, Double d10, String str2, Double d11, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Long l10, String str8, String str9, String str10, String str11, Double d12, Double d13, String str12, String str13, Object obj2, Object obj3, String str14, Long l11, Double d14, int i8, Object obj4) {
        FriendId friendId2 = friendId;
        int i10 = i8;
        return friendId.copy((i10 & 1) != 0 ? friendId2.appleId : obj, (i10 & 2) != 0 ? friendId2.authToken : str, (i10 & 4) != 0 ? friendId2.avgTime : d10, (i10 & 8) != 0 ? friendId2.countryCode : str2, (i10 & 16) != 0 ? friendId2.createdAt : d11, (i10 & 32) != 0 ? friendId2.deviceToken : str3, (i10 & 64) != 0 ? friendId2.email : str4, (i10 & 128) != 0 ? friendId2.firstName : str5, (i10 & 256) != 0 ? friendId2.f6681id : str6, (i10 & 512) != 0 ? friendId2.inviteCode : str7, (i10 & 1024) != 0 ? friendId2.isActive : bool, (i10 & 2048) != 0 ? friendId2.isDeleted : bool2, (i10 & 4096) != 0 ? friendId2.lastLogin : l10, (i10 & 8192) != 0 ? friendId2.lastName : str8, (i10 & 16384) != 0 ? friendId2.nickName : str9, (i10 & 32768) != 0 ? friendId2.phone : str10, (i10 & 65536) != 0 ? friendId2.profileImg : str11, (i10 & 131072) != 0 ? friendId2.recordingCount : d12, (i10 & 262144) != 0 ? friendId2.recordingTime : d13, (i10 & 524288) != 0 ? friendId2.referredBy : str12, (i10 & 1048576) != 0 ? friendId2.registrationType : str13, (i10 & 2097152) != 0 ? friendId2.resetPasswordCode : obj2, (i10 & 4194304) != 0 ? friendId2.resetPasswordToken : obj3, (i10 & 8388608) != 0 ? friendId2.type : str14, (i10 & 16777216) != 0 ? friendId2.updatedAt : l11, (i10 & 33554432) != 0 ? friendId2.walletBalance : d14);
    }

    public final Object component1() {
        return this.appleId;
    }

    public final String component10() {
        return this.inviteCode;
    }

    public final Boolean component11() {
        return this.isActive;
    }

    public final Boolean component12() {
        return this.isDeleted;
    }

    public final Long component13() {
        return this.lastLogin;
    }

    public final String component14() {
        return this.lastName;
    }

    public final String component15() {
        return this.nickName;
    }

    public final String component16() {
        return this.phone;
    }

    public final String component17() {
        return this.profileImg;
    }

    public final Double component18() {
        return this.recordingCount;
    }

    public final Double component19() {
        return this.recordingTime;
    }

    public final String component2() {
        return this.authToken;
    }

    public final String component20() {
        return this.referredBy;
    }

    public final String component21() {
        return this.registrationType;
    }

    public final Object component22() {
        return this.resetPasswordCode;
    }

    public final Object component23() {
        return this.resetPasswordToken;
    }

    public final String component24() {
        return this.type;
    }

    public final Long component25() {
        return this.updatedAt;
    }

    public final Double component26() {
        return this.walletBalance;
    }

    public final Double component3() {
        return this.avgTime;
    }

    public final String component4() {
        return this.countryCode;
    }

    public final Double component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.deviceToken;
    }

    public final String component7() {
        return this.email;
    }

    public final String component8() {
        return this.firstName;
    }

    public final String component9() {
        return this.f6681id;
    }

    public final FriendId copy(Object obj, String str, Double d10, String str2, Double d11, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Long l10, String str8, String str9, String str10, String str11, Double d12, Double d13, String str12, String str13, Object obj2, Object obj3, String str14, Long l11, Double d14) {
        Object obj4 = obj;
        j.f(str6, "id");
        return new FriendId(obj, str, d10, str2, d11, str3, str4, str5, str6, str7, bool, bool2, l10, str8, str9, str10, str11, d12, d13, str12, str13, obj2, obj3, str14, l11, d14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendId)) {
            return false;
        }
        FriendId friendId = (FriendId) obj;
        return j.a(this.appleId, friendId.appleId) && j.a(this.authToken, friendId.authToken) && j.a(this.avgTime, friendId.avgTime) && j.a(this.countryCode, friendId.countryCode) && j.a(this.createdAt, friendId.createdAt) && j.a(this.deviceToken, friendId.deviceToken) && j.a(this.email, friendId.email) && j.a(this.firstName, friendId.firstName) && j.a(this.f6681id, friendId.f6681id) && j.a(this.inviteCode, friendId.inviteCode) && j.a(this.isActive, friendId.isActive) && j.a(this.isDeleted, friendId.isDeleted) && j.a(this.lastLogin, friendId.lastLogin) && j.a(this.lastName, friendId.lastName) && j.a(this.nickName, friendId.nickName) && j.a(this.phone, friendId.phone) && j.a(this.profileImg, friendId.profileImg) && j.a(this.recordingCount, friendId.recordingCount) && j.a(this.recordingTime, friendId.recordingTime) && j.a(this.referredBy, friendId.referredBy) && j.a(this.registrationType, friendId.registrationType) && j.a(this.resetPasswordCode, friendId.resetPasswordCode) && j.a(this.resetPasswordToken, friendId.resetPasswordToken) && j.a(this.type, friendId.type) && j.a(this.updatedAt, friendId.updatedAt) && j.a(this.walletBalance, friendId.walletBalance);
    }

    public final Object getAppleId() {
        return this.appleId;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final Double getAvgTime() {
        return this.avgTime;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final Double getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.f6681id;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final Long getLastLogin() {
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

    public final Double getRecordingCount() {
        return this.recordingCount;
    }

    public final Double getRecordingTime() {
        return this.recordingTime;
    }

    public final String getReferredBy() {
        return this.referredBy;
    }

    public final String getRegistrationType() {
        return this.registrationType;
    }

    public final Object getResetPasswordCode() {
        return this.resetPasswordCode;
    }

    public final Object getResetPasswordToken() {
        return this.resetPasswordToken;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final Double getWalletBalance() {
        return this.walletBalance;
    }

    public int hashCode() {
        Object obj = this.appleId;
        int i8 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.authToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.avgTime;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.countryCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.createdAt;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str3 = this.deviceToken;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int a10 = x.a(this.f6681id, (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.inviteCode;
        int hashCode8 = (a10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isActive;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDeleted;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l10 = this.lastLogin;
        int hashCode11 = (hashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str7 = this.lastName;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.nickName;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phone;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.profileImg;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Double d12 = this.recordingCount;
        int hashCode16 = (hashCode15 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.recordingTime;
        int hashCode17 = (hashCode16 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str11 = this.referredBy;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.registrationType;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Object obj2 = this.resetPasswordCode;
        int hashCode20 = (hashCode19 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.resetPasswordToken;
        int hashCode21 = (hashCode20 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str13 = this.type;
        int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l11 = this.updatedAt;
        int hashCode23 = (hashCode22 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Double d14 = this.walletBalance;
        if (d14 != null) {
            i8 = d14.hashCode();
        }
        return hashCode23 + i8;
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    public String toString() {
        return "FriendId(appleId=" + this.appleId + ", authToken=" + this.authToken + ", avgTime=" + this.avgTime + ", countryCode=" + this.countryCode + ", createdAt=" + this.createdAt + ", deviceToken=" + this.deviceToken + ", email=" + this.email + ", firstName=" + this.firstName + ", id=" + this.f6681id + ", inviteCode=" + this.inviteCode + ", isActive=" + this.isActive + ", isDeleted=" + this.isDeleted + ", lastLogin=" + this.lastLogin + ", lastName=" + this.lastName + ", nickName=" + this.nickName + ", phone=" + this.phone + ", profileImg=" + this.profileImg + ", recordingCount=" + this.recordingCount + ", recordingTime=" + this.recordingTime + ", referredBy=" + this.referredBy + ", registrationType=" + this.registrationType + ", resetPasswordCode=" + this.resetPasswordCode + ", resetPasswordToken=" + this.resetPasswordToken + ", type=" + this.type + ", updatedAt=" + this.updatedAt + ", walletBalance=" + this.walletBalance + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FriendId(java.lang.Object r31, java.lang.String r32, java.lang.Double r33, java.lang.String r34, java.lang.Double r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.Boolean r41, java.lang.Boolean r42, java.lang.Long r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.Double r48, java.lang.Double r49, java.lang.String r50, java.lang.String r51, java.lang.Object r52, java.lang.Object r53, java.lang.String r54, java.lang.Long r55, java.lang.Double r56, int r57, sf.e r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r31
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r32
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r33
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r34
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r35
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r36
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0039
            r10 = r2
            goto L_0x003b
        L_0x0039:
            r10 = r37
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r38
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r40
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r41
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0059
            r15 = r2
            goto L_0x005b
        L_0x0059:
            r15 = r42
        L_0x005b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0062
            r16 = r2
            goto L_0x0064
        L_0x0062:
            r16 = r43
        L_0x0064:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            r17 = r2
            goto L_0x006d
        L_0x006b:
            r17 = r44
        L_0x006d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0074
            r18 = r2
            goto L_0x0076
        L_0x0074:
            r18 = r45
        L_0x0076:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007f
            r19 = r2
            goto L_0x0081
        L_0x007f:
            r19 = r46
        L_0x0081:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0089
            r20 = r2
            goto L_0x008b
        L_0x0089:
            r20 = r47
        L_0x008b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0093
            r21 = r2
            goto L_0x0095
        L_0x0093:
            r21 = r48
        L_0x0095:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009d
            r22 = r2
            goto L_0x009f
        L_0x009d:
            r22 = r49
        L_0x009f:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a7
            r23 = r2
            goto L_0x00a9
        L_0x00a7:
            r23 = r50
        L_0x00a9:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b1
            r24 = r2
            goto L_0x00b3
        L_0x00b1:
            r24 = r51
        L_0x00b3:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bb
            r25 = r2
            goto L_0x00bd
        L_0x00bb:
            r25 = r52
        L_0x00bd:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c5
            r26 = r2
            goto L_0x00c7
        L_0x00c5:
            r26 = r53
        L_0x00c7:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00cf
            r27 = r2
            goto L_0x00d1
        L_0x00cf:
            r27 = r54
        L_0x00d1:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d9
            r28 = r2
            goto L_0x00db
        L_0x00d9:
            r28 = r55
        L_0x00db:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00e3
            r29 = r2
            goto L_0x00e5
        L_0x00e3:
            r29 = r56
        L_0x00e5:
            r3 = r30
            r12 = r39
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.response.tabs.FriendId.<init>(java.lang.Object, java.lang.String, java.lang.Double, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Long, java.lang.Double, int, sf.e):void");
    }
}
