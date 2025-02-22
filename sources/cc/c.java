package cc;

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
import rf.p;

@e(c = "com.lassi.presentation.media.SelectedMediaViewModel$getSelectedMediaData$1", f = "SelectedMediaViewModel.kt", l = {37, 39}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3959a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3960b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3961c;

    @e(c = "com.lassi.presentation.media.SelectedMediaViewModel$getSelectedMediaData$1$1", f = "SelectedMediaViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<g<? super mb.b<? extends ArrayList<nb.b>>>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3962a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, d<? super a> dVar2) {
            super(2, dVar2);
            this.f3962a = dVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f3962a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            this.f3962a.f3967h.k(new a.b());
            return m.f8717a;
        }
    }

    public static final class b<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3963a;

        public b(d dVar) {
            this.f3963a = dVar;
        }

        public final Object m(Object obj, d dVar) {
            mb.b bVar = (mb.b) obj;
            boolean z10 = bVar instanceof b.c;
            d dVar2 = this.f3963a;
            if (z10) {
                dVar2.f3967h.i(new a.c((ArrayList) ((b.c) bVar).f11375a));
            } else if (bVar instanceof b.a) {
                dVar2.f3967h.k(new a.C0215a(((b.a) bVar).f11373a));
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, d<? super c> dVar2) {
        super(2, dVar2);
        this.f3960b = dVar;
        this.f3961c = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f3960b, this.f3961c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f3959a;
        d dVar = this.f3960b;
        if (i8 == 0) {
            cb.b.J(obj);
            rb.d dVar2 = dVar.f3964e;
            this.f3959a = 1;
            obj = dVar2.a(this.f3961c);
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
        o oVar = new o(new a(dVar, (d<? super a>) null), (f) obj);
        b bVar = new b(dVar);
        this.f3959a = 2;
        if (oVar.a(bVar, this) == aVar) {
            return aVar;
        }
        return m.f8717a;
    }
}
