package b3;

import android.view.View;
import android.view.ViewParent;
import rf.l;
import sf.j;
import sf.k;

public final class j0 extends k implements l<View, View> {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f3091a = new j0();

    public j0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        j.f(view, "it");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
