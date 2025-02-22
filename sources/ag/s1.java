package ag;

import ab.r;
import ag.n1;
import androidx.fragment.app.z0;
import ff.m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.p;
import rf.l;
import sf.j;

public class s1 implements n1, r, b2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f482a = AtomicReferenceFieldUpdater.newUpdater(s1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public static final class a<T> extends l<T> {
        public final s1 E;

        public a(d<? super T> dVar, s1 s1Var) {
            super(1, dVar);
            this.E = s1Var;
        }

        public final Throwable r(s1 s1Var) {
            Throwable b10;
            Object S = this.E.S();
            return (!(S instanceof c) || (b10 = ((c) S).b()) == null) ? S instanceof w ? ((w) S).f504a : s1Var.F() : b10;
        }

        public final String y() {
            return "AwaitContinuation";
        }
    }

    public static final class b extends r1 {
        public final c B;
        public final q C;
        public final Object D;

        /* renamed from: e  reason: collision with root package name */
        public final s1 f483e;

        public b(s1 s1Var, c cVar, q qVar, Object obj) {
            this.f483e = s1Var;
            this.B = cVar;
            this.C = qVar;
            this.D = obj;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            w((Throwable) obj);
            return m.f8717a;
        }

        public final void w(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f482a;
            s1 s1Var = this.f483e;
            s1Var.getClass();
            q i02 = s1.i0(this.C);
            c cVar = this.B;
            Object obj = this.D;
            if (i02 == null || !s1Var.y0(cVar, i02, obj)) {
                s1Var.v(s1Var.H(cVar, obj));
            }
        }
    }

    public static final class c implements h1 {
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        public final y1 f484a;

        public c(y1 y1Var, Throwable th) {
            this.f484a = y1Var;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final Throwable b() {
            return (Throwable) this._rootCause;
        }

        public final boolean c() {
            return ((Throwable) this._rootCause) == null;
        }

        public final boolean d() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        public final boolean e() {
            return this._isCompleting;
        }

        public final boolean f() {
            return this._exceptionsHolder == v1.f502e;
        }

        public final ArrayList g(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !j.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = v1.f502e;
            return arrayList;
        }

        public final void h() {
            this._isCompleting = 1;
        }

        public final y1 i() {
            return this.f484a;
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [boolean, int] */
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + this._isCompleting + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f484a + ']';
        }
    }

    public s1(boolean z10) {
        this._state = z10 ? v1.C : v1.B;
        this._parentHandle = null;
    }

    public static q i0(i iVar) {
        while (iVar.s()) {
            iVar = iVar.q();
        }
        while (true) {
            iVar = iVar.p();
            if (!iVar.s()) {
                if (iVar instanceof q) {
                    return (q) iVar;
                }
                if (iVar instanceof y1) {
                    return null;
                }
            }
        }
    }

    public static String t0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof h1 ? ((h1) obj).c() ? "Active" : "New" : obj instanceof w ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.d()) {
            return "Cancelling";
        }
        if (cVar.e()) {
            return "Completing";
        }
    }

    public final boolean A(Throwable th) {
        if (Z()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        p pVar = (p) this._parentHandle;
        return (pVar == null || pVar == z1.f519a) ? z10 : pVar.h(th) || z10;
    }

    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && M();
    }

    public final void E(h1 h1Var, Object obj) {
        p pVar = (p) this._parentHandle;
        if (pVar != null) {
            pVar.a();
            this._parentHandle = z1.f519a;
        }
        r rVar = null;
        w wVar = obj instanceof w ? (w) obj : null;
        Throwable th = wVar != null ? wVar.f504a : null;
        if (h1Var instanceof r1) {
            try {
                ((r1) h1Var).w(th);
            } catch (Throwable th2) {
                V(new r("Exception in completion handler " + h1Var + " for " + this, th2));
            }
        } else {
            y1 i8 = h1Var.i();
            if (i8 != null) {
                for (i iVar = (i) i8.o(); !j.a(iVar, i8); iVar = iVar.p()) {
                    if (iVar instanceof r1) {
                        r1 r1Var = (r1) iVar;
                        try {
                            r1Var.w(th);
                        } catch (Throwable th3) {
                            if (rVar != null) {
                                z0.c(rVar, th3);
                            } else {
                                rVar = new r("Exception in completion handler " + r1Var + " for " + this, th3);
                                m mVar = m.f8717a;
                            }
                        }
                    }
                }
                if (rVar != null) {
                    V(rVar);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException F() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.S()
            boolean r1 = r0 instanceof ag.s1.c
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004c
            ag.s1$c r0 = (ag.s1.c) r0
            java.lang.Throwable r0 = r0.b()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0080
            ag.o1 r2 = new ag.o1
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.B()
        L_0x0032:
            r2.<init>(r1, r0, r4)
            goto L_0x0080
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x004c:
            boolean r1 = r0 instanceof ag.h1
            if (r1 != 0) goto L_0x0081
            boolean r1 = r0 instanceof ag.w
            if (r1 == 0) goto L_0x006c
            ag.w r0 = (ag.w) r0
            java.lang.Throwable r0 = r0.f504a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x005f
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0080
            ag.o1 r1 = new ag.o1
            java.lang.String r2 = r4.B()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0080
        L_0x006c:
            ag.o1 r0 = new ag.o1
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.F():java.util.concurrent.CancellationException");
    }

    public final Throwable G(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new o1(B(), (Throwable) null, this) : th;
        } else if (obj != null) {
            return ((b2) obj).q0();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a A[LOOP:1: B:45:0x009a->B:48:0x00a5, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(ag.s1.c r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ag.w
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            ag.w r0 = (ag.w) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.f504a
        L_0x000e:
            monitor-enter(r8)
            r8.d()     // Catch:{ all -> 0x00ab }
            java.util.ArrayList r0 = r8.g(r1)     // Catch:{ all -> 0x00ab }
            java.lang.Throwable r2 = r7.J(r8, r0)     // Catch:{ all -> 0x00ab }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x00ab }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x00ab }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00ab }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ab }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00ab }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00ab }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00ab }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00ab }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0035
            androidx.fragment.app.z0.c(r2, r5)     // Catch:{ all -> 0x00ab }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            ag.w r9 = new ag.w
            r9.<init>(r2, r0)
        L_0x0060:
            if (r2 == 0) goto L_0x0087
            boolean r1 = r7.A(r2)
            if (r1 != 0) goto L_0x0071
            boolean r1 = r7.U(r2)
            if (r1 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = r0
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            if (r1 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x007f
            r1 = r9
            ag.w r1 = (ag.w) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = ag.w.f503b
            r2.compareAndSet(r1, r0, r3)
            goto L_0x0087
        L_0x007f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r8.<init>(r9)
            throw r8
        L_0x0087:
            r7.l0(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f482a
            boolean r1 = r9 instanceof ag.h1
            if (r1 == 0) goto L_0x0099
            ag.i1 r1 = new ag.i1
            r2 = r9
            ag.h1 r2 = (ag.h1) r2
            r1.<init>(r2)
            goto L_0x009a
        L_0x0099:
            r1 = r9
        L_0x009a:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x009a
        L_0x00a7:
            r7.E(r8, r9)
            return r9
        L_0x00ab:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.H(ag.s1$c, java.lang.Object):java.lang.Object");
    }

    public final Object I() {
        Object S = S();
        if (!(!(S instanceof h1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(S instanceof w)) {
            return v1.m(S);
        } else {
            throw ((w) S).f504a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable J(ag.s1.c r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.d()
            if (r6 == 0) goto L_0x0017
            ag.o1 r6 = new ag.o1
            java.lang.String r7 = r5.B()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r6 = r7.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof ag.l2
            if (r3 == 0) goto L_0x0063
            java.util.Iterator r7 = r7.iterator()
        L_0x0045:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L_0x005a
            boolean r4 = r4 instanceof ag.l2
            if (r4 == 0) goto L_0x005a
            r4 = r2
            goto L_0x005b
        L_0x005a:
            r4 = r6
        L_0x005b:
            if (r4 == 0) goto L_0x0045
            r1 = r3
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.J(ag.s1$c, java.util.ArrayList):java.lang.Throwable");
    }

    public boolean M() {
        return true;
    }

    public boolean N() {
        return this instanceof t;
    }

    public final y1 O(h1 h1Var) {
        y1 i8 = h1Var.i();
        if (i8 != null) {
            return i8;
        }
        if (h1Var instanceof x0) {
            return new y1();
        }
        if (h1Var instanceof r1) {
            r0((r1) h1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + h1Var).toString());
    }

    public final p P() {
        return (p) this._parentHandle;
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [ag.g1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ag.u0 Q(boolean r11, boolean r12, rf.l<? super java.lang.Throwable, ff.m> r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0014
            boolean r1 = r13 instanceof ag.p1
            if (r1 == 0) goto L_0x000b
            r1 = r13
            ag.p1 r1 = (ag.p1) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0025
            ag.l1 r1 = new ag.l1
            r1.<init>(r13)
            goto L_0x0025
        L_0x0014:
            boolean r1 = r13 instanceof ag.r1
            if (r1 == 0) goto L_0x001c
            r1 = r13
            ag.r1 r1 = (ag.r1) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            ag.m1 r1 = new ag.m1
            r1.<init>(r13)
        L_0x0025:
            r1.f477d = r10
        L_0x0027:
            java.lang.Object r2 = r10.S()
            boolean r3 = r2 instanceof ag.x0
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x006b
            r3 = r2
            ag.x0 r3 = (ag.x0) r3
            boolean r6 = r3.f509a
            if (r6 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f482a
        L_0x003a:
            boolean r3 = r6.compareAndSet(r10, r2, r1)
            if (r3 == 0) goto L_0x0042
            r4 = r5
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r6.get(r10)
            if (r3 == r2) goto L_0x003a
        L_0x0048:
            if (r4 == 0) goto L_0x0027
            return r1
        L_0x004b:
            ag.y1 r2 = new ag.y1
            r2.<init>()
            boolean r4 = r3.f509a
            if (r4 == 0) goto L_0x0055
            goto L_0x005b
        L_0x0055:
            ag.g1 r4 = new ag.g1
            r4.<init>(r2)
            r2 = r4
        L_0x005b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f482a
            boolean r5 = r4.compareAndSet(r10, r3, r2)
            if (r5 == 0) goto L_0x0064
            goto L_0x0027
        L_0x0064:
            java.lang.Object r4 = r4.get(r10)
            if (r4 == r3) goto L_0x005b
            goto L_0x0027
        L_0x006b:
            boolean r3 = r2 instanceof ag.h1
            if (r3 == 0) goto L_0x00ed
            r3 = r2
            ag.h1 r3 = (ag.h1) r3
            ag.y1 r3 = r3.i()
            if (r3 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x0080
            ag.r1 r2 = (ag.r1) r2
            r10.r0(r2)
            goto L_0x0027
        L_0x0080:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r11.<init>(r12)
            throw r11
        L_0x0088:
            ag.z1 r6 = ag.z1.f519a
            r7 = 2
            if (r11 == 0) goto L_0x00ce
            boolean r8 = r2 instanceof ag.s1.c
            if (r8 == 0) goto L_0x00ce
            monitor-enter(r2)
            r8 = r2
            ag.s1$c r8 = (ag.s1.c) r8     // Catch:{ all -> 0x00cb }
            java.lang.Throwable r8 = r8.b()     // Catch:{ all -> 0x00cb }
            if (r8 == 0) goto L_0x00a8
            boolean r9 = r13 instanceof ag.q     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00c7
            r9 = r2
            ag.s1$c r9 = (ag.s1.c) r9     // Catch:{ all -> 0x00cb }
            boolean r9 = r9.e()     // Catch:{ all -> 0x00cb }
            if (r9 != 0) goto L_0x00c7
        L_0x00a8:
            ag.t1 r6 = new ag.t1     // Catch:{ all -> 0x00cb }
            r6.<init>(r1, r10, r2)     // Catch:{ all -> 0x00cb }
        L_0x00ad:
            kotlinx.coroutines.internal.i r9 = r3.q()     // Catch:{ all -> 0x00cb }
            int r9 = r9.v(r1, r3, r6)     // Catch:{ all -> 0x00cb }
            if (r9 == r5) goto L_0x00bc
            if (r9 == r7) goto L_0x00ba
            goto L_0x00ad
        L_0x00ba:
            r6 = r4
            goto L_0x00bd
        L_0x00bc:
            r6 = r5
        L_0x00bd:
            if (r6 != 0) goto L_0x00c2
            monitor-exit(r2)
            goto L_0x0027
        L_0x00c2:
            if (r8 != 0) goto L_0x00c6
            monitor-exit(r2)
            return r1
        L_0x00c6:
            r6 = r1
        L_0x00c7:
            ff.m r9 = ff.m.f8717a     // Catch:{ all -> 0x00cb }
            monitor-exit(r2)
            goto L_0x00cf
        L_0x00cb:
            r11 = move-exception
            monitor-exit(r2)
            throw r11
        L_0x00ce:
            r8 = r0
        L_0x00cf:
            if (r8 == 0) goto L_0x00d7
            if (r12 == 0) goto L_0x00d6
            r13.invoke(r8)
        L_0x00d6:
            return r6
        L_0x00d7:
            ag.t1 r6 = new ag.t1
            r6.<init>(r1, r10, r2)
        L_0x00dc:
            kotlinx.coroutines.internal.i r2 = r3.q()
            int r2 = r2.v(r1, r3, r6)
            if (r2 == r5) goto L_0x00e9
            if (r2 == r7) goto L_0x00ea
            goto L_0x00dc
        L_0x00e9:
            r4 = r5
        L_0x00ea:
            if (r4 == 0) goto L_0x0027
            return r1
        L_0x00ed:
            if (r12 == 0) goto L_0x00fe
            boolean r11 = r2 instanceof ag.w
            if (r11 == 0) goto L_0x00f6
            ag.w r2 = (ag.w) r2
            goto L_0x00f7
        L_0x00f6:
            r2 = r0
        L_0x00f7:
            if (r2 == 0) goto L_0x00fb
            java.lang.Throwable r0 = r2.f504a
        L_0x00fb:
            r13.invoke(r0)
        L_0x00fe:
            ag.z1 r11 = ag.z1.f519a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.Q(boolean, boolean, rf.l):ag.u0");
    }

    public final p R(s1 s1Var) {
        return (p) n1.a.a(this, true, new q(s1Var), 2);
    }

    public final Object S() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public boolean U(Throwable th) {
        return false;
    }

    public void V(r rVar) {
        throw rVar;
    }

    public final void W(n1 n1Var) {
        z1 z1Var = z1.f519a;
        if (n1Var == null) {
            this._parentHandle = z1Var;
            return;
        }
        n1Var.start();
        p R = n1Var.R(this);
        this._parentHandle = R;
        if (v0()) {
            R.a();
            this._parentHandle = z1Var;
        }
    }

    public boolean Z() {
        return this instanceof f;
    }

    public final boolean a0(Object obj) {
        Object u02;
        do {
            u02 = u0(S(), obj);
            if (u02 == v1.f498a) {
                return false;
            }
            if (u02 == v1.f499b) {
                return true;
            }
        } while (u02 == v1.f500c);
        v(u02);
        return true;
    }

    public final void b0(s1 s1Var) {
        x(s1Var);
    }

    public boolean c() {
        Object S = S();
        return (S instanceof h1) && ((h1) S).c();
    }

    public final Object c0(Object obj) {
        Object u02;
        do {
            u02 = u0(S(), obj);
            if (u02 == v1.f498a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                w wVar = obj instanceof w ? (w) obj : null;
                if (wVar != null) {
                    th = wVar.f504a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (u02 == v1.f500c);
        return u02;
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o1(B(), (Throwable) null, this);
        }
        y(cancellationException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e0(lf.c r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.S()
            boolean r1 = r0 instanceof ag.h1
            r2 = 1
            if (r1 != 0) goto L_0x000b
            r0 = 0
            goto L_0x0012
        L_0x000b:
            int r0 = r3.s0(r0)
            if (r0 < 0) goto L_0x0000
            r0 = r2
        L_0x0012:
            if (r0 != 0) goto L_0x001e
            jf.f r4 = r4.getContext()
            cb.d.z(r4)
            ff.m r4 = ff.m.f8717a
            return r4
        L_0x001e:
            ag.l r0 = new ag.l
            jf.d r4 = e9.c.g(r4)
            r0.<init>(r2, r4)
            r0.t()
            ag.e2 r4 = new ag.e2
            r4.<init>(r0)
            ag.u0 r4 = r3.k0(r4)
            ag.v0 r1 = new ag.v0
            r1.<init>(r4)
            r0.v(r1)
            java.lang.Object r4 = r0.s()
            kf.a r0 = kf.a.f10464a
            if (r4 != r0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            ff.m r4 = ff.m.f8717a
        L_0x0046:
            if (r4 != r0) goto L_0x0049
            return r4
        L_0x0049:
            ff.m r4 = ff.m.f8717a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.e0(lf.c):java.lang.Object");
    }

    public final f.c<?> getKey() {
        return n1.b.f447a;
    }

    public String h0() {
        return getClass().getSimpleName();
    }

    public final boolean isCancelled() {
        Object S = S();
        return (S instanceof w) || ((S instanceof c) && ((c) S).d());
    }

    public final void j0(y1 y1Var, Throwable th) {
        r rVar = null;
        for (i iVar = (i) y1Var.o(); !j.a(iVar, y1Var); iVar = iVar.p()) {
            if (iVar instanceof p1) {
                r1 r1Var = (r1) iVar;
                try {
                    r1Var.w(th);
                } catch (Throwable th2) {
                    if (rVar != null) {
                        z0.c(rVar, th2);
                    } else {
                        rVar = new r("Exception in completion handler " + r1Var + " for " + this, th2);
                        m mVar = m.f8717a;
                    }
                }
            }
        }
        if (rVar != null) {
            V(rVar);
        }
        A(th);
    }

    public final u0 k0(l<? super Throwable, m> lVar) {
        return Q(false, true, lVar);
    }

    public void l0(Object obj) {
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public void o0() {
    }

    public final <R> R p(R r10, rf.p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final yf.j q() {
        return new yf.j(new u1((d) null, this));
    }

    public final CancellationException q0() {
        Throwable th;
        Object S = S();
        CancellationException cancellationException = null;
        if (S instanceof c) {
            th = ((c) S).b();
        } else if (S instanceof w) {
            th = ((w) S).f504a;
        } else if (!(S instanceof h1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + S).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new o1("Parent job is ".concat(t0(S)), th, this) : cancellationException;
    }

    public final void r0(r1 r1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        y1 y1Var = new y1();
        r1Var.getClass();
        i.f10715b.lazySet(y1Var, r1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f10714a;
        atomicReferenceFieldUpdater2.lazySet(y1Var, r1Var);
        while (true) {
            if (r1Var.o() == r1Var) {
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(r1Var, r1Var, y1Var)) {
                        if (atomicReferenceFieldUpdater2.get(r1Var) != r1Var) {
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
                if (z10) {
                    y1Var.n(r1Var);
                    break;
                }
            } else {
                break;
            }
        }
        i p10 = r1Var.p();
        do {
            atomicReferenceFieldUpdater = f482a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, r1Var, p10) || atomicReferenceFieldUpdater.get(this) != r1Var) {
            }
            atomicReferenceFieldUpdater = f482a;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != r1Var);
    }

    public final Throwable s() {
        Object S = S();
        if (!(S instanceof h1)) {
            w wVar = S instanceof w ? (w) S : null;
            if (wVar != null) {
                return wVar.f504a;
            }
            return null;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final int s0(Object obj) {
        boolean z10 = obj instanceof x0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f482a;
        boolean z11 = false;
        if (z10) {
            if (((x0) obj).f509a) {
                return 0;
            }
            x0 x0Var = v1.C;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            o0();
            return 1;
        } else if (!(obj instanceof g1)) {
            return 0;
        } else {
            y1 y1Var = ((g1) obj).f419a;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                return -1;
            }
            o0();
            return 1;
        }
    }

    public final boolean start() {
        int s02;
        do {
            s02 = s0(S());
            if (s02 == 0) {
                return false;
            }
        } while (s02 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h0() + '{' + t0(S()) + '}');
        sb2.append('@');
        sb2.append(i0.d(this));
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bf, code lost:
        if (r6 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c1, code lost:
        j0(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c6, code lost:
        if ((r9 instanceof ag.q) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c8, code lost:
        r0 = (ag.q) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cd, code lost:
        if (r0 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00cf, code lost:
        r9 = r9.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d3, code lost:
        if (r9 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d5, code lost:
        r4 = i0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00da, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00db, code lost:
        if (r4 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e1, code lost:
        if (y0(r3, r4, r10) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return H(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return ag.v1.f499b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u0(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ag.h1
            if (r0 != 0) goto L_0x0007
            kotlinx.coroutines.internal.v r9 = ag.v1.f498a
            return r9
        L_0x0007:
            boolean r0 = r9 instanceof ag.x0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r9 instanceof ag.r1
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r9 instanceof ag.q
            if (r0 != 0) goto L_0x004c
            boolean r0 = r10 instanceof ag.w
            if (r0 != 0) goto L_0x004c
            r0 = r9
            ag.h1 r0 = (ag.h1) r0
            boolean r9 = r10 instanceof ag.h1
            if (r9 == 0) goto L_0x002a
            ag.i1 r9 = new ag.i1
            r3 = r10
            ag.h1 r3 = (ag.h1) r3
            r9.<init>(r3)
            r3 = r9
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f482a
            boolean r4 = r9.compareAndSet(r8, r0, r3)
            if (r4 == 0) goto L_0x0035
            r9 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r9 = r9.get(r8)
            if (r9 == r0) goto L_0x002b
            r9 = r2
        L_0x003c:
            if (r9 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r8.l0(r10)
            r8.E(r0, r10)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r10
        L_0x0049:
            kotlinx.coroutines.internal.v r9 = ag.v1.f500c
            return r9
        L_0x004c:
            ag.h1 r9 = (ag.h1) r9
            ag.y1 r0 = r8.O(r9)
            if (r0 != 0) goto L_0x0058
            kotlinx.coroutines.internal.v r9 = ag.v1.f500c
            goto L_0x00ea
        L_0x0058:
            boolean r3 = r9 instanceof ag.s1.c
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r9
            ag.s1$c r3 = (ag.s1.c) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            ag.s1$c r3 = new ag.s1$c
            r3.<init>(r0, r4)
        L_0x0069:
            sf.v r5 = new sf.v
            r5.<init>()
            monitor-enter(r3)
            boolean r6 = r3.e()     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x007a
            kotlinx.coroutines.internal.v r9 = ag.v1.f498a     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            goto L_0x00ea
        L_0x007a:
            r3.h()     // Catch:{ all -> 0x00eb }
            if (r3 == r9) goto L_0x0095
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f482a     // Catch:{ all -> 0x00eb }
        L_0x0081:
            boolean r7 = r6.compareAndSet(r8, r9, r3)     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x0089
            r2 = r1
            goto L_0x008f
        L_0x0089:
            java.lang.Object r7 = r6.get(r8)     // Catch:{ all -> 0x00eb }
            if (r7 == r9) goto L_0x0081
        L_0x008f:
            if (r2 != 0) goto L_0x0095
            kotlinx.coroutines.internal.v r9 = ag.v1.f500c     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            goto L_0x00ea
        L_0x0095:
            boolean r2 = r3.d()     // Catch:{ all -> 0x00eb }
            boolean r6 = r10 instanceof ag.w     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00a1
            r6 = r10
            ag.w r6 = (ag.w) r6     // Catch:{ all -> 0x00eb }
            goto L_0x00a2
        L_0x00a1:
            r6 = r4
        L_0x00a2:
            if (r6 == 0) goto L_0x00a9
            java.lang.Throwable r6 = r6.f504a     // Catch:{ all -> 0x00eb }
            r3.a(r6)     // Catch:{ all -> 0x00eb }
        L_0x00a9:
            java.lang.Throwable r6 = r3.b()     // Catch:{ all -> 0x00eb }
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00eb }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r6 = r4
        L_0x00ba:
            r5.f14957a = r6     // Catch:{ all -> 0x00eb }
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            if (r6 == 0) goto L_0x00c4
            r8.j0(r0, r6)
        L_0x00c4:
            boolean r0 = r9 instanceof ag.q
            if (r0 == 0) goto L_0x00cc
            r0 = r9
            ag.q r0 = (ag.q) r0
            goto L_0x00cd
        L_0x00cc:
            r0 = r4
        L_0x00cd:
            if (r0 != 0) goto L_0x00da
            ag.y1 r9 = r9.i()
            if (r9 == 0) goto L_0x00db
            ag.q r4 = i0(r9)
            goto L_0x00db
        L_0x00da:
            r4 = r0
        L_0x00db:
            if (r4 == 0) goto L_0x00e6
            boolean r9 = r8.y0(r3, r4, r10)
            if (r9 == 0) goto L_0x00e6
            kotlinx.coroutines.internal.v r9 = ag.v1.f499b
            goto L_0x00ea
        L_0x00e6:
            java.lang.Object r9 = r8.H(r3, r10)
        L_0x00ea:
            return r9
        L_0x00eb:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.u0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void v(Object obj) {
    }

    public final boolean v0() {
        return !(S() instanceof h1);
    }

    public final Object w(d<Object> dVar) {
        Object S;
        do {
            S = S();
            if (!(S instanceof h1)) {
                if (!(S instanceof w)) {
                    return v1.m(S);
                }
                throw ((w) S).f504a;
            }
        } while (s0(S) < 0);
        a aVar = new a(e9.c.g(dVar), this);
        aVar.t();
        aVar.v(new v0(k0(new d2(aVar))));
        return aVar.s();
    }

    public final f w0(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f4, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(java.lang.Object r10) {
        /*
            r9 = this;
            kotlinx.coroutines.internal.v r0 = ag.v1.f498a
            boolean r1 = r9.N()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.S()
            boolean r1 = r0 instanceof ag.h1
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof ag.s1.c
            if (r1 == 0) goto L_0x0020
            r1 = r0
            ag.s1$c r1 = (ag.s1.c) r1
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            ag.w r1 = new ag.w
            java.lang.Throwable r4 = r9.G(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.u0(r0, r1)
            kotlinx.coroutines.internal.v r1 = ag.v1.f500c
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            kotlinx.coroutines.internal.v r0 = ag.v1.f498a
        L_0x0034:
            kotlinx.coroutines.internal.v r1 = ag.v1.f499b
            if (r0 != r1) goto L_0x0039
            return r3
        L_0x0039:
            kotlinx.coroutines.internal.v r1 = ag.v1.f498a
            if (r0 != r1) goto L_0x00f5
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.S()
            boolean r5 = r4 instanceof ag.s1.c
            if (r5 == 0) goto L_0x008a
            monitor-enter(r4)
            r5 = r4
            ag.s1$c r5 = (ag.s1.c) r5     // Catch:{ all -> 0x0087 }
            boolean r5 = r5.f()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x0056
            kotlinx.coroutines.internal.v r10 = ag.v1.f501d     // Catch:{ all -> 0x0087 }
            monitor-exit(r4)
            goto L_0x00f4
        L_0x0056:
            r5 = r4
            ag.s1$c r5 = (ag.s1.c) r5     // Catch:{ all -> 0x0087 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0087 }
            if (r10 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x006d
        L_0x0061:
            if (r1 != 0) goto L_0x0067
            java.lang.Throwable r1 = r9.G(r10)     // Catch:{ all -> 0x0087 }
        L_0x0067:
            r10 = r4
            ag.s1$c r10 = (ag.s1.c) r10     // Catch:{ all -> 0x0087 }
            r10.a(r1)     // Catch:{ all -> 0x0087 }
        L_0x006d:
            r10 = r4
            ag.s1$c r10 = (ag.s1.c) r10     // Catch:{ all -> 0x0087 }
            java.lang.Throwable r10 = r10.b()     // Catch:{ all -> 0x0087 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0079
            r0 = r10
        L_0x0079:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x0083
            ag.s1$c r4 = (ag.s1.c) r4
            ag.y1 r10 = r4.f484a
            r9.j0(r10, r0)
        L_0x0083:
            kotlinx.coroutines.internal.v r10 = ag.v1.f498a
            goto L_0x00f4
        L_0x0087:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x008a:
            boolean r5 = r4 instanceof ag.h1
            if (r5 == 0) goto L_0x00f2
            if (r1 != 0) goto L_0x0094
            java.lang.Throwable r1 = r9.G(r10)
        L_0x0094:
            r5 = r4
            ag.h1 r5 = (ag.h1) r5
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x00c7
            ag.y1 r6 = r9.O(r5)
            if (r6 != 0) goto L_0x00a4
            goto L_0x00bc
        L_0x00a4:
            ag.s1$c r7 = new ag.s1$c
            r7.<init>(r6, r1)
        L_0x00a9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f482a
            boolean r8 = r4.compareAndSet(r9, r5, r7)
            if (r8 == 0) goto L_0x00b3
            r4 = r3
            goto L_0x00ba
        L_0x00b3:
            java.lang.Object r4 = r4.get(r9)
            if (r4 == r5) goto L_0x00a9
            r4 = r2
        L_0x00ba:
            if (r4 != 0) goto L_0x00be
        L_0x00bc:
            r4 = r2
            goto L_0x00c2
        L_0x00be:
            r9.j0(r6, r1)
            r4 = r3
        L_0x00c2:
            if (r4 == 0) goto L_0x003f
            kotlinx.coroutines.internal.v r10 = ag.v1.f498a
            goto L_0x00f4
        L_0x00c7:
            ag.w r5 = new ag.w
            r5.<init>(r1, r2)
            java.lang.Object r5 = r9.u0(r4, r5)
            kotlinx.coroutines.internal.v r6 = ag.v1.f498a
            if (r5 == r6) goto L_0x00da
            kotlinx.coroutines.internal.v r4 = ag.v1.f500c
            if (r5 == r4) goto L_0x003f
            r0 = r5
            goto L_0x00f5
        L_0x00da:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot happen in "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00f2:
            kotlinx.coroutines.internal.v r10 = ag.v1.f501d
        L_0x00f4:
            r0 = r10
        L_0x00f5:
            kotlinx.coroutines.internal.v r10 = ag.v1.f498a
            if (r0 != r10) goto L_0x00fa
            goto L_0x0107
        L_0x00fa:
            kotlinx.coroutines.internal.v r10 = ag.v1.f499b
            if (r0 != r10) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            kotlinx.coroutines.internal.v r10 = ag.v1.f501d
            if (r0 != r10) goto L_0x0104
            goto L_0x0108
        L_0x0104:
            r9.v(r0)
        L_0x0107:
            r2 = r3
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s1.x(java.lang.Object):boolean");
    }

    public void y(CancellationException cancellationException) {
        x(cancellationException);
    }

    public final boolean y0(c cVar, q qVar, Object obj) {
        do {
            if (n1.a.a(qVar.f473e, false, new b(this, cVar, qVar, obj), 1) != z1.f519a) {
                return true;
            }
            qVar = i0(qVar);
        } while (qVar != null);
        return false;
    }
}
