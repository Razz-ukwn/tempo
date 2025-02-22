package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.d;
import o.e;
import o.g;

public final class v0 {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f1124f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public static v0 f1125g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f1126h = new a();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, g<ColorStateList>> f1127a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Context, d<WeakReference<Drawable.ConstantState>>> f1128b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1129c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1130d;

    /* renamed from: e  reason: collision with root package name */
    public b f1131e;

    public static class a extends e<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    public interface b {
    }

    public static synchronized v0 c() {
        v0 v0Var;
        synchronized (v0.class) {
            if (f1125g == null) {
                f1125g = new v0();
            }
            v0Var = f1125g;
        }
        return v0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (v0.class) {
            a aVar = f1126h;
            aVar.getClass();
            int i10 = (i8 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.c(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i8, mode);
                aVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.d(Integer.valueOf(mode.hashCode() + i10), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            d dVar = this.f1128b.get(context);
            if (dVar == null) {
                dVar = new d();
                this.f1128b.put(context, dVar);
            }
            dVar.i(new WeakReference(constantState), j10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable b(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.f1129c
            if (r0 != 0) goto L_0x000b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f1129c = r0
        L_0x000b:
            android.util.TypedValue r0 = r7.f1129c
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.d(r8, r3)
            if (r1 == 0) goto L_0x0026
            return r1
        L_0x0026:
            androidx.appcompat.widget.v0$b r1 = r7.f1131e
            if (r1 != 0) goto L_0x002b
            goto L_0x0073
        L_0x002b:
            r1 = 2131165241(0x7f070039, float:1.7944694E38)
            if (r9 != r1) goto L_0x004c
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = 2131165240(0x7f070038, float:1.7944692E38)
            android.graphics.drawable.Drawable r5 = r7.e(r8, r5)
            r6 = 0
            r1[r6] = r5
            r5 = 2131165242(0x7f07003a, float:1.7944696E38)
            android.graphics.drawable.Drawable r5 = r7.e(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L_0x0074
        L_0x004c:
            r1 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r9 != r1) goto L_0x0059
            r9 = 2131099707(0x7f06003b, float:1.7811775E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.j.a.c(r7, r8, r9)
            goto L_0x0074
        L_0x0059:
            r1 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r9 != r1) goto L_0x0066
            r9 = 2131099708(0x7f06003c, float:1.7811777E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.j.a.c(r7, r8, r9)
            goto L_0x0074
        L_0x0066:
            r1 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r9 != r1) goto L_0x0073
            r9 = 2131099709(0x7f06003d, float:1.7811779E38)
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.j.a.c(r7, r8, r9)
            goto L_0x0074
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 == 0) goto L_0x007e
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.a(r8, r3, r9)
        L_0x007e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1128b     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            o.d r0 = (o.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.g(r1, r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.j(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, int i8) {
        return f(context, i8, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9 A[Catch:{ all -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r12, int r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f1130d     // Catch:{ all -> 0x005d }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002d
        L_0x0008:
            r11.f1130d = r2     // Catch:{ all -> 0x005d }
            r0 = 2131165303(0x7f070077, float:1.794482E38)
            android.graphics.drawable.Drawable r0 = r11.e(r12, r0)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x00ea
            boolean r3 = r0 instanceof s3.g     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x002a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 == 0) goto L_0x00ea
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r11.b(r12, r13)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r0 = t1.a.f15323a     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r0 = t1.a.c.b(r12, r13)     // Catch:{ all -> 0x005d }
        L_0x0039:
            if (r0 == 0) goto L_0x00e3
            android.content.res.ColorStateList r3 = r11.h(r12, r13)     // Catch:{ all -> 0x005d }
            r4 = 0
            if (r3 == 0) goto L_0x0063
            int[] r12 = androidx.appcompat.widget.j0.f1034a     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r12 = r0.mutate()     // Catch:{ all -> 0x005d }
            w1.a.b.h(r12, r3)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.v0$b r14 = r11.f1131e     // Catch:{ all -> 0x005d }
            if (r14 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            r14 = 2131165290(0x7f07006a, float:1.7944793E38)
            if (r13 != r14) goto L_0x0057
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x005d }
        L_0x0057:
            if (r4 == 0) goto L_0x0060
            w1.a.b.i(r12, r4)     // Catch:{ all -> 0x005d }
            goto L_0x0060
        L_0x005d:
            r12 = move-exception
            goto L_0x00f4
        L_0x0060:
            r0 = r12
            goto L_0x00e3
        L_0x0063:
            androidx.appcompat.widget.v0$b r3 = r11.f1131e     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x00da
            r3 = 2131165285(0x7f070065, float:1.7944783E38)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r6 = 16908303(0x102000f, float:2.387727E-38)
            r7 = 16908288(0x1020000, float:2.387723E-38)
            r8 = 2130903375(0x7f03014f, float:1.7413566E38)
            r9 = 2130903377(0x7f030151, float:1.741357E38)
            if (r13 != r3) goto L_0x00a1
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x005d }
            int r7 = androidx.appcompat.widget.c1.c(r12, r9)     // Catch:{ all -> 0x005d }
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.j.f1025b     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.e(r3, r7, r10)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x005d }
            int r6 = androidx.appcompat.widget.c1.c(r12, r9)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.e(r3, r6, r10)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x005d }
            int r3 = androidx.appcompat.widget.c1.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.e(r1, r3, r10)     // Catch:{ all -> 0x005d }
            goto L_0x00d6
        L_0x00a1:
            r3 = 2131165276(0x7f07005c, float:1.7944765E38)
            if (r13 == r3) goto L_0x00b0
            r3 = 2131165275(0x7f07005b, float:1.7944763E38)
            if (r13 == r3) goto L_0x00b0
            r3 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r13 != r3) goto L_0x00d7
        L_0x00b0:
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x005d }
            int r7 = androidx.appcompat.widget.c1.b(r12, r9)     // Catch:{ all -> 0x005d }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.j.f1025b     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.e(r3, r7, r9)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x005d }
            int r6 = androidx.appcompat.widget.c1.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.e(r3, r6, r9)     // Catch:{ all -> 0x005d }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x005d }
            int r3 = androidx.appcompat.widget.c1.c(r12, r8)     // Catch:{ all -> 0x005d }
            androidx.appcompat.widget.j.a.e(r1, r3, r9)     // Catch:{ all -> 0x005d }
        L_0x00d6:
            r1 = r2
        L_0x00d7:
            if (r1 == 0) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            boolean r12 = r11.i(r12, r13, r0)     // Catch:{ all -> 0x005d }
            if (r12 != 0) goto L_0x00e3
            if (r14 == 0) goto L_0x00e3
            r0 = r4
        L_0x00e3:
            if (r0 == 0) goto L_0x00e8
            androidx.appcompat.widget.j0.a(r0)     // Catch:{ all -> 0x005d }
        L_0x00e8:
            monitor-exit(r11)
            return r0
        L_0x00ea:
            r11.f1130d = r1     // Catch:{ all -> 0x005d }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r13 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r12.<init>(r13)     // Catch:{ all -> 0x005d }
            throw r12     // Catch:{ all -> 0x005d }
        L_0x00f4:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList h(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.g<android.content.res.ColorStateList>> r0 = r3.f1127a     // Catch:{ all -> 0x0015 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            o.g r0 = (o.g) r0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.h(r5, r1)     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r4 = move-exception
            goto L_0x004c
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x004a
            androidx.appcompat.widget.v0$b r0 = r3.f1131e     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            androidx.appcompat.widget.j$a r0 = (androidx.appcompat.widget.j.a) r0     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch:{ all -> 0x0015 }
        L_0x0025:
            if (r1 == 0) goto L_0x0049
            java.util.WeakHashMap<android.content.Context, o.g<android.content.res.ColorStateList>> r0 = r3.f1127a     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            r3.f1127a = r0     // Catch:{ all -> 0x0015 }
        L_0x0032:
            java.util.WeakHashMap<android.content.Context, o.g<android.content.res.ColorStateList>> r0 = r3.f1127a     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            o.g r0 = (o.g) r0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0046
            o.g r0 = new o.g     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            java.util.WeakHashMap<android.content.Context, o.g<android.content.res.ColorStateList>> r2 = r3.f1127a     // Catch:{ all -> 0x0015 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0015 }
        L_0x0046:
            r0.a(r5, r1)     // Catch:{ all -> 0x0015 }
        L_0x0049:
            r0 = r1
        L_0x004a:
            monitor-exit(r3)
            return r0
        L_0x004c:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.h(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.v0$b r0 = r6.f1131e
            r1 = 0
            if (r0 == 0) goto L_0x0070
            androidx.appcompat.widget.j$a r0 = (androidx.appcompat.widget.j.a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.j.f1025b
            int[] r3 = r0.f1028a
            boolean r3 = androidx.appcompat.widget.j.a.a(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L_0x0017
            r8 = 2130903377(0x7f030151, float:1.741357E38)
            goto L_0x004a
        L_0x0017:
            int[] r3 = r0.f1030c
            boolean r3 = androidx.appcompat.widget.j.a.a(r3, r8)
            if (r3 == 0) goto L_0x0023
            r8 = 2130903375(0x7f03014f, float:1.7413566E38)
            goto L_0x004a
        L_0x0023:
            int[] r0 = r0.f1031d
            boolean r0 = androidx.appcompat.widget.j.a.a(r0, r8)
            if (r0 == 0) goto L_0x002e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0047
        L_0x002e:
            r0 = 2131165262(0x7f07004e, float:1.7944736E38)
            if (r8 != r0) goto L_0x0042
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L_0x0052
        L_0x0042:
            r0 = 2131165244(0x7f07003c, float:1.79447E38)
            if (r8 != r0) goto L_0x004d
        L_0x0047:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L_0x004a:
            r0 = r8
            r8 = r4
            goto L_0x004f
        L_0x004d:
            r8 = r1
            r0 = r8
        L_0x004f:
            r3 = r2
            r2 = r0
            r0 = r5
        L_0x0052:
            if (r8 == 0) goto L_0x006c
            int[] r8 = androidx.appcompat.widget.j0.f1034a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.c1.c(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L_0x006a
            r8.setAlpha(r0)
        L_0x006a:
            r7 = r4
            goto L_0x006d
        L_0x006c:
            r7 = r1
        L_0x006d:
            if (r7 == 0) goto L_0x0070
            r1 = r4
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
