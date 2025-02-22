package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.n0;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public class AlertDialogLayout extends n0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int d10 = i0.d.d(view);
        if (d10 > 0) {
            return d10;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = r0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00b1
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00ae
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ae
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.n0$a r6 = (androidx.appcompat.widget.n0.a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            java.util.WeakHashMap<android.view.View, d2.d1> r8 = d2.i0.f7217a
            int r8 = d2.i0.e.d(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008e
            r8 = 5
            if (r7 == r8) goto L_0x0089
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0099
        L_0x0089:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L_0x0098
        L_0x008e:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L_0x0098:
            int r7 = r7 - r8
        L_0x0099:
            boolean r8 = r9.i(r0)
            if (r8 == 0) goto L_0x00a0
            int r12 = r12 + r14
        L_0x00a0:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        L_0x00ae:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i8;
        int childCount = getChildCount();
        View view = null;
        boolean z10 = false;
        View view2 = null;
        View view3 = null;
        int i16 = 0;
        while (true) {
            if (i16 < childCount) {
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() != 8) {
                    int id2 = childAt.getId();
                    if (id2 == R.id.topPanel) {
                        view = childAt;
                    } else if (id2 == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id2 == R.id.contentPanel || id2 == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i16++;
            } else {
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                int mode2 = View.MeasureSpec.getMode(i8);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i15, 0);
                    paddingBottom += view.getMeasuredHeight();
                    i11 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i11 = 0;
                }
                if (view2 != null) {
                    view2.measure(i15, 0);
                    i13 = j(view2);
                    i12 = view2.getMeasuredHeight() - i13;
                    paddingBottom += i13;
                    i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                if (view3 != null) {
                    view3.measure(i15, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    i14 = view3.getMeasuredHeight();
                    paddingBottom += i14;
                    i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
                } else {
                    i14 = 0;
                }
                int i17 = size - paddingBottom;
                if (view2 != null) {
                    int i18 = paddingBottom - i13;
                    int min = Math.min(i17, i12);
                    if (min > 0) {
                        i17 -= min;
                        i13 += min;
                    }
                    view2.measure(i15, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                    paddingBottom = i18 + view2.getMeasuredHeight();
                    i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
                }
                if (view3 != null && i17 > 0) {
                    view3.measure(i15, View.MeasureSpec.makeMeasureSpec(i14 + i17, mode));
                    paddingBottom = (paddingBottom - i14) + view3.getMeasuredHeight();
                    i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
                }
                int i19 = 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt2 = getChildAt(i20);
                    if (childAt2.getVisibility() != 8) {
                        i19 = Math.max(i19, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i19, i15, i11), View.resolveSizeAndState(paddingBottom, i10, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i21 = 0; i21 < childCount; i21++) {
                        View childAt3 = getChildAt(i21);
                        if (childAt3.getVisibility() != 8) {
                            n0.a aVar = (n0.a) childAt3.getLayoutParams();
                            if (aVar.width == -1) {
                                int i22 = aVar.height;
                                aVar.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i10, 0);
                                aVar.height = i22;
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        int i23 = i10;
        if (!z10) {
            super.onMeasure(i8, i10);
        }
    }
}
