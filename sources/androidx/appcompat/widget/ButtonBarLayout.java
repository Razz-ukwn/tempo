package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f823a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f824b;

    /* renamed from: c  reason: collision with root package name */
    public int f825c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = e.H;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        i0.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f823a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f823a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f824b == z10) {
            return;
        }
        if (!z10 || this.f823a) {
            this.f824b = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i8);
        int i14 = 0;
        if (this.f823a) {
            if (size > this.f825c && this.f824b) {
                setStacked(false);
            }
            this.f825c = size;
        }
        if (this.f824b || View.MeasureSpec.getMode(i8) != 1073741824) {
            i11 = i8;
            z10 = false;
        } else {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i11, i10);
        if (this.f823a && !this.f824b) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i8, i10);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i12 = -1;
            if (i15 >= childCount) {
                i15 = -1;
                break;
            } else if (getChildAt(i15).getVisibility() == 0) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f824b) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    } else if (getChildAt(i16).getVisibility() == 0) {
                        i12 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i12 >= 0) {
                    i13 = getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i13 = getPaddingBottom();
            }
            i14 += i13;
        }
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.d.d(this) != i14) {
            setMinimumHeight(i14);
            if (i10 == 0) {
                super.onMeasure(i8, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f823a != z10) {
            this.f823a = z10;
            if (!z10 && this.f824b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
