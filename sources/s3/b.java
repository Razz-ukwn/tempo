package s3;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f14597a;

    public b(c cVar) {
        this.f14597a = cVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.f14597a.a(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.f14597a.b(drawable);
    }
}
