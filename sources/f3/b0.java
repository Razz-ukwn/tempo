package f3;

import gc.b;
import gf.v;
import kotlinx.coroutines.sync.d;
import lf.c;
import lf.e;

public final class b0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c0<T> f8077a = new c0<>();

    /* renamed from: b  reason: collision with root package name */
    public final d f8078b = b.b();

    /* renamed from: c  reason: collision with root package name */
    public int f8079c = -1;

    @e(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {262}, m = "record")
    public static final class a extends c {
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public b0 f8080a;

        /* renamed from: b  reason: collision with root package name */
        public v f8081b;

        /* renamed from: c  reason: collision with root package name */
        public d f8082c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f8083d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ b0<T> f8084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b0<T> b0Var, jf.d<? super a> dVar) {
            super(dVar);
            this.f8084e = b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8083d = obj;
            this.B |= Integer.MIN_VALUE;
            return this.f8084e.b((v) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable a(jf.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof f3.a0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            f3.a0 r0 = (f3.a0) r0
            int r1 = r0.f8054e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8054e = r1
            goto L_0x0018
        L_0x0013:
            f3.a0 r0 = new f3.a0
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8052c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f8054e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlinx.coroutines.sync.d r1 = r0.f8051b
            f3.b0 r0 = r0.f8050a
            cb.b.J(r9)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0033:
            cb.b.J(r9)
            r0.f8050a = r8
            kotlinx.coroutines.sync.d r9 = r8.f8078b
            r0.f8051b = r9
            r0.f8054e = r3
            java.lang.Object r0 = r9.b(r0)
            if (r0 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r8
            r1 = r9
        L_0x0047:
            r9 = 0
            f3.c0<T> r2 = r0.f8077a     // Catch:{ all -> 0x0089 }
            java.util.List r2 = r2.b()     // Catch:{ all -> 0x0089 }
            int r0 = r0.f8079c     // Catch:{ all -> 0x0089 }
            int r4 = r2.size()     // Catch:{ all -> 0x0089 }
            int r0 = r0 - r4
            int r0 = r0 + r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0089 }
            int r4 = gf.m.n0(r2)     // Catch:{ all -> 0x0089 }
            r3.<init>(r4)     // Catch:{ all -> 0x0089 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0089 }
            r4 = 0
        L_0x0066:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0089 }
            if (r5 == 0) goto L_0x0085
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0089 }
            int r6 = r4 + 1
            if (r4 < 0) goto L_0x0081
            f3.y0 r5 = (f3.y0) r5     // Catch:{ all -> 0x0089 }
            gf.v r7 = new gf.v     // Catch:{ all -> 0x0089 }
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0089 }
            r3.add(r7)     // Catch:{ all -> 0x0089 }
            r4 = r6
            goto L_0x0066
        L_0x0081:
            cb.d.i0()     // Catch:{ all -> 0x0089 }
            throw r9     // Catch:{ all -> 0x0089 }
        L_0x0085:
            r1.a(r9)
            return r3
        L_0x0089:
            r0 = move-exception
            r1.a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.b0.a(jf.d):java.io.Serializable");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(gf.v<? extends f3.y0<T>> r5, jf.d<? super ff.m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f3.b0.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            f3.b0$a r0 = (f3.b0.a) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.B = r1
            goto L_0x0018
        L_0x0013:
            f3.b0$a r0 = new f3.b0$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8083d
            kf.a r1 = kf.a.f10464a
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlinx.coroutines.sync.d r5 = r0.f8082c
            gf.v r1 = r0.f8081b
            f3.b0 r0 = r0.f8080a
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
            r0.f8080a = r4
            r0.f8081b = r5
            kotlinx.coroutines.sync.d r6 = r4.f8078b
            r0.f8082c = r6
            r0.B = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            r1 = 0
            int r2 = r5.f8981a     // Catch:{ all -> 0x0062 }
            r0.f8079c = r2     // Catch:{ all -> 0x0062 }
            f3.c0<T> r0 = r0.f8077a     // Catch:{ all -> 0x0062 }
            T r5 = r5.f8982b     // Catch:{ all -> 0x0062 }
            f3.y0 r5 = (f3.y0) r5     // Catch:{ all -> 0x0062 }
            r0.a(r5)     // Catch:{ all -> 0x0062 }
            ff.m r5 = ff.m.f8717a     // Catch:{ all -> 0x0062 }
            r6.a(r1)
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x0062:
            r5 = move-exception
            r6.a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.b0.b(gf.v, jf.d):java.lang.Object");
    }
}
