package g0;

import d0.g;
import ff.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import rf.a;
import s0.i;
import sf.j;
import sf.k;
import u.d;

public final class f extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f8750a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.f8750a = gVar;
    }

    public final Object d() {
        r rVar;
        g gVar = this.f8750a;
        Iterator it = gVar.f8754d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashSet<s> linkedHashSet = gVar.f8752b;
            int i8 = 16;
            if (hasNext) {
                n nVar = (n) it.next();
                if (nVar.s().F) {
                    d dVar = new d(new g.c[16]);
                    g.c cVar = nVar.s().f7181e;
                    if (cVar == null) {
                        i.a(dVar, nVar.s());
                    } else {
                        dVar.b(cVar);
                    }
                    while (dVar.i()) {
                        g.c cVar2 = (g.c) dVar.k(dVar.f15640c - 1);
                        if ((cVar2.f7179c & 1024) == 0) {
                            i.a(dVar, cVar2);
                        } else {
                            while (true) {
                                if (cVar2 == null) {
                                    break;
                                } else if ((cVar2.f7178b & 1024) == 0) {
                                    cVar2 = cVar2.f7181e;
                                } else if (cVar2 instanceof s) {
                                    linkedHashSet.add((s) cVar2);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                LinkedHashSet linkedHashSet2 = gVar.f8754d;
                linkedHashSet2.clear();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet<d> linkedHashSet4 = gVar.f8753c;
                for (d dVar2 : linkedHashSet4) {
                    if (dVar2.s().F) {
                        if (dVar2.s().F) {
                            d dVar3 = new d(new g.c[i8]);
                            g.c cVar3 = dVar2.s().f7181e;
                            if (cVar3 == null) {
                                i.a(dVar3, dVar2.s());
                            } else {
                                dVar3.b(cVar3);
                            }
                            s sVar = null;
                            boolean z10 = true;
                            boolean z11 = false;
                            while (dVar3.i()) {
                                g.c cVar4 = (g.c) dVar3.k(dVar3.f15640c - 1);
                                if ((cVar4.f7179c & 1024) == 0) {
                                    i.a(dVar3, cVar4);
                                } else {
                                    while (true) {
                                        if (cVar4 == null) {
                                            break;
                                        } else if ((cVar4.f7178b & 1024) == 0) {
                                            cVar4 = cVar4.f7181e;
                                        } else if (cVar4 instanceof s) {
                                            s sVar2 = (s) cVar4;
                                            if (sVar != null) {
                                                z11 = true;
                                            }
                                            if (linkedHashSet.contains(sVar2)) {
                                                linkedHashSet3.add(sVar2);
                                                z10 = false;
                                            }
                                            sVar = sVar2;
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                if (z11) {
                                    rVar = e.a(dVar2);
                                } else if (sVar == null || (rVar = sVar.G) == null) {
                                    rVar = r.f8780d;
                                }
                                dVar2.e(rVar);
                            }
                            i8 = 16;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                linkedHashSet4.clear();
                for (s sVar3 : linkedHashSet) {
                    if (sVar3.F) {
                        r rVar2 = sVar3.G;
                        sVar3.D();
                        if (!j.a(rVar2, sVar3.G) || linkedHashSet3.contains(sVar3)) {
                            e.b(sVar3);
                        }
                    }
                }
                linkedHashSet.clear();
                linkedHashSet3.clear();
                if (!linkedHashSet2.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!linkedHashSet4.isEmpty()) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (linkedHashSet.isEmpty()) {
                    return m.f8717a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
    }
}
