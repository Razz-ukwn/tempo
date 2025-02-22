package r9;

import ag.m;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.oh;
import com.google.android.gms.internal.p000firebaseauthapi.t0;
import org.json.JSONException;
import org.json.JSONObject;
import u6.q;

public final class d0 extends p {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14119a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14120b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14121c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f14122d;

    public d0(String str, String str2, long j10, t0 t0Var) {
        q.f(str);
        this.f14119a = str;
        this.f14120b = str2;
        this.f14121c = j10;
        if (t0Var != null) {
            this.f14122d = t0Var;
            return;
        }
        throw new NullPointerException("totpInfo cannot not be null.");
    }

    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f14119a);
            jSONObject.putOpt("displayName", this.f14120b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f14121c));
            jSONObject.putOpt("totpInfo", this.f14122d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new oh(e10);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14119a);
        m.n(parcel, 2, this.f14120b);
        m.k(parcel, 3, this.f14121c);
        m.m(parcel, 4, this.f14122d, i8);
        m.E(parcel, s10);
    }
}
