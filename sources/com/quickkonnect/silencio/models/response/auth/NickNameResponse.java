package com.quickkonnect.silencio.models.response.auth;

import bb.b;
import sf.e;
import sf.j;

public final class NickNameResponse {
    public static final int $stable = 0;
    @b("errorData")
    private final NickNameSuggestion errors;
    @b("message")
    private final String message;
    @b("status")
    private final String status;

    public NickNameResponse() {
        this((String) null, (String) null, (NickNameSuggestion) null, 7, (e) null);
    }

    public NickNameResponse(String str, String str2, NickNameSuggestion nickNameSuggestion) {
        this.message = str;
        this.status = str2;
        this.errors = nickNameSuggestion;
    }

    public static /* synthetic */ NickNameResponse copy$default(NickNameResponse nickNameResponse, String str, String str2, NickNameSuggestion nickNameSuggestion, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = nickNameResponse.message;
        }
        if ((i8 & 2) != 0) {
            str2 = nickNameResponse.status;
        }
        if ((i8 & 4) != 0) {
            nickNameSuggestion = nickNameResponse.errors;
        }
        return nickNameResponse.copy(str, str2, nickNameSuggestion);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.status;
    }

    public final NickNameSuggestion component3() {
        return this.errors;
    }

    public final NickNameResponse copy(String str, String str2, NickNameSuggestion nickNameSuggestion) {
        return new NickNameResponse(str, str2, nickNameSuggestion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NickNameResponse)) {
            return false;
        }
        NickNameResponse nickNameResponse = (NickNameResponse) obj;
        return j.a(this.message, nickNameResponse.message) && j.a(this.status, nickNameResponse.status) && j.a(this.errors, nickNameResponse.errors);
    }

    public final NickNameSuggestion getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.message;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NickNameSuggestion nickNameSuggestion = this.errors;
        if (nickNameSuggestion != null) {
            i8 = nickNameSuggestion.hashCode();
        }
        return hashCode2 + i8;
    }

    public String toString() {
        return "NickNameResponse(message=" + this.message + ", status=" + this.status + ", errors=" + this.errors + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NickNameResponse(String str, String str2, NickNameSuggestion nickNameSuggestion, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : nickNameSuggestion);
    }
}
