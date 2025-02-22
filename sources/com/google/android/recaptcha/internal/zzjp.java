package com.google.android.recaptcha.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzjp extends AbstractMap {
    private final int zza;
    /* access modifiers changed from: private */
    public List zzb = Collections.emptyList();
    /* access modifiers changed from: private */
    public Map zzc = Collections.emptyMap();
    private boolean zzd;
    private volatile zzjn zze;
    private Map zzf = Collections.emptyMap();

    public /* synthetic */ zzjp(int i8, zzjo zzjo) {
        this.zza = i8;
    }

    private final int zzk(Comparable comparable) {
        int size = this.zzb.size() - 1;
        int i8 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzjj) this.zzb.get(size)).zza());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i8 <= size) {
            int i10 = (i8 + size) / 2;
            int compareTo2 = comparable.compareTo(((zzjj) this.zzb.get(i10)).zza());
            if (compareTo2 < 0) {
                size = i10 - 1;
            } else if (compareTo2 <= 0) {
                return i10;
            } else {
                i8 = i10 + 1;
            }
        }
        return -(i8 + 1);
    }

    /* access modifiers changed from: private */
    public final Object zzl(int i8) {
        zzn();
        Object value = ((zzjj) this.zzb.remove(i8)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzjj(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzjn(this, (zzjm) null);
        }
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjp)) {
            return super.equals(obj);
        }
        zzjp zzjp = (zzjp) obj;
        int size = size();
        if (size != zzjp.size()) {
            return false;
        }
        int zzb2 = zzb();
        if (zzb2 != zzjp.zzb()) {
            return entrySet().equals(zzjp.entrySet());
        }
        for (int i8 = 0; i8 < zzb2; i8++) {
            if (!zzg(i8).equals(zzjp.zzg(i8))) {
                return false;
            }
        }
        if (zzb2 != size) {
            return this.zzc.equals(zzjp.zzc);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? ((zzjj) this.zzb.get(zzk)).getValue() : this.zzc.get(comparable);
    }

    public final int hashCode() {
        int zzb2 = zzb();
        int i8 = 0;
        for (int i10 = 0; i10 < zzb2; i10++) {
            i8 += ((zzjj) this.zzb.get(i10)).hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i8 : i8;
    }

    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public final int size() {
        return this.zzc.size() + this.zzb.size();
    }

    public void zza() {
        if (!this.zzd) {
            this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
            this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
            this.zzd = true;
        }
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        return this.zzc.isEmpty() ? zzji.zza() : this.zzc.entrySet();
    }

    /* renamed from: zze */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzjj) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i8 = -(zzk + 1);
        if (i8 >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i10 = this.zza;
        if (size == i10) {
            zzjj zzjj = (zzjj) this.zzb.remove(i10 - 1);
            zzm().put(zzjj.zza(), zzjj.getValue());
        }
        this.zzb.add(i8, new zzjj(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i8) {
        return (Map.Entry) this.zzb.get(i8);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
