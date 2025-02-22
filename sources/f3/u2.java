package f3;

import ag.n1;
import ag.s;
import ag.t;
import f3.e1;
import ff.m;
import gc.b;
import jf.d;
import lf.c;
import lf.e;
import rf.r;

public final class u2<T1, T2> {

    /* renamed from: a  reason: collision with root package name */
    public final r<T1, T2, s, d<? super m>, Object> f8506a;

    /* renamed from: b  reason: collision with root package name */
    public final t f8507b = new t((n1) null);

    /* renamed from: c  reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f8508c = b.b();

    /* renamed from: d  reason: collision with root package name */
    public final s<m>[] f8509d;

    /* renamed from: e  reason: collision with root package name */
    public final Object[] f8510e;

    @e(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {188, 227, 205}, m = "onNext")
    public static final class a extends c {
        public final /* synthetic */ u2<T1, T2> B;
        public int C;

        /* renamed from: a  reason: collision with root package name */
        public u2 f8511a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8512b;

        /* renamed from: c  reason: collision with root package name */
        public kotlinx.coroutines.sync.d f8513c;

        /* renamed from: d  reason: collision with root package name */
        public int f8514d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f8515e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u2<T1, T2> u2Var, d<? super a> dVar) {
            super(dVar);
            this.B = u2Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8515e = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.a(0, (Object) null, this);
        }
    }

    public u2(e1.b.a aVar) {
        this.f8506a = aVar;
        s<m>[] sVarArr = new s[2];
        for (int i8 = 0; i8 < 2; i8++) {
            sVarArr[i8] = new t((n1) null);
        }
        this.f8509d = sVarArr;
        Object[] objArr = new Object[2];
        for (int i10 = 0; i10 < 2; i10++) {
            objArr[i10] = f0.f8186a;
        }
        this.f8510e = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: kotlinx.coroutines.sync.d} */
    /* JADX WARNING: type inference failed for: r5v1, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[Catch:{ all -> 0x00f8, all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba A[Catch:{ all -> 0x00f8, all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd A[Catch:{ all -> 0x00f8, all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa A[Catch:{ all -> 0x00f8, all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r17, java.lang.Object r18, jf.d<? super ff.m> r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            boolean r3 = r2 instanceof f3.u2.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            f3.u2$a r3 = (f3.u2.a) r3
            int r4 = r3.C
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.C = r4
            goto L_0x001e
        L_0x0019:
            f3.u2$a r3 = new f3.u2$a
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f8515e
            kf.a r4 = kf.a.f10464a
            int r5 = r3.C
            r6 = 3
            r7 = 1
            r8 = 2
            r9 = 0
            if (r5 == 0) goto L_0x005d
            if (r5 == r7) goto L_0x0053
            if (r5 == r8) goto L_0x0047
            if (r5 != r6) goto L_0x003f
            java.lang.Object r0 = r3.f8512b
            r4 = r0
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
            f3.u2 r0 = r3.f8511a
            cb.b.J(r2)     // Catch:{ all -> 0x003c }
            goto L_0x00f0
        L_0x003c:
            r0 = move-exception
            goto L_0x0103
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0047:
            int r0 = r3.f8514d
            kotlinx.coroutines.sync.d r5 = r3.f8513c
            java.lang.Object r8 = r3.f8512b
            f3.u2 r10 = r3.f8511a
            cb.b.J(r2)
            goto L_0x009c
        L_0x0053:
            int r0 = r3.f8514d
            java.lang.Object r5 = r3.f8512b
            f3.u2 r10 = r3.f8511a
            cb.b.J(r2)
            goto L_0x0087
        L_0x005d:
            cb.b.J(r2)
            ag.s<ff.m>[] r2 = r1.f8509d
            r5 = r2[r0]
            boolean r5 = r5.v0()
            if (r5 == 0) goto L_0x007d
            r3.f8511a = r1
            r5 = r18
            r3.f8512b = r5
            r3.f8514d = r0
            r3.C = r7
            ag.t r2 = r1.f8507b
            java.lang.Object r2 = r2.w(r3)
            if (r2 != r4) goto L_0x0086
            return r4
        L_0x007d:
            r5 = r18
            r2 = r2[r0]
            ff.m r10 = ff.m.f8717a
            r2.d0(r10)
        L_0x0086:
            r10 = r1
        L_0x0087:
            kotlinx.coroutines.sync.d r2 = r10.f8508c
            r3.f8511a = r10
            r3.f8512b = r5
            r3.f8513c = r2
            r3.f8514d = r0
            r3.C = r8
            java.lang.Object r8 = r2.b(r3)
            if (r8 != r4) goto L_0x009a
            return r4
        L_0x009a:
            r8 = r5
            r5 = r2
        L_0x009c:
            java.lang.Object[] r2 = r10.f8510e     // Catch:{ all -> 0x00f8 }
            int r11 = r2.length     // Catch:{ all -> 0x00f8 }
            r12 = 0
            r13 = r12
        L_0x00a1:
            if (r13 >= r11) goto L_0x00b3
            r14 = r2[r13]     // Catch:{ all -> 0x00f8 }
            java.lang.Object r15 = f3.f0.f8186a     // Catch:{ all -> 0x00f8 }
            if (r14 != r15) goto L_0x00ab
            r14 = r7
            goto L_0x00ac
        L_0x00ab:
            r14 = r12
        L_0x00ac:
            if (r14 == 0) goto L_0x00b0
            r11 = r7
            goto L_0x00b4
        L_0x00b0:
            int r13 = r13 + 1
            goto L_0x00a1
        L_0x00b3:
            r11 = r12
        L_0x00b4:
            r2[r0] = r8     // Catch:{ all -> 0x00f8 }
            int r8 = r2.length     // Catch:{ all -> 0x00f8 }
            r13 = r12
        L_0x00b8:
            if (r13 >= r8) goto L_0x00ca
            r14 = r2[r13]     // Catch:{ all -> 0x00f8 }
            java.lang.Object r15 = f3.f0.f8186a     // Catch:{ all -> 0x00f8 }
            if (r14 != r15) goto L_0x00c2
            r14 = r7
            goto L_0x00c3
        L_0x00c2:
            r14 = r12
        L_0x00c3:
            if (r14 == 0) goto L_0x00c7
            r8 = r12
            goto L_0x00cb
        L_0x00c7:
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00ca:
            r8 = r7
        L_0x00cb:
            if (r8 == 0) goto L_0x00fa
            if (r11 == 0) goto L_0x00d2
            f3.s r0 = f3.s.f8467a     // Catch:{ all -> 0x00f8 }
            goto L_0x00d9
        L_0x00d2:
            if (r0 != 0) goto L_0x00d7
            f3.s r0 = f3.s.f8468b     // Catch:{ all -> 0x00f8 }
            goto L_0x00d9
        L_0x00d7:
            f3.s r0 = f3.s.f8469c     // Catch:{ all -> 0x00f8 }
        L_0x00d9:
            rf.r<T1, T2, f3.s, jf.d<? super ff.m>, java.lang.Object> r8 = r10.f8506a     // Catch:{ all -> 0x00f8 }
            r11 = r2[r12]     // Catch:{ all -> 0x00f8 }
            r2 = r2[r7]     // Catch:{ all -> 0x00f8 }
            r3.f8511a = r10     // Catch:{ all -> 0x00f8 }
            r3.f8512b = r5     // Catch:{ all -> 0x00f8 }
            r3.f8513c = r9     // Catch:{ all -> 0x00f8 }
            r3.C = r6     // Catch:{ all -> 0x00f8 }
            java.lang.Object r0 = r8.k(r11, r2, r0, r3)     // Catch:{ all -> 0x00f8 }
            if (r0 != r4) goto L_0x00ee
            return r4
        L_0x00ee:
            r4 = r5
            r0 = r10
        L_0x00f0:
            ag.t r0 = r0.f8507b     // Catch:{ all -> 0x003c }
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x003c }
            r0.a0(r2)     // Catch:{ all -> 0x003c }
            goto L_0x00fb
        L_0x00f8:
            r0 = move-exception
            goto L_0x0104
        L_0x00fa:
            r4 = r5
        L_0x00fb:
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x003c }
            r4.a(r9)
            ff.m r0 = ff.m.f8717a
            return r0
        L_0x0103:
            r5 = r4
        L_0x0104:
            r5.a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.u2.a(int, java.lang.Object, jf.d):java.lang.Object");
    }
}
