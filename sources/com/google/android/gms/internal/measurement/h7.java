package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class h7 extends a6 implements RandomAccess, j7, o8 {

    /* renamed from: d  reason: collision with root package name */
    public static final h7 f5308d = new h7(new int[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public int[] f5309b;

    /* renamed from: c  reason: collision with root package name */
    public int f5310c;

    public h7() {
        this(new int[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f5310c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5310c));
        }
        int[] iArr = this.f5309b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i10 - i8);
        } else {
            int[] iArr2 = new int[j1.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f5309b, i8, iArr2, i8 + 1, this.f5310c - i8);
            this.f5309b = iArr2;
        }
        this.f5309b[i8] = intValue;
        this.f5310c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = m7.f5399a;
        collection.getClass();
        if (!(collection instanceof h7)) {
            return super.addAll(collection);
        }
        h7 h7Var = (h7) collection;
        int i8 = h7Var.f5310c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f5310c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            int[] iArr = this.f5309b;
            if (i11 > iArr.length) {
                this.f5309b = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(h7Var.f5309b, 0, this.f5309b, this.f5310c, h7Var.f5310c);
            this.f5310c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i8) {
        a();
        int i10 = this.f5310c;
        int[] iArr = this.f5309b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[j1.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f5309b = iArr2;
        }
        int[] iArr3 = this.f5309b;
        int i11 = this.f5310c;
        this.f5310c = i11 + 1;
        iArr3[i11] = i8;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f5310c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5310c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return super.equals(obj);
        }
        h7 h7Var = (h7) obj;
        if (this.f5310c != h7Var.f5310c) {
            return false;
        }
        int[] iArr = h7Var.f5309b;
        for (int i8 = 0; i8 < this.f5310c; i8++) {
            if (this.f5309b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Integer.valueOf(this.f5309b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f5310c; i10++) {
            i8 = (i8 * 31) + this.f5309b[i10];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f5310c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f5309b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        int[] iArr = this.f5309b;
        int i10 = iArr[i8];
        int i11 = this.f5310c;
        if (i8 < i11 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i11 - i8) - 1);
        }
        this.f5310c--;
        this.modCount++;
        return Integer.valueOf(i10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            int[] iArr = this.f5309b;
            System.arraycopy(iArr, i10, iArr, i8, this.f5310c - i10);
            this.f5310c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i8);
        int[] iArr = this.f5309b;
        int i10 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i10);
    }

    public final int size() {
        return this.f5310c;
    }

    public final l7 zzd(int i8) {
        if (i8 >= this.f5310c) {
            return new h7(Arrays.copyOf(this.f5309b, i8), this.f5310c, true);
        }
        throw new IllegalArgumentException();
    }

    public h7(int[] iArr, int i8, boolean z10) {
        super(z10);
        this.f5309b = iArr;
        this.f5310c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
