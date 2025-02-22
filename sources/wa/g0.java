package wa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class g0 implements Runnable {
    public static final Object B = new Object();
    public static Boolean C;
    public static Boolean D;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16593a;

    /* renamed from: b  reason: collision with root package name */
    public final s f16594b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f16595c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f16596d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16597e;

    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public g0 f16598a;

        public a(g0 g0Var) {
            this.f16598a = g0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            g0.this.f16593a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            g0 g0Var = this.f16598a;
            if (g0Var != null) {
                if (g0Var.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    g0 g0Var2 = this.f16598a;
                    g0Var2.f16596d.f16587f.schedule(g0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f16598a = null;
                }
            }
        }
    }

    public g0(f0 f0Var, Context context, s sVar, long j10) {
        this.f16596d = f0Var;
        this.f16593a = context;
        this.f16597e = j10;
        this.f16594b = sVar;
        this.f16595c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (B) {
            Boolean bool = D;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            D = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (B) {
            Boolean bool = C;
            Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            C = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16593a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        android.util.Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + r7.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0090, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r2.f16588g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0098, code lost:
        if (c(r4) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00a9, code lost:
        if (c(r4) != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00af, code lost:
        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00b2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r0 = "TopicsSyncTask's wakelock was already released due to timeout."
            java.lang.String r1 = "FirebaseMessaging"
            wa.f0 r2 = r9.f16596d
            java.lang.String r3 = "Failed to sync topics. Won't retry sync. "
            android.content.Context r4 = r9.f16593a
            boolean r5 = c(r4)
            android.os.PowerManager$WakeLock r6 = r9.f16595c
            if (r5 == 0) goto L_0x0017
            long r7 = wa.f.f16579a
            r6.acquire(r7)
        L_0x0017:
            r5 = 0
            monitor-enter(r2)     // Catch:{ IOException -> 0x003c }
            r7 = 1
            r2.f16588g = r7     // Catch:{ all -> 0x007a }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003c }
            wa.s r7 = r9.f16594b     // Catch:{ IOException -> 0x003c }
            boolean r7 = r7.c()     // Catch:{ IOException -> 0x003c }
            if (r7 != 0) goto L_0x003e
            monitor-enter(r2)     // Catch:{ IOException -> 0x003c }
            r2.f16588g = r5     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003c }
            boolean r2 = c(r4)
            if (r2 == 0) goto L_0x0036
            r6.release()     // Catch:{ RuntimeException -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            android.util.Log.i(r1, r0)
        L_0x0036:
            return
        L_0x0037:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003c }
            throw r7     // Catch:{ IOException -> 0x003c }
        L_0x003a:
            r2 = move-exception
            goto L_0x00a5
        L_0x003c:
            r7 = move-exception
            goto L_0x007d
        L_0x003e:
            boolean r7 = a(r4)     // Catch:{ IOException -> 0x003c }
            if (r7 == 0) goto L_0x0060
            boolean r7 = r9.d()     // Catch:{ IOException -> 0x003c }
            if (r7 != 0) goto L_0x0060
            wa.g0$a r7 = new wa.g0$a     // Catch:{ IOException -> 0x003c }
            r7.<init>(r9)     // Catch:{ IOException -> 0x003c }
            r7.a()     // Catch:{ IOException -> 0x003c }
            boolean r2 = c(r4)
            if (r2 == 0) goto L_0x005f
            r6.release()     // Catch:{ RuntimeException -> 0x005c }
            goto L_0x005f
        L_0x005c:
            android.util.Log.i(r1, r0)
        L_0x005f:
            return
        L_0x0060:
            boolean r7 = r2.e()     // Catch:{ IOException -> 0x003c }
            if (r7 == 0) goto L_0x006e
            monitor-enter(r2)     // Catch:{ IOException -> 0x003c }
            r2.f16588g = r5     // Catch:{ all -> 0x006b }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003c }
            goto L_0x0073
        L_0x006b:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003c }
            throw r7     // Catch:{ IOException -> 0x003c }
        L_0x006e:
            long r7 = r9.f16597e     // Catch:{ IOException -> 0x003c }
            r2.f(r7)     // Catch:{ IOException -> 0x003c }
        L_0x0073:
            boolean r2 = c(r4)
            if (r2 == 0) goto L_0x00a1
            goto L_0x009a
        L_0x007a:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003c }
            throw r7     // Catch:{ IOException -> 0x003c }
        L_0x007d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r8.<init>(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r7.getMessage()     // Catch:{ all -> 0x003a }
            r8.append(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x003a }
            android.util.Log.e(r1, r3)     // Catch:{ all -> 0x003a }
            monitor-enter(r2)     // Catch:{ all -> 0x003a }
            r2.f16588g = r5     // Catch:{ all -> 0x00a2 }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            boolean r2 = c(r4)
            if (r2 == 0) goto L_0x00a1
        L_0x009a:
            r6.release()     // Catch:{ RuntimeException -> 0x009e }
            goto L_0x00a1
        L_0x009e:
            android.util.Log.i(r1, r0)
        L_0x00a1:
            return
        L_0x00a2:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3     // Catch:{ all -> 0x003a }
        L_0x00a5:
            boolean r3 = c(r4)
            if (r3 == 0) goto L_0x00b2
            r6.release()     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            android.util.Log.i(r1, r0)
        L_0x00b2:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.g0.run():void");
    }
}
