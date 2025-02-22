package t;

import jf.d;
import jf.f;
import lf.c;
import lf.e;
import rf.l;
import rf.p;
import sf.j;

public final class o1 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final e1 f15172a;

    /* renamed from: b  reason: collision with root package name */
    public final b1 f15173b = new b1();

    @e(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    public static final class a<R> extends c {

        /* renamed from: a  reason: collision with root package name */
        public o1 f15174a;

        /* renamed from: b  reason: collision with root package name */
        public l f15175b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f15176c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ o1 f15177d;

        /* renamed from: e  reason: collision with root package name */
        public int f15178e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o1 o1Var, d<? super a> dVar) {
            super(dVar);
            this.f15177d = o1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f15176c = obj;
            this.f15178e |= Integer.MIN_VALUE;
            return this.f15177d.Y((l) null, this);
        }
    }

    public o1(e1 e1Var) {
        this.f15172a = e1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:33:0x0087, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> java.lang.Object Y(rf.l<? super java.lang.Long, ? extends R> r7, jf.d<? super R> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t.o1.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            t.o1$a r0 = (t.o1.a) r0
            int r1 = r0.f15178e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15178e = r1
            goto L_0x0018
        L_0x0013:
            t.o1$a r0 = new t.o1$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f15176c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f15178e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cb.b.J(r8)
            goto L_0x008a
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            rf.l r7 = r0.f15175b
            t.o1 r2 = r0.f15174a
            cb.b.J(r8)
            goto L_0x007a
        L_0x003a:
            cb.b.J(r8)
            t.b1 r8 = r6.f15173b
            r0.f15174a = r6
            r0.f15175b = r7
            r0.f15178e = r4
            java.lang.Object r2 = r8.f14992a
            monitor-enter(r2)
            boolean r5 = r8.f14995d     // Catch:{ all -> 0x008e }
            monitor-exit(r2)
            if (r5 == 0) goto L_0x0050
            ff.m r8 = ff.m.f8717a
            goto L_0x0076
        L_0x0050:
            ag.l r2 = new ag.l
            jf.d r5 = e9.c.g(r0)
            r2.<init>(r4, r5)
            r2.t()
            java.lang.Object r4 = r8.f14992a
            monitor-enter(r4)
            java.util.List<jf.d<ff.m>> r5 = r8.f14993b     // Catch:{ all -> 0x008b }
            r5.add(r2)     // Catch:{ all -> 0x008b }
            monitor-exit(r4)
            t.a1 r4 = new t.a1
            r4.<init>(r8, r2)
            r2.v(r4)
            java.lang.Object r8 = r2.s()
            if (r8 != r1) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            ff.m r8 = ff.m.f8717a
        L_0x0076:
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r2 = r6
        L_0x007a:
            t.e1 r8 = r2.f15172a
            r2 = 0
            r0.f15174a = r2
            r0.f15175b = r2
            r0.f15178e = r3
            java.lang.Object r8 = r8.Y(r7, r0)
            if (r8 != r1) goto L_0x008a
            return r1
        L_0x008a:
            return r8
        L_0x008b:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L_0x008e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t.o1.Y(rf.l, jf.d):java.lang.Object");
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        return f.b.a.a(this, cVar);
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        return f.b.a.b(this, cVar);
    }
}
