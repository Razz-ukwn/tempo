package com.quickkonnect.silencio.models.request.auth;

import b3.x;
import s0.b0;
import sf.j;

public final class VerifyNickNameRequestModel {
    public static final int $stable = 0;
    private final String firstName;
    private final String lastName;
    private final String nickName;

    public VerifyNickNameRequestModel(String str, String str2, String str3) {
        j.f(str, "firstName");
        j.f(str2, "lastName");
        j.f(str3, "nickName");
        this.firstName = str;
        this.lastName = str2;
        this.nickName = str3;
    }

    public static /* synthetic */ VerifyNickNameRequestModel copy$default(VerifyNickNameRequestModel verifyNickNameRequestModel, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = verifyNickNameRequestModel.firstName;
        }
        if ((i8 & 2) != 0) {
            str2 = verifyNickNameRequestModel.lastName;
        }
        if ((i8 & 4) != 0) {
            str3 = verifyNickNameRequestModel.nickName;
        }
        return verifyNickNameRequestModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.nickName;
    }

    public final VerifyNickNameRequestModel copy(String str, String str2, String str3) {
        j.f(str, "firstName");
        j.f(str2, "lastName");
        j.f(str3, "nickName");
        return new VerifyNickNameRequestModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyNickNameRequestModel)) {
            return false;
        }
        VerifyNickNameRequestModel verifyNickNameRequestModel = (VerifyNickNameRequestModel) obj;
        return j.a(this.firstName, verifyNickNameRequestModel.firstName) && j.a(this.lastName, verifyNickNameRequestModel.lastName) && j.a(this.nickName, verifyNickNameRequestModel.nickName);
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

    public int hashCode() {
        return this.nickName.hashCode() + x.a(this.lastName, this.firstName.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyNickNameRequestModel(firstName=");
        sb2.append(this.firstName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", nickName=");
        return b0.a(sb2, this.nickName, ')');
    }
}
