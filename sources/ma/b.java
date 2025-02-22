package ma;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f11351a = 0;

    public final void write(int i8) {
        this.f11351a++;
    }

    public final void write(byte[] bArr) {
        this.f11351a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i8, int i10) {
        int i11;
        if (i8 < 0 || i8 > bArr.length || i10 < 0 || (i11 = i8 + i10) > bArr.length || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f11351a += (long) i10;
    }
}
