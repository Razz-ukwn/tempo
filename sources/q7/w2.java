package q7;

import java.net.URL;
import java.util.Map;
import u6.q;

public final class w2 implements Runnable {
    public final /* synthetic */ y2 B;

    /* renamed from: a  reason: collision with root package name */
    public final URL f13393a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f13394b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f13395c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13396d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f13397e;

    public w2(y2 y2Var, String str, URL url, byte[] bArr, Map map, u2 u2Var) {
        this.B = y2Var;
        q.f(str);
        this.f13393a = url;
        this.f13394b = bArr;
        this.f13395c = u2Var;
        this.f13396d = str;
        this.f13397e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7 A[SYNTHETIC, Splitter:B:41:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123 A[SYNTHETIC, Splitter:B:63:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015c A[SYNTHETIC, Splitter:B:74:0x015c] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r1 = r14.f13396d
            q7.y2 r2 = r14.B
            q7.k4 r3 = r2.f13121a
            q7.x3 r3 = (q7.x3) r3
            q7.w3 r3 = r3.F
            q7.x3.l(r3)
            r3.m()
            q7.k4 r3 = r2.f13121a
            r4 = 0
            r5 = 0
            java.net.URL r6 = r14.f13393a     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            boolean r7 = r6 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            if (r7 == 0) goto L_0x0113
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r6.setDefaultUseCaches(r4)     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7 = r3
            q7.x3 r7 = (q7.x3) r7     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7.getClass()     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7 = 60000(0xea60, float:8.4078E-41)
            r6.setConnectTimeout(r7)     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7 = r3
            q7.x3 r7 = (q7.x3) r7     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7.getClass()     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7 = 61000(0xee48, float:8.5479E-41)
            r6.setReadTimeout(r7)     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r6.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            r7 = 1
            r6.setDoInput(r7)     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            java.util.Map r8 = r14.f13397e     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            if (r8 == 0) goto L_0x006c
            java.util.Set r8 = r8.entrySet()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
        L_0x0050:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            if (r9 == 0) goto L_0x006c
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.Object r10 = r9.getKey()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.Object r9 = r9.getValue()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r6.addRequestProperty(r10, r9)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            goto L_0x0050
        L_0x006c:
            byte[] r8 = r14.f13394b
            if (r8 == 0) goto L_0x00b4
            q7.t6 r2 = r2.f13208b     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            q7.v6 r2 = r2.C     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            q7.t6.H(r2)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            byte[] r2 = r2.K(r8)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r8 = r3
            q7.x3 r8 = (q7.x3) r8     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            q7.s2 r8 = r8.E     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            q7.x3.l(r8)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            q7.q2 r8 = r8.J     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.String r9 = "Uploading data. size"
            int r10 = r2.length     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r8.c(r11, r9)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r6.setDoOutput(r7)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r6.addRequestProperty(r7, r8)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r6.setFixedLengthStreamingMode(r10)     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r6.connect()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            r7.write(r2)     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            r7.close()     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            goto L_0x00b4
        L_0x00aa:
            r2 = move-exception
            goto L_0x011e
        L_0x00ad:
            r2 = move-exception
            r10 = r2
            r9 = r4
            r12 = r5
            r5 = r7
            goto L_0x015a
        L_0x00b4:
            int r10 = r6.getResponseCode()     // Catch:{ IOException -> 0x010e, all -> 0x010b }
            java.util.Map r13 = r6.getHeaderFields()     // Catch:{ IOException -> 0x0105, all -> 0x0101 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00f3 }
            r2.<init>()     // Catch:{ all -> 0x00f3 }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ all -> 0x00f3 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x00f1 }
        L_0x00c9:
            int r9 = r7.read(r8)     // Catch:{ all -> 0x00f1 }
            if (r9 <= 0) goto L_0x00d3
            r2.write(r8, r4, r9)     // Catch:{ all -> 0x00f1 }
            goto L_0x00c9
        L_0x00d3:
            byte[] r12 = r2.toByteArray()     // Catch:{ all -> 0x00f1 }
            r7.close()     // Catch:{ IOException -> 0x00ff, all -> 0x00fb }
            r6.disconnect()
            q7.x3 r3 = (q7.x3) r3
            q7.w3 r0 = r3.F
            q7.x3.l(r0)
            q7.v2 r1 = new q7.v2
            java.lang.String r8 = r14.f13396d
            q7.u2 r9 = r14.f13395c
            r11 = 0
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x0189
        L_0x00f1:
            r2 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r2 = move-exception
            r7 = r5
        L_0x00f5:
            if (r7 == 0) goto L_0x00fa
            r7.close()     // Catch:{ IOException -> 0x00ff, all -> 0x00fb }
        L_0x00fa:
            throw r2     // Catch:{ IOException -> 0x00ff, all -> 0x00fb }
        L_0x00fb:
            r2 = move-exception
            r7 = r10
            r10 = r13
            goto L_0x0121
        L_0x00ff:
            r2 = move-exception
            goto L_0x0107
        L_0x0101:
            r2 = move-exception
            r7 = r10
            r10 = r5
            goto L_0x0121
        L_0x0105:
            r2 = move-exception
            r13 = r5
        L_0x0107:
            r9 = r10
            r12 = r13
            r10 = r2
            goto L_0x015a
        L_0x010b:
            r2 = move-exception
            r7 = r5
            goto L_0x011e
        L_0x010e:
            r2 = move-exception
            r10 = r2
            r9 = r4
            r12 = r5
            goto L_0x015a
        L_0x0113:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            java.lang.String r6 = "Failed to obtain HTTP connection"
            r2.<init>(r6)     // Catch:{ IOException -> 0x0155, all -> 0x011b }
            throw r2     // Catch:{ IOException -> 0x0155, all -> 0x011b }
        L_0x011b:
            r2 = move-exception
            r6 = r5
            r7 = r6
        L_0x011e:
            r10 = r5
            r5 = r7
            r7 = r4
        L_0x0121:
            if (r5 == 0) goto L_0x0139
            r5.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x0139
        L_0x0127:
            r4 = move-exception
            r5 = r3
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r5 = r5.E
            q7.x3.l(r5)
            q7.r2 r1 = q7.s2.r(r1)
            q7.q2 r5 = r5.B
            r5.d(r1, r4, r0)
        L_0x0139:
            if (r6 == 0) goto L_0x013e
            r6.disconnect()
        L_0x013e:
            q7.x3 r3 = (q7.x3) r3
            q7.w3 r0 = r3.F
            q7.x3.l(r0)
            q7.v2 r1 = new q7.v2
            java.lang.String r5 = r14.f13396d
            q7.u2 r6 = r14.f13395c
            r8 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.q(r1)
            throw r2
        L_0x0155:
            r2 = move-exception
            r10 = r2
            r9 = r4
            r6 = r5
            r12 = r6
        L_0x015a:
            if (r5 == 0) goto L_0x0172
            r5.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0172
        L_0x0160:
            r2 = move-exception
            r4 = r3
            q7.x3 r4 = (q7.x3) r4
            q7.s2 r4 = r4.E
            q7.x3.l(r4)
            q7.r2 r1 = q7.s2.r(r1)
            q7.q2 r4 = r4.B
            r4.d(r1, r2, r0)
        L_0x0172:
            if (r6 == 0) goto L_0x0177
            r6.disconnect()
        L_0x0177:
            q7.x3 r3 = (q7.x3) r3
            q7.w3 r0 = r3.F
            q7.x3.l(r0)
            q7.v2 r1 = new q7.v2
            java.lang.String r7 = r14.f13396d
            q7.u2 r8 = r14.f13395c
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0189:
            r0.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.w2.run():void");
    }
}
