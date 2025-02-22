package l3;

import android.view.View;
import android.view.ViewParent;
import rf.l;
import sf.j;
import sf.k;

public final class c extends k implements l<View, View> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f10970a = new c();

    public c() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        j.f(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
