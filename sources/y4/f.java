package y4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import p4.h;
import p4.j;
import r4.w;
import y4.r;

public final class f implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f17183a;

    public f(l lVar) {
        this.f17183a = lVar;
    }

    public final w a(Object obj, int i8, int i10, h hVar) {
        l lVar = this.f17183a;
        List<ImageHeaderParser> list = lVar.f17209d;
        return lVar.a(new r.a(lVar.f17208c, (ByteBuffer) obj, list), i8, i10, hVar, l.f17204k);
    }

    public final boolean b(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        this.f17183a.getClass();
        return true;
    }
}
