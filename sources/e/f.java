package e;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.q1;
import androidx.appcompat.widget.v0;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.e1;
import d2.f1;
import d2.i0;
import e.t;
import e.v;
import h.a;
import h.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import y1.h;

public final class f extends e implements f.a, LayoutInflater.Factory2 {
    public static final o.f<String, Integer> E0 = new o.f<>();
    public static final int[] F0 = {16842836};
    public static final boolean G0 = (!"robolectric".equals(Build.FINGERPRINT));
    public static final boolean H0 = true;
    public Rect A0;
    public o B0;
    public OnBackInvokedDispatcher C0;
    public OnBackInvokedCallback D0;
    public final Object F;
    public final Context G;
    public Window H;
    public g I;
    public final d J;
    public a K;
    public h.f L;
    public CharSequence M;
    public h0 N;
    public c O;
    public m P;
    public h.a Q;
    public ActionBarContextView R;
    public PopupWindow S;
    public i T;
    public d1 U = null;
    public final boolean V = true;
    public boolean W;
    public ViewGroup X;
    public TextView Y;
    public View Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f7621a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7622b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f7623c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f7624d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7625e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7626f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7627g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7628h0;

    /* renamed from: i0  reason: collision with root package name */
    public l[] f7629i0;

    /* renamed from: j0  reason: collision with root package name */
    public l f7630j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7631k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7632l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f7633m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f7634n0;

    /* renamed from: o0  reason: collision with root package name */
    public Configuration f7635o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f7636p0 = -100;

    /* renamed from: q0  reason: collision with root package name */
    public int f7637q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f7638r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f7639s0;

    /* renamed from: t0  reason: collision with root package name */
    public j f7640t0;

    /* renamed from: u0  reason: collision with root package name */
    public h f7641u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f7642v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f7643w0;

    /* renamed from: x0  reason: collision with root package name */
    public final a f7644x0 = new a();

    /* renamed from: y0  reason: collision with root package name */
    public boolean f7645y0;

