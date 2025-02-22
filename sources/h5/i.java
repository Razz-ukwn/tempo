package h5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.j;
import d.a;
import i5.f;
import i5.g;
import j5.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l5.e;
import l5.l;
import m5.d;
import r4.n;
import r4.w;
import v4.k;

public final class i<R> implements d, f, h {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f9237a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f9238b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9239c;

    /* renamed from: d  reason: collision with root package name */
    public final f<R> f9240d;

    /* renamed from: e  reason: collision with root package name */
    public final e f9241e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f9242f;

    /* renamed from: g  reason: collision with root package name */
    public final h f9243g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f9244h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f9245i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f9246j;

    /* renamed from: k  reason: collision with root package name */
    public final int f9247k;

    /* renamed from: l  reason: collision with root package name */
    public final int f9248l;
    public final j m;

    /* renamed from: n  reason: collision with root package name */
    public final g<R> f9249n;

    /* renamed from: o  reason: collision with root package name */
    public final List<f<R>> f9250o;

    /* renamed from: p  reason: collision with root package name */
    public final e<? super R> f9251p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f9252q;

    /* renamed from: r  reason: collision with root package name */
    public w<R> f9253r;

    /* renamed from: s  reason: collision with root package name */
    public n.d f9254s;

    /* renamed from: t  reason: collision with root package name */
    public long f9255t;

    /* renamed from: u  reason: collision with root package name */
    public volatile n f9256u;

    /* renamed from: v  reason: collision with root package name */
    public int f9257v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f9258w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f9259x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f9260y;

    /* renamed from: z  reason: collision with root package name */
    public int f9261z;

