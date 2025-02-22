package q6;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final /* synthetic */ class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f12885a = new c();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).f4174b.compareTo(((Scope) obj2).f4174b);
    }
}
