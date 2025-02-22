package v7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import o.f;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final f<String, h> f16240a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final f<String, PropertyValuesHolder[]> f16241b = new f<>();

    public static g a(Context context, int i8) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i8);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i8), e10);
            return null;
        }
    }

    public static g b(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Animator animator = (Animator) arrayList.get(i8);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f16241b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f16229b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f16230c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f16231d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f16245d = objectAnimator.getRepeatCount();
                hVar.f16246e = objectAnimator.getRepeatMode();
                gVar.f16240a.put(propertyName, hVar);
                i8++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public final h c(String str) {
        f<String, h> fVar = this.f16240a;
        if (fVar.getOrDefault(str, null) != null) {
            return fVar.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f16240a.equals(((g) obj).f16240a);
    }

    public final int hashCode() {
        return this.f16240a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f16240a + "}\n";
    }
}
