package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class e6 extends a6 implements RandomAccess, o8 {

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f5256b;

    /* renamed from: c  reason: collision with root package name */
    public int f5257c;

    static {
        new e6(new boolean[0], 0, false);
    }

    public e6() {
        this(new boolean[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f5257c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5257c));
        }
        boolean[] zArr = this.f5256b;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i10 - i8);
        } else {
            boolean[] zArr2 = new boolean[j1.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f5256b, i8, zArr2, i8 + 1, this.f5257c - i8);
            this.f5256b = zArr2;
        }
        this.f5256b[i8] = booleanValue;
        this.f5257c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = m7.f5399a;
        collection.getClass();
        if (!(collection instanceof e6)) {
            return super.addAll(collection);
        }
        e6 e6Var = (e6) collection;
        int i8 = e6Var.f5257c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f5257c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            boolean[] zArr = this.f5256b;
            if (i11 > zArr.length) {
                this.f5256b = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(e6Var.f5256b, 0, this.f5256b, this.f5257c, e6Var.f5257c);
            this.f5257c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(boolean z10) {
        a();
        int i8 = this.f5257c;
        boolean[] zArr = this.f5256b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[j1.a(i8, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f5256b = zArr2;
        }
        boolean[] zArr3 = this.f5256b;
        int i10 = this.f5257c;
        this.f5257c = i10 + 1;
        zArr3[i10] = z10;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f5257c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5257c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return super.equals(obj);
        }
        e6 e6Var = (e6) obj;
        if (this.f5257c != e6Var.f5257c) {
            return false;
        }
        boolean[] zArr = e6Var.f5256b;
        for (int i8 = 0; i8 < this.f5257c; i8++) {
            if (this.f5256b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Boolean.valueOf(this.f5256b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f5257c; i10++) {
            int i11 = i8 * 31;
            boolean z10 = this.f5256b[i10];
            Charset charset = m7.f5399a;
            i8 = i11 + (z10 ? 1231 : 1237);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f5257c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f5256b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        boolean[] zArr = this.f5256b;
        boolean z10 = zArr[i8];
        int i10 = this.f5257c;
        if (i8 < i10 - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (i10 - i8) - 1);
        }
        this.f5257c--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            boolean[] zArr = this.f5256b;
            System.arraycopy(zArr, i10, zArr, i8, this.f5257c - i10);
            this.f5257c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i8);
        boolean[] zArr = this.f5256b;
        boolean z10 = zArr[i8];
        zArr[i8] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.f5257c;
    }

    public final /* bridge */ /* synthetic */ l7 zzd(int i8) {
        if (i8 >= this.f5257c) {
            return new e6(Arrays.copyOf(this.f5256b, i8), this.f5257c, true);
        }
        throw new IllegalArgumentException();
    }

    public e6(boolean[] zArr, int i8, boolean z10) {
        super(z10);
        this.f5256b = zArr;
        this.f5257c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Boolean) obj).booleanValue());
        return true;
    }
}
