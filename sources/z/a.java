package z;

import java.util.ArrayList;
import rf.c;
import rf.e;
import rf.f;
import rf.g;
import rf.h;
import rf.i;
import rf.j;
import rf.k;
import rf.m;
import rf.n;
import rf.p;
import rf.q;
import rf.r;
import rf.s;
import rf.t;
import rf.u;
import rf.v;
import rf.w;
import sf.y;
import t.w1;
import t.y1;

public final class a implements p, q, r, s, t, u, v, w, rf.b, c, e, f, g, h, i, j, k, m, n {

    /* renamed from: a  reason: collision with root package name */
    public final int f17575a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17576b;

    /* renamed from: c  reason: collision with root package name */
    public Object f17577c;

    /* renamed from: d  reason: collision with root package name */
    public w1 f17578d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f17579e;

    /* renamed from: z.a$a  reason: collision with other inner class name */
    public static final class C0327a extends sf.k implements p<t.h, Integer, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f17580a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f17581b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f17582c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0327a(a aVar, Object obj, int i8) {
            super(2);
            this.f17580a = aVar;
            this.f17581b = obj;
            this.f17582c = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            t.h hVar = (t.h) obj;
            ((Number) obj2).intValue();
            sf.j.f(hVar, "nc");
            this.f17580a.b(this.f17581b, hVar, this.f17582c | 1);
            return ff.m.f8717a;
        }
    }

    public static final class b extends sf.k implements p<t.h, Integer, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f17583a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f17584b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f17585c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f17586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, Object obj, Object obj2, int i8) {
            super(2);
            this.f17583a = aVar;
            this.f17584b = obj;
            this.f17585c = obj2;
            this.f17586d = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            t.h hVar = (t.h) obj;
            ((Number) obj2).intValue();
            sf.j.f(hVar, "nc");
            Object obj3 = this.f17584b;
            Object obj4 = this.f17585c;
            this.f17583a.a(obj3, obj4, hVar, this.f17586d | 1);
            return ff.m.f8717a;
        }
    }

    public a(int i8, boolean z10) {
        this.f17575a = i8;
        this.f17576b = z10;
    }

    public final Object a(Object obj, Object obj2, t.h hVar, int i8) {
        sf.j.f(hVar, "c");
        t.i g10 = hVar.g(this.f17575a);
        c(g10);
        int a10 = g10.p(this) ? b.a(2, 2) : b.a(1, 2);
        Object obj3 = this.f17577c;
        sf.j.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        y.c(4, obj3);
        Object k10 = ((r) obj3).k(obj, obj2, g10, Integer.valueOf(a10 | i8));
        y1 G = g10.G();
        if (G != null) {
            G.f15286d = new b(this, obj, obj2, i8);
        }
        return k10;
    }

    public final Object b(Object obj, t.h hVar, int i8) {
        sf.j.f(hVar, "c");
        t.i g10 = hVar.g(this.f17575a);
        c(g10);
        int a10 = g10.p(this) ? b.a(2, 1) : b.a(1, 1);
        Object obj2 = this.f17577c;
        sf.j.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        y.c(3, obj2);
        Object e10 = ((q) obj2).e(obj, g10, Integer.valueOf(a10 | i8));
        y1 G = g10.G();
        if (G != null) {
            G.f15286d = new C0327a(this, obj, i8);
        }
        return e10;
    }

    public final void c(t.h hVar) {
        y1 b10;
        if (this.f17576b && (b10 = hVar.b()) != null) {
            hVar.m(b10);
            if (b.d(this.f17578d, b10)) {
                this.f17578d = b10;
                return;
            }
            ArrayList arrayList = this.f17579e;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f17579e = arrayList2;
                arrayList2.add(b10);
                return;
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (b.d((w1) arrayList.get(i8), b10)) {
                    arrayList.set(i8, b10);
                    return;
                }
            }
            arrayList.add(b10);
        }
    }

    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return b(obj, (t.h) obj2, ((Number) obj3).intValue());
    }

    public final void g(sf.k kVar) {
        sf.j.f(kVar, "block");
        if (!sf.j.a(this.f17577c, kVar)) {
            boolean z10 = this.f17577c == null;
            this.f17577c = kVar;
            if (!z10 && this.f17576b) {
                w1 w1Var = this.f17578d;
                if (w1Var != null) {
                    w1Var.invalidate();
                    this.f17578d = null;
                }
                ArrayList arrayList = this.f17579e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((w1) arrayList.get(i8)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        t.h hVar = (t.h) obj;
        int intValue = ((Number) obj2).intValue();
        sf.j.f(hVar, "c");
        t.i g10 = hVar.g(this.f17575a);
        c(g10);
        int a10 = intValue | (g10.p(this) ? b.a(2, 0) : b.a(1, 0));
        Object obj3 = this.f17577c;
        sf.j.d(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        y.c(2, obj3);
        Object invoke = ((p) obj3).invoke(g10, Integer.valueOf(a10));
        y1 G = g10.G();
        if (G != null) {
            y.c(2, this);
            G.f15286d = this;
        }
        return invoke;
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(obj, obj2, (t.h) obj3, ((Number) obj4).intValue());
    }
}
