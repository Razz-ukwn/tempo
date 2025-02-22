package d2;

import android.view.View;
import com.quickkonnect.silencio.R;
import d2.i0;

public final class h0 extends i0.b<Boolean> {
    public h0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(i0.m.c(view));
    }

    public final void c(View view, Object obj) {
        i0.m.g(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !i0.b.a((Boolean) obj, (Boolean) obj2);
    }
}
