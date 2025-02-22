package ec;

import ag.g0;
import ag.s0;
import ag.x1;
import androidx.lifecycle.v;
import ff.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.f;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.o;
import lf.i;
import pb.h;
import rf.p;
import sf.j;

public final class g extends yb.c {

    /* renamed from: e  reason: collision with root package name */
    public final rb.c f7921e;

    /* renamed from: f  reason: collision with root package name */
    public final qb.c<mb.a<ArrayList<nb.a>>> f7922f;

    /* renamed from: g  reason: collision with root package name */
    public final qb.c f7923g;

    /* renamed from: h  reason: collision with root package name */
    public final v<ArrayList<nb.a>> f7924h = new v<>();

    /* renamed from: i  reason: collision with root package name */
    public final v<Boolean> f7925i = new v<>(Boolean.FALSE);

    @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel$checkInsert$1", f = "FolderViewModel.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7926a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f7927b;

        @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel$checkInsert$1$1", f = "FolderViewModel.kt", l = {35, 36, 38}, m = "invokeSuspend")
        /* renamed from: ec.g$a$a  reason: collision with other inner class name */
        public static final class C0129a extends i implements p<g0, jf.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f7928a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g f7929b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0129a(g gVar, jf.d<? super C0129a> dVar) {
                super(2, dVar);
                this.f7929b = gVar;
            }

