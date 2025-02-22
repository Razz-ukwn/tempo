package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import e.s;
import ff.m;
import i0.a;
import i0.f;
import i0.o;
import i0.q;
import rf.l;
import sf.j;

public final class o2 implements i1 {

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f1382a = new RenderNode("Compose");

    public o2(AndroidComposeView androidComposeView) {
        j.f(androidComposeView, "ownerView");
    }

    public final void A(float f10) {
        this.f1382a.setScaleX(f10);
    }

    public final void B(int i8) {
        this.f1382a.setAmbientShadowColor(i8);
    }

    public final void C(float f10) {
        this.f1382a.setTranslationX(f10);
    }

    public final int D() {
        return this.f1382a.getRight();
    }

    public final boolean E() {
        return this.f1382a.getClipToOutline();
    }

    public final void F(boolean z10) {
        this.f1382a.setClipToOutline(z10);
    }

    public final void G(float f10) {
        this.f1382a.setCameraDistance(f10);
    }

    public final void H(int i8) {
        this.f1382a.setSpotShadowColor(i8);
    }

    public final void I(float f10) {
        this.f1382a.setRotationX(f10);
    }

    public final void J(Matrix matrix) {
        j.f(matrix, "matrix");
        this.f1382a.getMatrix(matrix);
    }

    public final float K() {
        return this.f1382a.getElevation();
    }

    public final void L(s sVar, o oVar, l<? super f, m> lVar) {
        j.f(sVar, "canvasHolder");
        RenderNode renderNode = this.f1382a;
        RecordingCanvas d10 = renderNode.beginRecording();
        j.e(d10, "renderNode.beginRecording()");
        a aVar = (a) sVar.f7705a;
        Canvas canvas = aVar.f9359a;
        aVar.getClass();
        aVar.f9359a = d10;
        if (oVar != null) {
            aVar.c();
            aVar.m(oVar, 1);
        }
        lVar.invoke(aVar);
        if (oVar != null) {
            aVar.l();
        }
        aVar.p(canvas);
        renderNode.endRecording();
    }

    public final int a() {
        return this.f1382a.getHeight();
    }

    public final int b() {
        return this.f1382a.getWidth();
    }

    public final float c() {
        return this.f1382a.getAlpha();
    }

    public final void d(float f10) {
        this.f1382a.setRotationY(f10);
    }

    public final void e(int i8) {
        this.f1382a.offsetLeftAndRight(i8);
    }

    public final int f() {
        return this.f1382a.getBottom();
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 31) {
            p2.f1392a.a(this.f1382a, (q) null);
        }
    }

    public final void h(Canvas canvas) {
        canvas.drawRenderNode(this.f1382a);
    }

    public final int i() {
        return this.f1382a.getLeft();
    }

    public final void j(float f10) {
        this.f1382a.setRotationZ(f10);
    }

    public final void k(float f10) {
        this.f1382a.setPivotX(f10);
    }

    public final void l(float f10) {
        this.f1382a.setTranslationY(f10);
    }

    public final void m(boolean z10) {
        this.f1382a.setClipToBounds(z10);
    }

    public final boolean n(int i8, int i10, int i11, int i12) {
        return this.f1382a.setPosition(i8, i10, i11, i12);
    }

    public final void o() {
        this.f1382a.discardDisplayList();
    }

    public final void p(float f10) {
        this.f1382a.setPivotY(f10);
    }

    public final void q(float f10) {
        this.f1382a.setScaleY(f10);
    }

    public final void r(float f10) {
        this.f1382a.setElevation(f10);
    }

    public final void s(int i8) {
        this.f1382a.offsetTopAndBottom(i8);
    }

    public final void t(int i8) {
        boolean z10 = false;
        boolean z11 = i8 == 1;
        RenderNode renderNode = this.f1382a;
        if (z11) {
            renderNode.setUseCompositingLayer(true, (Paint) null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (i8 == 2) {
            z10 = true;
        }
        if (z10) {
            renderNode.setUseCompositingLayer(false, (Paint) null);
            renderNode.setHasOverlappingRendering(false);
            return;
        }
        renderNode.setUseCompositingLayer(false, (Paint) null);
        renderNode.setHasOverlappingRendering(true);
    }

    public final boolean u() {
        return this.f1382a.hasDisplayList();
    }

    public final void v(Outline outline) {
        this.f1382a.setOutline(outline);
    }

    public final boolean w() {
        return this.f1382a.setHasOverlappingRendering(true);
    }

    public final void x(float f10) {
        this.f1382a.setAlpha(f10);
    }

    public final boolean y() {
        return this.f1382a.getClipToBounds();
    }

    public final int z() {
        return this.f1382a.getTop();
    }
}
