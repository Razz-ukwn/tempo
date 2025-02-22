package u6;

import ag.m;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import v6.a;

public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a  reason: collision with root package name */
    public final int f15814a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f15815b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15816c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f15817d;

    public h0(int i8, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f15814a = i8;
        this.f15815b = account;
        this.f15816c = i10;
        this.f15817d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f15814a);
        m.m(parcel, 2, this.f15815b, i8);
        m.j(parcel, 3, this.f15816c);
        m.m(parcel, 4, this.f15817d, i8);
        m.E(parcel, s10);
    }
}
