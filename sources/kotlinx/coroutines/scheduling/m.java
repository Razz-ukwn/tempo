package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10775b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10776c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10777d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10778e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f10779a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<m> cls = m.class;
        f10775b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f10776c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f10777d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f10778e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final g a(g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f10775b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z10 = true;
        if (gVar.f10764b.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f10778e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i8 = this.producerIndex & 127;
        while (this.f10779a.get(i8) != null) {
            Thread.yield();
        }
        this.f10779a.lazySet(i8, gVar);
        f10776c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i8 = this.consumerIndex;
            if (i8 - this.producerIndex == 0) {
                return null;
            }
            int i10 = i8 & 127;
            if (f10777d.compareAndSet(this, i8, i8 + 1) && (andSet = this.f10779a.getAndSet(i10, (Object) null)) != null) {
                boolean z10 = true;
                if (andSet.f10764b.b() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f10778e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long e(m mVar) {
        int i8 = mVar.consumerIndex;
        int i10 = mVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = mVar.f10779a;
        while (true) {
            boolean z10 = true;
            if (i8 == i10) {
                break;
            }
            int i11 = i8 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i11);
            if (gVar != null) {
                if (gVar.f10764b.b() == 1) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, gVar, (Object) null)) {
                            if (atomicReferenceArray.get(i11) != gVar) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        f10778e.decrementAndGet(mVar);
                        a(gVar, false);
                        return -1;
                    }
                } else {
                    continue;
                }
            }
            i8++;
        }
        return f(mVar, true);
    }

    public final long f(m mVar, boolean z10) {
        g gVar;
        boolean z11;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar != null) {
                z11 = true;
                if (z10) {
                    if (!(gVar.f10764b.b() == 1)) {
                        return -2;
                    }
                }
                k.f10771e.getClass();
                long nanoTime = System.nanoTime() - gVar.f10763a;
                long j10 = k.f10767a;
                if (nanoTime >= j10) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10775b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                                z11 = false;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return j10 - nanoTime;
                }
            } else {
                return -2;
            }
        } while (!z11);
        a(gVar, false);
        return -1;
    }
}
