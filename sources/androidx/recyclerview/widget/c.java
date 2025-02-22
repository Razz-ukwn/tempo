package androidx.recyclerview.widget;

public final class c implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p f2592a;

    /* renamed from: b  reason: collision with root package name */
    public int f2593b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2594c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2595d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f2596e = null;

    public c(p pVar) {
        this.f2592a = pVar;
    }

    public final void a(int i8, int i10) {
        int i11;
        if (this.f2593b == 1 && i8 >= (i11 = this.f2594c)) {
            int i12 = this.f2595d;
            if (i8 <= i11 + i12) {
                this.f2595d = i12 + i10;
                this.f2594c = Math.min(i8, i11);
                return;
            }
        }
        e();
        this.f2594c = i8;
        this.f2595d = i10;
        this.f2593b = 1;
    }

    public final void b(int i8, int i10) {
        int i11;
        if (this.f2593b != 2 || (i11 = this.f2594c) < i8 || i11 > i8 + i10) {
            e();
            this.f2594c = i8;
            this.f2595d = i10;
            this.f2593b = 2;
            return;
        }
        this.f2595d += i10;
        this.f2594c = i8;
    }

    public final void c(Object obj, int i8, int i10) {
        int i11;
        if (this.f2593b == 3) {
            int i12 = this.f2594c;
            int i13 = this.f2595d;
            if (i8 <= i12 + i13 && (i11 = i8 + i10) >= i12 && this.f2596e == obj) {
                this.f2594c = Math.min(i8, i12);
                this.f2595d = Math.max(i13 + i12, i11) - this.f2594c;
                return;
            }
        }
        e();
        this.f2594c = i8;
        this.f2595d = i10;
        this.f2596e = obj;
        this.f2593b = 3;
    }

    public final void d(int i8, int i10) {
        e();
        this.f2592a.d(i8, i10);
    }

    public final void e() {
        int i8 = this.f2593b;
        if (i8 != 0) {
            p pVar = this.f2592a;
            if (i8 == 1) {
                pVar.a(this.f2594c, this.f2595d);
            } else if (i8 == 2) {
                pVar.b(this.f2594c, this.f2595d);
            } else if (i8 == 3) {
                pVar.c(this.f2596e, this.f2594c, this.f2595d);
            }
            this.f2596e = null;
            this.f2593b = 0;
        }
    }
}
