package f4;

import e9.c;
import f4.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final g f8582a;

    /* renamed from: b  reason: collision with root package name */
    public final h f8583b;

    public d(g gVar, h hVar) {
        this.f8582a = gVar;
        this.f8583b = hVar;
    }

    public final void a(int i8) {
        this.f8582a.a(i8);
        this.f8583b.a(i8);
    }

    public final b.C0153b b(b.a aVar) {
        b.C0153b b10 = this.f8582a.b(aVar);
        return b10 == null ? this.f8583b.b(aVar) : b10;
    }

    public final void c(b.a aVar, b.C0153b bVar) {
        this.f8582a.c(new b.a(aVar.f8576a, c.o(aVar.f8577b)), bVar.f8578a, c.o(bVar.f8579b));
    }
}
