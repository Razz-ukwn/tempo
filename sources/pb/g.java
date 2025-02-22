package pb;

import ag.g0;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import mb.b;
import rf.p;

@e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$insertMediaData$resultDeferred$1", f = "MediaRepositoryImpl.kt", l = {76, 77}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super b<? extends Boolean>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12559a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f12560b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, d<? super g> dVar) {
        super(2, dVar);
        this.f12560b = hVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f12560b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[Catch:{ Exception -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[Catch:{ Exception -> 0x0012 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r6.f12559a
            pb.h r2 = r6.f12560b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            cb.b.J(r7)     // Catch:{ Exception -> 0x0012 }
            goto L_0x005c
        L_0x0012:
            r7 = move-exception
            goto L_0x0064
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001c:
            cb.b.J(r7)     // Catch:{ Exception -> 0x0012 }
            goto L_0x004d
        L_0x0020:
            cb.b.J(r7)
            android.content.Context r7 = r2.f12561a     // Catch:{ Exception -> 0x0012 }
            r2.l(r7)     // Catch:{ Exception -> 0x0012 }
            rb.a r7 = rb.a.V     // Catch:{ Exception -> 0x0012 }
            int r7 = r7.F     // Catch:{ Exception -> 0x0012 }
            int r7 = q.g.c(r7)     // Catch:{ Exception -> 0x0012 }
            if (r7 == 0) goto L_0x003b
            if (r7 == r4) goto L_0x0039
            if (r7 == r3) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r7 = 3
            goto L_0x003c
        L_0x0039:
            r7 = r3
            goto L_0x003c
        L_0x003b:
            r7 = r4
        L_0x003c:
            com.lassi.data.database.MediaFileDatabase r1 = r2.f12567g     // Catch:{ Exception -> 0x0012 }
            if (r1 == 0) goto L_0x005d
            ob.c r1 = r1.p()     // Catch:{ Exception -> 0x0012 }
            r6.f12559a = r4     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r7 = r1.d(r7, r6)     // Catch:{ Exception -> 0x0012 }
            if (r7 != r0) goto L_0x004d
            return r0
        L_0x004d:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ Exception -> 0x0012 }
            long r4 = r7.longValue()     // Catch:{ Exception -> 0x0012 }
            r6.f12559a = r3     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r7 = pb.h.g(r2, r4, r6)     // Catch:{ Exception -> 0x0012 }
            if (r7 != r0) goto L_0x005c
            return r0
        L_0x005c:
            return r7
        L_0x005d:
            java.lang.String r7 = "mediaDatabase"
            sf.j.l(r7)     // Catch:{ Exception -> 0x0012 }
            r7 = 0
            throw r7     // Catch:{ Exception -> 0x0012 }
        L_0x0064:
            mb.b$a r0 = new mb.b$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
