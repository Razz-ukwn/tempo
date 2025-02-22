package zd;

import androidx.recyclerview.widget.k;
import java.util.List;
import sf.j;

public final class b<T> extends k.b {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f17944a;

    /* renamed from: b  reason: collision with root package name */
    public final List<T> f17945b;

    public b(List<? extends T> list, List<? extends T> list2) {
        j.f(list, "oldList");
        this.f17944a = list;
        this.f17945b = list2;
    }

    public final boolean a(int i8, int i10) {
        return j.a(this.f17944a.get(i8), this.f17945b.get(i10));
    }

    public final boolean b(int i8, int i10) {
        return j.a(this.f17944a.get(i8), this.f17945b.get(i10));
    }

    public final int d() {
        return this.f17945b.size();
    }

    public final int e() {
        return this.f17944a.size();
    }
}
