package com.quickkonnect.silencio.models.response.auth;

import s0.b0;
import sf.e;
import sf.j;

public final class NickNameSuggestion {
    public static final int $stable = 0;
    private final String suggestion;

    public NickNameSuggestion() {
        this((String) null, 1, (e) null);
    }

    public NickNameSuggestion(String str) {
        this.suggestion = str;
    }

    public static /* synthetic */ NickNameSuggestion copy$default(NickNameSuggestion nickNameSuggestion, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = nickNameSuggestion.suggestion;
        }
        return nickNameSuggestion.copy(str);
    }

    public final String component1() {
        return this.suggestion;
    }

    public final NickNameSuggestion copy(String str) {
        return new NickNameSuggestion(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NickNameSuggestion) && j.a(this.suggestion, ((NickNameSuggestion) obj).suggestion);
    }

    public final String getSuggestion() {
        return this.suggestion;
    }

    public int hashCode() {
        String str = this.suggestion;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return b0.a(new StringBuilder("NickNameSuggestion(suggestion="), this.suggestion, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NickNameSuggestion(String str, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : str);
    }
}
