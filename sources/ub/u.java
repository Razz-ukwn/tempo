package ub;

import android.hardware.Camera;
import com.lassi.presentation.cameraview.controls.CameraView;
import com.lassi.presentation.cameraview.controls.g;
import com.lassi.presentation.cameraview.controls.l;
import com.lassi.presentation.cameraview.controls.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import s2.a;

public final class u implements Camera.PictureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f15987a;

    public u(l lVar) {
        this.f15987a = lVar;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        int i8;
        try {
            switch (new a(new ByteArrayInputStream(bArr)).c()) {
                case 3:
                case 4:
                    i8 = 180;
                    break;
                case 5:
                case 6:
                    i8 = 90;
                    break;
                case 7:
                case 8:
                    i8 = 270;
                    break;
            }
        } catch (IOException unused) {
        }
        i8 = 0;
        l lVar = this.f15987a;
        lVar.f6530a.getClass();
        w wVar = lVar.f6530a;
        wVar.f15990b = bArr;
        wVar.f15989a = i8;
        camera.startPreview();
        lVar.f6523c = null;
        n.a aVar = lVar.f6531b;
        if (aVar != null) {
            w wVar2 = lVar.f6530a;
            g gVar = (g) aVar;
            gVar.f6494s = null;
            CameraView.b bVar = gVar.f6477a;
            if (wVar2 != null) {
                bVar.e(wVar2);
            } else {
                bVar.a(new m());
                g.Y.a(3, "onPictureResult", "result is null: something went wrong.");
            }
            lVar.f6531b = null;
            lVar.f6530a = null;
        }
    }
}
