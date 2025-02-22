package com.quickkonnect.silencio.models.response.tabs;

import bb.b;
import sf.e;
import sf.j;

public final class FriendListModel {
    public static final int $stable = 8;
    private final Double amount;
    @b("friendFirstName")
    private final String friendFirstName;
    @b("friendId")
    private final FriendId friendId;
    @b("friendLastName")
    private final String friendLastName;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f6682id;
    @b("isFriendDeleted")
    private final Boolean isFriendDeleted;
    @b("profilePic")
    private final String profilePic;
    @b("timeStamp")
    private final Long timeStamp;

    public FriendListModel() {
        this((Double) null, (String) null, (FriendId) null, (String) null, (String) null, (Boolean) null, (String) null, (Long) null, 255, (e) null);
    }

    public FriendListModel(Double d10, String str, FriendId friendId2, String str2, String str3, Boolean bool, String str4, Long l10) {
        this.amount = d10;
        this.friendFirstName = str;
        this.friendId = friendId2;
        this.friendLastName = str2;
        this.f6682id = str3;
        this.isFriendDeleted = bool;
        this.profilePic = str4;
        this.timeStamp = l10;
    }

    public static /* synthetic */ FriendListModel copy$default(FriendListModel friendListModel, Double d10, String str, FriendId friendId2, String str2, String str3, Boolean bool, String str4, Long l10, int i8, Object obj) {
        FriendListModel friendListModel2 = friendListModel;
        int i10 = i8;
        return friendListModel.copy((i10 & 1) != 0 ? friendListModel2.amount : d10, (i10 & 2) != 0 ? friendListModel2.friendFirstName : str, (i10 & 4) != 0 ? friendListModel2.friendId : friendId2, (i10 & 8) != 0 ? friendListModel2.friendLastName : str2, (i10 & 16) != 0 ? friendListModel2.f6682id : str3, (i10 & 32) != 0 ? friendListModel2.isFriendDeleted : bool, (i10 & 64) != 0 ? friendListModel2.profilePic : str4, (i10 & 128) != 0 ? friendListModel2.timeStamp : l10);
    }

    public final Double component1() {
        return this.amount;
    }

    public final String component2() {
        return this.friendFirstName;
    }

    public final FriendId component3() {
        return this.friendId;
    }

    public final String component4() {
        return this.friendLastName;
    }

    public final String component5() {
        return this.f6682id;
    }

    public final Boolean component6() {
        return this.isFriendDeleted;
    }

    public final String component7() {
        return this.profilePic;
    }

    public final Long component8() {
        return this.timeStamp;
    }

    public final FriendListModel copy(Double d10, String str, FriendId friendId2, String str2, String str3, Boolean bool, String str4, Long l10) {
        return new FriendListModel(d10, str, friendId2, str2, str3, bool, str4, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendListModel)) {
            return false;
        }
        FriendListModel friendListModel = (FriendListModel) obj;
        return j.a(this.amount, friendListModel.amount) && j.a(this.friendFirstName, friendListModel.friendFirstName) && j.a(this.friendId, friendListModel.friendId) && j.a(this.friendLastName, friendListModel.friendLastName) && j.a(this.f6682id, friendListModel.f6682id) && j.a(this.isFriendDeleted, friendListModel.isFriendDeleted) && j.a(this.profilePic, friendListModel.profilePic) && j.a(this.timeStamp, friendListModel.timeStamp);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getFriendFirstName() {
        return this.friendFirstName;
    }

    public final FriendId getFriendId() {
        return this.friendId;
    }

    public final String getFriendLastName() {
        return this.friendLastName;
    }

    public final String getId() {
        return this.f6682id;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        Double d10 = this.amount;
        int i8 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        String str = this.friendFirstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FriendId friendId2 = this.friendId;
        int hashCode3 = (hashCode2 + (friendId2 == null ? 0 : friendId2.hashCode())) * 31;
        String str2 = this.friendLastName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6682id;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFriendDeleted;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.profilePic;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.timeStamp;
        if (l10 != null) {
            i8 = l10.hashCode();
        }
        return hashCode7 + i8;
    }

    public final Boolean isFriendDeleted() {
        return this.isFriendDeleted;
    }

    public String toString() {
        return "FriendListModel(amount=" + this.amount + ", friendFirstName=" + this.friendFirstName + ", friendId=" + this.friendId + ", friendLastName=" + this.friendLastName + ", id=" + this.f6682id + ", isFriendDeleted=" + this.isFriendDeleted + ", profilePic=" + this.profilePic + ", timeStamp=" + this.timeStamp + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FriendListModel(java.lang.Double r10, java.lang.String r11, com.quickkonnect.silencio.models.response.tabs.FriendId r12, java.lang.String r13, java.lang.String r14, java.lang.Boolean r15, java.lang.String r16, java.lang.Long r17, int r18, sf.e r19) {
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
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.response.tabs.FriendListModel.<init>(java.lang.Double, java.lang.String, com.quickkonnect.silencio.models.response.tabs.FriendId, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, int, sf.e):void");
    }
}
