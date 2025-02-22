package e8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.List;
import m8.e;

public final class c extends e {
    public int B;

    /* renamed from: e  reason: collision with root package name */
    public int f7872e;

    public class a implements d {
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b() {
            super(-2, -2);
        }
    }

    @Deprecated
    /* renamed from: e8.c$c  reason: collision with other inner class name */
    public interface C0128c {
    }

    public interface d {
    }

    private int getVisibleChipCount() {
        int i8 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof Chip) {
                if (getChildAt(i10).getVisibility() == 0) {
                    i8++;
                }
            }
        }
        return i8;
    }

    public final boolean a() {
        return this.f11258c;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f7872e;
    }

    public int getChipSpacingVertical() {
        return this.B;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f11258c) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(int i8) {
        setChipSpacingHorizontal(i8);
        setChipSpacingVertical(i8);
    }

    public void setChipSpacingHorizontal(int i8) {
        if (this.f7872e != i8) {
            this.f7872e = i8;
            setItemSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i8) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingResource(int i8) {
        setChipSpacing(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingVertical(int i8) {
        if (this.B != i8) {
            this.B = i8;
            setLineSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i8) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i8));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i8) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(C0128c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((d) null);
        } else {
            setOnCheckedStateChangeListener(new a());
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z10) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        throw null;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setSingleLine(int i8) {
        setSingleLine(getResources().getBoolean(i8));
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }
}
