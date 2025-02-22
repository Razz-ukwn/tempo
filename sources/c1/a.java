package c1;

public final class a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: gf.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: gf.s} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0135 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString a(x0.a r18, f1.c r19, z0.f.a r20) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "density"
            sf.j.f(r1, r2)
            java.lang.String r2 = "fontFamilyResolver"
            r3 = r20
            sf.j.f(r3, r2)
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.String r3 = r0.f16819a
            r2.<init>(r3)
            java.util.List<x0.a$a<x0.f>> r6 = r0.f16820b
            if (r6 == 0) goto L_0x013d
            int r7 = r6.size()
            r8 = 0
        L_0x0020:
            if (r8 >= r7) goto L_0x013d
            java.lang.Object r9 = r6.get(r8)
            x0.a$a r9 = (x0.a.C0309a) r9
            T r10 = r9.f16823a
            x0.f r10 = (x0.f) r10
            e1.f r11 = r10.f16892a
            long r11 = r11.a()
            e1.f r13 = r10.f16892a
            long r14 = r13.a()
            boolean r14 = i0.i.b(r11, r14)
            if (r14 == 0) goto L_0x003f
            goto L_0x0052
        L_0x003f:
            long r13 = i0.i.f9376e
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x0047
            r13 = 1
            goto L_0x0048
        L_0x0047:
            r13 = 0
        L_0x0048:
            if (r13 == 0) goto L_0x0050
            e1.b r13 = new e1.b
            r13.<init>(r11)
            goto L_0x0052
        L_0x0050:
            e1.f$a r13 = e1.f.a.f7769a
        L_0x0052:
            long r11 = r13.a()
            long r13 = i0.i.f9376e
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x005e
            r15 = 1
            goto L_0x005f
        L_0x005e:
            r15 = 0
        L_0x005f:
            int r4 = r9.f16824b
            int r9 = r9.f16825c
            if (r15 == 0) goto L_0x0071
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            int r11 = androidx.databinding.a.l(r11)
            r15.<init>(r11)
            d1.b.a(r2, r15, r4, r9)
        L_0x0071:
            long r11 = r10.f16893b
            r16 = r4
            long r3 = f1.k.b(r11)
            r17 = r6
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r5 = f1.l.a(r3, r5)
            if (r5 == 0) goto L_0x009c
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r4 = r1.x(r11)
            int r4 = q4.a.g(r4)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = r16
            d1.b.a(r2, r3, r5, r9)
            r16 = r7
            goto L_0x00b7
        L_0x009c:
            r5 = r16
            r16 = r7
            r6 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r3 = f1.l.a(r3, r6)
            if (r3 == 0) goto L_0x00b7
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r4 = f1.k.c(r11)
            r3.<init>(r4)
            d1.b.a(r2, r3, r5, r9)
        L_0x00b7:
            z0.p r3 = r10.f16894c
            if (r3 != 0) goto L_0x00bf
            z0.n r4 = r10.f16895d
            if (r4 == 0) goto L_0x00d2
        L_0x00bf:
            if (r3 != 0) goto L_0x00c3
            z0.p r3 = z0.p.f17606c
        L_0x00c3:
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r6 = 0
            int r3 = b3.l0.c(r3, r6)
            r4.<init>(r3)
            r3 = 33
            r2.setSpan(r4, r5, r9, r3)
        L_0x00d2:
            e1.d r3 = r10.m
            if (r3 == 0) goto L_0x0100
            int r3 = r3.f7768a
            r4 = 1
            r6 = r4 | r3
            if (r6 != r3) goto L_0x00df
            r6 = r4
            goto L_0x00e0
        L_0x00df:
            r6 = 0
        L_0x00e0:
            if (r6 == 0) goto L_0x00ec
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r7 = 33
            r2.setSpan(r6, r5, r9, r7)
        L_0x00ec:
            r6 = 2
            r6 = r6 | r3
            if (r6 != r3) goto L_0x00f2
            r3 = r4
            goto L_0x00f3
        L_0x00f2:
            r3 = 0
        L_0x00f3:
            if (r3 == 0) goto L_0x0101
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            r6 = 33
            r2.setSpan(r3, r5, r9, r6)
            goto L_0x0103
        L_0x0100:
            r4 = 1
        L_0x0101:
            r6 = 33
        L_0x0103:
            e1.g r3 = r10.f16901j
            if (r3 == 0) goto L_0x0111
            android.text.style.ScaleXSpan r7 = new android.text.style.ScaleXSpan
            float r3 = r3.f7770a
            r7.<init>(r3)
            r2.setSpan(r7, r5, r9, r6)
        L_0x0111:
            b1.d r3 = r10.f16902k
            if (r3 == 0) goto L_0x011e
            d1.a r6 = d1.a.f7184a
            java.lang.Object r3 = r6.a(r3)
            d1.b.a(r2, r3, r5, r9)
        L_0x011e:
            long r6 = r10.f16903l
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0126
            r3 = r4
            goto L_0x0127
        L_0x0126:
            r3 = 0
        L_0x0127:
            if (r3 == 0) goto L_0x0135
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r6 = androidx.databinding.a.l(r6)
            r3.<init>(r6)
            d1.b.a(r2, r3, r5, r9)
        L_0x0135:
            int r8 = r8 + 1
            r7 = r16
            r6 = r17
            goto L_0x0020
        L_0x013d:
            r4 = 1
            int r1 = r18.length()
            gf.s r3 = gf.s.f8978a
            java.util.List<x0.a$a<? extends java.lang.Object>> r5 = r0.f16822d
            if (r5 == 0) goto L_0x017b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.size()
            r6.<init>(r7)
            int r7 = r5.size()
            r8 = 0
        L_0x0156:
            if (r8 >= r7) goto L_0x017c
            java.lang.Object r9 = r5.get(r8)
            r10 = r9
            x0.a$a r10 = (x0.a.C0309a) r10
            T r11 = r10.f16823a
            boolean r11 = r11 instanceof x0.i
            if (r11 == 0) goto L_0x0172
            int r11 = r10.f16824b
            int r10 = r10.f16825c
            r12 = 0
            boolean r10 = x0.b.b(r12, r1, r11, r10)
            if (r10 == 0) goto L_0x0172
            r10 = r4
            goto L_0x0173
        L_0x0172:
            r10 = 0
        L_0x0173:
            if (r10 == 0) goto L_0x0178
            r6.add(r9)
        L_0x0178:
            int r8 = r8 + 1
            goto L_0x0156
        L_0x017b:
            r6 = r3
        L_0x017c:
            int r1 = r6.size()
            r7 = 0
        L_0x0181:
            java.lang.String r8 = "<this>"
            if (r7 >= r1) goto L_0x01ba
            java.lang.Object r9 = r6.get(r7)
            x0.a$a r9 = (x0.a.C0309a) r9
            T r10 = r9.f16823a
            x0.i r10 = (x0.i) r10
            sf.j.f(r10, r8)
            boolean r8 = r10 instanceof x0.k
            if (r8 == 0) goto L_0x01b4
            x0.k r10 = (x0.k) r10
            android.text.style.TtsSpan$VerbatimBuilder r8 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r10 = r10.f16910a
            r8.<init>(r10)
            android.text.style.TtsSpan r8 = r8.build()
            java.lang.String r10 = "builder.build()"
            sf.j.e(r8, r10)
            int r10 = r9.f16824b
            int r9 = r9.f16825c
            r11 = 33
            r2.setSpan(r8, r10, r9, r11)
            int r7 = r7 + 1
            goto L_0x0181
        L_0x01b4:
            ff.e r0 = new ff.e
            r0.<init>()
            throw r0
        L_0x01ba:
            int r0 = r18.length()
            if (r5 == 0) goto L_0x01f4
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = r5.size()
            r3.<init>(r1)
            int r1 = r5.size()
            r6 = 0
        L_0x01ce:
            if (r6 >= r1) goto L_0x01f4
            java.lang.Object r7 = r5.get(r6)
            r9 = r7
            x0.a$a r9 = (x0.a.C0309a) r9
            T r10 = r9.f16823a
            boolean r10 = r10 instanceof x0.j
            if (r10 == 0) goto L_0x01ea
            int r10 = r9.f16824b
            int r9 = r9.f16825c
            r11 = 0
            boolean r9 = x0.b.b(r11, r0, r10, r9)
            if (r9 == 0) goto L_0x01eb
            r9 = r4
            goto L_0x01ec
        L_0x01ea:
            r11 = 0
        L_0x01eb:
            r9 = r11
        L_0x01ec:
            if (r9 == 0) goto L_0x01f1
            r3.add(r7)
        L_0x01f1:
            int r6 = r6 + 1
            goto L_0x01ce
        L_0x01f4:
            r11 = 0
            int r0 = r3.size()
            r5 = r11
        L_0x01fa:
            if (r5 >= r0) goto L_0x021c
            java.lang.Object r1 = r3.get(r5)
            x0.a$a r1 = (x0.a.C0309a) r1
            T r4 = r1.f16823a
            x0.j r4 = (x0.j) r4
            sf.j.f(r4, r8)
            android.text.style.URLSpan r6 = new android.text.style.URLSpan
            java.lang.String r4 = r4.f16909a
            r6.<init>(r4)
            int r4 = r1.f16824b
            int r1 = r1.f16825c
            r7 = 33
            r2.setSpan(r6, r4, r1, r7)
            int r5 = r5 + 1
            goto L_0x01fa
        L_0x021c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.a.a(x0.a, f1.c, z0.f$a):android.text.SpannableString");
    }
}
