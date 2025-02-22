package i3;

import ag.c0;
import ag.g0;
import cg.f;
import cg.h;
import d2.f1;
import ff.m;
import i3.k;
import java.util.Set;
import java.util.concurrent.Callable;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {110}, m = "invokeSuspend")
public final class b extends i implements p<g<Object>, d<? super m>, Object> {
    public final /* synthetic */ Callable<Object> B;

    /* renamed from: a  reason: collision with root package name */
    public int f9426a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f9427b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f9428c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p f9429d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String[] f9430e;

    @e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {136}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {
        public final /* synthetic */ String[] B;
        public final /* synthetic */ Callable<Object> C;

        /* renamed from: a  reason: collision with root package name */
        public int f9431a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f9432b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f9433c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p f9434d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g<Object> f9435e;

        @e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {127, 129}, m = "invokeSuspend")
        /* renamed from: i3.b$a$a  reason: collision with other inner class name */
        public static final class C0172a extends i implements p<g0, d<? super m>, Object> {
            public final /* synthetic */ Callable<Object> B;
            public final /* synthetic */ f<Object> C;

            /* renamed from: a  reason: collision with root package name */
            public h f9436a;

            /* renamed from: b  reason: collision with root package name */
            public int f9437b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ p f9438c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ C0173b f9439d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ f<m> f9440e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0172a(p pVar, C0173b bVar, f<m> fVar, Callable<Object> callable, f<Object> fVar2, d<? super C0172a> dVar) {
                super(2, dVar);
                this.f9438c = pVar;
                this.f9439d = bVar;
                this.f9440e = fVar;
                this.B = callable;
                this.C = fVar2;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new C0172a(this.f9438c, this.f9439d, this.f9440e, this.B, this.C, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0172a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[Catch:{ all -> 0x0068 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kf.a r0 = kf.a.f10464a
                    int r1 = r7.f9437b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0023
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    cg.h r1 = r7.f9436a
                    cb.b.J(r8)     // Catch:{ all -> 0x007b }
                    goto L_0x0035
                L_0x0012:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L_0x001a:
                    cg.h r1 = r7.f9436a
                    cb.b.J(r8)     // Catch:{ all -> 0x007b }
                    r4 = r1
                    r1 = r0
                    r0 = r7
                    goto L_0x0046
                L_0x0023:
                    cb.b.J(r8)
                    i3.p r8 = r7.f9438c
                    i3.k r8 = r8.f9511e
                    i3.b$a$b r1 = r7.f9439d
                    r8.a(r1)
                    cg.f<ff.m> r8 = r7.f9440e     // Catch:{ all -> 0x007b }
                    cg.h r1 = r8.iterator()     // Catch:{ all -> 0x007b }
                L_0x0035:
                    r8 = r7
                L_0x0036:
                    r8.f9436a = r1     // Catch:{ all -> 0x0076 }
                    r8.f9437b = r3     // Catch:{ all -> 0x0076 }
                    java.lang.Object r4 = r1.a(r8)     // Catch:{ all -> 0x0076 }
                    if (r4 != r0) goto L_0x0041
                    return r0
                L_0x0041:
                    r6 = r0
                    r0 = r8
                    r8 = r4
                    r4 = r1
                    r1 = r6
                L_0x0046:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0068 }
                    boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0068 }
                    if (r8 == 0) goto L_0x006a
                    r4.next()     // Catch:{ all -> 0x0068 }
                    java.util.concurrent.Callable<java.lang.Object> r8 = r0.B     // Catch:{ all -> 0x0068 }
                    java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0068 }
                    cg.f<java.lang.Object> r5 = r0.C     // Catch:{ all -> 0x0068 }
                    r0.f9436a = r4     // Catch:{ all -> 0x0068 }
                    r0.f9437b = r2     // Catch:{ all -> 0x0068 }
                    java.lang.Object r8 = r5.t(r8, r0)     // Catch:{ all -> 0x0068 }
                    if (r8 != r1) goto L_0x0064
                    return r1
                L_0x0064:
                    r8 = r0
                    r0 = r1
                    r1 = r4
                    goto L_0x0036
                L_0x0068:
                    r8 = move-exception
                    goto L_0x007d
                L_0x006a:
                    i3.p r8 = r0.f9438c
                    i3.k r8 = r8.f9511e
                    i3.b$a$b r0 = r0.f9439d
                    r8.c(r0)
                    ff.m r8 = ff.m.f8717a
                    return r8
                L_0x0076:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                    goto L_0x007d
                L_0x007b:
                    r8 = move-exception
                    r0 = r7
                L_0x007d:
                    i3.p r1 = r0.f9438c
                    i3.k r1 = r1.f9511e
                    i3.b$a$b r0 = r0.f9439d
                    r1.c(r0)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: i3.b.a.C0172a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: i3.b$a$b  reason: collision with other inner class name */
        public static final class C0173b extends k.c {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ f<m> f9441b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0173b(String[] strArr, cg.a aVar) {
                super(strArr);
                this.f9441b = aVar;
            }

            public final void a(Set<String> set) {
                j.f(set, "tables");
                this.f9441b.o(m.f8717a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z10, p pVar, g<Object> gVar, String[] strArr, Callable<Object> callable, d<? super a> dVar) {
            super(2, dVar);
            this.f9433c = z10;
            this.f9434d = pVar;
            this.f9435e = gVar;
            this.B = strArr;
            this.C = callable;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f9433c, this.f9434d, this.f9435e, this.B, this.C, dVar);
            aVar.f9432b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2 = kf.a.f10464a;
            int i8 = this.f9431a;
            if (i8 == 0) {
                cb.b.J(obj);
                g0 g0Var = (g0) this.f9432b;
                cg.a d10 = cb.d.d(-1, (cg.e) null, 6);
                C0173b bVar = new C0173b(this.B, d10);
                Object obj3 = m.f8717a;
                d10.o(obj3);
                w wVar = (w) g0Var.f0().d(w.f9561a);
                boolean z10 = this.f9433c;
                p pVar = this.f9434d;
                c0 M = z10 ? cb.d.M(pVar) : cb.d.L(pVar);
                cg.a d11 = cb.d.d(0, (cg.e) null, 7);
                cb.b.D(g0Var, M, 0, new C0172a(this.f9434d, bVar, d10, this.C, d11, (d<? super C0172a>) null), 2);
                this.f9431a = 1;
                Object a10 = kotlinx.coroutines.flow.j.a(this.f9435e, d11, true, this);
                if (a10 == obj2) {
                    obj3 = a10;
                }
                if (obj3 == obj2) {
                    return obj2;
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
    public b(boolean z10, p pVar, String[] strArr, Callable<Object> callable, d<? super b> dVar) {
        super(2, dVar);
        this.f9428c = z10;
        this.f9429d = pVar;
        this.f9430e = strArr;
        this.B = callable;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f9428c, this.f9429d, this.f9430e, this.B, dVar);
        bVar.f9427b = obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f9426a;
        if (i8 == 0) {
            cb.b.J(obj);
            a aVar2 = new a(this.f9428c, this.f9429d, (g) this.f9427b, this.f9430e, this.B, (d<? super a>) null);
            this.f9426a = 1;
            if (f1.v(aVar2, this) == aVar) {
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
