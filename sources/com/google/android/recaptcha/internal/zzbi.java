package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import gf.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzbi {
    private final Map zza;
    private final Set zzb = new LinkedHashSet();
    private final Map zzc;

    public zzbi() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zza = linkedHashMap;
        this.zzc = linkedHashMap;
    }

    private final List zzi(List list) {
        ArrayList arrayList = new ArrayList(m.n0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zznl) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zznl zznl) {
        int zzN = zznl.zzN();
        int i8 = zzN - 1;
        if (zzN != 0) {
            switch (i8) {
                case 0:
                    return this.zza.get(Integer.valueOf(zznl.zzi()));
                case 1:
                    return Boolean.valueOf(zznl.zzL());
                case 2:
                    byte[] zzo = zznl.zzH().zzo();
                    if (zzo.length == 1) {
                        return Byte.valueOf(zzo[0]);
                    }
                    throw new zzs(4, 6, (Throwable) null);
                case 3:
                    String zzJ = zznl.zzJ();
                    if (zzJ.length() == 1) {
                        return Character.valueOf(zzJ.charAt(0));
                    }
                    throw new zzs(4, 6, (Throwable) null);
                case 4:
                    int zzj = zznl.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    throw new zzs(4, 6, (Throwable) null);
                case 5:
                    return Integer.valueOf(zznl.zzk());
                case 6:
                case 8:
                    throw new zzs(4, 6, (Throwable) null);
                case 7:
                    return Long.valueOf(zznl.zzG());
                case 9:
                    return Float.valueOf(zznl.zzg());
                case 10:
                    return Double.valueOf(zznl.zzf());
                case ModuleDescriptor.MODULE_VERSION:
                    return zznl.zzK();
                case 12:
                    return null;
                default:
                    throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw null;
        }
    }

    public final Object zzb(int i8) {
        return this.zza.remove(Integer.valueOf(i8));
    }

    public final Map zzc() {
        return this.zzc;
    }

    public final void zzd() {
        this.zza.clear();
    }

    public final void zze(int i8, Object obj) {
        zzf(173, obj);
        this.zzb.add(173);
    }

    public final void zzf(int i8, Object obj) {
        this.zza.put(Integer.valueOf(i8), obj);
    }

    public final Class[] zzg(List list) {
        List<Object> zzi = zzi(list);
        ArrayList arrayList = new ArrayList(m.n0(zzi));
        for (Object zza2 : zzi) {
            arrayList.add(zzbg.zza(zza2));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzh(List list) {
        return zzi(list).toArray(new Object[0]);
    }
}
