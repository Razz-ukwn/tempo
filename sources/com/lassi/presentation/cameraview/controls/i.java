package com.lassi.presentation.cameraview.controls;

import wb.a;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f6507a;

    public i(g gVar) {
        this.f6507a = gVar;
    }

    public final void run() {
        a aVar = h.U;
        h hVar = this.f6507a;
        aVar.a(1, "Stop:", "executing. State:", hVar.l());
        if (hVar.D > 0) {
            hVar.D = -1;
            aVar.a(1, "Stop:", "about to call onStop()");
            hVar.j();
            aVar.a(1, "Stop:", "returned from onStop().", "Dispatching.");
            hVar.D = 0;
            hVar.f6477a.g();
        }
    }
}
