package ba;

import ba.b0;

public final class c extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3441a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3442b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3443c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3444d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3445e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3446f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3447g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3448h;

    /* renamed from: i  reason: collision with root package name */
    public final c0<b0.a.C0041a> f3449i;

    public static final class a extends b0.a.b {

        /* renamed from: a  reason: collision with root package name */
        public Integer f3450a;

        /* renamed from: b  reason: collision with root package name */
        public String f3451b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f3452c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f3453d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3454e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3455f;

        /* renamed from: g  reason: collision with root package name */
        public Long f3456g;

        /* renamed from: h  reason: collision with root package name */
        public String f3457h;

        /* renamed from: i  reason: collision with root package name */
        public c0<b0.a.C0041a> f3458i;

        public final c a() {
            String str = this.f3450a == null ? " pid" : "";
            if (this.f3451b == null) {
                str = str.concat(" processName");
            }
            if (this.f3452c == null) {
                str = h4.a.c(str, " reasonCode");
            }
            if (this.f3453d == null) {
                str = h4.a.c(str, " importance");
            }
            if (this.f3454e == null) {
                str = h4.a.c(str, " pss");
            }
            if (this.f3455f == null) {
                str = h4.a.c(str, " rss");
            }
            if (this.f3456g == null) {
                str = h4.a.c(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f3450a.intValue(), this.f3451b, this.f3452c.intValue(), this.f3453d.intValue(), this.f3454e.longValue(), this.f3455f.longValue(), this.f3456g.longValue(), this.f3457h, this.f3458i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public c() {
        throw null;
    }

    public c(int i8, String str, int i10, int i11, long j10, long j11, long j12, String str2, c0 c0Var) {
        this.f3441a = i8;
        this.f3442b = str;
        this.f3443c = i10;
        this.f3444d = i11;
        this.f3445e = j10;
        this.f3446f = j11;
        this.f3447g = j12;
        this.f3448h = str2;
        this.f3449i = c0Var;
    }

    public final c0<b0.a.C0041a> a() {
        return this.f3449i;
    }

    public final int b() {
        return this.f3444d;
    }

    public final int c() {
        return this.f3441a;
    }

    public final String d() {
        return this.f3442b;
    }

    public final long e() {
        return this.f3445e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a)) {
            return false;
        }
        b0.a aVar = (b0.a) obj;
        if (this.f3441a == aVar.c() && this.f3442b.equals(aVar.d()) && this.f3443c == aVar.f() && this.f3444d == aVar.b() && this.f3445e == aVar.e() && this.f3446f == aVar.g() && this.f3447g == aVar.h() && ((str = this.f3448h) != null ? str.equals(aVar.i()) : aVar.i() == null)) {
            c0<b0.a.C0041a> c0Var = this.f3449i;
            if (c0Var == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (c0Var.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f3443c;
    }

    public final long g() {
        return this.f3446f;
    }

    public final long h() {
        return this.f3447g;
    }

    public final int hashCode() {
        long j10 = this.f3445e;
        long j11 = this.f3446f;
        long j12 = this.f3447g;
        int hashCode = (((((((((((((this.f3441a ^ 1000003) * 1000003) ^ this.f3442b.hashCode()) * 1000003) ^ this.f3443c) * 1000003) ^ this.f3444d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i8 = 0;
        String str = this.f3448h;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        c0<b0.a.C0041a> c0Var = this.f3449i;
        if (c0Var != null) {
            i8 = c0Var.hashCode();
        }
        return hashCode2 ^ i8;
    }

    public final String i() {
        return this.f3448h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f3441a + ", processName=" + this.f3442b + ", reasonCode=" + this.f3443c + ", importance=" + this.f3444d + ", pss=" + this.f3445e + ", rss=" + this.f3446f + ", timestamp=" + this.f3447g + ", traceFile=" + this.f3448h + ", buildIdMappingForArch=" + this.f3449i + "}";
    }
}
