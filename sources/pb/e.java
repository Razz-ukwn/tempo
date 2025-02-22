package pb;

import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.c;
import lf.i;
import mb.b;
import rf.p;

@lf.e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$getDataFromDb$2", f = "MediaRepositoryImpl.kt", l = {113, 132}, m = "invokeSuspend")
public final class e extends i implements p<g<? super b<? extends ArrayList<nb.a>>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12545a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f12546b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f12547c;

    public static final class a<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList<nb.a> f12548a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g<b<? extends ArrayList<nb.a>>> f12549b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f12550c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f12551d;

        @lf.e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$getDataFromDb$2$1", f = "MediaRepositoryImpl.kt", l = {117, 119, 128}, m = "emit")
        /* renamed from: pb.e$a$a  reason: collision with other inner class name */
        public static final class C0246a extends c {
            public String B;
            public int C;
            public /* synthetic */ Object D;
            public final /* synthetic */ a<T> E;
            public int F;

            /* renamed from: a  reason: collision with root package name */
            public a f12552a;

            /* renamed from: b  reason: collision with root package name */
            public h f12553b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList f12554c;

            /* renamed from: d  reason: collision with root package name */
            public Iterator f12555d;

            /* renamed from: e  reason: collision with root package name */
            public String f12556e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0246a(a<? super T> aVar, d<? super C0246a> dVar) {
                super(dVar);
                this.E = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.D = obj;
                this.F |= Integer.MIN_VALUE;
                return this.E.m((List<String>) null, this);
            }
        }

        public a(ArrayList<nb.a> arrayList, g<? super b<? extends ArrayList<nb.a>>> gVar, h hVar, int i8) {
            this.f12548a = arrayList;
            this.f12549b = gVar;
            this.f12550c = hVar;
            this.f12551d = i8;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x010d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.util.List<java.lang.String> r18, jf.d<? super ff.m> r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                boolean r2 = r1 instanceof pb.e.a.C0246a
                if (r2 == 0) goto L_0x0017
                r2 = r1
                pb.e$a$a r2 = (pb.e.a.C0246a) r2
                int r3 = r2.F
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.F = r3
                goto L_0x001c
            L_0x0017:
                pb.e$a$a r2 = new pb.e$a$a
                r2.<init>(r0, r1)
            L_0x001c:
                java.lang.Object r1 = r2.D
                kf.a r3 = kf.a.f10464a
                int r4 = r2.F
                r5 = 1
                r6 = 2
                r7 = 3
                r8 = 0
                java.lang.String r9 = "mediaDatabase"
                if (r4 == 0) goto L_0x006b
                if (r4 == r5) goto L_0x0056
                if (r4 == r6) goto L_0x003d
                if (r4 != r7) goto L_0x0035
                cb.b.J(r1)
                goto L_0x010e
            L_0x0035:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003d:
                int r4 = r2.C
                java.lang.String r10 = r2.B
                java.lang.String r11 = r2.f12556e
                java.util.Iterator r12 = r2.f12555d
                java.util.ArrayList r13 = r2.f12554c
                pb.h r14 = r2.f12553b
                pb.e$a r15 = r2.f12552a
                cb.b.J(r1)
            L_0x004e:
                r16 = r11
                r11 = r4
                r4 = r12
                r12 = r16
                goto L_0x00d4
            L_0x0056:
                int r4 = r2.C
                java.lang.String r10 = r2.f12556e
                java.util.Iterator r11 = r2.f12555d
                java.util.ArrayList r12 = r2.f12554c
                pb.h r13 = r2.f12553b
                pb.e$a r14 = r2.f12552a
                cb.b.J(r1)
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                goto L_0x00b2
            L_0x006b:
                cb.b.J(r1)
                java.util.ArrayList<nb.a> r1 = r0.f12548a
                r1.clear()
                r4 = r18
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
                pb.h r10 = r0.f12550c
                int r11 = r0.f12551d
                r12 = r0
            L_0x0080:
                boolean r13 = r4.hasNext()
                if (r13 == 0) goto L_0x00f0
                java.lang.Object r13 = r4.next()
                java.lang.String r13 = (java.lang.String) r13
                com.lassi.data.database.MediaFileDatabase r14 = r10.f12567g
                if (r14 == 0) goto L_0x00ec
                ob.c r14 = r14.p()
                r2.f12552a = r12
                r2.f12553b = r10
                r2.f12554c = r1
                r2.f12555d = r4
                r2.f12556e = r13
                r2.B = r8
                r2.C = r11
                r2.F = r5
                java.lang.Object r14 = r14.a(r13, r11, r2)
                if (r14 != r3) goto L_0x00ab
                return r3
            L_0x00ab:
                r15 = r12
                r12 = r4
                r4 = r11
                r11 = r13
                r13 = r1
                r1 = r14
                r14 = r10
            L_0x00b2:
                r10 = r1
                java.lang.String r10 = (java.lang.String) r10
                com.lassi.data.database.MediaFileDatabase r1 = r14.f12567g
                if (r1 == 0) goto L_0x00e8
                ob.c r1 = r1.p()
                r2.f12552a = r15
                r2.f12553b = r14
                r2.f12554c = r13
                r2.f12555d = r12
                r2.f12556e = r11
                r2.B = r10
                r2.C = r4
                r2.F = r6
                java.lang.Object r1 = r1.g(r11, r4, r2)
                if (r1 != r3) goto L_0x004e
                return r3
            L_0x00d4:
                java.lang.Number r1 = (java.lang.Number) r1
                long r5 = r1.longValue()
                nb.a r1 = new nb.a
                r1.<init>(r5, r12, r10)
                r13.add(r1)
                r1 = r13
                r10 = r14
                r12 = r15
                r5 = 1
                r6 = 2
                goto L_0x0080
            L_0x00e8:
                sf.j.l(r9)
                throw r8
            L_0x00ec:
                sf.j.l(r9)
                throw r8
            L_0x00f0:
                kotlinx.coroutines.flow.g<mb.b<? extends java.util.ArrayList<nb.a>>> r1 = r12.f12549b
                mb.b$c r4 = new mb.b$c
                java.util.ArrayList<nb.a> r5 = r12.f12548a
                r4.<init>(r5)
                r2.f12552a = r8
                r2.f12553b = r8
                r2.f12554c = r8
                r2.f12555d = r8
                r2.f12556e = r8
                r2.B = r8
                r2.F = r7
                java.lang.Object r1 = r1.m(r4, r2)
                if (r1 != r3) goto L_0x010e
                return r3
            L_0x010e:
                ff.m r1 = ff.m.f8717a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pb.e.a.m(java.util.List, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h hVar, d<? super e> dVar) {
        super(2, dVar);
        this.f12547c = hVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e eVar = new e(this.f12547c, dVar);
        eVar.f12546b = obj;
        return eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[Catch:{ Exception -> 0x0022 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r9.f12545a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            cb.b.J(r10)
            goto L_0x0086
        L_0x0012:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001a:
            java.lang.Object r1 = r9.f12546b
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.g) r1
            cb.b.J(r10)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0086
        L_0x0022:
            r10 = move-exception
            goto L_0x006e
        L_0x0024:
            cb.b.J(r10)
            java.lang.Object r10 = r9.f12546b
            r1 = r10
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.g) r1
            pb.h r10 = r9.f12547c
            android.content.Context r5 = r10.f12561a
            r10.l(r5)
            rb.a r5 = rb.a.V     // Catch:{ Exception -> 0x0022 }
            int r5 = r5.F     // Catch:{ Exception -> 0x0022 }
            int r5 = q.g.c(r5)     // Catch:{ Exception -> 0x0022 }
            if (r5 == 0) goto L_0x0046
            if (r5 == r4) goto L_0x0044
            if (r5 == r3) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r5 = 3
            goto L_0x0047
        L_0x0044:
            r5 = r3
            goto L_0x0047
        L_0x0046:
            r5 = r4
        L_0x0047:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0022 }
            r6.<init>()     // Catch:{ Exception -> 0x0022 }
            com.lassi.data.database.MediaFileDatabase r7 = r10.f12567g     // Catch:{ Exception -> 0x0022 }
            if (r7 == 0) goto L_0x0068
            ob.c r7 = r7.p()     // Catch:{ Exception -> 0x0022 }
            kotlinx.coroutines.flow.n0 r7 = r7.c(r5)     // Catch:{ Exception -> 0x0022 }
            pb.e$a r8 = new pb.e$a     // Catch:{ Exception -> 0x0022 }
            r8.<init>(r6, r1, r10, r5)     // Catch:{ Exception -> 0x0022 }
            r9.f12546b = r1     // Catch:{ Exception -> 0x0022 }
            r9.f12545a = r4     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r10 = r7.a(r8, r9)     // Catch:{ Exception -> 0x0022 }
            if (r10 != r0) goto L_0x0086
            return r0
        L_0x0068:
            java.lang.String r10 = "mediaDatabase"
            sf.j.l(r10)     // Catch:{ Exception -> 0x0022 }
            throw r2     // Catch:{ Exception -> 0x0022 }
        L_0x006e:
            r10.printStackTrace()
            mb.b$a r10 = new mb.b$a
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>()
            r10.<init>(r4)
            r9.f12546b = r2
            r9.f12545a = r3
            java.lang.Object r10 = r1.m(r10, r9)
            if (r10 != r0) goto L_0x0086
            return r0
        L_0x0086:
            ff.m r10 = ff.m.f8717a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
