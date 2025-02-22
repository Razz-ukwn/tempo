package vb;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class l implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f16395a;

    public l(m mVar) {
        this.f16395a = mVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i10) {
        this.f16395a.b(i8, i10);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f16395a.c();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i10) {
        this.f16395a.d(i8, i10);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
