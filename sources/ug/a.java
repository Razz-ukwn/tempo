package ug;

import androidx.fragment.app.z;
import sf.j;

public final class a extends z {

    /* renamed from: b  reason: collision with root package name */
    public final d f16033b;

    public a(d dVar) {
        j.f(dVar, "trustRootIndex");
        this.f16033b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && j.a(((a) obj).f16033b, this.f16033b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0069 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List h(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = "chain"
            sf.j.f(r11, r0)
            java.lang.String r0 = "hostname"
            sf.j.f(r10, r0)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            java.util.Collection r11 = (java.util.Collection) r11
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r0 = r10.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            sf.j.e(r0, r1)
            r11.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0025:
            r3 = 9
            if (r1 >= r3) goto L_0x00bc
            int r1 = r1 + 1
            int r3 = r11.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r11.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            ug.d r5 = r9.f16033b
            java.security.cert.X509Certificate r5 = r5.a(r3)
            if (r5 == 0) goto L_0x006c
            int r2 = r11.size()
            if (r2 > r4) goto L_0x004b
            boolean r2 = sf.j.a(r3, r5)
            if (r2 != 0) goto L_0x004e
        L_0x004b:
            r11.add(r5)
        L_0x004e:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = sf.j.a(r2, r3)
            if (r2 != 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x0066 }
            r5.verify(r2)     // Catch:{ GeneralSecurityException -> 0x0066 }
            r2 = r4
            goto L_0x0067
        L_0x0066:
            r2 = r0
        L_0x0067:
            if (r2 == 0) goto L_0x006a
            return r11
        L_0x006a:
            r2 = r4
            goto L_0x0025
        L_0x006c:
            java.util.Iterator r5 = r10.iterator()
            java.lang.String r6 = "queue.iterator()"
            sf.j.e(r5, r6)
        L_0x0075:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r6 = r5.next()
            if (r6 == 0) goto L_0x00a5
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = sf.j.a(r7, r8)
            if (r7 != 0) goto L_0x0092
            goto L_0x009b
        L_0x0092:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x009b }
            r3.verify(r7)     // Catch:{ GeneralSecurityException -> 0x009b }
            r7 = r4
            goto L_0x009c
        L_0x009b:
            r7 = r0
        L_0x009c:
            if (r7 == 0) goto L_0x0075
            r5.remove()
            r11.add(r6)
            goto L_0x0025
        L_0x00a5:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        L_0x00ad:
            if (r2 == 0) goto L_0x00b0
            return r11
        L_0x00b0:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r11 = "Failed to find a trusted cert that signed "
            java.lang.String r11 = sf.j.k(r3, r11)
            r10.<init>(r11)
            throw r10
        L_0x00bc:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = "Certificate chain too long: "
            java.lang.String r11 = sf.j.k(r11, r0)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.a.h(java.lang.String, java.util.List):java.util.List");
    }

    public final int hashCode() {
        return this.f16033b.hashCode();
    }
}
