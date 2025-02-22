package androidx.compose.ui.platform;

import android.view.RenderNode;
import sf.j;

public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    public static final s2 f1460a = new s2();

    public final int a(RenderNode renderNode) {
        j.f(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        j.f(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i8) {
        j.f(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i8);
    }

    public final void d(RenderNode renderNode, int i8) {
        j.f(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i8);
    }
}
