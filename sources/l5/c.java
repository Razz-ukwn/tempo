package l5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f10987a;

    /* renamed from: b  reason: collision with root package name */
    public int f10988b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f10987a = j10;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f10987a - ((long) this.f10988b), (long) this.in.available());
    }

    public final void c(int i8) {
        if (i8 >= 0) {
            this.f10988b += i8;
            return;
        }
        long j10 = this.f10987a;
        if (j10 - ((long) this.f10988b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j10 + ", but read: " + this.f10988b);
        }
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        c(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i8, int i10) {
        int read;
        read = super.read(bArr, i8, i10);
        c(read);
        return read;
    }
}
