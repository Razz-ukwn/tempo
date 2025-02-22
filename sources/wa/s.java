package wa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import m9.f;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16641a;

    /* renamed from: b  reason: collision with root package name */
    public String f16642b;

    /* renamed from: c  reason: collision with root package name */
    public String f16643c;

    /* renamed from: d  reason: collision with root package name */
    public int f16644d;

    /* renamed from: e  reason: collision with root package name */
    public int f16645e = 0;

    public s(Context context) {
        this.f16641a = context;
    }

    public static String a(f fVar) {
        fVar.a();
        String str = fVar.f11333c.f11347e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = fVar.f11333c.f11344b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo b(String str) {
        try {
            return this.f16641a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean c() {
        int i8;
        synchronized (this) {
            i8 = this.f16645e;
            if (i8 == 0) {
                PackageManager packageManager = this.f16641a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i8 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f16645e = 2;
                    } else {
                        this.f16645e = 2;
                    }
                    i8 = 2;
                }
            }
        }
        return i8 != 0;
    }

    public final synchronized void d() {
        PackageInfo b10 = b(this.f16641a.getPackageName());
        if (b10 != null) {
            this.f16642b = Integer.toString(b10.versionCode);
            this.f16643c = b10.versionName;
        }
    }
}
