package com.google.android.recaptcha.internal;

import gf.l;
import gf.q;
import java.util.Collection;
import sf.j;
import zf.a;

public final class zzbs implements zzca {
    public static final zzbs zza = new zzbs();

    private zzbs() {
    }

    public final void zza(int i8, zzbh zzbh, zznl... zznlArr) {
        String str;
        String str2;
        if (zznlArr.length == 1) {
            int i10 = 0;
            Object zza2 = zzbh.zze().zza(zznlArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[");
                    int length = iArr.length;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = iArr[i10];
                        i11++;
                        if (i11 > 1) {
                            sb2.append(",");
                        }
                        sb2.append(String.valueOf(i12));
                        i10++;
                    }
                    sb2.append("]");
                    str = sb2.toString();
                    j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                } else {
                    if (zza2 instanceof byte[]) {
                        str2 = new String((byte[]) zza2, a.f17962b);
                    } else if (zza2 instanceof long[]) {
                        long[] jArr = (long[]) zza2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("[");
                        int length2 = jArr.length;
                        int i13 = 0;
                        while (i10 < length2) {
                            long j10 = jArr[i10];
                            i13++;
                            if (i13 > 1) {
                                sb3.append(",");
                            }
                            sb3.append(String.valueOf(j10));
                            i10++;
                        }
                        sb3.append("]");
                        str = sb3.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof short[]) {
                        short[] sArr = (short[]) zza2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("[");
                        int length3 = sArr.length;
                        int i14 = 0;
                        while (i10 < length3) {
                            short s10 = sArr[i10];
                            i14++;
                            if (i14 > 1) {
                                sb4.append(",");
                            }
                            sb4.append(String.valueOf(s10));
                            i10++;
                        }
                        sb4.append("]");
                        str = sb4.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof float[]) {
                        float[] fArr = (float[]) zza2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("[");
                        int length4 = fArr.length;
                        int i15 = 0;
                        while (i10 < length4) {
                            float f10 = fArr[i10];
                            i15++;
                            if (i15 > 1) {
                                sb5.append(",");
                            }
                            sb5.append(String.valueOf(f10));
                            i10++;
                        }
                        sb5.append("]");
                        str = sb5.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof double[]) {
                        double[] dArr = (double[]) zza2;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("[");
                        int length5 = dArr.length;
                        int i16 = 0;
                        while (i10 < length5) {
                            double d10 = dArr[i10];
                            i16++;
                            if (i16 > 1) {
                                sb6.append(",");
                            }
                            sb6.append(String.valueOf(d10));
                            i10++;
                        }
                        sb6.append("]");
                        str = sb6.toString();
                        j.e(str, "joinTo(StringBuilder(), …ed, transform).toString()");
                    } else if (zza2 instanceof char[]) {
                        str2 = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        str = l.c0((Object[]) zza2, ",", "[", "]", 56);
                    } else if (zza2 instanceof Collection) {
                        str = q.A0((Iterable) zza2, ",", "[", "]", (rf.l) null, 56);
                    } else {
                        throw new zzs(4, 5, (Throwable) null);
                    }
                    str = str2;
                }
                zzbh.zze().zzf(i8, str);
                return;
            }
            throw new zzs(4, 5, (Throwable) null);
        }
        throw new zzs(4, 3, (Throwable) null);
    }
}
