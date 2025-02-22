package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w7 extends a6 implements RandomAccess, k7, o8 {

    /* renamed from: d  reason: collision with root package name */
    public static final w7 f5570d = new w7(new long[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public long[] f5571b;

    /* renamed from: c  reason: collision with root package name */
    public int f5572c;

    public w7() {
        this(new long[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f5572c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5572c));
        }
        long[] jArr = this.f5571b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i10 - i8);
        } else {
            long[] jArr2 = new long[j1.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f5571b, i8, jArr2, i8 + 1, this.f5572c - i8);
            this.f5571b = jArr2;
        }
        this.f5571b[i8] = longValue;
        this.f5572c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = m7.f5399a;
        collection.getClass();
        if (!(collection instanceof w7)) {
            return super.addAll(collection);
        }
        w7 w7Var = (w7) collection;
        int i8 = w7Var.f5572c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f5572c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            long[] jArr = this.f5571b;
            if (i11 > jArr.length) {
                this.f5571b = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(w7Var.f5571b, 0, this.f5571b, this.f5572c, w7Var.f5572c);
            this.f5572c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(long j10) {
        a();
        int i8 = this.f5572c;
        long[] jArr = this.f5571b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[j1.a(i8, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f5571b = jArr2;
        }
        long[] jArr3 = this.f5571b;
        int i10 = this.f5572c;
        this.f5572c = i10 + 1;
        jArr3[i10] = j10;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f5572c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5572c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return super.equals(obj);
        }
        w7 w7Var = (w7) obj;
        if (this.f5572c != w7Var.f5572c) {
            return false;
        }
        long[] jArr = w7Var.f5571b;
        for (int i8 = 0; i8 < this.f5572c; i8++) {
            if (this.f5571b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Long.valueOf(this.f5571b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f5572c; i10++) {
            long j10 = this.f5571b[i10];
            Charset charset = m7.f5399a;
            i8 = (i8 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i8 = this.f5572c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f5571b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        long[] jArr = this.f5571b;
        long j10 = jArr[i8];
        int i10 = this.f5572c;
        if (i8 < i10 - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (i10 - i8) - 1);
        }
        this.f5572c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            long[] jArr = this.f5571b;
            System.arraycopy(jArr, i10, jArr, i8, this.f5572c - i10);
            this.f5572c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i8);
        long[] jArr = this.f5571b;
        long j10 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f5572c;
    }

    public final l7 zzd(int i8) {
        if (i8 >= this.f5572c) {
            return new w7(Arrays.copyOf(this.f5571b, i8), this.f5572c, true);
        }
        throw new IllegalArgumentException();
    }

    public w7(long[] jArr, int i8, boolean z10) {
        super(z10);
        this.f5571b = jArr;
        this.f5572c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Long) obj).longValue());
        return true;
    }
}
