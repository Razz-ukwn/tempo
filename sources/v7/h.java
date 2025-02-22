package v7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import b3.x;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f16242a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f16243b = 300;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f16244c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f16245d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f16246e = 1;

    public h(long j10) {
        this.f16242a = j10;
        this.f16243b = 150;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f16242a);
        animator.setDuration(this.f16243b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f16245d);
            valueAnimator.setRepeatMode(this.f16246e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f16244c;
        return timeInterpolator != null ? timeInterpolator : a.f16229b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16242a == hVar.f16242a && this.f16243b == hVar.f16243b && this.f16245d == hVar.f16245d && this.f16246e == hVar.f16246e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16242a;
        long j11 = this.f16243b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f16245d) * 31) + this.f16246e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(h.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f16242a);
        sb2.append(" duration: ");
        sb2.append(this.f16243b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f16245d);
        sb2.append(" repeatMode: ");
        return x.b(sb2, this.f16246e, "}\n");
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f16242a = j10;
        this.f16243b = j11;
        this.f16244c = timeInterpolator;
    }
}
