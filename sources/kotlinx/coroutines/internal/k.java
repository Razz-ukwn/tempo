package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10720e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10721f;

    /* renamed from: g  reason: collision with root package name */
    public static final v f10722g = new v("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f10723a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10724b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10725c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f10726d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10727a;

        public a(int i8) {
            this.f10727a = i8;
        }
    }

    static {
        Class<k> cls = k.class;
        f10720e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f10721f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public k(int i8, boolean z10) {
        this.f10723a = i8;
        this.f10724b = z10;
        int i10 = i8 - 1;
        this.f10725c = i10;
        this.f10726d = new AtomicReferenceArray(i8);
        boolean z11 = false;
        if (i10 <= 1073741823) {
            if (!((i8 & i10) == 0 ? true : z11)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i8 = (int) ((1073741823 & j10) >> 0);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f10725c;
            if (((i10 + 2) & i11) == (i8 & i11)) {
                return 1;
            }
            if (this.f10724b || this.f10726d.get(i10 & i11) == null) {
                if (f10721f.compareAndSet(this, j10, (-1152921503533105153L & j10) | (((long) ((i10 + 1) & 1073741823)) << 30))) {
                    this.f10726d.set(i10 & i11, e10);
                    k kVar = this;
                    while ((kVar._state & 1152921504606846976L) != 0) {
                        kVar = kVar.e();
                        AtomicReferenceArray atomicReferenceArray = kVar.f10726d;
                        int i12 = kVar.f10725c & i10;
                        Object obj = atomicReferenceArray.get(i12);
                        if (!(obj instanceof a) || ((a) obj).f10727a != i10) {
                            kVar = null;
                            continue;
                        } else {
                            atomicReferenceArray.set(i12, e10);
                            continue;
                        }
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f10723a;
                if (i13 < 1024 || ((i10 - i8) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f10721f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066 A[LOOP:3: B:16:0x0066->B:19:0x0072, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.k<E> e() {
        /*
            r9 = this;
        L_0x0000:
            long r2 = r9._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f10721f
            r1 = r9
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r9._next
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.k) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f10720e
            kotlinx.coroutines.internal.k r1 = new kotlinx.coroutines.internal.k
            int r4 = r9.f10723a
            int r4 = r4 * 2
            boolean r5 = r9.f10724b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r2
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
        L_0x003f:
            int r6 = r9.f10725c
            r7 = r4 & r6
            r6 = r6 & r5
            if (r7 == r6) goto L_0x005e
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r9.f10726d
            java.lang.Object r6 = r6.get(r7)
            if (r6 != 0) goto L_0x0053
            kotlinx.coroutines.internal.k$a r6 = new kotlinx.coroutines.internal.k$a
            r6.<init>(r4)
        L_0x0053:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.f10726d
            int r8 = r1.f10725c
            r8 = r8 & r4
            r7.set(r8, r6)
            int r4 = r4 + 1
            goto L_0x003f
        L_0x005e:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r1._state = r4
        L_0x0066:
            r4 = 0
            boolean r4 = r0.compareAndSet(r9, r4, r1)
            if (r4 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r4 = r0.get(r9)
            if (r4 == 0) goto L_0x0066
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.k.e():kotlinx.coroutines.internal.k");
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f10722g;
            }
            int i8 = (int) ((j10 & 1073741823) >> 0);
            int i10 = this.f10725c;
            int i11 = ((int) ((1152921503533105152L & j10) >> 30)) & i10;
            int i12 = i10 & i8;
            if (i11 == i12) {
                return null;
            }
            Object obj = this.f10726d.get(i12);
            if (obj == null) {
                if (this.f10724b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((long) ((i8 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f10721f.compareAndSet(this, j10, (j10 & -1073741824) | j11)) {
                    this.f10726d.set(this.f10725c & i8, (Object) null);
                    return obj2;
                } else if (this.f10724b) {
                    k kVar = this;
                    while (true) {
                        long j12 = kVar._state;
                        int i13 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            kVar = kVar.e();
                        } else {
                            if (f10721f.compareAndSet(kVar, j12, (j12 & -1073741824) | j11)) {
                                kVar.f10726d.set(kVar.f10725c & i13, (Object) null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
