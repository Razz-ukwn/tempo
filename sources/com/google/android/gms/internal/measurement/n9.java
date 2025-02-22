package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class n9 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f5418a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f5419b = Memory.class;

    /* renamed from: c  reason: collision with root package name */
    public static final m9 f5420c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5421d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f5422e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f5423f = ((long) w(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f5424g;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = k()
            f5418a = r1
            int r2 = com.google.android.gms.internal.measurement.b6.f5164a
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            f5419b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = u(r2)
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = u(r4)
            if (r1 != 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            if (r3 == 0) goto L_0x0025
            com.google.android.gms.internal.measurement.l9 r3 = new com.google.android.gms.internal.measurement.l9
            r3.<init>(r1)
            goto L_0x002e
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.k9 r3 = new com.google.android.gms.internal.measurement.k9
            r3.<init>(r1)
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            f5420c = r3
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r4 = java.lang.reflect.Field.class
            java.lang.String r5 = "objectFieldOffset"
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r3 != 0) goto L_0x003e
            goto L_0x0061
        L_0x003e:
            sun.misc.Unsafe r3 = r3.f5401a
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x005d }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x005d }
            r10[r9] = r4     // Catch:{ all -> 0x005d }
            r3.getMethod(r5, r10)     // Catch:{ all -> 0x005d }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x005d }
            r10[r9] = r7     // Catch:{ all -> 0x005d }
            r10[r8] = r2     // Catch:{ all -> 0x005d }
            r3.getMethod(r1, r10)     // Catch:{ all -> 0x005d }
            java.lang.reflect.Field r2 = b()     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            r2 = r8
            goto L_0x0062
        L_0x005d:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.n9.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
        L_0x0061:
            r2 = r9
        L_0x0062:
            f5421d = r2
            com.google.android.gms.internal.measurement.m9 r2 = f5420c
            if (r2 != 0) goto L_0x0069
            goto L_0x00d9
        L_0x0069:
            sun.misc.Unsafe r2 = r2.f5401a
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00d5 }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d5 }
            r3[r9] = r4     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r5, r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d5 }
            r4[r9] = r0     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d5 }
            r4[r9] = r0     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "getInt"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d5 }
            r3[r9] = r7     // Catch:{ all -> 0x00d5 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d5 }
            r3[r8] = r4     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "putInt"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d5 }
            r5[r9] = r7     // Catch:{ all -> 0x00d5 }
            r5[r8] = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d5 }
            r5[r6] = r10     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r0, r5)     // Catch:{ all -> 0x00d5 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d5 }
            r0[r9] = r7     // Catch:{ all -> 0x00d5 }
            r0[r8] = r4     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "putLong"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d5 }
            r1[r9] = r7     // Catch:{ all -> 0x00d5 }
            r1[r8] = r4     // Catch:{ all -> 0x00d5 }
            r1[r6] = r4     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d5 }
            r1[r9] = r7     // Catch:{ all -> 0x00d5 }
            r1[r8] = r4     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "putObject"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d5 }
            r1[r9] = r7     // Catch:{ all -> 0x00d5 }
            r1[r8] = r4     // Catch:{ all -> 0x00d5 }
            r1[r6] = r7     // Catch:{ all -> 0x00d5 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d5 }
            r0 = r8
            goto L_0x00da
        L_0x00d5:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.n9.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x00d9:
            r0 = r9
        L_0x00da:
            f5422e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = w(r0)
            long r0 = (long) r0
            f5423f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            w(r0)
            a(r0)
            java.lang.Class<int[]> r0 = int[].class
            w(r0)
            a(r0)
            java.lang.Class<long[]> r0 = long[].class
            w(r0)
            a(r0)
            java.lang.Class<float[]> r0 = float[].class
            w(r0)
            a(r0)
            java.lang.Class<double[]> r0 = double[].class
            w(r0)
            a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            w(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.internal.measurement.m9 r1 = f5420c
            if (r1 == 0) goto L_0x0124
            sun.misc.Unsafe r1 = r1.f5401a
            r1.objectFieldOffset(r0)
        L_0x0124:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r8 = r9
        L_0x012e:
            f5424g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n9.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f5422e) {
            f5420c.f5401a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        int i8 = b6.f5164a;
        try {
            field = cls.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j10, byte b10) {
        m9 m9Var = f5420c;
        long j11 = -4 & j10;
        int i8 = m9Var.f5401a.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m9Var.f5401a.putInt(obj, j11, ((255 & b10) << i10) | (i8 & (~(255 << i10))));
    }

    public static void d(Object obj, long j10, byte b10) {
        m9 m9Var = f5420c;
        long j11 = -4 & j10;
        int i8 = (((int) j10) & 3) << 3;
        m9Var.f5401a.putInt(obj, j11, ((255 & b10) << i8) | (m9Var.f5401a.getInt(obj, j11) & (~(255 << i8))));
    }

    public static double e(Object obj, long j10) {
        return f5420c.a(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f5420c.b(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f5420c.f5401a.getInt(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f5420c.f5401a.getLong(obj, j10);
    }

    public static Object i(Class cls) {
        try {
            return f5418a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f5420c.f5401a.getObject(obj, j10);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j9());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j10, boolean z10) {
        f5420c.c(obj, j10, z10);
    }

    public static void n(Object obj, long j10, double d10) {
        f5420c.e(obj, j10, d10);
    }

    public static void o(Object obj, long j10, float f10) {
        f5420c.f(obj, j10, f10);
    }

    public static void p(Object obj, long j10, int i8) {
        f5420c.f5401a.putInt(obj, j10, i8);
    }

    public static void q(Object obj, long j10, long j11) {
        f5420c.f5401a.putLong(obj, j10, j11);
    }

    public static void r(Object obj, long j10, Object obj2) {
        f5420c.f5401a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj, long j10) {
        return ((byte) ((f5420c.f5401a.getInt(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj, long j10) {
        return ((byte) ((f5420c.f5401a.getInt(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean u(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i8 = b6.f5164a;
        try {
            Class cls3 = f5419b;
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

    public static boolean v(Object obj, long j10) {
        return f5420c.g(obj, j10);
    }

    public static int w(Class cls) {
        if (f5422e) {
            return f5420c.f5401a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
