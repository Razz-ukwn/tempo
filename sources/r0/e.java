package r0;

import d0.g;
import ff.m;
import java.util.HashSet;
import java.util.Iterator;
import s0.a0;
import s0.b1;
import s0.c;
import s0.i;
import sf.j;
import sf.k;
import u.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b1 f13761a;

    /* renamed from: b  reason: collision with root package name */
    public final d<c> f13762b = new d<>(new c[16]);

    /* renamed from: c  reason: collision with root package name */
    public final d<c<?>> f13763c = new d<>(new c[16]);

    /* renamed from: d  reason: collision with root package name */
    public final d<a0> f13764d = new d<>(new a0[16]);

    /* renamed from: e  reason: collision with root package name */
    public final d<c<?>> f13765e = new d<>(new c[16]);

    /* renamed from: f  reason: collision with root package name */
    public boolean f13766f;

    public static final class a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f13767a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f13767a = eVar;
        }

        public final Object d() {
            e eVar = this.f13767a;
            int i8 = 0;
            eVar.f13766f = false;
            HashSet hashSet = new HashSet();
            d<a0> dVar = eVar.f13764d;
            int i10 = dVar.f15640c;
            d<c<?>> dVar2 = eVar.f13765e;
            if (i10 > 0) {
                T[] tArr = dVar.f15638a;
                int i11 = 0;
                do {
                    c cVar = (c) dVar2.f15638a[i11];
                    g.c cVar2 = ((a0) tArr[i11]).V.f14404e;
                    if (cVar2.F) {
                        e.b(cVar2, cVar, hashSet);
                    }
                    i11++;
                } while (i11 < i10);
            }
            dVar.f();
            dVar2.f();
            d<c> dVar3 = eVar.f13762b;
            int i12 = dVar3.f15640c;
            d<c<?>> dVar4 = eVar.f13763c;
            if (i12 > 0) {
                T[] tArr2 = dVar3.f15638a;
                do {
                    c cVar3 = (c) tArr2[i8];
                    c cVar4 = (c) dVar4.f15638a[i8];
                    if (cVar3.F) {
                        e.b(cVar3, cVar4, hashSet);
                    }
                    i8++;
                } while (i8 < i12);
            }
            dVar3.f();
            dVar4.f();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((c) it.next()).E();
            }
            return m.f8717a;
        }
    }

    public e(b1 b1Var) {
        j.f(b1Var, "owner");
        this.f13761a = b1Var;
    }

    public static void b(g.c cVar, c cVar2, HashSet hashSet) {
        boolean z10;
        g.c cVar3 = cVar.f7177a;
        if (cVar3.F) {
            d dVar = new d(new g.c[16]);
            g.c cVar4 = cVar3.f7181e;
            if (cVar4 == null) {
                i.a(dVar, cVar3);
            } else {
                dVar.b(cVar4);
            }
            while (dVar.i()) {
                g.c cVar5 = (g.c) dVar.k(dVar.f15640c - 1);
                if ((cVar5.f7179c & 32) != 0) {
                    g.c cVar6 = cVar5;
                    while (true) {
                        if (cVar6 == null) {
                            break;
                        }
                        if ((cVar6.f7178b & 32) != 0) {
                            if (cVar6 instanceof f) {
                                f fVar = (f) cVar6;
                                if (fVar instanceof c) {
                                    c cVar7 = (c) fVar;
                                    if ((cVar7.G instanceof d) && cVar7.J.contains(cVar2)) {
                                        hashSet.add(fVar);
                                    }
                                }
                                z10 = !fVar.q().j(cVar2);
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                break;
                            }
                        }
                        cVar6 = cVar6.f7181e;
                    }
                }
                i.a(dVar, cVar5);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void a() {
        if (!this.f13766f) {
            this.f13766f = true;
            this.f13761a.q(new a(this));
        }
    }
}
