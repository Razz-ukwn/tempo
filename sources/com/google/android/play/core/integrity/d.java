package com.google.android.play.core.integrity;

final class d extends w {

    /* renamed from: a  reason: collision with root package name */
    private String f6274a;

    public final w a(String str) {
        this.f6274a = str;
        return this;
    }

    public final IntegrityTokenResponse b() {
        String str = this.f6274a;
        if (str != null) {
            return new f(str, (e) null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
