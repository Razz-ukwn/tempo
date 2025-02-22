package ba;

import ba.b0;

public final class t extends b0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f3570a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3571b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3572c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3573d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3574e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3575f;

    public static final class a extends b0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f3576a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f3577b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f3578c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f3579d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3580e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3581f;

        public final t a() {
            String str = this.f3577b == null ? " batteryVelocity" : "";
            if (this.f3578c == null) {
                str = str.concat(" proximityOn");
            }
            if (this.f3579d == null) {
                str = h4.a.c(str, " orientation");
            }
            if (this.f3580e == null) {
                str = h4.a.c(str, " ramUsed");
            }
            if (this.f3581f == null) {
                str = h4.a.c(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new t(this.f3576a, this.f3577b.intValue(), this.f3578c.booleanValue(), this.f3579d.intValue(), this.f3580e.longValue(), this.f3581f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public t(Double d10, int i8, boolean z10, int i10, long j10, long j11) {
        this.f3570a = d10;
        this.f3571b = i8;
        this.f3572c = z10;
        this.f3573d = i10;
        this.f3574e = j10;
        this.f3575f = j11;
    }

    public final Double a() {
        return this.f3570a;
    }

    public final int b() {
        return this.f3571b;
    }

    public final long c() {
        return this.f3575f;
    }

    public final int d() {
        return this.f3573d;
    }

    public final long e() {
        return this.f3574e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.c)) {
            return false;
        }
        b0.e.d.c cVar = (b0.e.d.c) obj;
        Double d10 = this.f3570a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f3571b == cVar.b() && this.f3572c == cVar.f() && this.f3573d == cVar.d() && this.f3574e == cVar.e() && this.f3575f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f3572c;
    }

    public final int hashCode() {
        Double d10 = this.f3570a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f3571b) * 1000003;
        int i8 = this.f3572c ? 1231 : 1237;
        long j10 = this.f3574e;
        long j11 = this.f3575f;
        return ((((((hashCode ^ i8) * 1000003) ^ this.f3573d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f3570a + ", batteryVelocity=" + this.f3571b + ", proximityOn=" + this.f3572c + ", orientation=" + this.f3573d + ", ramUsed=" + this.f3574e + ", diskUsed=" + this.f3575f + "}";
    }
}
