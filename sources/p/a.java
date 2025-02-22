package p;

import i0.i;
import j0.g;
import q.o;
import rf.l;
import sf.k;

public final class a extends k implements l<i, o> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12388a = new a();

    public a() {
        super(1);
    }

    public final Object invoke(Object obj) {
        long j10 = ((i) obj).f9378a;
        long a10 = i.a(j10, g.f9689d);
        float g10 = i.g(a10);
        float f10 = i.f(a10);
        float d10 = i.d(a10);
        float[] fArr = c.f12391b;
        double d11 = (double) 0.33333334f;
        return new o(i.c(j10), (float) Math.pow((double) c.a(0, g10, f10, d10, fArr), d11), (float) Math.pow((double) c.a(1, g10, f10, d10, fArr), d11), (float) Math.pow((double) c.a(2, g10, f10, d10, fArr), d11));
    }
}
