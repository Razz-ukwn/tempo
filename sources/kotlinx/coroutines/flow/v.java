package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import rf.p;
import sf.r;

public final class v<T> implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g<T> f10650b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<T, d<? super Boolean>, Object> f10651c;

    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public v f10652a;

        /* renamed from: b  reason: collision with root package name */
        public Object f10653b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f10654c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v<T> f10655d;

        /* renamed from: e  reason: collision with root package name */
        public int f10656e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v<? super T> vVar, d<? super a> dVar) {
            super(dVar);
            this.f10655d = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10654c = obj;
            this.f10656e |= Integer.MIN_VALUE;
            return this.f10655d.m(null, this);
        }
    }

    public v(r rVar, g<? super T> gVar, p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        this.f10649a = rVar;
        this.f10650b = gVar;
        this.f10651c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(T r7, jf.d<? super ff.m> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.v$a r0 = (kotlinx.coroutines.flow.v.a) r0
            int r1 = r0.f10656e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10656e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.v$a r0 = new kotlinx.coroutines.flow.v$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f10654c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10656e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            cb.b.J(r8)
            goto L_0x0084
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f10653b
            kotlinx.coroutines.flow.v r2 = r0.f10652a
            cb.b.J(r8)
            goto L_0x0068
        L_0x003d:
            cb.b.J(r8)
            goto L_0x0055
        L_0x0041:
            cb.b.J(r8)
            sf.r r8 = r6.f10649a
            boolean r8 = r8.f14953a
            if (r8 == 0) goto L_0x0058
            r0.f10656e = r5
            kotlinx.coroutines.flow.g<T> r8 = r6.f10650b
            java.lang.Object r7 = r8.m(r7, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            ff.m r7 = ff.m.f8717a
            return r7
        L_0x0058:
            r0.f10652a = r6
            r0.f10653b = r7
            r0.f10656e = r4
            rf.p<T, jf.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f10651c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0087
            sf.r r8 = r2.f10649a
            r8.f14953a = r5
            r8 = 0
            r0.f10652a = r8
            r0.f10653b = r8
            r0.f10656e = r3
            kotlinx.coroutines.flow.g<T> r8 = r2.f10650b
            java.lang.Object r7 = r8.m(r7, r0)
            if (r7 != r1) goto L_0x0084
            return r1
        L_0x0084:
            ff.m r7 = ff.m.f8717a
            return r7
        L_0x0087:
            ff.m r7 = ff.m.f8717a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.m(java.lang.Object, jf.d):java.lang.Object");
    }
}
