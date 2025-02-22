package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.b;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.HashMap;
import java.util.WeakHashMap;
import v7.g;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f6263i;

    public FabTransformationSheetBehavior() {
    }

    public final void s(View view, View view2, boolean z10, boolean z11) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f6263i = new HashMap(childCount);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1716a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    if (!z10) {
                        HashMap hashMap = this.f6263i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f6263i.get(childAt)).intValue();
                            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                            i0.d.s(childAt, intValue);
                        }
                    } else {
                        this.f6263i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                        i0.d.s(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f6263i = null;
            }
        }
        super.s(view, view2, z10, z11);
    }

    public final FabTransformationBehavior.b z(Context context, boolean z10) {
        int i8 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f6257a = g.a(context, i8);
        bVar.f6258b = new b();
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
