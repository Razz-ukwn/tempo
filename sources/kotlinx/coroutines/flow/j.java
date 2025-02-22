package kotlinx.coroutines.flow;

import cg.s;
import jf.d;
import lf.c;
import lf.e;

public final /* synthetic */ class j {

    @e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends c {

        /* renamed from: a  reason: collision with root package name */
        public g f10572a;

        /* renamed from: b  reason: collision with root package name */
        public s f10573b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10574c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f10575d;

        /* renamed from: e  reason: collision with root package name */
        public int f10576e;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f10575d = obj;
            this.f10576e |= Integer.MIN_VALUE;
            return j.a((g) null, (s) null, false, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC, Splitter:B:41:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r6, cg.s<? extends T> r7, boolean r8, jf.d<? super ff.m> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.j$a r0 = (kotlinx.coroutines.flow.j.a) r0
            int r1 = r0.f10576e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10576e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.j$a r0 = new kotlinx.coroutines.flow.j$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f10575d
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10576e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0049
            if (r2 == r3) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            boolean r6 = r0.f10574c
            cg.s r7 = r0.f10573b
            kotlinx.coroutines.flow.g r8 = r0.f10572a
            cb.b.J(r9)     // Catch:{ all -> 0x0093 }
        L_0x002f:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x0050
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            boolean r6 = r0.f10574c
            cg.s r7 = r0.f10573b
            kotlinx.coroutines.flow.g r8 = r0.f10572a
            cb.b.J(r9)     // Catch:{ all -> 0x0093 }
            cg.i r9 = (cg.i) r9     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r9.f4028a     // Catch:{ all -> 0x0093 }
            goto L_0x0062
        L_0x0049:
            cb.b.J(r9)
            boolean r9 = r6 instanceof kotlinx.coroutines.flow.c1
            if (r9 != 0) goto L_0x00c5
        L_0x0050:
            r0.f10572a = r6     // Catch:{ all -> 0x00b9 }
            r0.f10573b = r7     // Catch:{ all -> 0x00b9 }
            r0.f10574c = r8     // Catch:{ all -> 0x00b9 }
            r0.f10576e = r3     // Catch:{ all -> 0x00b9 }
            java.lang.Object r9 = r7.m(r0)     // Catch:{ all -> 0x00b9 }
            if (r9 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0062:
            boolean r2 = r9 instanceof cg.i.a     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0080
            boolean r8 = r9 instanceof cg.i.a     // Catch:{ all -> 0x0093 }
            r0 = 0
            if (r8 == 0) goto L_0x006e
            cg.i$a r9 = (cg.i.a) r9     // Catch:{ all -> 0x0093 }
            goto L_0x006f
        L_0x006e:
            r9 = r0
        L_0x006f:
            if (r9 == 0) goto L_0x0074
            java.lang.Throwable r8 = r9.f4029a     // Catch:{ all -> 0x0093 }
            goto L_0x0075
        L_0x0074:
            r8 = r0
        L_0x0075:
            if (r8 != 0) goto L_0x007f
            if (r6 == 0) goto L_0x007c
            d2.f1.m(r7, r0)
        L_0x007c:
            ff.m r6 = ff.m.f8717a
            return r6
        L_0x007f:
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x0080:
            boolean r2 = r9 instanceof cg.i.b     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0095
            r0.f10572a = r8     // Catch:{ all -> 0x0093 }
            r0.f10573b = r7     // Catch:{ all -> 0x0093 }
            r0.f10574c = r6     // Catch:{ all -> 0x0093 }
            r0.f10576e = r4     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r8.m(r9, r0)     // Catch:{ all -> 0x0093 }
            if (r9 != r1) goto L_0x002f
            return r1
        L_0x0093:
            r8 = move-exception
            goto L_0x00bd
        L_0x0095:
            boolean r8 = r9 instanceof cg.i.a     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x00a1
            r8 = r9
            cg.i$a r8 = (cg.i.a) r8     // Catch:{ all -> 0x0093 }
            java.lang.Throwable r8 = r8.f4029a     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x00a1
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x00a1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "Trying to call 'getOrThrow' on a failed channel result: "
            r0.<init>(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r9)     // Catch:{ all -> 0x0093 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0093 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0093 }
            r8.<init>(r9)     // Catch:{ all -> 0x0093 }
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x00b9:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x00bd:
            throw r8     // Catch:{ all -> 0x00be }
        L_0x00be:
            r9 = move-exception
            if (r6 == 0) goto L_0x00c4
            d2.f1.m(r7, r8)
        L_0x00c4:
            throw r9
        L_0x00c5:
            kotlinx.coroutines.flow.c1 r6 = (kotlinx.coroutines.flow.c1) r6
            java.lang.Throwable r6 = r6.f10527a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.j.a(kotlinx.coroutines.flow.g, cg.s, boolean, jf.d):java.lang.Object");
    }
}
