package o8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.m1;
import com.quickkonnect.silencio.R;
import d2.d0;
import d2.d1;
import d2.i0;
import e2.i;
import java.util.WeakHashMap;
import t1.a;
import w1.a;

public abstract class a extends FrameLayout implements k.a {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f12204d0 = {16842912};

    /* renamed from: e0  reason: collision with root package name */
    public static final c f12205e0 = new c();

    /* renamed from: f0  reason: collision with root package name */
    public static final d f12206f0 = new d();
    public float B;
    public float C;
    public float D;
    public int E;
    public boolean F;
    public final FrameLayout G;
    public final View H;
    public final ImageView I;
    public final ViewGroup J;
    public final TextView K;
    public final TextView L;
    public int M = -1;
    public h N;
    public ColorStateList O;
    public Drawable P;
    public Drawable Q;
    public ValueAnimator R;
    public c S = f12205e0;
    public float T = 0.0f;
    public boolean U = false;
    public int V = 0;
    public int W = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12207a = false;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f12208a0 = false;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f12209b;

    /* renamed from: b0  reason: collision with root package name */
    public int f12210b0 = 0;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f12211c;

    /* renamed from: c0  reason: collision with root package name */
    public x7.a f12212c0;

    /* renamed from: d  reason: collision with root package name */
    public int f12213d;

    /* renamed from: e  reason: collision with root package name */
    public int f12214e;

    /* renamed from: o8.a$a  reason: collision with other inner class name */
    public class C0232a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f12215a;

        public C0232a(z7.a aVar) {
            this.f12215a = aVar;
        }

        public final void onLayoutChange(View view, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            a aVar = this.f12215a;
            if (aVar.I.getVisibility() == 0) {
                x7.a aVar2 = aVar.f12212c0;
                if (aVar2 != null) {
                    Rect rect = new Rect();
                    ImageView imageView = aVar.I;
                    imageView.getDrawingRect(rect);
                    aVar2.setBounds(rect);
                    aVar2.g(imageView, (FrameLayout) null);
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12216a;

        public b(int i8) {
            this.f12216a = i8;
        }

        public final void run() {
            a.this.g(this.f12216a);
        }
    }

    public static class c {
        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    public static class d extends c {
        public final float a(float f10, float f11) {
            LinearInterpolator linearInterpolator = v7.a.f16228a;
            return (f10 * 0.6f) + 0.4f;
        }
    }

    public a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.G = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.H = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.I = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.J = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.K = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.L = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f12213d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f12214e = viewGroup.getPaddingBottom();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.s(textView, 2);
        i0.d.s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.B = textSize - textSize2;
        this.C = (textSize2 * 1.0f) / textSize;
        this.D = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C0232a((z7.a) this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000a:
            r5 = r1
            goto L_0x004c
        L_0x000c:
            int[] r2 = ag.n2.f463k0
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L_0x003e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L_0x004c
        L_0x003e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L_0x004c:
            if (r5 == 0) goto L_0x0052
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.a.d(android.widget.TextView, int):void");
    }

    public static void e(float f10, float f11, int i8, TextView textView) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i8);
    }

    public static void f(View view, int i8, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i8;
        layoutParams.bottomMargin = i8;
        layoutParams.gravity = i10;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.G;
        return frameLayout != null ? frameLayout : this.I;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i8 = 0;
        for (int i10 = 0; i10 < indexOfChild; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i8++;
            }
        }
        return i8;
    }

