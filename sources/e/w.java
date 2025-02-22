package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.y0;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.b1;
import d2.d1;
import d2.f1;
import d2.g1;
import d2.i0;
import e.a;
import e.f;
import h.a;
import h.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class w extends a implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f7730a;

    /* renamed from: b  reason: collision with root package name */
    public Context f7731b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f7732c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f7733d;

    /* renamed from: e  reason: collision with root package name */
    public i0 f7734e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f7735f;

    /* renamed from: g  reason: collision with root package name */
    public final View f7736g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7737h;

    /* renamed from: i  reason: collision with root package name */
    public d f7738i;

    /* renamed from: j  reason: collision with root package name */
    public d f7739j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0162a f7740k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7741l;
    public final ArrayList<a.b> m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f7742n;

    /* renamed from: o  reason: collision with root package name */
    public int f7743o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7744p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7745q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7746r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7747s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7748t = true;

    /* renamed from: u  reason: collision with root package name */
    public g f7749u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7750v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7751w;

    /* renamed from: x  reason: collision with root package name */
    public final a f7752x = new a();

    /* renamed from: y  reason: collision with root package name */
    public final b f7753y = new b();

    /* renamed from: z  reason: collision with root package name */
    public final c f7754z = new c();

    public class a extends f1 {
        public a() {
        }

        public final void a() {
            View view;
            w wVar = w.this;
            if (wVar.f7744p && (view = wVar.f7736g) != null) {
                view.setTranslationY(0.0f);
                wVar.f7733d.setTranslationY(0.0f);
            }
            wVar.f7733d.setVisibility(8);
            wVar.f7733d.setTransitioning(false);
            wVar.f7749u = null;
            a.C0162a aVar = wVar.f7740k;
            if (aVar != null) {
                aVar.d(wVar.f7739j);
                wVar.f7739j = null;
                wVar.f7740k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = wVar.f7732c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
                i0.h.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends f1 {
        public b() {
        }

        public final void a() {
            w wVar = w.this;
            wVar.f7749u = null;
            wVar.f7733d.requestLayout();
        }
    }

    public class c implements g1 {
        public c() {
        }
    }

    public class d extends h.a implements f.a {
        public WeakReference<View> B;

        /* renamed from: c  reason: collision with root package name */
        public final Context f7756c;

        /* renamed from: d  reason: collision with root package name */
        public final f f7757d;

        /* renamed from: e  reason: collision with root package name */
        public a.C0162a f7758e;

        public d(Context context, f.d dVar) {
            this.f7756c = context;
            this.f7758e = dVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f733l = 1;
            this.f7757d = fVar;
            fVar.f726e = this;
        }

        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.C0162a aVar = this.f7758e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f7758e != null) {
                i();
                androidx.appcompat.widget.c cVar = w.this.f7735f.f920d;
                if (cVar != null) {
                    cVar.n();
                }
            }
        }

        public final void c() {
            w wVar = w.this;
            if (wVar.f7738i == this) {
                if (!(!wVar.f7745q && !wVar.f7746r)) {
                    wVar.f7739j = this;
                    wVar.f7740k = this.f7758e;
                } else {
                    this.f7758e.d(this);
                }
                this.f7758e = null;
                wVar.v(false);
                ActionBarContextView actionBarContextView = wVar.f7735f;
                if (actionBarContextView.G == null) {
                    actionBarContextView.h();
                }
                wVar.f7732c.setHideOnContentScrollEnabled(wVar.f7751w);
                wVar.f7738i = null;
            }
        }

        public final View d() {
            WeakReference<View> weakReference = this.B;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final androidx.appcompat.view.menu.f e() {
            return this.f7757d;
        }

        public final MenuInflater f() {
            return new h.f(this.f7756c);
        }

        public final CharSequence g() {
            return w.this.f7735f.getSubtitle();
        }

        public final CharSequence h() {
            return w.this.f7735f.getTitle();
        }

        public final void i() {
            if (w.this.f7738i == this) {
                androidx.appcompat.view.menu.f fVar = this.f7757d;
                fVar.y();
                try {
                    this.f7758e.a(this, fVar);
                } finally {
                    fVar.x();
                }
            }
        }

        public final boolean j() {
            return w.this.f7735f.O;
        }

        public final void k(View view) {
            w.this.f7735f.setCustomView(view);
            this.B = new WeakReference<>(view);
        }

        public final void l(int i8) {
            m(w.this.f7730a.getResources().getString(i8));
        }

        public final void m(CharSequence charSequence) {
            w.this.f7735f.setSubtitle(charSequence);
        }

        public final void n(int i8) {
            o(w.this.f7730a.getResources().getString(i8));
        }

        public final void o(CharSequence charSequence) {
            w.this.f7735f.setTitle(charSequence);
        }

        public final void p(boolean z10) {
            this.f9005b = z10;
            w.this.f7735f.setTitleOptional(z10);
        }
    }

    public w(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (!z10) {
            this.f7736g = decorView.findViewById(16908290);
        }
    }

    public final boolean b() {
        androidx.appcompat.widget.i0 i0Var = this.f7734e;
        if (i0Var == null || !i0Var.j()) {
            return false;
        }
        this.f7734e.collapseActionView();
        return true;
    }

    public final void c(boolean z10) {
        if (z10 != this.f7741l) {
            this.f7741l = z10;
            ArrayList<a.b> arrayList = this.m;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.get(i8).a();
            }
        }
    }

    public final int d() {
        return this.f7734e.q();
    }

    public final Context e() {
        if (this.f7731b == null) {
            TypedValue typedValue = new TypedValue();
            this.f7730a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.f7731b = new ContextThemeWrapper(this.f7730a, i8);
            } else {
                this.f7731b = this.f7730a;
            }
        }
        return this.f7731b;
    }

    public final void f() {
        if (!this.f7745q) {
            this.f7745q = true;
            y(false);
        }
    }

    public final void h() {
        x(this.f7730a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    public final boolean j(int i8, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        d dVar = this.f7738i;
        if (dVar == null || (fVar = dVar.f7757d) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        fVar.setQwertyMode(z10);
        return fVar.performShortcut(i8, keyEvent, 0);
    }

    public final void m(boolean z10) {
        if (!this.f7737h) {
            n(z10);
        }
    }

    public final void n(boolean z10) {
        int i8 = z10 ? 4 : 0;
        int q10 = this.f7734e.q();
        this.f7737h = true;
        this.f7734e.k((i8 & 4) | (-5 & q10));
    }

    public final void o(Drawable drawable) {
        this.f7734e.t(drawable);
    }

    public final void p(boolean z10) {
        g gVar;
        this.f7750v = z10;
        if (!z10 && (gVar = this.f7749u) != null) {
            gVar.a();
        }
    }

    public final void q(int i8) {
        r(this.f7730a.getString(i8));
    }

    public final void r(String str) {
        this.f7734e.setTitle(str);
    }

    public final void s(CharSequence charSequence) {
        this.f7734e.setWindowTitle(charSequence);
    }

    public final void t() {
        if (this.f7745q) {
            this.f7745q = false;
            y(false);
        }
    }

    public final h.a u(f.d dVar) {
        d dVar2 = this.f7738i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f7732c.setHideOnContentScrollEnabled(false);
        this.f7735f.h();
        d dVar3 = new d(this.f7735f.getContext(), dVar);
        androidx.appcompat.view.menu.f fVar = dVar3.f7757d;
        fVar.y();
        try {
            if (!dVar3.f7758e.b(dVar3, fVar)) {
                return null;
            }
            this.f7738i = dVar3;
            dVar3.i();
            this.f7735f.f(dVar3);
            v(true);
            return dVar3;
        } finally {
            fVar.x();
        }
    }

    public final void v(boolean z10) {
        d1 d1Var;
        d1 d1Var2;
        if (z10) {
            if (!this.f7747s) {
                this.f7747s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7732c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f7747s) {
            this.f7747s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7732c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        ActionBarContainer actionBarContainer = this.f7733d;
        WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
        if (i0.g.c(actionBarContainer)) {
            if (z10) {
                d1Var = this.f7734e.o(4, 100);
                d1Var2 = this.f7735f.e(0, 200);
            } else {
                d1Var2 = this.f7734e.o(0, 200);
                d1Var = this.f7735f.e(8, 100);
            }
            g gVar = new g();
            ArrayList<d1> arrayList = gVar.f9055a;
            arrayList.add(d1Var);
            View view = d1Var.f7198a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = d1Var2.f7198a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            arrayList.add(d1Var2);
            gVar.b();
        } else if (z10) {
            this.f7734e.p(4);
            this.f7735f.setVisibility(0);
        } else {
            this.f7734e.p(0);
            this.f7735f.setVisibility(8);
        }
    }

    public final void w(View view) {
        androidx.appcompat.widget.i0 i0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f7732c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof androidx.appcompat.widget.i0) {
            i0Var = (androidx.appcompat.widget.i0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            i0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.f7734e = i0Var;
        this.f7735f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f7733d = actionBarContainer;
        androidx.appcompat.widget.i0 i0Var2 = this.f7734e;
        if (i0Var2 == null || this.f7735f == null || actionBarContainer == null) {
            throw new IllegalStateException(w.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f7730a = i0Var2.getContext();
        if ((this.f7734e.q() & 4) != 0) {
            this.f7737h = true;
        }
        Context context = this.f7730a;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f7734e.i();
        x(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f7730a.obtainStyledAttributes((AttributeSet) null, e.f3895b, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7732c;
            if (actionBarOverlayLayout2.D) {
                this.f7751w = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f7733d;
            WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
            i0.i.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void x(boolean z10) {
        this.f7742n = z10;
        if (!z10) {
            this.f7734e.l();
            this.f7733d.setTabContainer((y0) null);
        } else {
            this.f7733d.setTabContainer((y0) null);
            this.f7734e.l();
        }
        this.f7734e.n();
        androidx.appcompat.widget.i0 i0Var = this.f7734e;
        boolean z11 = this.f7742n;
        i0Var.u(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7732c;
        boolean z12 = this.f7742n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z10) {
        boolean z11 = this.f7747s || (!this.f7745q && !this.f7746r);
        b1 b1Var = null;
        View view = this.f7736g;
        c cVar = this.f7754z;
        if (z11) {
            if (!this.f7748t) {
                this.f7748t = true;
                g gVar = this.f7749u;
                if (gVar != null) {
                    gVar.a();
                }
                this.f7733d.setVisibility(0);
                int i8 = this.f7743o;
                b bVar = this.f7753y;
                if (i8 != 0 || (!this.f7750v && !z10)) {
                    this.f7733d.setAlpha(1.0f);
                    this.f7733d.setTranslationY(0.0f);
                    if (this.f7744p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.a();
                } else {
                    this.f7733d.setTranslationY(0.0f);
                    float f10 = (float) (-this.f7733d.getHeight());
                    if (z10) {
                        int[] iArr = {0, 0};
                        this.f7733d.getLocationInWindow(iArr);
                        f10 -= (float) iArr[1];
                    }
                    this.f7733d.setTranslationY(f10);
                    g gVar2 = new g();
                    d1 a10 = d2.i0.a(this.f7733d);
                    a10.e(0.0f);
                    View view2 = a10.f7198a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            b1Var = new b1(0, cVar, view2);
                        }
                        d1.a.a(view2.animate(), b1Var);
                    }
                    boolean z12 = gVar2.f9059e;
                    ArrayList<d1> arrayList = gVar2.f9055a;
                    if (!z12) {
                        arrayList.add(a10);
                    }
                    if (this.f7744p && view != null) {
                        view.setTranslationY(f10);
                        d1 a11 = d2.i0.a(view);
                        a11.e(0.0f);
                        if (!gVar2.f9059e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = B;
                    boolean z13 = gVar2.f9059e;
                    if (!z13) {
                        gVar2.f9057c = decelerateInterpolator;
                    }
                    if (!z13) {
                        gVar2.f9056b = 250;
                    }
                    if (!z13) {
                        gVar2.f9058d = bVar;
                    }
                    this.f7749u = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7732c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
                    i0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f7748t) {
            this.f7748t = false;
            g gVar3 = this.f7749u;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i10 = this.f7743o;
            a aVar = this.f7752x;
            if (i10 != 0 || (!this.f7750v && !z10)) {
                aVar.a();
                return;
            }
            this.f7733d.setAlpha(1.0f);
            this.f7733d.setTransitioning(true);
            g gVar4 = new g();
            float f11 = (float) (-this.f7733d.getHeight());
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f7733d.getLocationInWindow(iArr2);
                f11 -= (float) iArr2[1];
            }
            d1 a12 = d2.i0.a(this.f7733d);
            a12.e(f11);
            View view3 = a12.f7198a.get();
            if (view3 != null) {
                if (cVar != null) {
                    b1Var = new b1(0, cVar, view3);
                }
                d1.a.a(view3.animate(), b1Var);
            }
            boolean z14 = gVar4.f9059e;
            ArrayList<d1> arrayList2 = gVar4.f9055a;
            if (!z14) {
                arrayList2.add(a12);
            }
            if (this.f7744p && view != null) {
                d1 a13 = d2.i0.a(view);
                a13.e(f11);
                if (!gVar4.f9059e) {
                    arrayList2.add(a13);
                }
            }
            AccelerateInterpolator accelerateInterpolator = A;
            boolean z15 = gVar4.f9059e;
            if (!z15) {
                gVar4.f9057c = accelerateInterpolator;
            }
            if (!z15) {
                gVar4.f9056b = 250;
            }
            if (!z15) {
                gVar4.f9058d = aVar;
            }
            this.f7749u = gVar4;
            gVar4.b();
        }
    }

    public w(Dialog dialog) {
        new ArrayList();
        w(dialog.getWindow().getDecorView());
    }
}
