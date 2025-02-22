package m0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11116a;

    public /* synthetic */ a(int i8) {
        this.f11116a = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((m0.a) r3).f11116a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof m0.a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            m0.a r3 = (m0.a) r3
            int r3 = r3.f11116a
            int r0 = r2.f11116a
            if (r0 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11116a);
    }

    public final String toString() {
        int i8 = this.f11116a;
        boolean z10 = false;
        if (i8 == 1) {
            return "Touch";
        }
        if (i8 == 2) {
            z10 = true;
        }
        return z10 ? "Keyboard" : "Error";
    }
}
