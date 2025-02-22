package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.List;
import java.util.WeakHashMap;
import m8.s;
import v8.i;
import w1.a;
import x8.h;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: t  reason: collision with root package name */
    public static final v2.b f6050t = v7.a.f16229b;

    /* renamed from: u  reason: collision with root package name */
    public static final LinearInterpolator f6051u = v7.a.f16228a;

    /* renamed from: v  reason: collision with root package name */
    public static final v2.c f6052v = v7.a.f16231d;

    /* renamed from: w  reason: collision with root package name */
    public static final Handler f6053w = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f6054x = {R.attr.snackbarStyle};

    /* renamed from: y  reason: collision with root package name */
    public static final String f6055y = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final int f6056a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6057b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6058c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f6059d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f6060e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f6061f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f6062g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f6063h;

    /* renamed from: i  reason: collision with root package name */
    public final e f6064i;

    /* renamed from: j  reason: collision with root package name */
    public final h f6065j;

    /* renamed from: k  reason: collision with root package name */
    public int f6066k;

    /* renamed from: l  reason: collision with root package name */
    public final b f6067l = new b();
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f6068n;

    /* renamed from: o  reason: collision with root package name */
    public int f6069o;

    /* renamed from: p  reason: collision with root package name */
    public int f6070p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6071q;

    /* renamed from: r  reason: collision with root package name */
    public final AccessibilityManager f6072r;

    /* renamed from: s  reason: collision with root package name */
    public final c f6073s = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j  reason: collision with root package name */
        public final d f6074j = new d(this);

        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            d dVar = this.f6074j;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g b10 = g.b();
                    c cVar = dVar.f6077a;
                    synchronized (b10.f6095a) {
                        if (b10.c(cVar)) {
                            g.c cVar2 = b10.f6097c;
                            if (cVar2.f6102c) {
                                cVar2.f6102c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g b11 = g.b();
                c cVar3 = dVar.f6077a;
                synchronized (b11.f6095a) {
                    if (b11.c(cVar3)) {
                        g.c cVar4 = b11.f6097c;
                        if (!cVar4.f6102c) {
                            cVar4.f6102c = true;
                            b11.f6096b.removeCallbacksAndMessages(cVar4);
                        }
                    }
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        public final boolean s(View view) {
            this.f6074j.getClass();
            return view instanceof e;
        }
    }

    public class a implements Handler.Callback {
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
            r3 = r3.getEnabledAccessibilityServiceList(1);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                int r0 = r8.what
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x009e
                if (r0 == r2) goto L_0x0009
                return r1
            L_0x0009:
                java.lang.Object r0 = r8.obj
                com.google.android.material.snackbar.BaseTransientBottomBar r0 = (com.google.android.material.snackbar.BaseTransientBottomBar) r0
                int r8 = r8.arg1
                android.view.accessibility.AccessibilityManager r3 = r0.f6072r
                if (r3 != 0) goto L_0x0014
                goto L_0x0020
            L_0x0014:
                java.util.List r3 = r3.getEnabledAccessibilityServiceList(r2)
                if (r3 == 0) goto L_0x0022
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0022
            L_0x0020:
                r3 = r2
                goto L_0x0023
            L_0x0022:
                r3 = r1
            L_0x0023:
                if (r3 == 0) goto L_0x009a
                com.google.android.material.snackbar.BaseTransientBottomBar$e r3 = r0.f6064i
                int r4 = r3.getVisibility()
                if (r4 != 0) goto L_0x009a
                int r4 = r3.getAnimationMode()
                r5 = 2
                if (r4 != r2) goto L_0x005c
                float[] r1 = new float[r5]
                r1 = {1065353216, 0} // fill-array
                android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
                android.animation.TimeInterpolator r3 = r0.f6059d
                r1.setInterpolator(r3)
                com.google.android.material.snackbar.a r3 = new com.google.android.material.snackbar.a
                r3.<init>(r0)
                r1.addUpdateListener(r3)
                int r3 = r0.f6057b
                long r3 = (long) r3
                r1.setDuration(r3)
                x8.a r3 = new x8.a
                r3.<init>(r0, r8)
                r1.addListener(r3)
                r1.start()
                goto L_0x009d
            L_0x005c:
                android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
                r4.<init>()
                int[] r5 = new int[r5]
                r5[r1] = r1
                int r1 = r3.getHeight()
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r6 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r6 == 0) goto L_0x0076
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                int r3 = r3.bottomMargin
                int r1 = r1 + r3
            L_0x0076:
                r5[r2] = r1
                r4.setIntValues(r5)
                android.animation.TimeInterpolator r1 = r0.f6060e
                r4.setInterpolator(r1)
                int r1 = r0.f6058c
                long r5 = (long) r1
                r4.setDuration(r5)
                x8.c r1 = new x8.c
                r1.<init>(r0, r8)
                r4.addListener(r1)
                com.google.android.material.snackbar.d r8 = new com.google.android.material.snackbar.d
                r8.<init>(r0)
                r4.addUpdateListener(r8)
                r4.start()
                goto L_0x009d
            L_0x009a:
                r0.c()
            L_0x009d:
                return r2
            L_0x009e:
                java.lang.Object r8 = r8.obj
                com.google.android.material.snackbar.BaseTransientBottomBar r8 = (com.google.android.material.snackbar.BaseTransientBottomBar) r8
                com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r8.f6064i
                android.view.ViewParent r3 = r0.getParent()
                if (r3 != 0) goto L_0x00dd
                android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
                boolean r4 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
                if (r4 == 0) goto L_0x00d0
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
                com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r4 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
                r4.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar$d r5 = r4.f6074j
                r5.getClass()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r6 = r8.f6073s
                r5.f6077a = r6
                com.google.android.material.snackbar.e r5 = new com.google.android.material.snackbar.e
                r5.<init>(r8)
                r4.f5714b = r5
                r3.b(r4)
                r4 = 80
                r3.f1722g = r4
            L_0x00d0:
                r0.G = r2
                android.view.ViewGroup r3 = r8.f6062g
                r3.addView(r0)
                r0.G = r1
                r1 = 4
                r0.setVisibility(r1)
            L_0x00dd:
                java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
                boolean r0 = d2.i0.g.c(r0)
                if (r0 == 0) goto L_0x00e9
                r8.e()
                goto L_0x00eb
            L_0x00e9:
                r8.f6071q = r2
            L_0x00eb:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.a.handleMessage(android.os.Message):boolean");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f6064i != null && (context = baseTransientBottomBar.f6063h) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i8 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                e eVar = baseTransientBottomBar.f6064i;
                eVar.getLocationOnScreen(iArr);
                int height = (i8 - (eVar.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f6064i.getTranslationY());
                if (height < baseTransientBottomBar.f6070p) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f6064i.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(BaseTransientBottomBar.f6055y, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (baseTransientBottomBar.f6070p - height) + marginLayoutParams.bottomMargin;
                    baseTransientBottomBar.f6064i.requestLayout();
                }
            }
        }
    }

    public class c implements g.b {
        public c() {
        }

        public final void b() {
            Handler handler = BaseTransientBottomBar.f6053w;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public final void c(int i8) {
            Handler handler = BaseTransientBottomBar.f6053w;
            handler.sendMessage(handler.obtainMessage(1, i8, 0, BaseTransientBottomBar.this));
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f6077a;

        public d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f5719g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f5720h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f5717e = 0;
        }
    }

    public static class e extends FrameLayout {
        public static final a H = new a();
        public final int B;
        public final int C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public Rect F;
        public boolean G;

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f6078a;

        /* renamed from: b  reason: collision with root package name */
        public final i f6079b;

        /* renamed from: c  reason: collision with root package name */
        public int f6080c;

        /* renamed from: d  reason: collision with root package name */
        public final float f6081d;

        /* renamed from: e  reason: collision with root package name */
        public final float f6082e;

        public class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: v8.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(android.content.Context r5, android.util.AttributeSet r6) {
            /*
                r4 = this;
                r0 = 0
                android.content.Context r5 = c9.a.a(r5, r6, r0, r0)
                r4.<init>(r5, r6)
                android.content.Context r5 = r4.getContext()
                int[] r1 = ag.n2.f461i0
                android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
                r2 = 6
                boolean r3 = r1.hasValue(r2)
                if (r3 == 0) goto L_0x0023
                int r2 = r1.getDimensionPixelSize(r2, r0)
                float r2 = (float) r2
                java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
                d2.i0.i.s(r4, r2)
            L_0x0023:
                r2 = 2
                int r2 = r1.getInt(r2, r0)
                r4.f6080c = r2
                r2 = 8
                boolean r2 = r1.hasValue(r2)
                if (r2 != 0) goto L_0x003a
                r2 = 9
                boolean r2 = r1.hasValue(r2)
                if (r2 == 0) goto L_0x0045
            L_0x003a:
                v8.i$a r6 = v8.i.b(r5, r6, r0, r0)
                v8.i r2 = new v8.i
                r2.<init>(r6)
                r4.f6079b = r2
            L_0x0045:
                r6 = 3
                r2 = 1065353216(0x3f800000, float:1.0)
                float r6 = r1.getFloat(r6, r2)
                r4.f6081d = r6
                r6 = 4
                android.content.res.ColorStateList r5 = r8.c.a(r5, r1, r6)
                r4.setBackgroundTintList(r5)
                r5 = 5
                r6 = -1
                int r5 = r1.getInt(r5, r6)
                android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
                android.graphics.PorterDuff$Mode r5 = m8.v.d(r5, r3)
                r4.setBackgroundTintMode(r5)
                r5 = 1
                float r2 = r1.getFloat(r5, r2)
                r4.f6082e = r2
                int r2 = r1.getDimensionPixelSize(r0, r6)
                r4.B = r2
                r2 = 7
                int r6 = r1.getDimensionPixelSize(r2, r6)
                r4.C = r6
                r1.recycle()
                com.google.android.material.snackbar.BaseTransientBottomBar$e$a r6 = H
                r4.setOnTouchListener(r6)
                r4.setFocusable(r5)
                android.graphics.drawable.Drawable r5 = r4.getBackground()
                if (r5 != 0) goto L_0x00db
                float r5 = r4.getBackgroundOverlayColorAlpha()
                r6 = 2130903407(0x7f03016f, float:1.7413631E38)
                int r6 = b1.b.f(r4, r6)
                r1 = 2130903390(0x7f03015e, float:1.7413597E38)
                int r1 = b1.b.f(r4, r1)
                int r5 = b1.b.h(r5, r6, r1)
                v8.i r6 = r4.f6079b
                if (r6 == 0) goto L_0x00b3
                v2.b r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f6050t
                v8.f r0 = new v8.f
                r0.<init>((v8.i) r6)
                android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
                r0.m(r5)
                goto L_0x00cf
            L_0x00b3:
                android.content.res.Resources r6 = r4.getResources()
                v2.b r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f6050t
                r1 = 2131100323(0x7f0602a3, float:1.7813024E38)
                float r6 = r6.getDimension(r1)
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r1.setShape(r0)
                r1.setCornerRadius(r6)
                r1.setColor(r5)
                r0 = r1
            L_0x00cf:
                android.content.res.ColorStateList r5 = r4.D
                if (r5 == 0) goto L_0x00d6
                w1.a.b.h(r0, r5)
            L_0x00d6:
                java.util.WeakHashMap<android.view.View, d2.d1> r5 = d2.i0.f7217a
                d2.i0.d.q(r4, r0)
            L_0x00db:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.e.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f6078a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f6082e;
        }

        public int getAnimationMode() {
            return this.f6080c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f6081d;
        }

        public int getMaxInlineActionWidth() {
            return this.C;
        }

        public int getMaxWidth() {
            return this.B;
        }

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6078a;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f6064i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        baseTransientBottomBar.f6070p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        baseTransientBottomBar.f();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.h.c(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0032 A[Catch:{ all -> 0x0028 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[Catch:{ all -> 0x0028 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onDetachedFromWindow() {
            /*
                r6 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r6.f6078a
                if (r0 == 0) goto L_0x0044
                com.google.android.material.snackbar.g r1 = com.google.android.material.snackbar.g.b()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r0.f6073s
                java.lang.Object r3 = r1.f6095a
                monitor-enter(r3)
                boolean r4 = r1.c(r2)     // Catch:{ all -> 0x0028 }
                r5 = 1
                if (r4 != 0) goto L_0x0034
                com.google.android.material.snackbar.g$c r1 = r1.f6098d     // Catch:{ all -> 0x0028 }
                r4 = 0
                if (r1 == 0) goto L_0x002f
                if (r2 == 0) goto L_0x002a
                java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r1 = r1.f6100a     // Catch:{ all -> 0x0028 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0028 }
                if (r1 != r2) goto L_0x002a
                r1 = r5
                goto L_0x002b
            L_0x0028:
                r0 = move-exception
                goto L_0x0042
            L_0x002a:
                r1 = r4
            L_0x002b:
                if (r1 == 0) goto L_0x002f
                r1 = r5
                goto L_0x0030
            L_0x002f:
                r1 = r4
            L_0x0030:
                if (r1 == 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r5 = r4
            L_0x0034:
                monitor-exit(r3)     // Catch:{ all -> 0x0028 }
                if (r5 == 0) goto L_0x0044
                android.os.Handler r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f6053w
                x8.f r2 = new x8.f
                r2.<init>(r0)
                r1.post(r2)
                goto L_0x0044
            L_0x0042:
                monitor-exit(r3)     // Catch:{ all -> 0x0028 }
                throw r0
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.e.onDetachedFromWindow():void");
        }

        public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
            super.onLayout(z10, i8, i10, i11, i12);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6078a;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f6071q) {
                baseTransientBottomBar.e();
                baseTransientBottomBar.f6071q = false;
            }
        }

        public void onMeasure(int i8, int i10) {
            super.onMeasure(i8, i10);
            int i11 = this.B;
            if (i11 > 0 && getMeasuredWidth() > i11) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
            }
        }

        public void setAnimationMode(int i8) {
            this.f6080c = i8;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.D == null)) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.D);
                a.b.i(drawable, this.E);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.D = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.E);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.E = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.G && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.F = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f6078a;
                if (baseTransientBottomBar != null) {
                    v2.b bVar = BaseTransientBottomBar.f6050t;
                    baseTransientBottomBar.f();
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : H);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.f6062g = viewGroup;
            this.f6065j = snackbarContentLayout2;
            this.f6063h = context;
            s.c(context, s.f11306a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6054x);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            e eVar = (e) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.f6064i = eVar;
            eVar.setBaseTransientBottomBar(this);
            float actionTextColorAlpha = eVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f6085b.setTextColor(b1.b.h(actionTextColorAlpha, b1.b.f(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f6085b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(eVar.getMaxInlineActionWidth());
            eVar.addView(snackbarContentLayout);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.g.f(eVar, 1);
            i0.d.s(eVar, 1);
            eVar.setFitsSystemWindows(true);
            i0.i.u(eVar, new x8.d(this));
            i0.n(eVar, new x8.e(this));
            this.f6072r = (AccessibilityManager) context.getSystemService("accessibility");
            this.f6058c = n8.a.c(context, R.attr.motionDurationLong2, 250);
            this.f6056a = n8.a.c(context, R.attr.motionDurationLong2, 150);
            this.f6057b = n8.a.c(context, R.attr.motionDurationMedium1, 75);
            this.f6059d = n8.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f6051u);
            this.f6061f = n8.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f6052v);
            this.f6060e = n8.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f6050t);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void a() {
        b(3);
    }

    public final void b(int i8) {
        g b10 = g.b();
        c cVar = this.f6073s;
        synchronized (b10.f6095a) {
            if (b10.c(cVar)) {
                b10.a(b10.f6097c, i8);
            } else {
                g.c cVar2 = b10.f6098d;
                boolean z10 = false;
                if (cVar2 != null) {
                    if (cVar != null && cVar2.f6100a.get() == cVar) {
                        z10 = true;
                    }
                }
                if (z10) {
                    b10.a(b10.f6098d, i8);
                }
            }
        }
    }

    public final void c() {
        g b10 = g.b();
        c cVar = this.f6073s;
        synchronized (b10.f6095a) {
            try {
                if (b10.c(cVar)) {
                    b10.f6097c = null;
                    g.c cVar2 = b10.f6098d;
                    if (!(cVar2 == null || cVar2 == null)) {
                        b10.f6097c = cVar2;
                        b10.f6098d = null;
                        g.b bVar = cVar2.f6100a.get();
                        if (bVar != null) {
                            bVar.b();
                        } else {
                            b10.f6097c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ViewParent parent = this.f6064i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6064i);
        }
    }

    public final void d() {
        g b10 = g.b();
        c cVar = this.f6073s;
        synchronized (b10.f6095a) {
            if (b10.c(cVar)) {
                b10.d(b10.f6097c);
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.f6072r;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        e eVar = this.f6064i;
        if (z10) {
            eVar.post(new f(this));
            return;
        }
        if (eVar.getParent() != null) {
            eVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        e eVar = this.f6064i;
        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || eVar.F == null) {
            Log.w(f6055y, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (eVar.getParent() != null) {
            int i8 = this.m;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = eVar.F;
            marginLayoutParams.bottomMargin = rect.bottom + i8;
            marginLayoutParams.leftMargin = rect.left + this.f6068n;
            marginLayoutParams.rightMargin = rect.right + this.f6069o;
            marginLayoutParams.topMargin = rect.top;
            eVar.requestLayout();
            if (Build.VERSION.SDK_INT >= 29) {
                boolean z10 = false;
                if (this.f6070p > 0) {
                    ViewGroup.LayoutParams layoutParams2 = eVar.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).f1716a instanceof SwipeDismissBehavior)) {
                        z10 = true;
                    }
                }
                if (z10) {
                    b bVar = this.f6067l;
                    eVar.removeCallbacks(bVar);
                    eVar.post(bVar);
                }
            }
        }
    }
}
