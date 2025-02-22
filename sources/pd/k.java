package pd;

import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import f3.f2;
import f3.g2;
import gf.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.d;
import lf.e;
import mc.c;
import sf.j;

public final class k extends f2<Integer, AudioHistory> {

    /* renamed from: b  reason: collision with root package name */
    public final c f12600b;

    @e(c = "com.quickkonnect.silencio.ui.menu.history.HistoryPagingSource", f = "HistoryPagingSource.kt", l = {30}, m = "load")
    public static final class a extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public int f12601a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f12602b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f12603c;

        /* renamed from: d  reason: collision with root package name */
        public int f12604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, d<? super a> dVar) {
            super(dVar);
            this.f12603c = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12602b = obj;
            this.f12604d |= Integer.MIN_VALUE;
            return this.f12603c.c((f2.a<Integer>) null, this);
        }
    }

    public k(c cVar) {
        j.f(cVar, "menuDataSource");
        this.f12600b = cVar;
    }

    public final Object b(g2 g2Var) {
        boolean z10;
        f2.b.C0140b bVar;
        int i8;
        Integer num;
        Integer num2;
        Integer num3 = g2Var.f8247b;
        if (num3 == null) {
            return null;
        }
        int intValue = num3.intValue();
        List<f2.b.C0140b<Key, Value>> list = g2Var.f8246a;
        Iterable iterable = list;
        int i10 = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((f2.b.C0140b) it.next()).f8225a.isEmpty()) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            bVar = null;
        } else {
            int i11 = intValue - g2Var.f8249d;
            while (i10 < cb.d.H(list) && i11 > cb.d.H(list.get(i10).f8225a)) {
                i11 -= list.get(i10).f8225a.size();
                i10++;
            }
            bVar = i11 < 0 ? (f2.b.C0140b) q.u0(list) : list.get(i10);
        }
        if (bVar != null && (num2 = (Integer) bVar.f8226b) != null) {
            i8 = num2.intValue() + 1;
        } else if (bVar == null || (num = (Integer) bVar.f8227c) == null) {
            return null;
        } else {
            i8 = num.intValue() - 1;
        }
        return Integer.valueOf(i8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b8 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(f3.f2.a<java.lang.Integer> r7, jf.d<? super f3.f2.b<java.lang.Integer, com.quickkonnect.silencio.models.response.menu.AudioHistory>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof pd.k.a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0013
            r0 = r8
            pd.k$a r0 = (pd.k.a) r0
            int r2 = r0.f12604d
            r3 = r2 & r1
            if (r3 == 0) goto L_0x0013
            int r2 = r2 - r1
            r0.f12604d = r2
            goto L_0x0018
        L_0x0013:
            pd.k$a r0 = new pd.k$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12602b
            kf.a r2 = kf.a.f10464a
            int r3 = r0.f12604d
            r4 = 1
            if (r3 == 0) goto L_0x0031
            if (r3 != r4) goto L_0x0029
            int r7 = r0.f12601a
            cb.b.J(r8)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x006b
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            cb.b.J(r8)
            java.lang.Object r8 = r7.a()     // Catch:{ Exception -> 0x00c3 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x00c3 }
            r3 = 0
            if (r8 == 0) goto L_0x0042
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x0043
        L_0x0042:
            r8 = r3
        L_0x0043:
            java.lang.Object r5 = r7.a()     // Catch:{ Exception -> 0x00c3 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x00c3 }
            if (r5 == 0) goto L_0x0051
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x00c3 }
            int r5 = r5 + r4
            goto L_0x0052
        L_0x0051:
            r5 = r4
        L_0x0052:
            boolean r7 = r7 instanceof f3.f2.a.c     // Catch:{ Exception -> 0x00c3 }
            if (r7 == 0) goto L_0x0058
            r7 = r4
            goto L_0x005a
        L_0x0058:
            r3 = r8
            r7 = r5
        L_0x005a:
            mc.c r8 = r6.f12600b     // Catch:{ Exception -> 0x00c3 }
            r0.f12601a = r7     // Catch:{ Exception -> 0x00c3 }
            r0.f12604d = r4     // Catch:{ Exception -> 0x00c3 }
            lc.c r8 = r8.f11381a     // Catch:{ Exception -> 0x00c3 }
            r4 = 10
            java.lang.Object r8 = r8.b(r3, r4, r0)     // Catch:{ Exception -> 0x00c3 }
            if (r8 != r2) goto L_0x006b
            return r2
        L_0x006b:
            yg.b0 r8 = (yg.b0) r8     // Catch:{ Exception -> 0x00c3 }
            boolean r0 = r8.a()     // Catch:{ Exception -> 0x00c3 }
            if (r0 == 0) goto L_0x00b8
            T r8 = r8.f17446b
            if (r8 == 0) goto L_0x00ad
            f3.f2$b$b r0 = new f3.f2$b$b     // Catch:{ Exception -> 0x00c3 }
            r2 = r8
            com.quickkonnect.silencio.models.response.menu.HistoryResponse r2 = (com.quickkonnect.silencio.models.response.menu.HistoryResponse) r2     // Catch:{ Exception -> 0x00c3 }
            com.quickkonnect.silencio.models.response.menu.HistoryModel r2 = r2.getData()     // Catch:{ Exception -> 0x00c3 }
            r3 = 0
            if (r2 == 0) goto L_0x0088
            java.util.List r2 = r2.getAudioHistory()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x0089
        L_0x0088:
            r2 = r3
        L_0x0089:
            sf.j.c(r2)     // Catch:{ Exception -> 0x00c3 }
            com.quickkonnect.silencio.models.response.menu.HistoryResponse r8 = (com.quickkonnect.silencio.models.response.menu.HistoryResponse) r8     // Catch:{ Exception -> 0x00c3 }
            com.quickkonnect.silencio.models.response.menu.HistoryModel r8 = r8.getData()     // Catch:{ Exception -> 0x00c3 }
            if (r8 == 0) goto L_0x0099
            java.util.List r8 = r8.getAudioHistory()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x009a
        L_0x0099:
            r8 = r3
        L_0x009a:
            sf.j.c(r8)     // Catch:{ Exception -> 0x00c3 }
            boolean r8 = r8.isEmpty()     // Catch:{ Exception -> 0x00c3 }
            if (r8 == 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ Exception -> 0x00c3 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x00c3 }
        L_0x00a9:
            r0.<init>(r2, r3, r1, r1)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c9
        L_0x00ad:
            f3.f2$b$a r0 = new f3.f2$b$a     // Catch:{ Exception -> 0x00c3 }
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ Exception -> 0x00c3 }
            r7.<init>()     // Catch:{ Exception -> 0x00c3 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c9
        L_0x00b8:
            f3.f2$b$a r0 = new f3.f2$b$a     // Catch:{ Exception -> 0x00c3 }
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ Exception -> 0x00c3 }
            r7.<init>()     // Catch:{ Exception -> 0x00c3 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c9
        L_0x00c3:
            r7 = move-exception
            f3.f2$b$a r0 = new f3.f2$b$a
            r0.<init>(r7)
        L_0x00c9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.k.c(f3.f2$a, jf.d):java.lang.Object");
    }
}
