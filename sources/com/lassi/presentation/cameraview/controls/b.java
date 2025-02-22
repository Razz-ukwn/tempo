package com.lassi.presentation.cameraview.controls;

import android.hardware.Camera;
import tb.i;
import ub.t;
import ub.u;
import ub.w;
import wb.a;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f6452a;

    public b(g gVar) {
        this.f6452a = gVar;
    }

    public final void run() {
        g gVar = this.f6452a;
        if (gVar.f6484h != i.VIDEO) {
            a aVar = g.Y;
            Object[] objArr = new Object[2];
            objArr[0] = "takePicture: performing.";
            boolean z10 = true;
            objArr[1] = Boolean.valueOf(gVar.f6494s != null);
            aVar.a(0, objArr);
            if (gVar.f6494s == null) {
                z10 = false;
            }
            if (!z10) {
                w wVar = new w();
                wVar.f15989a = gVar.h(0, 2);
                gVar.e();
                l lVar = new l(wVar, gVar, gVar.V);
                gVar.f6494s = lVar;
                lVar.f6523c.takePicture(new t(lVar), (Camera.PictureCallback) null, (Camera.PictureCallback) null, new u(lVar));
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't take hq pictures while in VIDEO mode");
    }
}
