package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgk extends zzet implements RandomAccess, zzix {
    private static final zzgk zza = new zzgk(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public zzgk() {
        this(new double[10], 0, true);
    }

    private final String zzf(int i8) {
        return d.a("Index:", i8, ", Size:", this.zzc);
    }

    private final void zzg(int i8) {
        if (i8 < 0 || i8 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
    }

    public final /* synthetic */ void add(int i8, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i8 < 0 || i8 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        double[] dArr = this.zzb;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i10 - i8);
        } else {
            double[] dArr2 = new double[j1.a(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.zzb, i8, dArr2, i8 + 1, this.zzc - i8);
            this.zzb = dArr2;
        }
        this.zzb[i8] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhn.zzd;
        collection.getClass();
        if (!(collection instanceof zzgk)) {
            return super.addAll(collection);
        }
        zzgk zzgk = (zzgk) collection;
        int i8 = zzgk.zzc;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            double[] dArr = this.zzb;
            if (i11 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(zzgk.zzb, 0, this.zzb, this.zzc, zzgk.zzc);
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
        if (!(obj instanceof zzgk)) {
            return super.equals(obj);
        }
        zzgk zzgk = (zzgk) obj;
        if (this.zzc != zzgk.zzc) {
            return false;
        }
        double[] dArr = zzgk.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (Double.doubleToLongBits(this.zzb[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        zzg(i8);
        return Double.valueOf(this.zzb[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i10]);
            byte[] bArr = zzhn.zzd;
            i8 = (i8 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i8 = this.zzc;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzg(i8);
        double[] dArr = this.zzb;
        double d10 = dArr[i8];
        int i10 = this.zzc;
        if (i8 < i10 - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (i10 - i8) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i8, int i10) {
        zza();
        if (i10 >= i8) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i10, dArr, i8, this.zzc - i10);
            this.zzc -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzg(i8);
        double[] dArr = this.zzb;
        double d10 = dArr[i8];
        dArr[i8] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzgk(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d10) {
        zza();
        int i8 = this.zzc;
        double[] dArr = this.zzb;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[j1.a(i8, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        dArr3[i10] = d10;
    }

    private zzgk(double[] dArr, int i8, boolean z10) {
        super(z10);
        this.zzb = dArr;
        this.zzc = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
