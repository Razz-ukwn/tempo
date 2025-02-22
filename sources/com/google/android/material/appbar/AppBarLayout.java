package com.google.android.material.appbar;

import ag.n2;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.quickkonnect.silencio.R;
import d2.b1;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.u;
import e2.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m8.s;
import w1.a;
import w7.e;
import w7.f;
import w7.h;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final /* synthetic */ int T = 0;
    public int B = 0;
    public j1 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public WeakReference<View> I;
    public final ColorStateList J;
    public ValueAnimator K;
    public ValueAnimator.AnimatorUpdateListener L;
    public final ArrayList M = new ArrayList();
    public final long N;
    public final TimeInterpolator O;
    public int[] P;
    public Drawable Q;
    public final float R;
    public Behavior S;

    /* renamed from: a  reason: collision with root package name */
    public int f5668a;

    /* renamed from: b  reason: collision with root package name */
    public int f5669b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f5670c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f5671d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5672e;

    public static class BaseBehavior<T extends AppBarLayout> extends e<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f5673j;

        /* renamed from: k  reason: collision with root package name */
        public int f5674k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f5675l;
        public b m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f5676n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5677o;

        public class a extends d2.a {
            public a() {
            }

            public final void d(View view, i iVar) {
                this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
                iVar.o(BaseBehavior.this.f5677o);
                iVar.j(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (((double) view.getScrollY()) < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if ((childAt instanceof u) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void I(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                r0 = 1
                if (r5 == 0) goto L_0x005e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f5684a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005e
                java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
                int r3 = d2.i0.d.d(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = r0
                goto L_0x005f
            L_0x005e:
                r9 = r2
            L_0x005f:
                boolean r10 = r8.G
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = D(r7)
                boolean r9 = r8.e(r9)
            L_0x006b:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L_0x00af
                if (r9 == 0) goto L_0x00b2
                q1.a r9 = r7.f1710b
                java.lang.Object r9 = r9.f12825b
                o.f r9 = (o.f) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f1712d
                r7.clear()
                if (r9 == 0) goto L_0x0089
                r7.addAll(r9)
            L_0x0089:
                int r9 = r7.size()
                r10 = r2
            L_0x008e:
                if (r10 >= r9) goto L_0x00ad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1716a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x00aa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f16517f
                if (r7 == 0) goto L_0x00ad
                r2 = r0
                goto L_0x00ad
            L_0x00aa:
                int r10 = r10 + 1
                goto L_0x008e
            L_0x00ad:
                if (r2 == 0) goto L_0x00b2
            L_0x00af:
                r8.jumpDrawablesToCurrentState()
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.I(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8) {
            int abs = Math.abs(x() - i8);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int x10 = x();
            if (x10 == i8) {
                ValueAnimator valueAnimator = this.f5675l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f5675l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f5675l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f5675l = valueAnimator3;
                valueAnimator3.setInterpolator(v7.a.f16232e);
                this.f5675l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f5675l.setDuration((long) Math.min(round, 600));
            this.f5675l.setIntValues(new int[]{x10, i8});
            this.f5675l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int[] iArr) {
            int i10;
            int i11;
            if (i8 != 0) {
                if (i8 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    i10 = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i10 = 0;
                }
                int i12 = i11;
                int i13 = i10;
                if (i12 != i13) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i8, i12, i13);
                }
            }
            if (appBarLayout.G) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public final b F(Parcelable parcelable, T t2) {
            int s10 = s();
            int childCount = t2.getChildCount();
            boolean z10 = false;
            int i8 = 0;
            while (i8 < childCount) {
                View childAt = t2.getChildAt(i8);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 > 0 || bottom < 0) {
                    i8++;
                } else {
                    if (parcelable == null) {
                        parcelable = k2.a.f10266b;
                    }
                    b bVar = new b(parcelable);
                    boolean z11 = s10 == 0;
                    bVar.f5680d = z11;
                    bVar.f5679c = !z11 && (-s10) >= t2.getTotalScrollRange();
                    bVar.f5681e = i8;
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    if (bottom == t2.getTopInset() + i0.d.d(childAt)) {
                        z10 = true;
                    }
                    bVar.C = z10;
                    bVar.B = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t2) {
            boolean z10;
            int paddingTop = t2.getPaddingTop() + t2.getTopInset();
            int x10 = x() - paddingTop;
            int childCount = t2.getChildCount();
            int i8 = 0;
            while (true) {
                z10 = true;
                if (i8 >= childCount) {
                    i8 = -1;
                    break;
                }
                View childAt = t2.getChildAt(i8);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.f5684a & 32) == 32) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i10 = -x10;
                if (top <= i10 && bottom >= i10) {
                    break;
                }
                i8++;
            }
            if (i8 >= 0) {
                View childAt2 = t2.getChildAt(i8);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i11 = cVar2.f5684a;
                if ((i11 & 17) == 17) {
                    int i12 = -childAt2.getTop();
                    int i13 = -childAt2.getBottom();
                    if (i8 == 0) {
                        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                        if (i0.d.b(t2) && i0.d.b(childAt2)) {
                            i12 -= t2.getTopInset();
                        }
                    }
                    if ((i11 & 2) == 2) {
                        WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                        i13 += i0.d.d(childAt2);
                    } else {
                        if ((i11 & 5) == 5) {
                            WeakHashMap<View, d1> weakHashMap3 = i0.f7217a;
                            int d10 = i0.d.d(childAt2) + i13;
                            if (x10 < d10) {
                                i12 = d10;
                            } else {
                                i13 = d10;
                            }
                        }
                    }
                    if ((i11 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i12 += cVar2.topMargin;
                        i13 -= cVar2.bottomMargin;
                    }
                    if (x10 < (i13 + i12) / 2) {
                        i12 = i13;
                    }
                    B(coordinatorLayout, t2, b7.a.r(i12 + paddingTop, -t2.getTotalScrollRange(), 0));
                }
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t2) {
            View view;
            boolean z10;
            boolean z11;
            i0.k(coordinatorLayout, i.a.f7787j.a());
            boolean z12 = false;
            i0.h(coordinatorLayout, 0);
            i0.k(coordinatorLayout, i.a.f7788k.a());
            i0.h(coordinatorLayout, 0);
            if (t2.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 >= childCount) {
                        view = null;
                        break;
                    }
                    view = coordinatorLayout.getChildAt(i8);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).f1716a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i8++;
                }
                View view2 = view;
                if (view2 != null) {
                    int childCount2 = t2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        z10 = true;
                        if (i10 >= childCount2) {
                            z11 = false;
                            break;
                        } else if (((c) t2.getChildAt(i10).getLayoutParams()).f5684a != 0) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (z11) {
                        if (!(i0.d(coordinatorLayout) != null)) {
                            i0.n(coordinatorLayout, new a());
                        }
                        if (x() != (-t2.getTotalScrollRange())) {
                            i0.l(coordinatorLayout, i.a.f7787j, new c(t2, false));
                            z12 = true;
                        }
                        if (x() != 0) {
                            if (view2.canScrollVertically(-1)) {
                                int i11 = -t2.getDownNestedPreScrollRange();
                                if (i11 != 0) {
                                    i0.l(coordinatorLayout, i.a.f7788k, new b(this, coordinatorLayout, t2, view2, i11));
                                }
                            } else {
                                i0.l(coordinatorLayout, i.a.f7788k, new c(t2, true));
                            }
                            this.f5677o = z10;
                        }
                        z10 = z12;
                        this.f5677o = z10;
                    }
                }
            }
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            int i10;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i8);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.m;
            if (bVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            B(coordinatorLayout, appBarLayout, i11);
                        } else {
                            A(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            B(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (bVar.f5679c) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (bVar.f5680d) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(bVar.f5681e);
                int i12 = -childAt.getBottom();
                if (this.m.C) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i10 = appBarLayout.getTopInset() + i0.d.d(childAt) + i12;
                } else {
                    i10 = Math.round(((float) childAt.getHeight()) * this.m.B) + i12;
                }
                A(coordinatorLayout, appBarLayout, i10);
            }
            appBarLayout.B = 0;
            this.m = null;
            int r10 = b7.a.r(s(), -appBarLayout.getTotalScrollRange(), 0);
            h hVar = this.f16518a;
            if (hVar == null) {
                this.f16519b = r10;
            } else if (hVar.f16523d != r10) {
                hVar.f16523d = r10;
                hVar.a();
            }
            I(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f5668a = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                i0.d.k(appBarLayout);
            }
            H(coordinatorLayout, appBarLayout);
            View D = D(coordinatorLayout);
            if (D != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    D.addOnUnhandledKeyEventListener(new w7.c(this, D, appBarLayout));
                } else {
                    D.setOnKeyListener(new w7.d(this, D, appBarLayout));
                }
            }
            return true;
        }

        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i8, i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i10, int[] iArr, int i11) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        public final void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout2, x() - i11, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i11 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = this.m;
                this.m = (b) parcelable;
                return;
            }
            this.m = null;
        }

        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b F = F(absSavedState, (AppBarLayout) view);
            return F == null ? absSavedState : F;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.G
                r0 = 1
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r0
                goto L_0x0015
            L_0x0014:
                r5 = r6
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r0
                goto L_0x0029
            L_0x0028:
                r2 = r6
            L_0x0029:
                if (r2 == 0) goto L_0x002c
            L_0x002b:
                r6 = r0
            L_0x002c:
                if (r6 == 0) goto L_0x0035
                android.animation.ValueAnimator r2 = r1.f5675l
                if (r2 == 0) goto L_0x0035
                r2.cancel()
            L_0x0035:
                r2 = 0
                r1.f5676n = r2
                r1.f5674k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i8) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f5674k == 0 || i8 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.G) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f5676n = new WeakReference<>(view2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r2 = r2.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean u(android.view.View r2) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                java.lang.ref.WeakReference<android.view.View> r2 = r1.f5676n
                if (r2 == 0) goto L_0x001e
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x001c
                boolean r0 = r2.isShown()
                if (r0 == 0) goto L_0x001c
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r2 = 0
                goto L_0x001f
            L_0x001e:
                r2 = 1
            L_0x001f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(android.view.View):boolean");
        }

        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final int x() {
            return s() + this.f5673j;
        }

        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.G) {
                appBarLayout.d(appBarLayout.e(D(coordinatorLayout)));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0189  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, int r21, int r22, int r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r22
                r3 = r20
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                int r4 = r18.x()
                r5 = 0
                if (r2 == 0) goto L_0x018f
                if (r4 < r2) goto L_0x018f
                r6 = r23
                if (r4 > r6) goto L_0x018f
                int r2 = b7.a.r(r21, r22, r23)
                if (r4 == r2) goto L_0x0191
                boolean r6 = r3.f5672e
                if (r6 == 0) goto L_0x0092
                int r6 = java.lang.Math.abs(r2)
                int r7 = r3.getChildCount()
                r8 = r5
            L_0x002a:
                if (r8 >= r7) goto L_0x0092
                android.view.View r9 = r3.getChildAt(r8)
                android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r10 = (com.google.android.material.appbar.AppBarLayout.c) r10
                android.view.animation.Interpolator r11 = r10.f5686c
                int r12 = r9.getTop()
                if (r6 < r12) goto L_0x008f
                int r12 = r9.getBottom()
                if (r6 > r12) goto L_0x008f
                if (r11 == 0) goto L_0x0092
                int r7 = r10.f5684a
                r8 = r7 & 1
                if (r8 == 0) goto L_0x0063
                int r8 = r9.getHeight()
                int r12 = r10.topMargin
                int r8 = r8 + r12
                int r10 = r10.bottomMargin
                int r8 = r8 + r10
                int r8 = r8 + r5
                r7 = r7 & 2
                if (r7 == 0) goto L_0x0064
                java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
                int r7 = d2.i0.d.d(r9)
                int r8 = r8 - r7
                goto L_0x0064
            L_0x0063:
                r8 = r5
            L_0x0064:
                java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
                boolean r7 = d2.i0.d.b(r9)
                if (r7 == 0) goto L_0x0071
                int r7 = r3.getTopInset()
                int r8 = r8 - r7
            L_0x0071:
                if (r8 <= 0) goto L_0x0092
                int r7 = r9.getTop()
                int r6 = r6 - r7
                float r7 = (float) r8
                float r6 = (float) r6
                float r6 = r6 / r7
                float r6 = r11.getInterpolation(r6)
                float r6 = r6 * r7
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Integer.signum(r2)
                int r8 = r9.getTop()
                int r8 = r8 + r6
                int r8 = r8 * r7
                goto L_0x0093
            L_0x008f:
                int r8 = r8 + 1
                goto L_0x002a
            L_0x0092:
                r8 = r2
            L_0x0093:
                w7.h r6 = r0.f16518a
                r7 = 1
                if (r6 == 0) goto L_0x00a5
                int r9 = r6.f16523d
                if (r9 == r8) goto L_0x00a3
                r6.f16523d = r8
                r6.a()
                r6 = r7
                goto L_0x00a8
            L_0x00a3:
                r6 = r5
                goto L_0x00a8
            L_0x00a5:
                r0.f16519b = r8
                goto L_0x00a3
            L_0x00a8:
                int r9 = r4 - r2
                int r8 = r2 - r8
                r0.f5673j = r8
                r8 = 0
                if (r6 == 0) goto L_0x013d
                r10 = r5
            L_0x00b2:
                int r11 = r3.getChildCount()
                if (r10 >= r11) goto L_0x013d
                android.view.View r11 = r3.getChildAt(r10)
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r11 = (com.google.android.material.appbar.AppBarLayout.c) r11
                com.google.android.material.appbar.AppBarLayout$b r12 = r11.f5685b
                if (r12 == 0) goto L_0x0138
                int r11 = r11.f5684a
                r11 = r11 & r7
                if (r11 == 0) goto L_0x0138
                android.view.View r11 = r3.getChildAt(r10)
                int r13 = r18.s()
                float r13 = (float) r13
                android.graphics.Rect r14 = r12.f5682a
                r11.getDrawingRect(r14)
                r3.offsetDescendantRectToMyCoords(r11, r14)
                int r15 = r3.getTopInset()
                int r15 = -r15
                r14.offset(r5, r15)
                int r15 = r14.top
                float r15 = (float) r15
                float r13 = java.lang.Math.abs(r13)
                float r15 = r15 - r13
                r13 = 0
                int r16 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r16 > 0) goto L_0x0130
                int r7 = r14.height()
                float r7 = (float) r7
                float r7 = r15 / r7
                float r7 = java.lang.Math.abs(r7)
                int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                r17 = 1065353216(0x3f800000, float:1.0)
                if (r16 >= 0) goto L_0x0103
                goto L_0x010b
            L_0x0103:
                int r13 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
                if (r13 <= 0) goto L_0x010a
                r13 = r17
                goto L_0x010b
            L_0x010a:
                r13 = r7
            L_0x010b:
                float r7 = -r15
                float r13 = r17 - r13
                float r13 = r13 * r13
                float r17 = r17 - r13
                int r13 = r14.height()
                float r13 = (float) r13
                r14 = 1050253722(0x3e99999a, float:0.3)
                float r13 = r13 * r14
                float r13 = r13 * r17
                float r7 = r7 - r13
                r11.setTranslationY(r7)
                android.graphics.Rect r12 = r12.f5683b
                r11.getDrawingRect(r12)
                float r7 = -r7
                int r7 = (int) r7
                r12.offset(r5, r7)
                java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
                d2.i0.f.c(r11, r12)
                goto L_0x0138
            L_0x0130:
                java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
                d2.i0.f.c(r11, r8)
                r11.setTranslationY(r13)
            L_0x0138:
                int r10 = r10 + 1
                r7 = 1
                goto L_0x00b2
            L_0x013d:
                if (r6 != 0) goto L_0x0174
                boolean r6 = r3.f5672e
                if (r6 == 0) goto L_0x0174
                q1.a r6 = r1.f1710b
                java.lang.Object r6 = r6.f12825b
                o.f r6 = (o.f) r6
                java.lang.Object r6 = r6.getOrDefault(r3, r8)
                java.util.List r6 = (java.util.List) r6
                if (r6 == 0) goto L_0x0174
                boolean r7 = r6.isEmpty()
                if (r7 != 0) goto L_0x0174
                r7 = r5
            L_0x0158:
                int r8 = r6.size()
                if (r7 >= r8) goto L_0x0174
                java.lang.Object r8 = r6.get(r7)
                android.view.View r8 = (android.view.View) r8
                android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f1716a
                if (r10 == 0) goto L_0x0171
                r10.d(r1, r8, r3)
            L_0x0171:
                int r7 = r7 + 1
                goto L_0x0158
            L_0x0174:
                int r6 = r18.s()
                r3.f5668a = r6
                boolean r6 = r3.willNotDraw()
                if (r6 != 0) goto L_0x0185
                java.util.WeakHashMap<android.view.View, d2.d1> r6 = d2.i0.f7217a
                d2.i0.d.k(r3)
            L_0x0185:
                if (r2 >= r4) goto L_0x0189
                r7 = -1
                goto L_0x018a
            L_0x0189:
                r7 = 1
            L_0x018a:
                I(r1, r3, r2, r7, r5)
                r5 = r9
                goto L_0x0191
            L_0x018f:
                r0.f5673j = r5
            L_0x0191:
                r0.H(r1, r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class b extends k2.a {
            public static final Parcelable.Creator<b> CREATOR = new a();
            public float B;
            public boolean C;

            /* renamed from: c  reason: collision with root package name */
            public boolean f5679c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f5680d;

            /* renamed from: e  reason: collision with root package name */
            public int f5681e;

            public class a implements Parcelable.ClassLoaderCreator<b> {
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                public final Object[] newArray(int i8) {
                    return new b[i8];
                }

                public final Object createFromParcel(Parcel parcel) {
                    return new b(parcel, (ClassLoader) null);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = true;
                this.f5679c = parcel.readByte() != 0;
                this.f5680d = parcel.readByte() != 0;
                this.f5681e = parcel.readInt();
                this.B = parcel.readFloat();
                this.C = parcel.readByte() == 0 ? false : z10;
            }

            public final void writeToParcel(Parcel parcel, int i8) {
                parcel.writeParcelable(this.f10267a, i8);
                parcel.writeByte(this.f5679c ? (byte) 1 : 0);
                parcel.writeByte(this.f5680d ? (byte) 1 : 0);
                parcel.writeInt(this.f5681e);
                parcel.writeFloat(this.B);
                parcel.writeByte(this.C ? (byte) 1 : 0);
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior() {
        }

        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i8;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1716a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f5673j + this.f16516e;
                if (this.f16517f == 0) {
                    i8 = 0;
                } else {
                    float v3 = v(view2);
                    int i10 = this.f16517f;
                    i8 = b7.a.r((int) (v3 * ((float) i10)), 0, i10);
                }
                int i11 = bottom - i8;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                view.offsetTopAndBottom(i11);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.G) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                i0.k(coordinatorLayout, i.a.f7787j.a());
                i0.h(coordinatorLayout, 0);
                i0.k(coordinatorLayout, i.a.f7788k.a());
                i0.h(coordinatorLayout, 0);
                i0.n(coordinatorLayout, (d2.a) null);
            }
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList d10 = coordinatorLayout.d(view);
            int size = d10.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) d10.get(i8);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i8++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f16514c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.c(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) arrayList.get(i8);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final float v(View view) {
            int i8;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1716a;
                int x10 = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).x() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + x10 > downNestedPreScrollRange) && (i8 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) x10) / ((float) i8)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final int w(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.f458f0);
            this.f16517f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f5682a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f5683b = new Rect();
    }

    public interface d {
        void a();
    }

    /* JADX INFO: finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.appBarLayoutStyle, 2132017998), attributeSet, R.attr.appBarLayoutStyle);
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d10 = s.d(context3, attributeSet, w7.i.f16524a, R.attr.appBarLayoutStyle, 2132017998, new int[0]);
        try {
            if (d10.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d10.getResourceId(0, 0)));
            }
            d10.recycle();
            TypedArray d11 = s.d(context2, attributeSet, n2.f456e, R.attr.appBarLayoutStyle, 2132017998, new int[0]);
            Drawable drawable = d11.getDrawable(0);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.q(this, drawable);
            ColorStateList a10 = r8.c.a(context2, d11, 6);
            this.J = a10;
            if (getBackground() instanceof ColorDrawable) {
                v8.f fVar = new v8.f();
                fVar.m(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                if (a10 != null) {
                    fVar.setAlpha(this.F ? 255 : 0);
                    fVar.m(a10);
                    this.L = new b1(1, this, fVar);
                } else {
                    fVar.j(context2);
                    this.L = new w7.a(this, fVar);
                }
                i0.d.q(this, fVar);
            }
            this.N = (long) n8.a.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.O = n8.a.d(context2, R.attr.motionEasingStandardInterpolator, v7.a.f16228a);
            if (d11.hasValue(4)) {
                c(d11.getBoolean(4, false), false, false);
            }
            if (d11.hasValue(3)) {
                w7.i.a(this, (float) d11.getDimensionPixelSize(3, 0));
            }
            if (d11.hasValue(2)) {
                setKeyboardNavigationCluster(d11.getBoolean(2, false));
            }
            if (d11.hasValue(1)) {
                setTouchscreenBlocksFocus(d11.getBoolean(1, false));
            }
            this.R = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.G = d11.getBoolean(5, false);
            this.H = d11.getResourceId(7, -1);
            setStatusBarForeground(d11.getDrawable(8));
            d11.recycle();
            i0.i.u(this, new w7.b(this));
        } catch (Throwable th) {
            d10.recycle();
            throw th;
        }
    }

    public static c a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.S;
        BaseBehavior.b F2 = (behavior == null || this.f5669b == -1 || this.B != 0) ? null : behavior.F(k2.a.f10266b, this);
        this.f5669b = -1;
        this.f5670c = -1;
        this.f5671d = -1;
        if (F2 != null) {
            Behavior behavior2 = this.S;
            if (behavior2.m == null) {
                behavior2.m = F2;
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i8 = 0;
        int i10 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i8 = 8;
        }
        this.B = i10 | i8;
        requestLayout();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(boolean z10) {
        if (!(!this.D) || this.F == z10) {
            return false;
        }
        this.F = z10;
        refreshDrawableState();
        if (!this.G || !(getBackground() instanceof v8.f)) {
            return true;
        }
        float f10 = 0.0f;
        if (this.J != null) {
            float f11 = z10 ? 0.0f : 255.0f;
            if (z10) {
                f10 = 255.0f;
            }
            g(f11, f10);
            return true;
        }
        float f12 = this.R;
        float f13 = z10 ? 0.0f : f12;
        if (z10) {
            f10 = f12;
        }
        g(f13, f10);
        return true;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.Q != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f5668a));
            this.Q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.Q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(View view) {
        int i8;
        View view2 = null;
        if (this.I == null && (i8 = this.H) != -1) {
            View findViewById = view != null ? view.findViewById(i8) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.H);
            }
            if (findViewById != null) {
                this.I = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.I;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return !i0.d.b(childAt);
    }

    public final void g(float f10, float f11) {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, f11});
        this.K = ofFloat;
        ofFloat.setDuration(this.N);
        this.K.setInterpolator(this.O);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.L;
        if (animatorUpdateListener != null) {
            this.K.addUpdateListener(animatorUpdateListener);
        }
        this.K.start();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.S = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f5670c
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0069
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x001d
            goto L_0x0066
        L_0x001d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f5684a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0063
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x003f
            java.util.WeakHashMap<android.view.View, d2.d1> r4 = d2.i0.f7217a
            int r4 = d2.i0.d.d(r3)
        L_0x003d:
            int r4 = r4 + r7
            goto L_0x004e
        L_0x003f:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x004c
            java.util.WeakHashMap<android.view.View, d2.d1> r4 = d2.i0.f7217a
            int r4 = d2.i0.d.d(r3)
            int r4 = r5 - r4
            goto L_0x003d
        L_0x004c:
            int r4 = r7 + r5
        L_0x004e:
            if (r0 != 0) goto L_0x0061
            java.util.WeakHashMap<android.view.View, d2.d1> r6 = d2.i0.f7217a
            boolean r3 = d2.i0.d.b(r3)
            if (r3 == 0) goto L_0x0061
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0061:
            int r2 = r2 + r4
            goto L_0x0066
        L_0x0063:
            if (r2 <= 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0069:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f5670c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i8 = this.f5671d;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = cVar.topMargin + cVar.bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f5684a;
                if ((i12 & 1) == 0) {
                    break;
                }
                i11 += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i11 -= i0.d.d(childAt);
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f5671d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.H;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int d10 = i0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            d10 = childCount >= 1 ? i0.d.d(getChildAt(childCount - 1)) : 0;
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.B;
    }

    public Drawable getStatusBarForeground() {
        return this.Q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        j1 j1Var = this.C;
        if (j1Var != null) {
            return j1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i8 = this.f5669b;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f5684a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int i13 = measuredHeight + cVar.topMargin + cVar.bottomMargin + i11;
                if (i10 == 0) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    if (i0.d.b(childAt)) {
                        i13 -= getTopInset();
                    }
                }
                i11 = i13;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                    i11 -= i0.d.d(childAt);
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f5669b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.k(this);
    }

    public final int[] onCreateDrawableState(int i8) {
        if (this.P == null) {
            this.P = new int[4];
        }
        int[] iArr = this.P;
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + iArr.length);
        boolean z10 = this.E;
        iArr[0] = z10 ? R.attr.state_liftable : -2130904184;
        iArr[1] = (!z10 || !this.F) ? -2130904185 : R.attr.state_lifted;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130904180;
        iArr[3] = (!z10 || !this.F) ? -2130904179 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.I = null;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        boolean z11;
        super.onLayout(z10, i8, i10, i11, i12);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z12 = true;
        if (i0.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f5672e = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            } else if (((c) getChildAt(i13).getLayoutParams()).f5686c != null) {
                this.f5672e = true;
                break;
            } else {
                i13++;
            }
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.D) {
            if (!this.G) {
                int childCount3 = getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount3) {
                        z11 = false;
                        break;
                    }
                    int i15 = ((c) getChildAt(i14).getLayoutParams()).f5684a;
                    if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                        z11 = true;
                        break;
                    }
                    i14++;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            if (this.E != z12) {
                this.E = z12;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = b7.a.r(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b1.b.i(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        c(z10, i0.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.G = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.H = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.I;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.I = null;
            return;
        }
        this.I = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i8) {
        this.H = i8;
        WeakReference<View> weakReference = this.I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.I = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.D = z10;
    }

    public void setOrientation(int i8) {
        if (i8 == 1) {
            super.setOrientation(i8);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.Q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.Q = drawable3;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.Q.setState(getDrawableState());
                }
                Drawable drawable4 = this.Q;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                a.c.b(drawable4, i0.e.d(this));
                this.Q.setVisible(getVisibility() == 0, false);
                this.Q.setCallback(this);
            }
            if (this.Q != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i8) {
        setStatusBarForeground(new ColorDrawable(i8));
    }

    public void setStatusBarForegroundResource(int i8) {
        setStatusBarForeground(f.a.a(getContext(), i8));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        w7.i.a(this, f10);
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z10 = i8 == 0;
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.Q;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m12generateDefaultLayoutParams() {
        return new c();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m13generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5684a = 1;

        /* renamed from: b  reason: collision with root package name */
        public b f5685b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f5686c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            b bVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.B);
            this.f5684a = obtainStyledAttributes.getInt(1, 0);
            if (obtainStyledAttributes.getInt(0, 0) != 1) {
                bVar = null;
            } else {
                bVar = new b();
            }
            this.f5685b = bVar;
            if (obtainStyledAttributes.hasValue(2)) {
                this.f5686c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c() {
            super(-1, -2);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
