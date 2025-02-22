package d2;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import o.f;

public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public final e f7275a;

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f7276a;

        /* renamed from: b  reason: collision with root package name */
        public final View f7277b;

        public a(Window window, View view) {
            this.f7276a = window;
            this.f7277b = view;
        }

        public final void a() {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((8 & i8) != 0) {
                    if (i8 == 1) {
                        f(4);
                    } else if (i8 == 2) {
                        f(2);
                    } else if (i8 == 8) {
                        Window window = this.f7276a;
                        ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                    }
                }
            }
        }

        public final void e() {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((8 & i8) != 0) {
                    Window window = this.f7276a;
                    if (i8 == 1) {
                        g(4);
                        window.clearFlags(1024);
                    } else if (i8 == 2) {
                        g(2);
                    } else if (i8 == 8) {
                        View view = this.f7277b;
                        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                            view.requestFocus();
                        } else {
                            view = window.getCurrentFocus();
                        }
                        if (view == null) {
                            view = window.findViewById(16908290);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new t1(view));
                        }
                    }
                }
            }
        }

        public final void f(int i8) {
            View decorView = this.f7276a.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        public final void g(int i8) {
            View decorView = this.f7276a.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        public final boolean b() {
            return (this.f7276a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        public final void d(boolean z10) {
            if (z10) {
                Window window = this.f7276a;
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                f(8192);
                return;
            }
            g(8192);
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        public final void c(boolean z10) {
            if (z10) {
                Window window = this.f7276a;
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                f(16);
                return;
            }
            g(16);
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f7278a;

        /* renamed from: b  reason: collision with root package name */
        public final Window f7279b;

        public d(Window window) {
            WindowInsetsController a10 = window.getInsetsController();
            new f();
            this.f7278a = a10;
            this.f7279b = window;
        }

        public final void a() {
            this.f7278a.hide(8);
        }

        public final boolean b() {
            return (v1.a(this.f7278a) & 8) != 0;
        }

        public final void c(boolean z10) {
            WindowInsetsController windowInsetsController = this.f7278a;
            Window window = this.f7279b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        public final void d(boolean z10) {
            WindowInsetsController windowInsetsController = this.f7278a;
            Window window = this.f7279b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        public final void e() {
            Window window = this.f7279b;
            if (window != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f7278a.show(8);
        }
    }

    public static class e {
        public void a() {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public void e() {
            throw null;
        }
    }

    public u1(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7275a = new d(window);
        } else {
            this.f7275a = new c(window, view);
        }
    }
}
