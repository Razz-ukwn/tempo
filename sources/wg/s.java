package wg;

import d2.f1;
import java.io.IOException;
import java.io.InputStream;
import sf.j;

public final class s implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f16800a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f16801b;

    public s(InputStream inputStream, j0 j0Var) {
        j.f(inputStream, "input");
        j.f(j0Var, "timeout");
        this.f16800a = inputStream;
        this.f16801b = j0Var;
    }

    public final long a0(e eVar, long j10) {
        j.f(eVar, "sink");
        int i8 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i8 == 0) {
            return 0;
        }
        if (i8 >= 0) {
            try {
                this.f16801b.f();
                d0 e02 = eVar.e0(1);
                int read = this.f16800a.read(e02.f16744a, e02.f16746c, (int) Math.min(j10, (long) (8192 - e02.f16746c)));
                if (read != -1) {
                    e02.f16746c += read;
                    long j11 = (long) read;
                    eVar.f16752b += j11;
                    return j11;
                } else if (e02.f16745b != e02.f16746c) {
                    return -1;
                } else {
                    eVar.f16751a = e02.a();
                    e0.a(e02);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (f1.A(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    public final j0 b() {
        return this.f16801b;
    }

    public final void close() {
        this.f16800a.close();
    }

    public final String toString() {
        return "source(" + this.f16800a + ')';
    }
}
