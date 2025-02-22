package t6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import u6.q;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static j f15406c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f15407a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f15408b;

    public j(Context context) {
        this.f15407a = context.getApplicationContext();
    }

    public static j a(Context context) {
        q.i(context);
        synchronized (j.class) {
            if (f15406c == null) {
                r rVar = x.f15419a;
                synchronized (x.class) {
                    if (x.f15423e == null) {
                        x.f15423e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f15406c = new j(context);
            }
        }
        return f15406c;
    }

    public static final t c(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(packageInfo.signatures[0].toByteArray());
        for (int i8 = 0; i8 < tVarArr.length; i8++) {
            if (tVarArr[i8].equals(uVar)) {
                return tVarArr[i8];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z10 ? c(packageInfo, w.f15418a) : c(packageInfo, w.f15418a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r21) {
        /*
            r20 = this;
            r1 = r20
            android.content.Context r0 = r1.f15407a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = r21
            java.lang.String[] r2 = r0.getPackagesForUid(r2)
            if (r2 == 0) goto L_0x018e
            int r3 = r2.length
            if (r3 != 0) goto L_0x0015
            goto L_0x018e
        L_0x0015:
            r5 = 0
            r0 = r5
            r6 = 0
        L_0x0018:
            if (r6 >= r3) goto L_0x018a
            r14 = r2[r6]
            java.lang.String r15 = "Failed to get Google certificates from remote"
            java.lang.String r13 = "GoogleCertificates"
            java.lang.String r7 = "null pkg"
            if (r14 != 0) goto L_0x002b
            t6.f0 r0 = t6.f0.b(r7)
            r12 = 0
            goto L_0x0181
        L_0x002b:
            java.lang.String r0 = r1.f15408b
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x017e
            t6.r r0 = t6.x.f15419a
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskReads()
            t6.x.b()     // Catch:{ a -> 0x004b, RemoteException -> 0x0049 }
            u6.r0 r0 = t6.x.f15421c     // Catch:{ a -> 0x004b, RemoteException -> 0x0049 }
            boolean r0 = r0.zzi()     // Catch:{ a -> 0x004b, RemoteException -> 0x0049 }
            android.os.StrictMode.setThreadPolicy(r8)
            goto L_0x0053
        L_0x0046:
            r0 = move-exception
            goto L_0x017a
        L_0x0049:
            r0 = move-exception
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            android.util.Log.e(r13, r15, r0)     // Catch:{ all -> 0x0046 }
            android.os.StrictMode.setThreadPolicy(r8)
            r0 = 0
        L_0x0053:
            r12 = 1
            if (r0 == 0) goto L_0x00ed
            android.content.Context r0 = r1.f15407a
            boolean r9 = t6.i.a(r0)
            android.os.StrictMode$ThreadPolicy r16 = android.os.StrictMode.allowThreadDiskReads()
            android.content.Context r0 = t6.x.f15423e     // Catch:{ all -> 0x00e8 }
            u6.q.i(r0)     // Catch:{ all -> 0x00e8 }
            t6.x.b()     // Catch:{ a -> 0x00cc }
            t6.y r0 = new t6.y     // Catch:{ all -> 0x00e8 }
            r10 = 0
            android.content.Context r7 = t6.x.f15423e     // Catch:{ all -> 0x00e8 }
            c7.b r11 = new c7.b     // Catch:{ all -> 0x00e8 }
            r11.<init>(r7)     // Catch:{ all -> 0x00e8 }
            r17 = 0
            r18 = 1
            r7 = r0
            r8 = r14
            r4 = r12
            r12 = r17
            r19 = r13
            r13 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00e8 }
            u6.r0 r7 = t6.x.f15421c     // Catch:{ RemoteException -> 0x00bf }
            t6.a0 r0 = r7.J(r0)     // Catch:{ RemoteException -> 0x00bf }
            boolean r7 = r0.f15373a     // Catch:{ all -> 0x00e8 }
            if (r7 == 0) goto L_0x0097
            int r0 = r0.f15376d     // Catch:{ all -> 0x00e8 }
            cb.b.N(r0)     // Catch:{ all -> 0x00e8 }
            t6.f0 r0 = new t6.f0     // Catch:{ all -> 0x00e8 }
            r0.<init>(r4, r5, r5)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e4
        L_0x0097:
            java.lang.String r4 = r0.f15374b     // Catch:{ all -> 0x00e8 }
            int r7 = r0.f15375c     // Catch:{ all -> 0x00e8 }
            int r7 = cb.b.O(r7)     // Catch:{ all -> 0x00e8 }
            r8 = 4
            if (r7 != r8) goto L_0x00a8
            android.content.pm.PackageManager$NameNotFoundException r7 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ all -> 0x00e8 }
            r7.<init>()     // Catch:{ all -> 0x00e8 }
            goto L_0x00a9
        L_0x00a8:
            r7 = r5
        L_0x00a9:
            java.lang.String r8 = "error checking package certificate"
            if (r4 != 0) goto L_0x00ae
            r4 = r8
        L_0x00ae:
            int r8 = r0.f15376d     // Catch:{ all -> 0x00e8 }
            cb.b.N(r8)     // Catch:{ all -> 0x00e8 }
            int r0 = r0.f15375c     // Catch:{ all -> 0x00e8 }
            cb.b.O(r0)     // Catch:{ all -> 0x00e8 }
            t6.f0 r0 = new t6.f0     // Catch:{ all -> 0x00e8 }
            r8 = 0
            r0.<init>(r8, r4, r7)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e4
        L_0x00bf:
            r0 = move-exception
            r4 = r19
            android.util.Log.e(r4, r15, r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "module call"
            t6.f0 r0 = t6.f0.c(r4, r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e4
        L_0x00cc:
            r0 = move-exception
            r4 = r13
            r7 = r0
            android.util.Log.e(r4, r15, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "module init: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x00e8 }
            t6.f0 r0 = t6.f0.c(r0, r7)     // Catch:{ all -> 0x00e8 }
        L_0x00e4:
            android.os.StrictMode.setThreadPolicy(r16)
            goto L_0x0106
        L_0x00e8:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r16)
            throw r0
        L_0x00ed:
            r4 = r12
            android.content.Context r0 = r1.f15407a     // Catch:{ NameNotFoundException -> 0x016d }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016d }
            r8 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r14, r8)     // Catch:{ NameNotFoundException -> 0x016d }
            android.content.Context r8 = r1.f15407a
            boolean r8 = t6.i.a(r8)
            if (r0 != 0) goto L_0x0108
            t6.f0 r0 = t6.f0.b(r7)
        L_0x0106:
            r12 = 0
            goto L_0x0166
        L_0x0108:
            android.content.pm.Signature[] r7 = r0.signatures
            if (r7 == 0) goto L_0x015f
            int r7 = r7.length
            if (r7 == r4) goto L_0x0110
            goto L_0x015f
        L_0x0110:
            t6.u r7 = new t6.u
            android.content.pm.Signature[] r9 = r0.signatures
            r10 = 0
            r9 = r9[r10]
            byte[] r9 = r9.toByteArray()
            r7.<init>(r9)
            java.lang.String r9 = r0.packageName
            android.os.StrictMode$ThreadPolicy r11 = android.os.StrictMode.allowThreadDiskReads()
            t6.f0 r8 = t6.x.a(r9, r7, r8, r10)     // Catch:{ all -> 0x0159 }
            android.os.StrictMode.setThreadPolicy(r11)
            boolean r10 = r8.f15398a
            if (r10 == 0) goto L_0x0156
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L_0x0156
            int r0 = r0.flags
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0156
            android.os.StrictMode$ThreadPolicy r10 = android.os.StrictMode.allowThreadDiskReads()
            r12 = 0
            t6.f0 r0 = t6.x.a(r9, r7, r12, r4)     // Catch:{ all -> 0x0150 }
            android.os.StrictMode.setThreadPolicy(r10)
            boolean r0 = r0.f15398a
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "debuggable release cert app rejected"
            t6.f0 r0 = t6.f0.b(r0)
            goto L_0x0166
        L_0x0150:
            r0 = move-exception
            r2 = r0
            android.os.StrictMode.setThreadPolicy(r10)
            throw r2
        L_0x0156:
            r12 = 0
        L_0x0157:
            r0 = r8
            goto L_0x0166
        L_0x0159:
            r0 = move-exception
            r2 = r0
            android.os.StrictMode.setThreadPolicy(r11)
            throw r2
        L_0x015f:
            r12 = 0
            java.lang.String r0 = "single cert required"
            t6.f0 r0 = t6.f0.b(r0)
        L_0x0166:
            boolean r4 = r0.f15398a
            if (r4 == 0) goto L_0x0181
            r1.f15408b = r14
            goto L_0x0181
        L_0x016d:
            r0 = move-exception
            r12 = 0
            java.lang.String r4 = "no pkg "
            java.lang.String r4 = r4.concat(r14)
            t6.f0 r0 = t6.f0.c(r4, r0)
            goto L_0x0181
        L_0x017a:
            android.os.StrictMode.setThreadPolicy(r8)
            throw r0
        L_0x017e:
            r12 = 0
            t6.f0 r0 = t6.f0.f15397d
        L_0x0181:
            boolean r4 = r0.f15398a
            if (r4 == 0) goto L_0x0186
            goto L_0x0194
        L_0x0186:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x018a:
            u6.q.i(r0)
            goto L_0x0194
        L_0x018e:
            java.lang.String r0 = "no pkgs"
            t6.f0 r0 = t6.f0.b(r0)
        L_0x0194:
            boolean r2 = r0.f15398a
            if (r2 != 0) goto L_0x01b4
            r2 = 3
            java.lang.String r3 = "GoogleCertificatesRslt"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x01b4
            java.lang.Throwable r2 = r0.f15400c
            if (r2 == 0) goto L_0x01ad
            java.lang.String r4 = r0.a()
            android.util.Log.d(r3, r4, r2)
            goto L_0x01b4
        L_0x01ad:
            java.lang.String r2 = r0.a()
            android.util.Log.d(r3, r2)
        L_0x01b4:
            boolean r0 = r0.f15398a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.j.b(int):boolean");
    }
}
