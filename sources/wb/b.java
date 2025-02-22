package wb;

import android.hardware.Camera;
import tb.c;
import ub.o;

public final class b {
    public static boolean a(c cVar) {
        int intValue = o.f15979d.get(cVar).intValue();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i8 = 0; i8 < numberOfCameras; i8++) {
            Camera.getCameraInfo(i8, cameraInfo);
            if (cameraInfo.facing == intValue) {
                return true;
            }
        }
        return false;
    }
}
