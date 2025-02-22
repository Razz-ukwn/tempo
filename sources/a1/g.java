package a1;

public final class g {
    public /* synthetic */ g() {
        throw null;
    }

    public static String a(int i8) {
        boolean z10 = false;
        if (i8 == 0) {
            return "None";
        }
        if (i8 == 1) {
            return "Default";
        }
        if (i8 == 2) {
            return "Go";
        }
        if (i8 == 3) {
            return "Search";
        }
        if (i8 == 4) {
            return "Send";
        }
        if (i8 == 5) {
            return "Previous";
        }
        if (i8 == 6) {
            return "Next";
        }
        if (i8 == 7) {
            z10 = true;
        }
        return z10 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        ((g) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0);
    }
}
