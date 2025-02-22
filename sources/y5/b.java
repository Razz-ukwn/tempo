package y5;

import s5.e;
import s5.f;
import v5.c;
import w5.e;
import z5.g;

public abstract class b extends c {

    /* renamed from: f  reason: collision with root package name */
    public final a f17259f = new a();

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17260a;

        /* renamed from: b  reason: collision with root package name */
        public int f17261b;

        /* renamed from: c  reason: collision with root package name */
        public int f17262c;

        public a() {
        }

        public final void a(c cVar, e eVar) {
            b.this.f17264b.getClass();
            float max = Math.max(0.0f, Math.min(1.0f, 1.0f));
            float lowestVisibleX = cVar.getLowestVisibleX();
            float highestVisibleX = cVar.getHighestVisibleX();
            f C = eVar.C(lowestVisibleX, Float.NaN, e.a.f14736b);
            f C2 = eVar.C(highestVisibleX, Float.NaN, e.a.f14735a);
            int i8 = 0;
            this.f17260a = C == null ? 0 : eVar.N(C);
            if (C2 != null) {
                i8 = eVar.N(C2);
            }
            this.f17261b = i8;
            this.f17262c = (int) (((float) (i8 - this.f17260a)) * max);
        }
    }

    public b(p5.a aVar, g gVar) {
        super(aVar, gVar);
    }

    public static boolean n(w5.b bVar) {
        return bVar.isVisible() && (bVar.P() || bVar.l());
    }

    public final boolean m(f fVar, w5.b bVar) {
        if (fVar == null) {
            return false;
        }
        this.f17264b.getClass();
        return ((float) bVar.N(fVar)) < ((float) bVar.V()) * 1.0f;
    }
}
