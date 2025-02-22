package com.quickkonnect.silencio.models.response;

import sf.e;
import sf.j;

public final class UpdateCheckData {
    public static final int $stable = 0;
    private final Boolean isForceUpdate;

    public UpdateCheckData() {
        this((Boolean) null, 1, (e) null);
    }

    public UpdateCheckData(Boolean bool) {
        this.isForceUpdate = bool;
    }

    public static /* synthetic */ UpdateCheckData copy$default(UpdateCheckData updateCheckData, Boolean bool, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bool = updateCheckData.isForceUpdate;
        }
        return updateCheckData.copy(bool);
    }

    public final Boolean component1() {
        return this.isForceUpdate;
    }

    public final UpdateCheckData copy(Boolean bool) {
        return new UpdateCheckData(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateCheckData) && j.a(this.isForceUpdate, ((UpdateCheckData) obj).isForceUpdate);
    }

    public int hashCode() {
        Boolean bool = this.isForceUpdate;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    public String toString() {
        return "UpdateCheckData(isForceUpdate=" + this.isForceUpdate + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateCheckData(Boolean bool, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : bool);
    }
}
