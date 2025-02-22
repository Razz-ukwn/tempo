package f1;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f8022b = {18, 20, 17, 15};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8023c = {65535, 262143, 32767, 8191};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8024d = {32767, 8191, 65535, 262143};

    /* renamed from: a  reason: collision with root package name */
    public final long f8025a;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    public static final class C0132a {
        public static int a(int i8) {
            if (i8 < 8191) {
                return 13;
            }
            if (i8 < 32767) {
                return 15;
            }
            if (i8 < 65535) {
                return 16;
            }
            if (i8 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(d.a.a("Can't represent a size of ", i8, " in Constraints"));
        }
    }

    public /* synthetic */ a(long j10) {
        this.f8025a = j10;
    }

    public static final int a(long j10) {
        int i8 = (int) (3 & j10);
        int i10 = ((int) (j10 >> (f8022b[i8] + 31))) & f8024d[i8];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int b(long j10) {
        int i8 = ((int) (j10 >> 33)) & f8023c[(int) (3 & j10)];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    public static final int c(long j10) {
        int i8 = (int) (3 & j10);
        return ((int) (j10 >> f8022b[i8])) & f8024d[i8];
    }

    public static final int d(long j10) {
        return ((int) (j10 >> 2)) & f8023c[(int) (3 & j10)];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f8025a == ((a) obj).f8025a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8025a);
    }

    public final String toString() {
        long j10 = this.f8025a;
        int b10 = b(j10);
        String str = "Infinity";
        String valueOf = b10 == Integer.MAX_VALUE ? str : String.valueOf(b10);
        int a10 = a(j10);
        if (a10 != Integer.MAX_VALUE) {
            str = String.valueOf(a10);
        }
        return "Constraints(minWidth = " + d(j10) + ", maxWidth = " + valueOf + ", minHeight = " + c(j10) + ", maxHeight = " + str + ')';
    }
}
