package sb;

import java.util.concurrent.Callable;
import sf.v;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f14890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f14891b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f14892c;

    public /* synthetic */ f(h hVar, v vVar, byte[] bArr) {
        this.f14890a = hVar;
        this.f14891b = vVar;
        this.f14892c = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            byte[] r0 = r7.f14892c
            java.lang.String r1 = "this$0"
            sb.h r2 = r7.f14890a
            sf.j.f(r2, r1)
            java.lang.String r1 = "$image"
            sf.v r3 = r7.f14891b
            sf.j.f(r3, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r4 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r4 = android.os.Environment.getExternalStoragePublicDirectory(r4)
            java.lang.String r5 = "Camera"
            r1.<init>(r4, r5)
            boolean r4 = r1.exists()
            java.lang.String r5 = "logTag"
            java.lang.String r2 = r2.f14894e
            if (r4 != 0) goto L_0x0037
            java.io.File r4 = new java.io.File
            java.lang.String r6 = r1.getPath()
            r4.<init>(r6)
            r4.mkdirs()
            sf.j.e(r2, r5)
            goto L_0x003a
        L_0x0037:
            sf.j.e(r2, r5)
        L_0x003a:
            java.lang.String r4 = "IMG-"
            java.lang.String r6 = ".jpeg"
            java.io.File r1 = java.io.File.createTempFile(r4, r6, r1)
            r3.f14957a = r1
            r1 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005f }
            T r6 = r3.f14957a     // Catch:{ IOException -> 0x005f }
            java.io.File r6 = (java.io.File) r6     // Catch:{ IOException -> 0x005f }
            r4.<init>(r6)     // Catch:{ IOException -> 0x005f }
            r4.write(r0)     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            r4.close()     // Catch:{ IOException -> 0x005a, all -> 0x0058 }
            r4.close()
            goto L_0x0070
        L_0x0058:
            r0 = move-exception
            goto L_0x0074
        L_0x005a:
            r0 = move-exception
            r1 = r4
            goto L_0x0060
        L_0x005d:
            r0 = move-exception
            goto L_0x0073
        L_0x005f:
            r0 = move-exception
        L_0x0060:
            sf.j.e(r2, r5)     // Catch:{ all -> 0x005d }
            T r2 = r3.f14957a     // Catch:{ all -> 0x005d }
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x005d }
            r0.toString()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0070
            r1.close()
        L_0x0070:
            ff.m r0 = ff.m.f8717a
            return r0
        L_0x0073:
            r4 = r1
        L_0x0074:
            if (r4 == 0) goto L_0x0079
            r4.close()
        L_0x0079:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.f.call():java.lang.Object");
    }
}
