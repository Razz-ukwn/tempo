package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzhw extends zzet implements RandomAccess, zzhx {
    @Deprecated
    public static final zzhx zza;
    private static final zzhw zzb;
    private final List zzc;

    static {
        zzhw zzhw = new zzhw(false);
        zzb = zzhw;
        zza = zzhw;
    }

    public zzhw() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzfi ? ((zzfi) obj).zzn(zzhn.zzb) : zzhn.zzd((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        zza();
        this.zzc.add(i8, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i8, Collection collection) {
        zza();
        if (collection instanceof zzhx) {
            collection = ((zzhx) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i8, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        Object remove = this.zzc.remove(i8);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        zza();
        return zzj(this.zzc.set(i8, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzhm zzd(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.zzc);
            return new zzhw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzhx zze() {
        return zzc() ? new zzkb(this) : this;
    }

    public final Object zzf(int i8) {
        return this.zzc.get(i8);
    }

    /* renamed from: zzg */
    public final String get(int i8) {
        Object obj = this.zzc.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzfi) {
            zzfi zzfi = (zzfi) obj;
            String zzn = zzfi.zzn(zzhn.zzb);
            if (zzfi.zzj()) {
                this.zzc.set(i8, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzhn.zzd(bArr);
        if (zzkl.zze(bArr)) {
            this.zzc.set(i8, zzd);
        }
        return zzd;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzfi zzfi) {
        zza();
        this.zzc.add(zzfi);
        this.modCount++;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhw(int i8) {
        super(true);
        ArrayList arrayList = new ArrayList(i8);
        this.zzc = arrayList;
    }

    private zzhw(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzhw(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
