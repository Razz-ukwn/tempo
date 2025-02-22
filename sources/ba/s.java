package ba;

import b3.x;
import ba.b0;

public final class s extends b0.e.d.a.b.C0047d.C0048a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3560a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3561b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3562c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3563d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3564e;

    public static final class a extends b0.e.d.a.b.C0047d.C0048a.C0049a {

        /* renamed from: a  reason: collision with root package name */
        public Long f3565a;

        /* renamed from: b  reason: collision with root package name */
        public String f3566b;

        /* renamed from: c  reason: collision with root package name */
        public String f3567c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3568d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f3569e;

        public final s a() {
            String str = this.f3565a == null ? " pc" : "";
            if (this.f3566b == null) {
                str = str.concat(" symbol");
            }
            if (this.f3568d == null) {
                str = h4.a.c(str, " offset");
            }
            if (this.f3569e == null) {
                str = h4.a.c(str, " importance");
            }
            if (str.isEmpty()) {
                return new s(this.f3565a.longValue(), this.f3566b, this.f3567c, this.f3568d.longValue(), this.f3569e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public s(long j10, String str, String str2, long j11, int i8) {
        this.f3560a = j10;
        this.f3561b = str;
        this.f3562c = str2;
        this.f3563d = j11;
        this.f3564e = i8;
    }

    public final String a() {
        return this.f3562c;
    }

    public final int b() {
        return this.f3564e;
    }

    public final long c() {
        return this.f3563d;
    }

    public final long d() {
        return this.f3560a;
    }

    public final String e() {
        return this.f3561b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f3562c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof ba.b0.e.d.a.b.C0047d.C0048a
            r2 = 0
            if (r1 == 0) goto L_0x004b
            ba.b0$e$d$a$b$d$a r8 = (ba.b0.e.d.a.b.C0047d.C0048a) r8
            long r3 = r8.d()
            long r5 = r7.f3560a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f3561b
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f3562c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.a()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f3563d
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f3564e
            int r8 = r8.b()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j10 = this.f3560a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f3561b.hashCode()) * 1000003;
        String str = this.f3562c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f3563d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f3564e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f3560a);
        sb2.append(", symbol=");
        sb2.append(this.f3561b);
        sb2.append(", file=");
        sb2.append(this.f3562c);
        sb2.append(", offset=");
        sb2.append(this.f3563d);
        sb2.append(", importance=");
        return x.b(sb2, this.f3564e, "}");
    }
}
