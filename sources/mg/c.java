package mg;

import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import kg.b;
import mg.d;
import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f11485a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11486b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11487c;

    /* renamed from: d  reason: collision with root package name */
    public a f11488d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f11489e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f11490f;

    public c(d dVar, String str) {
        j.f(dVar, "taskRunner");
        j.f(str, "name");
        this.f11485a = dVar;
        this.f11486b = str;
    }

    public final void a() {
        byte[] bArr = b.f10474a;
        synchronized (this.f11485a) {
            if (b()) {
                this.f11485a.e(this);
            }
            m mVar = m.f8717a;
        }
    }

    public final boolean b() {
        a aVar = this.f11488d;
        if (aVar != null && aVar.f11481b) {
            this.f11490f = true;
        }
        ArrayList arrayList = this.f11489e;
        int size = arrayList.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i8 = size - 1;
                if (((a) arrayList.get(size)).f11481b) {
                    a aVar2 = (a) arrayList.get(size);
                    d.b bVar = d.f11491h;
                    if (d.f11493j.isLoggable(Level.FINE)) {
                        cb.d.k(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z10 = true;
                }
                if (i8 < 0) {
                    break;
                }
                size = i8;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(mg.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            sf.j.f(r3, r0)
            mg.d r0 = r2.f11485a
            monitor-enter(r0)
            boolean r1 = r2.f11487c     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.f11481b     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0026
            mg.d$b r4 = mg.d.f11491h     // Catch:{ all -> 0x0050 }
            r4.getClass()     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = mg.d.f11493j     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            cb.d.k(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0024:
            monitor-exit(r0)
            return
        L_0x0026:
            mg.d$b r4 = mg.d.f11491h     // Catch:{ all -> 0x0050 }
            r4.getClass()     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = mg.d.f11493j     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            cb.d.k(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            mg.d r3 = r2.f11485a     // Catch:{ all -> 0x0050 }
            r3.e(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            ff.m r3 = ff.m.f8717a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c.c(mg.a, long):void");
    }

    public final boolean d(a aVar, long j10, boolean z10) {
        j.f(aVar, "task");
        c cVar = aVar.f11482c;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f11482c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c3 = this.f11485a.f11494a.c();
        long j11 = c3 + j10;
        ArrayList arrayList = this.f11489e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f11483d <= j11) {
                d.b bVar = d.f11491h;
                if (d.f11493j.isLoggable(Level.FINE)) {
                    cb.d.k(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f11483d = j11;
        d.b bVar2 = d.f11491h;
        if (d.f11493j.isLoggable(Level.FINE)) {
            cb.d.k(aVar, this, z10 ? j.k(cb.d.D(j11 - c3), "run again after ") : j.k(cb.d.D(j11 - c3), "scheduled after "));
        }
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            if (((a) it.next()).f11483d - c3 > j10) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            i8 = arrayList.size();
        }
        arrayList.add(i8, aVar);
        return i8 == 0;
    }

    public final void e() {
        byte[] bArr = b.f10474a;
        synchronized (this.f11485a) {
            this.f11487c = true;
            if (b()) {
                this.f11485a.e(this);
            }
            m mVar = m.f8717a;
        }
    }

    public final String toString() {
        return this.f11486b;
    }
}
