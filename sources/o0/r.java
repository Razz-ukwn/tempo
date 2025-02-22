package o0;

import androidx.fragment.app.f1;
import h0.c;
import h0.e;
import java.util.ArrayList;
import java.util.List;
import q.n;
import sf.j;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final long f12087a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12088b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12089c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12090d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12091e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12092f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12093g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12094h;

    /* renamed from: i  reason: collision with root package name */
    public final List<d> f12095i;

    /* renamed from: j  reason: collision with root package name */
    public final long f12096j;

    public r() {
        throw null;
    }

    public r(long j10, long j11, long j12, long j13, boolean z10, float f10, int i8, boolean z11, ArrayList arrayList, long j14) {
        this.f12087a = j10;
        this.f12088b = j11;
        this.f12089c = j12;
        this.f12090d = j13;
        this.f12091e = z10;
        this.f12092f = f10;
        this.f12093g = i8;
        this.f12094h = z11;
        this.f12095i = arrayList;
        this.f12096j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!(this.f12087a == rVar.f12087a) || this.f12088b != rVar.f12088b || !c.a(this.f12089c, rVar.f12089c) || !c.a(this.f12090d, rVar.f12090d) || this.f12091e != rVar.f12091e || Float.compare(this.f12092f, rVar.f12092f) != 0) {
            return false;
        }
        return (this.f12093g == rVar.f12093g) && this.f12094h == rVar.f12094h && j.a(this.f12095i, rVar.f12095i) && c.a(this.f12096j, rVar.f12096j);
    }

    public final int hashCode() {
        int a10 = e.a(this.f12088b, Long.hashCode(this.f12087a) * 31, 31);
        int i8 = c.f9071e;
        int a11 = e.a(this.f12090d, e.a(this.f12089c, a10, 31), 31);
        boolean z10 = true;
        boolean z11 = this.f12091e;
        if (z11) {
            z11 = true;
        }
        int c3 = f1.c(this.f12093g, n.a(this.f12092f, (a11 + (z11 ? 1 : 0)) * 31, 31), 31);
        boolean z12 = this.f12094h;
        if (!z12) {
            z10 = z12;
        }
        return Long.hashCode(this.f12096j) + ((this.f12095i.hashCode() + ((c3 + (z10 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append(n.a(this.f12087a));
        sb2.append(", uptime=");
        sb2.append(this.f12088b);
        sb2.append(", positionOnScreen=");
        sb2.append(c.d(this.f12089c));
        sb2.append(", position=");
        sb2.append(c.d(this.f12090d));
        sb2.append(", down=");
        sb2.append(this.f12091e);
        sb2.append(", pressure=");
        sb2.append(this.f12092f);
        sb2.append(", type=");
        int i8 = this.f12093g;
        sb2.append(i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        sb2.append(", issuesEnterExit=");
        sb2.append(this.f12094h);
        sb2.append(", historical=");
        sb2.append(this.f12095i);
        sb2.append(", scrollDelta=");
        sb2.append(c.d(this.f12096j));
        sb2.append(')');
        return sb2.toString();
    }
}
