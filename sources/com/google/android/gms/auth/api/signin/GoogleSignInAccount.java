package com.google.android.gms.auth.api.signin;

import ag.m;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b3.x;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import q6.d;
import u6.q;
import v6.a;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();
    public final Uri B;
    public String C;
    public final long D;
    public final String E;
    public final List F;
    public final String G;
    public final String H;
    public final HashSet I = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final int f4147a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4148b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4149c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4150d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4151e;

    public GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4147a = i8;
        this.f4148b = str;
        this.f4149c = str2;
        this.f4150d = str3;
        this.f4151e = str4;
        this.B = uri;
        this.C = str5;
        this.D = j10;
        this.E = str6;
        this.F = arrayList;
        this.G = str7;
        this.H = str8;
    }

    public static GoogleSignInAccount x(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(1, jSONArray.getString(i8)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        q.f(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.C = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.E.equals(this.E) && googleSignInAccount.w().equals(w());
    }

    public final int hashCode() {
        return w().hashCode() + x.a(this.E, 527, 31);
    }

    public final HashSet w() {
        HashSet hashSet = new HashSet(this.F);
        hashSet.addAll(this.I);
        return hashSet;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f4147a);
        m.n(parcel, 2, this.f4148b);
        m.n(parcel, 3, this.f4149c);
        m.n(parcel, 4, this.f4150d);
        m.n(parcel, 5, this.f4151e);
        m.m(parcel, 6, this.B, i8);
        m.n(parcel, 7, this.C);
        m.k(parcel, 8, this.D);
        m.n(parcel, 9, this.E);
        m.q(parcel, 10, this.F);
        m.n(parcel, 11, this.G);
        m.n(parcel, 12, this.H);
        m.E(parcel, s10);
    }
}
