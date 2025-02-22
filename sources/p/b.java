package p;

import androidx.databinding.a;
import d2.f1;
import i0.i;
import j0.c;
import j0.g;
import q.o;
import rf.l;
import sf.j;
import sf.k;

public final class b extends k implements l<o, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f12389a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(1);
        this.f12389a = cVar;
    }

    public final Object invoke(Object obj) {
        o oVar = (o) obj;
        j.f(oVar, "it");
        double d10 = (double) 3.0f;
        float pow = (float) Math.pow((double) oVar.f12758b, d10);
        float pow2 = (float) Math.pow((double) oVar.f12759c, d10);
        float pow3 = (float) Math.pow((double) oVar.f12760d, d10);
        float[] fArr = c.f12392c;
        float a10 = c.a(0, pow, pow2, pow3, fArr);
        float a11 = c.a(1, pow, pow2, pow3, fArr);
        float a12 = c.a(2, pow, pow2, pow3, fArr);
        return new i(i.a(a.e(f1.p(a10, -2.0f, 2.0f), f1.p(a11, -2.0f, 2.0f), f1.p(a12, -2.0f, 2.0f), f1.p(oVar.f12757a, 0.0f, 1.0f), g.f9689d), this.f12389a));
    }
}
