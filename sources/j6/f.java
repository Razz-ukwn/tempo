package j6;

import d6.j;
import d6.s;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f9813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f9814b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9815c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f9816d;

    public /* synthetic */ f(n nVar, j jVar, int i8, Runnable runnable) {
        this.f9813a = nVar;
        this.f9814b = jVar;
        this.f9815c = i8;
        this.f9816d = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.f9838d.b(r0, r1 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            d6.s r0 = r8.f9814b
            int r1 = r8.f9815c
            java.lang.Runnable r2 = r8.f9816d
            j6.n r3 = r8.f9813a
            l6.b r4 = r3.f9840f
            r5 = 1
            k6.d r6 = r3.f9837c     // Catch:{ a -> 0x0042 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ a -> 0x0042 }
            j0.p r7 = new j0.p     // Catch:{ a -> 0x0042 }
            r7.<init>(r6, r5)     // Catch:{ a -> 0x0042 }
            r4.d(r7)     // Catch:{ a -> 0x0042 }
            android.content.Context r6 = r3.f9835a     // Catch:{ a -> 0x0042 }
            java.lang.String r7 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ a -> 0x0042 }
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch:{ a -> 0x0042 }
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch:{ a -> 0x0042 }
            if (r6 == 0) goto L_0x0030
            boolean r6 = r6.isConnected()     // Catch:{ a -> 0x0042 }
            if (r6 == 0) goto L_0x0030
            r6 = r5
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            if (r6 != 0) goto L_0x003c
            j6.g r6 = new j6.g     // Catch:{ a -> 0x0042 }
            r6.<init>(r3, r0, r1)     // Catch:{ a -> 0x0042 }
            r4.d(r6)     // Catch:{ a -> 0x0042 }
            goto L_0x0048
        L_0x003c:
            r3.a(r0, r1)     // Catch:{ a -> 0x0042 }
            goto L_0x0048
        L_0x0040:
            r0 = move-exception
            goto L_0x004c
        L_0x0042:
            j6.r r3 = r3.f9838d     // Catch:{ all -> 0x0040 }
            int r1 = r1 + r5
            r3.b(r0, r1)     // Catch:{ all -> 0x0040 }
        L_0x0048:
            r2.run()
            return
        L_0x004c:
            r2.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.f.run():void");
    }
}
