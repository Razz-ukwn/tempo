package q;

import ag.g0;
import ff.m;
import jf.d;
import kotlinx.coroutines.sync.c;
import lf.e;
import lf.i;
import rf.l;
import rf.p;

@e(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
public final class w extends i implements p<g0, d<Object>, Object> {
    public final /* synthetic */ int B;
    public final /* synthetic */ v C;
    public final /* synthetic */ l<d<Object>, Object> D;

    /* renamed from: a  reason: collision with root package name */
    public c f12781a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12782b;

    /* renamed from: c  reason: collision with root package name */
    public v f12783c;

    /* renamed from: d  reason: collision with root package name */
    public int f12784d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f12785e;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, int] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(java.lang.Object r1, q.v r2, rf.l<? super jf.d<java.lang.Object>, ? extends java.lang.Object> r3, jf.d<? super q.w> r4) {
        /*
            r0 = this;
            r0.B = r1
            r0.C = r2
            r0.D = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.w.<init>(int, q.v, rf.l, jf.d):void");
    }

    public final d<m> create(Object obj, d<?> dVar) {
        w wVar = new w(this.B, this.C, this.D, dVar);
        wVar.f12785e = obj;
        return wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf A[Catch:{ all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x00e0=Splitter:B:51:0x00e0, B:39:0x00c6=Splitter:B:39:0x00c6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r11.f12784d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x003e
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r11.f12782b
            q.v r0 = (q.v) r0
            kotlinx.coroutines.sync.c r1 = r11.f12781a
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r2 = r11.f12785e
            q.v$a r2 = (q.v.a) r2
            cb.b.J(r12)     // Catch:{ all -> 0x001e }
            goto L_0x00c6
        L_0x001e:
            r12 = move-exception
            goto L_0x00e0
        L_0x0021:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0029:
            q.v r1 = r11.f12783c
            java.lang.Object r3 = r11.f12782b
            rf.l r3 = (rf.l) r3
            kotlinx.coroutines.sync.c r5 = r11.f12781a
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5
            java.lang.Object r6 = r11.f12785e
            q.v$a r6 = (q.v.a) r6
            cb.b.J(r12)
            r12 = r1
        L_0x003b:
            r1 = r5
            goto L_0x00af
        L_0x003e:
            cb.b.J(r12)
            java.lang.Object r12 = r11.f12785e
            ag.g0 r12 = (ag.g0) r12
            q.v$a r1 = new q.v$a
            jf.f r12 = r12.f0()
            ag.n1$b r5 = ag.n1.b.f447a
            jf.f$b r12 = r12.d(r5)
            sf.j.c(r12)
            ag.n1 r12 = (ag.n1) r12
            int r5 = r11.B
            r1.<init>(r5, r12)
        L_0x005b:
            q.v r12 = r11.C
            java.util.concurrent.atomic.AtomicReference<q.v$a> r5 = r12.f12776a
            java.lang.Object r6 = r5.get()
            q.v$a r6 = (q.v.a) r6
            r7 = 0
            if (r6 == 0) goto L_0x0080
            int r8 = r1.f12778a
            int r9 = r6.f12778a
            int r8 = q.g.a(r8, r9)
            if (r8 < 0) goto L_0x0074
            r8 = r3
            goto L_0x0075
        L_0x0074:
            r8 = r7
        L_0x0075:
            if (r8 == 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            java.util.concurrent.CancellationException r12 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Current mutation had a higher priority"
            r12.<init>(r0)
            throw r12
        L_0x0080:
            boolean r8 = r5.compareAndSet(r6, r1)
            if (r8 == 0) goto L_0x0088
            r7 = r3
            goto L_0x008e
        L_0x0088:
            java.lang.Object r8 = r5.get()
            if (r8 == r6) goto L_0x0080
        L_0x008e:
            if (r7 == 0) goto L_0x005b
            if (r6 == 0) goto L_0x0097
            ag.n1 r5 = r6.f12779b
            r5.e(r4)
        L_0x0097:
            r11.f12785e = r1
            kotlinx.coroutines.sync.d r5 = r12.f12777b
            r11.f12781a = r5
            rf.l<jf.d<java.lang.Object>, java.lang.Object> r6 = r11.D
            r11.f12782b = r6
            r11.f12783c = r12
            r11.f12784d = r3
            java.lang.Object r3 = r5.b(r11)
            if (r3 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r3 = r6
            r6 = r1
            goto L_0x003b
        L_0x00af:
            r11.f12785e = r6     // Catch:{ all -> 0x00db }
            r5 = r1
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5     // Catch:{ all -> 0x00db }
            r11.f12781a = r5     // Catch:{ all -> 0x00db }
            r11.f12782b = r12     // Catch:{ all -> 0x00db }
            r11.f12783c = r4     // Catch:{ all -> 0x00db }
            r11.f12784d = r2     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = r3.invoke(r11)     // Catch:{ all -> 0x00db }
            if (r2 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r0 = r12
            r12 = r2
            r2 = r6
        L_0x00c6:
            java.util.concurrent.atomic.AtomicReference<q.v$a> r0 = r0.f12776a     // Catch:{ all -> 0x00d9 }
        L_0x00c8:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x00cf
            goto L_0x00d5
        L_0x00cf:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00d9 }
            if (r3 == r2) goto L_0x00c8
        L_0x00d5:
            r1.a(r4)
            return r12
        L_0x00d9:
            r12 = move-exception
            goto L_0x00f0
        L_0x00db:
            r0 = move-exception
            r2 = r6
            r10 = r0
            r0 = r12
            r12 = r10
        L_0x00e0:
            java.util.concurrent.atomic.AtomicReference<q.v$a> r0 = r0.f12776a     // Catch:{ all -> 0x00d9 }
        L_0x00e2:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00d9 }
            if (r3 != 0) goto L_0x00ef
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00d9 }
            if (r3 != r2) goto L_0x00ef
            goto L_0x00e2
        L_0x00ef:
            throw r12     // Catch:{ all -> 0x00d9 }
        L_0x00f0:
            r1.a(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
