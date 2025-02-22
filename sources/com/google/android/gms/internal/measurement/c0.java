package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class c0 extends v {
    public c0() {
        this.f5552a.add(d0.ASSIGN);
        this.f5552a.add(d0.CONST);
        this.f5552a.add(d0.CREATE_ARRAY);
        this.f5552a.add(d0.CREATE_OBJECT);
        this.f5552a.add(d0.EXPRESSION_LIST);
        this.f5552a.add(d0.GET);
        this.f5552a.add(d0.GET_INDEX);
        this.f5552a.add(d0.GET_PROPERTY);
        this.f5552a.add(d0.NULL);
        this.f5552a.add(d0.SET_PROPERTY);
        this.f5552a.add(d0.TYPEOF);
        this.f5552a.add(d0.UNDEFINED);
        this.f5552a.add(d0.VAR);
    }

    public final o a(String str, c cVar, ArrayList arrayList) {
        String str2;
        d0 d0Var = d0.ADD;
        int ordinal = f4.e(str).ordinal();
        int i8 = 0;
        if (ordinal == 3) {
            f4.h("ASSIGN", 2, arrayList);
            o m = cVar.m((o) arrayList.get(0));
            if (!(m instanceof s)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{m.getClass().getCanonicalName()}));
            } else if (cVar.r(m.zzi())) {
                o m10 = cVar.m((o) arrayList.get(1));
                cVar.q(m.zzi(), m10);
                return m10;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{m.zzi()}));
            }
        } else if (ordinal == 14) {
            f4.i("CONST", 2, arrayList);
            if (arrayList.size() % 2 == 0) {
                int i10 = 0;
                while (i10 < arrayList.size() - 1) {
                    o m11 = cVar.m((o) arrayList.get(i10));
                    if (m11 instanceof s) {
                        String zzi = m11.zzi();
                        cVar.p(zzi, cVar.m((o) arrayList.get(i10 + 1)));
                        ((Map) cVar.f9758d).put(zzi, Boolean.TRUE);
                        i10 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{m11.getClass().getCanonicalName()}));
                    }
                }
                return o.f5428j;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
        } else if (ordinal == 24) {
            f4.i("EXPRESSION_LIST", 1, arrayList);
            o oVar = o.f5428j;
            while (i8 < arrayList.size()) {
                oVar = cVar.m((o) arrayList.get(i8));
                if (!(oVar instanceof g)) {
                    i8++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return oVar;
        } else if (ordinal == 33) {
            f4.h("GET", 1, arrayList);
            o m12 = cVar.m((o) arrayList.get(0));
            if (m12 instanceof s) {
                return cVar.o(m12.zzi());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{m12.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            f4.h("NULL", 0, arrayList);
            return o.f5429k;
        } else if (ordinal == 58) {
            f4.h("SET_PROPERTY", 3, arrayList);
            o m13 = cVar.m((o) arrayList.get(0));
            o m14 = cVar.m((o) arrayList.get(1));
            o m15 = cVar.m((o) arrayList.get(2));
            if (m13 == o.f5428j || m13 == o.f5429k) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{m14.zzi(), m13.zzi()}));
            }
            if ((m13 instanceof e) && (m14 instanceof h)) {
                ((e) m13).k(m14.zzh().intValue(), m15);
            } else if (m13 instanceof k) {
                ((k) m13).b(m14.zzi(), m15);
            }
            return m15;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    f4.h("GET_PROPERTY", 2, arrayList);
                    o m16 = cVar.m((o) arrayList.get(0));
                    o m17 = cVar.m((o) arrayList.get(1));
                    if ((m16 instanceof e) && f4.k(m17)) {
                        return ((e) m16).f(m17.zzh().intValue());
                    }
                    if (m16 instanceof k) {
                        return ((k) m16).d(m17.zzi());
                    }
                    if (m16 instanceof s) {
                        if ("length".equals(m17.zzi())) {
                            return new h(Double.valueOf((double) m16.zzi().length()));
                        }
                        if (f4.k(m17) && m17.zzh().doubleValue() < ((double) m16.zzi().length())) {
                            return new s(String.valueOf(m16.zzi().charAt(m17.zzh().intValue())));
                        }
                    }
                    return o.f5428j;
                }
                switch (ordinal) {
                    case 62:
                        f4.h("TYPEOF", 1, arrayList);
                        o m18 = cVar.m((o) arrayList.get(0));
                        if (m18 instanceof t) {
                            str2 = "undefined";
                        } else if (m18 instanceof f) {
                            str2 = "boolean";
                        } else if (m18 instanceof h) {
                            str2 = "number";
                        } else if (m18 instanceof s) {
                            str2 = "string";
                        } else if (m18 instanceof n) {
                            str2 = "function";
                        } else if ((m18 instanceof p) || (m18 instanceof g)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{m18}));
                        } else {
                            str2 = "object";
                        }
                        return new s(str2);
                    case 63:
                        f4.h("UNDEFINED", 0, arrayList);
                        return o.f5428j;
                    case 64:
                        f4.i("VAR", 1, arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            o m19 = cVar.m((o) it.next());
                            if (m19 instanceof s) {
                                cVar.p(m19.zzi(), o.f5428j);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{m19.getClass().getCanonicalName()}));
                            }
                        }
                        return o.f5428j;
                    default:
                        b(str);
                        throw null;
                }
            } else if (arrayList.isEmpty()) {
                return new l();
            } else {
                if (arrayList.size() % 2 == 0) {
                    l lVar = new l();
                    while (i8 < arrayList.size() - 1) {
                        o m20 = cVar.m((o) arrayList.get(i8));
                        o m21 = cVar.m((o) arrayList.get(i8 + 1));
                        if ((m20 instanceof g) || (m21 instanceof g)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        lVar.b(m20.zzi(), m21);
                        i8 += 2;
                    }
                    return lVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
            }
        } else if (arrayList.isEmpty()) {
            return new e();
        } else {
            e eVar = new e();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                o m22 = cVar.m((o) it2.next());
                if (!(m22 instanceof g)) {
                    eVar.k(i8, m22);
                    i8++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return eVar;
        }
    }
}
