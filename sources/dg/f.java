package dg;

import ag.a0;
import ag.g0;
import cg.e;
import cg.p;
import cg.q;
import cg.s;
import d2.f1;
import ff.m;
import java.util.ArrayList;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.g;
import rf.l;
import s0.b0;
import sf.j;

public abstract class f<T> implements o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final jf.f f7537a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7538b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7539c;

    public f(jf.f fVar, int i8, e eVar) {
        this.f7537a = fVar;
        this.f7538b = i8;
        this.f7539c = eVar;
    }

    public Object a(g<? super T> gVar, d<? super m> dVar) {
        Object v3 = f1.v(new d((d) null, gVar, this), dVar);
        return v3 == a.f10464a ? v3 : m.f8717a;
    }

    public final kotlinx.coroutines.flow.f<T> b(jf.f fVar, int i8, e eVar) {
        jf.f fVar2 = this.f7537a;
        jf.f n02 = fVar.n0(fVar2);
        e eVar2 = e.f4020a;
        e eVar3 = this.f7539c;
        int i10 = this.f7538b;
        if (eVar == eVar2) {
            if (i10 != -3) {
                if (i8 != -3) {
                    if (i10 != -2) {
                        if (i8 != -2) {
                            i8 += i10;
                            if (i8 < 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i8 = i10;
            }
            eVar = eVar3;
        }
        return (j.a(n02, fVar2) && i8 == i10 && eVar == eVar3) ? this : f(n02, i8, eVar);
    }

    public String d() {
        return null;
    }

    public abstract Object e(q<? super T> qVar, d<? super m> dVar);

    public abstract f<T> f(jf.f fVar, int i8, e eVar);

    public kotlinx.coroutines.flow.f<T> g() {
        return null;
    }

    public s<T> i(g0 g0Var) {
        int i8 = this.f7538b;
        if (i8 == -3) {
            i8 = -2;
        }
        e eVar = new e(this, (d<? super e>) null);
        p pVar = new p(a0.b(g0Var, this.f7537a), cb.d.d(i8, this.f7539c, 4));
        pVar.C0(3, pVar, eVar);
        return pVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d10 = d();
        if (d10 != null) {
            arrayList.add(d10);
        }
        jf.g gVar = jf.g.f10014a;
        jf.f fVar = this.f7537a;
        if (fVar != gVar) {
            arrayList.add("context=" + fVar);
        }
        int i8 = this.f7538b;
        if (i8 != -3) {
            arrayList.add("capacity=" + i8);
        }
        e eVar = e.f4020a;
        e eVar2 = this.f7539c;
        if (eVar2 != eVar) {
            arrayList.add("onBufferOverflow=" + eVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return b0.a(sb2, gf.q.A0(arrayList, ", ", (String) null, (String) null, (l) null, 62), ']');
    }
}
