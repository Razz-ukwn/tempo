package ba;

import ba.b0;

public final class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f3422b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3423c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3424d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3425e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3426f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3427g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e f3428h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.d f3429i;

    /* renamed from: j  reason: collision with root package name */
    public final b0.a f3430j;

    public static final class a extends b0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f3431a;

        /* renamed from: b  reason: collision with root package name */
        public String f3432b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f3433c;

        /* renamed from: d  reason: collision with root package name */
        public String f3434d;

        /* renamed from: e  reason: collision with root package name */
        public String f3435e;

        /* renamed from: f  reason: collision with root package name */
        public String f3436f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e f3437g;

        /* renamed from: h  reason: collision with root package name */
        public b0.d f3438h;

        /* renamed from: i  reason: collision with root package name */
        public b0.a f3439i;

        public a() {
        }

        public final b a() {
            String str = this.f3431a == null ? " sdkVersion" : "";
            if (this.f3432b == null) {
                str = str.concat(" gmpAppId");
            }
            if (this.f3433c == null) {
                str = h4.a.c(str, " platform");
            }
            if (this.f3434d == null) {
                str = h4.a.c(str, " installationUuid");
            }
            if (this.f3435e == null) {
                str = h4.a.c(str, " buildVersion");
            }
            if (this.f3436f == null) {
                str = h4.a.c(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f3431a, this.f3432b, this.f3433c.intValue(), this.f3434d, this.f3435e, this.f3436f, this.f3437g, this.f3438h, this.f3439i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public a(b0 b0Var) {
            this.f3431a = b0Var.h();
            this.f3432b = b0Var.d();
            this.f3433c = Integer.valueOf(b0Var.g());
            this.f3434d = b0Var.e();
            this.f3435e = b0Var.b();
            this.f3436f = b0Var.c();
            this.f3437g = b0Var.i();
            this.f3438h = b0Var.f();
            this.f3439i = b0Var.a();
        }
    }

    public b(String str, String str2, int i8, String str3, String str4, String str5, b0.e eVar, b0.d dVar, b0.a aVar) {
        this.f3422b = str;
        this.f3423c = str2;
        this.f3424d = i8;
        this.f3425e = str3;
        this.f3426f = str4;
        this.f3427g = str5;
        this.f3428h = eVar;
        this.f3429i = dVar;
        this.f3430j = aVar;
    }

    public final b0.a a() {
        return this.f3430j;
    }

    public final String b() {
        return this.f3426f;
    }

    public final String c() {
        return this.f3427g;
    }

    public final String d() {
        return this.f3423c;
    }

    public final String e() {
        return this.f3425e;
    }

    public final boolean equals(Object obj) {
        b0.e eVar;
        b0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f3422b.equals(b0Var.h()) && this.f3423c.equals(b0Var.d()) && this.f3424d == b0Var.g() && this.f3425e.equals(b0Var.e()) && this.f3426f.equals(b0Var.b()) && this.f3427g.equals(b0Var.c()) && ((eVar = this.f3428h) != null ? eVar.equals(b0Var.i()) : b0Var.i() == null) && ((dVar = this.f3429i) != null ? dVar.equals(b0Var.f()) : b0Var.f() == null)) {
            b0.a aVar = this.f3430j;
            if (aVar == null) {
                if (b0Var.a() == null) {
                    return true;
                }
            } else if (aVar.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public final b0.d f() {
        return this.f3429i;
    }

    public final int g() {
        return this.f3424d;
    }

    public final String h() {
        return this.f3422b;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.f3422b.hashCode() ^ 1000003) * 1000003) ^ this.f3423c.hashCode()) * 1000003) ^ this.f3424d) * 1000003) ^ this.f3425e.hashCode()) * 1000003) ^ this.f3426f.hashCode()) * 1000003) ^ this.f3427g.hashCode()) * 1000003;
        int i8 = 0;
        b0.e eVar = this.f3428h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        b0.d dVar = this.f3429i;
        int hashCode3 = (hashCode2 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        b0.a aVar = this.f3430j;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return hashCode3 ^ i8;
    }

    public final b0.e i() {
        return this.f3428h;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f3422b + ", gmpAppId=" + this.f3423c + ", platform=" + this.f3424d + ", installationUuid=" + this.f3425e + ", buildVersion=" + this.f3426f + ", displayVersion=" + this.f3427g + ", session=" + this.f3428h + ", ndkPayload=" + this.f3429i + ", appExitInfo=" + this.f3430j + "}";
    }
}
