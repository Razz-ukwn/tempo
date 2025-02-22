package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import v6.a;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m0  reason: invalid package */
public final class m0 extends a implements n<m0> {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: a  reason: collision with root package name */
    public String f4723a;

    /* renamed from: b  reason: collision with root package name */
    public String f4724b;

    /* renamed from: c  reason: collision with root package name */
    public Long f4725c;

    /* renamed from: d  reason: collision with root package name */
    public String f4726d;

    /* renamed from: e  reason: collision with root package name */
    public Long f4727e;

    public m0() {
        this.f4727e = Long.valueOf(System.currentTimeMillis());
    }

    public static m0 w(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            m0 m0Var = new m0();
            m0Var.f4723a = jSONObject.optString("refresh_token", (String) null);
            m0Var.f4724b = jSONObject.optString("access_token", (String) null);
            m0Var.f4725c = Long.valueOf(jSONObject.optLong("expires_in"));
            m0Var.f4726d = jSONObject.optString("token_type", (String) null);
            m0Var.f4727e = Long.valueOf(jSONObject.optLong("issued_at"));
            return m0Var;
        } catch (JSONException e10) {
            Log.d("m0", "Failed to read GetTokenResponse from JSONObject");
            throw new oh(e10);
        }
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 2, this.f4723a);
        m.n(parcel, 3, this.f4724b);
        Long l10 = this.f4725c;
        m.l(parcel, 4, Long.valueOf(l10 == null ? 0 : l10.longValue()));
        m.n(parcel, 5, this.f4726d);
        m.l(parcel, 6, Long.valueOf(this.f4727e.longValue()));
        m.E(parcel, s10);
    }

    public final String x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f4723a);
            jSONObject.put("access_token", this.f4724b);
            jSONObject.put("expires_in", this.f4725c);
            jSONObject.put("token_type", this.f4726d);
            jSONObject.put("issued_at", this.f4727e);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("m0", "Failed to convert GetTokenResponse to JSON");
            throw new oh(e10);
        }
    }

    public final boolean y() {
        return System.currentTimeMillis() + 300000 < (this.f4725c.longValue() * 1000) + this.f4727e.longValue();
    }

    public final /* bridge */ /* synthetic */ n zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4723a = f.a(jSONObject.optString("refresh_token"));
            this.f4724b = f.a(jSONObject.optString("access_token"));
            this.f4725c = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f4726d = f.a(jSONObject.optString("token_type"));
            this.f4727e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw c1.a(e10, "m0", str);
        }
    }

    public m0(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public m0(String str, String str2, Long l10, String str3, Long l11) {
        this.f4723a = str;
        this.f4724b = str2;
        this.f4725c = l10;
        this.f4726d = str3;
        this.f4727e = l11;
    }
}
