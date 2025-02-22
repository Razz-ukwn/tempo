package r9;

import ag.m;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.oh;
import org.json.JSONException;
import org.json.JSONObject;
import u6.q;

public final class s extends p {
    public static final Parcelable.Creator<s> CREATOR = new b0();

    /* renamed from: a  reason: collision with root package name */
    public final String f14148a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14149b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14150c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14151d;

    public s(long j10, String str, String str2, String str3) {
        q.f(str);
        this.f14148a = str;
        this.f14149b = str2;
        this.f14150c = j10;
        q.f(str3);
        this.f14151d = str3;
    }

    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f14148a);
            jSONObject.putOpt("displayName", this.f14149b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f14150c));
            jSONObject.putOpt("phoneNumber", this.f14151d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new oh(e10);
        }
    }

    @SuppressLint({"FirebaseUnknownNullness"})
    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 1, this.f14148a);
        m.n(parcel, 2, this.f14149b);
        m.k(parcel, 3, this.f14150c);
        m.n(parcel, 4, this.f14151d);
        m.E(parcel, s10);
    }
}
