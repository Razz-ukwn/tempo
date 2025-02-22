package f1;

import h0.g;
import q4.a;

public interface c {
    float getDensity();

    float m();

    float n(float f10) {
        return getDensity() * f10;
    }

    int r(float f10) {
        float n2 = n(f10);
        if (Float.isInfinite(n2)) {
            return Integer.MAX_VALUE;
        }
        return a.g(n2);
    }

    long w(long j10) {
        int i8 = (j10 > g.f8033b ? 1 : (j10 == g.f8033b ? 0 : -1));
        boolean z10 = true;
        if (!(i8 != 0)) {
            return g.f9087c;
        }
        if (i8 != 0) {
            float n2 = n(Float.intBitsToFloat((int) (j10 >> 32)));
            if (i8 == 0) {
                z10 = false;
            }
            if (z10) {
                return cb.c.f(n2, n(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            }
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    float x(long j10) {
        if (l.a(k.b(j10), 4294967296L)) {
            return getDensity() * m() * k.c(j10);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
}
