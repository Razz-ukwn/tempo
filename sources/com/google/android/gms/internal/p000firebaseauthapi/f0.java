package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f0  reason: invalid package */
public final class f0 implements n {
    public String B;

    /* renamed from: a  reason: collision with root package name */
    public String f4530a;

    /* renamed from: b  reason: collision with root package name */
    public String f4531b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4532c;

    /* renamed from: d  reason: collision with root package name */
    public long f4533d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f4534e;

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", (String) null);
            jSONObject.optString("email", (String) null);
            this.f4530a = jSONObject.optString("idToken", (String) null);
            this.f4531b = jSONObject.optString("refreshToken", (String) null);
            this.f4532c = jSONObject.optBoolean("isNewUser", false);
            this.f4533d = jSONObject.optLong("expiresIn", 0);
            this.f4534e = o0.a(jSONObject.optJSONArray("mfaInfo"));
            this.B = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "f0", str);
        }
    }
}
