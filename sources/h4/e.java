package h4;

import android.graphics.drawable.Drawable;
import sf.j;

public final class e extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f9139a;

    /* renamed from: b  reason: collision with root package name */
    public final h f9140b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f9141c;

    public e(Drawable drawable, h hVar, Throwable th) {
        this.f9139a = drawable;
        this.f9140b = hVar;
        this.f9141c = th;
    }

    public final Drawable a() {
        return this.f9139a;
    }

    public final h b() {
        return this.f9140b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (j.a(this.f9139a, eVar.f9139a)) {
                return j.a(this.f9140b, eVar.f9140b) && j.a(this.f9141c, eVar.f9141c);
            }
        }
    }

    public final int hashCode() {
        Drawable drawable = this.f9139a;
        int hashCode = drawable != null ? drawable.hashCode() : 0;
        return this.f9141c.hashCode() + ((this.f9140b.hashCode() + (hashCode * 31)) * 31);
    }
}
