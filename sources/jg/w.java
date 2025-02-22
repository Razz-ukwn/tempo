package jg;

import java.io.IOException;
import sf.j;

public enum w {
    f10214b("http/1.0"),
    f10215c("http/1.1"),
    f10216d("spdy/3.1"),
    f10217e("h2"),
    B("h2_prior_knowledge"),
    C("quic");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f10218a;

    public static final class a {
        public static w a(String str) {
            if (j.a(str, "http/1.0")) {
                return w.f10214b;
            }
            if (j.a(str, "http/1.1")) {
                return w.f10215c;
            }
            if (j.a(str, "h2_prior_knowledge")) {
                return w.B;
            }
            if (j.a(str, "h2")) {
                return w.f10217e;
            }
            if (j.a(str, "spdy/3.1")) {
                return w.f10216d;
            }
            if (j.a(str, "quic")) {
                return w.C;
            }
            throw new IOException(j.k(str, "Unexpected protocol: "));
        }
    }

    /* access modifiers changed from: public */
    w(String str) {
        this.f10218a = str;
    }

    public final String toString() {
        return this.f10218a;
    }
}
