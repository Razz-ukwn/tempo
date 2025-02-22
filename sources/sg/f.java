package sg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jg.w;
import rg.b;
import rg.h;
import sf.j;
import zf.a;

public class f implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final e f14966f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super SSLSocket> f14967a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f14968b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f14969c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f14970d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f14971e;

    public f(Class<? super SSLSocket> cls) {
        this.f14967a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        j.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f14968b = declaredMethod;
        this.f14969c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f14970d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f14971e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f14967a.isInstance(sSLSocket);
    }

    public final boolean b() {
        boolean z10 = b.f14252e;
        return b.f14252e;
    }

    public final String c(SSLSocket sSLSocket) {
        if (!this.f14967a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f14970d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, a.f17962b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && j.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        j.f(list, "protocols");
        if (this.f14967a.isInstance(sSLSocket)) {
            try {
                this.f14968b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f14969c.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.f14971e;
                h hVar = h.f14273a;
                method.invoke(sSLSocket, new Object[]{h.a.b(list)});
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
