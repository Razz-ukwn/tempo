package ba;

import androidx.activity.g;
import ba.b0;

public final class k extends b0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f3498a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3499b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3500c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3501d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3502e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3503f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3504g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3505h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3506i;

    public static final class a extends b0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f3507a;

        /* renamed from: b  reason: collision with root package name */
        public String f3508b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f3509c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3510d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3511e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f3512f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f3513g;

        /* renamed from: h  reason: collision with root package name */
        public String f3514h;

        /* renamed from: i  reason: collision with root package name */
        public String f3515i;

        public final k a() {
            String str = this.f3507a == null ? " arch" : "";
            if (this.f3508b == null) {
                str = str.concat(" model");
            }
            if (this.f3509c == null) {
                str = h4.a.c(str, " cores");
            }
            if (this.f3510d == null) {
                str = h4.a.c(str, " ram");
            }
            if (this.f3511e == null) {
                str = h4.a.c(str, " diskSpace");
            }
            if (this.f3512f == null) {
                str = h4.a.c(str, " simulator");
            }
            if (this.f3513g == null) {
                str = h4.a.c(str, " state");
            }
            if (this.f3514h == null) {
                str = h4.a.c(str, " manufacturer");
            }
            if (this.f3515i == null) {
                str = h4.a.c(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new k(this.f3507a.intValue(), this.f3508b, this.f3509c.intValue(), this.f3510d.longValue(), this.f3511e.longValue(), this.f3512f.booleanValue(), this.f3513g.intValue(), this.f3514h, this.f3515i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public k(int i8, String str, int i10, long j10, long j11, boolean z10, int i11, String str2, String str3) {
        this.f3498a = i8;
        this.f3499b = str;
        this.f3500c = i10;
        this.f3501d = j10;
        this.f3502e = j11;
        this.f3503f = z10;
        this.f3504g = i11;
        this.f3505h = str2;
        this.f3506i = str3;
    }

    public final int a() {
        return this.f3498a;
    }

    public final int b() {
        return this.f3500c;
    }

    public final long c() {
        return this.f3502e;
    }

    public final String d() {
        return this.f3505h;
    }

    public final String e() {
        return this.f3499b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.c)) {
            return false;
        }
        b0.e.c cVar = (b0.e.c) obj;
        return this.f3498a == cVar.a() && this.f3499b.equals(cVar.e()) && this.f3500c == cVar.b() && this.f3501d == cVar.g() && this.f3502e == cVar.c() && this.f3503f == cVar.i() && this.f3504g == cVar.h() && this.f3505h.equals(cVar.d()) && this.f3506i.equals(cVar.f());
    }

    public final String f() {
        return this.f3506i;
    }

    public final long g() {
        return this.f3501d;
    }

    public final int h() {
        return this.f3504g;
    }

    public final int hashCode() {
        long j10 = this.f3501d;
        long j11 = this.f3502e;
        return ((((((((((((((((this.f3498a ^ 1000003) * 1000003) ^ this.f3499b.hashCode()) * 1000003) ^ this.f3500c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f3503f ? 1231 : 1237)) * 1000003) ^ this.f3504g) * 1000003) ^ this.f3505h.hashCode()) * 1000003) ^ this.f3506i.hashCode();
    }

    public final boolean i() {
        return this.f3503f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f3498a);
        sb2.append(", model=");
        sb2.append(this.f3499b);
        sb2.append(", cores=");
        sb2.append(this.f3500c);
        sb2.append(", ram=");
        sb2.append(this.f3501d);
        sb2.append(", diskSpace=");
        sb2.append(this.f3502e);
        sb2.append(", simulator=");
        sb2.append(this.f3503f);
        sb2.append(", state=");
        sb2.append(this.f3504g);
        sb2.append(", manufacturer=");
        sb2.append(this.f3505h);
        sb2.append(", modelClass=");
        return g.a(sb2, this.f3506i, "}");
    }
}
