package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import org.json.JSONObject;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y0  reason: invalid package */
public final class y0 implements m, l5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5086a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5087b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializable f5088c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5089d;

    public /* synthetic */ y0(String str, String str2, String str3, String str4) {
        q.f(str);
        this.f5086a = str;
        q.f(str2);
        this.f5087b = str2;
        this.f5088c = str3;
        this.f5089d = str4;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f5086a);
        jSONObject.put("password", (String) this.f5087b);
        jSONObject.put("returnSecureToken", true);
        String str = (String) this.f5088c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = (String) this.f5089d;
        if (str2 != null) {
            jSONObject.put("captchaResponse", str2);
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ y0(java.security.interfaces.ECPublicKey r3, byte[] r4, java.lang.String r5, com.google.android.gms.internal.p000firebaseauthapi.n9 r6) {
        /*
            r2 = this;
            r2.<init>()
            java.security.spec.ECPoint r0 = r3.getW()
            java.security.spec.ECParameterSpec r1 = r3.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.android.gms.internal.p000firebaseauthapi.ia.b(r0, r1)
            t.x2 r0 = new t.x2
            r1 = 4
            r0.<init>(r3, r1)
            r2.f5087b = r0
            r2.f5088c = r4
            r2.f5086a = r5
            r2.f5089d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.y0.<init>(java.security.interfaces.ECPublicKey, byte[], java.lang.String, com.google.android.gms.internal.firebase-auth-api.n9):void");
    }
}
