package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.quickkonnect.silencio.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<b> f5703a = new LinkedHashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public int f5704b;

    /* renamed from: c  reason: collision with root package name */
    public int f5705c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f5706d;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f5707e;

    /* renamed from: f  reason: collision with root package name */
    public int f5708f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f5709g = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f5710h = 0;

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f5711i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f5711i = null;
        }
    }

    public interface b {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i8) {
        this.f5708f = v3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v3.getLayoutParams()).bottomMargin;
        this.f5704b = n8.a.c(v3.getContext(), R.attr.motionDurationLong2, 225);
        this.f5705c = n8.a.c(v3.getContext(), R.attr.motionDurationMedium4, 175);
        this.f5706d = n8.a.d(v3.getContext(), R.attr.motionEasingEmphasizedInterpolator, v7.a.f16231d);
        this.f5707e = n8.a.d(v3.getContext(), R.attr.motionEasingEmphasizedInterpolator, v7.a.f16230c);
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11, int[] iArr) {
        LinkedHashSet<b> linkedHashSet = this.f5703a;
        boolean z10 = false;
        if (i8 > 0) {
            if (this.f5709g == 1) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator = this.f5711i;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f5709g = 1;
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                s(view, this.f5708f + this.f5710h, (long) this.f5705c, this.f5707e);
            }
        } else if (i8 < 0) {
            if (this.f5709g == 2) {
                z10 = true;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f5711i;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f5709g = 2;
                Iterator<b> it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                s(view, 0, (long) this.f5704b, this.f5706d);
            }
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i8, int i10) {
        return i8 == 2;
    }

    public final void s(V v3, int i8, long j10, TimeInterpolator timeInterpolator) {
        this.f5711i = v3.animate().translationY((float) i8).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
