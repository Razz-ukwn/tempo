package l8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;

public final class c extends d {
    public StateListAnimator I;

    public c(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    public final float e() {
        return this.f5979q.getElevation();
    }

    public final void f(Rect rect) {
        if (FloatingActionButton.this.F) {
            super.f(rect);
            return;
        }
        boolean z10 = this.f5965b;
        FloatingActionButton floatingActionButton = this.f5979q;
        if (!(!z10 || floatingActionButton.getSizeDimension() >= 0)) {
            int sizeDimension = (0 - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    public final void g() {
    }

    public final void h() {
        n();
        throw null;
    }

    public final void i(int[] iArr) {
    }

    public final void j(float f10, float f11, float f12) {
        FloatingActionButton floatingActionButton = this.f5979q;
        if (floatingActionButton.getStateListAnimator() == this.I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.C, o(f10, f12));
            stateListAnimator.addState(d.D, o(f10, f11));
            stateListAnimator.addState(d.E, o(f10, f11));
            stateListAnimator.addState(d.F, o(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[]{f10}).setDuration(0));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f5961x);
            stateListAnimator.addState(d.G, animatorSet);
            stateListAnimator.addState(d.H, o(0.0f, 0.0f));
            this.I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (p()) {
            n();
            throw null;
        }
    }

    public final void l() {
    }

    public final void m() {
    }

    public final AnimatorSet o(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f5979q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(d.f5961x);
        return animatorSet;
    }

    public final boolean p() {
        if (FloatingActionButton.this.F) {
            return true;
        }
        return !(!this.f5965b || this.f5979q.getSizeDimension() >= 0);
    }
}
