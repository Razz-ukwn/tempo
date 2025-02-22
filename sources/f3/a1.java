package f3;

import f3.z0;
import ff.m;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import lf.e;
import lf.i;
import rf.p;
import rf.q;

@e(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {233}, m = "invokeSuspend")
public final class a1 extends i implements p<l2<x1<Object>>, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8055a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z0<Object, Object> f8057c;

    @e(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {62, 62}, m = "invokeSuspend")
    public static final class a extends i implements p<g<? super Boolean>, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8058a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8059b;

        public a(i2<Object, Object> i2Var, jf.d<? super a> dVar) {
            super(2, dVar);
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            a aVar = new a((i2<Object, Object>) null, dVar);
            aVar.f8059b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kf.a r0 = kf.a.f10464a
                int r1 = r6.f8058a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 == r4) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                cb.b.J(r7)
                goto L_0x0041
            L_0x0011:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0019:
                java.lang.Object r1 = r6.f8059b
                kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.g) r1
                cb.b.J(r7)
                f3.h2 r7 = (f3.h2) r7
                goto L_0x002c
            L_0x0023:
                cb.b.J(r7)
                java.lang.Object r7 = r6.f8059b
                r1 = r7
                kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.g) r1
                r7 = r2
            L_0x002c:
                f3.h2 r5 = f3.h2.f8271a
                if (r7 != r5) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r4 = 0
            L_0x0032:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                r6.f8059b = r2
                r6.f8058a = r3
                java.lang.Object r7 = r1.m(r7, r6)
                if (r7 != r0) goto L_0x0041
                return r0
            L_0x0041:
                ff.m r7 = ff.m.f8717a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.a1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {66, 70}, m = "invokeSuspend")
    public static final class b extends i implements q<z0.a<Object, Object>, Boolean, jf.d<? super z0.a<Object, Object>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public f2 f8060a;

        /* renamed from: b  reason: collision with root package name */
        public int f8061b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ z0.a f8062c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ boolean f8063d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ z0<Object, Object> f8064e;

        public /* synthetic */ class a extends sf.i implements rf.a<m> {
            public a(z0 z0Var) {
                super(0, (Object) z0Var, z0.class, "refresh", "refresh()V");
            }

            public final Object d() {
                ((z0) this.f14944b).f8566d.d(Boolean.TRUE);
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(z0<Object, Object> z0Var, i2<Object, Object> i2Var, jf.d<? super b> dVar) {
            super(3, dVar);
            this.f8064e = z0Var;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            b bVar = new b(this.f8064e, (i2<Object, Object>) null, (jf.d) obj3);
            bVar.f8062c = (z0.a) obj;
            bVar.f8063d = booleanValue;
            return bVar.invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8061b
                r3 = 2
                f3.z0<java.lang.Object, java.lang.Object> r4 = r0.f8064e
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0030
                if (r2 == r5) goto L_0x0026
                if (r2 != r3) goto L_0x001e
                boolean r1 = r0.f8063d
                f3.f2 r2 = r0.f8060a
                f3.z0$a r3 = r0.f8062c
                cb.b.J(r19)
                r7 = r3
                r3 = r19
                goto L_0x006c
            L_0x001e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0026:
                boolean r2 = r0.f8063d
                f3.z0$a r7 = r0.f8062c
                cb.b.J(r19)
                r8 = r19
                goto L_0x0051
            L_0x0030:
                cb.b.J(r19)
                f3.z0$a r2 = r0.f8062c
                boolean r7 = r0.f8063d
                if (r2 != 0) goto L_0x003b
                r8 = r6
                goto L_0x003f
            L_0x003b:
                f3.f1<Key, Value> r8 = r2.f8569a
                f3.f2<Key, Value> r8 = r8.f8196b
            L_0x003f:
                r0.f8062c = r2
                r0.f8063d = r7
                r0.f8061b = r5
                java.lang.Object r8 = f3.z0.a(r4, r8, r0)
                if (r8 != r1) goto L_0x004c
                return r1
            L_0x004c:
                r17 = r7
                r7 = r2
                r2 = r17
            L_0x0051:
                f3.f2 r8 = (f3.f2) r8
                if (r7 != 0) goto L_0x0059
                r13 = r2
                r3 = r6
                r10 = r8
                goto L_0x0070
            L_0x0059:
                r0.f8062c = r7
                r0.f8060a = r8
                r0.f8063d = r2
                r0.f8061b = r3
                f3.f1<Key, Value> r3 = r7.f8569a
                java.lang.Object r3 = r3.e(r0)
                if (r3 != r1) goto L_0x006a
                return r1
            L_0x006a:
                r1 = r2
                r2 = r8
            L_0x006c:
                f3.g2 r3 = (f3.g2) r3
                r13 = r1
                r10 = r2
            L_0x0070:
                if (r3 != 0) goto L_0x0074
                r1 = r6
                goto L_0x0076
            L_0x0074:
                java.util.List<f3.f2$b$b<Key, Value>> r1 = r3.f8246a
            L_0x0076:
                java.util.Collection r1 = (java.util.Collection) r1
                r2 = 0
                if (r1 == 0) goto L_0x0084
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r1 = r2
                goto L_0x0085
            L_0x0084:
                r1 = r5
            L_0x0085:
                if (r1 == 0) goto L_0x00a3
                if (r7 != 0) goto L_0x008a
                goto L_0x009e
            L_0x008a:
                f3.g2<Key, Value> r1 = r7.f8570b
                if (r1 != 0) goto L_0x008f
                goto L_0x009e
            L_0x008f:
                java.util.List<f3.f2$b$b<Key, Value>> r1 = r1.f8246a
                if (r1 != 0) goto L_0x0094
                goto L_0x009e
            L_0x0094:
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r5
                if (r1 != r5) goto L_0x009e
                goto L_0x009f
            L_0x009e:
                r5 = r2
            L_0x009f:
                if (r5 == 0) goto L_0x00a3
                f3.g2<Key, Value> r3 = r7.f8570b
            L_0x00a3:
                if (r3 != 0) goto L_0x00a7
                r1 = r6
                goto L_0x00a9
            L_0x00a7:
                java.lang.Integer r1 = r3.f8247b
            L_0x00a9:
                if (r1 != 0) goto L_0x00ba
                if (r7 != 0) goto L_0x00ae
                goto L_0x00b2
            L_0x00ae:
                f3.g2<Key, Value> r1 = r7.f8570b
                if (r1 != 0) goto L_0x00b4
            L_0x00b2:
                r1 = r6
                goto L_0x00b6
            L_0x00b4:
                java.lang.Integer r1 = r1.f8247b
            L_0x00b6:
                if (r1 == 0) goto L_0x00ba
                f3.g2<Key, Value> r3 = r7.f8570b
            L_0x00ba:
                if (r3 != 0) goto L_0x00be
                r1 = r6
                goto L_0x00c2
            L_0x00be:
                java.lang.Object r1 = r10.b(r3)
            L_0x00c2:
                if (r1 != 0) goto L_0x00c6
                Key r1 = r4.f8564b
            L_0x00c6:
                r9 = r1
                if (r7 != 0) goto L_0x00ca
                goto L_0x00d1
            L_0x00ca:
                f3.f1<Key, Value> r1 = r7.f8569a
                ag.q1 r1 = r1.m
                r1.e(r6)
            L_0x00d1:
                if (r7 != 0) goto L_0x00d4
                goto L_0x00d9
            L_0x00d4:
                ag.n1 r1 = r7.f8571c
                r1.e(r6)
            L_0x00d9:
                f3.z0$a r1 = new f3.z0$a
                f3.w1 r11 = r4.f8565c
                f3.v r2 = r4.f8567e
                java.lang.Object r2 = r2.f8517b
                r12 = r2
                kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.f) r12
                f3.a1$b$a r2 = new f3.a1$b$a
                r2.<init>(r4)
                f3.f1 r4 = new f3.f1
                r14 = 0
                r8 = r4
                r15 = r3
                r16 = r2
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                ag.q1 r2 = new ag.q1
                r2.<init>(r6)
                r1.<init>(r4, r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.a1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements g<x1<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l2 f8065a;

        public c(l2 l2Var) {
            this.f8065a = l2Var;
        }

        public final Object m(x1<Object> x1Var, jf.d<? super m> dVar) {
            Object t2 = this.f8065a.t(x1Var, dVar);
            return t2 == kf.a.f10464a ? t2 : m.f8717a;
        }
    }

    @e(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {226}, m = "invokeSuspend")
    public static final class d extends i implements q<g<? super x1<Object>>, z0.a<Object, Object>, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8066a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ g f8067b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f8068c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ z0 f8069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(z0 z0Var, i2 i2Var, jf.d dVar) {
            super(3, dVar);
            this.f8069d = z0Var;
        }

        public final Object e(Object obj, Object obj2, Object obj3) {
            d dVar = new d(this.f8069d, (i2) null, (jf.d) obj3);
            dVar.f8067b = (g) obj;
            dVar.f8068c = obj2;
            return dVar.invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8066a;
            if (i8 == 0) {
                cb.b.J(obj);
                g gVar = this.f8067b;
                z0.a aVar2 = (z0.a) this.f8068c;
                f1<Key, Value> f1Var = aVar2.f8569a;
                z0 z0Var = this.f8069d;
                z0Var.getClass();
                x1 x1Var = new x1(f1Var.f8207n, new z0.b(z0Var, aVar2.f8569a, z0Var.f8567e));
                this.f8066a = 1;
                if (gVar.m(x1Var, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a1(z0 z0Var, jf.d dVar) {
        super(2, dVar);
        this.f8057c = z0Var;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        a1 a1Var = new a1(this.f8057c, dVar);
        a1Var.f8056b = obj;
        return a1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((l2) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8055a;
        if (i8 == 0) {
            cb.b.J(obj);
            z0<Object, Object> z0Var = this.f8057c;
            o oVar = new o(new a((i2<Object, Object>) null, (jf.d<? super a>) null), (f) z0Var.f8566d.f8517b);
            b bVar = new b(z0Var, (i2<Object, Object>) null, (jf.d<? super b>) null);
            Object obj2 = f0.f8186a;
            f a10 = f0.a(new d0(new n0(new e0((Object) null, oVar, bVar, (jf.d<? super e0>) null))), new d(z0Var, (i2) null, (jf.d) null));
            c cVar = new c((l2) this.f8056b);
            this.f8055a = 1;
            if (a10.a(cVar, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
