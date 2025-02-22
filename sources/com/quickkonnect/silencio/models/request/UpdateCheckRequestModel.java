package com.quickkonnect.silencio.models.request;

import s0.b0;
import sf.e;
import sf.j;

public final class UpdateCheckRequestModel {
    public static final int $stable = 0;
    private final String type;
    private final String version;

    public UpdateCheckRequestModel(String str, String str2) {
        j.f(str, "version");
        j.f(str2, "type");
        this.version = str;
        this.type = str2;
    }

    public static /* synthetic */ UpdateCheckRequestModel copy$default(UpdateCheckRequestModel updateCheckRequestModel, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = updateCheckRequestModel.version;
        }
        if ((i8 & 2) != 0) {
            str2 = updateCheckRequestModel.type;
        }
        return updateCheckRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.type;
    }

    public final UpdateCheckRequestModel copy(String str, String str2) {
        j.f(str, "version");
        j.f(str2, "type");
        return new UpdateCheckRequestModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCheckRequestModel)) {
            return false;
        }
        UpdateCheckRequestModel updateCheckRequestModel = (UpdateCheckRequestModel) obj;
        return j.a(this.version, updateCheckRequestModel.version) && j.a(this.type, updateCheckRequestModel.type);
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.version.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateCheckRequestModel(version=");
        sb2.append(this.version);
        sb2.append(", type=");
        return b0.a(sb2, this.type, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateCheckRequestModel(String str, String str2, int i8, e eVar) {
        this(str, (i8 & 2) != 0 ? "android" : str2);
    }
}
