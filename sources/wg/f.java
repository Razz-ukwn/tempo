package wg;

import java.io.OutputStream;
import sf.j;

public final class f extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f16757a;

    public f(e eVar) {
        this.f16757a = eVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f16757a + ".outputStream()";
    }

    public final void write(int i8) {
        this.f16757a.g0(i8);
    }

    public final void write(byte[] bArr, int i8, int i10) {
        j.f(bArr, "data");
        this.f16757a.write(bArr, i8, i10);
    }
}
