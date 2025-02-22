package vb;

import android.view.SurfaceHolder;
import wb.a;

public final class h implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f16386a;

    public h(i iVar) {
        this.f16386a = iVar;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i10, int i11) {
        a aVar = i.f16387k;
        i iVar = this.f16386a;
        aVar.a(1, "callback:", "surfaceChanged", "w:", Integer.valueOf(i10), "h:", Integer.valueOf(i11), "dispatched:", Boolean.valueOf(iVar.f16388j));
        if (!iVar.f16388j) {
            iVar.b(i10, i11);
            iVar.f16388j = true;
            return;
        }
        iVar.d(i10, i11);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i.f16387k.a(1, "callback:", "surfaceDestroyed");
        i iVar = this.f16386a;
        iVar.c();
        iVar.f16388j = false;
    }
}
