package androidx.compose.ui.platform;

import android.view.View;
import sf.j;

public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    public static final g3 f1291a = new g3();

    public final void a(View view, int i8) {
        j.f(view, "view");
        view.setOutlineAmbientShadowColor(i8);
    }

    public final void b(View view, int i8) {
        j.f(view, "view");
        view.setOutlineSpotShadowColor(i8);
    }
}
