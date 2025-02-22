package h0;

import androidx.activity.result.d;
import androidx.lifecycle.s0;
import e9.c;
import q.n;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final float f9078a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9079b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9080c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9081d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9082e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9083f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9084g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9085h;

    static {
        int i8 = a.f9063b;
        s0.b(0.0f, 0.0f, 0.0f, 0.0f, a.f9062a);
    }

    public f(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f9078a = f10;
        this.f9079b = f11;
        this.f9080c = f12;
        this.f9081d = f13;
        this.f9082e = j10;
        this.f9083f = j11;
        this.f9084g = j12;
        this.f9085h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f9078a, fVar.f9078a) == 0 && Float.compare(this.f9079b, fVar.f9079b) == 0 && Float.compare(this.f9080c, fVar.f9080c) == 0 && Float.compare(this.f9081d, fVar.f9081d) == 0 && a.a(this.f9082e, fVar.f9082e) && a.a(this.f9083f, fVar.f9083f) && a.a(this.f9084g, fVar.f9084g) && a.a(this.f9085h, fVar.f9085h);
    }

    public final int hashCode() {
        int a10 = n.a(this.f9081d, n.a(this.f9080c, n.a(this.f9079b, Float.hashCode(this.f9078a) * 31, 31), 31), 31);
        int i8 = a.f9063b;
        return Long.hashCode(this.f9085h) + e.a(this.f9084g, e.a(this.f9083f, e.a(this.f9082e, a10, 31), 31), 31);
    }

    public final String toString() {
        String str = c.p(this.f9078a) + ", " + c.p(this.f9079b) + ", " + c.p(this.f9080c) + ", " + c.p(this.f9081d);
        long j10 = this.f9082e;
        long j11 = this.f9083f;
        boolean a10 = a.a(j10, j11);
        long j12 = this.f9084g;
        long j13 = this.f9085h;
        if (!a10 || !a.a(j11, j12) || !a.a(j12, j13)) {
            StringBuilder c3 = d.c("RoundRect(rect=", str, ", topLeft=");
            c3.append(a.d(j10));
            c3.append(", topRight=");
            c3.append(a.d(j11));
            c3.append(", bottomRight=");
            c3.append(a.d(j12));
            c3.append(", bottomLeft=");
            c3.append(a.d(j13));
            c3.append(')');
            return c3.toString();
        }
        if (a.b(j10) == a.c(j10)) {
            StringBuilder c10 = d.c("RoundRect(rect=", str, ", radius=");
            c10.append(c.p(a.b(j10)));
            c10.append(')');
            return c10.toString();
        }
        StringBuilder c11 = d.c("RoundRect(rect=", str, ", x=");
        c11.append(c.p(a.b(j10)));
        c11.append(", y=");
        c11.append(c.p(a.c(j10)));
        c11.append(')');
        return c11.toString();
    }
}
