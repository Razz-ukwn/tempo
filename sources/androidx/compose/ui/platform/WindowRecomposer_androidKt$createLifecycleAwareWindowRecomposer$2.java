package androidx.compose.ui.platform;

import ab.r;
import ag.g0;
import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import ff.m;
import java.util.List;
import jf.d;
import jf.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.x0;
import lf.e;
import lf.i;
import rf.p;
import sf.v;
import t.b1;
import t.o1;
import t.z1;

public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f1226a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o1 f1227b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z1 f1228c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v<x1> f1229d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f1230e;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1231a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.j$a[] r0 = androidx.lifecycle.j.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f1231a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.a.<clinit>():void");
        }
    }

    @e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {392}, m = "invokeSuspend")
    public static final class b extends i implements p<g0, d<? super m>, Object> {
        public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 B;
        public final /* synthetic */ View C;

        /* renamed from: a  reason: collision with root package name */
        public int f1232a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f1233b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ v<x1> f1234c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ z1 f1235d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.p f1236e;

        @e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {387}, m = "invokeSuspend")
        public static final class a extends i implements p<g0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f1237a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ x0<Float> f1238b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ x1 f1239c;

            /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a  reason: collision with other inner class name */
            public static final class C0014a implements g<Float> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ x1 f1240a;

                public C0014a(x1 x1Var) {
                    this.f1240a = x1Var;
                }

                public final Object m(Object obj, d dVar) {
                    this.f1240a.f1508a.setValue(Float.valueOf(((Number) obj).floatValue()));
                    return m.f8717a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(x0<Float> x0Var, x1 x1Var, d<? super a> dVar) {
                super(2, dVar);
                this.f1238b = x0Var;
                this.f1239c = x1Var;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new a(this.f1238b, this.f1239c, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
                return kf.a.f10464a;
            }

            public final Object invokeSuspend(Object obj) {
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f1237a;
                if (i8 == 0) {
                    cb.b.J(obj);
                    C0014a aVar2 = new C0014a(this.f1239c);
                    this.f1237a = 1;
                    if (this.f1238b.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    cb.b.J(obj);
                }
                throw new r();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(v<x1> vVar, z1 z1Var, androidx.lifecycle.p pVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, d<? super b> dVar) {
            super(2, dVar);
            this.f1234c = vVar;
            this.f1235d = z1Var;
            this.f1236e = pVar;
            this.B = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
            this.C = view;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f1234c, this.f1235d, this.f1236e, this.B, this.C, dVar);
            bVar.f1233b = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kf.a r0 = kf.a.f10464a
                int r1 = r10.f1232a
                androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r2 = r10.B
                androidx.lifecycle.p r3 = r10.f1236e
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0022
                if (r1 != r4) goto L_0x001a
                java.lang.Object r0 = r10.f1233b
                ag.n1 r0 = (ag.n1) r0
                cb.b.J(r11)     // Catch:{ all -> 0x0017 }
                goto L_0x0093
            L_0x0017:
                r11 = move-exception
                goto L_0x00a9
            L_0x001a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0022:
                cb.b.J(r11)
                java.lang.Object r11 = r10.f1233b
                ag.g0 r11 = (ag.g0) r11
                sf.v<androidx.compose.ui.platform.x1> r1 = r10.f1234c     // Catch:{ all -> 0x00a7 }
                T r1 = r1.f14957a     // Catch:{ all -> 0x00a7 }
                androidx.compose.ui.platform.x1 r1 = (androidx.compose.ui.platform.x1) r1     // Catch:{ all -> 0x00a7 }
                if (r1 == 0) goto L_0x0063
                android.view.View r6 = r10.C     // Catch:{ all -> 0x00a7 }
                android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x00a7 }
                android.content.Context r6 = r6.getApplicationContext()     // Catch:{ all -> 0x00a7 }
                java.lang.String r7 = "context.applicationContext"
                sf.j.e(r6, r7)     // Catch:{ all -> 0x00a7 }
                kotlinx.coroutines.flow.x0 r6 = androidx.compose.ui.platform.t3.a(r6)     // Catch:{ all -> 0x00a7 }
                java.lang.Object r7 = r6.getValue()     // Catch:{ all -> 0x00a7 }
                java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ all -> 0x00a7 }
                float r7 = r7.floatValue()     // Catch:{ all -> 0x00a7 }
                t.n1 r8 = r1.f1508a     // Catch:{ all -> 0x00a7 }
                java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x00a7 }
                r8.setValue(r7)     // Catch:{ all -> 0x00a7 }
                androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch:{ all -> 0x00a7 }
                r7.<init>(r6, r1, r5)     // Catch:{ all -> 0x00a7 }
                r1 = 0
                r6 = 3
                ag.f2 r11 = cb.b.D(r11, r5, r1, r7, r6)     // Catch:{ all -> 0x00a7 }
                goto L_0x0064
            L_0x0063:
                r11 = r5
            L_0x0064:
                t.z1 r1 = r10.f1235d     // Catch:{ all -> 0x00a2 }
                r10.f1233b = r11     // Catch:{ all -> 0x00a2 }
                r10.f1232a = r4     // Catch:{ all -> 0x00a2 }
                r1.getClass()     // Catch:{ all -> 0x00a2 }
                t.f2 r4 = new t.f2     // Catch:{ all -> 0x00a2 }
                r4.<init>(r1, r5)     // Catch:{ all -> 0x00a2 }
                jf.f r6 = r10.getContext()     // Catch:{ all -> 0x00a2 }
                t.e1 r6 = t.f1.a(r6)     // Catch:{ all -> 0x00a2 }
                t.e2 r7 = new t.e2     // Catch:{ all -> 0x00a2 }
                r7.<init>(r1, r4, r6, r5)     // Catch:{ all -> 0x00a2 }
                t.d r1 = r1.f15297a     // Catch:{ all -> 0x00a2 }
                java.lang.Object r1 = cb.b.M(r1, r7, r10)     // Catch:{ all -> 0x00a2 }
                if (r1 != r0) goto L_0x0088
                goto L_0x008a
            L_0x0088:
                ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x00a2 }
            L_0x008a:
                if (r1 != r0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x00a2 }
            L_0x008f:
                if (r1 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r0 = r11
            L_0x0093:
                if (r0 == 0) goto L_0x0098
                r0.e(r5)
            L_0x0098:
                androidx.lifecycle.j r11 = r3.b()
                r11.c(r2)
                ff.m r11 = ff.m.f8717a
                return r11
            L_0x00a2:
                r0 = move-exception
                r9 = r0
                r0 = r11
                r11 = r9
                goto L_0x00a9
            L_0x00a7:
                r11 = move-exception
                r0 = r5
            L_0x00a9:
                if (r0 == 0) goto L_0x00ae
                r0.e(r5)
            L_0x00ae:
                androidx.lifecycle.j r0 = r3.b()
                r0.c(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(kotlinx.coroutines.internal.e eVar, o1 o1Var, z1 z1Var, v vVar, View view) {
        this.f1226a = eVar;
        this.f1227b = o1Var;
        this.f1228c = z1Var;
        this.f1229d = vVar;
        this.f1230e = view;
    }

    public final void d(androidx.lifecycle.p pVar, j.a aVar) {
        boolean z10;
        int i8 = a.f1231a[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                o1 o1Var = this.f1227b;
                if (o1Var != null) {
                    b1 b1Var = o1Var.f15173b;
                    synchronized (b1Var.f14992a) {
                        synchronized (b1Var.f14992a) {
                            z10 = b1Var.f14995d;
                        }
                        if (!z10) {
                            List<d<m>> list = b1Var.f14993b;
                            b1Var.f14993b = b1Var.f14994c;
                            b1Var.f14994c = list;
                            b1Var.f14995d = true;
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                list.get(i10).resumeWith(m.f8717a);
                            }
                            list.clear();
                            m mVar = m.f8717a;
                        }
                    }
                }
            } else if (i8 == 3) {
                o1 o1Var2 = this.f1227b;
                if (o1Var2 != null) {
                    b1 b1Var2 = o1Var2.f15173b;
                    synchronized (b1Var2.f14992a) {
                        b1Var2.f14995d = false;
                        m mVar2 = m.f8717a;
                    }
                }
            } else if (i8 == 4) {
                this.f1228c.n();
            }
        } else {
            cb.b.D(this.f1226a, (f.b) null, 4, new b(this.f1229d, this.f1228c, pVar, this, this.f1230e, (d<? super b>) null), 1);
        }
    }
}
