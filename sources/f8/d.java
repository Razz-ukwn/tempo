package f8;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class a implements TypeEvaluator<C0154d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f8602b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0154d f8603a = new C0154d();

        public final Object evaluate(float f10, Object obj, Object obj2) {
            C0154d dVar = (C0154d) obj;
            C0154d dVar2 = (C0154d) obj2;
            float f11 = dVar.f8606a;
            float f12 = 1.0f - f10;
            float f13 = (dVar2.f8606a * f10) + (f11 * f12);
            float f14 = dVar.f8607b;
            float f15 = dVar2.f8607b * f10;
            float f16 = dVar.f8608c;
            float f17 = f10 * dVar2.f8608c;
            C0154d dVar3 = this.f8603a;
            dVar3.f8606a = f13;
            dVar3.f8607b = f15 + (f14 * f12);
            dVar3.f8608c = f17 + (f12 * f16);
            return dVar3;
        }
    }

    public static class b extends Property<d, C0154d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8604a = new b();

        public b() {
            super(C0154d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((d) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setRevealInfo((C0154d) obj2);
        }
    }

    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8605a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((d) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: f8.d$d  reason: collision with other inner class name */
    public static class C0154d {

        /* renamed from: a  reason: collision with root package name */
        public float f8606a;

        /* renamed from: b  reason: collision with root package name */
        public float f8607b;

        /* renamed from: c  reason: collision with root package name */
        public float f8608c;

        public C0154d() {
        }

        public C0154d(float f10, float f11, float f12) {
            this.f8606a = f10;
            this.f8607b = f11;
            this.f8608c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0154d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i8);

    void setRevealInfo(C0154d dVar);
}
