package l3;

import android.view.View;
import com.quickkonnect.silencio.R;
import rf.l;
import sf.j;
import sf.k;

public final class d extends k implements l<View, b> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f10971a = new d();

    public d() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        j.f(view, "view");
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof b) {
            return (b) tag;
        }
        return null;
    }
}
