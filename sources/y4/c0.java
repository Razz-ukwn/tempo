package y4;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class c0 extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f17180a;

    public c0(ByteBuffer byteBuffer) {
        this.f17180a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f17180a.limit();
    }

    public final int readAt(long j10, byte[] bArr, int i8, int i10) {
        ByteBuffer byteBuffer = this.f17180a;
        if (j10 >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j10);
        int min = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i8, min);
        return min;
    }
}
