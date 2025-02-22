package t6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b7.c;
import java.util.concurrent.atomic.AtomicBoolean;

public class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15402a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f15403b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f15404c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f15405d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f15404c) {
            try {
                PackageInfo b10 = c.a(context).b(64, "com.google.android.gms");
                j.a(context);
                if (b10 == null || j.d(b10, false) || !j.d(b10, true)) {
                    f15403b = false;
                } else {
                    f15403b = true;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
            } finally {
                f15404c = true;
            }
        }
        return f15403b || !"user".equals(Build.TYPE);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r3) {
        /*
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ Exception -> 0x0037 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0037 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "com.google.android.gms"
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r0.next()
            android.content.pm.PackageInstaller$SessionInfo r1 = (android.content.pm.PackageInstaller.SessionInfo) r1
            java.lang.String r1 = r1.getAppPackageName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0010
            r3 = 1
            return r3
        L_0x002a:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r2, r0)     // Catch:{  }
            boolean r3 = r3.enabled     // Catch:{  }
            return r3
        L_0x0037:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.i.b(android.content.Context):boolean");
    }
}
