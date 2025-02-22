package androidx.databinding;

import ag.f2;
import ag.g0;
import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import cb.b;
import d2.f1;
import ff.m;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import jf.d;
import jf.f;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;

public final class i {

    public static final class a implements g<f<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<p> f1773a;

        /* renamed from: b  reason: collision with root package name */
        public f2 f1774b;

        /* renamed from: c  reason: collision with root package name */
        public final j<f<Object>> f1775c;

        @e(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", l = {95}, m = "invokeSuspend")
        /* renamed from: androidx.databinding.i$a$a  reason: collision with other inner class name */
        public static final class C0020a extends lf.i implements rf.p<g0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f1776a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ p f1777b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ f<Object> f1778c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f1779d;

            @e(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", l = {123}, m = "invokeSuspend")
            /* renamed from: androidx.databinding.i$a$a$a  reason: collision with other inner class name */
            public static final class C0021a extends lf.i implements rf.p<g0, d<? super m>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public int f1780a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ f<Object> f1781b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f1782c;

                /* renamed from: androidx.databinding.i$a$a$a$a  reason: collision with other inner class name */
                public static final class C0022a implements g<Object> {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ a f1783a;

                    public C0022a(a aVar) {
                        this.f1783a = aVar;
                    }

                    public final Object m(Object obj, d<? super m> dVar) {
                        a aVar = this.f1783a;
                        j<f<Object>> jVar = aVar.f1775c;
                        ViewDataBinding viewDataBinding = (ViewDataBinding) jVar.get();
                        if (viewDataBinding == null) {
                            jVar.a();
                        }
                        if (viewDataBinding != null) {
                            j<f<Object>> jVar2 = aVar.f1775c;
                            int i8 = jVar2.f1785b;
                            T t2 = jVar2.f1786c;
                            if (!viewDataBinding.O && viewDataBinding.s(t2, i8, 0)) {
                                viewDataBinding.u();
                            }
                        }
                        return m.f8717a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0021a(f<? extends Object> fVar, a aVar, d<? super C0021a> dVar) {
                    super(2, dVar);
                    this.f1781b = fVar;
                    this.f1782c = aVar;
                }

                public final d<m> create(Object obj, d<?> dVar) {
                    return new C0021a(this.f1781b, this.f1782c, dVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C0021a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
                }

                public final Object invokeSuspend(Object obj) {
                    kf.a aVar = kf.a.f10464a;
                    int i8 = this.f1780a;
                    if (i8 == 0) {
                        b.J(obj);
                        C0022a aVar2 = new C0022a(this.f1782c);
                        this.f1780a = 1;
                        if (this.f1781b.a(aVar2, this) == aVar) {
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
            public C0020a(p pVar, f<? extends Object> fVar, a aVar, d<? super C0020a> dVar) {
                super(2, dVar);
                this.f1777b = pVar;
                this.f1778c = fVar;
                this.f1779d = aVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new C0020a(this.f1777b, this.f1778c, this.f1779d, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0020a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f1776a;
                if (i8 == 0) {
                    b.J(obj);
                    j b10 = this.f1777b.b();
                    sf.j.e(b10, "owner.lifecycle");
                    j.b bVar = j.b.f2280d;
                    C0021a aVar2 = new C0021a(this.f1778c, this.f1779d, (d<? super C0021a>) null);
                    this.f1776a = 1;
                    if (b10.b() == j.b.f2277a) {
                        obj2 = m.f8717a;
                    } else {
                        obj2 = f1.v(new RepeatOnLifecycleKt$repeatOnLifecycle$3(b10, bVar, aVar2, (d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), this);
                        if (obj2 != aVar) {
                            obj2 = m.f8717a;
                        }
                    }
                    if (obj2 == aVar) {
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

        public a(ViewDataBinding viewDataBinding, int i8, ReferenceQueue<ViewDataBinding> referenceQueue) {
            sf.j.f(referenceQueue, "referenceQueue");
            this.f1775c = new j<>(viewDataBinding, i8, this, referenceQueue);
        }

        public final void a(p pVar) {
            WeakReference<p> weakReference = this.f1773a;
            if ((weakReference != null ? weakReference.get() : null) != pVar) {
                f2 f2Var = this.f1774b;
                if (f2Var != null) {
                    f2Var.e((CancellationException) null);
                }
                if (pVar == null) {
                    this.f1773a = null;
                    return;
                }
                this.f1773a = new WeakReference<>(pVar);
                f fVar = (f) this.f1775c.f1786c;
                if (fVar != null) {
                    d(pVar, fVar);
                }
            }
        }

        public final void b(y0 y0Var) {
            p pVar;
            WeakReference<p> weakReference = this.f1773a;
            if (weakReference != null && (pVar = weakReference.get()) != null && y0Var != null) {
                d(pVar, y0Var);
            }
        }

        public final void c(Object obj) {
            f fVar = (f) obj;
            f2 f2Var = this.f1774b;
            if (f2Var != null) {
                f2Var.e((CancellationException) null);
            }
            this.f1774b = null;
        }

        public final void d(p pVar, f<? extends Object> fVar) {
            f2 f2Var = this.f1774b;
            if (f2Var != null) {
                f2Var.e((CancellationException) null);
            }
            this.f1774b = b.D(cb.d.I(pVar), (f.b) null, 0, new C0020a(pVar, fVar, this, (d<? super C0020a>) null), 3);
        }
    }

    static {
        new j0.f(1);
    }

    public static final void a(ViewDataBinding viewDataBinding, int i8, y0 y0Var) {
        sf.j.f(viewDataBinding, "viewDataBinding");
        viewDataBinding.O = true;
        j[] jVarArr = viewDataBinding.F;
        if (y0Var == null) {
            try {
                j jVar = jVarArr[i8];
                if (jVar != null) {
                    jVar.a();
                }
            } catch (Throwable th) {
                viewDataBinding.O = false;
                throw th;
            }
        } else {
            j jVar2 = jVarArr[i8];
            if (jVar2 == null) {
                viewDataBinding.t(i8, y0Var);
            } else if (jVar2.f1786c != y0Var) {
                if (jVar2 != null) {
                    jVar2.a();
                }
                viewDataBinding.t(i8, y0Var);
            }
        }
        viewDataBinding.O = false;
    }
}
