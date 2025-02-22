package kotlinx.coroutines.internal;

import ag.i0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sf.j;
import sf.p;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10714a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10715b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10716c;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends b<i> {

        /* renamed from: b  reason: collision with root package name */
        public final i f10717b;

        /* renamed from: c  reason: collision with root package name */
        public i f10718c;

        public a(i iVar) {
            this.f10717b = iVar;
        }

        public final void b(Object obj, Object obj2) {
            i iVar = (i) obj;
            boolean z10 = true;
            boolean z11 = obj2 == null;
            i iVar2 = this.f10717b;
            i iVar3 = z11 ? iVar2 : this.f10718c;
            if (iVar3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f10714a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, iVar3)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != this) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10 && z11) {
                    i iVar4 = this.f10718c;
                    j.c(iVar4);
                    iVar2.n(iVar4);
                }
            }
        }
    }

    public /* synthetic */ class b extends p {
        public b(Object obj) {
            super(obj);
        }
    }

    static {
        Class<i> cls = i.class;
        Class<Object> cls2 = Object.class;
        f10714a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f10715b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f10716c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    public final boolean l(i iVar, h hVar) {
        boolean z10;
        f10715b.lazySet(iVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10714a;
        atomicReferenceFieldUpdater.lazySet(iVar, hVar);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, hVar, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != hVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        iVar.n(hVar);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r7 = f10714a;
        r4 = ((kotlinx.coroutines.internal.q) r4).f10733a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r7.get(r3) == r1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r5 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.i m() {
        /*
            r9 = this;
        L_0x0000:
            java.lang.Object r0 = r9._prev
            kotlinx.coroutines.internal.i r0 = (kotlinx.coroutines.internal.i) r0
            r1 = r0
        L_0x0005:
            r2 = 0
            r3 = r2
        L_0x0007:
            java.lang.Object r4 = r1._next
            r5 = 0
            r6 = 1
            if (r4 != r9) goto L_0x0024
            if (r0 != r1) goto L_0x0010
            return r1
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f10715b
        L_0x0012:
            boolean r2 = r7.compareAndSet(r9, r0, r1)
            if (r2 == 0) goto L_0x001a
            r5 = r6
            goto L_0x0020
        L_0x001a:
            java.lang.Object r2 = r7.get(r9)
            if (r2 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r1
        L_0x0024:
            boolean r7 = r9.s()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r4 != 0) goto L_0x002e
            return r1
        L_0x002e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.p
            if (r7 == 0) goto L_0x0038
            kotlinx.coroutines.internal.p r4 = (kotlinx.coroutines.internal.p) r4
            r4.a(r1)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.q
            if (r7 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f10714a
            kotlinx.coroutines.internal.q r4 = (kotlinx.coroutines.internal.q) r4
            kotlinx.coroutines.internal.i r4 = r4.f10733a
        L_0x0044:
            boolean r2 = r7.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L_0x004c
            r5 = r6
            goto L_0x0052
        L_0x004c:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r1) goto L_0x0044
        L_0x0052:
            if (r5 != 0) goto L_0x0055
            goto L_0x0000
        L_0x0055:
            r1 = r3
            goto L_0x0005
        L_0x0057:
            java.lang.Object r1 = r1._prev
            kotlinx.coroutines.internal.i r1 = (kotlinx.coroutines.internal.i) r1
            goto L_0x0007
        L_0x005c:
            r3 = r4
            kotlinx.coroutines.internal.i r3 = (kotlinx.coroutines.internal.i) r3
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.i.m():kotlinx.coroutines.internal.i");
    }

    public final void n(i iVar) {
        boolean z10;
        do {
            i iVar2 = (i) iVar._prev;
            if (o() == iVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10715b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
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
            } else {
                return;
            }
        } while (!z10);
        if (s()) {
            iVar.m();
        }
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final i p() {
        i iVar;
        Object o10 = o();
        q qVar = o10 instanceof q ? (q) o10 : null;
        return (qVar == null || (iVar = qVar.f10733a) == null) ? (i) o10 : iVar;
    }

    public final i q() {
        i m = m();
        if (m == null) {
            Object obj = this._prev;
            while (true) {
                m = (i) obj;
                if (!m.s()) {
                    break;
                }
                obj = m._prev;
            }
        }
        return m;
    }

    public final void r() {
        i iVar = this;
        while (true) {
            Object o10 = iVar.o();
            if (o10 instanceof q) {
                iVar = ((q) o10).f10733a;
            } else {
                iVar.m();
                return;
            }
        }
    }

    public boolean s() {
        return o() instanceof q;
    }

    public boolean t() {
        return u() == null;
    }

    public String toString() {
        return new b(this) + '@' + i0.d(this);
    }

    public final i u() {
        i iVar;
        boolean z10;
        do {
            Object o10 = o();
            if (!(o10 instanceof q)) {
                if (o10 != this) {
                    iVar = (i) o10;
                    q qVar = (q) iVar._removedRef;
                    if (qVar == null) {
                        qVar = new q(iVar);
                        f10716c.lazySet(iVar, qVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10714a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, o10, qVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != o10) {
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
                } else {
                    return (i) o10;
                }
            } else {
                return ((q) o10).f10733a;
            }
        } while (!z10);
        iVar.m();
        return null;
    }

    public final int v(i iVar, i iVar2, a aVar) {
        boolean z10;
        f10715b.lazySet(iVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10714a;
        atomicReferenceFieldUpdater.lazySet(iVar, iVar2);
        aVar.f10718c = iVar2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, iVar2, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != iVar2) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }
}
