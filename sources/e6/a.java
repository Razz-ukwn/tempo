package e6;

import d6.n;
import java.util.Arrays;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<n> f7846a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7847b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f7846a = iterable;
        this.f7847b = bArr;
    }

    public final Iterable<n> a() {
        return this.f7846a;
    }

    public final byte[] b() {
        return this.f7847b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f7846a.equals(fVar.a())) {
            if (Arrays.equals(this.f7847b, fVar instanceof a ? ((a) fVar).f7847b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7846a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7847b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f7846a + ", extras=" + Arrays.toString(this.f7847b) + "}";
    }
}
