package com.google.android.recaptcha;

import b2.c;
import sf.e;
import sf.j;

public final class RecaptchaAction {
    public static final Companion Companion = new Companion((e) null);
    public static final RecaptchaAction LOGIN = new RecaptchaAction("login");
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    private final String action;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str, (e) null);
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    public /* synthetic */ RecaptchaAction(String str, e eVar) {
        this(str);
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    public static final RecaptchaAction custom(String str) {
        return Companion.custom(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && j.a(this.action, ((RecaptchaAction) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return c.a("RecaptchaAction(action=", this.action, ")");
    }
}
