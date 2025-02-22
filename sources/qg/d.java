package qg;

import d2.f1;
import gf.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.internal.v;
import qg.q;
import qg.t;
import sf.j;
import wg.c0;
import wg.e;
import wg.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f13626a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<i, Integer> f13627b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13628a = 4096;

        /* renamed from: b  reason: collision with root package name */
        public int f13629b = 4096;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f13630c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final c0 f13631d;

        /* renamed from: e  reason: collision with root package name */
        public c[] f13632e;

        /* renamed from: f  reason: collision with root package name */
        public int f13633f;

        /* renamed from: g  reason: collision with root package name */
        public int f13634g;

        /* renamed from: h  reason: collision with root package name */
        public int f13635h;

        public a(q.b bVar) {
            this.f13631d = f1.j(bVar);
            this.f13632e = new c[8];
            this.f13633f = 7;
        }

        public final int a(int i8) {
            int i10;
            int i11 = 0;
            if (i8 > 0) {
                int length = this.f13632e.length;
                while (true) {
                    length--;
                    i10 = this.f13633f;
                    if (length < i10 || i8 <= 0) {
                        c[] cVarArr = this.f13632e;
                        System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f13634g);
                        this.f13633f += i11;
                    } else {
                        c cVar = this.f13632e[length];
                        j.c(cVar);
                        int i12 = cVar.f13625c;
                        i8 -= i12;
                        this.f13635h -= i12;
                        this.f13634g--;
                        i11++;
                    }
                }
                c[] cVarArr2 = this.f13632e;
                System.arraycopy(cVarArr2, i10 + 1, cVarArr2, i10 + 1 + i11, this.f13634g);
                this.f13633f += i11;
            }
            return i11;
        }

        public final i b(int i8) {
            if (i8 >= 0 && i8 <= d.f13626a.length - 1) {
                return d.f13626a[i8].f13623a;
            }
            int length = this.f13633f + 1 + (i8 - d.f13626a.length);
            if (length >= 0) {
                c[] cVarArr = this.f13632e;
                if (length < cVarArr.length) {
                    c cVar = cVarArr[length];
                    j.c(cVar);
                    return cVar.f13623a;
                }
            }
            throw new IOException(j.k(Integer.valueOf(i8 + 1), "Header index too large "));
        }

        public final void c(c cVar) {
            this.f13630c.add(cVar);
            int i8 = this.f13629b;
            int i10 = cVar.f13625c;
            if (i10 > i8) {
                l.a0(this.f13632e, (v) null);
                this.f13633f = this.f13632e.length - 1;
                this.f13634g = 0;
                this.f13635h = 0;
                return;
            }
            a((this.f13635h + i10) - i8);
            int i11 = this.f13634g + 1;
            c[] cVarArr = this.f13632e;
            if (i11 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f13633f = this.f13632e.length - 1;
                this.f13632e = cVarArr2;
            }
            int i12 = this.f13633f;
            this.f13633f = i12 - 1;
            this.f13632e[i12] = cVar;
            this.f13634g++;
            this.f13635h += i10;
        }

        public final i d() {
            int i8;
            c0 c0Var = this.f13631d;
            byte readByte = c0Var.readByte();
            byte[] bArr = kg.b.f10474a;
            byte b10 = readByte & 255;
            byte b11 = 0;
            boolean z10 = (b10 & 128) == 128;
            long e10 = (long) e(b10, 127);
            if (!z10) {
                return c0Var.k(e10);
            }
            e eVar = new e();
            int[] iArr = t.f13745a;
            j.f(c0Var, "source");
            t.a aVar = t.f13747c;
            long j10 = 0;
            t.a aVar2 = aVar;
            int i10 = 0;
            while (j10 < e10) {
                j10++;
                byte readByte2 = c0Var.readByte();
                byte[] bArr2 = kg.b.f10474a;
                b11 = (b11 << 8) | (readByte2 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    int i11 = i10 - 8;
                    t.a[] aVarArr = aVar2.f13748a;
                    j.c(aVarArr);
                    aVar2 = aVarArr[(b11 >>> i11) & 255];
                    j.c(aVar2);
                    if (aVar2.f13748a == null) {
                        eVar.g0(aVar2.f13749b);
                        i10 -= aVar2.f13750c;
                        aVar2 = aVar;
                    } else {
                        i10 = i11;
                    }
                }
            }
            while (i10 > 0) {
                t.a[] aVarArr2 = aVar2.f13748a;
                j.c(aVarArr2);
                t.a aVar3 = aVarArr2[(b11 << (8 - i10)) & 255];
                j.c(aVar3);
                if (aVar3.f13748a != null || (i8 = aVar3.f13750c) > i10) {
                    break;
                }
                eVar.g0(aVar3.f13749b);
                i10 -= i8;
                aVar2 = aVar;
            }
            return eVar.Q();
        }

        public final int e(int i8, int i10) {
            int i11 = i8 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte readByte = this.f13631d.readByte();
                byte[] bArr = kg.b.f10474a;
                byte b10 = readByte & 255;
                if ((b10 & 128) == 0) {
                    return i10 + (b10 << i12);
                }
                i10 += (b10 & Byte.MAX_VALUE) << i12;
                i12 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13636a = true;

        /* renamed from: b  reason: collision with root package name */
        public final e f13637b;

        /* renamed from: c  reason: collision with root package name */
        public int f13638c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f13639d;

        /* renamed from: e  reason: collision with root package name */
        public int f13640e;

        /* renamed from: f  reason: collision with root package name */
        public c[] f13641f;

        /* renamed from: g  reason: collision with root package name */
        public int f13642g;

        /* renamed from: h  reason: collision with root package name */
        public int f13643h;

        /* renamed from: i  reason: collision with root package name */
        public int f13644i;

        public b(e eVar) {
            this.f13637b = eVar;
            this.f13638c = Integer.MAX_VALUE;
            this.f13640e = 4096;
            this.f13641f = new c[8];
            this.f13642g = 7;
        }

        public final void a(int i8) {
            int i10;
            if (i8 > 0) {
                int length = this.f13641f.length - 1;
                int i11 = 0;
                while (true) {
                    i10 = this.f13642g;
                    if (length < i10 || i8 <= 0) {
                        c[] cVarArr = this.f13641f;
                        int i12 = i10 + 1;
                        System.arraycopy(cVarArr, i12, cVarArr, i12 + i11, this.f13643h);
                        c[] cVarArr2 = this.f13641f;
                        int i13 = this.f13642g + 1;
                        Arrays.fill(cVarArr2, i13, i13 + i11, (Object) null);
                        this.f13642g += i11;
                    } else {
                        c cVar = this.f13641f[length];
                        j.c(cVar);
                        i8 -= cVar.f13625c;
                        int i14 = this.f13644i;
                        c cVar2 = this.f13641f[length];
                        j.c(cVar2);
                        this.f13644i = i14 - cVar2.f13625c;
                        this.f13643h--;
                        i11++;
                        length--;
                    }
                }
                c[] cVarArr3 = this.f13641f;
                int i122 = i10 + 1;
                System.arraycopy(cVarArr3, i122, cVarArr3, i122 + i11, this.f13643h);
                c[] cVarArr22 = this.f13641f;
                int i132 = this.f13642g + 1;
                Arrays.fill(cVarArr22, i132, i132 + i11, (Object) null);
                this.f13642g += i11;
            }
        }

        public final void b(c cVar) {
            int i8 = this.f13640e;
            int i10 = cVar.f13625c;
            if (i10 > i8) {
                l.a0(this.f13641f, (v) null);
                this.f13642g = this.f13641f.length - 1;
                this.f13643h = 0;
                this.f13644i = 0;
                return;
            }
            a((this.f13644i + i10) - i8);
            int i11 = this.f13643h + 1;
            c[] cVarArr = this.f13641f;
            if (i11 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f13642g = this.f13641f.length - 1;
                this.f13641f = cVarArr2;
            }
            int i12 = this.f13642g;
            this.f13642g = i12 - 1;
            this.f13641f[i12] = cVar;
            this.f13643h++;
            this.f13644i += i10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(wg.i r13) {
            /*
                r12 = this;
                java.lang.String r0 = "data"
                sf.j.f(r13, r0)
                boolean r0 = r12.f13636a
                wg.e r1 = r12.f13637b
                r2 = 127(0x7f, float:1.78E-43)
                r3 = 0
                if (r0 == 0) goto L_0x008d
                int[] r0 = qg.t.f13745a
                int r0 = r13.d()
                r4 = 0
                r6 = r3
                r7 = r4
            L_0x0018:
                if (r6 >= r0) goto L_0x002c
                int r9 = r6 + 1
                byte r6 = r13.i(r6)
                byte[] r10 = kg.b.f10474a
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte[] r10 = qg.t.f13746b
                byte r6 = r10[r6]
                long r10 = (long) r6
                long r7 = r7 + r10
                r6 = r9
                goto L_0x0018
            L_0x002c:
                r0 = 7
                long r9 = (long) r0
                long r7 = r7 + r9
                r0 = 3
                long r6 = r7 >> r0
                int r0 = (int) r6
                int r6 = r13.d()
                if (r0 >= r6) goto L_0x008d
                wg.e r0 = new wg.e
                r0.<init>()
                int[] r6 = qg.t.f13745a
                int r6 = r13.d()
                r7 = r4
                r4 = r3
            L_0x0046:
                if (r3 >= r6) goto L_0x006d
                int r5 = r3 + 1
                byte r3 = r13.i(r3)
                byte[] r9 = kg.b.f10474a
                r3 = r3 & 255(0xff, float:3.57E-43)
                int[] r9 = qg.t.f13745a
                r9 = r9[r3]
                byte[] r10 = qg.t.f13746b
                byte r3 = r10[r3]
                long r7 = r7 << r3
                long r9 = (long) r9
                long r7 = r7 | r9
                int r4 = r4 + r3
            L_0x005e:
                r3 = 8
                if (r4 < r3) goto L_0x006b
                int r4 = r4 + -8
                long r9 = r7 >> r4
                int r3 = (int) r9
                r0.g0(r3)
                goto L_0x005e
            L_0x006b:
                r3 = r5
                goto L_0x0046
            L_0x006d:
                if (r4 <= 0) goto L_0x007c
                int r13 = 8 - r4
                long r5 = r7 << r13
                r7 = 255(0xff, double:1.26E-321)
                long r3 = r7 >>> r4
                long r3 = r3 | r5
                int r13 = (int) r3
                r0.g0(r13)
            L_0x007c:
                wg.i r13 = r0.Q()
                int r0 = r13.d()
                r3 = 128(0x80, float:1.794E-43)
                r12.e(r0, r2, r3)
                r1.f0(r13)
                goto L_0x0097
            L_0x008d:
                int r0 = r13.d()
                r12.e(r0, r2, r3)
                r1.f0(r13)
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.d.b.c(wg.i):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.util.ArrayList r14) {
            /*
                r13 = this;
                boolean r0 = r13.f13639d
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r13.f13638c
                int r2 = r13.f13640e
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r13.e(r0, r4, r3)
            L_0x0012:
                r13.f13639d = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f13638c = r0
                int r0 = r13.f13640e
                r13.e(r0, r4, r3)
            L_0x001e:
                int r0 = r14.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x0100
                int r3 = r2 + 1
                java.lang.Object r2 = r14.get(r2)
                qg.c r2 = (qg.c) r2
                wg.i r4 = r2.f13623a
                wg.i r4 = r4.p()
                java.util.Map<wg.i, java.lang.Integer> r5 = qg.d.f13627b
                java.lang.Object r5 = r5.get(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                r6 = -1
                r7 = 1
                wg.i r8 = r2.f13624b
                if (r5 == 0) goto L_0x0070
                int r5 = r5.intValue()
                int r5 = r5 + r7
                r9 = 2
                if (r9 > r5) goto L_0x004f
                r9 = 8
                if (r5 >= r9) goto L_0x004f
                r9 = r7
                goto L_0x0050
            L_0x004f:
                r9 = r1
            L_0x0050:
                if (r9 == 0) goto L_0x006e
                qg.c[] r9 = qg.d.f13626a
                int r10 = r5 + -1
                r10 = r9[r10]
                wg.i r10 = r10.f13624b
                boolean r10 = sf.j.a(r10, r8)
                if (r10 == 0) goto L_0x0061
                goto L_0x0071
            L_0x0061:
                r9 = r9[r5]
                wg.i r9 = r9.f13624b
                boolean r9 = sf.j.a(r9, r8)
                if (r9 == 0) goto L_0x006e
                int r9 = r5 + 1
                goto L_0x0072
            L_0x006e:
                r9 = r6
                goto L_0x0072
            L_0x0070:
                r5 = r6
            L_0x0071:
                r9 = r5
            L_0x0072:
                if (r9 != r6) goto L_0x00b0
                int r10 = r13.f13642g
                int r10 = r10 + r7
                qg.c[] r7 = r13.f13641f
                int r7 = r7.length
            L_0x007a:
                if (r10 >= r7) goto L_0x00b0
                int r11 = r10 + 1
                qg.c[] r12 = r13.f13641f
                r12 = r12[r10]
                sf.j.c(r12)
                wg.i r12 = r12.f13623a
                boolean r12 = sf.j.a(r12, r4)
                if (r12 == 0) goto L_0x00ae
                qg.c[] r12 = r13.f13641f
                r12 = r12[r10]
                sf.j.c(r12)
                wg.i r12 = r12.f13624b
                boolean r12 = sf.j.a(r12, r8)
                if (r12 == 0) goto L_0x00a5
                int r7 = r13.f13642g
                int r10 = r10 - r7
                qg.c[] r7 = qg.d.f13626a
                int r7 = r7.length
                int r9 = r7 + r10
                goto L_0x00b0
            L_0x00a5:
                if (r5 != r6) goto L_0x00ae
                int r5 = r13.f13642g
                int r10 = r10 - r5
                qg.c[] r5 = qg.d.f13626a
                int r5 = r5.length
                int r5 = r5 + r10
            L_0x00ae:
                r10 = r11
                goto L_0x007a
            L_0x00b0:
                if (r9 == r6) goto L_0x00ba
                r2 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.e(r9, r2, r4)
                goto L_0x00fd
            L_0x00ba:
                r7 = 64
                if (r5 != r6) goto L_0x00cd
                wg.e r5 = r13.f13637b
                r5.g0(r7)
                r13.c(r4)
                r13.c(r8)
                r13.b(r2)
                goto L_0x00fd
            L_0x00cd:
                wg.i r6 = qg.c.f13617d
                r4.getClass()
                java.lang.String r9 = "prefix"
                sf.j.f(r6, r9)
                int r9 = r6.d()
                boolean r6 = r4.l(r1, r6, r9)
                if (r6 == 0) goto L_0x00f2
                wg.i r6 = qg.c.f13622i
                boolean r4 = sf.j.a(r6, r4)
                if (r4 != 0) goto L_0x00f2
                r2 = 15
                r13.e(r5, r2, r1)
                r13.c(r8)
                goto L_0x00fd
            L_0x00f2:
                r4 = 63
                r13.e(r5, r4, r7)
                r13.c(r8)
                r13.b(r2)
            L_0x00fd:
                r2 = r3
                goto L_0x0023
            L_0x0100:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.d.b.d(java.util.ArrayList):void");
        }

        public final void e(int i8, int i10, int i11) {
            e eVar = this.f13637b;
            if (i8 < i10) {
                eVar.g0(i8 | i11);
                return;
            }
            eVar.g0(i11 | i10);
            int i12 = i8 - i10;
            while (i12 >= 128) {
                eVar.g0(128 | (i12 & 127));
                i12 >>>= 7;
            }
            eVar.g0(i12);
        }
    }

    static {
        c cVar = new c(c.f13622i, "");
        int i8 = 0;
        i iVar = c.f13619f;
        i iVar2 = c.f13620g;
        i iVar3 = c.f13621h;
        i iVar4 = c.f13618e;
        c[] cVarArr = {cVar, new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f13626a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i8 < 61) {
            int i10 = i8 + 1;
            if (!linkedHashMap.containsKey(cVarArr[i8].f13623a)) {
                linkedHashMap.put(cVarArr[i8].f13623a, Integer.valueOf(i8));
            }
            i8 = i10;
        }
        Map<i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j.e(unmodifiableMap, "unmodifiableMap(result)");
        f13627b = unmodifiableMap;
    }

    public static void a(i iVar) {
        j.f(iVar, "name");
        int d10 = iVar.d();
        int i8 = 0;
        while (i8 < d10) {
            int i10 = i8 + 1;
            byte i11 = iVar.i(i8);
            if (!(65 <= i11 && i11 <= 90)) {
                i8 = i10;
            } else {
                throw new IOException(j.k(iVar.q(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
    }
}
