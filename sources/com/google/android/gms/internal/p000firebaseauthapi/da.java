package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.da  reason: invalid package */
public final class da {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4488c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final i5 f4489a;

    /* renamed from: b  reason: collision with root package name */
    public final x5 f4490b;

    public da(ca caVar) {
        Context context = caVar.f4461a;
        String str = caVar.f4462b;
        String str2 = caVar.f4463c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f4489a = caVar.f4465e;
            this.f4490b = caVar.f4467g;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
