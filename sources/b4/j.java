package b4;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.z0;
import b4.h;
import d2.f1;
import ff.d;
import h4.l;
import java.io.IOException;
import java.util.Map;
import jg.c;
import jg.d;
import jg.q;
import jg.r;
import jg.t;
import jg.x;
import lf.e;
import wg.c0;
import wg.z;
import z3.a;
import zf.n;

public final class j implements h {

    /* renamed from: f  reason: collision with root package name */
    public static final jg.c f3225f;

    /* renamed from: g  reason: collision with root package name */
    public static final jg.c f3226g;

    /* renamed from: a  reason: collision with root package name */
    public final String f3227a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3228b;

    /* renamed from: c  reason: collision with root package name */
    public final d<d.a> f3229c;

    /* renamed from: d  reason: collision with root package name */
    public final ff.d<z3.a> f3230d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3231e;

    public static final class a implements h.a<Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final ff.d<d.a> f3232a;

        /* renamed from: b  reason: collision with root package name */
        public final ff.d<z3.a> f3233b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3234c;

        public a(ff.j jVar, ff.j jVar2, boolean z10) {
            this.f3232a = jVar;
            this.f3233b = jVar2;
            this.f3234c = z10;
        }

        public final h a(Object obj, l lVar) {
            Uri uri = (Uri) obj;
            if (!(sf.j.a(uri.getScheme(), "http") || sf.j.a(uri.getScheme(), "https"))) {
                return null;
            }
            return new j(uri.toString(), lVar, this.f3232a, this.f3233b, this.f3234c);
        }
    }

    @e(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {223}, m = "executeNetworkRequest")
    public static final class b extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f3235a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f3236b;

        /* renamed from: c  reason: collision with root package name */
        public int f3237c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, jf.d<? super b> dVar) {
            super(dVar);
            this.f3236b = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f3235a = obj;
            this.f3237c |= Integer.MIN_VALUE;
            jg.c cVar = j.f3225f;
            return this.f3236b.b((x) null, this);
        }
    }

    @e(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {76, 105}, m = "fetch")
    public static final class c extends lf.c {
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public j f3238a;

        /* renamed from: b  reason: collision with root package name */
        public a.b f3239b;

        /* renamed from: c  reason: collision with root package name */
        public Object f3240c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f3241d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j f3242e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar, jf.d<? super c> dVar) {
            super(dVar);
            this.f3242e = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f3241d = obj;
            this.B |= Integer.MIN_VALUE;
            return this.f3242e.a(this);
        }
    }

    static {
        c.a aVar = new c.a();
        aVar.f10045a = true;
        aVar.f10046b = true;
        f3225f = aVar.a();
        c.a aVar2 = new c.a();
        aVar2.f10045a = true;
        aVar2.f10050f = true;
        f3226g = aVar2.a();
    }

    public j(String str, l lVar, ff.d<? extends d.a> dVar, ff.d<? extends z3.a> dVar2, boolean z10) {
        this.f3227a = str;
        this.f3228b = lVar;
        this.f3229c = dVar;
        this.f3230d = dVar2;
        this.f3231e = z10;
    }

    public static String d(String str, t tVar) {
        String b10;
        String str2 = tVar != null ? tVar.f10173a : null;
        if ((str2 == null || zf.j.x0(str2, "text/plain", false)) && (b10 = m4.c.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b10;
        }
        if (str2 != null) {
            return n.X0(str2, ';');
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: z3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: z3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: z3.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: z3.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: jg.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: z3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: jg.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: z3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: z3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: z3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: z3.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: z3.a$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e9 A[SYNTHETIC, Splitter:B:107:0x01e9] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129 A[SYNTHETIC, Splitter:B:61:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a6 A[Catch:{ Exception -> 0x01d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d4 A[Catch:{ Exception -> 0x01d2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(jf.d<? super b4.g> r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            boolean r2 = r0 instanceof b4.j.c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            b4.j$c r2 = (b4.j.c) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.B = r3
            goto L_0x001c
        L_0x0017:
            b4.j$c r2 = new b4.j$c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f3241d
            kf.a r3 = kf.a.f10464a
            int r4 = r2.B
            java.lang.String r5 = "response body == null"
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 1
            r11 = 4
            r12 = 3
            if (r4 == 0) goto L_0x0059
            if (r4 == r10) goto L_0x0049
            if (r4 != r9) goto L_0x0041
            java.lang.Object r3 = r2.f3240c
            jg.c0 r3 = (jg.c0) r3
            z3.a$b r4 = r2.f3239b
            b4.j r2 = r2.f3238a
            cb.b.J(r0)     // Catch:{ Exception -> 0x003e }
            goto L_0x019c
        L_0x003e:
            r0 = move-exception
            goto L_0x01de
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0049:
            java.lang.Object r4 = r2.f3240c
            g4.d r4 = (g4.d) r4
            z3.a$b r10 = r2.f3239b
            b4.j r13 = r2.f3238a
            cb.b.J(r0)     // Catch:{ Exception -> 0x0056 }
            goto L_0x011f
        L_0x0056:
            r0 = move-exception
            goto L_0x01f5
        L_0x0059:
            cb.b.J(r0)
            h4.l r0 = r1.f3228b
            int r4 = r0.f9207n
            boolean r4 = h4.a.a(r4)
            java.lang.String r13 = r1.f3227a
            if (r4 == 0) goto L_0x007d
            ff.d<z3.a> r4 = r1.f3230d
            java.lang.Object r4 = r4.getValue()
            z3.a r4 = (z3.a) r4
            if (r4 == 0) goto L_0x007d
            java.lang.String r0 = r0.f9203i
            if (r0 != 0) goto L_0x0077
            r0 = r13
        L_0x0077:
            z3.f$b r0 = r4.a(r0)
            r4 = r0
            goto L_0x007e
        L_0x007d:
            r4 = r6
        L_0x007e:
            if (r4 == 0) goto L_0x00f7
            wg.l r0 = r18.c()     // Catch:{ Exception -> 0x01f3 }
            wg.z r14 = r4.E()     // Catch:{ Exception -> 0x01f3 }
            wg.k r0 = r0.h(r14)     // Catch:{ Exception -> 0x01f3 }
            java.lang.Long r0 = r0.f16776d     // Catch:{ Exception -> 0x01f3 }
            if (r0 != 0) goto L_0x0091
            goto L_0x00a7
        L_0x0091:
            long r14 = r0.longValue()     // Catch:{ Exception -> 0x01f3 }
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00a7
            b4.l r0 = new b4.l     // Catch:{ Exception -> 0x01f3 }
            y3.j r2 = r1.g(r4)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r3 = d(r13, r6)     // Catch:{ Exception -> 0x01f3 }
            r0.<init>(r2, r3, r12)     // Catch:{ Exception -> 0x01f3 }
            return r0
        L_0x00a7:
            boolean r0 = r1.f3231e     // Catch:{ Exception -> 0x01f3 }
            if (r0 == 0) goto L_0x00da
            g4.d$b r0 = new g4.d$b     // Catch:{ Exception -> 0x01f3 }
            jg.x r14 = r18.e()     // Catch:{ Exception -> 0x01f3 }
            g4.c r15 = r1.f(r4)     // Catch:{ Exception -> 0x01f3 }
            r0.<init>(r14, r15)     // Catch:{ Exception -> 0x01f3 }
            g4.d r0 = r0.a()     // Catch:{ Exception -> 0x01f3 }
            jg.x r14 = r0.f8839a     // Catch:{ Exception -> 0x01f3 }
            if (r14 != 0) goto L_0x0104
            g4.c r14 = r0.f8840b
            if (r14 == 0) goto L_0x0104
            b4.l r0 = new b4.l     // Catch:{ Exception -> 0x01f3 }
            y3.j r2 = r1.g(r4)     // Catch:{ Exception -> 0x01f3 }
            ff.d r3 = r14.f8834b     // Catch:{ Exception -> 0x01f3 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x01f3 }
            jg.t r3 = (jg.t) r3     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r3 = d(r13, r3)     // Catch:{ Exception -> 0x01f3 }
            r0.<init>(r2, r3, r12)     // Catch:{ Exception -> 0x01f3 }
            return r0
        L_0x00da:
            b4.l r0 = new b4.l     // Catch:{ Exception -> 0x01f3 }
            y3.j r2 = r1.g(r4)     // Catch:{ Exception -> 0x01f3 }
            g4.c r3 = r1.f(r4)     // Catch:{ Exception -> 0x01f3 }
            if (r3 == 0) goto L_0x00ef
            ff.d r3 = r3.f8834b     // Catch:{ Exception -> 0x01f3 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x01f3 }
            r6 = r3
            jg.t r6 = (jg.t) r6     // Catch:{ Exception -> 0x01f3 }
        L_0x00ef:
            java.lang.String r3 = d(r13, r6)     // Catch:{ Exception -> 0x01f3 }
            r0.<init>(r2, r3, r12)     // Catch:{ Exception -> 0x01f3 }
            return r0
        L_0x00f7:
            g4.d$b r0 = new g4.d$b     // Catch:{ Exception -> 0x01f3 }
            jg.x r13 = r18.e()     // Catch:{ Exception -> 0x01f3 }
            r0.<init>(r13, r6)     // Catch:{ Exception -> 0x01f3 }
            g4.d r0 = r0.a()     // Catch:{ Exception -> 0x01f3 }
        L_0x0104:
            jg.x r13 = r0.f8839a     // Catch:{ Exception -> 0x01f3 }
            sf.j.c(r13)     // Catch:{ Exception -> 0x01f3 }
            r2.f3238a = r1     // Catch:{ Exception -> 0x01f3 }
            r2.f3239b = r4     // Catch:{ Exception -> 0x01f3 }
            r2.f3240c = r0     // Catch:{ Exception -> 0x01f3 }
            r2.B = r10     // Catch:{ Exception -> 0x01f3 }
            java.lang.Object r10 = r1.b(r13, r2)     // Catch:{ Exception -> 0x01f3 }
            if (r10 != r3) goto L_0x0118
            return r3
        L_0x0118:
            r13 = r1
            r17 = r4
            r4 = r0
            r0 = r10
            r10 = r17
        L_0x011f:
            r14 = r0
            jg.c0 r14 = (jg.c0) r14     // Catch:{ Exception -> 0x0056 }
            r13.getClass()     // Catch:{ Exception -> 0x0056 }
            jg.d0 r0 = r14.C     // Catch:{ Exception -> 0x0056 }
            if (r0 == 0) goto L_0x01e9
            jg.x r15 = r4.f8839a     // Catch:{ Exception -> 0x01e3 }
            g4.c r4 = r4.f8840b     // Catch:{ Exception -> 0x01e3 }
            z3.a$b r4 = r13.h(r10, r15, r14, r4)     // Catch:{ Exception -> 0x01e3 }
            java.lang.String r10 = r13.f3227a
            if (r4 == 0) goto L_0x0152
            b4.l r0 = new b4.l     // Catch:{ Exception -> 0x01e0 }
            y3.j r2 = r13.g(r4)     // Catch:{ Exception -> 0x01e0 }
            g4.c r3 = r13.f(r4)     // Catch:{ Exception -> 0x01e0 }
            if (r3 == 0) goto L_0x014a
            ff.d r3 = r3.f8834b     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x01e0 }
            r6 = r3
            jg.t r6 = (jg.t) r6     // Catch:{ Exception -> 0x01e0 }
        L_0x014a:
            java.lang.String r3 = d(r10, r6)     // Catch:{ Exception -> 0x01e0 }
            r0.<init>(r2, r3, r11)     // Catch:{ Exception -> 0x01e0 }
            return r0
        L_0x0152:
            long r15 = r0.c()     // Catch:{ Exception -> 0x01e0 }
            int r7 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0184
            b4.l r2 = new b4.l     // Catch:{ Exception -> 0x01e0 }
            wg.h r3 = r0.e()     // Catch:{ Exception -> 0x01e0 }
            h4.l r5 = r13.f3228b     // Catch:{ Exception -> 0x01e0 }
            android.content.Context r5 = r5.f9195a     // Catch:{ Exception -> 0x01e0 }
            y3.m r7 = new y3.m     // Catch:{ Exception -> 0x01e0 }
            android.graphics.Bitmap$Config[] r8 = m4.c.f11189a     // Catch:{ Exception -> 0x01e0 }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ Exception -> 0x01e0 }
            r5.mkdirs()     // Catch:{ Exception -> 0x01e0 }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x01e0 }
            jg.t r0 = r0.d()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r0 = d(r10, r0)     // Catch:{ Exception -> 0x01e0 }
            jg.c0 r3 = r14.D     // Catch:{ Exception -> 0x01e0 }
            if (r3 == 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r11 = r12
        L_0x0180:
            r2.<init>(r7, r0, r11)     // Catch:{ Exception -> 0x01e0 }
            return r2
        L_0x0184:
            m4.c.a(r14)     // Catch:{ Exception -> 0x01e0 }
            jg.x r0 = r13.e()     // Catch:{ Exception -> 0x01e0 }
            r2.f3238a = r13     // Catch:{ Exception -> 0x01e0 }
            r2.f3239b = r4     // Catch:{ Exception -> 0x01e0 }
            r2.f3240c = r14     // Catch:{ Exception -> 0x01e0 }
            r2.B = r9     // Catch:{ Exception -> 0x01e0 }
            java.lang.Object r0 = r13.b(r0, r2)     // Catch:{ Exception -> 0x01e0 }
            if (r0 != r3) goto L_0x019a
            return r3
        L_0x019a:
            r2 = r13
            r3 = r14
        L_0x019c:
            r14 = r0
            jg.c0 r14 = (jg.c0) r14     // Catch:{ Exception -> 0x003e }
            r2.getClass()     // Catch:{ Exception -> 0x01d2 }
            jg.d0 r0 = r14.C     // Catch:{ Exception -> 0x01d2 }
            if (r0 == 0) goto L_0x01d4
            b4.l r3 = new b4.l     // Catch:{ Exception -> 0x01d2 }
            wg.h r5 = r0.e()     // Catch:{ Exception -> 0x01d2 }
            h4.l r7 = r2.f3228b     // Catch:{ Exception -> 0x01d2 }
            android.content.Context r7 = r7.f9195a     // Catch:{ Exception -> 0x01d2 }
            y3.m r8 = new y3.m     // Catch:{ Exception -> 0x01d2 }
            android.graphics.Bitmap$Config[] r9 = m4.c.f11189a     // Catch:{ Exception -> 0x01d2 }
            java.io.File r7 = r7.getCacheDir()     // Catch:{ Exception -> 0x01d2 }
            r7.mkdirs()     // Catch:{ Exception -> 0x01d2 }
            r8.<init>(r5, r7, r6)     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r2 = r2.f3227a     // Catch:{ Exception -> 0x01d2 }
            jg.t r0 = r0.d()     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r0 = d(r2, r0)     // Catch:{ Exception -> 0x01d2 }
            jg.c0 r2 = r14.D     // Catch:{ Exception -> 0x01d2 }
            if (r2 == 0) goto L_0x01cd
            goto L_0x01ce
        L_0x01cd:
            r11 = r12
        L_0x01ce:
            r3.<init>(r8, r0, r11)     // Catch:{ Exception -> 0x01d2 }
            return r3
        L_0x01d2:
            r0 = move-exception
            goto L_0x01e5
        L_0x01d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x01d2 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01d2 }
            throw r0     // Catch:{ Exception -> 0x01d2 }
        L_0x01de:
            r14 = r3
            goto L_0x01e5
        L_0x01e0:
            r0 = move-exception
            r10 = r4
            goto L_0x01e4
        L_0x01e3:
            r0 = move-exception
        L_0x01e4:
            r4 = r10
        L_0x01e5:
            m4.c.a(r14)     // Catch:{ Exception -> 0x01f3 }
            throw r0     // Catch:{ Exception -> 0x01f3 }
        L_0x01e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0056 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0056 }
            throw r0     // Catch:{ Exception -> 0x0056 }
        L_0x01f3:
            r0 = move-exception
            r10 = r4
        L_0x01f5:
            if (r10 == 0) goto L_0x01fa
            m4.c.a(r10)
        L_0x01fa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.a(jf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(jg.x r5, jf.d<? super jg.c0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b4.j.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            b4.j$b r0 = (b4.j.b) r0
            int r1 = r0.f3237c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3237c = r1
            goto L_0x0018
        L_0x0013:
            b4.j$b r0 = new b4.j$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f3235a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f3237c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            cb.b.J(r6)
            goto L_0x008d
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            cb.b.J(r6)
            android.graphics.Bitmap$Config[] r6 = m4.c.f11189a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = sf.j.a(r6, r2)
            ff.d<jg.d$a> r2 = r4.f3229c
            if (r6 == 0) goto L_0x0063
            h4.l r6 = r4.f3228b
            int r6 = r6.f9208o
            boolean r6 = h4.a.a(r6)
            if (r6 != 0) goto L_0x005d
            java.lang.Object r6 = r2.getValue()
            jg.d$a r6 = (jg.d.a) r6
            ng.d r5 = r6.a(r5)
            jg.c0 r5 = r5.g()
            goto L_0x0090
        L_0x005d:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L_0x0063:
            java.lang.Object r6 = r2.getValue()
            jg.d$a r6 = (jg.d.a) r6
            ng.d r5 = r6.a(r5)
            r0.f3237c = r3
            ag.l r6 = new ag.l
            jf.d r0 = e9.c.g(r0)
            r6.<init>(r3, r0)
            r6.t()
            m4.d r0 = new m4.d
            r0.<init>(r5, r6)
            r5.s(r0)
            r6.v(r0)
            java.lang.Object r6 = r6.s()
            if (r6 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r5 = r6
            jg.c0 r5 = (jg.c0) r5
        L_0x0090:
            boolean r6 = r5.e()
            if (r6 != 0) goto L_0x00a9
            r6 = 304(0x130, float:4.26E-43)
            int r0 = r5.f10054d
            if (r0 == r6) goto L_0x00a9
            jg.d0 r6 = r5.C
            if (r6 == 0) goto L_0x00a3
            m4.c.a(r6)
        L_0x00a3:
            g4.e r6 = new g4.e
            r6.<init>(r5)
            throw r6
        L_0x00a9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.b(jg.x, jf.d):java.lang.Object");
    }

    public final wg.l c() {
        z3.a value = this.f3230d.getValue();
        sf.j.c(value);
        return value.getFileSystem();
    }

    public final x e() {
        x.a aVar = new x.a();
        String str = this.f3227a;
        sf.j.f(str, "url");
        if (zf.j.x0(str, "ws:", true)) {
            String substring = str.substring(3);
            sf.j.e(substring, "this as java.lang.String).substring(startIndex)");
            str = sf.j.k(substring, "http:");
        } else if (zf.j.x0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            sf.j.e(substring2, "this as java.lang.String).substring(startIndex)");
            str = sf.j.k(substring2, "https:");
        }
        sf.j.f(str, "<this>");
        r.a aVar2 = new r.a();
        aVar2.d((r) null, str);
        aVar.f10225a = aVar2.a();
        l lVar = this.f3228b;
        q qVar = lVar.f9204j;
        sf.j.f(qVar, "headers");
        aVar.f10227c = qVar.d();
        for (Map.Entry next : lVar.f9205k.f9220a.entrySet()) {
            Object key = next.getKey();
            sf.j.d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVar.e((Class) key, next.getValue());
        }
        int i8 = lVar.f9207n;
        boolean a10 = h4.a.a(i8);
        boolean a11 = h4.a.a(lVar.f9208o);
        if (!a11 && a10) {
            aVar.b(jg.c.f10032o);
        } else if (!a11 || a10) {
            if (!a11 && !a10) {
                aVar.b(f3226g);
            }
        } else if (h4.a.b(i8)) {
            aVar.b(jg.c.f10031n);
        } else {
            aVar.b(f3225f);
        }
        return aVar.a();
    }

    public final g4.c f(a.b bVar) {
        g4.c cVar;
        try {
            c0 j10 = f1.j(c().l(bVar.E()));
            try {
                cVar = new g4.c(j10);
                th = null;
            } catch (Throwable th) {
                th = th;
                cVar = null;
            }
            try {
                j10.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    z0.c(th, th2);
                }
            }
            if (th == null) {
                sf.j.c(cVar);
                return cVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final y3.j g(a.b bVar) {
        z data = bVar.getData();
        wg.l c3 = c();
        String str = this.f3228b.f9203i;
        if (str == null) {
            str = this.f3227a;
        }
        return new y3.j(data, c3, str, bVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:51|52|87|88|89|90|91|92) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if ((!r8.a().f10034b && !r9.c().f10034b && !sf.j.a(r2.a("Vary"), "*")) != false) goto L_0x0035;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x012b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z3.a.b h(z3.a.b r7, jg.x r8, jg.c0 r9, g4.c r10) {
        /*
            r6 = this;
            h4.l r0 = r6.f3228b
            int r1 = r0.f9207n
            boolean r1 = h4.a.b(r1)
            jg.q r2 = r9.B
            r3 = 0
            if (r1 == 0) goto L_0x0036
            boolean r1 = r6.f3231e
            r4 = 1
            if (r1 == 0) goto L_0x0035
            jg.c r8 = r8.a()
            boolean r8 = r8.f10034b
            if (r8 != 0) goto L_0x0032
            jg.c r8 = r9.c()
            boolean r8 = r8.f10034b
            if (r8 != 0) goto L_0x0032
            java.lang.String r8 = "Vary"
            java.lang.String r8 = r2.a(r8)
            java.lang.String r1 = "*"
            boolean r8 = sf.j.a(r8, r1)
            if (r8 != 0) goto L_0x0032
            r8 = r4
            goto L_0x0033
        L_0x0032:
            r8 = r3
        L_0x0033:
            if (r8 == 0) goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            r8 = 0
            if (r3 != 0) goto L_0x003f
            if (r7 == 0) goto L_0x003e
            m4.c.a(r7)
        L_0x003e:
            return r8
        L_0x003f:
            if (r7 == 0) goto L_0x0046
            z3.f$a r7 = r7.V()
            goto L_0x005c
        L_0x0046:
            ff.d<z3.a> r7 = r6.f3230d
            java.lang.Object r7 = r7.getValue()
            z3.a r7 = (z3.a) r7
            if (r7 == 0) goto L_0x005b
            java.lang.String r0 = r0.f9203i
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r6.f3227a
        L_0x0056:
            z3.f$a r7 = r7.b(r0)
            goto L_0x005c
        L_0x005b:
            r7 = r8
        L_0x005c:
            if (r7 != 0) goto L_0x005f
            return r8
        L_0x005f:
            int r0 = r9.f10054d     // Catch:{ Exception -> 0x00b2 }
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L_0x00b5
            if (r10 == 0) goto L_0x00b5
            jg.c0$a r0 = new jg.c0$a     // Catch:{ Exception -> 0x00b2 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00b2 }
            jg.q r10 = r10.f8838f     // Catch:{ Exception -> 0x00b2 }
            jg.q r10 = g4.d.a.a(r10, r2)     // Catch:{ Exception -> 0x00b2 }
            jg.q$a r10 = r10.d()     // Catch:{ Exception -> 0x00b2 }
            r0.f10061f = r10     // Catch:{ Exception -> 0x00b2 }
            jg.c0 r10 = r0.a()     // Catch:{ Exception -> 0x00b2 }
            wg.l r0 = r6.c()     // Catch:{ Exception -> 0x00b2 }
            wg.z r1 = r7.d()     // Catch:{ Exception -> 0x00b2 }
            wg.g0 r0 = r0.k(r1)     // Catch:{ Exception -> 0x00b2 }
            wg.b0 r0 = d2.f1.i(r0)     // Catch:{ Exception -> 0x00b2 }
            g4.c r1 = new g4.c     // Catch:{ all -> 0x0097 }
            r1.<init>((jg.c0) r10)     // Catch:{ all -> 0x0097 }
            r1.a(r0)     // Catch:{ all -> 0x0097 }
            ff.m r10 = ff.m.f8717a     // Catch:{ all -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r10 = move-exception
            r5 = r10
            r10 = r8
            r8 = r5
        L_0x009b:
            r0.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a7
        L_0x009f:
            r0 = move-exception
            if (r8 != 0) goto L_0x00a4
            r8 = r0
            goto L_0x00a7
        L_0x00a4:
            androidx.fragment.app.z0.c(r8, r0)     // Catch:{ Exception -> 0x00b2 }
        L_0x00a7:
            if (r8 != 0) goto L_0x00ae
            sf.j.c(r10)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x011c
        L_0x00ae:
            throw r8     // Catch:{ Exception -> 0x00b2 }
        L_0x00af:
            r7 = move-exception
            goto L_0x012c
        L_0x00b2:
            r8 = move-exception
            goto L_0x0126
        L_0x00b5:
            wg.l r10 = r6.c()     // Catch:{ Exception -> 0x00b2 }
            wg.z r0 = r7.d()     // Catch:{ Exception -> 0x00b2 }
            wg.g0 r10 = r10.k(r0)     // Catch:{ Exception -> 0x00b2 }
            wg.b0 r10 = d2.f1.i(r10)     // Catch:{ Exception -> 0x00b2 }
            g4.c r0 = new g4.c     // Catch:{ all -> 0x00d2 }
            r0.<init>((jg.c0) r9)     // Catch:{ all -> 0x00d2 }
            r0.a(r10)     // Catch:{ all -> 0x00d2 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x00d2 }
            r1 = r0
            r0 = r8
            goto L_0x00d4
        L_0x00d2:
            r0 = move-exception
            r1 = r8
        L_0x00d4:
            r10.close()     // Catch:{ all -> 0x00d8 }
            goto L_0x00e0
        L_0x00d8:
            r10 = move-exception
            if (r0 != 0) goto L_0x00dd
            r0 = r10
            goto L_0x00e0
        L_0x00dd:
            androidx.fragment.app.z0.c(r0, r10)     // Catch:{ Exception -> 0x00b2 }
        L_0x00e0:
            if (r0 != 0) goto L_0x0125
            sf.j.c(r1)     // Catch:{ Exception -> 0x00b2 }
            wg.l r10 = r6.c()     // Catch:{ Exception -> 0x00b2 }
            wg.z r0 = r7.c()     // Catch:{ Exception -> 0x00b2 }
            wg.g0 r10 = r10.k(r0)     // Catch:{ Exception -> 0x00b2 }
            wg.b0 r10 = d2.f1.i(r10)     // Catch:{ Exception -> 0x00b2 }
            jg.d0 r0 = r9.C     // Catch:{ all -> 0x0107 }
            sf.j.c(r0)     // Catch:{ all -> 0x0107 }
            wg.h r0 = r0.e()     // Catch:{ all -> 0x0107 }
            long r0 = r0.r(r10)     // Catch:{ all -> 0x0107 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            r5 = r0
            r0 = r8
            r8 = r5
        L_0x010b:
            r10.close()     // Catch:{ all -> 0x010f }
            goto L_0x0117
        L_0x010f:
            r10 = move-exception
            if (r8 != 0) goto L_0x0114
            r8 = r10
            goto L_0x0117
        L_0x0114:
            androidx.fragment.app.z0.c(r8, r10)     // Catch:{ Exception -> 0x00b2 }
        L_0x0117:
            if (r8 != 0) goto L_0x0124
            sf.j.c(r0)     // Catch:{ Exception -> 0x00b2 }
        L_0x011c:
            z3.f$b r7 = r7.b()     // Catch:{ Exception -> 0x00b2 }
            m4.c.a(r9)
            return r7
        L_0x0124:
            throw r8     // Catch:{ Exception -> 0x00b2 }
        L_0x0125:
            throw r0     // Catch:{ Exception -> 0x00b2 }
        L_0x0126:
            android.graphics.Bitmap$Config[] r10 = m4.c.f11189a     // Catch:{ all -> 0x00af }
            r7.a()     // Catch:{ Exception -> 0x012b }
        L_0x012b:
            throw r8     // Catch:{ all -> 0x00af }
        L_0x012c:
            m4.c.a(r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.j.h(z3.a$b, jg.x, jg.c0, g4.c):z3.a$b");
    }
}
