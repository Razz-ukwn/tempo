package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a1  reason: invalid package */
public final class a1 implements m {
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public String f4364a;

    /* renamed from: b  reason: collision with root package name */
    public String f4365b;

    /* renamed from: c  reason: collision with root package name */
    public String f4366c;

    /* renamed from: d  reason: collision with root package name */
    public String f4367d;

    /* renamed from: e  reason: collision with root package name */
    public String f4368e;

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f4367d)) {
            jSONObject.put("phoneNumber", this.f4364a);
            jSONObject.put("temporaryProof", this.f4367d);
        } else {
            jSONObject.put("sessionInfo", this.f4365b);
            jSONObject.put("code", this.f4366c);
        }
        String str = this.f4368e;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.B) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
