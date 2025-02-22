package tg;

import cb.d;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15627a = new a();

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return d.O(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
