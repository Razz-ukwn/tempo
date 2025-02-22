package a1;

import rb.b;

public final class x implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f65a;

    /* renamed from: b  reason: collision with root package name */
    public final int f66b;

    public x(int i8, int i10) {
        this.f65a = i8;
        this.f66b = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (a1.x) r5;
        r1 = r5.f65a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof a1.x
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a1.x r5 = (a1.x) r5
            int r1 = r5.f65a
            int r3 = r4.f65a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.f66b
            int r5 = r5.f66b
            if (r1 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f65a * 31) + this.f66b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f65a);
        sb2.append(", end=");
        return b.a(sb2, this.f66b, ')');
    }
}
