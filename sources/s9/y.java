package s9;

import android.content.Context;
import android.content.SharedPreferences;
import u6.q;
import x6.a;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f14875a;

    /* renamed from: b  reason: collision with root package name */
    public final a f14876b = new a("StorageHelpers", new String[0]);

    public y(Context context, String str) {
        q.i(context);
        q.f(str);
        this.f14875a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{str}), 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r15v6, types: [r9.d0] */
    /* JADX WARNING: type inference failed for: r15v7, types: [r9.s] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        android.util.Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        throw new com.google.android.gms.internal.p000firebaseauthapi.oh(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0171, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0177, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0178, code lost:
        android.util.Log.wtf(r26.f14876b.f16968a, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9 A[SYNTHETIC, Splitter:B:33:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0171 A[ExcHandler: oh | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s9.p0 a(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "userMultiFactorInfo"
            java.lang.String r2 = "userMetadata"
            r3 = 0
            java.lang.String r4 = "cachedTokenState"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r5 = "applicationName"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r6 = "anonymous"
            boolean r6 = r0.getBoolean(r6)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r7 = "2"
            java.lang.String r8 = "version"
            java.lang.String r8 = r0.getString(r8)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r8 == 0) goto L_0x0024
            r7 = r8
        L_0x0024:
            java.lang.String r8 = "userInfos"
            org.json.JSONArray r8 = r0.getJSONArray(r8)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            int r9 = r8.length()     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r12 = 0
        L_0x0034:
            java.lang.String r13 = "phoneNumber"
            java.lang.String r14 = "displayName"
            if (r12 >= r9) goto L_0x008a
            java.lang.String r15 = r8.getString(r12)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r11.<init>(r15)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r15 = "userId"
            java.lang.String r18 = r11.optString(r15)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r15 = "providerId"
            java.lang.String r19 = r11.optString(r15)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r15 = "email"
            java.lang.String r20 = r11.optString(r15)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r21 = r11.optString(r13)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r22 = r11.optString(r14)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r13 = "photoUrl"
            java.lang.String r23 = r11.optString(r13)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r13 = "isEmailVerified"
            boolean r24 = r11.optBoolean(r13)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r13 = "rawUserInfo"
            java.lang.String r25 = r11.optString(r13)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            s9.m0 r11 = new s9.m0     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x007c, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r10.add(r11)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            int r12 = r12 + 1
            goto L_0x0034
        L_0x007c:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to unpack UserInfo from JSON"
            android.util.Log.d(r1, r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            com.google.android.gms.internal.firebase-auth-api.oh r1 = new com.google.android.gms.internal.firebase-auth-api.oh     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            throw r1     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x008a:
            m9.f r5 = m9.f.e(r5)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            s9.p0 r8 = new s9.p0     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r8.<init>(r5, r10)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r5 != 0) goto L_0x009f
            com.google.android.gms.internal.firebase-auth-api.m0 r4 = com.google.android.gms.internal.p000firebaseauthapi.m0.w(r4)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r8.f14857a = r4     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x009f:
            if (r6 != 0) goto L_0x00a5
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r8.D = r4     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x00a5:
            r8.C = r7     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            boolean r4 = r0.has(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r4 == 0) goto L_0x00cb
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r2 != 0) goto L_0x00b4
            goto L_0x00c6
        L_0x00b4:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r2.getLong(r4)     // Catch:{ JSONException -> 0x00c6, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r6 = "creationTimestamp"
            long r6 = r2.getLong(r6)     // Catch:{ JSONException -> 0x00c6, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            s9.d r2 = new s9.d     // Catch:{ JSONException -> 0x00c6, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r2.<init>(r4, r6)     // Catch:{ JSONException -> 0x00c6, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            goto L_0x00c7
        L_0x00c6:
            r2 = r3
        L_0x00c7:
            if (r2 == 0) goto L_0x00cb
            r8.E = r2     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x00cb:
            boolean r2 = r0.has(r1)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r2 == 0) goto L_0x0170
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r0 == 0) goto L_0x0170
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r1.<init>()     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r11 = 0
        L_0x00dd:
            int r2 = r0.length()     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r11 >= r2) goto L_0x016d
            java.lang.String r2 = r0.getString(r11)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r2 = "factorIdKey"
            java.lang.String r2 = r4.optString(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r5 = "phone"
            boolean r5 = r5.equals(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r6 = "uid"
            java.lang.String r7 = "enrollmentTimestamp"
            if (r5 == 0) goto L_0x0123
            boolean r2 = r4.has(r7)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r2 == 0) goto L_0x011b
            java.lang.String r18 = r4.optString(r6)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r19 = r4.optString(r14)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            long r16 = r4.optLong(r7)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r20 = r4.optString(r13)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r9.s r2 = new r9.s     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r15 = r2
            r15.<init>(r16, r18, r19, r20)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            goto L_0x0157
        L_0x011b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            throw r0     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x0123:
            java.lang.String r5 = "totp"
            if (r2 == r5) goto L_0x0132
            if (r2 == 0) goto L_0x0130
            boolean r2 = r2.equals(r5)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r2 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r2 = r3
            goto L_0x0157
        L_0x0132:
            boolean r2 = r4.has(r7)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r2 == 0) goto L_0x0165
            long r18 = r4.optLong(r7)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r2 = "totpInfo"
            java.lang.Object r2 = r4.opt(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            if (r2 == 0) goto L_0x015d
            com.google.android.gms.internal.firebase-auth-api.t0 r20 = new com.google.android.gms.internal.firebase-auth-api.t0     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r20.<init>()     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r16 = r4.optString(r6)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r17 = r4.optString(r14)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r9.d0 r2 = new r9.d0     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            r15 = r2
            r15.<init>(r16, r17, r18, r20)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x0157:
            r1.add(r2)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            int r11 = r11 + 1
            goto L_0x00dd
        L_0x015d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r1 = "A totpInfo is required to build a TotpMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            throw r0     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x0165:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
            throw r0     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x016d:
            r8.I(r1)     // Catch:{ JSONException -> 0x0177, ArrayIndexOutOfBoundsException -> 0x0175, IllegalArgumentException -> 0x0173, oh -> 0x0171 }
        L_0x0170:
            return r8
        L_0x0171:
            r0 = move-exception
            goto L_0x0178
        L_0x0173:
            r0 = move-exception
            goto L_0x0178
        L_0x0175:
            r0 = move-exception
            goto L_0x0178
        L_0x0177:
            r0 = move-exception
        L_0x0178:
            r1 = r26
            x6.a r2 = r1.f14876b
            java.lang.String r2 = r2.f16968a
            android.util.Log.wtf(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.y.a(org.json.JSONObject):s9.p0");
    }
}
