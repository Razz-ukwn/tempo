package m8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f11282a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f11283b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f11284c = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.f11283b == animator) {
                nVar.f11283b = null;
            }
        }
    }

    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f11284c);
        this.f11282a.add(bVar);
    }
}
