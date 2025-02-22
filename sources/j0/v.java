package j0;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final double f9731a;

    /* renamed from: b  reason: collision with root package name */
    public final double f9732b;

    /* renamed from: c  reason: collision with root package name */
    public final double f9733c;

    /* renamed from: d  reason: collision with root package name */
    public final double f9734d;

    /* renamed from: e  reason: collision with root package name */
    public final double f9735e;

    /* renamed from: f  reason: collision with root package name */
    public final double f9736f = 0.0d;

    /* renamed from: g  reason: collision with root package name */
    public final double f9737g = 0.0d;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if ((r6 == 0.0d) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0093, code lost:
        if ((r6 == 0.0d) != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(double r6, double r8, double r10, double r12, double r14) {
        /*
            r5 = this;
            r5.<init>()
            r5.f9731a = r6
            r5.f9732b = r8
            r5.f9733c = r10
            r5.f9734d = r12
            r5.f9735e = r14
            r0 = 0
            r5.f9736f = r0
            r5.f9737g = r0
            boolean r2 = java.lang.Double.isNaN(r8)
            if (r2 != 0) goto L_0x00d4
            boolean r10 = java.lang.Double.isNaN(r10)
            if (r10 != 0) goto L_0x00d4
            boolean r10 = java.lang.Double.isNaN(r12)
            if (r10 != 0) goto L_0x00d4
            boolean r10 = java.lang.Double.isNaN(r14)
            if (r10 != 0) goto L_0x00d4
            boolean r10 = java.lang.Double.isNaN(r0)
            if (r10 != 0) goto L_0x00d4
            boolean r10 = java.lang.Double.isNaN(r0)
            if (r10 != 0) goto L_0x00d4
            boolean r10 = java.lang.Double.isNaN(r6)
            if (r10 != 0) goto L_0x00d4
            int r10 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x00c0
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00c0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x004f
            r2 = r3
            goto L_0x0050
        L_0x004f:
            r2 = r4
        L_0x0050:
            if (r2 == 0) goto L_0x006d
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0058
            r2 = r3
            goto L_0x0059
        L_0x0058:
            r2 = r4
        L_0x0059:
            if (r2 != 0) goto L_0x0065
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0061
            r2 = r3
            goto L_0x0062
        L_0x0061:
            r2 = r4
        L_0x0062:
            if (r2 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter a or g is zero, the transfer function is constant"
            r6.<init>(r7)
            throw r6
        L_0x006d:
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0083
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x0077
            r10 = r3
            goto L_0x0078
        L_0x0077:
            r10 = r4
        L_0x0078:
            if (r10 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter c is zero, the transfer function is constant"
            r6.<init>(r7)
            throw r6
        L_0x0083:
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0089
            r9 = r3
            goto L_0x008a
        L_0x0089:
            r9 = r4
        L_0x008a:
            if (r9 != 0) goto L_0x0095
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0092
            r9 = r3
            goto L_0x0093
        L_0x0092:
            r9 = r4
        L_0x0093:
            if (r9 == 0) goto L_0x009d
        L_0x0095:
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r3 = r4
        L_0x009b:
            if (r3 != 0) goto L_0x00b8
        L_0x009d:
            int r9 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x00b0
            if (r8 < 0) goto L_0x00a8
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x00a8
            return
        L_0x00a8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The transfer function must be positive or increasing"
            r6.<init>(r7)
            throw r6
        L_0x00b0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The transfer function must be increasing"
            r6.<init>(r7)
            throw r6
        L_0x00b8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter a or g is zero, and c is zero, the transfer function is constant"
            r6.<init>(r7)
            throw r6
        L_0x00c0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Parameter d must be in the range [0..1], was "
            r7.<init>(r8)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x00d4:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameters cannot be NaN"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v.<init>(double, double, double, double, double):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Double.compare(this.f9731a, vVar.f9731a) == 0 && Double.compare(this.f9732b, vVar.f9732b) == 0 && Double.compare(this.f9733c, vVar.f9733c) == 0 && Double.compare(this.f9734d, vVar.f9734d) == 0 && Double.compare(this.f9735e, vVar.f9735e) == 0 && Double.compare(this.f9736f, vVar.f9736f) == 0 && Double.compare(this.f9737g, vVar.f9737g) == 0;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.f9732b);
        int hashCode2 = Double.hashCode(this.f9733c);
        int hashCode3 = Double.hashCode(this.f9734d);
        int hashCode4 = Double.hashCode(this.f9735e);
        int hashCode5 = Double.hashCode(this.f9736f);
        return Double.hashCode(this.f9737g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.f9731a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f9731a + ", a=" + this.f9732b + ", b=" + this.f9733c + ", c=" + this.f9734d + ", d=" + this.f9735e + ", e=" + this.f9736f + ", f=" + this.f9737g + ')';
    }
}
