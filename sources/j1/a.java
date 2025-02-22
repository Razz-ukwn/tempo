package j1;

import h0.e;
import j1.b;
import java.util.Arrays;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f9740a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f9741b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9742c;

    /* renamed from: d  reason: collision with root package name */
    public int f9743d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f9744e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f9745f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f9746g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f9747h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f9748i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9749j = false;

    public a(b bVar, c cVar) {
        this.f9741b = bVar;
        this.f9742c = cVar;
    }

    public final int a() {
        return this.f9740a;
    }

    public final float b(g gVar, boolean z10) {
        int i8 = this.f9747h;
        if (i8 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i8 != -1 && i10 < this.f9740a) {
            if (this.f9744e[i8] == gVar.f9784b) {
                if (i8 == this.f9747h) {
                    this.f9747h = this.f9745f[i8];
                } else {
                    int[] iArr = this.f9745f;
                    iArr[i11] = iArr[i8];
                }
                if (z10) {
                    gVar.b(this.f9741b);
                }
                gVar.H--;
                this.f9740a--;
                this.f9744e[i8] = -1;
                if (this.f9749j) {
                    this.f9748i = i8;
                }
                return this.f9746g[i8];
            }
            i10++;
            i11 = i8;
            i8 = this.f9745f[i8];
        }
        return 0.0f;
    }

    public final g c(int i8) {
        int i10 = this.f9747h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9740a) {
            if (i11 == i8) {
                return ((g[]) this.f9742c.f9758d)[this.f9744e[i10]];
            }
            i10 = this.f9745f[i10];
            i11++;
        }
        return null;
    }

    public final void clear() {
        int i8 = this.f9747h;
        int i10 = 0;
        while (i8 != -1 && i10 < this.f9740a) {
            g gVar = ((g[]) this.f9742c.f9758d)[this.f9744e[i8]];
            if (gVar != null) {
                gVar.b(this.f9741b);
            }
            i8 = this.f9745f[i8];
            i10++;
        }
        this.f9747h = -1;
        this.f9748i = -1;
        this.f9749j = false;
        this.f9740a = 0;
    }

    public final float d(g gVar) {
        int i8 = this.f9747h;
        int i10 = 0;
        while (i8 != -1 && i10 < this.f9740a) {
            if (this.f9744e[i8] == gVar.f9784b) {
                return this.f9746g[i8];
            }
            i8 = this.f9745f[i8];
            i10++;
        }
        return 0.0f;
    }

    public final void e(g gVar, float f10) {
        if (f10 == 0.0f) {
            b(gVar, true);
            return;
        }
        int i8 = this.f9747h;
        b bVar = this.f9741b;
        if (i8 == -1) {
            this.f9747h = 0;
            this.f9746g[0] = f10;
            this.f9744e[0] = gVar.f9784b;
            this.f9745f[0] = -1;
            gVar.H++;
            gVar.a(bVar);
            this.f9740a++;
            if (!this.f9749j) {
                int i10 = this.f9748i + 1;
                this.f9748i = i10;
                int[] iArr = this.f9744e;
                if (i10 >= iArr.length) {
                    this.f9749j = true;
                    this.f9748i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = -1;
        int i12 = 0;
        while (i8 != -1 && i12 < this.f9740a) {
            int i13 = this.f9744e[i8];
            int i14 = gVar.f9784b;
            if (i13 == i14) {
                this.f9746g[i8] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i8;
            }
            i8 = this.f9745f[i8];
            i12++;
        }
        int i15 = this.f9748i;
        int i16 = i15 + 1;
        if (this.f9749j) {
            int[] iArr2 = this.f9744e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f9744e;
        if (i15 >= iArr3.length && this.f9740a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f9744e;
                if (i17 >= iArr4.length) {
                    break;
                } else if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                } else {
                    i17++;
                }
            }
        }
        int[] iArr5 = this.f9744e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f9743d * 2;
            this.f9743d = i18;
            this.f9749j = false;
            this.f9748i = i15 - 1;
            this.f9746g = Arrays.copyOf(this.f9746g, i18);
            this.f9744e = Arrays.copyOf(this.f9744e, this.f9743d);
            this.f9745f = Arrays.copyOf(this.f9745f, this.f9743d);
        }
        this.f9744e[i15] = gVar.f9784b;
        this.f9746g[i15] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f9745f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f9745f[i15] = this.f9747h;
            this.f9747h = i15;
        }
        gVar.H++;
        gVar.a(bVar);
        int i19 = this.f9740a + 1;
        this.f9740a = i19;
        if (!this.f9749j) {
            this.f9748i++;
        }
        int[] iArr7 = this.f9744e;
        if (i19 >= iArr7.length) {
            this.f9749j = true;
        }
        if (this.f9748i >= iArr7.length) {
            this.f9749j = true;
            this.f9748i = iArr7.length - 1;
        }
    }

    public final float f(b bVar, boolean z10) {
        float d10 = d(bVar.f9750a);
        b(bVar.f9750a, z10);
        b.a aVar = bVar.f9753d;
        int a10 = aVar.a();
        for (int i8 = 0; i8 < a10; i8++) {
            g c3 = aVar.c(i8);
            i(c3, aVar.d(c3) * d10, z10);
        }
        return d10;
    }

    public final void g() {
        int i8 = this.f9747h;
        int i10 = 0;
        while (i8 != -1 && i10 < this.f9740a) {
            float[] fArr = this.f9746g;
            fArr[i8] = fArr[i8] * -1.0f;
            i8 = this.f9745f[i8];
            i10++;
        }
    }

    public final float h(int i8) {
        int i10 = this.f9747h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f9740a) {
            if (i11 == i8) {
                return this.f9746g[i10];
            }
            i10 = this.f9745f[i10];
            i11++;
        }
        return 0.0f;
    }

    public final void i(g gVar, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i8 = this.f9747h;
            b bVar = this.f9741b;
            if (i8 == -1) {
                this.f9747h = 0;
                this.f9746g[0] = f10;
                this.f9744e[0] = gVar.f9784b;
                this.f9745f[0] = -1;
                gVar.H++;
                gVar.a(bVar);
                this.f9740a++;
                if (!this.f9749j) {
                    int i10 = this.f9748i + 1;
                    this.f9748i = i10;
                    int[] iArr = this.f9744e;
                    if (i10 >= iArr.length) {
                        this.f9749j = true;
                        this.f9748i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i11 = 0;
            int i12 = -1;
            while (i8 != -1 && i11 < this.f9740a) {
                int i13 = this.f9744e[i8];
                int i14 = gVar.f9784b;
                if (i13 == i14) {
                    float[] fArr = this.f9746g;
                    float f11 = fArr[i8] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i8] = f11;
                    if (f11 == 0.0f) {
                        if (i8 == this.f9747h) {
                            this.f9747h = this.f9745f[i8];
                        } else {
                            int[] iArr2 = this.f9745f;
                            iArr2[i12] = iArr2[i8];
                        }
                        if (z10) {
                            gVar.b(bVar);
                        }
                        if (this.f9749j) {
                            this.f9748i = i8;
                        }
                        gVar.H--;
                        this.f9740a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i12 = i8;
                }
                i8 = this.f9745f[i8];
                i11++;
            }
            int i15 = this.f9748i;
            int i16 = i15 + 1;
            if (this.f9749j) {
                int[] iArr3 = this.f9744e;
                if (iArr3[i15] != -1) {
                    i15 = iArr3.length;
                }
            } else {
                i15 = i16;
            }
            int[] iArr4 = this.f9744e;
            if (i15 >= iArr4.length && this.f9740a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f9744e;
                    if (i17 >= iArr5.length) {
                        break;
                    } else if (iArr5[i17] == -1) {
                        i15 = i17;
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            int[] iArr6 = this.f9744e;
            if (i15 >= iArr6.length) {
                i15 = iArr6.length;
                int i18 = this.f9743d * 2;
                this.f9743d = i18;
                this.f9749j = false;
                this.f9748i = i15 - 1;
                this.f9746g = Arrays.copyOf(this.f9746g, i18);
                this.f9744e = Arrays.copyOf(this.f9744e, this.f9743d);
                this.f9745f = Arrays.copyOf(this.f9745f, this.f9743d);
            }
            this.f9744e[i15] = gVar.f9784b;
            this.f9746g[i15] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f9745f;
                iArr7[i15] = iArr7[i12];
                iArr7[i12] = i15;
            } else {
                this.f9745f[i15] = this.f9747h;
                this.f9747h = i15;
            }
            gVar.H++;
            gVar.a(bVar);
            this.f9740a++;
            if (!this.f9749j) {
                this.f9748i++;
            }
            int i19 = this.f9748i;
            int[] iArr8 = this.f9744e;
            if (i19 >= iArr8.length) {
                this.f9749j = true;
                this.f9748i = iArr8.length - 1;
            }
        }
    }

    public final boolean j(g gVar) {
        int i8 = this.f9747h;
        if (i8 == -1) {
            return false;
        }
        int i10 = 0;
        while (i8 != -1 && i10 < this.f9740a) {
            if (this.f9744e[i8] == gVar.f9784b) {
                return true;
            }
            i8 = this.f9745f[i8];
            i10++;
        }
        return false;
    }

    public final void k(float f10) {
        int i8 = this.f9747h;
        int i10 = 0;
        while (i8 != -1 && i10 < this.f9740a) {
            float[] fArr = this.f9746g;
            fArr[i8] = fArr[i8] / f10;
            i8 = this.f9745f[i8];
            i10++;
        }
    }

    public final String toString() {
        int i8 = this.f9747h;
        String str = "";
        int i10 = 0;
        while (i8 != -1 && i10 < this.f9740a) {
            StringBuilder c3 = e.c(h4.a.c(str, " -> "));
            c3.append(this.f9746g[i8]);
            c3.append(" : ");
            StringBuilder c10 = e.c(c3.toString());
            c10.append(((g[]) this.f9742c.f9758d)[this.f9744e[i8]]);
            str = c10.toString();
            i8 = this.f9745f[i8];
            i10++;
        }
        return str;
    }
}
