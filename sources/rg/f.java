package rg;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import jg.w;
import rg.h;
import sf.j;

public final class f extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f14270c;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0.intValue() >= 9) goto L_0x0023;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x000a
            r0 = 0
            goto L_0x000e
        L_0x000a:
            java.lang.Integer r0 = zf.i.p0(r0)
        L_0x000e:
            r1 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L_0x0024
            goto L_0x0023
        L_0x001a:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0024 }
            r0.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x0024 }
        L_0x0023:
            r1 = 1
        L_0x0024:
            f14270c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.f.<clinit>():void");
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        j.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = h.a.a(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            String g10 = sSLSocket.getApplicationProtocol();
            if (g10 == null ? true : j.a(g10, "")) {
                return null;
            }
            return g10;
        } catch (UnsupportedOperationException unused) {
        }
    }
}
