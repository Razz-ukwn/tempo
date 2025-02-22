package v0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f16042a;

    public /* synthetic */ g(int i8) {
        this.f16042a = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = ((v0.g) r3).f16042a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof v0.g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            v0.g r3 = (v0.g) r3
            int r3 = r3.f16042a
            int r0 = r2.f16042a
            if (r0 == r3) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16042a);
    }

    public final String toString() {
        int i8 = this.f16042a;
        boolean z10 = false;
        if (i8 == 0) {
            return "Button";
        }
        if (i8 == 1) {
            return "Checkbox";
        }
        if (i8 == 2) {
            return "Switch";
        }
        if (i8 == 3) {
            return "RadioButton";
        }
        if (i8 == 4) {
            return "Tab";
        }
        if (i8 == 5) {
            return "Image";
        }
        if (i8 == 6) {
            z10 = true;
        }
        return z10 ? "DropdownList" : "Unknown";
    }
}
