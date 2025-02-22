package com.google.android.play.core.integrity;

import b2.c;

final class f extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f6275a;

    public /* synthetic */ f(String str, e eVar) {
        this.f6275a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.f6275a.equals(((IntegrityTokenResponse) obj).token());
        }
        return false;
    }

    public final int hashCode() {
        return this.f6275a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return c.a("IntegrityTokenResponse{token=", this.f6275a, "}");
    }

    public final String token() {
        return this.f6275a;
    }
}
