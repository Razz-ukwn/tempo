package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.t0;
import com.quickkonnect.silencio.R;
import i.d;

public final class l extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final int B;
    public final int C;
    public final int D;
    public final t0 E;
    public final a F = new a();
    public final b G = new b();
    public PopupWindow.OnDismissListener H;
    public View I;
    public View J;
    public j.a K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public int O;
    public int P = 0;
    public boolean Q;

    /* renamed from: b  reason: collision with root package name */
    public final Context f787b;

    /* renamed from: c  reason: collision with root package name */
    public final f f788c;

    /* renamed from: d  reason: collision with root package name */
    public final e f789d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f790e;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.a() && !lVar.E.U) {
                View view = lVar.J;
                if (view == null || !view.isShown()) {
                    lVar.dismiss();
                } else {
                    lVar.E.b();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.L = view.getViewTreeObserver();
                }
                lVar.L.removeGlobalOnLayoutListener(lVar.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i8, int i10, Context context, View view, f fVar, boolean z10) {
        this.f787b = context;
        this.f788c = fVar;
        this.f790e = z10;
        this.f789d = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.C = i8;
        this.D = i10;
        Resources resources = context.getResources();
        this.B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.I = view;
        this.E = new t0(context, i8, i10);
        fVar.b(this, context);
    }

    public final boolean a() {
        return !this.M && this.E.a();
    }

    public final void b() {
        View view;
        boolean z10 = true;
        if (!a()) {
            if (this.M || (view = this.I) == null) {
                z10 = false;
            } else {
                this.J = view;
                t0 t0Var = this.E;
                t0Var.V.setOnDismissListener(this);
                t0Var.L = this;
                t0Var.U = true;
                q qVar = t0Var.V;
                qVar.setFocusable(true);
                View view2 = this.J;
                boolean z11 = this.L == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.L = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.F);
                }
                view2.addOnAttachStateChangeListener(this.G);
                t0Var.K = view2;
                t0Var.H = this.P;
                boolean z12 = this.N;
                Context context = this.f787b;
                e eVar = this.f789d;
                if (!z12) {
                    this.O = d.o(eVar, context, this.B);
                    this.N = true;
                }
                t0Var.r(this.O);
                qVar.setInputMethodMode(2);
                Rect rect = this.f9356a;
                t0Var.T = rect != null ? new Rect(rect) : null;
                t0Var.b();
                k0 k0Var = t0Var.f1104c;
                k0Var.setOnKeyListener(this);
                if (this.Q) {
                    f fVar = this.f788c;
                    if (fVar.m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, k0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(fVar.m);
                        }
                        frameLayout.setEnabled(false);
                        k0Var.addHeaderView(frameLayout, (Object) null, false);
                    }
                }
                t0Var.p(eVar);
                t0Var.b();
            }
        }
        if (!z10) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void c(f fVar, boolean z10) {
        if (fVar == this.f788c) {
            dismiss();
            j.a aVar = this.K;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }
    }

    public final void d(boolean z10) {
        this.N = false;
        e eVar = this.f789d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        if (a()) {
            this.E.dismiss();
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(j.a aVar) {
        this.K = aVar;
    }

    public final void i(Parcelable parcelable) {
    }

    public final k0 j() {
        return this.E.f1104c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f787b
            android.view.View r6 = r9.J
            boolean r8 = r9.f790e
            int r3 = r9.C
            int r4 = r9.D
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.K
            r0.f782i = r2
            i.d r3 = r0.f783j
            if (r3 == 0) goto L_0x0023
            r3.f(r2)
        L_0x0023:
            boolean r2 = i.d.w(r10)
            r0.f781h = r2
            i.d r3 = r0.f783j
            if (r3 == 0) goto L_0x0030
            r3.q(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.H
            r0.f784k = r2
            r2 = 0
            r9.H = r2
            androidx.appcompat.view.menu.f r2 = r9.f788c
            r2.c(r1)
            androidx.appcompat.widget.t0 r2 = r9.E
            int r3 = r2.B
            int r2 = r2.o()
            int r4 = r9.P
            android.view.View r5 = r9.I
            java.util.WeakHashMap<android.view.View, d2.d1> r6 = d2.i0.f7217a
            int r5 = d2.i0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.I
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f779f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.j$a r0 = r9.K
            if (r0 == 0) goto L_0x0079
            r0.d(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.k(androidx.appcompat.view.menu.m):boolean");
    }

    public final Parcelable l() {
        return null;
    }

    public final void n(f fVar) {
    }

    public final void onDismiss() {
        this.M = true;
        this.f788c.c(true);
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.L = this.J.getViewTreeObserver();
            }
            this.L.removeGlobalOnLayoutListener(this.F);
            this.L = null;
        }
        this.J.removeOnAttachStateChangeListener(this.G);
        PopupWindow.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(View view) {
        this.I = view;
    }

    public final void q(boolean z10) {
        this.f789d.f718c = z10;
    }

    public final void r(int i8) {
        this.P = i8;
    }

    public final void s(int i8) {
        this.E.B = i8;
    }

    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    public final void u(boolean z10) {
        this.Q = z10;
    }

    public final void v(int i8) {
        this.E.l(i8);
    }
}
