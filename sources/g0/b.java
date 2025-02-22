package g0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f8749a;

    public /* synthetic */ b(int i8) {
        this.f8749a = i8;
    }

    public static String a(int i8) {
        boolean z10 = false;
        if (i8 == 1) {
            return "Next";
        }
        if (i8 == 2) {
            return "Previous";
        }
        if (i8 == 3) {
            return "Left";
        }
        if (i8 == 4) {
            return "Right";
        }
        if (i8 == 5) {
            return "Up";
        }
        if (i8 == 6) {
            return "Down";
        }
        if (i8 == 7) {
            return "Enter";
        }
        if (i8 == 8) {
            z10 = true;
        }
        return z10 ? "Exit" : "Invalid FocusDirection";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((g0.b) r3).f8749a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof g0.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            g0.b r3 = (g0.b) r3
            int r3 = r3.f8749a
            int r0 = r2.f8749a
            if (r0 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8749a);
    }

    public final String toString() {
        return a(this.f8749a);
    }
}
