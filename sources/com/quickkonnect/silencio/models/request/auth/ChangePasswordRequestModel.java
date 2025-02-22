package com.quickkonnect.silencio.models.request.auth;

import bb.b;
import s0.b0;
import sf.j;

public final class ChangePasswordRequestModel {
    public static final int $stable = 0;
    @b("newPassword")
    private final String newPassword;
    @b("password")
    private final String password;

    public ChangePasswordRequestModel(String str, String str2) {
        j.f(str, "newPassword");
        j.f(str2, "password");
        this.newPassword = str;
        this.password = str2;
    }

    public static /* synthetic */ ChangePasswordRequestModel copy$default(ChangePasswordRequestModel changePasswordRequestModel, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = changePasswordRequestModel.newPassword;
        }
        if ((i8 & 2) != 0) {
            str2 = changePasswordRequestModel.password;
        }
        return changePasswordRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.newPassword;
    }

    public final String component2() {
        return this.password;
    }

    public final ChangePasswordRequestModel copy(String str, String str2) {
        j.f(str, "newPassword");
        j.f(str2, "password");
        return new ChangePasswordRequestModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordRequestModel)) {
            return false;
        }
        ChangePasswordRequestModel changePasswordRequestModel = (ChangePasswordRequestModel) obj;
        return j.a(this.newPassword, changePasswordRequestModel.newPassword) && j.a(this.password, changePasswordRequestModel.password);
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.password.hashCode() + (this.newPassword.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChangePasswordRequestModel(newPassword=");
        sb2.append(this.newPassword);
        sb2.append(", password=");
        return b0.a(sb2, this.password, ')');
    }
}
