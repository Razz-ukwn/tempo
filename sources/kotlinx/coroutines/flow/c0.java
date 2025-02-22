package kotlinx.coroutines.flow;

import ag.g0;
import androidx.compose.ui.platform.b3;
import dg.w;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.internal.v;
import lf.e;
import lf.i;
import rf.p;

@e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
public final class c0 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10516a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f10517b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object> f10518c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j0<Object> f10519d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f10520e;

    @e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<Integer, d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ int f10521a;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f10521a = ((Number) obj).intValue();
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(Integer.valueOf(((Number) obj).intValue()), (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            return Boolean.valueOf(this.f10521a > 0);
        }
    }

    @e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
    public static final class b extends i implements p<s0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f10522a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10523b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f<Object> f10524c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j0<Object> f10525d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f10526e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f<Object> fVar, j0<Object> j0Var, Object obj, d<? super b> dVar) {
            super(2, dVar);
            this.f10524c = fVar;
            this.f10525d = j0Var;
            this.f10526e = obj;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f10524c, this.f10525d, this.f10526e, dVar);
            bVar.f10523b = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((s0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f10522a;
            if (i8 == 0) {
                cb.b.J(obj);
                int ordinal = ((s0) this.f10523b).ordinal();
                j0<Object> j0Var = this.f10525d;
                if (ordinal == 0) {
                    this.f10522a = 1;
                    if (this.f10524c.a(j0Var, this) == aVar) {
                        return aVar;
                    }
                } else if (ordinal == 2) {
                    v vVar = b3.f1265e;
                    Object obj2 = this.f10526e;
                    if (obj2 == vVar) {
                        j0Var.c();
                    } else {
                        j0Var.h(obj2);
                    }
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(t0 t0Var, f<Object> fVar, j0<Object> j0Var, Object obj, d<? super c0> dVar) {
        super(2, dVar);
        this.f10517b = t0Var;
        this.f10518c = fVar;
        this.f10519d = j0Var;
        this.f10520e = obj;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c0(this.f10517b, this.f10518c, this.f10519d, this.f10520e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f10516a;
        f<Object> fVar = this.f10518c;
        j0<Object> j0Var = this.f10519d;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    cb.b.J(obj);
                } else if (!(i8 == 3 || i8 == 4)) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            cb.b.J(obj);
            return m.f8717a;
        }
        cb.b.J(obj);
        u0 u0Var = t0.a.f10645a;
        t0 t0Var = this.f10517b;
        if (t0Var == u0Var) {
            this.f10516a = 1;
            if (fVar.a(j0Var, this) == aVar) {
                return aVar;
            }
        } else if (t0Var == t0.a.f10646b) {
            w j10 = j0Var.j();
            a aVar2 = new a((d<? super a>) null);
            this.f10516a = 2;
            if (cb.d.B(j10, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            f y10 = cb.d.y(t0Var.a(j0Var.j()));
            b bVar = new b(fVar, j0Var, this.f10520e, (d<? super b>) null);
            this.f10516a = 4;
            if (cb.d.t(y10, bVar, this) == aVar) {
                return aVar;
            }
        }
        return m.f8717a;
        this.f10516a = 3;
        if (fVar.a(j0Var, this) == aVar) {
            return aVar;
        }
        return m.f8717a;
    }
}
