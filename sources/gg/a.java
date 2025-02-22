package gg;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import sf.j;

public interface a {

    /* renamed from: gg.a$a  reason: collision with other inner class name */
    public static final class C0161a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0161a f8990a = new C0161a();

        /* renamed from: b  reason: collision with root package name */
        public static final RectF f8991b = new RectF();
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f8992a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8993b;

        /* renamed from: c  reason: collision with root package name */
        public final float f8994c;

        public b(Drawable drawable, boolean z10) {
            this.f8992a = drawable;
            this.f8993b = z10;
            this.f8994c = (drawable.getIntrinsicHeight() == -1 && drawable.getIntrinsicWidth() == -1) ? 1.0f : (drawable.getIntrinsicHeight() == -1 || drawable.getIntrinsicWidth() == -1) ? 0.0f : ((float) drawable.getIntrinsicHeight()) / ((float) drawable.getIntrinsicWidth());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return j.a(this.f8992a, bVar.f8992a) && this.f8993b == bVar.f8993b;
        }

        public final int hashCode() {
            int hashCode = this.f8992a.hashCode() * 31;
            boolean z10 = this.f8993b;
            if (z10) {
                z10 = true;
            }
            return hashCode + (z10 ? 1 : 0);
        }

        public final String toString() {
            return "DrawableShape(drawable=" + this.f8992a + ", tint=" + this.f8993b + ')';
        }
    }

    public static final class c implements a {
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f8995a = new d();
    }
}
