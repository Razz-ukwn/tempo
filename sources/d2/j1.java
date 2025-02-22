package d2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import d2.i0;
import d2.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

public final class j1 {

    /* renamed from: b  reason: collision with root package name */
    public static final j1 f7236b;

    /* renamed from: a  reason: collision with root package name */
    public final k f7237a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f7238a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f7239b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f7240c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f7241d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f7238a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f7239b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f7240c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(j1 j1Var) {
            super(j1Var);
        }
    }

    public static class e {
        public e() {
            this(new j1());
        }

        public final void a() {
        }

        public j1 b() {
            throw null;
        }

        public void c(v1.e eVar) {
            throw null;
        }

        public void d(v1.e eVar) {
            throw null;
        }

        public e(j1 j1Var) {
        }
    }

    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f7249h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f7250i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f7251j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f7252k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f7253l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f7254c;

        /* renamed from: d  reason: collision with root package name */
        public v1.e[] f7255d;

        /* renamed from: e  reason: collision with root package name */
        public v1.e f7256e = null;

        /* renamed from: f  reason: collision with root package name */
        public j1 f7257f;

        /* renamed from: g  reason: collision with root package name */
        public v1.e f7258g;

        public f(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var);
            this.f7254c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private v1.e s(int i8, boolean z10) {
            v1.e eVar = v1.e.f16120e;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0) {
                    v1.e t2 = t(i10, z10);
                    eVar = v1.e.a(Math.max(eVar.f16121a, t2.f16121a), Math.max(eVar.f16122b, t2.f16122b), Math.max(eVar.f16123c, t2.f16123c), Math.max(eVar.f16124d, t2.f16124d));
                }
            }
            return eVar;
        }

        private v1.e u() {
            j1 j1Var = this.f7257f;
            return j1Var != null ? j1Var.f7237a.h() : v1.e.f16120e;
        }

        private v1.e v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f7249h) {
                    x();
                }
                Method method = f7250i;
                if (!(method == null || f7251j == null || f7252k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f7252k.get(f7253l.get(invoke));
                        if (rect != null) {
                            return v1.e.a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f7250i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f7251j = cls;
                f7252k = cls.getDeclaredField("mVisibleInsets");
                f7253l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f7252k.setAccessible(true);
                f7253l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f7249h = true;
        }

        public void d(View view) {
            v1.e v3 = v(view);
            if (v3 == null) {
                v3 = v1.e.f16120e;
            }
            y(v3);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f7258g, ((f) obj).f7258g);
        }

        public v1.e f(int i8) {
            return s(i8, false);
        }

        public final v1.e j() {
            if (this.f7256e == null) {
                WindowInsets windowInsets = this.f7254c;
                this.f7256e = v1.e.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f7256e;
        }

        public j1 l(int i8, int i10, int i11, int i12) {
            j1 h3 = j1.h(this.f7254c, (View) null);
            int i13 = Build.VERSION.SDK_INT;
            e dVar = i13 >= 30 ? new d(h3) : i13 >= 29 ? new c(h3) : new b(h3);
            dVar.d(j1.e(j(), i8, i10, i11, i12));
            dVar.c(j1.e(h(), i8, i10, i11, i12));
            return dVar.b();
        }

        public boolean n() {
            return this.f7254c.isRound();
        }

        @SuppressLint({"WrongConstant"})
        public boolean o(int i8) {
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0 && !w(i10)) {
                    return false;
                }
            }
            return true;
        }

        public void p(v1.e[] eVarArr) {
            this.f7255d = eVarArr;
        }

        public void q(j1 j1Var) {
            this.f7257f = j1Var;
        }

        public v1.e t(int i8, boolean z10) {
            int i10;
            int i11 = 0;
            if (i8 == 1) {
                return z10 ? v1.e.a(0, Math.max(u().f16122b, j().f16122b), 0, 0) : v1.e.a(0, j().f16122b, 0, 0);
            }
            v1.e eVar = null;
            if (i8 != 2) {
                v1.e eVar2 = v1.e.f16120e;
                if (i8 == 8) {
                    v1.e[] eVarArr = this.f7255d;
                    if (eVarArr != null) {
                        eVar = eVarArr[3];
                    }
                    if (eVar != null) {
                        return eVar;
                    }
                    v1.e j10 = j();
                    v1.e u7 = u();
                    int i12 = j10.f16124d;
                    if (i12 > u7.f16124d) {
                        return v1.e.a(0, 0, 0, i12);
                    }
                    v1.e eVar3 = this.f7258g;
                    return (eVar3 == null || eVar3.equals(eVar2) || (i10 = this.f7258g.f16124d) <= u7.f16124d) ? eVar2 : v1.e.a(0, 0, 0, i10);
                } else if (i8 == 16) {
                    return i();
                } else {
                    if (i8 == 32) {
                        return g();
                    }
                    if (i8 == 64) {
                        return k();
                    }
                    if (i8 != 128) {
                        return eVar2;
                    }
                    j1 j1Var = this.f7257f;
                    m e10 = j1Var != null ? j1Var.f7237a.e() : e();
                    if (e10 == null) {
                        return eVar2;
                    }
                    int i13 = Build.VERSION.SDK_INT;
                    DisplayCutout displayCutout = e10.f7265a;
                    int d10 = i13 >= 28 ? m.a.d(displayCutout) : 0;
                    int f10 = i13 >= 28 ? m.a.f(displayCutout) : 0;
                    int e11 = i13 >= 28 ? m.a.e(displayCutout) : 0;
                    if (i13 >= 28) {
                        i11 = m.a.c(displayCutout);
                    }
                    return v1.e.a(d10, f10, e11, i11);
                }
            } else if (z10) {
                v1.e u10 = u();
                v1.e h3 = h();
                return v1.e.a(Math.max(u10.f16121a, h3.f16121a), 0, Math.max(u10.f16123c, h3.f16123c), Math.max(u10.f16124d, h3.f16124d));
            } else {
                v1.e j11 = j();
                j1 j1Var2 = this.f7257f;
                if (j1Var2 != null) {
                    eVar = j1Var2.f7237a.h();
                }
                int i14 = j11.f16124d;
                if (eVar != null) {
                    i14 = Math.min(i14, eVar.f16124d);
                }
                return v1.e.a(j11.f16121a, 0, j11.f16123c, i14);
            }
        }

        public boolean w(int i8) {
            if (!(i8 == 1 || i8 == 2)) {
                if (i8 == 4) {
                    return false;
                }
                if (!(i8 == 8 || i8 == 128)) {
                    return true;
                }
            }
            return !t(i8, false).equals(v1.e.f16120e);
        }

        public void y(v1.e eVar) {
            this.f7258g = eVar;
        }
    }

    public static class g extends f {
        public v1.e m = null;

        public g(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
        }

        public j1 b() {
            return j1.h(this.f7254c.consumeStableInsets(), (View) null);
        }

        public j1 c() {
            return j1.h(this.f7254c.consumeSystemWindowInsets(), (View) null);
        }

        public final v1.e h() {
            if (this.m == null) {
                WindowInsets windowInsets = this.f7254c;
                this.m = v1.e.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.m;
        }

        public boolean m() {
            return this.f7254c.isConsumed();
        }

        public void r(v1.e eVar) {
            this.m = eVar;
        }
    }

    public static class h extends g {
        public h(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
        }

        public j1 a() {
            return j1.h(this.f7254c.consumeDisplayCutout(), (View) null);
        }

        public m e() {
            DisplayCutout b10 = this.f7254c.getDisplayCutout();
            if (b10 == null) {
                return null;
            }
            return new m(b10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f7254c, hVar.f7254c) && Objects.equals(this.f7258g, hVar.f7258g);
        }

        public int hashCode() {
            return this.f7254c.hashCode();
        }
    }

    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public v1.e f7259n = null;

        /* renamed from: o  reason: collision with root package name */
        public v1.e f7260o = null;

        /* renamed from: p  reason: collision with root package name */
        public v1.e f7261p = null;

        public i(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
        }

        public v1.e g() {
            if (this.f7260o == null) {
                this.f7260o = v1.e.b(this.f7254c.getMandatorySystemGestureInsets());
            }
            return this.f7260o;
        }

        public v1.e i() {
            if (this.f7259n == null) {
                this.f7259n = v1.e.b(this.f7254c.getSystemGestureInsets());
            }
            return this.f7259n;
        }

        public v1.e k() {
            if (this.f7261p == null) {
                this.f7261p = v1.e.b(this.f7254c.getTappableElementInsets());
            }
            return this.f7261p;
        }

        public j1 l(int i8, int i10, int i11, int i12) {
            return j1.h(this.f7254c.inset(i8, i10, i11, i12), (View) null);
        }

        public void r(v1.e eVar) {
        }
    }

    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final j1 f7262q = j1.h(WindowInsets.CONSUMED, (View) null);

        public j(j1 j1Var, WindowInsets windowInsets) {
            super(j1Var, windowInsets);
        }

        public final void d(View view) {
        }

        public v1.e f(int i8) {
            return v1.e.b(this.f7254c.getInsets(l.a(i8)));
        }

        public boolean o(int i8) {
            return this.f7254c.isVisible(l.a(i8));
        }
    }

    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final j1 f7263b;

        /* renamed from: a  reason: collision with root package name */
        public final j1 f7264a;

        static {
            int i8 = Build.VERSION.SDK_INT;
            f7263b = (i8 >= 30 ? new d() : i8 >= 29 ? new c() : new b()).b().f7237a.a().f7237a.b().f7237a.c();
        }

        public k(j1 j1Var) {
            this.f7264a = j1Var;
        }

        public j1 a() {
            return this.f7264a;
        }

        public j1 b() {
            return this.f7264a;
        }

        public j1 c() {
            return this.f7264a;
        }

        public void d(View view) {
        }

        public m e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return n() == kVar.n() && m() == kVar.m() && c2.b.a(j(), kVar.j()) && c2.b.a(h(), kVar.h()) && c2.b.a(e(), kVar.e());
        }

        public v1.e f(int i8) {
            return v1.e.f16120e;
        }

        public v1.e g() {
            return j();
        }

        public v1.e h() {
            return v1.e.f16120e;
        }

        public int hashCode() {
            return c2.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public v1.e i() {
            return j();
        }

        public v1.e j() {
            return v1.e.f16120e;
        }

        public v1.e k() {
            return j();
        }

        public j1 l(int i8, int i10, int i11, int i12) {
            return f7263b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public boolean o(int i8) {
            return true;
        }

        public void p(v1.e[] eVarArr) {
        }

        public void q(j1 j1Var) {
        }

        public void r(v1.e eVar) {
        }
    }

    public static final class l {
        public static int a(int i8) {
            int i10;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i8 & i12) != 0) {
                    if (i12 == 1) {
                        i10 = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        i10 = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        i10 = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        i10 = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        i10 = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        i10 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        i10 = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        i10 = WindowInsets.Type.displayCutout();
                    }
                    i11 |= i10;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f7236b = j.f7262q;
        } else {
            f7236b = k.f7263b;
        }
    }

    public j1(WindowInsets windowInsets) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f7237a = new j(this, windowInsets);
        } else if (i8 >= 29) {
            this.f7237a = new i(this, windowInsets);
        } else if (i8 >= 28) {
            this.f7237a = new h(this, windowInsets);
        } else {
            this.f7237a = new g(this, windowInsets);
        }
    }

    public static v1.e e(v1.e eVar, int i8, int i10, int i11, int i12) {
        int max = Math.max(0, eVar.f16121a - i8);
        int max2 = Math.max(0, eVar.f16122b - i10);
        int max3 = Math.max(0, eVar.f16123c - i11);
        int max4 = Math.max(0, eVar.f16124d - i12);
        return (max == i8 && max2 == i10 && max3 == i11 && max4 == i12) ? eVar : v1.e.a(max, max2, max3, max4);
    }

    public static j1 h(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        j1 j1Var = new j1(windowInsets);
        if (view != null) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.g.b(view)) {
                j1 a10 = i0.j.a(view);
                k kVar = j1Var.f7237a;
                kVar.q(a10);
                kVar.d(view.getRootView());
            }
        }
        return j1Var;
    }

    @Deprecated
    public final int a() {
        return this.f7237a.j().f16124d;
    }

    @Deprecated
    public final int b() {
        return this.f7237a.j().f16121a;
    }

    @Deprecated
    public final int c() {
        return this.f7237a.j().f16123c;
    }

    @Deprecated
    public final int d() {
        return this.f7237a.j().f16122b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return c2.b.a(this.f7237a, ((j1) obj).f7237a);
    }

    @Deprecated
    public final j1 f(int i8, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        e dVar = i13 >= 30 ? new d(this) : i13 >= 29 ? new c(this) : new b(this);
        dVar.d(v1.e.a(i8, i10, i11, i12));
        return dVar.b();
    }

    public final WindowInsets g() {
        k kVar = this.f7237a;
        if (kVar instanceof f) {
            return ((f) kVar).f7254c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f7237a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public static class b extends e {

        /* renamed from: c  reason: collision with root package name */
        public static Field f7242c = null;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f7243d = false;

        /* renamed from: e  reason: collision with root package name */
        public static Constructor<WindowInsets> f7244e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f7245f = false;

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f7246a;

        /* renamed from: b  reason: collision with root package name */
        public v1.e f7247b;

        public b() {
            this.f7246a = e();
        }

        private static WindowInsets e() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f7243d) {
                try {
                    f7242c = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f7243d = true;
            }
            Field field = f7242c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f7245f) {
                try {
                    f7244e = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f7245f = true;
            }
            Constructor<WindowInsets> constructor = f7244e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        public j1 b() {
            a();
            j1 h3 = j1.h(this.f7246a, (View) null);
            k kVar = h3.f7237a;
            kVar.p((v1.e[]) null);
            kVar.r(this.f7247b);
            return h3;
        }

        public void c(v1.e eVar) {
            this.f7247b = eVar;
        }

        public void d(v1.e eVar) {
            WindowInsets windowInsets = this.f7246a;
            if (windowInsets != null) {
                this.f7246a = windowInsets.replaceSystemWindowInsets(eVar.f16121a, eVar.f16122b, eVar.f16123c, eVar.f16124d);
            }
        }

        public b(j1 j1Var) {
            super(j1Var);
            this.f7246a = j1Var.g();
        }
    }

    public static class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsets.Builder f7248a;

        public c() {
            this.f7248a = new WindowInsets.Builder();
        }

        public j1 b() {
            a();
            j1 h3 = j1.h(this.f7248a.build(), (View) null);
            h3.f7237a.p((v1.e[]) null);
            return h3;
        }

        public void c(v1.e eVar) {
            this.f7248a.setStableInsets(eVar.c());
        }

        public void d(v1.e eVar) {
            this.f7248a.setSystemWindowInsets(eVar.c());
        }

        public c(j1 j1Var) {
            super(j1Var);
            WindowInsets.Builder builder;
            WindowInsets g10 = j1Var.g();
            if (g10 != null) {
                builder = new WindowInsets.Builder(g10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f7248a = builder;
        }
    }

    public j1() {
        this.f7237a = new k(this);
    }
}
