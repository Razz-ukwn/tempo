package com.google.android.gms.internal.measurement;

import android.content.Context;

public final class n4 {

    /* renamed from: c  reason: collision with root package name */
    public static n4 f5414c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5415a;

    /* renamed from: b  reason: collision with root package name */
    public final e4 f5416b;

    public n4() {
        this.f5415a = null;
        this.f5416b = null;
    }

    public n4(Context context) {
        this.f5415a = context;
        e4 e4Var = new e4();
        this.f5416b = e4Var;
        context.getContentResolver().registerContentObserver(g4.f5284a, true, e4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0075, code lost:
        android.os.Binder.restoreCallingIdentity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0079, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007e, code lost:
        android.util.Log.e("GservicesLoader", "Unable to read GServices for: ".concat(java.lang.String.valueOf(r10)), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008d, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0079 A[ExcHandler: IllegalStateException | NullPointerException (e java.lang.Throwable), Splitter:B:39:0x005c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f5415a
            r1 = 0
            if (r0 == 0) goto L_0x0091
            boolean r2 = com.google.android.gms.internal.measurement.h4.f5304b
            r3 = 0
            if (r2 == 0) goto L_0x000b
            goto L_0x0059
        L_0x000b:
            java.lang.Class<com.google.android.gms.internal.measurement.h4> r2 = com.google.android.gms.internal.measurement.h4.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.h4.f5304b     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            goto L_0x0059
        L_0x0014:
            r4 = 1
            r5 = r4
        L_0x0016:
            r6 = 2
            if (r5 > r6) goto L_0x004c
            android.os.UserManager r6 = com.google.android.gms.internal.measurement.h4.f5303a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0027
            java.lang.Class<android.os.UserManager> r6 = android.os.UserManager.class
            java.lang.Object r6 = r0.getSystemService(r6)     // Catch:{ all -> 0x008e }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.measurement.h4.f5303a = r6     // Catch:{ all -> 0x008e }
        L_0x0027:
            android.os.UserManager r6 = com.google.android.gms.internal.measurement.h4.f5303a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x002d
            r0 = r4
            goto L_0x0051
        L_0x002d:
            boolean r7 = r6.isUserUnlocked()     // Catch:{ NullPointerException -> 0x003f }
            if (r7 != 0) goto L_0x003d
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x003f }
            boolean r0 = r6.isUserRunning(r7)     // Catch:{ NullPointerException -> 0x003f }
            if (r0 != 0) goto L_0x004c
        L_0x003d:
            r0 = r4
            goto L_0x004d
        L_0x003f:
            r6 = move-exception
            java.lang.String r7 = "DirectBootUtils"
            java.lang.String r8 = "Failed to check if user is unlocked."
            android.util.Log.w(r7, r8, r6)     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.measurement.h4.f5303a = r1     // Catch:{ all -> 0x008e }
            int r5 = r5 + 1
            goto L_0x0016
        L_0x004c:
            r0 = r3
        L_0x004d:
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.internal.measurement.h4.f5303a = r1     // Catch:{ all -> 0x008e }
        L_0x0051:
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.internal.measurement.h4.f5304b = r4     // Catch:{ all -> 0x008e }
        L_0x0055:
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x0059
            r3 = r4
        L_0x0059:
            if (r3 == 0) goto L_0x005c
            goto L_0x0091
        L_0x005c:
            f3.v r0 = new f3.v     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r10)     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            java.lang.Object r0 = r0.e()     // Catch:{ SecurityException -> 0x0066, IllegalStateException -> 0x007d, NullPointerException -> 0x0079 }
            goto L_0x0071
        L_0x0066:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            java.lang.Object r0 = r0.e()     // Catch:{ all -> 0x0074 }
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
        L_0x0071:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            return r0
        L_0x0074:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
            throw r0     // Catch:{ IllegalStateException -> 0x007d, SecurityException -> 0x007b, NullPointerException -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            goto L_0x007e
        L_0x007b:
            r0 = move-exception
            goto L_0x007e
        L_0x007d:
            r0 = move-exception
        L_0x007e:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r3 = "GservicesLoader"
            java.lang.String r10 = r2.concat(r10)
            android.util.Log.e(r3, r10, r0)
            return r1
        L_0x008e:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008e }
            throw r10
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n4.a(java.lang.String):java.lang.String");
    }
}
