package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d1;
import androidx.fragment.app.y;
import d2.i0;
import d2.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.a;
import y1.e;

public final class m extends d1 {

    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2027c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2028d = false;

        /* renamed from: e  reason: collision with root package name */
        public y.a f2029e;

        public a(d1.b bVar, e eVar, boolean z10) {
            super(bVar, eVar);
            this.f2027c = z10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.fragment.app.y.a c(android.content.Context r10) {
            /*
                r9 = this;
                boolean r0 = r9.f2028d
                if (r0 == 0) goto L_0x0007
                androidx.fragment.app.y$a r10 = r9.f2029e
                return r10
            L_0x0007:
                androidx.fragment.app.d1$b r0 = r9.f2030a
                androidx.fragment.app.p r1 = r0.f1934c
                int r0 = r0.f1932a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r0 != r3) goto L_0x0014
                r0 = r4
                goto L_0x0015
            L_0x0014:
                r0 = r2
            L_0x0015:
                androidx.fragment.app.p$c r3 = r1.f2070g0
                if (r3 != 0) goto L_0x001b
                r5 = r2
                goto L_0x001d
            L_0x001b:
                int r5 = r3.f2091f
            L_0x001d:
                boolean r6 = r9.f2027c
                if (r6 == 0) goto L_0x0030
                if (r0 == 0) goto L_0x002a
                if (r3 != 0) goto L_0x0027
            L_0x0025:
                r3 = r2
                goto L_0x003d
            L_0x0027:
                int r3 = r3.f2089d
                goto L_0x003d
            L_0x002a:
                if (r3 != 0) goto L_0x002d
                goto L_0x0025
            L_0x002d:
                int r3 = r3.f2090e
                goto L_0x003d
            L_0x0030:
                if (r0 == 0) goto L_0x0038
                if (r3 != 0) goto L_0x0035
                goto L_0x0025
            L_0x0035:
                int r3 = r3.f2087b
                goto L_0x003d
            L_0x0038:
                if (r3 != 0) goto L_0x003b
                goto L_0x0025
            L_0x003b:
                int r3 = r3.f2088c
            L_0x003d:
                r1.g0(r2, r2, r2, r2)
                android.view.ViewGroup r6 = r1.f2064c0
                r7 = 0
                if (r6 == 0) goto L_0x0053
                r8 = 2131297461(0x7f0904b5, float:1.8212868E38)
                java.lang.Object r6 = r6.getTag(r8)
                if (r6 == 0) goto L_0x0053
                android.view.ViewGroup r6 = r1.f2064c0
                r6.setTag(r8, r7)
            L_0x0053:
                android.view.ViewGroup r1 = r1.f2064c0
                if (r1 == 0) goto L_0x005f
                android.animation.LayoutTransition r1 = r1.getLayoutTransition()
                if (r1 == 0) goto L_0x005f
                goto L_0x00fd
            L_0x005f:
                if (r3 != 0) goto L_0x00bb
                if (r5 == 0) goto L_0x00bb
                r1 = 4097(0x1001, float:5.741E-42)
                if (r5 == r1) goto L_0x00b1
                r1 = 8194(0x2002, float:1.1482E-41)
                if (r5 == r1) goto L_0x00a7
                r1 = 8197(0x2005, float:1.1486E-41)
                if (r5 == r1) goto L_0x0095
                r1 = 4099(0x1003, float:5.744E-42)
                if (r5 == r1) goto L_0x008b
                r1 = 4100(0x1004, float:5.745E-42)
                if (r5 == r1) goto L_0x0079
                r0 = -1
                goto L_0x00ba
            L_0x0079:
                if (r0 == 0) goto L_0x0083
                r0 = 16842936(0x10100b8, float:2.3694074E-38)
                int r0 = androidx.fragment.app.y.a(r10, r0)
                goto L_0x00ba
            L_0x0083:
                r0 = 16842937(0x10100b9, float:2.3694076E-38)
                int r0 = androidx.fragment.app.y.a(r10, r0)
                goto L_0x00ba
            L_0x008b:
                if (r0 == 0) goto L_0x0091
                r0 = 2130837511(0x7f020007, float:1.7279978E38)
                goto L_0x00ba
            L_0x0091:
                r0 = 2130837512(0x7f020008, float:1.727998E38)
                goto L_0x00ba
            L_0x0095:
                if (r0 == 0) goto L_0x009f
                r0 = 16842938(0x10100ba, float:2.369408E-38)
                int r0 = androidx.fragment.app.y.a(r10, r0)
                goto L_0x00ba
            L_0x009f:
                r0 = 16842939(0x10100bb, float:2.3694082E-38)
                int r0 = androidx.fragment.app.y.a(r10, r0)
                goto L_0x00ba
            L_0x00a7:
                if (r0 == 0) goto L_0x00ad
                r0 = 2130837509(0x7f020005, float:1.7279974E38)
                goto L_0x00ba
            L_0x00ad:
                r0 = 2130837510(0x7f020006, float:1.7279976E38)
                goto L_0x00ba
            L_0x00b1:
                if (r0 == 0) goto L_0x00b7
                r0 = 2130837513(0x7f020009, float:1.7279982E38)
                goto L_0x00ba
            L_0x00b7:
                r0 = 2130837514(0x7f02000a, float:1.7279984E38)
            L_0x00ba:
                r3 = r0
            L_0x00bb:
                if (r3 == 0) goto L_0x00fd
                android.content.res.Resources r0 = r10.getResources()
                java.lang.String r0 = r0.getResourceTypeName(r3)
                java.lang.String r1 = "anim"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00de
                android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r10, r3)     // Catch:{ NotFoundException -> 0x00dc, RuntimeException -> 0x00de }
                if (r1 == 0) goto L_0x00da
                androidx.fragment.app.y$a r5 = new androidx.fragment.app.y$a     // Catch:{ NotFoundException -> 0x00dc, RuntimeException -> 0x00de }
                r5.<init>((android.view.animation.Animation) r1)     // Catch:{ NotFoundException -> 0x00dc, RuntimeException -> 0x00de }
                r7 = r5
                goto L_0x00fd
            L_0x00da:
                r2 = r4
                goto L_0x00de
            L_0x00dc:
                r10 = move-exception
                throw r10
            L_0x00de:
                if (r2 != 0) goto L_0x00fd
                android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r10, r3)     // Catch:{ RuntimeException -> 0x00ed }
                if (r1 == 0) goto L_0x00fd
                androidx.fragment.app.y$a r2 = new androidx.fragment.app.y$a     // Catch:{ RuntimeException -> 0x00ed }
                r2.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00ed }
                r7 = r2
                goto L_0x00fd
            L_0x00ed:
                r1 = move-exception
                if (r0 != 0) goto L_0x00fc
                android.view.animation.Animation r10 = android.view.animation.AnimationUtils.loadAnimation(r10, r3)
                if (r10 == 0) goto L_0x00fd
                androidx.fragment.app.y$a r7 = new androidx.fragment.app.y$a
                r7.<init>((android.view.animation.Animation) r10)
                goto L_0x00fd
            L_0x00fc:
                throw r1
            L_0x00fd:
                r9.f2029e = r7
                r9.f2028d = r4
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.a.c(android.content.Context):androidx.fragment.app.y$a");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d1.b f2030a;

        /* renamed from: b  reason: collision with root package name */
        public final e f2031b;

        public b(d1.b bVar, e eVar) {
            this.f2030a = bVar;
            this.f2031b = eVar;
        }

        public final void a() {
            d1.b bVar = this.f2030a;
            HashSet<e> hashSet = bVar.f1936e;
            if (hashSet.remove(this.f2031b) && hashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            d1.b bVar = this.f2030a;
            int c3 = g1.c(bVar.f1934c.f2066d0);
            int i8 = bVar.f1932a;
            return c3 == i8 || !(c3 == 2 || i8 == 2);
        }
    }

    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2032c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2033d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f2034e;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r5 == androidx.fragment.app.p.f2058u0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == androidx.fragment.app.p.f2058u0) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(androidx.fragment.app.d1.b r4, y1.e r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                r3.<init>(r4, r5)
                int r5 = r4.f1932a
                r0 = 2
                r1 = 1
                r2 = 0
                androidx.fragment.app.p r4 = r4.f1934c
                if (r5 != r0) goto L_0x002a
                if (r6 == 0) goto L_0x001a
                androidx.fragment.app.p$c r5 = r4.f2070g0
                if (r5 != 0) goto L_0x0013
                goto L_0x001d
            L_0x0013:
                java.lang.Object r5 = r5.f2095j
                java.lang.Object r0 = androidx.fragment.app.p.f2058u0
                if (r5 != r0) goto L_0x001e
                goto L_0x001d
            L_0x001a:
                r4.getClass()
            L_0x001d:
                r5 = r2
            L_0x001e:
                r3.f2032c = r5
                if (r6 == 0) goto L_0x0025
                androidx.fragment.app.p$c r5 = r4.f2070g0
                goto L_0x0027
            L_0x0025:
                androidx.fragment.app.p$c r5 = r4.f2070g0
            L_0x0027:
                r3.f2033d = r1
                goto L_0x0040
            L_0x002a:
                if (r6 == 0) goto L_0x0038
                androidx.fragment.app.p$c r5 = r4.f2070g0
                if (r5 != 0) goto L_0x0031
                goto L_0x003b
            L_0x0031:
                java.lang.Object r5 = r5.f2094i
                java.lang.Object r0 = androidx.fragment.app.p.f2058u0
                if (r5 != r0) goto L_0x003c
                goto L_0x003b
            L_0x0038:
                r4.getClass()
            L_0x003b:
                r5 = r2
            L_0x003c:
                r3.f2032c = r5
                r3.f2033d = r1
            L_0x0040:
                if (r7 == 0) goto L_0x005a
                if (r6 == 0) goto L_0x0054
                androidx.fragment.app.p$c r4 = r4.f2070g0
                if (r4 != 0) goto L_0x0049
                goto L_0x0051
            L_0x0049:
                java.lang.Object r4 = r4.f2096k
                java.lang.Object r5 = androidx.fragment.app.p.f2058u0
                if (r4 != r5) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r2 = r4
            L_0x0051:
                r3.f2034e = r2
                goto L_0x005c
            L_0x0054:
                r4.getClass()
                r3.f2034e = r2
                goto L_0x005c
            L_0x005a:
                r3.f2034e = r2
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.c.<init>(androidx.fragment.app.d1$b, y1.e, boolean, boolean):void");
        }

        public final x0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            t0 t0Var = r0.f2131a;
            if (t0Var != null && (obj instanceof Transition)) {
                return t0Var;
            }
            x0 x0Var = r0.f2132b;
            if (x0Var != null && x0Var.e(obj)) {
                return x0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2030a.f1934c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public m(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!y0.b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (childAt.getVisibility() == 0) {
                        i(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(o.a aVar, View view) {
        WeakHashMap<View, d2.d1> weakHashMap = i0.f7217a;
        String k10 = i0.i.k(view);
        if (k10 != null) {
            aVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getVisibility() == 0) {
                    j(aVar, childAt);
                }
            }
        }
    }

    public static void k(o.a aVar, Collection collection) {
        Iterator it = ((a.C0228a) aVar.entrySet()).iterator();
        while (true) {
            a.d dVar = (a.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, d2.d1> weakHashMap = i0.f7217a;
                if (!collection.contains(i0.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0539, code lost:
        if (r11 == r4) goto L_0x053e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x057e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r40, boolean r41) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            java.util.Iterator r3 = r40.iterator()
            r5 = 0
            r6 = 0
        L_0x000c:
            boolean r7 = r3.hasNext()
            r8 = 3
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r3.next()
            androidx.fragment.app.d1$b r7 = (androidx.fragment.app.d1.b) r7
            androidx.fragment.app.p r11 = r7.f1934c
            android.view.View r11 = r11.f2066d0
            int r11 = androidx.fragment.app.g1.c(r11)
            int r12 = r7.f1932a
            int r12 = q.g.c(r12)
            if (r12 == 0) goto L_0x0036
            if (r12 == r10) goto L_0x0032
            if (r12 == r9) goto L_0x0036
            if (r12 == r8) goto L_0x0036
            goto L_0x000c
        L_0x0032:
            if (r11 == r9) goto L_0x000c
            r6 = r7
            goto L_0x000c
        L_0x0036:
            if (r11 != r9) goto L_0x000c
            if (r5 != 0) goto L_0x000c
            r5 = r7
            goto L_0x000c
        L_0x003c:
            boolean r3 = androidx.fragment.app.i0.J(r9)
            java.lang.String r7 = " to "
            java.lang.String r11 = "FragmentManager"
            if (r3 == 0) goto L_0x005d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r12 = "Executing operations from "
            r3.<init>(r12)
            r3.append(r5)
            r3.append(r7)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r11, r3)
        L_0x005d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r1)
            int r14 = r40.size()
            r15 = -1
            int r14 = r14 + r15
            java.lang.Object r14 = r1.get(r14)
            androidx.fragment.app.d1$b r14 = (androidx.fragment.app.d1.b) r14
            androidx.fragment.app.p r14 = r14.f1934c
            java.util.Iterator r16 = r40.iterator()
        L_0x007e:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x00a5
            java.lang.Object r17 = r16.next()
            r10 = r17
            androidx.fragment.app.d1$b r10 = (androidx.fragment.app.d1.b) r10
            androidx.fragment.app.p r10 = r10.f1934c
            androidx.fragment.app.p$c r10 = r10.f2070g0
            androidx.fragment.app.p$c r8 = r14.f2070g0
            int r4 = r8.f2087b
            r10.f2087b = r4
            int r4 = r8.f2088c
            r10.f2088c = r4
            int r4 = r8.f2089d
            r10.f2089d = r4
            int r4 = r8.f2090e
            r10.f2090e = r4
            r8 = 3
            r10 = 1
            goto L_0x007e
        L_0x00a5:
            java.util.Iterator r1 = r40.iterator()
        L_0x00a9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00f4
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.d1$b r4 = (androidx.fragment.app.d1.b) r4
            y1.e r10 = new y1.e
            r10.<init>()
            r4.d()
            java.util.HashSet<y1.e> r14 = r4.f1936e
            r14.add(r10)
            androidx.fragment.app.m$a r14 = new androidx.fragment.app.m$a
            r14.<init>(r4, r10, r2)
            r3.add(r14)
            y1.e r10 = new y1.e
            r10.<init>()
            r4.d()
            java.util.HashSet<y1.e> r14 = r4.f1936e
            r14.add(r10)
            androidx.fragment.app.m$c r14 = new androidx.fragment.app.m$c
            if (r2 == 0) goto L_0x00de
            if (r4 != r5) goto L_0x00e2
            goto L_0x00e0
        L_0x00de:
            if (r4 != r6) goto L_0x00e2
        L_0x00e0:
            r8 = 1
            goto L_0x00e3
        L_0x00e2:
            r8 = 0
        L_0x00e3:
            r14.<init>(r4, r10, r2, r8)
            r12.add(r14)
            androidx.fragment.app.d r8 = new androidx.fragment.app.d
            r8.<init>(r0, r13, r4)
            java.util.ArrayList r4 = r4.f1935d
            r4.add(r8)
            goto L_0x00a9
        L_0x00f4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r4 = r12.iterator()
            r10 = 0
        L_0x00fe:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x018e
            java.lang.Object r14 = r4.next()
            androidx.fragment.app.m$c r14 = (androidx.fragment.app.m.c) r14
            boolean r16 = r14.b()
            if (r16 == 0) goto L_0x0118
            r27 = r3
            r19 = r4
            r26 = r7
            goto L_0x0184
        L_0x0118:
            java.lang.Object r8 = r14.f2032c
            androidx.fragment.app.x0 r9 = r14.c(r8)
            java.lang.Object r15 = r14.f2034e
            r19 = r4
            androidx.fragment.app.x0 r4 = r14.c(r15)
            r26 = r7
            java.lang.String r7 = " returned Transition "
            r27 = r3
            java.lang.String r3 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            androidx.fragment.app.d1$b r14 = r14.f2030a
            if (r9 == 0) goto L_0x0159
            if (r4 == 0) goto L_0x0159
            if (r9 != r4) goto L_0x0137
            goto L_0x0159
        L_0x0137:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            androidx.fragment.app.p r3 = r14.f1934c
            r2.append(r3)
            r2.append(r7)
            r2.append(r8)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0159:
            if (r9 == 0) goto L_0x015c
            r4 = r9
        L_0x015c:
            if (r10 != 0) goto L_0x0160
            r10 = r4
            goto L_0x0184
        L_0x0160:
            if (r4 == 0) goto L_0x0184
            if (r10 != r4) goto L_0x0165
            goto L_0x0184
        L_0x0165:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            androidx.fragment.app.p r3 = r14.f1934c
            r2.append(r3)
            r2.append(r7)
            r2.append(r8)
            java.lang.String r3 = " which uses a different Transition  type than other Fragments."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0184:
            r4 = r19
            r7 = r26
            r3 = r27
            r9 = 2
            r15 = -1
            goto L_0x00fe
        L_0x018e:
            r27 = r3
            r26 = r7
            android.view.ViewGroup r3 = r0.f1926a
            if (r10 != 0) goto L_0x01bc
            java.util.Iterator r2 = r12.iterator()
        L_0x019a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = r2.next()
            androidx.fragment.app.m$c r4 = (androidx.fragment.app.m.c) r4
            androidx.fragment.app.d1$b r7 = r4.f2030a
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
            r4.a()
            goto L_0x019a
        L_0x01b1:
            r7 = r1
            r25 = r5
            r35 = r6
            r29 = r13
            r0 = 0
            r13 = r11
            goto L_0x06bc
        L_0x01bc:
            android.view.View r4 = new android.view.View
            android.content.Context r7 = r3.getContext()
            r4.<init>(r7)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            o.a r14 = new o.a
            r14.<init>()
            java.util.Iterator r15 = r12.iterator()
            r0 = r5
            r29 = r13
            r28 = 0
            r30 = 0
            r31 = 0
            r13 = r6
        L_0x01e7:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x03eb
            java.lang.Object r19 = r15.next()
            r32 = r15
            r15 = r19
            androidx.fragment.app.m$c r15 = (androidx.fragment.app.m.c) r15
            java.lang.Object r15 = r15.f2034e
            if (r15 == 0) goto L_0x01fe
            r19 = 1
            goto L_0x0200
        L_0x01fe:
            r19 = 0
        L_0x0200:
            if (r19 == 0) goto L_0x03d4
            if (r0 == 0) goto L_0x03d4
            if (r13 == 0) goto L_0x03d4
            java.lang.Object r15 = r10.f(r15)
            java.lang.Object r15 = r10.r(r15)
            androidx.fragment.app.p r13 = r13.f1934c
            r33 = r12
            androidx.fragment.app.p$c r12 = r13.f2070g0
            if (r12 == 0) goto L_0x021a
            java.util.ArrayList<java.lang.String> r12 = r12.f2092g
            if (r12 != 0) goto L_0x021f
        L_0x021a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x021f:
            androidx.fragment.app.p r0 = r0.f1934c
            r34 = r1
            androidx.fragment.app.p$c r1 = r0.f2070g0
            if (r1 == 0) goto L_0x022b
            java.util.ArrayList<java.lang.String> r1 = r1.f2092g
            if (r1 != 0) goto L_0x0230
        L_0x022b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0230:
            r35 = r4
            androidx.fragment.app.p$c r4 = r0.f2070g0
            if (r4 == 0) goto L_0x023a
            java.util.ArrayList<java.lang.String> r4 = r4.f2093h
            if (r4 != 0) goto L_0x023f
        L_0x023a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x023f:
            r36 = r7
            r37 = r10
            r7 = 0
        L_0x0244:
            int r10 = r4.size()
            if (r7 >= r10) goto L_0x0265
            java.lang.Object r10 = r4.get(r7)
            int r10 = r12.indexOf(r10)
            r19 = r4
            r4 = -1
            if (r10 == r4) goto L_0x0260
            java.lang.Object r4 = r1.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            r12.set(r10, r4)
        L_0x0260:
            int r7 = r7 + 1
            r4 = r19
            goto L_0x0244
        L_0x0265:
            androidx.fragment.app.p$c r1 = r13.f2070g0
            if (r1 == 0) goto L_0x026d
            java.util.ArrayList<java.lang.String> r1 = r1.f2093h
            if (r1 != 0) goto L_0x0272
        L_0x026d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0272:
            int r4 = r12.size()
            r7 = 0
        L_0x0277:
            if (r7 >= r4) goto L_0x0291
            java.lang.Object r10 = r12.get(r7)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r19 = r1.get(r7)
            r20 = r4
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4
            r14.put(r10, r4)
            int r7 = r7 + 1
            r4 = r20
            goto L_0x0277
        L_0x0291:
            r4 = 2
            boolean r7 = androidx.fragment.app.i0.J(r4)
            if (r7 == 0) goto L_0x02ec
            java.lang.String r4 = ">>> entering view names <<<"
            android.util.Log.v(r11, r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x02a1:
            boolean r7 = r4.hasNext()
            java.lang.String r10 = "Name: "
            if (r7 == 0) goto L_0x02c3
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            r19 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r11, r4)
            r4 = r19
            goto L_0x02a1
        L_0x02c3:
            java.lang.String r4 = ">>> exiting view names <<<"
            android.util.Log.v(r11, r4)
            java.util.Iterator r4 = r12.iterator()
        L_0x02cc:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02ec
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            r19 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r11, r4)
            r4 = r19
            goto L_0x02cc
        L_0x02ec:
            o.a r4 = new o.a
            r4.<init>()
            android.view.View r0 = r0.f2066d0
            j(r4, r0)
            r4.n(r12)
            java.util.Set r0 = r4.keySet()
            r14.n(r0)
            o.a r0 = new o.a
            r0.<init>()
            android.view.View r7 = r13.f2066d0
            j(r0, r7)
            r0.n(r1)
            java.util.Collection r7 = r14.values()
            r0.n(r7)
            androidx.fragment.app.t0 r7 = androidx.fragment.app.r0.f2131a
            int r7 = r14.f12032c
            r10 = -1
            int r7 = r7 + r10
        L_0x031a:
            if (r7 < 0) goto L_0x032e
            java.lang.Object r13 = r14.m(r7)
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = r0.containsKey(r13)
            if (r13 != 0) goto L_0x032b
            r14.k(r7)
        L_0x032b:
            int r7 = r7 + -1
            goto L_0x031a
        L_0x032e:
            java.util.Set r7 = r14.keySet()
            k(r4, r7)
            java.util.Collection r7 = r14.values()
            k(r0, r7)
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x0356
            r8.clear()
            r9.clear()
            r0 = r5
            r13 = r6
            r7 = r34
            r1 = r35
            r4 = r36
            r12 = r37
            r30 = 0
            goto L_0x03de
        L_0x0356:
            androidx.fragment.app.i r7 = new androidx.fragment.app.i
            r7.<init>(r6, r5, r2, r0)
            d2.c0.a(r3, r7)
            java.util.Collection r7 = r4.values()
            r8.addAll(r7)
            boolean r7 = r12.isEmpty()
            if (r7 != 0) goto L_0x0381
            r7 = 0
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            java.lang.Object r4 = r4.getOrDefault(r12, r13)
            android.view.View r4 = (android.view.View) r4
            r12 = r37
            r12.m(r4, r15)
            r28 = r4
            goto L_0x0385
        L_0x0381:
            r12 = r37
            r7 = 0
            r13 = 0
        L_0x0385:
            java.util.Collection r4 = r0.values()
            r9.addAll(r4)
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x03af
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getOrDefault(r1, r13)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x03af
            androidx.fragment.app.j r1 = new androidx.fragment.app.j
            r4 = r36
            r1.<init>(r12, r0, r4)
            d2.c0.a(r3, r1)
            r1 = r35
            r31 = 1
            goto L_0x03b3
        L_0x03af:
            r4 = r36
            r1 = r35
        L_0x03b3:
            r12.p(r15, r1, r8)
            r21 = 0
            r22 = 0
            r19 = r12
            r20 = r15
            r23 = r15
            r24 = r9
            r19.l(r20, r21, r22, r23, r24)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7 = r34
            r7.put(r5, r0)
            r7.put(r6, r0)
            r0 = r5
            r13 = r6
            r30 = r15
            goto L_0x03de
        L_0x03d4:
            r33 = r12
            r12 = r10
            r10 = -1
            r38 = r7
            r7 = r1
            r1 = r4
            r4 = r38
        L_0x03de:
            r10 = r12
            r15 = r32
            r12 = r33
            r38 = r4
            r4 = r1
            r1 = r7
            r7 = r38
            goto L_0x01e7
        L_0x03eb:
            r33 = r12
            r12 = r10
            r38 = r7
            r7 = r1
            r1 = r4
            r4 = r38
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r33.iterator()
            r25 = r5
            r5 = 0
            r15 = 0
        L_0x0401:
            boolean r19 = r10.hasNext()
            if (r19 == 0) goto L_0x04fe
            java.lang.Object r19 = r10.next()
            r41 = r10
            r10 = r19
            androidx.fragment.app.m$c r10 = (androidx.fragment.app.m.c) r10
            boolean r19 = r10.b()
            r32 = r14
            androidx.fragment.app.d1$b r14 = r10.f2030a
            if (r19 == 0) goto L_0x042c
            r34 = r11
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r7.put(r14, r11)
            r10.a()
            r10 = r41
            r14 = r32
            r11 = r34
            goto L_0x0401
        L_0x042c:
            r34 = r11
            java.lang.Object r11 = r10.f2032c
            java.lang.Object r11 = r12.f(r11)
            r35 = r6
            r6 = r30
            if (r6 == 0) goto L_0x0440
            if (r14 == r0) goto L_0x043e
            if (r14 != r13) goto L_0x0440
        L_0x043e:
            r13 = 1
            goto L_0x0441
        L_0x0440:
            r13 = 0
        L_0x0441:
            if (r11 != 0) goto L_0x045a
            if (r13 != 0) goto L_0x044d
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r7.put(r14, r11)
            r10.a()
        L_0x044d:
            r19 = r0
            r20 = r1
            r1 = r5
            r30 = r6
            r0 = r28
            r5 = r29
            goto L_0x04ea
        L_0x045a:
            r30 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r36 = r5
            androidx.fragment.app.p r5 = r14.f1934c
            android.view.View r5 = r5.f2066d0
            i(r6, r5)
            if (r13 == 0) goto L_0x0475
            if (r14 != r0) goto L_0x0472
            r6.removeAll(r8)
            goto L_0x0475
        L_0x0472:
            r6.removeAll(r9)
        L_0x0475:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x0485
            r12.a(r1, r11)
        L_0x047e:
            r19 = r0
            r20 = r1
            r5 = r29
            goto L_0x04be
        L_0x0485:
            r12.b(r11, r6)
            r23 = 0
            r24 = 0
            r19 = r12
            r20 = r11
            r21 = r11
            r22 = r6
            r19.l(r20, r21, r22, r23, r24)
            int r5 = r14.f1932a
            r13 = 3
            if (r5 != r13) goto L_0x047e
            r5 = r29
            r5.remove(r14)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r6)
            r19 = r0
            androidx.fragment.app.p r0 = r14.f1934c
            r20 = r1
            android.view.View r1 = r0.f2066d0
            r13.remove(r1)
            android.view.View r0 = r0.f2066d0
            r12.k(r11, r0, r13)
            androidx.fragment.app.k r0 = new androidx.fragment.app.k
            r0.<init>(r6)
            d2.c0.a(r3, r0)
        L_0x04be:
            int r0 = r14.f1932a
            r1 = 2
            if (r0 != r1) goto L_0x04ce
            r2.addAll(r6)
            if (r31 == 0) goto L_0x04cb
            r12.n(r11, r4)
        L_0x04cb:
            r0 = r28
            goto L_0x04d3
        L_0x04ce:
            r0 = r28
            r12.m(r0, r11)
        L_0x04d3:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.put(r14, r1)
            boolean r1 = r10.f2033d
            if (r1 == 0) goto L_0x04e4
            java.lang.Object r1 = r12.j(r15, r11)
            r15 = r1
            r1 = r36
            goto L_0x04ea
        L_0x04e4:
            r1 = r36
            java.lang.Object r1 = r12.j(r1, r11)
        L_0x04ea:
            r10 = r41
            r28 = r0
            r29 = r5
            r0 = r19
            r14 = r32
            r11 = r34
            r6 = r35
            r13 = r6
            r5 = r1
            r1 = r20
            goto L_0x0401
        L_0x04fe:
            r19 = r0
            r1 = r5
            r35 = r6
            r34 = r11
            r32 = r14
            r5 = r29
            r6 = r30
            java.lang.Object r0 = r12.i(r15, r1, r6)
            if (r0 != 0) goto L_0x0518
            r29 = r5
            r13 = r34
        L_0x0515:
            r0 = 0
            goto L_0x06bc
        L_0x0518:
            java.util.Iterator r1 = r33.iterator()
            r4 = r19
        L_0x051e:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0593
            java.lang.Object r10 = r1.next()
            androidx.fragment.app.m$c r10 = (androidx.fragment.app.m.c) r10
            boolean r11 = r10.b()
            if (r11 == 0) goto L_0x0531
            goto L_0x051e
        L_0x0531:
            androidx.fragment.app.d1$b r11 = r10.f2030a
            if (r6 == 0) goto L_0x0540
            if (r11 == r4) goto L_0x053c
            r4 = r35
            if (r11 != r4) goto L_0x0542
            goto L_0x053e
        L_0x053c:
            r4 = r35
        L_0x053e:
            r13 = 1
            goto L_0x0543
        L_0x0540:
            r4 = r35
        L_0x0542:
            r13 = 0
        L_0x0543:
            java.lang.Object r14 = r10.f2032c
            if (r14 != 0) goto L_0x054d
            if (r13 == 0) goto L_0x054a
            goto L_0x054d
        L_0x054a:
            r13 = r34
            goto L_0x058c
        L_0x054d:
            java.util.WeakHashMap<android.view.View, d2.d1> r13 = d2.i0.f7217a
            boolean r13 = d2.i0.g.c(r3)
            if (r13 != 0) goto L_0x057e
            r13 = 2
            boolean r14 = androidx.fragment.app.i0.J(r13)
            if (r14 == 0) goto L_0x0578
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "SpecialEffectsController: Container "
            r13.<init>(r14)
            r13.append(r3)
            java.lang.String r14 = " has not been laid out. Completing operation "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r13 = r34
            android.util.Log.v(r13, r11)
            goto L_0x057a
        L_0x0578:
            r13 = r34
        L_0x057a:
            r10.a()
            goto L_0x058c
        L_0x057e:
            r13 = r34
            androidx.fragment.app.p r14 = r11.f1934c
            androidx.fragment.app.l r14 = new androidx.fragment.app.l
            r14.<init>(r10, r11)
            y1.e r10 = r10.f2031b
            r12.o(r0, r10, r14)
        L_0x058c:
            r35 = r4
            r34 = r13
            r4 = r25
            goto L_0x051e
        L_0x0593:
            r13 = r34
            r4 = r35
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            boolean r1 = d2.i0.g.c(r3)
            if (r1 != 0) goto L_0x05a5
            r35 = r4
            r29 = r5
            goto L_0x0515
        L_0x05a5:
            r1 = 4
            androidx.fragment.app.r0.a(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r10 = r9.size()
            r11 = 0
        L_0x05b3:
            if (r11 >= r10) goto L_0x05cb
            java.lang.Object r14 = r9.get(r11)
            android.view.View r14 = (android.view.View) r14
            java.util.WeakHashMap<android.view.View, d2.d1> r15 = d2.i0.f7217a
            java.lang.String r15 = d2.i0.i.k(r14)
            r1.add(r15)
            r15 = 0
            d2.i0.i.v(r14, r15)
            int r11 = r11 + 1
            goto L_0x05b3
        L_0x05cb:
            r11 = 2
            boolean r10 = androidx.fragment.app.i0.J(r11)
            if (r10 == 0) goto L_0x0641
            java.lang.String r10 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r13, r10)
            java.lang.String r10 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r13, r10)
            java.util.Iterator r10 = r8.iterator()
        L_0x05e0:
            boolean r11 = r10.hasNext()
            java.lang.String r14 = " Name: "
            java.lang.String r15 = "View: "
            if (r11 == 0) goto L_0x060e
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            r41 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r15)
            r10.append(r11)
            r10.append(r14)
            java.lang.String r11 = d2.i0.i.k(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r13, r10)
            r10 = r41
            goto L_0x05e0
        L_0x060e:
            java.lang.String r10 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r13, r10)
            java.util.Iterator r10 = r9.iterator()
        L_0x0617:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0641
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
            r41 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r15)
            r10.append(r11)
            r10.append(r14)
            java.lang.String r11 = d2.i0.i.k(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r13, r10)
            r10 = r41
            goto L_0x0617
        L_0x0641:
            r12.c(r3, r0)
            int r0 = r9.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
        L_0x064e:
            if (r11 >= r0) goto L_0x069d
            java.lang.Object r14 = r8.get(r11)
            android.view.View r14 = (android.view.View) r14
            java.util.WeakHashMap<android.view.View, d2.d1> r15 = d2.i0.f7217a
            java.lang.String r15 = d2.i0.i.k(r14)
            r10.add(r15)
            if (r15 != 0) goto L_0x0666
            r35 = r4
        L_0x0663:
            r29 = r5
            goto L_0x0696
        L_0x0666:
            r35 = r4
            r4 = 0
            d2.i0.i.v(r14, r4)
            r14 = r32
            java.lang.Object r18 = r14.getOrDefault(r15, r4)
            r4 = r18
            java.lang.String r4 = (java.lang.String) r4
            r32 = r14
            r14 = 0
        L_0x0679:
            if (r14 >= r0) goto L_0x0663
            r29 = r5
            java.lang.Object r5 = r1.get(r14)
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0691
            java.lang.Object r4 = r9.get(r14)
            android.view.View r4 = (android.view.View) r4
            d2.i0.i.v(r4, r15)
            goto L_0x0696
        L_0x0691:
            int r14 = r14 + 1
            r5 = r29
            goto L_0x0679
        L_0x0696:
            int r11 = r11 + 1
            r5 = r29
            r4 = r35
            goto L_0x064e
        L_0x069d:
            r35 = r4
            r29 = r5
            androidx.fragment.app.w0 r4 = new androidx.fragment.app.w0
            r19 = r4
            r20 = r0
            r21 = r9
            r22 = r1
            r23 = r8
            r24 = r10
            r19.<init>(r20, r21, r22, r23, r24)
            d2.c0.a(r3, r4)
            r0 = 0
            androidx.fragment.app.r0.a(r2, r0)
            r12.q(r6, r8, r9)
        L_0x06bc:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r7.containsValue(r1)
            android.content.Context r2 = r3.getContext()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r27.iterator()
            r6 = r0
        L_0x06d0:
            boolean r8 = r5.hasNext()
            java.lang.String r9 = " has started."
            if (r8 == 0) goto L_0x0786
            java.lang.Object r8 = r5.next()
            androidx.fragment.app.m$a r8 = (androidx.fragment.app.m.a) r8
            boolean r10 = r8.b()
            if (r10 == 0) goto L_0x06e8
            r8.a()
            goto L_0x06d0
        L_0x06e8:
            androidx.fragment.app.y$a r10 = r8.c(r2)
            if (r10 != 0) goto L_0x06f2
            r8.a()
            goto L_0x06d0
        L_0x06f2:
            android.animation.Animator r10 = r10.f2163b
            if (r10 != 0) goto L_0x06fa
            r4.add(r8)
            goto L_0x06d0
        L_0x06fa:
            androidx.fragment.app.d1$b r11 = r8.f2030a
            androidx.fragment.app.p r12 = r11.f1934c
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            java.lang.Object r15 = r7.get(r11)
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x072b
            r14 = 2
            boolean r9 = androidx.fragment.app.i0.J(r14)
            if (r9 == 0) goto L_0x0727
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Ignoring Animator set on "
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r10 = " as this Fragment was involved in a Transition."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r13, r9)
        L_0x0727:
            r8.a()
            goto L_0x06d0
        L_0x072b:
            int r6 = r11.f1932a
            r14 = 3
            if (r6 != r14) goto L_0x0733
            r21 = 1
            goto L_0x0735
        L_0x0733:
            r21 = r0
        L_0x0735:
            if (r21 == 0) goto L_0x073d
            r15 = r29
            r15.remove(r11)
            goto L_0x073f
        L_0x073d:
            r15 = r29
        L_0x073f:
            android.view.View r6 = r12.f2066d0
            r3.startViewTransition(r6)
            androidx.fragment.app.e r12 = new androidx.fragment.app.e
            r18 = r12
            r19 = r3
            r20 = r6
            r22 = r11
            r23 = r8
            r18.<init>(r19, r20, r21, r22, r23)
            r10.addListener(r12)
            r10.setTarget(r6)
            r10.start()
            r6 = 2
            boolean r12 = androidx.fragment.app.i0.J(r6)
            if (r12 == 0) goto L_0x0777
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "Animator from operation "
            r6.<init>(r12)
            r6.append(r11)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r13, r6)
        L_0x0777:
            androidx.fragment.app.f r6 = new androidx.fragment.app.f
            r6.<init>(r10, r11)
            y1.e r8 = r8.f2031b
            r8.b(r6)
            r29 = r15
            r6 = 1
            goto L_0x06d0
        L_0x0786:
            r15 = r29
            java.util.Iterator r0 = r4.iterator()
        L_0x078c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0834
            java.lang.Object r4 = r0.next()
            androidx.fragment.app.m$a r4 = (androidx.fragment.app.m.a) r4
            androidx.fragment.app.d1$b r5 = r4.f2030a
            androidx.fragment.app.p r7 = r5.f1934c
            java.lang.String r8 = "Ignoring Animation set on "
            if (r1 == 0) goto L_0x07bf
            r10 = 2
            boolean r5 = androidx.fragment.app.i0.J(r10)
            if (r5 == 0) goto L_0x07bb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r7)
            java.lang.String r7 = " as Animations cannot run alongside Transitions."
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r13, r5)
        L_0x07bb:
            r4.a()
            goto L_0x078c
        L_0x07bf:
            if (r6 == 0) goto L_0x07e0
            r10 = 2
            boolean r5 = androidx.fragment.app.i0.J(r10)
            if (r5 == 0) goto L_0x07dc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r7)
            java.lang.String r7 = " as Animations cannot run alongside Animators."
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r13, r5)
        L_0x07dc:
            r4.a()
            goto L_0x078c
        L_0x07e0:
            android.view.View r7 = r7.f2066d0
            androidx.fragment.app.y$a r8 = r4.c(r2)
            r8.getClass()
            android.view.animation.Animation r8 = r8.f2162a
            r8.getClass()
            int r10 = r5.f1932a
            r11 = 1
            if (r10 == r11) goto L_0x07fa
            r7.startAnimation(r8)
            r4.a()
            goto L_0x0828
        L_0x07fa:
            r3.startViewTransition(r7)
            androidx.fragment.app.y$b r10 = new androidx.fragment.app.y$b
            r10.<init>(r8, r3, r7)
            androidx.fragment.app.g r8 = new androidx.fragment.app.g
            r8.<init>(r7, r3, r4, r5)
            r10.setAnimationListener(r8)
            r7.startAnimation(r10)
            r8 = 2
            boolean r10 = androidx.fragment.app.i0.J(r8)
            if (r10 == 0) goto L_0x0828
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Animation from operation "
            r8.<init>(r10)
            r8.append(r5)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r13, r8)
        L_0x0828:
            androidx.fragment.app.h r8 = new androidx.fragment.app.h
            r8.<init>(r7, r3, r4, r5)
            y1.e r4 = r4.f2031b
            r4.b(r8)
            goto L_0x078c
        L_0x0834:
            java.util.Iterator r0 = r15.iterator()
        L_0x0838:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x084e
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.d1$b r1 = (androidx.fragment.app.d1.b) r1
            androidx.fragment.app.p r2 = r1.f1934c
            android.view.View r2 = r2.f2066d0
            int r1 = r1.f1932a
            androidx.fragment.app.g1.a(r1, r2)
            goto L_0x0838
        L_0x084e:
            r15.clear()
            r0 = 2
            boolean r0 = androidx.fragment.app.i0.J(r0)
            if (r0 == 0) goto L_0x0875
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Completed executing operations from "
            r0.<init>(r1)
            r5 = r25
            r0.append(r5)
            r1 = r26
            r0.append(r1)
            r6 = r35
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0875:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.b(java.util.ArrayList, boolean):void");
    }
}
