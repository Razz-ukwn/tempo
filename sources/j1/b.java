package j1;

import j1.d;
import java.util.ArrayList;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public g f9750a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f9751b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<g> f9752c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f9753d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9754e = false;

    public interface a {
        int a();

        float b(g gVar, boolean z10);

        g c(int i8);

        void clear();

        float d(g gVar);

        void e(g gVar, float f10);

        float f(b bVar, boolean z10);

        void g();

        float h(int i8);

        void i(g gVar, float f10, boolean z10);

        boolean j(g gVar);

        void k(float f10);
    }

    public b() {
    }

    public g a(boolean[] zArr) {
        return f(zArr, (g) null);
    }

    public final void b(d dVar, int i8) {
        this.f9753d.e(dVar.j(i8), 1.0f);
        this.f9753d.e(dVar.j(i8), -1.0f);
    }

    public final void c(g gVar, g gVar2, g gVar3, int i8) {
        boolean z10 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z10 = true;
            }
            this.f9751b = (float) i8;
        }
        if (!z10) {
            this.f9753d.e(gVar, -1.0f);
            this.f9753d.e(gVar2, 1.0f);
            this.f9753d.e(gVar3, 1.0f);
            return;
        }
        this.f9753d.e(gVar, 1.0f);
        this.f9753d.e(gVar2, -1.0f);
        this.f9753d.e(gVar3, -1.0f);
    }

    public final void d(g gVar, g gVar2, g gVar3, int i8) {
        boolean z10 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z10 = true;
            }
            this.f9751b = (float) i8;
        }
        if (!z10) {
            this.f9753d.e(gVar, -1.0f);
            this.f9753d.e(gVar2, 1.0f);
            this.f9753d.e(gVar3, -1.0f);
            return;
        }
        this.f9753d.e(gVar, 1.0f);
        this.f9753d.e(gVar2, -1.0f);
        this.f9753d.e(gVar3, 1.0f);
    }

    public boolean e() {
        return this.f9750a == null && this.f9751b == 0.0f && this.f9753d.a() == 0;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i8;
        int a10 = this.f9753d.a();
        g gVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < a10; i10++) {
            float h3 = this.f9753d.h(i10);
            if (h3 < 0.0f) {
                g c3 = this.f9753d.c(i10);
                if ((zArr == null || !zArr[c3.f9784b]) && c3 != gVar && (((i8 = c3.E) == 3 || i8 == 4) && h3 < f10)) {
                    f10 = h3;
                    gVar2 = c3;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f9750a;
        if (gVar2 != null) {
            this.f9753d.e(gVar2, -1.0f);
            this.f9750a.f9785c = -1;
            this.f9750a = null;
        }
        float b10 = this.f9753d.b(gVar, true) * -1.0f;
        this.f9750a = gVar;
        if (b10 != 1.0f) {
            this.f9751b /= b10;
            this.f9753d.k(b10);
        }
    }

    public final void h(d dVar, g gVar, boolean z10) {
        if (gVar != null && gVar.B) {
            float d10 = this.f9753d.d(gVar);
            this.f9751b = (gVar.f9787e * d10) + this.f9751b;
            this.f9753d.b(gVar, z10);
            if (z10) {
                gVar.b(this);
            }
            if (this.f9753d.a() == 0) {
                this.f9754e = true;
                dVar.f9761a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z10) {
        float f10 = this.f9753d.f(bVar, z10);
        this.f9751b = (bVar.f9751b * f10) + this.f9751b;
        if (z10) {
            bVar.f9750a.b(this);
        }
        if (this.f9750a != null && this.f9753d.a() == 0) {
            this.f9754e = true;
            dVar.f9761a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            j1.g r0 = r9.f9750a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            j1.g r1 = r9.f9750a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = h4.a.c(r0, r1)
            float r1 = r9.f9751b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            java.lang.StringBuilder r0 = h0.e.c(r0)
            float r1 = r9.f9751b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L_0x0036
        L_0x0035:
            r1 = r4
        L_0x0036:
            j1.b$a r5 = r9.f9753d
            int r5 = r5.a()
        L_0x003c:
            if (r4 >= r5) goto L_0x009b
            j1.b$a r6 = r9.f9753d
            j1.g r6 = r6.c(r4)
            if (r6 != 0) goto L_0x0047
            goto L_0x0098
        L_0x0047:
            j1.b$a r7 = r9.f9753d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x0098
        L_0x0052:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x0063
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0075
            java.lang.String r1 = "- "
            java.lang.String r0 = h4.a.c(r0, r1)
            goto L_0x0072
        L_0x0063:
            if (r8 <= 0) goto L_0x006c
            java.lang.String r1 = " + "
            java.lang.String r0 = h4.a.c(r0, r1)
            goto L_0x0075
        L_0x006c:
            java.lang.String r1 = " - "
            java.lang.String r0 = h4.a.c(r0, r1)
        L_0x0072:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L_0x0075:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0080
            java.lang.String r0 = h4.a.c(r0, r6)
            goto L_0x0097
        L_0x0080:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r4 = r4 + 1
            goto L_0x003c
        L_0x009b:
            if (r1 != 0) goto L_0x00a3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = h4.a.c(r0, r1)
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.b.toString():java.lang.String");
    }

    public b(c cVar) {
        this.f9753d = new a(this, cVar);
    }
}
