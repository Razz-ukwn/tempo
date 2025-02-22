package ff;

import cb.b;
import sf.j;

public final class k implements Comparable<k> {

    /* renamed from: a  reason: collision with root package name */
    public final long f8716a;

    public /* synthetic */ k(long j10) {
        this.f8716a = j10;
    }

    public final int compareTo(Object obj) {
        int i8 = ((this.f8716a ^ Long.MIN_VALUE) > (((k) obj).f8716a ^ Long.MIN_VALUE) ? 1 : ((this.f8716a ^ Long.MIN_VALUE) == (((k) obj).f8716a ^ Long.MIN_VALUE) ? 0 : -1));
        if (i8 < 0) {
            return -1;
        }
        return i8 == 0 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return this.f8716a == ((k) obj).f8716a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8716a);
    }

    public final String toString() {
        long j10 = this.f8716a;
        if (j10 >= 0) {
            b.s(10);
            String l10 = Long.toString(j10, 10);
            j.e(l10, "toString(this, checkRadix(radix))");
            return l10;
        }
        long j11 = (long) 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        b.s(10);
        String l11 = Long.toString(j12, 10);
        j.e(l11, "toString(this, checkRadix(radix))");
        b.s(10);
        String l12 = Long.toString(j13, 10);
        j.e(l12, "toString(this, checkRadix(radix))");
        return l11.concat(l12);
    }
}
