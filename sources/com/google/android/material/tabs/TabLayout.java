package com.google.android.material.tabs;

import ag.n2;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.quickkonnect.silencio.R;
import d2.d0;
import d2.d1;
import d2.i0;
import e2.i;
import h2.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m8.s;
import m8.v;
import w1.a;
import x7.b;

@ViewPager.d
public class TabLayout extends HorizontalScrollView {

    /* renamed from: v0  reason: collision with root package name */
    public static final c2.f f6103v0 = new c2.f(16);
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G = -1;
    public ColorStateList H;
    public ColorStateList I;
    public ColorStateList J;
    public Drawable K;
    public int L = 0;
    public final PorterDuff.Mode M;
    public final float N;
    public final float O;
    public final int P;
    public int Q = Integer.MAX_VALUE;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public int V;
    public final int W;

    /* renamed from: a  reason: collision with root package name */
    public int f6104a = -1;

    /* renamed from: a0  reason: collision with root package name */
    public int f6105a0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<g> f6106b = new ArrayList<>();

    /* renamed from: b0  reason: collision with root package name */
    public int f6107b0;

    /* renamed from: c  reason: collision with root package name */
    public g f6108c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f6109c0;

    /* renamed from: d  reason: collision with root package name */
    public final f f6110d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f6111d0;

    /* renamed from: e  reason: collision with root package name */
    public final int f6112e;

    /* renamed from: e0  reason: collision with root package name */
    public int f6113e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f6114f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f6115g0;

    /* renamed from: h0  reason: collision with root package name */
    public a f6116h0;

    /* renamed from: i0  reason: collision with root package name */
    public final TimeInterpolator f6117i0;

    /* renamed from: j0  reason: collision with root package name */
    public c f6118j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList<c> f6119k0 = new ArrayList<>();

    /* renamed from: l0  reason: collision with root package name */
    public j f6120l0;

    /* renamed from: m0  reason: collision with root package name */
    public ValueAnimator f6121m0;

    /* renamed from: n0  reason: collision with root package name */
    public ViewPager f6122n0;

    /* renamed from: o0  reason: collision with root package name */
    public u3.a f6123o0;

    /* renamed from: p0  reason: collision with root package name */
    public e f6124p0;

    /* renamed from: q0  reason: collision with root package name */
    public h f6125q0;

    /* renamed from: r0  reason: collision with root package name */
    public b f6126r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f6127s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f6128t0;

    /* renamed from: u0  reason: collision with root package name */
    public final c2.e f6129u0 = new c2.e(12);

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6131a;

        public b() {
        }

        public final void a(ViewPager viewPager, u3.a aVar, u3.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f6122n0 == viewPager) {
                tabLayout.m(aVar2, this.f6131a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a();

        void b(T t2);

        void c();
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public final void onChanged() {
            TabLayout.this.j();
        }

        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class f extends LinearLayout {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int f6134c = 0;

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f6135a;

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i8) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f6128t0 == 0) {
                View childAt = getChildAt(i8);
                a aVar = tabLayout.f6116h0;
                Drawable drawable = tabLayout.K;
                aVar.getClass();
                RectF a10 = a.a(tabLayout, childAt);
                drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
                tabLayout.f6104a = i8;
            }
        }

