package z0;

import androidx.fragment.app.f1;
import sf.j;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final f f17613a;

    /* renamed from: b  reason: collision with root package name */
    public final p f17614b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17615c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17616d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17617e;

    public x(f fVar, p pVar, int i8, int i10, Object obj) {
        this.f17613a = fVar;
        this.f17614b = pVar;
        this.f17615c = i8;
        this.f17616d = i10;
        this.f17617e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!j.a(this.f17613a, xVar.f17613a) || !j.a(this.f17614b, xVar.f17614b)) {
            return false;
        }
        if (!(this.f17615c == xVar.f17615c)) {
            return false;
        }
        return (this.f17616d == xVar.f17616d) && j.a(this.f17617e, xVar.f17617e);
    }

    public final int hashCode() {
        int i8 = 0;
        f fVar = this.f17613a;
        int c3 = f1.c(this.f17616d, f1.c(this.f17615c, (((fVar == null ? 0 : fVar.hashCode()) * 31) + this.f17614b.f17608a) * 31, 31), 31);
        Object obj = this.f17617e;
        if (obj != null) {
            i8 = obj.hashCode();
        }
        return c3 + i8;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f17613a + ", fontWeight=" + this.f17614b + ", fontStyle=" + n.a(this.f17615c) + ", fontSynthesis=" + o.a(this.f17616d) + ", resourceLoaderCacheKey=" + this.f17617e + ')';
    }
}
