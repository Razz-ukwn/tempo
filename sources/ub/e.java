package ub;

import com.lassi.presentation.cameraview.controls.g;
import com.lassi.presentation.cameraview.controls.m;
import wb.a;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f15966a;

    public e(g gVar) {
        this.f15966a = gVar;
    }

    public final void run() {
        a aVar = g.Y;
        Object[] objArr = new Object[3];
        boolean z10 = false;
        objArr[0] = "stopVideo";
        objArr[1] = "mVideoRecorder is null?";
        g gVar = this.f15966a;
        if (gVar.f6495t == null) {
            z10 = true;
        }
        objArr[2] = Boolean.valueOf(z10);
        aVar.a(1, objArr);
        m mVar = gVar.f6495t;
        if (mVar != null) {
            mVar.a();
            gVar.f6495t = null;
        }
    }
}
