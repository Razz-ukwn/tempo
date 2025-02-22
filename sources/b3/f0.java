package b3;

import sf.j;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3044a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3045b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3046c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3047d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3048e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3049f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3050g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3051h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3052i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3053a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f3054b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f3055c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f3056d = -1;
    }

    public f0(boolean z10, boolean z11, int i8, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this.f3044a = z10;
        this.f3045b = z11;
        this.f3046c = i8;
        this.f3047d = z12;
        this.f3048e = z13;
        this.f3049f = i10;
        this.f3050g = i11;
        this.f3051h = i12;
        this.f3052i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.a(f0.class, obj.getClass())) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f3044a == f0Var.f3044a && this.f3045b == f0Var.f3045b && this.f3046c == f0Var.f3046c) {
            f0Var.getClass();
            if (j.a((Object) null, (Object) null) && this.f3047d == f0Var.f3047d && this.f3048e == f0Var.f3048e && this.f3049f == f0Var.f3049f && this.f3050g == f0Var.f3050g && this.f3051h == f0Var.f3051h && this.f3052i == f0Var.f3052i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f3044a ? 1 : 0) * true) + (this.f3045b ? 1 : 0)) * 31) + this.f3046c) * 31) + 0) * 31) + (this.f3047d ? 1 : 0)) * 31) + (this.f3048e ? 1 : 0)) * 31) + this.f3049f) * 31) + this.f3050g) * 31) + this.f3051h) * 31) + this.f3052i;
    }
}
