package d2;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import e.w;
import java.util.Iterator;
import v8.f;

public final /* synthetic */ class b1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7191b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7192c;

    public /* synthetic */ b1(int i8, Object obj, Object obj2) {
        this.f7190a = i8;
        this.f7191b = obj;
        this.f7192c = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i8 = this.f7190a;
        Object obj = this.f7191b;
        switch (i8) {
            case 0:
                ((View) w.this.f7733d.getParent()).invalidate();
                return;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                f fVar = (f) this.f7192c;
                int i10 = AppBarLayout.T;
                appBarLayout.getClass();
                int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.setAlpha(floatValue);
                Iterator it = appBarLayout.M.iterator();
                while (it.hasNext()) {
                    AppBarLayout.d dVar = (AppBarLayout.d) it.next();
                    ColorStateList colorStateList = fVar.f16250a.f16258c;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(floatValue).getDefaultColor();
                        dVar.a();
                    }
                }
                return;
        }
    }
}
