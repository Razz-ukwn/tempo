package va;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import na.c;
import t1.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f16350a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16351b;

    public a(Context context, String str, c cVar) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = t1.a.f15323a;
        Context a10 = a.e.a(context);
        SharedPreferences sharedPreferences = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16350a = cVar;
        boolean z11 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a10.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z10 = z11;
        }
        this.f16351b = z10;
    }
}
