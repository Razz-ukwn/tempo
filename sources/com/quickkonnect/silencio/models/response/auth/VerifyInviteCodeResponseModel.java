package com.quickkonnect.silencio.models.response.auth;

import bb.b;
import s0.b0;
import sf.e;
import sf.j;

public final class VerifyInviteCodeResponseModel {
    public static final int $stable = 0;
    @b("_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f6678id;

    public VerifyInviteCodeResponseModel() {
        this((String) null, 1, (e) null);
    }

    public VerifyInviteCodeResponseModel(String str) {
        this.f6678id = str;
    }

    public static /* synthetic */ VerifyInviteCodeResponseModel copy$default(VerifyInviteCodeResponseModel verifyInviteCodeResponseModel, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = verifyInviteCodeResponseModel.f6678id;
        }
        return verifyInviteCodeResponseModel.copy(str);
    }

    public final String component1() {
        return this.f6678id;
    }

    public final VerifyInviteCodeResponseModel copy(String str) {
        return new VerifyInviteCodeResponseModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyInviteCodeResponseModel) && j.a(this.f6678id, ((VerifyInviteCodeResponseModel) obj).f6678id);
    }

    public final String getId() {
        return this.f6678id;
    }

    public int hashCode() {
        String str = this.f6678id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return b0.a(new StringBuilder("VerifyInviteCodeResponseModel(id="), this.f6678id, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyInviteCodeResponseModel(String str, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : str);
    }
}
