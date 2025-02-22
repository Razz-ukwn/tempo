package c4;

import ag.g0;
import c4.i;
import f4.b;
import ff.m;
import h4.h;
import h4.l;
import h4.n;
import jf.d;
import lf.e;
import lf.i;
import rf.p;
import x3.b;

@e(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super n>, Object> {
    public final /* synthetic */ b B;
    public final /* synthetic */ b.a C;
    public final /* synthetic */ i.a D;

    /* renamed from: a  reason: collision with root package name */
    public int f3694a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f3695b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f3696c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3697d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f3698e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(b bVar, h hVar, Object obj, l lVar, x3.b bVar2, b.a aVar, i.a aVar2, d<? super g> dVar) {
        super(2, dVar);
        this.f3695b = bVar;
        this.f3696c = hVar;
        this.f3697d = obj;
        this.f3698e = lVar;
        this.B = bVar2;
        this.C = aVar;
        this.D = aVar2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f3695b, this.f3696c, this.f3697d, this.f3698e, this.B, this.C, this.D, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r14.f3694a
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            cb.b.J(r15)
            goto L_0x002c
        L_0x000d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0015:
            cb.b.J(r15)
            c4.b r3 = r14.f3695b
            h4.h r4 = r14.f3696c
            java.lang.Object r5 = r14.f3697d
            h4.l r6 = r14.f3698e
            x3.b r7 = r14.B
            r14.f3694a = r2
            r8 = r14
            java.lang.Object r15 = c4.b.c(r3, r4, r5, r6, r7, r8)
            if (r15 != r0) goto L_0x002c
            return r0
        L_0x002c:
            c4.b$a r15 = (c4.b.a) r15
            c4.b r0 = r14.f3695b
            f4.c r0 = r0.f3664c
            r0.getClass()
            h4.h r1 = r14.f3696c
            int r1 = r1.f9162t
            boolean r1 = h4.a.b(r1)
            r3 = 0
            r4 = 0
            f4.b$a r5 = r14.C
            if (r1 != 0) goto L_0x0044
            goto L_0x0085
        L_0x0044:
            x3.f r0 = r0.f8580a
            f4.b r0 = r0.b()
            if (r0 == 0) goto L_0x0085
            if (r5 != 0) goto L_0x004f
            goto L_0x0085
        L_0x004f:
            android.graphics.drawable.Drawable r1 = r15.f3665a
            boolean r6 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x0058
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            goto L_0x0059
        L_0x0058:
            r1 = r4
        L_0x0059:
            if (r1 == 0) goto L_0x0085
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 != 0) goto L_0x0062
            goto L_0x0085
        L_0x0062:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            boolean r7 = r15.f3666b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "coil#is_sampled"
            r6.put(r8, r7)
            java.lang.String r7 = r15.f3668d
            if (r7 == 0) goto L_0x007b
            java.lang.String r8 = "coil#disk_cache_key"
            r6.put(r8, r7)
        L_0x007b:
            f4.b$b r7 = new f4.b$b
            r7.<init>(r1, r6)
            r0.c(r5, r7)
            r0 = r2
            goto L_0x0086
        L_0x0085:
            r0 = r3
        L_0x0086:
            android.graphics.drawable.Drawable r7 = r15.f3665a
            h4.h r8 = r14.f3696c
            int r9 = r15.f3667c
            if (r0 == 0) goto L_0x0090
            r10 = r5
            goto L_0x0091
        L_0x0090:
            r10 = r4
        L_0x0091:
            java.lang.String r11 = r15.f3668d
            boolean r12 = r15.f3666b
            android.graphics.Bitmap$Config[] r15 = m4.c.f11189a
            c4.i$a r15 = r14.D
            boolean r0 = r15 instanceof c4.j
            if (r0 == 0) goto L_0x00a5
            c4.j r15 = (c4.j) r15
            boolean r15 = r15.f3710g
            if (r15 == 0) goto L_0x00a5
            r13 = r2
            goto L_0x00a6
        L_0x00a5:
            r13 = r3
        L_0x00a6:
            h4.n r15 = new h4.n
            r6 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
