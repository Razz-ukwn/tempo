package q;

import b7.a;
import cb.c;
import cb.d;
import cg.f;
import d2.f1;
import f1.h;
import h0.g;
import java.util.Map;
import rf.l;
import sf.j;
import t.b3;
import t.e0;
import t.h;
import t.j1;
import t.r0;
import t.t0;
import t.y2;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12683a = 0;

    static {
        Map<l0<?, ?>, Float> map = v0.f12780a;
        int i8 = g.f9088d;
        c.f(0.5f, 0.5f);
        int i10 = h0.c.f9071e;
        f1.f(0.5f, 0.5f);
        int i11 = h.f8036c;
        e9.c.a(1, 1);
    }

    public static final y2 a(Object obj, l0 l0Var, j jVar, Float f10, String str, l lVar, t.h hVar, int i8, int i10) {
        j jVar2;
        Object obj2 = obj;
        l0 l0Var2 = l0Var;
        t.h hVar2 = hVar;
        j.f(l0Var, "typeConverter");
        hVar2.c(-1994373980);
        int i11 = i10 & 4;
        h.a.C0280a aVar = h.a.f15061a;
        if (i11 != 0) {
            hVar2.c(-492369756);
            Object d10 = hVar.d();
            if (d10 == aVar) {
                d10 = a.C((Float) null, 7);
                hVar2.n(d10);
            }
            hVar.o();
            jVar2 = (j) d10;
        } else {
            jVar2 = jVar;
        }
        Float f11 = (i10 & 8) != 0 ? null : f10;
        String str2 = (i10 & 16) != 0 ? "ValueAnimation" : str;
        l lVar2 = (i10 & 32) != 0 ? null : lVar;
        e0.b bVar = e0.f15020a;
        hVar2.c(-492369756);
        Object d11 = hVar.d();
        if (d11 == aVar) {
            d11 = d.R((Object) null, b3.f14997a);
            hVar2.n(d11);
        }
        hVar.o();
        j1 j1Var = (j1) d11;
        hVar2.c(-492369756);
        Object d12 = hVar.d();
        if (d12 == aVar) {
            d12 = new b(obj, l0Var, f11, str2);
            hVar2.n(d12);
        }
        hVar.o();
        b bVar2 = (b) d12;
        j1 c02 = d.c0(lVar2, hVar2);
        if (f11 != null && (jVar2 instanceof c0)) {
            c0 c0Var = (c0) jVar2;
            if (!j.a(c0Var.f12667c, f11)) {
                jVar2 = new c0(c0Var.f12665a, c0Var.f12666b, f11);
            }
        }
        j1 c03 = d.c0(jVar2, hVar2);
        hVar2.c(-492369756);
        Object d13 = hVar.d();
        if (d13 == aVar) {
            d13 = d.d(-1, (cg.e) null, 6);
            hVar2.n(d13);
        }
        hVar.o();
        f fVar = (f) d13;
        c cVar = new c(fVar, obj);
        r0 r0Var = t0.f15231a;
        hVar2.c(-1288466761);
        hVar2.i(cVar);
        hVar.o();
        t0.b(fVar, new d(fVar, bVar2, c03, c02, (jf.d<? super d>) null), hVar2);
        y2 y2Var = (y2) j1Var.getValue();
        if (y2Var == null) {
            y2Var = bVar2.f12648c;
        }
        hVar.o();
        return y2Var;
    }
}
