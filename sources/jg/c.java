package jg;

import java.util.concurrent.TimeUnit;
import sf.j;
import zf.n;

public final class c {

    /* renamed from: n  reason: collision with root package name */
    public static final c f10031n;

    /* renamed from: o  reason: collision with root package name */
    public static final c f10032o;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10033a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10034b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10035c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10036d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10037e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10038f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10039g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10040h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10041i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10042j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10043k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10044l;
    public String m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10045a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10046b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10047c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f10048d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final int f10049e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10050f;

        public final c a() {
            return new c(this.f10045a, this.f10046b, this.f10047c, -1, false, false, false, this.f10048d, this.f10049e, this.f10050f, false, false, (String) null);
        }
    }

    public static final class b {
        public static int a(int i8, String str, String str2) {
            int length = str.length();
            while (i8 < length) {
                int i10 = i8 + 1;
                if (n.z0(str2, str.charAt(i8))) {
                    return i8;
                }
                i8 = i10;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static jg.c b(jg.q r25) {
            /*
                r0 = r25
                java.lang.String r1 = "headers"
                sf.j.f(r0, r1)
                java.lang.String[] r1 = r0.f10150a
                int r1 = r1.length
                int r1 = r1 / 2
                r2 = 1
                r7 = r2
                r6 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0022:
                if (r6 >= r1) goto L_0x0186
                int r9 = r6 + 1
                java.lang.String r4 = r0.c(r6)
                java.lang.String r6 = r0.e(r6)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = zf.j.s0(r4, r5, r2)
                if (r5 == 0) goto L_0x003b
                if (r8 == 0) goto L_0x0039
                goto L_0x0043
            L_0x0039:
                r8 = r6
                goto L_0x0044
            L_0x003b:
                java.lang.String r5 = "Pragma"
                boolean r4 = zf.j.s0(r4, r5, r2)
                if (r4 == 0) goto L_0x017a
            L_0x0043:
                r7 = 0
            L_0x0044:
                r4 = 0
            L_0x0045:
                int r5 = r6.length()
                if (r4 >= r5) goto L_0x017a
                java.lang.String r5 = "=,;"
                int r5 = a(r4, r6, r5)
                java.lang.String r4 = r6.substring(r4, r5)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                sf.j.e(r4, r2)
                java.lang.CharSequence r4 = zf.n.Z0(r4)
                java.lang.String r4 = r4.toString()
                int r3 = r6.length()
                if (r5 == r3) goto L_0x00d9
                char r3 = r6.charAt(r5)
                r0 = 44
                if (r3 == r0) goto L_0x00d9
                char r0 = r6.charAt(r5)
                r3 = 59
                if (r0 != r3) goto L_0x0079
                goto L_0x00d9
            L_0x0079:
                int r5 = r5 + 1
                byte[] r0 = kg.b.f10474a
                int r0 = r6.length()
            L_0x0081:
                if (r5 >= r0) goto L_0x009c
                int r3 = r5 + 1
                r23 = r0
                char r0 = r6.charAt(r5)
                r24 = r1
                r1 = 32
                if (r0 == r1) goto L_0x0096
                r1 = 9
                if (r0 == r1) goto L_0x0096
                goto L_0x00a2
            L_0x0096:
                r5 = r3
                r0 = r23
                r1 = r24
                goto L_0x0081
            L_0x009c:
                r24 = r1
                int r5 = r6.length()
            L_0x00a2:
                int r0 = r6.length()
                if (r5 >= r0) goto L_0x00c2
                char r0 = r6.charAt(r5)
                r1 = 34
                if (r0 != r1) goto L_0x00c2
                int r5 = r5 + 1
                r0 = 4
                r3 = 0
                int r0 = zf.n.F0(r6, r1, r5, r3, r0)
                java.lang.String r1 = r6.substring(r5, r0)
                sf.j.e(r1, r2)
                r2 = 1
                int r0 = r0 + r2
                goto L_0x00e0
            L_0x00c2:
                r3 = 0
                java.lang.String r0 = ",;"
                int r0 = a(r5, r6, r0)
                java.lang.String r1 = r6.substring(r5, r0)
                sf.j.e(r1, r2)
                java.lang.CharSequence r1 = zf.n.Z0(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00e0
            L_0x00d9:
                r24 = r1
                r3 = 0
                int r5 = r5 + 1
                r0 = r5
                r1 = 0
            L_0x00e0:
                java.lang.String r2 = "no-cache"
                r5 = 1
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x00ed
                r10 = r5
            L_0x00ea:
                r2 = -1
                goto L_0x0172
            L_0x00ed:
                java.lang.String r2 = "no-store"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x00f7
                r11 = r5
                goto L_0x00ea
            L_0x00f7:
                java.lang.String r2 = "max-age"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x0106
                r2 = -1
                int r12 = kg.b.y(r2, r1)
                goto L_0x0172
            L_0x0106:
                r2 = -1
                java.lang.String r3 = "s-maxage"
                boolean r3 = zf.j.s0(r3, r4, r5)
                if (r3 == 0) goto L_0x0114
                int r13 = kg.b.y(r2, r1)
                goto L_0x0172
            L_0x0114:
                java.lang.String r2 = "private"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x011e
                r14 = r5
                goto L_0x00ea
            L_0x011e:
                java.lang.String r2 = "public"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x0128
                r15 = r5
                goto L_0x00ea
            L_0x0128:
                java.lang.String r2 = "must-revalidate"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x0133
                r16 = r5
                goto L_0x00ea
            L_0x0133:
                java.lang.String r2 = "max-stale"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x0143
                r2 = 2147483647(0x7fffffff, float:NaN)
                int r17 = kg.b.y(r2, r1)
                goto L_0x00ea
            L_0x0143:
                java.lang.String r2 = "min-fresh"
                boolean r2 = zf.j.s0(r2, r4, r5)
                if (r2 == 0) goto L_0x0151
                r2 = -1
                int r18 = kg.b.y(r2, r1)
                goto L_0x0172
            L_0x0151:
                r2 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = zf.j.s0(r1, r4, r5)
                if (r1 == 0) goto L_0x015d
                r19 = r5
                goto L_0x0172
            L_0x015d:
                java.lang.String r1 = "no-transform"
                boolean r1 = zf.j.s0(r1, r4, r5)
                if (r1 == 0) goto L_0x0168
                r20 = r5
                goto L_0x0172
            L_0x0168:
                java.lang.String r1 = "immutable"
                boolean r1 = zf.j.s0(r1, r4, r5)
                if (r1 == 0) goto L_0x0172
                r21 = r5
            L_0x0172:
                r4 = r0
                r2 = r5
                r1 = r24
                r0 = r25
                goto L_0x0045
            L_0x017a:
                r24 = r1
                r5 = r2
                r2 = -1
                r0 = r25
                r2 = r5
                r6 = r9
                r1 = r24
                goto L_0x0022
            L_0x0186:
                if (r7 != 0) goto L_0x018b
                r22 = 0
                goto L_0x018d
            L_0x018b:
                r22 = r8
            L_0x018d:
                jg.c r0 = new jg.c
                r9 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.c.b.b(jg.q):jg.c");
        }
    }

    static {
        a aVar = new a();
        aVar.f10045a = true;
        f10031n = aVar.a();
        a aVar2 = new a();
        aVar2.f10050f = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j.f(timeUnit, "timeUnit");
        int i8 = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i8 = (int) seconds;
        }
        aVar2.f10048d = i8;
        f10032o = aVar2.a();
    }

    public c(boolean z10, boolean z11, int i8, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str) {
        this.f10033a = z10;
        this.f10034b = z11;
        this.f10035c = i8;
        this.f10036d = i10;
        this.f10037e = z12;
        this.f10038f = z13;
        this.f10039g = z14;
        this.f10040h = i11;
        this.f10041i = i12;
        this.f10042j = z15;
        this.f10043k = z16;
        this.f10044l = z17;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f10033a) {
            sb2.append("no-cache, ");
        }
        if (this.f10034b) {
            sb2.append("no-store, ");
        }
        int i8 = this.f10035c;
        if (i8 != -1) {
            sb2.append("max-age=");
            sb2.append(i8);
            sb2.append(", ");
        }
        int i10 = this.f10036d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.f10037e) {
            sb2.append("private, ");
        }
        if (this.f10038f) {
            sb2.append("public, ");
        }
        if (this.f10039g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.f10040h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f10041i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f10042j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f10043k) {
            sb2.append("no-transform, ");
        }
        if (this.f10044l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        this.m = sb3;
        return sb3;
    }
}
