package androidx.lifecycle;

import ag.g0;
import ag.l;
import ag.n1;
import ag.s0;
import ag.x1;
import androidx.lifecycle.j;
import cb.b;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import kf.a;
import kotlinx.coroutines.scheduling.c;
import lf.e;
import lf.i;
import rf.p;
import sf.v;

@e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2207a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f2209c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j.b f2210d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p<g0, d<? super m>, Object> f2211e;

    @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public v f2212a;

        /* renamed from: b  reason: collision with root package name */
        public v f2213b;

        /* renamed from: c  reason: collision with root package name */
        public g0 f2214c;

        /* renamed from: d  reason: collision with root package name */
        public p f2215d;

        /* renamed from: e  reason: collision with root package name */
        public int f2216e;

        public final d<m> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(jVar, bVar, g0Var, pVar, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            v vVar;
            v vVar2;
            a aVar = a.f10464a;
            int i8 = this.f2216e;
            j jVar = jVar;
            if (i8 == 0) {
                b.J(obj);
                if (jVar.b() == j.b.f2277a) {
                    return m.f8717a;
                }
                v vVar3 = new v();
                v vVar4 = new v();
                try {
                    j.b bVar = bVar;
                    g0 g0Var = g0Var;
                    p<g0, d<? super m>, Object> pVar = pVar;
                    this.f2212a = vVar3;
                    this.f2213b = vVar4;
                    this.f2214c = g0Var;
                    this.f2215d = pVar;
                    this.f2216e = 1;
                    l lVar = new l(1, e9.c.g(this));
                    lVar.t();
                    j.a.Companion.getClass();
                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(j.a.C0026a.c(bVar), vVar3, g0Var, j.a.C0026a.a(bVar), lVar, gc.b.b(), pVar);
                    vVar4.f14957a = repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;
                    jVar.a(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1);
                    if (lVar.s() == aVar) {
                        return aVar;
                    }
                    vVar = vVar3;
                    vVar2 = vVar4;
                } catch (Throwable th) {
                    th = th;
                    vVar = vVar3;
                    vVar2 = vVar4;
                    n1 n1Var = (n1) vVar.f14957a;
                    if (n1Var != null) {
                        n1Var.e((CancellationException) null);
                    }
                    n nVar = (n) vVar2.f14957a;
                    if (nVar != null) {
                        jVar.c(nVar);
                    }
                    throw th;
                }
            } else if (i8 == 1) {
                vVar2 = this.f2213b;
                vVar = this.f2212a;
                try {
                    b.J(obj);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1 n1Var2 = (n1) vVar.f14957a;
            if (n1Var2 != null) {
                n1Var2.e((CancellationException) null);
            }
            n nVar2 = (n) vVar2.f14957a;
            if (nVar2 != null) {
                jVar.c(nVar2);
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(j jVar, j.b bVar, p<? super g0, ? super d<? super m>, ? extends Object> pVar, d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f2209c = jVar;
        this.f2210d = bVar;
        this.f2211e = pVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f2209c, this.f2210d, this.f2211e, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f2208b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f2207a;
        if (i8 == 0) {
            b.J(obj);
            final g0 g0Var = (g0) this.f2208b;
            c cVar = s0.f480a;
            x1 J0 = kotlinx.coroutines.internal.m.f10728a.J0();
            final j jVar = this.f2209c;
            final j.b bVar = this.f2210d;
            final p<g0, d<? super m>, Object> pVar = this.f2211e;
            AnonymousClass1 r32 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.f2207a = 1;
            if (b.M(J0, r32, this) == aVar) {
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
