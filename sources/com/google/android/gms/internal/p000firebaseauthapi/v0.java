package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.g;
import org.json.JSONObject;
import u6.q;
import v6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v0  reason: invalid package */
public final class v0 extends a implements m {
    public static final Parcelable.Creator<v0> CREATOR = new w0();
    public final String B;
    public final String C;
    public final String D;
    public final boolean E;
    public boolean F;
    public final String G;
    public final String H;
    public final String I;
    public String J;
    public boolean K;
    public final String L;

    /* renamed from: a  reason: collision with root package name */
    public final String f5001a;

    /* renamed from: b  reason: collision with root package name */
    public String f5002b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5003c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5004d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5005e;

    public v0() {
        this.E = true;
        this.F = true;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 2, this.f5001a);
        m.n(parcel, 3, this.f5002b);
        m.n(parcel, 4, this.f5003c);
        m.n(parcel, 5, this.f5004d);
        m.n(parcel, 6, this.f5005e);
        m.n(parcel, 7, this.B);
        m.n(parcel, 8, this.C);
        m.n(parcel, 9, this.D);
        m.g(parcel, 10, this.E);
        m.g(parcel, 11, this.F);
        m.n(parcel, 12, this.G);
        m.n(parcel, 13, this.H);
        m.n(parcel, 14, this.I);
        m.n(parcel, 15, this.J);
        m.g(parcel, 16, this.K);
        m.n(parcel, 17, this.L);
        m.E(parcel, s10);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.F);
        jSONObject.put("returnSecureToken", this.E);
        String str = this.f5002b;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.C;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.J;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.L;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        String str5 = this.H;
        if (!TextUtils.isEmpty(str5)) {
            jSONObject.put("sessionId", str5);
        }
        String str6 = this.I;
        if (!TextUtils.isEmpty(str6)) {
            jSONObject.put("requestUri", str6);
        } else {
            String str7 = this.f5001a;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        }
        jSONObject.put("returnIdpCredential", this.K);
        return jSONObject.toString();
    }

    public v0(e6 e6Var, String str) {
        q.i(e6Var);
        String str2 = (String) e6Var.f4510a;
        q.f(str2);
        this.H = str2;
        q.f(str);
        this.I = str;
        String str3 = (String) e6Var.f4512c;
        q.f(str3);
        this.f5005e = str3;
        this.E = true;
        this.C = "providerId=".concat(String.valueOf(str3));
    }

    public v0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f5001a = "http://localhost";
        this.f5003c = str;
        this.f5004d = str2;
        this.D = str4;
        this.G = str5;
        this.J = str6;
        this.L = str7;
        this.E = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str5)) {
            q.f(str3);
            this.f5005e = str3;
            this.B = null;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb2.append("id_token=");
                sb2.append(str);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append("access_token=");
                sb2.append(str2);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append("identifier=null&");
            }
            if (!TextUtils.isEmpty(str4)) {
                sb2.append("oauth_token_secret=");
                sb2.append(str4);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str5)) {
                sb2.append("code=");
                sb2.append(str5);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str8)) {
                sb2.append("nonce=");
                sb2.append(str8);
                sb2.append("&");
            }
            this.C = g.a(sb2, "providerId=", str3);
            this.F = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    public v0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.f5001a = str;
        this.f5002b = str2;
        this.f5003c = str3;
        this.f5004d = str4;
        this.f5005e = str5;
        this.B = str6;
        this.C = str7;
        this.D = str8;
        this.E = z10;
        this.F = z11;
        this.G = str9;
        this.H = str10;
        this.I = str11;
        this.J = str12;
        this.K = z12;
        this.L = str13;
    }
}
