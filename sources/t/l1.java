package t;

import sf.j;

public final class l1<N> implements c<N> {

    /* renamed from: a  reason: collision with root package name */
    public final c<N> f15141a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15142b;

    /* renamed from: c  reason: collision with root package name */
    public int f15143c;

    public l1(c<N> cVar, int i8) {
        j.f(cVar, "applier");
        this.f15141a = cVar;
        this.f15142b = i8;
    }

    public final void a(int i8, N n2) {
        this.f15141a.a(i8 + (this.f15143c == 0 ? this.f15142b : 0), n2);
    }

    public final void b(N n2) {
        this.f15143c++;
        this.f15141a.b(n2);
    }

    public final void c(int i8, int i10, int i11) {
        int i12 = this.f15143c == 0 ? this.f15142b : 0;
        this.f15141a.c(i8 + i12, i10 + i12, i11);
    }

    public final void clear() {
        e0.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    public final void d(int i8, int i10) {
        this.f15141a.d(i8 + (this.f15143c == 0 ? this.f15142b : 0), i10);
    }

    public final void e() {
        int i8 = this.f15143c;
        if (i8 > 0) {
            this.f15143c = i8 - 1;
            this.f15141a.e();
            return;
        }
        e0.c("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }

    public final void f(int i8, N n2) {
        this.f15141a.f(i8 + (this.f15143c == 0 ? this.f15142b : 0), n2);
    }

    public final N h() {
        return this.f15141a.h();
    }
}
