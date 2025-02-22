package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j0  reason: invalid package */
public final class j0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f4653a;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4653a = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    this.f4653a.add(optJSONArray.getString(i8));
                }
            }
        } catch (JSONException e10) {
            throw c1.a(e10, "j0", str);
        }
    }

    public final /* bridge */ /* synthetic */ n zza(String str) {
        a(str);
        return this;
    }
}
