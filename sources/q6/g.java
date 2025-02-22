package q6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import v6.b;

public final class g implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 4) {
                str = b.c(parcel, readInt);
            } else if (c3 == 7) {
                googleSignInAccount = (GoogleSignInAccount) b.b(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (c3 != 8) {
                b.n(parcel, readInt);
            } else {
                str2 = b.c(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new SignInAccount[i8];
    }
}
