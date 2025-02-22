package t;

import android.os.Trace;
import ff.g;
import ff.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jf.f;
import rf.p;
import s0.s1;
import s6.u;
import sf.j;
import sf.v;
import u.b;
import u.c;

public final class i0 implements m0 {
    public final n2 B;
    public final u C;
    public final HashSet<y1> D;
    public final u E;
    public final ArrayList F;
    public final ArrayList G;
    public final u H;
    public b I;
    public boolean J;
    public i0 K;
    public int L;
    public final i M;
    public final f N;
    public boolean O;
    public p<? super h, ? super Integer, m> P;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f15109a;

    /* renamed from: b  reason: collision with root package name */
    public final c<?> f15110b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<Object> f15111c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15112d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<j2> f15113e;

    public static final class a implements i2 {

        /* renamed from: a  reason: collision with root package name */
        public final Set<j2> f15114a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f15115b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f15116c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f15117d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f15118e;

        public a(HashSet hashSet) {
            j.f(hashSet, "abandoning");
            this.f15114a = hashSet;
        }

        public final void a(rf.a<m> aVar) {
            j.f(aVar, "effect");
            this.f15117d.add(aVar);
        }

        public final void b(f fVar) {
            j.f(fVar, "instance");
            ArrayList arrayList = this.f15118e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f15118e = arrayList;
            }
            arrayList.add(fVar);
        }

        public final void c(j2 j2Var) {
            j.f(j2Var, "instance");
            ArrayList arrayList = this.f15115b;
            int lastIndexOf = arrayList.lastIndexOf(j2Var);
            if (lastIndexOf >= 0) {
                arrayList.remove(lastIndexOf);
                this.f15114a.remove(j2Var);
                return;
            }
            this.f15116c.add(j2Var);
        }

        public final void d(j2 j2Var) {
            j.f(j2Var, "instance");
            ArrayList arrayList = this.f15116c;
            int lastIndexOf = arrayList.lastIndexOf(j2Var);
            if (lastIndexOf >= 0) {
                arrayList.remove(lastIndexOf);
                this.f15114a.remove(j2Var);
                return;
            }
            this.f15115b.add(j2Var);
        }

