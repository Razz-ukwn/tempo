package og;

import jg.c0;
import kg.b;
import sf.j;
import wg.i;

public final class e {
    static {
        i iVar = i.f16760d;
        i.a.b("\"\\");
        i.a.b("\t ,=");
    }

    public static final boolean a(c0 c0Var) {
        if (j.a(c0Var.f10051a.f10220b, "HEAD")) {
            return false;
        }
        int i8 = c0Var.f10054d;
        return (((i8 >= 100 && i8 < 200) || i8 == 204 || i8 == 304) && b.k(c0Var) == -1 && !zf.j.s0("chunked", c0.d(c0Var, "Transfer-Encoding"), true)) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0211, code lost:
        if (r3.f17974a.matcher(r0).matches() == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0217, code lost:
        if (r3 != 0) goto L_0x021a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x026e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(jg.k r37, jg.r r38, jg.q r39) {
        /*
            r1 = r37
            r2 = r38
            r0 = r39
            java.lang.String r3 = "<this>"
            sf.j.f(r1, r3)
            java.lang.String r3 = "url"
            sf.j.f(r2, r3)
            java.lang.String r3 = "headers"
            sf.j.f(r0, r3)
            cb.d r3 = jg.k.f10131u
            if (r1 != r3) goto L_0x001a
            return
        L_0x001a:
            java.util.regex.Pattern r3 = jg.j.f10119j
            java.lang.String[] r3 = r0.f10150a
            int r3 = r3.length
            r4 = 2
            int r3 = r3 / r4
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x0024:
            r9 = 1
            if (r7 >= r3) goto L_0x0045
            int r10 = r7 + 1
            java.lang.String r11 = r0.c(r7)
            java.lang.String r12 = "Set-Cookie"
            boolean r9 = zf.j.s0(r12, r11, r9)
            if (r9 == 0) goto L_0x0043
            if (r8 != 0) goto L_0x003c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
        L_0x003c:
            java.lang.String r7 = r0.e(r7)
            r8.add(r7)
        L_0x0043:
            r7 = r10
            goto L_0x0024
        L_0x0045:
            gf.s r3 = gf.s.f8978a
            if (r8 == 0) goto L_0x0054
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r4 = "{\n      Collections.unmodifiableList(result)\n    }"
            sf.j.e(r0, r4)
            r4 = r0
            goto L_0x0055
        L_0x0054:
            r4 = r3
        L_0x0055:
            int r7 = r4.size()
            r0 = r6
            r8 = 0
        L_0x005b:
            if (r0 >= r7) goto L_0x0277
            int r10 = r0 + 1
            java.lang.Object r0 = r4.get(r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "setCookie"
            sf.j.f(r11, r0)
            long r12 = java.lang.System.currentTimeMillis()
            byte[] r0 = kg.b.f10474a
            int r0 = r11.length()
            r14 = 59
            int r0 = kg.b.f(r11, r14, r6, r0)
            r15 = 61
            int r5 = kg.b.f(r11, r15, r6, r0)
            if (r5 != r0) goto L_0x008b
        L_0x0083:
            r39 = r3
            r36 = r4
            r3 = r6
            r4 = r9
            goto L_0x025f
        L_0x008b:
            java.lang.String r17 = kg.b.z(r6, r5, r11)
            int r16 = r17.length()
            if (r16 != 0) goto L_0x0098
            r16 = r9
            goto L_0x009a
        L_0x0098:
            r16 = r6
        L_0x009a:
            if (r16 != 0) goto L_0x0083
            int r6 = kg.b.m(r17)
            r9 = -1
            if (r6 == r9) goto L_0x00ab
        L_0x00a3:
            r39 = r3
            r36 = r4
            r3 = 0
            r4 = 1
            goto L_0x025f
        L_0x00ab:
            int r5 = r5 + 1
            java.lang.String r18 = kg.b.z(r5, r0, r11)
            int r5 = kg.b.m(r18)
            if (r5 == r9) goto L_0x00b8
            goto L_0x00a3
        L_0x00b8:
            int r0 = r0 + 1
            int r5 = r11.length()
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r21 = -1
            r30 = r19
            r28 = r21
            r6 = 0
            r9 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 1
        L_0x00d3:
            r32 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r34 = -9223372036854775808
            if (r0 >= r5) goto L_0x01ac
            r39 = r3
            int r3 = kg.b.f(r11, r14, r0, r5)
            int r14 = kg.b.f(r11, r15, r0, r3)
            java.lang.String r0 = kg.b.z(r0, r14, r11)
            if (r14 >= r3) goto L_0x00f3
            int r14 = r14 + 1
            java.lang.String r14 = kg.b.z(r14, r3, r11)
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r14 = ""
        L_0x00f5:
            java.lang.String r15 = "expires"
            r36 = r4
            r4 = 1
            boolean r15 = zf.j.s0(r0, r15, r4)
            if (r15 == 0) goto L_0x010b
            int r0 = r14.length()     // Catch:{ IllegalArgumentException -> 0x01a0 }
            long r14 = jg.j.a.b(r0, r14)     // Catch:{ IllegalArgumentException -> 0x01a0 }
            r30 = r14
            goto L_0x0148
        L_0x010b:
            java.lang.String r4 = "max-age"
            r15 = 1
            boolean r4 = zf.j.s0(r0, r4, r15)
            if (r4 == 0) goto L_0x014c
            long r14 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x0124 }
            r28 = 0
            int r0 = (r14 > r28 ? 1 : (r14 == r28 ? 0 : -1))
            if (r0 > 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r34 = r14
        L_0x0121:
            r28 = r34
            goto L_0x0148
        L_0x0124:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            java.lang.String r15 = "compile(pattern)"
            sf.j.e(r0, r15)     // Catch:{  }
            java.util.regex.Matcher r0 = r0.matcher(r14)     // Catch:{  }
            boolean r0 = r0.matches()     // Catch:{  }
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "-"
            r4 = 0
            boolean r0 = zf.j.x0(r14, r0, r4)     // Catch:{  }
            if (r0 == 0) goto L_0x0146
            r32 = r34
        L_0x0146:
            r28 = r32
        L_0x0148:
            r25 = 1
            goto L_0x01a0
        L_0x014b:
            throw r4     // Catch:{  }
        L_0x014c:
            java.lang.String r4 = "domain"
            r15 = 1
            boolean r4 = zf.j.s0(r0, r4, r15)
            if (r4 == 0) goto L_0x0180
            java.lang.String r0 = "."
            r4 = 0
            boolean r27 = zf.j.r0(r14, r0, r4)     // Catch:{ IllegalArgumentException -> 0x01a0 }
            r4 = r27 ^ 1
            if (r4 == 0) goto L_0x0174
            java.lang.String r0 = zf.n.O0(r0, r14)     // Catch:{ IllegalArgumentException -> 0x01a0 }
            java.lang.String r0 = d2.f1.N(r0)     // Catch:{ IllegalArgumentException -> 0x01a0 }
            if (r0 == 0) goto L_0x016e
            r6 = r0
            r26 = 0
            goto L_0x01a0
        L_0x016e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01a0 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x01a0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01a0 }
        L_0x0174:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01a0 }
            java.lang.String r4 = "Failed requirement."
            java.lang.String r4 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x01a0 }
            r0.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x01a0 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01a0 }
        L_0x0180:
            java.lang.String r4 = "path"
            r15 = 1
            boolean r4 = zf.j.s0(r0, r4, r15)
            if (r4 == 0) goto L_0x018b
            r9 = r14
            goto L_0x01a0
        L_0x018b:
            java.lang.String r4 = "secure"
            boolean r4 = zf.j.s0(r0, r4, r15)
            if (r4 == 0) goto L_0x0196
            r23 = r15
            goto L_0x01a0
        L_0x0196:
            java.lang.String r4 = "httponly"
            boolean r0 = zf.j.s0(r0, r4, r15)
            if (r0 == 0) goto L_0x01a0
            r24 = 1
        L_0x01a0:
            int r0 = r3 + 1
            r3 = r39
            r4 = r36
            r14 = 59
            r15 = 61
            goto L_0x00d3
        L_0x01ac:
            r39 = r3
            r36 = r4
            int r0 = (r28 > r34 ? 1 : (r28 == r34 ? 0 : -1))
            if (r0 != 0) goto L_0x01b7
            r19 = r34
            goto L_0x01d9
        L_0x01b7:
            int r0 = (r28 > r21 ? 1 : (r28 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x01d7
            r3 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r28 > r3 ? 1 : (r28 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01c9
            r0 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r0
            long r32 = r28 * r3
        L_0x01c9:
            long r32 = r12 + r32
            int r0 = (r32 > r12 ? 1 : (r32 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x01d9
            int r0 = (r32 > r19 ? 1 : (r32 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d4
            goto L_0x01d9
        L_0x01d4:
            r19 = r32
            goto L_0x01d9
        L_0x01d7:
            r19 = r30
        L_0x01d9:
            java.lang.String r0 = r2.f10156d
            if (r6 != 0) goto L_0x01e0
            r6 = r0
            r4 = 1
            goto L_0x021a
        L_0x01e0:
            boolean r3 = sf.j.a(r0, r6)
            if (r3 == 0) goto L_0x01e8
            r4 = 1
            goto L_0x0213
        L_0x01e8:
            r3 = 0
            boolean r4 = zf.j.r0(r0, r6, r3)
            if (r4 == 0) goto L_0x0215
            int r3 = r0.length()
            int r4 = r6.length()
            int r3 = r3 - r4
            r4 = 1
            int r3 = r3 - r4
            char r3 = r0.charAt(r3)
            r5 = 46
            if (r3 != r5) goto L_0x0216
            zf.c r3 = kg.b.f10479f
            r3.getClass()
            java.util.regex.Pattern r3 = r3.f17974a
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x0216
        L_0x0213:
            r3 = r4
            goto L_0x0217
        L_0x0215:
            r4 = 1
        L_0x0216:
            r3 = 0
        L_0x0217:
            if (r3 != 0) goto L_0x021a
            goto L_0x022c
        L_0x021a:
            int r0 = r0.length()
            int r3 = r6.length()
            if (r0 == r3) goto L_0x022e
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f12383g
            java.lang.String r0 = r0.a(r6)
            if (r0 != 0) goto L_0x022e
        L_0x022c:
            r3 = 0
            goto L_0x025f
        L_0x022e:
            java.lang.String r0 = "/"
            r3 = 0
            if (r9 == 0) goto L_0x023d
            boolean r5 = zf.j.x0(r9, r0, r3)
            if (r5 != 0) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r22 = r9
            goto L_0x0255
        L_0x023d:
            java.lang.String r5 = r38.b()
            r9 = 47
            r11 = 6
            int r9 = zf.n.I0(r5, r9, r3, r11)
            if (r9 == 0) goto L_0x0253
            java.lang.String r0 = r5.substring(r3, r9)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            sf.j.e(r0, r5)
        L_0x0253:
            r22 = r0
        L_0x0255:
            jg.j r0 = new jg.j
            r16 = r0
            r21 = r6
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x0260
        L_0x025f:
            r0 = 0
        L_0x0260:
            if (r0 != 0) goto L_0x0263
            goto L_0x026e
        L_0x0263:
            if (r8 != 0) goto L_0x026b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x026b:
            r8.add(r0)
        L_0x026e:
            r6 = r3
            r9 = r4
            r0 = r10
            r4 = r36
            r3 = r39
            goto L_0x005b
        L_0x0277:
            r39 = r3
            if (r8 == 0) goto L_0x0285
            java.util.List r3 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r0 = "{\n        Collections.un…ableList(cookies)\n      }"
            sf.j.e(r3, r0)
            goto L_0x0287
        L_0x0285:
            r3 = r39
        L_0x0287:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x028e
            return
        L_0x028e:
            r1.b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e.b(jg.k, jg.r, jg.q):void");
    }
}
