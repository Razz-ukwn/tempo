package androidx.lifecycle;

import ag.g0;
import ag.k;
import ag.l;
import ag.n1;
import androidx.lifecycle.j;
import cb.b;
import d2.f1;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import jf.f;
import kotlinx.coroutines.sync.c;
import lf.e;
import lf.i;
import rf.p;
import sf.v;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements n {
    public final /* synthetic */ c B;
    public final /* synthetic */ p<g0, d<? super m>, Object> C;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j.a f2217a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v<n1> f2218b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f2219c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j.a f2220d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k<m> f2221e;

    @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public c f2222a;

        /* renamed from: b  reason: collision with root package name */
        public p f2223b;

        /* renamed from: c  reason: collision with root package name */
        public int f2224c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f2225d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p<g0, d<? super m>, Object> f2226e;

        @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        public static final class C0025a extends i implements p<g0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f2227a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f2228b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ p<g0, d<? super m>, Object> f2229c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0025a(p<? super g0, ? super d<? super m>, ? extends Object> pVar, d<? super C0025a> dVar) {
                super(2, dVar);
                this.f2229c = pVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                C0025a aVar = new C0025a(this.f2229c, dVar);
                aVar.f2228b = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0025a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f2227a;
                if (i8 == 0) {
                    b.J(obj);
                    this.f2227a = 1;
                    if (this.f2229c.invoke((g0) this.f2228b, this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    b.J(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, p<? super g0, ? super d<? super m>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f2225d = cVar;
            this.f2226e = pVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f2225d, this.f2226e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            c cVar;
            c cVar2;
            p<g0, d<? super m>, Object> pVar;
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f2224c;
            if (i8 == 0) {
                b.J(obj);
                c cVar3 = this.f2225d;
                this.f2222a = cVar3;
                pVar = this.f2226e;
                this.f2223b = pVar;
                this.f2224c = 1;
                if (cVar3.b(this) == aVar) {
                    return aVar;
                }
                cVar = cVar3;
            } else if (i8 == 1) {
                pVar = this.f2223b;
                cVar = this.f2222a;
                b.J(obj);
            } else if (i8 == 2) {
                cVar2 = this.f2222a;
                try {
                    b.J(obj);
                    m mVar = m.f8717a;
                    cVar2.a((Object) null);
                    return m.f8717a;
                } catch (Throwable th) {
                    th = th;
                    cVar = cVar2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C0025a aVar2 = new C0025a(pVar, (d<? super C0025a>) null);
                this.f2222a = cVar;
                this.f2223b = null;
                this.f2224c = 2;
                if (f1.v(aVar2, this) == aVar) {
                    return aVar;
                }
                cVar2 = cVar;
                m mVar2 = m.f8717a;
                cVar2.a((Object) null);
                return m.f8717a;
            } catch (Throwable th2) {
                th = th2;
                cVar.a((Object) null);
                throw th;
            }
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(j.a aVar, v vVar, g0 g0Var, j.a aVar2, l lVar, kotlinx.coroutines.sync.d dVar, p pVar) {
        this.f2217a = aVar;
        this.f2218b = vVar;
        this.f2219c = g0Var;
        this.f2220d = aVar2;
        this.f2221e = lVar;
        this.B = dVar;
        this.C = pVar;
    }

    public final void d(p pVar, j.a aVar) {
        j.a aVar2 = this.f2217a;
        v<n1> vVar = this.f2218b;
        if (aVar == aVar2) {
            vVar.f14957a = b.D(this.f2219c, (f.b) null, 0, new a(this.B, this.C, (d<? super a>) null), 3);
            return;
        }
        if (aVar == this.f2220d) {
            n1 n1Var = (n1) vVar.f14957a;
            if (n1Var != null) {
                n1Var.e((CancellationException) null);
            }
            vVar.f14957a = null;
        }
        if (aVar == j.a.ON_DESTROY) {
            this.f2221e.resumeWith(m.f8717a);
        }
    }
}
