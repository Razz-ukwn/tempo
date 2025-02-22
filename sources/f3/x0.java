package f3;

import androidx.recyclerview.widget.p;

public final class x0<T> implements p {

    /* renamed from: a  reason: collision with root package name */
    public final v0<T> f8536a;

    /* renamed from: b  reason: collision with root package name */
    public final p f8537b;

    /* renamed from: c  reason: collision with root package name */
    public int f8538c;

    /* renamed from: d  reason: collision with root package name */
    public int f8539d;

    /* renamed from: e  reason: collision with root package name */
    public int f8540e;

    /* renamed from: f  reason: collision with root package name */
    public int f8541f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f8542g = 1;

    public x0(v0<T> v0Var, v0<T> v0Var2, p pVar) {
        this.f8536a = v0Var2;
        this.f8537b = pVar;
        this.f8538c = v0Var.c();
        this.f8539d = v0Var.d();
        this.f8540e = v0Var.b();
    }

    public final void a(int i8, int i10) {
        boolean z10;
        int i11 = this.f8540e;
        boolean z11 = true;
        z zVar = z.f8560b;
        p pVar = this.f8537b;
        if (i8 >= i11 && this.f8542g != 2) {
            int min = Math.min(i10, this.f8539d);
            if (min > 0) {
                this.f8542g = 3;
                pVar.c(zVar, this.f8538c + i8, min);
                this.f8539d -= min;
            }
            int i12 = i10 - min;
            if (i12 > 0) {
                pVar.a(min + i8 + this.f8538c, i12);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i8 <= 0 && this.f8541f != 2) {
                int min2 = Math.min(i10, this.f8538c);
                if (min2 > 0) {
                    this.f8541f = 3;
                    pVar.c(zVar, (0 - min2) + this.f8538c, min2);
                    this.f8538c -= min2;
                }
                int i13 = i10 - min2;
                if (i13 > 0) {
                    pVar.a(this.f8538c + 0, i13);
                }
            } else {
                z11 = false;
            }
            if (!z11) {
                pVar.a(i8 + this.f8538c, i10);
            }
        }
        this.f8540e += i10;
    }

    public final void b(int i8, int i10) {
        boolean z10;
        int i11 = i8 + i10;
        int i12 = this.f8540e;
        boolean z11 = true;
        z zVar = z.f8559a;
        v0<T> v0Var = this.f8536a;
        p pVar = this.f8537b;
        if (i11 >= i12 && this.f8542g != 3) {
            int min = Math.min(v0Var.d() - this.f8539d, i10);
            if (min < 0) {
                min = 0;
            }
            int i13 = i10 - min;
            if (min > 0) {
                this.f8542g = 2;
                pVar.c(zVar, this.f8538c + i8, min);
                this.f8539d += min;
            }
            if (i13 > 0) {
                pVar.b(min + i8 + this.f8538c, i13);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i8 <= 0 && this.f8541f != 3) {
                int min2 = Math.min(v0Var.c() - this.f8538c, i10);
                if (min2 < 0) {
                    min2 = 0;
                }
                int i14 = i10 - min2;
                if (i14 > 0) {
                    pVar.b(this.f8538c + 0, i14);
                }
                if (min2 > 0) {
                    this.f8541f = 2;
                    pVar.c(zVar, this.f8538c + 0, min2);
                    this.f8538c += min2;
                }
            } else {
                z11 = false;
            }
            if (!z11) {
                pVar.b(i8 + this.f8538c, i10);
            }
        }
        this.f8540e -= i10;
    }

    public final void c(Object obj, int i8, int i10) {
        this.f8537b.c(obj, i8 + this.f8538c, i10);
    }

    public final void d(int i8, int i10) {
        int i11 = this.f8538c;
        this.f8537b.d(i8 + i11, i10 + i11);
    }
}
