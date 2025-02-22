package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.l;
import f3.v;
import j1.c;
import java.util.ArrayList;
import java.util.Iterator;
import t.w2;

public final class b0 extends v {
    public b0() {
        this.f5552a.add(d0.FOR_IN);
        this.f5552a.add(d0.FOR_IN_CONST);
        this.f5552a.add(d0.FOR_IN_LET);
        this.f5552a.add(d0.FOR_LET);
        this.f5552a.add(d0.FOR_OF);
        this.f5552a.add(d0.FOR_OF_CONST);
        this.f5552a.add(d0.FOR_OF_LET);
        this.f5552a.add(d0.WHILE);
    }

    public static o c(a0 a0Var, Iterator it, o oVar) {
        if (it != null) {
            while (it.hasNext()) {
                o n2 = a0Var.a((o) it.next()).n((e) oVar);
                if (n2 instanceof g) {
                    g gVar = (g) n2;
                    if ("break".equals(gVar.f5281b)) {
                        return o.f5428j;
                    }
                    if ("return".equals(gVar.f5281b)) {
                        return gVar;
                    }
                }
            }
        }
        return o.f5428j;
    }

    public static o d(a0 a0Var, o oVar, o oVar2) {
        if (oVar instanceof Iterable) {
            return c(a0Var, ((Iterable) oVar).iterator(), oVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final o a(String str, c cVar, ArrayList arrayList) {
        d0 d0Var = d0.ADD;
        int ordinal = f4.e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    f4.h("FOR_IN", 3, arrayList);
                    if (arrayList.get(0) instanceof s) {
                        return c(new l(10, (Object) cVar, (Object) ((o) arrayList.get(0)).zzi()), cVar.m((o) arrayList.get(1)).zzl(), cVar.m((o) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    f4.h("FOR_IN_CONST", 3, arrayList);
                    if (arrayList.get(0) instanceof s) {
                        return c(new v((Object) cVar, (Object) ((o) arrayList.get(0)).zzi()), cVar.m((o) arrayList.get(1)).zzl(), cVar.m((o) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    f4.h("FOR_IN_LET", 3, arrayList);
                    if (arrayList.get(0) instanceof s) {
                        return c(new w2((Object) cVar, (Object) ((o) arrayList.get(0)).zzi()), cVar.m((o) arrayList.get(1)).zzl(), cVar.m((o) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    f4.h("FOR_LET", 4, arrayList);
                    o m = cVar.m((o) arrayList.get(0));
                    if (m instanceof e) {
                        e eVar = (e) m;
                        o oVar = (o) arrayList.get(1);
                        o oVar2 = (o) arrayList.get(2);
                        o m10 = cVar.m((o) arrayList.get(3));
                        c l10 = cVar.l();
                        for (int i8 = 0; i8 < eVar.e(); i8++) {
                            String zzi = eVar.f(i8).zzi();
                            l10.q(zzi, cVar.o(zzi));
                        }
                        while (cVar.m(oVar).zzg().booleanValue()) {
                            o n2 = cVar.n((e) m10);
                            if (n2 instanceof g) {
                                g gVar = (g) n2;
                                if ("break".equals(gVar.f5281b)) {
                                    return o.f5428j;
                                }
                                if ("return".equals(gVar.f5281b)) {
                                    return gVar;
                                }
                            }
                            c l11 = cVar.l();
                            for (int i10 = 0; i10 < eVar.e(); i10++) {
                                String zzi2 = eVar.f(i10).zzi();
                                l11.q(zzi2, l10.o(zzi2));
                            }
                            l11.m(oVar2);
                            l10 = l11;
                        }
                        return o.f5428j;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    f4.h("FOR_OF", 3, arrayList);
                    if (arrayList.get(0) instanceof s) {
                        return d(new l(10, (Object) cVar, (Object) ((o) arrayList.get(0)).zzi()), cVar.m((o) arrayList.get(1)), cVar.m((o) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    f4.h("FOR_OF_CONST", 3, arrayList);
                    if (arrayList.get(0) instanceof s) {
                        return d(new v((Object) cVar, (Object) ((o) arrayList.get(0)).zzi()), cVar.m((o) arrayList.get(1)), cVar.m((o) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    f4.h("FOR_OF_LET", 3, arrayList);
                    if (arrayList.get(0) instanceof s) {
                        return d(new w2((Object) cVar, (Object) ((o) arrayList.get(0)).zzi()), cVar.m((o) arrayList.get(1)), cVar.m((o) arrayList.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    b(str);
                    throw null;
            }
        } else {
            f4.h("WHILE", 4, arrayList);
            o oVar3 = (o) arrayList.get(0);
            o oVar4 = (o) arrayList.get(1);
            o m11 = cVar.m((o) arrayList.get(3));
            if (cVar.m((o) arrayList.get(2)).zzg().booleanValue()) {
                o n10 = cVar.n((e) m11);
                if (n10 instanceof g) {
                    g gVar2 = (g) n10;
                    if ("break".equals(gVar2.f5281b)) {
                        return o.f5428j;
                    }
                    if ("return".equals(gVar2.f5281b)) {
                        return gVar2;
                    }
                }
            }
            while (cVar.m(oVar3).zzg().booleanValue()) {
                o n11 = cVar.n((e) m11);
                if (n11 instanceof g) {
                    g gVar3 = (g) n11;
                    if ("break".equals(gVar3.f5281b)) {
                        return o.f5428j;
                    }
                    if ("return".equals(gVar3.f5281b)) {
                        return gVar3;
                    }
                }
                cVar.m(oVar4);
            }
            return o.f5428j;
        }
    }
}
