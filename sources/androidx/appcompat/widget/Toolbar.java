package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.i0;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.p;
import d2.q;
import d2.r;
import d2.t;
import e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup implements q {
    public final Drawable B;
    public final CharSequence C;
    public n D;
    public View E;
    public Context F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public x0 P;
    public int Q;
    public int R;
    public final int S;
    public CharSequence T;
    public CharSequence U;
    public ColorStateList V;
    public ColorStateList W;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f879a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f880a0;

    /* renamed from: b  reason: collision with root package name */
    public d0 f881b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f882b0;

    /* renamed from: c  reason: collision with root package name */
    public d0 f883c;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList<View> f884c0;

    /* renamed from: d  reason: collision with root package name */
    public n f885d;

    /* renamed from: d0  reason: collision with root package name */
    public final ArrayList<View> f886d0;

    /* renamed from: e  reason: collision with root package name */
    public AppCompatImageView f887e;

    /* renamed from: e0  reason: collision with root package name */
    public final int[] f888e0;

    /* renamed from: f0  reason: collision with root package name */
    public final r f889f0;

    /* renamed from: g0  reason: collision with root package name */
    public ArrayList<MenuItem> f890g0;

    /* renamed from: h0  reason: collision with root package name */
    public h f891h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a f892i0;

    /* renamed from: j0  reason: collision with root package name */
    public l1 f893j0;

    /* renamed from: k0  reason: collision with root package name */
    public c f894k0;

    /* renamed from: l0  reason: collision with root package name */
    public f f895l0;

    /* renamed from: m0  reason: collision with root package name */
    public j.a f896m0;

    /* renamed from: n0  reason: collision with root package name */
    public f.a f897n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f898o0;

    /* renamed from: p0  reason: collision with root package name */
    public OnBackInvokedCallback f899p0;

    /* renamed from: q0  reason: collision with root package name */
    public OnBackInvokedDispatcher f900q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f901r0;

    /* renamed from: s0  reason: collision with root package name */
    public final b f902s0;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f879a;
            if (actionMenuView != null && (cVar = actionMenuView.P) != null) {
                cVar.n();
            }
        }
    }

    public class c implements f.a {
        public c() {
        }

        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.f897n0;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        public final void b(androidx.appcompat.view.menu.f fVar) {
            Toolbar toolbar = Toolbar.this;
            c cVar = toolbar.f879a.P;
            if (!(cVar != null && cVar.j())) {
                Iterator<t> it = toolbar.f889f0.f7272b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            f.a aVar = toolbar.f897n0;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            f fVar = Toolbar.this.f895l0;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f908b;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new j1(runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements j {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f907a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f908b;

        public f() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        public final void d(boolean z10) {
            if (this.f908b != null) {
                androidx.appcompat.view.menu.f fVar = this.f907a;
                boolean z11 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            break;
                        } else if (this.f907a.getItem(i8) == this.f908b) {
                            z11 = true;
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                if (!z11) {
                    g(this.f908b);
                }
            }
        }

        public final boolean e() {
            return false;
        }

        public final boolean g(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.E;
            if (view instanceof h.b) {
                ((h.b) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.E);
            toolbar.removeView(toolbar.D);
            toolbar.E = null;
            ArrayList<View> arrayList = toolbar.f886d0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f908b = null;
                    toolbar.requestLayout();
                    hVar.C = false;
                    hVar.f760n.p(false);
                    toolbar.s();
                    return true;
                }
            }
        }

        public final int getId() {
            return 0;
        }

        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f907a;
            if (!(fVar2 == null || (hVar = this.f908b) == null)) {
                fVar2.d(hVar);
            }
            this.f907a = fVar;
        }

        public final void i(Parcelable parcelable) {
        }

        public final boolean k(m mVar) {
            return false;
        }

        public final Parcelable l() {
            return null;
        }

        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.D.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.D);
                }
                toolbar.addView(toolbar.D);
            }
            View actionView = hVar.getActionView();
            toolbar.E = actionView;
            this.f908b = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.E);
                }
                g gVar = new g();
                gVar.f7613a = (toolbar.J & 112) | 8388611;
                gVar.f910b = 2;
                toolbar.E.setLayoutParams(gVar);
                toolbar.addView(toolbar.E);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (!(((g) childAt.getLayoutParams()).f910b == 2 || childAt == toolbar.f879a)) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f886d0.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.f760n.p(false);
            View view = toolbar.E;
            if (view instanceof h.b) {
                ((h.b) view).onActionViewExpanded();
            }
            toolbar.s();
            return true;
        }
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0126a ? new g((a.C0126a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i8 = 0; i8 < menu.size(); i8++) {
            arrayList.add(menu.getItem(i8));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return p.b(marginLayoutParams) + p.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void C(i0.c cVar) {
        r rVar = this.f889f0;
        rVar.f7272b.remove(cVar);
        if (((r.a) rVar.f7273c.remove(cVar)) == null) {
            rVar.f7271a.run();
            return;
        }
        throw null;
    }

    public final void a(int i8, ArrayList arrayList) {
        WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
        boolean z10 = i0.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f910b == 0 && r(childAt)) {
                    int i11 = gVar.f7613a;
                    WeakHashMap<View, d1> weakHashMap2 = d2.i0.f7217a;
                    int d10 = i0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, d10) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f910b == 0 && r(childAt2)) {
                int i13 = gVar2.f7613a;
                WeakHashMap<View, d1> weakHashMap3 = d2.i0.f7217a;
                int d11 = i0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, d11) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVar = layoutParams == null ? new g() : !checkLayoutParams(layoutParams) ? g(layoutParams) : (g) layoutParams;
        gVar.f910b = 1;
        if (!z10 || this.E == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.f886d0.add(view);
    }

    public final void c() {
        if (this.D == null) {
            n nVar = new n(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.D = nVar;
            nVar.setImageDrawable(this.B);
            this.D.setContentDescription(this.C);
            g gVar = new g();
            gVar.f7613a = (this.J & 112) | 8388611;
            gVar.f910b = 2;
            this.D.setLayoutParams(gVar);
            this.D.setOnClickListener(new d());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f879a;
        if (actionMenuView.L == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.f895l0 == null) {
                this.f895l0 = new f();
            }
            this.f879a.setExpandedActionViewsExclusive(true);
            fVar.b(this.f895l0, this.F);
            s();
        }
    }

    public final void e() {
        if (this.f879a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f879a = actionMenuView;
            actionMenuView.setPopupTheme(this.G);
            this.f879a.setOnMenuItemClickListener(this.f892i0);
            ActionMenuView actionMenuView2 = this.f879a;
            j.a aVar = this.f896m0;
            c cVar = new c();
            actionMenuView2.Q = aVar;
            actionMenuView2.R = cVar;
            g gVar = new g();
            gVar.f7613a = (this.J & 112) | 8388613;
            this.f879a.setLayoutParams(gVar);
            b(this.f879a, false);
        }
    }

    public final void f() {
        if (this.f885d == null) {
            this.f885d = new n(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f7613a = (this.J & 112) | 8388611;
            this.f885d.setLayoutParams(gVar);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        n nVar = this.D;
        if (nVar != null) {
            return nVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        n nVar = this.D;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        x0 x0Var = this.P;
        if (x0Var != null) {
            return x0Var.f1144g ? x0Var.f1138a : x0Var.f1139b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.R;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        x0 x0Var = this.P;
        if (x0Var != null) {
            return x0Var.f1138a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        x0 x0Var = this.P;
        if (x0Var != null) {
            return x0Var.f1139b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        x0 x0Var = this.P;
        if (x0Var != null) {
            return x0Var.f1144g ? x0Var.f1139b : x0Var.f1138a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.Q;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f879a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.f r0 = r0.L
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.R
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
        return i0.e.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
        return i0.e.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.Q, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f887e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f887e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f879a.getMenu();
    }

    public View getNavButtonView() {
        return this.f885d;
    }

    public CharSequence getNavigationContentDescription() {
        n nVar = this.f885d;
        if (nVar != null) {
            return nVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        n nVar = this.f885d;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.f894k0;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f879a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.F;
    }

    public int getPopupTheme() {
        return this.G;
    }

    public CharSequence getSubtitle() {
        return this.U;
    }

    public final TextView getSubtitleTextView() {
        return this.f883c;
    }

    public CharSequence getTitle() {
        return this.T;
    }

    public int getTitleMarginBottom() {
        return this.O;
    }

    public int getTitleMarginEnd() {
        return this.M;
    }

    public int getTitleMarginStart() {
        return this.L;
    }

    public int getTitleMarginTop() {
        return this.N;
    }

    public final TextView getTitleTextView() {
        return this.f881b;
    }

    public i0 getWrapper() {
        if (this.f893j0 == null) {
            this.f893j0 = new l1(this, true);
        }
        return this.f893j0;
    }

    public final int h(View view, int i8) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 > 0 ? (measuredHeight - i8) / 2 : 0;
        int i11 = gVar.f7613a & 112;
        if (!(i11 == 16 || i11 == 48 || i11 == 80)) {
            i11 = this.S & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = gVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = gVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public void k(int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.f890g0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<t> it2 = this.f889f0.f7272b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f890g0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f886d0.contains(view);
    }

    public final int n(View view, int i8, int i10, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.leftMargin - iArr[0];
        int max = Math.max(0, i11) + i8;
        iArr[0] = Math.max(0, -i11);
        int h3 = h(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h3, max + measuredWidth, view.getMeasuredHeight() + h3);
        return measuredWidth + gVar.rightMargin + max;
    }

    public final int o(View view, int i8, int i10, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.rightMargin - iArr[1];
        int max = i8 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int h3 = h(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h3, max, view.getMeasuredHeight() + h3);
        return max - (measuredWidth + gVar.leftMargin);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f902s0);
        s();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f882b0 = false;
        }
        if (!this.f882b0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f882b0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f882b0 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0292 A[LOOP:0: B:99:0x0290->B:100:0x0292, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ae A[LOOP:1: B:102:0x02ac->B:103:0x02ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cd A[LOOP:2: B:105:0x02cb->B:106:0x02cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x031b A[LOOP:3: B:113:0x0319->B:114:0x031b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            int r1 = d2.i0.e.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f888e0
            r11[r2] = r3
            r11[r3] = r3
            int r12 = d2.i0.d.d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            androidx.appcompat.widget.n r13 = r0.f885d
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            androidx.appcompat.widget.n r13 = r0.f885d
            int r13 = r0.o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            androidx.appcompat.widget.n r13 = r0.f885d
            int r13 = r0.n(r13, r6, r12, r11)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            androidx.appcompat.widget.n r15 = r0.D
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            androidx.appcompat.widget.n r15 = r0.D
            int r14 = r0.o(r15, r14, r12, r11)
            goto L_0x0070
        L_0x006a:
            androidx.appcompat.widget.n r15 = r0.D
            int r13 = r0.n(r15, r13, r12, r11)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f879a
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f879a
            int r13 = r0.n(r15, r13, r12, r11)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f879a
            int r14 = r0.o(r15, r14, r12, r11)
        L_0x0087:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.E
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.E
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.E
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00c4:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f887e
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f887e
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00db
        L_0x00d5:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f887e
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00db:
            androidx.appcompat.widget.d0 r13 = r0.f881b
            boolean r13 = r0.r(r13)
            androidx.appcompat.widget.d0 r14 = r0.f883c
            boolean r14 = r0.r(r14)
            if (r13 == 0) goto L_0x0102
            androidx.appcompat.widget.d0 r15 = r0.f881b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r3 = r15.topMargin
            r23 = r7
            androidx.appcompat.widget.d0 r7 = r0.f881b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0105
        L_0x0102:
            r23 = r7
            r7 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            androidx.appcompat.widget.d0 r3 = r0.f883c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.d0 r4 = r0.f883c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r22 = r12
            goto L_0x0284
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            androidx.appcompat.widget.d0 r3 = r0.f881b
            goto L_0x0133
        L_0x0131:
            androidx.appcompat.widget.d0 r3 = r0.f883c
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            androidx.appcompat.widget.d0 r4 = r0.f883c
            goto L_0x013a
        L_0x0138:
            androidx.appcompat.widget.d0 r4 = r0.f881b
        L_0x013a:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            if (r13 == 0) goto L_0x0150
            androidx.appcompat.widget.d0 r15 = r0.f881b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            androidx.appcompat.widget.d0 r15 = r0.f883c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.S
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a1
            r6 = 80
            if (r15 == r6) goto L_0x0195
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.N
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x017e
            r6 = r15
            goto L_0x0193
        L_0x017e:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.O
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0193
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0193:
            int r8 = r8 + r6
            goto L_0x01ae
        L_0x0195:
            r22 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.O
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01ae
        L_0x01a1:
            r22 = r12
            int r4 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.N
            int r8 = r4 + r3
        L_0x01ae:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b5
            int r1 = r0.L
            goto L_0x01b6
        L_0x01b5:
            r1 = 0
        L_0x01b6:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01ed
            androidx.appcompat.widget.d0 r1 = r0.f881b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            androidx.appcompat.widget.d0 r3 = r0.f881b
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.d0 r4 = r0.f881b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.d0 r5 = r0.f881b
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.M
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01ee
        L_0x01ed:
            r3 = r10
        L_0x01ee:
            if (r14 == 0) goto L_0x0214
            androidx.appcompat.widget.d0 r1 = r0.f883c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.d0 r1 = r0.f883c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.d0 r4 = r0.f883c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.d0 r5 = r0.f883c
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.M
            int r1 = r10 - r1
            goto L_0x0215
        L_0x0214:
            r1 = r10
        L_0x0215:
            if (r17 == 0) goto L_0x0284
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x0284
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.L
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x0258
            androidx.appcompat.widget.d0 r1 = r0.f881b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            androidx.appcompat.widget.d0 r3 = r0.f881b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.d0 r4 = r0.f881b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.d0 r5 = r0.f881b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.M
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0259
        L_0x0258:
            r3 = r2
        L_0x0259:
            if (r14 == 0) goto L_0x027d
            androidx.appcompat.widget.d0 r1 = r0.f883c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.d0 r1 = r0.f883c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.d0 r4 = r0.f883c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.d0 r5 = r0.f883c
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.M
            int r1 = r1 + r4
            goto L_0x027e
        L_0x027d:
            r1 = r2
        L_0x027e:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r3, r1)
        L_0x0284:
            java.util.ArrayList<android.view.View> r1 = r0.f884c0
            r3 = 3
            r0.a(r3, r1)
            int r3 = r1.size()
            r4 = r2
            r2 = 0
        L_0x0290:
            if (r2 >= r3) goto L_0x02a1
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.n(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x0290
        L_0x02a1:
            r12 = r22
            r2 = 5
            r0.a(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L_0x02ac:
            if (r3 >= r2) goto L_0x02bb
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.o(r5, r10, r12, r11)
            int r3 = r3 + 1
            goto L_0x02ac
        L_0x02bb:
            r3 = 1
            r0.a(r3, r1)
            r2 = 0
            r5 = r11[r2]
            r2 = r11[r3]
            int r3 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02cb:
            if (r5 >= r3) goto L_0x02fe
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r9 = (androidx.appcompat.widget.Toolbar.g) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02cb
        L_0x02fe:
            r2 = 0
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r3 = r3 + r18
            int r5 = r6 / 2
            int r3 = r3 - r5
            int r6 = r6 + r3
            if (r3 >= r4) goto L_0x030e
            goto L_0x0315
        L_0x030e:
            if (r6 <= r10) goto L_0x0314
            int r6 = r6 - r10
            int r4 = r3 - r6
            goto L_0x0315
        L_0x0314:
            r4 = r3
        L_0x0315:
            int r3 = r1.size()
        L_0x0319:
            if (r2 >= r3) goto L_0x0328
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r4 = r0.n(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x0319
        L_0x0328:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i8, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        char a10 = q1.a(this);
        char c3 = a10 ^ 1;
        int i18 = 0;
        if (r(this.f885d)) {
            q(this.f885d, i8, 0, i10, this.K);
            i13 = i(this.f885d) + this.f885d.getMeasuredWidth();
            i12 = Math.max(0, j(this.f885d) + this.f885d.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f885d.getMeasuredState());
        } else {
            i13 = 0;
            i12 = 0;
            i11 = 0;
        }
        if (r(this.D)) {
            q(this.D, i8, 0, i10, this.K);
            i13 = i(this.D) + this.D.getMeasuredWidth();
            i12 = Math.max(i12, j(this.D) + this.D.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.D.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i13) + 0;
        int max2 = Math.max(0, currentContentInsetStart - i13);
        int[] iArr = this.f888e0;
        iArr[a10] = max2;
        if (r(this.f879a)) {
            q(this.f879a, i8, max, i10, this.K);
            i14 = i(this.f879a) + this.f879a.getMeasuredWidth();
            i12 = Math.max(i12, j(this.f879a) + this.f879a.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f879a.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i14);
        if (r(this.E)) {
            max3 += p(this.E, i8, max3, i10, 0, iArr);
            i12 = Math.max(i12, j(this.E) + this.E.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.E.getMeasuredState());
        }
        if (r(this.f887e)) {
            max3 += p(this.f887e, i8, max3, i10, 0, iArr);
            i12 = Math.max(i12, j(this.f887e) + this.f887e.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f887e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((g) childAt.getLayoutParams()).f910b == 0 && r(childAt)) {
                max3 += p(childAt, i8, max3, i10, 0, iArr);
                i12 = Math.max(i12, j(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i20 = this.N + this.O;
        int i21 = this.L + this.M;
        if (r(this.f881b)) {
            p(this.f881b, i8, max3 + i21, i10, i20, iArr);
            int i22 = i(this.f881b) + this.f881b.getMeasuredWidth();
            i15 = j(this.f881b) + this.f881b.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i11, this.f881b.getMeasuredState());
            i16 = i22;
        } else {
            i15 = 0;
            i17 = i11;
            i16 = 0;
        }
        if (r(this.f883c)) {
            i16 = Math.max(i16, p(this.f883c, i8, max3 + i21, i10, i15 + i20, iArr));
            i15 += j(this.f883c) + this.f883c.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i17, this.f883c.getMeasuredState());
        } else {
            int i23 = i17;
        }
        int max4 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i16, getSuggestedMinimumWidth()), i8, -16777216 & i17);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i17 << 16);
        if (this.f898o0) {
            int childCount2 = getChildCount();
            int i24 = 0;
            while (true) {
                if (i24 >= childCount2) {
                    z10 = true;
                    break;
                }
                View childAt2 = getChildAt(i24);
                if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i24++;
            }
        }
        z10 = false;
        if (!z10) {
            i18 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f10267a);
        ActionMenuView actionMenuView = this.f879a;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.L : null;
        int i8 = iVar.f911c;
        if (!(i8 == 0 || this.f895l0 == null || fVar == null || (findItem = fVar.findItem(i8)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f912d) {
            b bVar = this.f902s0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    public final void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        if (this.P == null) {
            this.P = new x0();
        }
        x0 x0Var = this.P;
        boolean z10 = true;
        if (i8 != 1) {
            z10 = false;
        }
        if (z10 != x0Var.f1144g) {
            x0Var.f1144g = z10;
            if (!x0Var.f1145h) {
                x0Var.f1138a = x0Var.f1142e;
                x0Var.f1139b = x0Var.f1143f;
            } else if (z10) {
                int i10 = x0Var.f1141d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = x0Var.f1142e;
                }
                x0Var.f1138a = i10;
                int i11 = x0Var.f1140c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = x0Var.f1143f;
                }
                x0Var.f1139b = i11;
            } else {
                int i12 = x0Var.f1140c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = x0Var.f1142e;
                }
                x0Var.f1138a = i12;
                int i13 = x0Var.f1141d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = x0Var.f1143f;
                }
                x0Var.f1139b = i13;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f895l0;
        if (!(fVar == null || (hVar = fVar.f908b) == null)) {
            iVar.f911c = hVar.f748a;
        }
        ActionMenuView actionMenuView = this.f879a;
        boolean z10 = false;
        if (actionMenuView != null) {
            c cVar = actionMenuView.P;
            if (cVar != null && cVar.j()) {
                z10 = true;
            }
        }
        iVar.f912d = z10;
        return iVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f880a0 = false;
        }
        if (!this.f880a0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f880a0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f880a0 = false;
        }
        return true;
    }

    public final int p(View view, int i8, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i8, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            f fVar = this.f895l0;
            boolean z10 = false;
            if (((fVar == null || fVar.f908b == null) ? false : true) && a10 != null) {
                WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
                if (i0.g.b(this) && this.f901r0) {
                    z10 = true;
                }
            }
            if (z10 && this.f900q0 == null) {
                if (this.f899p0 == null) {
                    this.f899p0 = e.b(new androidx.activity.j(this, 1));
                }
                e.c(a10, this.f899p0);
                this.f900q0 = a10;
            } else if (!z10 && (onBackInvokedDispatcher = this.f900q0) != null) {
                e.d(onBackInvokedDispatcher, this.f899p0);
                this.f900q0 = null;
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f901r0 != z10) {
            this.f901r0 = z10;
            s();
        }
    }

    public void setCollapseContentDescription(int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseIcon(int i8) {
        setCollapseIcon(f.a.a(getContext(), i8));
    }

    public void setCollapsible(boolean z10) {
        this.f898o0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.R) {
            this.R = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.Q) {
            this.Q = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i8) {
        setLogo(f.a.a(getContext(), i8));
    }

    public void setLogoDescription(int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationIcon(int i8) {
        setNavigationIcon(f.a.a(getContext(), i8));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f885d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f891h0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f879a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i8) {
        if (this.G != i8) {
            this.G = i8;
            if (i8 == 0) {
                this.F = getContext();
            } else {
                this.F = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitleTextColor(int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitle(int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitleMarginBottom(int i8) {
        this.O = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.M = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.L = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.N = i8;
        requestLayout();
    }

    public void setTitleTextColor(int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public final void x(i0.c cVar) {
        r rVar = this.f889f0;
        rVar.f7272b.add(cVar);
        rVar.f7271a.run();
    }

    public static class g extends a.C0126a {

        /* renamed from: b  reason: collision with root package name */
        public int f910b = 0;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public g() {
            this.f7613a = 8388627;
        }

        public g(g gVar) {
            super((a.C0126a) gVar);
            this.f910b = gVar.f910b;
        }

        public g(a.C0126a aVar) {
            super(aVar);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.S = 8388627;
        this.f884c0 = new ArrayList<>();
        this.f886d0 = new ArrayList<>();
        this.f888e0 = new int[2];
        this.f889f0 = new r(new i1(this, 0));
        this.f890g0 = new ArrayList<>();
        this.f892i0 = new a();
        this.f902s0 = new b();
        Context context2 = getContext();
        int[] iArr = cb.e.U;
        h1 m = h1.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        d2.i0.m(this, context, iArr, attributeSet, m.f1015b, R.attr.toolbarStyle);
        this.H = m.i(28, 0);
        this.I = m.i(19, 0);
        TypedArray typedArray = m.f1015b;
        this.S = typedArray.getInteger(0, 8388627);
        this.J = typedArray.getInteger(2, 48);
        int c3 = m.c(22, 0);
        c3 = m.l(27) ? m.c(27, c3) : c3;
        this.O = c3;
        this.N = c3;
        this.M = c3;
        this.L = c3;
        int c10 = m.c(25, -1);
        if (c10 >= 0) {
            this.L = c10;
        }
        int c11 = m.c(24, -1);
        if (c11 >= 0) {
            this.M = c11;
        }
        int c12 = m.c(26, -1);
        if (c12 >= 0) {
            this.N = c12;
        }
        int c13 = m.c(23, -1);
        if (c13 >= 0) {
            this.O = c13;
        }
        this.K = m.d(13, -1);
        int c14 = m.c(9, Integer.MIN_VALUE);
        int c15 = m.c(5, Integer.MIN_VALUE);
        int d10 = m.d(7, 0);
        int d11 = m.d(8, 0);
        if (this.P == null) {
            this.P = new x0();
        }
        x0 x0Var = this.P;
        x0Var.f1145h = false;
        if (d10 != Integer.MIN_VALUE) {
            x0Var.f1142e = d10;
            x0Var.f1138a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            x0Var.f1143f = d11;
            x0Var.f1139b = d11;
        }
        if (!(c14 == Integer.MIN_VALUE && c15 == Integer.MIN_VALUE)) {
            x0Var.a(c14, c15);
        }
        this.Q = m.c(10, Integer.MIN_VALUE);
        this.R = m.c(6, Integer.MIN_VALUE);
        this.B = m.e(4);
        this.C = m.k(3);
        CharSequence k10 = m.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.F = getContext();
        setPopupTheme(m.i(17, 0));
        Drawable e10 = m.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m.l(29)) {
            setTitleTextColor(m.b(29));
        }
        if (m.l(20)) {
            setSubtitleTextColor(m.b(20));
        }
        if (m.l(14)) {
            k(m.i(14, 0));
        }
        m.n();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        n nVar = this.D;
        if (nVar != null) {
            nVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.D.setImageDrawable(drawable);
            return;
        }
        n nVar = this.D;
        if (nVar != null) {
            nVar.setImageDrawable(this.B);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f887e == null) {
                this.f887e = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!m(this.f887e)) {
                b(this.f887e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f887e;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f887e);
                this.f886d0.remove(this.f887e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f887e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f887e == null) {
            this.f887e = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        AppCompatImageView appCompatImageView = this.f887e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        n nVar = this.f885d;
        if (nVar != null) {
            nVar.setContentDescription(charSequence);
            m1.a(this.f885d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f885d)) {
                b(this.f885d, true);
            }
        } else {
            n nVar = this.f885d;
            if (nVar != null && m(nVar)) {
                removeView(this.f885d);
                this.f886d0.remove(this.f885d);
            }
        }
        n nVar2 = this.f885d;
        if (nVar2 != null) {
            nVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f883c == null) {
                Context context = getContext();
                d0 d0Var = new d0(context, (AttributeSet) null);
                this.f883c = d0Var;
                d0Var.setSingleLine();
                this.f883c.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.I;
                if (i8 != 0) {
                    this.f883c.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.f883c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f883c)) {
                b(this.f883c, true);
            }
        } else {
            d0 d0Var2 = this.f883c;
            if (d0Var2 != null && m(d0Var2)) {
                removeView(this.f883c);
                this.f886d0.remove(this.f883c);
            }
        }
        d0 d0Var3 = this.f883c;
        if (d0Var3 != null) {
            d0Var3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        d0 d0Var = this.f883c;
        if (d0Var != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f881b == null) {
                Context context = getContext();
                d0 d0Var = new d0(context, (AttributeSet) null);
                this.f881b = d0Var;
                d0Var.setSingleLine();
                this.f881b.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.H;
                if (i8 != 0) {
                    this.f881b.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.V;
                if (colorStateList != null) {
                    this.f881b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f881b)) {
                b(this.f881b, true);
            }
        } else {
            d0 d0Var2 = this.f881b;
            if (d0Var2 != null && m(d0Var2)) {
                removeView(this.f881b);
                this.f886d0.remove(this.f881b);
            }
        }
        d0 d0Var3 = this.f881b;
        if (d0Var3 != null) {
            d0Var3.setText(charSequence);
        }
        this.T = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.V = colorStateList;
        d0 d0Var = this.f881b;
        if (d0Var != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public static class i extends k2.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f911c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f912d;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new i[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f911c = parcel.readInt();
            this.f912d = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f911c);
            parcel.writeInt(this.f912d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
