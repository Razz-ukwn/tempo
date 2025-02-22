package f3;

import ag.n1;
import ag.q1;
import f3.v2;
import jf.d;
import kotlinx.coroutines.flow.f;
import rf.l;
import sf.j;

public final class z0<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public final l<d<? super f2<Key, Value>>, Object> f8563a;

    /* renamed from: b  reason: collision with root package name */
    public final Key f8564b;

    /* renamed from: c  reason: collision with root package name */
    public final w1 f8565c;

    /* renamed from: d  reason: collision with root package name */
    public final v f8566d = new v(0);

    /* renamed from: e  reason: collision with root package name */
    public final v f8567e = new v(0);

    /* renamed from: f  reason: collision with root package name */
    public final f<x1<Value>> f8568f = k2.a(new a1(this, (d) null));

    public static final class a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        public final f1<Key, Value> f8569a;

        /* renamed from: b  reason: collision with root package name */
        public final g2<Key, Value> f8570b;

        /* renamed from: c  reason: collision with root package name */
        public final n1 f8571c;

        public a(f1 f1Var, g2 g2Var, q1 q1Var) {
            this.f8569a = f1Var;
            this.f8570b = g2Var;
            this.f8571c = q1Var;
        }
    }

    public final class b<Key, Value> implements t2 {

        /* renamed from: a  reason: collision with root package name */
        public final f1<Key, Value> f8572a;

        public b(z0 z0Var, f1<Key, Value> f1Var, v vVar) {
            j.f(z0Var, "this$0");
            j.f(f1Var, "pageFetcherSnapshot");
            j.f(vVar, "retryEventBus");
            this.f8572a = f1Var;
        }

        public final void a(v2 v2Var) {
            f1<Key, Value> f1Var = this.f8572a;
            f1Var.getClass();
            h0 h0Var = f1Var.f8203i;
            h0Var.getClass();
            h0Var.f8259a.a(v2Var instanceof v2.a ? (v2.a) v2Var : null, new j0(v2Var));
        }
    }

    public z0(l lVar, Object obj, w1 w1Var) {
        this.f8563a = lVar;
        this.f8564b = obj;
        this.f8565c = w1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r9 == r2) goto L_0x00f0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(f3.z0 r7, f3.f2 r8, jf.d r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof f3.b1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0016
            r0 = r9
            f3.b1 r0 = (f3.b1) r0
            int r2 = r0.f8089e
            r3 = r2 & r1
            if (r3 == 0) goto L_0x0016
            int r2 = r2 - r1
            r0.f8089e = r2
            goto L_0x001b
        L_0x0016:
            f3.b1 r0 = new f3.b1
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.f8087c
            kf.a r2 = kf.a.f10464a
            int r3 = r0.f8089e
            r4 = 1
            if (r3 == 0) goto L_0x0036
            if (r3 != r4) goto L_0x002e
            f3.f2 r8 = r0.f8086b
            f3.z0 r7 = r0.f8085a
            cb.b.J(r9)
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            cb.b.J(r9)
            r0.f8085a = r7
            r0.f8086b = r8
            r0.f8089e = r4
            rf.l<jf.d<? super f3.f2<Key, Value>>, java.lang.Object> r9 = r7.f8563a
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r2) goto L_0x0049
            goto L_0x00f0
        L_0x0049:
            r2 = r9
            f3.f2 r2 = (f3.f2) r2
            boolean r9 = r2 instanceof f3.l0
            r0 = 0
            if (r9 == 0) goto L_0x0083
            r9 = r2
            f3.l0 r9 = (f3.l0) r9
            f3.w1 r3 = r7.f8565c
            r3.getClass()
            int r3 = r9.f8326b
            r5 = 10
            if (r3 == r1) goto L_0x0064
            if (r5 != r3) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r1 = r0
            goto L_0x0065
        L_0x0064:
            r1 = r4
        L_0x0065:
            if (r1 == 0) goto L_0x006a
            r9.f8326b = r5
            goto L_0x0083
        L_0x006a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Page size is already set to "
            r7.<init>(r8)
            int r8 = r9.f8326b
            r9 = 46
            java.lang.String r7 = rb.b.a(r7, r8, r9)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0083:
            if (r2 == r8) goto L_0x0087
            r9 = r4
            goto L_0x0088
        L_0x0087:
            r9 = r0
        L_0x0088:
            if (r9 == 0) goto L_0x00fb
            f3.c1 r9 = new f3.c1
            r9.<init>(r7)
            r2.getClass()
            f3.k0<rf.a<ff.m>> r1 = r2.f8219a
            rf.a<java.lang.Boolean> r3 = r1.f8297b
            if (r3 != 0) goto L_0x0099
            goto L_0x00a7
        L_0x0099:
            java.lang.Object r3 = r3.d()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r4) goto L_0x00a7
            r3 = r4
            goto L_0x00a8
        L_0x00a7:
            r3 = r0
        L_0x00a8:
            if (r3 == 0) goto L_0x00ad
            r1.a()
        L_0x00ad:
            boolean r3 = r1.f8300e
            rf.l<T, ff.m> r5 = r1.f8296a
            if (r3 == 0) goto L_0x00b7
            r5.invoke(r9)
            goto L_0x00d1
        L_0x00b7:
            java.util.concurrent.locks.ReentrantLock r3 = r1.f8298c
            r3.lock()
            boolean r6 = r1.f8300e     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x00c3
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x00f6 }
            goto L_0x00c9
        L_0x00c3:
            java.util.ArrayList r1 = r1.f8299d     // Catch:{ all -> 0x00f6 }
            r1.add(r9)     // Catch:{ all -> 0x00f6 }
            r4 = r0
        L_0x00c9:
            r3.unlock()
            if (r4 == 0) goto L_0x00d1
            r5.invoke(r9)
        L_0x00d1:
            if (r8 != 0) goto L_0x00d4
            goto L_0x00e8
        L_0x00d4:
            f3.d1 r9 = new f3.d1
            r9.<init>(r7)
            f3.k0<rf.a<ff.m>> r7 = r8.f8219a
            java.util.concurrent.locks.ReentrantLock r0 = r7.f8298c
            r0.lock()
            java.util.ArrayList r7 = r7.f8299d     // Catch:{ all -> 0x00f1 }
            r7.remove(r9)     // Catch:{ all -> 0x00f1 }
            r0.unlock()
        L_0x00e8:
            if (r8 != 0) goto L_0x00eb
            goto L_0x00f0
        L_0x00eb:
            f3.k0<rf.a<ff.m>> r7 = r8.f8219a
            r7.a()
        L_0x00f0:
            return r2
        L_0x00f1:
            r7 = move-exception
            r0.unlock()
            throw r7
        L_0x00f6:
            r7 = move-exception
            r3.unlock()
            throw r7
        L_0x00fb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.z0.a(f3.z0, f3.f2, jf.d):java.lang.Object");
    }
}
