package z6;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import b7.b;
import b7.c;
import t6.i;
import t6.j;

public final class g {
    public static boolean a(Context context, int i8) {
        if (!b(i8, context, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            j a10 = j.a(context);
            a10.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!j.d(packageInfo, false)) {
                if (!j.d(packageInfo, true)) {
                    return false;
                }
                if (!i.a(a10.f15407a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(int i8, Context context, String str) {
        b a10 = c.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f3272a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i8, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
