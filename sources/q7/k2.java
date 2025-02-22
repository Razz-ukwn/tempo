package q7;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import u6.q;

public final class k2 extends x2 {
    public String B;
    public long C;
    public final long D;
    public List E;
    public String F;
    public int G;
    public String H;
    public String I;
    public String J;
    public long K = 0;
    public String L = null;

    /* renamed from: c  reason: collision with root package name */
    public String f13149c;

    /* renamed from: d  reason: collision with root package name */
    public String f13150d;

    /* renamed from: e  reason: collision with root package name */
    public int f13151e;

    public k2(x3 x3Var, long j10) {
        super(x3Var);
        this.D = j10;
    }

    public final boolean l() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014a A[Catch:{ IllegalStateException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014b A[Catch:{ IllegalStateException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0154 A[Catch:{ IllegalStateException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0185 A[Catch:{ IllegalStateException -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0218  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r13 = this;
            q7.k4 r0 = r13.f13121a
            r1 = r0
            q7.x3 r1 = (q7.x3) r1
            android.content.Context r2 = r1.f13419a
            java.lang.String r2 = r2.getPackageName()
            android.content.Context r3 = r1.f13419a
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r4 = "Unknown"
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r6 = ""
            r7 = 0
            java.lang.String r8 = "unknown"
            if (r3 != 0) goto L_0x002d
            q7.s2 r9 = r1.E
            q7.x3.l(r9)
            q7.r2 r10 = q7.s2.r(r2)
            java.lang.String r11 = "PackageManager is null, app identity information might be inaccurate. appId"
            q7.q2 r9 = r9.B
            r9.c(r10, r11)
            goto L_0x008b
        L_0x002d:
            java.lang.String r8 = r3.getInstallerPackageName(r2)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0042
        L_0x0032:
            q7.s2 r9 = r1.E
            q7.x3.l(r9)
            q7.r2 r10 = q7.s2.r(r2)
            java.lang.String r11 = "Error retrieving app installer package name. appId"
            q7.q2 r9 = r9.B
            r9.c(r10, r11)
        L_0x0042:
            if (r8 != 0) goto L_0x0047
            java.lang.String r8 = "manual_install"
            goto L_0x0050
        L_0x0047:
            java.lang.String r9 = "com.android.vending"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x0050
            r8 = r6
        L_0x0050:
            r9 = r0
            q7.x3 r9 = (q7.x3) r9     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.Context r9 = r9.f13419a     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r9 = r3.getPackageInfo(r9, r7)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 == 0) goto L_0x008b
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r10 = r3.getApplicationLabel(r10)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r11 != 0) goto L_0x0070
            java.lang.String r10 = r10.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r10 = r4
        L_0x0071:
            java.lang.String r4 = r9.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r5 = r9.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008b
        L_0x0076:
            r9 = r4
            r4 = r10
            goto L_0x007a
        L_0x0079:
            r9 = r4
        L_0x007a:
            q7.s2 r10 = r1.E
            q7.x3.l(r10)
            q7.r2 r11 = q7.s2.r(r2)
            java.lang.String r12 = "Error retrieving package info. appId, appName"
            q7.q2 r10 = r10.B
            r10.d(r11, r4, r12)
            r4 = r9
        L_0x008b:
            r13.f13149c = r2
            r13.B = r8
            r13.f13150d = r4
            r13.f13151e = r5
            r4 = 0
            r13.C = r4
            java.lang.String r4 = r1.f13421b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00ab
            java.lang.String r4 = r1.f13423c
            java.lang.String r5 = "am"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ab
            r4 = 1
            goto L_0x00ac
        L_0x00ab:
            r4 = r7
        L_0x00ac:
            int r5 = r1.m()
            switch(r5) {
                case 0: goto L_0x010f;
                case 1: goto L_0x0102;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00db;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00b4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x011c
        L_0x00b4:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement disabled via the global data collection setting"
            q7.q2 r8 = r8.H
            r8.b(r9)
            goto L_0x0128
        L_0x00c1:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            q7.q2 r8 = r8.G
            r8.b(r9)
            goto L_0x0128
        L_0x00ce:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement disabled via the init parameters"
            q7.q2 r8 = r8.J
            r8.b(r9)
            goto L_0x0128
        L_0x00db:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement disabled via the manifest"
            q7.q2 r8 = r8.H
            r8.b(r9)
            goto L_0x0128
        L_0x00e8:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            q7.q2 r8 = r8.H
            r8.b(r9)
            goto L_0x0128
        L_0x00f5:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement deactivated via the init parameters"
            q7.q2 r8 = r8.J
            r8.b(r9)
            goto L_0x0128
        L_0x0102:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement deactivated via the manifest"
            q7.q2 r8 = r8.H
            r8.b(r9)
            goto L_0x0128
        L_0x010f:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement collection enabled"
            q7.q2 r8 = r8.J
            r8.b(r9)
            goto L_0x0128
        L_0x011c:
            q7.s2 r8 = r1.E
            q7.x3.l(r8)
            java.lang.String r9 = "App measurement disabled due to denied storage consent"
            q7.q2 r8 = r8.H
            r8.b(r9)
        L_0x0128:
            r13.H = r6
            r13.I = r6
            r1.getClass()
            if (r4 == 0) goto L_0x0135
            java.lang.String r4 = r1.f13421b
            r13.I = r4
        L_0x0135:
            r4 = 0
            r8 = r0
            q7.x3 r8 = (q7.x3) r8     // Catch:{ IllegalStateException -> 0x01a3 }
            android.content.Context r8 = r8.f13419a     // Catch:{ IllegalStateException -> 0x01a3 }
            r9 = r0
            q7.x3 r9 = (q7.x3) r9     // Catch:{ IllegalStateException -> 0x01a3 }
            java.lang.String r9 = r9.O     // Catch:{ IllegalStateException -> 0x01a3 }
            java.lang.String r8 = b1.b.q(r8, r9)     // Catch:{ IllegalStateException -> 0x01a3 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01a3 }
            if (r9 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r6 = r8
        L_0x014c:
            r13.H = r6     // Catch:{ IllegalStateException -> 0x01a3 }
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01a3 }
            if (r6 != 0) goto L_0x0183
            r6 = r0
            q7.x3 r6 = (q7.x3) r6     // Catch:{ IllegalStateException -> 0x01a3 }
            android.content.Context r6 = r6.f13419a     // Catch:{ IllegalStateException -> 0x01a3 }
            r8 = r0
            q7.x3 r8 = (q7.x3) r8     // Catch:{ IllegalStateException -> 0x01a3 }
            java.lang.String r8 = r8.O     // Catch:{ IllegalStateException -> 0x01a3 }
            u6.q.i(r6)     // Catch:{ IllegalStateException -> 0x01a3 }
            android.content.res.Resources r9 = r6.getResources()     // Catch:{ IllegalStateException -> 0x01a3 }
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01a3 }
            if (r10 != 0) goto L_0x016c
            goto L_0x0170
        L_0x016c:
            java.lang.String r8 = q7.s3.a(r6)     // Catch:{ IllegalStateException -> 0x01a3 }
        L_0x0170:
            java.lang.String r6 = "admob_app_id"
            java.lang.String r10 = "string"
            int r6 = r9.getIdentifier(r6, r10, r8)     // Catch:{ IllegalStateException -> 0x01a3 }
            if (r6 != 0) goto L_0x017b
            goto L_0x0180
        L_0x017b:
            java.lang.String r6 = r9.getString(r6)     // Catch:{ NotFoundException -> 0x0180 }
            goto L_0x0181
        L_0x0180:
            r6 = r4
        L_0x0181:
            r13.I = r6     // Catch:{ IllegalStateException -> 0x01a3 }
        L_0x0183:
            if (r5 != 0) goto L_0x01b4
            q7.x3 r0 = (q7.x3) r0     // Catch:{ IllegalStateException -> 0x01a3 }
            q7.s2 r0 = r0.E     // Catch:{ IllegalStateException -> 0x01a3 }
            q7.x3.l(r0)     // Catch:{ IllegalStateException -> 0x01a3 }
            q7.q2 r0 = r0.J     // Catch:{ IllegalStateException -> 0x01a3 }
            java.lang.String r5 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f13149c     // Catch:{ IllegalStateException -> 0x01a3 }
            java.lang.String r8 = r13.H     // Catch:{ IllegalStateException -> 0x01a3 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01a3 }
            if (r8 == 0) goto L_0x019d
            java.lang.String r8 = r13.I     // Catch:{ IllegalStateException -> 0x01a3 }
            goto L_0x019f
        L_0x019d:
            java.lang.String r8 = r13.H     // Catch:{ IllegalStateException -> 0x01a3 }
        L_0x019f:
            r0.d(r6, r8, r5)     // Catch:{ IllegalStateException -> 0x01a3 }
            goto L_0x01b4
        L_0x01a3:
            r0 = move-exception
            q7.s2 r5 = r1.E
            q7.x3.l(r5)
            q7.r2 r2 = q7.s2.r(r2)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            q7.q2 r5 = r5.B
            r5.d(r2, r0, r6)
        L_0x01b4:
            r13.E = r4
            r1.getClass()
            q7.f r0 = r1.C
            r0.getClass()
            java.lang.String r2 = "analytics.safelisted_events"
            u6.q.f(r2)
            android.os.Bundle r5 = r0.p()
            q7.k4 r0 = r0.f13121a
            if (r5 != 0) goto L_0x01db
            r2 = r0
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r2 = r2.E
            q7.x3.l(r2)
            java.lang.String r5 = "Failed to load metadata: Metadata bundle is null"
            q7.q2 r2 = r2.B
            r2.b(r5)
            goto L_0x01e1
        L_0x01db:
            boolean r6 = r5.containsKey(r2)
            if (r6 != 0) goto L_0x01e3
        L_0x01e1:
            r2 = r4
            goto L_0x01eb
        L_0x01e3:
            int r2 = r5.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x01eb:
            if (r2 == 0) goto L_0x0215
            r5 = r0
            q7.x3 r5 = (q7.x3) r5     // Catch:{ NotFoundException -> 0x0206 }
            android.content.Context r5 = r5.f13419a     // Catch:{ NotFoundException -> 0x0206 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NotFoundException -> 0x0206 }
            int r2 = r2.intValue()     // Catch:{ NotFoundException -> 0x0206 }
            java.lang.String[] r2 = r5.getStringArray(r2)     // Catch:{ NotFoundException -> 0x0206 }
            if (r2 != 0) goto L_0x0201
            goto L_0x0215
        L_0x0201:
            java.util.List r4 = java.util.Arrays.asList(r2)     // Catch:{ NotFoundException -> 0x0206 }
            goto L_0x0215
        L_0x0206:
            r2 = move-exception
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r5 = "Failed to load string array from metadata: resource not found"
            q7.q2 r0 = r0.B
            r0.c(r2, r5)
        L_0x0215:
            if (r4 != 0) goto L_0x0218
            goto L_0x0249
        L_0x0218:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x022b
            q7.s2 r0 = r1.E
            q7.x3.l(r0)
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            q7.q2 r0 = r0.G
            r0.b(r2)
            goto L_0x024b
        L_0x022b:
            java.util.Iterator r0 = r4.iterator()
        L_0x022f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0249
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            q7.a7 r5 = r1.H
            q7.x3.j(r5)
            java.lang.String r6 = "safelisted event"
            boolean r2 = r5.P(r6, r2)
            if (r2 != 0) goto L_0x022f
            goto L_0x024b
        L_0x0249:
            r13.E = r4
        L_0x024b:
            if (r3 == 0) goto L_0x0256
            android.content.Context r0 = r1.f13419a
            boolean r0 = b7.a.v(r0)
            r13.G = r0
            return
        L_0x0256:
            r13.G = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.k2.m():void");
    }

    public final String n() {
        j();
        q.i(this.f13149c);
        return this.f13149c;
    }

    public final String o() {
        i();
        j();
        q.i(this.H);
        return this.H;
    }

    public final void p() {
        String str;
        i();
        x3 x3Var = (x3) this.f13121a;
        g3 g3Var = x3Var.D;
        x3.j(g3Var);
        if (!g3Var.o().f(g.f13016c)) {
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.I.b("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            a7 a7Var = x3Var.H;
            x3.j(a7Var);
            a7Var.r().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        s2 s2Var2 = x3Var.E;
        x3.l(s2Var2);
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        s2Var2.I.b(String.format("Resetting session stitching token to %s", objArr));
        this.J = str;
        x3Var.J.getClass();
        this.K = System.currentTimeMillis();
    }
}
