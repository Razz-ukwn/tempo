package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzkg {
    static final long zza = ((long) zzz(byte[].class));
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd = Memory.class;
    private static final boolean zze;
    private static final zzkf zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0130  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = zzg()
            zzc = r1
            int r2 = com.google.android.recaptcha.internal.zzeu.zza
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            zzd = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = zzv(r2)
            zze = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = zzv(r4)
            r5 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            if (r3 == 0) goto L_0x0028
            com.google.android.recaptcha.internal.zzke r5 = new com.google.android.recaptcha.internal.zzke
            r5.<init>(r1)
            goto L_0x002f
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            com.google.android.recaptcha.internal.zzkd r5 = new com.google.android.recaptcha.internal.zzkd
            r5.<init>(r1)
        L_0x002f:
            zzf = r5
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r4 = "objectFieldOffset"
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r2 = r9
            goto L_0x0064
        L_0x0040:
            sun.misc.Unsafe r5 = r5.zza
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x005f }
            r10[r9] = r3     // Catch:{ all -> 0x005f }
            r5.getMethod(r4, r10)     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x005f }
            r10[r9] = r7     // Catch:{ all -> 0x005f }
            r10[r8] = r2     // Catch:{ all -> 0x005f }
            r5.getMethod(r1, r10)     // Catch:{ all -> 0x005f }
            java.lang.reflect.Field r2 = zzB()     // Catch:{ all -> 0x005f }
            if (r2 != 0) goto L_0x005d
            goto L_0x003e
        L_0x005d:
            r2 = r8
            goto L_0x0064
        L_0x005f:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzkg.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
            goto L_0x003e
        L_0x0064:
            zzg = r2
            com.google.android.recaptcha.internal.zzkf r2 = zzf
            if (r2 != 0) goto L_0x006c
        L_0x006a:
            r0 = r9
            goto L_0x00dd
        L_0x006c:
            sun.misc.Unsafe r2 = r2.zza
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r3     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r4, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r0     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r0     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "getInt"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r3[r9] = r7     // Catch:{ all -> 0x00d8 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d8 }
            r3[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putInt"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r7     // Catch:{ all -> 0x00d8 }
            r5[r8] = r4     // Catch:{ all -> 0x00d8 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d8 }
            r5[r6] = r10     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r0[r9] = r7     // Catch:{ all -> 0x00d8 }
            r0[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putLong"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r1[r6] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putObject"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r1[r6] = r7     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            r0 = r8
            goto L_0x00dd
        L_0x00d8:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzkg.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x006a
        L_0x00dd:
            zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzz(r0)
            long r0 = (long) r0
            zza = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<int[]> r0 = int[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<long[]> r0 = long[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<float[]> r0 = float[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<double[]> r0 = double[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzz(r0)
            zzA(r0)
            java.lang.reflect.Field r0 = zzB()
            if (r0 == 0) goto L_0x0127
            com.google.android.recaptcha.internal.zzkf r1 = zzf
            if (r1 == 0) goto L_0x0127
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r0)
        L_0x0127:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r8 = r9
        L_0x0131:
            zzb = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkg.<clinit>():void");
    }

    private zzkg() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i8 = zzeu.zza;
        Class<Buffer> cls = Buffer.class;
        Field zzC = zzC(cls, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(cls, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        zzkf zzkf = zzf;
        long j11 = -4 & j10;
        int i8 = zzkf.zza.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zzkf.zza.putInt(obj, j11, ((255 & b10) << i10) | (i8 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        zzkf zzkf = zzf;
        long j11 = -4 & j10;
        int i8 = (((int) j10) & 3) << 3;
        zzkf.zza.putInt(obj, j11, ((255 & b10) << i8) | (zzkf.zza.getInt(obj, j11) & (~(255 << i8))));
    }

    public static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    public static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    public static int zzc(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    public static long zzd(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object zzf(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzkc());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzm(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    public static void zzn(byte[] bArr, long j10, byte b10) {
        zzf.zzd(bArr, zza + j10, b10);
    }

    public static void zzo(Object obj, long j10, double d10) {
        zzf.zze(obj, j10, d10);
    }

    public static void zzp(Object obj, long j10, float f10) {
        zzf.zzf(obj, j10, f10);
    }

    public static void zzq(Object obj, long j10, int i8) {
        zzf.zza.putInt(obj, j10, i8);
    }

    public static void zzr(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    public static void zzs(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean zzv(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i8 = zzeu.zza;
        try {
            Class cls3 = zzd;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzw(Object obj, long j10) {
        return zzf.zzg(obj, j10);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
