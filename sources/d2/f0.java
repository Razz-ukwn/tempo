package d2;

import android.view.View;
import com.quickkonnect.silencio.R;
import d2.i0;

public final class f0 extends i0.b<Boolean> {
    public f0() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(i0.m.d(view));
    }

    public final void c(View view, Object obj) {
        i0.m.i(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !i0.b.a((Boolean) obj, (Boolean) obj2);
    }
}
