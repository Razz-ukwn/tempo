package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.quickkonnect.silencio.R;
import h2.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class k0 extends ListView {
    public int B;
    public d C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public h G;
    public f H;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f1043a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f1044b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1045c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1046d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1047e = 0;

    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f1048a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f1049b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f1050c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f1051d = true;

        static {
            Class<AdapterView> cls = AdapterView.class;
            Class<AbsListView> cls2 = AbsListView.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Float.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, Boolean.TYPE, cls4, cls4});
                f1048a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
                f1049b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
                f1050c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    public static class d extends g.a {

        /* renamed from: b  reason: collision with root package name */
        public boolean f1052b = true;

        public d(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f1052b) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f10, float f11) {
            if (this.f1052b) {
                super.setHotspot(f10, f11);
            }
        }

        public final void setHotspotBounds(int i8, int i10, int i11, int i12) {
            if (this.f1052b) {
                super.setHotspotBounds(i8, i10, i11, i12);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f1052b) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1052b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f1053a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1053a = field;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            k0 k0Var = k0.this;
            k0Var.H = null;
            k0Var.drawableStateChanged();
        }
    }

    public k0(Context context, boolean z10) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.E = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.C;
        if (dVar != null) {
            dVar.f1052b = z10;
        }
    }

    public final int a(int i8, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i11 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i11;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i8, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0017
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x001e
            r0 = r4
            goto L_0x0141
        L_0x0015:
            r0 = r4
            goto L_0x0018
        L_0x0017:
            r0 = r5
        L_0x0018:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0021
        L_0x001e:
            r0 = r5
            goto L_0x0141
        L_0x0021:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0035
            r5 = r4
            goto L_0x0141
        L_0x0035:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.F = r4
            androidx.appcompat.widget.k0.a.a(r1, r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004f
            r1.setPressed(r4)
        L_0x004f:
            r16.layoutChildren()
            int r0 = r1.B
            if (r0 == r9) goto L_0x006c
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006c
            if (r0 == r10) goto L_0x006c
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006c
            r0.setPressed(r5)
        L_0x006c:
            r1.B = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            androidx.appcompat.widget.k0.a.a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0088
            r10.setPressed(r4)
        L_0x0088:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0092
            if (r8 == r9) goto L_0x0092
            r12 = r4
            goto L_0x0093
        L_0x0092:
            r12 = r5
        L_0x0093:
            if (r12 == 0) goto L_0x0098
            r11.setVisible(r5, r5)
        L_0x0098:
            int r0 = r10.getLeft()
            int r13 = r10.getTop()
            int r14 = r10.getRight()
            int r15 = r10.getBottom()
            android.graphics.Rect r5 = r1.f1043a
            r5.set(r0, r13, r14, r15)
            int r0 = r5.left
            int r13 = r1.f1044b
            int r0 = r0 - r13
            r5.left = r0
            int r0 = r5.top
            int r13 = r1.f1045c
            int r0 = r0 - r13
            r5.top = r0
            int r0 = r5.right
            int r13 = r1.f1046d
            int r0 = r0 + r13
            r5.right = r0
            int r0 = r5.bottom
            int r13 = r1.f1047e
            int r0 = r0 + r13
            r5.bottom = r0
            boolean r0 = y1.a.a()
            if (r0 == 0) goto L_0x00d4
            boolean r0 = androidx.appcompat.widget.k0.c.a(r16)
            goto L_0x00e3
        L_0x00d4:
            java.lang.reflect.Field r0 = androidx.appcompat.widget.k0.e.f1053a
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00dd }
            goto L_0x00e3
        L_0x00dd:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x0109
            r0 = r0 ^ r4
            boolean r13 = y1.a.a()
            if (r13 == 0) goto L_0x00f4
            androidx.appcompat.widget.k0.c.b(r1, r0)
            goto L_0x0104
        L_0x00f4:
            java.lang.reflect.Field r13 = androidx.appcompat.widget.k0.e.f1053a
            if (r13 == 0) goto L_0x0104
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r13.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0104:
            if (r8 == r9) goto L_0x0109
            r16.refreshDrawableState()
        L_0x0109:
            if (r12 == 0) goto L_0x0124
            float r0 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x011b
            r12 = r4
            goto L_0x011c
        L_0x011b:
            r12 = 0
        L_0x011c:
            r13 = 0
            r11.setVisible(r12, r13)
            w1.a.b.e(r11, r0, r5)
            goto L_0x0125
        L_0x0124:
            r13 = 0
        L_0x0125:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0130
            if (r8 == r9) goto L_0x0130
            w1.a.b.e(r0, r7, r6)
        L_0x0130:
            r1.setSelectorEnabled(r13)
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x013f
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x013f:
            r0 = r4
            r5 = 0
        L_0x0141:
            if (r0 == 0) goto L_0x0145
            if (r5 == 0) goto L_0x015e
        L_0x0145:
            r3 = 0
            r1.F = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.B
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x015e
            r5.setPressed(r3)
        L_0x015e:
            if (r0 == 0) goto L_0x0175
            h2.h r3 = r1.G
            if (r3 != 0) goto L_0x016b
            h2.h r3 = new h2.h
            r3.<init>(r1)
            r1.G = r3
        L_0x016b:
            h2.h r3 = r1.G
            boolean r5 = r3.L
            r3.L = r4
            r3.onTouch(r1, r2)
            goto L_0x0183
        L_0x0175:
            h2.h r2 = r1.G
            if (r2 == 0) goto L_0x0183
            boolean r3 = r2.L
            if (r3 == 0) goto L_0x0180
            r2.d()
        L_0x0180:
            r3 = 0
            r2.L = r3
        L_0x0183:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1043a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.H == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.F && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        return this.E || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.E || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.E || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.E && this.D) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.H = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i8 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.H == null) {
            f fVar = new f();
            this.H = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i8 < 30 || !b.f1051d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f1048a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            b.f1049b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            b.f1050c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.F && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.B = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.H;
        if (fVar != null) {
            k0 k0Var = k0.this;
            k0Var.H = null;
            k0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.D = z10;
    }

    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.C = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1044b = rect.left;
        this.f1045c = rect.top;
        this.f1046d = rect.right;
        this.f1047e = rect.bottom;
    }
}
