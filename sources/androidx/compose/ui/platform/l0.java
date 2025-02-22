package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import o0.a;
import o0.b;
import o0.l;
import sf.j;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f1345a = new l0();

    public final void a(View view, l lVar) {
        PointerIcon pointerIcon;
        j.f(view, "view");
        if (lVar instanceof a) {
            ((a) lVar).getClass();
            pointerIcon = null;
        } else if (lVar instanceof b) {
            Context context = view.getContext();
            ((b) lVar).getClass();
            pointerIcon = PointerIcon.getSystemIcon(context, 0);
            j.e(pointerIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            j.e(pointerIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (!j.a(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
