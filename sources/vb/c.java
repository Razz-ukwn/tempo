package vb;

import android.view.SurfaceHolder;

public final class c implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16365a;

    public c(d dVar) {
        this.f16365a = dVar;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i10, int i11) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        d dVar = this.f16365a;
        dVar.c();
        dVar.m = false;
    }
}
