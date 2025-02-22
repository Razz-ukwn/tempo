package r3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public final class d extends c0 {

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f13820a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13821b = false;

        public a(View view) {
            this.f13820a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            z zVar = v.f13865a;
            View view = this.f13820a;
            zVar.o(view, 1.0f);
            if (this.f13821b) {
                view.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            View view = this.f13820a;
            if (i0.d.h(view) && view.getLayerType() == 0) {
                this.f13821b = true;
                view.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i8) {
        if ((i8 & -4) == 0) {
            this.T = i8;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        v.f13865a.o(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, v.f13866b, new float[]{f11});
        ofFloat.addListener(new a(view));
        a(new c(view));
        return ofFloat;
    }

    public final void j(r rVar) {
        L(rVar);
        rVar.f13859a.put("android:fade:transitionAlpha", Float.valueOf(v.f13865a.n(rVar.f13860b)));
    }

    public d() {
    }
}
