package gf;

public final class v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f8981a;

    /* renamed from: b  reason: collision with root package name */
    public final T f8982b;

    public v(int i8, T t2) {
        this.f8981a = i8;
        this.f8982b = t2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (gf.v) r5;
        r1 = r5.f8981a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof gf.v
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            gf.v r5 = (gf.v) r5
            int r1 = r5.f8981a
            int r3 = r4.f8981a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            T r1 = r4.f8982b
            T r5 = r5.f8982b
            boolean r5 = sf.j.a(r1, r5)
            if (r5 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.v.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f8981a) * 31;
        T t2 = this.f8982b;
        return hashCode + (t2 == null ? 0 : t2.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f8981a + ", value=" + this.f8982b + ')';
    }
}
