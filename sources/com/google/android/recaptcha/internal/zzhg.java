package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhg extends zzet implements RandomAccess, zzhk, zzix {
    private static final zzhg zza = new zzhg(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzhg() {
        this(new int[10], 0, true);
    }

    public static zzhg zzf() {
        return zza;
    }

    private final String zzh(int i8) {
        return d.a("Index:", i8, ", Size:", this.zzc);
    }

    private final void zzi(int i8) {
        if (i8 < 0 || i8 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i8));
        }
    }

    public final /* synthetic */ void add(int i8, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i8 < 0 || i8 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i8));
        }
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i10 - i8);
        } else {
            int[] iArr2 = new int[j1.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.zzb, i8, iArr2, i8 + 1, this.zzc - i8);
            this.zzb = iArr2;
        }
        this.zzb[i8] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhn.zzd;
        collection.getClass();
        if (!(collection instanceof zzhg)) {
            return super.addAll(collection);
        }
        zzhg zzhg = (zzhg) collection;
        int i8 = zzhg.zzc;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            int[] iArr = this.zzb;
            if (i11 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(zzhg.zzb, 0, this.zzb, this.zzc, zzhg.zzc);
            this.zzc = i11;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhg)) {
            return super.equals(obj);
        }
        zzhg zzhg = (zzhg) obj;
        if (this.zzc != zzhg.zzc) {
            return false;
        }
        int[] iArr = zzhg.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (this.zzb[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        zzi(i8);
        return Integer.valueOf(this.zzb[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i8 = (i8 * 31) + this.zzb[i10];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.zzc;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.zzb[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzi(i8);
        int[] iArr = this.zzb;
        int i10 = iArr[i8];
        int i11 = this.zzc;
        if (i8 < i11 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i11 - i8) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i10);
    }

    public final void removeRange(int i8, int i10) {
        zza();
        if (i10 >= i8) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i10, iArr, i8, this.zzc - i10);
            this.zzc -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzi(i8);
        int[] iArr = this.zzb;
        int i10 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzhg(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i8) {
        zzi(i8);
        return this.zzb[i8];
    }

    public final void zzg(int i8) {
        zza();
        int i10 = this.zzc;
        int[] iArr = this.zzb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[j1.a(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        iArr3[i11] = i8;
    }

    private zzhg(int[] iArr, int i8, boolean z10) {
        super(z10);
        this.zzb = iArr;
        this.zzc = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }
}
