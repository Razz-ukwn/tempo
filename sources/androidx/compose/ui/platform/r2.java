package androidx.compose.ui.platform;

import android.view.RenderNode;
import sf.j;

public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    public static final r2 f1410a = new r2();

    public final void a(RenderNode renderNode) {
        j.f(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
