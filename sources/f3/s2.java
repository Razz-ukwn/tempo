package f3;

import gf.s;
import java.util.Arrays;
import java.util.List;
import sf.j;

public final class s2<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final s2<Object> f8481e = new s2<>(0, s.f8978a);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8482a;

    /* renamed from: b  reason: collision with root package name */
    public final List<T> f8483b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8484c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f8485d;

    public s2() {
        throw null;
    }

    public s2(int i8, List<? extends T> list) {
        j.f(list, "data");
        this.f8482a = new int[]{i8};
        this.f8483b = list;
        this.f8484c = i8;
        this.f8485d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.a(s2.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            s2 s2Var = (s2) obj;
            return Arrays.equals(this.f8482a, s2Var.f8482a) && j.a(this.f8483b, s2Var.f8483b) && this.f8484c == s2Var.f8484c && j.a(this.f8485d, s2Var.f8485d);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
    }

    public final int hashCode() {
        int hashCode = (((this.f8483b.hashCode() + (Arrays.hashCode(this.f8482a) * 31)) * 31) + this.f8484c) * 31;
        List<Integer> list = this.f8485d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f8482a) + ", data=" + this.f8483b + ", hintOriginalPageOffset=" + this.f8484c + ", hintOriginalIndices=" + this.f8485d + ')';
    }
}
