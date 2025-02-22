package g0;

import d0.g;
import ff.e;
import java.util.Arrays;
import q0.c;
import rf.l;
import s0.i;
import sf.j;
import sf.k;
import u.d;
import wf.f;

public final class x {

    public static final class a extends k implements l<c.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f8786a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s f8787b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f8788c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ l<s, Boolean> f8789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s sVar, s sVar2, int i8, l<? super s, Boolean> lVar) {
            super(1);
            this.f8786a = sVar;
            this.f8787b = sVar2;
            this.f8788c = i8;
            this.f8789d = lVar;
        }

        public final Object invoke(Object obj) {
            c.a aVar = (c.a) obj;
            j.f(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(x.e(this.f8786a, this.f8787b, this.f8788c, this.f8789d));
            if (valueOf.booleanValue() || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    public static final boolean a(s sVar, l<? super s, Boolean> lVar) {
        int ordinal = sVar.G.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s c3 = v.c(sVar);
                if (c3 != null) {
                    int ordinal2 = c3.G.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new e();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                        } else if (a(c3, lVar) || c(sVar, c3, 2, lVar)) {
                            return true;
                        } else {
                            sVar.C();
                            if (lVar.invoke(c3).booleanValue()) {
                                return true;
                            }
                        }
                    }
                    return c(sVar, c3, 2, lVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new e();
                } else if (d(sVar, lVar)) {
                    return true;
                } else {
                    sVar.C();
                    if (lVar.invoke(sVar).booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return d(sVar, lVar);
    }

    public static final boolean b(s sVar, l<? super s, Boolean> lVar) {
        int ordinal = sVar.G.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s c3 = v.c(sVar);
                if (c3 != null) {
                    if (!b(c3, lVar) && !c(sVar, c3, 1, lVar)) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    sVar.C();
                    return lVar.invoke(sVar).booleanValue();
                }
                throw new e();
            }
        }
        Object[] objArr = new s[16];
        g.c cVar = sVar.f7177a;
        if (cVar.F) {
            d dVar = new d(new g.c[16]);
            g.c cVar2 = cVar.f7181e;
            if (cVar2 == null) {
                i.a(dVar, cVar);
            } else {
                dVar.b(cVar2);
            }
            int i8 = 0;
            while (dVar.i()) {
                g.c cVar3 = (g.c) dVar.k(dVar.f15640c - 1);
                if ((cVar3.f7179c & 1024) == 0) {
                    i.a(dVar, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        } else if ((cVar3.f7178b & 1024) == 0) {
                            cVar3 = cVar3.f7181e;
                        } else if (cVar3 instanceof s) {
                            s sVar2 = (s) cVar3;
                            int i10 = i8 + 1;
                            if (objArr.length < i10) {
                                objArr = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
                                j.e(objArr, "copyOf(this, newSize)");
                            }
                            objArr[i8] = sVar2;
                            i8 = i10;
                        }
                    }
                }
            }
            w wVar = w.f8785a;
            j.f(objArr, "<this>");
            Arrays.sort(objArr, 0, i8, wVar);
            if (i8 <= 0) {
                return false;
            }
            int i11 = 0;
            do {
                s sVar3 = (s) objArr[i11];
                if (v.d(sVar3) && b(sVar3, lVar)) {
                    return true;
                }
                i11++;
            } while (i11 < i8);
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean c(s sVar, s sVar2, int i8, l<? super s, Boolean> lVar) {
        if (e(sVar, sVar2, i8, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.a(sVar, i8, new a(sVar, sVar2, i8, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(s sVar, l<? super s, Boolean> lVar) {
        Object[] objArr = new s[16];
        g.c cVar = sVar.f7177a;
        if (cVar.F) {
            d dVar = new d(new g.c[16]);
            g.c cVar2 = cVar.f7181e;
            if (cVar2 == null) {
                i.a(dVar, cVar);
            } else {
                dVar.b(cVar2);
            }
            int i8 = 0;
            while (dVar.i()) {
                g.c cVar3 = (g.c) dVar.k(dVar.f15640c - 1);
                if ((cVar3.f7179c & 1024) == 0) {
                    i.a(dVar, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        } else if ((cVar3.f7178b & 1024) == 0) {
                            cVar3 = cVar3.f7181e;
                        } else if (cVar3 instanceof s) {
                            s sVar2 = (s) cVar3;
                            int i10 = i8 + 1;
                            if (objArr.length < i10) {
                                objArr = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
                                j.e(objArr, "copyOf(this, newSize)");
                            }
                            objArr[i8] = sVar2;
                            i8 = i10;
                        }
                    }
                }
            }
            w wVar = w.f8785a;
            j.f(objArr, "<this>");
            Arrays.sort(objArr, 0, i8, wVar);
            if (i8 > 0) {
                int i11 = i8 - 1;
                do {
                    s sVar3 = (s) objArr[i11];
                    if (v.d(sVar3) && a(sVar3, lVar)) {
                        return true;
                    }
                    i11--;
                } while (i11 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean e(s sVar, s sVar2, int i8, l<? super s, Boolean> lVar) {
        boolean z10 = true;
        if (sVar.G == r.f8778b) {
            Object[] objArr = new s[16];
            g.c cVar = sVar.f7177a;
            if (cVar.F) {
                d dVar = new d(new g.c[16]);
                g.c cVar2 = cVar.f7181e;
                if (cVar2 == null) {
                    i.a(dVar, cVar);
                } else {
                    dVar.b(cVar2);
                }
                int i10 = 0;
                while (dVar.i()) {
                    g.c cVar3 = (g.c) dVar.k(dVar.f15640c - 1);
                    if ((cVar3.f7179c & 1024) == 0) {
                        i.a(dVar, cVar3);
                    } else {
                        while (true) {
                            if (cVar3 == null) {
                                break;
                            } else if ((cVar3.f7178b & 1024) == 0) {
                                cVar3 = cVar3.f7181e;
                            } else if (cVar3 instanceof s) {
                                s sVar3 = (s) cVar3;
                                int i11 = i10 + 1;
                                if (objArr.length < i11) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i11, objArr.length * 2));
                                    j.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i10] = sVar3;
                                i10 = i11;
                            }
                        }
                    }
                }
                w wVar = w.f8785a;
                j.f(objArr, "<this>");
                Arrays.sort(objArr, 0, i10, wVar);
                if (i8 == 1) {
                    int i12 = new f(0, i10 - 1).f16715b;
                    if (i12 >= 0) {
                        boolean z11 = false;
                        int i13 = 0;
                        while (true) {
                            if (z11) {
                                s sVar4 = (s) objArr[i13];
                                if (v.d(sVar4) && b(sVar4, lVar)) {
                                    return true;
                                }
                            }
                            if (j.a(objArr[i13], sVar2)) {
                                z11 = true;
                            }
                            if (i13 == i12) {
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i8 == 2) {
                        int i14 = new f(0, i10 - 1).f16715b;
                        if (i14 >= 0) {
                            boolean z12 = false;
                            while (true) {
                                if (z12) {
                                    s sVar5 = (s) objArr[i14];
                                    if (v.d(sVar5) && a(sVar5, lVar)) {
                                        return true;
                                    }
                                }
                                if (j.a(objArr[i14], sVar2)) {
                                    z12 = true;
                                }
                                if (i14 == 0) {
                                    break;
                                }
                                i14--;
                            }
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                    }
                }
                if (!(i8 == 1)) {
                    sVar.C();
                    g.c c3 = i.c(sVar, 1024);
                    if (!(c3 instanceof s)) {
                        c3 = null;
                    }
                    if (((s) c3) != null) {
                        z10 = false;
                    }
                    if (!z10) {
                        return lVar.invoke(sVar).booleanValue();
                    }
                }
                return false;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
