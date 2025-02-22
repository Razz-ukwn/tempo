package z6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f17769a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f17770b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f17771c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f17772d;

    @TargetApi(26)
    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f17769a == null) {
            f17769a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f17769a.booleanValue();
        if (f17770b == null) {
            f17770b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f17770b.booleanValue()) {
            if (Build.VERSION.SDK_INT >= 30) {
                return true;
            }
        }
        return false;
    }
}