            public final jf.d<m> create(Object obj, jf.d<?> dVar) {
                return new C0129a(this.f7929b, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0129a) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f7928a;
                g gVar = this.f7929b;
                if (i8 == 0) {
                    cb.b.J(obj);
                    cb.d.f0(gVar.f7922f);
                    this.f7928a = 1;
                    obj = gVar.f7921e.c(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    cb.b.J(obj);
                } else if (i8 == 2 || i8 == 3) {
                    cb.b.J(obj);
                    return m.f8717a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f7928a = 2;
                    if (g.f(gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f7928a = 3;
                    if (g.e(gVar, this) == aVar) {
                        return aVar;
                    }
                }
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, jf.d<? super a> dVar) {
            super(2, dVar);
            this.f7927b = gVar;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            return new a(this.f7927b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f7926a;
            if (i8 == 0) {
                cb.b.J(obj);
                kotlinx.coroutines.scheduling.b bVar = s0.f481b;
                C0129a aVar2 = new C0129a(this.f7927b, (jf.d<? super C0129a>) null);
                this.f7926a = 1;
                if (cb.b.M(bVar, aVar2, this) == aVar) {
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

    public static final class b implements f<List<? extends nb.a>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f7930a;

        public static final class a<T> implements kotlinx.coroutines.flow.g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.g f7931a;

            @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel$getDataFromDatabase$$inlined$map$1$2", f = "FolderViewModel.kt", l = {224}, m = "emit")
            /* renamed from: ec.g$b$a$a  reason: collision with other inner class name */
            public static final class C0130a extends lf.c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f7932a;

                /* renamed from: b  reason: collision with root package name */
                public int f7933b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f7934c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0130a(a aVar, jf.d dVar) {
                    super(dVar);
                    this.f7934c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f7932a = obj;
                    this.f7933b |= Integer.MIN_VALUE;
                    return this.f7934c.m((Object) null, this);
                }
            }

            public a(kotlinx.coroutines.flow.g gVar) {
                this.f7931a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r6, jf.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ec.g.b.a.C0130a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ec.g$b$a$a r0 = (ec.g.b.a.C0130a) r0
                    int r1 = r0.f7933b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f7933b = r1
                    goto L_0x0018
                L_0x0013:
                    ec.g$b$a$a r0 = new ec.g$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f7932a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f7933b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r7)
                    goto L_0x0074
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    cb.b.J(r7)
                    mb.b r6 = (mb.b) r6
                    boolean r7 = r6 instanceof mb.b.c
                    if (r7 == 0) goto L_0x0077
                    mb.b$c r6 = (mb.b.c) r6
                    T r6 = r6.f11375a
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    java.util.Iterator r6 = r6.iterator()
                L_0x0047:
                    boolean r2 = r6.hasNext()
                    if (r2 == 0) goto L_0x0069
                    java.lang.Object r2 = r6.next()
                    r4 = r2
                    nb.a r4 = (nb.a) r4
                    java.lang.String r4 = r4.f11615a
                    if (r4 == 0) goto L_0x0061
                    int r4 = r4.length()
                    if (r4 != 0) goto L_0x005f
                    goto L_0x0061
                L_0x005f:
                    r4 = 0
                    goto L_0x0062
                L_0x0061:
                    r4 = r3
                L_0x0062:
                    r4 = r4 ^ r3
                    if (r4 == 0) goto L_0x0047
                    r7.add(r2)
                    goto L_0x0047
                L_0x0069:
                    r0.f7933b = r3
                    kotlinx.coroutines.flow.g r6 = r5.f7931a
                    java.lang.Object r6 = r6.m(r7, r0)
                    if (r6 != r1) goto L_0x0074
                    return r1
                L_0x0074:
                    ff.m r6 = ff.m.f8717a
                    return r6
                L_0x0077:
                    boolean r7 = r6 instanceof mb.b.a
                    if (r7 != 0) goto L_0x008f
                    mb.b$b r7 = mb.b.C0216b.f11374a
                    boolean r6 = sf.j.a(r6, r7)
                    if (r6 == 0) goto L_0x0089
                    ff.f r6 = new ff.f
                    r6.<init>()
                    throw r6
                L_0x0089:
                    ff.e r6 = new ff.e
                    r6.<init>()
                    throw r6
                L_0x008f:
                    ff.f r6 = new ff.f
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ec.g.b.a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public b(o oVar) {
            this.f7930a = oVar;
        }

        public final Object a(kotlinx.coroutines.flow.g gVar, jf.d dVar) {
            Object a10 = this.f7930a.a(new a(gVar), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel", f = "FolderViewModel.kt", l = {78, 91}, m = "getDataFromDatabase")
    public static final class c extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public g f7935a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f7936b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f7937c;

        /* renamed from: d  reason: collision with root package name */
        public int f7938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar, jf.d<? super c> dVar) {
            super(dVar);
            this.f7937c = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7936b = obj;
            this.f7938d |= Integer.MIN_VALUE;
            return this.f7937c.h(this);
        }
    }

    @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel$getDataFromDatabase$2", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d extends i implements p<kotlinx.coroutines.flow.g<? super mb.b<? extends ArrayList<nb.a>>>, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f7939a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(g gVar, jf.d<? super d> dVar) {
            super(2, dVar);
            this.f7939a = gVar;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            return new d(this.f7939a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((kotlinx.coroutines.flow.g) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            cb.d.f0(this.f7939a.f7922f);
            return m.f8717a;
        }
    }

    @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel$getDataFromDatabase$4", f = "FolderViewModel.kt", l = {92}, m = "invokeSuspend")
    public static final class e extends i implements p<List<? extends nb.a>, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7940a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f7941b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f7942c;

        @lf.e(c = "com.lassi.presentation.mediadirectory.FolderViewModel$getDataFromDatabase$4$1", f = "FolderViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends i implements p<g0, jf.d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f7943a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ List<nb.a> f7944b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(g gVar, List<nb.a> list, jf.d<? super a> dVar) {
                super(2, dVar);
                this.f7943a = gVar;
                this.f7944b = list;
            }

            public final jf.d<m> create(Object obj, jf.d<?> dVar) {
                return new a(this.f7943a, this.f7944b, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                cb.b.J(obj);
                g gVar = this.f7943a;
                v<ArrayList<nb.a>> vVar = gVar.f7924h;
                List<nb.a> list = this.f7944b;
                j.d(list, "null cannot be cast to non-null type java.util.ArrayList<com.lassi.data.media.MiItemMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.lassi.data.media.MiItemMedia> }");
                vVar.k((ArrayList) list);
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    gVar.f7925i.k(Boolean.TRUE);
                }
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(g gVar, jf.d<? super e> dVar) {
            super(2, dVar);
            this.f7942c = gVar;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            e eVar = new e(this.f7942c, dVar);
            eVar.f7941b = obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) create((List) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f7940a;
            if (i8 == 0) {
                cb.b.J(obj);
                kotlinx.coroutines.scheduling.c cVar = s0.f480a;
                x1 x1Var = kotlinx.coroutines.internal.m.f10728a;
                a aVar2 = new a(this.f7942c, (List) this.f7941b, (jf.d<? super a>) null);
                this.f7940a = 1;
                if (cb.b.M(x1Var, aVar2, this) == aVar) {
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

    public g(h hVar) {
        j.f(hVar, "mediaRepository");
        this.f7921e = hVar;
        qb.c<mb.a<ArrayList<nb.a>>> cVar = new qb.c<>();
        this.f7922f = cVar;
        this.f7923g = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(ec.g r5, jf.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ec.f
            if (r0 == 0) goto L_0x0016
            r0 = r6
            ec.f r0 = (ec.f) r0
            int r1 = r0.f7920d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f7920d = r1
            goto L_0x001b
        L_0x0016:
            ec.f r0 = new ec.f
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f7918b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f7920d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            cb.b.J(r6)
            goto L_0x0083
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            ec.g r5 = r0.f7917a
            cb.b.J(r6)
            goto L_0x004b
        L_0x003b:
            cb.b.J(r6)
            r0.f7917a = r5
            r0.f7920d = r4
            rb.c r6 = r5.f7921e
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L_0x004b
            goto L_0x0085
        L_0x004b:
            mb.b r6 = (mb.b) r6
            boolean r2 = r6 instanceof mb.b.C0216b
            if (r2 == 0) goto L_0x0057
            qb.c<mb.a<java.util.ArrayList<nb.a>>> r5 = r5.f7922f
            cb.d.f0(r5)
            goto L_0x0083
        L_0x0057:
            boolean r2 = r6 instanceof mb.b.c
            if (r2 == 0) goto L_0x0067
            r6 = 0
            r0.f7917a = r6
            r0.f7920d = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L_0x0083
            goto L_0x0085
        L_0x0067:
            boolean r0 = r6 instanceof mb.b.a
            if (r0 == 0) goto L_0x0083
            qb.c<mb.a<java.util.ArrayList<nb.a>>> r5 = r5.f7922f
            mb.b$a r6 = (mb.b.a) r6
            java.lang.Throwable r6 = r6.f11373a
            java.lang.String r0 = "<this>"
            sf.j.f(r5, r0)
            java.lang.String r0 = "throwable"
            sf.j.f(r6, r0)
            mb.a$a r0 = new mb.a$a
            r0.<init>(r6)
            r5.i(r0)
        L_0x0083:
            ff.m r1 = ff.m.f8717a
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g.e(ec.g, jf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(ec.g r5, jf.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ec.h
            if (r0 == 0) goto L_0x0016
            r0 = r6
            ec.h r0 = (ec.h) r0
            int r1 = r0.f7948d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f7948d = r1
            goto L_0x001b
        L_0x0016:
            ec.h r0 = new ec.h
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f7946b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f7948d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            cb.b.J(r6)
            goto L_0x0083
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            ec.g r5 = r0.f7945a
            cb.b.J(r6)
            goto L_0x004b
        L_0x003b:
            cb.b.J(r6)
            r0.f7945a = r5
            r0.f7948d = r4
            rb.c r6 = r5.f7921e
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L_0x004b
            goto L_0x0085
        L_0x004b:
            mb.b r6 = (mb.b) r6
            boolean r2 = r6 instanceof mb.b.C0216b
            if (r2 == 0) goto L_0x0057
            qb.c<mb.a<java.util.ArrayList<nb.a>>> r5 = r5.f7922f
            cb.d.f0(r5)
            goto L_0x0083
        L_0x0057:
            boolean r2 = r6 instanceof mb.b.c
            if (r2 == 0) goto L_0x0067
            r6 = 0
            r0.f7945a = r6
            r0.f7948d = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L_0x0083
            goto L_0x0085
        L_0x0067:
            boolean r0 = r6 instanceof mb.b.a
            if (r0 == 0) goto L_0x0083
            qb.c<mb.a<java.util.ArrayList<nb.a>>> r5 = r5.f7922f
            mb.b$a r6 = (mb.b.a) r6
            java.lang.Throwable r6 = r6.f11373a
            java.lang.String r0 = "<this>"
            sf.j.f(r5, r0)
            java.lang.String r0 = "throwable"
            sf.j.f(r6, r0)
            mb.a$a r0 = new mb.a$a
            r0.<init>(r6)
            r5.i(r0)
        L_0x0083:
            ff.m r1 = ff.m.f8717a
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g.f(ec.g, jf.d):java.lang.Object");
    }

    public final void g() {
        cb.b.D(gc.b.o(this), (f.b) null, 0, new a(this, (jf.d<? super a>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(jf.d<? super ff.m> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ec.g.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ec.g$c r0 = (ec.g.c) r0
            int r1 = r0.f7938d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7938d = r1
            goto L_0x0018
        L_0x0013:
            ec.g$c r0 = new ec.g$c
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f7936b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f7938d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cb.b.J(r8)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0032:
            ec.g r2 = r0.f7935a
            cb.b.J(r8)
            goto L_0x0049
        L_0x0038:
            cb.b.J(r8)
            r0.f7935a = r7
            r0.f7938d = r4
            rb.c r8 = r7.f7921e
            kotlinx.coroutines.flow.f r8 = r8.d()
            if (r8 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r2 = r7
        L_0x0049:
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.f) r8
            ec.g$d r4 = new ec.g$d
            r5 = 0
            r4.<init>(r2, r5)
            kotlinx.coroutines.flow.o r6 = new kotlinx.coroutines.flow.o
            r6.<init>(r4, r8)
            ec.g$b r8 = new ec.g$b
            r8.<init>(r6)
            ec.g$e r4 = new ec.g$e
            r4.<init>(r2, r5)
            r0.f7935a = r5
            r0.f7938d = r3
            java.lang.Object r8 = cb.d.t(r8, r4, r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            ff.m r8 = ff.m.f8717a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g.h(jf.d):java.lang.Object");
    }
}
