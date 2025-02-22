package jg;

import sf.j;

public enum g0 {
    f10085b("TLSv1.3"),
    f10086c("TLSv1.2"),
    f10087d("TLSv1.1"),
    f10088e("TLSv1"),
    B("SSLv3");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f10089a;

    public static final class a {
        public static g0 a(String str) {
            j.f(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return g0.f10087d;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return g0.f10086c;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return g0.f10085b;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return g0.f10088e;
                }
            } else if (str.equals("SSLv3")) {
                return g0.B;
            }
            throw new IllegalArgumentException(j.k(str, "Unexpected TLS version: "));
        }
    }

    /* access modifiers changed from: public */
    g0(String str) {
        this.f10089a = str;
    }
}
