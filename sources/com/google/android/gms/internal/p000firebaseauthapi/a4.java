package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a4  reason: invalid package */
public final class a4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f4371a;

    /* renamed from: b  reason: collision with root package name */
    public static final k4 f4372b = u(false);

    /* renamed from: c  reason: collision with root package name */
    public static final k4 f4373c = u(true);

    /* renamed from: d  reason: collision with root package name */
    public static final m4 f4374d = new m4();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4371a = cls;
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) + 8) * size;
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i8, List list, z3 z3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += y1.C(i8, (o3) list.get(i11), z3Var);
        }
        return i10;
    }

    public static int E(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * size) + F(list);
    }

    public static int F(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i8 = 0;
            while (i10 < size) {
                q2Var.c(i10);
                i8 += y1.D(q2Var.f4832b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + y1.D(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int G(int i8, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * list.size()) + H(list);
    }

    public static int H(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            i8 = 0;
            while (i10 < size) {
                e3Var.c(i10);
                i8 += y1.k(e3Var.f4504b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + y1.k(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i8;
    }

    public static int I(int i8, z3 z3Var, Object obj) {
        int j10;
        int j11;
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            int i10 = i8 << 3;
            Logger logger = y1.f5090b;
            int length = y2Var.f5094b != null ? ((p1) y2Var.f5094b).f4803c.length : y2Var.f5093a != null ? y2Var.f5093a.zzs() : 0;
            j10 = y1.j(length) + length;
            j11 = y1.j(i10);
        } else {
            Logger logger2 = y1.f5090b;
            int c3 = ((e1) ((o3) obj)).c(z3Var);
            j10 = y1.j(c3) + c3;
            j11 = y1.j(i8 << 3);
        }
        return j11 + j10;
    }

    public static int J(int i8, List list, z3 z3Var) {
        int c3;
        int j10;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int j11 = y1.j(i8 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof y2) {
                y2 y2Var = (y2) obj;
                c3 = y2Var.f5094b != null ? ((p1) y2Var.f5094b).f4803c.length : y2Var.f5093a != null ? y2Var.f5093a.zzs() : 0;
                j10 = y1.j(c3);
            } else {
                c3 = ((e1) ((o3) obj)).c(z3Var);
                j10 = y1.j(c3);
            }
            j11 = j10 + c3 + j11;
        }
        return j11;
    }

    public static int K(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * size) + L(list);
    }

    public static int L(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i8 = 0;
            while (i10 < size) {
                q2Var.c(i10);
                int i11 = q2Var.f4832b[i10];
                i8 += y1.j((i11 >> 31) ^ (i11 + i11));
                i10++;
            }
        } else {
            int i12 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i12 = i8 + y1.j((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i8;
    }

    public static int M(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * size) + N(list);
    }

    public static int N(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            i8 = 0;
            while (i10 < size) {
                e3Var.c(i10);
                long j10 = e3Var.f4504b[i10];
                i8 += y1.k((j10 >> 63) ^ (j10 + j10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 = i8 + y1.k((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i8;
    }

    public static int O(int i8, List list) {
        int E;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = y1.f5090b;
        boolean z10 = list instanceof a3;
        int j10 = y1.j(i8 << 3) * size;
        if (z10) {
            a3 a3Var = (a3) list;
            while (i10 < size) {
                Object zzf = a3Var.zzf(i10);
                if (zzf instanceof q1) {
                    int c3 = ((q1) zzf).c();
                    j10 = y1.j(c3) + c3 + j10;
                } else {
                    j10 = y1.E((String) zzf) + j10;
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof q1) {
                    int c10 = ((q1) obj).c();
                    E = y1.j(c10) + c10 + j10;
                } else {
                    E = y1.E((String) obj) + j10;
                }
                i10++;
            }
        }
        return j10;
    }

    public static int P(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * size) + Q(list);
    }

    public static int Q(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i8 = 0;
            while (i10 < size) {
                q2Var.c(i10);
                i8 += y1.j(q2Var.f4832b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + y1.j(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int R(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * size) + S(list);
    }

    public static int S(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            i8 = 0;
            while (i10 < size) {
                e3Var.c(i10);
                i8 += y1.k(e3Var.f4504b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + y1.k(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i8;
    }

    public static Object a(Object obj, int i8, List list, s2 s2Var, Object obj2, k4 k4Var) {
        if (s2Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                if (s2Var.zza()) {
                    if (i11 != i10) {
                        list.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    if (obj2 == null) {
                        obj2 = k4Var.c(obj);
                    }
                    k4Var.l(obj2, i8, (long) intValue);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!s2Var.zza()) {
                    if (obj2 == null) {
                        obj2 = k4Var.c(obj);
                    }
                    k4Var.l(obj2, i8, (long) intValue2);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static void c(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).booleanValue();
                    i11++;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.m(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.n(i8, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void d(int i8, List list, z1 z1Var) {
        if (list != null && !list.isEmpty()) {
            z1Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                z1Var.f5119a.o(i8, (q1) list.get(i10));
            }
        }
    }

    public static void e(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).doubleValue();
                    i11 += 8;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.s(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.r(i8, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
        }
    }

    public static void f(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += y1.D(((Integer) list.get(i12)).intValue());
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.u(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.t(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void g(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.q(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.p(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void h(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.s(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.r(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void i(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).floatValue();
                    i11 += 4;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.q(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.p(i8, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void j(int i8, List list, z1 z1Var, z3 z3Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                z1Var.l(i8, z3Var, list.get(i10));
            }
        }
    }

    public static void k(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += y1.D(((Integer) list.get(i12)).intValue());
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.u(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.t(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void l(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += y1.k(((Long) list.get(i12)).longValue());
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.B(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.A(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void m(int i8, List list, z1 z1Var, z3 z3Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                z1Var.o(i8, z3Var, list.get(i10));
            }
        }
    }

    public static void n(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.q(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.p(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void o(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.s(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.r(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void p(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += y1.j((intValue >> 31) ^ (intValue + intValue));
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    y1Var.z((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                y1Var.y(i8, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void q(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += y1.k((longValue >> 63) ^ (longValue + longValue));
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    y1Var.B((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                y1Var.A(i8, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void r(int i8, List list, z1 z1Var) {
        if (list != null && !list.isEmpty()) {
            z1Var.getClass();
            boolean z10 = list instanceof a3;
            int i10 = 0;
            y1 y1Var = z1Var.f5119a;
            if (z10) {
                a3 a3Var = (a3) list;
                while (i10 < list.size()) {
                    Object zzf = a3Var.zzf(i10);
                    if (zzf instanceof String) {
                        y1Var.w(i8, (String) zzf);
                    } else {
                        y1Var.o(i8, (q1) zzf);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.w(i8, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void s(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += y1.j(((Integer) list.get(i12)).intValue());
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.z(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.y(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i8, List list, z1 z1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            y1 y1Var = z1Var.f5119a;
            int i10 = 0;
            if (z10) {
                y1Var.x(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += y1.k(((Long) list.get(i12)).longValue());
                }
                y1Var.z(i11);
                while (i10 < list.size()) {
                    y1Var.B(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                y1Var.A(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static k4 u(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (k4) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) + 1) * size;
    }

    public static int w(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int j10 = y1.j(i8 << 3) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int c3 = ((q1) list.get(i10)).c();
            j10 += y1.j(c3) + c3;
        }
        return j10;
    }

    public static int x(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) * size) + y(list);
    }

    public static int y(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q2) {
            q2 q2Var = (q2) list;
            i8 = 0;
            while (i10 < size) {
                q2Var.c(i10);
                i8 += y1.D(q2Var.f4832b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + y1.D(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int z(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y1.j(i8 << 3) + 4) * size;
    }
}
