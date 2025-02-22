package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzje {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzjw zzc;
    private static final zzjw zzd = new zzjy();

    static {
        Class<?> cls;
        Class<?> cls2;
        zzjw zzjw = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzjw = (zzjw) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzjw;
    }

    public static Object zzA(Object obj, int i8, List list, zzhj zzhj, Object obj2, zzjw zzjw) {
        if (zzhj == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                if (zzhj.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    obj2 = zzB(obj, i8, intValue, obj2, zzjw);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzhj.zza(intValue2)) {
                    obj2 = zzB(obj, i8, intValue2, obj2, zzjw);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzB(Object obj, int i8, int i10, Object obj2, zzjw zzjw) {
        if (obj2 == null) {
            obj2 = zzjw.zzc(obj);
        }
        zzjw.zzl(obj2, i8, (long) i10);
        return obj2;
    }

    public static void zzC(zzgr zzgr, Object obj, Object obj2) {
        zzgv zzb2 = zzgr.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzgr.zzc(obj).zzh(zzb2);
        }
    }

    public static void zzD(zzjw zzjw, Object obj, Object obj2) {
        zzjw.zzo(obj, zzjw.zze(zzjw.zzd(obj), zzjw.zzd(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzhf.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzF(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzc(i8, list, z10);
        }
    }

    public static void zzG(int i8, List list, zzko zzko) {
        if (list != null && !list.isEmpty()) {
            zzko.zze(i8, list);
        }
    }

    public static void zzH(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzg(i8, list, z10);
        }
    }

    public static void zzI(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzj(i8, list, z10);
        }
    }

    public static void zzJ(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzl(i8, list, z10);
        }
    }

    public static void zzK(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzn(i8, list, z10);
        }
    }

    public static void zzL(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzp(i8, list, z10);
        }
    }

    public static void zzM(int i8, List list, zzko zzko, zzjc zzjc) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((zzfu) zzko).zzq(i8, list.get(i10), zzjc);
            }
        }
    }

    public static void zzN(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzs(i8, list, z10);
        }
    }

    public static void zzO(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzu(i8, list, z10);
        }
    }

    public static void zzP(int i8, List list, zzko zzko, zzjc zzjc) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((zzfu) zzko).zzv(i8, list.get(i10), zzjc);
            }
        }
    }

    public static void zzQ(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzy(i8, list, z10);
        }
    }

    public static void zzR(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzA(i8, list, z10);
        }
    }

    public static void zzS(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzC(i8, list, z10);
        }
    }

    public static void zzT(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzE(i8, list, z10);
        }
    }

    public static void zzU(int i8, List list, zzko zzko) {
        if (list != null && !list.isEmpty()) {
            zzko.zzH(i8, list);
        }
    }

    public static void zzV(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzJ(i8, list, z10);
        }
    }

    public static void zzW(int i8, List list, zzko zzko, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzko.zzL(i8, list, z10);
        }
    }

    public static boolean zzX(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static int zza(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) + 1) * size;
    }

    public static int zzb(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzft.zzy(i8 << 3) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int zzd2 = ((zzfi) list.get(i10)).zzd();
            zzy += zzft.zzy(zzd2) + zzd2;
        }
        return zzy;
    }

    public static int zzc(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            i8 = 0;
            while (i10 < size) {
                i8 += zzft.zzu(zzhg.zze(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + zzft.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int zze(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i8, List list, zzjc zzjc) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += zzft.zzt(i8, (zzip) list.get(i11), zzjc);
        }
        return i10;
    }

    public static int zzj(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            i8 = 0;
            while (i10 < size) {
                i8 += zzft.zzu(zzhg.zze(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + zzft.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int zzl(int i8, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            i8 = 0;
            while (i10 < size) {
                i8 += zzft.zzz(zzie.zze(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + zzft.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i8;
    }

    public static int zzn(int i8, Object obj, zzjc zzjc) {
        if (obj instanceof zzhv) {
            int i10 = zzft.zzb;
            int zza2 = ((zzhv) obj).zza();
            return zzft.zzy(i8 << 3) + zzft.zzy(zza2) + zza2;
        }
        return zzft.zzy(i8 << 3) + zzft.zzw((zzip) obj, zzjc);
    }

    public static int zzo(int i8, List list, zzjc zzjc) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzft.zzy(i8 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzhv) {
                int zza2 = ((zzhv) obj).zza();
                zzy = zzft.zzy(zza2) + zza2 + zzy;
            } else {
                zzy = zzft.zzw((zzip) obj, zzjc) + zzy;
            }
        }
        return zzy;
    }

    public static int zzp(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            i8 = 0;
            while (i10 < size) {
                int zze = zzhg.zze(i10);
                i8 += zzft.zzy((zze >> 31) ^ (zze + zze));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 = i8 + zzft.zzy((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i8;
    }

    public static int zzr(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            i8 = 0;
            while (i10 < size) {
                long zze = zzie.zze(i10);
                i8 += zzft.zzz((zze >> 63) ^ (zze + zze));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 = i8 + zzft.zzz((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i8;
    }

    public static int zzt(int i8, List list) {
        int zzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzhx;
        int zzy = zzft.zzy(i8 << 3) * size;
        if (z10) {
            zzhx zzhx = (zzhx) list;
            while (i10 < size) {
                Object zzf = zzhx.zzf(i10);
                if (zzf instanceof zzfi) {
                    int zzd2 = ((zzfi) zzf).zzd();
                    zzy = zzft.zzy(zzd2) + zzd2 + zzy;
                } else {
                    zzy = zzft.zzx((String) zzf) + zzy;
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzfi) {
                    int zzd3 = ((zzfi) obj).zzd();
                    zzx = zzft.zzy(zzd3) + zzd3 + zzy;
                } else {
                    zzx = zzft.zzx((String) obj) + zzy;
                }
                i10++;
            }
        }
        return zzy;
    }

    public static int zzu(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhg) {
            zzhg zzhg = (zzhg) list;
            i8 = 0;
            while (i10 < size) {
                i8 += zzft.zzy(zzhg.zze(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + zzft.zzy(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i8;
    }

    public static int zzw(int i8, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzft.zzy(i8 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i8;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzie) {
            zzie zzie = (zzie) list;
            i8 = 0;
            while (i10 < size) {
                i8 += zzft.zzz(zzie.zze(i10));
                i10++;
            }
        } else {
            int i11 = 0;
            while (i10 < size) {
                i11 = i8 + zzft.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i8;
    }

    public static zzjw zzy() {
        return zzc;
    }

    public static zzjw zzz() {
        return zzd;
    }
}