        public final void e() {
            Set<j2> set = this.f15114a;
            if (!set.isEmpty()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<j2> it = set.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().a();
                    }
                    m mVar = m.f8717a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public final void f() {
            ArrayList arrayList = this.f15118e;
            if (!(arrayList == null || arrayList.isEmpty())) {
                Trace.beginSection("Compose:releases");
                try {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        ((f) arrayList.get(size)).d();
                    }
                    m mVar = m.f8717a;
                    Trace.endSection();
                    arrayList.clear();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }

        public final void g() {
            ArrayList arrayList = this.f15116c;
            boolean z10 = !arrayList.isEmpty();
            Set<j2> set = this.f15114a;
            if (z10) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        j2 j2Var = (j2) arrayList.get(size);
                        if (!set.contains(j2Var)) {
                            j2Var.b();
                        }
                    }
                    m mVar = m.f8717a;
                } finally {
                    Trace.endSection();
                }
            }
            ArrayList arrayList2 = this.f15115b;
            if (!arrayList2.isEmpty()) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    int size2 = arrayList2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        j2 j2Var2 = (j2) arrayList2.get(i8);
                        set.remove(j2Var2);
                        j2Var2.c();
                    }
                    m mVar2 = m.f8717a;
                } finally {
                    Trace.endSection();
                }
            }
        }

        public final void h() {
            ArrayList arrayList = this.f15117d;
            if (!arrayList.isEmpty()) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((rf.a) arrayList.get(i8)).d();
                    }
                    arrayList.clear();
                    m mVar = m.f8717a;
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public i0() {
        throw null;
    }

    public i0(g0 g0Var, s1 s1Var) {
        j.f(g0Var, "parent");
        this.f15109a = g0Var;
        this.f15110b = s1Var;
        this.f15111c = new AtomicReference<>((Object) null);
        this.f15112d = new Object();
        HashSet<j2> hashSet = new HashSet<>();
        this.f15113e = hashSet;
        n2 n2Var = new n2();
        this.B = n2Var;
        this.C = new u();
        this.D = new HashSet<>();
        this.E = new u();
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.G = arrayList2;
        this.H = new u();
        this.I = new b(0);
        this.M = new i(s1Var, g0Var, n2Var, hashSet, arrayList, arrayList2, this);
        this.N = null;
        boolean z10 = g0Var instanceof z1;
        this.P = e.f15016a;
    }

    public static final void d(i0 i0Var, boolean z10, v<HashSet<y1>> vVar, Object obj) {
        int i8;
        u uVar = i0Var.C;
        int d10 = uVar.d(obj);
        if (d10 >= 0) {
            c g10 = uVar.g(d10);
            int i10 = g10.f15634a;
            for (int i11 = 0; i11 < i10; i11++) {
                y1 y1Var = (y1) g10.get(i11);
                if (!i0Var.H.e(obj, y1Var)) {
                    i0 i0Var2 = y1Var.f15284b;
                    boolean z11 = true;
                    if (i0Var2 == null || (i8 = i0Var2.z(y1Var, obj)) == 0) {
                        i8 = 1;
                    }
                    if (i8 != 1) {
                        if (y1Var.f15289g == null) {
                            z11 = false;
                        }
                        if (!z11 || z10) {
                            T t2 = (HashSet) vVar.f14957a;
                            if (t2 == null) {
                                t2 = new HashSet();
                                vVar.f14957a = t2;
                            }
                            t2.add(y1Var);
                        } else {
                            i0Var.D.add(y1Var);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r1 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        return r1.A(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        r5.f15109a.f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if (r5.M.C == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        return 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(t.y1 r6, t.b r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f15112d
            monitor-enter(r0)
            t.i0 r1 = r5.K     // Catch:{ all -> 0x0074 }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            t.n2 r3 = r5.B     // Catch:{ all -> 0x0074 }
            int r4 = r5.L     // Catch:{ all -> 0x0074 }
            boolean r3 = r3.c(r4, r7)     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x005d
            t.i r3 = r5.M     // Catch:{ all -> 0x0074 }
            boolean r4 = r3.C     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0025
            boolean r3 = r3.h0(r6, r8)     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0025
            monitor-exit(r0)
            r6 = 4
            return r6
        L_0x0025:
            if (r8 != 0) goto L_0x002d
            u.b r3 = r5.I     // Catch:{ all -> 0x0074 }
            r3.d(r6, r2)     // Catch:{ all -> 0x0074 }
            goto L_0x005d
        L_0x002d:
            u.b r2 = r5.I     // Catch:{ all -> 0x0074 }
            java.lang.Object r3 = t.j0.f15129a     // Catch:{ all -> 0x0074 }
            r2.getClass()     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = "key"
            sf.j.f(r6, r3)     // Catch:{ all -> 0x0074 }
            int r3 = r2.b(r6)     // Catch:{ all -> 0x0074 }
            if (r3 < 0) goto L_0x0041
            r3 = 1
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 == 0) goto L_0x0050
            java.lang.Object r2 = r2.c(r6)     // Catch:{ all -> 0x0074 }
            u.c r2 = (u.c) r2     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x005d
            r2.add(r8)     // Catch:{ all -> 0x0074 }
            goto L_0x005d
        L_0x0050:
            u.c r3 = new u.c     // Catch:{ all -> 0x0074 }
            r3.<init>()     // Catch:{ all -> 0x0074 }
            r3.add(r8)     // Catch:{ all -> 0x0074 }
            ff.m r4 = ff.m.f8717a     // Catch:{ all -> 0x0074 }
            r2.d(r6, r3)     // Catch:{ all -> 0x0074 }
        L_0x005d:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0065
            int r6 = r1.A(r6, r7, r8)
            return r6
        L_0x0065:
            t.g0 r6 = r5.f15109a
            r6.f(r5)
            t.i r6 = r5.M
            boolean r6 = r6.C
            if (r6 == 0) goto L_0x0072
            r6 = 3
            goto L_0x0073
        L_0x0072:
            r6 = 2
        L_0x0073:
            return r6
        L_0x0074:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i0.A(t.y1, t.b, java.lang.Object):int");
    }

    public final void B(Object obj) {
        int i8;
        u uVar = this.C;
        int d10 = uVar.d(obj);
        if (d10 >= 0) {
            c g10 = uVar.g(d10);
            int i10 = g10.f15634a;
            for (int i11 = 0; i11 < i10; i11++) {
                y1 y1Var = (y1) g10.get(i11);
                i0 i0Var = y1Var.f15284b;
                if (i0Var == null || (i8 = i0Var.z(y1Var, obj)) == 0) {
                    i8 = 1;
                }
                if (i8 == 4) {
                    this.H.a(obj, y1Var);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a() {
        synchronized (this.f15112d) {
            if (!this.O) {
                this.O = true;
                this.P = e.f15017b;
                this.M.getClass();
                boolean z10 = this.B.f15168b > 0;
                if (z10 || (true ^ this.f15113e.isEmpty())) {
                    a aVar = new a(this.f15113e);
                    if (z10) {
                        p2 e10 = this.B.e();
                        try {
                            e0.e(e10, aVar);
                            m mVar = m.f8717a;
                            e10.f();
                            this.f15110b.clear();
                            aVar.g();
                            aVar.f();
                        } catch (Throwable th) {
                            e10.f();
                            throw th;
                        }
                    }
                    aVar.e();
                }
                this.M.A();
            }
            m mVar2 = m.f8717a;
        }
        this.f15109a.j(this);
    }

    public final void b() {
        this.f15111c.set((Object) null);
        this.F.clear();
        this.G.clear();
        this.f15113e.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.util.Set<? extends java.lang.Object> r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            sf.v r2 = new sf.v
            r2.<init>()
            java.util.Iterator r3 = r18.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r3.next()
            boolean r7 = r4 instanceof t.y1
            if (r7 == 0) goto L_0x0027
            t.y1 r4 = (t.y1) r4
            t.i0 r6 = r4.f15284b
            if (r6 == 0) goto L_0x000d
            int r4 = r6.z(r4, r5)
            goto L_0x000d
        L_0x0027:
            d(r0, r1, r2, r4)
            s6.u r5 = r0.E
            int r4 = r5.d(r4)
            if (r4 < 0) goto L_0x000d
            u.c r4 = r5.g(r4)
            int r5 = r4.f15634a
            r6 = 0
        L_0x0039:
            if (r6 >= r5) goto L_0x000d
            java.lang.Object r7 = r4.get(r6)
            t.o0 r7 = (t.o0) r7
            d(r0, r1, r2, r7)
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0047:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            s6.u r4 = r0.C
            if (r1 == 0) goto L_0x00e9
            java.util.HashSet<t.y1> r1 = r0.D
            boolean r7 = r1.isEmpty()
            r8 = 1
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x00e9
            int r7 = r4.f14789a
            r9 = 0
            r10 = 0
        L_0x005b:
            if (r9 >= r7) goto L_0x00ca
            java.lang.Object r11 = r4.f14790b
            int[] r11 = (int[]) r11
            r11 = r11[r9]
            java.lang.Object r12 = r4.f14792d
            u.c[] r12 = (u.c[]) r12
            r12 = r12[r11]
            sf.j.c(r12)
            int r13 = r12.f15634a
            r14 = 0
            r15 = 0
        L_0x0070:
            if (r14 >= r13) goto L_0x00a7
            java.lang.Object[] r6 = r12.f15635b
            r6 = r6[r14]
            sf.j.d(r6, r3)
            r5 = r6
            t.y1 r5 = (t.y1) r5
            boolean r16 = r1.contains(r5)
            if (r16 != 0) goto L_0x0098
            T r8 = r2.f14957a
            java.util.HashSet r8 = (java.util.HashSet) r8
            if (r8 == 0) goto L_0x0091
            boolean r5 = r8.contains(r5)
            r8 = 1
            if (r5 != r8) goto L_0x0092
            r5 = r8
            goto L_0x0093
        L_0x0091:
            r8 = 1
        L_0x0092:
            r5 = 0
        L_0x0093:
            if (r5 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r5 = 0
            goto L_0x0099
        L_0x0098:
            r5 = r8
        L_0x0099:
            if (r5 != 0) goto L_0x00a3
            if (r15 == r14) goto L_0x00a1
            java.lang.Object[] r5 = r12.f15635b
            r5[r15] = r6
        L_0x00a1:
            int r15 = r15 + 1
        L_0x00a3:
            int r14 = r14 + 1
            r5 = 0
            goto L_0x0070
        L_0x00a7:
            int r5 = r12.f15634a
            r6 = r15
        L_0x00aa:
            if (r6 >= r5) goto L_0x00b4
            java.lang.Object[] r13 = r12.f15635b
            r14 = 0
            r13[r6] = r14
            int r6 = r6 + 1
            goto L_0x00aa
        L_0x00b4:
            r12.f15634a = r15
            if (r15 <= 0) goto L_0x00c6
            if (r10 == r9) goto L_0x00c4
            java.lang.Object r5 = r4.f14790b
            int[] r5 = (int[]) r5
            r6 = r5[r10]
            r5[r10] = r11
            r5[r9] = r6
        L_0x00c4:
            int r10 = r10 + 1
        L_0x00c6:
            int r9 = r9 + 1
            r5 = 0
            goto L_0x005b
        L_0x00ca:
            int r2 = r4.f14789a
            r3 = r10
        L_0x00cd:
            if (r3 >= r2) goto L_0x00df
            java.lang.Object r5 = r4.f14791c
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r6 = r4.f14790b
            int[] r6 = (int[]) r6
            r6 = r6[r3]
            r7 = 0
            r5[r6] = r7
            int r3 = r3 + 1
            goto L_0x00cd
        L_0x00df:
            r4.f14789a = r10
            r17.o()
            r1.clear()
            goto L_0x0161
        L_0x00e9:
            T r1 = r2.f14957a
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x0161
            int r2 = r4.f14789a
            r5 = 0
            r6 = 0
        L_0x00f3:
            if (r5 >= r2) goto L_0x0147
            java.lang.Object r7 = r4.f14790b
            int[] r7 = (int[]) r7
            r7 = r7[r5]
            java.lang.Object r8 = r4.f14792d
            u.c[] r8 = (u.c[]) r8
            r8 = r8[r7]
            sf.j.c(r8)
            int r9 = r8.f15634a
            r10 = 0
            r11 = 0
        L_0x0108:
            if (r10 >= r9) goto L_0x0125
            java.lang.Object[] r12 = r8.f15635b
            r12 = r12[r10]
            sf.j.d(r12, r3)
            r13 = r12
            t.y1 r13 = (t.y1) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0122
            if (r11 == r10) goto L_0x0120
            java.lang.Object[] r13 = r8.f15635b
            r13[r11] = r12
        L_0x0120:
            int r11 = r11 + 1
        L_0x0122:
            int r10 = r10 + 1
            goto L_0x0108
        L_0x0125:
            int r9 = r8.f15634a
            r10 = r11
        L_0x0128:
            if (r10 >= r9) goto L_0x0132
            java.lang.Object[] r12 = r8.f15635b
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x0128
        L_0x0132:
            r8.f15634a = r11
            if (r11 <= 0) goto L_0x0144
            if (r6 == r5) goto L_0x0142
            java.lang.Object r8 = r4.f14790b
            int[] r8 = (int[]) r8
            r9 = r8[r6]
            r8[r6] = r7
            r8[r5] = r9
        L_0x0142:
            int r6 = r6 + 1
        L_0x0144:
            int r5 = r5 + 1
            goto L_0x00f3
        L_0x0147:
            int r1 = r4.f14789a
            r2 = r6
        L_0x014a:
            if (r2 >= r1) goto L_0x015c
            java.lang.Object r3 = r4.f14791c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object r5 = r4.f14790b
            int[] r5 = (int[]) r5
            r5 = r5[r2]
            r7 = 0
            r3[r5] = r7
            int r2 = r2 + 1
            goto L_0x014a
        L_0x015c:
            r4.f14789a = r6
            r17.o()
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i0.c(java.util.Set, boolean):void");
    }

    public final boolean e(c cVar) {
        int i8 = 0;
        while (true) {
            if (!(i8 < cVar.f15634a)) {
                return false;
            }
            int i10 = i8 + 1;
            Object obj = cVar.f15635b[i8];
            j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.C.c(obj) || this.E.c(obj)) {
                return true;
            }
            i8 = i10;
        }
        return true;
    }

    public final void f(ArrayList arrayList) {
        i iVar;
        int size = arrayList.size();
        boolean z10 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z10 = true;
                break;
            } else if (!j.a(((i1) ((g) arrayList.get(i8)).f8706a).f15121c, this)) {
                break;
            } else {
                i8++;
            }
        }
        e0.f(z10);
        try {
            iVar = this.M;
            iVar.getClass();
            iVar.K(arrayList);
            iVar.u();
            m mVar = m.f8717a;
        } catch (Throwable th) {
            HashSet<j2> hashSet = this.f15113e;
            try {
                if (!hashSet.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<j2> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().a();
                        }
                        m mVar2 = m.f8717a;
                        Trace.endSection();
                    }
                }
                throw th;
            } catch (Exception e10) {
                b();
                throw e10;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void g(c2 c2Var) {
        i iVar = this.M;
        iVar.getClass();
        if (!iVar.C) {
            iVar.C = true;
            try {
                c2Var.d();
            } finally {
                iVar.C = false;
            }
        } else {
            e0.c("Preparing a composition while composing is not supported".toString());
            throw null;
        }
    }

    public final void h() {
        synchronized (this.f15112d) {
            try {
                if (!this.G.isEmpty()) {
                    l(this.G);
                }
                m mVar = m.f8717a;
            } catch (Exception e10) {
                b();
                throw e10;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void i(Object obj) {
        y1 J2;
        j.f(obj, "value");
        i iVar = this.M;
        boolean z10 = true;
        if (!(iVar.f15089z > 0) && (J2 = iVar.J()) != null) {
            J2.f15283a |= 1;
            this.C.a(obj, J2);
            boolean z11 = obj instanceof o0;
            if (z11) {
                u uVar = this.E;
                uVar.f(obj);
                for (Object obj2 : ((o0) obj).n()) {
                    if (obj2 == null) {
                        break;
                    }
                    uVar.a(obj2, obj);
                }
            }
            if ((J2.f15283a & 32) == 0) {
                z10 = false;
            }
            if (!z10) {
                u.a aVar = J2.f15288f;
                if (aVar == null) {
                    aVar = new u.a();
                    J2.f15288f = aVar;
                }
                aVar.a(J2.f15287e, obj);
                if (z11) {
                    b bVar = J2.f15289g;
                    if (bVar == null) {
                        bVar = new b(0);
                        J2.f15289g = bVar;
                    }
                    bVar.d(obj, ((o0) obj).e());
                }
            }
        }
    }

    public final boolean j() {
        return this.O;
    }

    public final void k(z.a aVar) {
        b bVar;
        try {
            synchronized (this.f15112d) {
                s();
                bVar = this.I;
                this.I = new b(0);
                this.M.v(bVar, aVar);
                m mVar = m.f8717a;
            }
        } catch (Exception e10) {
            this.I = bVar;
            throw e10;
        } catch (Throwable th) {
            try {
                if (!this.f15113e.isEmpty()) {
                    HashSet<j2> hashSet = this.f15113e;
                    j.f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<j2> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().a();
                        }
                        m mVar2 = m.f8717a;
                        Trace.endSection();
                    }
                }
                throw th;
            } catch (Exception e11) {
                b();
                throw e11;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab A[Catch:{ all -> 0x009e, all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00b3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.util.ArrayList r18) {
        /*
            r17 = this;
            r1 = r17
            t.c<?> r0 = r1.f15110b
            java.util.ArrayList r2 = r1.G
            t.i0$a r3 = new t.i0$a
            java.util.HashSet<t.j2> r4 = r1.f15113e
            r3.<init>(r4)
            boolean r4 = r18.isEmpty()     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x001d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001c
            r3.e()
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r4 = "Compose:applyChanges"
            android.os.Trace.beginSection(r4)     // Catch:{ all -> 0x0116 }
            r0.getClass()     // Catch:{ all -> 0x0111 }
            t.n2 r4 = r1.B     // Catch:{ all -> 0x0111 }
            t.p2 r4 = r4.e()     // Catch:{ all -> 0x0111 }
            int r5 = r18.size()     // Catch:{ all -> 0x010c }
            r6 = 0
            r7 = r6
        L_0x0031:
            if (r7 >= r5) goto L_0x0041
            r8 = r18
            java.lang.Object r9 = r8.get(r7)     // Catch:{ all -> 0x010c }
            rf.q r9 = (rf.q) r9     // Catch:{ all -> 0x010c }
            r9.e(r0, r4, r3)     // Catch:{ all -> 0x010c }
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0041:
            r8 = r18
            r18.clear()     // Catch:{ all -> 0x010c }
            ff.m r5 = ff.m.f8717a     // Catch:{ all -> 0x010c }
            r4.f()     // Catch:{ all -> 0x0111 }
            r0.g()     // Catch:{ all -> 0x0111 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0116 }
            r3.g()     // Catch:{ all -> 0x0116 }
            r3.f()     // Catch:{ all -> 0x0116 }
            r3.h()     // Catch:{ all -> 0x0116 }
            boolean r0 = r1.J     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "Compose:unobserve"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0116 }
            r1.J = r6     // Catch:{ all -> 0x009e }
            s6.u r0 = r1.C     // Catch:{ all -> 0x009e }
            int r4 = r0.f14789a     // Catch:{ all -> 0x009e }
            r5 = r6
            r7 = r5
        L_0x006b:
            r8 = 0
            if (r5 >= r4) goto L_0x00df
            java.lang.Object r9 = r0.f14790b     // Catch:{ all -> 0x009e }
            int[] r9 = (int[]) r9     // Catch:{ all -> 0x009e }
            r9 = r9[r5]     // Catch:{ all -> 0x009e }
            java.lang.Object r10 = r0.f14792d     // Catch:{ all -> 0x009e }
            u.c[] r10 = (u.c[]) r10     // Catch:{ all -> 0x009e }
            r10 = r10[r9]     // Catch:{ all -> 0x009e }
            sf.j.c(r10)     // Catch:{ all -> 0x009e }
            int r11 = r10.f15634a     // Catch:{ all -> 0x009e }
            r12 = r6
            r13 = r12
        L_0x0081:
            if (r12 >= r11) goto L_0x00b7
            java.lang.Object[] r14 = r10.f15635b     // Catch:{ all -> 0x009e }
            r14 = r14[r12]     // Catch:{ all -> 0x009e }
            java.lang.String r15 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            sf.j.d(r14, r15)     // Catch:{ all -> 0x009e }
            r15 = r14
            t.y1 r15 = (t.y1) r15     // Catch:{ all -> 0x009e }
            t.i0 r6 = r15.f15284b     // Catch:{ all -> 0x009e }
            r16 = 1
            if (r6 == 0) goto L_0x00a6
            t.b r6 = r15.f15285c     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x00a0
            boolean r6 = r6.a()     // Catch:{ all -> 0x009e }
            goto L_0x00a1
        L_0x009e:
            r0 = move-exception
            goto L_0x00fe
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            if (r6 == 0) goto L_0x00a6
            r6 = r16
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            r6 = r6 ^ 1
            if (r6 != 0) goto L_0x00b3
            if (r13 == r12) goto L_0x00b1
            java.lang.Object[] r6 = r10.f15635b     // Catch:{ all -> 0x009e }
            r6[r13] = r14     // Catch:{ all -> 0x009e }
        L_0x00b1:
            int r13 = r13 + 1
        L_0x00b3:
            int r12 = r12 + 1
            r6 = 0
            goto L_0x0081
        L_0x00b7:
            int r6 = r10.f15634a     // Catch:{ all -> 0x009e }
            r11 = r13
        L_0x00ba:
            if (r11 >= r6) goto L_0x00c3
            java.lang.Object[] r12 = r10.f15635b     // Catch:{ all -> 0x009e }
            r12[r11] = r8     // Catch:{ all -> 0x009e }
            int r11 = r11 + 1
            goto L_0x00ba
        L_0x00c3:
            r10.f15634a = r13     // Catch:{ all -> 0x009e }
            if (r13 <= 0) goto L_0x00db
            if (r7 == r5) goto L_0x00d9
            java.lang.Object r6 = r0.f14790b     // Catch:{ all -> 0x009e }
            r8 = r6
            int[] r8 = (int[]) r8     // Catch:{ all -> 0x009e }
            r8 = r8[r7]     // Catch:{ all -> 0x009e }
            r10 = r6
            int[] r10 = (int[]) r10     // Catch:{ all -> 0x009e }
            r10[r7] = r9     // Catch:{ all -> 0x009e }
            int[] r6 = (int[]) r6     // Catch:{ all -> 0x009e }
            r6[r5] = r8     // Catch:{ all -> 0x009e }
        L_0x00d9:
            int r7 = r7 + 1
        L_0x00db:
            int r5 = r5 + 1
            r6 = 0
            goto L_0x006b
        L_0x00df:
            int r4 = r0.f14789a     // Catch:{ all -> 0x009e }
            r5 = r7
        L_0x00e2:
            if (r5 >= r4) goto L_0x00f3
            java.lang.Object r6 = r0.f14791c     // Catch:{ all -> 0x009e }
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch:{ all -> 0x009e }
            java.lang.Object r9 = r0.f14790b     // Catch:{ all -> 0x009e }
            int[] r9 = (int[]) r9     // Catch:{ all -> 0x009e }
            r9 = r9[r5]     // Catch:{ all -> 0x009e }
            r6[r9] = r8     // Catch:{ all -> 0x009e }
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x00f3:
            r0.f14789a = r7     // Catch:{ all -> 0x009e }
            r17.o()     // Catch:{ all -> 0x009e }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x009e }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0116 }
            goto L_0x0102
        L_0x00fe:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0102:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x010b
            r3.e()
        L_0x010b:
            return
        L_0x010c:
            r0 = move-exception
            r4.f()     // Catch:{ all -> 0x0111 }
            throw r0     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0120
            r3.e()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i0.l(java.util.ArrayList):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.util.Set<? extends java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "values"
            sf.j.f(r7, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r6.f15111c
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0016
        L_0x0010:
            java.lang.Object r2 = t.j0.f15129a
            boolean r2 = sf.j.a(r0, r2)
        L_0x0016:
            r3 = 0
            if (r2 == 0) goto L_0x001b
            r2 = r7
            goto L_0x003f
        L_0x001b:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002a
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r7
            goto L_0x003f
        L_0x002a:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L_0x0061
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            sf.j.d(r0, r2)
            r2 = r0
            java.util.Set[] r2 = (java.util.Set[]) r2
            int r4 = r2.length
            int r5 = r4 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            r2[r4] = r7
        L_0x003f:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f15111c
        L_0x0041:
            boolean r5 = r4.compareAndSet(r0, r2)
            if (r5 == 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            java.lang.Object r5 = r4.get()
            if (r5 == r0) goto L_0x0041
            r1 = r3
        L_0x004f:
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x0060
            java.lang.Object r7 = r6.f15112d
            monitor-enter(r7)
            r6.y()     // Catch:{ all -> 0x005d }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x005d }
            monitor-exit(r7)
            goto L_0x0060
        L_0x005d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0060:
            return
        L_0x0061:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f15111c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i0.m(java.util.Set):void");
    }

    /* JADX INFO: finally extract failed */
    public final void n(h1 h1Var) {
        a aVar = new a(this.f15113e);
        p2 e10 = h1Var.f15063a.e();
        try {
            e0.e(e10, aVar);
            m mVar = m.f8717a;
            e10.f();
            aVar.g();
            aVar.f();
        } catch (Throwable th) {
            e10.f();
            throw th;
        }
    }

    public final void o() {
        u uVar = this.E;
        int i8 = uVar.f14789a;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = ((int[]) uVar.f14790b)[i11];
            c cVar = ((c[]) uVar.f14792d)[i12];
            j.c(cVar);
            int i13 = cVar.f15634a;
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                Object obj = cVar.f15635b[i15];
                j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.C.c((o0) obj))) {
                    if (i14 != i15) {
                        cVar.f15635b[i14] = obj;
                    }
                    i14++;
                }
            }
            int i16 = cVar.f15634a;
            for (int i17 = i14; i17 < i16; i17++) {
                cVar.f15635b[i17] = null;
            }
            cVar.f15634a = i14;
            if (i14 > 0) {
                if (i10 != i11) {
                    int[] iArr = (int[]) uVar.f14790b;
                    int i18 = iArr[i10];
                    iArr[i10] = i12;
                    iArr[i11] = i18;
                }
                i10++;
            }
        }
        int i19 = uVar.f14789a;
        for (int i20 = i10; i20 < i19; i20++) {
            ((Object[]) uVar.f14791c)[((int[]) uVar.f14790b)[i20]] = null;
        }
        uVar.f14789a = i10;
        Iterator<y1> it = this.D.iterator();
        j.e(it, "iterator()");
        while (it.hasNext()) {
            if (!(it.next().f15289g != null)) {
                it.remove();
            }
        }
    }

    public final void p() {
        synchronized (this.f15112d) {
            try {
                l(this.F);
                y();
                m mVar = m.f8717a;
            } catch (Exception e10) {
                b();
                throw e10;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final boolean q() {
        return this.M.C;
    }

    public final void r(Object obj) {
        j.f(obj, "value");
        synchronized (this.f15112d) {
            B(obj);
            u uVar = this.E;
            int d10 = uVar.d(obj);
            if (d10 >= 0) {
                c g10 = uVar.g(d10);
                int i8 = g10.f15634a;
                for (int i10 = 0; i10 < i8; i10++) {
                    B((o0) g10.get(i10));
                }
            }
            m mVar = m.f8717a;
        }
    }

    public final void s() {
        AtomicReference<Object> atomicReference = this.f15111c;
        Object obj = j0.f15129a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet == null) {
            return;
        }
        if (j.a(andSet, obj)) {
            e0.c("pending composition has not been applied");
            throw null;
        } else if (andSet instanceof Set) {
            c((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set c3 : (Set[]) andSet) {
                c(c3, true);
            }
        } else {
            e0.c("corrupt pendingModifications drain: " + atomicReference);
            throw null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void t() {
        synchronized (this.f15112d) {
            try {
                this.M.f15084u.b();
                if (!this.f15113e.isEmpty()) {
                    HashSet<j2> hashSet = this.f15113e;
                    j.f(hashSet, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator<j2> it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            it.next().a();
                        }
                        m mVar = m.f8717a;
                        Trace.endSection();
                    }
                }
                m mVar2 = m.f8717a;
            } catch (Throwable th) {
                try {
                    if (!this.f15113e.isEmpty()) {
                        HashSet<j2> hashSet2 = this.f15113e;
                        j.f(hashSet2, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet2.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            Iterator<j2> it2 = hashSet2.iterator();
                            while (it2.hasNext()) {
                                it2.remove();
                                it2.next().a();
                            }
                            m mVar3 = m.f8717a;
                            Trace.endSection();
                        }
                    }
                    throw th;
                } catch (Exception e10) {
                    b();
                    throw e10;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
    }

    public final <R> R u(m0 m0Var, int i8, rf.a<? extends R> aVar) {
        if (m0Var == null || j.a(m0Var, this) || i8 < 0) {
            return aVar.d();
        }
        this.K = (i0) m0Var;
        this.L = i8;
        try {
            return aVar.d();
        } finally {
            this.K = null;
            this.L = 0;
        }
    }

    public final boolean v() {
        b bVar;
        boolean R;
        synchronized (this.f15112d) {
            s();
            try {
                bVar = this.I;
                this.I = new b(0);
                R = this.M.R(bVar);
                if (!R) {
                    y();
                }
            } catch (Exception e10) {
                this.I = bVar;
                throw e10;
            } catch (Throwable th) {
                try {
                    if (!this.f15113e.isEmpty()) {
                        HashSet<j2> hashSet = this.f15113e;
                        j.f(hashSet, "abandoning");
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            Iterator<j2> it = hashSet.iterator();
                            while (it.hasNext()) {
                                it.remove();
                                it.next().a();
                            }
                            m mVar = m.f8717a;
                            Trace.endSection();
                        }
                    }
                    throw th;
                } catch (Exception e11) {
                    b();
                    throw e11;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        return R;
    }

    public final void w() {
        synchronized (this.f15112d) {
            for (Object obj : this.B.f15169c) {
                y1 y1Var = obj instanceof y1 ? (y1) obj : null;
                if (y1Var != null) {
                    y1Var.invalidate();
                }
            }
            m mVar = m.f8717a;
        }
    }

    public final void x(p<? super h, ? super Integer, m> pVar) {
        if (!this.O) {
            this.P = pVar;
            this.f15109a.a(this, (z.a) pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    public final void y() {
        AtomicReference<Object> atomicReference = this.f15111c;
        Object andSet = atomicReference.getAndSet((Object) null);
        if (j.a(andSet, j0.f15129a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set c3 : (Set[]) andSet) {
                c(c3, false);
            }
        } else if (andSet == null) {
            e0.c("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        } else {
            e0.c("corrupt pendingModifications drain: " + atomicReference);
            throw null;
        }
    }

    public final int z(y1 y1Var, Object obj) {
        j.f(y1Var, "scope");
        int i8 = y1Var.f15283a;
        boolean z10 = false;
        if ((i8 & 2) != 0) {
            y1Var.f15283a = i8 | 4;
        }
        b bVar = y1Var.f15285c;
        if (bVar == null || !this.B.g(bVar) || !bVar.a() || !bVar.a()) {
            return 1;
        }
        if (y1Var.f15286d != null) {
            z10 = true;
        }
        if (!z10) {
            return 1;
        }
        return A(y1Var, bVar, obj);
    }
}
