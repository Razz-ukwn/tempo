package pb;

import ff.m;
import java.util.ArrayList;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import mb.b;
import rf.p;

@e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$fetchDocs$2", f = "MediaRepositoryImpl.kt", l = {535, 536}, m = "invokeSuspend")
public final class d extends i implements p<g<? super b<? extends ArrayList<nb.b>>>, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12542a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f12543b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f12544c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f12544c = hVar;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        d dVar2 = new d(this.f12544c, dVar);
        dVar2.f12543b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            kf.a r2 = kf.a.f10464a
            int r0 = r1.f12542a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r5) goto L_0x001c
            if (r0 != r4) goto L_0x0014
            cb.b.J(r23)
            goto L_0x00b9
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001c:
            java.lang.Object r0 = r1.f12543b
            kotlinx.coroutines.flow.g r0 = (kotlinx.coroutines.flow.g) r0
            cb.b.J(r23)
            goto L_0x0099
        L_0x0025:
            cb.b.J(r23)
            java.lang.Object r0 = r1.f12543b
            r6 = r0
            kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.g) r6
            pb.h r0 = r1.f12544c
            java.lang.String[] r7 = pb.h.i(r0)
            r8 = 0
            android.database.Cursor r8 = pb.h.j(r0, r7, r8)
            if (r8 == 0) goto L_0x00a1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r0 = r8.moveToLast()     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x0085
        L_0x0046:
            r0 = 0
            r0 = r7[r0]     // Catch:{ Exception -> 0x0081 }
            int r0 = r8.getColumnIndex(r0)     // Catch:{ Exception -> 0x0081 }
            long r11 = r8.getLong(r0)     // Catch:{ Exception -> 0x0081 }
            r0 = r7[r5]     // Catch:{ Exception -> 0x0081 }
            int r0 = r8.getColumnIndex(r0)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r13 = r8.getString(r0)     // Catch:{ Exception -> 0x0081 }
            r0 = r7[r4]     // Catch:{ Exception -> 0x0081 }
            int r0 = r8.getColumnIndex(r0)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r14 = r8.getString(r0)     // Catch:{ Exception -> 0x0081 }
            nb.b r0 = new nb.b     // Catch:{ Exception -> 0x0081 }
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 112(0x70, float:1.57E-43)
            r10 = r0
            r10.<init>(r11, r13, r14, r15, r17, r18, r20, r21)     // Catch:{ Exception -> 0x0081 }
            r9.add(r0)     // Catch:{ Exception -> 0x0081 }
            boolean r0 = r8.moveToPrevious()     // Catch:{ Exception -> 0x0081 }
            if (r0 != 0) goto L_0x0046
            goto L_0x0085
        L_0x007f:
            r0 = move-exception
            goto L_0x009d
        L_0x0081:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x007f }
        L_0x0085:
            r8.close()
            mb.b$c r0 = new mb.b$c
            r0.<init>(r9)
            r1.f12543b = r6
            r1.f12542a = r5
            java.lang.Object r0 = r6.m(r0, r1)
            if (r0 != r2) goto L_0x0098
            return r2
        L_0x0098:
            r0 = r6
        L_0x0099:
            ff.m r5 = ff.m.f8717a
            r6 = r0
            goto L_0x00a2
        L_0x009d:
            r8.close()
            throw r0
        L_0x00a1:
            r5 = r3
        L_0x00a2:
            if (r5 != 0) goto L_0x00b9
            mb.b$a r0 = new mb.b$a
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>()
            r0.<init>(r5)
            r1.f12543b = r3
            r1.f12542a = r4
            java.lang.Object r0 = r6.m(r0, r1)
            if (r0 != r2) goto L_0x00b9
            return r2
        L_0x00b9:
            ff.m r0 = ff.m.f8717a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
