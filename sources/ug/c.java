package ug;

import androidx.appcompat.widget.a1;
import d.a;
import gf.s;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import sf.j;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16035a = new c();

    public static List a(X509Certificate x509Certificate, int i8) {
        s sVar = s.f8978a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return sVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (j.a(next.get(0), Integer.valueOf(i8))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return sVar;
        }
    }

    public static boolean b(String str) {
        int i8;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j10 = 0;
                int i10 = 0;
                while (i10 < length2) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i8 = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i8 = 3;
                        } else {
                            int i11 = i10 + 1;
                            char charAt2 = i11 < length2 ? str.charAt(i11) : 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j10++;
                                i10 = i11;
                            } else {
                                j10 += (long) 4;
                                i10 += 2;
                            }
                        }
                        j10 += (long) i8;
                    }
                    i10++;
                }
                return length == ((int) j10);
            }
            StringBuilder b10 = a1.b("endIndex > string.length: ", length2, " > ");
            b10.append(str.length());
            throw new IllegalArgumentException(b10.toString().toString());
        }
        throw new IllegalArgumentException(a.a("endIndex < beginIndex: ", length2, " < 0").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x014f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            java.lang.String r0 = "host"
            sf.j.f(r11, r0)
            java.lang.String r0 = "certificate"
            sf.j.f(r12, r0)
            byte[] r0 = kg.b.f10474a
            zf.c r0 = kg.b.f10479f
            r0.getClass()
            java.util.regex.Pattern r0 = r0.f17974a
            java.util.regex.Matcher r0 = r0.matcher(r11)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0055
            java.lang.String r11 = d2.f1.N(r11)
            r0 = 7
            java.util.List r12 = a(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0039
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0039
            goto L_0x0150
        L_0x0039:
            java.util.Iterator r12 = r12.iterator()
        L_0x003d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = d2.f1.N(r0)
            boolean r0 = sf.j.a(r11, r0)
            if (r0 == 0) goto L_0x003d
            goto L_0x014f
        L_0x0055:
            boolean r0 = b(r11)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "US"
            if (r0 == 0) goto L_0x006b
            java.util.Locale r0 = java.util.Locale.US
            sf.j.e(r0, r4)
            java.lang.String r11 = r11.toLowerCase(r0)
            sf.j.e(r11, r3)
        L_0x006b:
            r0 = 2
            java.util.List r12 = a(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0081
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0081
            goto L_0x0150
        L_0x0081:
            java.util.Iterator r12 = r12.iterator()
        L_0x0085:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            int r5 = r11.length()
            if (r5 != 0) goto L_0x0099
            r5 = r2
            goto L_0x009a
        L_0x0099:
            r5 = r1
        L_0x009a:
            if (r5 != 0) goto L_0x014c
            java.lang.String r5 = "."
            boolean r6 = zf.j.x0(r11, r5, r1)
            if (r6 != 0) goto L_0x014c
            java.lang.String r6 = ".."
            boolean r7 = zf.j.r0(r11, r6, r1)
            if (r7 == 0) goto L_0x00ae
            goto L_0x014c
        L_0x00ae:
            if (r0 == 0) goto L_0x00b9
            int r7 = r0.length()
            if (r7 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r7 = r1
            goto L_0x00ba
        L_0x00b9:
            r7 = r2
        L_0x00ba:
            if (r7 != 0) goto L_0x014c
            boolean r7 = zf.j.x0(r0, r5, r1)
            if (r7 != 0) goto L_0x014c
            boolean r6 = zf.j.r0(r0, r6, r1)
            if (r6 == 0) goto L_0x00ca
            goto L_0x014c
        L_0x00ca:
            boolean r6 = zf.j.r0(r11, r5, r1)
            if (r6 != 0) goto L_0x00d5
            java.lang.String r6 = sf.j.k(r5, r11)
            goto L_0x00d6
        L_0x00d5:
            r6 = r11
        L_0x00d6:
            boolean r7 = zf.j.r0(r0, r5, r1)
            if (r7 != 0) goto L_0x00e0
            java.lang.String r0 = sf.j.k(r5, r0)
        L_0x00e0:
            boolean r5 = b(r0)
            if (r5 == 0) goto L_0x00f2
            java.util.Locale r5 = java.util.Locale.US
            sf.j.e(r5, r4)
            java.lang.String r0 = r0.toLowerCase(r5)
            sf.j.e(r0, r3)
        L_0x00f2:
            java.lang.String r5 = "*"
            boolean r5 = zf.n.A0(r0, r5)
            if (r5 != 0) goto L_0x00ff
            boolean r0 = sf.j.a(r6, r0)
            goto L_0x014d
        L_0x00ff:
            java.lang.String r5 = "*."
            boolean r7 = zf.j.x0(r0, r5, r1)
            if (r7 == 0) goto L_0x014c
            r7 = 42
            r8 = 4
            int r7 = zf.n.F0(r0, r7, r2, r1, r8)
            r9 = -1
            if (r7 == r9) goto L_0x0112
            goto L_0x014c
        L_0x0112:
            int r7 = r6.length()
            int r10 = r0.length()
            if (r7 >= r10) goto L_0x011d
            goto L_0x014c
        L_0x011d:
            boolean r5 = sf.j.a(r5, r0)
            if (r5 == 0) goto L_0x0124
            goto L_0x014c
        L_0x0124:
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            sf.j.e(r0, r5)
            boolean r5 = zf.j.r0(r6, r0, r1)
            if (r5 != 0) goto L_0x0134
            goto L_0x014c
        L_0x0134:
            int r5 = r6.length()
            int r0 = r0.length()
            int r5 = r5 - r0
            if (r5 <= 0) goto L_0x014a
            int r5 = r5 + -1
            r0 = 46
            int r0 = zf.n.I0(r6, r0, r5, r8)
            if (r0 == r9) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r0 = r2
            goto L_0x014d
        L_0x014c:
            r0 = r1
        L_0x014d:
            if (r0 == 0) goto L_0x0085
        L_0x014f:
            r1 = r2
        L_0x0150:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        j.f(str, "host");
        j.f(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
