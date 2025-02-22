package q7;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import r3.u;
import u6.q;

public final class d5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f12965a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e5 f12966b;

    /* renamed from: c  reason: collision with root package name */
    public final u f12967c;

    public d5(e5 e5Var, String str, URL url, u uVar) {
        this.f12966b = e5Var;
        q.f(str);
        this.f12965a = url;
        this.f12967c = uVar;
    }

    public final void a(int i8, IOException iOException, byte[] bArr, Map map) {
        w3 w3Var = ((x3) this.f12966b.f13121a).F;
        x3.l(w3Var);
        w3Var.q(new c5(this, i8, iOException, bArr, map));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[SYNTHETIC, Splitter:B:26:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            q7.e5 r0 = r10.f12966b
            q7.k4 r1 = r0.f13121a
            q7.x3 r1 = (q7.x3) r1
            q7.w3 r1 = r1.F
            q7.x3.l(r1)
            r1.m()
            q7.k4 r0 = r0.f13121a
            r1 = 0
            r2 = 0
            java.net.URL r3 = r10.f12965a     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            if (r4 == 0) goto L_0x008a
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r3.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r4 = r0
            q7.x3 r4 = (q7.x3) r4     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r4.getClass()     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            q7.x3 r0 = (q7.x3) r0     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r0.getClass()     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r0 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r0)     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            r0 = 1
            r3.setDoInput(r0)     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x0080, all -> 0x007a }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x006e }
            r5.<init>()     // Catch:{ all -> 0x006e }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ all -> 0x006e }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x006c }
        L_0x0054:
            int r8 = r6.read(r7)     // Catch:{ all -> 0x006c }
            if (r8 <= 0) goto L_0x005e
            r5.write(r7, r1, r8)     // Catch:{ all -> 0x006c }
            goto L_0x0054
        L_0x005e:
            byte[] r1 = r5.toByteArray()     // Catch:{ all -> 0x006c }
            r6.close()     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            r3.disconnect()
            r10.a(r0, r2, r1, r4)
            return
        L_0x006c:
            r1 = move-exception
            goto L_0x0070
        L_0x006e:
            r1 = move-exception
            r6 = r2
        L_0x0070:
            if (r6 == 0) goto L_0x0075
            r6.close()     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
        L_0x0075:
            throw r1     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            goto L_0x007c
        L_0x0078:
            r1 = move-exception
            goto L_0x0082
        L_0x007a:
            r1 = move-exception
            r4 = r2
        L_0x007c:
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0095
        L_0x0080:
            r1 = move-exception
            r4 = r2
        L_0x0082:
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x00a1
        L_0x0086:
            r0 = move-exception
            goto L_0x0094
        L_0x0088:
            r0 = move-exception
            goto L_0x00a0
        L_0x008a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r0.<init>(r3)     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
            throw r0     // Catch:{ IOException -> 0x009e, all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            r3 = r2
        L_0x0094:
            r4 = r2
        L_0x0095:
            if (r3 == 0) goto L_0x009a
            r3.disconnect()
        L_0x009a:
            r10.a(r1, r2, r2, r4)
            throw r0
        L_0x009e:
            r0 = move-exception
            r3 = r2
        L_0x00a0:
            r4 = r2
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.disconnect()
        L_0x00a6:
            r10.a(r1, r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.d5.run():void");
    }
}
