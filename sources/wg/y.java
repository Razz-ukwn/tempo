package wg;

import ag.d;
import java.io.OutputStream;
import sf.j;

public final class y implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f16806a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f16807b;

    public y(OutputStream outputStream, j0 j0Var) {
        this.f16806a = outputStream;
        this.f16807b = j0Var;
    }

    public final void B(e eVar, long j10) {
        j.f(eVar, "source");
        d.d(eVar.f16752b, 0, j10);
        while (j10 > 0) {
            this.f16807b.f();
            d0 d0Var = eVar.f16751a;
            j.c(d0Var);
            int min = (int) Math.min(j10, (long) (d0Var.f16746c - d0Var.f16745b));
            this.f16806a.write(d0Var.f16744a, d0Var.f16745b, min);
            int i8 = d0Var.f16745b + min;
            d0Var.f16745b = i8;
            long j11 = (long) min;
            j10 -= j11;
            eVar.f16752b -= j11;
            if (i8 == d0Var.f16746c) {
                eVar.f16751a = d0Var.a();
                e0.a(d0Var);
            }
        }
    }

    public final j0 b() {
        return this.f16807b;
    }

    public final void close() {
        this.f16806a.close();
    }

    public final void flush() {
        this.f16806a.flush();
    }

    public final String toString() {
        return "sink(" + this.f16806a + ')';
    }
}
