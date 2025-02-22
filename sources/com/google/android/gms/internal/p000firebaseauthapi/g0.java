package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r3.s;
import t.r1;
import z6.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g0  reason: invalid package */
public final class g0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public s f4562a;

    public final /* bridge */ /* synthetic */ n zza(String str) {
        s sVar;
        JSONArray jSONArray;
        h0 h0Var;
        g0 g0Var = this;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                g0Var.f4562a = new s(3, 0);
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    try {
                        if (optJSONArray.length() != 0) {
                            ArrayList arrayList = new ArrayList(optJSONArray.length());
                            int i8 = 0;
                            while (i8 < optJSONArray.length()) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                                if (jSONObject2 == null) {
                                    h0Var = new h0();
                                    jSONArray = optJSONArray;
                                } else {
                                    String a10 = f.a(jSONObject2.optString("localId", (String) null));
                                    String a11 = f.a(jSONObject2.optString("email", (String) null));
                                    boolean optBoolean = jSONObject2.optBoolean("emailVerified", false);
                                    String a12 = f.a(jSONObject2.optString("displayName", (String) null));
                                    String a13 = f.a(jSONObject2.optString("photoUrl", (String) null));
                                    r1 d10 = r1.d(jSONObject2.optJSONArray("providerUserInfo"));
                                    f.a(jSONObject2.optString("rawPassword", (String) null));
                                    jSONArray = optJSONArray;
                                    h0Var = new h0(a10, a11, optBoolean, a12, a13, d10, f.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), o0.a(jSONObject2.optJSONArray("mfaInfo")));
                                }
                                arrayList.add(h0Var);
                                i8++;
                                optJSONArray = jSONArray;
                            }
                            sVar = new s(arrayList);
                            g0Var = this;
                            g0Var.f4562a = sVar;
                        }
                    } catch (NullPointerException | JSONException e10) {
                        e = e10;
                        throw c1.a(e, "g0", str2);
                    }
                }
                sVar = new s(new ArrayList());
                g0Var = this;
                g0Var.f4562a = sVar;
            }
            return g0Var;
        } catch (NullPointerException | JSONException e11) {
            e = e11;
            throw c1.a(e, "g0", str2);
        }
    }
}
