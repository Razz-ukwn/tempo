package ke;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import gf.m;
import java.util.ArrayList;
import java.util.List;
import me.a;
import sf.j;

public abstract class n<VH extends RecyclerView.b0, T extends a> extends RecyclerView.e<VH> {

    /* renamed from: d  reason: collision with root package name */
    public List<? extends T> f10462d;

    /* renamed from: e  reason: collision with root package name */
    public List<Uri> f10463e;

    public n(List list, ArrayList arrayList) {
        j.f(list, "items");
        j.f(arrayList, "selectedPaths");
        this.f10462d = list;
        this.f10463e = arrayList;
    }

    public final boolean p(T t2) {
        return this.f10463e.contains(t2.a());
    }

    public final void q() {
        this.f10463e.clear();
        List<Uri> list = this.f10463e;
        Iterable<a> iterable = this.f10462d;
        ArrayList arrayList = new ArrayList(m.n0(iterable));
        for (a a10 : iterable) {
            arrayList.add(a10.a());
        }
        list.addAll(arrayList);
        g();
    }

    public final void r(List list, ArrayList arrayList) {
        j.f(list, "items");
        j.f(arrayList, "selectedPaths");
        this.f10462d = list;
        this.f10463e = arrayList;
        g();
    }

    public final void s(T t2) {
        j.f(t2, "item");
        if (this.f10463e.contains(t2.a())) {
            this.f10463e.remove(t2.a());
        } else {
            this.f10463e.add(t2.a());
        }
    }
}
