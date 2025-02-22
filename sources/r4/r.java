package r4;

import ag.b1;
import p4.f;

public final class r<Z> implements w<Z> {
    public int B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13979a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13980b;

    /* renamed from: c  reason: collision with root package name */
    public final w<Z> f13981c;

    /* renamed from: d  reason: collision with root package name */
    public final a f13982d;

    /* renamed from: e  reason: collision with root package name */
    public final f f13983e;

    public interface a {
        void a(f fVar, r<?> rVar);
    }

    public r(w<Z> wVar, boolean z10, boolean z11, f fVar, a aVar) {
        b1.b(wVar);
        this.f13981c = wVar;
        this.f13979a = z10;
        this.f13980b = z11;
        this.f13983e = fVar;
        b1.b(aVar);
        this.f13982d = aVar;
    }

    public final int a() {
        return this.f13981c.a();
    }

    public final synchronized void b() {
        if (!this.C) {
            this.B++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final synchronized void c() {
        if (this.B > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.C) {
            this.C = true;
            if (this.f13980b) {
                this.f13981c.c();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final Class<Z> d() {
        return this.f13981c.d();
    }

    public final void e() {
        boolean z10;
        synchronized (this) {
            int i8 = this.B;
            if (i8 > 0) {
                z10 = true;
                int i10 = i8 - 1;
                this.B = i10;
                if (i10 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f13982d.a(this.f13983e, this);
        }
    }

    public final Z get() {
        return this.f13981c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f13979a + ", listener=" + this.f13982d + ", key=" + this.f13983e + ", acquired=" + this.B + ", isRecycled=" + this.C + ", resource=" + this.f13981c + '}';
    }
}