    public i(Context context, h hVar, Object obj, Object obj2, Class cls, a aVar, int i8, int i10, j jVar, g gVar, ArrayList arrayList, e eVar, n nVar, e eVar2) {
        h hVar2 = hVar;
        e.a aVar2 = l5.e.f10992a;
        this.f9237a = D ? String.valueOf(hashCode()) : null;
        this.f9238b = new d.a();
        this.f9239c = obj;
        this.f9242f = context;
        this.f9243g = hVar2;
        this.f9244h = obj2;
        this.f9245i = cls;
        this.f9246j = aVar;
        this.f9247k = i8;
        this.f9248l = i10;
        this.m = jVar;
        this.f9249n = gVar;
        this.f9240d = null;
        this.f9250o = arrayList;
        this.f9241e = eVar;
        this.f9256u = nVar;
        this.f9251p = eVar2;
        this.f9252q = aVar2;
        this.f9257v = 1;
        if (this.C == null && hVar2.f4067h.f4070a.containsKey(com.bumptech.glide.f.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f9239c) {
            z10 = this.f9257v == 4;
        }
        return z10;
    }

    public final boolean b(d dVar) {
        int i8;
        int i10;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        j jVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        j jVar2;
        int size2;
        d dVar2 = dVar;
        if (!(dVar2 instanceof i)) {
            return false;
        }
        synchronized (this.f9239c) {
            i8 = this.f9247k;
            i10 = this.f9248l;
            obj = this.f9244h;
            cls = this.f9245i;
            aVar = this.f9246j;
            jVar = this.m;
            List<f<R>> list = this.f9250o;
            size = list != null ? list.size() : 0;
        }
        i iVar = (i) dVar2;
        synchronized (iVar.f9239c) {
            i11 = iVar.f9247k;
            i12 = iVar.f9248l;
            obj2 = iVar.f9244h;
            cls2 = iVar.f9245i;
            aVar2 = iVar.f9246j;
            jVar2 = iVar.m;
            List<f<R>> list2 = iVar.f9250o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i8 == i11 && i10 == i12) {
            char[] cArr = l.f11007a;
            if ((obj == null ? obj2 == null : obj instanceof k ? ((k) obj).a() : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && jVar == jVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public final void c(int i8, int i10) {
        Object obj;
        String str;
        n.d b10;
        int i11 = i8;
        int i12 = i10;
        this.f9238b.a();
        Object obj2 = this.f9239c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    k("Got onSizeReady in " + l5.h.a(this.f9255t));
                }
                if (this.f9257v == 3) {
                    this.f9257v = 2;
                    float f10 = this.f9246j.f9227b;
                    if (i11 != Integer.MIN_VALUE) {
                        i11 = Math.round(((float) i11) * f10);
                    }
                    this.f9261z = i11;
                    this.A = i12 == Integer.MIN_VALUE ? i12 : Math.round(f10 * ((float) i12));
                    if (z10) {
                        k("finished setup for calling load in " + l5.h.a(this.f9255t));
                    }
                    n nVar = this.f9256u;
                    h hVar = this.f9243g;
                    Object obj3 = this.f9244h;
                    a<?> aVar = this.f9246j;
                    String str2 = "finished onSizeReady in ";
                    Object obj4 = obj2;
                    try {
                        obj = obj4;
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        b10 = nVar.b(hVar, obj3, aVar.H, this.f9261z, this.A, aVar.O, this.f9245i, this.m, aVar.f9228c, aVar.N, aVar.I, aVar.U, aVar.M, aVar.E, aVar.S, aVar.V, aVar.T, this, this.f9252q);
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                    try {
                        this.f9254s = b10;
                        if (this.f9257v != 2) {
                            this.f9254s = null;
                        }
                        if (z10) {
                            k(str + l5.h.a(this.f9255t));
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.f9256u.getClass();
        r4.n.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9239c
            monitor-enter(r0)
            boolean r1 = r5.B     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0046
            m5.d$a r1 = r5.f9238b     // Catch:{ all -> 0x004e }
            r1.a()     // Catch:{ all -> 0x004e }
            int r1 = r5.f9257v     // Catch:{ all -> 0x004e }
            r2 = 6
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0013:
            r5.d()     // Catch:{ all -> 0x004e }
            r4.w<R> r1 = r5.f9253r     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f9253r = r3     // Catch:{ all -> 0x004e }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            h5.e r3 = r5.f9241e     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.e(r5)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            i5.g<R> r3 = r5.f9249n     // Catch:{ all -> 0x004e }
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch:{ all -> 0x004e }
            r3.k(r4)     // Catch:{ all -> 0x004e }
        L_0x0038:
            r5.f9257v = r2     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0045
            r4.n r0 = r5.f9256u
            r0.getClass()
            r4.n.e(r1)
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.clear():void");
    }

    public final void d() {
        if (!this.B) {
            this.f9238b.a();
            this.f9249n.d(this);
            n.d dVar = this.f9254s;
            if (dVar != null) {
                synchronized (n.this) {
                    dVar.f13955a.h(dVar.f13956b);
                }
                this.f9254s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable e() {
        int i8;
        if (this.f9259x == null) {
            a<?> aVar = this.f9246j;
            Drawable drawable = aVar.C;
            this.f9259x = drawable;
            if (drawable == null && (i8 = aVar.D) > 0) {
                this.f9259x = j(i8);
            }
        }
        return this.f9259x;
    }

    public final boolean f() {
        e eVar = this.f9241e;
        return eVar == null || !eVar.getRoot().a();
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f9239c) {
            z10 = this.f9257v == 6;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f9239c
            monitor-enter(r0)
            boolean r1 = r7.B     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00e2
            m5.d$a r1 = r7.f9238b     // Catch:{ all -> 0x00e0 }
            r1.a()     // Catch:{ all -> 0x00e0 }
            int r1 = l5.h.f10997b     // Catch:{ all -> 0x00e0 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00e0 }
            r7.f9255t = r1     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r7.f9244h     // Catch:{ all -> 0x00e0 }
            r2 = 3
            if (r1 != 0) goto L_0x0052
            int r1 = r7.f9247k     // Catch:{ all -> 0x00e0 }
            int r3 = r7.f9248l     // Catch:{ all -> 0x00e0 }
            boolean r1 = l5.l.g(r1, r3)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x002b
            int r1 = r7.f9247k     // Catch:{ all -> 0x00e0 }
            r7.f9261z = r1     // Catch:{ all -> 0x00e0 }
            int r1 = r7.f9248l     // Catch:{ all -> 0x00e0 }
            r7.A = r1     // Catch:{ all -> 0x00e0 }
        L_0x002b:
            android.graphics.drawable.Drawable r1 = r7.f9260y     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0041
            h5.a<?> r1 = r7.f9246j     // Catch:{ all -> 0x00e0 }
            android.graphics.drawable.Drawable r3 = r1.K     // Catch:{ all -> 0x00e0 }
            r7.f9260y = r3     // Catch:{ all -> 0x00e0 }
            if (r3 != 0) goto L_0x0041
            int r1 = r1.L     // Catch:{ all -> 0x00e0 }
            if (r1 <= 0) goto L_0x0041
            android.graphics.drawable.Drawable r1 = r7.j(r1)     // Catch:{ all -> 0x00e0 }
            r7.f9260y = r1     // Catch:{ all -> 0x00e0 }
        L_0x0041:
            android.graphics.drawable.Drawable r1 = r7.f9260y     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0046
            r2 = 5
        L_0x0046:
            r4.s r1 = new r4.s     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x00e0 }
            r7.l(r1, r2)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0052:
            int r1 = r7.f9257v     // Catch:{ all -> 0x00e0 }
            r3 = 2
            if (r1 == r3) goto L_0x00d8
            r4 = 0
            r5 = 4
            if (r1 != r5) goto L_0x0064
            r4.w<R> r1 = r7.f9253r     // Catch:{ all -> 0x00e0 }
            p4.a r2 = p4.a.f12450e     // Catch:{ all -> 0x00e0 }
            r7.n(r1, r2, r4)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0064:
            java.util.List<h5.f<R>> r1 = r7.f9250o     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0069
            goto L_0x0083
        L_0x0069:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e0 }
        L_0x006d:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00e0 }
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00e0 }
            h5.f r5 = (h5.f) r5     // Catch:{ all -> 0x00e0 }
            boolean r6 = r5 instanceof h5.c     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x006d
            h5.c r5 = (h5.c) r5     // Catch:{ all -> 0x00e0 }
            r5.getClass()     // Catch:{ all -> 0x00e0 }
            goto L_0x006d
        L_0x0083:
            r7.f9257v = r2     // Catch:{ all -> 0x00e0 }
            int r1 = r7.f9247k     // Catch:{ all -> 0x00e0 }
            int r5 = r7.f9248l     // Catch:{ all -> 0x00e0 }
            boolean r1 = l5.l.g(r1, r5)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0097
            int r1 = r7.f9247k     // Catch:{ all -> 0x00e0 }
            int r5 = r7.f9248l     // Catch:{ all -> 0x00e0 }
            r7.c(r1, r5)     // Catch:{ all -> 0x00e0 }
            goto L_0x009c
        L_0x0097:
            i5.g<R> r1 = r7.f9249n     // Catch:{ all -> 0x00e0 }
            r1.f(r7)     // Catch:{ all -> 0x00e0 }
        L_0x009c:
            int r1 = r7.f9257v     // Catch:{ all -> 0x00e0 }
            if (r1 == r3) goto L_0x00a2
            if (r1 != r2) goto L_0x00b8
        L_0x00a2:
            h5.e r1 = r7.f9241e     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00ac
            boolean r1 = r1.f(r7)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00ad
        L_0x00ac:
            r4 = 1
        L_0x00ad:
            if (r4 == 0) goto L_0x00b8
            i5.g<R> r1 = r7.f9249n     // Catch:{ all -> 0x00e0 }
            android.graphics.drawable.Drawable r2 = r7.e()     // Catch:{ all -> 0x00e0 }
            r1.j(r2)     // Catch:{ all -> 0x00e0 }
        L_0x00b8:
            boolean r1 = D     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            long r2 = r7.f9255t     // Catch:{ all -> 0x00e0 }
            double r2 = l5.h.a(r2)     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r7.k(r1)     // Catch:{ all -> 0x00e0 }
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00d8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00e0 }
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r1 = move-exception
            goto L_0x00ea
        L_0x00e2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00e0 }
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00ea:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.h():void");
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f9239c) {
            z10 = this.f9257v == 4;
        }
        return z10;
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f9239c) {
            int i8 = this.f9257v;
            if (i8 != 2) {
                if (i8 != 3) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final Drawable j(int i8) {
        Resources.Theme theme = this.f9246j.Q;
        if (theme == null) {
            theme = this.f9242f.getTheme();
        }
        h hVar = this.f9243g;
        return a5.g.a(hVar, hVar, i8, theme);
    }

    public final void k(String str) {
        StringBuilder b10 = a.b(str, " this: ");
        b10.append(this.f9237a);
        Log.v("GlideRequest", b10.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00da A[Catch:{ all -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(r4.s r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Load failed for "
            m5.d$a r1 = r5.f9238b
            r1.a()
            java.lang.Object r1 = r5.f9239c
            monitor-enter(r1)
            r6.getClass()     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.h r2 = r5.f9243g     // Catch:{ all -> 0x00e2 }
            int r2 = r2.f4068i     // Catch:{ all -> 0x00e2 }
            if (r2 > r7) goto L_0x0045
            java.lang.String r7 = "Glide"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r3.<init>(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r5.f9244h     // Catch:{ all -> 0x00e2 }
            r3.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = " with size ["
            r3.append(r0)     // Catch:{ all -> 0x00e2 }
            int r0 = r5.f9261z     // Catch:{ all -> 0x00e2 }
            r3.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch:{ all -> 0x00e2 }
            int r0 = r5.A     // Catch:{ all -> 0x00e2 }
            r3.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00e2 }
            android.util.Log.w(r7, r0, r6)     // Catch:{ all -> 0x00e2 }
            r7 = 4
            if (r2 > r7) goto L_0x0045
            r6.e()     // Catch:{ all -> 0x00e2 }
        L_0x0045:
            r6 = 0
            r5.f9254s = r6     // Catch:{ all -> 0x00e2 }
            r7 = 5
            r5.f9257v = r7     // Catch:{ all -> 0x00e2 }
            r7 = 1
            r5.B = r7     // Catch:{ all -> 0x00e2 }
            r0 = 0
            java.util.List<h5.f<R>> r2 = r5.f9250o     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x006d
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008e }
            r3 = r0
        L_0x0058:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x008e }
            h5.f r4 = (h5.f) r4     // Catch:{ all -> 0x008e }
            r5.f()     // Catch:{ all -> 0x008e }
            boolean r4 = r4.b()     // Catch:{ all -> 0x008e }
            r3 = r3 | r4
            goto L_0x0058
        L_0x006d:
            r3 = r0
        L_0x006e:
            h5.f<R> r2 = r5.f9240d     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007d
            r5.f()     // Catch:{ all -> 0x008e }
            boolean r2 = r2.b()     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007d
            r2 = r7
            goto L_0x007e
        L_0x007d:
            r2 = r0
        L_0x007e:
            r2 = r2 | r3
            if (r2 != 0) goto L_0x00d4
            h5.e r2 = r5.f9241e     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0090
            boolean r2 = r2.f(r5)     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            r7 = r0
            goto L_0x0090
        L_0x008e:
            r6 = move-exception
            goto L_0x00df
        L_0x0090:
            if (r7 != 0) goto L_0x0093
            goto L_0x00d4
        L_0x0093:
            java.lang.Object r7 = r5.f9244h     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x00af
            android.graphics.drawable.Drawable r6 = r5.f9260y     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x00ad
            h5.a<?> r6 = r5.f9246j     // Catch:{ all -> 0x008e }
            android.graphics.drawable.Drawable r7 = r6.K     // Catch:{ all -> 0x008e }
            r5.f9260y = r7     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x00ad
            int r6 = r6.L     // Catch:{ all -> 0x008e }
            if (r6 <= 0) goto L_0x00ad
            android.graphics.drawable.Drawable r6 = r5.j(r6)     // Catch:{ all -> 0x008e }
            r5.f9260y = r6     // Catch:{ all -> 0x008e }
        L_0x00ad:
            android.graphics.drawable.Drawable r6 = r5.f9260y     // Catch:{ all -> 0x008e }
        L_0x00af:
            if (r6 != 0) goto L_0x00c9
            android.graphics.drawable.Drawable r6 = r5.f9258w     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x00c7
            h5.a<?> r6 = r5.f9246j     // Catch:{ all -> 0x008e }
            android.graphics.drawable.Drawable r7 = r6.f9230e     // Catch:{ all -> 0x008e }
            r5.f9258w = r7     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x00c7
            int r6 = r6.B     // Catch:{ all -> 0x008e }
            if (r6 <= 0) goto L_0x00c7
            android.graphics.drawable.Drawable r6 = r5.j(r6)     // Catch:{ all -> 0x008e }
            r5.f9258w = r6     // Catch:{ all -> 0x008e }
        L_0x00c7:
            android.graphics.drawable.Drawable r6 = r5.f9258w     // Catch:{ all -> 0x008e }
        L_0x00c9:
            if (r6 != 0) goto L_0x00cf
            android.graphics.drawable.Drawable r6 = r5.e()     // Catch:{ all -> 0x008e }
        L_0x00cf:
            i5.g<R> r7 = r5.f9249n     // Catch:{ all -> 0x008e }
            r7.g(r6)     // Catch:{ all -> 0x008e }
        L_0x00d4:
            r5.B = r0     // Catch:{ all -> 0x00e2 }
            h5.e r6 = r5.f9241e     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x00dd
            r6.j(r5)     // Catch:{ all -> 0x00e2 }
        L_0x00dd:
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            return
        L_0x00df:
            r5.B = r0     // Catch:{ all -> 0x00e2 }
            throw r6     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.l(r4.s, int):void");
    }

    /* JADX INFO: finally extract failed */
    public final void m(w wVar, Object obj, p4.a aVar) {
        boolean z10;
        f();
        this.f9257v = 4;
        this.f9253r = wVar;
        if (this.f9243g.f4068i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f9244h + " with size [" + this.f9261z + "x" + this.A + "] in " + l5.h.a(this.f9255t) + " ms");
        }
        boolean z11 = true;
        this.B = true;
        try {
            List<f<R>> list = this.f9250o;
            if (list != null) {
                z10 = false;
                for (f<R> a10 : list) {
                    z10 |= a10.a();
                }
            } else {
                z10 = false;
            }
            f<R> fVar = this.f9240d;
            if (fVar == null || !fVar.a()) {
                z11 = false;
            }
            if (!z11 && !z10) {
                this.f9249n.c(obj, this.f9251p.a(aVar));
            }
            this.B = false;
            e eVar = this.f9241e;
            if (eVar != null) {
                eVar.d(this);
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r7.f9256u.getClass();
        r4.n.e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(r4.w<?> r8, p4.a r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "Expected to receive an object of "
            java.lang.String r0 = "Expected to receive a Resource<R> with an object of "
            m5.d$a r1 = r7.f9238b
            r1.a()
            r1 = 0
            java.lang.Object r2 = r7.f9239c     // Catch:{ all -> 0x00c2 }
            monitor-enter(r2)     // Catch:{ all -> 0x00c2 }
            r7.f9254s = r1     // Catch:{ all -> 0x00b4 }
            r3 = 5
            if (r8 != 0) goto L_0x002f
            r4.s r8 = new r4.s     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r9.<init>(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.Class<R> r10 = r7.f9245i     // Catch:{ all -> 0x00b4 }
            r9.append(r10)     // Catch:{ all -> 0x00b4 }
            java.lang.String r10 = " inside, but instead got null."
            r9.append(r10)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b4 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b4 }
            r7.l(r8, r3)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            return
        L_0x002f:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class<R> r4 = r7.f9245i     // Catch:{ all -> 0x00b4 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x00b4 }
            boolean r4 = r4.isAssignableFrom(r5)     // Catch:{ all -> 0x00b4 }
            if (r4 != 0) goto L_0x0042
            goto L_0x0066
        L_0x0042:
            h5.e r10 = r7.f9241e     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x004f
            boolean r10 = r10.c(r7)     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r10 = 0
            goto L_0x0050
        L_0x004f:
            r10 = 1
        L_0x0050:
            if (r10 != 0) goto L_0x0061
            r7.f9253r = r1     // Catch:{ all -> 0x00b0 }
            r9 = 4
            r7.f9257v = r9     // Catch:{ all -> 0x00b0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
        L_0x0058:
            r4.n r9 = r7.f9256u
            r9.getClass()
            r4.n.e(r8)
            return
        L_0x0061:
            r7.m(r8, r0, r9)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            return
        L_0x0066:
            r7.f9253r = r1     // Catch:{ all -> 0x00b0 }
            r4.s r9 = new r4.s     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r1.<init>(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.Class<R> r10 = r7.f9245i     // Catch:{ all -> 0x00b0 }
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = " but instead got "
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0080
            java.lang.Class r10 = r0.getClass()     // Catch:{ all -> 0x00b0 }
            goto L_0x0082
        L_0x0080:
            java.lang.String r10 = ""
        L_0x0082:
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "{"
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "} inside Resource{"
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            r1.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "}."
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x009f
            java.lang.String r10 = ""
            goto L_0x00a1
        L_0x009f:
            java.lang.String r10 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a1:
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x00b0 }
            r9.<init>(r10)     // Catch:{ all -> 0x00b0 }
            r7.l(r9, r3)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x0058
        L_0x00b0:
            r9 = move-exception
            r1 = r8
            r8 = r7
            goto L_0x00b9
        L_0x00b4:
            r8 = move-exception
            r9 = r7
        L_0x00b6:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x00b9:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            throw r9     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r9 = move-exception
            goto L_0x00c4
        L_0x00bd:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x00b6
        L_0x00c2:
            r9 = move-exception
            r8 = r7
        L_0x00c4:
            if (r1 == 0) goto L_0x00ce
            r4.n r8 = r8.f9256u
            r8.getClass()
            r4.n.e(r1)
        L_0x00ce:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.i.n(r4.w, p4.a, boolean):void");
    }

    public final void pause() {
        synchronized (this.f9239c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f9239c) {
            obj = this.f9244h;
            cls = this.f9245i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
