package l5;

import java.io.FilterInputStream;

public final class j extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f11003a = Integer.MIN_VALUE;

    public j(d dVar) {
        super(dVar);
    }

    public final int available() {
        int i8 = this.f11003a;
        return i8 == Integer.MIN_VALUE ? super.available() : Math.min(i8, super.available());
    }

    public final long c(long j10) {
        int i8 = this.f11003a;
        if (i8 == 0) {
            return -1;
        }
        return (i8 == Integer.MIN_VALUE || j10 <= ((long) i8)) ? j10 : (long) i8;
    }

    public final void d(long j10) {
        int i8 = this.f11003a;
        if (i8 != Integer.MIN_VALUE && j10 != -1) {
            this.f11003a = (int) (((long) i8) - j10);
        }
    }

    public final synchronized void mark(int i8) {
        super.mark(i8);
        this.f11003a = i8;
    }

    public final int read() {
        if (c(1) == -1) {
            return -1;
        }
        int read = super.read();
        d(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f11003a = Integer.MIN_VALUE;
    }

    public final long skip(long j10) {
        long c3 = c(j10);
        if (c3 == -1) {
            return 0;
        }
        long skip = super.skip(c3);
        d(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i8, int i10) {
        int c3 = (int) c((long) i10);
        if (c3 == -1) {
            return -1;
        }
        int read = super.read(bArr, i8, c3);
        d((long) read);
        return read;
    }
}
