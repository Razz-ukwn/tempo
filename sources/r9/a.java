package r9;

import android.net.Uri;
import java.util.Set;
import u6.q;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f14110c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f14111a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14112b;

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r1v12 ?, r1v18 ?, r1v15 ?, r1v19 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    static {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "recoverEmail"
            r0.put(r3, r2)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "resetPassword"
            r0.put(r4, r3)
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "signIn"
            r0.put(r5, r4)
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "verifyEmail"
            r0.put(r6, r5)
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "verifyBeforeChangeEmail"
            r0.put(r6, r5)
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "revertSecondFactorAddition"
            r0.put(r6, r5)
            java.util.Set r0 = r0.entrySet()
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L_0x004d
            int r3 = r0.size()
        L_0x004d:
            int r3 = r3 + r3
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r7 = -1
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == 0) goto L_0x0071
            int r5 = r0.size()
            int r5 = r5 + r2
            int r5 = r5 + r5
            if (r5 <= r3) goto L_0x0071
            int r9 = r3 >> 1
            int r3 = r3 + r9
            int r3 = r3 + r4
            if (r3 >= r5) goto L_0x006a
            int r5 = r5 + r7
            int r3 = java.lang.Integer.highestOneBit(r5)
            int r3 = r3 + r3
        L_0x006a:
            if (r3 >= 0) goto L_0x006d
            r3 = r8
        L_0x006d:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)
        L_0x0071:
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x0076:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00d3
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r9 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            int r10 = r3 + 1
            int r11 = r6.length
            int r12 = r10 + r10
            if (r12 <= r11) goto L_0x00a5
            int r13 = r11 >> 1
            int r11 = r11 + r13
            int r11 = r11 + r4
            if (r11 >= r12) goto L_0x009e
            int r12 = r12 + -1
            int r11 = java.lang.Integer.highestOneBit(r12)
            int r11 = r11 + r11
        L_0x009e:
            if (r11 >= 0) goto L_0x00a1
            r11 = r8
        L_0x00a1:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r11)
        L_0x00a5:
            if (r9 == 0) goto L_0x00c3
            if (r5 == 0) goto L_0x00b1
            int r3 = r3 + r3
            r6[r3] = r9
            int r3 = r3 + r4
            r6[r3] = r5
            r3 = r10
            goto L_0x0076
        L_0x00b1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = r9.toString()
            java.lang.String r2 = "null value in entry: "
            java.lang.String r3 = "=null"
            java.lang.String r1 = b2.c.a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "null key in entry: null="
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            if (r3 != 0) goto L_0x00d7
            goto L_0x0272
        L_0x00d7:
            if (r3 != r4) goto L_0x00e5
            r0 = r6[r2]
            r0.getClass()
            r0 = r6[r4]
            r0.getClass()
            goto L_0x0272
        L_0x00e5:
            int r0 = r6.length
            int r0 = r0 >> r4
            com.google.android.gms.internal.p000firebaseauthapi.wh.b(r3, r0)
            int r0 = java.lang.Math.max(r3, r1)
            r1 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r0 >= r1) goto L_0x0107
            int r1 = r0 + -1
            int r1 = java.lang.Integer.highestOneBit(r1)
        L_0x00f9:
            int r1 = r1 + r1
            double r8 = (double) r1
            r10 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r8 = r8 * r10
            double r10 = (double) r0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x010b
            goto L_0x00f9
        L_0x0107:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 >= r1) goto L_0x02b6
        L_0x010b:
            if (r3 != r4) goto L_0x011a
            r0 = r6[r2]
            r0.getClass()
            r0 = r6[r4]
            r0.getClass()
            r0 = 0
            goto L_0x024a
        L_0x011a:
            int r0 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r8 = 3
            if (r1 > r5) goto L_0x0189
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = r2
            r9 = r7
        L_0x0129:
            if (r7 >= r3) goto L_0x0175
            int r10 = r9 + r9
            int r11 = r7 + r7
            r12 = r6[r11]
            r12.getClass()
            r11 = r11 ^ r4
            r11 = r6[r11]
            r11.getClass()
            int r13 = r12.hashCode()
            int r13 = ag.m.r(r13)
        L_0x0142:
            r13 = r13 & r0
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0158
            byte r14 = (byte) r10
            r1[r13] = r14
            if (r9 >= r7) goto L_0x0155
            r6[r10] = r12
            r10 = r10 ^ 1
            r6[r10] = r11
        L_0x0155:
            int r9 = r9 + 1
            goto L_0x016f
        L_0x0158:
            r15 = r6[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0172
            r5 = r14 ^ 1
            com.google.android.gms.internal.firebase-auth-api.f5 r10 = new com.google.android.gms.internal.firebase-auth-api.f5
            r13 = r6[r5]
            r13.getClass()
            r10.<init>(r12, r11, r13)
            r6[r5] = r11
            r5 = r10
        L_0x016f:
            int r7 = r7 + 1
            goto L_0x0129
        L_0x0172:
            int r13 = r13 + 1
            goto L_0x0142
        L_0x0175:
            if (r9 != r3) goto L_0x017a
        L_0x0177:
            r0 = r1
            goto L_0x024a
        L_0x017a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r4] = r1
            r1 = 2
            r0[r1] = r5
            goto L_0x024a
        L_0x0189:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x01f4
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r7 = r2
            r9 = r7
        L_0x0196:
            if (r7 >= r3) goto L_0x01e3
            int r10 = r9 + r9
            int r11 = r7 + r7
            r12 = r6[r11]
            r12.getClass()
            r11 = r11 ^ r4
            r11 = r6[r11]
            r11.getClass()
            int r13 = r12.hashCode()
            int r13 = ag.m.r(r13)
        L_0x01af:
            r13 = r13 & r0
            short r14 = r1[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x01c6
            short r14 = (short) r10
            r1[r13] = r14
            if (r9 >= r7) goto L_0x01c3
            r6[r10] = r12
            r10 = r10 ^ 1
            r6[r10] = r11
        L_0x01c3:
            int r9 = r9 + 1
            goto L_0x01dd
        L_0x01c6:
            r15 = r6[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x01e0
            r5 = r14 ^ 1
            com.google.android.gms.internal.firebase-auth-api.f5 r10 = new com.google.android.gms.internal.firebase-auth-api.f5
            r13 = r6[r5]
            r13.getClass()
            r10.<init>(r12, r11, r13)
            r6[r5] = r11
            r5 = r10
        L_0x01dd:
            int r7 = r7 + 1
            goto L_0x0196
        L_0x01e0:
            int r13 = r13 + 1
            goto L_0x01af
        L_0x01e3:
            if (r9 != r3) goto L_0x01e6
            goto L_0x0248
        L_0x01e6:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r4] = r1
            r1 = 2
            r0[r1] = r5
            goto L_0x0259
        L_0x01f4:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r7)
            r5 = 0
            r9 = r2
            r10 = r9
        L_0x01fc:
            if (r9 >= r3) goto L_0x0246
            int r11 = r10 + r10
            int r12 = r9 + r9
            r13 = r6[r12]
            r13.getClass()
            r12 = r12 ^ r4
            r12 = r6[r12]
            r12.getClass()
            int r14 = r13.hashCode()
            int r14 = ag.m.r(r14)
        L_0x0215:
            r14 = r14 & r0
            r15 = r1[r14]
            if (r15 != r7) goto L_0x0227
            r1[r14] = r11
            if (r10 >= r9) goto L_0x0224
            r6[r11] = r13
            r7 = r11 ^ 1
            r6[r7] = r12
        L_0x0224:
            int r10 = r10 + 1
            goto L_0x023e
        L_0x0227:
            r7 = r6[r15]
            boolean r7 = r13.equals(r7)
            if (r7 == 0) goto L_0x0242
            r5 = r15 ^ 1
            com.google.android.gms.internal.firebase-auth-api.f5 r7 = new com.google.android.gms.internal.firebase-auth-api.f5
            r11 = r6[r5]
            r11.getClass()
            r7.<init>(r13, r12, r11)
            r6[r5] = r12
            r5 = r7
        L_0x023e:
            int r9 = r9 + 1
            r7 = -1
            goto L_0x01fc
        L_0x0242:
            int r14 = r14 + 1
            r7 = -1
            goto L_0x0215
        L_0x0246:
            if (r10 != r3) goto L_0x024c
        L_0x0248:
            goto L_0x0177
        L_0x024a:
            r1 = 2
            goto L_0x0259
        L_0x024c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r4] = r1
            r1 = 2
            r0[r1] = r5
        L_0x0259:
            boolean r3 = r0 instanceof java.lang.Object[]
            if (r3 == 0) goto L_0x0272
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r1]
            com.google.android.gms.internal.firebase-auth-api.f5 r1 = (com.google.android.gms.internal.p000firebaseauthapi.f5) r1
            r2 = r0[r2]
            r0 = r0[r4]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + r0
            java.util.Arrays.copyOf(r6, r0)
            goto L_0x0273
        L_0x0272:
            r1 = 0
        L_0x0273:
            if (r1 != 0) goto L_0x0276
            return
        L_0x0276:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object r2 = r1.f4540a
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.Object r4 = r1.f4541b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r1 = r1.f4542c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Multiple entries with same key: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = "="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r4 = " and "
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x02b6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.a.<clinit>():void");
    }

    public a(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 == null || a11 == null || a12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        q.f(a10);
        q.f(a11);
        this.f14111a = a11;
        q.f(a12);
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f14112b = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = parse.getQueryParameter("link");
            q.f(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
