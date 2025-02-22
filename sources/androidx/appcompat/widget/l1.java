package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.f1;
import d2.i0;
import e.f;

public final class l1 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f1060a;

    /* renamed from: b  reason: collision with root package name */
    public int f1061b;

    /* renamed from: c  reason: collision with root package name */
    public y0 f1062c;

    /* renamed from: d  reason: collision with root package name */
    public View f1063d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1064e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1065f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1066g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1067h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1068i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1069j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1070k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1071l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public c f1072n;

    /* renamed from: o  reason: collision with root package name */
    public int f1073o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1074p;

    public class a extends f1 {
        public boolean C = false;
        public final /* synthetic */ int D;

        public a(int i8) {
            this.D = i8;
        }

        public final void a() {
            if (!this.C) {
                l1.this.f1060a.setVisibility(this.D);
            }
        }

        public final void b(View view) {
            this.C = true;
        }

        public final void d() {
            l1.this.f1060a.setVisibility(0);
        }
    }

    public l1(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f1060a = toolbar;
        this.f1068i = toolbar.getTitle();
        this.f1069j = toolbar.getSubtitle();
        this.f1067h = this.f1068i != null;
        this.f1066g = toolbar.getNavigationIcon();
        String str = null;
        h1 m10 = h1.m(toolbar.getContext(), (AttributeSet) null, e.f3895b, R.attr.actionBarStyle);
        int i8 = 15;
        this.f1074p = m10.e(15);
        if (z10) {
            CharSequence k10 = m10.k(27);
            if (!TextUtils.isEmpty(k10)) {
                setTitle(k10);
            }
            CharSequence k11 = m10.k(25);
            if (!TextUtils.isEmpty(k11)) {
                this.f1069j = k11;
                if ((this.f1061b & 8) != 0) {
                    toolbar.setSubtitle(k11);
                }
            }
            Drawable e10 = m10.e(20);
            if (e10 != null) {
                this.f1065f = e10;
                v();
            }
            Drawable e11 = m10.e(17);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f1066g == null && (drawable = this.f1074p) != null) {
                t(drawable);
            }
            k(m10.h(10, 0));
            int i10 = m10.i(9, 0);
            if (i10 != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i10, toolbar, false);
                View view = this.f1063d;
                if (!(view == null || (this.f1061b & 16) == 0)) {
                    toolbar.removeView(view);
                }
                this.f1063d = inflate;
                if (!(inflate == null || (this.f1061b & 16) == 0)) {
                    toolbar.addView(inflate);
                }
                k(this.f1061b | 16);
            }
            int layoutDimension = m10.f1015b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int c3 = m10.c(7, -1);
            int c10 = m10.c(3, -1);
            if (c3 >= 0 || c10 >= 0) {
                int max = Math.max(c3, 0);
                int max2 = Math.max(c10, 0);
                if (toolbar.P == null) {
                    toolbar.P = new x0();
                }
                toolbar.P.a(max, max2);
            }
            int i11 = m10.i(28, 0);
            if (i11 != 0) {
                Context context = toolbar.getContext();
                toolbar.H = i11;
                d0 d0Var = toolbar.f881b;
                if (d0Var != null) {
                    d0Var.setTextAppearance(context, i11);
                }
            }
            int i12 = m10.i(26, 0);
            if (i12 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.I = i12;
                d0 d0Var2 = toolbar.f883c;
                if (d0Var2 != null) {
                    d0Var2.setTextAppearance(context2, i12);
                }
            }
            int i13 = m10.i(22, 0);
            if (i13 != 0) {
                toolbar.setPopupTheme(i13);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1074p = toolbar.getNavigationIcon();
            } else {
                i8 = 11;
            }
            this.f1061b = i8;
        }
        m10.n();
        if (R.string.abc_action_bar_up_description != this.f1073o) {
            this.f1073o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f1073o;
                str = i14 != 0 ? getContext().getString(i14) : str;
                this.f1070k = str;
                if ((this.f1061b & 4) != 0) {
                    if (TextUtils.isEmpty(str)) {
                        toolbar.setNavigationContentDescription(this.f1073o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1070k);
                    }
                }
            }
        }
        this.f1070k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new k1(this));
    }

    public final boolean a() {
        ActionMenuView actionMenuView = this.f1060a.f879a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.P;
        return cVar != null && cVar.j();
    }

    public final void b() {
        this.m = true;
    }

    public final void c(f fVar, f.c cVar) {
        c cVar2 = this.f1072n;
        Toolbar toolbar = this.f1060a;
        if (cVar2 == null) {
            c cVar3 = new c(toolbar.getContext());
            this.f1072n = cVar3;
            cVar3.E = R.id.action_menu_presenter;
        }
        c cVar4 = this.f1072n;
        cVar4.f694e = cVar;
        if (fVar != null || toolbar.f879a != null) {
            toolbar.e();
            androidx.appcompat.view.menu.f fVar2 = toolbar.f879a.L;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.f894k0);
                    fVar2.r(toolbar.f895l0);
                }
                if (toolbar.f895l0 == null) {
                    toolbar.f895l0 = new Toolbar.f();
                }
                cVar4.N = true;
                if (fVar != null) {
                    fVar.b(cVar4, toolbar.F);
                    fVar.b(toolbar.f895l0, toolbar.F);
                } else {
                    cVar4.h(toolbar.F, (androidx.appcompat.view.menu.f) null);
                    toolbar.f895l0.h(toolbar.F, (androidx.appcompat.view.menu.f) null);
                    cVar4.d(true);
                    toolbar.f895l0.d(true);
                }
                toolbar.f879a.setPopupTheme(toolbar.G);
                toolbar.f879a.setPresenter(cVar4);
                toolbar.f894k0 = cVar4;
                toolbar.s();
            }
        }
    }

    public final void collapseActionView() {
        Toolbar.f fVar = this.f1060a.f895l0;
        h hVar = fVar == null ? null : fVar.f908b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f879a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f1060a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f879a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.O
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l1.d():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1060a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f879a
            r1 = 0
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.P
            r2 = 1
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.R
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r2
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l1.e():boolean");
    }

    public final boolean f() {
        ActionMenuView actionMenuView = this.f1060a.f879a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.P;
        return cVar != null && cVar.b();
    }

    public final boolean g() {
        ActionMenuView actionMenuView = this.f1060a.f879a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.P;
        return cVar != null && cVar.n();
    }

    public final Context getContext() {
        return this.f1060a.getContext();
    }

    public final CharSequence getTitle() {
        return this.f1060a.getTitle();
    }

    public final void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f1060a.f879a;
        if (actionMenuView != null && (cVar = actionMenuView.P) != null) {
            cVar.b();
            c.a aVar = cVar.Q;
            if (aVar != null && aVar.b()) {
                aVar.f783j.dismiss();
            }
        }
    }

    public final void i() {
    }

    public final boolean j() {
        Toolbar.f fVar = this.f1060a.f895l0;
        return (fVar == null || fVar.f908b == null) ? false : true;
    }

    public final void k(int i8) {
        View view;
        int i10 = this.f1061b ^ i8;
        this.f1061b = i8;
        if (i10 != 0) {
            int i11 = i10 & 4;
            Toolbar toolbar = this.f1060a;
            if (i11 != 0) {
                if (!((i8 & 4) == 0 || (i8 & 4) == 0)) {
                    if (TextUtils.isEmpty(this.f1070k)) {
                        toolbar.setNavigationContentDescription(this.f1073o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1070k);
                    }
                }
                if ((this.f1061b & 4) != 0) {
                    Drawable drawable = this.f1066g;
                    if (drawable == null) {
                        drawable = this.f1074p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                v();
            }
            if ((i10 & 8) != 0) {
                if ((i8 & 8) != 0) {
                    toolbar.setTitle(this.f1068i);
                    toolbar.setSubtitle(this.f1069j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f1063d) != null) {
                if ((i8 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void l() {
        Toolbar toolbar;
        y0 y0Var = this.f1062c;
        if (y0Var != null && y0Var.getParent() == (toolbar = this.f1060a)) {
            toolbar.removeView(this.f1062c);
        }
        this.f1062c = null;
    }

    public final void m(int i8) {
        this.f1065f = i8 != 0 ? f.a.a(getContext(), i8) : null;
        v();
    }

    public final void n() {
    }

    public final d1 o(int i8, long j10) {
        d1 a10 = i0.a(this.f1060a);
        a10.a(i8 == 0 ? 1.0f : 0.0f);
        a10.c(j10);
        a10.d(new a(i8));
        return a10;
    }

    public final void p(int i8) {
        this.f1060a.setVisibility(i8);
    }

    public final int q() {
        return this.f1061b;
    }

    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void setIcon(int i8) {
        setIcon(i8 != 0 ? f.a.a(getContext(), i8) : null);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f1067h = true;
        this.f1068i = charSequence;
        if ((this.f1061b & 8) != 0) {
            Toolbar toolbar = this.f1060a;
            toolbar.setTitle(charSequence);
            if (this.f1067h) {
                i0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.f1071l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1067h) {
            this.f1068i = charSequence;
            if ((this.f1061b & 8) != 0) {
                Toolbar toolbar = this.f1060a;
                toolbar.setTitle(charSequence);
                if (this.f1067h) {
                    i0.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void t(Drawable drawable) {
        this.f1066g = drawable;
        int i8 = this.f1061b & 4;
        Toolbar toolbar = this.f1060a;
        if (i8 != 0) {
            if (drawable == null) {
                drawable = this.f1074p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    public final void u(boolean z10) {
        this.f1060a.setCollapsible(z10);
    }

    public final void v() {
        Drawable drawable;
        int i8 = this.f1061b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) != 0) {
            drawable = this.f1065f;
            if (drawable == null) {
                drawable = this.f1064e;
            }
        } else {
            drawable = this.f1064e;
        }
        this.f1060a.setLogo(drawable);
    }

    public final void setIcon(Drawable drawable) {
        this.f1064e = drawable;
        v();
    }
}
