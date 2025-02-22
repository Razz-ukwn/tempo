package sf;

import java.io.Serializable;

public abstract class k<R> implements g<R>, Serializable {
    private final int arity;

    public k(int i8) {
        this.arity = i8;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        w.f14958a.getClass();
        String a10 = x.a(this);
        j.e(a10, "renderLambdaToString(this)");
        return a10;
    }
}
