package androidx.lifecycle;

import android.view.View;
import com.quickkonnect.silencio.R;
import rf.l;
import sf.j;
import sf.k;

public final class r0 extends k implements l<View, p> {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f2313a = new r0();

    public r0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        j.f(view, "viewParent");
        Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof p) {
            return (p) tag;
        }
        return null;
    }
}
