package u3;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import d2.i0;
import d2.j1;
import d2.z;

public final class b implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f15712a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager f15713b;

    public b(ViewPager viewPager) {
        this.f15713b = viewPager;
    }

    public final j1 a(View view, j1 j1Var) {
        j1 i8 = i0.i(view, j1Var);
        if (i8.f7237a.m()) {
            return i8;
        }
        int b10 = i8.b();
        Rect rect = this.f15712a;
        rect.left = b10;
        rect.top = i8.d();
        rect.right = i8.c();
        rect.bottom = i8.a();
        ViewPager viewPager = this.f15713b;
        int childCount = viewPager.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            j1 b11 = i0.b(viewPager.getChildAt(i10), i8);
            rect.left = Math.min(b11.b(), rect.left);
            rect.top = Math.min(b11.d(), rect.top);
            rect.right = Math.min(b11.c(), rect.right);
            rect.bottom = Math.min(b11.a(), rect.bottom);
        }
        return i8.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
