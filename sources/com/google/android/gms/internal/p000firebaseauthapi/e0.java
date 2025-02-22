package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import org.json.JSONObject;
import r9.a;
import r9.c;
import u6.i;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e0  reason: invalid package */
public final class e0 implements m {

    /* renamed from: a  reason: collision with root package name */
    public final String f4500a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4501b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4502c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4503d;

    static {
        String simpleName = e0.class.getSimpleName();
        if (r3 != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : new String[0]) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        new i(simpleName, (String) null);
        int i8 = 2;
        while (i8 <= 7 && !Log.isLoggable(simpleName, i8)) {
            i8++;
        }
    }

    public e0(c cVar, String str, String str2) {
        String str3 = cVar.f14113a;
        q.f(str3);
        this.f4500a = str3;
        String str4 = cVar.f14115c;
        q.f(str4);
        this.f4501b = str4;
        this.f4502c = str;
        this.f4503d = str2;
    }

    public final String zza() {
        a aVar;
        int i8 = a.f14110c;
        String str = this.f4501b;
        q.f(str);
        String str2 = null;
        try {
            aVar = new a(str);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        String str3 = aVar != null ? aVar.f14111a : null;
        if (aVar != null) {
            str2 = aVar.f14112b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f4500a);
        if (str3 != null) {
            jSONObject.put("oobCode", str3);
        }
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str4 = this.f4502c;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.f4503d;
        if (str5 != null) {
            jSONObject.put("captchaResp", str5);
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
