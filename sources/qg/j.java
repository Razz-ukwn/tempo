package qg;

import ff.m;
import java.io.IOException;
import mg.a;
import qg.f;
import sf.v;

public final class j extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f.c f13682e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f13683f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ v f13684g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, f.c cVar, v vVar) {
        super(str, true);
        this.f13682e = cVar;
        this.f13684g = vVar;
    }

    public final long a() {
        long a10;
        int i8;
        int i10;
        r[] rVarArr;
        f.c cVar = this.f13682e;
        boolean z10 = this.f13683f;
        T t2 = this.f13684g;
        cVar.getClass();
        sf.j.f(t2, "settings");
        v vVar = new v();
        f fVar = cVar.f13666b;
        synchronized (fVar.U) {
            synchronized (fVar) {
                v vVar2 = fVar.O;
                if (!z10) {
                    T vVar3 = new v();
                    vVar3.b(vVar2);
                    vVar3.b(t2);
                    t2 = vVar3;
                }
                vVar.f14957a = t2;
                a10 = ((long) t2.a()) - ((long) vVar2.a());
                i8 = (a10 > 0 ? 1 : (a10 == 0 ? 0 : -1));
                i10 = 0;
                if (i8 != 0) {
                    if (!fVar.f13652c.isEmpty()) {
                        Object[] array = fVar.f13652c.values().toArray(new r[0]);
                        if (array != null) {
                            rVarArr = (r[]) array;
                            v vVar4 = (v) vVar.f14957a;
                            sf.j.f(vVar4, "<set-?>");
                            fVar.O = vVar4;
                            fVar.G.c(new g(sf.j.k(" onSettings", fVar.f13653d), fVar, vVar), 0);
                            m mVar = m.f8717a;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                }
                rVarArr = null;
                v vVar42 = (v) vVar.f14957a;
                sf.j.f(vVar42, "<set-?>");
                fVar.O = vVar42;
                fVar.G.c(new g(sf.j.k(" onSettings", fVar.f13653d), fVar, vVar), 0);
                m mVar2 = m.f8717a;
            }
            try {
                fVar.U.c((v) vVar.f14957a);
            } catch (IOException e10) {
                fVar.d(e10);
            }
            m mVar3 = m.f8717a;
        }
        if (rVarArr == null) {
            return -1;
        }
        int length = rVarArr.length;
        while (i10 < length) {
            r rVar = rVarArr[i10];
            i10++;
            synchronized (rVar) {
                rVar.f13722f += a10;
                if (i8 > 0) {
                    rVar.notifyAll();
                }
                m mVar4 = m.f8717a;
            }
        }
        return -1;
    }
}
