package com.google.android.recaptcha;

import sf.e;

public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i8, e eVar) {
        this(recaptchaErrorCode, (i8 & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }
}
