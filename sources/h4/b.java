package h4;

import ag.c0;
import ag.s0;
import ag.x1;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlinx.coroutines.internal.m;
import l4.b;
import l4.c;
import q.g;
import sf.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f9111a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f9112b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f9113c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f9114d;

    /* renamed from: e  reason: collision with root package name */
    public final c.a f9115e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9116f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f9117g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9118h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9119i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f9120j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f9121k;

    /* renamed from: l  reason: collision with root package name */
    public final Drawable f9122l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9123n;

    /* renamed from: o  reason: collision with root package name */
    public final int f9124o;

    public b() {
        this(0);
    }

    public b(int i8) {
        kotlinx.coroutines.scheduling.c cVar = s0.f480a;
        x1 J0 = m.f10728a.J0();
        kotlinx.coroutines.scheduling.b bVar = s0.f481b;
        b.a aVar = c.a.f10980a;
        Bitmap.Config config = m4.c.f11190b;
        this.f9111a = J0;
        this.f9112b = bVar;
        this.f9113c = bVar;
        this.f9114d = bVar;
        this.f9115e = aVar;
        this.f9116f = 3;
        this.f9117g = config;
        this.f9118h = true;
        this.f9119i = false;
        this.f9120j = null;
        this.f9121k = null;
        this.f9122l = null;
        this.m = 1;
        this.f9123n = 1;
        this.f9124o = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return j.a(this.f9111a, bVar.f9111a) && j.a(this.f9112b, bVar.f9112b) && j.a(this.f9113c, bVar.f9113c) && j.a(this.f9114d, bVar.f9114d) && j.a(this.f9115e, bVar.f9115e) && this.f9116f == bVar.f9116f && this.f9117g == bVar.f9117g && this.f9118h == bVar.f9118h && this.f9119i == bVar.f9119i && j.a(this.f9120j, bVar.f9120j) && j.a(this.f9121k, bVar.f9121k) && j.a(this.f9122l, bVar.f9122l) && this.m == bVar.m && this.f9123n == bVar.f9123n && this.f9124o == bVar.f9124o;
        }
    }

    public final int hashCode() {
        int hashCode = this.f9112b.hashCode();
        int hashCode2 = this.f9113c.hashCode();
        int hashCode3 = this.f9114d.hashCode();
        int hashCode4 = this.f9115e.hashCode();
        int c3 = g.c(this.f9116f);
        int hashCode5 = (Boolean.hashCode(this.f9119i) + ((Boolean.hashCode(this.f9118h) + ((this.f9117g.hashCode() + ((c3 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f9111a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i8 = 0;
        Drawable drawable = this.f9120j;
        int hashCode6 = (hashCode5 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f9121k;
        int hashCode7 = (hashCode6 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f9122l;
        if (drawable3 != null) {
            i8 = drawable3.hashCode();
        }
        return g.c(this.f9124o) + ((g.c(this.f9123n) + ((g.c(this.m) + ((hashCode7 + i8) * 31)) * 31)) * 31);
    }
}
