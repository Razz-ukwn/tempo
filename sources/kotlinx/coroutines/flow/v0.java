package kotlinx.coroutines.flow;

import cb.b;
import ff.m;
import jf.d;
import lf.c;
import lf.e;
import lf.i;
import rf.p;
import sf.r;

public final class v0 implements t0 {

    @e(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    public static final class a extends i implements p<g<? super s0>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f10657a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10658b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x0<Integer> f10659c;

        /* renamed from: kotlinx.coroutines.flow.v0$a$a  reason: collision with other inner class name */
        public static final class C0198a<T> implements g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r f10660a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g<s0> f10661b;

            @e(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: kotlinx.coroutines.flow.v0$a$a$a  reason: collision with other inner class name */
            public static final class C0199a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f10662a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ C0198a<T> f10663b;

                /* renamed from: c  reason: collision with root package name */
                public int f10664c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0199a(C0198a<? super T> aVar, d<? super C0199a> dVar) {
                    super(dVar);
                    this.f10663b = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f10662a = obj;
                    this.f10664c |= Integer.MIN_VALUE;
                    return this.f10663b.a(0, this);
                }
            }

            public C0198a(r rVar, g<? super s0> gVar) {
                this.f10660a = rVar;
                this.f10661b = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object a(int r5, jf.d<? super ff.m> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.v0.a.C0198a.C0199a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    kotlinx.coroutines.flow.v0$a$a$a r0 = (kotlinx.coroutines.flow.v0.a.C0198a.C0199a) r0
                    int r1 = r0.f10664c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f10664c = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.v0$a$a$a r0 = new kotlinx.coroutines.flow.v0$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f10662a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f10664c
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r6)
                    goto L_0x0049
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    cb.b.J(r6)
                    if (r5 <= 0) goto L_0x004c
                    sf.r r5 = r4.f10660a
                    boolean r6 = r5.f14953a
                    if (r6 != 0) goto L_0x004c
                    r5.f14953a = r3
                    kotlinx.coroutines.flow.s0 r5 = kotlinx.coroutines.flow.s0.f10635a
                    r0.f10664c = r3
                    kotlinx.coroutines.flow.g<kotlinx.coroutines.flow.s0> r6 = r4.f10661b
                    java.lang.Object r5 = r6.m(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    ff.m r5 = ff.m.f8717a
                    return r5
                L_0x004c:
                    ff.m r5 = ff.m.f8717a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v0.a.C0198a.a(int, jf.d):java.lang.Object");
            }

            public final /* bridge */ /* synthetic */ Object m(Object obj, d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x0<Integer> x0Var, d<? super a> dVar) {
            super(2, dVar);
            this.f10659c = x0Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f10659c, dVar);
            aVar.f10658b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            ((a) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
            return kf.a.f10464a;
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f10657a;
            if (i8 == 0) {
                b.J(obj);
                C0198a aVar2 = new C0198a(new r(), (g) this.f10658b);
                this.f10657a = 1;
                if (this.f10659c.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b.J(obj);
            }
            throw new ab.r();
        }
    }

    public final f<s0> a(x0<Integer> x0Var) {
        return new n0(new a(x0Var, (d<? super a>) null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
