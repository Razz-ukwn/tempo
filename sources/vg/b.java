package vg;

import gf.u;
import jg.q;
import jg.s;

public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public volatile u f16429a = u.f8980a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f16430b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final a f16431c = a.f16432a;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16432a = new a();

        void a(String str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec A[LOOP:0: B:39:0x00ea->B:40:0x00ec, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jg.c0 a(og.f r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            int r2 = r1.f16430b
            jg.x r3 = r0.f12369e
            r4 = 1
            if (r2 != r4) goto L_0x0010
            jg.c0 r0 = r0.c(r3)
            return r0
        L_0x0010:
            r5 = 4
            if (r2 != r5) goto L_0x0015
            r5 = r4
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            if (r5 != 0) goto L_0x001d
            r6 = 3
            if (r2 != r6) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            jg.b0 r2 = r3.f10222d
            ng.e r6 = r25.a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "--> "
            r7.<init>(r8)
            java.lang.String r8 = r3.f10220b
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            jg.r r8 = r3.f10219a
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0051
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = " "
            r9.<init>(r10)
            jg.w r6 = r6.f11961f
            sf.j.c(r6)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0052
        L_0x0051:
            r6 = r8
        L_0x0052:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r4 != 0) goto L_0x0073
            if (r2 == 0) goto L_0x0073
            java.lang.StringBuilder r6 = d.a.b(r6, r9)
            long r10 = r2.a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0073:
            vg.b$a r10 = r1.f16431c
            r10.a(r6)
            java.lang.String r6 = "identity"
            java.lang.String r10 = "gzip"
            java.lang.String r11 = "Content-Encoding"
            java.lang.String r12 = "-byte body omitted)"
            java.lang.String r13 = "UTF_8"
            if (r4 == 0) goto L_0x01c4
            jg.q r14 = r3.f10221c
            if (r2 == 0) goto L_0x00de
            jg.t r15 = r2.b()
            r16 = r4
            if (r15 == 0) goto L_0x00ae
            java.lang.String r4 = "Content-Type"
            java.lang.String r4 = r14.a(r4)
            if (r4 != 0) goto L_0x00ae
            vg.b$a r4 = r1.f16431c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r17 = r12
            java.lang.String r12 = "Content-Type: "
            r0.<init>(r12)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r4.a(r0)
            goto L_0x00b0
        L_0x00ae:
            r17 = r12
        L_0x00b0:
            long r18 = r2.a()
            r20 = -1
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r14.a(r0)
            if (r0 != 0) goto L_0x00dc
            vg.b$a r0 = r1.f16431c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r12 = "Content-Length: "
            r4.<init>(r12)
            r15 = r7
            r12 = r8
            long r7 = r2.a()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r0.a(r4)
            goto L_0x00e4
        L_0x00dc:
            r15 = r7
            goto L_0x00e3
        L_0x00de:
            r16 = r4
            r15 = r7
            r17 = r12
        L_0x00e3:
            r12 = r8
        L_0x00e4:
            java.lang.String[] r0 = r14.f10150a
            int r0 = r0.length
            int r0 = r0 / 2
            r4 = 0
        L_0x00ea:
            if (r4 >= r0) goto L_0x00f2
            r1.b(r14, r4)
            int r4 = r4 + 1
            goto L_0x00ea
        L_0x00f2:
            java.lang.String r0 = "--> END "
            if (r5 == 0) goto L_0x01ad
            if (r2 != 0) goto L_0x00fa
            goto L_0x01ad
        L_0x00fa:
            jg.q r4 = r3.f10221c
            java.lang.String r4 = r4.a(r11)
            if (r4 == 0) goto L_0x0111
            r7 = 1
            boolean r8 = zf.j.s0(r4, r6, r7)
            if (r8 != 0) goto L_0x0111
            boolean r4 = zf.j.s0(r4, r10, r7)
            if (r4 != 0) goto L_0x0111
            r4 = 1
            goto L_0x0112
        L_0x0111:
            r4 = 0
        L_0x0112:
            if (r4 == 0) goto L_0x012e
            vg.b$a r2 = r1.f16431c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = r3.f10220b
            r4.append(r0)
            java.lang.String r0 = " (encoded body omitted)"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.a(r0)
            r8 = r15
            goto L_0x0184
        L_0x012e:
            wg.e r4 = new wg.e
            r4.<init>()
            r2.c(r4)
            jg.t r7 = r2.b()
            if (r7 == 0) goto L_0x0145
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r7 = r7.a(r8)
            if (r7 == 0) goto L_0x0145
            goto L_0x014a
        L_0x0145:
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            sf.j.e(r7, r13)
        L_0x014a:
            vg.b$a r8 = r1.f16431c
            r8.a(r12)
            boolean r8 = kotlinx.coroutines.internal.o.b(r4)
            if (r8 == 0) goto L_0x0187
            vg.b$a r8 = r1.f16431c
            r18 = r15
            long r14 = r4.f16752b
            java.lang.String r4 = r4.T(r14, r7)
            r8.a(r4)
            vg.b$a r4 = r1.f16431c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r3.f10220b
            r7.append(r0)
            r7.append(r9)
            long r14 = r2.a()
            r7.append(r14)
            r8 = r18
            r7.append(r8)
            java.lang.String r0 = r7.toString()
            r4.a(r0)
        L_0x0184:
            r2 = r17
            goto L_0x01c9
        L_0x0187:
            r8 = r15
            vg.b$a r4 = r1.f16431c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r3.f10220b
            r7.append(r0)
            java.lang.String r0 = " (binary "
            r7.append(r0)
            long r14 = r2.a()
            r7.append(r14)
            r2 = r17
            r7.append(r2)
            java.lang.String r0 = r7.toString()
            r4.a(r0)
            goto L_0x01c9
        L_0x01ad:
            r8 = r15
            r2 = r17
            vg.b$a r4 = r1.f16431c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r0 = r3.f10220b
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r4.a(r0)
            goto L_0x01c9
        L_0x01c4:
            r16 = r4
            r2 = r12
            r12 = r8
            r8 = r7
        L_0x01c9:
            long r14 = java.lang.System.nanoTime()
            r0 = r25
            jg.c0 r0 = r0.c(r3)     // Catch:{ Exception -> 0x03a2 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r17 = java.lang.System.nanoTime()
            long r14 = r17 - r14
            long r3 = r3.toMillis(r14)
            jg.d0 r7 = r0.C
            sf.j.c(r7)
            long r14 = r7.c()
            r17 = -1
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 == 0) goto L_0x0204
            r18 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            r19 = r14
            java.lang.String r14 = "-byte"
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            goto L_0x020a
        L_0x0204:
            r18 = r8
            r19 = r14
            java.lang.String r8 = "unknown-length"
        L_0x020a:
            vg.b$a r14 = r1.f16431c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r17 = r2
            java.lang.String r2 = "<-- "
            r15.<init>(r2)
            int r2 = r0.f10054d
            r15.append(r2)
            java.lang.String r2 = r0.f10053c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0224
            r2 = 1
            goto L_0x0225
        L_0x0224:
            r2 = 0
        L_0x0225:
            if (r2 == 0) goto L_0x0231
            r2 = 32
            r21 = r12
            r23 = r13
            r12 = r2
            r2 = r21
            goto L_0x024e
        L_0x0231:
            java.lang.String r2 = r0.f10053c
            r21 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r22 = 32
            r23 = r13
            java.lang.String r13 = java.lang.String.valueOf(r22)
            r12.append(r13)
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            r12 = r22
        L_0x024e:
            r15.append(r2)
            r15.append(r12)
            jg.x r2 = r0.f10051a
            jg.r r2 = r2.f10219a
            r15.append(r2)
            r15.append(r9)
            r15.append(r3)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r16 != 0) goto L_0x0271
            java.lang.String r2 = ", "
            java.lang.String r3 = " body"
            java.lang.String r2 = b2.c.a(r2, r8, r3)
            goto L_0x0273
        L_0x0271:
            r2 = r21
        L_0x0273:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.a(r2)
            if (r16 == 0) goto L_0x03a1
            jg.q r2 = r0.B
            java.lang.String[] r3 = r2.f10150a
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
        L_0x028c:
            if (r4 >= r3) goto L_0x0294
            r1.b(r2, r4)
            int r4 = r4 + 1
            goto L_0x028c
        L_0x0294:
            if (r5 == 0) goto L_0x039a
            boolean r3 = og.e.a(r0)
            if (r3 != 0) goto L_0x029e
            goto L_0x039a
        L_0x029e:
            jg.q r3 = r0.B
            java.lang.String r3 = r3.a(r11)
            if (r3 == 0) goto L_0x02b5
            r4 = 1
            boolean r5 = zf.j.s0(r3, r6, r4)
            if (r5 != 0) goto L_0x02b5
            boolean r3 = zf.j.s0(r3, r10, r4)
            if (r3 != 0) goto L_0x02b5
            r3 = 1
            goto L_0x02b6
        L_0x02b5:
            r3 = 0
        L_0x02b6:
            if (r3 == 0) goto L_0x02c1
            vg.b$a r2 = r1.f16431c
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.a(r3)
            goto L_0x03a1
        L_0x02c1:
            wg.h r3 = r7.e()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.c0(r4)
            wg.e r3 = r3.a()
            java.lang.String r2 = r2.a(r11)
            r4 = 1
            boolean r2 = zf.j.s0(r10, r2, r4)
            r4 = 0
            if (r2 == 0) goto L_0x0302
            long r5 = r3.f16752b
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            wg.q r5 = new wg.q
            wg.e r3 = r3.clone()
            r5.<init>(r3)
            wg.e r3 = new wg.e     // Catch:{ all -> 0x02f9 }
            r3.<init>()     // Catch:{ all -> 0x02f9 }
            r3.x(r5)     // Catch:{ all -> 0x02f9 }
            e9.c.c(r5, r4)
            r4 = r2
            goto L_0x0302
        L_0x02f9:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x02fc }
        L_0x02fc:
            r0 = move-exception
            r3 = r0
            e9.c.c(r5, r2)
            throw r3
        L_0x0302:
            jg.t r2 = r7.d()
            if (r2 == 0) goto L_0x0311
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = r2.a(r5)
            if (r2 == 0) goto L_0x0311
            goto L_0x0318
        L_0x0311:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r5 = r23
            sf.j.e(r2, r5)
        L_0x0318:
            boolean r5 = kotlinx.coroutines.internal.o.b(r3)
            if (r5 != 0) goto L_0x0340
            vg.b$a r2 = r1.f16431c
            r5 = r21
            r2.a(r5)
            vg.b$a r2 = r1.f16431c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "<-- END HTTP (binary "
            r4.<init>(r5)
            long r5 = r3.f16752b
            r4.append(r5)
            r3 = r17
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.a(r3)
            return r0
        L_0x0340:
            r5 = r21
            r6 = 0
            int r6 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x035c
            vg.b$a r6 = r1.f16431c
            r6.a(r5)
            vg.b$a r5 = r1.f16431c
            wg.e r6 = r3.clone()
            long r7 = r6.f16752b
            java.lang.String r2 = r6.T(r7, r2)
            r5.a(r2)
        L_0x035c:
            java.lang.String r2 = "<-- END HTTP ("
            if (r4 == 0) goto L_0x0381
            vg.b$a r5 = r1.f16431c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            long r2 = r3.f16752b
            r6.append(r2)
            java.lang.String r2 = "-byte, "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = "-gzipped-byte body)"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.a(r2)
            goto L_0x03a1
        L_0x0381:
            vg.b$a r4 = r1.f16431c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            long r2 = r3.f16752b
            r5.append(r2)
            r2 = r18
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.a(r2)
            goto L_0x03a1
        L_0x039a:
            vg.b$a r2 = r1.f16431c
            java.lang.String r3 = "<-- END HTTP"
            r2.a(r3)
        L_0x03a1:
            return r0
        L_0x03a2:
            r0 = move-exception
            r2 = r0
            vg.b$a r0 = r1.f16431c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.b.a(og.f):jg.c0");
    }

    public final void b(q qVar, int i8) {
        this.f16429a.contains(qVar.c(i8));
        String e10 = qVar.e(i8);
        a aVar = this.f16431c;
        aVar.a(qVar.c(i8) + ": " + e10);
    }
}
