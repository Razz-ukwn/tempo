package r6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import g7.b;
import g7.d;

public abstract class p extends b implements q {
    public p() {
        super(0, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean a(int i8, Parcel parcel, Parcel parcel2) {
        switch (i8) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) d.a(parcel, Status.CREATOR);
                d.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                d.b(parcel);
                B((Status) d.a(parcel, Status.CREATOR));
                break;
            case 103:
                d.b(parcel);
                w((Status) d.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
