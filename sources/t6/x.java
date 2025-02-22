package t6;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import c7.b;
import com.google.android.gms.dynamite.DynamiteModule;
import u6.q;
import u6.r0;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final r f15419a = new r(t.O("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: b  reason: collision with root package name */
    public static final s f15420b = new s(t.O("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: c  reason: collision with root package name */
    public static volatile r0 f15421c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f15422d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static Context f15423e;

    static {
        new p(t.O("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new q(t.O("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    public static f0 a(String str, t tVar, boolean z10, boolean z11) {
        try {
            b();
            q.i(f15423e);
            try {
                return f15421c.F(new c0(str, tVar, z10, z11), new b(f15423e.getPackageManager())) ? f0.f15397d : new e0(new o(z10, str, tVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return f0.c("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return f0.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
            u6.r0 r0 = f15421c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = f15423e
            u6.q.i(r0)
            java.lang.Object r0 = f15422d
            monitor-enter(r0)
            u6.r0 r1 = f15421c     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            android.content.Context r1 = f15423e     // Catch:{ all -> 0x003f }
            com.google.android.gms.dynamite.c r2 = com.google.android.gms.dynamite.DynamiteModule.f4349c     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.c(r1, r2, r3)     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.b(r2)     // Catch:{ all -> 0x003f }
            int r2 = u6.q0.f15851b     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x003b
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ all -> 0x003f }
            boolean r3 = r2 instanceof u6.r0     // Catch:{ all -> 0x003f }
            if (r3 == 0) goto L_0x0035
            r1 = r2
            u6.r0 r1 = (u6.r0) r1     // Catch:{ all -> 0x003f }
            goto L_0x003b
        L_0x0035:
            u6.p0 r2 = new u6.p0     // Catch:{ all -> 0x003f }
            r2.<init>(r1)     // Catch:{ all -> 0x003f }
            r1 = r2
        L_0x003b:
            f15421c = r1     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.x.b():void");
    }
}
