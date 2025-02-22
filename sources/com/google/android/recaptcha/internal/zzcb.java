package com.google.android.recaptcha.internal;

import cb.d;
import gf.l;
import gf.m;
import gf.s;
import java.util.ArrayList;
import java.util.List;
import sf.j;

public final class zzcb implements zzca {
    public static final zzcb zza = new zzcb();

    private zzcb() {
    }

    private static final List zzc(Object obj) {
        boolean z10 = obj instanceof byte[];
        int i8 = 0;
        s sVar = s.f8978a;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            j.f(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return sVar;
            }
            if (length == 1) {
                return d.O(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i8 < length2) {
                arrayList.add(Byte.valueOf(bArr[i8]));
                i8++;
            }
            return arrayList;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            j.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                return sVar;
            }
            if (length3 == 1) {
                return d.O(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i8 < length4) {
                arrayList2.add(Short.valueOf(sArr[i8]));
                i8++;
            }
            return arrayList2;
        } else if (obj instanceof int[]) {
            return l.e0((int[]) obj);
        } else {
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                j.f(jArr, "<this>");
                int length5 = jArr.length;
                if (length5 == 0) {
                    return sVar;
                }
                if (length5 == 1) {
                    return d.O(Long.valueOf(jArr[0]));
                }
                ArrayList arrayList3 = new ArrayList(jArr.length);
                int length6 = jArr.length;
                while (i8 < length6) {
                    arrayList3.add(Long.valueOf(jArr[i8]));
                    i8++;
                }
                return arrayList3;
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                j.f(fArr, "<this>");
                int length7 = fArr.length;
                if (length7 == 0) {
                    return sVar;
                }
                if (length7 == 1) {
                    return d.O(Float.valueOf(fArr[0]));
                }
                ArrayList arrayList4 = new ArrayList(fArr.length);
                int length8 = fArr.length;
                while (i8 < length8) {
                    arrayList4.add(Float.valueOf(fArr[i8]));
                    i8++;
                }
                return arrayList4;
            } else if (!(obj instanceof double[])) {
                return null;
            } else {
                double[] dArr = (double[]) obj;
                j.f(dArr, "<this>");
                int length9 = dArr.length;
                if (length9 == 0) {
                    return sVar;
                }
                if (length9 == 1) {
                    return d.O(Double.valueOf(dArr[0]));
                }
                ArrayList arrayList5 = new ArrayList(dArr.length);
                int length10 = dArr.length;
                while (i8 < length10) {
                    arrayList5.add(Double.valueOf(dArr[i8]));
                    i8++;
                }
                return arrayList5;
            }
        }
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        if (zznlArr.length == 2) {
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzbh.zze().zza(zznlArr[1]);
                if (true != (zza3 instanceof Object)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    zzbh.zze().zzf(i8, zzb(zza2, zza3));
                    return;
                }
                throw new zzs(4, 5, (Throwable) null);
            }
            throw new zzs(4, 5, (Throwable) null);
        }
        throw new zzs(4, 3, (Throwable) null);
    }

    public final Object zzb(Object obj, Object obj2) {
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(m.n0(zzc2));
                for (Number doubleValue : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(doubleValue.doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(m.n0(zzc));
            for (Number doubleValue2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(doubleValue2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        } else if (zzc == null || zzc2 == null) {
            throw new zzs(4, 5, (Throwable) null);
        } else {
            zzbz.zzb(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i8 = 0; i8 < size; i8++) {
                dArr[i8] = Double.valueOf(Math.pow(((Number) zzc.get(i8)).doubleValue(), ((Number) zzc2.get(i8)).doubleValue()));
            }
            return dArr;
        }
    }
}
