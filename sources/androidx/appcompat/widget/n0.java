package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import cb.e;
import d2.i0;

public class n0 extends ViewGroup {
    public int B;
    public float C;
    public boolean D;
    public int[] E;
    public int[] F;
    public Drawable G;
    public int H;
    public int I;
    public int J;
    public int K;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1087a;

    /* renamed from: b  reason: collision with root package name */
    public int f1088b;

    /* renamed from: c  reason: collision with root package name */
    public int f1089c;

    /* renamed from: d  reason: collision with root package name */
    public int f1090d;

    /* renamed from: e  reason: collision with root package name */
    public int f1091e;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i8, int i10) {
            super(i8, i10);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public n0(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i8) {
        this.G.setBounds(getPaddingLeft() + this.K, i8, (getWidth() - getPaddingRight()) - this.K, this.I + i8);
        this.G.draw(canvas);
    }

    public final void e(Canvas canvas, int i8) {
        this.G.setBounds(i8, getPaddingTop() + this.K, this.H + i8, (getHeight() - getPaddingBottom()) - this.K);
        this.G.draw(canvas);
    }

    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i8 = this.f1090d;
        if (i8 == 0) {
            return new a(-2, -2);
        }
        if (i8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i8;
        if (this.f1088b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f1088b;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i11 = this.f1089c;
                if (this.f1090d == 1 && (i8 = this.f1091e & 112) != 48) {
                    if (i8 == 16) {
                        i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.B) / 2;
                    } else if (i8 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.B;
                    }
                }
                return i11 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1088b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1088b;
    }

    public Drawable getDividerDrawable() {
        return this.G;
    }

    public int getDividerPadding() {
        return this.K;
    }

    public int getDividerWidth() {
        return this.H;
    }

    public int getGravity() {
        return this.f1091e;
    }

    public int getOrientation() {
        return this.f1090d;
    }

    public int getShowDividers() {
        return this.J;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.C;
    }

    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i8) {
        if (i8 == 0) {
            return (this.J & 1) != 0;
        }
        if (i8 == getChildCount()) {
            return (this.J & 4) != 0;
        }
        if ((this.J & 2) == 0) {
            return false;
        }
        for (int i10 = i8 - 1; i10 >= 0; i10--) {
            if (getChildAt(i10).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public final void onDraw(Canvas canvas) {
        int i8;
        int i10;
        int i11;
        if (this.G != null) {
            int i12 = 0;
            if (this.f1090d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i12 < virtualChildCount) {
                    View childAt = getChildAt(i12);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i12))) {
                        d(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.I);
                    }
                    i12++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.I : childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a10 = q1.a(this);
            while (i12 < virtualChildCount2) {
                View childAt3 = getChildAt(i12);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i12))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    e(canvas, a10 ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.H);
                }
                i12++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a10) {
                        i11 = childAt4.getLeft() - aVar2.leftMargin;
                        i10 = this.H;
                    } else {
                        i8 = childAt4.getRight() + aVar2.rightMargin;
                        e(canvas, i8);
                    }
                } else if (a10) {
                    i8 = getPaddingLeft();
                    e(canvas, i8);
                } else {
                    i11 = getWidth() - getPaddingRight();
                    i10 = this.H;
                }
                i8 = i11 - i10;
                e(canvas, i8);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f1090d
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00bb
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f1091e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.B
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.B
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d5
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b5
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b5
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.n0$a r4 = (androidx.appcompat.widget.n0.a) r4
            int r8 = r4.gravity
            if (r8 >= 0) goto L_0x0074
            r8 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, d2.d1> r17 = d2.i0.f7217a
            int r7 = d2.i0.e.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r8, r7)
            r7 = r7 & 7
            if (r7 == r9) goto L_0x008d
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0098
        L_0x0088:
            int r7 = r11 - r14
            int r8 = r4.rightMargin
            goto L_0x0097
        L_0x008d:
            int r7 = r10 - r14
            r8 = 2
            int r7 = r7 / r8
            int r7 = r7 + r1
            int r8 = r4.leftMargin
            int r7 = r7 + r8
            int r8 = r4.rightMargin
        L_0x0097:
            int r7 = r7 - r8
        L_0x0098:
            boolean r8 = r0.i(r3)
            if (r8 == 0) goto L_0x00a1
            int r8 = r0.I
            int r2 = r2 + r8
        L_0x00a1:
            int r8 = r4.topMargin
            int r2 = r2 + r8
            int r8 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r8
            r13.layout(r7, r8, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b5:
            int r3 = r3 + r9
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00bb:
            boolean r1 = androidx.appcompat.widget.q1.a(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r8 = r25.getPaddingBottom()
            int r5 = r5 - r8
            int r8 = r25.getVirtualChildCount()
            int r10 = r0.f1091e
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f1087a
            int[] r12 = r0.E
            int[] r13 = r0.F
            java.util.WeakHashMap<android.view.View, d2.d1> r14 = d2.i0.f7217a
            int r14 = d2.i0.e.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r9) goto L_0x0100
            r14 = 5
            if (r6 == r14) goto L_0x00f4
            int r6 = r25.getPaddingLeft()
            goto L_0x010c
        L_0x00f4:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.B
            int r6 = r6 - r14
            goto L_0x010c
        L_0x0100:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.B
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010c:
            if (r1 == 0) goto L_0x0112
            int r1 = r8 + -1
            r15 = -1
            goto L_0x0114
        L_0x0112:
            r15 = r9
            r1 = 0
        L_0x0114:
            r18 = r6
            r6 = 0
        L_0x0117:
            if (r6 >= r8) goto L_0x01d5
            int r19 = r15 * r6
            int r9 = r19 + r1
            android.view.View r2 = r0.getChildAt(r9)
            if (r2 != 0) goto L_0x012f
            int r18 = r18 + 0
        L_0x0125:
            r28 = r1
            r30 = r8
            r22 = r10
            r1 = 0
        L_0x012c:
            r2 = 1
            goto L_0x01c7
        L_0x012f:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0125
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.n0$a r14 = (androidx.appcompat.widget.n0.a) r14
            if (r11 == 0) goto L_0x0157
            r28 = r1
            int r1 = r14.height
            r30 = r8
            r8 = -1
            if (r1 == r8) goto L_0x015b
            int r8 = r2.getBaseline()
            goto L_0x015c
        L_0x0157:
            r28 = r1
            r30 = r8
        L_0x015b:
            r8 = -1
        L_0x015c:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x0161
            r1 = r10
        L_0x0161:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0199
            r10 = 48
            if (r1 == r10) goto L_0x018a
            r10 = 80
            if (r1 == r10) goto L_0x0174
            r1 = r4
            r10 = -1
            goto L_0x01a5
        L_0x0174:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r8 == r10) goto L_0x01a5
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r8
            r8 = 2
            r24 = r13[r8]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a5
        L_0x018a:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r8 == r10) goto L_0x01a5
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r8
            int r1 = r23 + r1
            goto L_0x01a5
        L_0x0199:
            r10 = -1
            int r1 = r5 - r21
            r8 = 2
            int r1 = r1 / r8
            int r1 = r1 + r4
            int r8 = r14.topMargin
            int r1 = r1 + r8
            int r8 = r14.bottomMargin
            int r1 = r1 - r8
        L_0x01a5:
            boolean r8 = r0.i(r9)
            if (r8 == 0) goto L_0x01af
            int r8 = r0.H
            int r18 = r18 + r8
        L_0x01af:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r3 + r18
            int r6 = r6 + 0
            goto L_0x012c
        L_0x01c7:
            int r6 = r6 + r2
            r1 = r28
            r8 = r30
            r9 = r2
            r10 = r22
            r2 = 80
            r3 = 16
            goto L_0x0117
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x07d8  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0840  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x084a  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f1090d
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0398
            r6.B = r5
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.f1088b
            boolean r9 = r6.D
            r24 = r4
            r13 = r5
            r17 = r13
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r23 = r21
            r25 = r23
            r22 = r15
        L_0x0039:
            if (r13 >= r3) goto L_0x017c
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0047
            int r4 = r6.B
            int r4 = r4 + r5
            r6.B = r4
            goto L_0x004f
        L_0x0047:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x005b
            int r13 = r13 + 0
        L_0x004f:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r12 = r18
            r27 = 1
            goto L_0x0165
        L_0x005b:
            boolean r4 = r6.i(r13)
            if (r4 == 0) goto L_0x0068
            int r4 = r6.B
            int r5 = r6.I
            int r4 = r4 + r5
            r6.B = r4
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.n0$a r5 = (androidx.appcompat.widget.n0.a) r5
            float r4 = r5.weight
            float r22 = r22 + r4
            if (r1 != r14) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            int r4 = r6.B
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r14 = r5.bottomMargin
            int r12 = r12 + r14
            int r4 = java.lang.Math.max(r4, r12)
            r6.B = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = r5
            r4 = 1
            r27 = 1
            goto L_0x00eb
        L_0x0097:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00a3
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a3
            r5.height = r10
            r12 = 0
            goto L_0x00a4
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            r4 = 0
            int r14 = (r22 > r15 ? 1 : (r22 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x00ac
            int r14 = r6.B
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            r10 = r0
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r27 = 1
            r4 = r40
            r15 = r5
            r5 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00c8
            r15.height = r12
        L_0x00c8:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.B
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.B = r1
            if (r9 == 0) goto L_0x00e7
            r5 = r19
            int r19 = java.lang.Math.max(r0, r5)
            goto L_0x00e9
        L_0x00e7:
            r5 = r19
        L_0x00e9:
            r4 = r23
        L_0x00eb:
            if (r10 < 0) goto L_0x00f5
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00f5
            int r0 = r6.B
            r6.f1089c = r0
        L_0x00f5:
            if (r13 >= r10) goto L_0x0107
            float r0 = r15.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0107:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0117
            int r1 = r15.width
            r2 = -1
            if (r1 != r2) goto L_0x0117
            r5 = r27
            r25 = r5
            goto L_0x0118
        L_0x0117:
            r5 = 0
        L_0x0118:
            int r1 = r15.leftMargin
            int r2 = r15.rightMargin
            int r1 = r1 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r1
            r3 = r21
            int r3 = java.lang.Math.max(r3, r2)
            int r12 = r26.getMeasuredState()
            r14 = r18
            int r12 = android.view.View.combineMeasuredStates(r14, r12)
            if (r24 == 0) goto L_0x013c
            int r14 = r15.width
            r11 = -1
            if (r14 != r11) goto L_0x013c
            r11 = r27
            goto L_0x013d
        L_0x013c:
            r11 = 0
        L_0x013d:
            float r14 = r15.weight
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x014f
            if (r5 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r1 = r2
        L_0x0148:
            r15 = r20
            int r20 = java.lang.Math.max(r15, r1)
            goto L_0x015d
        L_0x014f:
            r15 = r20
            if (r5 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r1 = r2
        L_0x0155:
            r2 = r17
            int r17 = java.lang.Math.max(r2, r1)
            r20 = r15
        L_0x015d:
            int r13 = r13 + 0
            r21 = r3
            r23 = r4
            r24 = r11
        L_0x0165:
            int r13 = r13 + 1
            r2 = r0
            r0 = r10
            r18 = r12
            r4 = r27
            r1 = r29
            r3 = r31
            r5 = 0
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            goto L_0x0039
        L_0x017c:
            r29 = r1
            r0 = r2
            r31 = r3
            r27 = r4
            r2 = r17
            r14 = r18
            r5 = r19
            r15 = r20
            r3 = r21
            int r1 = r6.B
            r10 = r31
            if (r1 <= 0) goto L_0x01a0
            boolean r1 = r6.i(r10)
            if (r1 == 0) goto L_0x01a0
            int r1 = r6.B
            int r4 = r6.I
            int r1 = r1 + r4
            r6.B = r1
        L_0x01a0:
            r1 = r29
            if (r9 == 0) goto L_0x01e6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x01aa
            if (r1 != 0) goto L_0x01e6
        L_0x01aa:
            r4 = 0
            r6.B = r4
            r11 = r4
        L_0x01ae:
            if (r11 >= r10) goto L_0x01e6
            android.view.View r12 = r6.getChildAt(r11)
            if (r12 != 0) goto L_0x01bc
            int r12 = r6.B
            int r12 = r12 + r4
            r6.B = r12
            goto L_0x01e2
        L_0x01bc:
            int r4 = r12.getVisibility()
            r13 = 8
            if (r4 != r13) goto L_0x01c7
            int r11 = r11 + 0
            goto L_0x01e2
        L_0x01c7:
            android.view.ViewGroup$LayoutParams r4 = r12.getLayoutParams()
            androidx.appcompat.widget.n0$a r4 = (androidx.appcompat.widget.n0.a) r4
            int r12 = r6.B
            int r19 = r12 + r5
            int r13 = r4.topMargin
            int r19 = r19 + r13
            int r4 = r4.bottomMargin
            int r19 = r19 + r4
            r4 = 0
            int r13 = r19 + 0
            int r4 = java.lang.Math.max(r12, r13)
            r6.B = r4
        L_0x01e2:
            int r11 = r11 + 1
            r4 = 0
            goto L_0x01ae
        L_0x01e6:
            int r4 = r6.B
            int r11 = r38.getPaddingTop()
            int r12 = r38.getPaddingBottom()
            int r12 = r12 + r11
            int r12 = r12 + r4
            r6.B = r12
            int r4 = r38.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r12, r4)
            r11 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r8, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r4
            int r12 = r6.B
            int r11 = r11 - r12
            if (r23 != 0) goto L_0x0253
            if (r11 == 0) goto L_0x0212
            r12 = 0
            int r13 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x0212
            goto L_0x0253
        L_0x0212:
            int r2 = java.lang.Math.max(r2, r15)
            if (r9 == 0) goto L_0x024f
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 == r9) goto L_0x024f
            r1 = 0
        L_0x021d:
            if (r1 >= r10) goto L_0x024f
            android.view.View r9 = r6.getChildAt(r1)
            if (r9 == 0) goto L_0x024c
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x022e
            goto L_0x024c
        L_0x022e:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.n0$a r11 = (androidx.appcompat.widget.n0.a) r11
            float r11 = r11.weight
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x024c
            int r11 = r9.getMeasuredWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            r9.measure(r11, r13)
        L_0x024c:
            int r1 = r1 + 1
            goto L_0x021d
        L_0x024f:
            r21 = r3
            goto L_0x0338
        L_0x0253:
            float r5 = r6.C
            r9 = 0
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x025c
            r22 = r5
        L_0x025c:
            r5 = 0
            r6.B = r5
            r5 = 0
        L_0x0260:
            if (r5 >= r10) goto L_0x0328
            android.view.View r9 = r6.getChildAt(r5)
            int r12 = r9.getVisibility()
            r13 = 8
            if (r12 != r13) goto L_0x0272
            r29 = r1
            goto L_0x0322
        L_0x0272:
            android.view.ViewGroup$LayoutParams r12 = r9.getLayoutParams()
            androidx.appcompat.widget.n0$a r12 = (androidx.appcompat.widget.n0.a) r12
            float r13 = r12.weight
            r15 = 0
            int r16 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02d4
            float r15 = (float) r11
            float r15 = r15 * r13
            float r15 = r15 / r22
            int r15 = (int) r15
            float r22 = r22 - r13
            int r11 = r11 - r15
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r12.leftMargin
            int r16 = r16 + r13
            int r13 = r12.rightMargin
            int r13 = r16 + r13
            r16 = r11
            int r11 = r12.width
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r11)
            int r13 = r12.height
            if (r13 != 0) goto L_0x02b6
            r13 = 1073741824(0x40000000, float:2.0)
            if (r1 == r13) goto L_0x02aa
            goto L_0x02b8
        L_0x02aa:
            if (r15 <= 0) goto L_0x02ad
            goto L_0x02ae
        L_0x02ad:
            r15 = 0
        L_0x02ae:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r13)
            r9.measure(r11, r15)
            goto L_0x02c8
        L_0x02b6:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02b8:
            int r17 = r9.getMeasuredHeight()
            int r15 = r17 + r15
            if (r15 >= 0) goto L_0x02c1
            r15 = 0
        L_0x02c1:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r13)
            r9.measure(r11, r15)
        L_0x02c8:
            int r11 = r9.getMeasuredState()
            r11 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r14 = android.view.View.combineMeasuredStates(r14, r11)
            r11 = r16
        L_0x02d4:
            int r13 = r12.leftMargin
            int r15 = r12.rightMargin
            int r13 = r13 + r15
            int r15 = r9.getMeasuredWidth()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x02f2
            int r1 = r12.width
            r16 = r3
            r3 = -1
            if (r1 != r3) goto L_0x02f5
            r1 = r27
            goto L_0x02f6
        L_0x02f2:
            r16 = r3
            r3 = -1
        L_0x02f5:
            r1 = 0
        L_0x02f6:
            if (r1 == 0) goto L_0x02f9
            goto L_0x02fa
        L_0x02f9:
            r13 = r15
        L_0x02fa:
            int r1 = java.lang.Math.max(r2, r13)
            if (r24 == 0) goto L_0x0307
            int r2 = r12.width
            if (r2 != r3) goto L_0x0307
            r2 = r27
            goto L_0x0308
        L_0x0307:
            r2 = 0
        L_0x0308:
            int r3 = r6.B
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r3
            int r13 = r12.topMargin
            int r9 = r9 + r13
            int r12 = r12.bottomMargin
            int r9 = r9 + r12
            r12 = 0
            int r9 = r9 + r12
            int r3 = java.lang.Math.max(r3, r9)
            r6.B = r3
            r24 = r2
            r3 = r16
            r2 = r1
        L_0x0322:
            int r5 = r5 + 1
            r1 = r29
            goto L_0x0260
        L_0x0328:
            int r1 = r6.B
            int r5 = r38.getPaddingTop()
            int r9 = r38.getPaddingBottom()
            int r9 = r9 + r5
            int r9 = r9 + r1
            r6.B = r9
            goto L_0x024f
        L_0x0338:
            if (r24 != 0) goto L_0x033f
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x033f
            goto L_0x0341
        L_0x033f:
            r2 = r21
        L_0x0341:
            int r0 = r38.getPaddingLeft()
            int r1 = r38.getPaddingRight()
            int r1 = r1 + r0
            int r1 = r1 + r2
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r14)
            r6.setMeasuredDimension(r0, r4)
            if (r25 == 0) goto L_0x08e1
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0367:
            if (r9 >= r10) goto L_0x08e1
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0395
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.n0$a r11 = (androidx.appcompat.widget.n0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0395
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0395:
            int r9 = r9 + 1
            goto L_0x0367
        L_0x0398:
            r27 = r4
            r0 = r5
            r6.B = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.E
            r12 = 4
            if (r0 == 0) goto L_0x03b2
            int[] r0 = r6.F
            if (r0 != 0) goto L_0x03ba
        L_0x03b2:
            int[] r0 = new int[r12]
            r6.E = r0
            int[] r0 = new int[r12]
            r6.F = r0
        L_0x03ba:
            int[] r13 = r6.E
            int[] r14 = r6.F
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f1087a
            boolean r4 = r6.D
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03de
            r19 = r27
            goto L_0x03e0
        L_0x03de:
            r19 = 0
        L_0x03e0:
            r20 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 0
            r32 = 0
        L_0x03ee:
            if (r3 >= r9) goto L_0x059d
            android.view.View r8 = r6.getChildAt(r3)
            if (r8 != 0) goto L_0x0403
            int r8 = r6.B
            r25 = 0
            int r8 = r8 + 0
            r6.B = r8
            r25 = r0
            r26 = r2
            goto L_0x0411
        L_0x0403:
            r25 = r0
            int r0 = r8.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x041b
            int r3 = r3 + 0
        L_0x0411:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0593
        L_0x041b:
            boolean r0 = r6.i(r3)
            if (r0 == 0) goto L_0x0428
            int r0 = r6.B
            int r2 = r6.H
            int r0 = r0 + r2
            r6.B = r0
        L_0x0428:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.n0$a r2 = (androidx.appcompat.widget.n0.a) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0487
            int r1 = r2.width
            if (r1 != 0) goto L_0x0487
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x0487
            if (r19 == 0) goto L_0x044f
            int r0 = r6.B
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.B = r1
            goto L_0x045f
        L_0x044f:
            r30 = r3
            int r0 = r6.B
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.B = r0
        L_0x045f:
            if (r5 == 0) goto L_0x0476
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r34 = r25
            r35 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04fe
        L_0x0476:
            r1 = r2
            r34 = r25
            r35 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r4 = r27
            goto L_0x0502
        L_0x0487:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x0497
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0498
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x049a
        L_0x0497:
            r1 = 0
        L_0x0498:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x049a:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04a3
            int r0 = r6.B
            r31 = r0
            goto L_0x04a5
        L_0x04a3:
            r31 = 0
        L_0x04a5:
            r33 = 0
            r1 = r25
            r0 = r38
            r34 = r1
            r1 = r8
            r36 = r2
            r35 = r26
            r2 = r39
            r37 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r33
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r37
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04d0
            r1 = r36
            r1.width = r0
            goto L_0x04d2
        L_0x04d0:
            r1 = r36
        L_0x04d2:
            int r0 = r8.getMeasuredWidth()
            if (r19 == 0) goto L_0x04e6
            int r2 = r6.B
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.B = r3
            goto L_0x04f8
        L_0x04e6:
            r4 = 0
            int r2 = r6.B
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.B = r2
        L_0x04f8:
            if (r26 == 0) goto L_0x04fe
            int r12 = java.lang.Math.max(r0, r12)
        L_0x04fe:
            r4 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0502:
            if (r11 == r0) goto L_0x050e
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x050e
            r5 = r27
            r23 = r5
            goto L_0x050f
        L_0x050e:
            r5 = 0
        L_0x050f:
            int r0 = r1.topMargin
            int r2 = r1.bottomMargin
            int r0 = r0 + r2
            int r2 = r8.getMeasuredHeight()
            int r2 = r2 + r0
            int r3 = r8.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r15, r3)
            if (r30 == 0) goto L_0x0551
            int r8 = r8.getBaseline()
            r15 = -1
            if (r8 == r15) goto L_0x0551
            int r15 = r1.gravity
            if (r15 >= 0) goto L_0x0530
            int r15 = r6.f1091e
        L_0x0530:
            r15 = r15 & 112(0x70, float:1.57E-43)
            r22 = 4
            int r15 = r15 >> 4
            r22 = -2
            r15 = r15 & -2
            int r15 = r15 >> 1
            r22 = r0
            r0 = r13[r15]
            int r0 = java.lang.Math.max(r0, r8)
            r13[r15] = r0
            r0 = r14[r15]
            int r8 = r2 - r8
            int r0 = java.lang.Math.max(r0, r8)
            r14[r15] = r0
            goto L_0x0553
        L_0x0551:
            r22 = r0
        L_0x0553:
            r0 = r32
            int r0 = java.lang.Math.max(r0, r2)
            if (r20 == 0) goto L_0x0563
            int r8 = r1.height
            r15 = -1
            if (r8 != r15) goto L_0x0563
            r8 = r27
            goto L_0x0564
        L_0x0563:
            r8 = 0
        L_0x0564:
            float r1 = r1.weight
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0579
            if (r5 == 0) goto L_0x056f
            r2 = r22
        L_0x056f:
            r1 = r35
            int r2 = java.lang.Math.max(r1, r2)
            r1 = r2
            r2 = r34
            goto L_0x0585
        L_0x0579:
            r1 = r35
            if (r5 == 0) goto L_0x057f
            r2 = r22
        L_0x057f:
            r5 = r34
            int r2 = java.lang.Math.max(r5, r2)
        L_0x0585:
            int r5 = r25 + 0
            r32 = r0
            r0 = r2
            r15 = r3
            r22 = r4
            r3 = r5
            r20 = r8
            r2 = r1
            r1 = r29
        L_0x0593:
            int r3 = r3 + 1
            r8 = r40
            r4 = r26
            r5 = r30
            goto L_0x03ee
        L_0x059d:
            r26 = r4
            r30 = r5
            r5 = r0
            r0 = r32
            int r3 = r6.B
            if (r3 <= 0) goto L_0x05b5
            boolean r3 = r6.i(r9)
            if (r3 == 0) goto L_0x05b5
            int r3 = r6.B
            int r4 = r6.H
            int r3 = r3 + r4
            r6.B = r3
        L_0x05b5:
            r3 = r13[r27]
            r4 = -1
            r25 = r15
            if (r3 != r4) goto L_0x05d0
            r8 = 0
            r15 = r13[r8]
            if (r15 != r4) goto L_0x05d0
            r8 = r13[r17]
            if (r8 != r4) goto L_0x05d0
            r8 = 3
            r15 = r13[r8]
            if (r15 == r4) goto L_0x05cb
            goto L_0x05d1
        L_0x05cb:
            r32 = r0
            r29 = r11
            goto L_0x0601
        L_0x05d0:
            r8 = 3
        L_0x05d1:
            r4 = r13[r8]
            r15 = 0
            r8 = r13[r15]
            r15 = r13[r17]
            int r3 = java.lang.Math.max(r3, r15)
            int r3 = java.lang.Math.max(r8, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r8 = r14[r4]
            r4 = 0
            r15 = r14[r4]
            r4 = r14[r27]
            r29 = r11
            r11 = r14[r17]
            int r4 = java.lang.Math.max(r4, r11)
            int r4 = java.lang.Math.max(r15, r4)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = r4 + r3
            int r32 = java.lang.Math.max(r0, r4)
        L_0x0601:
            if (r26 == 0) goto L_0x0652
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0609
            if (r10 != 0) goto L_0x0652
        L_0x0609:
            r0 = 0
            r6.B = r0
            r3 = r0
        L_0x060d:
            if (r3 >= r9) goto L_0x0652
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L_0x061b
            int r4 = r6.B
            int r4 = r4 + r0
            r6.B = r4
            goto L_0x064e
        L_0x061b:
            int r0 = r4.getVisibility()
            r8 = 8
            if (r0 != r8) goto L_0x0626
            int r3 = r3 + 0
            goto L_0x064e
        L_0x0626:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.appcompat.widget.n0$a r0 = (androidx.appcompat.widget.n0.a) r0
            if (r19 == 0) goto L_0x063c
            int r4 = r6.B
            int r8 = r0.leftMargin
            int r8 = r8 + r12
            int r0 = r0.rightMargin
            int r8 = r8 + r0
            r11 = 0
            int r8 = r8 + r11
            int r8 = r8 + r4
            r6.B = r8
            goto L_0x064e
        L_0x063c:
            r11 = 0
            int r4 = r6.B
            int r8 = r4 + r12
            int r15 = r0.leftMargin
            int r8 = r8 + r15
            int r0 = r0.rightMargin
            int r8 = r8 + r0
            int r8 = r8 + r11
            int r0 = java.lang.Math.max(r4, r8)
            r6.B = r0
        L_0x064e:
            int r3 = r3 + 1
            r0 = 0
            goto L_0x060d
        L_0x0652:
            int r0 = r6.B
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r0
            r6.B = r4
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            r3 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            int r4 = r6.B
            int r3 = r3 - r4
            if (r22 != 0) goto L_0x06c4
            if (r3 == 0) goto L_0x067e
            r8 = 0
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x067e
            goto L_0x06c4
        L_0x067e:
            int r1 = java.lang.Math.max(r5, r2)
            if (r26 == 0) goto L_0x06bb
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x06bb
            r5 = 0
        L_0x0689:
            if (r5 >= r9) goto L_0x06bb
            android.view.View r2 = r6.getChildAt(r5)
            if (r2 == 0) goto L_0x06b8
            int r3 = r2.getVisibility()
            r8 = 8
            if (r3 != r8) goto L_0x069a
            goto L_0x06b8
        L_0x069a:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.n0$a r3 = (androidx.appcompat.widget.n0.a) r3
            float r3 = r3.weight
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x06b8
            r3 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r3)
            int r10 = r2.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r3)
            r2.measure(r8, r10)
        L_0x06b8:
            int r5 = r5 + 1
            goto L_0x0689
        L_0x06bb:
            r3 = r40
            r15 = r25
            r12 = r29
            r8 = 0
            goto L_0x087a
        L_0x06c4:
            float r2 = r6.C
            r8 = 0
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x06cc
            r1 = r2
        L_0x06cc:
            r2 = -1
            r8 = 3
            r13[r8] = r2
            r13[r17] = r2
            r13[r27] = r2
            r11 = 0
            r13[r11] = r2
            r14[r8] = r2
            r14[r17] = r2
            r14[r27] = r2
            r14[r11] = r2
            r6.B = r11
            r15 = r25
            r2 = -1
            r8 = 0
        L_0x06e5:
            if (r8 >= r9) goto L_0x0820
            android.view.View r11 = r6.getChildAt(r8)
            if (r11 == 0) goto L_0x0808
            int r12 = r11.getVisibility()
            r4 = 8
            if (r12 != r4) goto L_0x06f7
            goto L_0x0808
        L_0x06f7:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.appcompat.widget.n0$a r4 = (androidx.appcompat.widget.n0.a) r4
            float r12 = r4.weight
            r18 = 0
            int r22 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r22 <= 0) goto L_0x0760
            float r7 = (float) r3
            float r7 = r7 * r12
            float r7 = r7 / r1
            int r7 = (int) r7
            float r1 = r1 - r12
            int r3 = r3 - r7
            int r12 = r38.getPaddingTop()
            int r22 = r38.getPaddingBottom()
            int r22 = r22 + r12
            int r12 = r4.topMargin
            int r22 = r22 + r12
            int r12 = r4.bottomMargin
            int r12 = r22 + r12
            r22 = r1
            int r1 = r4.height
            r25 = r3
            r3 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r3, r12, r1)
            int r12 = r4.width
            if (r12 != 0) goto L_0x073e
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x0732
            goto L_0x0740
        L_0x0732:
            if (r7 <= 0) goto L_0x0735
            goto L_0x0736
        L_0x0735:
            r7 = 0
        L_0x0736:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
            goto L_0x0750
        L_0x073e:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0740:
            int r26 = r11.getMeasuredWidth()
            int r7 = r26 + r7
            if (r7 >= 0) goto L_0x0749
            r7 = 0
        L_0x0749:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
        L_0x0750:
            int r1 = r11.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r15 = android.view.View.combineMeasuredStates(r15, r1)
            r1 = r22
            r7 = r25
            goto L_0x0763
        L_0x0760:
            r7 = r3
            r3 = r40
        L_0x0763:
            if (r19 == 0) goto L_0x077f
            int r12 = r6.B
            int r22 = r11.getMeasuredWidth()
            r25 = r1
            int r1 = r4.leftMargin
            int r22 = r22 + r1
            int r1 = r4.rightMargin
            int r22 = r22 + r1
            r1 = 0
            int r22 = r22 + 0
            int r12 = r22 + r12
            r6.B = r12
            r26 = r7
            goto L_0x079d
        L_0x077f:
            r25 = r1
            r1 = 0
            int r12 = r6.B
            int r22 = r11.getMeasuredWidth()
            int r22 = r22 + r12
            int r1 = r4.leftMargin
            int r22 = r22 + r1
            int r1 = r4.rightMargin
            int r22 = r22 + r1
            r26 = r7
            r1 = 0
            int r7 = r22 + 0
            int r1 = java.lang.Math.max(r12, r7)
            r6.B = r1
        L_0x079d:
            r12 = r29
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x07ab
            int r1 = r4.height
            r7 = -1
            if (r1 != r7) goto L_0x07ab
            r1 = r27
            goto L_0x07ac
        L_0x07ab:
            r1 = 0
        L_0x07ac:
            int r7 = r4.topMargin
            r22 = r10
            int r10 = r4.bottomMargin
            int r7 = r7 + r10
            int r10 = r11.getMeasuredHeight()
            int r10 = r10 + r7
            int r2 = java.lang.Math.max(r2, r10)
            if (r1 == 0) goto L_0x07bf
            goto L_0x07c0
        L_0x07bf:
            r7 = r10
        L_0x07c0:
            int r1 = java.lang.Math.max(r5, r7)
            if (r20 == 0) goto L_0x07ce
            int r5 = r4.height
            r7 = -1
            if (r5 != r7) goto L_0x07cf
            r5 = r27
            goto L_0x07d0
        L_0x07ce:
            r7 = -1
        L_0x07cf:
            r5 = 0
        L_0x07d0:
            if (r30 == 0) goto L_0x07fc
            int r11 = r11.getBaseline()
            if (r11 == r7) goto L_0x07fc
            int r4 = r4.gravity
            if (r4 >= 0) goto L_0x07de
            int r4 = r6.f1091e
        L_0x07de:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r4 = r4 >> 4
            r28 = -2
            r4 = r4 & -2
            int r4 = r4 >> 1
            r7 = r13[r4]
            int r7 = java.lang.Math.max(r7, r11)
            r13[r4] = r7
            r7 = r14[r4]
            int r10 = r10 - r11
            int r7 = java.lang.Math.max(r7, r10)
            r14[r4] = r7
            goto L_0x0800
        L_0x07fc:
            r24 = 4
            r28 = -2
        L_0x0800:
            r20 = r5
            r7 = r26
            r5 = r1
            r1 = r25
            goto L_0x0815
        L_0x0808:
            r7 = r3
            r22 = r10
            r12 = r29
            r18 = 0
            r24 = 4
            r28 = -2
            r3 = r40
        L_0x0815:
            int r8 = r8 + 1
            r3 = r7
            r29 = r12
            r10 = r22
            r7 = r39
            goto L_0x06e5
        L_0x0820:
            r3 = r40
            r12 = r29
            int r1 = r6.B
            int r4 = r38.getPaddingLeft()
            int r7 = r38.getPaddingRight()
            int r7 = r7 + r4
            int r7 = r7 + r1
            r6.B = r7
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x084a
            r7 = 0
            r8 = r13[r7]
            if (r8 != r4) goto L_0x084a
            r7 = r13[r17]
            if (r7 != r4) goto L_0x084a
            r7 = 3
            r8 = r13[r7]
            if (r8 == r4) goto L_0x0846
            goto L_0x084b
        L_0x0846:
            r32 = r2
            r8 = 0
            goto L_0x0879
        L_0x084a:
            r7 = 3
        L_0x084b:
            r4 = r13[r7]
            r8 = 0
            r10 = r13[r8]
            r11 = r13[r17]
            int r1 = java.lang.Math.max(r1, r11)
            int r1 = java.lang.Math.max(r10, r1)
            int r1 = java.lang.Math.max(r4, r1)
            r4 = r14[r7]
            r7 = r14[r8]
            r10 = r14[r27]
            r11 = r14[r17]
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = java.lang.Math.max(r7, r10)
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = r4 + r1
            int r1 = java.lang.Math.max(r2, r4)
            r32 = r1
        L_0x0879:
            r1 = r5
        L_0x087a:
            if (r20 != 0) goto L_0x0881
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0881
            goto L_0x0883
        L_0x0881:
            r1 = r32
        L_0x0883:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r4 = r4 + r2
            int r4 = r4 + r1
            int r1 = r38.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r4, r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r15
            r0 = r0 | r2
            int r2 = r15 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r6.setMeasuredDimension(r0, r1)
            if (r23 == 0) goto L_0x08e1
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x08ae:
            if (r8 >= r9) goto L_0x08e1
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08dd
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.n0$a r11 = (androidx.appcompat.widget.n0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08de
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08de
        L_0x08dd:
            r12 = -1
        L_0x08de:
            int r8 = r8 + 1
            goto L_0x08ae
        L_0x08e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1087a = z10;
    }

    public void setBaselineAlignedChildIndex(int i8) {
        if (i8 < 0 || i8 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1088b = i8;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.G) {
            this.G = drawable;
            boolean z10 = false;
            if (drawable != null) {
                this.H = drawable.getIntrinsicWidth();
                this.I = drawable.getIntrinsicHeight();
            } else {
                this.H = 0;
                this.I = 0;
            }
            if (drawable == null) {
                z10 = true;
            }
            setWillNotDraw(z10);
            requestLayout();
        }
    }

    public void setDividerPadding(int i8) {
        this.K = i8;
    }

    public void setGravity(int i8) {
        if (this.f1091e != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f1091e = i8;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i8) {
        int i10 = i8 & 8388615;
        int i11 = this.f1091e;
        if ((8388615 & i11) != i10) {
            this.f1091e = i10 | (-8388616 & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.D = z10;
    }

    public void setOrientation(int i8) {
        if (this.f1090d != i8) {
            this.f1090d = i8;
            requestLayout();
        }
    }

    public void setShowDividers(int i8) {
        if (i8 != this.J) {
            requestLayout();
        }
        this.J = i8;
    }

    public void setVerticalGravity(int i8) {
        int i10 = i8 & 112;
        int i11 = this.f1091e;
        if ((i11 & 112) != i10) {
            this.f1091e = i10 | (i11 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.C = Math.max(0.0f, f10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public n0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Drawable drawable;
        int resourceId;
        this.f1087a = true;
        this.f1088b = -1;
        this.f1089c = 0;
        this.f1091e = 8388659;
        int[] iArr = e.K;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, 0);
        i0.m(this, context, iArr, attributeSet, obtainStyledAttributes, i8);
        int i10 = obtainStyledAttributes.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = obtainStyledAttributes.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.C = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1088b = obtainStyledAttributes.getInt(3, -1);
        this.D = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = f.a.a(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.J = obtainStyledAttributes.getInt(8, 0);
        this.K = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}
