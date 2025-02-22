package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l0  reason: invalid package */
public final class l0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public String f4697a;

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            this.f4697a = f.a(new JSONObject(str).optString("recaptchaKey"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "l0", str);
        }
    }
}
