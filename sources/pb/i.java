package pb;

import ff.m;
import java.util.ArrayList;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import mb.b;
import rf.p;

@e(c = "com.lassi.data.media.repository.SelectedMediaRepositoryImpl$getSelectedMediaData$2", f = "SelectedMediaRepositoryImpl.kt", l = {68, 71}, m = "invokeSuspend")
public final class i extends lf.i implements p<g<? super b<? extends ArrayList<nb.b>>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12571a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f12572b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f12573c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f12574d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, d<? super i> dVar) {
        super(2, dVar);
        this.f12573c = jVar;
        this.f12574d = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        i iVar = new i(this.f12573c, this.f12574d, dVar);
        iVar.f12572b = obj;
        return iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[SYNTHETIC, Splitter:B:25:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ Exception -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fa A[Catch:{ Exception -> 0x0100 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            kf.a r2 = kf.a.f10464a
            int r0 = r1.f12571a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r5) goto L_0x001c
            if (r0 != r4) goto L_0x0014
            cb.b.J(r24)
            goto L_0x011c
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001c:
            java.lang.Object r0 = r1.f12572b
            r5 = r0
            kotlinx.coroutines.flow.g r5 = (kotlinx.coroutines.flow.g) r5
            cb.b.J(r24)     // Catch:{ Exception -> 0x0026 }
            goto L_0x011c
        L_0x0026:
            r0 = move-exception
            goto L_0x0102
        L_0x0029:
            cb.b.J(r24)
            java.lang.Object r0 = r1.f12572b
            r6 = r0
            kotlinx.coroutines.flow.g r6 = (kotlinx.coroutines.flow.g) r6
            pb.j r0 = r1.f12573c
            android.content.Context r7 = r0.f12575a
            com.lassi.data.database.MediaFileDatabase r8 = r0.f12577c
            if (r8 != 0) goto L_0x0048
            com.lassi.data.database.MediaFileDatabase r8 = com.lassi.data.database.MediaFileDatabase.m
            com.lassi.data.database.MediaFileDatabase r7 = com.lassi.data.database.MediaFileDatabase.a.a(r7)
            r0.f12577c = r7
            java.lang.String r7 = r0.f12576b
            java.lang.String r8 = "TAG"
            sf.j.e(r7, r8)
        L_0x0048:
            java.util.ArrayList<nb.b> r7 = r0.f12578d
            r7.clear()     // Catch:{ Exception -> 0x0100 }
            rb.a r8 = rb.a.V     // Catch:{ Exception -> 0x0100 }
            int r8 = r8.F     // Catch:{ Exception -> 0x0100 }
            int r8 = q.g.c(r8)     // Catch:{ Exception -> 0x0100 }
            if (r8 == 0) goto L_0x0060
            if (r8 == r5) goto L_0x005e
            if (r8 == r4) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            r8 = 3
            goto L_0x0061
        L_0x005e:
            r8 = r4
            goto L_0x0061
        L_0x0060:
            r8 = r5
        L_0x0061:
            java.lang.String r9 = r1.f12574d
            java.lang.String r10 = "mediaDatabase"
            if (r8 != r5) goto L_0x00a9
            com.lassi.data.database.MediaFileDatabase r0 = r0.f12577c     // Catch:{ Exception -> 0x0100 }
            if (r0 == 0) goto L_0x00a5
            ob.c r0 = r0.p()     // Catch:{ Exception -> 0x0100 }
            java.util.ArrayList r0 = r0.e(r8, r9)     // Catch:{ Exception -> 0x0100 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0100 }
        L_0x0077:
            boolean r8 = r0.hasNext()     // Catch:{ Exception -> 0x0100 }
            if (r8 == 0) goto L_0x00eb
            java.lang.Object r8 = r0.next()     // Catch:{ Exception -> 0x0100 }
            ob.i r8 = (ob.i) r8     // Catch:{ Exception -> 0x0100 }
            nb.b r14 = new nb.b     // Catch:{ Exception -> 0x0100 }
            long r10 = r8.f12284a     // Catch:{ Exception -> 0x0100 }
            java.lang.String r12 = r8.f12285b     // Catch:{ Exception -> 0x0100 }
            java.lang.String r13 = r8.f12286c     // Catch:{ Exception -> 0x0100 }
            r15 = 0
            r17 = 0
            long r8 = r8.f12288e     // Catch:{ Exception -> 0x0100 }
            r19 = 0
            r20 = 88
            r21 = r8
            r9 = r14
            r8 = r14
            r14 = r15
            r16 = r17
            r17 = r21
            r9.<init>(r10, r12, r13, r14, r16, r17, r19, r20)     // Catch:{ Exception -> 0x0100 }
            r7.add(r8)     // Catch:{ Exception -> 0x0100 }
            goto L_0x0077
        L_0x00a5:
            sf.j.l(r10)     // Catch:{ Exception -> 0x0100 }
            throw r3     // Catch:{ Exception -> 0x0100 }
        L_0x00a9:
            com.lassi.data.database.MediaFileDatabase r0 = r0.f12577c     // Catch:{ Exception -> 0x0100 }
            if (r0 == 0) goto L_0x00fb
            ob.c r0 = r0.p()     // Catch:{ Exception -> 0x0100 }
            java.util.ArrayList r0 = r0.j(r8, r9)     // Catch:{ Exception -> 0x0100 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0100 }
        L_0x00b9:
            boolean r8 = r0.hasNext()     // Catch:{ Exception -> 0x0100 }
            if (r8 == 0) goto L_0x00eb
            java.lang.Object r8 = r0.next()     // Catch:{ Exception -> 0x0100 }
            ob.j r8 = (ob.j) r8     // Catch:{ Exception -> 0x0100 }
            long r10 = r8.f12289a     // Catch:{ Exception -> 0x0100 }
            java.lang.String r12 = r8.f12290b     // Catch:{ Exception -> 0x0100 }
            java.lang.String r13 = r8.f12291c     // Catch:{ Exception -> 0x0100 }
            long r14 = r8.f12292d     // Catch:{ Exception -> 0x0100 }
            long r3 = r8.f12293e     // Catch:{ Exception -> 0x0100 }
            java.lang.String r8 = r8.B     // Catch:{ Exception -> 0x0100 }
            nb.b r9 = new nb.b     // Catch:{ Exception -> 0x0100 }
            r19 = 0
            r20 = 64
            r24 = r9
            r9 = r24
            r17 = r14
            r14 = r3
            r16 = r8
            r9.<init>(r10, r12, r13, r14, r16, r17, r19, r20)     // Catch:{ Exception -> 0x0100 }
            r3 = r24
            r7.add(r3)     // Catch:{ Exception -> 0x0100 }
            r3 = 0
            r4 = 2
            goto L_0x00b9
        L_0x00eb:
            mb.b$c r0 = new mb.b$c     // Catch:{ Exception -> 0x0100 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0100 }
            r1.f12572b = r6     // Catch:{ Exception -> 0x0100 }
            r1.f12571a = r5     // Catch:{ Exception -> 0x0100 }
            java.lang.Object r0 = r6.m(r0, r1)     // Catch:{ Exception -> 0x0100 }
            if (r0 != r2) goto L_0x011c
            return r2
        L_0x00fb:
            sf.j.l(r10)     // Catch:{ Exception -> 0x0100 }
            r3 = 0
            throw r3     // Catch:{ Exception -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            r5 = r6
        L_0x0102:
            r0.printStackTrace()
            mb.b$a r0 = new mb.b$a
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            r0.<init>(r3)
            r3 = 0
            r1.f12572b = r3
            r3 = 2
            r1.f12571a = r3
            java.lang.Object r0 = r5.m(r0, r1)
            if (r0 != r2) goto L_0x011c
            return r2
        L_0x011c:
            ff.m r0 = ff.m.f8717a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
