package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import t.r1;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r0  reason: invalid package */
public final class r0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public r1 f4849a;

    /* renamed from: b  reason: collision with root package name */
    public String f4850b;

    /* renamed from: c  reason: collision with root package name */
    public String f4851c;

    /* renamed from: d  reason: collision with root package name */
    public long f4852d;

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f.a(jSONObject.optString("email", (String) null));
            f.a(jSONObject.optString("passwordHash", (String) null));
            jSONObject.optBoolean("emailVerified", false);
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.f4849a = r1.d(jSONObject.optJSONArray("providerUserInfo"));
            this.f4850b = f.a(jSONObject.optString("idToken", (String) null));
            this.f4851c = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f4852d = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "r0", str);
        }
    }
}
