package dg;

import ag.g0;
import cb.b;
import ff.m;
import gf.v;
import java.util.concurrent.atomic.AtomicInteger;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import lf.c;
import lf.e;
import lf.i;
import rf.p;
import rf.q;

@e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {
    public /* synthetic */ Object B;
    public final /* synthetic */ f<Object>[] C;
    public final /* synthetic */ rf.a<Object[]> D;
    public final /* synthetic */ q<g<Object>, Object[], d<? super m>, Object> E;
    public final /* synthetic */ g<Object> F;

    /* renamed from: a  reason: collision with root package name */
    public cg.f f7562a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f7563b;

    /* renamed from: c  reason: collision with root package name */
    public int f7564c;

    /* renamed from: d  reason: collision with root package name */
    public int f7565d;

    /* renamed from: e  reason: collision with root package name */
    public int f7566e;

    @e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7567a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f<Object>[] f7568b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f7569c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f7570d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ cg.f<v<Object>> f7571e;

        /* renamed from: dg.l$a$a  reason: collision with other inner class name */
        public static final class C0124a<T> implements g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ cg.f<v<Object>> f7572a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f7573b;

            @e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {35, 36}, m = "emit")
            /* renamed from: dg.l$a$a$a  reason: collision with other inner class name */
            public static final class C0125a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f7574a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ C0124a<T> f7575b;

                /* renamed from: c  reason: collision with root package name */
                public int f7576c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0125a(C0124a<? super T> aVar, d<? super C0125a> dVar) {
                    super(dVar);
                    this.f7575b = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f7574a = obj;
                    this.f7576c |= Integer.MIN_VALUE;
                    return this.f7575b.m(null, this);
                }
            }

            public C0124a(cg.f<v<Object>> fVar, int i8) {
                this.f7572a = fVar;
                this.f7573b = i8;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(T r6, jf.d<? super ff.m> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof dg.l.a.C0124a.C0125a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    dg.l$a$a$a r0 = (dg.l.a.C0124a.C0125a) r0
                    int r1 = r0.f7576c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f7576c = r1
                    goto L_0x0018
                L_0x0013:
                    dg.l$a$a$a r0 = new dg.l$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f7574a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f7576c
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0036
                    if (r2 == r4) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    cb.b.J(r7)
                    goto L_0x0054
                L_0x002a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0032:
                    cb.b.J(r7)
                    goto L_0x004b
                L_0x0036:
                    cb.b.J(r7)
                    gf.v r7 = new gf.v
                    int r2 = r5.f7573b
                    r7.<init>(r2, r6)
                    r0.f7576c = r4
                    cg.f<gf.v<java.lang.Object>> r6 = r5.f7572a
                    java.lang.Object r6 = r6.t(r7, r0)
                    if (r6 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    r0.f7576c = r3
                    java.lang.Object r6 = e9.c.q(r0)
                    if (r6 != r1) goto L_0x0054
                    return r1
                L_0x0054:
                    ff.m r6 = ff.m.f8717a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: dg.l.a.C0124a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f<Object>[] fVarArr, int i8, AtomicInteger atomicInteger, cg.f<v<Object>> fVar, d<? super a> dVar) {
            super(2, dVar);
            this.f7568b = fVarArr;
            this.f7569c = i8;
            this.f7570d = atomicInteger;
            this.f7571e = fVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f7568b, this.f7569c, this.f7570d, this.f7571e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f7567a;
            AtomicInteger atomicInteger = this.f7570d;
            cg.f<v<Object>> fVar = this.f7571e;
            if (i8 == 0) {
                b.J(obj);
                f<Object>[] fVarArr = this.f7568b;
                int i10 = this.f7569c;
                f<Object> fVar2 = fVarArr[i10];
                C0124a aVar2 = new C0124a(fVar, i10);
                this.f7567a = 1;
                if (fVar2.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                try {
                    b.J(obj);
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        fVar.k((Throwable) null);
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (atomicInteger.decrementAndGet() == 0) {
                fVar.k((Throwable) null);
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(d dVar, rf.a aVar, q qVar, g gVar, f[] fVarArr) {
        super(2, dVar);
        this.C = fVarArr;
        this.D = aVar;
        this.E = qVar;
        this.F = gVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        d<?> dVar2 = dVar;
        l lVar = new l(dVar2, this.D, this.E, this.F, this.C);
        lVar.B = obj;
        return lVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: kotlinx.coroutines.internal.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: kotlinx.coroutines.internal.v[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[LOOP:1: B:29:0x00c7->B:38:0x00e7, LOOP_START, PHI: r8 r12 
      PHI: (r8v5 int) = (r8v4 int), (r8v6 int) binds: [B:26:0x00c2, B:38:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v6 gf.v) = (r12v5 gf.v), (r12v16 gf.v) binds: [B:26:0x00c2, B:38:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f7566e
            kotlinx.coroutines.internal.v r3 = m9.b.f11324e
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r7) goto L_0x0047
            if (r2 == r6) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            int r2 = r0.f7565d
            int r8 = r0.f7564c
            byte[] r9 = r0.f7563b
            cg.f r10 = r0.f7562a
            java.lang.Object r11 = r0.B
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            cb.b.J(r24)
            r20 = r6
            r6 = r0
            r22 = r11
            r11 = r5
            r5 = r22
            goto L_0x0146
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            int r2 = r0.f7565d
            int r8 = r0.f7564c
            byte[] r9 = r0.f7563b
            cg.f r10 = r0.f7562a
            java.lang.Object r11 = r0.B
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            cb.b.J(r24)
            r6 = r0
            goto L_0x00a5
        L_0x0047:
            int r2 = r0.f7565d
            int r8 = r0.f7564c
            byte[] r9 = r0.f7563b
            cg.f r10 = r0.f7562a
            java.lang.Object r11 = r0.B
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            cb.b.J(r24)
            r12 = r24
            cg.i r12 = (cg.i) r12
            java.lang.Object r12 = r12.f4028a
            r6 = r0
        L_0x005d:
            r15 = r11
            goto L_0x00ba
        L_0x005f:
            cb.b.J(r24)
            java.lang.Object r2 = r0.B
            ag.g0 r2 = (ag.g0) r2
            kotlinx.coroutines.flow.f<java.lang.Object>[] r8 = r0.C
            int r8 = r8.length
            if (r8 != 0) goto L_0x006e
            ff.m r1 = ff.m.f8717a
            return r1
        L_0x006e:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            gf.l.a0(r11, r3)
            r9 = 6
            cg.a r10 = cb.d.d(r8, r4, r9)
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>(r8)
            r15 = 0
            r14 = r15
        L_0x007f:
            if (r14 >= r8) goto L_0x009f
            dg.l$a r13 = new dg.l$a
            kotlinx.coroutines.flow.f<java.lang.Object>[] r12 = r0.C
            r17 = 0
            r16 = r12
            r12 = r13
            r6 = r13
            r13 = r16
            r19 = r14
            r7 = r15
            r15 = r9
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            cb.b.D(r2, r4, r7, r6, r5)
            int r14 = r19 + 1
            r15 = r7
            r6 = 2
            r7 = 1
            goto L_0x007f
        L_0x009f:
            r7 = r15
            byte[] r9 = new byte[r8]
            r6 = r0
            r2 = r7
            r7 = 1
        L_0x00a5:
            int r2 = r2 + r7
            byte r2 = (byte) r2
            r6.B = r11
            r6.f7562a = r10
            r6.f7563b = r9
            r6.f7564c = r8
            r6.f7565d = r2
            r6.f7566e = r7
            java.lang.Object r12 = r10.m(r6)
            if (r12 != r1) goto L_0x005d
            return r1
        L_0x00ba:
            boolean r11 = r12 instanceof cg.i.b
            if (r11 != 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r12 = r4
        L_0x00c0:
            gf.v r12 = (gf.v) r12
            if (r12 != 0) goto L_0x00c7
            ff.m r1 = ff.m.f8717a
            return r1
        L_0x00c7:
            int r11 = r12.f8981a
            r13 = r15[r11]
            T r12 = r12.f8982b
            r15[r11] = r12
            if (r13 != r3) goto L_0x00d3
            int r8 = r8 + -1
        L_0x00d3:
            byte r12 = r9[r11]
            if (r12 == r2) goto L_0x00e9
            byte r12 = (byte) r2
            r9[r11] = r12
            java.lang.Object r11 = r10.h()
            boolean r12 = r11 instanceof cg.i.b
            if (r12 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r11 = r4
        L_0x00e4:
            r12 = r11
            gf.v r12 = (gf.v) r12
            if (r12 != 0) goto L_0x00c7
        L_0x00e9:
            if (r8 != 0) goto L_0x014f
            rf.a<java.lang.Object[]> r11 = r6.D
            java.lang.Object r11 = r11.d()
            r14 = r11
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            kotlinx.coroutines.flow.g<java.lang.Object> r13 = r6.F
            rf.q<kotlinx.coroutines.flow.g<java.lang.Object>, java.lang.Object[], jf.d<? super ff.m>, java.lang.Object> r12 = r6.E
            if (r14 != 0) goto L_0x0113
            r6.B = r15
            r6.f7562a = r10
            r6.f7563b = r9
            r6.f7564c = r8
            r6.f7565d = r2
            r11 = 2
            r6.f7566e = r11
            java.lang.Object r12 = r12.e(r13, r15, r6)
            if (r12 != r1) goto L_0x010e
            return r1
        L_0x010e:
            r20 = r11
            r11 = r5
            r5 = r15
            goto L_0x0146
        L_0x0113:
            r11 = 2
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 14
            r20 = r11
            r11 = r15
            r4 = r12
            r12 = r14
            r7 = r13
            r13 = r16
            r21 = r14
            r14 = r17
            r5 = r15
            r15 = r18
            r16 = r19
            gf.l.X(r11, r12, r13, r14, r15, r16)
            r6.B = r5
            r6.f7562a = r10
            r6.f7563b = r9
            r6.f7564c = r8
            r6.f7565d = r2
            r11 = 3
            r6.f7566e = r11
            r12 = r21
            java.lang.Object r4 = r4.e(r7, r12, r6)
            if (r4 != r1) goto L_0x0146
            return r1
        L_0x0146:
            r4 = 0
            r7 = 1
            r22 = r11
            r11 = r5
            r5 = r22
            goto L_0x00a5
        L_0x014f:
            r11 = r5
            r5 = r15
            r20 = 2
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
