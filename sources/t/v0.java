package t;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import sf.j;
import tf.a;

public final class v0 implements Iterator<Object>, a {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f15248a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15249b;

    /* renamed from: c  reason: collision with root package name */
    public int f15250c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15251d;

    public v0(int i8, int i10, n2 n2Var) {
        j.f(n2Var, "table");
        this.f15248a = n2Var;
        this.f15249b = i10;
        this.f15250c = i8;
        this.f15251d = n2Var.C;
        if (n2Var.B) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f15250c < this.f15249b;
    }

    public final Object next() {
        n2 n2Var = this.f15248a;
        int i8 = n2Var.C;
        int i10 = this.f15251d;
        if (i8 == i10) {
            int i11 = this.f15250c;
            this.f15250c = b7.a.e(n2Var.f15167a, i11) + i11;
            return new o2(i11, i10, n2Var);
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
