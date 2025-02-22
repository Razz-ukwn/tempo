package m8;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import r3.k;
import r3.r;

public final class q extends k {

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f11305a;

        public a(TextView textView) {
            this.f11305a = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f11305a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    public final void g(r rVar) {
        View view = rVar.f13860b;
        if (view instanceof TextView) {
            rVar.f13859a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public final void j(r rVar) {
        View view = rVar.f13860b;
        if (view instanceof TextView) {
            rVar.f13859a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public final Animator n(ViewGroup viewGroup, r rVar, r rVar2) {
        if (rVar == null || rVar2 == null || !(rVar.f13860b instanceof TextView)) {
            return null;
        }
        View view = rVar2.f13860b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = rVar.f13859a;
        HashMap hashMap2 = rVar2.f13859a;
        float f10 = 1.0f;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        if (hashMap2.get("android:textscale:scale") != null) {
            f10 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f10) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f10});
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
