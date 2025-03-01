package com.google.android.recaptcha.internal;

import d2.f1;
import gf.m;
import gf.q;
import java.util.ArrayList;
import wf.e;
import wf.f;
import zf.a;

public final class zzck implements zzca {
    public static final zzck zza = new zzck();

    private zzck() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i8 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f17962b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i8 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i8] % ((Number) obj2).intValue())));
                    i8++;
                }
                return new String(q.L0(arrayList), a.f17962b);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i8 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i8] % ((Number) obj2).intValue()));
                    i8++;
                }
                return q.N0(arrayList2);
            }
        }
        if (z10 && (obj2 instanceof byte[])) {
            ArrayList arrayList3 = new ArrayList(r0);
            for (byte intValue : (byte[]) obj2) {
                arrayList3.add(Integer.valueOf(intValue % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        } else if (z11 && (obj2 instanceof short[])) {
            ArrayList arrayList4 = new ArrayList(r0);
            for (short intValue2 : (short[]) obj2) {
                arrayList4.add(Integer.valueOf(intValue2 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        } else if (z12 && (obj2 instanceof int[])) {
            ArrayList arrayList5 = new ArrayList(r0);
            for (int intValue3 : (int[]) obj2) {
                arrayList5.add(Integer.valueOf(intValue3 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        } else if (z13 && (obj2 instanceof long[])) {
            ArrayList arrayList6 = new ArrayList(r0);
            for (long longValue : (long[]) obj2) {
                arrayList6.add(Long.valueOf(longValue % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        } else if (z14 && (obj2 instanceof float[])) {
            ArrayList arrayList7 = new ArrayList(r0);
            for (float floatValue : (float[]) obj2) {
                arrayList7.add(Float.valueOf(floatValue % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        } else if (!z15 || !(obj2 instanceof double[])) {
            boolean z16 = obj instanceof byte[];
            if (!z16 || !(obj2 instanceof Byte)) {
                boolean z17 = obj instanceof short[];
                if (!z17 || !(obj2 instanceof Short)) {
                    boolean z18 = obj instanceof int[];
                    if (!z18 || !(obj2 instanceof Integer)) {
                        boolean z19 = obj instanceof long[];
                        if (!z19 || !(obj2 instanceof Long)) {
                            boolean z20 = obj instanceof float[];
                            if (!z20 || !(obj2 instanceof Float)) {
                                boolean z21 = obj instanceof double[];
                                if (z21 && (obj2 instanceof Double)) {
                                    ArrayList arrayList8 = new ArrayList(r0);
                                    for (double doubleValue : (double[]) obj) {
                                        arrayList8.add(Double.valueOf(doubleValue % ((Number) obj2).doubleValue()));
                                    }
                                    return arrayList8.toArray(new Double[0]);
                                } else if (z16 && (obj2 instanceof byte[])) {
                                    byte[] bArr = (byte[]) obj;
                                    int length3 = bArr.length;
                                    byte[] bArr2 = (byte[]) obj2;
                                    zzbz.zzb(this, length3, bArr2.length);
                                    f P = f1.P(0, length3);
                                    ArrayList arrayList9 = new ArrayList(m.n0(P));
                                    e d10 = P.iterator();
                                    while (d10.f16719c) {
                                        int nextInt = d10.nextInt();
                                        arrayList9.add(Integer.valueOf(bArr[nextInt] % bArr2[nextInt]));
                                    }
                                    return arrayList9.toArray(new Integer[0]);
                                } else if (z17 && (obj2 instanceof short[])) {
                                    short[] sArr = (short[]) obj;
                                    int length4 = sArr.length;
                                    short[] sArr2 = (short[]) obj2;
                                    zzbz.zzb(this, length4, sArr2.length);
                                    f P2 = f1.P(0, length4);
                                    ArrayList arrayList10 = new ArrayList(m.n0(P2));
                                    e d11 = P2.iterator();
                                    while (d11.f16719c) {
                                        int nextInt2 = d11.nextInt();
                                        arrayList10.add(Integer.valueOf(sArr[nextInt2] % sArr2[nextInt2]));
                                    }
                                    return arrayList10.toArray(new Integer[0]);
                                } else if (z18 && (obj2 instanceof int[])) {
                                    int[] iArr = (int[]) obj;
                                    int length5 = iArr.length;
                                    int[] iArr2 = (int[]) obj2;
                                    zzbz.zzb(this, length5, iArr2.length);
                                    f P3 = f1.P(0, length5);
                                    ArrayList arrayList11 = new ArrayList(m.n0(P3));
                                    e d12 = P3.iterator();
                                    while (d12.f16719c) {
                                        int nextInt3 = d12.nextInt();
                                        arrayList11.add(Integer.valueOf(iArr[nextInt3] % iArr2[nextInt3]));
                                    }
                                    return arrayList11.toArray(new Integer[0]);
                                } else if (z19 && (obj2 instanceof long[])) {
                                    long[] jArr = (long[]) obj;
                                    int length6 = jArr.length;
                                    long[] jArr2 = (long[]) obj2;
                                    zzbz.zzb(this, length6, jArr2.length);
                                    f P4 = f1.P(0, length6);
                                    ArrayList arrayList12 = new ArrayList(m.n0(P4));
                                    e d13 = P4.iterator();
                                    while (d13.f16719c) {
                                        int nextInt4 = d13.nextInt();
                                        arrayList12.add(Long.valueOf(jArr[nextInt4] % jArr2[nextInt4]));
                                    }
                                    return arrayList12.toArray(new Long[0]);
                                } else if (z20 && (obj2 instanceof float[])) {
                                    float[] fArr = (float[]) obj;
                                    int length7 = fArr.length;
                                    float[] fArr2 = (float[]) obj2;
                                    zzbz.zzb(this, length7, fArr2.length);
                                    f P5 = f1.P(0, length7);
                                    ArrayList arrayList13 = new ArrayList(m.n0(P5));
                                    e d14 = P5.iterator();
                                    while (d14.f16719c) {
                                        int nextInt5 = d14.nextInt();
                                        arrayList13.add(Float.valueOf(fArr[nextInt5] % fArr2[nextInt5]));
                                    }
                                    return arrayList13.toArray(new Float[0]);
                                } else if (!z21 || !(obj2 instanceof double[])) {
                                    throw new zzs(4, 5, (Throwable) null);
                                } else {
                                    double[] dArr = (double[]) obj;
                                    int length8 = dArr.length;
                                    double[] dArr2 = (double[]) obj2;
                                    zzbz.zzb(this, length8, dArr2.length);
                                    f P6 = f1.P(0, length8);
                                    ArrayList arrayList14 = new ArrayList(m.n0(P6));
                                    e d15 = P6.iterator();
                                    while (d15.f16719c) {
                                        int nextInt6 = d15.nextInt();
                                        arrayList14.add(Double.valueOf(dArr[nextInt6] % dArr2[nextInt6]));
                                    }
                                    return arrayList14.toArray(new Double[0]);
                                }
                            } else {
                                ArrayList arrayList15 = new ArrayList(r0);
                                for (float floatValue2 : (float[]) obj) {
                                    arrayList15.add(Float.valueOf(floatValue2 % ((Number) obj2).floatValue()));
                                }
                                return arrayList15.toArray(new Float[0]);
                            }
                        } else {
                            ArrayList arrayList16 = new ArrayList(r0);
                            for (long longValue2 : (long[]) obj) {
                                arrayList16.add(Long.valueOf(longValue2 % ((Number) obj2).longValue()));
                            }
                            return arrayList16.toArray(new Long[0]);
                        }
                    } else {
                        int[] iArr3 = (int[]) obj;
                        int length9 = iArr3.length;
                        ArrayList arrayList17 = new ArrayList(length9);
                        while (i8 < length9) {
                            arrayList17.add(Integer.valueOf(iArr3[i8] % ((Number) obj2).intValue()));
                            i8++;
                        }
                        return q.N0(arrayList17);
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList(r0);
                    for (short intValue4 : (short[]) obj) {
                        arrayList18.add(Integer.valueOf(intValue4 % ((Number) obj2).intValue()));
                    }
                    return arrayList18.toArray(new Integer[0]);
                }
            } else {
                ArrayList arrayList19 = new ArrayList(r0);
                for (byte intValue5 : (byte[]) obj) {
                    arrayList19.add(Integer.valueOf(intValue5 % ((Number) obj2).intValue()));
                }
                return arrayList19.toArray(new Integer[0]);
            }
        } else {
            ArrayList arrayList20 = new ArrayList(r0);
            for (double doubleValue2 : (double[]) obj2) {
                arrayList20.add(Double.valueOf(doubleValue2 % ((Number) obj).doubleValue()));
            }
            return arrayList20.toArray(new Double[0]);
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
                    try {
                        zzbh.zze().zzf(i8, zzb(zza2, zza3));
                    } catch (ArithmeticException e10) {
                        throw new zzs(4, 6, e10);
                    }
                } else {
                    throw new zzs(4, 5, (Throwable) null);
                }
            } else {
                throw new zzs(4, 5, (Throwable) null);
            }
        } else {
            throw new zzs(4, 3, (Throwable) null);
        }
    }
}
