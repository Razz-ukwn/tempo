package d2;

import android.view.ViewParent;
import rf.l;
import sf.i;
import sf.j;

public final /* synthetic */ class z0 extends i implements l<ViewParent, ViewParent> {
    public static final z0 E = new z0();

    public z0() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        j.f(viewParent, "p0");
        return viewParent.getParent();
    }
}
