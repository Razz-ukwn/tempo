package f3;

import sf.j;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8242a;

    /* renamed from: b  reason: collision with root package name */
    public final v2 f8243b;

    public g0(int i8, v2 v2Var) {
        j.f(v2Var, "hint");
        this.f8242a = i8;
        this.f8243b = v2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (f3.g0) r5;
        r1 = r5.f8242a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof f3.g0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            f3.g0 r5 = (f3.g0) r5
            int r1 = r5.f8242a
            int r3 = r4.f8242a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            f3.v2 r1 = r4.f8243b
            f3.v2 r5 = r5.f8243b
            boolean r5 = sf.j.a(r1, r5)
            if (r5 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.g0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f8243b.hashCode() + (Integer.hashCode(this.f8242a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f8242a + ", hint=" + this.f8243b + ')';
    }
}
