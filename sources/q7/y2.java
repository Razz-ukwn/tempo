package q7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class y2 extends n6 {
    public /* synthetic */ y2(t6 t6Var, int i8) {
        super(t6Var);
    }

    public final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((x3) this.f13121a).f13419a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
