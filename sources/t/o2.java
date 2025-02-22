package t;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import sf.j;
import tf.a;

public final class o2 implements Iterable<Object>, a {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f15179a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15180b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15181c;

    public o2(int i8, int i10, n2 n2Var) {
        j.f(n2Var, "table");
        this.f15179a = n2Var;
        this.f15180b = i8;
        this.f15181c = i10;
    }

    public final Iterator<Object> iterator() {
        n2 n2Var = this.f15179a;
        if (n2Var.C == this.f15181c) {
            int i8 = this.f15180b;
            return new v0(i8 + 1, b7.a.e(n2Var.f15167a, i8) + i8, n2Var);
        }
        throw new ConcurrentModificationException();
    }
}
