package wb;

import android.content.Context;
import android.view.WindowManager;
import com.lassi.presentation.cameraview.controls.CameraView;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f16665a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16666b;

    /* renamed from: c  reason: collision with root package name */
    public int f16667c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f16668d = -1;

    public interface a {
        void i(int i8);
    }

    public d(Context context, CameraView.b bVar) {
        this.f16666b = bVar;
        this.f16665a = new c(this, context.getApplicationContext());
    }

    public final void a(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            this.f16668d = 0;
        } else if (rotation == 1) {
            this.f16668d = 90;
        } else if (rotation == 2) {
            this.f16668d = 180;
        } else if (rotation != 3) {
            this.f16668d = 0;
        } else {
            this.f16668d = 270;
        }
        this.f16665a.enable();
    }
}
