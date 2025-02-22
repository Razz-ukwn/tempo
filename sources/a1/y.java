package a1;

import a0.f;
import cb.d;
import java.util.List;
import rf.l;
import rf.p;
import sf.j;
import sf.k;
import x0.e;
import x0.h;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final x0.a f67a;

    /* renamed from: b  reason: collision with root package name */
    public final long f68b;

    /* renamed from: c  reason: collision with root package name */
    public final h f69c;

    public static final class a extends k implements p<f, y, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f fVar = (f) obj;
            y yVar = (y) obj2;
            j.f(fVar, "$this$Saver");
            j.f(yVar, "it");
            return d.m(e.a(yVar.f67a, e.f16836a, fVar), e.a(new h(yVar.f68b), e.m, fVar));
        }
    }

    public static final class b extends k implements l<Object, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f71a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            a0.e eVar = e.f16836a;
            Boolean bool = Boolean.FALSE;
            x0.a aVar = (!j.a(obj2, bool) && obj2 != null) ? (x0.a) eVar.f14b.invoke(obj2) : null;
            j.c(aVar);
            Object obj3 = list.get(1);
            int i8 = h.f16907c;
            h hVar = (!j.a(obj3, bool) && obj3 != null) ? (h) e.m.f14b.invoke(obj3) : null;
            j.c(hVar);
            return new y(aVar, hVar.f16908a, (h) null);
        }
    }

    static {
        a0.d.a(a.f70a, b.f71a);
    }

    public y(x0.a aVar, long j10, h hVar) {
        h hVar2;
        this.f67a = aVar;
        String str = aVar.f16819a;
        this.f68b = gc.b.h(j10, str.length());
        if (hVar != null) {
            hVar2 = new h(gc.b.h(hVar.f16908a, str.length()));
        } else {
            hVar2 = null;
        }
        this.f69c = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        long j10 = yVar.f68b;
        int i8 = h.f16907c;
        return ((this.f68b > j10 ? 1 : (this.f68b == j10 ? 0 : -1)) == 0) && j.a(this.f69c, yVar.f69c) && j.a(this.f67a, yVar.f67a);
    }

    public final int hashCode() {
        int i8 = h.f16907c;
        int a10 = h0.e.a(this.f68b, this.f67a.hashCode() * 31, 31);
        h hVar = this.f69c;
        return a10 + (hVar != null ? Long.hashCode(hVar.f16908a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + this.f67a + "', selection=" + h.d(this.f68b) + ", composition=" + this.f69c + ')';
    }
}
