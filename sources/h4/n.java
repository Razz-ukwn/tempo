package h4;

import android.graphics.drawable.Drawable;
import f4.b;
import q.g;
import sf.j;

public final class n extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f9212a;

    /* renamed from: b  reason: collision with root package name */
    public final h f9213b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9214c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f9215d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9216e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9217f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9218g;

    public n(Drawable drawable, h hVar, int i8, b.a aVar, String str, boolean z10, boolean z11) {
        this.f9212a = drawable;
        this.f9213b = hVar;
        this.f9214c = i8;
        this.f9215d = aVar;
        this.f9216e = str;
        this.f9217f = z10;
        this.f9218g = z11;
    }

    public final Drawable a() {
        return this.f9212a;
    }

    public final h b() {
        return this.f9213b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (j.a(this.f9212a, nVar.f9212a)) {
                return j.a(this.f9213b, nVar.f9213b) && this.f9214c == nVar.f9214c && j.a(this.f9215d, nVar.f9215d) && j.a(this.f9216e, nVar.f9216e) && this.f9217f == nVar.f9217f && this.f9218g == nVar.f9218g;
            }
        }
    }

    public final int hashCode() {
        int c3 = (g.c(this.f9214c) + ((this.f9213b.hashCode() + (this.f9212a.hashCode() * 31)) * 31)) * 31;
        int i8 = 0;
        b.a aVar = this.f9215d;
        int hashCode = (c3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f9216e;
        if (str != null) {
            i8 = str.hashCode();
        }
        return Boolean.hashCode(this.f9218g) + ((Boolean.hashCode(this.f9217f) + ((hashCode + i8) * 31)) * 31);
    }
}
