package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.widget.l;

public final class g0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f4263a;

    /* renamed from: b  reason: collision with root package name */
    public final l f4264b;

    public g0(l lVar) {
        this.f4264b = lVar;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(str)) {
            ((c1) this.f4264b.f1059c).getClass();
            throw null;
        }
    }
}
