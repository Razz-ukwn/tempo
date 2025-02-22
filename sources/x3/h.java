package x3;

import ag.f2;
import ag.g0;
import ag.g2;
import ag.m0;
import ag.s0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import b3.l0;
import b4.a;
import b4.b;
import b4.c;
import b4.d;
import b4.e;
import b4.i;
import b4.j;
import b4.k;
import d2.f1;
import ff.d;
import ff.g;
import ff.j;
import ff.m;
import gf.q;
import h4.b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.r;
import kotlinx.coroutines.internal.e;
import kotlinx.coroutines.scheduling.c;
import lf.i;
import m4.f;
import rf.p;
import x3.a;
import x3.b;
import y3.b;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final b f16933a;

    /* renamed from: b  reason: collision with root package name */
    public final d<f4.b> f16934b;

    /* renamed from: c  reason: collision with root package name */
    public final b.C0313b f16935c;

    /* renamed from: d  reason: collision with root package name */
    public final e f16936d;

    /* renamed from: e  reason: collision with root package name */
    public final f3.a f16937e;

    /* renamed from: f  reason: collision with root package name */
    public final d f16938f;

    /* renamed from: g  reason: collision with root package name */
    public final a f16939g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f16940h;

    @lf.e(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {123}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, jf.d<? super h4.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f16941a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f16942b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h4.h f16943c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, h4.h hVar2, jf.d<? super a> dVar) {
            super(2, dVar);
            this.f16942b = hVar;
            this.f16943c = hVar2;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            return new a(this.f16942b, this.f16943c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f16941a;
            h hVar = this.f16942b;
            if (i8 == 0) {
                cb.b.J(obj);
                this.f16941a = 1;
                obj = h.c(hVar, this.f16943c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((h4.i) obj) instanceof h4.e) {
                hVar.getClass();
            }
            return obj;
        }
    }

    public h(Context context, h4.b bVar, j jVar, j jVar2, j jVar3, a aVar, f fVar) {
        Context context2 = context;
        j jVar4 = jVar;
        f fVar2 = fVar;
        j0.f fVar3 = b.C0313b.A;
        this.f16933a = bVar;
        this.f16934b = jVar4;
        this.f16935c = fVar3;
        g2 f10 = cb.d.f();
        c cVar = s0.f480a;
        this.f16936d = f1.e(f10.n0(kotlinx.coroutines.internal.m.f10728a.J0()).n0(new k(this)));
        m4.j jVar5 = new m4.j(this, context, fVar2.f11201b);
        f3.a aVar2 = new f3.a(this, jVar5);
        this.f16937e = aVar2;
        this.f16938f = jVar4;
        a.C0312a aVar3 = new a.C0312a(aVar);
        aVar3.b(new e4.c(), r.class);
        aVar3.b(new e4.a(1), String.class);
        Class<Uri> cls = Uri.class;
        aVar3.b(new e4.b(), cls);
        aVar3.b(new e4.f(), cls);
        aVar3.b(new e4.e(), Integer.class);
        aVar3.b(new e4.a(0), byte[].class);
        d4.c cVar2 = new d4.c();
        ArrayList arrayList = aVar3.f16923c;
        arrayList.add(new g(cVar2, cls));
        Class<File> cls2 = File.class;
        arrayList.add(new g(new d4.a(fVar2.f11200a), cls2));
        j jVar6 = jVar3;
        aVar3.a(new j.a(jVar6, jVar2, fVar2.f11202c), cls);
        aVar3.a(new i.a(), cls2);
        aVar3.a(new a.C0038a(), cls);
        aVar3.a(new d.a(), cls);
        aVar3.a(new k.a(), cls);
        aVar3.a(new e.a(), Drawable.class);
        aVar3.a(new b.a(), Bitmap.class);
        aVar3.a(new c.a(), ByteBuffer.class);
        b.C0321b bVar2 = new b.C0321b(fVar2.f11203d, fVar2.f11204e);
        ArrayList arrayList2 = aVar3.f16925e;
        arrayList2.add(bVar2);
        List n2 = e9.c.n(aVar3.f16921a);
        this.f16939g = new a(n2, e9.c.n(aVar3.f16922b), e9.c.n(arrayList), e9.c.n(aVar3.f16924d), e9.c.n(arrayList2));
        this.f16940h = q.H0(n2, new c4.b(this, aVar2));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(jVar5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0 A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2 A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0118 A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0164 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016c A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(x3.h r22, h4.h r23, jf.d r24) {
        /*
            r1 = r22
            r0 = r23
            r2 = r24
            r22.getClass()
            boolean r3 = r2 instanceof x3.i
            if (r3 == 0) goto L_0x001c
            r3 = r2
            x3.i r3 = (x3.i) r3
            int r4 = r3.D
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.D = r4
            goto L_0x0021
        L_0x001c:
            x3.i r3 = new x3.i
            r3.<init>(r1, r2)
        L_0x0021:
            r8 = r3
            java.lang.Object r2 = r8.B
            kf.a r9 = kf.a.f10464a
            int r3 = r8.D
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 0
            if (r3 == 0) goto L_0x006c
            if (r3 == r12) goto L_0x005a
            if (r3 == r11) goto L_0x0049
            if (r3 != r10) goto L_0x0041
            x3.b r1 = r8.f16947d
            h4.h r3 = r8.f16946c
            coil.request.RequestDelegate r4 = r8.f16945b
            x3.h r5 = r8.f16944a
            cb.b.J(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x0165
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            android.graphics.Bitmap r0 = r8.f16948e
            x3.b r1 = r8.f16947d
            h4.h r3 = r8.f16946c
            coil.request.RequestDelegate r4 = r8.f16945b
            x3.h r5 = r8.f16944a
            cb.b.J(r2)     // Catch:{ all -> 0x0069 }
            r19 = r0
            goto L_0x013c
        L_0x005a:
            x3.b r1 = r8.f16947d
            h4.h r3 = r8.f16946c
            coil.request.RequestDelegate r4 = r8.f16945b
            x3.h r5 = r8.f16944a
            cb.b.J(r2)     // Catch:{ all -> 0x0069 }
            r2 = r1
            r1 = r5
            goto L_0x00da
        L_0x0069:
            r0 = move-exception
            goto L_0x018b
        L_0x006c:
            cb.b.J(r2)
            jf.f r2 = r8.getContext()
            ag.n1 r7 = cb.d.G(r2)
            f3.a r2 = r1.f16937e
            r2.getClass()
            androidx.lifecycle.j r6 = r0.A
            j4.a r3 = r0.f9146c
            boolean r4 = r3 instanceof j4.b
            if (r4 == 0) goto L_0x0097
            coil.request.ViewTargetRequestDelegate r14 = new coil.request.ViewTargetRequestDelegate
            java.lang.Object r2 = r2.f8047a
            r4 = r2
            x3.f r4 = (x3.f) r4
            r5 = r3
            j4.b r5 = (j4.b) r5
            r2 = r14
            r3 = r4
            r4 = r23
            r2.<init>(r3, r4, r5, r6, r7)
            r4 = r14
            goto L_0x009d
        L_0x0097:
            coil.request.BaseRequestDelegate r2 = new coil.request.BaseRequestDelegate
            r2.<init>(r6, r7)
            r4 = r2
        L_0x009d:
            r4.a()
            h4.h$a r2 = new h4.h$a
            android.content.Context r3 = r0.f9144a
            r2.<init>(r0, r3)
            h4.b r0 = r1.f16933a
            r2.f9170b = r0
            r0 = 0
            r2.O = r0
            h4.h r3 = r2.a()
            x3.b$b r0 = r1.f16935c
            r0.getClass()
            x3.b$a r2 = x3.b.f16926a
            java.lang.Object r0 = r3.f9145b     // Catch:{ all -> 0x018e }
            h4.j r5 = h4.j.f9194a     // Catch:{ all -> 0x018e }
            boolean r0 = sf.j.a(r0, r5)     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x0190
            r4.f()     // Catch:{ all -> 0x018e }
            androidx.lifecycle.j r0 = r3.A     // Catch:{ all -> 0x018e }
            r8.f16944a = r1     // Catch:{ all -> 0x018e }
            r8.f16945b = r4     // Catch:{ all -> 0x018e }
            r8.f16946c = r3     // Catch:{ all -> 0x018e }
            r8.f16947d = r2     // Catch:{ all -> 0x018e }
            r8.D = r12     // Catch:{ all -> 0x018e }
            java.lang.Object r0 = coil.util.Lifecycles.a(r0, r8)     // Catch:{ all -> 0x018e }
            if (r0 != r9) goto L_0x00da
            goto L_0x01b7
        L_0x00da:
            f4.b r0 = r1.b()     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x00ef
            f4.b$a r5 = r3.E     // Catch:{ all -> 0x018e }
            if (r5 == 0) goto L_0x00e9
            f4.b$b r0 = r0.b(r5)     // Catch:{ all -> 0x018e }
            goto L_0x00ea
        L_0x00e9:
            r0 = r13
        L_0x00ea:
            if (r0 == 0) goto L_0x00ef
            android.graphics.Bitmap r0 = r0.f8578a     // Catch:{ all -> 0x018e }
            goto L_0x00f0
        L_0x00ef:
            r0 = r13
        L_0x00f0:
            if (r0 == 0) goto L_0x00fe
            android.content.Context r5 = r3.f9144a     // Catch:{ all -> 0x018e }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x018e }
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x018e }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x018e }
            goto L_0x010a
        L_0x00fe:
            h4.b r5 = r3.M     // Catch:{ all -> 0x018e }
            android.graphics.drawable.Drawable r5 = r5.f9120j     // Catch:{ all -> 0x018e }
            android.graphics.drawable.Drawable r6 = r3.G     // Catch:{ all -> 0x018e }
            java.lang.Integer r7 = r3.F     // Catch:{ all -> 0x018e }
            android.graphics.drawable.Drawable r6 = m4.b.b(r3, r6, r7, r5)     // Catch:{ all -> 0x018e }
        L_0x010a:
            j4.a r5 = r3.f9146c     // Catch:{ all -> 0x018e }
            if (r5 == 0) goto L_0x0111
            r5.g(r6)     // Catch:{ all -> 0x018e }
        L_0x0111:
            r2.a()     // Catch:{ all -> 0x018e }
            h4.h$b r5 = r3.f9147d     // Catch:{ all -> 0x018e }
            if (r5 == 0) goto L_0x011b
            r5.a()     // Catch:{ all -> 0x018e }
        L_0x011b:
            r2.h()     // Catch:{ all -> 0x018e }
            i4.f r5 = r3.B     // Catch:{ all -> 0x018e }
            r8.f16944a = r1     // Catch:{ all -> 0x018e }
            r8.f16945b = r4     // Catch:{ all -> 0x018e }
            r8.f16946c = r3     // Catch:{ all -> 0x018e }
            r8.f16947d = r2     // Catch:{ all -> 0x018e }
            r8.f16948e = r0     // Catch:{ all -> 0x018e }
            r8.D = r11     // Catch:{ all -> 0x018e }
            java.lang.Object r5 = r5.c(r8)     // Catch:{ all -> 0x018e }
            if (r5 != r9) goto L_0x0134
            goto L_0x01b7
        L_0x0134:
            r19 = r0
            r21 = r5
            r5 = r1
            r1 = r2
            r2 = r21
        L_0x013c:
            r17 = r2
            i4.e r17 = (i4.e) r17     // Catch:{ all -> 0x0069 }
            r1.o()     // Catch:{ all -> 0x0069 }
            ag.c0 r0 = r3.f9165w     // Catch:{ all -> 0x0069 }
            x3.j r2 = new x3.j     // Catch:{ all -> 0x0069 }
            r20 = 0
            r14 = r2
            r15 = r3
            r16 = r5
            r18 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0069 }
            r8.f16944a = r5     // Catch:{ all -> 0x0069 }
            r8.f16945b = r4     // Catch:{ all -> 0x0069 }
            r8.f16946c = r3     // Catch:{ all -> 0x0069 }
            r8.f16947d = r1     // Catch:{ all -> 0x0069 }
            r8.f16948e = r13     // Catch:{ all -> 0x0069 }
            r8.D = r10     // Catch:{ all -> 0x0069 }
            java.lang.Object r2 = cb.b.M(r0, r2, r8)     // Catch:{ all -> 0x0069 }
            if (r2 != r9) goto L_0x0165
            goto L_0x01b7
        L_0x0165:
            r9 = r2
            h4.i r9 = (h4.i) r9     // Catch:{ all -> 0x0069 }
            boolean r0 = r9 instanceof h4.n     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0178
            r0 = r9
            h4.n r0 = (h4.n) r0     // Catch:{ all -> 0x0069 }
            j4.a r2 = r3.f9146c     // Catch:{ all -> 0x0069 }
            r5.getClass()     // Catch:{ all -> 0x0069 }
            e(r0, r2, r1)     // Catch:{ all -> 0x0069 }
            goto L_0x0187
        L_0x0178:
            boolean r0 = r9 instanceof h4.e     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0187
            r0 = r9
            h4.e r0 = (h4.e) r0     // Catch:{ all -> 0x0069 }
            j4.a r2 = r3.f9146c     // Catch:{ all -> 0x0069 }
            r5.getClass()     // Catch:{ all -> 0x0069 }
            d(r0, r2, r1)     // Catch:{ all -> 0x0069 }
        L_0x0187:
            r4.e()
            goto L_0x01b7
        L_0x018b:
            r2 = r1
            r1 = r5
            goto L_0x0196
        L_0x018e:
            r0 = move-exception
            goto L_0x0196
        L_0x0190:
            h4.k r0 = new h4.k     // Catch:{ all -> 0x018e }
            r0.<init>()     // Catch:{ all -> 0x018e }
            throw r0     // Catch:{ all -> 0x018e }
        L_0x0196:
            boolean r5 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01b8 }
            if (r5 == 0) goto L_0x01a8
            r1.getClass()     // Catch:{ all -> 0x01b8 }
            r2.onCancel()     // Catch:{ all -> 0x01b8 }
            h4.h$b r1 = r3.f9147d     // Catch:{ all -> 0x01b8 }
            if (r1 == 0) goto L_0x01a7
            r1.onCancel()     // Catch:{ all -> 0x01b8 }
        L_0x01a7:
            throw r0     // Catch:{ all -> 0x01b8 }
        L_0x01a8:
            f3.a r1 = r1.f16937e     // Catch:{ all -> 0x01b8 }
            r1.getClass()     // Catch:{ all -> 0x01b8 }
            h4.e r9 = f3.a.a(r3, r0)     // Catch:{ all -> 0x01b8 }
            j4.a r0 = r3.f9146c     // Catch:{ all -> 0x01b8 }
            d(r9, r0, r2)     // Catch:{ all -> 0x01b8 }
            goto L_0x0187
        L_0x01b7:
            return r9
        L_0x01b8:
            r0 = move-exception
            r4.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.h.c(x3.h, h4.h, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4 != null) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(h4.e r3, j4.a r4, x3.b r5) {
        /*
            h4.h r0 = r3.f9140b
            boolean r1 = r4 instanceof l4.d
            if (r1 != 0) goto L_0x0009
            if (r4 == 0) goto L_0x0025
            goto L_0x0016
        L_0x0009:
            l4.c$a r1 = r0.m
            r2 = r4
            l4.d r2 = (l4.d) r2
            l4.c r1 = r1.a(r2, r3)
            boolean r2 = r1 instanceof l4.b
            if (r2 == 0) goto L_0x001c
        L_0x0016:
            android.graphics.drawable.Drawable r3 = r3.f9139a
            r4.f(r3)
            goto L_0x0025
        L_0x001c:
            r5.f()
            r1.a()
            r5.q()
        L_0x0025:
            r5.b()
            h4.h$b r3 = r0.f9147d
            if (r3 == 0) goto L_0x002f
            r3.b()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.h.d(h4.e, j4.a, x3.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4 != null) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(h4.n r3, j4.a r4, x3.b r5) {
        /*
            h4.h r0 = r3.f9213b
            boolean r1 = r4 instanceof l4.d
            if (r1 != 0) goto L_0x0009
            if (r4 == 0) goto L_0x0025
            goto L_0x0016
        L_0x0009:
            l4.c$a r1 = r0.m
            r2 = r4
            l4.d r2 = (l4.d) r2
            l4.c r1 = r1.a(r2, r3)
            boolean r2 = r1 instanceof l4.b
            if (r2 == 0) goto L_0x001c
        L_0x0016:
            android.graphics.drawable.Drawable r3 = r3.f9212a
            r4.e(r3)
            goto L_0x0025
        L_0x001c:
            r5.f()
            r1.a()
            r5.q()
        L_0x0025:
            r5.c()
            h4.h$b r3 = r0.f9147d
            if (r3 == 0) goto L_0x002f
            r3.c()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.h.e(h4.n, j4.a, x3.b):void");
    }

    public final h4.d a(h4.h hVar) {
        m0 m = cb.b.m(this.f16936d, new a(this, hVar, (jf.d<? super a>) null));
        j4.a aVar = hVar.f9146c;
        if (!(aVar instanceof j4.b)) {
            return new l0(m);
        }
        h4.q c3 = m4.c.c(((j4.b) aVar).a());
        synchronized (c3) {
            b1.b bVar = c3.f9222a;
            if (bVar == null || !sf.j.a(Looper.myLooper(), Looper.getMainLooper()) || !c3.f9225d) {
                f2 f2Var = c3.f9223b;
                if (f2Var != null) {
                    f2Var.e((CancellationException) null);
                }
                c3.f9223b = null;
                b1.b bVar2 = new b1.b(m);
                c3.f9222a = bVar2;
                return bVar2;
            }
            c3.f9225d = false;
            bVar.getClass();
            return bVar;
        }
    }

    public final f4.b b() {
        return (f4.b) this.f16938f.getValue();
    }

    public final a getComponents() {
        return this.f16939g;
    }
}
