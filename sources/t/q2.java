package t;

import java.util.Iterator;
import tf.a;

public final class q2 implements Iterator<Object>, a {

    /* renamed from: a  reason: collision with root package name */
    public int f15215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15216b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p2 f15217c;

    public q2(int i8, int i10, p2 p2Var) {
        this.f15216b = i10;
        this.f15217c = p2Var;
        this.f15215a = i8;
    }

    public final boolean hasNext() {
        return this.f15215a < this.f15216b;
    }

    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        p2 p2Var = this.f15217c;
        Object[] objArr = p2Var.f15189c;
        int i8 = this.f15215a;
        this.f15215a = i8 + 1;
        return objArr[p2Var.h(i8)];
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
