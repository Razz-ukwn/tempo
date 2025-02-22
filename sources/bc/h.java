package bc;

import ag.g0;
import ff.m;
import java.util.ArrayList;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.o;
import lf.e;
import lf.i;
import mb.a;
import mb.b;
import rb.c;
import rf.p;

@e(c = "com.lassi.presentation.docs.DocsViewModel$fetchDocs$1", f = "DocsViewModel.kt", l = {20, 23}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f3621b;

    @e(c = "com.lassi.presentation.docs.DocsViewModel$fetchDocs$1$1", f = "DocsViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<g<? super mb.b<? extends ArrayList<nb.b>>>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f3622a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, d<? super a> dVar) {
            super(2, dVar);
            this.f3622a = iVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f3622a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            this.f3622a.f3625f.i(new a.b());
            return m.f8717a;
        }
    }

    public static final class b<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f3623a;

        public b(i iVar) {
            this.f3623a = iVar;
        }

        public final Object m(Object obj, d dVar) {
            mb.b bVar = (mb.b) obj;
            boolean z10 = bVar instanceof b.c;
            i iVar = this.f3623a;
            if (z10) {
                iVar.f3625f.i(new a.c(((b.c) bVar).f11375a));
            } else if (bVar instanceof b.a) {
                iVar.f3625f.i(new a.C0215a(((b.a) bVar).f11373a));
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, d<? super h> dVar) {
        super(2, dVar);
        this.f3621b = iVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f3621b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f3620a;
        i iVar = this.f3621b;
        if (i8 == 0) {
            cb.b.J(obj);
            c cVar = iVar.f3624e;
            this.f3620a = 1;
            obj = cVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else if (i8 == 2) {
            cb.b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o oVar = new o(new a(iVar, (d<? super a>) null), (f) obj);
        b bVar = new b(iVar);
        this.f3620a = 2;
        if (oVar.a(bVar, this) == aVar) {
            return aVar;
        }
        return m.f8717a;
    }
}
