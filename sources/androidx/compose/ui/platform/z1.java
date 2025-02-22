package androidx.compose.ui.platform;

import ag.b1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import e.s;
import ff.m;
import i0.a;
import i0.f;
import i0.o;
import rf.l;
import sf.j;

public final class z1 implements i1 {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f1531g = true;

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f1532a;

    /* renamed from: b  reason: collision with root package name */
    public int f1533b;

    /* renamed from: c  reason: collision with root package name */
    public int f1534c;

    /* renamed from: d  reason: collision with root package name */
    public int f1535d;

    /* renamed from: e  reason: collision with root package name */
    public int f1536e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1537f;

    public z1(AndroidComposeView androidComposeView) {
        j.f(androidComposeView, "ownerView");
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        j.e(create, "create(\"Compose\", ownerView)");
        this.f1532a = create;
        if (f1531g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                s2 s2Var = s2.f1460a;
                s2Var.c(create, s2Var.a(create));
                s2Var.d(create, s2Var.b(create));
            }
            r2.f1410a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f1531g = false;
        }
    }

    public final void A(float f10) {
        this.f1532a.setScaleX(f10);
    }

    public final void B(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            s2.f1460a.c(this.f1532a, i8);
        }
    }

    public final void C(float f10) {
        this.f1532a.setTranslationX(f10);
    }

    public final int D() {
        return this.f1535d;
    }

    public final boolean E() {
        return this.f1532a.getClipToOutline();
    }

    public final void F(boolean z10) {
        this.f1532a.setClipToOutline(z10);
    }

    public final void G(float f10) {
        this.f1532a.setCameraDistance(-f10);
    }

    public final void H(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            s2.f1460a.d(this.f1532a, i8);
        }
    }

    public final void I(float f10) {
        this.f1532a.setRotationX(f10);
    }

    public final void J(Matrix matrix) {
        j.f(matrix, "matrix");
        this.f1532a.getMatrix(matrix);
    }

    public final float K() {
        return this.f1532a.getElevation();
    }

    public final void L(s sVar, o oVar, l<? super f, m> lVar) {
        j.f(sVar, "canvasHolder");
        int i8 = this.f1535d - this.f1533b;
        int i10 = this.f1536e - this.f1534c;
        RenderNode renderNode = this.f1532a;
        Canvas start = renderNode.start(i8, i10);
        j.e(start, "renderNode.start(width, height)");
        Canvas o10 = sVar.e().o();
        sVar.e().p(start);
        a e10 = sVar.e();
        if (oVar != null) {
            e10.c();
            e10.m(oVar, 1);
        }
        lVar.invoke(e10);
        if (oVar != null) {
            e10.l();
        }
        sVar.e().p(o10);
        renderNode.end(start);
    }

    public final int a() {
        return this.f1536e - this.f1534c;
    }

    public final int b() {
        return this.f1535d - this.f1533b;
    }

    public final float c() {
        return this.f1532a.getAlpha();
    }

    public final void d(float f10) {
        this.f1532a.setRotationY(f10);
    }

    public final void e(int i8) {
        this.f1533b += i8;
        this.f1535d += i8;
        this.f1532a.offsetLeftAndRight(i8);
    }

    public final int f() {
        return this.f1536e;
    }

    public final void g() {
    }

    public final void h(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f1532a);
    }

    public final int i() {
        return this.f1533b;
    }

    public final void j(float f10) {
        this.f1532a.setRotation(f10);
    }

    public final void k(float f10) {
        this.f1532a.setPivotX(f10);
    }

    public final void l(float f10) {
        this.f1532a.setTranslationY(f10);
    }

    public final void m(boolean z10) {
        this.f1537f = z10;
        this.f1532a.setClipToBounds(z10);
    }

    public final boolean n(int i8, int i10, int i11, int i12) {
        this.f1533b = i8;
        this.f1534c = i10;
        this.f1535d = i11;
        this.f1536e = i12;
        return this.f1532a.setLeftTopRightBottom(i8, i10, i11, i12);
    }

    public final void o() {
        r2.f1410a.a(this.f1532a);
    }

    public final void p(float f10) {
        this.f1532a.setPivotY(f10);
    }

    public final void q(float f10) {
        this.f1532a.setScaleY(f10);
    }

    public final void r(float f10) {
        this.f1532a.setElevation(f10);
    }

    public final void s(int i8) {
        this.f1534c += i8;
        this.f1536e += i8;
        this.f1532a.offsetTopAndBottom(i8);
    }

    public final void t(int i8) {
        boolean f10 = b1.f(i8, 1);
        RenderNode renderNode = this.f1532a;
        if (f10) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (b1.f(i8, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final boolean u() {
        return this.f1532a.isValid();
    }

    public final void v(Outline outline) {
        this.f1532a.setOutline(outline);
    }

    public final boolean w() {
        return this.f1532a.setHasOverlappingRendering(true);
    }

    public final void x(float f10) {
        this.f1532a.setAlpha(f10);
    }

    public final boolean y() {
        return this.f1537f;
    }

    public final int z() {
        return this.f1534c;
    }
}
