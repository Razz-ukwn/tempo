package da;

import h0.e;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7386a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f7387b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7388c = new HashMap();

    public a(String str, HashMap hashMap) {
        this.f7386a = str;
        this.f7387b = hashMap;
    }

    public static String a(String str, Map map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return e.b(str, "?", sb3);
        }
        if (!str.endsWith("&")) {
            sb3 = "&".concat(sb3);
        }
        return h4.a.c(str, sb3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c2.e b() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            r2 = 0
            java.lang.String r3 = r8.f7386a     // Catch:{ all -> 0x00a7 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f7387b     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = a(r3, r4)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a7 }
            r4.append(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00a7 }
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0023
            android.util.Log.v(r0, r1, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0023:
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00a7 }
            r0.<init>(r3)     // Catch:{ all -> 0x00a7 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x00a7 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ all -> 0x00a7 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch:{ all -> 0x00a5 }
            r0.setConnectTimeout(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch:{ all -> 0x00a5 }
            java.util.HashMap r1 = r8.f7388c     // Catch:{ all -> 0x00a5 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0045:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a5 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a5 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a5 }
            r0.addRequestProperty(r4, r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x0045
        L_0x0061:
            r0.connect()     // Catch:{ all -> 0x00a5 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x00a5 }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x0097
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0094 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0094 }
            r2.<init>(r4)     // Catch:{ all -> 0x0094 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
        L_0x0083:
            int r6 = r2.read(r4)     // Catch:{ all -> 0x0094 }
            r7 = -1
            if (r6 == r7) goto L_0x008f
            r7 = 0
            r5.append(r4, r7, r6)     // Catch:{ all -> 0x0094 }
            goto L_0x0083
        L_0x008f:
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0094 }
            goto L_0x0097
        L_0x0094:
            r1 = move-exception
            r2 = r3
            goto L_0x00aa
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r3.close()
        L_0x009c:
            r0.disconnect()
            c2.e r0 = new c2.e
            r0.<init>(r1, r2)
            return r0
        L_0x00a5:
            r1 = move-exception
            goto L_0x00aa
        L_0x00a7:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r2.close()
        L_0x00af:
            if (r0 == 0) goto L_0x00b4
            r0.disconnect()
        L_0x00b4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: da.a.b():c2.e");
    }
}
