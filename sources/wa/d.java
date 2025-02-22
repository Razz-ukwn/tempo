package wa;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class d {
    public static byte[] a(ArrayDeque arrayDeque, int i8) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i8) {
            return bArr;
        }
        int length = i8 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i8 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(a aVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i8 = 0;
        while (i8 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i8);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = aVar.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(arrayDeque, i8);
                }
                i10 += read;
                i8 += read;
            }
            long j10 = ((long) min) * ((long) (min < 4096 ? 4 : 2));
            min = j10 > 2147483647L ? Integer.MAX_VALUE : j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        public long f16569a = 1048577;

        /* renamed from: b  reason: collision with root package name */
        public long f16570b = -1;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final int available() {
            return (int) Math.min((long) this.in.available(), this.f16569a);
        }

        public final synchronized void mark(int i8) {
            this.in.mark(i8);
            this.f16570b = this.f16569a;
        }

        public final int read() {
            if (this.f16569a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f16569a--;
            }
            return read;
        }

        public final synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f16570b != -1) {
                this.in.reset();
                this.f16569a = this.f16570b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final long skip(long j10) {
            long skip = this.in.skip(Math.min(j10, this.f16569a));
            this.f16569a -= skip;
            return skip;
        }

        public final int read(byte[] bArr, int i8, int i10) {
            long j10 = this.f16569a;
            if (j10 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i8, (int) Math.min((long) i10, j10));
            if (read != -1) {
                this.f16569a -= (long) read;
            }
            return read;
        }
    }
}
