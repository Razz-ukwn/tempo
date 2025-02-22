package e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import e5.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l5.f;
import l5.g;
import l5.l;

public final class o {

    /* renamed from: d  reason: collision with root package name */
    public static volatile o f7826d;

    /* renamed from: a  reason: collision with root package name */
    public final c f7827a;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f7828b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f7829c;

    public class a implements g<ConnectivityManager> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7830a;

        public a(Context context) {
            this.f7830a = context;
        }

        public final Object get() {
            return (ConnectivityManager) this.f7830a.getSystemService("connectivity");
        }
    }

    public class b implements b.a {
        public b() {
        }

        public final void a(boolean z10) {
            ArrayList arrayList;
            synchronized (o.this) {
                arrayList = new ArrayList(o.this.f7828b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7832a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f7833b;

        /* renamed from: c  reason: collision with root package name */
        public final g<ConnectivityManager> f7834c;

        /* renamed from: d  reason: collision with root package name */
        public final a f7835d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            public final void onAvailable(Network network) {
                l.e().post(new p(this, true));
            }

            public final void onLost(Network network) {
                l.e().post(new p(this, false));
            }
        }

        public c(f fVar, b bVar) {
            this.f7834c = fVar;
            this.f7833b = bVar;
        }
    }

    public o(Context context) {
        this.f7827a = new c(new f(new a(context)), new b());
    }

    public static o a(Context context) {
        if (f7826d == null) {
            synchronized (o.class) {
                if (f7826d == null) {
                    f7826d = new o(context.getApplicationContext());
                }
            }
        }
        return f7826d;
    }

    public final void b() {
        if (!this.f7829c && !this.f7828b.isEmpty()) {
            c cVar = this.f7827a;
            g<ConnectivityManager> gVar = cVar.f7834c;
            boolean z10 = true;
            cVar.f7832a = gVar.get().getActiveNetwork() != null;
            try {
                gVar.get().registerDefaultNetworkCallback(cVar.f7835d);
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                z10 = false;
            }
            this.f7829c = z10;
        }
    }
}
