package g4;

import android.graphics.Bitmap;
import java.util.Date;
import jg.q;
import jg.x;
import m4.c;
import zf.i;
import zf.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final x f8839a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8840b;

    public static final class a {
        public static q a(q qVar, q qVar2) {
            q.a aVar = new q.a();
            int length = qVar.f10150a.length / 2;
            int i8 = 0;
            while (true) {
                boolean z10 = true;
                if (i8 >= length) {
                    break;
                }
                String c3 = qVar.c(i8);
                String e10 = qVar.e(i8);
                if (!j.s0("Warning", c3, true) || !j.x0(e10, "1", false)) {
                    if (!j.s0("Content-Length", c3, true) && !j.s0("Content-Encoding", c3, true) && !j.s0("Content-Type", c3, true)) {
                        z10 = false;
                    }
                    if (z10 || !b(c3) || qVar2.a(c3) == null) {
                        aVar.a(c3, e10);
                    }
                }
                i8++;
            }
            int length2 = qVar2.f10150a.length / 2;
            for (int i10 = 0; i10 < length2; i10++) {
                String c10 = qVar2.c(i10);
                if (!(j.s0("Content-Length", c10, true) || j.s0("Content-Encoding", c10, true) || j.s0("Content-Type", c10, true)) && b(c10)) {
                    aVar.a(c10, qVar2.e(i10));
                }
            }
            return aVar.c();
        }

        public static boolean b(String str) {
            return !j.s0("Connection", str, true) && !j.s0("Keep-Alive", str, true) && !j.s0("Proxy-Authenticate", str, true) && !j.s0("Proxy-Authorization", str, true) && !j.s0("TE", str, true) && !j.s0("Trailers", str, true) && !j.s0("Transfer-Encoding", str, true) && !j.s0("Upgrade", str, true);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final x f8841a;

        /* renamed from: b  reason: collision with root package name */
        public final c f8842b;

        /* renamed from: c  reason: collision with root package name */
        public final Date f8843c;

        /* renamed from: d  reason: collision with root package name */
        public final String f8844d;

        /* renamed from: e  reason: collision with root package name */
        public final Date f8845e;

        /* renamed from: f  reason: collision with root package name */
        public final String f8846f;

        /* renamed from: g  reason: collision with root package name */
        public final Date f8847g;

        /* renamed from: h  reason: collision with root package name */
        public final long f8848h;

        /* renamed from: i  reason: collision with root package name */
        public final long f8849i;

        /* renamed from: j  reason: collision with root package name */
        public final String f8850j;

        /* renamed from: k  reason: collision with root package name */
        public final int f8851k = -1;

        public b(x xVar, c cVar) {
            int i8;
            this.f8841a = xVar;
            this.f8842b = cVar;
            if (cVar != null) {
                this.f8848h = cVar.f8835c;
                this.f8849i = cVar.f8836d;
                q qVar = cVar.f8838f;
                int length = qVar.f10150a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    String c3 = qVar.c(i10);
                    if (j.s0(c3, "Date", true)) {
                        this.f8843c = qVar.b("Date");
                        this.f8844d = qVar.e(i10);
                    } else if (j.s0(c3, "Expires", true)) {
                        this.f8847g = qVar.b("Expires");
                    } else if (j.s0(c3, "Last-Modified", true)) {
                        this.f8845e = qVar.b("Last-Modified");
                        this.f8846f = qVar.e(i10);
                    } else if (j.s0(c3, "ETag", true)) {
                        this.f8850j = qVar.e(i10);
                    } else if (j.s0(c3, "Age", true)) {
                        String e10 = qVar.e(i10);
                        Bitmap.Config[] configArr = c.f11189a;
                        Long q02 = i.q0(e10);
                        if (q02 != null) {
                            long longValue = q02.longValue();
                            i8 = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                        } else {
                            i8 = -1;
                        }
                        this.f8851k = i8;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
            if (r7 > 0) goto L_0x0116;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final g4.d a() {
            /*
                r27 = this;
                r0 = r27
                jg.x r1 = r0.f8841a
                r2 = 0
                g4.c r3 = r0.f8842b
                if (r3 != 0) goto L_0x000f
                g4.d r3 = new g4.d
                r3.<init>(r1, r2)
                return r3
            L_0x000f:
                jg.r r4 = r1.f10219a
                boolean r4 = r4.f10162j
                if (r4 == 0) goto L_0x001f
                boolean r4 = r3.f8837e
                if (r4 != 0) goto L_0x001f
                g4.d r3 = new g4.d
                r3.<init>(r1, r2)
                return r3
            L_0x001f:
                ff.d r4 = r3.f8833a
                java.lang.Object r5 = r4.getValue()
                jg.c r5 = (jg.c) r5
                jg.c r6 = r1.a()
                boolean r6 = r6.f10034b
                r7 = 1
                r8 = 0
                if (r6 != 0) goto L_0x004d
                java.lang.Object r6 = r4.getValue()
                jg.c r6 = (jg.c) r6
                boolean r6 = r6.f10034b
                if (r6 != 0) goto L_0x004d
                java.lang.String r6 = "Vary"
                jg.q r9 = r3.f8838f
                java.lang.String r6 = r9.a(r6)
                java.lang.String r9 = "*"
                boolean r6 = sf.j.a(r6, r9)
                if (r6 != 0) goto L_0x004d
                r6 = r7
                goto L_0x004e
            L_0x004d:
                r6 = r8
            L_0x004e:
                if (r6 != 0) goto L_0x0056
                g4.d r3 = new g4.d
                r3.<init>(r1, r2)
                return r3
            L_0x0056:
                jg.c r6 = r1.a()
                boolean r9 = r6.f10033a
                if (r9 != 0) goto L_0x01e6
                jg.q r9 = r1.f10221c
                java.lang.String r10 = "If-Modified-Since"
                java.lang.String r11 = r9.a(r10)
                java.lang.String r12 = "If-None-Match"
                if (r11 != 0) goto L_0x0072
                java.lang.String r11 = r9.a(r12)
                if (r11 == 0) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r7 = r8
            L_0x0072:
                if (r7 == 0) goto L_0x0076
                goto L_0x01e6
            L_0x0076:
                r7 = 0
                long r13 = r0.f8849i
                java.util.Date r11 = r0.f8843c
                if (r11 == 0) goto L_0x008b
                long r15 = r11.getTime()
                r17 = r3
                long r2 = r13 - r15
                long r2 = java.lang.Math.max(r7, r2)
                goto L_0x008e
            L_0x008b:
                r17 = r3
                r2 = r7
            L_0x008e:
                r15 = -1
                int r7 = r0.f8851k
                if (r7 == r15) goto L_0x00a3
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r16 = r9
                r20 = r10
                long r9 = (long) r7
                long r7 = r8.toMillis(r9)
                long r2 = java.lang.Math.max(r2, r7)
                goto L_0x00a7
            L_0x00a3:
                r16 = r9
                r20 = r10
            L_0x00a7:
                long r7 = r0.f8848h
                long r9 = r13 - r7
                m4.k$a r21 = m4.k.f11213a
                java.lang.Object r21 = r21.d()
                java.lang.Number r21 = (java.lang.Number) r21
                long r21 = r21.longValue()
                long r21 = r21 - r13
                long r2 = r2 + r9
                long r2 = r2 + r21
                java.lang.Object r4 = r4.getValue()
                jg.c r4 = (jg.c) r4
                int r4 = r4.f10035c
                jg.r r9 = r1.f10219a
                java.util.Date r10 = r0.f8845e
                if (r4 == r15) goto L_0x00d2
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                long r13 = (long) r4
                long r7 = r7.toMillis(r13)
                goto L_0x0116
            L_0x00d2:
                java.util.Date r4 = r0.f8847g
                if (r4 == 0) goto L_0x00e8
                if (r11 == 0) goto L_0x00dc
                long r13 = r11.getTime()
            L_0x00dc:
                long r7 = r4.getTime()
                long r7 = r7 - r13
                r13 = 0
                int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r4 <= 0) goto L_0x0114
                goto L_0x0116
            L_0x00e8:
                if (r10 == 0) goto L_0x0114
                java.util.List<java.lang.String> r4 = r9.f10159g
                if (r4 != 0) goto L_0x00f0
                r4 = 0
                goto L_0x00fc
            L_0x00f0:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                jg.r.b.f(r4, r13)
                java.lang.String r4 = r13.toString()
            L_0x00fc:
                if (r4 != 0) goto L_0x0114
                if (r11 == 0) goto L_0x0104
                long r7 = r11.getTime()
            L_0x0104:
                long r13 = r10.getTime()
                long r7 = r7 - r13
                r13 = 0
                int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r4 <= 0) goto L_0x0114
                r4 = 10
                long r13 = (long) r4
                long r7 = r7 / r13
                goto L_0x0116
            L_0x0114:
                r7 = 0
            L_0x0116:
                int r4 = r6.f10035c
                if (r4 == r15) goto L_0x0129
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
                r21 = r11
                r14 = r12
                long r11 = (long) r4
                long r11 = r13.toMillis(r11)
                long r7 = java.lang.Math.min(r7, r11)
                goto L_0x012c
            L_0x0129:
                r21 = r11
                r14 = r12
            L_0x012c:
                int r4 = r6.f10041i
                if (r4 == r15) goto L_0x0138
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
                long r12 = (long) r4
                long r11 = r11.toMillis(r12)
                goto L_0x013a
            L_0x0138:
                r11 = 0
            L_0x013a:
                boolean r4 = r5.f10039g
                if (r4 != 0) goto L_0x014d
                int r4 = r6.f10040h
                if (r4 == r15) goto L_0x014d
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                r15 = r14
                long r13 = (long) r4
                long r13 = r6.toMillis(r13)
                r18 = r13
                goto L_0x0150
            L_0x014d:
                r15 = r14
                r18 = 0
            L_0x0150:
                boolean r4 = r5.f10033a
                if (r4 != 0) goto L_0x0164
                long r2 = r2 + r11
                long r7 = r7 + r18
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 >= 0) goto L_0x0164
                g4.d r1 = new g4.d
                r3 = r17
                r2 = 0
                r1.<init>(r2, r3)
                return r1
            L_0x0164:
                r3 = r17
                java.lang.String r2 = r0.f8850j
                if (r2 == 0) goto L_0x016c
                r10 = r15
                goto L_0x017d
            L_0x016c:
                if (r10 == 0) goto L_0x0174
                java.lang.String r2 = r0.f8846f
                sf.j.c(r2)
                goto L_0x017b
            L_0x0174:
                if (r21 == 0) goto L_0x01df
                java.lang.String r2 = r0.f8844d
                sf.j.c(r2)
            L_0x017b:
                r10 = r20
            L_0x017d:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.lang.String r4 = r1.f10220b
                jg.b0 r5 = r1.f10222d
                java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r1.f10223e
                boolean r6 = r1.isEmpty()
                if (r6 == 0) goto L_0x0194
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                goto L_0x0198
            L_0x0194:
                java.util.LinkedHashMap r1 = gf.y.Y(r1)
            L_0x0198:
                jg.q$a r6 = r16.d()
                r6.a(r10, r2)
                if (r9 == 0) goto L_0x01d3
                jg.q r24 = r6.c()
                byte[] r2 = kg.b.f10474a
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L_0x01b0
                gf.t r1 = gf.t.f8979a
                goto L_0x01be
            L_0x01b0:
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>(r1)
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
                java.lang.String r2 = "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }"
                sf.j.e(r1, r2)
            L_0x01be:
                r26 = r1
                jg.x r1 = new jg.x
                r21 = r1
                r22 = r9
                r23 = r4
                r25 = r5
                r21.<init>(r22, r23, r24, r25, r26)
                g4.d r2 = new g4.d
                r2.<init>(r1, r3)
                return r2
            L_0x01d3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "url == null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x01df:
                g4.d r2 = new g4.d
                r3 = 0
                r2.<init>(r1, r3)
                return r2
            L_0x01e6:
                r3 = r2
                g4.d r2 = new g4.d
                r2.<init>(r1, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: g4.d.b.a():g4.d");
        }
    }

    public d(x xVar, c cVar) {
        this.f8839a = xVar;
        this.f8840b = cVar;
    }
}
