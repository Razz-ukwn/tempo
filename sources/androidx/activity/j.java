package androidx.activity;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f591b;

    public /* synthetic */ j(Object obj, int i8) {
        this.f590a = i8;
        this.f591b = obj;
    }

    /* JADX WARNING: type inference failed for: r3v40, types: [x0.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0641, code lost:
        if (r3 != null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0646, code lost:
        if (r3 == null) goto L_0x0648;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r1 = r27
            int r0 = r1.f590a
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L_0x07c7;
                case 1: goto L_0x07b5;
                case 2: goto L_0x017a;
                case 3: goto L_0x0150;
                case 4: goto L_0x0131;
                case 5: goto L_0x0126;
                case 6: goto L_0x011b;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00a5;
                case 9: goto L_0x0083;
                case 10: goto L_0x0073;
                case 11: goto L_0x004c;
                case 12: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x07d6
        L_0x000d:
            java.lang.Object r0 = r1.f591b
            wa.a0 r0 = (wa.a0) r0
            java.util.ArrayDeque<java.lang.String> r2 = r0.f16555d
            monitor-enter(r2)
            android.content.SharedPreferences r3 = r0.f16552a     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r0.f16553b     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r5.<init>()     // Catch:{ all -> 0x0049 }
            java.util.ArrayDeque<java.lang.String> r6 = r0.f16555d     // Catch:{ all -> 0x0049 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0049 }
        L_0x0027:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0049 }
            r5.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r0.f16554c     // Catch:{ all -> 0x0049 }
            r5.append(r7)     // Catch:{ all -> 0x0049 }
            goto L_0x0027
        L_0x003c:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences$Editor r0 = r3.putString(r4, r0)     // Catch:{ all -> 0x0049 }
            r0.commit()     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r0
        L_0x004c:
            java.lang.Object r0 = r1.f591b
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            com.google.firebase.messaging.a r2 = com.google.firebase.messaging.FirebaseMessaging.m
            com.google.firebase.messaging.FirebaseMessaging$a r2 = r0.f6337g
            monitor-enter(r2)
            r2.a()     // Catch:{ all -> 0x0070 }
            java.lang.Boolean r3 = r2.f6344c     // Catch:{ all -> 0x0070 }
            if (r3 == 0) goto L_0x0061
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0070 }
            goto L_0x0069
        L_0x0061:
            com.google.firebase.messaging.FirebaseMessaging r3 = com.google.firebase.messaging.FirebaseMessaging.this     // Catch:{ all -> 0x0070 }
            m9.f r3 = r3.f6331a     // Catch:{ all -> 0x0070 }
            boolean r3 = r3.j()     // Catch:{ all -> 0x0070 }
        L_0x0069:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x006f
            r0.d()
        L_0x006f:
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0073:
            java.lang.Object r0 = r1.f591b
            a9.n r0 = (a9.n) r0
            android.widget.AutoCompleteTextView r2 = r0.f154h
            boolean r2 = r2.isPopupShowing()
            r0.t(r2)
            r0.m = r2
            return
        L_0x0083:
            java.lang.Object r0 = r1.f591b
            com.google.android.material.sidesheet.SideSheetBehavior$c r0 = (com.google.android.material.sidesheet.SideSheetBehavior.c) r0
            r0.f6047b = r4
            com.google.android.material.sidesheet.SideSheetBehavior r3 = com.google.android.material.sidesheet.SideSheetBehavior.this
            l2.c r4 = r3.f6033i
            if (r4 == 0) goto L_0x009b
            boolean r4 = r4.g()
            if (r4 == 0) goto L_0x009b
            int r2 = r0.f6046a
            r0.a(r2)
            goto L_0x00a4
        L_0x009b:
            int r4 = r3.f6032h
            if (r4 != r2) goto L_0x00a4
            int r0 = r0.f6046a
            r3.s(r0)
        L_0x00a4:
            return
        L_0x00a5:
            java.lang.Object r0 = r1.f591b
            j6.p r0 = (j6.p) r0
            r0.getClass()
            j0.m r3 = new j0.m
            r3.<init>(r0, r2)
            l6.b r0 = r0.f9856d
            r0.d(r3)
            return
        L_0x00b7:
            java.lang.Object r0 = r1.f591b
            i3.t r0 = (i3.t) r0
            int r2 = i3.t.f9547v
            java.lang.String r2 = "this$0"
            sf.j.f(r0, r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f9554s
            boolean r2 = r2.compareAndSet(r4, r5)
            if (r2 == 0) goto L_0x00e0
            i3.p r2 = r0.f9548l
            i3.k r2 = r2.f9511e
            i3.s r6 = r0.f9551p
            r2.getClass()
            java.lang.String r7 = "observer"
            sf.j.f(r6, r7)
            i3.k$e r7 = new i3.k$e
            r7.<init>(r2, r6)
            r2.a(r7)
        L_0x00e0:
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f9553r
            boolean r6 = r2.compareAndSet(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.f9552q
            if (r6 == 0) goto L_0x0111
            r8 = r3
            r6 = r4
        L_0x00ec:
            boolean r9 = r7.compareAndSet(r5, r4)     // Catch:{ all -> 0x010c }
            if (r9 == 0) goto L_0x0103
            java.util.concurrent.Callable<T> r6 = r0.f9550o     // Catch:{ Exception -> 0x00fa }
            java.lang.Object r8 = r6.call()     // Catch:{ Exception -> 0x00fa }
            r6 = r5
            goto L_0x00ec
        L_0x00fa:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x010c }
            java.lang.String r5 = "Exception while computing database live data."
            r3.<init>(r5, r0)     // Catch:{ all -> 0x010c }
            throw r3     // Catch:{ all -> 0x010c }
        L_0x0103:
            if (r6 == 0) goto L_0x0108
            r0.i(r8)     // Catch:{ all -> 0x010c }
        L_0x0108:
            r2.set(r4)
            goto L_0x0112
        L_0x010c:
            r0 = move-exception
            r2.set(r4)
            throw r0
        L_0x0111:
            r6 = r4
        L_0x0112:
            if (r6 == 0) goto L_0x011a
            boolean r2 = r7.get()
            if (r2 != 0) goto L_0x00e0
        L_0x011a:
            return
        L_0x011b:
            java.lang.Object r0 = r1.f591b
            androidx.activity.f.d(r0)
            java.lang.String r0 = "this$0"
            sf.j.f(r3, r0)
            throw r3
        L_0x0126:
            java.lang.Object r0 = r1.f591b
            androidx.activity.f.d(r0)
            java.lang.String r0 = "this$0"
            sf.j.f(r3, r0)
            throw r3
        L_0x0131:
            java.lang.Object r0 = r1.f591b
            android.content.Context r0 = (android.content.Context) r0
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            r3 = 0
            r4 = 1
            r5 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r2 = r9
            r2.<init>(r3, r4, r5, r7, r8)
            androidx.activity.b r2 = new androidx.activity.b
            r3 = 3
            r2.<init>(r0, r3)
            r9.execute(r2)
            return
        L_0x0150:
            java.lang.Object r0 = r1.f591b
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0
            androidx.lifecycle.y r2 = androidx.lifecycle.y.E
            java.lang.String r2 = "this$0"
            sf.j.f(r0, r2)
            int r2 = r0.f2326b
            if (r2 != 0) goto L_0x0168
            r0.f2327c = r5
            androidx.lifecycle.q r2 = r0.B
            androidx.lifecycle.j$a r3 = androidx.lifecycle.j.a.ON_PAUSE
            r2.f(r3)
        L_0x0168:
            int r2 = r0.f2325a
            if (r2 != 0) goto L_0x0179
            boolean r2 = r0.f2327c
            if (r2 == 0) goto L_0x0179
            androidx.lifecycle.q r2 = r0.B
            androidx.lifecycle.j$a r3 = androidx.lifecycle.j.a.ON_STOP
            r2.f(r3)
            r0.f2328d = r5
        L_0x0179:
            return
        L_0x017a:
            java.lang.Object r0 = r1.f591b
            androidx.compose.ui.platform.s r0 = (androidx.compose.ui.platform.s) r0
            int[] r6 = androidx.compose.ui.platform.s.G
            java.lang.String r6 = "this$0"
            sf.j.f(r0, r6)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            androidx.compose.ui.platform.AndroidComposeView r13 = r0.f1416d
            r13.E(r5)
            v0.q r6 = r13.getSemanticsOwner()
            v0.p r6 = r6.a()
            androidx.compose.ui.platform.s$f r7 = r0.B
            r0.C(r6, r7)
            java.util.Map r14 = r0.q()
            java.lang.String r6 = "newSemanticsNodes"
            sf.j.f(r14, r6)
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.ArrayList r11 = r0.E
            r15.<init>(r11)
            r11.clear()
            java.util.Set r6 = r14.keySet()
            java.util.Iterator r16 = r6.iterator()
            r6 = r0
        L_0x01b7:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x06b6
            java.lang.Object r7 = r16.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r8 = r7.intValue()
            java.util.LinkedHashMap r7 = r6.A
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r7.get(r9)
            r9 = r7
            androidx.compose.ui.platform.s$f r9 = (androidx.compose.ui.platform.s.f) r9
            if (r9 != 0) goto L_0x01d7
            goto L_0x01b7
        L_0x01d7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r14.get(r7)
            androidx.compose.ui.platform.u2 r7 = (androidx.compose.ui.platform.u2) r7
            if (r7 == 0) goto L_0x01e6
            v0.p r7 = r7.f1476a
            goto L_0x01e7
        L_0x01e6:
            r7 = r3
        L_0x01e7:
            sf.j.c(r7)
            v0.j r4 = r7.f16074f
            java.util.Iterator r18 = r4.iterator()
            r19 = 0
        L_0x01f2:
            boolean r20 = r18.hasNext()
            v0.j r3 = r9.f1447b
            if (r20 == 0) goto L_0x0666
            java.lang.Object r20 = r18.next()
            java.util.Map$Entry r20 = (java.util.Map.Entry) r20
            java.lang.Object r5 = r20.getKey()
            v0.w<v0.h> r2 = v0.r.f16091n
            boolean r5 = sf.j.a(r5, r2)
            if (r5 != 0) goto L_0x021b
            java.lang.Object r5 = r20.getKey()
            v0.w<v0.h> r10 = v0.r.f16092o
            boolean r5 = sf.j.a(r5, r10)
            if (r5 == 0) goto L_0x0219
            goto L_0x021b
        L_0x0219:
            r10 = 0
            goto L_0x022c
        L_0x021b:
            androidx.compose.ui.platform.t2 r5 = androidx.compose.ui.platform.i0.d(r8, r15)
            if (r5 == 0) goto L_0x0223
            r10 = 0
            goto L_0x0229
        L_0x0223:
            androidx.compose.ui.platform.t2 r5 = new androidx.compose.ui.platform.t2
            r5.<init>(r8, r11)
            r10 = 1
        L_0x0229:
            r11.add(r5)
        L_0x022c:
            if (r10 != 0) goto L_0x0243
            java.lang.Object r5 = r20.getValue()
            java.lang.Object r10 = r20.getKey()
            v0.w r10 = (v0.w) r10
            java.lang.Object r10 = v0.k.a(r3, r10)
            boolean r5 = sf.j.a(r5, r10)
            if (r5 == 0) goto L_0x0243
            goto L_0x0267
        L_0x0243:
            java.lang.Object r5 = r20.getKey()
            v0.w r5 = (v0.w) r5
            v0.w<java.lang.String> r10 = v0.r.f16082d
            boolean r22 = sf.j.a(r5, r10)
            if (r22 == 0) goto L_0x026d
            java.lang.Object r2 = r20.getValue()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            sf.j.d(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r3.b(r10)
            if (r3 == 0) goto L_0x0267
            r3 = 8
            r6.A(r8, r3, r2)
        L_0x0267:
            r23 = r11
        L_0x0269:
            r24 = r14
            goto L_0x0379
        L_0x026d:
            v0.w<java.lang.String> r10 = v0.r.f16080b
            boolean r10 = sf.j.a(r5, r10)
            if (r10 == 0) goto L_0x0277
            r10 = 1
            goto L_0x027d
        L_0x0277:
            v0.w<w0.a> r10 = v0.r.f16099v
            boolean r10 = sf.j.a(r5, r10)
        L_0x027d:
            r22 = 64
            if (r10 == 0) goto L_0x0298
            int r2 = r6.w(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r5 = 8
            r10 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.s.z(r0, r2, r10, r3, r5)
            int r2 = r6.w(r8)
            androidx.compose.ui.platform.s.z(r0, r2, r10, r12, r5)
            goto L_0x0267
        L_0x0298:
            r23 = r11
            r11 = 8
            v0.w<v0.f> r10 = v0.r.f16081c
            boolean r10 = sf.j.a(r5, r10)
            if (r10 == 0) goto L_0x02b9
            int r2 = r6.w(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r5 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.s.z(r0, r2, r5, r3, r11)
            int r2 = r6.w(r8)
            androidx.compose.ui.platform.s.z(r0, r2, r5, r12, r11)
            goto L_0x0269
        L_0x02b9:
            v0.w<java.lang.Boolean> r10 = v0.r.f16098u
            boolean r11 = sf.j.a(r5, r10)
            r24 = r14
            r14 = 4
            if (r11 == 0) goto L_0x0359
            v0.j r2 = r7.g()
            v0.w<v0.g> r3 = v0.r.f16093p
            java.lang.Object r2 = v0.k.a(r2, r3)
            v0.g r2 = (v0.g) r2
            if (r2 != 0) goto L_0x02d3
            goto L_0x02d9
        L_0x02d3:
            int r2 = r2.f16042a
            if (r2 != r14) goto L_0x02d9
            r2 = 1
            goto L_0x02da
        L_0x02d9:
            r2 = 0
        L_0x02da:
            if (r2 == 0) goto L_0x0342
            v0.j r2 = r7.g()
            java.lang.Object r2 = v0.k.a(r2, r10)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = sf.j.a(r2, r3)
            if (r2 == 0) goto L_0x0336
            int r2 = r6.w(r8)
            android.view.accessibility.AccessibilityEvent r2 = r6.m(r2, r14)
            v0.p r3 = new v0.p
            s0.p1 r5 = r7.f16069a
            r10 = 1
            r3.<init>(r5, r10)
            v0.j r5 = r3.g()
            v0.w<java.util.List<java.lang.String>> r10 = v0.r.f16079a
            java.lang.Object r5 = v0.k.a(r5, r10)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x030f
            java.lang.String r5 = cb.d.A(r5)
            goto L_0x0310
        L_0x030f:
            r5 = 0
        L_0x0310:
            v0.j r3 = r3.g()
            v0.w<java.util.List<x0.a>> r10 = v0.r.f16095r
            java.lang.Object r3 = v0.k.a(r3, r10)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0323
            java.lang.String r3 = cb.d.A(r3)
            goto L_0x0324
        L_0x0323:
            r3 = 0
        L_0x0324:
            if (r5 == 0) goto L_0x0329
            r2.setContentDescription(r5)
        L_0x0329:
            if (r3 == 0) goto L_0x0332
            java.util.List r5 = r2.getText()
            r5.add(r3)
        L_0x0332:
            r6.x(r2)
            goto L_0x0379
        L_0x0336:
            int r2 = r6.w(r8)
            r3 = 8
            r10 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.s.z(r0, r2, r10, r12, r3)
            goto L_0x0379
        L_0x0342:
            r3 = 8
            r10 = 2048(0x800, float:2.87E-42)
            int r2 = r6.w(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            androidx.compose.ui.platform.s.z(r0, r2, r10, r5, r3)
            int r2 = r6.w(r8)
            androidx.compose.ui.platform.s.z(r0, r2, r10, r12, r3)
            goto L_0x0379
        L_0x0359:
            r10 = 2048(0x800, float:2.87E-42)
            v0.w<java.util.List<java.lang.String>> r11 = v0.r.f16079a
            boolean r11 = sf.j.a(r5, r11)
            if (r11 == 0) goto L_0x0388
            int r2 = r6.w(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            java.lang.Object r5 = r20.getValue()
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            sf.j.d(r5, r11)
            java.util.List r5 = (java.util.List) r5
            r6.y(r2, r10, r3, r5)
        L_0x0379:
            r2 = r7
            r1 = r8
            r17 = r9
            r25 = r13
            r22 = r15
            r26 = r23
            r5 = 32
            r15 = r6
            goto L_0x047a
        L_0x0388:
            v0.w<x0.a> r10 = v0.r.f16096s
            boolean r10 = sf.j.a(r5, r10)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x04ba
            boolean r2 = androidx.compose.ui.platform.i0.g(r7)
            if (r2 == 0) goto L_0x0497
            r6.getClass()
            x0.a r2 = androidx.compose.ui.platform.s.s(r3)
            if (r2 == 0) goto L_0x03a2
            goto L_0x03a3
        L_0x03a2:
            r2 = r11
        L_0x03a3:
            x0.a r3 = androidx.compose.ui.platform.s.s(r4)
            if (r3 == 0) goto L_0x03aa
            r11 = r3
        L_0x03aa:
            java.lang.CharSequence r3 = androidx.compose.ui.platform.s.H(r11)
            int r5 = r2.length()
            int r10 = r11.length()
            if (r5 <= r10) goto L_0x03ba
            r14 = r10
            goto L_0x03bb
        L_0x03ba:
            r14 = r5
        L_0x03bb:
            r22 = r15
            r15 = 0
        L_0x03be:
            if (r15 >= r14) goto L_0x03d4
            char r1 = r2.charAt(r15)
            r25 = r13
            char r13 = r11.charAt(r15)
            if (r1 == r13) goto L_0x03cd
            goto L_0x03d6
        L_0x03cd:
            int r15 = r15 + 1
            r1 = r27
            r13 = r25
            goto L_0x03be
        L_0x03d4:
            r25 = r13
        L_0x03d6:
            r1 = 0
        L_0x03d7:
            int r13 = r14 - r15
            if (r1 >= r13) goto L_0x03f4
            int r13 = r5 + -1
            int r13 = r13 - r1
            char r13 = r2.charAt(r13)
            int r20 = r10 + -1
            r21 = r14
            int r14 = r20 - r1
            char r14 = r11.charAt(r14)
            if (r13 == r14) goto L_0x03ef
            goto L_0x03f4
        L_0x03ef:
            int r1 = r1 + 1
            r14 = r21
            goto L_0x03d7
        L_0x03f4:
            int r5 = r5 - r1
            int r5 = r5 - r15
            int r1 = r10 - r1
            int r1 = r1 - r15
            v0.p r11 = r9.f1446a
            boolean r13 = androidx.compose.ui.platform.i0.g(r11)
            if (r13 == 0) goto L_0x040f
            boolean r13 = androidx.compose.ui.platform.i0.c(r11)
            if (r13 != 0) goto L_0x040f
            boolean r13 = androidx.compose.ui.platform.i0.c(r7)
            if (r13 == 0) goto L_0x040f
            r13 = 1
            goto L_0x0410
        L_0x040f:
            r13 = 0
        L_0x0410:
            boolean r14 = androidx.compose.ui.platform.i0.g(r11)
            if (r14 == 0) goto L_0x0424
            boolean r11 = androidx.compose.ui.platform.i0.c(r11)
            if (r11 == 0) goto L_0x0424
            boolean r11 = androidx.compose.ui.platform.i0.c(r7)
            if (r11 != 0) goto L_0x0424
            r14 = 1
            goto L_0x0425
        L_0x0424:
            r14 = 0
        L_0x0425:
            if (r13 != 0) goto L_0x0451
            if (r14 == 0) goto L_0x042a
            goto L_0x0451
        L_0x042a:
            int r10 = r6.w(r8)
            r11 = 16
            android.view.accessibility.AccessibilityEvent r10 = r6.m(r10, r11)
            r10.setFromIndex(r15)
            r10.setRemovedCount(r5)
            r10.setAddedCount(r1)
            r10.setBeforeText(r2)
            java.util.List r1 = r10.getText()
            r1.add(r3)
            r15 = r6
            r2 = r7
            r1 = r8
            r17 = r9
            r26 = r23
            r5 = 32
            goto L_0x046d
        L_0x0451:
            r11 = 16
            int r1 = r6.w(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r15 = r6
            r6 = r0
            r2 = r7
            r7 = r1
            r1 = r8
            r8 = r12
            r17 = r9
            r5 = 32
            r9 = r12
            r26 = r23
            r11 = r3
            android.view.accessibility.AccessibilityEvent r10 = r6.n(r7, r8, r9, r10, r11)
        L_0x046d:
            java.lang.String r3 = "android.widget.EditText"
            r10.setClassName(r3)
            r15.x(r10)
            if (r13 != 0) goto L_0x047c
            if (r14 == 0) goto L_0x047a
            goto L_0x047c
        L_0x047a:
            r13 = 2
            goto L_0x04b4
        L_0x047c:
            v0.w<x0.h> r3 = v0.r.f16097t
            java.lang.Object r3 = r4.c(r3)
            x0.h r3 = (x0.h) r3
            long r6 = r3.f16908a
            long r8 = r6 >> r5
            int r3 = (int) r8
            r10.setFromIndex(r3)
            int r3 = x0.h.a(r6)
            r10.setToIndex(r3)
            r15.x(r10)
            goto L_0x047a
        L_0x0497:
            r2 = r7
            r1 = r8
            r17 = r9
            r25 = r13
            r22 = r15
            r26 = r23
            r5 = 32
            r15 = r6
            int r3 = r15.w(r1)
            r13 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r7 = 2048(0x800, float:2.87E-42)
            r8 = 8
            androidx.compose.ui.platform.s.z(r0, r3, r7, r6, r8)
        L_0x04b4:
            r14 = r2
            r7 = r5
            r8 = r26
            goto L_0x059a
        L_0x04ba:
            r14 = r7
            r1 = r8
            r17 = r9
            r25 = r13
            r22 = r15
            r26 = r23
            r10 = 32
            r13 = 2
            r15 = r6
            v0.w<x0.h> r6 = v0.r.f16097t
            boolean r7 = sf.j.a(r5, r6)
            int r9 = r14.f16075g
            if (r7 == 0) goto L_0x051c
            r15.getClass()
            x0.a r2 = androidx.compose.ui.platform.s.s(r4)
            if (r2 == 0) goto L_0x04e1
            java.lang.String r2 = r2.f16819a
            if (r2 != 0) goto L_0x04e0
            goto L_0x04e1
        L_0x04e0:
            r11 = r2
        L_0x04e1:
            java.lang.Object r2 = r4.c(r6)
            x0.h r2 = (x0.h) r2
            int r7 = r15.w(r1)
            long r2 = r2.f16908a
            long r5 = r2 >> r10
            int r5 = (int) r5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            int r2 = x0.h.a(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r11.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.CharSequence r11 = androidx.compose.ui.platform.s.H(r11)
            r6 = r0
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r3
            android.view.accessibility.AccessibilityEvent r3 = r6.n(r7, r8, r9, r10, r11)
            r0.x(r3)
            r0.B(r5)
            r7 = r2
            r8 = r26
            goto L_0x05fa
        L_0x051c:
            r6 = r9
            r7 = r10
            boolean r8 = sf.j.a(r5, r2)
            if (r8 == 0) goto L_0x0526
            r8 = 1
            goto L_0x052c
        L_0x0526:
            v0.w<v0.h> r8 = v0.r.f16092o
            boolean r8 = sf.j.a(r5, r8)
        L_0x052c:
            if (r8 == 0) goto L_0x0566
            s0.a0 r3 = r14.f16071c
            r15.u(r3)
            r8 = r26
            androidx.compose.ui.platform.t2 r3 = androidx.compose.ui.platform.i0.d(r1, r8)
            sf.j.c(r3)
            java.lang.Object r2 = v0.k.a(r4, r2)
            v0.h r2 = (v0.h) r2
            r3.f1470e = r2
            v0.w<v0.h> r2 = v0.r.f16092o
            java.lang.Object r2 = v0.k.a(r4, r2)
            v0.h r2 = (v0.h) r2
            r3.B = r2
            boolean r2 = r3.j()
            if (r2 != 0) goto L_0x0555
            goto L_0x059a
        L_0x0555:
            androidx.compose.ui.platform.AndroidComposeView r2 = r15.f1416d
            s0.k1 r2 = r2.getSnapshotObserver()
            androidx.compose.ui.platform.e0 r5 = new androidx.compose.ui.platform.e0
            r5.<init>(r15, r3)
            androidx.compose.ui.platform.s$h r6 = r15.F
            r2.a(r3, r6, r5)
            goto L_0x059a
        L_0x0566:
            r8 = r26
            v0.w<java.lang.Boolean> r2 = v0.r.f16089k
            boolean r2 = sf.j.a(r5, r2)
            if (r2 == 0) goto L_0x059c
            java.lang.Object r2 = r20.getValue()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Boolean"
            sf.j.d(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x058f
            int r2 = r15.w(r6)
            r3 = 8
            android.view.accessibility.AccessibilityEvent r2 = r15.m(r2, r3)
            r15.x(r2)
            goto L_0x0591
        L_0x058f:
            r3 = 8
        L_0x0591:
            int r2 = r15.w(r6)
            r5 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.s.z(r0, r2, r5, r12, r3)
        L_0x059a:
            r6 = r15
            goto L_0x05fa
        L_0x059c:
            v0.w<java.util.List<v0.d>> r2 = v0.i.f16056o
            boolean r5 = sf.j.a(r5, r2)
            if (r5 == 0) goto L_0x0609
            java.lang.Object r5 = r4.c(r2)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r2 = v0.k.a(r3, r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x05fc
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            int r6 = r5.size()
            r9 = 0
        L_0x05bc:
            if (r9 >= r6) goto L_0x05ce
            java.lang.Object r10 = r5.get(r9)
            v0.d r10 = (v0.d) r10
            r10.getClass()
            r10 = 0
            r3.add(r10)
            int r9 = r9 + 1
            goto L_0x05bc
        L_0x05ce:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            int r6 = r2.size()
            r9 = 0
        L_0x05d8:
            if (r9 >= r6) goto L_0x05ea
            java.lang.Object r10 = r2.get(r9)
            v0.d r10 = (v0.d) r10
            r10.getClass()
            r10 = 0
            r5.add(r10)
            int r9 = r9 + 1
            goto L_0x05d8
        L_0x05ea:
            boolean r2 = r3.containsAll(r5)
            if (r2 == 0) goto L_0x0650
            boolean r2 = r5.containsAll(r3)
            if (r2 != 0) goto L_0x05f7
            goto L_0x0650
        L_0x05f7:
            r6 = r15
            r19 = 0
        L_0x05fa:
            r2 = 1
            goto L_0x0654
        L_0x05fc:
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r2 = r5.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0607
            goto L_0x0650
        L_0x0607:
            r2 = 1
            goto L_0x0653
        L_0x0609:
            java.lang.Object r2 = r20.getValue()
            boolean r2 = r2 instanceof v0.a
            if (r2 == 0) goto L_0x0650
            java.lang.Object r2 = r20.getValue()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            sf.j.d(r2, r5)
            v0.a r2 = (v0.a) r2
            java.lang.Object r5 = r20.getKey()
            v0.w r5 = (v0.w) r5
            java.lang.Object r3 = v0.k.a(r3, r5)
            if (r2 != r3) goto L_0x0629
            goto L_0x064b
        L_0x0629:
            boolean r5 = r3 instanceof v0.a
            if (r5 != 0) goto L_0x062e
            goto L_0x0648
        L_0x062e:
            v0.a r3 = (v0.a) r3
            java.lang.String r5 = r3.f16036a
            java.lang.String r6 = r2.f16036a
            boolean r5 = sf.j.a(r6, r5)
            if (r5 != 0) goto L_0x063b
            goto L_0x0648
        L_0x063b:
            T r3 = r3.f16037b
            T r2 = r2.f16037b
            if (r2 != 0) goto L_0x0644
            if (r3 == 0) goto L_0x0644
            goto L_0x0648
        L_0x0644:
            if (r2 == 0) goto L_0x064b
            if (r3 != 0) goto L_0x064b
        L_0x0648:
            r2 = 1
            r10 = 0
            goto L_0x064d
        L_0x064b:
            r2 = 1
            r10 = 1
        L_0x064d:
            r19 = r10 ^ 1
            goto L_0x0653
        L_0x0650:
            r2 = 1
            r19 = r2
        L_0x0653:
            r6 = r15
        L_0x0654:
            r5 = r2
            r11 = r8
            r2 = r13
            r7 = r14
            r9 = r17
            r15 = r22
            r14 = r24
            r13 = r25
            r3 = 0
            r8 = r1
            r1 = r27
            goto L_0x01f2
        L_0x0666:
            r2 = r5
            r1 = r8
            r8 = r11
            r25 = r13
            r24 = r14
            r22 = r15
            r13 = 2
            r15 = r6
            r14 = r7
            if (r19 != 0) goto L_0x0699
            java.util.Iterator r3 = r3.iterator()
        L_0x0678:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0697
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            v0.j r5 = r14.g()
            java.lang.Object r4 = r4.getKey()
            v0.w r4 = (v0.w) r4
            boolean r4 = r5.b(r4)
            if (r4 != 0) goto L_0x0678
            r19 = r2
            goto L_0x0699
        L_0x0697:
            r19 = 0
        L_0x0699:
            if (r19 == 0) goto L_0x06a6
            int r1 = r15.w(r1)
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 8
            androidx.compose.ui.platform.s.z(r0, r1, r3, r12, r4)
        L_0x06a6:
            r1 = r27
            r5 = r2
            r11 = r8
            r2 = r13
            r6 = r15
            r15 = r22
            r14 = r24
            r13 = r25
            r3 = 0
            r4 = 0
            goto L_0x01b7
        L_0x06b6:
            r25 = r13
            r7 = 32
            o.b r1 = new o.b
            r1.<init>()
            o.b<java.lang.Integer> r2 = r0.f1433v
            r2.getClass()
            o.b$a r3 = new o.b$a
            r3.<init>()
        L_0x06c9:
            boolean r4 = r3.hasNext()
            java.util.LinkedHashMap r5 = r0.A
            if (r4 == 0) goto L_0x071b
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.Map r6 = r0.q()
            java.lang.Object r6 = r6.get(r4)
            androidx.compose.ui.platform.u2 r6 = (androidx.compose.ui.platform.u2) r6
            if (r6 == 0) goto L_0x06e6
            v0.p r6 = r6.f1476a
            goto L_0x06e7
        L_0x06e6:
            r6 = 0
        L_0x06e7:
            if (r6 == 0) goto L_0x06f5
            v0.j r6 = r6.g()
            v0.w<java.lang.String> r8 = v0.r.f16082d
            boolean r6 = r6.b(r8)
            if (r6 != 0) goto L_0x06c9
        L_0x06f5:
            r1.add(r4)
            java.lang.String r6 = "id"
            sf.j.e(r4, r6)
            int r6 = r4.intValue()
            java.lang.Object r4 = r5.get(r4)
            androidx.compose.ui.platform.s$f r4 = (androidx.compose.ui.platform.s.f) r4
            if (r4 == 0) goto L_0x0716
            v0.j r4 = r4.f1447b
            if (r4 == 0) goto L_0x0716
            v0.w<java.lang.String> r5 = v0.r.f16082d
            java.lang.Object r4 = v0.k.a(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0717
        L_0x0716:
            r4 = 0
        L_0x0717:
            r0.A(r6, r7, r4)
            goto L_0x06c9
        L_0x071b:
            int r3 = r1.f12013c
            r4 = 0
        L_0x071e:
            if (r4 >= r3) goto L_0x072a
            java.lang.Object[] r6 = r1.f12012b
            r6 = r6[r4]
            r2.remove(r6)
            int r4 = r4 + 1
            goto L_0x071e
        L_0x072a:
            r5.clear()
            java.util.Map r1 = r0.q()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0739:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x079e
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.compose.ui.platform.u2 r4 = (androidx.compose.ui.platform.u2) r4
            v0.p r4 = r4.f1476a
            v0.j r4 = r4.g()
            v0.w<java.lang.String> r6 = v0.r.f16082d
            boolean r4 = r4.b(r6)
            if (r4 == 0) goto L_0x0783
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r2.add(r4)
            if (r4 == 0) goto L_0x0783
            java.lang.Object r4 = r3.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r7 = r3.getValue()
            androidx.compose.ui.platform.u2 r7 = (androidx.compose.ui.platform.u2) r7
            v0.p r7 = r7.f1476a
            v0.j r7 = r7.f16074f
            java.lang.Object r6 = r7.c(r6)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 16
            r0.A(r4, r7, r6)
            goto L_0x0785
        L_0x0783:
            r7 = 16
        L_0x0785:
            java.lang.Object r4 = r3.getKey()
            androidx.compose.ui.platform.s$f r6 = new androidx.compose.ui.platform.s$f
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.platform.u2 r3 = (androidx.compose.ui.platform.u2) r3
            v0.p r3 = r3.f1476a
            java.util.Map r8 = r0.q()
            r6.<init>(r3, r8)
            r5.put(r4, r6)
            goto L_0x0739
        L_0x079e:
            androidx.compose.ui.platform.s$f r1 = new androidx.compose.ui.platform.s$f
            v0.q r2 = r25.getSemanticsOwner()
            v0.p r2 = r2.a()
            java.util.Map r3 = r0.q()
            r1.<init>(r2, r3)
            r0.B = r1
            r1 = 0
            r0.C = r1
            return
        L_0x07b5:
            java.lang.Object r0 = r1.f591b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.Toolbar$f r0 = r0.f895l0
            if (r0 != 0) goto L_0x07bf
            r3 = 0
            goto L_0x07c1
        L_0x07bf:
            androidx.appcompat.view.menu.h r3 = r0.f908b
        L_0x07c1:
            if (r3 == 0) goto L_0x07c6
            r3.collapseActionView()
        L_0x07c6:
            return
        L_0x07c7:
            java.lang.Object r0 = r1.f591b
            androidx.activity.ComponentActivity$e r0 = (androidx.activity.ComponentActivity.e) r0
            java.lang.Runnable r2 = r0.f559b
            if (r2 == 0) goto L_0x07d5
            r2.run()
            r2 = 0
            r0.f559b = r2
        L_0x07d5:
            return
        L_0x07d6:
            java.lang.Object r0 = r1.f591b
            wa.j0$a r0 = (wa.j0.a) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Service took too long to process intent: "
            r2.<init>(r3)
            android.content.Intent r3 = r0.f16619a
            java.lang.String r3 = r3.getAction()
            r2.append(r3)
            java.lang.String r3 = " Releasing WakeLock."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FirebaseMessaging"
            android.util.Log.w(r3, r2)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f16620b
            r2 = 0
            r0.trySetResult(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.j.run():void");
    }
}
