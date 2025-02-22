package b9;

import ag.n2;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.d0;
import com.quickkonnect.silencio.R;
import r8.b;
import r8.c;

public final class a extends d0 {
    public a(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z10 = true;
        if (b.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = n2.Y;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int[] iArr2 = {1, 2};
            int i8 = -1;
            for (int i10 = 0; i10 < 2 && i8 < 0; i10++) {
                i8 = c.c(context2, obtainStyledAttributes, iArr2[i10], -1);
            }
            obtainStyledAttributes.recycle();
            if (!(i8 == -1 ? false : z10)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public final void l(int i8, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i8, n2.X);
        Context context = getContext();
        int[] iArr = {1, 2};
        int i10 = -1;
        for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
            i10 = c.c(context, obtainStyledAttributes, iArr[i11], -1);
        }
        obtainStyledAttributes.recycle();
        if (i10 >= 0) {
            setLineHeight(i10);
        }
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        if (b.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            l(i8, context.getTheme());
        }
    }
}
