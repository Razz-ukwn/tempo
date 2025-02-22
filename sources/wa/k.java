package wa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16621a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f16622b;

    public /* synthetic */ k(Context context, Intent intent) {
        this.f16621a = context;
        this.f16622b = intent;
    }

    public final Object call() {
        String str;
        int i8;
        ComponentName componentName;
        Context context = this.f16621a;
        Intent intent = this.f16622b;
        z a10 = z.a();
        a10.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        a10.f16660d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (a10) {
            str = a10.f16657a;
            if (str == null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveService != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (serviceInfo != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                            String str2 = serviceInfo.name;
                            if (str2 != null) {
                                if (str2.startsWith(".")) {
                                    a10.f16657a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    a10.f16657a = serviceInfo.name;
                                }
                                str = a10.f16657a;
                            }
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        str = null;
                    }
                }
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                str = null;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (a10.c(context)) {
                componentName = h0.b(context, intent2);
            } else {
                componentName = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i8 = 404;
            } else {
                i8 = -1;
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            i8 = 401;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            i8 = 402;
        }
        return Integer.valueOf(i8);
    }
}
