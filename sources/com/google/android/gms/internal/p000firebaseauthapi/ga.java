package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.fragment.app.z0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ga  reason: invalid package */
public final class ga {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences.Editor f4576a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4577b;

    public ga(Context context, String str, String str2) {
        if (str != null) {
            this.f4577b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f4576a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.f4576a = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public final void a(ze zeVar) {
        if (!this.f4576a.putString(this.f4577b, z0.h(zeVar.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void b(ag agVar) {
        if (!this.f4576a.putString(this.f4577b, z0.h(agVar.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
