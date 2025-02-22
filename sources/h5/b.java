package h5;

public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9231a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9232b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f9233c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f9234d;

    /* renamed from: e  reason: collision with root package name */
    public int f9235e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f9236f = 3;

    public b(Object obj, e eVar) {
        this.f9231a = obj;
        this.f9232b = eVar;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f9231a) {
            if (!this.f9233c.a()) {
                if (!this.f9234d.a()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean b(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f9233c.b(bVar.f9233c) && this.f9234d.b(bVar.f9234d);
    }

    public final boolean c(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f9231a) {
            e eVar = this.f9232b;
            z10 = false;
            if (eVar != null) {
                if (!eVar.c(this)) {
                    z11 = false;
                    if (z11 && k(dVar)) {
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
        synchronized (this.f9231a) {
            this.f9235e = 3;
            this.f9233c.clear();
            if (this.f9236f != 3) {
                this.f9236f = 3;
                this.f9234d.clear();
            }
        }
    }

    public final void d(d dVar) {
        synchronized (this.f9231a) {
            if (dVar.equals(this.f9233c)) {
                this.f9235e = 4;
            } else if (dVar.equals(this.f9234d)) {
                this.f9236f = 4;
            }
            e eVar = this.f9232b;
            if (eVar != null) {
                eVar.d(this);
            }
        }
    }

    public final boolean e(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f9231a) {
            e eVar = this.f9232b;
            z10 = false;
            if (eVar != null) {
                if (!eVar.e(this)) {
                    z11 = false;
                    if (z11 && k(dVar)) {
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
        synchronized (this.f9231a) {
            e eVar = this.f9232b;
            z10 = false;
            if (eVar != null) {
                if (!eVar.f(this)) {
                    z11 = false;
                    if (z11 && k(dVar)) {
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
        synchronized (this.f9231a) {
            z10 = this.f9235e == 3 && this.f9236f == 3;
        }
        return z10;
    }

    public final e getRoot() {
        e root;
        synchronized (this.f9231a) {
            e eVar = this.f9232b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    public final void h() {
        synchronized (this.f9231a) {
            if (this.f9235e != 1) {
                this.f9235e = 1;
                this.f9233c.h();
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f9231a) {
            if (this.f9235e != 4) {
                if (this.f9236f != 4) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f9231a) {
            z10 = true;
            if (this.f9235e != 1) {
                if (this.f9236f != 1) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(h5.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9231a
            monitor-enter(r0)
            h5.d r1 = r2.f9234d     // Catch:{ all -> 0x0027 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0027 }
            r1 = 5
            if (r3 != 0) goto L_0x001c
            r2.f9235e = r1     // Catch:{ all -> 0x0027 }
            int r3 = r2.f9236f     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r3 == r1) goto L_0x001a
            r2.f9236f = r1     // Catch:{ all -> 0x0027 }
            h5.d r3 = r2.f9234d     // Catch:{ all -> 0x0027 }
            r3.h()     // Catch:{ all -> 0x0027 }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x001c:
            r2.f9236f = r1     // Catch:{ all -> 0x0027 }
            h5.e r3 = r2.f9232b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0025
            r3.j(r2)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.b.j(h5.d):void");
    }

    public final boolean k(d dVar) {
        return dVar.equals(this.f9233c) || (this.f9235e == 5 && dVar.equals(this.f9234d));
    }

    public final void pause() {
        synchronized (this.f9231a) {
            if (this.f9235e == 1) {
                this.f9235e = 2;
                this.f9233c.pause();
            }
            if (this.f9236f == 1) {
                this.f9236f = 2;
                this.f9234d.pause();
            }
        }
    }
}
