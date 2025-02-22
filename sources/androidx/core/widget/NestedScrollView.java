package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.u;
import d2.v;
import d2.x;
import d2.y;
import e2.i;
import e2.k;
import h2.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements x, u {
    public static final float W = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: a0  reason: collision with root package name */
    public static final a f1751a0 = new a();

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f1752b0 = {16843130};
    public final EdgeEffect B;
    public int C;
    public boolean D = true;
    public boolean E = false;
    public View F = null;
    public boolean G = false;
    public VelocityTracker H;
    public boolean I;
    public boolean J = true;
    public int K;
    public int L;
    public int M;
    public int N = -1;
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public int Q;
    public int R;
    public d S;
    public final y T;
    public final v U;
    public float V;

    /* renamed from: a  reason: collision with root package name */
    public final float f1753a;

    /* renamed from: b  reason: collision with root package name */
    public long f1754b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1755c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f1756d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f1757e;

    public static class a extends d2.a {
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            k.c(accessibilityEvent, nestedScrollView.getScrollX());
            k.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void d(View view, i iVar) {
            int scrollRange;
            this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            iVar.j(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                iVar.o(true);
                if (nestedScrollView.getScrollY() > 0) {
                    iVar.b(i.a.f7788k);
                    iVar.b(i.a.f7791o);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    iVar.b(i.a.f7787j);
                    iVar.b(i.a.f7792p);
                }
            }
        }

        public final boolean g(View view, int i8, Bundle bundle) {
            if (super.g(view, i8, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i8 != 4096) {
                if (i8 == 8192 || i8 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i8 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1758a;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return b3.x.b(sb2, this.f1758a, "}");
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f1758a);
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f1758a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        int i8 = Build.VERSION.SDK_INT;
        this.f1757e = i8 >= 31 ? d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.B = i8 >= 31 ? d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1753a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1756d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.K = viewConfiguration.getScaledTouchSlop();
        this.L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1752b0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.T = new y();
        this.U = new v(this);
        setNestedScrollingEnabled(true);
        i0.n(this, f1751a0);
    }

    public static boolean f(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && f((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.V == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.V = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.V;
    }

    public final boolean a(int i8) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i8);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !g(findNextFocus, maxScrollAmount, getHeight())) {
            if (i8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1755c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(b(rect), 0, 1, true);
            findNextFocus.requestFocus(i8);
        }
        if (findFocus != null && findFocus.isFocused() && (!g(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i8 - verticalFadingEdgeLength : i8;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i10) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i8);
        } else if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.view.KeyEvent r8) {
        /*
            r7 = this;
            android.graphics.Rect r0 = r7.f1755c
            r0.setEmpty()
            int r1 = r7.getChildCount()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0033
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r1 = r1.getHeight()
            int r5 = r4.topMargin
            int r1 = r1 + r5
            int r4 = r4.bottomMargin
            int r1 = r1 + r4
            int r4 = r7.getHeight()
            int r5 = r7.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            if (r1 <= r4) goto L_0x0033
            r1 = r2
            goto L_0x0034
        L_0x0033:
            r1 = r3
        L_0x0034:
            r4 = 130(0x82, float:1.82E-43)
            if (r1 != 0) goto L_0x0062
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0061
            int r8 = r8.getKeyCode()
            r0 = 4
            if (r8 == r0) goto L_0x0061
            android.view.View r8 = r7.findFocus()
            if (r8 != r7) goto L_0x004c
            r8 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r0.findNextFocus(r7, r8, r4)
            if (r8 == 0) goto L_0x005f
            if (r8 == r7) goto L_0x005f
            boolean r8 = r8.requestFocus(r4)
            if (r8 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r3
        L_0x0060:
            return r2
        L_0x0061:
            return r3
        L_0x0062:
            int r1 = r8.getAction()
            if (r1 != 0) goto L_0x00ef
            int r1 = r8.getKeyCode()
            r5 = 19
            r6 = 33
            if (r1 == r5) goto L_0x00e0
            r5 = 20
            if (r1 == r5) goto L_0x00d0
            r5 = 62
            if (r1 == r5) goto L_0x007c
            goto L_0x00ef
        L_0x007c:
            boolean r8 = r8.isShiftPressed()
            if (r8 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r6 = r4
        L_0x0084:
            if (r6 != r4) goto L_0x0088
            r8 = r2
            goto L_0x0089
        L_0x0088:
            r8 = r3
        L_0x0089:
            int r1 = r7.getHeight()
            if (r8 == 0) goto L_0x00bc
            int r8 = r7.getScrollY()
            int r8 = r8 + r1
            r0.top = r8
            int r8 = r7.getChildCount()
            if (r8 <= 0) goto L_0x00c7
            int r8 = r8 - r2
            android.view.View r8 = r7.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r8 = r8.getBottom()
            int r2 = r2.bottomMargin
            int r8 = r8 + r2
            int r2 = r7.getPaddingBottom()
            int r2 = r2 + r8
            int r8 = r0.top
            int r8 = r8 + r1
            if (r8 <= r2) goto L_0x00c7
            int r2 = r2 - r1
            r0.top = r2
            goto L_0x00c7
        L_0x00bc:
            int r8 = r7.getScrollY()
            int r8 = r8 - r1
            r0.top = r8
            if (r8 >= 0) goto L_0x00c7
            r0.top = r3
        L_0x00c7:
            int r8 = r0.top
            int r1 = r1 + r8
            r0.bottom = r1
            r7.q(r6, r8, r1)
            goto L_0x00ef
        L_0x00d0:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto L_0x00db
            boolean r3 = r7.a(r4)
            goto L_0x00ef
        L_0x00db:
            boolean r3 = r7.e(r4)
            goto L_0x00ef
        L_0x00e0:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto L_0x00eb
            boolean r3 = r7.a(r6)
            goto L_0x00ef
        L_0x00eb:
            boolean r3 = r7.e(r6)
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.c(android.view.KeyEvent):boolean");
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r15 = this;
            android.widget.OverScroller r0 = r15.f1756d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r15.f1756d
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r15.f1756d
            int r0 = r0.getCurrY()
            int r1 = r15.R
            int r1 = r0 - r1
            int r2 = r15.getHeight()
            android.widget.EdgeEffect r3 = r15.B
            android.widget.EdgeEffect r4 = r15.f1757e
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0046
            float r8 = h2.d.a(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0046
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = h2.d.b(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0063
            r4.finish()
            goto L_0x0063
        L_0x0046:
            if (r1 >= 0) goto L_0x0064
            float r8 = h2.d.a(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = h2.d.b(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0063
            r3.finish()
        L_0x0063:
            int r1 = r1 - r2
        L_0x0064:
            r15.R = r0
            int[] r0 = r15.P
            r2 = 1
            r13 = 0
            r0[r2] = r13
            r6 = 0
            r10 = 0
            r8 = 1
            d2.v r5 = r15.U
            r7 = r1
            r9 = r0
            r5.c(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r14 = r15.getScrollRange()
            if (r1 == 0) goto L_0x00a2
            int r5 = r15.getScrollY()
            int r6 = r15.getScrollX()
            r15.p(r1, r6, r5, r14)
            int r6 = r15.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r13
            int[] r10 = r15.O
            r11 = 1
            r6 = 0
            r8 = 0
            d2.v r5 = r15.U
            r9 = r1
            r12 = r0
            r5.e(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a2:
            if (r1 == 0) goto L_0x00dc
            int r0 = r15.getOverScrollMode()
            if (r0 == 0) goto L_0x00ae
            if (r0 != r2) goto L_0x00af
            if (r14 <= 0) goto L_0x00af
        L_0x00ae:
            r13 = r2
        L_0x00af:
            if (r13 == 0) goto L_0x00d4
            if (r1 >= 0) goto L_0x00c4
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d4
            android.widget.OverScroller r0 = r15.f1756d
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d4
        L_0x00c4:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d4
            android.widget.OverScroller r0 = r15.f1756d
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d4:
            android.widget.OverScroller r0 = r15.f1756d
            r0.abortAnimation()
            r15.w(r2)
        L_0x00dc:
            android.widget.OverScroller r0 = r15.f1756d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00ea
            java.util.WeakHashMap<android.view.View, d2.d1> r0 = d2.i0.f7217a
            d2.i0.d.k(r15)
            goto L_0x00ed
        L_0x00ea:
            r15.w(r2)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d(int i8) {
        if (getChildCount() > 0) {
            this.f1756d.fling(getScrollX(), getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.R = getScrollY();
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.U.a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.U.b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i8, int i10, int[] iArr, int[] iArr2) {
        return this.U.c(i8, i10, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i8, int i10, int i11, int i12, int[] iArr) {
        return this.U.e(i8, i10, i11, i12, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i8;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1757e;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i8 = getPaddingLeft() + 0;
            } else {
                i8 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i8, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.B;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i10 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i10 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                i0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean e(int i8) {
        int childCount;
        boolean z10 = i8 == 130;
        int height = getHeight();
        Rect rect = this.f1755c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return q(i8, rect.top, rect.bottom);
    }

    public final boolean g(View view, int i8, int i10) {
        Rect rect = this.f1755c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i8 >= getScrollY() && rect.top - i8 <= getScrollY() + i10;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        y yVar = this.T;
        return yVar.f7286b | yVar.f7285a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void h(int i8, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i8);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.U.d(scrollY2, i8 - scrollY2, i10, iArr);
    }

    public final boolean hasNestedScrollingParent() {
        return this.U.f(0) != null;
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.C = (int) motionEvent.getY(i8);
            this.N = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return this.U.f7283d;
    }

    public final void j(View view, int i8, int i10, int i11, int i12, int i13, int[] iArr) {
        h(i12, i13, iArr);
    }

    public final void k(View view, int i8, int i10, int i11, int i12, int i13) {
        h(i12, i13, (int[]) null);
    }

    public final boolean l(View view, View view2, int i8, int i10) {
        return (i8 & 2) != 0;
    }

    public final void m(View view, View view2, int i8, int i10) {
        y yVar = this.T;
        if (i10 == 1) {
            yVar.f7286b = i8;
        } else {
            yVar.f7285a = i8;
        }
        u(2, i10);
    }

    public final void measureChild(View view, int i8, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i8, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(View view, int i8) {
        y yVar = this.T;
        if (i8 == 1) {
            yVar.f7286b = 0;
        } else {
            yVar.f7285a = 0;
        }
        w(i8);
    }

    public final void o(View view, int i8, int i10, int[] iArr, int i11) {
        this.U.c(i8, i10, i11, iArr, (int[]) null);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i8;
        float f10;
        boolean z10 = false;
        if (motionEvent.getAction() != 8 || this.G) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            f10 = motionEvent.getAxisValue(9);
            i8 = (int) motionEvent.getX();
        } else {
            if ((motionEvent.getSource() & 4194304) == 4194304) {
                f10 = motionEvent.getAxisValue(26);
                i8 = getWidth() / 2;
            } else {
                i8 = 0;
                f10 = 0.0f;
            }
        }
        if (f10 == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (f10 * getVerticalScrollFactorCompat());
        if ((motionEvent.getSource() & 8194) == 8194) {
            z10 = true;
        }
        r(-verticalScrollFactorCompat, i8, 1, z10);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r12.G
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00b1
            r5 = -1
            if (r0 == r1) goto L_0x0083
            if (r0 == r2) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x0083
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0139
        L_0x0020:
            r12.i(r13)
            goto L_0x0139
        L_0x0025:
            int r0 = r12.N
            if (r0 != r5) goto L_0x002b
            goto L_0x0139
        L_0x002b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L_0x004b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x0139
        L_0x004b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.C
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.K
            if (r3 <= r5) goto L_0x0139
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0139
            r12.G = r1
            r12.C = r0
            android.view.VelocityTracker r0 = r12.H
            if (r0 != 0) goto L_0x0071
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.H = r0
        L_0x0071:
            android.view.VelocityTracker r0 = r12.H
            r0.addMovement(r13)
            r12.Q = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0139
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0139
        L_0x0083:
            r12.G = r4
            r12.N = r5
            android.view.VelocityTracker r13 = r12.H
            if (r13 == 0) goto L_0x0090
            r13.recycle()
            r12.H = r3
        L_0x0090:
            android.widget.OverScroller r5 = r12.f1756d
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x00ac
            java.util.WeakHashMap<android.view.View, d2.d1> r13 = d2.i0.f7217a
            d2.i0.d.k(r12)
        L_0x00ac:
            r12.w(r4)
            goto L_0x0139
        L_0x00b1:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00e5
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00e5
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00e5
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00e5
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00e5
            r5 = r1
            goto L_0x00e6
        L_0x00e5:
            r5 = r4
        L_0x00e6:
            if (r5 != 0) goto L_0x0104
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L_0x00f8
            android.widget.OverScroller r13 = r12.f1756d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r1 = r4
        L_0x00f8:
            r12.G = r1
            android.view.VelocityTracker r13 = r12.H
            if (r13 == 0) goto L_0x0139
            r13.recycle()
            r12.H = r3
            goto L_0x0139
        L_0x0104:
            r12.C = r0
            int r0 = r13.getPointerId(r4)
            r12.N = r0
            android.view.VelocityTracker r0 = r12.H
            if (r0 != 0) goto L_0x0117
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.H = r0
            goto L_0x011a
        L_0x0117:
            r0.clear()
        L_0x011a:
            android.view.VelocityTracker r0 = r12.H
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f1756d
            r0.computeScrollOffset()
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L_0x0134
            android.widget.OverScroller r13 = r12.f1756d
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r1 = r4
        L_0x0134:
            r12.G = r1
            r12.u(r2, r4)
        L_0x0139:
            boolean r13 = r12.G
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i8, i10, i11, i12);
        int i14 = 0;
        this.D = false;
        View view = this.F;
        if (view != null && f(view, this)) {
            View view2 = this.F;
            Rect rect = this.f1755c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.F = null;
        if (!this.E) {
            if (this.S != null) {
                scrollTo(getScrollX(), this.S.f1758a);
                this.S = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.E = true;
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        if (this.I && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        d((int) f11);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public final void onNestedPreScroll(View view, int i8, int i10, int[] iArr) {
        o(view, i8, i10, iArr, 0);
    }

    public final void onNestedScroll(View view, int i8, int i10, int i11, int i12) {
        h(i12, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i8) {
        m(view, view2, i8, 0);
    }

    public final void onOverScrolled(int i8, int i10, boolean z10, boolean z11) {
        super.scrollTo(i8, i10);
    }

    public final boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (i8 == 2) {
            i8 = 130;
        } else if (i8 == 1) {
            i8 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i8) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i8);
        if (findNextFocus != null && !(true ^ g(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i8, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.S = dVar;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1758a = getScrollY();
        return dVar;
    }

    public final void onScrollChanged(int i8, int i10, int i11, int i12) {
        super.onScrollChanged(i8, i10, i11, i12);
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && g(findFocus, 0, i12)) {
            Rect rect = this.f1755c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int b10 = b(rect);
            if (b10 == 0) {
                return;
            }
            if (this.J) {
                t(0, b10, false);
            } else {
                scrollBy(0, b10);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i8) {
        return l(view, view2, i8, 0);
    }

    public final void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.view.VelocityTracker r2 = r0.H
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.H = r2
        L_0x000e:
            int r2 = r20.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r0.Q = r3
        L_0x0017:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r20)
            int r5 = r0.Q
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            r5 = 1
            r7 = 2
            if (r2 == 0) goto L_0x01e9
            r8 = 0
            r9 = -1
            android.widget.EdgeEffect r10 = r0.f1757e
            android.widget.EdgeEffect r11 = r0.B
            if (r2 == r5) goto L_0x015a
            if (r2 == r7) goto L_0x00a0
            r6 = 3
            if (r2 == r6) goto L_0x0060
            r3 = 5
            if (r2 == r3) goto L_0x004d
            r3 = 6
            if (r2 == r3) goto L_0x003b
            goto L_0x021d
        L_0x003b:
            r19.i(r20)
            int r2 = r0.N
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.C = r1
            goto L_0x021d
        L_0x004d:
            int r2 = r20.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.C = r3
            int r1 = r1.getPointerId(r2)
            r0.N = r1
            goto L_0x021d
        L_0x0060:
            boolean r1 = r0.G
            if (r1 == 0) goto L_0x0088
            int r1 = r19.getChildCount()
            if (r1 <= 0) goto L_0x0088
            android.widget.OverScroller r12 = r0.f1756d
            int r13 = r19.getScrollX()
            int r14 = r19.getScrollY()
            r15 = 0
            r16 = 0
            r17 = 0
            int r18 = r19.getScrollRange()
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0088
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            d2.i0.d.k(r19)
        L_0x0088:
            r0.N = r9
            r0.G = r3
            android.view.VelocityTracker r1 = r0.H
            if (r1 == 0) goto L_0x0095
            r1.recycle()
            r0.H = r8
        L_0x0095:
            r0.w(r3)
            r10.onRelease()
            r11.onRelease()
            goto L_0x021d
        L_0x00a0:
            int r2 = r0.N
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r9) goto L_0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.N
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L_0x021d
        L_0x00c4:
            float r7 = r1.getY(r2)
            int r7 = (int) r7
            int r8 = r0.C
            int r8 = r8 - r7
            float r9 = r1.getX(r2)
            int r12 = r19.getWidth()
            float r12 = (float) r12
            float r9 = r9 / r12
            float r12 = (float) r8
            int r13 = r19.getHeight()
            float r13 = (float) r13
            float r12 = r12 / r13
            float r13 = h2.d.a(r10)
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x00f8
            float r11 = -r12
            float r9 = h2.d.b(r10, r11, r9)
            float r9 = -r9
            float r11 = h2.d.a(r10)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00f6
            r10.onRelease()
        L_0x00f6:
            r6 = r9
            goto L_0x0113
        L_0x00f8:
            float r10 = h2.d.a(r11)
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0113
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r9
            float r9 = h2.d.b(r11, r12, r10)
            float r10 = h2.d.a(r11)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00f6
            r11.onRelease()
            goto L_0x00f6
        L_0x0113:
            int r9 = r19.getHeight()
            float r9 = (float) r9
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L_0x0122
            r19.invalidate()
        L_0x0122:
            int r8 = r8 - r6
            boolean r6 = r0.G
            if (r6 != 0) goto L_0x0143
            int r6 = java.lang.Math.abs(r8)
            int r9 = r0.K
            if (r6 <= r9) goto L_0x0143
            android.view.ViewParent r6 = r19.getParent()
            if (r6 == 0) goto L_0x0138
            r6.requestDisallowInterceptTouchEvent(r5)
        L_0x0138:
            r0.G = r5
            if (r8 <= 0) goto L_0x0140
            int r6 = r0.K
            int r8 = r8 - r6
            goto L_0x0143
        L_0x0140:
            int r6 = r0.K
            int r8 = r8 + r6
        L_0x0143:
            boolean r6 = r0.G
            if (r6 == 0) goto L_0x021d
            float r1 = r1.getX(r2)
            int r1 = (int) r1
            int r1 = r0.r(r8, r1, r3, r3)
            int r7 = r7 - r1
            r0.C = r7
            int r2 = r0.Q
            int r2 = r2 + r1
            r0.Q = r2
            goto L_0x021d
        L_0x015a:
            android.view.VelocityTracker r1 = r0.H
            int r2 = r0.M
            float r2 = (float) r2
            r7 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r7, r2)
            int r2 = r0.N
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r7 = r0.L
            if (r2 < r7) goto L_0x01b4
            float r2 = h2.d.a(r10)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x018a
            boolean r2 = r0.s(r10, r1)
            if (r2 == 0) goto L_0x0185
            r10.onAbsorb(r1)
            goto L_0x01a0
        L_0x0185:
            int r2 = -r1
            r0.d(r2)
            goto L_0x01a0
        L_0x018a:
            float r2 = h2.d.a(r11)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01a2
            int r2 = -r1
            boolean r7 = r0.s(r11, r2)
            if (r7 == 0) goto L_0x019d
            r11.onAbsorb(r2)
            goto L_0x01a0
        L_0x019d:
            r0.d(r2)
        L_0x01a0:
            r2 = r5
            goto L_0x01a3
        L_0x01a2:
            r2 = r3
        L_0x01a3:
            if (r2 != 0) goto L_0x01d2
            int r1 = -r1
            float r2 = (float) r1
            boolean r7 = r0.dispatchNestedPreFling(r6, r2)
            if (r7 != 0) goto L_0x01d2
            r0.dispatchNestedFling(r6, r2, r5)
            r0.d(r1)
            goto L_0x01d2
        L_0x01b4:
            android.widget.OverScroller r12 = r0.f1756d
            int r13 = r19.getScrollX()
            int r14 = r19.getScrollY()
            r15 = 0
            r16 = 0
            r17 = 0
            int r18 = r19.getScrollRange()
            boolean r1 = r12.springBack(r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x01d2
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            d2.i0.d.k(r19)
        L_0x01d2:
            r0.N = r9
            r0.G = r3
            android.view.VelocityTracker r1 = r0.H
            if (r1 == 0) goto L_0x01df
            r1.recycle()
            r0.H = r8
        L_0x01df:
            r0.w(r3)
            r10.onRelease()
            r11.onRelease()
            goto L_0x021d
        L_0x01e9:
            int r2 = r19.getChildCount()
            if (r2 != 0) goto L_0x01f0
            return r3
        L_0x01f0:
            boolean r2 = r0.G
            if (r2 == 0) goto L_0x01fd
            android.view.ViewParent r2 = r19.getParent()
            if (r2 == 0) goto L_0x01fd
            r2.requestDisallowInterceptTouchEvent(r5)
        L_0x01fd:
            android.widget.OverScroller r2 = r0.f1756d
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x020d
            android.widget.OverScroller r2 = r0.f1756d
            r2.abortAnimation()
            r0.w(r5)
        L_0x020d:
            float r2 = r20.getY()
            int r2 = (int) r2
            int r1 = r1.getPointerId(r3)
            r0.C = r2
            r0.N = r1
            r0.u(r7, r3)
        L_0x021d:
            android.view.VelocityTracker r1 = r0.H
            if (r1 == 0) goto L_0x0224
            r1.addMovement(r4)
        L_0x0224:
            r4.recycle()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            d2.v r2 = r9.U
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f1756d
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.p(int, int, int, int):boolean");
    }

    public final boolean q(int i8, int i10, int i11) {
        boolean z10;
        int i12 = i8;
        int i13 = i10;
        int i14 = i11;
        int height = getHeight();
        int scrollY = getScrollY();
        int i15 = height + scrollY;
        boolean z11 = i12 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i16 = 0; i16 < size; i16++) {
            View view2 = focusables.get(i16);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i13 < bottom && top < i14) {
                boolean z13 = i13 < top && bottom < i14;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (!z14) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i13 < scrollY || i14 > i15) {
            r(z11 ? i13 - scrollY : i14 - i15, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i12);
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(int r21, int r22, int r23, boolean r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r10 = r23
            r11 = 1
            if (r10 != r11) goto L_0x000d
            r2 = 2
            r0.u(r2, r10)
        L_0x000d:
            r3 = 0
            int[] r6 = r0.P
            int[] r7 = r0.O
            d2.v r2 = r0.U
            r4 = r21
            r5 = r23
            boolean r2 = r2.c(r3, r4, r5, r6, r7)
            int[] r12 = r0.P
            r13 = 0
            int[] r14 = r0.O
            if (r2 == 0) goto L_0x002e
            r2 = r12[r11]
            int r2 = r21 - r2
            r3 = r14[r11]
            int r3 = r3 + r13
            r15 = r2
            r16 = r3
            goto L_0x0032
        L_0x002e:
            r15 = r21
            r16 = r13
        L_0x0032:
            int r9 = r20.getScrollY()
            int r8 = r20.getScrollRange()
            int r2 = r20.getOverScrollMode()
            if (r2 == 0) goto L_0x004b
            if (r2 != r11) goto L_0x0049
            int r2 = r20.getScrollRange()
            if (r2 <= 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r2 = r13
            goto L_0x004c
        L_0x004b:
            r2 = r11
        L_0x004c:
            if (r2 == 0) goto L_0x0053
            if (r24 != 0) goto L_0x0053
            r17 = r11
            goto L_0x0055
        L_0x0053:
            r17 = r13
        L_0x0055:
            boolean r2 = r0.p(r15, r13, r9, r8)
            if (r2 == 0) goto L_0x006b
            d2.v r2 = r0.U
            android.view.ViewParent r2 = r2.f(r10)
            if (r2 == 0) goto L_0x0065
            r2 = r11
            goto L_0x0066
        L_0x0065:
            r2 = r13
        L_0x0066:
            if (r2 != 0) goto L_0x006b
            r18 = r11
            goto L_0x006d
        L_0x006b:
            r18 = r13
        L_0x006d:
            int r2 = r20.getScrollY()
            int r4 = r2 - r9
            int r6 = r15 - r4
            r12[r11] = r13
            int[] r7 = r0.O
            r3 = 0
            r5 = 0
            d2.v r2 = r0.U
            r13 = r8
            r8 = r23
            r19 = r9
            r9 = r12
            r2.e(r3, r4, r5, r6, r7, r8, r9)
            r2 = r14[r11]
            int r16 = r16 + r2
            r2 = r12[r11]
            int r15 = r15 - r2
            int r9 = r19 + r15
            android.widget.EdgeEffect r2 = r0.B
            android.widget.EdgeEffect r3 = r0.f1757e
            if (r9 >= 0) goto L_0x00b3
            if (r17 == 0) goto L_0x00d4
            int r4 = -r15
            float r4 = (float) r4
            int r5 = r20.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = (float) r1
            int r5 = r20.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            h2.d.b(r3, r4, r1)
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto L_0x00d4
            r2.onRelease()
            goto L_0x00d4
        L_0x00b3:
            if (r9 <= r13) goto L_0x00d4
            if (r17 == 0) goto L_0x00d4
            float r4 = (float) r15
            int r5 = r20.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r1 = (float) r1
            int r5 = r20.getWidth()
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r1
            h2.d.b(r2, r4, r5)
            boolean r1 = r3.isFinished()
            if (r1 != 0) goto L_0x00d4
            r3.onRelease()
        L_0x00d4:
            boolean r1 = r3.isFinished()
            if (r1 == 0) goto L_0x00e4
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            r13 = r18
            goto L_0x00ea
        L_0x00e4:
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            d2.i0.d.k(r20)
            r13 = 0
        L_0x00ea:
            if (r13 == 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00f3
            android.view.VelocityTracker r1 = r0.H
            r1.clear()
        L_0x00f3:
            if (r10 != r11) goto L_0x00fe
            r0.w(r10)
            r3.onRelease()
            r2.onRelease()
        L_0x00fe:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int, boolean):int");
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.D) {
            Rect rect = this.f1755c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        } else {
            this.F = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        boolean z11 = b10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, b10);
            } else {
                t(0, b10, false);
            }
        }
        return z11;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.H) != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        this.D = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i8) {
        if (i8 > 0) {
            return true;
        }
        float a10 = h2.d.a(edgeEffect) * ((float) getHeight());
        float f10 = this.f1753a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i8)) * 0.35f) / f10));
        double d10 = (double) W;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f10))) < a10;
    }

    public final void scrollTo(int i8, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i8 < 0) {
                i8 = 0;
            } else if (width + i8 > width2) {
                i8 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i8 != getScrollX() || i10 != getScrollY()) {
                super.scrollTo(i8, i10);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.I) {
            this.I = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        v vVar = this.U;
        if (vVar.f7283d) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.i.z(vVar.f7282c);
        }
        vVar.f7283d = z10;
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.J = z10;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i8) {
        return u(i8, 0);
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i8, int i10, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1754b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1756d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
                if (z10) {
                    u(2, 1);
                } else {
                    w(1);
                }
                this.R = getScrollY();
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.k(this);
            } else {
                if (!this.f1756d.isFinished()) {
                    this.f1756d.abortAnimation();
                    w(1);
                }
                scrollBy(i8, i10);
            }
            this.f1754b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean u(int i8, int i10) {
        return this.U.g(i8, i10);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1757e;
        if (h2.d.a(edgeEffect) != 0.0f) {
            h2.d.b(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (h2.d.a(edgeEffect2) == 0.0f) {
            return z10;
        }
        h2.d.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i8) {
        this.U.h(i8);
    }

    public final void addView(View view, int i8) {
        if (getChildCount() <= 0) {
            super.addView(view, i8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
