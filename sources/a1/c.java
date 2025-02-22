package a1;

import androidx.activity.result.d;
import rb.b;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final int f22a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23b;

    public c(int i8, int i10) {
        this.f22a = i8;
        this.f23b = i10;
        if (!(i8 >= 0 && i10 >= 0)) {
            throw new IllegalArgumentException(d.b("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i8, " and ", i10, " respectively.").toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (a1.c) r5;
        r1 = r5.f22a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof a1.c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            a1.c r5 = (a1.c) r5
            int r1 = r5.f22a
            int r3 = r4.f22a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.f23b
            int r5 = r5.f23b
            if (r1 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f22a * 31) + this.f23b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f22a);
        sb2.append(", lengthAfterCursor=");
        return b.a(sb2, this.f23b, ')');
    }
}
