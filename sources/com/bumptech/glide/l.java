package com.bumptech.glide;

import ag.b1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import e5.n;
import h5.e;
import h5.f;
import h5.g;
import i5.b;
import i5.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import r4.m;
import y4.h;
import y4.i;
import y4.k;
import y4.p;

public final class l<TranscodeType> extends h5.a<l<TranscodeType>> {
    public final Context W;
    public final m X;
    public final Class<TranscodeType> Y;
    public final h Z;

    /* renamed from: a0  reason: collision with root package name */
    public n<?, ? super TranscodeType> f4087a0;

    /* renamed from: b0  reason: collision with root package name */
    public Object f4088b0;

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList f4089c0;

    /* renamed from: d0  reason: collision with root package name */
    public l<TranscodeType> f4090d0;

    /* renamed from: e0  reason: collision with root package name */
    public l<TranscodeType> f4091e0;

    /* renamed from: f0  reason: collision with root package name */
    public Float f4092f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4093g0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4094h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4095i0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4096a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f4097b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.bumptech.glide.j[] r0 = com.bumptech.glide.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4097b = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r3 = f4097b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r3[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r3 = f4097b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r3 = 4
                int[] r4 = f4097b     // Catch:{ NoSuchFieldError -> 0x001c }
                r5 = 0
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4096a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r1 = f4096a     // Catch:{ NoSuchFieldError -> 0x0037 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                int[] r0 = f4096a     // Catch:{ NoSuchFieldError -> 0x0041 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = f4096a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f4096a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f4096a     // Catch:{ NoSuchFieldError -> 0x0061 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                int[] r0 = f4096a     // Catch:{ NoSuchFieldError -> 0x006c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f4096a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.a.<clinit>():void");
        }
    }

    static {
        g gVar = (g) ((g) ((g) new g().g(m.f13931b)).m()).r();
    }

    @SuppressLint({"CheckResult"})
    public l(b bVar, m mVar, Class<TranscodeType> cls, Context context) {
        g gVar;
        this.X = mVar;
        this.Y = cls;
        this.W = context;
        Map<Class<?>, n<?, ?>> map = mVar.f4127a.f4056c.f4065f;
        n<?, ? super TranscodeType> nVar = map.get(cls);
        if (nVar == null) {
            for (Map.Entry next : map.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    nVar = (n) next.getValue();
                }
            }
        }
        this.f4087a0 = nVar == null ? h.f4059k : nVar;
        this.Z = bVar.f4056c;
        Iterator<f<Object>> it = mVar.E.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        synchronized (mVar) {
            gVar = mVar.F;
        }
        y(gVar);
    }

    /* renamed from: A */
    public final l<TranscodeType> clone() {
        l<TranscodeType> lVar = (l) super.clone();
        lVar.f4087a0 = lVar.f4087a0.clone();
        if (lVar.f4089c0 != null) {
            lVar.f4089c0 = new ArrayList(lVar.f4089c0);
        }
        l<TranscodeType> lVar2 = lVar.f4090d0;
        if (lVar2 != null) {
            lVar.f4090d0 = lVar2.clone();
        }
        l<TranscodeType> lVar3 = lVar.f4091e0;
        if (lVar3 != null) {
            lVar.f4091e0 = lVar3.clone();
        }
        return lVar;
    }

    public final j B(j jVar) {
        int ordinal = jVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return j.f4072a;
        }
        if (ordinal == 2) {
            return j.f4073b;
        }
        if (ordinal == 3) {
            return j.f4074c;
        }
        throw new IllegalArgumentException("unknown priority: " + this.f9229d);
    }

    public final void C(ImageView imageView) {
        h5.a aVar;
        i5.g gVar;
        l5.l.a();
        b1.b(imageView);
        if (!h5.a.i(this.f9226a, 2048) && this.J && imageView.getScaleType() != null) {
            switch (a.f4096a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().j(k.f17194c, new h());
                    break;
                case 2:
                    aVar = clone().j(k.f17193b, new i());
                    aVar.U = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().j(k.f17192a, new p());
                    aVar.U = true;
                    break;
                case 6:
                    aVar = clone().j(k.f17193b, new i());
                    aVar.U = true;
                    break;
            }
        }
        aVar = this;
        this.Z.f4062c.getClass();
        Class<TranscodeType> cls = this.Y;
        if (Bitmap.class.equals(cls)) {
            gVar = new b(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            gVar = new d(imageView);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        D(gVar, aVar);
    }

    public final void D(i5.g gVar, h5.a aVar) {
        b1.b(gVar);
        if (this.f4094h0) {
            Object obj = new Object();
            h5.d z10 = z(aVar.G, aVar.F, aVar.f9229d, this.f4087a0, aVar, (e) null, gVar, obj);
            h5.d b10 = gVar.b();
            if (z10.b(b10)) {
                if (!(!aVar.E && b10.i())) {
                    b1.b(b10);
                    if (!b10.isRunning()) {
                        b10.h();
                        return;
                    }
                    return;
                }
            }
            this.X.l(gVar);
            gVar.i(z10);
            m mVar = this.X;
            synchronized (mVar) {
                mVar.B.f7845a.add(gVar);
                n nVar = mVar.f4130d;
                nVar.f7823a.add(z10);
                if (!nVar.f7825c) {
                    z10.h();
                } else {
                    z10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.f7824b.add(z10);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final l<TranscodeType> E(Object obj) {
        if (this.R) {
            return clone().E(obj);
        }
        this.f4088b0 = obj;
        this.f4094h0 = true;
        n();
        return this;
    }

    public final h5.i F(int i8, int i10, j jVar, n nVar, h5.a aVar, e eVar, i5.g gVar, Object obj) {
        Context context = this.W;
        Object obj2 = this.f4088b0;
        Class<TranscodeType> cls = this.Y;
        ArrayList arrayList = this.f4089c0;
        h hVar = this.Z;
        return new h5.i(context, hVar, obj, obj2, cls, aVar, i8, i10, jVar, gVar, arrayList, eVar, hVar.f4066g, nVar.f4135a);
    }

    @Deprecated
    public final l G() {
        if (this.R) {
            return clone().G();
        }
        this.f4092f0 = Float.valueOf(0.5f);
        n();
        return this;
    }

    public final l H(a5.i iVar) {
        if (this.R) {
            return clone().H(iVar);
        }
        this.f4087a0 = iVar;
        this.f4093g0 = false;
        n();
        return this;
    }

    public final h5.a a(h5.a aVar) {
        b1.b(aVar);
        return (l) super.a(aVar);
    }

    public final l<TranscodeType> x(f<TranscodeType> fVar) {
        if (this.R) {
            return clone().x(fVar);
        }
        if (fVar != null) {
            if (this.f4089c0 == null) {
                this.f4089c0 = new ArrayList();
            }
            this.f4089c0.add(fVar);
        }
        n();
        return this;
    }

    public final l<TranscodeType> y(h5.a<?> aVar) {
        b1.b(aVar);
        return (l) super.a(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: h5.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: h5.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: h5.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: h5.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: h5.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: h5.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.bumptech.glide.n<?, ? super TranscodeType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: h5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: h5.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: h5.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h5.d z(int r19, int r20, com.bumptech.glide.j r21, com.bumptech.glide.n r22, h5.a r23, h5.e r24, i5.g r25, java.lang.Object r26) {
        /*
            r18 = this;
            r9 = r18
            r10 = r21
            r11 = r23
            r12 = r26
            com.bumptech.glide.l<TranscodeType> r0 = r9.f4091e0
            if (r0 == 0) goto L_0x0016
            h5.b r0 = new h5.b
            r1 = r24
            r0.<init>(r12, r1)
            r6 = r0
            r13 = r6
            goto L_0x001b
        L_0x0016:
            r1 = r24
            r0 = 0
            r13 = r0
            r6 = r1
        L_0x001b:
            com.bumptech.glide.l<TranscodeType> r0 = r9.f4090d0
            if (r0 == 0) goto L_0x00a5
            boolean r1 = r9.f4095i0
            if (r1 != 0) goto L_0x009d
            com.bumptech.glide.n<?, ? super TranscodeType> r1 = r0.f4087a0
            boolean r2 = r0.f4093g0
            if (r2 == 0) goto L_0x002c
            r14 = r22
            goto L_0x002d
        L_0x002c:
            r14 = r1
        L_0x002d:
            int r0 = r0.f9226a
            r1 = 8
            boolean r0 = h5.a.i(r0, r1)
            if (r0 == 0) goto L_0x003c
            com.bumptech.glide.l<TranscodeType> r0 = r9.f4090d0
            com.bumptech.glide.j r0 = r0.f9229d
            goto L_0x0040
        L_0x003c:
            com.bumptech.glide.j r0 = r9.B(r10)
        L_0x0040:
            r15 = r0
            com.bumptech.glide.l<TranscodeType> r0 = r9.f4090d0
            int r1 = r0.G
            int r0 = r0.F
            boolean r2 = l5.l.g(r19, r20)
            if (r2 == 0) goto L_0x0062
            com.bumptech.glide.l<TranscodeType> r2 = r9.f4090d0
            int r3 = r2.G
            int r2 = r2.F
            boolean r2 = l5.l.g(r3, r2)
            if (r2 != 0) goto L_0x0062
            int r0 = r11.G
            int r1 = r11.F
            r16 = r0
            r17 = r1
            goto L_0x0066
        L_0x0062:
            r17 = r0
            r16 = r1
        L_0x0066:
            h5.j r8 = new h5.j
            r8.<init>(r12, r6)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r8
            r7 = r25
            r10 = r8
            r8 = r26
            h5.i r8 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
            r9.f4095i0 = r0
            com.bumptech.glide.l<TranscodeType> r5 = r9.f4090d0
            r0 = r5
            r1 = r16
            r2 = r17
            r3 = r15
            r4 = r14
            r6 = r10
            r14 = r8
            r8 = r26
            h5.d r0 = r0.z(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            r9.f4095i0 = r1
            r10.f9264c = r14
            r10.f9265d = r0
            goto L_0x00f8
        L_0x009d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            java.lang.Float r0 = r9.f4092f0
            if (r0 == 0) goto L_0x00e3
            h5.j r14 = new h5.j
            r14.<init>(r12, r6)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r14
            r7 = r25
            r8 = r26
            h5.i r15 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            h5.a r0 = r23.clone()
            java.lang.Float r1 = r9.f4092f0
            float r1 = r1.floatValue()
            h5.a r5 = r0.q(r1)
            com.bumptech.glide.j r3 = r9.B(r10)
            r0 = r18
            r1 = r19
            h5.i r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.f9264c = r15
            r14.f9265d = r0
            r10 = r14
            goto L_0x00f8
        L_0x00e3:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r25
            r8 = r26
            h5.i r8 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = r8
        L_0x00f8:
            if (r13 != 0) goto L_0x00fb
            return r10
        L_0x00fb:
            com.bumptech.glide.l<TranscodeType> r0 = r9.f4091e0
            int r1 = r0.G
            int r0 = r0.F
            boolean r2 = l5.l.g(r19, r20)
            if (r2 == 0) goto L_0x011a
            com.bumptech.glide.l<TranscodeType> r2 = r9.f4091e0
            int r3 = r2.G
            int r2 = r2.F
            boolean r2 = l5.l.g(r3, r2)
            if (r2 != 0) goto L_0x011a
            int r0 = r11.G
            int r1 = r11.F
            r2 = r1
            r1 = r0
            goto L_0x011b
        L_0x011a:
            r2 = r0
        L_0x011b:
            com.bumptech.glide.l<TranscodeType> r5 = r9.f4091e0
            com.bumptech.glide.n<?, ? super TranscodeType> r4 = r5.f4087a0
            com.bumptech.glide.j r3 = r5.f9229d
            r0 = r5
            r6 = r13
            r7 = r25
            r8 = r26
            h5.d r0 = r0.z(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.f9233c = r10
            r13.f9234d = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.z(int, int, com.bumptech.glide.j, com.bumptech.glide.n, h5.a, h5.e, i5.g, java.lang.Object):h5.d");
    }
}
