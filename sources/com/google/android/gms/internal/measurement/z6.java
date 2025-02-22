package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class z6 extends a6 implements RandomAccess, o8 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f5625b;

    /* renamed from: c  reason: collision with root package name */
    public int f5626c;

    static {
        new z6(new float[0], 0, false);
    }

    public z6() {
        this(new float[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f5626c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5626c));
        }
        float[] fArr = this.f5625b;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i10 - i8);
        } else {
            float[] fArr2 = new float[j1.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f5625b, i8, fArr2, i8 + 1, this.f5626c - i8);
            this.f5625b = fArr2;
        }
        this.f5625b[i8] = floatValue;
        this.f5626c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = m7.f5399a;
        collection.getClass();
        if (!(collection instanceof z6)) {
            return super.addAll(collection);
        }
        z6 z6Var = (z6) collection;
        int i8 = z6Var.f5626c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f5626c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            float[] fArr = this.f5625b;
            if (i11 > fArr.length) {
                this.f5625b = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(z6Var.f5625b, 0, this.f5625b, this.f5626c, z6Var.f5626c);
            this.f5626c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(float f10) {
        a();
        int i8 = this.f5626c;
        float[] fArr = this.f5625b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[j1.a(i8, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f5625b = fArr2;
        }
        float[] fArr3 = this.f5625b;
        int i10 = this.f5626c;
        this.f5626c = i10 + 1;
        fArr3[i10] = f10;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f5626c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5626c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return super.equals(obj);
        }
        z6 z6Var = (z6) obj;
        if (this.f5626c != z6Var.f5626c) {
            return false;
        }
        float[] fArr = z6Var.f5625b;
        for (int i8 = 0; i8 < this.f5626c; i8++) {
            if (Float.floatToIntBits(this.f5625b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Float.valueOf(this.f5625b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f5626c; i10++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.f5625b[i10]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.f5626c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f5625b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        float[] fArr = this.f5625b;
        float f10 = fArr[i8];
        int i10 = this.f5626c;
        if (i8 < i10 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i10 - i8) - 1);
        }
        this.f5626c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            float[] fArr = this.f5625b;
            System.arraycopy(fArr, i10, fArr, i8, this.f5626c - i10);
            this.f5626c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i8);
        float[] fArr = this.f5625b;
        float f10 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f5626c;
    }

    public final /* bridge */ /* synthetic */ l7 zzd(int i8) {
        if (i8 >= this.f5626c) {
            return new z6(Arrays.copyOf(this.f5625b, i8), this.f5626c, true);
        }
        throw new IllegalArgumentException();
    }

    public z6(float[] fArr, int i8, boolean z10) {
        super(z10);
        this.f5625b = fArr;
        this.f5626c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
