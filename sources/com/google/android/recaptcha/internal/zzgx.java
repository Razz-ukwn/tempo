package com.google.android.recaptcha.internal;

import androidx.activity.result.d;
import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgx extends zzet implements RandomAccess, zzix {
    private static final zzgx zza = new zzgx(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzgx() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i8 < 0 || i8 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        float[] fArr = this.zzb;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i10 - i8);
        } else {
            float[] fArr2 = new float[j1.a(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.zzb, i8, fArr2, i8 + 1, this.zzc - i8);
            this.zzb = fArr2;
        }
        this.zzb[i8] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhn.zzd;
        collection.getClass();
        if (!(collection instanceof zzgx)) {
            return super.addAll(collection);
        }
        zzgx zzgx = (zzgx) collection;
        int i8 = zzgx.zzc;
        if (i8 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (Integer.MAX_VALUE - i10 >= i8) {
            int i11 = i10 + i8;
            float[] fArr = this.zzb;
            if (i11 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(zzgx.zzb, 0, this.zzb, this.zzc, zzgx.zzc);
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
        if (!(obj instanceof zzgx)) {
            return super.equals(obj);
        }
        zzgx zzgx = (zzgx) obj;
        if (this.zzc != zzgx.zzc) {
            return false;
        }
        float[] fArr = zzgx.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (Float.floatToIntBits(this.zzb[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i8) {
        zzg(i8);
        return Float.valueOf(this.zzb[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.zzc;
        for (int i10 = 0; i10 < i8; i10++) {
            if (this.zzb[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzg(i8);
        float[] fArr = this.zzb;
        float f10 = fArr[i8];
        int i10 = this.zzc;
        if (i8 < i10 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i10 - i8) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i8, int i10) {
        zza();
        if (i10 >= i8) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i10, fArr, i8, this.zzc - i10);
            this.zzc -= i10 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i8);
        float[] fArr = this.zzb;
        float f10 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzgx(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f10) {
        zza();
        int i8 = this.zzc;
        float[] fArr = this.zzb;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[j1.a(i8, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr3[i10] = f10;
    }

    private zzgx(float[] fArr, int i8, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i8;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
