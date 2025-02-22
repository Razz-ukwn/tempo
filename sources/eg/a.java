package eg;

import androidx.fragment.app.f1;
import q.n;
import rb.b;
import sf.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f7985a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7986b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7987c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7988d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7989e;

    /* renamed from: f  reason: collision with root package name */
    public final float f7990f;

    /* renamed from: g  reason: collision with root package name */
    public final float f7991g;

    /* renamed from: h  reason: collision with root package name */
    public final gg.a f7992h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7993i;

    public a(float f10, float f11, float f12, float f13, int i8, float f14, float f15, gg.a aVar, int i10) {
        j.f(aVar, "shape");
        this.f7985a = f10;
        this.f7986b = f11;
        this.f7987c = f12;
        this.f7988d = f13;
        this.f7989e = i8;
        this.f7990f = f14;
        this.f7991g = f15;
        this.f7992h = aVar;
        this.f7993i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(Float.valueOf(this.f7985a), Float.valueOf(aVar.f7985a)) && j.a(Float.valueOf(this.f7986b), Float.valueOf(aVar.f7986b)) && j.a(Float.valueOf(this.f7987c), Float.valueOf(aVar.f7987c)) && j.a(Float.valueOf(this.f7988d), Float.valueOf(aVar.f7988d)) && this.f7989e == aVar.f7989e && j.a(Float.valueOf(this.f7990f), Float.valueOf(aVar.f7990f)) && j.a(Float.valueOf(this.f7991g), Float.valueOf(aVar.f7991g)) && j.a(this.f7992h, aVar.f7992h) && this.f7993i == aVar.f7993i;
    }

    public final int hashCode() {
        int a10 = n.a(this.f7991g, n.a(this.f7990f, f1.c(this.f7989e, n.a(this.f7988d, n.a(this.f7987c, n.a(this.f7986b, Float.hashCode(this.f7985a) * 31, 31), 31), 31), 31), 31), 31);
        return Integer.hashCode(this.f7993i) + ((this.f7992h.hashCode() + a10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Particle(x=");
        sb2.append(this.f7985a);
        sb2.append(", y=");
        sb2.append(this.f7986b);
        sb2.append(", width=");
        sb2.append(this.f7987c);
        sb2.append(", height=");
        sb2.append(this.f7988d);
        sb2.append(", color=");
        sb2.append(this.f7989e);
        sb2.append(", rotation=");
        sb2.append(this.f7990f);
        sb2.append(", scaleX=");
        sb2.append(this.f7991g);
        sb2.append(", shape=");
        sb2.append(this.f7992h);
        sb2.append(", alpha=");
        return b.a(sb2, this.f7993i, ')');
    }
}
