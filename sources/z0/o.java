package z0;

public final class o {
    public static String a(int i8) {
        boolean z10 = false;
        if (i8 == 0) {
            return "None";
        }
        if (i8 == 1) {
            return "All";
        }
        if (i8 == 2) {
            return "Weight";
        }
        if (i8 == 3) {
            z10 = true;
        }
        return z10 ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        ((o) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0);
    }
}
