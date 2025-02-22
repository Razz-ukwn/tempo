package droidninja.filepicker.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import sf.j;

public final class SquareRelativeLayout extends RelativeLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SquareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i8);
    }
}
