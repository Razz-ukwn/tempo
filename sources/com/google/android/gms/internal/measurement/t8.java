package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.logging.Logger;

public final class t8 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f5528a;

    /* renamed from: b  reason: collision with root package name */
    public static final d9 f5529b = u(false);

    /* renamed from: c  reason: collision with root package name */
    public static final d9 f5530c = u(true);

    /* renamed from: d  reason: collision with root package name */
    public static final f9 f5531d = new f9();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5528a = cls;
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) + 8) * size;
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i8, List list, s8 s8Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += o6.s(i8, (h8) list.get(i11), s8Var);
        }
        return i10;
    }

    public static int E(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) * size) + F(list);
    }

    public static int F(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h7) {
            h7 h7Var = (h7) list;
            i8 = 0;
            while (i10 < size) {
                h7Var.c(i10);
                i8 += o6.t(h7Var.f5309b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + o6.t(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int G(int i8, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) * list.size()) + H(list);
    }

    public static int H(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            i8 = 0;
            while (i10 < size) {
                w7Var.c(i10);
                i8 += o6.w(w7Var.f5571b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + o6.w(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i8;
    }

    public static int I(int i8, s8 s8Var, Object obj) {
        int v3;
        int v10;
        if (obj instanceof q7) {
            q7 q7Var = (q7) obj;
            int i10 = i8 << 3;
            Logger logger = o6.f5446d;
            int length = q7Var.f5486b != null ? ((i6) q7Var.f5486b).f5326c.length : q7Var.f5485a != null ? q7Var.f5485a.a() : 0;
            v3 = o6.v(length) + length;
            v10 = o6.v(i10);
        } else {
            Logger logger2 = o6.f5446d;
            int c3 = ((z5) ((h8) obj)).c(s8Var);
            v3 = o6.v(c3) + c3;
            v10 = o6.v(i8 << 3);
        }
        return v10 + v3;
    }

    public static int J(int i8, List list, s8 s8Var) {
        int c3;
        int v3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v10 = o6.v(i8 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof q7) {
                q7 q7Var = (q7) obj;
                c3 = q7Var.f5486b != null ? ((i6) q7Var.f5486b).f5326c.length : q7Var.f5485a != null ? q7Var.f5485a.a() : 0;
                v3 = o6.v(c3);
            } else {
                c3 = ((z5) ((h8) obj)).c(s8Var);
                v3 = o6.v(c3);
            }
            v10 = v3 + c3 + v10;
        }
        return v10;
    }

    public static int K(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) * size) + L(list);
    }

    public static int L(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h7) {
            h7 h7Var = (h7) list;
            i8 = 0;
            while (i10 < size) {
                h7Var.c(i10);
                int i11 = h7Var.f5309b[i10];
                i8 += o6.v((i11 >> 31) ^ (i11 + i11));
                i10++;
            }
        } else {
            int i12 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i12 = i8 + o6.v((intValue >> 31) ^ (intValue + intValue));
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
        return (o6.v(i8 << 3) * size) + N(list);
    }

    public static int N(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            i8 = 0;
            while (i10 < size) {
                w7Var.c(i10);
                long j10 = w7Var.f5571b[i10];
                i8 += o6.w((j10 >> 63) ^ (j10 + j10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 = i8 + o6.w((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i8;
    }

    public static int O(int i8, List list) {
        int u7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        Logger logger = o6.f5446d;
        boolean z10 = list instanceof s7;
        int v3 = o6.v(i8 << 3) * size;
        if (z10) {
            s7 s7Var = (s7) list;
            while (i10 < size) {
                Object zzf = s7Var.zzf(i10);
                if (zzf instanceof k6) {
                    int c3 = ((k6) zzf).c();
                    v3 = o6.v(c3) + c3 + v3;
                } else {
                    v3 = o6.u((String) zzf) + v3;
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof k6) {
                    int c10 = ((k6) obj).c();
                    u7 = o6.v(c10) + c10 + v3;
                } else {
                    u7 = o6.u((String) obj) + v3;
                }
                i10++;
            }
        }
        return v3;
    }

    public static int P(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) * size) + Q(list);
    }

    public static int Q(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h7) {
            h7 h7Var = (h7) list;
            i8 = 0;
            while (i10 < size) {
                h7Var.c(i10);
                i8 += o6.v(h7Var.f5309b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + o6.v(((Integer) list.get(i10)).intValue());
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
        return (o6.v(i8 << 3) * size) + S(list);
    }

    public static int S(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            i8 = 0;
            while (i10 < size) {
                w7Var.c(i10);
                i8 += o6.w(w7Var.f5571b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + o6.w(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i8;
    }

    public static Object a(Object obj, int i8, int i10, Object obj2, d9 d9Var) {
        if (obj2 == null) {
            obj2 = d9Var.c(obj);
        }
        d9Var.f(obj2, i8, (long) i10);
        return obj2;
    }

    public static void b(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).booleanValue();
                    i11++;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.d(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : 0);
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.e(i8, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void c(int i8, List list, p6 p6Var) {
        if (list != null && !list.isEmpty()) {
            p6Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                p6Var.f5465a.f(i8, (k6) list.get(i10));
            }
        }
    }

    public static void d(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Double) list.get(i12)).doubleValue();
                    i11 += 8;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.j(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.i(i8, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
        }
    }

    public static void e(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += o6.t(((Integer) list.get(i12)).intValue());
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.l(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.k(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void f(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.h(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.g(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void g(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.j(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.i(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void h(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Float) list.get(i12)).floatValue();
                    i11 += 4;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.h(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.g(i8, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void i(int i8, List list, p6 p6Var, s8 s8Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p6Var.l(i8, s8Var, list.get(i10));
            }
        }
    }

    public static void j(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += o6.t(((Integer) list.get(i12)).intValue());
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.l(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.k(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void k(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += o6.w(((Long) list.get(i12)).longValue());
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.r(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.q(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void l(int i8, List list, p6 p6Var, s8 s8Var) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p6Var.o(i8, s8Var, list.get(i10));
            }
        }
    }

    public static void m(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).intValue();
                    i11 += 4;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.h(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.g(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void n(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).longValue();
                    i11 += 8;
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.j(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.i(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void o(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += o6.v((intValue >> 31) ^ (intValue + intValue));
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    o6Var.p((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                o6Var.o(i8, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void p(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += o6.w((longValue >> 63) ^ (longValue + longValue));
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    o6Var.r((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                o6Var.q(i8, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void q(int i8, List list, p6 p6Var) {
        if (list != null && !list.isEmpty()) {
            p6Var.getClass();
            boolean z10 = list instanceof s7;
            int i10 = 0;
            o6 o6Var = p6Var.f5465a;
            if (z10) {
                s7 s7Var = (s7) list;
                while (i10 < list.size()) {
                    Object zzf = s7Var.zzf(i10);
                    if (zzf instanceof String) {
                        o6Var.m(i8, (String) zzf);
                    } else {
                        o6Var.f(i8, (k6) zzf);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.m(i8, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void r(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += o6.v(((Integer) list.get(i12)).intValue());
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.p(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.o(i8, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void s(int i8, List list, p6 p6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            o6 o6Var = p6Var.f5465a;
            int i10 = 0;
            if (z10) {
                o6Var.n(i8, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += o6.w(((Long) list.get(i12)).longValue());
                }
                o6Var.p(i11);
                while (i10 < list.size()) {
                    o6Var.r(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                o6Var.q(i8, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static d9 u(boolean z10) {
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
            return (d9) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int v(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) + 1) * size;
    }

    public static int w(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v3 = o6.v(i8 << 3) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int c3 = ((k6) list.get(i10)).c();
            v3 += o6.v(c3) + c3;
        }
        return v3;
    }

    public static int x(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o6.v(i8 << 3) * size) + y(list);
    }

    public static int y(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h7) {
            h7 h7Var = (h7) list;
            i8 = 0;
            while (i10 < size) {
                h7Var.c(i10);
                i8 += o6.t(h7Var.f5309b[i10]);
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + o6.t(((Integer) list.get(i10)).intValue());
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
        return (o6.v(i8 << 3) + 4) * size;
    }
}
