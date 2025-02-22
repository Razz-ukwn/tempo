package androidx.compose.ui.platform;

import android.view.View;
import sf.j;

public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f1349a = new m0();

    public final void a(View view, int i8, boolean z10) {
        j.f(view, "view");
        view.setFocusable(i8);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
