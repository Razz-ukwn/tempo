package kotlinx.coroutines.sync;

import ag.k;
import ag.u0;
import ff.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.v;
import rf.l;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10783a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    public final class a extends b {
        public final k<m> B;

        /* renamed from: kotlinx.coroutines.sync.d$a$a  reason: collision with other inner class name */
        public static final class C0201a extends sf.k implements l<Throwable, m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f10784a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f10785b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0201a(d dVar, a aVar) {
                super(1);
                this.f10784a = dVar;
                this.f10785b = aVar;
            }

            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                this.f10784a.a(this.f10785b.f10787d);
                return m.f8717a;
            }
        }

        public a(ag.l lVar) {
            this.B = lVar;
        }

        public final String toString() {
            return "LockCont[" + this.f10787d + ", " + this.B + "] for " + d.this;
        }

        public final void w() {
            this.B.g();
        }

        public final boolean x() {
            if (!b.f10786e.compareAndSet(this, 0, 1)) {
                return false;
            }
            return this.B.a(m.f8717a, new C0201a(d.this, this)) != null;
        }
    }

    public abstract class b extends i implements u0 {

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f10786e = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* renamed from: d  reason: collision with root package name */
        public final Object f10787d = null;
        private volatile /* synthetic */ int isTaken = 0;

        public final void a() {
            t();
        }

        public abstract void w();

        public abstract boolean x();
    }

    public static final class c extends h {
        public volatile Object owner;

        public c(Object obj) {
            this.owner = obj;
        }

        public final String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.sync.d$d  reason: collision with other inner class name */
    public static final class C0202d extends kotlinx.coroutines.internal.b<d> {

        /* renamed from: b  reason: collision with root package name */
        public final c f10788b;

        public C0202d(c cVar) {
            this.f10788b = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:5:0x000b A[LOOP:0: B:5:0x000b->B:8:0x0016, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                kotlinx.coroutines.sync.d r3 = (kotlinx.coroutines.sync.d) r3
                if (r4 != 0) goto L_0x0007
                kotlinx.coroutines.sync.b r4 = gc.b.H
                goto L_0x0009
            L_0x0007:
                kotlinx.coroutines.sync.d$c r4 = r2.f10788b
            L_0x0009:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.d.f10783a
            L_0x000b:
                boolean r1 = r0.compareAndSet(r3, r2, r4)
                if (r1 == 0) goto L_0x0012
                goto L_0x0018
            L_0x0012:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r2) goto L_0x000b
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.d.C0202d.b(java.lang.Object, java.lang.Object):void");
        }

        public final v c(Object obj) {
            d dVar = (d) obj;
            c cVar = this.f10788b;
            if (cVar.o() == cVar) {
                return null;
            }
            return gc.b.D;
        }
    }

    public d(boolean z10) {
        this._state = z10 ? gc.b.G : gc.b.H;
    }

    public final void a(Object obj) {
        i iVar;
        while (true) {
            Object obj2 = this._state;
            boolean z10 = true;
            if (obj2 instanceof b) {
                if (obj == null) {
                    if (!(((b) obj2).f10782a != gc.b.F)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    b bVar = (b) obj2;
                    if (!(bVar.f10782a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.f10782a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10783a;
                b bVar2 = gc.b.H;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
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
            } else if (obj2 instanceof p) {
                ((p) obj2).a(this);
            } else if (obj2 instanceof c) {
                if (obj != null) {
                    c cVar = (c) obj2;
                    if (!(cVar.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.owner + " but expected " + obj).toString());
                    }
                }
                c cVar2 = (c) obj2;
                while (true) {
                    iVar = (i) cVar2.o();
                    if (iVar == cVar2) {
                        iVar = null;
                        break;
                    } else if (iVar.t()) {
                        break;
                    } else {
                        ((q) iVar.o()).f10733a.r();
                    }
                }
                if (iVar == null) {
                    C0202d dVar = new C0202d(cVar2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10783a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, dVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10 && dVar.a(this) == null) {
                        return;
                    }
                } else {
                    b bVar3 = (b) iVar;
                    if (bVar3.x()) {
                        Object obj3 = bVar3.f10787d;
                        if (obj3 == null) {
                            obj3 = gc.b.E;
                        }
                        cVar2.owner = obj3;
                        bVar3.w();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065 A[LOOP:3: B:30:0x0065->B:33:0x0070, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(jf.d r12) {
        /*
            r11 = this;
        L_0x0000:
            java.lang.Object r0 = r11._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.b
            kotlinx.coroutines.sync.b r2 = gc.b.G
            kotlinx.coroutines.internal.v r3 = gc.b.F
            java.lang.String r4 = "Already locked by null"
            r5 = 1
            r6 = 0
            java.lang.String r7 = "Illegal state "
            if (r1 == 0) goto L_0x002d
            r1 = r0
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
            java.lang.Object r1 = r1.f10782a
            if (r1 == r3) goto L_0x0018
            goto L_0x003c
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f10783a
        L_0x001a:
            boolean r8 = r1.compareAndSet(r11, r0, r2)
            if (r8 == 0) goto L_0x0022
            r0 = r5
            goto L_0x0029
        L_0x0022:
            java.lang.Object r8 = r1.get(r11)
            if (r8 == r0) goto L_0x001a
            r0 = r6
        L_0x0029:
            if (r0 == 0) goto L_0x0000
            r0 = r5
            goto L_0x003d
        L_0x002d:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.d.c
            if (r1 == 0) goto L_0x010e
            kotlinx.coroutines.sync.d$c r0 = (kotlinx.coroutines.sync.d.c) r0
            java.lang.Object r0 = r0.owner
            if (r0 == 0) goto L_0x0039
            r0 = r5
            goto L_0x003a
        L_0x0039:
            r0 = r6
        L_0x003a:
            if (r0 == 0) goto L_0x0104
        L_0x003c:
            r0 = r6
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            ff.m r12 = ff.m.f8717a
            return r12
        L_0x0042:
            jf.d r12 = e9.c.g(r12)
            ag.l r12 = cb.d.J(r12)
            kotlinx.coroutines.sync.d$a r0 = new kotlinx.coroutines.sync.d$a
            r0.<init>(r12)
        L_0x004f:
            java.lang.Object r1 = r11._state
            boolean r8 = r1 instanceof kotlinx.coroutines.sync.b
            if (r8 == 0) goto L_0x0093
            r8 = r1
            kotlinx.coroutines.sync.b r8 = (kotlinx.coroutines.sync.b) r8
            java.lang.Object r9 = r8.f10782a
            if (r9 == r3) goto L_0x0073
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f10783a
            kotlinx.coroutines.sync.d$c r10 = new kotlinx.coroutines.sync.d$c
            java.lang.Object r8 = r8.f10782a
            r10.<init>(r8)
        L_0x0065:
            boolean r8 = r9.compareAndSet(r11, r1, r10)
            if (r8 == 0) goto L_0x006c
            goto L_0x004f
        L_0x006c:
            java.lang.Object r8 = r9.get(r11)
            if (r8 == r1) goto L_0x0065
            goto L_0x004f
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f10783a
        L_0x0075:
            boolean r9 = r8.compareAndSet(r11, r1, r2)
            if (r9 == 0) goto L_0x007d
            r1 = r5
            goto L_0x0084
        L_0x007d:
            java.lang.Object r9 = r8.get(r11)
            if (r9 == r1) goto L_0x0075
            r1 = r6
        L_0x0084:
            if (r1 == 0) goto L_0x004f
            ff.m r0 = ff.m.f8717a
            kotlinx.coroutines.sync.e r1 = new kotlinx.coroutines.sync.e
            r1.<init>(r11)
            int r2 = r12.f474c
            r12.A(r0, r2, r1)
            goto L_0x00c8
        L_0x0093:
            boolean r8 = r1 instanceof kotlinx.coroutines.sync.d.c
            if (r8 == 0) goto L_0x00e3
            r8 = r1
            kotlinx.coroutines.sync.d$c r8 = (kotlinx.coroutines.sync.d.c) r8
            java.lang.Object r9 = r8.owner
            if (r9 == 0) goto L_0x00a0
            r9 = r5
            goto L_0x00a1
        L_0x00a0:
            r9 = r6
        L_0x00a1:
            if (r9 == 0) goto L_0x00d9
        L_0x00a3:
            kotlinx.coroutines.internal.i r9 = r8.q()
            boolean r9 = r9.l(r0, r8)
            if (r9 == 0) goto L_0x00a3
            java.lang.Object r8 = r11._state
            if (r8 == r1) goto L_0x00c0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.sync.d.b.f10786e
            boolean r1 = r1.compareAndSet(r0, r6, r5)
            if (r1 != 0) goto L_0x00ba
            goto L_0x00c0
        L_0x00ba:
            kotlinx.coroutines.sync.d$a r0 = new kotlinx.coroutines.sync.d$a
            r0.<init>(r12)
            goto L_0x004f
        L_0x00c0:
            ag.c2 r1 = new ag.c2
            r1.<init>(r0)
            r12.v(r1)
        L_0x00c8:
            java.lang.Object r12 = r12.s()
            kf.a r0 = kf.a.f10464a
            if (r12 != r0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            ff.m r12 = ff.m.f8717a
        L_0x00d3:
            if (r12 != r0) goto L_0x00d6
            return r12
        L_0x00d6:
            ff.m r12 = ff.m.f8717a
            return r12
        L_0x00d9:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.toString()
            r12.<init>(r0)
            throw r12
        L_0x00e3:
            boolean r8 = r1 instanceof kotlinx.coroutines.internal.p
            if (r8 == 0) goto L_0x00ee
            kotlinx.coroutines.internal.p r1 = (kotlinx.coroutines.internal.p) r1
            r1.a(r11)
            goto L_0x004f
        L_0x00ee:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x0104:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.toString()
            r12.<init>(r0)
            throw r12
        L_0x010e:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.p
            if (r1 == 0) goto L_0x0119
            kotlinx.coroutines.internal.p r0 = (kotlinx.coroutines.internal.p) r0
            r0.a(r11)
            goto L_0x0000
        L_0x0119:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.d.b(jf.d):java.lang.Object");
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                return "Mutex[" + ((b) obj).f10782a + ']';
            } else if (obj instanceof p) {
                ((p) obj).a(this);
            } else if (obj instanceof c) {
                return "Mutex[" + ((c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
