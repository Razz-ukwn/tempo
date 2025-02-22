package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.lifecycle.u;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q0  reason: invalid package */
public final class q0 implements m {

    /* renamed from: a  reason: collision with root package name */
    public String f4825a;

    /* renamed from: b  reason: collision with root package name */
    public String f4826b;

    /* renamed from: c  reason: collision with root package name */
    public String f4827c;

    /* renamed from: d  reason: collision with root package name */
    public final u f4828d = new u();

    /* renamed from: e  reason: collision with root package name */
    public final u f4829e = new u();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() {
        /*
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            androidx.lifecycle.u r1 = r11.f4829e
            java.lang.Object r3 = r1.f2324b
            java.util.List r3 = (java.util.List) r3
            boolean r3 = r3.isEmpty()
            r4 = 0
            if (r3 != 0) goto L_0x0037
            java.lang.Object r1 = r1.f2324b
            java.util.List r1 = (java.util.List) r1
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r5 = r4
        L_0x0022:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0032
            java.lang.Object r6 = r1.get(r5)
            r3.put(r6)
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0032:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r3)
        L_0x0037:
            androidx.lifecycle.u r1 = r11.f4828d
            java.lang.Object r1 = r1.f2324b
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            int[] r5 = new int[r3]
            r6 = r4
        L_0x0044:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0097
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L_0x0078;
                case 66081660: goto L_0x006e;
                case 1939891618: goto L_0x0064;
                case 1999612571: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0082
        L_0x005a:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0082
            r7 = r10
            goto L_0x0083
        L_0x0064:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0082
            r7 = r9
            goto L_0x0083
        L_0x006e:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0082
            r7 = r4
            goto L_0x0083
        L_0x0078:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0082
            r7 = r2
            goto L_0x0083
        L_0x0082:
            r7 = -1
        L_0x0083:
            if (r7 == 0) goto L_0x0091
            if (r7 == r2) goto L_0x0092
            if (r7 == r10) goto L_0x008f
            if (r7 == r9) goto L_0x008d
            r10 = r4
            goto L_0x0092
        L_0x008d:
            r10 = 4
            goto L_0x0092
        L_0x008f:
            r10 = 5
            goto L_0x0092
        L_0x0091:
            r10 = r2
        L_0x0092:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0097:
            if (r3 <= 0) goto L_0x00ad
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x009e:
            if (r4 >= r3) goto L_0x00a8
            r2 = r5[r4]
            r1.put(r2)
            int r4 = r4 + 1
            goto L_0x009e
        L_0x00a8:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        L_0x00ad:
            java.lang.String r1 = r11.f4825a
            if (r1 == 0) goto L_0x00b6
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x00b6:
            java.lang.String r1 = r11.f4826b
            if (r1 == 0) goto L_0x00bf
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x00bf:
            java.lang.String r1 = r11.f4827c
            if (r1 == 0) goto L_0x00c8
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        L_0x00c8:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.q0.zza():java.lang.String");
    }
}
