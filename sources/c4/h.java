package c4;

import ag.g0;
import c4.b;
import ff.m;
import h4.l;
import java.util.List;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super b.a>, Object> {
    public /* synthetic */ Object B;
    public final /* synthetic */ b C;
    public final /* synthetic */ b.a D;
    public final /* synthetic */ l E;
    public final /* synthetic */ List<k4.b> F;
    public final /* synthetic */ x3.b G;
    public final /* synthetic */ h4.h H;

    /* renamed from: a  reason: collision with root package name */
    public List f3699a;

    /* renamed from: b  reason: collision with root package name */
    public l f3700b;

    /* renamed from: c  reason: collision with root package name */
    public int f3701c;

    /* renamed from: d  reason: collision with root package name */
    public int f3702d;

    /* renamed from: e  reason: collision with root package name */
    public int f3703e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b bVar, b.a aVar, l lVar, List<? extends k4.b> list, x3.b bVar2, h4.h hVar, d<? super h> dVar) {
        super(2, dVar);
        this.C = bVar;
        this.D = aVar;
        this.E = lVar;
        this.F = list;
        this.G = bVar2;
        this.H = hVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        h hVar = new h(this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        hVar.B = obj;
        return hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (gf.l.S(m4.c.f11189a, r5) != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r12.f3703e
            r2 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            int r1 = r12.f3702d
            int r3 = r12.f3701c
            h4.l r4 = r12.f3700b
            java.util.List r5 = r12.f3699a
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r12.B
            ag.g0 r6 = (ag.g0) r6
            cb.b.J(r13)
            r7 = r12
            goto L_0x0093
        L_0x001d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0025:
            cb.b.J(r13)
            java.lang.Object r13 = r12.B
            ag.g0 r13 = (ag.g0) r13
            c4.b$a r1 = r12.D
            android.graphics.drawable.Drawable r1 = r1.f3665a
            c4.b r3 = r12.C
            r3.getClass()
            boolean r3 = r1 instanceof android.graphics.drawable.BitmapDrawable
            h4.l r4 = r12.E
            if (r3 == 0) goto L_0x0053
            r3 = r1
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            android.graphics.Bitmap$Config r5 = r3.getConfig()
            if (r5 != 0) goto L_0x004a
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x004a:
            android.graphics.Bitmap$Config[] r6 = m4.c.f11189a
            boolean r5 = gf.l.S(r6, r5)
            if (r5 == 0) goto L_0x0053
            goto L_0x005f
        L_0x0053:
            android.graphics.Bitmap$Config r3 = r4.f9196b
            int r5 = r4.f9199e
            boolean r6 = r4.f9200f
            i4.e r7 = r4.f9198d
            android.graphics.Bitmap r3 = ag.v1.h(r1, r3, r7, r5, r6)
        L_0x005f:
            x3.b r1 = r12.G
            r1.p()
            java.util.List<k4.b> r1 = r12.F
            int r5 = r1.size()
            r6 = 0
            r7 = r12
            r10 = r6
            r6 = r13
            r13 = r3
            r3 = r10
            r11 = r5
            r5 = r1
            r1 = r11
        L_0x0073:
            if (r3 >= r1) goto L_0x009e
            java.lang.Object r8 = r5.get(r3)
            k4.b r8 = (k4.b) r8
            i4.e r9 = r4.f9198d
            r7.B = r6
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            r7.f3699a = r9
            r7.f3700b = r4
            r7.f3701c = r3
            r7.f3702d = r1
            r7.f3703e = r2
            android.graphics.Bitmap r13 = r8.a(r13)
            if (r13 != r0) goto L_0x0093
            return r0
        L_0x0093:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            jf.f r8 = r6.f0()
            cb.d.z(r8)
            int r3 = r3 + r2
            goto L_0x0073
        L_0x009e:
            x3.b r0 = r7.G
            r0.l()
            h4.h r0 = r7.H
            android.content.Context r0 = r0.f9144a
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r0, r13)
            c4.b$a r13 = r7.D
            boolean r0 = r13.f3666b
            c4.b$a r2 = new c4.b$a
            int r3 = r13.f3667c
            java.lang.String r13 = r13.f3668d
            r2.<init>(r1, r0, r3, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
