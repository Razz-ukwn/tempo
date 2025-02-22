package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzet extends AbstractList implements zzhm {
    private boolean zza;

    public zzet(boolean z10) {
        this.zza = z10;
    }

    public void add(int i8, Object obj) {
        zza();
        super.add(i8, obj);
    }

    public boolean addAll(int i8, Collection collection) {
        zza();
        return super.addAll(i8, collection);
    }

    public void clear() {
        zza();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!get(i8).equals(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i8 = (i8 * 31) + get(i10).hashCode();
        }
        return i8;
    }

    public Object remove(int i8) {
        zza();
        return super.remove(i8);
    }

    public final boolean removeAll(Collection collection) {
        zza();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zza();
        return super.retainAll(collection);
    }

    public Object set(int i8, Object obj) {
        zza();
        return super.set(i8, obj);
    }

    public final void zza() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public boolean add(Object obj) {
        zza();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zza();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zza();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
