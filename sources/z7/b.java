package z7;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o8.d;

public final class b extends d {

    /* renamed from: e0  reason: collision with root package name */
    public final int f17780e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f17781f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f17782g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f17783h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f17784i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f17785j0 = new ArrayList();

    public b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f17780e0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f17781f0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f17782g0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f17783h0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    public final a e(Context context) {
        return new a(context);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i8;
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (i0.e.d(this) == 1) {
                    int i17 = i13 - i15;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i14);
                } else {
                    childAt.layout(i15, 0, childAt.getMeasuredWidth() + i15, i14);
                }
                i15 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        int i12;
        f menu = getMenu();
        int size = View.MeasureSpec.getSize(i8);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f17785j0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i13 = 1;
        boolean z10 = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i14 = this.f17782g0;
        if (!z10 || !this.f17784i0) {
            if (size2 != 0) {
                i13 = size2;
            }
            int min = Math.min(size / i13, i14);
            int i15 = size - (size2 * min);
            for (int i16 = 0; i16 < childCount; i16++) {
                if (getChildAt(i16).getVisibility() == 8) {
                    i11 = 0;
                } else if (i15 > 0) {
                    i11 = min + 1;
                    i15--;
                } else {
                    i11 = min;
                }
                arrayList.add(Integer.valueOf(i11));
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i17 = this.f17783h0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), makeMeasureSpec);
                i17 = Math.max(i17, childAt.getMeasuredWidth());
            }
            int i18 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f17781f0 * i18), Math.min(i17, i14));
            int i19 = size - min2;
            if (i18 != 0) {
                i13 = i18;
            }
            int min3 = Math.min(i19 / i13, this.f17780e0);
            int i20 = i19 - (i18 * min3);
            int i21 = 0;
            while (i21 < childCount) {
                if (getChildAt(i21).getVisibility() != 8) {
                    i12 = i21 == getSelectedItemPosition() ? min2 : min3;
                    if (i20 > 0) {
                        i12++;
                        i20--;
                    }
                } else {
                    i12 = 0;
                }
                arrayList.add(Integer.valueOf(i12));
                i21++;
            }
        }
        int i22 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i23)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i22 = childAt2.getMeasuredWidth() + i22;
            }
        }
        setMeasuredDimension(i22, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f17784i0 = z10;
    }
}
