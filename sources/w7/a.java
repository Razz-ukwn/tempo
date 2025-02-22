package w7;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import v8.f;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16495a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f16496b;

    public /* synthetic */ a(AppBarLayout appBarLayout, f fVar) {
        this.f16495a = appBarLayout;
        this.f16496b = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i8 = AppBarLayout.T;
        AppBarLayout appBarLayout = this.f16495a;
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f16496b.l(floatValue);
        Drawable drawable = appBarLayout.Q;
        if (drawable instanceof f) {
            ((f) drawable).l(floatValue);
        }
        Iterator it = appBarLayout.M.iterator();
        while (it.hasNext()) {
            ((AppBarLayout.d) it.next()).a();
        }
    }
}
