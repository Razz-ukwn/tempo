package t;

import b0.g0;
import b0.h;
import b0.h0;
import b0.m;
import b0.t;
import sf.j;

public class r2<T> implements g0, t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s2<T> f15223a;

    /* renamed from: b  reason: collision with root package name */
    public a<T> f15224b;

    public static final class a<T> extends h0 {

        /* renamed from: c  reason: collision with root package name */
        public T f15225c;

        public a(T t2) {
            this.f15225c = t2;
        }

        public final void a(h0 h0Var) {
            this.f15225c = ((a) h0Var).f15225c;
        }

        public final h0 b() {
            return new a(this.f15225c);
        }
    }

    public r2(T t2, s2<T> s2Var) {
        j.f(s2Var, "policy");
        this.f15223a = s2Var;
        this.f15224b = new a<>(t2);
    }

    public final s2<T> a() {
        return this.f15223a;
    }

    public final h0 c() {
        return this.f15224b;
    }

    public final T getValue() {
        return ((a) m.q(this.f15224b, this)).f15225c;
    }

    public final h0 h(h0 h0Var, h0 h0Var2, h0 h0Var3) {
        a aVar = (a) h0Var;
        if (this.f15223a.a(((a) h0Var2).f15225c, ((a) h0Var3).f15225c)) {
            return h0Var2;
        }
        return null;
    }

    public final void i(h0 h0Var) {
        this.f15224b = (a) h0Var;
    }

    public final void setValue(T t2) {
        h i8;
        a aVar = (a) m.h(this.f15224b);
        if (!this.f15223a.a(aVar.f15225c, t2)) {
            a<T> aVar2 = this.f15224b;
            synchronized (m.f2942c) {
                i8 = m.i();
                ((a) m.m(aVar2, this, i8, aVar)).f15225c = t2;
                ff.m mVar = ff.m.f8717a;
            }
            m.l(i8, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((a) m.h(this.f15224b)).f15225c + ")@" + hashCode();
    }
}
