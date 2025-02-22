package jg;

import java.util.Comparator;
import java.util.LinkedHashMap;
import sf.j;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final b f10090b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f10091c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f10092d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final h f10093e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f10094f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f10095g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f10096h;

    /* renamed from: i  reason: collision with root package name */
    public static final h f10097i;

    /* renamed from: j  reason: collision with root package name */
    public static final h f10098j;

    /* renamed from: k  reason: collision with root package name */
    public static final h f10099k;

    /* renamed from: l  reason: collision with root package name */
    public static final h f10100l;
    public static final h m;

    /* renamed from: n  reason: collision with root package name */
    public static final h f10101n;

    /* renamed from: o  reason: collision with root package name */
    public static final h f10102o;

    /* renamed from: p  reason: collision with root package name */
    public static final h f10103p;

    /* renamed from: q  reason: collision with root package name */
    public static final h f10104q;

    /* renamed from: r  reason: collision with root package name */
    public static final h f10105r;

    /* renamed from: s  reason: collision with root package name */
    public static final h f10106s;

    /* renamed from: t  reason: collision with root package name */
    public static final h f10107t;

    /* renamed from: a  reason: collision with root package name */
    public final String f10108a;

    public static final class a implements Comparator<String> {
        public final int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            j.f(str, "a");
            j.f(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i8 = 4;
            while (true) {
                if (i8 < min) {
                    char charAt = str.charAt(i8);
                    char charAt2 = str2.charAt(i8);
                    if (charAt == charAt2) {
                        i8++;
                    } else if (j.h(charAt, charAt2) >= 0) {
                        return 1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length >= length2) {
                        return 1;
                    }
                }
            }
            return -1;
        }
    }

    public static final class b {
        public static final h a(b bVar, String str) {
            h hVar = new h(str);
            h.f10092d.put(str, hVar);
            return hVar;
        }

        public final synchronized h b(String str) {
            h hVar;
            String str2;
            j.f(str, "javaName");
            LinkedHashMap linkedHashMap = h.f10092d;
            hVar = (h) linkedHashMap.get(str);
            if (hVar == null) {
                if (zf.j.x0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    j.e(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = j.k(substring, "SSL_");
                } else if (zf.j.x0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    j.e(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = j.k(substring2, "TLS_");
                } else {
                    str2 = str;
                }
                hVar = (h) linkedHashMap.get(str2);
                if (hVar == null) {
                    hVar = new h(str);
                }
                linkedHashMap.put(str, hVar);
            }
            return hVar;
        }
    }

    static {
        b bVar = new b();
        f10090b = bVar;
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f10093e = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f10094f = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f10095g = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f10096h = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f10097i = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b.a(bVar, "TLS_FALLBACK_SCSV");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f10098j = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f10099k = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f10100l = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f10101n = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f10102o = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f10103p = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f10104q = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f10105r = b.a(bVar, "TLS_AES_128_GCM_SHA256");
        f10106s = b.a(bVar, "TLS_AES_256_GCM_SHA384");
        f10107t = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public h(String str) {
        this.f10108a = str;
    }

    public final String toString() {
        return this.f10108a;
    }
}
