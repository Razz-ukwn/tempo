package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzex extends zzet implements RandomAccess, zzix {
    private static final zzex zza = new zzex(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    public zzex() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i8 < 0 || i8 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        boolean[] zArr = this.zzb;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i10 - i8);
        } else {
            boolean[] zArr2 = new boolean[j1.a(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.zzb, i8, zArr2, i8 + 1, this.zzc - i8);
            this.zzb = zArr2;
        }
        this.zzb[i8] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhn.zzd;
        collection.getClass();
        if (!(collection instanceof zzex)) {
            return super.addAll(collection);
        }
        zzex zzex = (zzex) collection;
        int i8 = zzex.zzc;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            boolean[] zArr = this.zzb;
            if (i11 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(zzex.zzb, 0, this.zzb, this.zzc, zzex.zzc);
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
        if (!(obj instanceof zzex)) {
            return super.equals(obj);
        }
        zzex zzex = (zzex) obj;
        if (this.zzc != zzex.zzc) {
            return false;
        }
        boolean[] zArr = zzex.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (this.zzb[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        zzg(i8);
        return Boolean.valueOf(this.zzb[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i8 = (i8 * 31) + zzhn.zza(this.zzb[i10]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.zzc;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzg(i8);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i8];
        int i10 = this.zzc;
        if (i8 < i10 - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (i10 - i8) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i8, int i10) {
        zza();
        if (i10 >= i8) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i10, zArr, i8, this.zzc - i10);
            this.zzc -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i8);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i8];
        zArr[i8] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzex(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i8 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[j1.a(i8, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr3[i10] = z10;
    }

    private zzex(boolean[] zArr, int i8, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
