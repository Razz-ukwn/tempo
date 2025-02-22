package androidx.compose.ui.platform;

import android.view.ViewParent;
import sf.j;

public final class x3 {

    /* renamed from: a  reason: collision with root package name */
    public static final x3 f1511a = new x3();

    public final void a(AndroidComposeView androidComposeView) {
        j.f(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
