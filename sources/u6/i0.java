package u6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import v6.b;

public final class i0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i8 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i8 = b.j(parcel, readInt);
            } else if (c3 == 2) {
                account = (Account) b.b(parcel, readInt, Account.CREATOR);
            } else if (c3 == 3) {
                i10 = b.j(parcel, readInt);
            } else if (c3 != 4) {
                b.n(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.b(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new h0(i8, account, i10, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new h0[i8];
    }
}
