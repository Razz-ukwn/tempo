package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import d7.d;
import d7.f;
import d7.g;
import java.lang.reflect.Field;
import u6.o;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f4348b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f4349c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f4350d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f4351e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f4352f = false;

    /* renamed from: g  reason: collision with root package name */
    public static int f4353g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f4354h;

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal f4355i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    public static final d f4356j = new d(0);

    /* renamed from: k  reason: collision with root package name */
    public static final a f4357k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static f f4358l;
    public static g m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4359a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0070b {

            /* renamed from: a  reason: collision with root package name */
            public int f4360a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f4361b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f4362c = 0;
        }

        C0070b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        this.f4359a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (o.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ca, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01cd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d4, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01dd, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("No cached result cursor holder");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01de, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e0, code lost:
        if (r4 != 2) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e2, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r0 = r0.N(new c7.b(r5), r2, r1);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f3, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r0 = r0.L(new c7.b(r5), r2, r1);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0203, code lost:
        r0 = c7.b.P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0207, code lost:
        if (r0 == null) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0209, code lost:
        r1 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0214, code lost:
        if (r13 != 0) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0216, code lost:
        r12.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021a, code lost:
        r12.set(java.lang.Long.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0221, code lost:
        r0 = r10.f7380a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0223, code lost:
        if (r0 == null) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0225, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0228, code lost:
        r8.set(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x022b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022c, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0233, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x023c, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0245, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to create IDynamiteLoader.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0246, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x024f, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to determine which loading route to use.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0263, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0265, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0267, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        if (r15 == null) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if (r15.booleanValue() == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r2 + ", version >= " + r1);
        r3 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0 = m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ed, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        if (r0 == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r3 = (d7.e) r8.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        if (r3 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        if (r3.f7380a == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r6 = r21.getApplicationContext();
        r3 = r3.f7380a;
        new c7.b((java.lang.Object) null);
        r4 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        if (f4353g < 2) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0112, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        r5 = java.lang.Boolean.valueOf(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011d, code lost:
        if (r5.booleanValue() == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011f, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r0 = r0.M(new c7.b(r6), r2, r1, new c7.b(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0135, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r0 = r0.L(new c7.b(r6), r2, r1, new c7.b(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014a, code lost:
        r0 = (android.content.Context) c7.b.P(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0150, code lost:
        if (r0 == null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
        r1 = new com.google.android.gms.dynamite.DynamiteModule(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0160, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to get module context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016b, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("No result cursor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0173, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.a("DynamiteLoaderV2 was not cached.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0177, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r2 + ", version >= " + r1);
        r0 = h(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0194, code lost:
        if (r0 == null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0196, code lost:
        r3 = r0.a(r0.b(), 6);
        r4 = r3.readInt();
        r3.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a7, code lost:
        if (r4 < 3) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a9, code lost:
        r3 = (d7.e) r8.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01af, code lost:
        if (r3 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b3, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b5, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r0 = r0.M(new c7.b(r5), r2, r1, new c7.b(r3.f7380a));
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c5, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02c6 A[Catch:{ all -> 0x0341 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02f8 A[SYNTHETIC, Splitter:B:190:0x02f8] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r21, com.google.android.gms.dynamite.DynamiteModule.b r22, java.lang.String r23) {
        /*
            r1 = r21
            r2 = r23
            java.lang.String r0 = "Selected remote version of "
            java.lang.String r3 = "Selected remote version of "
            java.lang.String r4 = "VersionPolicy returned invalid code:"
            java.lang.String r5 = "No acceptable module "
            java.lang.String r6 = "Considering local module "
            android.content.Context r7 = r21.getApplicationContext()
            if (r7 == 0) goto L_0x0364
            java.lang.ThreadLocal r8 = f4355i
            java.lang.Object r9 = r8.get()
            d7.e r9 = (d7.e) r9
            d7.e r10 = new d7.e
            r11 = 0
            r10.<init>(r11)
            r8.set(r10)
            d7.d r12 = f4356j
            java.lang.Object r13 = r12.get()
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0341 }
            java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0341 }
            r12.set(r11)     // Catch:{ all -> 0x0341 }
            com.google.android.gms.dynamite.a r11 = f4357k     // Catch:{ all -> 0x0341 }
            r15 = r22
            com.google.android.gms.dynamite.DynamiteModule$b$b r11 = r15.a(r1, r2, r11)     // Catch:{ all -> 0x0341 }
            java.lang.String r15 = "DynamiteModule"
            r16 = r5
            int r5 = r11.f4360a     // Catch:{ all -> 0x0341 }
            r20 = r4
            int r4 = r11.f4361b     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r1.<init>(r6)     // Catch:{ all -> 0x0341 }
            r1.append(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r6 = ":"
            r1.append(r6)     // Catch:{ all -> 0x0341 }
            r1.append(r5)     // Catch:{ all -> 0x0341 }
            java.lang.String r5 = " and remote module "
            r1.append(r5)     // Catch:{ all -> 0x0341 }
            r1.append(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r5 = ":"
            r1.append(r5)     // Catch:{ all -> 0x0341 }
            r1.append(r4)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0341 }
            android.util.Log.i(r15, r1)     // Catch:{ all -> 0x0341 }
            int r1 = r11.f4362c     // Catch:{ all -> 0x0341 }
            if (r1 == 0) goto L_0x0314
            r4 = -1
            if (r1 != r4) goto L_0x0081
            int r1 = r11.f4360a     // Catch:{ all -> 0x0341 }
            if (r1 == 0) goto L_0x0314
            r1 = r4
        L_0x0081:
            r5 = 1
            if (r1 != r5) goto L_0x0088
            int r6 = r11.f4361b     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x0314
        L_0x0088:
            if (r1 != r4) goto L_0x00b6
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = "DynamiteModule"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x0341 }
            com.google.android.gms.dynamite.DynamiteModule r0 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ all -> 0x0341 }
            r0.<init>(r7)     // Catch:{ all -> 0x0341 }
            r1 = 0
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a4
            r12.remove()
            goto L_0x00ab
        L_0x00a4:
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r12.set(r1)
        L_0x00ab:
            android.database.Cursor r1 = r10.f7380a
            if (r1 == 0) goto L_0x00b2
            r1.close()
        L_0x00b2:
            r8.set(r9)
            return r0
        L_0x00b6:
            if (r1 != r5) goto L_0x0300
            int r1 = r11.f4361b     // Catch:{ a -> 0x0295 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r6 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r6)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            boolean r15 = g(r21)     // Catch:{ all -> 0x025c }
            if (r15 == 0) goto L_0x0250
            java.lang.Boolean r15 = f4350d     // Catch:{ all -> 0x025c }
            monitor-exit(r6)     // Catch:{ all -> 0x025c }
            if (r15 == 0) goto L_0x0246
            boolean r6 = r15.booleanValue()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r15 = 2
            if (r6 == 0) goto L_0x0177
            java.lang.String r3 = "DynamiteModule"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r6.<init>(r0)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r6.append(r2)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r0 = ", version >= "
            r6.append(r0)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r6.append(r1)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r0 = r6.toString()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            android.util.Log.i(r3, r0)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            d7.g r0 = m     // Catch:{ all -> 0x0174 }
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x016c
            java.lang.Object r3 = r8.get()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            d7.e r3 = (d7.e) r3     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            if (r3 == 0) goto L_0x0164
            android.database.Cursor r6 = r3.f7380a     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            if (r6 == 0) goto L_0x0164
            android.content.Context r6 = r21.getApplicationContext()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            android.database.Cursor r3 = r3.f7380a     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.b r5 = new c7.b     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4 = 0
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            int r5 = f4353g     // Catch:{ all -> 0x0161 }
            if (r5 < r15) goto L_0x0112
            r19 = 1
            goto L_0x0114
        L_0x0112:
            r19 = 0
        L_0x0114:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0161 }
            monitor-exit(r4)     // Catch:{ all -> 0x0161 }
            boolean r4 = r5.booleanValue()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            if (r4 == 0) goto L_0x0135
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r5)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.b r4 = new c7.b     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4.<init>(r6)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.b r5 = new c7.b     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.a r0 = r0.M(r4, r2, r1, r5)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            goto L_0x014a
        L_0x0135:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r5)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.b r4 = new c7.b     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4.<init>(r6)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.b r5 = new c7.b     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r5.<init>(r3)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            c7.a r0 = r0.L(r4, r2, r1, r5)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
        L_0x014a:
            java.lang.Object r0 = c7.b.P(r0)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            if (r0 == 0) goto L_0x0159
            com.google.android.gms.dynamite.DynamiteModule r1 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            goto L_0x0210
        L_0x0159:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r1 = "Failed to get module context"
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            throw r0     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
        L_0x0161:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0161 }
            throw r0     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
        L_0x0164:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r1 = "No result cursor"
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            throw r0     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
        L_0x016c:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r1 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            throw r0     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
        L_0x0174:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0174 }
            throw r0     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
        L_0x0177:
            java.lang.String r0 = "DynamiteModule"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4.append(r2)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r3 = ", version >= "
            r4.append(r3)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4.append(r1)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            java.lang.String r3 = r4.toString()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            android.util.Log.i(r0, r3)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            d7.f r0 = h(r21)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            if (r0 == 0) goto L_0x023c
            android.os.Parcel r3 = r0.b()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r4 = 6
            android.os.Parcel r3 = r0.a(r3, r4)     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            int r4 = r3.readInt()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r3.recycle()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            r3 = 3
            if (r4 < r3) goto L_0x01de
            java.lang.Object r3 = r8.get()     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            d7.e r3 = (d7.e) r3     // Catch:{ RemoteException -> 0x0238, a -> 0x0234, all -> 0x026b }
            if (r3 == 0) goto L_0x01d4
            c7.b r4 = new c7.b     // Catch:{ RemoteException -> 0x01d2, a -> 0x01d0, all -> 0x01cd }
            r5 = r21
            r4.<init>(r5)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            android.database.Cursor r3 = r3.f7380a     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            c7.b r6 = new c7.b     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            r6.<init>(r3)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            c7.a r0 = r0.M(r4, r2, r1, r6)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            goto L_0x0203
        L_0x01c4:
            r0 = move-exception
            goto L_0x026e
        L_0x01c7:
            r0 = move-exception
            goto L_0x0288
        L_0x01ca:
            r0 = move-exception
            goto L_0x028b
        L_0x01cd:
            r0 = move-exception
            goto L_0x026c
        L_0x01d0:
            r0 = move-exception
            goto L_0x0235
        L_0x01d2:
            r0 = move-exception
            goto L_0x0239
        L_0x01d4:
            r5 = r21
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "No cached result cursor holder"
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            throw r0     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
        L_0x01de:
            r5 = r21
            if (r4 != r15) goto L_0x01f3
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2"
            android.util.Log.w(r3, r4)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            c7.b r3 = new c7.b     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            c7.a r0 = r0.N(r3, r2, r1)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            goto L_0x0203
        L_0x01f3:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r3, r4)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            c7.b r3 = new c7.b     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            c7.a r0 = r0.L(r3, r2, r1)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
        L_0x0203:
            java.lang.Object r0 = c7.b.P(r0)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            if (r0 == 0) goto L_0x022c
            com.google.android.gms.dynamite.DynamiteModule r1 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
        L_0x0210:
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x021a
            r12.remove()
            goto L_0x0221
        L_0x021a:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r12.set(r0)
        L_0x0221:
            android.database.Cursor r0 = r10.f7380a
            if (r0 == 0) goto L_0x0228
            r0.close()
        L_0x0228:
            r8.set(r9)
            return r1
        L_0x022c:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "Failed to load remote module."
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            throw r0     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
        L_0x0234:
            r0 = move-exception
        L_0x0235:
            r5 = r21
            goto L_0x0288
        L_0x0238:
            r0 = move-exception
        L_0x0239:
            r5 = r21
            goto L_0x028b
        L_0x023c:
            r5 = r21
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "Failed to create IDynamiteLoader."
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            throw r0     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
        L_0x0246:
            r5 = r21
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            java.lang.String r1 = "Failed to determine which loading route to use."
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
            throw r0     // Catch:{ RemoteException -> 0x01ca, a -> 0x01c7, all -> 0x01c4 }
        L_0x0250:
            r5 = r21
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x025a }
            java.lang.String r1 = "Remote loading disabled"
            r0.<init>(r1)     // Catch:{ all -> 0x025a }
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r0 = move-exception
            goto L_0x025f
        L_0x025c:
            r0 = move-exception
            r5 = r21
        L_0x025f:
            r1 = r22
        L_0x0261:
            monitor-exit(r6)     // Catch:{ all -> 0x0269 }
            throw r0     // Catch:{ RemoteException -> 0x0267, a -> 0x0265, all -> 0x0263 }
        L_0x0263:
            r0 = move-exception
            goto L_0x0270
        L_0x0265:
            r0 = move-exception
            goto L_0x028a
        L_0x0267:
            r0 = move-exception
            goto L_0x028d
        L_0x0269:
            r0 = move-exception
            goto L_0x0261
        L_0x026b:
            r0 = move-exception
        L_0x026c:
            r5 = r21
        L_0x026e:
            r1 = r22
        L_0x0270:
            r3 = r0
            u6.q.i(r5)     // Catch:{ Exception -> 0x0275 }
            goto L_0x027e
        L_0x0275:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "CrashUtils"
            java.lang.String r6 = "Error adding exception to DropBox!"
            android.util.Log.e(r0, r6, r4)     // Catch:{ a -> 0x0286 }
        L_0x027e:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0286 }
            java.lang.String r4 = "Failed to load remote module."
            r0.<init>(r4, r3)     // Catch:{ a -> 0x0286 }
            throw r0     // Catch:{ a -> 0x0286 }
        L_0x0286:
            r0 = move-exception
            goto L_0x029a
        L_0x0288:
            r1 = r22
        L_0x028a:
            throw r0     // Catch:{ a -> 0x0286 }
        L_0x028b:
            r1 = r22
        L_0x028d:
            com.google.android.gms.dynamite.DynamiteModule$a r3 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x0286 }
            java.lang.String r4 = "Failed to load remote module."
            r3.<init>(r4, r0)     // Catch:{ a -> 0x0286 }
            throw r3     // Catch:{ a -> 0x0286 }
        L_0x0295:
            r0 = move-exception
            r5 = r21
            r1 = r22
        L_0x029a:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r6.<init>()     // Catch:{ all -> 0x0341 }
            java.lang.String r8 = "Failed to load remote module: "
            r6.append(r8)     // Catch:{ all -> 0x0341 }
            r6.append(r4)     // Catch:{ all -> 0x0341 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0341 }
            android.util.Log.w(r3, r4)     // Catch:{ all -> 0x0341 }
            int r3 = r11.f4360a     // Catch:{ all -> 0x0341 }
            if (r3 == 0) goto L_0x02f8
            com.google.android.gms.dynamite.d r4 = new com.google.android.gms.dynamite.d     // Catch:{ all -> 0x0341 }
            r4.<init>(r3)     // Catch:{ all -> 0x0341 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r1 = r1.a(r5, r2, r4)     // Catch:{ all -> 0x0341 }
            int r1 = r1.f4362c     // Catch:{ all -> 0x0341 }
            r3 = -1
            if (r1 != r3) goto L_0x02f8
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = "DynamiteModule"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x0341 }
            com.google.android.gms.dynamite.DynamiteModule r0 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ all -> 0x0341 }
            r0.<init>(r7)     // Catch:{ all -> 0x0341 }
            r1 = 0
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02e2
            d7.d r1 = f4356j
            r1.remove()
            goto L_0x02eb
        L_0x02e2:
            d7.d r1 = f4356j
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r1.set(r2)
        L_0x02eb:
            android.database.Cursor r1 = r10.f7380a
            if (r1 == 0) goto L_0x02f2
            r1.close()
        L_0x02f2:
            java.lang.ThreadLocal r1 = f4355i
            r1.set(r9)
            return r0
        L_0x02f8:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0341 }
            throw r1     // Catch:{ all -> 0x0341 }
        L_0x0300:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r3 = r20
            r2.<init>(r3)     // Catch:{ all -> 0x0341 }
            r2.append(r1)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0341 }
            r0.<init>(r1)     // Catch:{ all -> 0x0341 }
            throw r0     // Catch:{ all -> 0x0341 }
        L_0x0314:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0341 }
            int r1 = r11.f4360a     // Catch:{ all -> 0x0341 }
            int r3 = r11.f4361b     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r5 = r16
            r4.<init>(r5)     // Catch:{ all -> 0x0341 }
            r4.append(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = " found. Local version is "
            r4.append(r2)     // Catch:{ all -> 0x0341 }
            r4.append(r1)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x0341 }
            r4.append(r3)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0341 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0341 }
            r0.<init>(r1)     // Catch:{ all -> 0x0341 }
            throw r0     // Catch:{ all -> 0x0341 }
        L_0x0341:
            r0 = move-exception
            r1 = 0
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x034e
            d7.d r1 = f4356j
            r1.remove()
            goto L_0x0357
        L_0x034e:
            d7.d r1 = f4356j
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r1.set(r2)
        L_0x0357:
            android.database.Cursor r1 = r10.f7380a
            if (r1 == 0) goto L_0x035e
            r1.close()
        L_0x035e:
            java.lang.ThreadLocal r1 = f4355i
            r1.set(r9)
            throw r0
        L_0x0364:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "null application Context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0056=Splitter:B:30:0x0056, B:49:0x009a=Splitter:B:49:0x009a, B:17:0x003c=Splitter:B:17:0x003c} */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0209 }
            java.lang.Boolean r1 = f4350d     // Catch:{ all -> 0x0206 }
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x00d8
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r5 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r5 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r5 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r5)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = (java.lang.ClassLoader) r6     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r6 != r7) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0037:
            if (r6 == 0) goto L_0x0040
            f(r6)     // Catch:{ a -> 0x003c }
        L_0x003c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0040:
            boolean r6 = g(r11)     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x0049
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0206 }
            return r3
        L_0x0049:
            boolean r6 = f4352f     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x00a7
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r7 = r6.equals(r4)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0056
            goto L_0x00a7
        L_0x0056:
            int r7 = e(r11, r12, r13, r2)     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f4351e     // Catch:{ a -> 0x009d }
            if (r8 == 0) goto L_0x009a
            boolean r8 = r8.isEmpty()     // Catch:{ a -> 0x009d }
            if (r8 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r8 = d7.b.a()     // Catch:{ a -> 0x009d }
            if (r8 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009d }
            r9 = 29
            if (r8 < r9) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r8 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009d }
            java.lang.String r9 = f4351e     // Catch:{ a -> 0x009d }
            u6.q.i(r9)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r8.<init>(r9, r10)     // Catch:{ a -> 0x009d }
            goto L_0x008f
        L_0x0081:
            d7.c r8 = new d7.c     // Catch:{ a -> 0x009d }
            java.lang.String r9 = f4351e     // Catch:{ a -> 0x009d }
            u6.q.i(r9)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r8.<init>(r10, r9)     // Catch:{ a -> 0x009d }
        L_0x008f:
            f(r8)     // Catch:{ a -> 0x009d }
            r1.set(r4, r8)     // Catch:{ a -> 0x009d }
            f4350d = r6     // Catch:{ a -> 0x009d }
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0206 }
            return r7
        L_0x009a:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x0206 }
            return r7
        L_0x009d:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r4, r6)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r4, r6)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            goto L_0x00d6
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0206 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0206 }
            r6.<init>()     // Catch:{ all -> 0x0206 }
            java.lang.String r7 = "Failed to load module via V2: "
            r6.append(r7)     // Catch:{ all -> 0x0206 }
            r6.append(r1)     // Catch:{ all -> 0x0206 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0206 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0206 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0206 }
        L_0x00d6:
            f4350d = r1     // Catch:{ all -> 0x0206 }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x0206 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x0100
            int r11 = e(r11, r12, r13, r3)     // Catch:{ a -> 0x00e4 }
            return r11
        L_0x00e4:
            r12 = move-exception
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0209 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0209 }
            r0.<init>()     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x0209 }
            r0.append(r12)     // Catch:{ all -> 0x0209 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x0209 }
            android.util.Log.w(r13, r12)     // Catch:{ all -> 0x0209 }
            return r3
        L_0x0100:
            d7.f r5 = h(r11)     // Catch:{ all -> 0x0209 }
            if (r5 != 0) goto L_0x0108
            goto L_0x01fd
        L_0x0108:
            android.os.Parcel r0 = r5.b()     // Catch:{ RemoteException -> 0x018c }
            r1 = 6
            android.os.Parcel r0 = r5.a(r0, r1)     // Catch:{ RemoteException -> 0x018c }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x018c }
            r0.recycle()     // Catch:{ RemoteException -> 0x018c }
            r0 = 3
            if (r1 < r0) goto L_0x018e
            java.lang.ThreadLocal r0 = f4355i     // Catch:{ RemoteException -> 0x018c }
            java.lang.Object r1 = r0.get()     // Catch:{ RemoteException -> 0x018c }
            d7.e r1 = (d7.e) r1     // Catch:{ RemoteException -> 0x018c }
            if (r1 == 0) goto L_0x012f
            android.database.Cursor r1 = r1.f7380a     // Catch:{ RemoteException -> 0x018c }
            if (r1 == 0) goto L_0x012f
            int r3 = r1.getInt(r3)     // Catch:{ RemoteException -> 0x018c }
            goto L_0x01fd
        L_0x012f:
            c7.b r6 = new c7.b     // Catch:{ RemoteException -> 0x018c }
            r6.<init>(r11)     // Catch:{ RemoteException -> 0x018c }
            d7.d r1 = f4356j     // Catch:{ RemoteException -> 0x018c }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x018c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ RemoteException -> 0x018c }
            long r9 = r1.longValue()     // Catch:{ RemoteException -> 0x018c }
            r7 = r12
            r8 = r13
            c7.a r12 = r5.O(r6, r7, r8, r9)     // Catch:{ RemoteException -> 0x018c }
            java.lang.Object r12 = c7.b.P(r12)     // Catch:{ RemoteException -> 0x018c }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x018c }
            if (r12 == 0) goto L_0x0178
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            if (r13 != 0) goto L_0x0155
            goto L_0x0178
        L_0x0155:
            int r13 = r12.getInt(r3)     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            if (r13 <= 0) goto L_0x0171
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            d7.e r0 = (d7.e) r0     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            if (r0 == 0) goto L_0x016d
            android.database.Cursor r1 = r0.f7380a     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            if (r1 != 0) goto L_0x016d
            r0.f7380a = r12     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r13 = move-exception
            goto L_0x0200
        L_0x016d:
            r2 = r3
        L_0x016e:
            if (r2 == 0) goto L_0x0171
            goto L_0x0172
        L_0x0171:
            r4 = r12
        L_0x0172:
            if (r4 == 0) goto L_0x01db
            r4.close()     // Catch:{ all -> 0x0209 }
            goto L_0x01db
        L_0x0178:
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r13, r0)     // Catch:{ RemoteException -> 0x0186, all -> 0x016a }
            if (r12 == 0) goto L_0x01fd
            r12.close()     // Catch:{ all -> 0x0209 }
            goto L_0x01fd
        L_0x0186:
            r13 = move-exception
            r4 = r12
            goto L_0x01de
        L_0x0189:
            r12 = move-exception
            goto L_0x01fe
        L_0x018c:
            r12 = move-exception
            goto L_0x01dd
        L_0x018e:
            r2 = 2
            if (r1 != r2) goto L_0x01b7
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x018c }
            c7.b r0 = new c7.b     // Catch:{ RemoteException -> 0x018c }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x018c }
            android.os.Parcel r1 = r5.b()     // Catch:{ RemoteException -> 0x018c }
            j7.a.c(r1, r0)     // Catch:{ RemoteException -> 0x018c }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x018c }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x018c }
            r12 = 5
            android.os.Parcel r12 = r5.a(r1, r12)     // Catch:{ RemoteException -> 0x018c }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x018c }
            r12.recycle()     // Catch:{ RemoteException -> 0x018c }
            goto L_0x01db
        L_0x01b7:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r2)     // Catch:{ RemoteException -> 0x018c }
            c7.b r1 = new c7.b     // Catch:{ RemoteException -> 0x018c }
            r1.<init>(r11)     // Catch:{ RemoteException -> 0x018c }
            android.os.Parcel r2 = r5.b()     // Catch:{ RemoteException -> 0x018c }
            j7.a.c(r2, r1)     // Catch:{ RemoteException -> 0x018c }
            r2.writeString(r12)     // Catch:{ RemoteException -> 0x018c }
            r2.writeInt(r13)     // Catch:{ RemoteException -> 0x018c }
            android.os.Parcel r12 = r5.a(r2, r0)     // Catch:{ RemoteException -> 0x018c }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x018c }
            r12.recycle()     // Catch:{ RemoteException -> 0x018c }
        L_0x01db:
            r3 = r13
            goto L_0x01fd
        L_0x01dd:
            r13 = r12
        L_0x01de:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r0.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x0189 }
            r0.append(r13)     // Catch:{ all -> 0x0189 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0189 }
            android.util.Log.w(r12, r13)     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x01fd
            r4.close()     // Catch:{ all -> 0x0209 }
        L_0x01fd:
            return r3
        L_0x01fe:
            r13 = r12
            r12 = r4
        L_0x0200:
            if (r12 == 0) goto L_0x0205
            r12.close()     // Catch:{ all -> 0x0209 }
        L_0x0205:
            throw r13     // Catch:{ all -> 0x0209 }
        L_0x0206:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0206 }
            throw r12     // Catch:{ all -> 0x0209 }
        L_0x0209:
            r12 = move-exception
            u6.q.i(r11)     // Catch:{ Exception -> 0x020e }
            goto L_0x0216
        L_0x020e:
            r11 = move-exception
            java.lang.String r13 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r13, r0, r11)
        L_0x0216:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4 A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d5 A[Catch:{ all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            d7.d r1 = f4356j     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            r12.<init>()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00cd, all -> 0x00cb }
            if (r10 == 0) goto L_0x00b6
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r11 == 0) goto L_0x00b6
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r12 <= 0) goto L_0x00a0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x009d }
            f4351e = r2     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x009d }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x009d }
            f4353g = r2     // Catch:{ all -> 0x009d }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x009d }
            if (r2 < 0) goto L_0x0083
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x007f
            r2 = r9
            goto L_0x0080
        L_0x007f:
            r2 = r11
        L_0x0080:
            f4352f = r2     // Catch:{ all -> 0x009d }
            goto L_0x0084
        L_0x0083:
            r2 = r11
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x009d }
            java.lang.ThreadLocal r1 = f4355i     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            d7.e r1 = (d7.e) r1     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r1 == 0) goto L_0x0096
            android.database.Cursor r3 = r1.f7380a     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            if (r3 != 0) goto L_0x0096
            r1.f7380a = r10     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            goto L_0x0097
        L_0x0096:
            r9 = r11
        L_0x0097:
            if (r9 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r0 = r10
        L_0x009b:
            r11 = r2
            goto L_0x00a1
        L_0x009d:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009d }
            throw r11     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
        L_0x00a0:
            r0 = r10
        L_0x00a1:
            if (r13 == 0) goto L_0x00b0
            if (r11 != 0) goto L_0x00a6
            goto L_0x00b0
        L_0x00a6:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x00ae }
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch:{ Exception -> 0x00ae }
            throw r10     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r11 = move-exception
            goto L_0x00cf
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r0.close()
        L_0x00b5:
            return r12
        L_0x00b6:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
            throw r11     // Catch:{ Exception -> 0x00c8, all -> 0x00c5 }
        L_0x00c5:
            r11 = move-exception
            r0 = r10
            goto L_0x00f1
        L_0x00c8:
            r11 = move-exception
            r0 = r10
            goto L_0x00cf
        L_0x00cb:
            r10 = move-exception
            goto L_0x00f2
        L_0x00cd:
            r10 = move-exception
            r11 = r10
        L_0x00cf:
            boolean r10 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00f0 }
            if (r10 == 0) goto L_0x00d5
            throw r11     // Catch:{ all -> 0x00f0 }
        L_0x00d5:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00f0 }
            java.lang.String r12 = r11.getMessage()     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r13.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "V2 version check failed: "
            r13.append(r1)     // Catch:{ all -> 0x00f0 }
            r13.append(r12)     // Catch:{ all -> 0x00f0 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x00f0 }
            r10.<init>(r12, r11)     // Catch:{ all -> 0x00f0 }
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r11 = move-exception
        L_0x00f1:
            r10 = r11
        L_0x00f2:
            if (r0 == 0) goto L_0x00f7
            r0.close()
        L_0x00f7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.lang.ClassLoader r2) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof d7.g     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            d7.g r2 = (d7.g) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            d7.g r0 = new d7.g     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            m = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(java.lang.ClassLoader):void");
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f4354h)) {
            return true;
        }
        boolean z10 = false;
        if (f4354h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (t6.f.f15396b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f4354h = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4352f = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static f h(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = f4358l;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
                }
                if (fVar != null) {
                    f4358l = fVar;
                    return fVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f4359a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
