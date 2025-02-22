package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class a6 extends AbstractList implements l7 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5147a;

    public a6(boolean z10) {
        this.f5147a = z10;
    }

    public final void a() {
        if (!this.f5147a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    public boolean addAll(int i8, Collection collection) {
        a();
        return super.addAll(i8, collection);
    }

    public void clear() {
        a();
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

    public abstract Object remove(int i8);

    public final boolean remove(Object obj) {
        a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }

    public final void zzb() {
        if (this.f5147a) {
            this.f5147a = false;
        }
    }

    public final boolean zzc() {
        return this.f5147a;
    }

    public boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }
}
