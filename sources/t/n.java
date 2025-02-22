package t;

import cb.d;
import ff.m;
import rf.a;
import rf.p;
import sf.j;
import sf.k;
import sf.y;
import t.h;

public final class n extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p<h, Integer, m> f15159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f15160b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15161c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(z.a aVar, i iVar, Object obj) {
        super(0);
        this.f15159a = aVar;
        this.f15160b = iVar;
        this.f15161c = obj;
    }

    public final Object d() {
        Object obj;
        int i8 = 0;
        i iVar = this.f15160b;
        p<h, Integer, m> pVar = this.f15159a;
        if (pVar != null) {
            iVar.c0(200, e0.f15025f);
            d.N(iVar, pVar);
            iVar.E(false);
        } else {
            iVar.getClass();
            if (iVar.f15085v && (obj = this.f15161c) != null && !j.a(obj, h.a.f15061a)) {
                iVar.c0(200, e0.f15025f);
                y.c(2, obj);
                d.N(iVar, (p) obj);
                iVar.E(false);
            } else if (iVar.f15081r.isEmpty()) {
                iVar.f15076l = iVar.D.n() + iVar.f15076l;
            } else {
                m2 m2Var = iVar.D;
                int i10 = m2Var.f15153g;
                int i11 = m2Var.f15154h;
                if (i10 < i11) {
                    i8 = m2Var.f15148b[i10 * 5];
                }
                int[] iArr = m2Var.f15148b;
                Object k10 = i10 < i11 ? m2Var.k(iArr, i10) : null;
                Object e10 = m2Var.e();
                iVar.i0(i8, k10, e10);
                iVar.e0(b7.a.g(iArr, m2Var.f15153g), (Object) null);
                iVar.T();
                m2Var.d();
                iVar.j0(i8, k10, e10);
            }
        }
        return m.f8717a;
    }
}
