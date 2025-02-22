package b3;

import android.view.View;
import com.quickkonnect.silencio.R;
import java.lang.ref.WeakReference;
import rf.l;
import sf.j;
import sf.k;

public final class k0 extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f3096a = new k0();

    public k0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        j.f(view, "it");
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (m) ((WeakReference) tag).get();
        }
        if (tag instanceof m) {
            return (m) tag;
        }
        return null;
    }
}
