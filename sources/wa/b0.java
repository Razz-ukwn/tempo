package wa;

import a7.b;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f16559a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f16560b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f16561c;

    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public b0 f16562a;

        public a(b0 b0Var) {
            this.f16562a = b0Var;
        }

        public final void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f16562a.f16561c.f6334d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final void onReceive(Context context, Intent intent) {
            b0 b0Var = this.f16562a;
            if (b0Var != null && b0Var.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                b0 b0Var2 = this.f16562a;
                b0Var2.f16561c.getClass();
                FirebaseMessaging.b(b0Var2, 0);
                this.f16562a.f16561c.f6334d.unregisterReceiver(this);
                this.f16562a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public b0(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));
        this.f16561c = firebaseMessaging;
        this.f16559a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f6334d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f16560b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16561c.f6334d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        boolean z10 = true;
        try {
            if (this.f16561c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + r4.getMessage() + ". Won't retry the operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a6, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r2.f6341k = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b4, code lost:
        if (wa.z.a().c(r2.f6334d) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c7, code lost:
        if (wa.z.a().c(r2.f6334d) != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c9, code lost:
        r3.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @android.annotation.SuppressLint({"WakelockTimeout"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = "Topic sync or token retrieval failed on hard failure exceptions: "
            wa.z r1 = wa.z.a()
            com.google.firebase.messaging.FirebaseMessaging r2 = r7.f16561c
            android.content.Context r3 = r2.f6334d
            boolean r1 = r1.c(r3)
            android.os.PowerManager$WakeLock r3 = r7.f16560b
            if (r1 == 0) goto L_0x0015
            r3.acquire()
        L_0x0015:
            r1 = 0
            monitor-enter(r2)     // Catch:{ IOException -> 0x003d }
            r4 = 1
            r2.f6341k = r4     // Catch:{ all -> 0x0089 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003d }
            wa.s r4 = r2.f6340j     // Catch:{ IOException -> 0x003d }
            boolean r4 = r4.c()     // Catch:{ IOException -> 0x003d }
            if (r4 != 0) goto L_0x003f
            monitor-enter(r2)     // Catch:{ IOException -> 0x003d }
            r2.f6341k = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003d }
            wa.z r0 = wa.z.a()
            android.content.Context r1 = r2.f6334d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0036
            r3.release()
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003d }
            throw r4     // Catch:{ IOException -> 0x003d }
        L_0x003a:
            r0 = move-exception
            goto L_0x00bd
        L_0x003d:
            r4 = move-exception
            goto L_0x008c
        L_0x003f:
            wa.z r4 = wa.z.a()     // Catch:{ IOException -> 0x003d }
            android.content.Context r5 = r2.f6334d     // Catch:{ IOException -> 0x003d }
            boolean r4 = r4.b(r5)     // Catch:{ IOException -> 0x003d }
            if (r4 == 0) goto L_0x0069
            boolean r4 = r7.a()     // Catch:{ IOException -> 0x003d }
            if (r4 != 0) goto L_0x0069
            wa.b0$a r4 = new wa.b0$a     // Catch:{ IOException -> 0x003d }
            r4.<init>(r7)     // Catch:{ IOException -> 0x003d }
            r4.a()     // Catch:{ IOException -> 0x003d }
            wa.z r0 = wa.z.a()
            android.content.Context r1 = r2.f6334d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x0068
            r3.release()
        L_0x0068:
            return
        L_0x0069:
            boolean r4 = r7.b()     // Catch:{ IOException -> 0x003d }
            if (r4 == 0) goto L_0x0077
            monitor-enter(r2)     // Catch:{ IOException -> 0x003d }
            r2.f6341k = r1     // Catch:{ all -> 0x0074 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x003d }
            goto L_0x007c
        L_0x0074:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003d }
            throw r4     // Catch:{ IOException -> 0x003d }
        L_0x0077:
            long r4 = r7.f16559a     // Catch:{ IOException -> 0x003d }
            r2.e(r4)     // Catch:{ IOException -> 0x003d }
        L_0x007c:
            wa.z r0 = wa.z.a()
            android.content.Context r1 = r2.f6334d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00b9
            goto L_0x00b6
        L_0x0089:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x003d }
            throw r4     // Catch:{ IOException -> 0x003d }
        L_0x008c:
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r6.<init>(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x003a }
            r6.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = ". Won't retry the operation."
            r6.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x003a }
            android.util.Log.e(r5, r0)     // Catch:{ all -> 0x003a }
            monitor-enter(r2)     // Catch:{ all -> 0x003a }
            r2.f6341k = r1     // Catch:{ all -> 0x00ba }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            wa.z r0 = wa.z.a()
            android.content.Context r1 = r2.f6334d
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00b9
        L_0x00b6:
            r3.release()
        L_0x00b9:
            return
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x00bd:
            wa.z r1 = wa.z.a()
            android.content.Context r2 = r2.f6334d
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L_0x00cc
            r3.release()
        L_0x00cc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.b0.run():void");
    }
}
