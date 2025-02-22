package q;

import ag.g0;
import cb.b;
import cg.f;
import cg.h;
import d2.f1;
import ff.m;
import lf.e;
import lf.i;
import rf.l;
import rf.p;
import sf.j;
import t.y2;

@e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {
    public final /* synthetic */ y2<j<Object>> B;
    public final /* synthetic */ y2<l<Object, m>> C;

    /* renamed from: a  reason: collision with root package name */
    public h f12668a;

    /* renamed from: b  reason: collision with root package name */
    public int f12669b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f12670c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f<Object> f12671d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b<Object, Object> f12672e;

    @e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f12673a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f12674b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b<Object, Object> f12675c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ y2<j<Object>> f12676d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ y2<l<Object, m>> f12677e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, b<Object, Object> bVar, y2<? extends j<Object>> y2Var, y2<? extends l<Object, m>> y2Var2, jf.d<? super a> dVar) {
            super(2, dVar);
            this.f12674b = obj;
            this.f12675c = bVar;
            this.f12676d = y2Var;
            this.f12677e = y2Var2;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            return new a(this.f12674b, this.f12675c, this.f12676d, this.f12677e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f12673a;
            b<Object, Object> bVar = this.f12675c;
            if (i8 == 0) {
                b.J(obj);
                if (!j.a(this.f12674b, bVar.f12650e.getValue())) {
                    Object obj2 = this.f12674b;
                    int i10 = e.f12683a;
                    j value = this.f12676d.getValue();
                    this.f12673a = 1;
                    l0<T, V> l0Var = bVar.f12646a;
                    l<V, T> b10 = l0Var.b();
                    k<T, V> kVar = bVar.f12648c;
                    T invoke = b10.invoke(kVar.f12711c);
                    T value2 = kVar.getValue();
                    j.f(value, "animationSpec");
                    j.f(l0Var, "typeConverter");
                    k0 k0Var = new k0(value, l0Var, value2, obj2, (p) l0Var.a().invoke(invoke));
                    a aVar2 = new a(bVar, invoke, k0Var, kVar.f12712d, (l<? super b<Object, p>, m>) null, (jf.d<? super a>) null);
                    v vVar = bVar.f12651f;
                    vVar.getClass();
                    if (f1.v(new w(1, vVar, aVar2, (jf.d<? super w>) null), this) == aVar) {
                        return aVar;
                    }
                }
                return m.f8717a;
            } else if (i8 == 1) {
                b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = e.f12683a;
            l value3 = this.f12677e.getValue();
            if (value3 != null) {
                value3.invoke(bVar.f12648c.getValue());
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f<Object> fVar, b<Object, Object> bVar, y2<? extends j<Object>> y2Var, y2<? extends l<Object, m>> y2Var2, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f12671d = fVar;
        this.f12672e = bVar;
        this.B = y2Var;
        this.C = y2Var2;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        d dVar2 = new d(this.f12671d, this.f12672e, this.B, this.C, dVar);
        dVar2.f12670c = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f12669b
            r3 = 1
            if (r2 == 0) goto L_0x0020
            if (r2 != r3) goto L_0x0018
            cg.h r2 = r0.f12668a
            java.lang.Object r4 = r0.f12670c
            ag.g0 r4 = (ag.g0) r4
            cb.b.J(r18)
            r6 = r18
            r5 = r0
            goto L_0x0040
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0020:
            cb.b.J(r18)
            java.lang.Object r2 = r0.f12670c
            ag.g0 r2 = (ag.g0) r2
            cg.f<java.lang.Object> r4 = r0.f12671d
            cg.h r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x0033:
            r5.f12670c = r4
            r5.f12668a = r2
            r5.f12669b = r3
            java.lang.Object r6 = r2.a(r5)
            if (r6 != r1) goto L_0x0040
            return r1
        L_0x0040:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0071
            java.lang.Object r6 = r2.next()
            cg.f<java.lang.Object> r7 = r5.f12671d
            java.lang.Object r7 = r7.h()
            boolean r8 = r7 instanceof cg.i.b
            r9 = 0
            if (r8 != 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r7 = r9
        L_0x0059:
            if (r7 != 0) goto L_0x005d
            r11 = r6
            goto L_0x005e
        L_0x005d:
            r11 = r7
        L_0x005e:
            q.d$a r6 = new q.d$a
            q.b<java.lang.Object, java.lang.Object> r12 = r5.f12672e
            t.y2<q.j<java.lang.Object>> r13 = r5.B
            t.y2<rf.l<java.lang.Object, ff.m>> r14 = r5.C
            r15 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r7 = 3
            r8 = 0
            cb.b.D(r4, r9, r8, r6, r7)
            goto L_0x0033
        L_0x0071:
            ff.m r1 = ff.m.f8717a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
