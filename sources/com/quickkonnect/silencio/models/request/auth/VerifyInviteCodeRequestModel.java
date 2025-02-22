package com.quickkonnect.silencio.models.request.auth;

import s0.b0;
import sf.j;

public final class VerifyInviteCodeRequestModel {
    public static final int $stable = 0;
    private final String inviteCode;

    public VerifyInviteCodeRequestModel(String str) {
        j.f(str, "inviteCode");
        this.inviteCode = str;
    }

    public static /* synthetic */ VerifyInviteCodeRequestModel copy$default(VerifyInviteCodeRequestModel verifyInviteCodeRequestModel, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = verifyInviteCodeRequestModel.inviteCode;
        }
        return verifyInviteCodeRequestModel.copy(str);
    }

    public final String component1() {
        return this.inviteCode;
    }

    public final VerifyInviteCodeRequestModel copy(String str) {
        j.f(str, "inviteCode");
        return new VerifyInviteCodeRequestModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyInviteCodeRequestModel) && j.a(this.inviteCode, ((VerifyInviteCodeRequestModel) obj).inviteCode);
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public int hashCode() {
        return this.inviteCode.hashCode();
    }

    public String toString() {
        return b0.a(new StringBuilder("VerifyInviteCodeRequestModel(inviteCode="), this.inviteCode, ')');
    }
}
