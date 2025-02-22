package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k1  reason: invalid package */
public final class k1 extends f1 implements RandomAccess, v3 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f4677b;

    /* renamed from: c  reason: collision with root package name */
    public int f4678c;

    static {
        new k1(new boolean[0], 0, false);
    }

    public k1() {
        this(new boolean[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f4678c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f4678c));
        }
        boolean[] zArr = this.f4677b;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i10 - i8);
        } else {
            boolean[] zArr2 = new boolean[j1.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f4677b, i8, zArr2, i8 + 1, this.f4678c - i8);
            this.f4677b = zArr2;
        }
        this.f4677b[i8] = booleanValue;
        this.f4678c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = u2.f4974a;
        collection.getClass();
        if (!(collection instanceof k1)) {
            return super.addAll(collection);
        }
        k1 k1Var = (k1) collection;
        int i8 = k1Var.f4678c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f4678c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            boolean[] zArr = this.f4677b;
            if (i11 > zArr.length) {
                this.f4677b = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(k1Var.f4677b, 0, this.f4677b, this.f4678c, k1Var.f4678c);
            this.f4678c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(boolean z10) {
        a();
        int i8 = this.f4678c;
        boolean[] zArr = this.f4677b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[j1.a(i8, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f4677b = zArr2;
        }
        boolean[] zArr3 = this.f4677b;
        int i10 = this.f4678c;
        this.f4678c = i10 + 1;
        zArr3[i10] = z10;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f4678c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f4678c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return super.equals(obj);
        }
        k1 k1Var = (k1) obj;
        if (this.f4678c != k1Var.f4678c) {
            return false;
        }
        boolean[] zArr = k1Var.f4677b;
        for (int i8 = 0; i8 < this.f4678c; i8++) {
            if (this.f4677b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Boolean.valueOf(this.f4677b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f4678c; i10++) {
            int i11 = i8 * 31;
            boolean z10 = this.f4677b[i10];
            Charset charset = u2.f4974a;
            i8 = i11 + (z10 ? 1231 : 1237);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f4678c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f4677b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        boolean[] zArr = this.f4677b;
        boolean z10 = zArr[i8];
        int i10 = this.f4678c;
        if (i8 < i10 - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (i10 - i8) - 1);
        }
        this.f4678c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            boolean[] zArr = this.f4677b;
            System.arraycopy(zArr, i10, zArr, i8, this.f4678c - i10);
            this.f4678c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i8);
        boolean[] zArr = this.f4677b;
        boolean z10 = zArr[i8];
        zArr[i8] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f4678c;
    }

    public final /* bridge */ /* synthetic */ t2 zzd(int i8) {
        if (i8 >= this.f4678c) {
            return new k1(Arrays.copyOf(this.f4677b, i8), this.f4678c, true);
        }
        throw new IllegalArgumentException();
    }

    public k1(boolean[] zArr, int i8, boolean z10) {
        super(z10);
        this.f4677b = zArr;
        this.f4678c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
