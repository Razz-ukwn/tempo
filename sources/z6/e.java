package z6;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f17773a;

    /* renamed from: b  reason: collision with root package name */
    public static int f17774b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = f17773a
            if (r1 != 0) goto L_0x0066
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0013
            java.lang.String r0 = android.app.Application.getProcessName()
            f17773a = r0
            goto L_0x0066
        L_0x0013:
            int r1 = f17774b
            if (r1 != 0) goto L_0x001d
            int r1 = android.os.Process.myPid()
            f17774b = r1
        L_0x001d:
            r2 = 0
            if (r1 > 0) goto L_0x0021
            goto L_0x0064
        L_0x0021:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            r3.append(r1)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0055 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0055 }
            r4.<init>(r0)     // Catch:{ all -> 0x0055 }
            r3.<init>(r4)     // Catch:{ all -> 0x0055 }
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            u6.q.i(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r2 = r3
            goto L_0x005b
        L_0x0052:
            r0 = r2
        L_0x0053:
            r2 = r3
            goto L_0x0060
        L_0x0055:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            throw r0     // Catch:{ IOException -> 0x005f, all -> 0x005a }
        L_0x005a:
            r0 = move-exception
        L_0x005b:
            z6.d.a(r2)
            throw r0
        L_0x005f:
            r0 = r2
        L_0x0060:
            z6.d.a(r2)
            r2 = r0
        L_0x0064:
            f17773a = r2
        L_0x0066:
            java.lang.String r0 = f17773a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.e.a():java.lang.String");
    }
}
