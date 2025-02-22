package p;

import i0.i;
import q.l0;
import q.n0;
import q.o;
import rf.l;
import sf.j;
import sf.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12390a = a.f12393a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f12391b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f12392c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final class a extends k implements l<j0.c, l0<i, o>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12393a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j0.c cVar = (j0.c) obj;
            j.f(cVar, "colorSpace");
            return n0.a(a.f12388a, new b(cVar));
        }
    }

    public static final float a(int i8, float f10, float f11, float f12, float[] fArr) {
        float f13 = f10 * fArr[i8];
        return (f12 * fArr[i8 + 6]) + (f11 * fArr[i8 + 3]) + f13;
    }
}
