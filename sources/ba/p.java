package ba;

import b3.x;
import ba.b0;

public final class p extends b0.e.d.a.b.C0046b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3549a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3550b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0047d.C0048a> f3551c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.C0046b f3552d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3553e;

    public p() {
        throw null;
    }

    public p(String str, String str2, c0 c0Var, b0.e.d.a.b.C0046b bVar, int i8) {
        this.f3549a = str;
        this.f3550b = str2;
        this.f3551c = c0Var;
        this.f3552d = bVar;
        this.f3553e = i8;
    }

    public final b0.e.d.a.b.C0046b a() {
        return this.f3552d;
    }

    public final c0<b0.e.d.a.b.C0047d.C0048a> b() {
        return this.f3551c;
    }

    public final int c() {
        return this.f3553e;
    }

    public final String d() {
        return this.f3550b;
    }

    public final String e() {
        return this.f3549a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f3552d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f3550b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof ba.b0.e.d.a.b.C0046b
            r2 = 0
            if (r1 == 0) goto L_0x0058
            ba.b0$e$d$a$b$b r5 = (ba.b0.e.d.a.b.C0046b) r5
            java.lang.String r1 = r5.e()
            java.lang.String r3 = r4.f3549a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f3550b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.d()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            ba.c0<ba.b0$e$d$a$b$d$a> r1 = r4.f3551c
            ba.c0 r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            ba.b0$e$d$a$b$b r1 = r4.f3552d
            if (r1 != 0) goto L_0x0043
            ba.b0$e$d$a$b$b r1 = r5.a()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            ba.b0$e$d$a$b$b r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f3553e
            int r5 = r5.c()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f3549a.hashCode() ^ 1000003) * 1000003;
        int i8 = 0;
        String str = this.f3550b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3551c.hashCode()) * 1000003;
        b0.e.d.a.b.C0046b bVar = this.f3552d;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((hashCode2 ^ i8) * 1000003) ^ this.f3553e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f3549a);
        sb2.append(", reason=");
        sb2.append(this.f3550b);
        sb2.append(", frames=");
        sb2.append(this.f3551c);
        sb2.append(", causedBy=");
        sb2.append(this.f3552d);
        sb2.append(", overflowCount=");
        return x.b(sb2, this.f3553e, "}");
    }
}
