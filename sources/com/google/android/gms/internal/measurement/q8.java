package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.RandomAccess;

public final class q8 extends a6 implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final q8 f5487d = new q8(new Object[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    public Object[] f5488b;

    /* renamed from: c  reason: collision with root package name */
    public int f5489c;

    public q8(Object[] objArr, int i8, boolean z10) {
        super(z10);
        this.f5488b = objArr;
        this.f5489c = i8;
    }

    public final void add(int i8, Object obj) {
        int i10;
        a();
        if (i8 < 0 || i8 > (i10 = this.f5489c)) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5489c));
        }
        Object[] objArr = this.f5488b;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i8, objArr, i8 + 1, i10 - i8);
        } else {
            Object[] objArr2 = new Object[j1.a(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i8);
            System.arraycopy(this.f5488b, i8, objArr2, i8 + 1, this.f5489c - i8);
            this.f5488b = objArr2;
        }
        this.f5488b[i8] = obj;
        this.f5489c++;
        this.modCount++;
    }

    public final void b(int i8) {
        if (i8 < 0 || i8 >= this.f5489c) {
            throw new IndexOutOfBoundsException(d.a("Index:", i8, ", Size:", this.f5489c));
        }
    }

    public final Object get(int i8) {
        b(i8);
        return this.f5488b[i8];
    }

    public final Object remove(int i8) {
        a();
        b(i8);
        Object[] objArr = this.f5488b;
        Object obj = objArr[i8];
        int i10 = this.f5489c;
        if (i8 < i10 - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (i10 - i8) - 1);
        }
        this.f5489c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i8, Object obj) {
        a();
        b(i8);
        Object[] objArr = this.f5488b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f5489c;
    }

    public final /* bridge */ /* synthetic */ l7 zzd(int i8) {
        if (i8 >= this.f5489c) {
            return new q8(Arrays.copyOf(this.f5488b, i8), this.f5489c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean add(Object obj) {
        a();
        int i8 = this.f5489c;
        Object[] objArr = this.f5488b;
        if (i8 == objArr.length) {
            this.f5488b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5488b;
        int i10 = this.f5489c;
        this.f5489c = i10 + 1;
        objArr2[i10] = obj;
        this.modCount++;
        return true;
    }
}