        public final void b(int i8) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.K.getBounds();
            tabLayout.K.setBounds(bounds.left, 0, bounds.right, i8);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f6116h0.b(tabLayout, view, view2, f10, tabLayout.K);
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                Drawable drawable = tabLayout2.K;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout2.K.getBounds().bottom);
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }

        public final void d(int i8, int i10, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f6104a != i8) {
                View childAt = getChildAt(tabLayout.getSelectedTabPosition());
                View childAt2 = getChildAt(i8);
                if (childAt2 == null) {
                    a(tabLayout.getSelectedTabPosition());
                    return;
                }
                tabLayout.f6104a = i8;
                b bVar = new b(this, childAt, childAt2);
                if (z10) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f6135a = valueAnimator;
                    valueAnimator.setInterpolator(tabLayout.f6117i0);
                    valueAnimator.setDuration((long) i10);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(bVar);
                    valueAnimator.start();
                    return;
                }
                this.f6135a.removeAllUpdateListeners();
                this.f6135a.addUpdateListener(bVar);
            }
        }

        public final void draw(Canvas canvas) {
            int i8;
            TabLayout tabLayout = TabLayout.this;
            int height = tabLayout.K.getBounds().height();
            if (height < 0) {
                height = tabLayout.K.getIntrinsicHeight();
            }
            int i10 = tabLayout.f6105a0;
            if (i10 == 0) {
                i8 = getHeight() - height;
                height = getHeight();
            } else if (i10 != 1) {
                i8 = 0;
                if (i10 != 2) {
                    height = i10 != 3 ? 0 : getHeight();
                }
            } else {
                i8 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            }
            if (tabLayout.K.getBounds().width() > 0) {
                Rect bounds = tabLayout.K.getBounds();
                tabLayout.K.setBounds(bounds.left, i8, bounds.right, height);
                tabLayout.K.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
            super.onLayout(z10, i8, i10, i11, i12);
            ValueAnimator valueAnimator = this.f6135a;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                if (tabLayout.f6104a == -1) {
                    tabLayout.f6104a = tabLayout.getSelectedTabPosition();
                }
                a(tabLayout.f6104a);
                return;
            }
            d(tabLayout.getSelectedTabPosition(), -1, false);
        }

        public final void onMeasure(int i8, int i10) {
            super.onMeasure(i8, i10);
            if (View.MeasureSpec.getMode(i8) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.V == 1 || tabLayout.f6107b0 == 2) {
                    int childCount = getChildCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = getChildAt(i12);
                        if (childAt.getVisibility() == 0) {
                            i11 = Math.max(i11, childAt.getMeasuredWidth());
                        }
                    }
                    if (i11 > 0) {
                        if (i11 * childCount <= getMeasuredWidth() - (((int) v.b(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                                if (layoutParams.width != i11 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i11;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            tabLayout.V = 0;
                            tabLayout.p(false);
                        }
                        if (z10) {
                            super.onMeasure(i8, i10);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i8) {
            super.onRtlPropertiesChanged(i8);
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f6137a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f6138b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f6139c;

        /* renamed from: d  reason: collision with root package name */
        public int f6140d = -1;

        /* renamed from: e  reason: collision with root package name */
        public View f6141e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6142f = 1;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f6143g;

        /* renamed from: h  reason: collision with root package name */
        public i f6144h;

        /* renamed from: i  reason: collision with root package name */
        public int f6145i = -1;

        public final void a() {
            TabLayout tabLayout = this.f6143g;
            if (tabLayout != null) {
                tabLayout.l(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    public static class h implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f6146a;

        /* renamed from: b  reason: collision with root package name */
        public int f6147b;

        /* renamed from: c  reason: collision with root package name */
        public int f6148c;

        public h(TabLayout tabLayout) {
            this.f6146a = new WeakReference<>(tabLayout);
        }

        public final void a(float f10, int i8) {
            TabLayout tabLayout = this.f6146a.get();
            if (tabLayout != null) {
                int i10 = this.f6148c;
                boolean z10 = false;
                boolean z11 = i10 != 2 || this.f6147b == 1;
                if (!(i10 == 2 && this.f6147b == 0)) {
                    z10 = true;
                }
                tabLayout.n(i8, f10, z11, z10);
            }
        }

        public final void b(int i8) {
            this.f6147b = this.f6148c;
            this.f6148c = i8;
            TabLayout tabLayout = this.f6146a.get();
            if (tabLayout != null) {
                tabLayout.f6128t0 = this.f6148c;
            }
        }

        public final void c(int i8) {
            TabLayout tabLayout = this.f6146a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i8 && i8 < tabLayout.getTabCount()) {
                int i10 = this.f6148c;
                tabLayout.l(tabLayout.h(i8), i10 == 0 || (i10 == 2 && this.f6147b == 0));
            }
        }
    }

    public final class i extends LinearLayout {
        public static final /* synthetic */ int H = 0;
        public View B;
        public TextView C;
        public ImageView D;
        public Drawable E;
        public int F = 2;

        /* renamed from: a  reason: collision with root package name */
        public g f6149a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f6150b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f6151c;

        /* renamed from: d  reason: collision with root package name */
        public View f6152d;

        /* renamed from: e  reason: collision with root package name */
        public x7.a f6153e;

        public i(Context context) {
            super(context);
            e(context);
            int i8 = TabLayout.this.f6112e;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.e.k(this, i8, TabLayout.this.B, TabLayout.this.C, TabLayout.this.D);
            setGravity(17);
            setOrientation(TabLayout.this.f6109c0 ^ true ? 1 : 0);
            setClickable(true);
            i0.k.d(this, d0.b(getContext(), 1002));
        }

        private x7.a getBadge() {
            return this.f6153e;
        }

        private x7.a getOrCreateBadge() {
            if (this.f6153e == null) {
                this.f6153e = new x7.a(getContext(), (b.a) null);
            }
            b();
            x7.a aVar = this.f6153e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.f6153e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f6152d;
                if (view != null) {
                    x7.a aVar = this.f6153e;
                    if (aVar != null) {
                        if (aVar.d() != null) {
                            aVar.d().setForeground((Drawable) null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f6152d = null;
                }
            }
        }

        public final void b() {
            g gVar;
            g gVar2;
            boolean z10 = true;
            if (this.f6153e != null) {
                if (this.B != null) {
                    a();
                    return;
                }
                ImageView imageView = this.f6151c;
                if (imageView == null || (gVar2 = this.f6149a) == null || gVar2.f6137a == null) {
                    TextView textView = this.f6150b;
                    if (textView == null || (gVar = this.f6149a) == null || gVar.f6142f != 1) {
                        a();
                    } else if (this.f6152d != textView) {
                        a();
                        TextView textView2 = this.f6150b;
                        if (this.f6153e == null) {
                            z10 = false;
                        }
                        if (z10 && textView2 != null) {
                            setClipChildren(false);
                            setClipToPadding(false);
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            if (viewGroup != null) {
                                viewGroup.setClipChildren(false);
                                viewGroup.setClipToPadding(false);
                            }
                            x7.a aVar = this.f6153e;
                            Rect rect = new Rect();
                            textView2.getDrawingRect(rect);
                            aVar.setBounds(rect);
                            aVar.g(textView2, (FrameLayout) null);
                            if (aVar.d() != null) {
                                aVar.d().setForeground(aVar);
                            } else {
                                textView2.getOverlay().add(aVar);
                            }
                            this.f6152d = textView2;
                        }
                    } else {
                        c(textView);
                    }
                } else if (this.f6152d != imageView) {
                    a();
                    ImageView imageView2 = this.f6151c;
                    if (this.f6153e == null) {
                        z10 = false;
                    }
                    if (z10 && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        x7.a aVar2 = this.f6153e;
                        Rect rect2 = new Rect();
                        imageView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.g(imageView2, (FrameLayout) null);
                        if (aVar2.d() != null) {
                            aVar2.d().setForeground(aVar2);
                        } else {
                            imageView2.getOverlay().add(aVar2);
                        }
                        this.f6152d = imageView2;
                    }
                } else {
                    c(imageView);
                }
            }
        }

        public final void c(View view) {
            x7.a aVar = this.f6153e;
            if ((aVar != null) && view == this.f6152d) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.g(view, (FrameLayout) null);
            }
        }

        public final void d() {
            f();
            g gVar = this.f6149a;
            boolean z10 = false;
            if (gVar != null) {
                TabLayout tabLayout = gVar.f6143g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == gVar.f6140d) {
                        z10 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z10);
        }

        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.E;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.E.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r1 = r0.P
                r2 = 0
                if (r1 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = f.a.a(r7, r1)
                r6.E = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.E
                int[] r1 = r6.getDrawableState()
                r7.setState(r1)
                goto L_0x0021
            L_0x001f:
                r6.E = r2
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r1 = 0
                r7.setColor(r1)
                android.content.res.ColorStateList r1 = r0.J
                if (r1 == 0) goto L_0x0052
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r1.setCornerRadius(r3)
                r3 = -1
                r1.setColor(r3)
                android.content.res.ColorStateList r3 = r0.J
                android.content.res.ColorStateList r3 = s8.a.a(r3)
                android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
                boolean r5 = r0.f6115g0
                if (r5 == 0) goto L_0x004a
                r7 = r2
            L_0x004a:
                if (r5 == 0) goto L_0x004d
                goto L_0x004e
            L_0x004d:
                r2 = r1
            L_0x004e:
                r4.<init>(r3, r7, r2)
                r7 = r4
            L_0x0052:
                java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
                d2.i0.d.q(r6, r7)
                r0.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.e(android.content.Context):void");
        }

        public final void f() {
            int i8;
            ViewParent parent;
            g gVar = this.f6149a;
            View view = gVar != null ? gVar.f6141e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.B;
                    if (!(view2 == null || (parent = view2.getParent()) == null)) {
                        ((ViewGroup) parent).removeView(this.B);
                    }
                    addView(view);
                }
                this.B = view;
                TextView textView = this.f6150b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f6151c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f6151c.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.C = textView2;
                if (textView2 != null) {
                    this.F = l.a.b(textView2);
                }
                this.D = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.B;
                if (view3 != null) {
                    removeView(view3);
                    this.B = null;
                }
                this.C = null;
                this.D = null;
            }
            if (this.B == null) {
                if (this.f6151c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                    this.f6151c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f6150b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                    this.f6150b = textView3;
                    addView(textView3);
                    this.F = l.a.b(this.f6150b);
                }
                TextView textView4 = this.f6150b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.E);
                if (!isSelected() || (i8 = tabLayout.G) == -1) {
                    this.f6150b.setTextAppearance(tabLayout.F);
                } else {
                    this.f6150b.setTextAppearance(i8);
                }
                ColorStateList colorStateList = tabLayout.H;
                if (colorStateList != null) {
                    this.f6150b.setTextColor(colorStateList);
                }
                g(this.f6150b, this.f6151c, true);
                b();
                ImageView imageView3 = this.f6151c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new c(this, imageView3));
                }
                TextView textView5 = this.f6150b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new c(this, textView5));
                }
            } else {
                TextView textView6 = this.C;
                if (!(textView6 == null && this.D == null)) {
                    g(textView6, this.D, false);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f6139c)) {
                setContentDescription(gVar.f6139c);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.f6137a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g(android.widget.TextView r9, android.widget.ImageView r10, boolean r11) {
            /*
                r8 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r8.f6149a
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.f6137a
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                if (r0 == 0) goto L_0x001f
                android.content.res.ColorStateList r3 = r2.I
                w1.a.b.h(r0, r3)
                android.graphics.PorterDuff$Mode r3 = r2.M
                if (r3 == 0) goto L_0x001f
                w1.a.b.i(r0, r3)
            L_0x001f:
                com.google.android.material.tabs.TabLayout$g r3 = r8.f6149a
                if (r3 == 0) goto L_0x0026
                java.lang.CharSequence r3 = r3.f6138b
                goto L_0x0027
            L_0x0026:
                r3 = r1
            L_0x0027:
                r4 = 8
                r5 = 0
                if (r10 == 0) goto L_0x003e
                if (r0 == 0) goto L_0x0038
                r10.setImageDrawable(r0)
                r10.setVisibility(r5)
                r8.setVisibility(r5)
                goto L_0x003e
            L_0x0038:
                r10.setVisibility(r4)
                r10.setImageDrawable(r1)
            L_0x003e:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                r6 = 1
                r0 = r0 ^ r6
                if (r9 == 0) goto L_0x0066
                if (r0 == 0) goto L_0x004f
                com.google.android.material.tabs.TabLayout$g r7 = r8.f6149a
                int r7 = r7.f6142f
                if (r7 != r6) goto L_0x004f
                goto L_0x0050
            L_0x004f:
                r6 = r5
            L_0x0050:
                if (r0 == 0) goto L_0x0054
                r7 = r3
                goto L_0x0055
            L_0x0054:
                r7 = r1
            L_0x0055:
                r9.setText(r7)
                if (r6 == 0) goto L_0x005c
                r7 = r5
                goto L_0x005d
            L_0x005c:
                r7 = r4
            L_0x005d:
                r9.setVisibility(r7)
                if (r0 == 0) goto L_0x0067
                r8.setVisibility(r5)
                goto L_0x0067
            L_0x0066:
                r6 = r5
            L_0x0067:
                if (r11 == 0) goto L_0x00a9
                if (r10 == 0) goto L_0x00a9
                android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
                if (r6 == 0) goto L_0x0083
                int r11 = r10.getVisibility()
                if (r11 != 0) goto L_0x0083
                android.content.Context r11 = r8.getContext()
                float r11 = m8.v.b(r11, r4)
                int r11 = (int) r11
                goto L_0x0084
            L_0x0083:
                r11 = r5
            L_0x0084:
                boolean r2 = r2.f6109c0
                if (r2 == 0) goto L_0x009a
                int r2 = d2.p.b(r9)
                if (r11 == r2) goto L_0x00a9
                d2.p.g(r9, r11)
                r9.bottomMargin = r5
                r10.setLayoutParams(r9)
                r10.requestLayout()
                goto L_0x00a9
            L_0x009a:
                int r2 = r9.bottomMargin
                if (r11 == r2) goto L_0x00a9
                r9.bottomMargin = r11
                d2.p.g(r9, r5)
                r10.setLayoutParams(r9)
                r10.requestLayout()
            L_0x00a9:
                com.google.android.material.tabs.TabLayout$g r9 = r8.f6149a
                if (r9 == 0) goto L_0x00af
                java.lang.CharSequence r1 = r9.f6139c
            L_0x00af:
                if (r0 == 0) goto L_0x00b2
                goto L_0x00b3
            L_0x00b2:
                r3 = r1
            L_0x00b3:
                androidx.appcompat.widget.m1.a(r8, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.g(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        public int getContentHeight() {
            View[] viewArr = {this.f6150b, this.f6151c, this.B};
            int i8 = 0;
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    i10 = z10 ? Math.min(i10, view.getTop()) : view.getTop();
                    i8 = z10 ? Math.max(i8, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i8 - i10;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f6150b, this.f6151c, this.B};
            int i8 = 0;
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 3; i11++) {
                View view = viewArr[i11];
                if (view != null && view.getVisibility() == 0) {
                    i10 = z10 ? Math.min(i10, view.getLeft()) : view.getLeft();
                    i8 = z10 ? Math.max(i8, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i8 - i10;
        }

        public g getTab() {
            return this.f6149a;
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            x7.a aVar = this.f6153e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f6153e.c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) i.d.a(0, 1, this.f6149a.f6140d, 1, false, isSelected()).f7798a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) i.a.f7784g.f7793a);
            }
            i.b.a(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x008d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r3 = r2.getTabMaxWidth()
                if (r3 <= 0) goto L_0x001c
                if (r1 == 0) goto L_0x0014
                if (r0 <= r3) goto L_0x001c
            L_0x0014:
                int r8 = r2.Q
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001c:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f6150b
                if (r0 == 0) goto L_0x009d
                float r0 = r2.N
                int r1 = r7.F
                android.widget.ImageView r3 = r7.f6151c
                r4 = 1
                if (r3 == 0) goto L_0x0034
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L_0x0034
                r1 = r4
                goto L_0x0040
            L_0x0034:
                android.widget.TextView r3 = r7.f6150b
                if (r3 == 0) goto L_0x0040
                int r3 = r3.getLineCount()
                if (r3 <= r4) goto L_0x0040
                float r0 = r2.O
            L_0x0040:
                android.widget.TextView r3 = r7.f6150b
                float r3 = r3.getTextSize()
                android.widget.TextView r5 = r7.f6150b
                int r5 = r5.getLineCount()
                android.widget.TextView r6 = r7.f6150b
                int r6 = h2.l.a.b(r6)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 != 0) goto L_0x005a
                if (r6 < 0) goto L_0x009d
                if (r1 == r6) goto L_0x009d
            L_0x005a:
                int r2 = r2.f6107b0
                r6 = 0
                if (r2 != r4) goto L_0x008e
                if (r3 <= 0) goto L_0x008e
                if (r5 != r4) goto L_0x008e
                android.widget.TextView r2 = r7.f6150b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x008d
                float r3 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r3
                int r3 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r3 = r3 - r5
                int r5 = r7.getPaddingRight()
                int r3 = r3 - r5
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 <= 0) goto L_0x008e
            L_0x008d:
                r4 = r6
            L_0x008e:
                if (r4 == 0) goto L_0x009d
                android.widget.TextView r2 = r7.f6150b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f6150b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f6149a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f6149a.a();
            return true;
        }

        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f6150b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f6151c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.B;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f6149a) {
                this.f6149a = gVar;
                d();
            }
        }
    }

    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f6154a;

        public j(ViewPager viewPager) {
            this.f6154a = viewPager;
        }

        public final void a() {
        }

        public final void b(g gVar) {
            this.f6154a.setCurrentItem(gVar.f6140d);
        }

        public final void c() {
        }
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.tabStyle, 2132018006), attributeSet, R.attr.tabStyle);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f6110d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = s.d(context2, attributeSet, n2.f462j0, R.attr.tabStyle, 2132018006, 24);
        if (getBackground() instanceof ColorDrawable) {
            v8.f fVar2 = new v8.f();
            fVar2.m(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            fVar2.j(context2);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            fVar2.l(i0.i.i(this));
            i0.d.q(this, fVar2);
        }
        setSelectedTabIndicator(r8.c.d(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        fVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.D = dimensionPixelSize;
        this.C = dimensionPixelSize;
        this.B = dimensionPixelSize;
        this.f6112e = dimensionPixelSize;
        this.f6112e = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.B = d10.getDimensionPixelSize(20, dimensionPixelSize);
        this.C = d10.getDimensionPixelSize(18, dimensionPixelSize);
        this.D = d10.getDimensionPixelSize(17, dimensionPixelSize);
        if (r8.b.b(context2, R.attr.isMaterial3Theme, false)) {
            this.E = R.attr.textAppearanceTitleSmall;
        } else {
            this.E = R.attr.textAppearanceButton;
        }
        int resourceId = d10.getResourceId(24, 2132017642);
        this.F = resourceId;
        int[] iArr = cb.e.T;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.N = dimensionPixelSize2;
            this.H = r8.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(22)) {
                this.G = d10.getResourceId(22, resourceId);
            }
            int i8 = this.G;
            if (i8 != -1) {
                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(i8, iArr);
                try {
                    obtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList a10 = r8.c.a(context2, obtainStyledAttributes2, 3);
                    if (a10 != null) {
                        int defaultColor = this.H.getDefaultColor();
                        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
                        this.H = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{colorForState, defaultColor});
                    }
                } finally {
                    obtainStyledAttributes2.recycle();
                }
            }
            if (d10.hasValue(25)) {
                this.H = r8.c.a(context2, d10, 25);
            }
            if (d10.hasValue(23)) {
                int color = d10.getColor(23, 0);
                int defaultColor2 = this.H.getDefaultColor();
                this.H = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{color, defaultColor2});
            }
            this.I = r8.c.a(context2, d10, 3);
            this.M = v.d(d10.getInt(4, -1), (PorterDuff.Mode) null);
            this.J = r8.c.a(context2, d10, 21);
            this.W = d10.getInt(6, 300);
            this.f6117i0 = n8.a.d(context2, R.attr.motionEasingEmphasizedInterpolator, v7.a.f16229b);
            this.R = d10.getDimensionPixelSize(14, -1);
            this.S = d10.getDimensionPixelSize(13, -1);
            this.P = d10.getResourceId(0, 0);
            this.U = d10.getDimensionPixelSize(1, 0);
            this.f6107b0 = d10.getInt(15, 1);
            this.V = d10.getInt(2, 0);
            this.f6109c0 = d10.getBoolean(12, false);
            this.f6115g0 = d10.getBoolean(26, false);
            d10.recycle();
            Resources resources = getResources();
            this.O = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.T = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.f6106b;
        int size = arrayList.size();
        boolean z10 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                g gVar = arrayList.get(i8);
                if (gVar != null && gVar.f6137a != null && !TextUtils.isEmpty(gVar.f6138b)) {
                    z10 = true;
                    break;
                }
                i8++;
            } else {
                break;
            }
        }
        return (!z10 || this.f6109c0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i8 = this.R;
        if (i8 != -1) {
            return i8;
        }
        int i10 = this.f6107b0;
        if (i10 == 0 || i10 == 2) {
            return this.T;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f6110d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i8) {
        f fVar = this.f6110d;
        int childCount = fVar.getChildCount();
        if (i8 < childCount) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = fVar.getChildAt(i10);
                boolean z10 = true;
                if ((i10 != i8 || childAt.isSelected()) && (i10 == i8 || !childAt.isSelected())) {
                    childAt.setSelected(i10 == i8);
                    if (i10 != i8) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                } else {
                    childAt.setSelected(i10 == i8);
                    if (i10 != i8) {
                        z10 = false;
                    }
                    childAt.setActivated(z10);
                    if (childAt instanceof i) {
                        ((i) childAt).f();
                    }
                }
                i10++;
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        ArrayList<c> arrayList = this.f6119k0;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void addView(View view) {
        c(view);
    }

    public final void b(g gVar, boolean z10) {
        ArrayList<g> arrayList = this.f6106b;
        int size = arrayList.size();
        if (gVar.f6143g == this) {
            gVar.f6140d = size;
            arrayList.add(size, gVar);
            int size2 = arrayList.size();
            int i8 = -1;
            for (int i10 = size + 1; i10 < size2; i10++) {
                if (arrayList.get(i10).f6140d == this.f6104a) {
                    i8 = i10;
                }
                arrayList.get(i10).f6140d = i10;
            }
            this.f6104a = i8;
            i iVar = gVar.f6144h;
            iVar.setSelected(false);
            iVar.setActivated(false);
            int i11 = gVar.f6140d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f6107b0 == 1 && this.V == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.f6110d.addView(iVar, i11, layoutParams);
            if (z10) {
                gVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        if (view instanceof z8.c) {
            z8.c cVar = (z8.c) view;
            g i8 = i();
            cVar.getClass();
            if (!TextUtils.isEmpty(cVar.getContentDescription())) {
                i8.f6139c = cVar.getContentDescription();
                i iVar = i8.f6144h;
                if (iVar != null) {
                    iVar.d();
                }
            }
            b(i8, this.f6106b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i8) {
        boolean z10;
        if (i8 != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (i0.g.c(this)) {
                    f fVar = this.f6110d;
                    int childCount = fVar.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            z10 = false;
                            break;
                        } else if (fVar.getChildAt(i10).getWidth() <= 0) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (!z10) {
                        int scrollX = getScrollX();
                        int f10 = f(i8, 0.0f);
                        if (scrollX != f10) {
                            g();
                            this.f6121m0.setIntValues(new int[]{scrollX, f10});
                            this.f6121m0.start();
                        }
                        ValueAnimator valueAnimator = fVar.f6135a;
                        if (!(valueAnimator == null || !valueAnimator.isRunning() || TabLayout.this.f6104a == i8)) {
                            fVar.f6135a.cancel();
                        }
                        fVar.d(i8, this.W, true);
                        return;
                    }
                }
            }
            n(i8, 0.0f, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 != 2) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.f6107b0
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r5.U
            int r3 = r5.f6112e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
            com.google.android.material.tabs.TabLayout$f r3 = r5.f6110d
            d2.i0.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.f6107b0
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 == r4) goto L_0x0027
            if (r0 == r1) goto L_0x0027
            goto L_0x004c
        L_0x0027:
            int r0 = r5.V
            if (r0 != r1) goto L_0x0030
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0030:
            r3.setGravity(r4)
            goto L_0x004c
        L_0x0034:
            int r0 = r5.V
            if (r0 == 0) goto L_0x0041
            if (r0 == r4) goto L_0x003d
            if (r0 == r1) goto L_0x0046
            goto L_0x004c
        L_0x003d:
            r3.setGravity(r4)
            goto L_0x004c
        L_0x0041:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0046:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L_0x004c:
            r5.p(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(int i8, float f10) {
        f fVar;
        View childAt;
        int i10 = this.f6107b0;
        int i11 = 0;
        if ((i10 != 0 && i10 != 2) || (childAt = fVar.getChildAt(i8)) == null) {
            return 0;
        }
        int i12 = i8 + 1;
        View childAt2 = i12 < fVar.getChildCount() ? (fVar = this.f6110d).getChildAt(i12) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i11 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i13 = (int) (((float) (width + i11)) * 0.5f * f10);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return i0.e.d(this) == 0 ? left + i13 : left - i13;
    }

    public final void g() {
        if (this.f6121m0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f6121m0 = valueAnimator;
            valueAnimator.setInterpolator(this.f6117i0);
            this.f6121m0.setDuration((long) this.W);
            this.f6121m0.addUpdateListener(new a());
        }
    }

    public int getSelectedTabPosition() {
        g gVar = this.f6108c;
        if (gVar != null) {
            return gVar.f6140d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f6106b.size();
    }

    public int getTabGravity() {
        return this.V;
    }

    public ColorStateList getTabIconTint() {
        return this.I;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f6114f0;
    }

    public int getTabIndicatorGravity() {
        return this.f6105a0;
    }

    public int getTabMaxWidth() {
        return this.Q;
    }

    public int getTabMode() {
        return this.f6107b0;
    }

    public ColorStateList getTabRippleColor() {
        return this.J;
    }

    public Drawable getTabSelectedIndicator() {
        return this.K;
    }

    public ColorStateList getTabTextColors() {
        return this.H;
    }

    public final g h(int i8) {
        if (i8 < 0 || i8 >= getTabCount()) {
            return null;
        }
        return this.f6106b.get(i8);
    }

    public final g i() {
        g gVar = (g) f6103v0.b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f6143g = this;
        c2.e eVar = this.f6129u0;
        i iVar = eVar != null ? (i) eVar.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f6139c)) {
            iVar.setContentDescription(gVar.f6138b);
        } else {
            iVar.setContentDescription(gVar.f6139c);
        }
        gVar.f6144h = iVar;
        int i8 = gVar.f6145i;
        if (i8 != -1) {
            iVar.setId(i8);
        }
        return gVar;
    }

    public final void j() {
        int currentItem;
        k();
        u3.a aVar = this.f6123o0;
        if (aVar != null) {
            int c3 = aVar.c();
            for (int i8 = 0; i8 < c3; i8++) {
                g i10 = i();
                CharSequence d10 = this.f6123o0.d(i8);
                if (TextUtils.isEmpty(i10.f6139c) && !TextUtils.isEmpty(d10)) {
                    i10.f6144h.setContentDescription(d10);
                }
                i10.f6138b = d10;
                i iVar = i10.f6144h;
                if (iVar != null) {
                    iVar.d();
                }
                b(i10, false);
            }
            ViewPager viewPager = this.f6122n0;
            if (viewPager != null && c3 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                l(h(currentItem), true);
            }
        }
    }

    public final void k() {
        f fVar = this.f6110d;
        for (int childCount = fVar.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab((g) null);
                iVar.setSelected(false);
                this.f6129u0.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f6106b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f6143g = null;
            next.f6144h = null;
            next.f6137a = null;
            next.f6145i = -1;
            next.f6138b = null;
            next.f6139c = null;
            next.f6140d = -1;
            next.f6141e = null;
            f6103v0.a(next);
        }
        this.f6108c = null;
    }

    public final void l(g gVar, boolean z10) {
        g gVar2 = this.f6108c;
        ArrayList<c> arrayList = this.f6119k0;
        if (gVar2 != gVar) {
            int i8 = gVar != null ? gVar.f6140d : -1;
            if (z10) {
                if ((gVar2 == null || gVar2.f6140d == -1) && i8 != -1) {
                    n(i8, 0.0f, true, true);
                } else {
                    d(i8);
                }
                if (i8 != -1) {
                    setSelectedTabView(i8);
                }
            }
            this.f6108c = gVar;
            if (!(gVar2 == null || gVar2.f6143g == null)) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).c();
                }
            }
            if (gVar != null) {
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    arrayList.get(size2).b(gVar);
                }
            }
        } else if (gVar2 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).a();
            }
            d(gVar.f6140d);
        }
    }

    public final void m(u3.a aVar, boolean z10) {
        e eVar;
        u3.a aVar2 = this.f6123o0;
        if (!(aVar2 == null || (eVar = this.f6124p0) == null)) {
            aVar2.f15711a.unregisterObserver(eVar);
        }
        this.f6123o0 = aVar;
        if (z10 && aVar != null) {
            if (this.f6124p0 == null) {
                this.f6124p0 = new e();
            }
            aVar.f15711a.registerObserver(this.f6124p0);
        }
        j();
    }

    public final void n(int i8, float f10, boolean z10, boolean z11) {
        float f11 = ((float) i8) + f10;
        int round = Math.round(f11);
        if (round >= 0) {
            f fVar = this.f6110d;
            if (round < fVar.getChildCount()) {
                if (z11) {
                    fVar.getClass();
                    TabLayout.this.f6104a = Math.round(f11);
                    ValueAnimator valueAnimator = fVar.f6135a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar.f6135a.cancel();
                    }
                    fVar.c(fVar.getChildAt(i8), fVar.getChildAt(i8 + 1), f10);
                }
                ValueAnimator valueAnimator2 = this.f6121m0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f6121m0.cancel();
                }
                scrollTo(i8 < 0 ? 0 : f(i8, f10), 0);
                if (z10) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f6122n0;
        if (viewPager2 != null) {
            h hVar = this.f6125q0;
            if (!(hVar == null || (arrayList2 = viewPager2.f2800q0) == null)) {
                arrayList2.remove(hVar);
            }
            b bVar = this.f6126r0;
            if (!(bVar == null || (arrayList = this.f6122n0.f2802s0) == null)) {
                arrayList.remove(bVar);
            }
        }
        j jVar = this.f6120l0;
        if (jVar != null) {
            this.f6119k0.remove(jVar);
            this.f6120l0 = null;
        }
        if (viewPager != null) {
            this.f6122n0 = viewPager;
            if (this.f6125q0 == null) {
                this.f6125q0 = new h(this);
            }
            h hVar2 = this.f6125q0;
            hVar2.f6148c = 0;
            hVar2.f6147b = 0;
            if (viewPager.f2800q0 == null) {
                viewPager.f2800q0 = new ArrayList();
            }
            viewPager.f2800q0.add(hVar2);
            j jVar2 = new j(viewPager);
            this.f6120l0 = jVar2;
            a(jVar2);
            u3.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.f6126r0 == null) {
                this.f6126r0 = new b();
            }
            b bVar2 = this.f6126r0;
            bVar2.f6131a = true;
            if (viewPager.f2802s0 == null) {
                viewPager.f2802s0 = new ArrayList();
            }
            viewPager.f2802s0.add(bVar2);
            n(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f6122n0 = null;
            m((u3.a) null, false);
        }
        this.f6127s0 = z10;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.k(this);
        if (this.f6122n0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6127s0) {
            setupWithViewPager((ViewPager) null);
            this.f6127s0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.i) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$f r1 = r7.f6110d
            int r2 = r1.getChildCount()
            if (r0 >= r2) goto L_0x0032
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.i
            if (r2 == 0) goto L_0x002f
            com.google.android.material.tabs.TabLayout$i r1 = (com.google.android.material.tabs.TabLayout.i) r1
            android.graphics.drawable.Drawable r2 = r1.E
            if (r2 == 0) goto L_0x002f
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.E
            r1.draw(r8)
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.c.a(1, getTabCount(), 1).f7797a);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = m8.v.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.S
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = m8.v.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.Q = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f6107b0
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (!(getTabMode() == 0 || getTabMode() == 2)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10) {
        int i8 = 0;
        while (true) {
            f fVar = this.f6110d;
            if (i8 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i8);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.f6107b0 == 1 && this.V == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z10) {
                    childAt.requestLayout();
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b1.b.i(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f6109c0 != z10) {
            this.f6109c0 = z10;
            int i8 = 0;
            while (true) {
                f fVar = this.f6110d;
                if (i8 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i8);
                    if (childAt instanceof i) {
                        i iVar = (i) childAt;
                        iVar.setOrientation(TabLayout.this.f6109c0 ^ true ? 1 : 0);
                        TextView textView = iVar.C;
                        if (textView == null && iVar.D == null) {
                            iVar.g(iVar.f6150b, iVar.f6151c, true);
                        } else {
                            iVar.g(textView, iVar.D, false);
                        }
                    }
                    i8++;
                } else {
                    e();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i8) {
        setInlineLabel(getResources().getBoolean(i8));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.f6121m0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.K = mutate;
        int i8 = this.L;
        if (i8 != 0) {
            a.b.g(mutate, i8);
        } else {
            a.b.h(mutate, (ColorStateList) null);
        }
        int i10 = this.f6113e0;
        if (i10 == -1) {
            i10 = this.K.getIntrinsicHeight();
        }
        this.f6110d.b(i10);
    }

    public void setSelectedTabIndicatorColor(int i8) {
        this.L = i8;
        Drawable drawable = this.K;
        if (i8 != 0) {
            a.b.g(drawable, i8);
        } else {
            a.b.h(drawable, (ColorStateList) null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i8) {
        if (this.f6105a0 != i8) {
            this.f6105a0 = i8;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this.f6110d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i8) {
        this.f6113e0 = i8;
        this.f6110d.b(i8);
    }

    public void setTabGravity(int i8) {
        if (this.V != i8) {
            this.V = i8;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            ArrayList<g> arrayList = this.f6106b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = arrayList.get(i8).f6144h;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i8) {
        setTabIconTint(t1.a.b(getContext(), i8));
    }

    public void setTabIndicatorAnimationMode(int i8) {
        this.f6114f0 = i8;
        if (i8 == 0) {
            this.f6116h0 = new a();
        } else if (i8 == 1) {
            this.f6116h0 = new z8.a();
        } else if (i8 == 2) {
            this.f6116h0 = new z8.b();
        } else {
            throw new IllegalArgumentException(i8 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f6111d0 = z10;
        int i8 = f.f6134c;
        f fVar = this.f6110d;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.k(fVar);
    }

    public void setTabMode(int i8) {
        if (i8 != this.f6107b0) {
            this.f6107b0 = i8;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            int i8 = 0;
            while (true) {
                f fVar = this.f6110d;
                if (i8 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i8);
                    if (childAt instanceof i) {
                        Context context = getContext();
                        int i10 = i.H;
                        ((i) childAt).e(context);
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i8) {
        setTabRippleColor(t1.a.b(getContext(), i8));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            ArrayList<g> arrayList = this.f6106b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = arrayList.get(i8).f6144h;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(u3.a aVar) {
        m(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f6115g0 != z10) {
            this.f6115g0 = z10;
            int i8 = 0;
            while (true) {
                f fVar = this.f6110d;
                if (i8 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i8);
                    if (childAt instanceof i) {
                        Context context = getContext();
                        int i10 = i.H;
                        ((i) childAt).e(context);
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i8) {
        setUnboundedRipple(getResources().getBoolean(i8));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        o(viewPager, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void addView(View view, int i8) {
        c(view);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f6118j0;
        if (cVar2 != null) {
            this.f6119k0.remove(cVar2);
        }
        this.f6118j0 = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i8) {
        if (i8 != 0) {
            setSelectedTabIndicator(f.a.a(getContext(), i8));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
