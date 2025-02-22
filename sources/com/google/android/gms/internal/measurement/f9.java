package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.logging.Logger;

public final class f9 extends d9 {
    public final /* synthetic */ int a(Object obj) {
        return ((e9) obj).a();
    }

    public final int b(Object obj) {
        e9 e9Var = (e9) obj;
        int i8 = e9Var.f5263d;
        if (i8 != -1) {
            return i8;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < e9Var.f5260a; i11++) {
            Logger logger = o6.f5446d;
            int c3 = ((k6) e9Var.f5262c[i11]).c();
            int v3 = o6.v(c3) + c3;
            int v10 = o6.v(16);
            int v11 = o6.v(e9Var.f5261b[i11] >>> 3);
            int v12 = o6.v(8);
            i10 += o6.v(24) + v3 + v10 + v11 + v12 + v12;
        }
        e9Var.f5263d = i10;
        return i10;
    }

    public final /* bridge */ /* synthetic */ e9 c(Object obj) {
        g7 g7Var = (g7) obj;
        e9 e9Var = g7Var.zzc;
        if (e9Var != e9.f5259f) {
            return e9Var;
        }
        e9 b10 = e9.b();
        g7Var.zzc = b10;
        return b10;
    }

    public final /* synthetic */ e9 d(Object obj) {
        return ((g7) obj).zzc;
    }

    public final Object e(Object obj, Object obj2) {
        e9 e9Var = e9.f5259f;
        if (e9Var.equals(obj2)) {
            return obj;
        }
        if (e9Var.equals(obj)) {
            e9 e9Var2 = (e9) obj2;
            e9 e9Var3 = (e9) obj;
            int i8 = e9Var3.f5260a + e9Var2.f5260a;
            int[] copyOf = Arrays.copyOf(e9Var3.f5261b, i8);
            System.arraycopy(e9Var2.f5261b, 0, copyOf, e9Var3.f5260a, e9Var2.f5260a);
            Object[] copyOf2 = Arrays.copyOf(e9Var3.f5262c, i8);
            System.arraycopy(e9Var2.f5262c, 0, copyOf2, e9Var3.f5260a, e9Var2.f5260a);
            return new e9(i8, copyOf, copyOf2, true);
        }
        e9 e9Var4 = (e9) obj2;
        e9 e9Var5 = (e9) obj;
        e9Var5.getClass();
        if (e9Var4.equals(e9Var)) {
            return obj;
        }
        if (e9Var5.f5264e) {
            int i10 = e9Var5.f5260a + e9Var4.f5260a;
            e9Var5.e(i10);
            System.arraycopy(e9Var4.f5261b, 0, e9Var5.f5261b, e9Var5.f5260a, e9Var4.f5260a);
            System.arraycopy(e9Var4.f5262c, 0, e9Var5.f5262c, e9Var5.f5260a, e9Var4.f5260a);
            e9Var5.f5260a = i10;
            return obj;
        }
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, int i8, long j10) {
        ((e9) obj).c(i8 << 3, Long.valueOf(j10));
    }

    public final void g(Object obj) {
        e9 e9Var = ((g7) obj).zzc;
        if (e9Var.f5264e) {
            e9Var.f5264e = false;
        }
    }

    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((g7) obj).zzc = (e9) obj2;
    }

    public final /* synthetic */ void i(Object obj, p6 p6Var) {
        ((e9) obj).d(p6Var);
    }
}
