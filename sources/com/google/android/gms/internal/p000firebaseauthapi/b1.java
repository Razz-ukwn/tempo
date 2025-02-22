package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b1  reason: invalid package */
public final class b1 implements n {
    public String B;

    /* renamed from: a  reason: collision with root package name */
    public String f4410a;

    /* renamed from: b  reason: collision with root package name */
    public String f4411b;

    /* renamed from: c  reason: collision with root package name */
    public long f4412c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4413d;

    /* renamed from: e  reason: collision with root package name */
    public String f4414e;

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4410a = f.a(jSONObject.optString("idToken", (String) null));
            this.f4411b = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f4412c = jSONObject.optLong("expiresIn", 0);
            f.a(jSONObject.optString("localId", (String) null));
            this.f4413d = jSONObject.optBoolean("isNewUser", false);
            this.f4414e = f.a(jSONObject.optString("temporaryProof", (String) null));
            this.B = f.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "b1", str);
        }
    }
}
