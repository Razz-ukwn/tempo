package d2;

import android.text.TextUtils;
import android.view.View;
import com.quickkonnect.silencio.R;
import d2.i0;

public final class g0 extends i0.b<CharSequence> {
    public g0() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public final Object b(View view) {
        return i0.m.b(view);
    }

    public final void c(View view, Object obj) {
        i0.m.h(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
