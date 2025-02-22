package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k2  reason: invalid package */
public final class k2 extends f1 implements RandomAccess, v3 {

    /* renamed from: b  reason: collision with root package name */
    public float[] f4679b;

    /* renamed from: c  reason: collision with root package name */
    public int f4680c;

    static {
        new k2(new float[0], 0, false);
    }

    public k2() {
        this(new float[10], 0, true);
    }

    public final void add(int i8, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i8 < 0 || i8 > (i10 = this.f4680c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f4680c));
        }
        float[] fArr = this.f4679b;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i10 - i8);
        } else {
            float[] fArr2 = new float[j1.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f4679b, i8, fArr2, i8 + 1, this.f4680c - i8);
            this.f4679b = fArr2;
        }
        this.f4679b[i8] = floatValue;
        this.f4680c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        a();
        Charset charset = u2.f4974a;
        collection.getClass();
        if (!(collection instanceof k2)) {
            return super.addAll(collection);
        }
        k2 k2Var = (k2) collection;
        int i8 = k2Var.f4680c;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.f4680c;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            float[] fArr = this.f4679b;
            if (i11 > fArr.length) {
                this.f4679b = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(k2Var.f4679b, 0, this.f4679b, this.f4680c, k2Var.f4680c);
            this.f4680c = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(float f10) {
        a();
        int i8 = this.f4680c;
        float[] fArr = this.f4679b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[j1.a(i8, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f4679b = fArr2;
        }
        float[] fArr3 = this.f4679b;
        int i10 = this.f4680c;
        this.f4680c = i10 + 1;
        fArr3[i10] = f10;
    }

    public final void c(int i8) {
        if (i8 < 0 || i8 >= this.f4680c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f4680c));
        }
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return super.equals(obj);
        }
        k2 k2Var = (k2) obj;
        if (this.f4680c != k2Var.f4680c) {
            return false;
        }
        float[] fArr = k2Var.f4679b;
        for (int i8 = 0; i8 < this.f4680c; i8++) {
            if (Float.floatToIntBits(this.f4679b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        c(i8);
        return Float.valueOf(this.f4679b[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.f4680c; i10++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.f4679b[i10]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.f4680c;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.f4679b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        c(i8);
        float[] fArr = this.f4679b;
        float f10 = fArr[i8];
        int i10 = this.f4680c;
        if (i8 < i10 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i10 - i8) - 1);
        }
        this.f4680c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i8, int i10) {
        a();
        if (i10 >= i8) {
            float[] fArr = this.f4679b;
            System.arraycopy(fArr, i10, fArr, i8, this.f4680c - i10);
            this.f4680c -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i8);
        float[] fArr = this.f4679b;
        float f10 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f4680c;
    }

    public final /* bridge */ /* synthetic */ t2 zzd(int i8) {
        if (i8 >= this.f4680c) {
            return new k2(Arrays.copyOf(this.f4679b, i8), this.f4680c, true);
        }
        throw new IllegalArgumentException();
    }

    public k2(float[] fArr, int i8, boolean z10) {
        super(z10);
        this.f4679b = fArr;
        this.f4680c = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}
