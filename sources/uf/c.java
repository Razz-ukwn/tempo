package uf;

import java.io.Serializable;
import mf.b;
import sf.j;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16031a = new a(0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f16032b = b.f11479a.b();

    public static final class a extends c implements Serializable {
        public a(int i8) {
        }

        public final int a(int i8) {
            return c.f16032b.a(i8);
        }

        public final int b() {
            return c.f16032b.b();
        }

        public final int c(int i8, int i10) {
            return c.f16032b.c(i8, i10);
        }
    }

    public abstract int a(int i8);

    public abstract int b();

    public int c(int i8, int i10) {
        int i11;
        int b10;
        int i12;
        int b11;
        boolean z10;
        if (i10 > i8) {
            int i13 = i10 - i8;
            if (i13 > 0 || i13 == Integer.MIN_VALUE) {
                if (((-i13) & i13) == i13) {
                    i11 = a(31 - Integer.numberOfLeadingZeros(i13));
                } else {
                    do {
                        b10 = b() >>> 1;
                        i12 = b10 % i13;
                    } while ((i13 - 1) + (b10 - i12) < 0);
                    i11 = i12;
                }
                return i8 + i11;
            }
            do {
                b11 = b();
                if (i8 > b11 || b11 >= i10) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
            } while (!z10);
            return b11;
        }
        Integer valueOf = Integer.valueOf(i8);
        Integer valueOf2 = Integer.valueOf(i10);
        j.f(valueOf, "from");
        j.f(valueOf2, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
    }
}
