package ba;

import ba.b0;
import java.util.Arrays;

public final class g extends b0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3467a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3468b;

    public g(String str, byte[] bArr) {
        this.f3467a = str;
        this.f3468b = bArr;
    }

    public final byte[] a() {
        return this.f3468b;
    }

    public final String b() {
        return this.f3467a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d.a)) {
            return false;
        }
        b0.d.a aVar = (b0.d.a) obj;
        if (this.f3467a.equals(aVar.b())) {
            if (Arrays.equals(this.f3468b, aVar instanceof g ? ((g) aVar).f3468b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3467a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3468b);
    }

    public final String toString() {
        return "File{filename=" + this.f3467a + ", contents=" + Arrays.toString(this.f3468b) + "}";
    }
}
