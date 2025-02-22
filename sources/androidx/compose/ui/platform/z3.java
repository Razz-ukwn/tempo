package androidx.compose.ui.platform;

import android.view.ViewGroup;

public final class z3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f1541a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.compose.ui.platform.WrappedComposition} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t.f0 a(androidx.compose.ui.platform.a r7, t.g0 r8, z.a r9) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r7, r0)
            java.lang.String r0 = "parent"
            sf.j.f(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.ui.platform.r1.f1409a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L_0x0045
            r0 = -1
            r4 = 6
            cg.a r0 = cb.d.d(r0, r3, r4)
            ff.j r4 = androidx.compose.ui.platform.w0.I
            java.lang.Object r4 = r4.getValue()
            jf.f r4 = (jf.f) r4
            kotlinx.coroutines.internal.e r4 = d2.f1.e(r4)
            androidx.compose.ui.platform.p1 r5 = new androidx.compose.ui.platform.p1
            r5.<init>(r0, r3)
            r6 = 3
            cb.b.D(r4, r3, r1, r5, r6)
            androidx.compose.ui.platform.q1 r4 = new androidx.compose.ui.platform.q1
            r4.<init>(r0)
            java.lang.Object r0 = b0.m.f2942c
            monitor-enter(r0)
            java.util.ArrayList r5 = b0.m.f2947h     // Catch:{ all -> 0x0042 }
            r5.add(r4)     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            b0.m.a()
            goto L_0x0045
        L_0x0042:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L_0x0045:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L_0x0056
            android.view.View r0 = r7.getChildAt(r1)
            boolean r4 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r4 == 0) goto L_0x0059
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L_0x005a
        L_0x0056:
            r7.removeAllViews()
        L_0x0059:
            r0 = r3
        L_0x005a:
            if (r0 != 0) goto L_0x0073
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r4 = r7.getContext()
            java.lang.String r5 = "context"
            sf.j.e(r4, r5)
            r0.<init>(r4)
            android.view.View r4 = r0.getView()
            android.view.ViewGroup$LayoutParams r5 = f1541a
            r7.addView((android.view.View) r4, (android.view.ViewGroup.LayoutParams) r5)
        L_0x0073:
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r7 < r4) goto L_0x0087
            androidx.compose.ui.platform.y3 r7 = androidx.compose.ui.platform.y3.f1529a
            java.util.Map r7 = r7.a(r0)
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x0087
            r1 = r2
        L_0x0087:
            if (r1 == 0) goto L_0x00b0
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r1 = 2131296897(0x7f090281, float:1.8211724E38)
            r0.setTag(r1, r7)
            androidx.compose.ui.platform.t1$a r7 = androidx.compose.ui.platform.t1.f1463a
            java.lang.Class<androidx.compose.ui.platform.t1> r7 = androidx.compose.ui.platform.t1.class
            java.lang.String r1 = "b"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)     // Catch:{ Exception -> 0x00a9 }
            r7.setAccessible(r2)     // Catch:{ Exception -> 0x00a9 }
            r7.setBoolean(r3, r2)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r7 = "Wrapper"
            java.lang.String r1 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r7, r1)
        L_0x00b0:
            s0.s1 r7 = new s0.s1
            s0.a0 r1 = r0.getRoot()
            r7.<init>(r1)
            java.lang.Object r1 = t.j0.f15129a
            t.i0 r1 = new t.i0
            r1.<init>(r8, r7)
            android.view.View r7 = r0.getView()
            r8 = 2131297473(0x7f0904c1, float:1.8212892E38)
            java.lang.Object r7 = r7.getTag(r8)
            boolean r2 = r7 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r2 == 0) goto L_0x00d2
            r3 = r7
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        L_0x00d2:
            if (r3 != 0) goto L_0x00e0
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r1)
            android.view.View r7 = r0.getView()
            r7.setTag(r8, r3)
        L_0x00e0:
            r3.x(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.z3.a(androidx.compose.ui.platform.a, t.g0, z.a):t.f0");
    }
}
