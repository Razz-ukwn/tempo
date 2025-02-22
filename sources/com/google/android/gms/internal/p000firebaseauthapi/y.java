package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import u6.q;
import z6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y  reason: invalid package */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final String f5084a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5085b;

    public y(Context context, String str) {
        q.f(str);
        this.f5084a = str;
        try {
            byte[] a10 = a.a(context, str);
            if (a10 == null) {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f5085b = null;
                return;
            }
            this.f5085b = gf.d(a10);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f5085b = null;
        }
    }
}
