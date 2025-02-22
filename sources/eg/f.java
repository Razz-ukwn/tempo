package eg;

import q.n;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8017a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8018b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8019c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8020d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8021e;

    public f() {
        this(0);
    }

    public f(int i8) {
        this.f8017a = true;
        this.f8018b = 1.0f;
        this.f8019c = 0.5f;
        this.f8020d = 8.0f;
        this.f8021e = 1.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (eg.f) r5;
        r1 = r5.f8017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof eg.f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            eg.f r5 = (eg.f) r5
            boolean r1 = r5.f8017a
            boolean r3 = r4.f8017a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            float r1 = r4.f8018b
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r5.f8018b
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0026
            return r2
        L_0x0026:
            float r1 = r4.f8019c
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r5.f8019c
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0039
            return r2
        L_0x0039:
            float r1 = r4.f8020d
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r5.f8020d
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x004c
            return r2
        L_0x004c:
            float r1 = r4.f8021e
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r5 = r5.f8021e
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            boolean r5 = sf.j.a(r1, r5)
            if (r5 != 0) goto L_0x005f
            return r2
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z10 = this.f8017a;
        if (z10) {
            z10 = true;
        }
        return Float.hashCode(this.f8021e) + n.a(this.f8020d, n.a(this.f8019c, n.a(this.f8018b, (z10 ? 1 : 0) * true, 31), 31), 31);
    }

    public final String toString() {
        return "Rotation(enabled=" + this.f8017a + ", speed=" + this.f8018b + ", variance=" + this.f8019c + ", multiplier2D=" + this.f8020d + ", multiplier3D=" + this.f8021e + ')';
    }
}
