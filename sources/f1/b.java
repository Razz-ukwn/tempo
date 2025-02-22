package f1;

import androidx.activity.result.d;
import f1.a;

public final class b {
    public static final long a(int i8, int i10, int i11, int i12) {
        long j10;
        int i13 = 0;
        if (i10 >= i8) {
            if (i12 >= i11) {
                if (i8 >= 0 && i11 >= 0) {
                    int i14 = i12 == Integer.MAX_VALUE ? i11 : i12;
                    int a10 = a.C0132a.a(i14);
                    int i15 = i10 == Integer.MAX_VALUE ? i8 : i10;
                    int a11 = a.C0132a.a(i15);
                    if (a10 + a11 <= 31) {
                        if (a11 == 13) {
                            j10 = 3;
                        } else if (a11 == 18) {
                            j10 = 1;
                        } else if (a11 == 15) {
                            j10 = 2;
                        } else if (a11 == 16) {
                            j10 = 0;
                        } else {
                            throw new IllegalStateException("Should only have the provided constants.");
                        }
                        int i16 = i10 == Integer.MAX_VALUE ? 0 : i10 + 1;
                        if (i12 != Integer.MAX_VALUE) {
                            i13 = i12 + 1;
                        }
                        int i17 = a.f8022b[(int) j10];
                        return (((long) i16) << 33) | (((long) i8) << 2) | j10 | (((long) i11) << i17) | (((long) i13) << (i17 + 31));
                    }
                    throw new IllegalArgumentException(d.b("Can't represent a width of ", i15, " and height of ", i14, " in Constraints"));
                }
                throw new IllegalArgumentException(d.b("minWidth(", i8, ") and minHeight(", i11, ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i12 + ") must be >= than minHeight(" + i11 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i10 + ") must be >= than minWidth(" + i8 + ')').toString());
    }
}
