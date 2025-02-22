package s9;

import ag.m;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.h0;
import com.google.android.gms.internal.p000firebaseauthapi.oh;
import com.google.android.gms.internal.p000firebaseauthapi.p0;
import org.json.JSONException;
import org.json.JSONObject;
import r9.v;
import u6.q;
import v6.a;

public final class m0 extends a implements v {
    public static final Parcelable.Creator<m0> CREATOR = new n0();
    public final String B;
    public final boolean C;
    public final String D;

    /* renamed from: a  reason: collision with root package name */
    public final String f14848a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14849b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14850c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14851d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14852e;

    public m0(h0 h0Var) {
        q.i(h0Var);
        q.f("firebase");
        String str = h0Var.f4592a;
        q.f(str);
        this.f14848a = str;
        this.f14849b = "firebase";
        this.f14852e = h0Var.f4593b;
        this.f14850c = h0Var.f4595d;
        Uri parse = !TextUtils.isEmpty(h0Var.f4596e) ? Uri.parse(h0Var.f4596e) : null;
        if (parse != null) {
            this.f14851d = parse.toString();
        }
        this.C = h0Var.f4594c;
        this.D = null;
        this.B = h0Var.f4598g;
    }

    public final String a() {
        return this.f14849b;
    }

    public final String w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f14848a);
            jSONObject.putOpt("providerId", this.f14849b);
            jSONObject.putOpt("displayName", this.f14850c);
            jSONObject.putOpt("photoUrl", this.f14851d);
            jSONObject.putOpt("email", this.f14852e);
            jSONObject.putOpt("phoneNumber", this.B);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.C));
            jSONObject.putOpt("rawUserInfo", this.D);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new oh(e10);
        }
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14848a);
        m.n(parcel, 2, this.f14849b);
        m.n(parcel, 3, this.f14850c);
        m.n(parcel, 4, this.f14851d);
        m.n(parcel, 5, this.f14852e);
        m.n(parcel, 6, this.B);
        m.g(parcel, 7, this.C);
        m.n(parcel, 8, this.D);
        m.E(parcel, s10);
    }

    public m0(p0 p0Var) {
        q.i(p0Var);
        this.f14848a = p0Var.f4796a;
        String str = p0Var.f4799d;
        q.f(str);
        this.f14849b = str;
        this.f14850c = p0Var.f4797b;
        String str2 = p0Var.f4798c;
        Uri parse = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
        if (parse != null) {
            this.f14851d = parse.toString();
        }
        this.f14852e = p0Var.f4802g;
        this.B = p0Var.f4801f;
        this.C = false;
        this.D = p0Var.f4800e;
    }

    public m0(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f14848a = str;
        this.f14849b = str2;
        this.f14852e = str3;
        this.B = str4;
        this.f14850c = str5;
        this.f14851d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.C = z10;
        this.D = str7;
    }
}
