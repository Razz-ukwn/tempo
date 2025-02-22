package l4;

import a4.b;
import android.graphics.drawable.Drawable;
import h4.e;
import h4.i;
import h4.n;
import l4.c;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f10972a;

    /* renamed from: b  reason: collision with root package name */
    public final i f10973b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10974c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10975d;

    /* renamed from: l4.a$a  reason: collision with other inner class name */
    public static final class C0206a implements c.a {

        /* renamed from: b  reason: collision with root package name */
        public final int f10976b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10977c;

        public C0206a() {
            this(0, 3);
        }

        public C0206a(int i8, int i10) {
            boolean z10 = true;
            i8 = (i10 & 1) != 0 ? 100 : i8;
            this.f10976b = i8;
            this.f10977c = false;
            if (!(i8 <= 0 ? false : z10)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public final c a(d dVar, i iVar) {
            return !(iVar instanceof n) ? new b(dVar, iVar) : ((n) iVar).f9214c == 1 ? new b(dVar, iVar) : new a(dVar, iVar, this.f10976b, this.f10977c);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
            r4 = (l4.a.C0206a) r4;
            r1 = r4.f10976b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r4 instanceof l4.a.C0206a
                if (r1 == 0) goto L_0x0017
                l4.a$a r4 = (l4.a.C0206a) r4
                int r1 = r4.f10976b
                int r2 = r3.f10976b
                if (r2 != r1) goto L_0x0017
                boolean r1 = r3.f10977c
                boolean r4 = r4.f10977c
                if (r1 != r4) goto L_0x0017
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l4.a.C0206a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10977c) + (this.f10976b * 31);
        }
    }

    public a(d dVar, i iVar, int i8, boolean z10) {
        this.f10972a = dVar;
        this.f10973b = iVar;
        this.f10974c = i8;
        this.f10975d = z10;
        if (!(i8 > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public final void a() {
        d dVar = this.f10972a;
        Drawable h3 = dVar.h();
        i iVar = this.f10973b;
        boolean z10 = iVar instanceof n;
        b bVar = new b(h3, iVar.a(), iVar.b().C, this.f10974c, !z10 || !((n) iVar).f9218g, this.f10975d);
        if (z10) {
            dVar.e(bVar);
        } else if (iVar instanceof e) {
            dVar.f(bVar);
        }
    }
}
