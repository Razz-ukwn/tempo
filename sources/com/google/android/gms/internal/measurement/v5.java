package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class v5 extends s5 {
    public static final Object[] E;
    public static final v5 F;
    public final transient Object[] B;
    public final transient int C;
    public final transient int D;

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f5554d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f5555e;

    static {
        Object[] objArr = new Object[0];
        E = objArr;
        F = new v5(0, 0, 0, objArr, objArr);
    }

    public v5(int i8, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f5554d = objArr;
        this.f5555e = i8;
        this.B = objArr2;
        this.C = i10;
        this.D = i11;
    }

    public final void a(Object[] objArr) {
        System.arraycopy(this.f5554d, 0, objArr, 0, this.D);
    }

    public final int b() {
        return this.D;
    }

    public final int c() {
        return 0;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.B;
            if (objArr.length != 0) {
                int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * -862048943), 15)) * 461845907);
                while (true) {
                    int i8 = rotateLeft & this.C;
                    Object obj2 = objArr[i8];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    rotateLeft = i8 + 1;
                }
            }
        }
        return false;
    }

    public final Object[] d() {
        return this.f5554d;
    }

    public final x5 e() {
        r5 r5Var = this.f5515b;
        if (r5Var == null) {
            r5Var = h();
            this.f5515b = r5Var;
        }
        return r5Var.listIterator(0);
    }

    public final u5 h() {
        return r5.f(this.D, this.f5554d);
    }

    public final int hashCode() {
        return this.f5555e;
    }

    public final Iterator iterator() {
        r5 r5Var = this.f5515b;
        if (r5Var == null) {
            r5Var = h();
            this.f5515b = r5Var;
        }
        return r5Var.listIterator(0);
    }

    public final int size() {
        return this.D;
    }
}
