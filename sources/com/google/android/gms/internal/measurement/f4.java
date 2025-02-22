package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class f4 {
    public static double a(double d10) {
        int i8;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || i8 == 0) {
            return d10;
        }
        return ((double) (i8 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static int b(double d10) {
        int i8;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i8 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d));
    }

    public static void c(c cVar) {
        int b10 = b(cVar.o("runtime.counter").zzh().doubleValue() + 1.0d);
        if (b10 <= 1000000) {
            cVar.q("runtime.counter", new h(Double.valueOf((double) b10)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long d(double d10) {
        return ((long) b(d10)) & 4294967295L;
    }

    public static d0 e(String str) {
        d0 d0Var;
        if (str == null || str.isEmpty()) {
            d0Var = null;
        } else {
            d0Var = (d0) d0.H0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object f(o oVar) {
        if (o.f5429k.equals(oVar)) {
            return null;
        }
        if (o.f5428j.equals(oVar)) {
            return "";
        }
        if (oVar instanceof l) {
            return g((l) oVar);
        }
        if (!(oVar instanceof e)) {
            return !oVar.zzh().isNaN() ? oVar.zzh() : oVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        e eVar = (e) oVar;
        eVar.getClass();
        int i8 = 0;
        while (true) {
            if (!(i8 < eVar.e())) {
                return arrayList;
            }
            if (i8 < eVar.e()) {
                int i10 = i8 + 1;
                Object f10 = f(eVar.f(i8));
                if (f10 != null) {
                    arrayList.add(f10);
                }
                i8 = i10;
            } else {
                throw new NoSuchElementException(q.a("Out of bounds index: ", i8));
            }
        }
    }

    public static HashMap g(l lVar) {
        HashMap hashMap = new HashMap();
        lVar.getClass();
        Iterator it = new ArrayList(lVar.f5379a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object f10 = f(lVar.d(str));
            if (f10 != null) {
                hashMap.put(str, f10);
            }
        }
        return hashMap;
    }

    public static void h(String str, int i8, List list) {
        if (list.size() != i8) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i8), Integer.valueOf(list.size())}));
        }
    }

    public static void i(String str, int i8, List list) {
        if (list.size() < i8) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i8), Integer.valueOf(list.size())}));
        }
    }

    public static void j(String str, int i8, ArrayList arrayList) {
        if (arrayList.size() > i8) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i8), Integer.valueOf(arrayList.size())}));
        }
    }

    public static boolean k(o oVar) {
        if (oVar == null) {
            return false;
        }
        Double zzh = oVar.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= 0.0d && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    public static boolean l(o oVar, o oVar2) {
        if (!oVar.getClass().equals(oVar2.getClass())) {
            return false;
        }
        if ((oVar instanceof t) || (oVar instanceof m)) {
            return true;
        }
        if (!(oVar instanceof h)) {
            return oVar instanceof s ? oVar.zzi().equals(oVar2.zzi()) : oVar instanceof f ? oVar.zzg().equals(oVar2.zzg()) : oVar == oVar2;
        }
        if (Double.isNaN(oVar.zzh().doubleValue()) || Double.isNaN(oVar2.zzh().doubleValue())) {
            return false;
        }
        return oVar.zzh().equals(oVar2.zzh());
    }
}
