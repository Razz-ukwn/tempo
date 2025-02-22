package j1;

import h0.e;
import j1.b;
import java.util.Arrays;
import java.util.Comparator;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public g[] f9777f = new g[128];

    /* renamed from: g  reason: collision with root package name */
    public g[] f9778g = new g[128];

    /* renamed from: h  reason: collision with root package name */
    public int f9779h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final b f9780i = new b();

    public class a implements Comparator<g> {
        public final int compare(Object obj, Object obj2) {
            return ((g) obj).f9784b - ((g) obj2).f9784b;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public g f9781a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f9781a != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    StringBuilder c3 = e.c(str);
                    c3.append(this.f9781a.D[i8]);
                    c3.append(" ");
                    str = c3.toString();
                }
            }
            StringBuilder b10 = d.a.b(str, "] ");
            b10.append(this.f9781a);
            return b10.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j1.g a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f9779h
            if (r2 >= r4) goto L_0x0057
            j1.g[] r4 = r11.f9777f
            r5 = r4[r2]
            int r6 = r5.f9784b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            j1.f$b r6 = r11.f9780i
            r6.f9781a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r7 < 0) goto L_0x0032
            j1.g r4 = r6.f9781a
            float[] r4 = r4.D
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r7 = r7 + -1
            goto L_0x001c
        L_0x0032:
            r5 = r1
        L_0x0033:
            if (r5 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r7 < 0) goto L_0x0050
            float[] r8 = r4.D
            r8 = r8[r7]
            j1.g r9 = r6.f9781a
            float[] r9 = r9.D
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r7 = r7 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r5 = r1
        L_0x0051:
            if (r5 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            j1.g[] r12 = r11.f9777f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f.a(boolean[]):j1.g");
    }

    public final boolean e() {
        return this.f9779h == 0;
    }

    public final void i(d dVar, b bVar, boolean z10) {
        boolean z11;
        b bVar2 = bVar;
        g gVar = bVar2.f9750a;
        if (gVar != null) {
            b.a aVar = bVar2.f9753d;
            int a10 = aVar.a();
            for (int i8 = 0; i8 < a10; i8++) {
                g c3 = aVar.c(i8);
                float h3 = aVar.h(i8);
                b bVar3 = this.f9780i;
                bVar3.f9781a = c3;
                boolean z12 = c3.f9783a;
                float[] fArr = gVar.D;
                if (z12) {
                    boolean z13 = true;
                    for (int i10 = 0; i10 < 9; i10++) {
                        float[] fArr2 = bVar3.f9781a.D;
                        float f10 = (fArr[i10] * h3) + fArr2[i10];
                        fArr2[i10] = f10;
                        if (Math.abs(f10) < 1.0E-4f) {
                            bVar3.f9781a.D[i10] = 0.0f;
                        } else {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        f.this.k(bVar3.f9781a);
                    }
                    z11 = false;
                } else {
                    for (int i11 = 0; i11 < 9; i11++) {
                        float f11 = fArr[i11];
                        if (f11 != 0.0f) {
                            float f12 = f11 * h3;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f9781a.D[i11] = f12;
                        } else {
                            bVar3.f9781a.D[i11] = 0.0f;
                        }
                    }
                    z11 = true;
                }
                if (z11) {
                    j(c3);
                }
                this.f9751b = (bVar2.f9751b * h3) + this.f9751b;
            }
            k(gVar);
        }
    }

    public final void j(g gVar) {
        int i8;
        int i10 = this.f9779h + 1;
        g[] gVarArr = this.f9777f;
        if (i10 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f9777f = gVarArr2;
            this.f9778g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f9777f;
        int i11 = this.f9779h;
        gVarArr3[i11] = gVar;
        int i12 = i11 + 1;
        this.f9779h = i12;
        if (i12 > 1 && gVarArr3[i12 - 1].f9784b > gVar.f9784b) {
            int i13 = 0;
            while (true) {
                i8 = this.f9779h;
                if (i13 >= i8) {
                    break;
                }
                this.f9778g[i13] = this.f9777f[i13];
                i13++;
            }
            Arrays.sort(this.f9778g, 0, i8, new a());
            for (int i14 = 0; i14 < this.f9779h; i14++) {
                this.f9777f[i14] = this.f9778g[i14];
            }
        }
        gVar.f9783a = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i8 = 0;
        while (i8 < this.f9779h) {
            if (this.f9777f[i8] == gVar) {
                while (true) {
                    int i10 = this.f9779h;
                    if (i8 < i10 - 1) {
                        g[] gVarArr = this.f9777f;
                        int i11 = i8 + 1;
                        gVarArr[i8] = gVarArr[i11];
                        i8 = i11;
                    } else {
                        this.f9779h = i10 - 1;
                        gVar.f9783a = false;
                        return;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f9751b + ") : ";
        for (int i8 = 0; i8 < this.f9779h; i8++) {
            g gVar = this.f9777f[i8];
            b bVar = this.f9780i;
            bVar.f9781a = gVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
