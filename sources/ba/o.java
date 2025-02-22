package ba;

import androidx.activity.g;
import ba.b0;

public final class o extends b0.e.d.a.b.C0044a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3541a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3542b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3543c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3544d;

    public static final class a extends b0.e.d.a.b.C0044a.C0045a {

        /* renamed from: a  reason: collision with root package name */
        public Long f3545a;

        /* renamed from: b  reason: collision with root package name */
        public Long f3546b;

        /* renamed from: c  reason: collision with root package name */
        public String f3547c;

        /* renamed from: d  reason: collision with root package name */
        public String f3548d;

        public final o a() {
            String str = this.f3545a == null ? " baseAddress" : "";
            if (this.f3546b == null) {
                str = str.concat(" size");
            }
            if (this.f3547c == null) {
                str = h4.a.c(str, " name");
            }
            if (str.isEmpty()) {
                return new o(this.f3545a.longValue(), this.f3546b.longValue(), this.f3547c, this.f3548d);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public o(long j10, long j11, String str, String str2) {
        this.f3541a = j10;
        this.f3542b = j11;
        this.f3543c = str;
        this.f3544d = str2;
    }

    public final long a() {
        return this.f3541a;
    }

    public final String b() {
        return this.f3543c;
    }

    public final long c() {
        return this.f3542b;
    }

    public final String d() {
        return this.f3544d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.C0044a)) {
            return false;
        }
        b0.e.d.a.b.C0044a aVar = (b0.e.d.a.b.C0044a) obj;
        if (this.f3541a == aVar.a() && this.f3542b == aVar.c() && this.f3543c.equals(aVar.b())) {
            String str = this.f3544d;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3541a;
        long j11 = this.f3542b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f3543c.hashCode()) * 1000003;
        String str = this.f3544d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f3541a);
        sb2.append(", size=");
        sb2.append(this.f3542b);
        sb2.append(", name=");
        sb2.append(this.f3543c);
        sb2.append(", uuid=");
        return g.a(sb2, this.f3544d, "}");
    }
}
