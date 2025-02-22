package z0;

public final class n {
    public static String a(int i8) {
        boolean z10 = false;
        if (i8 == 0) {
            return "Normal";
        }
        if (i8 == 1) {
            z10 = true;
        }
        return z10 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        ((n) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0);
    }
}
