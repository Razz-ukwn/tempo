package h5;

import c4.a;

public final class j implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final e f9262a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9263b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f9264c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f9265d;

    /* renamed from: e  reason: collision with root package name */
    public int f9266e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f9267f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9268g;

    public j(Object obj, e eVar) {
        this.f9263b = obj;
        this.f9262a = eVar;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f9263b) {
            if (!this.f9265d.a()) {
                if (!this.f9264c.a()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(h5.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof h5.j
            r1 = 0
            if (r0 == 0) goto L_0x002e
            h5.j r4 = (h5.j) r4
            h5.d r0 = r3.f9264c
            if (r0 != 0) goto L_0x0010
            h5.d r0 = r4.f9264c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            h5.d r0 = r3.f9264c
            h5.d r2 = r4.f9264c
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            h5.d r0 = r3.f9265d
            if (r0 != 0) goto L_0x0023
            h5.d r4 = r4.f9265d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            h5.d r0 = r3.f9265d
            h5.d r4 = r4.f9265d
            boolean r4 = r0.b(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.j.b(h5.d):boolean");
    }

    public final boolean c(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f9263b) {
            e eVar = this.f9262a;
            z10 = false;
            if (eVar != null) {
                if (!eVar.c(this)) {
                    z11 = false;
                    if (z11 && (dVar.equals(this.f9264c) || this.f9266e != 4)) {
                        z10 = true;
                    }
                }
            }
            z11 = true;
            z10 = true;
        }
        return z10;
    }

    public final void clear() {
        synchronized (this.f9263b) {
            this.f9268g = false;
            this.f9266e = 3;
            this.f9267f = 3;
            this.f9265d.clear();
            this.f9264c.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(h5.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9263b
            monitor-enter(r0)
            h5.d r1 = r2.f9265d     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0028 }
            r1 = 4
            if (r3 == 0) goto L_0x0010
            r2.f9267f = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0010:
            r2.f9266e = r1     // Catch:{ all -> 0x0028 }
            h5.e r3 = r2.f9262a     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0019
            r3.d(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            int r3 = r2.f9267f     // Catch:{ all -> 0x0028 }
            boolean r3 = c4.a.a(r3)     // Catch:{ all -> 0x0028 }
            if (r3 != 0) goto L_0x0026
            h5.d r3 = r2.f9265d     // Catch:{ all -> 0x0028 }
            r3.clear()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.j.d(h5.d):void");
    }

    public final boolean e(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f9263b) {
            e eVar = this.f9262a;
            z10 = false;
            if (eVar != null) {
                if (!eVar.e(this)) {
                    z11 = false;
                    if (z11 && dVar.equals(this.f9264c) && this.f9266e != 2) {
                        z10 = true;
                    }
                }
            }
            z11 = true;
            z10 = true;
        }
        return z10;
    }

    public final boolean f(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f9263b) {
            e eVar = this.f9262a;
            z10 = false;
            if (eVar != null) {
                if (!eVar.f(this)) {
                    z11 = false;
                    if (z11 && dVar.equals(this.f9264c) && !a()) {
                        z10 = true;
                    }
                }
            }
            z11 = true;
            z10 = true;
        }
        return z10;
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f9263b) {
            z10 = this.f9266e == 3;
        }
        return z10;
    }

    public final e getRoot() {
        e root;
        synchronized (this.f9263b) {
            e eVar = this.f9262a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    public final void h() {
        synchronized (this.f9263b) {
            this.f9268g = true;
            try {
                if (!(this.f9266e == 4 || this.f9267f == 1)) {
                    this.f9267f = 1;
                    this.f9265d.h();
                }
                if (this.f9268g && this.f9266e != 1) {
                    this.f9266e = 1;
                    this.f9264c.h();
                }
            } finally {
                this.f9268g = false;
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f9263b) {
            z10 = this.f9266e == 4;
        }
        return z10;
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f9263b) {
            z10 = true;
            if (this.f9266e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(h5.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9263b
            monitor-enter(r0)
            h5.d r1 = r2.f9264c     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x0010
            r2.f9267f = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0010:
            r2.f9266e = r1     // Catch:{ all -> 0x001b }
            h5.e r3 = r2.f9262a     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0019
            r3.j(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.j.j(h5.d):void");
    }

    public final void pause() {
        synchronized (this.f9263b) {
            if (!a.a(this.f9267f)) {
                this.f9267f = 2;
                this.f9265d.pause();
            }
            if (!a.a(this.f9266e)) {
                this.f9266e = 2;
                this.f9264c.pause();
            }
        }
    }
}
