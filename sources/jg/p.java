package jg;

import ff.j;
import gf.m;
import gf.s;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import sf.k;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f10144a;

    /* renamed from: b  reason: collision with root package name */
    public final h f10145b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f10146c;

    /* renamed from: d  reason: collision with root package name */
    public final j f10147d;

    public static final class a {

        /* renamed from: jg.p$a$a  reason: collision with other inner class name */
        public static final class C0184a extends k implements rf.a<List<? extends Certificate>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f10148a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0184a(List<? extends Certificate> list) {
                super(0);
                this.f10148a = list;
            }

            public final Object d() {
                return this.f10148a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static jg.p a(javax.net.ssl.SSLSession r5) {
            /*
                gf.s r0 = gf.s.f8978a
                java.lang.String r1 = r5.getCipherSuite()
                if (r1 == 0) goto L_0x007d
                java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
                boolean r2 = sf.j.a(r1, r2)
                if (r2 == 0) goto L_0x0012
                r2 = 1
                goto L_0x0018
            L_0x0012:
                java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
                boolean r2 = sf.j.a(r1, r2)
            L_0x0018:
                if (r2 != 0) goto L_0x0071
                jg.h$b r2 = jg.h.f10090b
                jg.h r1 = r2.b(r1)
                java.lang.String r2 = r5.getProtocol()
                if (r2 == 0) goto L_0x0065
                java.lang.String r3 = "NONE"
                boolean r3 = sf.j.a(r3, r2)
                if (r3 != 0) goto L_0x005d
                jg.g0 r2 = jg.g0.a.a(r2)
                java.security.cert.Certificate[] r3 = r5.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
                if (r3 == 0) goto L_0x0042
                int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
                java.util.List r3 = kg.b.l(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
                goto L_0x0043
            L_0x0042:
                r3 = r0
            L_0x0043:
                jg.p r4 = new jg.p
                java.security.cert.Certificate[] r5 = r5.getLocalCertificates()
                if (r5 == 0) goto L_0x0054
                int r0 = r5.length
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
                java.util.List r0 = kg.b.l(r5)
            L_0x0054:
                jg.p$a$a r5 = new jg.p$a$a
                r5.<init>(r3)
                r4.<init>(r2, r1, r0, r5)
                return r4
            L_0x005d:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "tlsVersion == NONE"
                r5.<init>(r0)
                throw r5
            L_0x0065:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "tlsVersion == null"
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L_0x0071:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "cipherSuite == "
                java.lang.String r0 = sf.j.k(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x007d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "cipherSuite == null"
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.p.a.a(javax.net.ssl.SSLSession):jg.p");
        }
    }

    public static final class b extends k implements rf.a<List<? extends Certificate>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a<List<Certificate>> f10149a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(rf.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f10149a = aVar;
        }

        public final Object d() {
            try {
                return this.f10149a.d();
            } catch (SSLPeerUnverifiedException unused) {
                return s.f8978a;
            }
        }
    }

    public p(g0 g0Var, h hVar, List<? extends Certificate> list, rf.a<? extends List<? extends Certificate>> aVar) {
        sf.j.f(g0Var, "tlsVersion");
        sf.j.f(hVar, "cipherSuite");
        sf.j.f(list, "localCertificates");
        this.f10144a = g0Var;
        this.f10145b = hVar;
        this.f10146c = list;
        this.f10147d = b7.a.x(new b(aVar));
    }

    public final List<Certificate> a() {
        return (List) this.f10147d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return pVar.f10144a == this.f10144a && sf.j.a(pVar.f10145b, this.f10145b) && sf.j.a(pVar.a(), a()) && sf.j.a(pVar.f10146c, this.f10146c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f10145b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f10146c.hashCode() + ((hashCode2 + ((hashCode + ((this.f10144a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        Iterable<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(m.n0(a10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                sf.j.e(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f10144a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f10145b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        Iterable<Certificate> iterable = this.f10146c;
        ArrayList arrayList2 = new ArrayList(m.n0(iterable));
        for (Certificate certificate2 : iterable) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                sf.j.e(str, "type");
            }
            arrayList2.add(str);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
