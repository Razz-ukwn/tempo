package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class zzdx extends zzeb implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzdx(int i8) {
        if (i8 >= 0) {
            this.zzb = new ArrayDeque(i8);
            this.zza = i8;
            return;
        }
        throw new IllegalArgumentException(zzdu.zza("maxSize (%s) must >= 0", Integer.valueOf(i8)));
    }

    public static zzdx zza(int i8) {
        return new zzdx(i8);
    }

    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzee.zza(this, collection.iterator());
        }
        clear();
        int i8 = size - this.zza;
        zzdr.zzb(i8 >= 0, "number to skip cannot be negative");
        return zzee.zza(this, new zzed(collection, i8).iterator());
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    public final Queue zzd() {
        return this.zzb;
    }
}
