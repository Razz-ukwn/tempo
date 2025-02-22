package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzie extends zzet implements RandomAccess, zzix {
    private static final zzie zza = new zzie(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    public zzie() {
        this(new long[10], 0, true);
    }

    private final String zzg(int i8) {
        return d.a("Index:", i8, ", Size:", this.zzc);
    }

    private final void zzh(int i8) {
        if (i8 < 0 || i8 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i8));
        }
    }

    public final /* synthetic */ void add(int i8, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i8 < 0 || i8 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i8));
        }
        long[] jArr = this.zzb;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i10 - i8);
        } else {
            long[] jArr2 = new long[j1.a(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.zzb, i8, jArr2, i8 + 1, this.zzc - i8);
            this.zzb = jArr2;
        }
        this.zzb[i8] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhn.zzd;
        collection.getClass();
        if (!(collection instanceof zzie)) {
            return super.addAll(collection);
        }
        zzie zzie = (zzie) collection;
        int i8 = zzie.zzc;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            long[] jArr = this.zzb;
            if (i11 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(zzie.zzb, 0, this.zzb, this.zzc, zzie.zzc);
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
        if (!(obj instanceof zzie)) {
            return super.equals(obj);
        }
        zzie zzie = (zzie) obj;
        if (this.zzc != zzie.zzc) {
            return false;
        }
        long[] jArr = zzie.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (this.zzb[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        zzh(i8);
        return Long.valueOf(this.zzb[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            long j10 = this.zzb[i10];
            byte[] bArr = zzhn.zzd;
            i8 = (i8 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i8 = this.zzc;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.zzb[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzh(i8);
        long[] jArr = this.zzb;
        long j10 = jArr[i8];
        int i10 = this.zzc;
        if (i8 < i10 - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (i10 - i8) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    public final void removeRange(int i8, int i10) {
        zza();
        if (i10 >= i8) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i10, jArr, i8, this.zzc - i10);
            this.zzc -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzh(i8);
        long[] jArr = this.zzb;
        long j10 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzie(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i8) {
        zzh(i8);
        return this.zzb[i8];
    }

    public final void zzf(long j10) {
        zza();
        int i8 = this.zzc;
        long[] jArr = this.zzb;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[j1.a(i8, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        jArr3[i10] = j10;
    }

    private zzie(long[] jArr, int i8, boolean z10) {
        super(z10);
        this.zzb = jArr;
        this.zzc = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
