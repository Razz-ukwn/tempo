package j6;

import j6.e;
import java.util.Set;

public final class c extends e.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f9800a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9801b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<e.b> f9802c;

    public static final class a extends e.a.C0181a {

        /* renamed from: a  reason: collision with root package name */
        public Long f9803a;

        /* renamed from: b  reason: collision with root package name */
        public Long f9804b;

        /* renamed from: c  reason: collision with root package name */
        public Set<e.b> f9805c;

        public final c a() {
            String str = this.f9803a == null ? " delta" : "";
            if (this.f9804b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.f9805c == null) {
                str = h4.a.c(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f9803a.longValue(), this.f9804b.longValue(), this.f9805c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public c(long j10, long j11, Set set) {
        this.f9800a = j10;
        this.f9801b = j11;
        this.f9802c = set;
    }

    public final long a() {
        return this.f9800a;
    }

    public final Set<e.b> b() {
        return this.f9802c;
    }

    public final long c() {
        return this.f9801b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f9800a == aVar.a() && this.f9801b == aVar.c() && this.f9802c.equals(aVar.b());
    }

    public final int hashCode() {
        long j10 = this.f9800a;
        long j11 = this.f9801b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f9802c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f9800a + ", maxAllowedDelay=" + this.f9801b + ", flags=" + this.f9802c + "}";
    }
}
