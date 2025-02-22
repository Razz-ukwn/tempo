package pb;

import ag.g0;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import nb.b;
import rf.p;

@e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$addFileToDatabase$2", f = "MediaRepositoryImpl.kt", l = {225, 232, 237, 244, 252, 258}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {
    public final /* synthetic */ int B;

    /* renamed from: a  reason: collision with root package name */
    public int f12529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f12530b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f12531c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f12532d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f12533e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(long j10, b bVar, h hVar, int i8, String str, d dVar) {
        super(2, dVar);
        this.f12530b = bVar;
        this.f12531c = hVar;
        this.f12532d = str;
        this.f12533e = j10;
        this.B = i8;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f12533e, this.f12530b, this.f12531c, this.B, this.f12532d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r2 = q.g.c(rb.a.V.F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (r2 == 1) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r2 == 2) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r2 = r5.f12567g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r2 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r2 = r2.p();
        r4 = new ob.b(r7.f11618a, r7.f11621d);
        r0.f12529a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r2.h(r4, r0) != r1) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r2 = r7.f11622e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r2 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r3 = new ob.a(r2, r7.f11618a);
        r2 = r5.f12567g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        if (r2 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r2 = r2.p();
        r0.f12529a = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        if (r2.i(r3, r0) != r1) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        sf.j.l(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        sf.j.l(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        r2 = r5.f12567g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (r2 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r2 = r2.p();
        r3 = new ob.b(r7.f11618a, r7.f11621d);
        r0.f12529a = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        if (r2.h(r3, r0) != r1) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
        if (r7.f11621d == 0) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
        r2 = r5.f12567g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        if (r2 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ed, code lost:
        r2 = r2.p();
        r3 = new ob.b(r7.f11618a, r7.f11621d);
        r0.f12529a = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0101, code lost:
        if (r2.h(r3, r0) != r1) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0103, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        sf.j.l(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0107, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0108, code lost:
        r2 = r7.f11622e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010a, code lost:
        if (r2 == null) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010c, code lost:
        r3 = new ob.a(r2, r7.f11618a);
        r2 = r5.f12567g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0115, code lost:
        if (r2 == null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0117, code lost:
        r2 = r2.p();
        r0.f12529a = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        if (r2.i(r3, r0) != r1) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0124, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0125, code lost:
        sf.j.l(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0128, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        return ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
        sf.j.l(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f12529a
            java.lang.String r4 = "mediaDatabase"
            pb.h r5 = r0.f12531c
            r6 = 0
            nb.b r7 = r0.f12530b
            switch(r2) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0032;
                case 2: goto L_0x002b;
                case 3: goto L_0x0024;
                case 4: goto L_0x0024;
                case 5: goto L_0x001d;
                case 6: goto L_0x0018;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0018:
            cb.b.J(r21)
            goto L_0x0129
        L_0x001d:
            cb.b.J(r21)
            r19 = r4
            goto L_0x0108
        L_0x0024:
            cb.b.J(r21)
            r19 = r4
            goto L_0x00e1
        L_0x002b:
            cb.b.J(r21)
            r19 = r4
            goto L_0x00a1
        L_0x0032:
            cb.b.J(r21)
        L_0x0035:
            r19 = r4
            goto L_0x0078
        L_0x0038:
            cb.b.J(r21)
            java.lang.String r12 = r7.f11620c
            if (r12 == 0) goto L_0x0035
            java.lang.String r13 = r0.f12532d
            long r14 = r0.f12533e
            java.lang.String r11 = r7.f11619b
            if (r11 == 0) goto L_0x005d
            ob.i r2 = new ob.i
            long r9 = r7.f11618a
            r19 = r4
            long r3 = r7.B
            int r8 = r0.B
            int r18 = androidx.fragment.app.f1.a(r8)
            r8 = r2
            r16 = r14
            r14 = r3
            r8.<init>(r9, r11, r12, r13, r14, r16, r18)
            goto L_0x0060
        L_0x005d:
            r19 = r4
            r2 = r6
        L_0x0060:
            if (r2 == 0) goto L_0x0078
            com.lassi.data.database.MediaFileDatabase r3 = r5.f12567g
            if (r3 == 0) goto L_0x0074
            ob.c r3 = r3.p()
            r4 = 1
            r0.f12529a = r4
            java.lang.Object r2 = r3.f(r2, r0)
            if (r2 != r1) goto L_0x0078
            return r1
        L_0x0074:
            sf.j.l(r19)
            throw r6
        L_0x0078:
            rb.a r2 = rb.a.V
            int r2 = r2.F
            int r2 = q.g.c(r2)
            r3 = 1
            if (r2 == r3) goto L_0x00c6
            r3 = 2
            if (r2 == r3) goto L_0x0087
            goto L_0x00e1
        L_0x0087:
            com.lassi.data.database.MediaFileDatabase r2 = r5.f12567g
            if (r2 == 0) goto L_0x00c2
            ob.c r2 = r2.p()
            ob.b r4 = new ob.b
            long r8 = r7.f11618a
            long r10 = r7.f11621d
            r4.<init>(r8, r10)
            r0.f12529a = r3
            java.lang.Object r2 = r2.h(r4, r0)
            if (r2 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            java.lang.String r2 = r7.f11622e
            if (r2 == 0) goto L_0x00e1
            ob.a r3 = new ob.a
            long r8 = r7.f11618a
            r3.<init>(r2, r8)
            com.lassi.data.database.MediaFileDatabase r2 = r5.f12567g
            if (r2 == 0) goto L_0x00be
            ob.c r2 = r2.p()
            r4 = 3
            r0.f12529a = r4
            java.lang.Object r2 = r2.i(r3, r0)
            if (r2 != r1) goto L_0x00e1
            return r1
        L_0x00be:
            sf.j.l(r19)
            throw r6
        L_0x00c2:
            sf.j.l(r19)
            throw r6
        L_0x00c6:
            com.lassi.data.database.MediaFileDatabase r2 = r5.f12567g
            if (r2 == 0) goto L_0x012c
            ob.c r2 = r2.p()
            ob.b r3 = new ob.b
            long r8 = r7.f11618a
            long r10 = r7.f11621d
            r3.<init>(r8, r10)
            r4 = 4
            r0.f12529a = r4
            java.lang.Object r2 = r2.h(r3, r0)
            if (r2 != r1) goto L_0x00e1
            return r1
        L_0x00e1:
            long r2 = r7.f11621d
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0108
            com.lassi.data.database.MediaFileDatabase r2 = r5.f12567g
            if (r2 == 0) goto L_0x0104
            ob.c r2 = r2.p()
            ob.b r3 = new ob.b
            long r8 = r7.f11618a
            long r10 = r7.f11621d
            r3.<init>(r8, r10)
            r4 = 5
            r0.f12529a = r4
            java.lang.Object r2 = r2.h(r3, r0)
            if (r2 != r1) goto L_0x0108
            return r1
        L_0x0104:
            sf.j.l(r19)
            throw r6
        L_0x0108:
            java.lang.String r2 = r7.f11622e
            if (r2 == 0) goto L_0x0129
            ob.a r3 = new ob.a
            long r7 = r7.f11618a
            r3.<init>(r2, r7)
            com.lassi.data.database.MediaFileDatabase r2 = r5.f12567g
            if (r2 == 0) goto L_0x0125
            ob.c r2 = r2.p()
            r4 = 6
            r0.f12529a = r4
            java.lang.Object r2 = r2.i(r3, r0)
            if (r2 != r1) goto L_0x0129
            return r1
        L_0x0125:
            sf.j.l(r19)
            throw r6
        L_0x0129:
            ff.m r1 = ff.m.f8717a
            return r1
        L_0x012c:
            sf.j.l(r19)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
