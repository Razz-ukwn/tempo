package j5;

import android.graphics.drawable.Drawable;

public final class a implements e<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9791a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9792b;

    /* renamed from: c  reason: collision with root package name */
    public b f9793c;

    public a(int i8, boolean z10) {
        this.f9791a = i8;
        this.f9792b = z10;
    }

    public final d a(p4.a aVar) {
        if (aVar == p4.a.f12450e) {
            return c.f9796a;
        }
        if (this.f9793c == null) {
            this.f9793c = new b(this.f9791a, this.f9792b);
        }
        return this.f9793c;
    }
}
