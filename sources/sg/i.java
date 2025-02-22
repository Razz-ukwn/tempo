package sg;

import java.util.List;
import javax.net.ssl.SSLSocket;
import jg.w;
import org.conscrypt.Conscrypt;
import rg.d;
import rg.h;
import sg.j;

public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14976a = new a();

    public static final class a implements j.a {
        public final boolean a(SSLSocket sSLSocket) {
            boolean z10 = d.f14259d;
            return d.a.b() && Conscrypt.isConscrypt(sSLSocket);
        }

        public final k b(SSLSocket sSLSocket) {
            return new i();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final boolean b() {
        boolean z10 = d.f14259d;
        return d.f14259d;
    }

    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        sf.j.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            h hVar = h.f14273a;
            Object[] array = h.a.a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
