package lf;

import jf.d;
import sf.g;
import sf.j;
import sf.w;
import sf.x;

public abstract class i extends c implements g<Object> {
    private final int arity;

    public i(int i8, d<Object> dVar) {
        super(dVar);
        this.arity = i8;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        w.f14958a.getClass();
        String a10 = x.a(this);
        j.e(a10, "renderLambdaToString(this)");
        return a10;
    }

    public i(int i8) {
        this(i8, (d<Object>) null);
    }
}
