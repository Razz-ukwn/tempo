package com.google.android.gms.auth.api.signin.internal;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r6.t;
import u6.q;
import v6.a;

public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f4169a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInOptions f4170b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        q.f(str);
        this.f4169a = str;
        this.f4170b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f4169a.equals(signInConfiguration.f4169a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f4170b;
            GoogleSignInOptions googleSignInOptions2 = this.f4170b;
            if (googleSignInOptions2 != null) {
                return googleSignInOptions2.equals(googleSignInOptions);
            }
            if (googleSignInOptions == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        int i8 = 1 * 31;
        int i10 = 0;
        String str = this.f4169a;
        int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f4170b;
        if (googleSignInOptions != null) {
            i10 = googleSignInOptions.hashCode();
        }
        return hashCode + i10;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.n(parcel, 2, this.f4169a);
        m.m(parcel, 5, this.f4170b, i8);
        m.E(parcel, s10);
    }
}
