package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import j1.c;
import java.util.ArrayList;
import java.util.List;

public final class x extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5578b;

    public x(int i8) {
        this.f5578b = i8;
        if (i8 != 1) {
            ArrayList arrayList = this.f5552a;
            arrayList.add(d0.APPLY);
            arrayList.add(d0.BLOCK);
            arrayList.add(d0.BREAK);
            arrayList.add(d0.CASE);
            arrayList.add(d0.DEFAULT);
            arrayList.add(d0.CONTINUE);
            arrayList.add(d0.DEFINE_FUNCTION);
            arrayList.add(d0.FN);
            arrayList.add(d0.IF);
            arrayList.add(d0.QUOTE);
            arrayList.add(d0.RETURN);
            arrayList.add(d0.SWITCH);
            arrayList.add(d0.TERNARY);
        }
    }

    public static n c(c cVar, ArrayList arrayList) {
        d0 d0Var = d0.ADD;
        f4.i("FN", 2, arrayList);
        o m = cVar.m((o) arrayList.get(0));
        o m10 = cVar.m((o) arrayList.get(1));
        if (m10 instanceof e) {
            ArrayList i8 = ((e) m10).i();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new n(m.zzi(), i8, arrayList2, cVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{m10.getClass().getCanonicalName()}));
    }

    public final o a(String str, c cVar, ArrayList arrayList) {
        switch (this.f5578b) {
            case 0:
                d0 d0Var = d0.ADD;
                int ordinal = f4.e(str).ordinal();
                if (ordinal == 2) {
                    f4.h("APPLY", 3, arrayList);
                    o m = cVar.m((o) arrayList.get(0));
                    String zzi = cVar.m((o) arrayList.get(1)).zzi();
                    o m10 = cVar.m((o) arrayList.get(2));
                    if (!(m10 instanceof e)) {
                        throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[]{m10.getClass().getCanonicalName()}));
                    } else if (!zzi.isEmpty()) {
                        return m.c(zzi, cVar, ((e) m10).i());
                    } else {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                } else if (ordinal == 15) {
                    f4.h("BREAK", 0, arrayList);
                    return o.f5430l;
                } else if (ordinal == 25) {
                    return c(cVar, arrayList);
                } else {
                    o oVar = null;
                    if (ordinal == 41) {
                        f4.i("IF", 2, arrayList);
                        o m11 = cVar.m((o) arrayList.get(0));
                        o m12 = cVar.m((o) arrayList.get(1));
                        if (arrayList.size() > 2) {
                            oVar = cVar.m((o) arrayList.get(2));
                        }
                        t tVar = o.f5428j;
                        o n2 = m11.zzg().booleanValue() ? cVar.n((e) m12) : oVar != null ? cVar.n((e) oVar) : tVar;
                        return n2 instanceof g ? n2 : tVar;
                    } else if (ordinal == 54) {
                        return new e(arrayList);
                    } else {
                        if (ordinal != 57) {
                            if (ordinal != 19) {
                                if (ordinal == 20) {
                                    f4.i("DEFINE_FUNCTION", 2, arrayList);
                                    n c3 = c(cVar, arrayList);
                                    String str2 = c3.f5319a;
                                    if (str2 == null) {
                                        cVar.q("", c3);
                                        return c3;
                                    }
                                    cVar.q(str2, c3);
                                    return c3;
                                } else if (ordinal == 60) {
                                    f4.h("SWITCH", 3, arrayList);
                                    o m13 = cVar.m((o) arrayList.get(0));
                                    o m14 = cVar.m((o) arrayList.get(1));
                                    o m15 = cVar.m((o) arrayList.get(2));
                                    if (!(m14 instanceof e)) {
                                        throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                    } else if (m15 instanceof e) {
                                        e eVar = (e) m14;
                                        e eVar2 = (e) m15;
                                        boolean z10 = false;
                                        for (int i8 = 0; i8 < eVar.e(); i8++) {
                                            if (z10 || m13.equals(cVar.m(eVar.f(i8)))) {
                                                o m16 = cVar.m(eVar2.f(i8));
                                                if (m16 instanceof g) {
                                                    return ((g) m16).f5281b.equals("break") ? o.f5428j : m16;
                                                }
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (eVar.e() + 1 == eVar2.e()) {
                                            o m17 = cVar.m(eVar2.f(eVar.e()));
                                            if (m17 instanceof g) {
                                                String str3 = ((g) m17).f5281b;
                                                if (str3.equals("return") || str3.equals("continue")) {
                                                    return m17;
                                                }
                                            }
                                        }
                                        return o.f5428j;
                                    } else {
                                        throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                    }
                                } else if (ordinal != 61) {
                                    switch (ordinal) {
                                        case ModuleDescriptor.MODULE_VERSION:
                                            return cVar.l().n(new e(arrayList));
                                        case 12:
                                            f4.h("BREAK", 0, arrayList);
                                            return o.m;
                                        case 13:
                                            break;
                                        default:
                                            b(str);
                                            throw null;
                                    }
                                } else {
                                    f4.h("TERNARY", 3, arrayList);
                                    return cVar.m((o) arrayList.get(0)).zzg().booleanValue() ? cVar.m((o) arrayList.get(1)) : cVar.m((o) arrayList.get(2));
                                }
                            }
                            if (arrayList.isEmpty()) {
                                return o.f5428j;
                            }
                            o m18 = cVar.m((o) arrayList.get(0));
                            return m18 instanceof e ? cVar.n((e) m18) : o.f5428j;
                        } else if (arrayList.isEmpty()) {
                            return o.f5431n;
                        } else {
                            f4.h("RETURN", 1, arrayList);
                            return new g("return", cVar.m((o) arrayList.get(0)));
                        }
                    }
                }
            default:
                if (str == null || str.isEmpty() || !cVar.r(str)) {
                    throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
                }
                o o10 = cVar.o(str);
                if (o10 instanceof i) {
                    return ((i) o10).e(cVar, arrayList);
                }
                throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
        }
    }
}
