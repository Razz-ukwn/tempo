package f3;

import ag.g0;
import ag.n1;
import ff.m;
import java.util.concurrent.CancellationException;
import lf.e;
import lf.i;
import rf.l;
import rf.p;
import sf.j;

public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final b f8414a;

    public static final class a extends CancellationException {

        /* renamed from: a  reason: collision with root package name */
        public final p2 f8415a;

        public a(p2 p2Var) {
            j.f(p2Var, "runner");
            this.f8415a = p2Var;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final p2 f8416a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8417b;

        /* renamed from: c  reason: collision with root package name */
        public final kotlinx.coroutines.sync.d f8418c = gc.b.b();

        /* renamed from: d  reason: collision with root package name */
        public n1 f8419d;

        /* renamed from: e  reason: collision with root package name */
        public int f8420e;

        @e(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129}, m = "onFinish")
        public static final class a extends lf.c {
            public int B;

            /* renamed from: a  reason: collision with root package name */
            public b f8421a;

            /* renamed from: b  reason: collision with root package name */
            public n1 f8422b;

            /* renamed from: c  reason: collision with root package name */
            public kotlinx.coroutines.sync.d f8423c;

            /* renamed from: d  reason: collision with root package name */
            public /* synthetic */ Object f8424d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ b f8425e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, jf.d<? super a> dVar) {
                super(dVar);
                this.f8425e = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8424d = obj;
                this.B |= Integer.MIN_VALUE;
                return this.f8425e.a((n1) null, this);
            }
        }

        @e(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129, 100}, m = "tryEnqueue")
        /* renamed from: f3.p2$b$b  reason: collision with other inner class name */
        public static final class C0150b extends lf.c {
            public final /* synthetic */ b B;
            public int C;

            /* renamed from: a  reason: collision with root package name */
            public b f8426a;

            /* renamed from: b  reason: collision with root package name */
            public n1 f8427b;

            /* renamed from: c  reason: collision with root package name */
            public kotlinx.coroutines.sync.c f8428c;

            /* renamed from: d  reason: collision with root package name */
            public int f8429d;

            /* renamed from: e  reason: collision with root package name */
            public /* synthetic */ Object f8430e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0150b(b bVar, jf.d<? super C0150b> dVar) {
                super(dVar);
                this.B = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8430e = obj;
                this.C |= Integer.MIN_VALUE;
                return this.B.b(0, (n1) null, this);
            }
        }

        public b(p2 p2Var, boolean z10) {
            j.f(p2Var, "singleRunner");
            this.f8416a = p2Var;
            this.f8417b = z10;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[Catch:{ all -> 0x005b }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(ag.n1 r5, jf.d<? super ff.m> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof f3.p2.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                f3.p2$b$a r0 = (f3.p2.b.a) r0
                int r1 = r0.B
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.B = r1
                goto L_0x0018
            L_0x0013:
                f3.p2$b$a r0 = new f3.p2$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f8424d
                kf.a r1 = kf.a.f10464a
                int r2 = r0.B
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                kotlinx.coroutines.sync.d r5 = r0.f8423c
                ag.n1 r1 = r0.f8422b
                f3.p2$b r0 = r0.f8421a
                cb.b.J(r6)
                r6 = r5
                r5 = r1
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                cb.b.J(r6)
                r0.f8421a = r4
                r0.f8422b = r5
                kotlinx.coroutines.sync.d r6 = r4.f8418c
                r0.f8423c = r6
                r0.B = r3
                java.lang.Object r0 = r6.b(r0)
                if (r0 != r1) goto L_0x004b
                return r1
            L_0x004b:
                r0 = r4
            L_0x004c:
                r1 = 0
                ag.n1 r2 = r0.f8419d     // Catch:{ all -> 0x005b }
                if (r5 != r2) goto L_0x0053
                r0.f8419d = r1     // Catch:{ all -> 0x005b }
            L_0x0053:
                ff.m r5 = ff.m.f8717a     // Catch:{ all -> 0x005b }
                r6.a(r1)
                ff.m r5 = ff.m.f8717a
                return r5
            L_0x005b:
                r5 = move-exception
                r6.a(r1)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.p2.b.a(ag.n1, jf.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ all -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ all -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(int r10, ag.n1 r11, jf.d<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof f3.p2.b.C0150b
                if (r0 == 0) goto L_0x0013
                r0 = r12
                f3.p2$b$b r0 = (f3.p2.b.C0150b) r0
                int r1 = r0.C
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.C = r1
                goto L_0x0018
            L_0x0013:
                f3.p2$b$b r0 = new f3.p2$b$b
                r0.<init>(r9, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f8430e
                kf.a r1 = kf.a.f10464a
                int r2 = r0.C
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x004c
                if (r2 == r5) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                int r10 = r0.f8429d
                kotlinx.coroutines.sync.c r11 = r0.f8428c
                kotlinx.coroutines.sync.c r11 = (kotlinx.coroutines.sync.c) r11
                ag.n1 r1 = r0.f8427b
                f3.p2$b r0 = r0.f8426a
                cb.b.J(r12)     // Catch:{ all -> 0x00b0 }
                goto L_0x00a2
            L_0x0036:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x003e:
                int r10 = r0.f8429d
                kotlinx.coroutines.sync.c r11 = r0.f8428c
                kotlinx.coroutines.sync.c r11 = (kotlinx.coroutines.sync.c) r11
                ag.n1 r2 = r0.f8427b
                f3.p2$b r6 = r0.f8426a
                cb.b.J(r12)
                goto L_0x0065
            L_0x004c:
                cb.b.J(r12)
                r0.f8426a = r9
                r0.f8427b = r11
                kotlinx.coroutines.sync.d r12 = r9.f8418c
                r0.f8428c = r12
                r0.f8429d = r10
                r0.C = r5
                java.lang.Object r2 = r12.b(r0)
                if (r2 != r1) goto L_0x0062
                return r1
            L_0x0062:
                r6 = r9
                r2 = r11
                r11 = r12
            L_0x0065:
                ag.n1 r12 = r6.f8419d     // Catch:{ all -> 0x00b0 }
                if (r12 == 0) goto L_0x007c
                boolean r7 = r12.c()     // Catch:{ all -> 0x00b0 }
                if (r7 == 0) goto L_0x007c
                int r7 = r6.f8420e     // Catch:{ all -> 0x00b0 }
                if (r7 < r10) goto L_0x007c
                if (r7 != r10) goto L_0x007a
                boolean r7 = r6.f8417b     // Catch:{ all -> 0x00b0 }
                if (r7 == 0) goto L_0x007a
                goto L_0x007c
            L_0x007a:
                r5 = 0
                goto L_0x00a8
            L_0x007c:
                if (r12 != 0) goto L_0x007f
                goto L_0x0089
            L_0x007f:
                f3.p2$a r7 = new f3.p2$a     // Catch:{ all -> 0x00b0 }
                f3.p2 r8 = r6.f8416a     // Catch:{ all -> 0x00b0 }
                r7.<init>(r8)     // Catch:{ all -> 0x00b0 }
                r12.e(r7)     // Catch:{ all -> 0x00b0 }
            L_0x0089:
                if (r12 != 0) goto L_0x008c
                goto L_0x00a4
            L_0x008c:
                r0.f8426a = r6     // Catch:{ all -> 0x00b0 }
                r0.f8427b = r2     // Catch:{ all -> 0x00b0 }
                r7 = r11
                kotlinx.coroutines.sync.c r7 = (kotlinx.coroutines.sync.c) r7     // Catch:{ all -> 0x00b0 }
                r0.f8428c = r7     // Catch:{ all -> 0x00b0 }
                r0.f8429d = r10     // Catch:{ all -> 0x00b0 }
                r0.C = r3     // Catch:{ all -> 0x00b0 }
                java.lang.Object r12 = r12.e0(r0)     // Catch:{ all -> 0x00b0 }
                if (r12 != r1) goto L_0x00a0
                return r1
            L_0x00a0:
                r1 = r2
                r0 = r6
            L_0x00a2:
                r6 = r0
                r2 = r1
            L_0x00a4:
                r6.f8419d = r2     // Catch:{ all -> 0x00b0 }
                r6.f8420e = r10     // Catch:{ all -> 0x00b0 }
            L_0x00a8:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00b0 }
                r11.a(r4)
                return r10
            L_0x00b0:
                r10 = move-exception
                r11.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.p2.b.b(int, ag.n1, jf.d):java.lang.Object");
        }
    }

    @e(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
    public static final class c extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public p2 f8431a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8432b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p2 f8433c;

        /* renamed from: d  reason: collision with root package name */
        public int f8434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p2 p2Var, jf.d<? super c> dVar) {
            super(dVar);
            this.f8433c = p2Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8432b = obj;
            this.f8434d |= Integer.MIN_VALUE;
            return this.f8433c.a(0, (l<? super jf.d<? super m>, ? extends Object>) null, this);
        }
    }

    @e(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
    public static final class d extends i implements p<g0, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8435a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8436b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p2 f8437c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f8438d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ l<jf.d<? super m>, Object> f8439e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(p2 p2Var, int i8, l<? super jf.d<? super m>, ? extends Object> lVar, jf.d<? super d> dVar) {
            super(2, dVar);
            this.f8437c = p2Var;
            this.f8438d = i8;
            this.f8439e = lVar;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            d dVar2 = new d(this.f8437c, this.f8438d, this.f8439e, dVar);
            dVar2.f8436b = obj;
            return dVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0087 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kf.a r0 = kf.a.f10464a
                int r1 = r8.f8435a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                f3.p2 r6 = r8.f8437c
                if (r1 == 0) goto L_0x003c
                if (r1 == r5) goto L_0x0034
                if (r1 == r4) goto L_0x002a
                if (r1 == r3) goto L_0x0025
                if (r1 == r2) goto L_0x001c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001c:
                java.lang.Object r0 = r8.f8436b
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                cb.b.J(r9)
                goto L_0x0096
            L_0x0025:
                cb.b.J(r9)
                goto L_0x0097
            L_0x002a:
                java.lang.Object r1 = r8.f8436b
                ag.n1 r1 = (ag.n1) r1
                cb.b.J(r9)     // Catch:{ all -> 0x0032 }
                goto L_0x007a
            L_0x0032:
                r9 = move-exception
                goto L_0x0088
            L_0x0034:
                java.lang.Object r1 = r8.f8436b
                ag.n1 r1 = (ag.n1) r1
                cb.b.J(r9)
                goto L_0x0065
            L_0x003c:
                cb.b.J(r9)
                java.lang.Object r9 = r8.f8436b
                ag.g0 r9 = (ag.g0) r9
                jf.f r9 = r9.f0()
                int r1 = ag.n1.f446f
                ag.n1$b r1 = ag.n1.b.f447a
                jf.f$b r9 = r9.d(r1)
                if (r9 == 0) goto L_0x009a
                ag.n1 r9 = (ag.n1) r9
                f3.p2$b r1 = r6.f8414a
                r8.f8436b = r9
                r8.f8435a = r5
                int r5 = r8.f8438d
                java.lang.Object r1 = r1.b(r5, r9, r8)
                if (r1 != r0) goto L_0x0062
                return r0
            L_0x0062:
                r7 = r1
                r1 = r9
                r9 = r7
            L_0x0065:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x0097
                rf.l<jf.d<? super ff.m>, java.lang.Object> r9 = r8.f8439e     // Catch:{ all -> 0x0032 }
                r8.f8436b = r1     // Catch:{ all -> 0x0032 }
                r8.f8435a = r4     // Catch:{ all -> 0x0032 }
                java.lang.Object r9 = r9.invoke(r8)     // Catch:{ all -> 0x0032 }
                if (r9 != r0) goto L_0x007a
                return r0
            L_0x007a:
                f3.p2$b r9 = r6.f8414a
                r2 = 0
                r8.f8436b = r2
                r8.f8435a = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L_0x0097
                return r0
            L_0x0088:
                f3.p2$b r3 = r6.f8414a
                r8.f8436b = r9
                r8.f8435a = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L_0x0095
                return r0
            L_0x0095:
                r0 = r9
            L_0x0096:
                throw r0
            L_0x0097:
                ff.m r9 = ff.m.f8717a
                return r9
            L_0x009a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.p2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p2(boolean z10) {
        this.f8414a = new b(this, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r5, rf.l<? super jf.d<? super ff.m>, ? extends java.lang.Object> r6, jf.d<? super ff.m> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof f3.p2.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            f3.p2$c r0 = (f3.p2.c) r0
            int r1 = r0.f8434d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8434d = r1
            goto L_0x0018
        L_0x0013:
            f3.p2$c r0 = new f3.p2$c
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8432b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f8434d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            f3.p2 r5 = r0.f8431a
            cb.b.J(r7)     // Catch:{ a -> 0x0029 }
            goto L_0x004e
        L_0x0029:
            r6 = move-exception
            goto L_0x004a
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            cb.b.J(r7)
            f3.p2$d r7 = new f3.p2$d     // Catch:{ a -> 0x0047 }
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch:{ a -> 0x0047 }
            r0.f8431a = r4     // Catch:{ a -> 0x0047 }
            r0.f8434d = r3     // Catch:{ a -> 0x0047 }
            java.lang.Object r5 = d2.f1.v(r7, r0)     // Catch:{ a -> 0x0047 }
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x0047:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004a:
            f3.p2 r7 = r6.f8415a
            if (r7 != r5) goto L_0x0051
        L_0x004e:
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x0051:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.p2.a(int, rf.l, jf.d):java.lang.Object");
    }
}
