package y4;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import l5.a;
import s4.b;

public final class o implements ImageHeaderParser {
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int b(ByteBuffer byteBuffer, b bVar) {
        AtomicReference<byte[]> atomicReference = a.f10981a;
        return d(new a.C0207a(byteBuffer), bVar);
    }

    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final int d(InputStream inputStream, b bVar) {
        int c3 = new s2.a(inputStream).c();
        if (c3 == 0) {
            return -1;
        }
        return c3;
    }
}
