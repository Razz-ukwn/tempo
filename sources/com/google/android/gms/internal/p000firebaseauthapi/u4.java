package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u4  reason: invalid package */
public final class u4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f4977a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f4978b = Memory.class;

    /* renamed from: c  reason: collision with root package name */
    public static final t4 f4979c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4980d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f4981e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f4982f = ((long) x(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f4983g;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = k()
            f4977a = r1
            int r2 = com.google.android.gms.internal.p000firebaseauthapi.g1.f4563a
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            f4978b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = v(r2)
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = v(r4)
            if (r1 != 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            if (r3 == 0) goto L_0x0025
            com.google.android.gms.internal.firebase-auth-api.s4 r3 = new com.google.android.gms.internal.firebase-auth-api.s4
            r3.<init>(r1)
            goto L_0x002e
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            com.google.android.gms.internal.firebase-auth-api.r4 r3 = new com.google.android.gms.internal.firebase-auth-api.r4
            r3.<init>(r1)
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            f4979c = r3
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
            sun.misc.Unsafe r3 = r3.f4941a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.p000firebaseauthapi.u4.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
        L_0x0061:
            r2 = r9
        L_0x0062:
            f4980d = r2
            com.google.android.gms.internal.firebase-auth-api.t4 r2 = f4979c
            if (r2 != 0) goto L_0x0069
            goto L_0x00d9
        L_0x0069:
            sun.misc.Unsafe r2 = r2.f4941a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.p000firebaseauthapi.u4.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x00d9:
            r0 = r9
        L_0x00da:
            f4981e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = x(r0)
            long r0 = (long) r0
            f4982f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            x(r0)
            a(r0)
            java.lang.Class<int[]> r0 = int[].class
            x(r0)
            a(r0)
            java.lang.Class<long[]> r0 = long[].class
            x(r0)
            a(r0)
            java.lang.Class<float[]> r0 = float[].class
            x(r0)
            a(r0)
            java.lang.Class<double[]> r0 = double[].class
            x(r0)
            a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            x(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.internal.firebase-auth-api.t4 r1 = f4979c
            if (r1 == 0) goto L_0x0124
            sun.misc.Unsafe r1 = r1.f4941a
            r1.objectFieldOffset(r0)
        L_0x0124:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r8 = r9
        L_0x012e:
            f4983g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.u4.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f4981e) {
            f4979c.f4941a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        int i8 = g1.f4563a;
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
        t4 t4Var = f4979c;
        long j11 = -4 & j10;
        int i8 = t4Var.f4941a.getInt(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        t4Var.f4941a.putInt(obj, j11, ((255 & b10) << i10) | (i8 & (~(255 << i10))));
    }

    public static void d(Object obj, long j10, byte b10) {
        t4 t4Var = f4979c;
        long j11 = -4 & j10;
        int i8 = (((int) j10) & 3) << 3;
        t4Var.f4941a.putInt(obj, j11, ((255 & b10) << i8) | (t4Var.f4941a.getInt(obj, j11) & (~(255 << i8))));
    }

    public static double e(Object obj, long j10) {
        return f4979c.a(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f4979c.b(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f4979c.f4941a.getInt(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f4979c.f4941a.getLong(obj, j10);
    }

    public static Object i(Class cls) {
        try {
            return f4977a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f4979c.f4941a.getObject(obj, j10);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new q4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j10, boolean z10) {
        f4979c.c(obj, j10, z10);
    }

    public static void n(byte[] bArr, long j10, byte b10) {
        f4979c.d(bArr, f4982f + j10, b10);
    }

    public static void o(Object obj, long j10, double d10) {
        f4979c.e(obj, j10, d10);
    }

    public static void p(Object obj, long j10, float f10) {
        f4979c.f(obj, j10, f10);
    }

    public static void q(Object obj, long j10, int i8) {
        f4979c.f4941a.putInt(obj, j10, i8);
    }

    public static void r(Object obj, long j10, long j11) {
        f4979c.f4941a.putLong(obj, j10, j11);
    }

    public static void s(Object obj, long j10, Object obj2) {
        f4979c.f4941a.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj, long j10) {
        return ((byte) ((f4979c.f4941a.getInt(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj, long j10) {
        return ((byte) ((f4979c.f4941a.getInt(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static boolean v(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i8 = g1.f4563a;
        try {
            Class cls3 = f4978b;
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

    public static boolean w(Object obj, long j10) {
        return f4979c.g(obj, j10);
    }

    public static int x(Class cls) {
        if (f4981e) {
            return f4979c.f4941a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
