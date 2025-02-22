package gg;

import q.n;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f8996d = new b(6, 4.0f, 4);

    /* renamed from: e  reason: collision with root package name */
    public static final b f8997e = new b(8, 0.0f, 6);

    /* renamed from: f  reason: collision with root package name */
    public static final b f8998f = new b(10, 6.0f, 4);

    /* renamed from: a  reason: collision with root package name */
    public final int f8999a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9000b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9001c;

    public b(int i8, float f10, int i10) {
        f10 = (i10 & 2) != 0 ? 5.0f : f10;
        float f11 = (i10 & 4) != 0 ? 0.2f : 0.0f;
        this.f8999a = i8;
        this.f9000b = f10;
        this.f9001c = f11;
        if (!(!(f10 == 0.0f))) {
            throw new IllegalArgumentException(("mass=" + f10 + " must be != 0").toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (gg.b) r5;
        r1 = r5.f8999a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof gg.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            gg.b r5 = (gg.b) r5
            int r1 = r5.f8999a
            int r3 = r4.f8999a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            float r1 = r4.f9000b
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r3 = r5.f9000b
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = sf.j.a(r1, r3)
            if (r1 != 0) goto L_0x0026
            return r2
        L_0x0026:
            float r1 = r4.f9001c
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r5 = r5.f9001c
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            boolean r5 = sf.j.a(r1, r5)
            if (r5 != 0) goto L_0x0039
            return r2
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Float.hashCode(this.f9001c) + n.a(this.f9000b, Integer.hashCode(this.f8999a) * 31, 31);
    }

    public final String toString() {
        return "Size(sizeInDp=" + this.f8999a + ", mass=" + this.f9000b + ", massVariance=" + this.f9001c + ')';
    }
}
