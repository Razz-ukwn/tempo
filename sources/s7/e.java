package s7;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r0;
import h7.b;
import h7.c;
import s6.n;

public abstract class e extends b implements f {
    public e() {
        super(0, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean L(int i8, Parcel parcel, Parcel parcel2) {
        switch (i8) {
            case 3:
                t6.b bVar = (t6.b) c.a(parcel, t6.b.CREATOR);
                b bVar2 = (b) c.a(parcel, b.CREATOR);
                c.b(parcel);
                break;
            case 4:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                c.b(parcel);
                break;
            case 6:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                c.b(parcel);
                break;
            case 7:
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                c.b(parcel);
                break;
            case 8:
                c.b(parcel);
                r0 r0Var = (r0) this;
                r0Var.f4324c.post(new n((Object) r0Var, (Object) (l) c.a(parcel, l.CREATOR), 1));
                break;
            case 9:
                h hVar = (h) c.a(parcel, h.CREATOR);
                c.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
