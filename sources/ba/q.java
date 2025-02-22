package ba;

import ba.b0;

public final class q extends b0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3555b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3556c;

    public q(String str, String str2, long j10) {
        this.f3554a = str;
        this.f3555b = str2;
        this.f3556c = j10;
    }

    public final long a() {
        return this.f3556c;
    }

    public final String b() {
        return this.f3555b;
    }

    public final String c() {
        return this.f3554a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.c)) {
            return false;
        }
        b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
        return this.f3554a.equals(cVar.c()) && this.f3555b.equals(cVar.b()) && this.f3556c == cVar.a();
    }

    public final int hashCode() {
        long j10 = this.f3556c;
        return ((((this.f3554a.hashCode() ^ 1000003) * 1000003) ^ this.f3555b.hashCode()) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "Signal{name=" + this.f3554a + ", code=" + this.f3555b + ", address=" + this.f3556c + "}";
    }
}
