package cc;

import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.HashSet;
import mb.a;
import nb.b;
import sf.j;
import yb.c;

public final class d extends c {

    /* renamed from: e  reason: collision with root package name */
    public final rb.d f3964e;

    /* renamed from: f  reason: collision with root package name */
    public final v<ArrayList<b>> f3965f = new v<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<b> f3966g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final v<a<ArrayList<b>>> f3967h = new v<>();

    public d(rb.d dVar) {
        j.f(dVar, "selectedMediaRepository");
        this.f3964e = dVar;
    }

    public final void e(ArrayList<b> arrayList) {
        j.f(arrayList, "selectedMedias");
        this.f3966g = arrayList;
        HashSet hashSet = new HashSet();
        ArrayList<b> arrayList2 = new ArrayList<>();
        for (T next : arrayList) {
            if (hashSet.add(((b) next).f11620c)) {
                arrayList2.add(next);
            }
        }
        this.f3966g = arrayList2;
        this.f3965f.k(arrayList2);
    }
}
