package s4;

import android.graphics.Bitmap;

public class d implements c {
    public final void a(int i8) {
    }

    public final void b() {
    }

    public final Bitmap c(int i8, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i8, i10, config);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public final Bitmap e(int i8, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i8, i10, config);
    }
}
