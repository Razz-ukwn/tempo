package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.RandomAccess;

final class zziz extends zzet implements RandomAccess {
    private static final zziz zza = new zziz(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zziz() {
        this(new Object[10], 0, true);
    }

    public static zziz zze() {
        return zza;
    }

    private final String zzf(int i8) {
        return d.a("Index:", i8, ", Size:", this.zzc);
    }

    private final void zzg(int i8) {
        if (i8 < 0 || i8 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
    }

    public final void add(int i8, Object obj) {
        int i10;
        zza();
        if (i8 < 0 || i8 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        Object[] objArr = this.zzb;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i8, objArr, i8 + 1, i10 - i8);
        } else {
            Object[] objArr2 = new Object[j1.a(i10, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i8);
            System.arraycopy(this.zzb, i8, objArr2, i8 + 1, this.zzc - i8);
            this.zzb = objArr2;
        }
        this.zzb[i8] = obj;
        this.zzc++;
        this.modCount++;
    }

    public final Object get(int i8) {
        zzg(i8);
        return this.zzb[i8];
    }

    public final Object remove(int i8) {
        zza();
        zzg(i8);
        Object[] objArr = this.zzb;
        Object obj = objArr[i8];
        int i10 = this.zzc;
        if (i8 < i10 - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (i10 - i8) - 1);
        }
        this.zzc--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i8, Object obj) {
        zza();
        zzg(i8);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zziz(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zziz(Object[] objArr, int i8, boolean z10) {
        super(z10);
        this.zzb = objArr;
        this.zzc = i8;
    }

    public final boolean add(Object obj) {
        zza();
        int i8 = this.zzc;
        Object[] objArr = this.zzb;
        if (i8 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        objArr2[i10] = obj;
        this.modCount++;
        return true;
    }
}
