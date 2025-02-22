package z1;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.e;
import o.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final e<String, Typeface> f17644a = new e<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f17645b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f17646c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final f<String, ArrayList<c2.a<a>>> f17647d = new f<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f17645b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z1.j.a a(java.lang.String r6, android.content.Context r7, z1.e r8, int r9) {
        /*
            o.e<java.lang.String, android.graphics.Typeface> r0 = f17644a
            java.lang.Object r1 = r0.c(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            z1.j$a r6 = new z1.j$a
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            z1.k r8 = z1.d.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x005b }
            r1 = 1
            r2 = -3
            z1.l[] r3 = r8.f17651b
            int r8 = r8.f17650a
            if (r8 == 0) goto L_0x0021
            if (r8 == r1) goto L_0x001f
            goto L_0x0034
        L_0x001f:
            r8 = -2
            goto L_0x003c
        L_0x0021:
            if (r3 == 0) goto L_0x003b
            int r8 = r3.length
            if (r8 != 0) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L_0x002a:
            if (r4 >= r8) goto L_0x003b
            r5 = r3[r4]
            int r5 = r5.f17656e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r8 = r2
            goto L_0x003c
        L_0x0036:
            r8 = r5
            goto L_0x003c
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r8 = r1
        L_0x003c:
            if (r8 == 0) goto L_0x0044
            z1.j$a r6 = new z1.j$a
            r6.<init>((int) r8)
            return r6
        L_0x0044:
            v1.n r8 = v1.h.f16128a
            android.graphics.Typeface r7 = r8.b(r7, r3, r9)
            if (r7 == 0) goto L_0x0055
            r0.d(r6, r7)
            z1.j$a r6 = new z1.j$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0055:
            z1.j$a r6 = new z1.j$a
            r6.<init>((int) r2)
            return r6
        L_0x005b:
            z1.j$a r6 = new z1.j$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.j.a(java.lang.String, android.content.Context, z1.e, int):z1.j$a");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f17648a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17649b;

        public a(int i8) {
            this.f17648a = null;
            this.f17649b = i8;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f17648a = typeface;
            this.f17649b = 0;
        }
    }
}
