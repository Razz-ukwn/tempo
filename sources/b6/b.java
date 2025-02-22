package b6;

import android.content.Context;
import android.net.ConnectivityManager;
import c6.j;
import e6.m;
import j0.t;
import java.net.MalformedURLException;
import java.net.URL;
import la.d;
import la.e;

public final class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final d f3254a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f3255b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3256c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f3257d;

    /* renamed from: e  reason: collision with root package name */
    public final m6.a f3258e;

    /* renamed from: f  reason: collision with root package name */
    public final m6.a f3259f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3260g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f3261a;

        /* renamed from: b  reason: collision with root package name */
        public final j f3262b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3263c;

        public a(URL url, j jVar, String str) {
            this.f3261a = url;
            this.f3262b = jVar;
            this.f3263c = str;
        }
    }

    /* renamed from: b6.b$b  reason: collision with other inner class name */
    public static final class C0039b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3264a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f3265b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3266c;

        public C0039b(int i8, URL url, long j10) {
            this.f3264a = i8;
            this.f3265b = url;
            this.f3266c = j10;
        }
    }

    public b(Context context, m6.a aVar, m6.a aVar2) {
        e eVar = new e();
        c6.b.f3758a.a(eVar);
        eVar.f11049d = true;
        this.f3254a = new d(eVar);
        this.f3256c = context;
        this.f3255b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = a.f3249c;
        try {
            this.f3257d = new URL(str);
            this.f3258e = aVar2;
            this.f3259f = aVar;
            this.f3260g = 130000;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(t.a("Invalid url: ", str), e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        if (c6.o.a.f3836a.get(r0) != null) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d6.h a(d6.n r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.f3255b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            d6.h$a r7 = r7.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.f7336f
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x0115
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r7.a(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r7.a(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r7.a(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r7.a(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r7.a(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r7.a(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r7.a(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f7336f
            if (r4 == 0) goto L_0x010f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x0076
            android.util.SparseArray<c6.o$b> r2 = c6.o.b.f3838a
            r2 = r1
            goto L_0x007a
        L_0x0076:
            int r2 = r0.getType()
        L_0x007a:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f7336f
            if (r4 == 0) goto L_0x0109
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "net-type"
            r4.put(r5, r2)
            r2 = 0
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<c6.o$a> r0 = c6.o.a.f3836a
            goto L_0x00a3
        L_0x008d:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x0098
            android.util.SparseArray<c6.o$a> r0 = c6.o.a.f3836a
            r0 = 100
            goto L_0x00a4
        L_0x0098:
            android.util.SparseArray<c6.o$a> r4 = c6.o.a.f3836a
            java.lang.Object r4 = r4.get(r0)
            c6.o$a r4 = (c6.o.a) r4
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f7336f
            if (r4 == 0) goto L_0x0103
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.a(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.a(r3, r0)
            android.content.Context r0 = r6.f3256c
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = r3.getSimOperator()
            java.lang.String r4 = "mcc_mnc"
            r7.a(r4, r3)
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ed }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ed }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00ed }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00ed }
            goto L_0x00f5
        L_0x00ed:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            h6.a.b(r2, r3, r0)
        L_0x00f5:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r7.a(r1, r0)
            d6.h r7 = r7.b()
            return r7
        L_0x0103:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0109:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x010f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0115:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.a(d6.n):d6.h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x033d A[SYNTHETIC, Splitter:B:104:0x033d] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0352 A[Catch:{ all -> 0x03dc, IOException -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x037f A[Catch:{ all -> 0x03dc, IOException -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0380 A[Catch:{ all -> 0x03dc, IOException -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x043d A[Catch:{ all -> 0x03dc, IOException -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x031b A[Catch:{ all -> 0x03dc, IOException -> 0x0487 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e6.b b(e6.a r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Iterable<d6.n> r3 = r0.f7846a
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            d6.n r4 = (d6.n) r4
            java.lang.String r5 = r4.g()
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0031
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r2.put(r5, r6)
            goto L_0x000f
        L_0x0031:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x000f
        L_0x003b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0048:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            if (r4 == 0) goto L_0x0265
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r7.get(r6)
            d6.n r6 = (d6.n) r6
            c6.p r16 = c6.p.DEFAULT
            m6.a r7 = r1.f3259f
            long r7 = r7.a()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            m6.a r8 = r1.f3258e
            long r8 = r8.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            c6.k$a r9 = c6.k.a.ANDROID_FIREBASE
            java.lang.String r10 = "sdk-version"
            int r10 = r6.f(r10)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "model"
            java.lang.String r19 = r6.a(r10)
            java.lang.String r10 = "hardware"
            java.lang.String r20 = r6.a(r10)
            java.lang.String r10 = "device"
            java.lang.String r21 = r6.a(r10)
            java.lang.String r10 = "product"
            java.lang.String r22 = r6.a(r10)
            java.lang.String r10 = "os-uild"
            java.lang.String r23 = r6.a(r10)
            java.lang.String r10 = "manufacturer"
            java.lang.String r24 = r6.a(r10)
            java.lang.String r10 = "fingerprint"
            java.lang.String r25 = r6.a(r10)
            java.lang.String r10 = "country"
            java.lang.String r27 = r6.a(r10)
            java.lang.String r10 = "locale"
            java.lang.String r26 = r6.a(r10)
            java.lang.String r10 = "mcc_mnc"
            java.lang.String r28 = r6.a(r10)
            java.lang.String r10 = "application_build"
            java.lang.String r29 = r6.a(r10)
            c6.c r6 = new c6.c
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            c6.e r12 = new c6.e
            r12.<init>(r9, r6)
            java.lang.Object r6 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00e5 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            r9 = 0
            r13 = r6
            r14 = r9
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r9 = 0
            r14 = r6
            r13 = r9
        L_0x00ee:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00fd:
            boolean r6 = r4.hasNext()
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = ""
            if (r6 == 0) goto L_0x022c
            java.lang.Object r6 = r4.next()
            d6.n r6 = (d6.n) r6
            d6.m r11 = r6.d()
            r17 = r2
            a6.b r2 = r11.f7353a
            r18 = r4
            a6.b r4 = new a6.b
            r19 = r10
            java.lang.String r10 = "proto"
            r4.<init>(r10)
            boolean r4 = r2.equals(r4)
            byte[] r10 = r11.f7354b
            if (r4 == 0) goto L_0x0130
            c6.f$a r2 = new c6.f$a
            r2.<init>()
            r2.f3820d = r10
            goto L_0x0150
        L_0x0130:
            a6.b r4 = new a6.b
            java.lang.String r11 = "json"
            r4.<init>(r11)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x020c
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r10, r4)
            c6.f$a r4 = new c6.f$a
            r4.<init>()
            r4.f3821e = r2
            r2 = r4
        L_0x0150:
            long r10 = r6.e()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2.f3817a = r4
            long r10 = r6.h()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2.f3819c = r4
            java.util.Map r4 = r6.b()
            java.lang.String r10 = "tz-offset"
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0175
            r10 = 0
            goto L_0x017d
        L_0x0175:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r10 = r4.longValue()
        L_0x017d:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2.f3822f = r4
            java.lang.String r4 = "net-type"
            int r4 = r6.f(r4)
            android.util.SparseArray<c6.o$b> r10 = c6.o.b.f3838a
            java.lang.Object r4 = r10.get(r4)
            c6.o$b r4 = (c6.o.b) r4
            java.lang.String r10 = "mobile-subtype"
            int r10 = r6.f(r10)
            android.util.SparseArray<c6.o$a> r11 = c6.o.a.f3836a
            java.lang.Object r10 = r11.get(r10)
            c6.o$a r10 = (c6.o.a) r10
            c6.i r11 = new c6.i
            r11.<init>(r4, r10)
            r2.f3823g = r11
            java.lang.Integer r4 = r6.c()
            if (r4 == 0) goto L_0x01b2
            java.lang.Integer r4 = r6.c()
            r2.f3818b = r4
        L_0x01b2:
            java.lang.Long r4 = r2.f3817a
            if (r4 != 0) goto L_0x01b9
            java.lang.String r10 = " eventTimeMs"
            goto L_0x01bb
        L_0x01b9:
            r10 = r19
        L_0x01bb:
            java.lang.Long r4 = r2.f3819c
            if (r4 != 0) goto L_0x01c5
            java.lang.String r4 = " eventUptimeMs"
            java.lang.String r10 = r10.concat(r4)
        L_0x01c5:
            java.lang.Long r4 = r2.f3822f
            if (r4 != 0) goto L_0x01cf
            java.lang.String r4 = " timezoneOffsetSeconds"
            java.lang.String r10 = h4.a.c(r10, r4)
        L_0x01cf:
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x0202
            c6.f r4 = new c6.f
            java.lang.Long r6 = r2.f3817a
            long r20 = r6.longValue()
            java.lang.Integer r6 = r2.f3818b
            java.lang.Long r9 = r2.f3819c
            long r23 = r9.longValue()
            byte[] r9 = r2.f3820d
            java.lang.String r10 = r2.f3821e
            java.lang.Long r11 = r2.f3822f
            long r27 = r11.longValue()
            c6.o r2 = r2.f3823g
            r19 = r4
            r22 = r6
            r25 = r9
            r26 = r10
            r29 = r2
            r19.<init>(r20, r22, r23, r25, r26, r27, r29)
            r15.add(r4)
            goto L_0x0226
        L_0x0202:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r9.concat(r10)
            r0.<init>(r2)
            throw r0
        L_0x020c:
            java.lang.String r4 = h6.a.c(r5)
            r6 = 5
            boolean r6 = android.util.Log.isLoggable(r4, r6)
            if (r6 == 0) goto L_0x0226
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r9 = 0
            r6[r9] = r2
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r2 = java.lang.String.format(r2, r6)
            android.util.Log.w(r4, r2)
        L_0x0226:
            r2 = r17
            r4 = r18
            goto L_0x00fd
        L_0x022c:
            r17 = r2
            r19 = r10
            if (r7 != 0) goto L_0x0235
            java.lang.String r10 = " requestTimeMs"
            goto L_0x0237
        L_0x0235:
            r10 = r19
        L_0x0237:
            if (r8 != 0) goto L_0x023f
            java.lang.String r2 = " requestUptimeMs"
            java.lang.String r10 = r10.concat(r2)
        L_0x023f:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x025b
            c6.g r2 = new c6.g
            long r4 = r7.longValue()
            long r10 = r8.longValue()
            r7 = r2
            r8 = r4
            r7.<init>(r8, r10, r12, r13, r14, r15, r16)
            r3.add(r2)
            r2 = r17
            goto L_0x0048
        L_0x025b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r9.concat(r10)
            r0.<init>(r2)
            throw r0
        L_0x0265:
            r2 = 5
            c6.d r4 = new c6.d
            r4.<init>(r3)
            r3 = 3
            r6 = -1
            byte[] r0 = r0.f7847b
            java.net.URL r8 = r1.f3257d
            if (r0 == 0) goto L_0x02a3
            b6.a r0 = b6.a.a(r0)     // Catch:{ IllegalArgumentException -> 0x029d }
            java.lang.String r9 = r0.f3253b     // Catch:{ IllegalArgumentException -> 0x029d }
            if (r9 == 0) goto L_0x027d
            goto L_0x027e
        L_0x027d:
            r9 = 0
        L_0x027e:
            java.lang.String r10 = r0.f3252a     // Catch:{ IllegalArgumentException -> 0x029d }
            if (r10 == 0) goto L_0x02a4
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0288 }
            r8.<init>(r10)     // Catch:{ MalformedURLException -> 0x0288 }
            goto L_0x02a4
        L_0x0288:
            r0 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x029d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x029d }
            java.lang.String r5 = "Invalid url: "
            r4.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x029d }
            r4.append(r10)     // Catch:{ IllegalArgumentException -> 0x029d }
            java.lang.String r4 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x029d }
            r2.<init>(r4, r0)     // Catch:{ IllegalArgumentException -> 0x029d }
            throw r2     // Catch:{ IllegalArgumentException -> 0x029d }
        L_0x029d:
            e6.b r0 = new e6.b
            r0.<init>(r3, r6)
            return r0
        L_0x02a3:
            r9 = 0
        L_0x02a4:
            b6.b$a r0 = new b6.b$a     // Catch:{ IOException -> 0x0487 }
            r0.<init>(r8, r4, r9)     // Catch:{ IOException -> 0x0487 }
            j0.n r4 = new j0.n     // Catch:{ IOException -> 0x0487 }
            r4.<init>(r1, r3)     // Catch:{ IOException -> 0x0487 }
            r3 = r2
            r2 = r0
        L_0x02b0:
            c6.j r6 = r2.f3262b
            java.lang.Object r0 = r4.f9710b     // Catch:{ IOException -> 0x0487 }
            b6.b r0 = (b6.b) r0     // Catch:{ IOException -> 0x0487 }
            r0.getClass()     // Catch:{ IOException -> 0x0487 }
            java.lang.String r7 = h6.a.c(r5)     // Catch:{ IOException -> 0x0487 }
            r8 = 4
            boolean r9 = android.util.Log.isLoggable(r7, r8)     // Catch:{ IOException -> 0x0487 }
            java.net.URL r10 = r2.f3261a
            if (r9 == 0) goto L_0x02d5
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x0487 }
            r11 = 0
            r9[r11] = r10     // Catch:{ IOException -> 0x0487 }
            java.lang.String r11 = "Making request to: %s"
            java.lang.String r9 = java.lang.String.format(r11, r9)     // Catch:{ IOException -> 0x0487 }
            android.util.Log.i(r7, r9)     // Catch:{ IOException -> 0x0487 }
        L_0x02d5:
            java.net.URLConnection r7 = r10.openConnection()     // Catch:{ IOException -> 0x0487 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0487 }
            r9 = 30000(0x7530, float:4.2039E-41)
            r7.setConnectTimeout(r9)     // Catch:{ IOException -> 0x0487 }
            int r9 = r0.f3260g     // Catch:{ IOException -> 0x0487 }
            r7.setReadTimeout(r9)     // Catch:{ IOException -> 0x0487 }
            r9 = 1
            r7.setDoOutput(r9)     // Catch:{ IOException -> 0x0487 }
            r10 = 0
            r7.setInstanceFollowRedirects(r10)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r10 = "POST"
            r7.setRequestMethod(r10)     // Catch:{ IOException -> 0x0487 }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x0487 }
            java.lang.String r10 = "3.1.9"
            r11 = 0
            r9[r11] = r10     // Catch:{ IOException -> 0x0487 }
            java.lang.String r10 = "datatransport/%s android/"
            java.lang.String r9 = java.lang.String.format(r10, r9)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r10 = "User-Agent"
            r7.setRequestProperty(r10, r9)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r9 = "Content-Encoding"
            java.lang.String r10 = "gzip"
            r7.setRequestProperty(r9, r10)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r11 = "Content-Type"
            java.lang.String r12 = "application/json"
            r7.setRequestProperty(r11, r12)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r12 = "Accept-Encoding"
            r7.setRequestProperty(r12, r10)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r12 = r2.f3263c     // Catch:{ IOException -> 0x0487 }
            if (r12 == 0) goto L_0x0320
            java.lang.String r13 = "X-Goog-Api-Key"
            r7.setRequestProperty(r13, r12)     // Catch:{ IOException -> 0x0487 }
        L_0x0320:
            java.io.OutputStream r12 = r7.getOutputStream()     // Catch:{ ConnectException -> 0x0416, UnknownHostException -> 0x0414, b -> 0x0412, IOException -> 0x0410 }
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0402 }
            r13.<init>(r12)     // Catch:{ all -> 0x0402 }
            la.d r0 = r0.f3254a     // Catch:{ all -> 0x03f6 }
            java.io.BufferedWriter r14 = new java.io.BufferedWriter     // Catch:{ all -> 0x03f6 }
            java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x03f6 }
            r15.<init>(r13)     // Catch:{ all -> 0x03f6 }
            r14.<init>(r15)     // Catch:{ all -> 0x03f6 }
            r0.a(r6, r14)     // Catch:{ all -> 0x03f6 }
            r13.close()     // Catch:{ all -> 0x0402 }
            if (r12 == 0) goto L_0x0340
            r12.close()     // Catch:{ ConnectException -> 0x0416, UnknownHostException -> 0x0414, b -> 0x0412, IOException -> 0x0410 }
        L_0x0340:
            int r0 = r7.getResponseCode()     // Catch:{ IOException -> 0x0487 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r13 = h6.a.c(r5)     // Catch:{ IOException -> 0x0487 }
            boolean r14 = android.util.Log.isLoggable(r13, r8)     // Catch:{ IOException -> 0x0487 }
            if (r14 == 0) goto L_0x0361
            r14 = 1
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x0487 }
            r15 = 0
            r14[r15] = r12     // Catch:{ IOException -> 0x0487 }
            java.lang.String r12 = "Status Code: %d"
            java.lang.String r12 = java.lang.String.format(r12, r14)     // Catch:{ IOException -> 0x0487 }
            android.util.Log.i(r13, r12)     // Catch:{ IOException -> 0x0487 }
        L_0x0361:
            java.lang.String r12 = "Content-Type: %s"
            java.lang.String r11 = r7.getHeaderField(r11)     // Catch:{ IOException -> 0x0487 }
            h6.a.a(r11, r5, r12)     // Catch:{ IOException -> 0x0487 }
            java.lang.String r11 = "Content-Encoding: %s"
            java.lang.String r12 = r7.getHeaderField(r9)     // Catch:{ IOException -> 0x0487 }
            h6.a.a(r12, r5, r11)     // Catch:{ IOException -> 0x0487 }
            r11 = 302(0x12e, float:4.23E-43)
            if (r0 == r11) goto L_0x03e2
            r11 = 301(0x12d, float:4.22E-43)
            if (r0 == r11) goto L_0x03e2
            r11 = 307(0x133, float:4.3E-43)
            if (r0 != r11) goto L_0x0380
            goto L_0x03e2
        L_0x0380:
            r11 = 200(0xc8, float:2.8E-43)
            if (r0 == r11) goto L_0x038e
            b6.b$b r7 = new b6.b$b     // Catch:{ IOException -> 0x0487 }
            r9 = 0
            r10 = 0
            r7.<init>(r0, r9, r10)     // Catch:{ IOException -> 0x0487 }
            goto L_0x0427
        L_0x038e:
            java.io.InputStream r11 = r7.getInputStream()     // Catch:{ IOException -> 0x0487 }
            java.lang.String r7 = r7.getHeaderField(r9)     // Catch:{ all -> 0x03d4 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x03d4 }
            if (r7 == 0) goto L_0x03a2
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x03d4 }
            r7.<init>(r11)     // Catch:{ all -> 0x03d4 }
            goto L_0x03a3
        L_0x03a2:
            r7 = r11
        L_0x03a3:
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x03c6 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ all -> 0x03c6 }
            r10.<init>(r7)     // Catch:{ all -> 0x03c6 }
            r9.<init>(r10)     // Catch:{ all -> 0x03c6 }
            c6.h r9 = c6.n.a(r9)     // Catch:{ all -> 0x03c6 }
            long r9 = r9.f3831a     // Catch:{ all -> 0x03c6 }
            b6.b$b r12 = new b6.b$b     // Catch:{ all -> 0x03c6 }
            r13 = 0
            r12.<init>(r0, r13, r9)     // Catch:{ all -> 0x03c6 }
            if (r7 == 0) goto L_0x03be
            r7.close()     // Catch:{ all -> 0x03d4 }
        L_0x03be:
            if (r11 == 0) goto L_0x03c3
            r11.close()     // Catch:{ IOException -> 0x0487 }
        L_0x03c3:
            r7 = r12
            goto L_0x0427
        L_0x03c6:
            r0 = move-exception
            r2 = r0
            if (r7 == 0) goto L_0x03d3
            r7.close()     // Catch:{ all -> 0x03ce }
            goto L_0x03d3
        L_0x03ce:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ all -> 0x03d4 }
        L_0x03d3:
            throw r2     // Catch:{ all -> 0x03d4 }
        L_0x03d4:
            r0 = move-exception
            r2 = r0
            if (r11 == 0) goto L_0x03e1
            r11.close()     // Catch:{ all -> 0x03dc }
            goto L_0x03e1
        L_0x03dc:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0487 }
        L_0x03e1:
            throw r2     // Catch:{ IOException -> 0x0487 }
        L_0x03e2:
            java.lang.String r9 = "Location"
            java.lang.String r7 = r7.getHeaderField(r9)     // Catch:{ IOException -> 0x0487 }
            b6.b$b r9 = new b6.b$b     // Catch:{ IOException -> 0x0487 }
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x0487 }
            r10.<init>(r7)     // Catch:{ IOException -> 0x0487 }
            r11 = 0
            r9.<init>(r0, r10, r11)     // Catch:{ IOException -> 0x0487 }
            r7 = r9
            goto L_0x0427
        L_0x03f6:
            r0 = move-exception
            r7 = r0
            r13.close()     // Catch:{ all -> 0x03fc }
            goto L_0x0401
        L_0x03fc:
            r0 = move-exception
            r9 = r0
            r7.addSuppressed(r9)     // Catch:{ all -> 0x0402 }
        L_0x0401:
            throw r7     // Catch:{ all -> 0x0402 }
        L_0x0402:
            r0 = move-exception
            r7 = r0
            if (r12 == 0) goto L_0x040f
            r12.close()     // Catch:{ all -> 0x040a }
            goto L_0x040f
        L_0x040a:
            r0 = move-exception
            r9 = r0
            r7.addSuppressed(r9)     // Catch:{ ConnectException -> 0x0416, UnknownHostException -> 0x0414, b -> 0x0412, IOException -> 0x0410 }
        L_0x040f:
            throw r7     // Catch:{ ConnectException -> 0x0416, UnknownHostException -> 0x0414, b -> 0x0412, IOException -> 0x0410 }
        L_0x0410:
            r0 = move-exception
            goto L_0x0418
        L_0x0412:
            r0 = move-exception
            goto L_0x0418
        L_0x0414:
            r0 = move-exception
            goto L_0x0429
        L_0x0416:
            r0 = move-exception
            goto L_0x0429
        L_0x0418:
            java.lang.String r7 = "Couldn't encode request, returning with 400"
            h6.a.b(r5, r7, r0)     // Catch:{ IOException -> 0x0487 }
            b6.b$b r7 = new b6.b$b     // Catch:{ IOException -> 0x0487 }
            r0 = 400(0x190, float:5.6E-43)
            r9 = 0
            r10 = 0
            r7.<init>(r0, r9, r10)     // Catch:{ IOException -> 0x0487 }
        L_0x0427:
            r0 = 0
            goto L_0x0439
        L_0x0429:
            java.lang.String r7 = "Couldn't open connection, returning with 500"
            h6.a.b(r5, r7, r0)     // Catch:{ IOException -> 0x0487 }
            b6.b$b r7 = new b6.b$b     // Catch:{ IOException -> 0x0487 }
            r0 = 500(0x1f4, float:7.0E-43)
            r9 = 0
            r10 = 0
            r7.<init>(r0, r9, r10)     // Catch:{ IOException -> 0x0487 }
            r0 = r9
        L_0x0439:
            java.net.URL r9 = r7.f3265b     // Catch:{ IOException -> 0x0487 }
            if (r9 == 0) goto L_0x0449
            java.lang.String r0 = "Following redirect to: %s"
            h6.a.a(r9, r5, r0)     // Catch:{ IOException -> 0x0487 }
            b6.b$a r0 = new b6.b$a     // Catch:{ IOException -> 0x0487 }
            java.lang.String r2 = r2.f3263c     // Catch:{ IOException -> 0x0487 }
            r0.<init>(r9, r6, r2)     // Catch:{ IOException -> 0x0487 }
        L_0x0449:
            r2 = r0
            if (r2 == 0) goto L_0x0451
            int r3 = r3 + -1
            r0 = 1
            if (r3 >= r0) goto L_0x02b0
        L_0x0451:
            int r0 = r7.f3264a     // Catch:{ IOException -> 0x0487 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0460
            long r2 = r7.f3266c     // Catch:{ IOException -> 0x0487 }
            e6.b r0 = new e6.b     // Catch:{ IOException -> 0x0487 }
            r4 = 1
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x0487 }
            return r0
        L_0x0460:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L_0x047e
            r2 = 404(0x194, float:5.66E-43)
            if (r0 != r2) goto L_0x0469
            goto L_0x047e
        L_0x0469:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 != r2) goto L_0x0475
            e6.b r0 = new e6.b     // Catch:{ IOException -> 0x0487 }
            r2 = -1
            r0.<init>(r8, r2)     // Catch:{ IOException -> 0x0487 }
            return r0
        L_0x0475:
            r2 = -1
            e6.b r0 = new e6.b     // Catch:{ IOException -> 0x0487 }
            r4 = 3
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x0487 }
            return r0
        L_0x047e:
            e6.b r0 = new e6.b     // Catch:{ IOException -> 0x0487 }
            r2 = 2
            r3 = -1
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0487 }
            return r0
        L_0x0487:
            r0 = move-exception
            java.lang.String r2 = "Could not make request to the backend"
            h6.a.b(r5, r2, r0)
            e6.b r0 = new e6.b
            r2 = 2
            r3 = -1
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.b(e6.a):e6.b");
    }
}
