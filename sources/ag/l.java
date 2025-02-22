package ag;

import ab.r;
import ag.n1;
import d2.f1;
import ff.h;
import ff.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.f;
import kotlinx.coroutines.internal.v;
import lf.d;

public class l<T> extends q0<T> implements k<T>, d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    public u0 B;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = b.f393a;

    /* renamed from: d  reason: collision with root package name */
    public final jf.d<T> f434d;

    /* renamed from: e  reason: collision with root package name */
    public final f f435e;

    static {
        Class<l> cls = l.class;
        C = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        D = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    public l(int i8, jf.d dVar) {
        super(i8);
        this.f434d = dVar;
        this.f435e = dVar.getContext();
    }

    public static Object B(a2 a2Var, Object obj, int i8, rf.l lVar, Object obj2) {
        if (obj instanceof w) {
            return obj;
        }
        boolean z10 = true;
        if (!(i8 == 1 || i8 == 2)) {
            z10 = false;
        }
        if (!z10 && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(a2Var instanceof i) || (a2Var instanceof e)) && obj2 == null)) {
            return obj;
        }
        return new v(obj, a2Var instanceof i ? (i) a2Var : null, lVar, obj2, (CancellationException) null, 16);
    }

    public static void x(Object obj, rf.l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i8, rf.l<? super Throwable, m> lVar) {
        boolean z10;
        do {
            Object obj2 = this._state;
            z10 = false;
            if (obj2 instanceof a2) {
                Object B2 = B((a2) obj2, obj, i8, lVar, (Object) null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    nVar.getClass();
                    if (n.f445c.compareAndSet(nVar, 0, 1)) {
                        if (lVar != null) {
                            o(lVar, nVar.f504a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z10);
        if (!w()) {
            p();
        }
        q(i8);
    }

    public final v C(Object obj, Object obj2, rf.l<? super Throwable, m> lVar) {
        v vVar;
        boolean z10;
        do {
            Object obj3 = this._state;
            boolean z11 = obj3 instanceof a2;
            vVar = m.f438a;
            if (z11) {
                Object B2 = B((a2) obj3, obj, this.f474c, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, B2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof v)) {
                return null;
            } else {
                if (obj2 == null || ((v) obj3).f495d != obj2) {
                    return null;
                }
                return vVar;
            }
        } while (!z10);
        if (!w()) {
            p();
        }
        return vVar;
    }

    public final v a(Object obj, rf.l lVar) {
        return C(obj, (Object) null, lVar);
    }

    public final v b(Object obj, Object obj2) {
        return C(obj, obj2, (rf.l<? super Throwable, m>) null);
    }

    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof a2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof w)) {
                boolean z10 = true;
                if (obj2 instanceof v) {
                    v vVar = (v) obj2;
                    if (!(vVar.f496e != null)) {
                        v a10 = v.a(vVar, (i) null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            i iVar = vVar.f493b;
                            if (iVar != null) {
                                k(iVar, cancellationException);
                            }
                            rf.l<Throwable, m> lVar = vVar.f494c;
                            if (lVar != null) {
                                o(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                    v vVar2 = new v(obj2, (i) null, (rf.l) null, (Object) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, vVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final jf.d<T> d() {
        return this.f434d;
    }

    public final Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    public final <T> T f(Object obj) {
        return obj instanceof v ? ((v) obj).f492a : obj;
    }

    public final void g() {
        q(this.f474c);
    }

    public final d getCallerFrame() {
        jf.d<T> dVar = this.f434d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final f getContext() {
        return this.f435e;
    }

    public final void i(c0 c0Var, m mVar) {
        jf.d<T> dVar = this.f434d;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        A(mVar, (fVar != null ? fVar.f10709d : null) == c0Var ? 4 : this.f474c, (rf.l<? super Throwable, m>) null);
    }

    public final Object j() {
        return this._state;
    }

    public final void k(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            f1.z(this.f435e, new r("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final v l(Throwable th) {
        return C(new w(th, false), (Object) null, (rf.l<? super Throwable, m>) null);
    }

    public final void m(rf.l<? super Throwable, m> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f1.z(this.f435e, new r("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean n(Throwable th) {
        Object obj;
        boolean z10;
        boolean z11;
        do {
            obj = this._state;
            z10 = false;
            if (obj instanceof a2) {
                z11 = obj instanceof i;
                n nVar = new n(this, th, z11);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z10);
        i iVar = z11 ? (i) obj : null;
        if (iVar != null) {
            k(iVar, th);
        }
        if (!w()) {
            p();
        }
        q(this.f474c);
        return true;
    }

    public final void o(rf.l<? super Throwable, m> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f1.z(this.f435e, new r("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void p() {
        u0 u0Var = this.B;
        if (u0Var != null) {
            u0Var.a();
            this.B = z1.f519a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = r2
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = C
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r3
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            jf.d<T> r0 = r6.f434d
            r4 = 4
            if (r7 != r4) goto L_0x002a
            r4 = r3
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            if (r4 != 0) goto L_0x0080
            boolean r5 = r0 instanceof kotlinx.coroutines.internal.f
            if (r5 == 0) goto L_0x0080
            if (r7 == r3) goto L_0x0038
            if (r7 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r2
            goto L_0x0039
        L_0x0038:
            r7 = r3
        L_0x0039:
            int r5 = r6.f474c
            if (r5 == r3) goto L_0x003f
            if (r5 != r1) goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            if (r7 != r2) goto L_0x0080
            r7 = r0
            kotlinx.coroutines.internal.f r7 = (kotlinx.coroutines.internal.f) r7
            ag.c0 r7 = r7.f10709d
            jf.f r0 = r0.getContext()
            boolean r1 = r7.H0()
            if (r1 == 0) goto L_0x0055
            r7.F0(r0, r6)
            goto L_0x0083
        L_0x0055:
            ag.y0 r7 = ag.i2.a()
            boolean r0 = r7.M0()
            if (r0 == 0) goto L_0x0063
            r7.K0(r6)
            goto L_0x0083
        L_0x0063:
            r7.L0(r3)
            jf.d<T> r0 = r6.f434d     // Catch:{ all -> 0x0072 }
            d2.f1.G(r6, r0, r3)     // Catch:{ all -> 0x0072 }
        L_0x006b:
            boolean r0 = r7.O0()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006b
            goto L_0x0077
        L_0x0072:
            r0 = move-exception
            r1 = 0
            r6.h(r0, r1)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r7.J0(r3)
            goto L_0x0083
        L_0x007b:
            r0 = move-exception
            r7.J0(r3)
            throw r0
        L_0x0080:
            d2.f1.G(r6, r0, r4)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.l.q(int):void");
    }

    public Throwable r(s1 s1Var) {
        return s1Var.F();
    }

    public final void resumeWith(Object obj) {
        Throwable a10 = h.a(obj);
        if (a10 != null) {
            obj = new w(a10, false);
        }
        A(obj, this.f474c, (rf.l<? super Throwable, m>) null);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [jf.d<T>] */
    /* JADX WARNING: type inference failed for: r0v9, types: [jf.d<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s() {
        /*
            r6 = this;
            boolean r0 = r6.w()
        L_0x0004:
            int r1 = r6._decision
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x000f
            r1 = r4
            goto L_0x0024
        L_0x000f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x001b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = C
            boolean r1 = r1.compareAndSet(r6, r4, r3)
            if (r1 == 0) goto L_0x0004
            r1 = r3
        L_0x0024:
            r5 = 0
            if (r1 == 0) goto L_0x004b
            ag.u0 r1 = r6.B
            if (r1 != 0) goto L_0x002e
            r6.u()
        L_0x002e:
            if (r0 == 0) goto L_0x0048
            jf.d<T> r0 = r6.f434d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.f
            if (r1 == 0) goto L_0x0039
            r5 = r0
            kotlinx.coroutines.internal.f r5 = (kotlinx.coroutines.internal.f) r5
        L_0x0039:
            if (r5 == 0) goto L_0x0048
            java.lang.Throwable r0 = r5.q(r6)
            if (r0 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            r6.p()
            r6.n(r0)
        L_0x0048:
            kf.a r0 = kf.a.f10464a
            return r0
        L_0x004b:
            if (r0 == 0) goto L_0x0065
            jf.d<T> r0 = r6.f434d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.f
            if (r1 == 0) goto L_0x0056
            r5 = r0
            kotlinx.coroutines.internal.f r5 = (kotlinx.coroutines.internal.f) r5
        L_0x0056:
            if (r5 == 0) goto L_0x0065
            java.lang.Throwable r0 = r5.q(r6)
            if (r0 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r6.p()
            r6.n(r0)
        L_0x0065:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof ag.w
            if (r1 != 0) goto L_0x0095
            int r1 = r6.f474c
            if (r1 == r3) goto L_0x0073
            if (r1 != r2) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r3 = r4
        L_0x0073:
            if (r3 == 0) goto L_0x0090
            jf.f r1 = r6.f435e
            ag.n1$b r2 = ag.n1.b.f447a
            jf.f$b r1 = r1.d(r2)
            ag.n1 r1 = (ag.n1) r1
            if (r1 == 0) goto L_0x0090
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            java.util.concurrent.CancellationException r1 = r1.F()
            r6.c(r0, r1)
            throw r1
        L_0x0090:
            java.lang.Object r0 = r6.f(r0)
            return r0
        L_0x0095:
            ag.w r0 = (ag.w) r0
            java.lang.Throwable r0 = r0.f504a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.l.s():java.lang.Object");
    }

    public final void t() {
        u0 u7 = u();
        if (u7 != null && (!(this._state instanceof a2))) {
            u7.a();
            this.B = z1.f519a;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(i0.e(this.f434d));
        sb2.append("){");
        Object obj = this._state;
        sb2.append(obj instanceof a2 ? "Active" : obj instanceof n ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(i0.d(this));
        return sb2.toString();
    }

    public final u0 u() {
        n1 n1Var = (n1) this.f435e.d(n1.b.f447a);
        if (n1Var == null) {
            return null;
        }
        u0 a10 = n1.a.a(n1Var, true, new o(this), 2);
        this.B = a10;
        return a10;
    }

    public final void v(rf.l<? super Throwable, m> lVar) {
        i k1Var = lVar instanceof i ? (i) lVar : new k1(lVar);
        while (true) {
            Object obj = this._state;
            boolean z10 = true;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof i)) {
                    boolean z11 = obj instanceof w;
                    if (z11) {
                        w wVar = (w) obj;
                        wVar.getClass();
                        if (!w.f503b.compareAndSet(wVar, 0, 1)) {
                            x(obj, lVar);
                            throw null;
                        } else if (obj instanceof n) {
                            if (!z11) {
                                wVar = null;
                            }
                            if (wVar != null) {
                                th = wVar.f504a;
                            }
                            m(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof v) {
                        v vVar = (v) obj;
                        if (vVar.f493b != null) {
                            x(obj, lVar);
                            throw null;
                        } else if (!(k1Var instanceof e)) {
                            Throwable th2 = vVar.f496e;
                            if (th2 != null) {
                                m(lVar, th2);
                                return;
                            }
                            v a10 = v.a(vVar, k1Var, (CancellationException) null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                            while (true) {
                                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                        z10 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z10) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(k1Var instanceof e)) {
                        v vVar2 = new v(obj, k1Var, (rf.l) null, (Object) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = D;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, vVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    x(obj, lVar);
                    throw null;
                }
            }
        }
    }

    public final boolean w() {
        return (this.f474c == 2) && ((kotlinx.coroutines.internal.f) this.f434d).m();
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final boolean z() {
        Object obj = this._state;
        if (!(obj instanceof v) || ((v) obj).f495d == null) {
            this._decision = 0;
            this._state = b.f393a;
            return true;
        }
        p();
        return false;
    }
}
