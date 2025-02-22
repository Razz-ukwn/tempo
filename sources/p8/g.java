package p8;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import p8.b;
import s3.c;

public final class g extends i.b {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f12496l = {0, 1350, 2700, 4050};
    public static final int[] m = {667, 2017, 3367, 4717};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f12497n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    public static final a f12498o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f12499p = new b();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f12500d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f12501e;

    /* renamed from: f  reason: collision with root package name */
    public final v2.b f12502f;

    /* renamed from: g  reason: collision with root package name */
    public final h f12503g;

    /* renamed from: h  reason: collision with root package name */
    public int f12504h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f12505i;

    /* renamed from: j  reason: collision with root package name */
    public float f12506j;

    /* renamed from: k  reason: collision with root package name */
    public c f12507k = null;

    public class a extends Property<g, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((g) obj).f12505i);
        }

        public final void set(Object obj, Object obj2) {
            v2.b bVar;
            g gVar = (g) obj;
            float floatValue = ((Float) obj2).floatValue();
            gVar.f12505i = floatValue;
            int i8 = (int) (5400.0f * floatValue);
            float[] fArr = (float[]) gVar.f9344b;
            float f10 = floatValue * 1520.0f;
            fArr[0] = -20.0f + f10;
            fArr[1] = f10;
            int i10 = 0;
            while (true) {
                bVar = gVar.f12502f;
                if (i10 >= 4) {
                    break;
                }
                float f11 = (float) 667;
                float[] fArr2 = (float[]) gVar.f9344b;
                fArr2[1] = (bVar.getInterpolation(((float) (i8 - g.f12496l[i10])) / f11) * 250.0f) + fArr2[1];
                float f12 = ((float) (i8 - g.m[i10])) / f11;
                float[] fArr3 = (float[]) gVar.f9344b;
                fArr3[0] = (bVar.getInterpolation(f12) * 250.0f) + fArr3[0];
                i10++;
            }
            float[] fArr4 = (float[]) gVar.f9344b;
            float f13 = fArr4[0];
            float f14 = fArr4[1];
            float f15 = ((f14 - f13) * gVar.f12506j) + f13;
            fArr4[0] = f15;
            fArr4[0] = f15 / 360.0f;
            fArr4[1] = f14 / 360.0f;
            int i11 = 0;
            while (true) {
                if (i11 >= 4) {
                    break;
                }
                float f16 = ((float) (i8 - g.f12497n[i11])) / ((float) 333);
                if (f16 >= 0.0f && f16 <= 1.0f) {
                    int i12 = i11 + gVar.f12504h;
                    h hVar = gVar.f12503g;
                    int[] iArr = hVar.f12486c;
                    int length = i12 % iArr.length;
                    ((int[]) gVar.f9345c)[0] = v7.b.a(bVar.getInterpolation(f16), Integer.valueOf(b1.b.b(iArr[length], ((n) gVar.f9343a).F)), Integer.valueOf(b1.b.b(hVar.f12486c[(length + 1) % iArr.length], ((n) gVar.f9343a).F))).intValue();
                    break;
                }
                i11++;
            }
            ((n) gVar.f9343a).invalidateSelf();
        }
    }

    public class b extends Property<g, Float> {
        public b() {
            super(Float.class, "completeEndFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((g) obj).f12506j);
        }

        public final void set(Object obj, Object obj2) {
            ((g) obj).f12506j = ((Float) obj2).floatValue();
        }
    }

    public g(h hVar) {
        this.f12503g = hVar;
        this.f12502f = new v2.b();
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.f12500d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void f() {
        k();
    }

    public final void g(b.c cVar) {
        this.f12507k = cVar;
    }

    public final void h() {
        ObjectAnimator objectAnimator = this.f12501e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((n) this.f9343a).isVisible()) {
                this.f12501e.start();
            } else {
                c();
            }
        }
    }

    public final void i() {
        if (this.f12500d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f12498o, new float[]{0.0f, 1.0f});
            this.f12500d = ofFloat;
            ofFloat.setDuration(5400);
            this.f12500d.setInterpolator((TimeInterpolator) null);
            this.f12500d.setRepeatCount(-1);
            this.f12500d.addListener(new e(this));
        }
        if (this.f12501e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f12499p, new float[]{0.0f, 1.0f});
            this.f12501e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f12501e.setInterpolator(this.f12502f);
            this.f12501e.addListener(new f(this));
        }
        k();
        this.f12500d.start();
    }

    public final void j() {
        this.f12507k = null;
    }

    public final void k() {
        this.f12504h = 0;
        ((int[]) this.f9345c)[0] = b1.b.b(this.f12503g.f12486c[0], ((n) this.f9343a).F);
        this.f12506j = 0.0f;
    }
}
