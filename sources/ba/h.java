package ba;

import b3.x;
import ba.b0;

public final class h extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f3469a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3470b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3471c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f3472d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3473e;

    /* renamed from: f  reason: collision with root package name */
    public final b0.e.a f3474f;

    /* renamed from: g  reason: collision with root package name */
    public final b0.e.f f3475g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e.C0051e f3476h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.e.c f3477i;

    /* renamed from: j  reason: collision with root package name */
    public final c0<b0.e.d> f3478j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3479k;

    public static final class a extends b0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f3480a;

        /* renamed from: b  reason: collision with root package name */
        public String f3481b;

        /* renamed from: c  reason: collision with root package name */
        public Long f3482c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3483d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f3484e;

        /* renamed from: f  reason: collision with root package name */
        public b0.e.a f3485f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e.f f3486g;

        /* renamed from: h  reason: collision with root package name */
        public b0.e.C0051e f3487h;

        /* renamed from: i  reason: collision with root package name */
        public b0.e.c f3488i;

        /* renamed from: j  reason: collision with root package name */
        public c0<b0.e.d> f3489j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f3490k;

        public a() {
        }

        public final h a() {
            String str = this.f3480a == null ? " generator" : "";
            if (this.f3481b == null) {
                str = str.concat(" identifier");
            }
            if (this.f3482c == null) {
                str = h4.a.c(str, " startedAt");
            }
            if (this.f3484e == null) {
                str = h4.a.c(str, " crashed");
            }
            if (this.f3485f == null) {
                str = h4.a.c(str, " app");
            }
            if (this.f3490k == null) {
                str = h4.a.c(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new h(this.f3480a, this.f3481b, this.f3482c.longValue(), this.f3483d, this.f3484e.booleanValue(), this.f3485f, this.f3486g, this.f3487h, this.f3488i, this.f3489j, this.f3490k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public a(b0.e eVar) {
            this.f3480a = eVar.e();
            this.f3481b = eVar.g();
            this.f3482c = Long.valueOf(eVar.i());
            this.f3483d = eVar.c();
            this.f3484e = Boolean.valueOf(eVar.k());
            this.f3485f = eVar.a();
            this.f3486g = eVar.j();
            this.f3487h = eVar.h();
            this.f3488i = eVar.b();
            this.f3489j = eVar.d();
            this.f3490k = Integer.valueOf(eVar.f());
        }
    }

    public h() {
        throw null;
    }

    public h(String str, String str2, long j10, Long l10, boolean z10, b0.e.a aVar, b0.e.f fVar, b0.e.C0051e eVar, b0.e.c cVar, c0 c0Var, int i8) {
        this.f3469a = str;
        this.f3470b = str2;
        this.f3471c = j10;
        this.f3472d = l10;
        this.f3473e = z10;
        this.f3474f = aVar;
        this.f3475g = fVar;
        this.f3476h = eVar;
        this.f3477i = cVar;
        this.f3478j = c0Var;
        this.f3479k = i8;
    }

    public final b0.e.a a() {
        return this.f3474f;
    }

    public final b0.e.c b() {
        return this.f3477i;
    }

    public final Long c() {
        return this.f3472d;
    }

    public final c0<b0.e.d> d() {
        return this.f3478j;
    }

    public final String e() {
        return this.f3469a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f3472d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f3475g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f3476h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f3477i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f3478j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof ba.b0.e
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            ba.b0$e r8 = (ba.b0.e) r8
            java.lang.String r1 = r8.e()
            java.lang.String r3 = r7.f3469a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f3470b
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f3471c
            long r5 = r8.i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f3472d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f3473e
            boolean r3 = r8.k()
            if (r1 != r3) goto L_0x00b3
            ba.b0$e$a r1 = r7.f3474f
            ba.b0$e$a r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            ba.b0$e$f r1 = r7.f3475g
            if (r1 != 0) goto L_0x0061
            ba.b0$e$f r1 = r8.j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            ba.b0$e$f r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            ba.b0$e$e r1 = r7.f3476h
            if (r1 != 0) goto L_0x0076
            ba.b0$e$e r1 = r8.h()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            ba.b0$e$e r3 = r8.h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            ba.b0$e$c r1 = r7.f3477i
            if (r1 != 0) goto L_0x008b
            ba.b0$e$c r1 = r8.b()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            ba.b0$e$c r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            ba.c0<ba.b0$e$d> r1 = r7.f3478j
            if (r1 != 0) goto L_0x00a0
            ba.c0 r1 = r8.d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            ba.c0 r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f3479k
            int r8 = r8.f()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.h.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f3479k;
    }

    public final String g() {
        return this.f3470b;
    }

    public final b0.e.C0051e h() {
        return this.f3476h;
    }

    public final int hashCode() {
        long j10 = this.f3471c;
        int hashCode = (((((this.f3469a.hashCode() ^ 1000003) * 1000003) ^ this.f3470b.hashCode()) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i8 = 0;
        Long l10 = this.f3472d;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f3473e ? 1231 : 1237)) * 1000003) ^ this.f3474f.hashCode()) * 1000003;
        b0.e.f fVar = this.f3475g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        b0.e.C0051e eVar = this.f3476h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        b0.e.c cVar = this.f3477i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        c0<b0.e.d> c0Var = this.f3478j;
        if (c0Var != null) {
            i8 = c0Var.hashCode();
        }
        return ((hashCode5 ^ i8) * 1000003) ^ this.f3479k;
    }

    public final long i() {
        return this.f3471c;
    }

    public final b0.e.f j() {
        return this.f3475g;
    }

    public final boolean k() {
        return this.f3473e;
    }

    public final a l() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f3469a);
        sb2.append(", identifier=");
        sb2.append(this.f3470b);
        sb2.append(", startedAt=");
        sb2.append(this.f3471c);
        sb2.append(", endedAt=");
        sb2.append(this.f3472d);
        sb2.append(", crashed=");
        sb2.append(this.f3473e);
        sb2.append(", app=");
        sb2.append(this.f3474f);
        sb2.append(", user=");
        sb2.append(this.f3475g);
        sb2.append(", os=");
        sb2.append(this.f3476h);
        sb2.append(", device=");
        sb2.append(this.f3477i);
        sb2.append(", events=");
        sb2.append(this.f3478j);
        sb2.append(", generatorType=");
        return x.b(sb2, this.f3479k, "}");
    }
}
