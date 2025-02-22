package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.a;

public final class k4 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f5348h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f5349i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f5350a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f5351b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f5352c;

    /* renamed from: d  reason: collision with root package name */
    public final j4 f5353d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5354e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Map f5355f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f5356g = new ArrayList();

    public k4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        j4 j4Var = new j4(this);
        this.f5353d = j4Var;
        contentResolver.getClass();
        uri.getClass();
        this.f5350a = contentResolver;
        this.f5351b = uri;
        this.f5352c = runnable;
        contentResolver.registerContentObserver(uri, false, j4Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.k4 a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.k4> r0 = com.google.android.gms.internal.measurement.k4.class
            monitor-enter(r0)
            o.a r1 = f5348h     // Catch:{ all -> 0x0019 }
            r2 = 0
            java.lang.Object r2 = r1.getOrDefault(r5, r2)     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.k4 r2 = (com.google.android.gms.internal.measurement.k4) r2     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x0017
            com.google.android.gms.internal.measurement.k4 r3 = new com.google.android.gms.internal.measurement.k4     // Catch:{ SecurityException -> 0x0017 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0017 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0016 }
        L_0x0016:
            r2 = r3
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k4.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.k4");
    }

    public static synchronized void c() {
        synchronized (k4.class) {
            Iterator it = ((a.e) f5348h.values()).iterator();
            while (it.hasNext()) {
                k4 k4Var = (k4) it.next();
                k4Var.f5350a.unregisterContentObserver(k4Var.f5353d);
            }
            f5348h.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = r2.zza();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        android.os.Binder.restoreCallingIdentity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        android.util.Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0043, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0046, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f5355f
            if (r0 != 0) goto L_0x004a
            java.lang.Object r1 = r5.f5354e
            monitor-enter(r1)
            java.util.Map r0 = r5.f5355f     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0041
        L_0x000c:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0047 }
            t.x2 r2 = new t.x2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
            r3 = 7
            r2.<init>(r5, r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
            java.lang.Object r2 = r2.zza()     // Catch:{ SecurityException -> 0x001b, SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
            goto L_0x0026
        L_0x001b:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
            java.lang.Object r2 = r2.zza()     // Catch:{ all -> 0x002c }
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
        L_0x0026:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x003e
        L_0x002c:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
            throw r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0033 }
        L_0x0031:
            r2 = move-exception
            goto L_0x0043
        L_0x0033:
            java.lang.String r2 = "ConfigurationContentLdr"
            java.lang.String r3 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0031 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0047 }
            r2 = 0
        L_0x003e:
            r5.f5355f = r2     // Catch:{ all -> 0x0047 }
            r0 = r2
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0043:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0047 }
            throw r2     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            throw r0
        L_0x004a:
            if (r0 == 0) goto L_0x004d
            return r0
        L_0x004d:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k4.b():java.util.Map");
    }
}
