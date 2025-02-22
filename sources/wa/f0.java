package wa;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.a;

public final class f0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f16580i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f16581j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16582a;

    /* renamed from: b  reason: collision with root package name */
    public final s f16583b;

    /* renamed from: c  reason: collision with root package name */
    public final p f16584c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f16585d;

    /* renamed from: e  reason: collision with root package name */
    public final a f16586e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f16587f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16588g = false;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f16589h;

    public f0(FirebaseMessaging firebaseMessaging, s sVar, d0 d0Var, p pVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16585d = firebaseMessaging;
        this.f16583b = sVar;
        this.f16589h = d0Var;
        this.f16584c = pVar;
        this.f16582a = context;
        this.f16587f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public final void b(String str) {
        String a10 = this.f16585d.a();
        p pVar = this.f16584c;
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(pVar.a(pVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a10 = this.f16585d.a();
        p pVar = this.f16584c;
        pVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(pVar.a(pVar.c(a10, "/topics/" + str, bundle)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r7 = r0.f16567b;
        r8 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r8 == 83) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r8 == 85) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r7.equals("U") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r7.equals("S") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r9 = r0.f16566a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r7 == 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r7 == 1) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (d() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        android.util.Log.d("FirebaseMessaging", "Unknown topic operation" + r0 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (d() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        android.util.Log.d("FirebaseMessaging", "Unsubscribe from topic: " + r9 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        b(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (d() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        android.util.Log.d("FirebaseMessaging", "Subscribe to topic: " + r9 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        if (r1.getMessage() == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r1.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r10 = this;
        L_0x0000:
            monitor-enter(r10)
            wa.d0 r0 = r10.f16589h     // Catch:{ all -> 0x0143 }
            wa.c0 r0 = r0.a()     // Catch:{ all -> 0x0143 }
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = d()     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x0143 }
        L_0x0017:
            monitor-exit(r10)     // Catch:{ all -> 0x0143 }
            return r1
        L_0x0019:
            monitor-exit(r10)     // Catch:{ all -> 0x0143 }
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Unsubscribe from topic: "
            java.lang.String r4 = "Subscribe to topic: "
            java.lang.String r5 = "Unknown topic operation"
            r6 = 0
            java.lang.String r7 = r0.f16567b     // Catch:{ IOException -> 0x00a3 }
            int r8 = r7.hashCode()     // Catch:{ IOException -> 0x00a3 }
            r9 = 83
            if (r8 == r9) goto L_0x003c
            r9 = 85
            if (r8 == r9) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            java.lang.String r8 = "U"
            boolean r7 = r7.equals(r8)     // Catch:{ IOException -> 0x00a3 }
            if (r7 == 0) goto L_0x0046
            r7 = r1
            goto L_0x0047
        L_0x003c:
            java.lang.String r8 = "S"
            boolean r7 = r7.equals(r8)     // Catch:{ IOException -> 0x00a3 }
            if (r7 == 0) goto L_0x0046
            r7 = r6
            goto L_0x0047
        L_0x0046:
            r7 = -1
        L_0x0047:
            java.lang.String r8 = " succeeded."
            java.lang.String r9 = r0.f16566a
            if (r7 == 0) goto L_0x0087
            if (r7 == r1) goto L_0x006b
            boolean r3 = d()     // Catch:{ IOException -> 0x00a3 }
            if (r3 == 0) goto L_0x00e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a3 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x00a3 }
            r3.append(r0)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r4 = "."
            r3.append(r4)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00a3 }
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00e5
        L_0x006b:
            r10.c(r9)     // Catch:{ IOException -> 0x00a3 }
            boolean r4 = d()     // Catch:{ IOException -> 0x00a3 }
            if (r4 == 0) goto L_0x00e5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a3 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x00a3 }
            r4.append(r9)     // Catch:{ IOException -> 0x00a3 }
            r4.append(r8)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x00a3 }
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00e5
        L_0x0087:
            r10.b(r9)     // Catch:{ IOException -> 0x00a3 }
            boolean r3 = d()     // Catch:{ IOException -> 0x00a3 }
            if (r3 == 0) goto L_0x00e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a3 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00a3 }
            r3.append(r9)     // Catch:{ IOException -> 0x00a3 }
            r3.append(r8)     // Catch:{ IOException -> 0x00a3 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00a3 }
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00e5
        L_0x00a3:
            r1 = move-exception
            java.lang.String r3 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r4 = r1.getMessage()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ca
            java.lang.String r3 = "INTERNAL_SERVER_ERROR"
            java.lang.String r4 = r1.getMessage()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            goto L_0x00ca
        L_0x00bd:
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L_0x00c9
            java.lang.String r1 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r2, r1)
            goto L_0x00e4
        L_0x00c9:
            throw r1
        L_0x00ca:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Topic operation failed: "
            r3.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = ". Will retry Topic operation."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r2, r1)
        L_0x00e4:
            r1 = r6
        L_0x00e5:
            if (r1 != 0) goto L_0x00e8
            return r6
        L_0x00e8:
            wa.d0 r1 = r10.f16589h
            monitor-enter(r1)
            wa.a0 r2 = r1.f16572a     // Catch:{ all -> 0x0140 }
            java.lang.String r3 = r0.f16568c     // Catch:{ all -> 0x0140 }
            java.util.ArrayDeque<java.lang.String> r4 = r2.f16555d     // Catch:{ all -> 0x0140 }
            monitor-enter(r4)     // Catch:{ all -> 0x0140 }
            java.util.ArrayDeque<java.lang.String> r5 = r2.f16555d     // Catch:{ all -> 0x013d }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x013d }
            if (r3 == 0) goto L_0x0106
            androidx.activity.j r3 = new androidx.activity.j     // Catch:{ all -> 0x013d }
            r5 = 12
            r3.<init>(r2, r5)     // Catch:{ all -> 0x013d }
            java.util.concurrent.Executor r2 = r2.f16556e     // Catch:{ all -> 0x013d }
            r2.execute(r3)     // Catch:{ all -> 0x013d }
        L_0x0106:
            monitor-exit(r4)     // Catch:{ all -> 0x013d }
            monitor-exit(r1)
            o.a r2 = r10.f16586e
            monitor-enter(r2)
            java.lang.String r0 = r0.f16568c     // Catch:{ all -> 0x013a }
            o.a r1 = r10.f16586e     // Catch:{ all -> 0x013a }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x013a }
            if (r1 != 0) goto L_0x0118
            monitor-exit(r2)     // Catch:{ all -> 0x013a }
            goto L_0x0000
        L_0x0118:
            o.a r1 = r10.f16586e     // Catch:{ all -> 0x013a }
            r3 = 0
            java.lang.Object r1 = r1.getOrDefault(r0, r3)     // Catch:{ all -> 0x013a }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x013a }
            java.lang.Object r4 = r1.poll()     // Catch:{ all -> 0x013a }
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x012c
            r4.setResult(r3)     // Catch:{ all -> 0x013a }
        L_0x012c:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x0137
            o.a r1 = r10.f16586e     // Catch:{ all -> 0x013a }
            r1.remove(r0)     // Catch:{ all -> 0x013a }
        L_0x0137:
            monitor-exit(r2)     // Catch:{ all -> 0x013a }
            goto L_0x0000
        L_0x013a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013a }
            throw r0
        L_0x013d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0143:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.f0.e():boolean");
    }

    public final void f(long j10) {
        this.f16587f.schedule(new g0(this, this.f16582a, this.f16583b, Math.min(Math.max(30, 2 * j10), f16580i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f16588g = true;
        }
    }
}
