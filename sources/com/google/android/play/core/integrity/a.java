package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

final class a extends IntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f6270a;

    /* renamed from: b  reason: collision with root package name */
    private Long f6271b;

    public final IntegrityTokenRequest build() {
        String str = this.f6270a;
        if (str != null) {
            return new c(str, this.f6271b, (b) null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f6271b = Long.valueOf(j10);
        return this;
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f6270a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}
