package ba;

import b3.x;
import ba.b0;

public final class m extends b0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final b0.e.d.a.b f3526a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<b0.c> f3527b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.c> f3528c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f3529d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3530e;

    public static final class a extends b0.e.d.a.C0043a {

        /* renamed from: a  reason: collision with root package name */
        public b0.e.d.a.b f3531a;

        /* renamed from: b  reason: collision with root package name */
        public c0<b0.c> f3532b;

        /* renamed from: c  reason: collision with root package name */
        public c0<b0.c> f3533c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f3534d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f3535e;

        public a(b0.e.d.a aVar) {
            this.f3531a = aVar.c();
            this.f3532b = aVar.b();
            this.f3533c = aVar.d();
            this.f3534d = aVar.a();
            this.f3535e = Integer.valueOf(aVar.e());
        }

        public final m a() {
            String str = this.f3531a == null ? " execution" : "";
            if (this.f3535e == null) {
                str = str.concat(" uiOrientation");
            }
            if (str.isEmpty()) {
                return new m(this.f3531a, this.f3532b, this.f3533c, this.f3534d, this.f3535e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public m() {
        throw null;
    }

    public m(b0.e.d.a.b bVar, c0 c0Var, c0 c0Var2, Boolean bool, int i8) {
        this.f3526a = bVar;
        this.f3527b = c0Var;
        this.f3528c = c0Var2;
        this.f3529d = bool;
        this.f3530e = i8;
    }

    public final Boolean a() {
        return this.f3529d;
    }

    public final c0<b0.c> b() {
        return this.f3527b;
    }

    public final b0.e.d.a.b c() {
        return this.f3526a;
    }

    public final c0<b0.c> d() {
        return this.f3528c;
    }

    public final int e() {
        return this.f3530e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f3528c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f3529d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f3527b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof ba.b0.e.d.a
            r2 = 0
            if (r1 == 0) goto L_0x0061
            ba.b0$e$d$a r5 = (ba.b0.e.d.a) r5
            ba.b0$e$d$a$b r1 = r5.c()
            ba.b0$e$d$a$b r3 = r4.f3526a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x005f
            ba.c0<ba.b0$c> r1 = r4.f3527b
            if (r1 != 0) goto L_0x0022
            ba.c0 r1 = r5.b()
            if (r1 != 0) goto L_0x005f
            goto L_0x002c
        L_0x0022:
            ba.c0 r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x002c:
            ba.c0<ba.b0$c> r1 = r4.f3528c
            if (r1 != 0) goto L_0x0037
            ba.c0 r1 = r5.d()
            if (r1 != 0) goto L_0x005f
            goto L_0x0041
        L_0x0037:
            ba.c0 r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0041:
            java.lang.Boolean r1 = r4.f3529d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.a()
            if (r1 != 0) goto L_0x005f
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0056:
            int r1 = r4.f3530e
            int r5 = r5.e()
            if (r1 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.equals(java.lang.Object):boolean");
    }

    public final a f() {
        return new a(this);
    }

    public final int hashCode() {
        int hashCode = (this.f3526a.hashCode() ^ 1000003) * 1000003;
        int i8 = 0;
        c0<b0.c> c0Var = this.f3527b;
        int hashCode2 = (hashCode ^ (c0Var == null ? 0 : c0Var.hashCode())) * 1000003;
        c0<b0.c> c0Var2 = this.f3528c;
        int hashCode3 = (hashCode2 ^ (c0Var2 == null ? 0 : c0Var2.hashCode())) * 1000003;
        Boolean bool = this.f3529d;
        if (bool != null) {
            i8 = bool.hashCode();
        }
        return ((hashCode3 ^ i8) * 1000003) ^ this.f3530e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f3526a);
        sb2.append(", customAttributes=");
        sb2.append(this.f3527b);
        sb2.append(", internalKeys=");
        sb2.append(this.f3528c);
        sb2.append(", background=");
        sb2.append(this.f3529d);
        sb2.append(", uiOrientation=");
        return x.b(sb2, this.f3530e, "}");
    }
}
