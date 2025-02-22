package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

final class m implements IntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final t f6283a;

    public m(t tVar) {
        this.f6283a = tVar;
    }

    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f6283a.b(integrityTokenRequest);
    }
}
