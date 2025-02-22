package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.e;
import androidx.lifecycle.p;
import j4.b;
import l4.d;

public abstract class GenericViewTarget<T extends View> implements b<T>, d, e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4047a;

    public final void e(Drawable drawable) {
        k(drawable);
    }

    public final void f(Drawable drawable) {
        k(drawable);
    }

    public final void g(Drawable drawable) {
        k(drawable);
    }

    public abstract Drawable h();

    public abstract void i(Drawable drawable);

    public final void j() {
        Drawable h3 = h();
        Animatable animatable = h3 instanceof Animatable ? (Animatable) h3 : null;
        if (animatable != null) {
            if (this.f4047a) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    public final void k(Drawable drawable) {
        Drawable h3 = h();
        Animatable animatable = h3 instanceof Animatable ? (Animatable) h3 : null;
        if (animatable != null) {
            animatable.stop();
        }
        i(drawable);
        j();
    }

    public final void l(p pVar) {
        this.f4047a = false;
        j();
    }

    public final void s(p pVar) {
        this.f4047a = true;
        j();
    }
}
