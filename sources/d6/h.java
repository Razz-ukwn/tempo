package d6;

import d6.n;
import java.util.Map;

public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f7325a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f7326b;

    /* renamed from: c  reason: collision with root package name */
    public final m f7327c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7328d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7329e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f7330f;

    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public String f7331a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f7332b;

        /* renamed from: c  reason: collision with root package name */
        public m f7333c;

        /* renamed from: d  reason: collision with root package name */
        public Long f7334d;

        /* renamed from: e  reason: collision with root package name */
        public Long f7335e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f7336f;

        public final h b() {
            String str = this.f7331a == null ? " transportName" : "";
            if (this.f7333c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f7334d == null) {
                str = h4.a.c(str, " eventMillis");
            }
            if (this.f7335e == null) {
                str = h4.a.c(str, " uptimeMillis");
            }
            if (this.f7336f == null) {
                str = h4.a.c(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f7331a, this.f7332b, this.f7333c, this.f7334d.longValue(), this.f7335e.longValue(), this.f7336f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.f7333c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f7331a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f7325a = str;
        this.f7326b = num;
        this.f7327c = mVar;
        this.f7328d = j10;
        this.f7329e = j11;
        this.f7330f = map;
    }

    public final Map<String, String> b() {
        return this.f7330f;
    }

    public final Integer c() {
        return this.f7326b;
    }

    public final m d() {
        return this.f7327c;
    }

    public final long e() {
        return this.f7328d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f7326b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof d6.n
            r2 = 0
            if (r1 == 0) goto L_0x005b
            d6.n r8 = (d6.n) r8
            java.lang.String r1 = r8.g()
            java.lang.String r3 = r7.f7325a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f7326b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.c()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            d6.m r1 = r7.f7327c
            d6.m r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f7328d
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f7329e
            long r5 = r8.h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f7330f
            java.util.Map r8 = r8.b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.h.equals(java.lang.Object):boolean");
    }

    public final String g() {
        return this.f7325a;
    }

    public final long h() {
        return this.f7329e;
    }

    public final int hashCode() {
        int hashCode = (this.f7325a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7326b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f7328d;
        long j11 = this.f7329e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f7327c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f7330f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f7325a + ", code=" + this.f7326b + ", encodedPayload=" + this.f7327c + ", eventMillis=" + this.f7328d + ", uptimeMillis=" + this.f7329e + ", autoMetadata=" + this.f7330f + "}";
    }
}
