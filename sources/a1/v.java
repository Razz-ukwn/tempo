package a1;

import rb.b;

public final class v implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f61a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62b;

    public v(int i8, int i10) {
        this.f61a = i8;
        this.f62b = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (a1.v) r5;
        r1 = r5.f61a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof a1.v
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a1.v r5 = (a1.v) r5
            int r1 = r5.f61a
            int r3 = r4.f61a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.f62b
            int r5 = r5.f62b
            if (r1 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.v.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f61a * 31) + this.f62b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f61a);
        sb2.append(", end=");
        return b.a(sb2, this.f62b, ')');
    }
}
