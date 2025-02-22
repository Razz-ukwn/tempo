package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.util.List;
import t.w2;
import ub.x;
import wb.n;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o  reason: invalid package */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int f4766a;

    public /* synthetic */ o(String str) {
        int i8;
        try {
            List k10 = w2.j().k(str);
            if (k10.size() == 1) {
                i8 = Integer.parseInt(str);
            } else {
                if (k10.size() >= 3) {
                    i8 = Integer.parseInt((String) k10.get(2)) + (Integer.parseInt((String) k10.get(1)) * 1000) + (Integer.parseInt((String) k10.get(0)) * 1000000);
                }
                i8 = -1;
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e10}));
            }
        }
        this.f4766a = i8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c A[Catch:{ all -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.p000firebaseauthapi.o b() {
        /*
            java.lang.String r0 = "Failed to get app version for libraryName: firebase-auth"
            java.lang.String r1 = "firebase-auth version is "
            com.google.android.gms.internal.firebase-auth-api.o r2 = new com.google.android.gms.internal.firebase-auth-api.o
            u6.m r3 = u6.m.f15840c
            r3.getClass()
            java.lang.String r4 = "LibraryVersion"
            u6.i r5 = u6.m.f15839b
            java.lang.String r6 = "Please provide a valid libraryName"
            java.lang.String r7 = "firebase-auth"
            u6.q.g(r6, r7)
            java.util.concurrent.ConcurrentHashMap r3 = r3.f15841a
            boolean r6 = r3.containsKey(r7)
            java.lang.String r8 = "UNKNOWN"
            if (r6 == 0) goto L_0x0028
            java.lang.Object r0 = r3.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00d0
        L_0x0028:
            java.util.Properties r6 = new java.util.Properties
            r6.<init>()
            r9 = 0
            java.lang.String r10 = "/%s.properties"
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x0091 }
            r12 = 0
            r11[r12] = r7     // Catch:{ IOException -> 0x0091 }
            java.lang.String r10 = java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x0091 }
            java.lang.Class<u6.m> r11 = u6.m.class
            java.io.InputStream r10 = r11.getResourceAsStream(r10)     // Catch:{ IOException -> 0x0091 }
            if (r10 == 0) goto L_0x0072
            r6.load(r10)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            java.lang.String r11 = "version"
            java.lang.String r9 = r6.getProperty(r11, r9)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            r6.append(r9)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            java.lang.String r6 = r5.f15825a     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            r11 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r11)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            if (r6 == 0) goto L_0x0088
            java.lang.String r6 = r5.f15826b     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            if (r6 != 0) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            java.lang.String r1 = r6.concat(r1)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
        L_0x0069:
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            goto L_0x0088
        L_0x006d:
            r0 = move-exception
            goto L_0x00e3
        L_0x0070:
            r1 = move-exception
            goto L_0x008e
        L_0x0072:
            java.lang.String r1 = r5.f15825a     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            r6 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r6)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r5.f15826b     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            if (r1 != 0) goto L_0x0081
            r1 = r0
            goto L_0x0085
        L_0x0081:
            java.lang.String r1 = r1.concat(r0)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
        L_0x0085:
            android.util.Log.w(r4, r1)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
        L_0x0088:
            if (r10 == 0) goto L_0x00b1
            z6.d.a(r10)
            goto L_0x00b1
        L_0x008e:
            r6 = r9
            r9 = r10
            goto L_0x0093
        L_0x0091:
            r1 = move-exception
            r6 = r9
        L_0x0093:
            java.lang.String r10 = r5.f15825a     // Catch:{ all -> 0x00a9 }
            r11 = 6
            boolean r10 = android.util.Log.isLoggable(r10, r11)     // Catch:{ all -> 0x00a9 }
            if (r10 == 0) goto L_0x00ab
            java.lang.String r10 = r5.f15826b     // Catch:{ all -> 0x00a9 }
            if (r10 != 0) goto L_0x00a1
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            android.util.Log.e(r4, r0, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x00ab
        L_0x00a9:
            r0 = move-exception
            goto L_0x00e2
        L_0x00ab:
            if (r9 == 0) goto L_0x00b0
            z6.d.a(r9)
        L_0x00b0:
            r9 = r6
        L_0x00b1:
            if (r9 != 0) goto L_0x00cc
            java.lang.String r0 = r5.f15825a
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r1 = r5.f15826b
            if (r1 != 0) goto L_0x00c3
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r0 = r1.concat(r0)
        L_0x00c7:
            android.util.Log.d(r4, r0)
        L_0x00ca:
            r0 = r8
            goto L_0x00cd
        L_0x00cc:
            r0 = r9
        L_0x00cd:
            r3.put(r7, r0)
        L_0x00d0:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00dc
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x00de
        L_0x00dc:
            java.lang.String r0 = "-1"
        L_0x00de:
            r2.<init>((java.lang.String) r0)
            return r2
        L_0x00e2:
            r10 = r9
        L_0x00e3:
            if (r10 == 0) goto L_0x00e8
            z6.d.a(r10)
        L_0x00e8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.o.b():com.google.android.gms.internal.firebase-auth-api.o");
    }

    public boolean a(x xVar) {
        return xVar.f15992b >= this.f4766a;
    }

    public /* synthetic */ o(int i8) {
        this.f4766a = i8;
    }
}
