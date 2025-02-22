package y3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import sf.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f17148a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17149b;

    public d(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f17148a = bitmapDrawable;
        this.f17149b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return j.a(this.f17148a, dVar.f17148a) && this.f17149b == dVar.f17149b;
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17149b) + (this.f17148a.hashCode() * 31);
    }
}
