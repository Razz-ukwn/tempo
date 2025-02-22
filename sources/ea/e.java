package ea;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final File f7903a;

    /* renamed from: b  reason: collision with root package name */
    public final File f7904b;

    /* renamed from: c  reason: collision with root package name */
    public final File f7905c;

    /* renamed from: d  reason: collision with root package name */
    public final File f7906d;

    /* renamed from: e  reason: collision with root package name */
    public final File f7907e;

    /* renamed from: f  reason: collision with root package name */
    public final File f7908f;

    public e(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f7903a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f7904b = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f7905c = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f7906d = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f7907e = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f7908f = file5;
    }

    public static void a(File file) {
        if (file.exists() && d(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void c(java.io.File r6) {
        /*
            java.lang.String r0 = "Unexpected non-directory file: "
            java.lang.String r1 = "Could not create Crashlytics-specific directory: "
            java.lang.Class<ea.e> r2 = ea.e.class
            monitor-enter(r2)
            boolean r3 = r6.exists()     // Catch:{ all -> 0x0051 }
            r4 = 0
            if (r3 == 0) goto L_0x0038
            boolean r3 = r6.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0016
            monitor-exit(r2)
            return
        L_0x0016:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            r3.append(r6)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "; deleting file and creating new directory."
            r3.append(r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "FirebaseCrashlytics"
            r5 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r5)     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.d(r3, r0, r4)     // Catch:{ all -> 0x0051 }
        L_0x0035:
            r6.delete()     // Catch:{ all -> 0x0051 }
        L_0x0038:
            boolean r0 = r6.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x004f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r0.<init>(r1)     // Catch:{ all -> 0x0051 }
            r0.append(r6)     // Catch:{ all -> 0x0051 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "FirebaseCrashlytics"
            android.util.Log.e(r0, r6, r4)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r2)
            return
        L_0x0051:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.e.c(java.io.File):void");
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File d10 : listFiles) {
                d(d10);
            }
        }
        return file.delete();
    }

    public static <T> List<T> e(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File b(String str, String str2) {
        File file = new File(this.f7905c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
