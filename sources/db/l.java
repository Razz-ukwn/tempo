package db;

import ab.a0;
import ab.i;
import ab.x;
import ab.y;
import cb.r;
import h0.e;
import hb.a;
import hb.b;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class l extends a0<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final k f7431c = new k(x.f279a);

    /* renamed from: a  reason: collision with root package name */
    public final i f7432a;

    /* renamed from: b  reason: collision with root package name */
    public final y f7433b;

    public l(i iVar, y yVar) {
        this.f7432a = iVar;
        this.f7433b = yVar;
    }

    public static Serializable d(a aVar, int i8) {
        if (i8 != 0) {
            int i10 = i8 - 1;
            if (i10 == 0) {
                aVar.c();
                return new ArrayList();
            } else if (i10 != 2) {
                return null;
            } else {
                aVar.d();
                return new r();
            }
        } else {
            throw null;
        }
    }

    public final Object a(a aVar) {
        int k02 = aVar.k0();
        Object d10 = d(aVar, k02);
        if (d10 == null) {
            return c(aVar, k02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.F()) {
                String Y = d10 instanceof Map ? aVar.Y() : null;
                int k03 = aVar.k0();
                Serializable d11 = d(aVar, k03);
                boolean z10 = d11 != null;
                Serializable c3 = d11 == null ? c(aVar, k03) : d11;
                if (d10 instanceof List) {
                    ((List) d10).add(c3);
                } else {
                    ((Map) d10).put(Y, c3);
                }
                if (z10) {
                    arrayDeque.addLast(d10);
                    d10 = c3;
                }
            } else {
                if (d10 instanceof List) {
                    aVar.p();
                } else {
                    aVar.q();
                }
                if (arrayDeque.isEmpty()) {
                    return d10;
                }
                d10 = arrayDeque.removeLast();
            }
        }
    }

    public final void b(b bVar, Object obj) {
        if (obj == null) {
            bVar.z();
            return;
        }
        Class<?> cls = obj.getClass();
        i iVar = this.f7432a;
        iVar.getClass();
        a0 c3 = iVar.c(new gb.a(cls));
        if (c3 instanceof l) {
            bVar.e();
            bVar.q();
            return;
        }
        c3.b(bVar, obj);
    }

    public final Serializable c(a aVar, int i8) {
        if (i8 != 0) {
            int i10 = i8 - 1;
            if (i10 == 5) {
                return aVar.f0();
            }
            if (i10 == 6) {
                return this.f7433b.a(aVar);
            }
            if (i10 == 7) {
                return Boolean.valueOf(aVar.Q());
            }
            if (i10 == 8) {
                aVar.d0();
                return null;
            }
            throw new IllegalStateException("Unexpected token: ".concat(e.d(i8)));
        }
        throw null;
    }
}
