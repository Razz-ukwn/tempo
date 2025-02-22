package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import rf.l;
import sf.j;
import sf.k;

public final class q0 extends k implements l<View, View> {

    /* renamed from: a  reason: collision with root package name */
    public static final q0 f2312a = new q0();

    public q0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        j.f(view, "currentView");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
