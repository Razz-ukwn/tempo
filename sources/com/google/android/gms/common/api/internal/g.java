package com.google.android.gms.common.api.internal;

import android.app.Activity;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4262a;

    public g(Activity activity) {
        if (activity != null) {
            this.f4262a = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }
}
