package i5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j5.d;

public abstract class e<Z> extends h<ImageView, Z> implements d.a {

    /* renamed from: c  reason: collision with root package name */
    public Animatable f9585c;

    public e(ImageView imageView) {
        super(imageView);
    }

    public final void a() {
        Animatable animatable = this.f9585c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void c(Z z10, d<? super Z> dVar) {
        if (dVar == null || !dVar.a(z10, this)) {
            l(z10);
            if (z10 instanceof Animatable) {
                Animatable animatable = (Animatable) z10;
                this.f9585c = animatable;
                animatable.start();
                return;
            }
            this.f9585c = null;
        } else if (z10 instanceof Animatable) {
            Animatable animatable2 = (Animatable) z10;
            this.f9585c = animatable2;
            animatable2.start();
        } else {
            this.f9585c = null;
        }
    }

    public final void g(Drawable drawable) {
        l((Object) null);
        this.f9585c = null;
        ((ImageView) this.f9586a).setImageDrawable(drawable);
    }

    public final void h() {
        Animatable animatable = this.f9585c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void j(Drawable drawable) {
        l((Object) null);
        this.f9585c = null;
        ((ImageView) this.f9586a).setImageDrawable(drawable);
    }

    public final void k(Drawable drawable) {
        super.k(drawable);
        Animatable animatable = this.f9585c;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        this.f9585c = null;
        ((ImageView) this.f9586a).setImageDrawable(drawable);
    }

    public abstract void l(Z z10);
}
