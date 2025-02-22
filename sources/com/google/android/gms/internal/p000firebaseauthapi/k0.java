package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k0  reason: invalid package */
public final class k0 implements m {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f4674a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4675b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4676c;

    public /* synthetic */ k0() {
        this.f4674a = new ArrayList();
        this.f4675b = uc.f4995b;
        this.f4676c = null;
    }

    public /* synthetic */ k0(String str) {
        this.f4674a = str;
        this.f4675b = "CLIENT_TYPE_ANDROID";
        this.f4676c = "RECAPTCHA_ENTERPRISE";
    }

    public final xc a() {
        if (((ArrayList) this.f4674a) != null) {
            Integer num = (Integer) this.f4676c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = (ArrayList) this.f4674a;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    int i10 = ((wc) arrayList.get(i8)).f5052b;
                    i8++;
                    if (i10 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            xc xcVar = new xc((uc) this.f4675b, Collections.unmodifiableList((ArrayList) this.f4674a), (Integer) this.f4676c);
            this.f4674a = null;
            return xcVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty((String) this.f4674a)) {
            jSONObject.put("tenantId", (String) this.f4674a);
        }
        if (!TextUtils.isEmpty((String) this.f4675b)) {
            jSONObject.put("clientType", (String) this.f4675b);
        }
        if (!TextUtils.isEmpty((String) this.f4676c)) {
            jSONObject.put("recaptchaVersion", (String) this.f4676c);
        }
        return jSONObject.toString();
    }
}
