package kotlinx.coroutines.flow;

import dg.j;
import ff.m;
import jf.d;
import jf.g;
import lf.e;
import lf.i;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import rf.l;
import rf.p;
import rf.q;
import s0.b0;

public final class w0 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f10671a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10672b;

    @e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    public static final class a extends i implements q<g<? super s0>, Integer, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f10673a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ g f10674b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ int f10675c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ w0 f10676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, d<? super a> dVar) {
            super(3, dVar);
            this.f10676d = w0Var;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj2).intValue();
            a aVar = new a(this.f10676d, (d) obj3);
            aVar.f10674b = (g) obj;
            aVar.f10675c = intValue;
            return aVar.invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kf.a r0 = kf.a.f10464a
                int r1 = r10.f10673a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                kotlinx.coroutines.flow.w0 r7 = r10.f10676d
                if (r1 == 0) goto L_0x0036
                if (r1 == r6) goto L_0x0032
                if (r1 == r5) goto L_0x002c
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                goto L_0x0032
            L_0x0018:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0020:
                kotlinx.coroutines.flow.g r1 = r10.f10674b
                cb.b.J(r11)
                goto L_0x007a
            L_0x0026:
                kotlinx.coroutines.flow.g r1 = r10.f10674b
                cb.b.J(r11)
                goto L_0x006d
            L_0x002c:
                kotlinx.coroutines.flow.g r1 = r10.f10674b
                cb.b.J(r11)
                goto L_0x0058
            L_0x0032:
                cb.b.J(r11)
                goto L_0x0088
            L_0x0036:
                cb.b.J(r11)
                kotlinx.coroutines.flow.g r11 = r10.f10674b
                int r1 = r10.f10675c
                if (r1 <= 0) goto L_0x004a
                kotlinx.coroutines.flow.s0 r1 = kotlinx.coroutines.flow.s0.f10635a
                r10.f10673a = r6
                java.lang.Object r11 = r11.m(r1, r10)
                if (r11 != r0) goto L_0x0088
                return r0
            L_0x004a:
                long r8 = r7.f10671a
                r10.f10674b = r11
                r10.f10673a = r5
                java.lang.Object r1 = cb.d.x(r8, r10)
                if (r1 != r0) goto L_0x0057
                return r0
            L_0x0057:
                r1 = r11
            L_0x0058:
                long r5 = r7.f10672b
                r8 = 0
                int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r11 <= 0) goto L_0x007a
                kotlinx.coroutines.flow.s0 r11 = kotlinx.coroutines.flow.s0.f10636b
                r10.f10674b = r1
                r10.f10673a = r4
                java.lang.Object r11 = r1.m(r11, r10)
                if (r11 != r0) goto L_0x006d
                return r0
            L_0x006d:
                long r4 = r7.f10672b
                r10.f10674b = r1
                r10.f10673a = r3
                java.lang.Object r11 = cb.d.x(r4, r10)
                if (r11 != r0) goto L_0x007a
                return r0
            L_0x007a:
                kotlinx.coroutines.flow.s0 r11 = kotlinx.coroutines.flow.s0.f10637c
                r3 = 0
                r10.f10674b = r3
                r10.f10673a = r2
                java.lang.Object r11 = r1.m(r11, r10)
                if (r11 != r0) goto L_0x0088
                return r0
            L_0x0088:
                ff.m r11 = ff.m.f8717a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<s0, d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10677a;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        public final d<m> create(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10677a = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((s0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            return Boolean.valueOf(((s0) this.f10677a) != s0.f10635a);
        }
    }

    public w0(long j10, long j11) {
        this.f10671a = j10;
        this.f10672b = j11;
        boolean z10 = true;
        if (j10 >= 0) {
            if (!(j11 < 0 ? false : z10)) {
                throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }

    public final f<s0> a(x0<Integer> x0Var) {
        a aVar = new a(this, (d<? super a>) null);
        int i8 = z.f10695a;
        return cb.d.y(new u(new b((d<? super b>) null), new j(aVar, x0Var, g.f10014a, -2, cg.e.f4020a)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return this.f10671a == w0Var.f10671a && this.f10672b == w0Var.f10672b;
        }
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.f10672b) + (Long.hashCode(this.f10671a) * 31);
    }

    public final String toString() {
        hf.a aVar = new hf.a(2);
        long j10 = this.f10671a;
        if (j10 > 0) {
            aVar.add("stopTimeout=" + j10 + "ms");
        }
        long j11 = this.f10672b;
        if (j11 < Long.MAX_VALUE) {
            aVar.add("replayExpiration=" + j11 + "ms");
        }
        cb.d.p(aVar);
        return b0.a(new StringBuilder("SharingStarted.WhileSubscribed("), gf.q.A0(aVar, (String) null, (String) null, (String) null, (l) null, 63), ')');
    }
}
