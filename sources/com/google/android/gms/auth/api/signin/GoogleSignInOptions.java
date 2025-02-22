package com.google.android.gms.auth.api.signin;

import ag.m;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import q6.e;
import q6.f;
import u6.q;

public class GoogleSignInOptions extends v6.a implements a.c, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new f();
    public static final GoogleSignInOptions H;
    public static final Scope I;
    public static final Scope J = new Scope(1, "email");
    public static final Scope K;
    public static final Scope L;
    public static final Scope M = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final e N = new e();
    public final boolean B;
    public final String C;
    public final String D;
    public final ArrayList E;
    public final String F;
    public final Map G;

    /* renamed from: a  reason: collision with root package name */
    public final int f4152a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4153b;

    /* renamed from: c  reason: collision with root package name */
    public final Account f4154c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4155d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4156e;

    static {
        Scope scope = new Scope(1, "profile");
        I = scope;
        Scope scope2 = new Scope(1, "openid");
        K = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        L = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(M)) {
            Scope scope4 = L;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        H = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(M)) {
            Scope scope5 = L;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f4152a = i8;
        this.f4153b = arrayList;
        this.f4154c = account;
        this.f4155d = z10;
        this.f4156e = z11;
        this.B = z12;
        this.C = str;
        this.D = str2;
        this.E = new ArrayList(map.values());
        this.G = map;
        this.F = str3;
    }

    public static GoogleSignInOptions w(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(1, jSONArray.getString(i8)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, optString2, str2, new HashMap(), (String) null);
    }

    public static HashMap x(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList == null) {
            return hashMap;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r6.a aVar = (r6.a) it.next();
            hashMap.put(Integer.valueOf(aVar.f14068b), aVar);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r3 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r1.equals(r3) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.C
            java.util.ArrayList r1 = r6.f4153b
            r2 = 0
            if (r7 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r7 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r7     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r3 = r6.E     // Catch:{ ClassCastException -> 0x007b }
            int r3 = r3.size()     // Catch:{ ClassCastException -> 0x007b }
            if (r3 > 0) goto L_0x007b
            java.util.ArrayList r3 = r7.E     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r4 = r7.f4153b
            int r3 = r3.size()     // Catch:{ ClassCastException -> 0x007b }
            if (r3 <= 0) goto L_0x001d
            goto L_0x007b
        L_0x001d:
            int r3 = r1.size()     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r5.<init>(r4)     // Catch:{ ClassCastException -> 0x007b }
            int r5 = r5.size()     // Catch:{ ClassCastException -> 0x007b }
            if (r3 != r5) goto L_0x007b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r3.<init>(r4)     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r1.containsAll(r3)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x0038
            goto L_0x007b
        L_0x0038:
            android.accounts.Account r1 = r6.f4154c     // Catch:{ ClassCastException -> 0x007b }
            android.accounts.Account r3 = r7.f4154c
            if (r1 != 0) goto L_0x0041
            if (r3 != 0) goto L_0x007b
            goto L_0x0047
        L_0x0041:
            boolean r1 = r1.equals(r3)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x007b
        L_0x0047:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r3 = r7.C
            if (r1 == 0) goto L_0x0056
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 == 0) goto L_0x007b
            goto L_0x005d
        L_0x0056:
            boolean r0 = r0.equals(r3)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != 0) goto L_0x005d
            goto L_0x007b
        L_0x005d:
            boolean r0 = r6.B     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r7.B     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r6.f4155d     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r7.f4155d     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r6.f4156e     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r7.f4156e     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            java.lang.String r0 = r6.F     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r7 = r7.F     // Catch:{ ClassCastException -> 0x007b }
            boolean r7 = android.text.TextUtils.equals(r0, r7)     // Catch:{ ClassCastException -> 0x007b }
            if (r7 == 0) goto L_0x007b
            r7 = 1
            return r7
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4153b;
        int size = arrayList2.size();
        int i8 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f4174b);
        }
        Collections.sort(arrayList);
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f4154c;
        int hashCode2 = (hashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.C;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.B ? 1 : 0)) * 31) + (this.f4155d ? 1 : 0)) * 31) + (this.f4156e ? 1 : 0)) * 31;
        String str2 = this.F;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return hashCode3 + i8;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f4152a);
        m.q(parcel, 2, new ArrayList(this.f4153b));
        m.m(parcel, 3, this.f4154c, i8);
        m.g(parcel, 4, this.f4155d);
        m.g(parcel, 5, this.f4156e);
        m.g(parcel, 6, this.B);
        m.n(parcel, 7, this.C);
        m.n(parcel, 8, this.D);
        m.q(parcel, 9, this.E);
        m.n(parcel, 10, this.F);
        m.E(parcel, s10);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f4157a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4158b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4159c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4160d;

        /* renamed from: e  reason: collision with root package name */
        public final String f4161e;

        /* renamed from: f  reason: collision with root package name */
        public final Account f4162f;

        /* renamed from: g  reason: collision with root package name */
        public final String f4163g;

        /* renamed from: h  reason: collision with root package name */
        public final HashMap f4164h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        public String f4165i;

        public a() {
        }

        public final GoogleSignInOptions a() {
            Scope scope = GoogleSignInOptions.M;
            HashSet hashSet = this.f4157a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.L;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.f4160d && (this.f4162f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.K);
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f4162f, this.f4160d, this.f4158b, this.f4159c, this.f4161e, this.f4163g, this.f4164h, this.f4165i);
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            q.i(googleSignInOptions);
            this.f4157a = new HashSet(googleSignInOptions.f4153b);
            this.f4158b = googleSignInOptions.f4156e;
            this.f4159c = googleSignInOptions.B;
            this.f4160d = googleSignInOptions.f4155d;
            this.f4161e = googleSignInOptions.C;
            this.f4162f = googleSignInOptions.f4154c;
            this.f4163g = googleSignInOptions.D;
            this.f4164h = GoogleSignInOptions.x(googleSignInOptions.E);
            this.f4165i = googleSignInOptions.F;
        }
    }
}