    private int getSuggestedIconHeight() {
        x7.a aVar = this.f12212c0;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return this.I.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        x7.a aVar = this.f12212c0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f12212c0.f16975e.f16977b.I.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.I.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(ViewGroup viewGroup, int i8) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i8);
    }

    public final void a() {
        Drawable drawable = this.f12211c;
        ColorStateList colorStateList = this.f12209b;
        FrameLayout frameLayout = this.G;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.U && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(s8.a.c(this.f12209b), (Drawable) null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(s8.a.a(this.f12209b), (Drawable) null, (Drawable) null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.q(frameLayout, rippleDrawable);
        }
        WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
        i0.d.q(this, drawable);
        setDefaultFocusHighlightEnabled(z10);
    }

    public final void b(float f10, float f11) {
        View view = this.H;
        if (view != null) {
            c cVar = this.S;
            cVar.getClass();
            LinearInterpolator linearInterpolator = v7.a.f16228a;
            view.setScaleX((0.6f * f10) + 0.4f);
            view.setScaleY(cVar.a(f10, f11));
            int i8 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            view.setAlpha(v7.a.a(0.0f, 1.0f, i8 == 0 ? 0.8f : 0.0f, i8 == 0 ? 1.0f : 0.2f, f10));
        }
        this.T = f10;
    }

    public final void c(h hVar) {
        this.N = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f752e);
        setId(hVar.f748a);
        if (!TextUtils.isEmpty(hVar.f763q)) {
            setContentDescription(hVar.f763q);
        }
        m1.a(this, !TextUtils.isEmpty(hVar.f764r) ? hVar.f764r : hVar.f752e);
        setVisibility(hVar.isVisible() ? 0 : 8);
        this.f12207a = true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.G;
        if (frameLayout != null && this.U) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(int i8) {
        View view = this.H;
        if (view != null) {
            int min = Math.min(this.V, i8 - (this.f12210b0 * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.height = this.f12208a0 && this.E == 2 ? min : this.W;
            layoutParams.width = min;
            view.setLayoutParams(layoutParams);
        }
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.H;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public x7.a getBadge() {
        return this.f12212c0;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    public h getItemData() {
        return this.N;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.M;
    }

    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.J;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.J;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        h hVar = this.N;
        if (hVar != null && hVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12204d0);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x7.a aVar = this.f12212c0;
        if (aVar != null && aVar.isVisible()) {
            h hVar = this.N;
            CharSequence charSequence = hVar.f752e;
            if (!TextUtils.isEmpty(hVar.f763q)) {
                charSequence = this.N.f763q;
            }
            accessibilityNodeInfo.setContentDescription(charSequence + ", " + this.f12212c0.c());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) i.d.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f7798a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) i.a.f7784g.f7793a);
        }
        i.b.a(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        post(new b(i8));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.H;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            a();
        }
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.U = z10;
        a();
        View view = this.H;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i8) {
        this.W = i8;
        g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i8) {
        this.f12210b0 = i8;
        g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f12208a0 = z10;
    }

    public void setActiveIndicatorWidth(int i8) {
        this.V = i8;
        g(getWidth());
    }

    public void setBadge(x7.a aVar) {
        x7.a aVar2 = this.f12212c0;
        if (aVar2 != aVar) {
            boolean z10 = true;
            boolean z11 = aVar2 != null;
            ImageView imageView = this.I;
            if (z11 && imageView != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                if (this.f12212c0 != null) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    x7.a aVar3 = this.f12212c0;
                    if (aVar3 != null) {
                        if (aVar3.d() != null) {
                            aVar3.d().setForeground((Drawable) null);
                        } else {
                            imageView.getOverlay().remove(aVar3);
                        }
                    }
                    this.f12212c0 = null;
                }
            }
            this.f12212c0 = aVar;
            if (imageView != null) {
                if (aVar == null) {
                    z10 = false;
                }
                if (z10) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    x7.a aVar4 = this.f12212c0;
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar4.setBounds(rect);
                    aVar4.g(imageView, (FrameLayout) null);
                    if (aVar4.d() != null) {
                        aVar4.d().setForeground(aVar4);
                    } else {
                        imageView.getOverlay().add(aVar4);
                    }
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r13) {
        /*
            r12 = this;
            android.widget.TextView r0 = r12.L
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r1 = r12.K
            int r3 = r1.getWidth()
            int r3 = r3 / r2
            float r3 = (float) r3
            r1.setPivotX(r3)
            int r3 = r1.getBaseline()
            float r3 = (float) r3
            r1.setPivotY(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x002d
            r4 = r3
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            boolean r5 = r12.U
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0095
            boolean r5 = r12.f12207a
            if (r5 == 0) goto L_0x0095
            java.util.WeakHashMap<android.view.View, d2.d1> r5 = d2.i0.f7217a
            boolean r5 = d2.i0.g.b(r12)
            if (r5 != 0) goto L_0x0041
            goto L_0x0095
        L_0x0041:
            android.animation.ValueAnimator r5 = r12.R
            if (r5 == 0) goto L_0x004b
            r5.cancel()
            r5 = 0
            r12.R = r5
        L_0x004b:
            float[] r5 = new float[r2]
            float r8 = r12.T
            r5[r7] = r8
            r5[r6] = r4
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            r12.R = r5
            o8.b r8 = new o8.b
            r8.<init>(r12, r4)
            r5.addUpdateListener(r8)
            android.animation.ValueAnimator r4 = r12.R
            android.content.Context r5 = r12.getContext()
            v2.b r8 = v7.a.f16229b
            r9 = 2130903972(0x7f0303a4, float:1.7414777E38)
            android.animation.TimeInterpolator r5 = n8.a.d(r5, r9, r8)
            r4.setInterpolator(r5)
            android.animation.ValueAnimator r4 = r12.R
            android.content.Context r5 = r12.getContext()
            android.content.res.Resources r8 = r12.getResources()
            r9 = 2131361826(0x7f0a0022, float:1.8343415E38)
            int r8 = r8.getInteger(r9)
            r9 = 2130903956(0x7f030394, float:1.7414745E38)
            int r5 = n8.a.c(r5, r9, r8)
            long r8 = (long) r5
            r4.setDuration(r8)
            android.animation.ValueAnimator r4 = r12.R
            r4.start()
            goto L_0x0098
        L_0x0095:
            r12.b(r4, r4)
        L_0x0098:
            int r4 = r12.E
            r5 = -1
            r8 = 17
            r9 = 49
            android.view.ViewGroup r10 = r12.J
            r11 = 4
            if (r4 == r5) goto L_0x0118
            if (r4 == 0) goto L_0x00f1
            if (r4 == r6) goto L_0x00bf
            if (r4 == r2) goto L_0x00ac
            goto L_0x0172
        L_0x00ac:
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f12213d
            f(r2, r3, r8)
            r2 = 8
            r0.setVisibility(r2)
            r1.setVisibility(r2)
            goto L_0x0172
        L_0x00bf:
            int r2 = r12.f12214e
            h(r10, r2)
            if (r13 == 0) goto L_0x00de
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f12213d
            float r4 = (float) r4
            float r5 = r12.B
            float r4 = r4 + r5
            int r4 = (int) r4
            f(r2, r4, r9)
            e(r3, r3, r7, r0)
            float r0 = r12.C
            e(r0, r0, r11, r1)
            goto L_0x0172
        L_0x00de:
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f12213d
            f(r2, r4, r9)
            float r2 = r12.D
            e(r2, r2, r11, r0)
            e(r3, r3, r7, r1)
            goto L_0x0172
        L_0x00f1:
            if (r13 == 0) goto L_0x0105
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f12213d
            f(r2, r3, r9)
            int r2 = r12.f12214e
            h(r10, r2)
            r0.setVisibility(r7)
            goto L_0x0114
        L_0x0105:
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f12213d
            f(r2, r3, r8)
            h(r10, r7)
            r0.setVisibility(r11)
        L_0x0114:
            r1.setVisibility(r11)
            goto L_0x0172
        L_0x0118:
            boolean r2 = r12.F
            if (r2 == 0) goto L_0x0143
            if (r13 == 0) goto L_0x0130
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f12213d
            f(r2, r3, r9)
            int r2 = r12.f12214e
            h(r10, r2)
            r0.setVisibility(r7)
            goto L_0x013f
        L_0x0130:
            android.view.View r2 = r12.getIconOrContainer()
            int r3 = r12.f12213d
            f(r2, r3, r8)
            h(r10, r7)
            r0.setVisibility(r11)
        L_0x013f:
            r1.setVisibility(r11)
            goto L_0x0172
        L_0x0143:
            int r2 = r12.f12214e
            h(r10, r2)
            if (r13 == 0) goto L_0x0161
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f12213d
            float r4 = (float) r4
            float r5 = r12.B
            float r4 = r4 + r5
            int r4 = (int) r4
            f(r2, r4, r9)
            e(r3, r3, r7, r0)
            float r0 = r12.C
            e(r0, r0, r11, r1)
            goto L_0x0172
        L_0x0161:
            android.view.View r2 = r12.getIconOrContainer()
            int r4 = r12.f12213d
            f(r2, r4, r9)
            float r2 = r12.D
            e(r2, r2, r11, r0)
            e(r3, r3, r7, r1)
        L_0x0172:
            r12.refreshDrawableState()
            r12.setSelected(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.a.setChecked(boolean):void");
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.K.setEnabled(z10);
        this.L.setEnabled(z10);
        this.I.setEnabled(z10);
        if (z10) {
            PointerIcon b10 = d0.b(getContext(), 1002);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.k.d(this, b10);
            return;
        }
        WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
        i0.k.d(this, (PointerIcon) null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.P) {
            this.P = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                this.Q = drawable;
                ColorStateList colorStateList = this.O;
                if (colorStateList != null) {
                    a.b.h(drawable, colorStateList);
                }
            }
            this.I.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i8) {
        ImageView imageView = this.I;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i8;
        layoutParams.height = i8;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.O = colorStateList;
        if (this.N != null && (drawable = this.Q) != null) {
            a.b.h(drawable, colorStateList);
            this.Q.invalidateSelf();
        }
    }

    public void setItemBackground(int i8) {
        Drawable drawable;
        if (i8 == 0) {
            drawable = null;
        } else {
            Context context = getContext();
            Object obj = t1.a.f15323a;
            drawable = a.c.b(context, i8);
        }
        setItemBackground(drawable);
    }

    public void setItemPaddingBottom(int i8) {
        if (this.f12214e != i8) {
            this.f12214e = i8;
            h hVar = this.N;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i8) {
        if (this.f12213d != i8) {
            this.f12213d = i8;
            h hVar = this.N;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i8) {
        this.M = i8;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12209b = colorStateList;
        a();
    }

    public void setLabelVisibilityMode(int i8) {
        if (this.E != i8) {
            this.E = i8;
            if (this.f12208a0 && i8 == 2) {
                this.S = f12206f0;
            } else {
                this.S = f12205e0;
            }
            g(getWidth());
            h hVar = this.N;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            h hVar = this.N;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i8) {
        TextView textView = this.L;
        d(textView, i8);
        float textSize = this.K.getTextSize();
        float textSize2 = textView.getTextSize();
        this.B = textSize - textSize2;
        this.C = (textSize2 * 1.0f) / textSize;
        this.D = (textSize * 1.0f) / textSize2;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i8) {
        TextView textView = this.K;
        d(textView, i8);
        float textSize = textView.getTextSize();
        float textSize2 = this.L.getTextSize();
        this.B = textSize - textSize2;
        this.C = (textSize2 * 1.0f) / textSize;
        this.D = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.K.setTextColor(colorStateList);
            this.L.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
        this.L.setText(charSequence);
        h hVar = this.N;
        if (hVar == null || TextUtils.isEmpty(hVar.f763q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.N;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.f764r)) {
            charSequence = this.N.f764r;
        }
        m1.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f12211c = drawable;
        a();
    }
}
