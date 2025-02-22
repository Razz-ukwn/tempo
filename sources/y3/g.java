package y3;

import java.io.InputStream;

public final class g extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f17153a;

    /* renamed from: b  reason: collision with root package name */
    public int f17154b = 1073741824;

    public g(InputStream inputStream) {
        this.f17153a = inputStream;
    }

    public final int available() {
        return this.f17154b;
    }

    public final void close() {
        this.f17153a.close();
    }

    public final int read() {
        int read = this.f17153a.read();
        if (read == -1) {
            this.f17154b = 0;
        }
        return read;
    }

    public final long skip(long j10) {
        return this.f17153a.skip(j10);
    }

    public final int read(byte[] bArr) {
        int read = this.f17153a.read(bArr);
        if (read == -1) {
            this.f17154b = 0;
        }
        return read;
    }

    public final int read(byte[] bArr, int i8, int i10) {
        int read = this.f17153a.read(bArr, i8, i10);
        if (read == -1) {
            this.f17154b = 0;
        }
        return read;
    }
}
