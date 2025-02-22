package wa;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

public final class z {

    /* renamed from: e  reason: collision with root package name */
    public static z f16656e;

    /* renamed from: a  reason: collision with root package name */
    public String f16657a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f16658b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f16659c = null;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f16660d = new ArrayDeque();

    public static synchronized z a() {
        z zVar;
        synchronized (z.class) {
            if (f16656e == null) {
                f16656e = new z();
            }
            zVar = f16656e;
        }
        return zVar;
    }

    public final boolean b(Context context) {
        if (this.f16659c == null) {
            this.f16659c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f16658b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f16659c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f16658b == null) {
            this.f16658b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f16658b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f16658b.booleanValue();
    }
}
