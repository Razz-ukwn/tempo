package i5;

import android.graphics.drawable.Drawable;
import h5.d;
import l5.l;

public abstract class c<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9582a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9583b;

    /* renamed from: c  reason: collision with root package name */
    public d f9584c;

    public c() {
        if (l.g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f9582a = Integer.MIN_VALUE;
            this.f9583b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void a() {
    }

    public final d b() {
        return this.f9584c;
    }

    public final void d(f fVar) {
    }

    public final void e() {
    }

    public final void f(f fVar) {
        fVar.c(this.f9582a, this.f9583b);
    }

    public final void g(Drawable drawable) {
    }

    public final void h() {
    }

    public final void i(d dVar) {
        this.f9584c = dVar;
    }

    public final void j(Drawable drawable) {
    }
}
