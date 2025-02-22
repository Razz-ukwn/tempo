package ba;

import ba.b0;

public final class l extends b0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f3516a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3517b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.e.d.a f3518c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.c f3519d;

    /* renamed from: e  reason: collision with root package name */
    public final b0.e.d.C0050d f3520e;

    public static final class a extends b0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f3521a;

        /* renamed from: b  reason: collision with root package name */
        public String f3522b;

        /* renamed from: c  reason: collision with root package name */
        public b0.e.d.a f3523c;

        /* renamed from: d  reason: collision with root package name */
        public b0.e.d.c f3524d;

        /* renamed from: e  reason: collision with root package name */
        public b0.e.d.C0050d f3525e;

        public a() {
        }

        public final l a() {
            String str = this.f3521a == null ? " timestamp" : "";
            if (this.f3522b == null) {
                str = str.concat(" type");
            }
            if (this.f3523c == null) {
                str = h4.a.c(str, " app");
            }
            if (this.f3524d == null) {
                str = h4.a.c(str, " device");
            }
            if (str.isEmpty()) {
                return new l(this.f3521a.longValue(), this.f3522b, this.f3523c, this.f3524d, this.f3525e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public a(b0.e.d dVar) {
            this.f3521a = Long.valueOf(dVar.d());
            this.f3522b = dVar.e();
            this.f3523c = dVar.a();
            this.f3524d = dVar.b();
            this.f3525e = dVar.c();
        }
    }

    public l(long j10, String str, b0.e.d.a aVar, b0.e.d.c cVar, b0.e.d.C0050d dVar) {
        this.f3516a = j10;
        this.f3517b = str;
        this.f3518c = aVar;
        this.f3519d = cVar;
        this.f3520e = dVar;
    }

    public final b0.e.d.a a() {
        return this.f3518c;
    }

    public final b0.e.d.c b() {
        return this.f3519d;
    }

    public final b0.e.d.C0050d c() {
        return this.f3520e;
    }

    public final long d() {
        return this.f3516a;
    }

    public final String e() {
        return this.f3517b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d)) {
            return false;
        }
        b0.e.d dVar = (b0.e.d) obj;
        if (this.f3516a == dVar.d() && this.f3517b.equals(dVar.e()) && this.f3518c.equals(dVar.a()) && this.f3519d.equals(dVar.b())) {
            b0.e.d.C0050d dVar2 = this.f3520e;
            if (dVar2 == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3516a;
        int hashCode = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f3517b.hashCode()) * 1000003) ^ this.f3518c.hashCode()) * 1000003) ^ this.f3519d.hashCode()) * 1000003;
        b0.e.d.C0050d dVar = this.f3520e;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f3516a + ", type=" + this.f3517b + ", app=" + this.f3518c + ", device=" + this.f3519d + ", log=" + this.f3520e + "}";
    }
}
