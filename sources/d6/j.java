package d6;

import a6.d;
import d6.s;
import java.util.Arrays;

public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f7342a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7343b;

    /* renamed from: c  reason: collision with root package name */
    public final d f7344c;

    public static final class a extends s.a {

        /* renamed from: a  reason: collision with root package name */
        public String f7345a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f7346b;

        /* renamed from: c  reason: collision with root package name */
        public d f7347c;

        public final j a() {
            String str = this.f7345a == null ? " backendName" : "";
            if (this.f7347c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new j(this.f7345a, this.f7346b, this.f7347c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f7345a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(d dVar) {
            if (dVar != null) {
                this.f7347c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, d dVar) {
        this.f7342a = str;
        this.f7343b = bArr;
        this.f7344c = dVar;
    }

    public final String b() {
        return this.f7342a;
    }

    public final byte[] c() {
        return this.f7343b;
    }

    public final d d() {
        return this.f7344c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f7342a.equals(sVar.b())) {
            if (Arrays.equals(this.f7343b, sVar instanceof j ? ((j) sVar).f7343b : sVar.c()) && this.f7344c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7342a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7343b)) * 1000003) ^ this.f7344c.hashCode();
    }
}
