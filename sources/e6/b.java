package e6;

import b3.x;
import q.g;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final int f7848a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7849b;

    public b(int i8, long j10) {
        if (i8 != 0) {
            this.f7848a = i8;
            this.f7849b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final long a() {
        return this.f7849b;
    }

    public final int b() {
        return this.f7848a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g.b(this.f7848a, gVar.b()) && this.f7849b == gVar.a();
    }

    public final int hashCode() {
        long j10 = this.f7849b;
        return ((g.c(this.f7848a) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + x.c(this.f7848a) + ", nextRequestWaitMillis=" + this.f7849b + "}";
    }
}
