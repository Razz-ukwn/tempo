package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;

public final class w extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5565b;

    public w(int i8) {
        this.f5565b = i8;
        if (i8 == 1) {
            ArrayList arrayList = this.f5552a;
            arrayList.add(d0.AND);
            arrayList.add(d0.NOT);
            arrayList.add(d0.OR);
        } else if (i8 != 2) {
            ArrayList arrayList2 = this.f5552a;
            arrayList2.add(d0.EQUALS);
            arrayList2.add(d0.GREATER_THAN);
            arrayList2.add(d0.GREATER_THAN_EQUALS);
            arrayList2.add(d0.IDENTITY_EQUALS);
            arrayList2.add(d0.IDENTITY_NOT_EQUALS);
            arrayList2.add(d0.LESS_THAN);
            arrayList2.add(d0.LESS_THAN_EQUALS);
            arrayList2.add(d0.NOT_EQUALS);
        } else {
            ArrayList arrayList3 = this.f5552a;
            arrayList3.add(d0.ADD);
            arrayList3.add(d0.DIVIDE);
            arrayList3.add(d0.MODULUS);
            arrayList3.add(d0.MULTIPLY);
            arrayList3.add(d0.NEGATE);
            arrayList3.add(d0.POST_DECREMENT);
            arrayList3.add(d0.POST_INCREMENT);
            arrayList3.add(d0.PRE_DECREMENT);
            arrayList3.add(d0.PRE_INCREMENT);
            arrayList3.add(d0.SUBTRACT);
        }
    }

    public static boolean c(o oVar, o oVar2) {
        if (oVar.getClass().equals(oVar2.getClass())) {
            if ((oVar instanceof t) || (oVar instanceof m)) {
                return true;
            }
            return oVar instanceof h ? !Double.isNaN(oVar.zzh().doubleValue()) && !Double.isNaN(oVar2.zzh().doubleValue()) && oVar.zzh().doubleValue() == oVar2.zzh().doubleValue() : oVar instanceof s ? oVar.zzi().equals(oVar2.zzi()) : oVar instanceof f ? oVar.zzg().equals(oVar2.zzg()) : oVar == oVar2;
        } else if (((oVar instanceof t) || (oVar instanceof m)) && ((oVar2 instanceof t) || (oVar2 instanceof m))) {
            return true;
        } else {
            boolean z10 = oVar instanceof h;
            if (z10 && (oVar2 instanceof s)) {
                return c(oVar, new h(oVar2.zzh()));
            }
            boolean z11 = oVar instanceof s;
            if (z11 && (oVar2 instanceof h)) {
                return c(new h(oVar.zzh()), oVar2);
            }
            if (oVar instanceof f) {
                return c(new h(oVar.zzh()), oVar2);
            }
            if (oVar2 instanceof f) {
                return c(oVar, new h(oVar2.zzh()));
            }
            if ((z11 || z10) && (oVar2 instanceof k)) {
                return c(oVar, new s(oVar2.zzi()));
            }
            if (!(oVar instanceof k) || (!(oVar2 instanceof s) && !(oVar2 instanceof h))) {
                return false;
            }
            return c(new s(oVar.zzi()), oVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(com.google.android.gms.internal.measurement.o r8, com.google.android.gms.internal.measurement.o r9) {
        /*
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.k
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.internal.measurement.s r0 = new com.google.android.gms.internal.measurement.s
            java.lang.String r8 = r8.zzi()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.k
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.internal.measurement.s r0 = new com.google.android.gms.internal.measurement.s
            java.lang.String r9 = r9.zzi()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.s
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.zzi()
            java.lang.String r9 = r9.zzi()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.zzh()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.zzh()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w.d(com.google.android.gms.internal.measurement.o, com.google.android.gms.internal.measurement.o):boolean");
    }

    public static boolean e(o oVar, o oVar2) {
        if (oVar instanceof k) {
            oVar = new s(oVar.zzi());
        }
        if (oVar2 instanceof k) {
            oVar2 = new s(oVar2.zzi());
        }
        return (((oVar instanceof s) && (oVar2 instanceof s)) || (!Double.isNaN(oVar.zzh().doubleValue()) && !Double.isNaN(oVar2.zzh().doubleValue()))) && !d(oVar2, oVar);
    }

    public final o a(String str, c cVar, ArrayList arrayList) {
        o oVar;
        boolean z10;
        boolean z11;
        switch (this.f5565b) {
            case 0:
                f4.h(f4.e(str).name(), 2, arrayList);
                o m = cVar.m((o) arrayList.get(0));
                o m10 = cVar.m((o) arrayList.get(1));
                int ordinal = f4.e(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        z11 = c(m, m10);
                    } else if (ordinal == 42) {
                        z10 = d(m, m10);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                z10 = d(m10, m);
                                break;
                            case 38:
                                z10 = e(m10, m);
                                break;
                            case 39:
                                z10 = f4.l(m, m10);
                                break;
                            case 40:
                                z11 = f4.l(m, m10);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        z10 = e(m, m10);
                    }
                    z10 = !z11;
                } else {
                    z10 = c(m, m10);
                }
                return z10 ? o.f5432o : o.f5433p;
            case 1:
                d0 d0Var = d0.ADD;
                int ordinal2 = f4.e(str).ordinal();
                if (ordinal2 == 1) {
                    f4.h("AND", 2, arrayList);
                    o m11 = cVar.m((o) arrayList.get(0));
                    return !m11.zzg().booleanValue() ? m11 : cVar.m((o) arrayList.get(1));
                } else if (ordinal2 == 47) {
                    f4.h("NOT", 1, arrayList);
                    return new f(Boolean.valueOf(!cVar.m((o) arrayList.get(0)).zzg().booleanValue()));
                } else if (ordinal2 == 50) {
                    f4.h("OR", 2, arrayList);
                    o m12 = cVar.m((o) arrayList.get(0));
                    return m12.zzg().booleanValue() ? m12 : cVar.m((o) arrayList.get(1));
                } else {
                    b(str);
                    throw null;
                }
            default:
                d0 d0Var2 = d0.ADD;
                int ordinal3 = f4.e(str).ordinal();
                if (ordinal3 == 0) {
                    f4.h("ADD", 2, arrayList);
                    o m13 = cVar.m((o) arrayList.get(0));
                    o m14 = cVar.m((o) arrayList.get(1));
                    oVar = ((m13 instanceof k) || (m13 instanceof s) || (m14 instanceof k) || (m14 instanceof s)) ? new s(String.valueOf(m13.zzi()).concat(String.valueOf(m14.zzi()))) : new h(Double.valueOf(m14.zzh().doubleValue() + m13.zzh().doubleValue()));
                } else if (ordinal3 == 21) {
                    f4.h("DIVIDE", 2, arrayList);
                    return new h(Double.valueOf(cVar.m((o) arrayList.get(0)).zzh().doubleValue() / cVar.m((o) arrayList.get(1)).zzh().doubleValue()));
                } else if (ordinal3 == 59) {
                    f4.h("SUBTRACT", 2, arrayList);
                    o m15 = cVar.m((o) arrayList.get(0));
                    Double valueOf = Double.valueOf(-cVar.m((o) arrayList.get(1)).zzh().doubleValue());
                    if (valueOf == null) {
                        valueOf = Double.valueOf(Double.NaN);
                    }
                    oVar = new h(Double.valueOf(valueOf.doubleValue() + m15.zzh().doubleValue()));
                } else if (ordinal3 == 52 || ordinal3 == 53) {
                    f4.h(str, 2, arrayList);
                    o m16 = cVar.m((o) arrayList.get(0));
                    cVar.m((o) arrayList.get(1));
                    return m16;
                } else if (ordinal3 == 55 || ordinal3 == 56) {
                    f4.h(str, 1, arrayList);
                    return cVar.m((o) arrayList.get(0));
                } else {
                    switch (ordinal3) {
                        case 44:
                            f4.h("MODULUS", 2, arrayList);
                            return new h(Double.valueOf(cVar.m((o) arrayList.get(0)).zzh().doubleValue() % cVar.m((o) arrayList.get(1)).zzh().doubleValue()));
                        case 45:
                            f4.h("MULTIPLY", 2, arrayList);
                            oVar = new h(Double.valueOf(cVar.m((o) arrayList.get(1)).zzh().doubleValue() * cVar.m((o) arrayList.get(0)).zzh().doubleValue()));
                            break;
                        case 46:
                            f4.h("NEGATE", 1, arrayList);
                            return new h(Double.valueOf(-cVar.m((o) arrayList.get(0)).zzh().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return oVar;
        }
    }
}
