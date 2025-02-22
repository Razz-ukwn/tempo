package y4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p4.h;
import p4.j;
import r4.w;

public final class g implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f17184a = new c();

    public final w a(Object obj, int i8, int i10, h hVar) {
        return this.f17184a.a(ImageDecoder.createSource((ByteBuffer) obj), i8, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
