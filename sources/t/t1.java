package t;

import jf.f;
import sf.j;

public final class t1<T> implements s1<T>, j1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f15232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j1<T> f15233b;

    public t1(j1<T> j1Var, f fVar) {
        j.f(j1Var, "state");
        j.f(fVar, "coroutineContext");
        this.f15232a = fVar;
        this.f15233b = j1Var;
    }

    public final f f0() {
        return this.f15232a;
    }

    public final T getValue() {
        return this.f15233b.getValue();
    }

    public final void setValue(T t2) {
        this.f15233b.setValue(t2);
    }
}
