package com.bumptech.glide.load.data;

import androidx.fragment.app.q;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4112c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final int f4113d = 31;

    /* renamed from: a  reason: collision with root package name */
    public final byte f4114a;

    /* renamed from: b  reason: collision with root package name */
    public int f4115b;

    public g(InputStream inputStream, int i8) {
        super(inputStream);
        if (i8 < -1 || i8 > 8) {
            throw new IllegalArgumentException(q.a("Cannot add invalid orientation: ", i8));
        }
        this.f4114a = (byte) i8;
    }

    public final void mark(int i8) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i8;
        int i10;
        int i11 = this.f4115b;
        if (i11 < 2 || i11 > (i10 = f4113d)) {
            i8 = super.read();
        } else if (i11 == i10) {
            i8 = this.f4114a;
        } else {
            i8 = f4112c[i11 - 2] & 255;
        }
        if (i8 != -1) {
            this.f4115b++;
        }
        return i8;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f4115b = (int) (((long) this.f4115b) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i8, int i10) {
        int i11;
        int i12 = this.f4115b;
        int i13 = f4113d;
        if (i12 > i13) {
            i11 = super.read(bArr, i8, i10);
        } else if (i12 == i13) {
            bArr[i8] = this.f4114a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i8, 2 - i12);
        } else {
            int min = Math.min(i13 - i12, i10);
            System.arraycopy(f4112c, this.f4115b - 2, bArr, i8, min);
            i11 = min;
        }
        if (i11 > 0) {
            this.f4115b += i11;
        }
        return i11;
    }
}
