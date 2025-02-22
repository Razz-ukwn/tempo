package y4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import p4.h;
import p4.j;
import s4.d;
import x4.a;

public final class c implements j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f17179a = new d();

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final d a(ImageDecoder.Source source, int i8, int i10, h hVar) {
        Bitmap c3 = ImageDecoder.decodeBitmap(source, new a(i8, i10, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + c3.getWidth() + "x" + c3.getHeight() + "] for [" + i8 + "x" + i10 + "]");
        }
        return new d(c3, this.f17179a);
    }
}
