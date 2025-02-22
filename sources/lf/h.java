package lf;

import jf.d;
import sf.g;
import sf.j;
import sf.w;
import sf.x;

public abstract class h extends g implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final int f11113a = 2;

    public h(d dVar) {
        super(dVar);
    }

    public final int getArity() {
        return this.f11113a;
    }

    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f14958a.getClass();
        String a10 = x.a(this);
        j.e(a10, "renderLambdaToString(this)");
        return a10;
    }
}
