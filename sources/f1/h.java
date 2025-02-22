package f1;

import e9.c;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final long f8035b = c.a(0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8036c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f8037a;

    public /* synthetic */ h(long j10) {
        this.f8037a = j10;
    }

    public static final int a(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f8037a == ((h) obj).f8037a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8037a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j10 = this.f8037a;
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        sb2.append(a(j10));
        sb2.append(')');
        return sb2.toString();
    }
}
