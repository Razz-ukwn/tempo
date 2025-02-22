package w7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b7.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.n;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class f extends g<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f16514c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f16515d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f16516e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f16517f;

    public f() {
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11) {
        AppBarLayout u7;
        j1 lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (u7 = u(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (size > 0) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.d.b(u7) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int w10 = w(u7) + size;
        int measuredHeight = u7.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            w10 -= measuredHeight;
        }
        coordinatorLayout.r(view, i8, i10, View.MeasureSpec.makeMeasureSpec(w10, i12 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public final void t(CoordinatorLayout coordinatorLayout, View view, int i8) {
        AppBarLayout u7 = u(coordinatorLayout.d(view));
        int i10 = 0;
        if (u7 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + fVar.leftMargin;
            int bottom = u7.getBottom() + fVar.topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.f16514c;
            rect.set(paddingLeft, bottom, width, ((u7.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            j1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (i0.d.b(coordinatorLayout) && !i0.d.b(view)) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f16515d;
            int i11 = fVar.f1718c;
            if (i11 == 0) {
                i11 = 8388659;
            }
            n.b(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i8);
            if (this.f16517f != 0) {
                float v3 = v(u7);
                int i12 = this.f16517f;
                i10 = a.r((int) (v3 * ((float) i12)), 0, i12);
            }
            view.layout(rect2.left, rect2.top - i10, rect2.right, rect2.bottom - i10);
            this.f16516e = rect2.top - u7.getBottom();
            return;
        }
        View view2 = view;
        coordinatorLayout.q(view, i8);
        this.f16516e = 0;
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
