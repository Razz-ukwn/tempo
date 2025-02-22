package r4;

import ag.b1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p4.f;
import r4.r;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13876a = false;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13877b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<r<?>> f13878c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public r.a f13879d;

    public static final class a extends WeakReference<r<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final f f13880a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13881b;

        /* renamed from: c  reason: collision with root package name */
        public w<?> f13882c;

        public a(f fVar, r<?> rVar, ReferenceQueue<? super r<?>> referenceQueue, boolean z10) {
            super(rVar, referenceQueue);
            w<Z> wVar;
            b1.b(fVar);
            this.f13880a = fVar;
            if (!rVar.f13979a || !z10) {
                wVar = null;
            } else {
                wVar = rVar.f13981c;
                b1.b(wVar);
            }
            this.f13882c = wVar;
            this.f13881b = rVar.f13979a;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(f fVar, r<?> rVar) {
        a aVar = (a) this.f13877b.put(fVar, new a(fVar, rVar, this.f13878c, this.f13876a));
        if (aVar != null) {
            aVar.f13882c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            this.f13877b.remove(aVar.f13880a);
            if (aVar.f13881b) {
                w<?> wVar = aVar.f13882c;
                if (wVar != null) {
                    this.f13879d.a(aVar.f13880a, new r(wVar, true, false, aVar.f13880a, this.f13879d));
                }
            }
        }
    }
}
