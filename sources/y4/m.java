package y4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import s4.c;
import s4.d;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17211a = new a();

    public class a extends d {
        public final void d(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    public static d a(c cVar, Drawable drawable, int i8, int i10) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i8 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i10 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i8 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i10 = current.getIntrinsicHeight();
                    }
                    Lock lock = y.f17251b;
                    lock.lock();
                    Bitmap e10 = cVar.e(i8, i10, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(e10);
                        current.setBounds(0, 0, i8, i10);
                        current.draw(canvas);
                        canvas.setBitmap((Bitmap) null);
                        lock.unlock();
                        bitmap = e10;
                        z10 = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            cVar = f17211a;
        }
        return d.e(bitmap, cVar);
    }
}
