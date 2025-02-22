package a1;

import rb.b;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f25a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26b;

    public d(int i8, int i10) {
        this.f25a = i8;
        this.f26b = i10;
        if (!(i8 >= 0 && i10 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.d.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i8, " and ", i10, " respectively.").toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (a1.d) r5;
        r1 = r5.f25a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof a1.d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a1.d r5 = (a1.d) r5
            int r1 = r5.f25a
            int r3 = r4.f25a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.f26b
            int r5 = r5.f26b
            if (r1 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f25a * 31) + this.f26b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f25a);
        sb2.append(", lengthAfterCursor=");
        return b.a(sb2, this.f26b, ')');
    }
}
