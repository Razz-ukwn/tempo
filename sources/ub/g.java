package ub;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.lassi.presentation.cameraview.controls.g f15969a;

    public g(com.lassi.presentation.cameraview.controls.g gVar) {
        this.f15969a = gVar;
    }

    public final void run() {
        com.lassi.presentation.cameraview.controls.g gVar = this.f15969a;
        if (gVar.W) {
            x b10 = gVar.b(com.lassi.presentation.cameraview.controls.g.A(gVar.V.getParameters().getSupportedPreviewSizes()));
            if (!b10.equals(gVar.f6501z)) {
                com.lassi.presentation.cameraview.controls.g.Y.a(1, "onSurfaceChanged:", "Computed a new preview size. Going on.");
                gVar.f6501z = b10;
                gVar.C();
                gVar.B("onSurfaceChanged:");
            }
        }
    }
}
