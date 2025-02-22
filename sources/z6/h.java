package z6;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f17775a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f17776b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f17777c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f17778d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f17779e = null;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<String> cls = String.class;
        Class<WorkSource> cls2 = WorkSource.class;
        Process.myUid();
        try {
            method = cls2.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        f17775a = method;
        try {
            method2 = cls2.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f17776b = method2;
        try {
            method3 = cls2.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f17777c = method3;
        try {
            cls2.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            cls2.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                cls2.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = cls2.getMethod("isEmpty", new Class[0]);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
            f17778d = method4;
        }
        method4 = null;
        f17778d = method4;
    }

    public static void a(WorkSource workSource, int i8, String str) {
        Method method = f17776b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i8), str});
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            Method method2 = f17775a;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i8)});
                } catch (Exception e11) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.os.WorkSource r4) {
        /*
            java.lang.String r0 = "WorkSourceUtil"
            r1 = 0
            java.lang.reflect.Method r2 = f17778d
            if (r2 == 0) goto L_0x001d
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch:{ Exception -> 0x0017 }
            u6.q.i(r2)     // Catch:{ Exception -> 0x0017 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0017 }
            boolean r4 = r2.booleanValue()     // Catch:{ Exception -> 0x0017 }
            return r4
        L_0x0017:
            r2 = move-exception
            java.lang.String r3 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r0, r3, r2)
        L_0x001d:
            java.lang.reflect.Method r2 = f17777c
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r4 = r2.invoke(r4, r3)     // Catch:{ Exception -> 0x0031 }
            u6.q.i(r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0031 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0038
        L_0x0031:
            r4 = move-exception
            java.lang.String r2 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r0, r2, r4)
        L_0x0037:
            r4 = r1
        L_0x0038:
            if (r4 != 0) goto L_0x003c
            r4 = 1
            return r4
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.h.b(android.os.WorkSource):boolean");
    }
}
