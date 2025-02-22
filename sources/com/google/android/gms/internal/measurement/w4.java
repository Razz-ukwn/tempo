package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class w4 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f5567a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5568b;

    public w4(Uri uri, boolean z10, boolean z11) {
        this.f5567a = uri;
        this.f5568b = z10;
    }

    public final s4 a(String str, long j10) {
        return new s4(this, str, Long.valueOf(j10));
    }

    public final v4 b(String str, String str2) {
        return new v4(this, str, str2);
    }

    public final t4 c(String str, boolean z10) {
        return new t4(this, str, Boolean.valueOf(z10));
    }
}
