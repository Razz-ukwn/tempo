package t;

import ag.g0;
import ff.m;
import jf.d;
import jf.f;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
public final class v2 extends i implements p<s1<Object>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15255a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15256b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f15257c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.f<Object> f15258d;

    public static final class a implements g<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s1<Object> f15259a;

        public a(s1<Object> s1Var) {
            this.f15259a = s1Var;
        }

        public final Object m(Object obj, d<? super m> dVar) {
            this.f15259a.setValue(obj);
            return m.f8717a;
        }
    }

    @e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    public static final class b extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f15260a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.f<Object> f15261b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ s1<Object> f15262c;

        public static final class a implements g<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ s1<Object> f15263a;

            public a(s1<Object> s1Var) {
                this.f15263a = s1Var;
            }

            public final Object m(Object obj, d<? super m> dVar) {
                this.f15263a.setValue(obj);
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(kotlinx.coroutines.flow.f<Object> fVar, s1<Object> s1Var, d<? super b> dVar) {
            super(2, dVar);
            this.f15261b = fVar;
            this.f15262c = s1Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f15261b, this.f15262c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f15260a;
            if (i8 == 0) {
                cb.b.J(obj);
                a aVar2 = new a(this.f15262c);
                this.f15260a = 1;
                if (this.f15261b.a(aVar2, this) == aVar) {
                    return aVar;
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
    public v2(f fVar, kotlinx.coroutines.flow.f<Object> fVar2, d<? super v2> dVar) {
        super(2, dVar);
        this.f15257c = fVar;
        this.f15258d = fVar2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        v2 v2Var = new v2(this.f15257c, this.f15258d, dVar);
        v2Var.f15256b = obj;
        return v2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v2) create((s1) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f15255a;
        if (i8 == 0) {
            cb.b.J(obj);
            s1 s1Var = (s1) this.f15256b;
            jf.g gVar = jf.g.f10014a;
            f fVar = this.f15257c;
            boolean a10 = j.a(fVar, gVar);
            kotlinx.coroutines.flow.f<Object> fVar2 = this.f15258d;
            if (a10) {
                a aVar2 = new a(s1Var);
                this.f15255a = 1;
                if (fVar2.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                b bVar = new b(fVar2, s1Var, (d<? super b>) null);
                this.f15255a = 2;
                if (cb.b.M(fVar, bVar, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i8 == 1 || i8 == 2) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
