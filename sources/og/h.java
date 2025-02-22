package og;

import ff.m;
import gf.q;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import jg.a;
import jg.c0;
import jg.d0;
import jg.f;
import jg.r;
import jg.s;
import jg.v;
import jg.x;
import ng.b;
import ng.d;
import ng.i;
import sf.j;
import ug.c;

public final class h implements s {

    /* renamed from: a  reason: collision with root package name */
    public final v f12377a;

    public h(v vVar) {
        j.f(vVar, "client");
        this.f12377a = vVar;
    }

    public static int d(c0 c0Var, int i8) {
        String d10 = c0.d(c0Var, "Retry-After");
        if (d10 == null) {
            return i8;
        }
        Pattern compile = Pattern.compile("\\d+");
        j.e(compile, "compile(pattern)");
        if (!compile.matcher(d10).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(d10);
        j.e(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    public final c0 a(f fVar) {
        int i8;
        List list;
        f fVar2;
        c cVar;
        SSLSocketFactory sSLSocketFactory;
        f fVar3 = fVar;
        x xVar = fVar3.f12369e;
        d dVar = fVar3.f12365a;
        boolean z10 = true;
        List list2 = gf.s.f8978a;
        int i10 = 0;
        c0 c0Var = null;
        x xVar2 = xVar;
        boolean z11 = true;
        while (true) {
            dVar.getClass();
            j.f(xVar2, "request");
            if (dVar.H == null ? z10 : false) {
                synchronized (dVar) {
                    if (!(dVar.J ^ z10)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    } else if (dVar.I ^ z10) {
                        m mVar = m.f8717a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (z11) {
                    i iVar = dVar.f11950d;
                    r rVar = xVar2.f10219a;
                    boolean z12 = rVar.f10162j;
                    v vVar = dVar.f11947a;
                    if (z12) {
                        SSLSocketFactory sSLSocketFactory2 = vVar.K;
                        if (sSLSocketFactory2 != null) {
                            c cVar2 = vVar.O;
                            fVar2 = vVar.P;
                            sSLSocketFactory = sSLSocketFactory2;
                            cVar = cVar2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        cVar = null;
                        fVar2 = null;
                    }
                    list = list2;
                    i8 = i10;
                    dVar.E = new ng.c(iVar, new a(rVar.f10156d, rVar.f10157e, vVar.G, vVar.J, sSLSocketFactory, cVar, fVar2, vVar.I, vVar.N, vVar.M, vVar.H), dVar, dVar.f11951e);
                } else {
                    list = list2;
                    i8 = i10;
                }
                try {
                    if (!dVar.L) {
                        c0 c3 = fVar3.c(xVar2);
                        if (c0Var != null) {
                            c0.a aVar = new c0.a(c3);
                            c0.a aVar2 = new c0.a(c0Var);
                            aVar2.f10062g = null;
                            c0 a10 = aVar2.a();
                            if (a10.C == null) {
                                aVar.f10065j = a10;
                                c3 = aVar.a();
                            } else {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                        }
                        c0Var = c3;
                        b bVar = dVar.H;
                        xVar2 = b(c0Var, bVar);
                        if (xVar2 == null) {
                            if (bVar != null && bVar.f11927e) {
                                if (!dVar.G) {
                                    dVar.G = true;
                                    dVar.B.i();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            dVar.h(false);
                            return c0Var;
                        }
                        d0 d0Var = c0Var.C;
                        if (d0Var != null) {
                            kg.b.d(d0Var);
                        }
                        i10 = i8 + 1;
                        if (i10 <= 20) {
                            dVar.h(true);
                            list2 = list;
                            z11 = true;
                            z10 = true;
                        } else {
                            throw new ProtocolException(j.k(Integer.valueOf(i10), "Too many follow-up requests: "));
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (ng.j e10) {
                    List list3 = list;
                    ng.j jVar = e10;
                    if (c(jVar.f11984b, dVar, xVar2, false)) {
                        list2 = q.H0(list3, jVar.f11983a);
                        dVar.h(true);
                        z10 = true;
                        z11 = false;
                        i10 = i8;
                    } else {
                        IOException iOException = jVar.f11983a;
                        kg.b.A(iOException, list3);
                        throw iOException;
                    }
                } catch (IOException e11) {
                    IOException iOException2 = e11;
                    if (c(iOException2, dVar, xVar2, !(iOException2 instanceof qg.a))) {
                        list2 = q.H0(list, iOException2);
                        dVar.h(true);
                        z10 = true;
                        i10 = i8;
                        z11 = false;
                    } else {
                        kg.b.A(iOException2, list);
                        throw iOException2;
                    }
                } catch (Throwable th) {
                    dVar.h(true);
                    throw th;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r12.f11928f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jg.x b(jg.c0 r11, ng.b r12) {
        /*
            r10 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0004
            goto L_0x0008
        L_0x0004:
            ng.e r1 = r12.f11928f
            if (r1 != 0) goto L_0x000a
        L_0x0008:
            r1 = r0
            goto L_0x000c
        L_0x000a:
            jg.f0 r1 = r1.f11957b
        L_0x000c:
            int r2 = r11.f10054d
            jg.x r3 = r11.f10051a
            java.lang.String r3 = r3.f10220b
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b2
            if (r2 == r5) goto L_0x00b2
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00aa
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0081
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L_0x006b
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L_0x004e
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L_0x0034
            switch(r2) {
                case 300: goto L_0x00b2;
                case 301: goto L_0x00b2;
                case 302: goto L_0x00b2;
                case 303: goto L_0x00b2;
                default: goto L_0x0033;
            }
        L_0x0033:
            return r0
        L_0x0034:
            jg.v r1 = r10.f12377a
            boolean r1 = r1.B
            if (r1 != 0) goto L_0x003b
            return r0
        L_0x003b:
            jg.c0 r1 = r11.F
            if (r1 == 0) goto L_0x0044
            int r1 = r1.f10054d
            if (r1 != r12) goto L_0x0044
            return r0
        L_0x0044:
            int r12 = d(r11, r4)
            if (r12 <= 0) goto L_0x004b
            return r0
        L_0x004b:
            jg.x r11 = r11.f10051a
            return r11
        L_0x004e:
            sf.j.c(r1)
            java.net.Proxy r11 = r1.f10080b
            java.net.Proxy$Type r11 = r11.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.HTTP
            if (r11 != r12) goto L_0x0063
            jg.v r11 = r10.f12377a
            cb.c r11 = r11.I
            r11.getClass()
            return r0
        L_0x0063:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r12)
            throw r11
        L_0x006b:
            jg.c0 r1 = r11.F
            if (r1 == 0) goto L_0x0074
            int r1 = r1.f10054d
            if (r1 != r12) goto L_0x0074
            return r0
        L_0x0074:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = d(r11, r12)
            if (r12 != 0) goto L_0x0080
            jg.x r11 = r11.f10051a
            return r11
        L_0x0080:
            return r0
        L_0x0081:
            if (r12 == 0) goto L_0x00a9
            ng.c r1 = r12.f11925c
            jg.a r1 = r1.f11938b
            jg.r r1 = r1.f10023i
            java.lang.String r1 = r1.f10156d
            ng.e r2 = r12.f11928f
            jg.f0 r2 = r2.f11957b
            jg.a r2 = r2.f10079a
            jg.r r2 = r2.f10023i
            java.lang.String r2 = r2.f10156d
            boolean r1 = sf.j.a(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            ng.e r12 = r12.f11928f
            monitor-enter(r12)
            r12.f11966k = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r12)
            jg.x r11 = r11.f10051a
            return r11
        L_0x00a6:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x00a9:
            return r0
        L_0x00aa:
            jg.v r11 = r10.f12377a
            cb.c r11 = r11.C
            r11.getClass()
            return r0
        L_0x00b2:
            jg.v r12 = r10.f12377a
            boolean r1 = r12.D
            if (r1 != 0) goto L_0x00ba
            goto L_0x0150
        L_0x00ba:
            java.lang.String r1 = "Location"
            java.lang.String r1 = jg.c0.d(r11, r1)
            if (r1 != 0) goto L_0x00c4
            goto L_0x0150
        L_0x00c4:
            jg.x r2 = r11.f10051a
            jg.r r8 = r2.f10219a
            r8.getClass()
            jg.r$a r9 = new jg.r$a     // Catch:{ IllegalArgumentException -> 0x00d4 }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x00d4 }
            r9.d(r8, r1)     // Catch:{ IllegalArgumentException -> 0x00d4 }
            goto L_0x00d5
        L_0x00d4:
            r9 = r0
        L_0x00d5:
            if (r9 != 0) goto L_0x00d9
            r1 = r0
            goto L_0x00dd
        L_0x00d9:
            jg.r r1 = r9.a()
        L_0x00dd:
            if (r1 != 0) goto L_0x00e1
            goto L_0x0150
        L_0x00e1:
            jg.r r8 = r2.f10219a
            java.lang.String r8 = r8.f10153a
            java.lang.String r9 = r1.f10153a
            boolean r8 = sf.j.a(r9, r8)
            if (r8 != 0) goto L_0x00f2
            boolean r12 = r12.E
            if (r12 != 0) goto L_0x00f2
            goto L_0x0150
        L_0x00f2:
            jg.x$a r12 = new jg.x$a
            r12.<init>(r2)
            boolean r8 = androidx.databinding.a.k(r3)
            if (r8 == 0) goto L_0x013b
            java.lang.String r8 = "PROPFIND"
            boolean r9 = sf.j.a(r3, r8)
            int r11 = r11.f10054d
            if (r9 != 0) goto L_0x010b
            if (r11 == r5) goto L_0x010b
            if (r11 != r6) goto L_0x010c
        L_0x010b:
            r4 = r7
        L_0x010c:
            boolean r8 = sf.j.a(r3, r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x011d
            if (r11 == r5) goto L_0x011d
            if (r11 == r6) goto L_0x011d
            java.lang.String r11 = "GET"
            r12.d(r11, r0)
            goto L_0x0124
        L_0x011d:
            if (r4 == 0) goto L_0x0121
            jg.b0 r0 = r2.f10222d
        L_0x0121:
            r12.d(r3, r0)
        L_0x0124:
            if (r4 != 0) goto L_0x013b
            java.lang.String r11 = "Transfer-Encoding"
            jg.q$a r0 = r12.f10227c
            r0.d(r11)
            java.lang.String r11 = "Content-Length"
            jg.q$a r0 = r12.f10227c
            r0.d(r11)
            java.lang.String r11 = "Content-Type"
            jg.q$a r0 = r12.f10227c
            r0.d(r11)
        L_0x013b:
            jg.r r11 = r2.f10219a
            boolean r11 = kg.b.a(r11, r1)
            if (r11 != 0) goto L_0x014a
            java.lang.String r11 = "Authorization"
            jg.q$a r0 = r12.f10227c
            r0.d(r11)
        L_0x014a:
            r12.f10225a = r1
            jg.x r0 = r12.a()
        L_0x0150:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: og.h.b(jg.c0, ng.b):jg.x");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.io.IOException r3, ng.d r4, jg.x r5, boolean r6) {
        /*
            r2 = this;
            jg.v r5 = r2.f12377a
            boolean r5 = r5.B
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            if (r6 == 0) goto L_0x000f
            boolean r5 = r3 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto L_0x000f
            return r0
        L_0x000f:
            boolean r5 = r3 instanceof java.net.ProtocolException
            r1 = 1
            if (r5 == 0) goto L_0x0015
            goto L_0x0031
        L_0x0015:
            boolean r5 = r3 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L_0x0020
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L_0x0031
            if (r6 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0020:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x002d
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L_0x0033
        L_0x0031:
            r3 = r0
            goto L_0x0034
        L_0x0033:
            r3 = r1
        L_0x0034:
            if (r3 != 0) goto L_0x0037
            return r0
        L_0x0037:
            ng.c r3 = r4.E
            sf.j.c(r3)
            int r4 = r3.f11943g
            if (r4 != 0) goto L_0x004b
            int r5 = r3.f11944h
            if (r5 != 0) goto L_0x004b
            int r5 = r3.f11945i
            if (r5 != 0) goto L_0x004b
            r3 = r0
            goto L_0x00a3
        L_0x004b:
            jg.f0 r5 = r3.f11946j
            if (r5 == 0) goto L_0x0050
            goto L_0x009d
        L_0x0050:
            if (r4 > r1) goto L_0x0082
            int r4 = r3.f11944h
            if (r4 > r1) goto L_0x0082
            int r4 = r3.f11945i
            if (r4 <= 0) goto L_0x005b
            goto L_0x0082
        L_0x005b:
            ng.d r4 = r3.f11939c
            ng.e r4 = r4.F
            if (r4 != 0) goto L_0x0062
            goto L_0x0082
        L_0x0062:
            monitor-enter(r4)
            int r5 = r4.f11967l     // Catch:{ all -> 0x007f }
            if (r5 == 0) goto L_0x0069
            monitor-exit(r4)
            goto L_0x0082
        L_0x0069:
            jg.f0 r5 = r4.f11957b     // Catch:{ all -> 0x007f }
            jg.a r5 = r5.f10079a     // Catch:{ all -> 0x007f }
            jg.r r5 = r5.f10023i     // Catch:{ all -> 0x007f }
            jg.a r6 = r3.f11938b     // Catch:{ all -> 0x007f }
            jg.r r6 = r6.f10023i     // Catch:{ all -> 0x007f }
            boolean r5 = kg.b.a(r5, r6)     // Catch:{ all -> 0x007f }
            if (r5 != 0) goto L_0x007b
            monitor-exit(r4)
            goto L_0x0082
        L_0x007b:
            jg.f0 r5 = r4.f11957b     // Catch:{ all -> 0x007f }
            monitor-exit(r4)
            goto L_0x0083
        L_0x007f:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L_0x0082:
            r5 = 0
        L_0x0083:
            if (r5 == 0) goto L_0x0088
            r3.f11946j = r5
            goto L_0x009d
        L_0x0088:
            ng.k$a r4 = r3.f11941e
            if (r4 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            boolean r4 = r4.a()
            if (r4 != r1) goto L_0x0095
            r4 = r1
            goto L_0x0096
        L_0x0095:
            r4 = r0
        L_0x0096:
            if (r4 == 0) goto L_0x0099
            goto L_0x009d
        L_0x0099:
            ng.k r3 = r3.f11942f
            if (r3 != 0) goto L_0x009f
        L_0x009d:
            r3 = r1
            goto L_0x00a3
        L_0x009f:
            boolean r3 = r3.a()
        L_0x00a3:
            if (r3 != 0) goto L_0x00a6
            return r0
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: og.h.c(java.io.IOException, ng.d, jg.x, boolean):boolean");
    }
}
