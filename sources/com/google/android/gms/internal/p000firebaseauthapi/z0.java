package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z0  reason: invalid package */
public final class z0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public String f5114a;

    /* renamed from: b  reason: collision with root package name */
    public String f5115b;

    /* renamed from: c  reason: collision with root package name */
    public long f5116c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f5117d;

    /* renamed from: e  reason: collision with root package name */
    public String f5118e;

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f.a(jSONObject.optString("localId", (String) null));
            f.a(jSONObject.optString("email", (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            this.f5114a = f.a(jSONObject.optString("idToken", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.f5115b = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f5116c = jSONObject.optLong("expiresIn", 0);
            this.f5117d = o0.a(jSONObject.optJSONArray("mfaInfo"));
            this.f5118e = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "z0", str);
        }
    }
}
