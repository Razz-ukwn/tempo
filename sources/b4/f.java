package b4;

import android.graphics.drawable.Drawable;
import q.g;
import sf.j;

public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f3221a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3222b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3223c;

    public f(Drawable drawable, boolean z10, int i8) {
        this.f3221a = drawable;
        this.f3222b = z10;
        this.f3223c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return j.a(this.f3221a, fVar.f3221a) && this.f3222b == fVar.f3222b && this.f3223c == fVar.f3223c;
        }
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f3222b);
        return g.c(this.f3223c) + ((hashCode + (this.f3221a.hashCode() * 31)) * 31);
    }
}
