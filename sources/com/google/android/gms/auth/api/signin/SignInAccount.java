package com.google.android.gms.auth.api.signin;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q6.g;
import u6.q;
import v6.a;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final String f4166a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInAccount f4167b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final String f4168c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f4167b = googleSignInAccount;
        q.g("8.3 and 8.4 SDKs require non-null email", str);
        this.f4166a = str;
        q.g("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f4168c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 4, this.f4166a);
        m.m(parcel, 7, this.f4167b, i8);
        m.n(parcel, 8, this.f4168c);
        m.E(parcel, s10);
    }
}
