package com.google.android.gms.common.api;

import t6.d;

public final class j extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    public final d f4346a;

    public j(d dVar) {
        this.f4346a = dVar;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f4346a));
    }
}
