package r4;

import m5.a;
import m5.d;

public final class v<Z> implements w<Z>, a.d {

    /* renamed from: e  reason: collision with root package name */
    public static final a.c f13994e = m5.a.a(20, new a());

    /* renamed from: a  reason: collision with root package name */
    public final d.a f13995a = new d.a();

    /* renamed from: b  reason: collision with root package name */
    public w<Z> f13996b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13997c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13998d;

    public class a implements a.b<v<?>> {
        public final Object a() {
            return new v();
        }
    }

    public final int a() {
        return this.f13996b.a();
    }

    public final d.a b() {
        return this.f13995a;
    }

    public final synchronized void c() {
        this.f13995a.a();
        this.f13998d = true;
        if (!this.f13997c) {
            this.f13996b.c();
            this.f13996b = null;
            f13994e.a(this);
        }
    }

    public final Class<Z> d() {
        return this.f13996b.d();
    }

    public final synchronized void e() {
        this.f13995a.a();
        if (this.f13997c) {
            this.f13997c = false;
            if (this.f13998d) {
                c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final Z get() {
        return this.f13996b.get();
    }
}
