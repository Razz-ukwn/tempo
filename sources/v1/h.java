package v1;

import ag.v1;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import o.e;
import u1.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final n f16128a;

    /* renamed from: b  reason: collision with root package name */
    public static final e<String, Typeface> f16129b = new e<>(16);

    public static class a extends v1 {
        public final f.e L;

        public a(f.e eVar) {
            this.L = eVar;
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            f16128a = new l();
        } else if (i8 >= 28) {
            f16128a = new k();
        } else {
            f16128a = new j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r7, u1.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, u1.f.e r14, boolean r15) {
        /*
            boolean r0 = r8 instanceof u1.d.e
            r1 = -3
            if (r0 == 0) goto L_0x0148
            u1.d$e r8 = (u1.d.e) r8
            java.lang.String r0 = r8.f15668d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r14 == 0) goto L_0x002f
            r14.b(r0)
        L_0x002f:
            return r0
        L_0x0030:
            if (r15 == 0) goto L_0x0037
            int r0 = r8.f15667c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r14 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r15 == 0) goto L_0x0040
            int r15 = r8.f15666b
            goto L_0x0041
        L_0x0040:
            r15 = r0
        L_0x0041:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            v1.h$a r5 = new v1.h$a
            r5.<init>(r14)
            z1.e r8 = r8.f15665a
            z1.c r14 = new z1.c
            r14.<init>(r5, r4)
            if (r3 == 0) goto L_0x00cc
            o.e<java.lang.String, android.graphics.Typeface> r3 = z1.j.f17644a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.f17633e
            r3.append(r6)
            java.lang.String r6 = "-"
            r3.append(r6)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            o.e<java.lang.String, android.graphics.Typeface> r6 = z1.j.f17644a
            java.lang.Object r6 = r6.c(r3)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x0085
            z1.a r7 = new z1.a
            r7.<init>(r5, r6)
            r4.post(r7)
            r2 = r6
            goto L_0x015b
        L_0x0085:
            if (r15 != r0) goto L_0x0092
            z1.j$a r7 = z1.j.a(r3, r7, r8, r13)
            r14.a(r7)
            android.graphics.Typeface r2 = r7.f17648a
            goto L_0x015b
        L_0x0092:
            z1.f r0 = new z1.f
            r0.<init>(r3, r7, r8, r13)
            java.util.concurrent.ThreadPoolExecutor r7 = z1.j.f17645b     // Catch:{ InterruptedException -> 0x00be }
            java.util.concurrent.Future r7 = r7.submit(r0)     // Catch:{ InterruptedException -> 0x00be }
            long r3 = (long) r15
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00b5, TimeoutException -> 0x00ad }
            java.lang.Object r7 = r7.get(r3, r8)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00b5, TimeoutException -> 0x00ad }
            z1.j$a r7 = (z1.j.a) r7     // Catch:{ InterruptedException -> 0x00be }
            r14.a(r7)     // Catch:{ InterruptedException -> 0x00be }
            android.graphics.Typeface r2 = r7.f17648a     // Catch:{ InterruptedException -> 0x00be }
            goto L_0x015b
        L_0x00ad:
            java.lang.InterruptedException r7 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00be }
            java.lang.String r8 = "timeout"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00be }
            throw r7     // Catch:{ InterruptedException -> 0x00be }
        L_0x00b5:
            r7 = move-exception
            throw r7     // Catch:{ InterruptedException -> 0x00be }
        L_0x00b7:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00be }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00be }
            throw r8     // Catch:{ InterruptedException -> 0x00be }
        L_0x00be:
            z1.b r7 = new z1.b
            ag.v1 r8 = r14.f17626a
            r7.<init>(r8, r1)
            android.os.Handler r8 = r14.f17627b
            r8.post(r7)
            goto L_0x015b
        L_0x00cc:
            o.e<java.lang.String, android.graphics.Typeface> r15 = z1.j.f17644a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = r8.f17633e
            r15.append(r0)
            java.lang.String r0 = "-"
            r15.append(r0)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            o.e<java.lang.String, android.graphics.Typeface> r0 = z1.j.f17644a
            java.lang.Object r0 = r0.c(r15)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f8
            z1.a r7 = new z1.a
            r7.<init>(r5, r0)
            r4.post(r7)
            r2 = r0
            goto L_0x015b
        L_0x00f8:
            z1.g r0 = new z1.g
            r0.<init>(r14)
            java.lang.Object r3 = z1.j.f17646c
            monitor-enter(r3)
            o.f<java.lang.String, java.util.ArrayList<c2.a<z1.j$a>>> r14 = z1.j.f17647d     // Catch:{ all -> 0x0145 }
            java.lang.Object r1 = r14.getOrDefault(r15, r2)     // Catch:{ all -> 0x0145 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x010f
            r1.add(r0)     // Catch:{ all -> 0x0145 }
            monitor-exit(r3)     // Catch:{ all -> 0x0145 }
            goto L_0x015b
        L_0x010f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0145 }
            r1.<init>()     // Catch:{ all -> 0x0145 }
            r1.add(r0)     // Catch:{ all -> 0x0145 }
            r14.put(r15, r1)     // Catch:{ all -> 0x0145 }
            monitor-exit(r3)     // Catch:{ all -> 0x0145 }
            z1.h r14 = new z1.h
            r14.<init>(r15, r7, r8, r13)
            java.util.concurrent.ThreadPoolExecutor r7 = z1.j.f17645b
            z1.i r8 = new z1.i
            r8.<init>(r15)
            android.os.Looper r15 = android.os.Looper.myLooper()
            if (r15 != 0) goto L_0x0137
            android.os.Handler r15 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r15.<init>(r0)
            goto L_0x013c
        L_0x0137:
            android.os.Handler r15 = new android.os.Handler
            r15.<init>()
        L_0x013c:
            z1.n r0 = new z1.n
            r0.<init>(r15, r14, r8)
            r7.execute(r0)
            goto L_0x015b
        L_0x0145:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0145 }
            throw r7
        L_0x0148:
            v1.n r15 = f16128a
            u1.d$c r8 = (u1.d.c) r8
            android.graphics.Typeface r2 = r15.a(r7, r8, r9, r13)
            if (r14 == 0) goto L_0x015b
            if (r2 == 0) goto L_0x0158
            r14.b(r2)
            goto L_0x015b
        L_0x0158:
            r14.a(r1)
        L_0x015b:
            if (r2 == 0) goto L_0x0166
            o.e<java.lang.String, android.graphics.Typeface> r7 = f16129b
            java.lang.String r8 = b(r9, r10, r11, r12, r13)
            r7.d(r8, r2)
        L_0x0166:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.h.a(android.content.Context, u1.d$b, android.content.res.Resources, int, java.lang.String, int, int, u1.f$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i8, String str, int i10, int i11) {
        return resources.getResourcePackageName(i8) + '-' + str + '-' + i10 + '-' + i8 + '-' + i11;
    }
}
