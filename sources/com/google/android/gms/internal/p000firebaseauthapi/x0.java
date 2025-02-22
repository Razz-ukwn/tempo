package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import r9.g0;
import u6.q;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x0  reason: invalid package */
public final class x0 implements n {
    public String B;
    public String C;
    public boolean D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public ArrayList K;
    public String L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5057a;

    /* renamed from: b  reason: collision with root package name */
    public String f5058b;

    /* renamed from: c  reason: collision with root package name */
    public String f5059c;

    /* renamed from: d  reason: collision with root package name */
    public long f5060d;

    /* renamed from: e  reason: collision with root package name */
    public String f5061e;

    public final g0 a() {
        if (TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.F)) {
            return null;
        }
        String str = this.B;
        String str2 = this.F;
        String str3 = this.E;
        String str4 = this.I;
        String str5 = this.G;
        q.g("Must specify a non-empty providerId", str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new g0(str, str2, str3, (v0) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5057a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f5058b = f.a(jSONObject.optString("idToken", (String) null));
            this.f5059c = f.a(jSONObject.optString("refreshToken", (String) null));
            this.f5060d = jSONObject.optLong("expiresIn", 0);
            f.a(jSONObject.optString("localId", (String) null));
            this.f5061e = f.a(jSONObject.optString("email", (String) null));
            f.a(jSONObject.optString("displayName", (String) null));
            f.a(jSONObject.optString("photoUrl", (String) null));
            this.B = f.a(jSONObject.optString("providerId", (String) null));
            this.C = f.a(jSONObject.optString("rawUserInfo", (String) null));
            this.D = jSONObject.optBoolean("isNewUser", false);
            this.E = jSONObject.optString("oauthAccessToken", (String) null);
            this.F = jSONObject.optString("oauthIdToken", (String) null);
            this.H = f.a(jSONObject.optString("errorMessage", (String) null));
            this.I = f.a(jSONObject.optString("pendingToken", (String) null));
            this.J = f.a(jSONObject.optString("tenantId", (String) null));
            this.K = o0.a(jSONObject.optJSONArray("mfaInfo"));
            this.L = f.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.G = f.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "x0", str);
        }
    }
}
