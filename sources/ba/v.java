package ba;

import ba.b0;

public final class v extends b0.e.C0051e {

    /* renamed from: a  reason: collision with root package name */
    public final int f3583a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3584b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3585c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3586d;

    public static final class a extends b0.e.C0051e.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f3587a;

        /* renamed from: b  reason: collision with root package name */
        public String f3588b;

        /* renamed from: c  reason: collision with root package name */
        public String f3589c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f3590d;

        public final v a() {
            String str = this.f3587a == null ? " platform" : "";
            if (this.f3588b == null) {
                str = str.concat(" version");
            }
            if (this.f3589c == null) {
                str = h4.a.c(str, " buildVersion");
            }
            if (this.f3590d == null) {
                str = h4.a.c(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new v(this.f3587a.intValue(), this.f3588b, this.f3589c, this.f3590d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public v(int i8, String str, String str2, boolean z10) {
        this.f3583a = i8;
        this.f3584b = str;
        this.f3585c = str2;
        this.f3586d = z10;
    }

    public final String a() {
        return this.f3585c;
    }

    public final int b() {
        return this.f3583a;
    }

    public final String c() {
        return this.f3584b;
    }

    public final boolean d() {
        return this.f3586d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.C0051e)) {
            return false;
        }
        b0.e.C0051e eVar = (b0.e.C0051e) obj;
        return this.f3583a == eVar.b() && this.f3584b.equals(eVar.c()) && this.f3585c.equals(eVar.a()) && this.f3586d == eVar.d();
    }

    public final int hashCode() {
        return ((((((this.f3583a ^ 1000003) * 1000003) ^ this.f3584b.hashCode()) * 1000003) ^ this.f3585c.hashCode()) * 1000003) ^ (this.f3586d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f3583a + ", version=" + this.f3584b + ", buildVersion=" + this.f3585c + ", jailbroken=" + this.f3586d + "}";
    }
}
