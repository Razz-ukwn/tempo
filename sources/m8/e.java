package m8;

import android.view.View;
import android.view.ViewGroup;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.p;
import java.util.WeakHashMap;

public class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f11256a;

    /* renamed from: b  reason: collision with root package name */
    public int f11257b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11258c;

    /* renamed from: d  reason: collision with root package name */
    public int f11259d;

    public boolean a() {
        return this.f11258c;
    }

    public int getItemSpacing() {
        return this.f11257b;
    }

    public int getLineSpacing() {
        return this.f11256a;
    }

    public int getRowCount() {
        return this.f11259d;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (getChildCount() == 0) {
            this.f11259d = 0;
            return;
        }
        this.f11259d = 1;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z11 = i0.e.d(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = (i11 - i8) - paddingLeft;
        int i16 = paddingRight;
        int i17 = paddingTop;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = p.c(marginLayoutParams);
                    i14 = p.b(marginLayoutParams);
                } else {
                    i14 = 0;
                    i13 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i13;
                if (!this.f11258c && measuredWidth > i15) {
                    i17 = this.f11256a + paddingTop;
                    this.f11259d++;
                    i16 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f11259d - 1));
                int i19 = i16 + i13;
                int measuredWidth2 = childAt.getMeasuredWidth() + i19;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z11) {
                    childAt.layout(i15 - measuredWidth2, i17, (i15 - i16) - i13, measuredHeight);
                } else {
                    childAt.layout(i19, i17, measuredWidth2, measuredHeight);
                }
                i16 += childAt.getMeasuredWidth() + i13 + i14 + this.f11257b;
                paddingTop = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i10;
            } else {
                measureChild(childAt, i8, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i12 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f11256a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i12 + i13 + this.f11257b + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i11 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i11 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i11) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i8) {
        this.f11257b = i8;
    }

    public void setLineSpacing(int i8) {
        this.f11256a = i8;
    }

    public void setSingleLine(boolean z10) {
        this.f11258c = z10;
    }
}
