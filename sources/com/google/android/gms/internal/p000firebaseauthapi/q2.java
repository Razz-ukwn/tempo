package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q2  reason: invalid package */
public final class q2 extends f1 implements RandomAccess, v3 {

    /* renamed from: b  reason: collision with root package name */
    public int[] f4832b;

    /* renamed from: c  reason: collision with root package name */
    public int f4833c;

    static {
        new q2(new int[0], 0, false);
    }

    public q2() {
        this(new int[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f4833c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f4833c));
        }
        int[] iArr = this.f4832b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i10 - i8);
        } else {
            int[] iArr2 = new int[j1.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f4832b, i8, iArr2, i8 + 1, this.f4833c - i8);
            this.f4832b = iArr2;
        }
        this.f4832b[i8] = intValue;
        this.f4833c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = u2.f4974a;
        collection.getClass();
        if (!(collection instanceof q2)) {
            return super.addAll(collection);
        }
        q2 q2Var = (q2) collection;
        int i8 = q2Var.f4833c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f4833c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            int[] iArr = this.f4832b;
            if (i11 > iArr.length) {
                this.f4832b = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(q2Var.f4832b, 0, this.f4832b, this.f4833c, q2Var.f4833c);
            this.f4833c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i8) {
        a();
        int i10 = this.f4833c;
        int[] iArr = this.f4832b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[j1.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f4832b = iArr2;
        }
        int[] iArr3 = this.f4832b;
        int i11 = this.f4833c;
        this.f4833c = i11 + 1;
        iArr3[i11] = i8;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f4833c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f4833c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return super.equals(obj);
        }
        q2 q2Var = (q2) obj;
        if (this.f4833c != q2Var.f4833c) {
            return false;
        }
        int[] iArr = q2Var.f4832b;
        for (int i8 = 0; i8 < this.f4833c; i8++) {
            if (this.f4832b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Integer.valueOf(this.f4832b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f4833c; i10++) {
            i8 = (i8 * 31) + this.f4832b[i10];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f4833c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f4832b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        int[] iArr = this.f4832b;
        int i10 = iArr[i8];
        int i11 = this.f4833c;
        if (i8 < i11 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i11 - i8) - 1);
        }
        this.f4833c--;
        this.modCount++;
        return Integer.valueOf(i10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            int[] iArr = this.f4832b;
            System.arraycopy(iArr, i10, iArr, i8, this.f4833c - i10);
            this.f4833c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i8);
        int[] iArr = this.f4832b;
        int i10 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i10);
    }

    public final int size() {
        return this.f4833c;
    }

    public final /* bridge */ /* synthetic */ t2 zzd(int i8) {
        if (i8 >= this.f4833c) {
            return new q2(Arrays.copyOf(this.f4832b, i8), this.f4833c, true);
        }
        throw new IllegalArgumentException();
    }

    public q2(int[] iArr, int i8, boolean z10) {
        super(z10);
        this.f4832b = iArr;
        this.f4833c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
