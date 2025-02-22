package c4;

import android.graphics.drawable.Drawable;
import b4.h;
import f4.c;
import h4.l;
import jf.d;
import lf.e;
import x3.f;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f f3662a;

    /* renamed from: b  reason: collision with root package name */
    public final f3.a f3663b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3664c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f3665a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3666b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3667c;

        /* renamed from: d  reason: collision with root package name */
        public final String f3668d;

        public a(Drawable drawable, boolean z10, int i8, String str) {
            this.f3665a = drawable;
            this.f3666b = z10;
            this.f3667c = i8;
            this.f3668d = str;
        }
    }

    @e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
    /* renamed from: c4.b$b  reason: collision with other inner class name */
    public static final class C0056b extends lf.c {
        public x3.b B;
        public h C;
        public int D;
        public /* synthetic */ Object E;
        public final /* synthetic */ b F;
        public int G;

        /* renamed from: a  reason: collision with root package name */
        public b f3669a;

        /* renamed from: b  reason: collision with root package name */
        public x3.a f3670b;

        /* renamed from: c  reason: collision with root package name */
        public h4.h f3671c;

        /* renamed from: d  reason: collision with root package name */
        public Object f3672d;

        /* renamed from: e  reason: collision with root package name */
        public l f3673e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0056b(b bVar, d<? super C0056b> dVar) {
            super(dVar);
            this.F = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.E = obj;
            this.G |= Integer.MIN_VALUE;
            return this.F.d((x3.a) null, (h4.h) null, (Object) null, (l) null, (x3.b) null, this);
        }
    }

    public b(f fVar, f3.a aVar) {
        this.f3662a = fVar;
        this.f3663b = aVar;
        this.f3664c = new c(fVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: y3.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: y3.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: y3.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: ff.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(c4.b r17, b4.l r18, x3.a r19, h4.h r20, java.lang.Object r21, h4.l r22, x3.b r23, jf.d r24) {
        /*
            r0 = r24
            r17.getClass()
            boolean r1 = r0 instanceof c4.c
            if (r1 == 0) goto L_0x001a
            r1 = r0
            c4.c r1 = (c4.c) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.H = r2
            r2 = r17
            goto L_0x0021
        L_0x001a:
            c4.c r1 = new c4.c
            r2 = r17
            r1.<init>(r2, r0)
        L_0x0021:
            java.lang.Object r0 = r1.F
            kf.a r3 = kf.a.f10464a
            int r4 = r1.H
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0059
            if (r4 != r6) goto L_0x0051
            int r2 = r1.E
            x3.b r4 = r1.C
            h4.l r7 = r1.B
            java.lang.Object r8 = r1.f3678e
            h4.h r9 = r1.f3677d
            x3.a r10 = r1.f3676c
            b4.l r11 = r1.f3675b
            c4.b r12 = r1.f3674a
            cb.b.J(r0)
            r15 = r8
            r8 = r1
            r1 = r10
            r10 = r5
            r5 = r7
            r7 = r2
            r2 = r12
            r12 = r6
            r6 = r4
            r4 = r15
            r16 = r9
            r9 = r3
            r3 = r16
            goto L_0x00c4
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            cb.b.J(r0)
            r0 = 0
            r4 = r21
            r7 = r0
            r8 = r1
            r9 = r3
            r10 = r5
            r11 = r6
            r0 = r18
            r1 = r19
            r3 = r20
            r5 = r22
            r6 = r23
        L_0x006e:
            x3.f r12 = r2.f3662a
            java.util.List<y3.e$a> r12 = r1.f16920e
            int r13 = r12.size()
        L_0x0076:
            if (r7 >= r13) goto L_0x0091
            java.lang.Object r14 = r12.get(r7)
            y3.e$a r14 = (y3.e.a) r14
            y3.b r14 = r14.a(r0, r5)
            if (r14 == 0) goto L_0x008e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            ff.g r12 = new ff.g
            r12.<init>(r14, r7)
            goto L_0x0092
        L_0x008e:
            int r7 = r7 + 1
            goto L_0x0076
        L_0x0091:
            r12 = r10
        L_0x0092:
            if (r12 == 0) goto L_0x00e8
            A r7 = r12.f8706a
            y3.e r7 = (y3.e) r7
            B r12 = r12.f8707b
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r12 = r12 + r11
            r6.i()
            r8.f3674a = r2
            r8.f3675b = r0
            r8.f3676c = r1
            r8.f3677d = r3
            r8.f3678e = r4
            r8.B = r5
            r8.C = r6
            r8.D = r7
            r8.E = r12
            r8.H = r11
            java.lang.Object r7 = r7.a(r8)
            if (r7 != r9) goto L_0x00bf
            goto L_0x00e4
        L_0x00bf:
            r15 = r11
            r11 = r0
            r0 = r7
            r7 = r12
            r12 = r15
        L_0x00c4:
            y3.d r0 = (y3.d) r0
            r6.d()
            if (r0 == 0) goto L_0x00e5
            c4.b$a r9 = new c4.b$a
            int r1 = r11.f3247c
            y3.k r2 = r11.f3245a
            boolean r3 = r2 instanceof y3.j
            if (r3 == 0) goto L_0x00d8
            y3.j r2 = (y3.j) r2
            goto L_0x00d9
        L_0x00d8:
            r2 = r10
        L_0x00d9:
            if (r2 == 0) goto L_0x00dd
            java.lang.String r10 = r2.f17159c
        L_0x00dd:
            android.graphics.drawable.Drawable r2 = r0.f17148a
            boolean r0 = r0.f17149b
            r9.<init>(r2, r0, r1, r10)
        L_0x00e4:
            return r9
        L_0x00e5:
            r0 = r11
            r11 = r12
            goto L_0x006e
        L_0x00e8:
            java.lang.String r0 = "Unable to create a decoder that supports: "
            java.lang.String r0 = c4.a.c(r0, r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.b(c4.b, b4.l, x3.a, h4.h, java.lang.Object, h4.l, x3.b, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ab, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ac, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ad, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0227, code lost:
        if (r1 == r10) goto L_0x0243;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x004f, B:63:0x018d] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016d A[Catch:{ all -> 0x01ab, all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b0 A[Catch:{ all -> 0x01ab, all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(c4.b r27, h4.h r28, java.lang.Object r29, h4.l r30, x3.b r31, jf.d r32) {
        /*
            r0 = r27
            r8 = r28
            r1 = r32
            r27.getClass()
            boolean r2 = r1 instanceof c4.d
            if (r2 == 0) goto L_0x001c
            r2 = r1
            c4.d r2 = (c4.d) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001c
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x0021
        L_0x001c:
            c4.d r2 = new c4.d
            r2.<init>(r0, r1)
        L_0x0021:
            r9 = r2
            java.lang.Object r1 = r9.E
            kf.a r10 = kf.a.f10464a
            int r2 = r9.G
            r11 = 3
            r12 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0077
            if (r2 == r3) goto L_0x0054
            if (r2 == r12) goto L_0x0041
            if (r2 != r11) goto L_0x0039
            cb.b.J(r1)
            r3 = 0
            goto L_0x022a
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            sf.v r2 = r9.f3683e
            java.lang.Object r0 = r9.f3682d
            sf.v r0 = (sf.v) r0
            java.lang.Object r3 = r9.f3681c
            x3.b r3 = (x3.b) r3
            h4.h r4 = r9.f3680b
            c4.b r5 = r9.f3679a
            cb.b.J(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x01a2
        L_0x0054:
            sf.v r0 = r9.D
            sf.v r2 = r9.C
            sf.v r3 = r9.B
            sf.v r4 = r9.f3683e
            java.lang.Object r5 = r9.f3682d
            x3.b r5 = (x3.b) r5
            java.lang.Object r6 = r9.f3681c
            h4.h r7 = r9.f3680b
            c4.b r8 = r9.f3679a
            cb.b.J(r1)     // Catch:{ all -> 0x0073 }
            r13 = r0
            r21 = r3
            r14 = r4
            r12 = r5
            r23 = r6
            r0 = r8
            goto L_0x0162
        L_0x0073:
            r0 = move-exception
            r3 = 0
            goto L_0x024f
        L_0x0077:
            cb.b.J(r1)
            sf.v r14 = new sf.v
            r14.<init>()
            r1 = r30
            r14.f14957a = r1
            sf.v r15 = new sf.v
            r15.<init>()
            x3.f r1 = r0.f3662a
            x3.a r1 = r1.getComponents()
            r15.f14957a = r1
            sf.v r7 = new sf.v
            r7.<init>()
            f3.a r1 = r0.f3663b     // Catch:{ all -> 0x0254 }
            T r2 = r14.f14957a     // Catch:{ all -> 0x0254 }
            h4.l r2 = (h4.l) r2     // Catch:{ all -> 0x0254 }
            r1.getClass()     // Catch:{ all -> 0x0254 }
            android.graphics.Bitmap$Config r2 = r2.f9196b     // Catch:{ all -> 0x0254 }
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x0254 }
            r5 = 0
            if (r2 != r4) goto L_0x00a7
            r2 = r3
            goto L_0x00a8
        L_0x00a7:
            r2 = r5
        L_0x00a8:
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r1 = r1.f8049c     // Catch:{ all -> 0x0254 }
            androidx.fragment.app.z r1 = (androidx.fragment.app.z) r1     // Catch:{ all -> 0x0254 }
            boolean r1 = r1.f()     // Catch:{ all -> 0x0254 }
            if (r1 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r1 = r5
            goto L_0x00b8
        L_0x00b7:
            r1 = r3
        L_0x00b8:
            if (r1 != 0) goto L_0x00ca
            T r1 = r14.f14957a     // Catch:{ all -> 0x00c7 }
            h4.l r1 = (h4.l) r1     // Catch:{ all -> 0x00c7 }
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00c7 }
            h4.l r1 = h4.l.a(r1, r2)     // Catch:{ all -> 0x00c7 }
            r14.f14957a = r1     // Catch:{ all -> 0x00c7 }
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            goto L_0x01ad
        L_0x00ca:
            ff.g<b4.h$a<?>, java.lang.Class<?>> r1 = r8.f9153j     // Catch:{ all -> 0x0254 }
            y3.e$a r2 = r8.f9154k
            if (r1 != 0) goto L_0x00d2
            if (r2 == 0) goto L_0x012a
        L_0x00d2:
            T r1 = r15.f14957a     // Catch:{ all -> 0x0254 }
            x3.a r1 = (x3.a) r1     // Catch:{ all -> 0x0254 }
            r1.getClass()     // Catch:{ all -> 0x0254 }
            java.util.List<c4.i> r4 = r1.f16916a     // Catch:{ all -> 0x0254 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x0254 }
            java.util.ArrayList r4 = gf.q.P0(r4)     // Catch:{ all -> 0x0254 }
            java.util.List<ff.g<e4.d<? extends java.lang.Object, ? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> r6 = r1.f16917b     // Catch:{ all -> 0x0254 }
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x0254 }
            java.util.ArrayList r6 = gf.q.P0(r6)     // Catch:{ all -> 0x0254 }
            java.util.List<ff.g<d4.b<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> r11 = r1.f16918c     // Catch:{ all -> 0x0254 }
            java.util.Collection r11 = (java.util.Collection) r11     // Catch:{ all -> 0x0254 }
            java.util.ArrayList r11 = gf.q.P0(r11)     // Catch:{ all -> 0x0254 }
            java.util.List<ff.g<b4.h$a<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> r12 = r1.f16919d     // Catch:{ all -> 0x0254 }
            java.util.Collection r12 = (java.util.Collection) r12     // Catch:{ all -> 0x0254 }
            java.util.ArrayList r12 = gf.q.P0(r12)     // Catch:{ all -> 0x0254 }
            java.util.List<y3.e$a> r1 = r1.f16920e     // Catch:{ all -> 0x0254 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0254 }
            java.util.ArrayList r1 = gf.q.P0(r1)     // Catch:{ all -> 0x0254 }
            ff.g<b4.h$a<?>, java.lang.Class<?>> r13 = r8.f9153j     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x0108
            r12.add(r5, r13)     // Catch:{ all -> 0x00c7 }
        L_0x0108:
            if (r2 == 0) goto L_0x010d
            r1.add(r5, r2)     // Catch:{ all -> 0x00c7 }
        L_0x010d:
            x3.a r2 = new x3.a     // Catch:{ all -> 0x0254 }
            java.util.List r19 = e9.c.n(r4)     // Catch:{ all -> 0x0254 }
            java.util.List r20 = e9.c.n(r6)     // Catch:{ all -> 0x0254 }
            java.util.List r21 = e9.c.n(r11)     // Catch:{ all -> 0x0254 }
            java.util.List r22 = e9.c.n(r12)     // Catch:{ all -> 0x0254 }
            java.util.List r23 = e9.c.n(r1)     // Catch:{ all -> 0x0254 }
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0254 }
            r15.f14957a = r2     // Catch:{ all -> 0x0254 }
        L_0x012a:
            T r1 = r15.f14957a     // Catch:{ all -> 0x0254 }
            r2 = r1
            x3.a r2 = (x3.a) r2     // Catch:{ all -> 0x0254 }
            T r1 = r14.f14957a     // Catch:{ all -> 0x0254 }
            r5 = r1
            h4.l r5 = (h4.l) r5     // Catch:{ all -> 0x0254 }
            r9.f3679a = r0     // Catch:{ all -> 0x0254 }
            r9.f3680b = r8     // Catch:{ all -> 0x0254 }
            r11 = r29
            r9.f3681c = r11     // Catch:{ all -> 0x0254 }
            r12 = r31
            r9.f3682d = r12     // Catch:{ all -> 0x0254 }
            r9.f3683e = r14     // Catch:{ all -> 0x0254 }
            r9.B = r15     // Catch:{ all -> 0x0254 }
            r9.C = r7     // Catch:{ all -> 0x0254 }
            r9.D = r7     // Catch:{ all -> 0x0254 }
            r9.G = r3     // Catch:{ all -> 0x0254 }
            r1 = r27
            r3 = r28
            r4 = r29
            r6 = r31
            r13 = r7
            r7 = r9
            java.lang.Object r1 = r1.d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0251 }
            if (r1 != r10) goto L_0x015c
            goto L_0x0243
        L_0x015c:
            r7 = r8
            r23 = r11
            r2 = r13
            r21 = r15
        L_0x0162:
            r13.f14957a = r1     // Catch:{ all -> 0x0073 }
            T r1 = r2.f14957a     // Catch:{ all -> 0x0073 }
            r3 = r1
            b4.g r3 = (b4.g) r3     // Catch:{ all -> 0x0073 }
            boolean r4 = r3 instanceof b4.l     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x01b0
            ag.c0 r1 = r7.f9167y     // Catch:{ all -> 0x0073 }
            c4.e r3 = new c4.e     // Catch:{ all -> 0x0073 }
            r26 = 0
            r18 = r3
            r19 = r0
            r20 = r2
            r22 = r7
            r24 = r14
            r25 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0073 }
            r9.f3679a = r0     // Catch:{ all -> 0x0073 }
            r9.f3680b = r7     // Catch:{ all -> 0x0073 }
            r9.f3681c = r12     // Catch:{ all -> 0x0073 }
            r9.f3682d = r14     // Catch:{ all -> 0x0073 }
            r9.f3683e = r2     // Catch:{ all -> 0x0073 }
            r4 = 0
            r9.B = r4     // Catch:{ all -> 0x01ab }
            r9.C = r4     // Catch:{ all -> 0x01ab }
            r9.D = r4     // Catch:{ all -> 0x01ab }
            r4 = 2
            r9.G = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r1 = cb.b.M(r1, r3, r9)     // Catch:{ all -> 0x0073 }
            if (r1 != r10) goto L_0x019e
            goto L_0x0243
        L_0x019e:
            r5 = r0
            r4 = r7
            r3 = r12
            r0 = r14
        L_0x01a2:
            c4.b$a r1 = (c4.b.a) r1     // Catch:{ all -> 0x0073 }
            r14 = r0
            r20 = r3
            r7 = r4
            r16 = r5
            goto L_0x01cd
        L_0x01ab:
            r0 = move-exception
            r7 = r2
        L_0x01ad:
            r3 = 0
            goto L_0x0258
        L_0x01b0:
            boolean r3 = r3 instanceof b4.f     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0247
            c4.b$a r3 = new c4.b$a     // Catch:{ all -> 0x0073 }
            r4 = r1
            b4.f r4 = (b4.f) r4     // Catch:{ all -> 0x0073 }
            android.graphics.drawable.Drawable r4 = r4.f3221a     // Catch:{ all -> 0x0073 }
            r5 = r1
            b4.f r5 = (b4.f) r5     // Catch:{ all -> 0x0073 }
            boolean r5 = r5.f3222b     // Catch:{ all -> 0x0073 }
            b4.f r1 = (b4.f) r1     // Catch:{ all -> 0x0073 }
            int r1 = r1.f3223c     // Catch:{ all -> 0x0073 }
            r6 = 0
            r3.<init>(r4, r5, r1, r6)     // Catch:{ all -> 0x0244 }
            r16 = r0
            r1 = r3
            r20 = r12
        L_0x01cd:
            T r0 = r2.f14957a
            boolean r2 = r0 instanceof b4.l
            if (r2 == 0) goto L_0x01d7
            r4 = r0
            b4.l r4 = (b4.l) r4
            goto L_0x01d8
        L_0x01d7:
            r4 = 0
        L_0x01d8:
            if (r4 == 0) goto L_0x01e1
            y3.k r0 = r4.f3245a
            if (r0 == 0) goto L_0x01e1
            m4.c.a(r0)
        L_0x01e1:
            T r0 = r14.f14957a
            r18 = r0
            h4.l r18 = (h4.l) r18
            r3 = 0
            r9.f3679a = r3
            r9.f3680b = r3
            r9.f3681c = r3
            r9.f3682d = r3
            r9.f3683e = r3
            r9.B = r3
            r9.C = r3
            r9.D = r3
            r0 = 3
            r9.G = r0
            r16.getClass()
            java.util.List<k4.b> r0 = r7.f9155l
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0207
            goto L_0x0227
        L_0x0207:
            android.graphics.drawable.Drawable r2 = r1.f3665a
            boolean r2 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 != 0) goto L_0x0212
            boolean r2 = r7.f9158p
            if (r2 != 0) goto L_0x0212
            goto L_0x0227
        L_0x0212:
            c4.h r2 = new c4.h
            r22 = 0
            r15 = r2
            r17 = r1
            r19 = r0
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            ag.c0 r0 = r7.f9168z
            java.lang.Object r0 = cb.b.M(r0, r2, r9)
            r1 = r0
        L_0x0227:
            if (r1 != r10) goto L_0x022a
            goto L_0x0243
        L_0x022a:
            r10 = r1
            c4.b$a r10 = (c4.b.a) r10
            android.graphics.drawable.Drawable r0 = r10.f3665a
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L_0x0237
            r13 = r0
            android.graphics.drawable.BitmapDrawable r13 = (android.graphics.drawable.BitmapDrawable) r13
            goto L_0x0238
        L_0x0237:
            r13 = r3
        L_0x0238:
            if (r13 == 0) goto L_0x0243
            android.graphics.Bitmap r0 = r13.getBitmap()
            if (r0 == 0) goto L_0x0243
            r0.prepareToDraw()
        L_0x0243:
            return r10
        L_0x0244:
            r0 = move-exception
            r3 = r6
            goto L_0x024f
        L_0x0247:
            r3 = 0
            ff.e r0 = new ff.e     // Catch:{ all -> 0x024e }
            r0.<init>()     // Catch:{ all -> 0x024e }
            throw r0     // Catch:{ all -> 0x024e }
        L_0x024e:
            r0 = move-exception
        L_0x024f:
            r7 = r2
            goto L_0x0258
        L_0x0251:
            r0 = move-exception
        L_0x0252:
            r3 = 0
            goto L_0x0257
        L_0x0254:
            r0 = move-exception
            r13 = r7
            goto L_0x0252
        L_0x0257:
            r7 = r13
        L_0x0258:
            T r1 = r7.f14957a
            boolean r2 = r1 instanceof b4.l
            if (r2 == 0) goto L_0x0262
            r13 = r1
            b4.l r13 = (b4.l) r13
            goto L_0x0263
        L_0x0262:
            r13 = r3
        L_0x0263:
            if (r13 == 0) goto L_0x026c
            y3.k r1 = r13.f3245a
            if (r1 == 0) goto L_0x026c
            m4.c.a(r1)
        L_0x026c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.c(c4.b, h4.h, java.lang.Object, h4.l, x3.b, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(c4.j r19, jf.d r20) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            r0 = r20
            f4.c r1 = r10.f3664c
            boolean r2 = r0 instanceof c4.f
            if (r2 == 0) goto L_0x001b
            r2 = r0
            c4.f r2 = (c4.f) r2
            int r3 = r2.f3693e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f3693e = r3
            goto L_0x0020
        L_0x001b:
            c4.f r2 = new c4.f
            r2.<init>(r10, r0)
        L_0x0020:
            r0 = r2
            java.lang.Object r2 = r0.f3691c
            kf.a r12 = kf.a.f10464a
            int r3 = r0.f3693e
            r13 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 != r13) goto L_0x0038
            c4.i$a r1 = r0.f3690b
            c4.b r3 = r0.f3689a
            cb.b.J(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x00cb
        L_0x0035:
            r0 = move-exception
            goto L_0x00cf
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            cb.b.J(r2)
            h4.h r3 = r11.f3707d     // Catch:{ all -> 0x00cc }
            java.lang.Object r2 = r3.f9145b     // Catch:{ all -> 0x00cc }
            i4.e r4 = r11.f3708e     // Catch:{ all -> 0x00cc }
            android.graphics.Bitmap$Config[] r5 = m4.c.f11189a     // Catch:{ all -> 0x00cc }
            x3.b r6 = r11.f3709f     // Catch:{ all -> 0x00cc }
            f3.a r5 = r10.f3663b     // Catch:{ all -> 0x00cc }
            h4.l r5 = r5.c(r3, r4)     // Catch:{ all -> 0x00cc }
            int r7 = r5.f9199e     // Catch:{ all -> 0x00cc }
            r6.j()     // Catch:{ all -> 0x00cc }
            x3.f r8 = r10.f3662a     // Catch:{ all -> 0x00cc }
            x3.a r8 = r8.getComponents()     // Catch:{ all -> 0x00cc }
            java.util.List<ff.g<e4.d<? extends java.lang.Object, ? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> r8 = r8.f16917b     // Catch:{ all -> 0x00cc }
            int r9 = r8.size()     // Catch:{ all -> 0x00cc }
            r14 = 0
            r17 = r14
            r14 = r2
            r2 = r17
        L_0x006a:
            if (r2 >= r9) goto L_0x0098
            java.lang.Object r15 = r8.get(r2)     // Catch:{ all -> 0x00cc }
            ff.g r15 = (ff.g) r15     // Catch:{ all -> 0x00cc }
            A r13 = r15.f8706a     // Catch:{ all -> 0x00cc }
            e4.d r13 = (e4.d) r13     // Catch:{ all -> 0x00cc }
            B r15 = r15.f8707b     // Catch:{ all -> 0x00cc }
            java.lang.Class r15 = (java.lang.Class) r15     // Catch:{ all -> 0x00cc }
            r16 = r8
            java.lang.Class r8 = r14.getClass()     // Catch:{ all -> 0x00cc }
            boolean r8 = r15.isAssignableFrom(r8)     // Catch:{ all -> 0x00cc }
            if (r8 == 0) goto L_0x0092
            java.lang.String r8 = "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>"
            sf.j.d(r13, r8)     // Catch:{ all -> 0x00cc }
            java.lang.Object r8 = r13.a(r14, r5)     // Catch:{ all -> 0x00cc }
            if (r8 == 0) goto L_0x0092
            r14 = r8
        L_0x0092:
            int r2 = r2 + 1
            r8 = r16
            r13 = 1
            goto L_0x006a
        L_0x0098:
            r6.k()     // Catch:{ all -> 0x00cc }
            f4.b$a r8 = r1.b(r3, r14, r5, r6)     // Catch:{ all -> 0x00cc }
            if (r8 == 0) goto L_0x00a6
            f4.b$b r1 = r1.a(r3, r8, r4, r7)     // Catch:{ all -> 0x00cc }
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            if (r1 == 0) goto L_0x00ae
            h4.n r0 = f4.c.c(r11, r3, r8, r1)     // Catch:{ all -> 0x00cc }
            return r0
        L_0x00ae:
            ag.c0 r13 = r3.f9166x     // Catch:{ all -> 0x00cc }
            c4.g r15 = new c4.g     // Catch:{ all -> 0x00cc }
            r9 = 0
            r1 = r15
            r2 = r18
            r4 = r14
            r7 = r8
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cc }
            r0.f3689a = r10     // Catch:{ all -> 0x00cc }
            r0.f3690b = r11     // Catch:{ all -> 0x00cc }
            r1 = 1
            r0.f3693e = r1     // Catch:{ all -> 0x00cc }
            java.lang.Object r2 = cb.b.M(r13, r15, r0)     // Catch:{ all -> 0x00cc }
            if (r2 != r12) goto L_0x00cb
            return r12
        L_0x00cb:
            return r2
        L_0x00cc:
            r0 = move-exception
            r3 = r10
            r1 = r11
        L_0x00cf:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L_0x00e1
            f3.a r2 = r3.f3663b
            h4.h r1 = r1.b()
            r2.getClass()
            h4.e r0 = f3.a.a(r1, r0)
            return r0
        L_0x00e1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.a(c4.j, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(x3.a r19, h4.h r20, java.lang.Object r21, h4.l r22, x3.b r23, jf.d<? super b4.g> r24) {
        /*
            r18 = this;
            r0 = r24
            boolean r1 = r0 instanceof c4.b.C0056b
            if (r1 == 0) goto L_0x0017
            r1 = r0
            c4.b$b r1 = (c4.b.C0056b) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.G = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            c4.b$b r1 = new c4.b$b
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.E
            kf.a r3 = kf.a.f10464a
            int r4 = r1.G
            r5 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 != r5) goto L_0x004a
            int r4 = r1.D
            x3.b r6 = r1.B
            h4.l r7 = r1.f3673e
            java.lang.Object r8 = r1.f3672d
            h4.h r9 = r1.f3671c
            x3.a r10 = r1.f3670b
            c4.b r11 = r1.f3669a
            cb.b.J(r0)
            r16 = r7
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r6
            r6 = r4
            r4 = r16
            r17 = r8
            r8 = r3
            r3 = r17
            goto L_0x00d1
        L_0x004a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0052:
            cb.b.J(r0)
            r0 = 0
            r4 = r22
            r6 = r0
            r7 = r1
            r11 = r2
            r8 = r3
            r9 = r5
            r0 = r19
            r1 = r20
            r3 = r21
            r5 = r23
        L_0x0065:
            x3.f r10 = r11.f3662a
            java.util.List<ff.g<b4.h$a<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>>> r10 = r0.f16919d
            int r12 = r10.size()
        L_0x006d:
            if (r6 >= r12) goto L_0x009f
            java.lang.Object r13 = r10.get(r6)
            ff.g r13 = (ff.g) r13
            A r14 = r13.f8706a
            b4.h$a r14 = (b4.h.a) r14
            B r13 = r13.f8707b
            java.lang.Class r13 = (java.lang.Class) r13
            java.lang.Class r15 = r3.getClass()
            boolean r13 = r13.isAssignableFrom(r15)
            if (r13 == 0) goto L_0x009c
            java.lang.String r13 = "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"
            sf.j.d(r14, r13)
            b4.h r13 = r14.a(r3, r4)
            if (r13 == 0) goto L_0x009c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            ff.g r10 = new ff.g
            r10.<init>(r13, r6)
            goto L_0x00a0
        L_0x009c:
            int r6 = r6 + 1
            goto L_0x006d
        L_0x009f:
            r10 = 0
        L_0x00a0:
            if (r10 == 0) goto L_0x00f0
            A r6 = r10.f8706a
            b4.h r6 = (b4.h) r6
            B r10 = r10.f8707b
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r10 = r10 + r9
            r5.g()
            r7.f3669a = r11
            r7.f3670b = r0
            r7.f3671c = r1
            r7.f3672d = r3
            r7.f3673e = r4
            r7.B = r5
            r7.C = r6
            r7.D = r10
            r7.G = r9
            java.lang.Object r6 = r6.a(r7)
            if (r6 != r8) goto L_0x00cb
            return r8
        L_0x00cb:
            r16 = r10
            r10 = r0
            r0 = r6
            r6 = r16
        L_0x00d1:
            r12 = r0
            b4.g r12 = (b4.g) r12
            r5.e()     // Catch:{ all -> 0x00dc }
            if (r12 == 0) goto L_0x00da
            return r12
        L_0x00da:
            r0 = r10
            goto L_0x0065
        L_0x00dc:
            r0 = move-exception
            r1 = r0
            boolean r0 = r12 instanceof b4.l
            if (r0 == 0) goto L_0x00e5
            b4.l r12 = (b4.l) r12
            goto L_0x00e6
        L_0x00e5:
            r12 = 0
        L_0x00e6:
            if (r12 == 0) goto L_0x00ef
            y3.k r0 = r12.f3245a
            if (r0 == 0) goto L_0x00ef
            m4.c.a(r0)
        L_0x00ef:
            throw r1
        L_0x00f0:
            java.lang.String r0 = "Unable to create a fetcher that supports: "
            java.lang.String r0 = c4.a.c(r0, r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.d(x3.a, h4.h, java.lang.Object, h4.l, x3.b, jf.d):java.lang.Object");
    }
}
