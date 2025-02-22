package ta;

import j0.t;
import q.g;
import ta.d;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f15506b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15507c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15508d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15509e;

    /* renamed from: f  reason: collision with root package name */
    public final long f15510f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15511g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15512h;

    /* renamed from: ta.a$a  reason: collision with other inner class name */
    public static final class C0286a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f15513a;

        /* renamed from: b  reason: collision with root package name */
        public int f15514b;

        /* renamed from: c  reason: collision with root package name */
        public String f15515c;

        /* renamed from: d  reason: collision with root package name */
        public String f15516d;

        /* renamed from: e  reason: collision with root package name */
        public Long f15517e;

        /* renamed from: f  reason: collision with root package name */
        public Long f15518f;

        /* renamed from: g  reason: collision with root package name */
        public String f15519g;

        public C0286a() {
        }

        public final a a() {
            String str = this.f15514b == 0 ? " registrationStatus" : "";
            if (this.f15517e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (this.f15518f == null) {
                str = h4.a.c(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f15513a, this.f15514b, this.f15515c, this.f15516d, this.f15517e.longValue(), this.f15518f.longValue(), this.f15519g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final C0286a b(int i8) {
            if (i8 != 0) {
                this.f15514b = i8;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C0286a(d dVar) {
            this.f15513a = dVar.c();
            this.f15514b = dVar.f();
            this.f15515c = dVar.a();
            this.f15516d = dVar.e();
            this.f15517e = Long.valueOf(dVar.b());
            this.f15518f = Long.valueOf(dVar.g());
            this.f15519g = dVar.d();
        }
    }

    public a(String str, int i8, String str2, String str3, long j10, long j11, String str4) {
        this.f15506b = str;
        this.f15507c = i8;
        this.f15508d = str2;
        this.f15509e = str3;
        this.f15510f = j10;
        this.f15511g = j11;
        this.f15512h = str4;
    }

    public final String a() {
        return this.f15508d;
    }

    public final long b() {
        return this.f15510f;
    }

    public final String c() {
        return this.f15506b;
    }

    public final String d() {
        return this.f15512h;
    }

    public final String e() {
        return this.f15509e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f15506b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (g.b(this.f15507c, dVar.f()) && ((str = this.f15508d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f15509e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f15510f == dVar.b() && this.f15511g == dVar.g()) {
                String str4 = this.f15512h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.f15507c;
    }

    public final long g() {
        return this.f15511g;
    }

    public final C0286a h() {
        return new C0286a(this);
    }

    public final int hashCode() {
        int i8 = 0;
        String str = this.f15506b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ g.c(this.f15507c)) * 1000003;
        String str2 = this.f15508d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15509e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f15510f;
        long j11 = this.f15511g;
        int i10 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f15512h;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i8 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f15506b);
        sb2.append(", registrationStatus=");
        sb2.append(t.b(this.f15507c));
        sb2.append(", authToken=");
        sb2.append(this.f15508d);
        sb2.append(", refreshToken=");
        sb2.append(this.f15509e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f15510f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f15511g);
        sb2.append(", fisError=");
        return androidx.activity.g.a(sb2, this.f15512h, "}");
    }
}
