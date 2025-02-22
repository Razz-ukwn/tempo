package q0;

import d2.f1;
import ff.m;
import gf.t;
import java.util.ArrayList;
import java.util.List;
import q0.v;
import rf.l;
import s0.a0;
import sf.j;
import sf.k;

public final class y extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    public static final y f12820a = new y();

    public static final class a extends k implements l<v.a, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12821a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((v.a) obj, "$this$layout");
            return m.f8717a;
        }
    }

    public static final class b extends k implements l<v.a, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f12822a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(v vVar) {
            super(1);
            this.f12822a = vVar;
        }

        public final Object invoke(Object obj) {
            v.a aVar = (v.a) obj;
            j.f(aVar, "$this$layout");
            v.a.f(aVar, this.f12822a);
            return m.f8717a;
        }
    }

    public static final class c extends k implements l<v.a, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List<v> f12823a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f12823a = arrayList;
        }

        public final Object invoke(Object obj) {
            v.a aVar = (v.a) obj;
            j.f(aVar, "$this$layout");
            List<v> list = this.f12823a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                v.a.f(aVar, list.get(i8));
            }
            return m.f8717a;
        }
    }

    public final o a(q qVar, List<? extends m> list, long j10) {
        j.f(qVar, "$this$measure");
        boolean isEmpty = list.isEmpty();
        t tVar = t.f8979a;
        if (isEmpty) {
            return qVar.g(f1.a.d(j10), f1.a.c(j10), tVar, a.f12821a);
        }
        if (list.size() == 1) {
            v i8 = ((m) list.get(0)).i(j10);
            return qVar.g(f1.q(i8.f12809a, f1.a.d(j10), f1.a.b(j10)), f1.q(i8.f12810b, f1.a.c(j10), f1.a.a(j10)), tVar, new b(i8));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((m) list.get(i10)).i(j10));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            v vVar = (v) arrayList.get(i13);
            i11 = Math.max(vVar.f12809a, i11);
            i12 = Math.max(vVar.f12810b, i12);
        }
        return qVar.g(f1.q(i11, f1.a.d(j10), f1.a.b(j10)), f1.q(i12, f1.a.c(j10), f1.a.a(j10)), tVar, new c(arrayList));
    }
}
