package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o0  reason: invalid package */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f4767a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4768b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4769c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4770d;

    /* renamed from: e  reason: collision with root package name */
    public final t0 f4771e;

    public o0(String str, String str2, String str3, long j10, t0 t0Var) {
        if (TextUtils.isEmpty(str) || t0Var == null) {
            this.f4767a = str;
            q.f(str2);
            this.f4768b = str2;
            this.f4769c = str3;
            this.f4770d = j10;
            this.f4771e = t0Var;
            return;
        }
        Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
        throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    }

    public static ArrayList a(JSONArray jSONArray) {
        long j10;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            String optString = jSONObject.optString("phoneInfo", (String) null);
            String optString2 = jSONObject.optString("mfaEnrollmentId", (String) null);
            String optString3 = jSONObject.optString("displayName", (String) null);
            String replaceAll = jSONObject.optString("enrolledAt", "").replaceAll("\\.[0-9]{0,9}Z$|Z$", ".000Z");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                j10 = simpleDateFormat.parse(replaceAll).getTime();
            } catch (ParseException e10) {
                Log.w("MfaInfo", "Could not parse timestamp as ISOString", e10);
                j10 = 0;
            }
            o0 o0Var = new o0(optString, optString2, optString3, j10, jSONObject.opt("totpInfo") != null ? new t0() : null);
            jSONObject.optString("unobfuscatedPhoneInfo");
            arrayList.add(o0Var);
        }
        return arrayList;
    }
}
