package b0;

import androidx.compose.ui.platform.AndroidComposeView;
import ff.m;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import rf.l;
import s0.d1;
import s6.u;
import sf.j;
import sf.k;
import t.b3;
import t.o0;
import t.s2;
import t.y2;
import u.c;
import u.d;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final l<rf.a<m>, m> f2964a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<Object> f2965b = new AtomicReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public boolean f2966c;

    /* renamed from: d  reason: collision with root package name */
    public final x f2967d = new x(this);

    /* renamed from: e  reason: collision with root package name */
    public final z f2968e = new z(this);

    /* renamed from: f  reason: collision with root package name */
    public final d<a> f2969f = new d<>(new a[16]);

    /* renamed from: g  reason: collision with root package name */
    public g f2970g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2971h;

    /* renamed from: i  reason: collision with root package name */
    public a f2972i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final l<Object, m> f2973a;

        /* renamed from: b  reason: collision with root package name */
        public Object f2974b;

        /* renamed from: c  reason: collision with root package name */
        public u.a f2975c;

        /* renamed from: d  reason: collision with root package name */
        public int f2976d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final u f2977e = new u();

        /* renamed from: f  reason: collision with root package name */
        public final u.b f2978f = new u.b(0);

        /* renamed from: g  reason: collision with root package name */
        public final c<Object> f2979g = new c<>();

        /* renamed from: h  reason: collision with root package name */
        public final C0033a f2980h = new C0033a(this);

        /* renamed from: i  reason: collision with root package name */
        public final b f2981i = new b(this);

        /* renamed from: j  reason: collision with root package name */
        public int f2982j;

        /* renamed from: k  reason: collision with root package name */
        public final u f2983k = new u();

        /* renamed from: l  reason: collision with root package name */
        public final HashMap<o0<?>, Object> f2984l = new HashMap<>();

        /* renamed from: b0.w$a$a  reason: collision with other inner class name */
        public static final class C0033a extends k implements l<y2<?>, m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f2985a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0033a(a aVar) {
                super(1);
                this.f2985a = aVar;
            }

            public final Object invoke(Object obj) {
                j.f((y2) obj, "it");
                this.f2985a.f2982j++;
                return m.f8717a;
            }
        }

        public static final class b extends k implements l<y2<?>, m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f2986a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(a aVar) {
                super(1);
                this.f2986a = aVar;
            }

            public final Object invoke(Object obj) {
                j.f((y2) obj, "it");
                a aVar = this.f2986a;
                aVar.f2982j--;
                return m.f8717a;
            }
        }

        public a(l<Object, m> lVar) {
            j.f(lVar, "onChanged");
            this.f2973a = lVar;
        }

        public static final void a(a aVar, Object obj) {
            u.a aVar2 = aVar.f2975c;
            if (aVar2 != null) {
                int i8 = aVar2.f15628a;
                int i10 = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    Object obj2 = aVar2.f15629b[i11];
                    j.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i12 = aVar2.f15630c[i11];
                    boolean z10 = i12 != aVar.f2976d;
                    if (z10) {
                        u uVar = aVar.f2977e;
                        uVar.e(obj2, obj);
                        if ((obj2 instanceof o0) && !uVar.c(obj2)) {
                            aVar.f2983k.f(obj2);
                            aVar.f2984l.remove(obj2);
                        }
                    }
                    if (!z10) {
                        if (i10 != i11) {
                            aVar2.f15629b[i10] = obj2;
                            aVar2.f15630c[i10] = i12;
                        }
                        i10++;
                    }
                }
                int i13 = aVar2.f15628a;
                for (int i14 = i10; i14 < i13; i14++) {
                    aVar2.f15629b[i14] = null;
                }
                aVar2.f15628a = i10;
            }
        }

        public final boolean b(Set<? extends Object> set) {
            int d10;
            int d11;
            boolean z10 = false;
            for (Object next : set) {
                u uVar = this.f2983k;
                boolean c3 = uVar.c(next);
                c<Object> cVar = this.f2979g;
                u uVar2 = this.f2977e;
                if (c3 && (d10 = uVar.d(next)) >= 0) {
                    c g10 = uVar.g(d10);
                    int i8 = g10.f15634a;
                    for (int i10 = 0; i10 < i8; i10++) {
                        o0 o0Var = (o0) g10.get(i10);
                        Object obj = this.f2984l.get(o0Var);
                        s2 a10 = o0Var.a();
                        if (a10 == null) {
                            a10 = b3.f14997a;
                        }
                        if (!a10.a(o0Var.e(), obj) && (d11 = uVar2.d(o0Var)) >= 0) {
                            c g11 = uVar2.g(d11);
                            int i11 = g11.f15634a;
                            int i12 = 0;
                            while (i12 < i11) {
                                cVar.add(g11.get(i12));
                                i12++;
                                z10 = true;
                            }
                        }
                    }
                }
                int d12 = uVar2.d(next);
                if (d12 >= 0) {
                    c g12 = uVar2.g(d12);
                    int i13 = g12.f15634a;
                    int i14 = 0;
                    while (i14 < i13) {
                        cVar.add(g12.get(i14));
                        i14++;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public final void c(Object obj) {
            j.f(obj, "value");
            if (this.f2982j <= 0) {
                Object obj2 = this.f2974b;
                j.c(obj2);
                u.a aVar = this.f2975c;
                if (aVar == null) {
                    aVar = new u.a();
                    this.f2975c = aVar;
                    this.f2978f.d(obj2, aVar);
                }
                int a10 = aVar.a(this.f2976d, obj);
                if ((obj instanceof o0) && a10 != this.f2976d) {
                    o0 o0Var = (o0) obj;
                    for (Object obj3 : o0Var.n()) {
                        if (obj3 == null) {
                            break;
                        }
                        this.f2983k.a(obj3, obj);
                    }
                    this.f2984l.put(obj, o0Var.e());
                }
                if (a10 == -1) {
                    this.f2977e.a(obj, obj2);
                }
            }
        }

        public final void d(d1 d1Var) {
            u.b bVar = this.f2978f;
            int i8 = bVar.f15631a;
            int i10 = 0;
            for (int i11 = 0; i11 < i8; i11++) {
                Object obj = bVar.f15632b[i11];
                j.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                u.a aVar = (u.a) ((Object[]) bVar.f15633c)[i11];
                Boolean bool = (Boolean) d1Var.invoke(obj);
                if (bool.booleanValue()) {
                    int i12 = aVar.f15628a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        Object obj2 = aVar.f15629b[i13];
                        j.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i14 = aVar.f15630c[i13];
                        u uVar = this.f2977e;
                        uVar.e(obj2, obj);
                        if ((obj2 instanceof o0) && !uVar.c(obj2)) {
                            this.f2983k.f(obj2);
                            this.f2984l.remove(obj2);
                        }
                    }
                }
                if (!bool.booleanValue()) {
                    if (i10 != i11) {
                        bVar.f15632b[i10] = obj;
                        Object[] objArr = (Object[]) bVar.f15633c;
                        objArr[i10] = objArr[i11];
                    }
                    i10++;
                }
            }
            int i15 = bVar.f15631a;
            if (i15 > i10) {
                for (int i16 = i10; i16 < i15; i16++) {
                    bVar.f15632b[i16] = null;
                    ((Object[]) bVar.f15633c)[i16] = null;
                }
                bVar.f15631a = i10;
            }
        }
    }

    public w(AndroidComposeView.m mVar) {
        this.f2964a = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.Set} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(b0.w r10) {
        /*
            u.d<b0.w$a> r0 = r10.f2969f
            monitor-enter(r0)
            boolean r1 = r10.f2966c     // Catch:{ all -> 0x008b }
            monitor-exit(r0)
            r0 = 0
            if (r1 == 0) goto L_0x000a
            goto L_0x005d
        L_0x000a:
            r1 = r0
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r10.f2965b
            java.lang.Object r3 = r2.get()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0016
            goto L_0x005a
        L_0x0016:
            boolean r6 = r3 instanceof java.util.Set
            if (r6 == 0) goto L_0x0020
            r6 = r3
            java.util.Set r6 = (java.util.Set) r6
            r7 = r6
        L_0x001e:
            r6 = r4
            goto L_0x0048
        L_0x0020:
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto L_0x0085
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r6.get(r0)
            java.util.Set r7 = (java.util.Set) r7
            int r8 = r6.size()
            r9 = 2
            if (r8 != r9) goto L_0x0039
            java.lang.Object r4 = r6.get(r5)
            goto L_0x001e
        L_0x0039:
            int r8 = r6.size()
            if (r8 <= r9) goto L_0x001e
            int r4 = r6.size()
            java.util.List r4 = r6.subList(r5, r4)
            goto L_0x001e
        L_0x0048:
            boolean r4 = r2.compareAndSet(r3, r6)
            if (r4 == 0) goto L_0x0050
            r2 = r5
            goto L_0x0057
        L_0x0050:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x0048
            r2 = r0
        L_0x0057:
            if (r2 == 0) goto L_0x000b
            r4 = r7
        L_0x005a:
            if (r4 != 0) goto L_0x005e
            r0 = r1
        L_0x005d:
            return r0
        L_0x005e:
            u.d<b0.w$a> r2 = r10.f2969f
            monitor-enter(r2)
            u.d<b0.w$a> r3 = r10.f2969f     // Catch:{ all -> 0x0082 }
            int r6 = r3.f15640c     // Catch:{ all -> 0x0082 }
            if (r6 <= 0) goto L_0x007e
            T[] r3 = r3.f15638a     // Catch:{ all -> 0x0082 }
            r7 = r0
        L_0x006a:
            r8 = r3[r7]     // Catch:{ all -> 0x0082 }
            b0.w$a r8 = (b0.w.a) r8     // Catch:{ all -> 0x0082 }
            boolean r8 = r8.b(r4)     // Catch:{ all -> 0x0082 }
            if (r8 != 0) goto L_0x0079
            if (r1 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r1 = r0
            goto L_0x007a
        L_0x0079:
            r1 = r5
        L_0x007a:
            int r7 = r7 + 1
            if (r7 < r6) goto L_0x006a
        L_0x007e:
            ff.m r3 = ff.m.f8717a     // Catch:{ all -> 0x0082 }
            monitor-exit(r2)
            goto L_0x000b
        L_0x0082:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0085:
            java.lang.String r10 = "Unexpected notification"
            t.e0.c(r10)
            throw r4
        L_0x008b:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.w.a(b0.w):boolean");
    }
}
