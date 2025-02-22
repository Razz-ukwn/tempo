package f3;

import ag.g0;
import cb.b;
import f3.f2;
import ff.m;
import jf.d;
import jf.f;
import lf.e;
import lf.i;
import rf.p;

public final class l0<Key, Value> extends f2<Key, Value> {

    /* renamed from: b  reason: collision with root package name */
    public int f8326b;

    @e(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {111}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super f2.b.C0140b<Key, Value>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8327a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l0<Key, Value> f8328b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x<Key> f8329c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f2.a<Key> f8330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l0<Key, Value> l0Var, x<Key> xVar, f2.a<Key> aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f8328b = l0Var;
            this.f8329c = xVar;
            this.f8330d = aVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f8328b, this.f8329c, this.f8330d, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i8 = this.f8327a;
            if (i8 == 0) {
                b.J(obj);
                this.f8328b.getClass();
                this.f8327a = 1;
                throw null;
            } else if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b.J(obj);
                ((w) obj).getClass();
                throw null;
            }
        }
    }

    public final boolean a() {
        throw null;
    }

    public final Key b(g2<Key, Value> g2Var) {
        throw null;
    }

    public final Object c(f2.a<Key> aVar, d<? super f2.b<Key, Value>> dVar) {
        o0 o0Var;
        boolean z10 = aVar instanceof f2.a.c;
        if (z10) {
            o0Var = o0.f8397a;
        } else if (aVar instanceof f2.a.C0139a) {
            o0Var = o0.f8399c;
        } else if (aVar instanceof f2.a.b) {
            o0Var = o0.f8398b;
        } else {
            throw new ff.e();
        }
        if (this.f8326b == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            int i8 = aVar.f8220a;
            if (z10 && i8 % 3 == 0) {
                i8 /= 3;
            }
            this.f8326b = i8;
        }
        return b.M((f) null, new a(this, new x(o0Var, aVar.a()), aVar, (d<? super a>) null), dVar);
    }
}
