package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import b2.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d0  reason: invalid package */
public final class d0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public String f4477a;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f4477a = jSONObject.getString("message");
        } catch (NullPointerException | JSONException e10) {
            String message = e10.getMessage();
            Log.e("com.google.android.gms.internal.firebase-auth-api.d0", "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new xh(c.a("Failed to parse error for string [", str, "]"), e10);
        }
    }

    public final /* bridge */ /* synthetic */ n zza(String str) {
        a(str);
        return this;
    }
}
