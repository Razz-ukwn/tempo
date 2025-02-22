package e9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import f9.a;
import f9.i;
import f9.k;
import f9.t;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final k f7887e = new k("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    public static final Intent f7888f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public final t f7889a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7890b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7891c;

    /* renamed from: d  reason: collision with root package name */
    public final i f7892d;

    public h(Context context, i iVar) {
        int length;
        String str;
        this.f7890b = context.getPackageName();
        this.f7891c = context;
        this.f7892d = iVar;
        k kVar = a.f8609a;
        boolean z10 = false;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    k kVar2 = a.f8609a;
                    kVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", k.b(kVar2.f8617a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        byte[] byteArray = signatureArr[i8].toByteArray();
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update(byteArray);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                            z10 = true;
                        } else {
                            i8++;
                        }
                    }
                    z10 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (z10) {
            Context applicationContext = context.getApplicationContext();
            this.f7889a = new t(applicationContext != null ? applicationContext : context, f7887e, f7888f);
        }
    }

    public static Bundle a(h hVar, String str) {
        Map map;
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap hashMap = i.f8616a;
        synchronized (i.class) {
            HashMap hashMap2 = i.f8616a;
            if (!hashMap2.containsKey("app_update")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("java", 11004);
                hashMap2.put("app_update", hashMap3);
            }
            map = (Map) hashMap2.get("app_update");
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(hVar.f7891c.getPackageManager().getPackageInfo(hVar.f7891c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            k kVar = f7887e;
            Object[] objArr = new Object[0];
            kVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k.b(kVar.f8617a, "The current version of the app could not be retrieved", objArr));
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
