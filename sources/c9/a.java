package c9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.quickkonnect.silencio.R;
import h.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3870a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3871b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i8, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3871b, i8, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z10 = (context instanceof c) && ((c) context).f9007a == resourceId;
        if (resourceId == 0 || z10) {
            return context;
        }
        c cVar = new c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3870a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
