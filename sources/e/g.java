package e;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.q1;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.z;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t1.a;

public final class g implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f7678a;

    public g(f fVar) {
        this.f7678a = fVar;
    }

    public final j1 a(View view, j1 j1Var) {
        boolean z10;
        View view2;
        j1 j1Var2;
        boolean z11;
        int i8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        int d10 = j1Var.d();
        f fVar = this.f7678a;
        fVar.getClass();
        int d11 = j1Var.d();
        ActionBarContextView actionBarContextView = fVar.R;
        int i11 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fVar.R.getLayoutParams();
            boolean z12 = true;
            if (fVar.R.isShown()) {
                if (fVar.f7646z0 == null) {
                    fVar.f7646z0 = new Rect();
                    fVar.A0 = new Rect();
                }
                Rect rect = fVar.f7646z0;
                Rect rect2 = fVar.A0;
                rect.set(j1Var.b(), j1Var.d(), j1Var.c(), j1Var.a());
                ViewGroup viewGroup = fVar.X;
                Method method = q1.f1113a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i12 = rect.top;
                int i13 = rect.left;
                int i14 = rect.right;
                ViewGroup viewGroup2 = fVar.X;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                j1 a10 = i0.j.a(viewGroup2);
                int b10 = a10 == null ? 0 : a10.b();
                int c3 = a10 == null ? 0 : a10.c();
                if (marginLayoutParams2.topMargin == i12 && marginLayoutParams2.leftMargin == i13 && marginLayoutParams2.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i12;
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    z11 = true;
                }
                Context context = fVar.G;
                if (i12 <= 0 || fVar.Z != null) {
                    View view3 = fVar.Z;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i10 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == b10 && marginLayoutParams.rightMargin == c3))) {
                        marginLayoutParams.height = i10;
                        marginLayoutParams.leftMargin = b10;
                        marginLayoutParams.rightMargin = c3;
                        fVar.Z.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(context);
                    fVar.Z = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c3;
                    fVar.X.addView(fVar.Z, -1, layoutParams);
                }
                View view5 = fVar.Z;
                z10 = view5 != null;
                if (z10 && view5.getVisibility() != 0) {
                    View view6 = fVar.Z;
                    if ((i0.d.g(view6) & 8192) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        Object obj = a.f15323a;
                        i8 = a.d.a(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Object obj2 = a.f15323a;
                        i8 = a.d.a(context, R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(i8);
                }
                if (!fVar.f7625e0 && z10) {
                    d11 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                fVar.R.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = fVar.Z;
        if (view7 != null) {
            if (!z10) {
                i11 = 8;
            }
            view7.setVisibility(i11);
        }
        if (d10 != d11) {
            j1Var2 = j1Var.f(j1Var.b(), d11, j1Var.c(), j1Var.a());
            view2 = view;
        } else {
            view2 = view;
            j1Var2 = j1Var;
        }
        return i0.i(view2, j1Var2);
    }
}
