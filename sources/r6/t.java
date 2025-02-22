package r6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import v6.b;

public final class t implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                str = b.c(parcel, readInt);
            } else if (c3 != 5) {
                b.n(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) b.b(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new SignInConfiguration[i8];
    }
}
