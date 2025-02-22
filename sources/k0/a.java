package k0;

import androidx.fragment.app.z;
import androidx.fragment.app.z0;
import f1.d;
import f1.j;
import ff.e;
import h0.g;
import i0.c;
import i0.f;
import i0.i;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final C0186a f10248a = new C0186a();

    /* renamed from: b  reason: collision with root package name */
    public final b f10249b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    public c f10250c;

    /* renamed from: d  reason: collision with root package name */
    public c f10251d;

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    public static final class C0186a {

        /* renamed from: a  reason: collision with root package name */
        public f1.c f10252a;

        /* renamed from: b  reason: collision with root package name */
        public j f10253b;

        /* renamed from: c  reason: collision with root package name */
        public f f10254c;

        /* renamed from: d  reason: collision with root package name */
        public long f10255d;

        public C0186a() {
            d dVar = z0.C;
            j jVar = j.f8039a;
            f fVar = new f();
            long j10 = g.f9086b;
            this.f10252a = dVar;
            this.f10253b = jVar;
            this.f10254c = fVar;
            this.f10255d = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0186a)) {
                return false;
            }
            C0186a aVar = (C0186a) obj;
            if (!sf.j.a(this.f10252a, aVar.f10252a) || this.f10253b != aVar.f10253b || !sf.j.a(this.f10254c, aVar.f10254c)) {
                return false;
            }
            long j10 = this.f10255d;
            long j11 = aVar.f10255d;
            int i8 = g.f9088d;
            return (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1)) == 0;
        }

        public final int hashCode() {
            int hashCode = this.f10253b.hashCode();
            int hashCode2 = this.f10254c.hashCode();
            long j10 = this.f10255d;
            int i8 = g.f9088d;
            return Long.hashCode(j10) + ((hashCode2 + ((hashCode + (this.f10252a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.f10252a + ", layoutDirection=" + this.f10253b + ", canvas=" + this.f10254c + ", size=" + g.c(this.f10255d) + ')';
        }
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final b f10256a = new b(this);

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f10257b;

        public b(a aVar) {
            this.f10257b = aVar;
        }

        public final f a() {
            return this.f10257b.f10248a.f10254c;
        }

        public final long b() {
            return this.f10257b.f10248a.f10255d;
        }

        public final void c(long j10) {
            this.f10257b.f10248a.f10255d = j10;
        }
    }

    public static long b(float f10, long j10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return androidx.databinding.a.e(i.g(j10), i.f(j10), i.d(j10), i.c(j10) * f10, i.e(j10));
    }

    public final void a(long j10, long j11, long j12, float f10, int i8, b1.b bVar, float f11, int i10) {
        float f12 = f10;
        int i11 = i8;
        b1.b bVar2 = bVar;
        int i12 = i10;
        f fVar = this.f10248a.f10254c;
        c cVar = this.f10251d;
        if (cVar == null) {
            cVar = new c();
            cVar.s(1);
            this.f10251d = cVar;
        }
        c cVar2 = cVar;
        long b10 = b(f11, j10);
        if (!i.b(cVar2.b(), b10)) {
            cVar2.j(b10);
        }
        if (cVar2.f9363c != null) {
            cVar2.n();
        }
        if (!sf.j.a((Object) null, (Object) null)) {
            cVar2.k();
        }
        boolean z10 = false;
        if (!(cVar2.f9362b == i12)) {
            cVar2.i(i12);
        }
        if (!(cVar2.g() == f12)) {
            cVar2.r(f12);
        }
        if (!(cVar2.f() == 4.0f)) {
            cVar2.q(4.0f);
        }
        if (!(cVar2.d() == i11)) {
            cVar2.o(i11);
        }
        if (!(cVar2.e() == 0)) {
            cVar2.p(0);
        }
        cVar2.getClass();
        if (!sf.j.a((Object) null, bVar2)) {
            cVar2.m(bVar2);
        }
        if (cVar2.c() == 1) {
            z10 = true;
        }
        if (!z10) {
            cVar2.l(1);
        }
        fVar.f(j11, j12, cVar2);
    }

    public final float getDensity() {
        return this.f10248a.f10252a.getDensity();
    }

    public final float m() {
        return this.f10248a.f10252a.m();
    }

    public final b p() {
        return this.f10249b;
    }

    public final void v(long j10, float f10, float f11, long j11, long j12, float f12, z zVar, int i8) {
        long j13;
        c cVar;
        float f13;
        z zVar2 = zVar;
        int i10 = i8;
        sf.j.f(zVar2, "style");
        f fVar = this.f10248a.f10254c;
        float b10 = h0.c.b(j11);
        float c3 = h0.c.c(j11);
        float b11 = g.b(j12) + h0.c.b(j11);
        float a10 = g.a(j12) + h0.c.c(j11);
        boolean z10 = false;
        if (sf.j.a(zVar2, g.f10259b)) {
            c cVar2 = this.f10250c;
            if (cVar2 == null) {
                cVar2 = new c();
                cVar2.s(0);
                this.f10250c = cVar2;
            }
            j13 = j10;
            cVar = cVar2;
            f13 = f12;
        } else if (zVar2 instanceof h) {
            c cVar3 = this.f10251d;
            if (cVar3 == null) {
                cVar3 = new c();
                cVar3.s(1);
                this.f10251d = cVar3;
            }
            float g10 = cVar3.g();
            h hVar = (h) zVar2;
            float f14 = hVar.f10260b;
            if (!(g10 == f14)) {
                cVar3.r(f14);
            }
            int d10 = cVar3.d();
            int i11 = hVar.f10262d;
            if (!(d10 == i11)) {
                cVar3.o(i11);
            }
            float f15 = cVar3.f();
            float f16 = hVar.f10261c;
            if (!(f15 == f16)) {
                cVar3.q(f16);
            }
            int e10 = cVar3.e();
            int i12 = hVar.f10263e;
            if (!(e10 == i12)) {
                cVar3.p(i12);
            }
            cVar3.getClass();
            hVar.getClass();
            if (!sf.j.a((Object) null, (Object) null)) {
                cVar3.m((b1.b) null);
            }
            j13 = j10;
            f13 = f12;
            cVar = cVar3;
        } else {
            throw new e();
        }
        long b12 = b(f13, j13);
        if (!i.b(cVar.b(), b12)) {
            cVar.j(b12);
        }
        if (cVar.f9363c != null) {
            cVar.n();
        }
        if (!sf.j.a((Object) null, (Object) null)) {
            cVar.k();
        }
        if (!(cVar.f9362b == i10)) {
            cVar.i(i10);
        }
        if (cVar.c() == 1) {
            z10 = true;
        }
        if (!z10) {
            cVar.l(1);
        }
        fVar.a(b10, c3, b11, a10, f10, f11, cVar);
    }
}
