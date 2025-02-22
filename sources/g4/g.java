package g4;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import g4.f;
import sf.j;

@SuppressLint({"MissingPermission"})
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f8852a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f8853b;

    /* renamed from: c  reason: collision with root package name */
    public final a f8854c;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f8855a;

        public a(g gVar) {
            this.f8855a = gVar;
        }

        public final void onAvailable(Network network) {
            g.a(this.f8855a, network, true);
        }

        public final void onLost(Network network) {
            g.a(this.f8855a, network, false);
        }
    }

    public g(ConnectivityManager connectivityManager, f.a aVar) {
        this.f8852a = connectivityManager;
        this.f8853b = aVar;
        a aVar2 = new a(this);
        this.f8854c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    public static final void a(g gVar, Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = gVar.f8852a.getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            Network network2 = allNetworks[i8];
            if (j.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = gVar.f8852a.getNetworkCapabilities(network2);
                z11 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z11) {
                z12 = true;
                break;
            }
            i8++;
        }
        gVar.f8853b.a(z12);
    }

    public final boolean b() {
        ConnectivityManager connectivityManager = this.f8852a;
        for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
            if (networkCapabilities2 != null && networkCapabilities2.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public final void shutdown() {
        this.f8852a.unregisterNetworkCallback(this.f8854c);
    }
}
