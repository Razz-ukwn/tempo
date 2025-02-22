package ub;

import com.lassi.presentation.cameraview.controls.g;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f15970a;

    public h(g gVar) {
        this.f15970a = gVar;
    }

    public final void run() {
        g gVar = this.f15970a;
        gVar.C();
        if (gVar.W) {
            gVar.D();
        }
    }
}