    /* renamed from: z0  reason: collision with root package name */
    public Rect f7646z0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            f fVar = f.this;
            if ((fVar.f7643w0 & 1) != 0) {
                fVar.I(0);
            }
            if ((fVar.f7643w0 & 4096) != 0) {
                fVar.I(108);
            }
            fVar.f7642v0 = false;
            fVar.f7643w0 = 0;
        }
    }

    public interface b {
    }

    public final class c implements j.a {
        public c() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            f.this.E(fVar);
        }

        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback N = f.this.N();
            if (N == null) {
                return true;
            }
            N.onMenuOpened(108, fVar);
            return true;
        }
    }

    public class d implements a.C0162a {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0162a f7649a;

        public class a extends f1 {
            public a() {
            }

            public final void a() {
                d dVar = d.this;
                f.this.R.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.S;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.R.getParent() instanceof View) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.h.c((View) fVar.R.getParent());
                }
                fVar.R.h();
                fVar.U.d((e1) null);
                fVar.U = null;
                ViewGroup viewGroup = fVar.X;
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                i0.h.c(viewGroup);
            }
        }

        public d(e.a aVar) {
            this.f7649a = aVar;
        }

        public final boolean a(h.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = f.this.X;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.h.c(viewGroup);
            return this.f7649a.a(aVar, fVar);
        }

        public final boolean b(h.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f7649a.b(aVar, fVar);
        }

        public final boolean c(h.a aVar, MenuItem menuItem) {
            return this.f7649a.c(aVar, menuItem);
        }

        public final void d(h.a aVar) {
            this.f7649a.d(aVar);
            f fVar = f.this;
            if (fVar.S != null) {
                fVar.H.getDecorView().removeCallbacks(fVar.T);
            }
            if (fVar.R != null) {
                d1 d1Var = fVar.U;
                if (d1Var != null) {
                    d1Var.b();
                }
                d1 a10 = i0.a(fVar.R);
                a10.a(0.0f);
                fVar.U = a10;
                a10.d(new a());
            }
            d dVar = fVar.J;
            if (dVar != null) {
                dVar.z();
            }
            fVar.Q = null;
            ViewGroup viewGroup = fVar.X;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.h.c(viewGroup);
            fVar.V();
        }
    }

    public static class e {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static y1.h b(Configuration configuration) {
            return y1.h.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(y1.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.f17119a.a()));
        }

        public static void d(Configuration configuration, y1.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.f17119a.a()));
        }
    }

    /* renamed from: e.f$f  reason: collision with other inner class name */
    public static class C0127f {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, f fVar) {
            Objects.requireNonNull(fVar);
            k kVar = new k(fVar);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, kVar);
            return kVar;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class g extends h.h {

        /* renamed from: b  reason: collision with root package name */
        public b f7651b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7652c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f7653d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7654e;

        public g(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public final void a(Window.Callback callback) {
            try {
                this.f7652c = true;
                callback.onContentChanged();
                this.f7652c = false;
            } catch (Throwable th) {
                this.f7652c = false;
                throw th;
            }
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f7653d ? this.f9061a.dispatchKeyEvent(keyEvent) : f.this.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
            if (r6 != false) goto L_0x0048;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L_0x004f
                int r0 = r6.getKeyCode()
                e.f r2 = e.f.this
                r2.O()
                e.a r3 = r2.K
                r4 = 0
                if (r3 == 0) goto L_0x001c
                boolean r0 = r3.j(r0, r6)
                if (r0 == 0) goto L_0x001c
                goto L_0x0048
            L_0x001c:
                e.f$l r0 = r2.f7630j0
                if (r0 == 0) goto L_0x0031
                int r3 = r6.getKeyCode()
                boolean r0 = r2.S(r0, r3, r6)
                if (r0 == 0) goto L_0x0031
                e.f$l r6 = r2.f7630j0
                if (r6 == 0) goto L_0x0048
                r6.f7673l = r1
                goto L_0x0048
            L_0x0031:
                e.f$l r0 = r2.f7630j0
                if (r0 != 0) goto L_0x004a
                e.f$l r0 = r2.M(r4)
                r2.T(r0, r6)
                int r3 = r6.getKeyCode()
                boolean r6 = r2.S(r0, r3, r6)
                r0.f7672k = r4
                if (r6 == 0) goto L_0x004a
            L_0x0048:
                r6 = r1
                goto L_0x004b
            L_0x004a:
                r6 = r4
            L_0x004b:
                if (r6 == 0) goto L_0x004e
                goto L_0x004f
            L_0x004e:
                r1 = r4
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.g.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
            if (this.f7652c) {
                this.f9061a.onContentChanged();
            }
        }

        public final boolean onCreatePanelMenu(int i8, Menu menu) {
            if (i8 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i8, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i8) {
            b bVar = this.f7651b;
            if (bVar != null) {
                View view = i8 == 0 ? new View(t.this.f7706a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i8);
        }

        public final boolean onMenuOpened(int i8, Menu menu) {
            super.onMenuOpened(i8, menu);
            f fVar = f.this;
            if (i8 == 108) {
                fVar.O();
                a aVar = fVar.K;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                fVar.getClass();
            }
            return true;
        }

        public final void onPanelClosed(int i8, Menu menu) {
            if (this.f7654e) {
                this.f9061a.onPanelClosed(i8, menu);
                return;
            }
            super.onPanelClosed(i8, menu);
            f fVar = f.this;
            if (i8 == 108) {
                fVar.O();
                a aVar = fVar.K;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i8 == 0) {
                l M = fVar.M(i8);
                if (M.m) {
                    fVar.F(M, false);
                }
            } else {
                fVar.getClass();
            }
        }

        public final boolean onPreparePanel(int i8, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i8 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f744x = true;
            }
            b bVar = this.f7651b;
            if (bVar != null) {
                t.e eVar = (t.e) bVar;
                if (i8 == 0) {
                    t tVar = t.this;
                    if (!tVar.f7709d) {
                        tVar.f7706a.m = true;
                        tVar.f7709d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i8, view, menu);
            if (fVar != null) {
                fVar.f744x = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i8) {
            androidx.appcompat.view.menu.f fVar = f.this.M(0).f7669h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i8);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i8);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0142, code lost:
            if (d2.i0.g.c(r10) != false) goto L_0x0146;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
            /*
                r9 = this;
                e.f r0 = e.f.this
                boolean r1 = r0.V
                if (r1 == 0) goto L_0x01b3
                if (r11 == 0) goto L_0x000a
                goto L_0x01b3
            L_0x000a:
                h.e$a r11 = new h.e$a
                android.content.Context r1 = r0.G
                r11.<init>(r1, r10)
                h.a r10 = r0.Q
                if (r10 == 0) goto L_0x0018
                r10.c()
            L_0x0018:
                e.f$d r10 = new e.f$d
                r10.<init>(r11)
                r0.O()
                e.a r1 = r0.K
                e.d r2 = r0.J
                if (r1 == 0) goto L_0x0033
                h.a r1 = r1.u(r10)
                r0.Q = r1
                if (r1 == 0) goto L_0x0033
                if (r2 == 0) goto L_0x0033
                r2.D()
            L_0x0033:
                h.a r1 = r0.Q
                r3 = 0
                if (r1 != 0) goto L_0x01a7
                d2.d1 r1 = r0.U
                if (r1 == 0) goto L_0x003f
                r1.b()
            L_0x003f:
                h.a r1 = r0.Q
                if (r1 == 0) goto L_0x0046
                r1.c()
            L_0x0046:
                if (r2 == 0) goto L_0x004f
                boolean r1 = r0.f7634n0
                if (r1 != 0) goto L_0x004f
                r2.t()     // Catch:{ AbstractMethodError -> 0x004f }
            L_0x004f:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.R
                r4 = 1
                r5 = 0
                if (r1 != 0) goto L_0x0105
                boolean r1 = r0.f7626f0
                android.content.Context r6 = r0.G
                if (r1 == 0) goto L_0x00d8
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130903052(0x7f03000c, float:1.7412911E38)
                r7.resolveAttribute(r8, r1, r4)
                int r8 = r1.resourceId
                if (r8 == 0) goto L_0x008b
                android.content.res.Resources r8 = r6.getResources()
                android.content.res.Resources$Theme r8 = r8.newTheme()
                r8.setTo(r7)
                int r7 = r1.resourceId
                r8.applyStyle(r7, r4)
                h.c r7 = new h.c
                r7.<init>((android.content.Context) r6, (int) r5)
                android.content.res.Resources$Theme r6 = r7.getTheme()
                r6.setTo(r8)
                r6 = r7
            L_0x008b:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6, r3)
                r0.R = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                r8 = 2130903067(0x7f03001b, float:1.7412942E38)
                r7.<init>(r6, r3, r8)
                r0.S = r7
                r8 = 2
                h2.k.d(r7, r8)
                android.widget.PopupWindow r7 = r0.S
                androidx.appcompat.widget.ActionBarContextView r8 = r0.R
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r0.S
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130903046(0x7f030006, float:1.7412899E38)
                r7.resolveAttribute(r8, r1, r4)
                int r1 = r1.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r0.R
                r6.setContentHeight(r1)
                android.widget.PopupWindow r1 = r0.S
                r6 = -2
                r1.setHeight(r6)
                e.i r1 = new e.i
                r1.<init>(r0)
                r0.T = r1
                goto L_0x0105
            L_0x00d8:
                android.view.ViewGroup r1 = r0.X
                r7 = 2131296429(0x7f0900ad, float:1.8210774E38)
                android.view.View r1 = r1.findViewById(r7)
                androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
                if (r1 == 0) goto L_0x0105
                r0.O()
                e.a r7 = r0.K
                if (r7 == 0) goto L_0x00f1
                android.content.Context r7 = r7.e()
                goto L_0x00f2
            L_0x00f1:
                r7 = r3
            L_0x00f2:
                if (r7 != 0) goto L_0x00f5
                goto L_0x00f6
            L_0x00f5:
                r6 = r7
            L_0x00f6:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r1.setLayoutInflater(r6)
                android.view.View r1 = r1.a()
                androidx.appcompat.widget.ActionBarContextView r1 = (androidx.appcompat.widget.ActionBarContextView) r1
                r0.R = r1
            L_0x0105:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.R
                if (r1 == 0) goto L_0x0197
                d2.d1 r1 = r0.U
                if (r1 == 0) goto L_0x0110
                r1.b()
            L_0x0110:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.R
                r1.h()
                h.d r1 = new h.d
                androidx.appcompat.widget.ActionBarContextView r6 = r0.R
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r0.R
                r1.<init>(r6, r7, r10)
                androidx.appcompat.view.menu.f r6 = r1.D
                boolean r10 = r10.b(r1, r6)
                if (r10 == 0) goto L_0x0195
                r1.i()
                androidx.appcompat.widget.ActionBarContextView r10 = r0.R
                r10.f(r1)
                r0.Q = r1
                boolean r10 = r0.W
                if (r10 == 0) goto L_0x0145
                android.view.ViewGroup r10 = r0.X
                if (r10 == 0) goto L_0x0145
                java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
                boolean r10 = d2.i0.g.c(r10)
                if (r10 == 0) goto L_0x0145
                goto L_0x0146
            L_0x0145:
                r4 = r5
            L_0x0146:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r4 == 0) goto L_0x0164
                androidx.appcompat.widget.ActionBarContextView r1 = r0.R
                r4 = 0
                r1.setAlpha(r4)
                androidx.appcompat.widget.ActionBarContextView r1 = r0.R
                d2.d1 r1 = d2.i0.a(r1)
                r1.a(r10)
                r0.U = r1
                e.j r10 = new e.j
                r10.<init>(r0)
                r1.d(r10)
                goto L_0x0185
            L_0x0164:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.R
                r1.setAlpha(r10)
                androidx.appcompat.widget.ActionBarContextView r10 = r0.R
                r10.setVisibility(r5)
                androidx.appcompat.widget.ActionBarContextView r10 = r0.R
                android.view.ViewParent r10 = r10.getParent()
                boolean r10 = r10 instanceof android.view.View
                if (r10 == 0) goto L_0x0185
                androidx.appcompat.widget.ActionBarContextView r10 = r0.R
                android.view.ViewParent r10 = r10.getParent()
                android.view.View r10 = (android.view.View) r10
                java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
                d2.i0.h.c(r10)
            L_0x0185:
                android.widget.PopupWindow r10 = r0.S
                if (r10 == 0) goto L_0x0197
                android.view.Window r10 = r0.H
                android.view.View r10 = r10.getDecorView()
                e.i r1 = r0.T
                r10.post(r1)
                goto L_0x0197
            L_0x0195:
                r0.Q = r3
            L_0x0197:
                h.a r10 = r0.Q
                if (r10 == 0) goto L_0x01a0
                if (r2 == 0) goto L_0x01a0
                r2.D()
            L_0x01a0:
                r0.V()
                h.a r10 = r0.Q
                r0.Q = r10
            L_0x01a7:
                r0.V()
                h.a r10 = r0.Q
                if (r10 == 0) goto L_0x01b2
                h.e r3 = r11.e(r10)
            L_0x01b2:
                return r3
            L_0x01b3:
                android.view.ActionMode r10 = super.onWindowStartingActionMode(r10, r11)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.g.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
        }
    }

    public class h extends i {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f7655c;

        public h(Context context) {
            super();
            this.f7655c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public final int c() {
            return this.f7655c.isPowerSaveMode() ? 2 : 1;
        }

        public final void d() {
            f.this.A(true, true);
        }
    }

    public abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public a f7657a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public final void onReceive(Context context, Intent intent) {
                i.this.d();
            }
        }

        public i() {
        }

        public final void a() {
            a aVar = this.f7657a;
            if (aVar != null) {
                try {
                    f.this.G.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f7657a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f7657a == null) {
                    this.f7657a = new a();
                }
                f.this.G.registerReceiver(this.f7657a, b10);
            }
        }
    }

    public class j extends i {

        /* renamed from: c  reason: collision with root package name */
        public final v f7660c;

        public j(v vVar) {
            super();
            this.f7660c = vVar;
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public final int c() {
            boolean z10;
            Location location;
            long j10;
            Location location2;
            v vVar = this.f7660c;
            v.a aVar = vVar.f7727c;
            boolean z11 = false;
            if (aVar.f7729b > System.currentTimeMillis()) {
                z10 = aVar.f7728a;
            } else {
                Context context = vVar.f7725a;
                int s10 = cb.d.s(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = vVar.f7726b;
                if (s10 == 0) {
                    try {
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (cb.d.s(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (u.f7720d == null) {
                        u.f7720d = new u();
                    }
                    u uVar = u.f7720d;
                    u uVar2 = uVar;
                    uVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                    uVar2.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                    if (uVar.f7723c == 1) {
                        z11 = true;
                    }
                    long j11 = uVar.f7722b;
                    long j12 = uVar.f7721a;
                    long j13 = j11;
                    uVar.a(location.getLatitude(), location.getLongitude(), 86400000 + currentTimeMillis);
                    long j14 = uVar.f7722b;
                    if (j13 == -1 || j12 == -1) {
                        j10 = 43200000 + currentTimeMillis;
                    } else {
                        j10 = (currentTimeMillis > j12 ? j14 + 0 : currentTimeMillis > j13 ? j12 + 0 : j13 + 0) + 60000;
                    }
                    aVar.f7728a = z11;
                    aVar.f7729b = j10;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i8 = Calendar.getInstance().get(11);
                    if (i8 < 6 || i8 >= 22) {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            return z10 ? 2 : 1;
        }

        public final void d() {
            f.this.A(true, true);
        }
    }

    public class k extends ContentFrameLayout {
        public k(h.c cVar) {
            super(cVar, (AttributeSet) null);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    f fVar = f.this;
                    fVar.F(fVar.M(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i8) {
            setBackgroundDrawable(f.a.a(getContext(), i8));
        }
    }

    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        public final int f7662a;

        /* renamed from: b  reason: collision with root package name */
        public int f7663b;

        /* renamed from: c  reason: collision with root package name */
        public int f7664c;

        /* renamed from: d  reason: collision with root package name */
        public int f7665d;

        /* renamed from: e  reason: collision with root package name */
        public k f7666e;

        /* renamed from: f  reason: collision with root package name */
        public View f7667f;

        /* renamed from: g  reason: collision with root package name */
        public View f7668g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f7669h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f7670i;

        /* renamed from: j  reason: collision with root package name */
        public h.c f7671j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f7672k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f7673l;
        public boolean m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f7674n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f7675o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f7676p;

        public l(int i8) {
            this.f7662a = i8;
        }
    }

    public final class m implements j.a {
        public m() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            l lVar;
            androidx.appcompat.view.menu.f k10 = fVar.k();
            int i8 = 0;
            boolean z11 = k10 != fVar;
            if (z11) {
                fVar = k10;
            }
            f fVar2 = f.this;
            l[] lVarArr = fVar2.f7629i0;
            int length = lVarArr != null ? lVarArr.length : 0;
            while (true) {
                if (i8 < length) {
                    lVar = lVarArr[i8];
                    if (lVar != null && lVar.f7669h == fVar) {
                        break;
                    }
                    i8++;
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar == null) {
                return;
            }
            if (z11) {
                fVar2.D(lVar.f7662a, lVar, k10);
                fVar2.F(lVar, true);
                return;
            }
            fVar2.F(lVar, z10);
        }

        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback N;
            if (fVar != fVar.k()) {
                return true;
            }
            f fVar2 = f.this;
            if (!fVar2.f7623c0 || (N = fVar2.N()) == null || fVar2.f7634n0) {
                return true;
            }
            N.onMenuOpened(108, fVar);
            return true;
        }
    }

    public f(Context context, Window window, d dVar, Object obj) {
        o.f<String, Integer> fVar;
        Integer orDefault;
        androidx.appcompat.app.c cVar;
        this.G = context;
        this.J = dVar;
        this.F = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof androidx.appcompat.app.c)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        cVar = (androidx.appcompat.app.c) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            cVar = null;
            if (cVar != null) {
                this.f7636p0 = cVar.K().g();
            }
        }
        if (this.f7636p0 == -100 && (orDefault = fVar.getOrDefault(this.F.getClass().getName(), null)) != null) {
            this.f7636p0 = orDefault.intValue();
            (fVar = E0).remove(this.F.getClass().getName());
        }
        if (window != null) {
            B(window);
        }
        androidx.appcompat.widget.j.d();
    }

    public static y1.h C(Context context) {
        y1.h hVar;
        y1.h hVar2;
        if (Build.VERSION.SDK_INT >= 33 || (hVar = e.f7618c) == null) {
            return null;
        }
        y1.h b10 = e.b(context.getApplicationContext().getResources().getConfiguration());
        y1.i iVar = hVar.f17119a;
        if (iVar.isEmpty()) {
            hVar2 = y1.h.f17118b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i8 = 0;
            while (true) {
                if (i8 >= b10.f17119a.size() + iVar.size()) {
                    break;
                }
                Locale locale = i8 < iVar.size() ? iVar.get(i8) : b10.f17119a.get(i8 - iVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i8++;
            }
            hVar2 = new y1.h(new y1.j(h.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return hVar2.f17119a.isEmpty() ? b10 : hVar2;
    }

    public static Configuration G(Context context, int i8, y1.h hVar, Configuration configuration, boolean z10) {
        int i10 = i8 != 1 ? i8 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & -49);
        if (hVar != null) {
            e.d(configuration2, hVar);
        }
        return configuration2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A(boolean r12, boolean r13) {
        /*
            r11 = this;
            boolean r0 = r11.f7634n0
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = -100
            int r2 = r11.f7636p0
            if (r2 == r0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r2 = e.e.f7617b
        L_0x000f:
            android.content.Context r0 = r11.G
            int r3 = r11.P(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L_0x0021
            y1.h r5 = C(r0)
            goto L_0x0022
        L_0x0021:
            r5 = r6
        L_0x0022:
            if (r13 != 0) goto L_0x0032
            if (r5 == 0) goto L_0x0032
            android.content.res.Resources r13 = r0.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            y1.h r5 = e.f.e.b(r13)
        L_0x0032:
            android.content.res.Configuration r13 = G(r0, r3, r5, r6, r1)
            boolean r3 = r11.f7639s0
            r7 = 1
            java.lang.Object r8 = r11.F
            if (r3 != 0) goto L_0x0070
            boolean r3 = r8 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0070
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            if (r3 != 0) goto L_0x0049
            r3 = r1
            goto L_0x0074
        L_0x0049:
            r9 = 29
            if (r4 < r9) goto L_0x0050
            r4 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0052
        L_0x0050:
            r4 = 786432(0xc0000, float:1.102026E-39)
        L_0x0052:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0066 }
            java.lang.Class r10 = r8.getClass()     // Catch:{ NameNotFoundException -> 0x0066 }
            r9.<init>(r0, r10)     // Catch:{ NameNotFoundException -> 0x0066 }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r9, r4)     // Catch:{ NameNotFoundException -> 0x0066 }
            if (r3 == 0) goto L_0x0070
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x0066 }
            r11.f7638r0 = r3     // Catch:{ NameNotFoundException -> 0x0066 }
            goto L_0x0070
        L_0x0066:
            r3 = move-exception
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r4, r9, r3)
            r11.f7638r0 = r1
        L_0x0070:
            r11.f7639s0 = r7
            int r3 = r11.f7638r0
        L_0x0074:
            android.content.res.Configuration r4 = r11.f7635o0
            if (r4 != 0) goto L_0x0080
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L_0x0080:
            int r9 = r4.uiMode
            r9 = r9 & 48
            int r10 = r13.uiMode
            r10 = r10 & 48
            y1.h r4 = e.f.e.b(r4)
            if (r5 != 0) goto L_0x0090
            r13 = r6
            goto L_0x0094
        L_0x0090:
            y1.h r13 = e.f.e.b(r13)
        L_0x0094:
            if (r9 == r10) goto L_0x0099
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x009a
        L_0x0099:
            r5 = r1
        L_0x009a:
            if (r13 == 0) goto L_0x00a6
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto L_0x00a6
            r4 = r5 | 4
            r5 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            int r4 = ~r3
            r4 = r4 & r5
            if (r4 == 0) goto L_0x00e4
            if (r12 == 0) goto L_0x00e4
            boolean r12 = r11.f7632l0
            if (r12 == 0) goto L_0x00e4
            boolean r12 = G0
            if (r12 != 0) goto L_0x00b8
            boolean r12 = r11.f7633m0
            if (r12 == 0) goto L_0x00e4
        L_0x00b8:
            boolean r12 = r8 instanceof android.app.Activity
            if (r12 == 0) goto L_0x00e4
            r12 = r8
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r4 = r12.isChild()
            if (r4 != 0) goto L_0x00e4
            int r4 = s1.a.f14472c
            int r4 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r4 < r9) goto L_0x00d1
            r12.recreate()
            goto L_0x00e2
        L_0x00d1:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r9 = r12.getMainLooper()
            r4.<init>(r9)
            androidx.appcompat.widget.i1 r9 = new androidx.appcompat.widget.i1
            r9.<init>(r12, r7)
            r4.post(r9)
        L_0x00e2:
            r12 = r7
            goto L_0x00e5
        L_0x00e4:
            r12 = r1
        L_0x00e5:
            if (r12 != 0) goto L_0x0153
            if (r5 == 0) goto L_0x0153
            r12 = r5 & r3
            if (r12 != r5) goto L_0x00ef
            r12 = r7
            goto L_0x00f0
        L_0x00ef:
            r12 = r1
        L_0x00f0:
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r4 = new android.content.res.Configuration
            android.content.res.Configuration r9 = r3.getConfiguration()
            r4.<init>(r9)
            android.content.res.Configuration r9 = r3.getConfiguration()
            int r9 = r9.uiMode
            r9 = r9 & -49
            r9 = r9 | r10
            r4.uiMode = r9
            if (r13 == 0) goto L_0x010d
            e.f.e.d(r4, r13)
        L_0x010d:
            r3.updateConfiguration(r4, r6)
            int r3 = r11.f7637q0
            if (r3 == 0) goto L_0x0120
            r0.setTheme(r3)
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int r6 = r11.f7637q0
            r3.applyStyle(r6, r7)
        L_0x0120:
            if (r12 == 0) goto L_0x0154
            boolean r12 = r8 instanceof android.app.Activity
            if (r12 == 0) goto L_0x0154
            r12 = r8
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r3 = r12 instanceof androidx.lifecycle.p
            if (r3 == 0) goto L_0x0147
            r3 = r12
            androidx.lifecycle.p r3 = (androidx.lifecycle.p) r3
            androidx.lifecycle.j r3 = r3.b()
            androidx.lifecycle.j$b r3 = r3.b()
            androidx.lifecycle.j$b r6 = androidx.lifecycle.j.b.f2279c
            int r3 = r3.compareTo(r6)
            if (r3 < 0) goto L_0x0141
            r1 = r7
        L_0x0141:
            if (r1 == 0) goto L_0x0154
            r12.onConfigurationChanged(r4)
            goto L_0x0154
        L_0x0147:
            boolean r1 = r11.f7633m0
            if (r1 == 0) goto L_0x0154
            boolean r1 = r11.f7634n0
            if (r1 != 0) goto L_0x0154
            r12.onConfigurationChanged(r4)
            goto L_0x0154
        L_0x0153:
            r7 = r12
        L_0x0154:
            if (r7 == 0) goto L_0x016d
            boolean r12 = r8 instanceof androidx.appcompat.app.c
            if (r12 == 0) goto L_0x016d
            r12 = r5 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0164
            r12 = r8
            androidx.appcompat.app.c r12 = (androidx.appcompat.app.c) r12
            r12.getClass()
        L_0x0164:
            r12 = r5 & 4
            if (r12 == 0) goto L_0x016d
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.c) r8
            r8.getClass()
        L_0x016d:
            if (r7 == 0) goto L_0x0180
            if (r13 == 0) goto L_0x0180
            android.content.res.Resources r12 = r0.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            y1.h r12 = e.f.e.b(r12)
            e.f.e.c(r12)
        L_0x0180:
            if (r2 != 0) goto L_0x018a
            e.f$i r12 = r11.L(r0)
            r12.e()
            goto L_0x0191
        L_0x018a:
            e.f$j r12 = r11.f7640t0
            if (r12 == 0) goto L_0x0191
            r12.a()
        L_0x0191:
            r12 = 3
            if (r2 != r12) goto L_0x01a5
            e.f$h r12 = r11.f7641u0
            if (r12 != 0) goto L_0x019f
            e.f$h r12 = new e.f$h
            r12.<init>(r0)
            r11.f7641u0 = r12
        L_0x019f:
            e.f$h r12 = r11.f7641u0
            r12.e()
            goto L_0x01ac
        L_0x01a5:
            e.f$h r12 = r11.f7641u0
            if (r12 == 0) goto L_0x01ac
            r12.a()
        L_0x01ac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.A(boolean, boolean):boolean");
    }

    public final void B(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.H == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof g)) {
                g gVar = new g(callback);
                this.I = gVar;
                window.setCallback(gVar);
                Context context = this.G;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, F0);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    androidx.appcompat.widget.j a10 = androidx.appcompat.widget.j.a();
                    synchronized (a10) {
                        drawable = a10.f1027a.f(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.H = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.C0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.D0) == null)) {
                        C0127f.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.D0 = null;
                    }
                    Object obj = this.F;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.C0 = C0127f.a(activity);
                            V();
                            return;
                        }
                    }
                    this.C0 = null;
                    V();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void D(int i8, l lVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (lVar == null && i8 >= 0) {
                l[] lVarArr = this.f7629i0;
                if (i8 < lVarArr.length) {
                    lVar = lVarArr[i8];
                }
            }
            if (lVar != null) {
                fVar = lVar.f7669h;
            }
        }
        if ((lVar == null || lVar.m) && !this.f7634n0) {
            g gVar = this.I;
            Window.Callback callback = this.H.getCallback();
            gVar.getClass();
            try {
                gVar.f7654e = true;
                callback.onPanelClosed(i8, fVar);
                gVar.f7654e = false;
            } catch (Throwable th) {
                gVar.f7654e = false;
                throw th;
            }
        }
    }

    public final void E(androidx.appcompat.view.menu.f fVar) {
        if (!this.f7628h0) {
            this.f7628h0 = true;
            this.N.i();
            Window.Callback N2 = N();
            if (N2 != null && !this.f7634n0) {
                N2.onPanelClosed(108, fVar);
            }
            this.f7628h0 = false;
        }
    }

    public final void F(l lVar, boolean z10) {
        k kVar;
        h0 h0Var;
        if (!z10 || lVar.f7662a != 0 || (h0Var = this.N) == null || !h0Var.a()) {
            WindowManager windowManager = (WindowManager) this.G.getSystemService("window");
            if (!(windowManager == null || !lVar.m || (kVar = lVar.f7666e) == null)) {
                windowManager.removeView(kVar);
                if (z10) {
                    D(lVar.f7662a, lVar, (androidx.appcompat.view.menu.f) null);
                }
            }
            lVar.f7672k = false;
            lVar.f7673l = false;
            lVar.m = false;
            lVar.f7667f = null;
            lVar.f7674n = true;
            if (this.f7630j0 == lVar) {
                this.f7630j0 = null;
            }
            if (lVar.f7662a == 0) {
                V();
                return;
            }
            return;
        }
        E(lVar.f7669h);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.F
            boolean r1 = r0 instanceof d2.o.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof e.m
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.H
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = d2.o.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            r3 = 0
            if (r0 != r1) goto L_0x003d
            e.f$g r0 = r6.I
            android.view.Window r4 = r6.H
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f7653d = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f7653d = r3
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f7653d = r3
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            if (r4 != 0) goto L_0x0049
            r4 = r2
            goto L_0x004a
        L_0x0049:
            r4 = r3
        L_0x004a:
            r5 = 4
            if (r4 == 0) goto L_0x0074
            if (r0 == r5) goto L_0x0066
            if (r0 == r1) goto L_0x0053
            goto L_0x0103
        L_0x0053:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0104
            e.f$l r0 = r6.M(r3)
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x0104
            r6.T(r0, r7)
            goto L_0x0104
        L_0x0066:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            r6.f7631k0 = r2
            goto L_0x0103
        L_0x0074:
            if (r0 == r5) goto L_0x00fc
            if (r0 == r1) goto L_0x007a
            goto L_0x0103
        L_0x007a:
            h.a r0 = r6.Q
            if (r0 == 0) goto L_0x0080
            goto L_0x0104
        L_0x0080:
            e.f$l r0 = r6.M(r3)
            androidx.appcompat.widget.h0 r1 = r6.N
            android.content.Context r4 = r6.G
            if (r1 == 0) goto L_0x00ba
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00ba
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r4)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ba
            androidx.appcompat.widget.h0 r1 = r6.N
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r6.f7634n0
            if (r1 != 0) goto L_0x00da
            boolean r7 = r6.T(r0, r7)
            if (r7 == 0) goto L_0x00da
            androidx.appcompat.widget.h0 r7 = r6.N
            boolean r7 = r7.g()
            goto L_0x00e0
        L_0x00b3:
            androidx.appcompat.widget.h0 r7 = r6.N
            boolean r7 = r7.f()
            goto L_0x00e0
        L_0x00ba:
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x00dc
            boolean r5 = r0.f7673l
            if (r5 == 0) goto L_0x00c3
            goto L_0x00dc
        L_0x00c3:
            boolean r1 = r0.f7672k
            if (r1 == 0) goto L_0x00da
            boolean r1 = r0.f7675o
            if (r1 == 0) goto L_0x00d2
            r0.f7672k = r3
            boolean r1 = r6.T(r0, r7)
            goto L_0x00d3
        L_0x00d2:
            r1 = r2
        L_0x00d3:
            if (r1 == 0) goto L_0x00da
            r6.R(r0, r7)
            r7 = r2
            goto L_0x00e0
        L_0x00da:
            r7 = r3
            goto L_0x00e0
        L_0x00dc:
            r6.F(r0, r2)
            r7 = r1
        L_0x00e0:
            if (r7 == 0) goto L_0x0104
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00f4
            r7.playSoundEffect(r3)
            goto L_0x0104
        L_0x00f4:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0104
        L_0x00fc:
            boolean r7 = r6.Q()
            if (r7 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r2 = r3
        L_0x0104:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.H(android.view.KeyEvent):boolean");
    }

    public final void I(int i8) {
        l M2 = M(i8);
        if (M2.f7669h != null) {
            Bundle bundle = new Bundle();
            M2.f7669h.u(bundle);
            if (bundle.size() > 0) {
                M2.f7676p = bundle;
            }
            M2.f7669h.y();
            M2.f7669h.clear();
        }
        M2.f7675o = true;
        M2.f7674n = true;
        if ((i8 == 108 || i8 == 0) && this.N != null) {
            l M3 = M(0);
            M3.f7672k = false;
            T(M3, (KeyEvent) null);
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        if (!this.W) {
            int[] iArr = cb.e.G;
            Context context = this.G;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    t(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    t(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    t(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    t(10);
                }
                this.f7626f0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                K();
                this.H.getDecorView();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.f7627g0) {
                    viewGroup = this.f7625e0 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f7626f0) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f7624d0 = false;
                    this.f7623c0 = false;
                } else if (this.f7623c0) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new h.c(context, typedValue.resourceId) : context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    h0 h0Var = (h0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.N = h0Var;
                    h0Var.setWindowCallback(N());
                    if (this.f7624d0) {
                        this.N.h(109);
                    }
                    if (this.f7621a0) {
                        this.N.h(2);
                    }
                    if (this.f7622b0) {
                        this.N.h(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    g gVar = new g(this);
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.i.u(viewGroup, gVar);
                    if (this.N == null) {
                        this.Y = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = q1.f1113a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (IllegalAccessException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.H.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.H.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new h(this));
                    this.X = viewGroup;
                    Object obj = this.F;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.M;
                    if (!TextUtils.isEmpty(title)) {
                        h0 h0Var2 = this.N;
                        if (h0Var2 != null) {
                            h0Var2.setWindowTitle(title);
                        } else {
                            a aVar = this.K;
                            if (aVar != null) {
                                aVar.s(title);
                            } else {
                                TextView textView = this.Y;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.X.findViewById(16908290);
                    View decorView = this.H.getDecorView();
                    contentFrameLayout2.C.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                    if (i0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.W = true;
                    l M2 = M(0);
                    if (!this.f7634n0 && M2.f7669h == null) {
                        this.f7643w0 |= 4096;
                        if (!this.f7642v0) {
                            i0.d.m(this.H.getDecorView(), this.f7644x0);
                            this.f7642v0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f7623c0 + ", windowActionBarOverlay: " + this.f7624d0 + ", android:windowIsFloating: " + this.f7626f0 + ", windowActionModeOverlay: " + this.f7625e0 + ", windowNoTitle: " + this.f7627g0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void K() {
        if (this.H == null) {
            Object obj = this.F;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.H == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final i L(Context context) {
        if (this.f7640t0 == null) {
            if (v.f7724d == null) {
                Context applicationContext = context.getApplicationContext();
                v.f7724d = new v(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f7640t0 = new j(v.f7724d);
        }
        return this.f7640t0;
    }

    public final l M(int i8) {
        l[] lVarArr = this.f7629i0;
        if (lVarArr == null || lVarArr.length <= i8) {
            l[] lVarArr2 = new l[(i8 + 1)];
            if (lVarArr != null) {
                System.arraycopy(lVarArr, 0, lVarArr2, 0, lVarArr.length);
            }
            this.f7629i0 = lVarArr2;
            lVarArr = lVarArr2;
        }
        l lVar = lVarArr[i8];
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(i8);
        lVarArr[i8] = lVar2;
        return lVar2;
    }

    public final Window.Callback N() {
        return this.H.getCallback();
    }

    public final void O() {
        J();
        if (this.f7623c0 && this.K == null) {
            Object obj = this.F;
            if (obj instanceof Activity) {
                this.K = new w((Activity) obj, this.f7624d0);
            } else if (obj instanceof Dialog) {
                this.K = new w((Dialog) obj);
            }
            a aVar = this.K;
            if (aVar != null) {
                aVar.m(this.f7645y0);
            }
        }
    }

    public final int P(Context context, int i8) {
        if (i8 == -100) {
            return -1;
        }
        if (i8 != -1) {
            if (i8 != 0) {
                if (!(i8 == 1 || i8 == 2)) {
                    if (i8 == 3) {
                        if (this.f7641u0 == null) {
                            this.f7641u0 = new h(context);
                        }
                        return this.f7641u0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return L(context).c();
            }
        }
        return i8;
    }

    public final boolean Q() {
        boolean z10 = this.f7631k0;
        this.f7631k0 = false;
        l M2 = M(0);
        if (M2.m) {
            if (!z10) {
                F(M2, true);
            }
            return true;
        }
        h.a aVar = this.Q;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        O();
        a aVar2 = this.K;
        return aVar2 != null && aVar2.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0154, code lost:
        if (r2 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0178, code lost:
        if (r2.B.getCount() > 0) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(e.f.l r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            if (r2 != 0) goto L_0x01e2
            boolean r2 = r0.f7634n0
            if (r2 == 0) goto L_0x000e
            goto L_0x01e2
        L_0x000e:
            android.content.Context r2 = r0.G
            r3 = 0
            r4 = 1
            int r5 = r1.f7662a
            if (r5 != 0) goto L_0x002b
            android.content.res.Resources r6 = r2.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.screenLayout
            r6 = r6 & 15
            r7 = 4
            if (r6 != r7) goto L_0x0027
            r6 = r4
            goto L_0x0028
        L_0x0027:
            r6 = r3
        L_0x0028:
            if (r6 == 0) goto L_0x002b
            return
        L_0x002b:
            android.view.Window$Callback r6 = r17.N()
            if (r6 == 0) goto L_0x003d
            androidx.appcompat.view.menu.f r7 = r1.f7669h
            boolean r6 = r6.onMenuOpened(r5, r7)
            if (r6 != 0) goto L_0x003d
            r0.F(r1, r4)
            return
        L_0x003d:
            java.lang.String r6 = "window"
            java.lang.Object r6 = r2.getSystemService(r6)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            if (r6 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r7 = r17.T(r18, r19)
            if (r7 != 0) goto L_0x004f
            return
        L_0x004f:
            e.f$k r7 = r1.f7666e
            r8 = -2
            if (r7 == 0) goto L_0x006b
            boolean r9 = r1.f7674n
            if (r9 == 0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            android.view.View r2 = r1.f7668g
            if (r2 == 0) goto L_0x01b9
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L_0x01b9
            int r2 = r2.width
            r7 = -1
            if (r2 != r7) goto L_0x01b9
            r10 = r7
            goto L_0x01ba
        L_0x006b:
            if (r7 != 0) goto L_0x00e6
            r17.O()
            e.a r7 = r0.K
            if (r7 == 0) goto L_0x0079
            android.content.Context r7 = r7.e()
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            if (r7 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r2 = r7
        L_0x007e:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources r9 = r2.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r2.getTheme()
            r9.setTo(r10)
            r10 = 2130903045(0x7f030005, float:1.7412897E38)
            r9.resolveAttribute(r10, r7, r4)
            int r10 = r7.resourceId
            if (r10 == 0) goto L_0x009f
            r9.applyStyle(r10, r4)
        L_0x009f:
            r10 = 2130904028(0x7f0303dc, float:1.741489E38)
            r9.resolveAttribute(r10, r7, r4)
            int r7 = r7.resourceId
            if (r7 == 0) goto L_0x00ad
            r9.applyStyle(r7, r4)
            goto L_0x00b3
        L_0x00ad:
            r7 = 2132017702(0x7f140226, float:1.967369E38)
            r9.applyStyle(r7, r4)
        L_0x00b3:
            h.c r7 = new h.c
            r7.<init>((android.content.Context) r2, (int) r3)
            android.content.res.Resources$Theme r2 = r7.getTheme()
            r2.setTo(r9)
            r1.f7671j = r7
            int[] r2 = cb.e.G
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r2)
            r7 = 86
            int r7 = r2.getResourceId(r7, r3)
            r1.f7663b = r7
            int r7 = r2.getResourceId(r4, r3)
            r1.f7665d = r7
            r2.recycle()
            e.f$k r2 = new e.f$k
            h.c r7 = r1.f7671j
            r2.<init>(r7)
            r1.f7666e = r2
            r2 = 81
            r1.f7664c = r2
            goto L_0x00f5
        L_0x00e6:
            boolean r2 = r1.f7674n
            if (r2 == 0) goto L_0x00f5
            int r2 = r7.getChildCount()
            if (r2 <= 0) goto L_0x00f5
            e.f$k r2 = r1.f7666e
            r2.removeAllViews()
        L_0x00f5:
            android.view.View r2 = r1.f7668g
            if (r2 == 0) goto L_0x00fc
            r1.f7667f = r2
            goto L_0x0156
        L_0x00fc:
            androidx.appcompat.view.menu.f r2 = r1.f7669h
            if (r2 != 0) goto L_0x0101
            goto L_0x0158
        L_0x0101:
            e.f$m r2 = r0.P
            if (r2 != 0) goto L_0x010c
            e.f$m r2 = new e.f$m
            r2.<init>()
            r0.P = r2
        L_0x010c:
            e.f$m r2 = r0.P
            androidx.appcompat.view.menu.d r7 = r1.f7670i
            if (r7 != 0) goto L_0x0124
            androidx.appcompat.view.menu.d r7 = new androidx.appcompat.view.menu.d
            h.c r9 = r1.f7671j
            r7.<init>(r9)
            r1.f7670i = r7
            r7.f713e = r2
            androidx.appcompat.view.menu.f r2 = r1.f7669h
            android.content.Context r9 = r2.f722a
            r2.b(r7, r9)
        L_0x0124:
            androidx.appcompat.view.menu.d r2 = r1.f7670i
            e.f$k r7 = r1.f7666e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r2.f712d
            if (r9 != 0) goto L_0x0150
            android.view.LayoutInflater r9 = r2.f710b
            r10 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r7 = r9.inflate(r10, r7, r3)
            androidx.appcompat.view.menu.ExpandedMenuView r7 = (androidx.appcompat.view.menu.ExpandedMenuView) r7
            r2.f712d = r7
            androidx.appcompat.view.menu.d$a r7 = r2.B
            if (r7 != 0) goto L_0x0144
            androidx.appcompat.view.menu.d$a r7 = new androidx.appcompat.view.menu.d$a
            r7.<init>()
            r2.B = r7
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r7 = r2.f712d
            androidx.appcompat.view.menu.d$a r9 = r2.B
            r7.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r7 = r2.f712d
            r7.setOnItemClickListener(r2)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r2.f712d
            r1.f7667f = r2
            if (r2 == 0) goto L_0x0158
        L_0x0156:
            r2 = r4
            goto L_0x0159
        L_0x0158:
            r2 = r3
        L_0x0159:
            if (r2 == 0) goto L_0x01e0
            android.view.View r2 = r1.f7667f
            if (r2 != 0) goto L_0x0160
            goto L_0x017c
        L_0x0160:
            android.view.View r2 = r1.f7668g
            if (r2 == 0) goto L_0x0165
            goto L_0x017a
        L_0x0165:
            androidx.appcompat.view.menu.d r2 = r1.f7670i
            androidx.appcompat.view.menu.d$a r7 = r2.B
            if (r7 != 0) goto L_0x0172
            androidx.appcompat.view.menu.d$a r7 = new androidx.appcompat.view.menu.d$a
            r7.<init>()
            r2.B = r7
        L_0x0172:
            androidx.appcompat.view.menu.d$a r2 = r2.B
            int r2 = r2.getCount()
            if (r2 <= 0) goto L_0x017c
        L_0x017a:
            r2 = r4
            goto L_0x017d
        L_0x017c:
            r2 = r3
        L_0x017d:
            if (r2 != 0) goto L_0x0180
            goto L_0x01e0
        L_0x0180:
            android.view.View r2 = r1.f7667f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L_0x018d
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
        L_0x018d:
            int r7 = r1.f7663b
            e.f$k r9 = r1.f7666e
            r9.setBackgroundResource(r7)
            android.view.View r7 = r1.f7667f
            android.view.ViewParent r7 = r7.getParent()
            boolean r9 = r7 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x01a5
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r9 = r1.f7667f
            r7.removeView(r9)
        L_0x01a5:
            e.f$k r7 = r1.f7666e
            android.view.View r9 = r1.f7667f
            r7.addView(r9, r2)
            android.view.View r2 = r1.f7667f
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L_0x01b9
            android.view.View r2 = r1.f7667f
            r2.requestFocus()
        L_0x01b9:
            r10 = r8
        L_0x01ba:
            r1.f7673l = r3
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams
            r11 = -2
            r12 = 0
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r3 = r1.f7664c
            r2.gravity = r3
            int r3 = r1.f7665d
            r2.windowAnimations = r3
            e.f$k r3 = r1.f7666e
            r6.addView(r3, r2)
            r1.m = r4
            if (r5 != 0) goto L_0x01df
            r17.V()
        L_0x01df:
            return
        L_0x01e0:
            r1.f7674n = r4
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.R(e.f$l, android.view.KeyEvent):void");
    }

    public final boolean S(l lVar, int i8, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((lVar.f7672k || T(lVar, keyEvent)) && (fVar = lVar.f7669h) != null) {
            return fVar.performShortcut(i8, keyEvent, 1);
        }
        return false;
    }

    public final boolean T(l lVar, KeyEvent keyEvent) {
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        Resources.Theme theme;
        h0 h0Var4;
        if (this.f7634n0) {
            return false;
        }
        if (lVar.f7672k) {
            return true;
        }
        l lVar2 = this.f7630j0;
        if (!(lVar2 == null || lVar2 == lVar)) {
            F(lVar2, false);
        }
        Window.Callback N2 = N();
        int i8 = lVar.f7662a;
        if (N2 != null) {
            lVar.f7668g = N2.onCreatePanelView(i8);
        }
        boolean z10 = i8 == 0 || i8 == 108;
        if (z10 && (h0Var4 = this.N) != null) {
            h0Var4.b();
        }
        if (lVar.f7668g == null && (!z10 || !(this.K instanceof t))) {
            androidx.appcompat.view.menu.f fVar = lVar.f7669h;
            if (fVar == null || lVar.f7675o) {
                if (fVar == null) {
                    Context context = this.G;
                    if ((i8 == 0 || i8 == 108) && this.N != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            h.c cVar = new h.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f726e = this;
                    androidx.appcompat.view.menu.f fVar3 = lVar.f7669h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(lVar.f7670i);
                        }
                        lVar.f7669h = fVar2;
                        androidx.appcompat.view.menu.d dVar = lVar.f7670i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f722a);
                        }
                    }
                    if (lVar.f7669h == null) {
                        return false;
                    }
                }
                if (z10 && (h0Var3 = this.N) != null) {
                    if (this.O == null) {
                        this.O = new c();
                    }
                    h0Var3.c(lVar.f7669h, this.O);
                }
                lVar.f7669h.y();
                if (!N2.onCreatePanelMenu(i8, lVar.f7669h)) {
                    androidx.appcompat.view.menu.f fVar4 = lVar.f7669h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(lVar.f7670i);
                        }
                        lVar.f7669h = null;
                    }
                    if (z10 && (h0Var2 = this.N) != null) {
                        h0Var2.c((androidx.appcompat.view.menu.f) null, this.O);
                    }
                    return false;
                }
                lVar.f7675o = false;
            }
            lVar.f7669h.y();
            Bundle bundle = lVar.f7676p;
            if (bundle != null) {
                lVar.f7669h.s(bundle);
                lVar.f7676p = null;
            }
            if (!N2.onPreparePanel(0, lVar.f7668g, lVar.f7669h)) {
                if (z10 && (h0Var = this.N) != null) {
                    h0Var.c((androidx.appcompat.view.menu.f) null, this.O);
                }
                lVar.f7669h.x();
                return false;
            }
            lVar.f7669h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            lVar.f7669h.x();
        }
        lVar.f7672k = true;
        lVar.f7673l = false;
        this.f7630j0 = lVar;
        return true;
    }

    public final void U() {
        if (this.W) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void V() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.C0 != null && (M(0).m || this.Q != null)) {
                z10 = true;
            }
            if (z10 && this.D0 == null) {
                this.D0 = C0127f.b(this.C0, this);
            } else if (!z10 && (onBackInvokedCallback = this.D0) != null) {
                C0127f.c(this.C0, onBackInvokedCallback);
            }
        }
    }

    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i8;
        int i10;
        l lVar;
        Window.Callback N2 = N();
        if (N2 != null && !this.f7634n0) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            l[] lVarArr = this.f7629i0;
            if (lVarArr != null) {
                i10 = lVarArr.length;
                i8 = 0;
            } else {
                i10 = 0;
                i8 = 0;
            }
            while (true) {
                if (i8 < i10) {
                    lVar = lVarArr[i8];
                    if (lVar != null && lVar.f7669h == k10) {
                        break;
                    }
                    i8++;
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar != null) {
                return N2.onMenuItemSelected(lVar.f7662a, menuItem);
            }
        }
        return false;
    }

    public final void b(androidx.appcompat.view.menu.f fVar) {
        h0 h0Var = this.N;
        if (h0Var == null || !h0Var.d() || (ViewConfiguration.get(this.G).hasPermanentMenuKey() && !this.N.e())) {
            l M2 = M(0);
            M2.f7674n = true;
            F(M2, false);
            R(M2, (KeyEvent) null);
            return;
        }
        Window.Callback N2 = N();
        if (this.N.a()) {
            this.N.f();
            if (!this.f7634n0) {
                N2.onPanelClosed(108, M(0).f7669h);
            }
        } else if (N2 != null && !this.f7634n0) {
            if (this.f7642v0 && (1 & this.f7643w0) != 0) {
                View decorView = this.H.getDecorView();
                a aVar = this.f7644x0;
                decorView.removeCallbacks(aVar);
                aVar.run();
            }
            l M3 = M(0);
            androidx.appcompat.view.menu.f fVar2 = M3.f7669h;
            if (fVar2 != null && !M3.f7675o && N2.onPreparePanel(0, M3.f7668g, fVar2)) {
                N2.onMenuOpened(108, M3.f7669h);
                this.N.g();
            }
        }
    }

    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.X.findViewById(16908290)).addView(view, layoutParams);
        this.I.a(this.H.getCallback());
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context d(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 1
            r10.f7632l0 = r0
            int r1 = r10.f7636p0
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            int r1 = e.e.f7617b
        L_0x000c:
            int r1 = r10.P(r11, r1)
            boolean r2 = e.e.l(r11)
            if (r2 == 0) goto L_0x0072
            boolean r2 = e.e.l(r11)
            if (r2 != 0) goto L_0x001d
            goto L_0x0072
        L_0x001d:
            boolean r2 = y1.a.a()
            if (r2 == 0) goto L_0x0032
            boolean r2 = e.e.B
            if (r2 != 0) goto L_0x0072
            e.r$a r2 = e.e.f7616a
            androidx.activity.l r3 = new androidx.activity.l
            r3.<init>(r11, r0)
            r2.execute(r3)
            goto L_0x0072
        L_0x0032:
            java.lang.Object r2 = e.e.E
            monitor-enter(r2)
            y1.h r3 = e.e.f7618c     // Catch:{ all -> 0x006f }
            if (r3 != 0) goto L_0x0058
            y1.h r3 = e.e.f7619d     // Catch:{ all -> 0x006f }
            if (r3 != 0) goto L_0x0047
            java.lang.String r3 = e.r.b(r11)     // Catch:{ all -> 0x006f }
            y1.h r3 = y1.h.a(r3)     // Catch:{ all -> 0x006f }
            e.e.f7619d = r3     // Catch:{ all -> 0x006f }
        L_0x0047:
            y1.h r3 = e.e.f7619d     // Catch:{ all -> 0x006f }
            y1.i r3 = r3.f17119a     // Catch:{ all -> 0x006f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0053
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            goto L_0x0072
        L_0x0053:
            y1.h r3 = e.e.f7619d     // Catch:{ all -> 0x006f }
            e.e.f7618c = r3     // Catch:{ all -> 0x006f }
            goto L_0x006d
        L_0x0058:
            y1.h r4 = e.e.f7619d     // Catch:{ all -> 0x006f }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x006f }
            if (r3 != 0) goto L_0x006d
            y1.h r3 = e.e.f7618c     // Catch:{ all -> 0x006f }
            e.e.f7619d = r3     // Catch:{ all -> 0x006f }
            y1.i r3 = r3.f17119a     // Catch:{ all -> 0x006f }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x006f }
            e.r.a(r11, r3)     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            goto L_0x0072
        L_0x006f:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r11
        L_0x0072:
            y1.h r2 = C(r11)
            boolean r3 = H0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x008b
            boolean r3 = r11 instanceof android.view.ContextThemeWrapper
            if (r3 == 0) goto L_0x008b
            android.content.res.Configuration r3 = G(r11, r1, r2, r5, r4)
            r6 = r11
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch:{ IllegalStateException -> 0x008b }
            r6.applyOverrideConfiguration(r3)     // Catch:{ IllegalStateException -> 0x008b }
            return r11
        L_0x008b:
            boolean r3 = r11 instanceof h.c
            if (r3 == 0) goto L_0x009a
            android.content.res.Configuration r3 = G(r11, r1, r2, r5, r4)
            r6 = r11
            h.c r6 = (h.c) r6     // Catch:{ IllegalStateException -> 0x009a }
            r6.a(r3)     // Catch:{ IllegalStateException -> 0x009a }
            return r11
        L_0x009a:
            boolean r3 = G0
            if (r3 != 0) goto L_0x009f
            return r11
        L_0x009f:
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r6 = -1
            r3.uiMode = r6
            r6 = 0
            r3.fontScale = r6
            android.content.Context r3 = r11.createConfigurationContext(r3)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            android.content.res.Resources r7 = r11.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r8 = r7.uiMode
            r3.uiMode = r8
            boolean r8 = r3.equals(r7)
            if (r8 != 0) goto L_0x01bd
            android.content.res.Configuration r8 = new android.content.res.Configuration
            r8.<init>()
            r8.fontScale = r6
            int r6 = r3.diff(r7)
            if (r6 != 0) goto L_0x00d7
            goto L_0x01be
        L_0x00d7:
            float r6 = r3.fontScale
            float r9 = r7.fontScale
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x00e1
            r8.fontScale = r9
        L_0x00e1:
            int r6 = r3.mcc
            int r9 = r7.mcc
            if (r6 == r9) goto L_0x00e9
            r8.mcc = r9
        L_0x00e9:
            int r6 = r3.mnc
            int r9 = r7.mnc
            if (r6 == r9) goto L_0x00f1
            r8.mnc = r9
        L_0x00f1:
            e.f.e.a(r3, r7, r8)
            int r6 = r3.touchscreen
            int r9 = r7.touchscreen
            if (r6 == r9) goto L_0x00fc
            r8.touchscreen = r9
        L_0x00fc:
            int r6 = r3.keyboard
            int r9 = r7.keyboard
            if (r6 == r9) goto L_0x0104
            r8.keyboard = r9
        L_0x0104:
            int r6 = r3.keyboardHidden
            int r9 = r7.keyboardHidden
            if (r6 == r9) goto L_0x010c
            r8.keyboardHidden = r9
        L_0x010c:
            int r6 = r3.navigation
            int r9 = r7.navigation
            if (r6 == r9) goto L_0x0114
            r8.navigation = r9
        L_0x0114:
            int r6 = r3.navigationHidden
            int r9 = r7.navigationHidden
            if (r6 == r9) goto L_0x011c
            r8.navigationHidden = r9
        L_0x011c:
            int r6 = r3.orientation
            int r9 = r7.orientation
            if (r6 == r9) goto L_0x0124
            r8.orientation = r9
        L_0x0124:
            int r6 = r3.screenLayout
            r6 = r6 & 15
            int r9 = r7.screenLayout
            r9 = r9 & 15
            if (r6 == r9) goto L_0x0133
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0133:
            int r6 = r3.screenLayout
            r6 = r6 & 192(0xc0, float:2.69E-43)
            int r9 = r7.screenLayout
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r6 == r9) goto L_0x0142
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0142:
            int r6 = r3.screenLayout
            r6 = r6 & 48
            int r9 = r7.screenLayout
            r9 = r9 & 48
            if (r6 == r9) goto L_0x0151
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0151:
            int r6 = r3.screenLayout
            r6 = r6 & 768(0x300, float:1.076E-42)
            int r9 = r7.screenLayout
            r9 = r9 & 768(0x300, float:1.076E-42)
            if (r6 == r9) goto L_0x0160
            int r6 = r8.screenLayout
            r6 = r6 | r9
            r8.screenLayout = r6
        L_0x0160:
            int r6 = r3.colorMode
            r6 = r6 & 3
            int r9 = r7.colorMode
            r9 = r9 & 3
            if (r6 == r9) goto L_0x016f
            int r6 = r8.colorMode
            r6 = r6 | r9
            r8.colorMode = r6
        L_0x016f:
            int r6 = r3.colorMode
            r6 = r6 & 12
            int r9 = r7.colorMode
            r9 = r9 & 12
            if (r6 == r9) goto L_0x017e
            int r6 = r8.colorMode
            r6 = r6 | r9
            r8.colorMode = r6
        L_0x017e:
            int r6 = r3.uiMode
            r6 = r6 & 15
            int r9 = r7.uiMode
            r9 = r9 & 15
            if (r6 == r9) goto L_0x018d
            int r6 = r8.uiMode
            r6 = r6 | r9
            r8.uiMode = r6
        L_0x018d:
            int r6 = r3.uiMode
            r6 = r6 & 48
            int r9 = r7.uiMode
            r9 = r9 & 48
            if (r6 == r9) goto L_0x019c
            int r6 = r8.uiMode
            r6 = r6 | r9
            r8.uiMode = r6
        L_0x019c:
            int r6 = r3.screenWidthDp
            int r9 = r7.screenWidthDp
            if (r6 == r9) goto L_0x01a4
            r8.screenWidthDp = r9
        L_0x01a4:
            int r6 = r3.screenHeightDp
            int r9 = r7.screenHeightDp
            if (r6 == r9) goto L_0x01ac
            r8.screenHeightDp = r9
        L_0x01ac:
            int r6 = r3.smallestScreenWidthDp
            int r9 = r7.smallestScreenWidthDp
            if (r6 == r9) goto L_0x01b4
            r8.smallestScreenWidthDp = r9
        L_0x01b4:
            int r3 = r3.densityDpi
            int r6 = r7.densityDpi
            if (r3 == r6) goto L_0x01be
            r8.densityDpi = r6
            goto L_0x01be
        L_0x01bd:
            r8 = r5
        L_0x01be:
            android.content.res.Configuration r1 = G(r11, r1, r2, r8, r0)
            h.c r2 = new h.c
            r3 = 2132017714(0x7f140232, float:1.9673714E38)
            r2.<init>((android.content.Context) r11, (int) r3)
            r2.a(r1)
            android.content.res.Resources$Theme r11 = r11.getTheme()     // Catch:{ NullPointerException -> 0x01d5 }
            if (r11 == 0) goto L_0x01d5
            r11 = r0
            goto L_0x01d6
        L_0x01d5:
            r11 = r4
        L_0x01d6:
            if (r11 == 0) goto L_0x0222
            android.content.res.Resources$Theme r11 = r2.getTheme()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto L_0x01e6
            u1.j.a(r11)
            goto L_0x0222
        L_0x01e6:
            java.lang.Object r1 = u1.i.f15684a
            monitor-enter(r1)
            boolean r3 = u1.i.f15686c     // Catch:{ all -> 0x021f }
            if (r3 != 0) goto L_0x0207
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01fd }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01fd }
            u1.i.f15685b = r3     // Catch:{ NoSuchMethodException -> 0x01fd }
            r3.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01fd }
            goto L_0x0205
        L_0x01fd:
            r3 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r3)     // Catch:{ all -> 0x021f }
        L_0x0205:
            u1.i.f15686c = r0     // Catch:{ all -> 0x021f }
        L_0x0207:
            java.lang.reflect.Method r0 = u1.i.f15685b     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x021d
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0211 }
            r0.invoke(r11, r3)     // Catch:{ IllegalAccessException -> 0x0213, InvocationTargetException -> 0x0211 }
            goto L_0x021d
        L_0x0211:
            r11 = move-exception
            goto L_0x0214
        L_0x0213:
            r11 = move-exception
        L_0x0214:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r3, r11)     // Catch:{ all -> 0x021f }
            u1.i.f15685b = r5     // Catch:{ all -> 0x021f }
        L_0x021d:
            monitor-exit(r1)     // Catch:{ all -> 0x021f }
            goto L_0x0222
        L_0x021f:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021f }
            throw r11
        L_0x0222:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.d(android.content.Context):android.content.Context");
    }

    public final <T extends View> T e(int i8) {
        J();
        return this.H.findViewById(i8);
    }

    public final Context f() {
        return this.G;
    }

    public final int g() {
        return this.f7636p0;
    }

    public final MenuInflater h() {
        if (this.L == null) {
            O();
            a aVar = this.K;
            this.L = new h.f(aVar != null ? aVar.e() : this.G);
        }
        return this.L;
    }

    public final a i() {
        O();
        return this.K;
    }

    public final void j() {
        LayoutInflater from = LayoutInflater.from(this.G);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void k() {
        if (this.K != null) {
            O();
            if (!this.K.g()) {
                this.f7643w0 |= 1;
                if (!this.f7642v0) {
                    View decorView = this.H.getDecorView();
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.m(decorView, this.f7644x0);
                    this.f7642v0 = true;
                }
            }
        }
    }

    public final void m(Configuration configuration) {
        if (this.f7623c0 && this.W) {
            O();
            a aVar = this.K;
            if (aVar != null) {
                aVar.h();
            }
        }
        androidx.appcompat.widget.j a10 = androidx.appcompat.widget.j.a();
        Context context = this.G;
        synchronized (a10) {
            v0 v0Var = a10.f1027a;
            synchronized (v0Var) {
                o.d dVar = v0Var.f1128b.get(context);
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
        this.f7635o0 = new Configuration(this.G.getResources().getConfiguration());
        A(false, false);
    }

    public final void n() {
        String str;
        this.f7632l0 = true;
        A(false, true);
        K();
        Object obj = this.F;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = s1.l.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a aVar = this.K;
                if (aVar == null) {
                    this.f7645y0 = true;
                } else {
                    aVar.m(true);
                }
            }
            synchronized (e.D) {
                e.s(this);
                e.C.add(new WeakReference(this));
            }
        }
        this.f7635o0 = new Configuration(this.G.getResources().getConfiguration());
        this.f7633m0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.F
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = e.e.D
            monitor-enter(r0)
            e.e.s(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f7642v0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.H
            android.view.View r0 = r0.getDecorView()
            e.f$a r1 = r3.f7644x0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f7634n0 = r0
            int r0 = r3.f7636p0
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.F
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            o.f<java.lang.String, java.lang.Integer> r0 = E0
            java.lang.Object r1 = r3.F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f7636p0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            o.f<java.lang.String, java.lang.Integer> r0 = E0
            java.lang.Object r1 = r3.F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            e.a r0 = r3.K
            if (r0 == 0) goto L_0x0063
            r0.i()
        L_0x0063:
            e.f$j r0 = r3.f7640t0
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            e.f$h r0 = r3.f7641u0
            if (r0 == 0) goto L_0x0071
            r0.a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.o():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: androidx.appcompat.widget.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: androidx.appcompat.widget.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: androidx.appcompat.widget.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: androidx.appcompat.widget.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: androidx.appcompat.widget.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: androidx.appcompat.widget.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: androidx.appcompat.widget.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: androidx.appcompat.widget.g0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: androidx.appcompat.widget.AppCompatImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: androidx.appcompat.widget.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: androidx.appcompat.widget.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: androidx.appcompat.widget.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: androidx.appcompat.widget.AppCompatButton} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r9v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        if (r10.equals("ImageButton") == false) goto L_0x0141;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            e.o r9 = r8.B0
            r0 = 0
            if (r9 != 0) goto L_0x0056
            int[] r9 = cb.e.G
            android.content.Context r1 = r8.G
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r9)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r9 = r9.getString(r2)
            if (r9 != 0) goto L_0x001d
            e.o r9 = new e.o
            r9.<init>()
            r8.B0 = r9
            goto L_0x0056
        L_0x001d:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0036 }
            java.lang.Class r1 = r1.loadClass(r9)     // Catch:{ all -> 0x0036 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0036 }
            e.o r1 = (e.o) r1     // Catch:{ all -> 0x0036 }
            r8.B0 = r1     // Catch:{ all -> 0x0036 }
            goto L_0x0056
        L_0x0036:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = ". Falling back to default."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r9, r1)
            e.o r9 = new e.o
            r9.<init>()
            r8.B0 = r9
        L_0x0056:
            e.o r9 = r8.B0
            int r1 = androidx.appcompat.widget.p1.f1112a
            r9.getClass()
            int[] r1 = cb.e.V
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r0, r0)
            r2 = 4
            int r3 = r1.getResourceId(r2, r0)
            if (r3 == 0) goto L_0x0071
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L_0x0071:
            r1.recycle()
            if (r3 == 0) goto L_0x0087
            boolean r1 = r11 instanceof h.c
            if (r1 == 0) goto L_0x0081
            r1 = r11
            h.c r1 = (h.c) r1
            int r1 = r1.f9007a
            if (r1 == r3) goto L_0x0087
        L_0x0081:
            h.c r1 = new h.c
            r1.<init>((android.content.Context) r11, (int) r3)
            goto L_0x0088
        L_0x0087:
            r1 = r11
        L_0x0088:
            r10.getClass()
            int r3 = r10.hashCode()
            r4 = 1
            r5 = 3
            r6 = -1
            switch(r3) {
                case -1946472170: goto L_0x0136;
                case -1455429095: goto L_0x012b;
                case -1346021293: goto L_0x0120;
                case -938935918: goto L_0x0115;
                case -937446323: goto L_0x010c;
                case -658531749: goto L_0x0101;
                case -339785223: goto L_0x00f6;
                case 776382189: goto L_0x00eb;
                case 799298502: goto L_0x00dd;
                case 1125864064: goto L_0x00cf;
                case 1413872058: goto L_0x00c1;
                case 1601505219: goto L_0x00b3;
                case 1666676343: goto L_0x00a5;
                case 2001146706: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x0141
        L_0x0097:
            java.lang.String r2 = "Button"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00a1
            goto L_0x0141
        L_0x00a1:
            r2 = 13
            goto L_0x0142
        L_0x00a5:
            java.lang.String r2 = "EditText"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00af
            goto L_0x0141
        L_0x00af:
            r2 = 12
            goto L_0x0142
        L_0x00b3:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00bd
            goto L_0x0141
        L_0x00bd:
            r2 = 11
            goto L_0x0142
        L_0x00c1:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00cb
            goto L_0x0141
        L_0x00cb:
            r2 = 10
            goto L_0x0142
        L_0x00cf:
            java.lang.String r2 = "ImageView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00d9
            goto L_0x0141
        L_0x00d9:
            r2 = 9
            goto L_0x0142
        L_0x00dd:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00e7
            goto L_0x0141
        L_0x00e7:
            r2 = 8
            goto L_0x0142
        L_0x00eb:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00f4
            goto L_0x0141
        L_0x00f4:
            r2 = 7
            goto L_0x0142
        L_0x00f6:
            java.lang.String r2 = "Spinner"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00ff
            goto L_0x0141
        L_0x00ff:
            r2 = 6
            goto L_0x0142
        L_0x0101:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x010a
            goto L_0x0141
        L_0x010a:
            r2 = 5
            goto L_0x0142
        L_0x010c:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0142
            goto L_0x0141
        L_0x0115:
            java.lang.String r2 = "TextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x011e
            goto L_0x0141
        L_0x011e:
            r2 = r5
            goto L_0x0142
        L_0x0120:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0129
            goto L_0x0141
        L_0x0129:
            r2 = 2
            goto L_0x0142
        L_0x012b:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0134
            goto L_0x0141
        L_0x0134:
            r2 = r4
            goto L_0x0142
        L_0x0136:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x013f
            goto L_0x0141
        L_0x013f:
            r2 = r0
            goto L_0x0142
        L_0x0141:
            r2 = r6
        L_0x0142:
            r3 = 0
            switch(r2) {
                case 0: goto L_0x01a3;
                case 1: goto L_0x019d;
                case 2: goto L_0x0197;
                case 3: goto L_0x018f;
                case 4: goto L_0x0189;
                case 5: goto L_0x0183;
                case 6: goto L_0x017a;
                case 7: goto L_0x0172;
                case 8: goto L_0x016c;
                case 9: goto L_0x0166;
                case 10: goto L_0x015e;
                case 11: goto L_0x0156;
                case 12: goto L_0x0150;
                case 13: goto L_0x0148;
                default: goto L_0x0146;
            }
        L_0x0146:
            r2 = r3
            goto L_0x01a8
        L_0x0148:
            androidx.appcompat.widget.AppCompatButton r2 = r9.b(r1, r12)
            r9.g(r2, r10)
            goto L_0x01a8
        L_0x0150:
            androidx.appcompat.widget.k r2 = new androidx.appcompat.widget.k
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x0156:
            androidx.appcompat.widget.f r2 = r9.c(r1, r12)
            r9.g(r2, r10)
            goto L_0x01a8
        L_0x015e:
            androidx.appcompat.widget.d r2 = r9.a(r1, r12)
            r9.g(r2, r10)
            goto L_0x01a8
        L_0x0166:
            androidx.appcompat.widget.AppCompatImageView r2 = new androidx.appcompat.widget.AppCompatImageView
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x016c:
            androidx.appcompat.widget.g0 r2 = new androidx.appcompat.widget.g0
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x0172:
            androidx.appcompat.widget.s r2 = r9.d(r1, r12)
            r9.g(r2, r10)
            goto L_0x01a8
        L_0x017a:
            androidx.appcompat.widget.y r2 = new androidx.appcompat.widget.y
            r7 = 2130904155(0x7f03045b, float:1.7415148E38)
            r2.<init>(r1, r12, r7)
            goto L_0x01a8
        L_0x0183:
            androidx.appcompat.widget.v r2 = new androidx.appcompat.widget.v
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x0189:
            androidx.appcompat.widget.n r2 = new androidx.appcompat.widget.n
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x018f:
            androidx.appcompat.widget.d0 r2 = r9.e(r1, r12)
            r9.g(r2, r10)
            goto L_0x01a8
        L_0x0197:
            androidx.appcompat.widget.p r2 = new androidx.appcompat.widget.p
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x019d:
            androidx.appcompat.widget.g r2 = new androidx.appcompat.widget.g
            r2.<init>(r1, r12)
            goto L_0x01a8
        L_0x01a3:
            androidx.appcompat.widget.t r2 = new androidx.appcompat.widget.t
            r2.<init>(r1, r12)
        L_0x01a8:
            if (r2 != 0) goto L_0x01f8
            if (r11 == r1) goto L_0x01f8
            java.lang.Object[] r11 = r9.f7692a
            java.lang.String r2 = "view"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x01bc
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r3, r10)
        L_0x01bc:
            r11[r0] = r1     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            r11[r4] = r12     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            r2 = 46
            int r2 = r10.indexOf(r2)     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            if (r6 != r2) goto L_0x01e3
            r2 = r0
        L_0x01c9:
            java.lang.String[] r6 = e.o.f7690g     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            if (r2 >= r5) goto L_0x01de
            r6 = r6[r2]     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            android.view.View r6 = r9.f(r1, r10, r6)     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            if (r6 == 0) goto L_0x01db
            r11[r0] = r3
            r11[r4] = r3
            r3 = r6
            goto L_0x01f7
        L_0x01db:
            int r2 = r2 + 1
            goto L_0x01c9
        L_0x01de:
            r11[r0] = r3
            r11[r4] = r3
            goto L_0x01f7
        L_0x01e3:
            android.view.View r9 = r9.f(r1, r10, r3)     // Catch:{ Exception -> 0x01f3, all -> 0x01ed }
            r11[r0] = r3
            r11[r4] = r3
            r3 = r9
            goto L_0x01f7
        L_0x01ed:
            r9 = move-exception
            r11[r0] = r3
            r11[r4] = r3
            throw r9
        L_0x01f3:
            r11[r0] = r3
            r11[r4] = r3
        L_0x01f7:
            r2 = r3
        L_0x01f8:
            if (r2 == 0) goto L_0x0281
            android.content.Context r9 = r2.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x0222
            java.util.WeakHashMap<android.view.View, d2.d1> r10 = d2.i0.f7217a
            boolean r10 = d2.i0.c.a(r2)
            if (r10 != 0) goto L_0x020b
            goto L_0x0222
        L_0x020b:
            int[] r10 = e.o.f7686c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r0)
            if (r10 == 0) goto L_0x021f
            e.o$a r11 = new e.o$a
            r11.<init>(r2, r10)
            r2.setOnClickListener(r11)
        L_0x021f:
            r9.recycle()
        L_0x0222:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 <= r10) goto L_0x0229
            goto L_0x0281
        L_0x0229:
            int[] r9 = e.o.f7687d
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0247
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, d2.d1> r11 = d2.i0.f7217a
            d2.h0 r11 = new d2.h0
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r2, r10)
        L_0x0247:
            r9.recycle()
            int[] r9 = e.o.f7688e
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x025d
            java.lang.String r10 = r9.getString(r0)
            d2.i0.o(r2, r10)
        L_0x025d:
            r9.recycle()
            int[] r9 = e.o.f7689f
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x027e
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, d2.d1> r11 = d2.i0.f7217a
            d2.f0 r11 = new d2.f0
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r2, r10)
        L_0x027e:
            r9.recycle()
        L_0x0281:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p() {
        O();
        a aVar = this.K;
        if (aVar != null) {
            aVar.p(true);
        }
    }

    public final void q() {
        A(true, false);
    }

    public final void r() {
        O();
        a aVar = this.K;
        if (aVar != null) {
            aVar.p(false);
        }
    }

    public final boolean t(int i8) {
        if (i8 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i8 = 108;
        } else if (i8 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i8 = 109;
        }
        if (this.f7627g0 && i8 == 108) {
            return false;
        }
        if (this.f7623c0 && i8 == 1) {
            this.f7623c0 = false;
        }
        if (i8 == 1) {
            U();
            this.f7627g0 = true;
            return true;
        } else if (i8 == 2) {
            U();
            this.f7621a0 = true;
            return true;
        } else if (i8 == 5) {
            U();
            this.f7622b0 = true;
            return true;
        } else if (i8 == 10) {
            U();
            this.f7625e0 = true;
            return true;
        } else if (i8 == 108) {
            U();
            this.f7623c0 = true;
            return true;
        } else if (i8 != 109) {
            return this.H.requestFeature(i8);
        } else {
            U();
            this.f7624d0 = true;
            return true;
        }
    }

    public final void u(int i8) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.X.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.G).inflate(i8, viewGroup);
        this.I.a(this.H.getCallback());
    }

    public final void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.X.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.I.a(this.H.getCallback());
    }

    public final void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.X.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.I.a(this.H.getCallback());
    }

    public final void x(Toolbar toolbar) {
        Object obj = this.F;
        if (obj instanceof Activity) {
            O();
            a aVar = this.K;
            if (!(aVar instanceof w)) {
                this.L = null;
                if (aVar != null) {
                    aVar.i();
                }
                this.K = null;
                if (toolbar != null) {
                    t tVar = new t(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.M, this.I);
                    this.K = tVar;
                    this.I.f7651b = tVar.f7708c;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.I.f7651b = null;
                }
                k();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void y(int i8) {
        this.f7637q0 = i8;
    }

    public final void z(CharSequence charSequence) {
        this.M = charSequence;
        h0 h0Var = this.N;
        if (h0Var != null) {
            h0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.K;
        if (aVar != null) {
            aVar.s(charSequence);
            return;
        }
        TextView textView = this.Y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
