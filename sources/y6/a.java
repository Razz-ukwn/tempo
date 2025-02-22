package y6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b7.c;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import u6.i1;
import u6.q;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f17301b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f17302c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f17303a = new ConcurrentHashMap();

    public static a b() {
        if (f17302c == null) {
            synchronized (f17301b) {
                if (f17302c == null) {
                    f17302c = new a();
                }
            }
        }
        a aVar = f17302c;
        q.i(aVar);
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i8) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i8, (Executor) null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof i1)) {
            ConcurrentHashMap concurrentHashMap = this.f17303a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        ComponentName component = intent.getComponent();
        boolean z10 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z11 = true;
        if (!(serviceConnection instanceof i1)) {
            ConcurrentHashMap concurrentHashMap = this.f17303a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                boolean bindService = (!z11 || executor == null) ? context.bindService(intent, serviceConnection, i8) : context.bindService(intent, i8, executor, serviceConnection);
                if (bindService) {
                    return bindService;
                }
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                return false;
            } catch (Throwable th) {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                throw th;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                z10 = true;
            }
            return (!z10 || executor == null) ? context.bindService(intent, serviceConnection, i8) : context.bindService(intent, i8, executor, serviceConnection);
        }
    }
}
