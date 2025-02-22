package k4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import sf.j;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10292a = a.class.getName();

    public final Bitmap a(Bitmap bitmap) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f10 = ((float) min) / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        j.e(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f10, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f10 - (((float) bitmap.getWidth()) / 2.0f), f10 - (((float) bitmap.getHeight()) / 2.0f), paint);
        return createBitmap;
    }

    public final String b() {
        return this.f10292a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
