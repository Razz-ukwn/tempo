package q6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Status f12883a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInAccount f12884b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f12884b = googleSignInAccount;
        this.f12883a = status;
    }

    public final Status p() {
        return this.f12883a;
    }
}
