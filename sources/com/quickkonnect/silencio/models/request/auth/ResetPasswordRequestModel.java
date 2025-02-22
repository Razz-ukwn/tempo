package com.quickkonnect.silencio.models.request.auth;

import b3.x;
import s0.b0;
import sf.j;

public final class ResetPasswordRequestModel {
    public static final int $stable = 0;
    private final String password;
    private final String repeatPassword;
    private final String userId;

    public ResetPasswordRequestModel(String str, String str2, String str3) {
        j.f(str, "userId");
        j.f(str2, "password");
        j.f(str3, "repeatPassword");
        this.userId = str;
        this.password = str2;
        this.repeatPassword = str3;
    }

    public static /* synthetic */ ResetPasswordRequestModel copy$default(ResetPasswordRequestModel resetPasswordRequestModel, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = resetPasswordRequestModel.userId;
        }
        if ((i8 & 2) != 0) {
            str2 = resetPasswordRequestModel.password;
        }
        if ((i8 & 4) != 0) {
            str3 = resetPasswordRequestModel.repeatPassword;
        }
        return resetPasswordRequestModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.repeatPassword;
    }

    public final ResetPasswordRequestModel copy(String str, String str2, String str3) {
        j.f(str, "userId");
        j.f(str2, "password");
        j.f(str3, "repeatPassword");
        return new ResetPasswordRequestModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetPasswordRequestModel)) {
            return false;
        }
        ResetPasswordRequestModel resetPasswordRequestModel = (ResetPasswordRequestModel) obj;
        return j.a(this.userId, resetPasswordRequestModel.userId) && j.a(this.password, resetPasswordRequestModel.password) && j.a(this.repeatPassword, resetPasswordRequestModel.repeatPassword);
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRepeatPassword() {
        return this.repeatPassword;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.repeatPassword.hashCode() + x.a(this.password, this.userId.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResetPasswordRequestModel(userId=");
        sb2.append(this.userId);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", repeatPassword=");
        return b0.a(sb2, this.repeatPassword, ')');
    }
}
