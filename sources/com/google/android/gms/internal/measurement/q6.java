package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class q6 extends a6 implements RandomAccess, o8 {

    /* renamed from: b  reason: collision with root package name */
    public double[] f5483b;

    /* renamed from: c  reason: collision with root package name */
    public int f5484c;

    static {
        new q6(new double[0], 0, false);
    }

    public q6() {
        this(new double[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f5484c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5484c));
        }
        double[] dArr = this.f5483b;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i10 - i8);
        } else {
            double[] dArr2 = new double[j1.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f5483b, i8, dArr2, i8 + 1, this.f5484c - i8);
            this.f5483b = dArr2;
        }
        this.f5483b[i8] = doubleValue;
        this.f5484c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = m7.f5399a;
        collection.getClass();
        if (!(collection instanceof q6)) {
            return super.addAll(collection);
        }
        q6 q6Var = (q6) collection;
        int i8 = q6Var.f5484c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f5484c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            double[] dArr = this.f5483b;
            if (i11 > dArr.length) {
                this.f5483b = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(q6Var.f5483b, 0, this.f5483b, this.f5484c, q6Var.f5484c);
            this.f5484c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(double d10) {
        a();
        int i8 = this.f5484c;
        double[] dArr = this.f5483b;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[j1.a(i8, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f5483b = dArr2;
        }
        double[] dArr3 = this.f5483b;
        int i10 = this.f5484c;
        this.f5484c = i10 + 1;
        dArr3[i10] = d10;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f5484c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5484c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return super.equals(obj);
        }
        q6 q6Var = (q6) obj;
        if (this.f5484c != q6Var.f5484c) {
            return false;
        }
        double[] dArr = q6Var.f5483b;
        for (int i8 = 0; i8 < this.f5484c; i8++) {
            if (Double.doubleToLongBits(this.f5483b[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Double.valueOf(this.f5483b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f5484c; i10++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f5483b[i10]);
            Charset charset = m7.f5399a;
            i8 = (i8 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i8 = this.f5484c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f5483b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        double[] dArr = this.f5483b;
        double d10 = dArr[i8];
        int i10 = this.f5484c;
        if (i8 < i10 - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (i10 - i8) - 1);
        }
        this.f5484c--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            double[] dArr = this.f5483b;
            System.arraycopy(dArr, i10, dArr, i8, this.f5484c - i10);
            this.f5484c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i8);
        double[] dArr = this.f5483b;
        double d10 = dArr[i8];
        dArr[i8] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f5484c;
    }

    public final /* bridge */ /* synthetic */ l7 zzd(int i8) {
        if (i8 >= this.f5484c) {
            return new q6(Arrays.copyOf(this.f5483b, i8), this.f5484c, true);
        }
        throw new IllegalArgumentException();
    }

    public q6(double[] dArr, int i8, boolean z10) {
        super(z10);
        this.f5483b = dArr;
        this.f5484c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Double) obj).doubleValue());
        return true;
    }
}
