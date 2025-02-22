package o0;

import gf.s;
import h0.c;
import java.util.List;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final long f12069a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12070b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12071c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12072d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12073e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12074f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12075g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12076h;

    /* renamed from: i  reason: collision with root package name */
    public final long f12077i;

    /* renamed from: j  reason: collision with root package name */
    public final Float f12078j;

    /* renamed from: k  reason: collision with root package name */
    public final List<d> f12079k;

    /* renamed from: l  reason: collision with root package name */
    public c f12080l;

    public o() {
        throw null;
    }

    public o(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i8, List list, long j15) {
        this.f12069a = j10;
        this.f12070b = j11;
        this.f12071c = j12;
        this.f12072d = z10;
        this.f12073e = j13;
        this.f12074f = j14;
        this.f12075g = z11;
        this.f12076h = i8;
        this.f12077i = j15;
        this.f12080l = new c();
        this.f12078j = Float.valueOf(f10);
        this.f12079k = list;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append(n.a(this.f12069a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f12070b);
        sb2.append(", position=");
        sb2.append(c.d(this.f12071c));
        sb2.append(", pressed=");
        sb2.append(this.f12072d);
        sb2.append(", pressure=");
        Float f10 = this.f12078j;
        sb2.append(f10 != null ? f10.floatValue() : 0.0f);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f12073e);
        sb2.append(", previousPosition=");
        sb2.append(c.d(this.f12074f));
        sb2.append(", previousPressed=");
        sb2.append(this.f12075g);
        sb2.append(", isConsumed=");
        c cVar = this.f12080l;
        sb2.append(cVar.f12041b || cVar.f12040a);
        sb2.append(", type=");
        int i8 = this.f12076h;
        sb2.append(i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        sb2.append(", historical=");
        Object obj = this.f12079k;
        if (obj == null) {
            obj = s.f8978a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append(c.d(this.f12077i));
        sb2.append(')');
        return sb2.toString();
    }
}
