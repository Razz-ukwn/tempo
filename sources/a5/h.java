package a5;

import ag.b1;
import android.graphics.drawable.Drawable;
import r4.t;
import r4.w;

public abstract class h<T extends Drawable> implements w<T>, t {

    /* renamed from: a  reason: collision with root package name */
    public final T f111a;

    public h(T t2) {
        b1.b(t2);
        this.f111a = t2;
    }

    public final Object get() {
        T t2 = this.f111a;
        Drawable.ConstantState constantState = t2.getConstantState();
        return constantState == null ? t2 : constantState.newDrawable();
    }
}
