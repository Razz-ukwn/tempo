package c5;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p4.j;
import r4.w;
import s4.b;

public final class h implements j<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f3755a;

    /* renamed from: b  reason: collision with root package name */
    public final j<ByteBuffer, c> f3756b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3757c;

    public h(List list, a aVar, b bVar) {
        this.f3755a = list;
        this.f3756b = aVar;
        this.f3757c = bVar;
    }

    public final w a(Object obj, int i8, int i10, p4.h hVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f3756b.a(ByteBuffer.wrap(bArr), i8, i10, hVar);
    }

    public final boolean b(Object obj, p4.h hVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) hVar.c(g.f3754b)).booleanValue()) {
            if (a.c(this.f3757c, inputStream, this.f3755a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
