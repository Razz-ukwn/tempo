package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import c2.e;
import o.d;
import o.f;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final f<RecyclerView.b0, a> f2609a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final d<RecyclerView.b0> f2610b = new d<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final e f2611d = new e(20);

        /* renamed from: a  reason: collision with root package name */
        public int f2612a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.j.c f2613b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.j.c f2614c;

        public static a a() {
            a aVar = (a) f2611d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.b0 b0Var, RecyclerView.j.c cVar) {
        f<RecyclerView.b0, a> fVar = this.f2609a;
        a orDefault = fVar.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            fVar.put(b0Var, orDefault);
        }
        orDefault.f2614c = cVar;
        orDefault.f2612a |= 8;
    }

    public final RecyclerView.j.c b(RecyclerView.b0 b0Var, int i8) {
        a m;
        RecyclerView.j.c cVar;
        f<RecyclerView.b0, a> fVar = this.f2609a;
        int e10 = fVar.e(b0Var);
        if (e10 >= 0 && (m = fVar.m(e10)) != null) {
            int i10 = m.f2612a;
            if ((i10 & i8) != 0) {
                int i11 = i10 & (~i8);
                m.f2612a = i11;
                if (i8 == 4) {
                    cVar = m.f2613b;
                } else if (i8 == 8) {
                    cVar = m.f2614c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    fVar.k(e10);
                    m.f2612a = 0;
                    m.f2613b = null;
                    m.f2614c = null;
                    a.f2611d.a(m);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.b0 b0Var) {
        a orDefault = this.f2609a.getOrDefault(b0Var, null);
        if (orDefault != null) {
            orDefault.f2612a &= -2;
        }
    }

    public final void d(RecyclerView.b0 b0Var) {
        d<RecyclerView.b0> dVar = this.f2610b;
        int k10 = dVar.k() - 1;
        while (true) {
            if (k10 < 0) {
                break;
            } else if (b0Var == dVar.l(k10)) {
                Object[] objArr = dVar.f12021c;
                Object obj = objArr[k10];
                Object obj2 = d.f12018e;
                if (obj != obj2) {
                    objArr[k10] = obj2;
                    dVar.f12019a = true;
                }
            } else {
                k10--;
            }
        }
        a remove = this.f2609a.remove(b0Var);
        if (remove != null) {
            remove.f2612a = 0;
            remove.f2613b = null;
            remove.f2614c = null;
            a.f2611d.a(remove);
        }
    }
}
