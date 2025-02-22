package s6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import b7.c;
import java.util.List;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14793a;

    /* renamed from: b  reason: collision with root package name */
    public int f14794b;

    /* renamed from: c  reason: collision with root package name */
    public int f14795c = 0;

    public v(Context context) {
        this.f14793a = context;
    }

    public final synchronized int a() {
        int i8 = this.f14795c;
        if (i8 != 0) {
            return i8;
        }
        PackageManager packageManager = this.f14793a.getPackageManager();
        if (c.a(this.f14793a).f3272a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            if (queryBroadcastReceivers.size() > 0) {
                this.f14795c = 2;
                return 2;
            }
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f14795c = 2;
        return 2;
    }
}
