package v1;

import android.graphics.Insets;
import rb.b;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final e f16120e = new e(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f16121a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16122b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16123c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16124d;

    public static class a {
        public static Insets a(int i8, int i10, int i11, int i12) {
            return Insets.of(i8, i10, i11, i12);
        }
    }

    public e(int i8, int i10, int i11, int i12) {
        this.f16121a = i8;
        this.f16122b = i10;
        this.f16123c = i11;
        this.f16124d = i12;
    }

    public static e a(int i8, int i10, int i11, int i12) {
        return (i8 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f16120e : new e(i8, i10, i11, i12);
    }

    public static e b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return a.a(this.f16121a, this.f16122b, this.f16123c, this.f16124d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16124d == eVar.f16124d && this.f16121a == eVar.f16121a && this.f16123c == eVar.f16123c && this.f16122b == eVar.f16122b;
    }

    public final int hashCode() {
        return (((((this.f16121a * 31) + this.f16122b) * 31) + this.f16123c) * 31) + this.f16124d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f16121a);
        sb2.append(", top=");
        sb2.append(this.f16122b);
        sb2.append(", right=");
        sb2.append(this.f16123c);
        sb2.append(", bottom=");
        return b.a(sb2, this.f16124d, '}');
    }
}
