package v1;

import android.graphics.Path;
import android.util.Log;
import j0.t;

public final class g {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < aVarArr.length; i8++) {
            a aVar = aVarArr[i8];
            char c3 = aVar.f16126a;
            a aVar2 = aVarArr2[i8];
            if (c3 != aVar2.f16126a || aVar.f16127b.length != aVar2.f16127b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i8) {
        if (i8 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i10 = i8 - 0;
                int min = Math.min(i10, length - 0);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:25:0x006c->B:45:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v1.g.a[] c(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r9 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r9 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r9 = r3 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r3] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r3 = r9
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r9 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = b(r5, r3)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = b2.c.a(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            v1.g$a r3 = new v1.g$a
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            v1.g$a r3 = new v1.g$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            v1.g$a[] r0 = new v1.g.a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            v1.g$a[] r0 = (v1.g.a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.c(java.lang.String):v1.g$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c3 = c(str);
        if (c3 == null) {
            return null;
        }
        try {
            a.b(c3, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(t.a("Error in parsing ", str), e10);
        }
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i8 = 0; i8 < aVarArr.length; i8++) {
            aVarArr2[i8] = new a(aVarArr[i8]);
        }
        return aVarArr2;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f16126a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f16127b;

        public a(char c3, float[] fArr) {
            this.f16126a = c3;
            this.f16127b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            float f17 = f10;
            float f18 = f12;
            float f19 = f14;
            boolean z12 = z11;
            double radians = Math.toRadians((double) f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = (double) f17;
            double d13 = (double) f11;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = (double) f19;
            double d17 = d14 / d16;
            double d18 = radians;
            double d19 = (double) f15;
            double d20 = ((d13 * cos) + (((double) (-f17)) * sin)) / d19;
            double d21 = d13;
            double d22 = (double) f13;
            double d23 = ((d22 * sin) + (((double) f18) * cos)) / d16;
            double d24 = ((d22 * cos) + (((double) (-f18)) * sin)) / d19;
            double d25 = d17 - d23;
            double d26 = d20 - d24;
            double d27 = (d17 + d23) / 2.0d;
            double d28 = (d20 + d24) / 2.0d;
            double d29 = sin;
            double d30 = (d26 * d26) + (d25 * d25);
            if (d30 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d31 = (1.0d / d30) - 0.25d;
            if (d31 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d30);
                float sqrt = (float) (Math.sqrt(d30) / 1.99999d);
                a(path, f10, f11, f12, f13, f19 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d31);
            double d32 = d25 * sqrt2;
            double d33 = sqrt2 * d26;
            if (z10 == z12) {
                d11 = d27 - d33;
                d10 = d28 + d32;
            } else {
                d11 = d27 + d33;
                d10 = d28 - d32;
            }
            double atan2 = Math.atan2(d20 - d10, d17 - d11);
            double atan22 = Math.atan2(d24 - d10, d23 - d11) - atan2;
            int i8 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z12 != (i8 >= 0)) {
                atan22 = i8 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d34 = d11 * d16;
            double d35 = d10 * d19;
            double d36 = (d34 * cos) - (d35 * d29);
            double d37 = (d35 * cos) + (d34 * d29);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d38 = -d16;
            double d39 = d38 * cos2;
            double d40 = d19 * sin2;
            double d41 = (d39 * sin3) - (d40 * cos3);
            double d42 = d38 * sin2;
            double d43 = d19 * cos2;
            double d44 = (cos3 * d43) + (sin3 * d42);
            double d45 = d43;
            double d46 = atan22 / ((double) ceil);
            int i10 = 0;
            while (i10 < ceil) {
                double d47 = atan2 + d46;
                double sin4 = Math.sin(d47);
                double cos4 = Math.cos(d47);
                double d48 = d46;
                double d49 = (((d16 * cos2) * cos4) + d36) - (d40 * sin4);
                double d50 = d45;
                double d51 = d36;
                double d52 = (d50 * sin4) + (d16 * sin2 * cos4) + d37;
                double d53 = (d39 * sin4) - (d40 * cos4);
                double d54 = (cos4 * d50) + (sin4 * d42);
                double d55 = d47 - atan2;
                double tan = Math.tan(d55 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d55)) / 3.0d;
                double d56 = d47;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d41 * sqrt3) + d15), (float) ((d44 * sqrt3) + d21), (float) (d49 - (sqrt3 * d53)), (float) (d52 - (sqrt3 * d54)), (float) d49, (float) d52);
                i10++;
                atan2 = d56;
                d42 = d42;
                cos2 = cos2;
                ceil = ceil;
                d44 = d54;
                d16 = d16;
                d41 = d53;
                d15 = d49;
                d21 = d52;
                d36 = d51;
                d46 = d48;
                d45 = d50;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i8;
            float f10;
            float f11;
            int i10;
            int i11;
            char c3;
            a aVar;
            int i12;
            char c10;
            a aVar2;
            int i13;
            float f12;
            float f13;
            float f14;
            float f15;
            int i14;
            float f16;
            float f17;
            int i15;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            float f31;
            float f32;
            float f33;
            float f34;
            a[] aVarArr2 = aVarArr;
            Path path2 = path;
            int i16 = 6;
            float[] fArr = new float[6];
            char c11 = 'm';
            int i17 = 0;
            char c12 = 'm';
            int i18 = 0;
            while (i18 < aVarArr2.length) {
                a aVar3 = aVarArr2[i18];
                char c13 = aVar3.f16126a;
                float f35 = fArr[i17];
                float f36 = fArr[1];
                float f37 = fArr[2];
                float f38 = fArr[3];
                float f39 = fArr[4];
                float f40 = fArr[5];
                switch (c13) {
                    case 'A':
                    case 'a':
                        i8 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i8 = i16;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i8 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i8 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f39, f40);
                        f35 = f39;
                        f37 = f35;
                        f36 = f40;
                        f38 = f36;
                        break;
                }
                i8 = 2;
                float f41 = f39;
                float f42 = f40;
                float f43 = f35;
                float f44 = f36;
                int i19 = i17;
                while (true) {
                    float[] fArr2 = aVar3.f16127b;
                    if (i19 < fArr2.length) {
                        if (c13 != 'A') {
                            if (c13 != 'C') {
                                if (c13 == 'H') {
                                    float[] fArr3 = fArr2;
                                    i10 = i19;
                                    c3 = c13;
                                    aVar = aVar3;
                                    i11 = i18;
                                    int i20 = i10 + 0;
                                    path2.lineTo(fArr3[i20], f44);
                                    f43 = fArr3[i20];
                                } else if (c13 == 'Q') {
                                    float[] fArr4 = fArr2;
                                    i14 = i19;
                                    c3 = c13;
                                    aVar = aVar3;
                                    i11 = i18;
                                    int i21 = i14 + 0;
                                    int i22 = i14 + 1;
                                    int i23 = i14 + 2;
                                    int i24 = i14 + 3;
                                    path2.quadTo(fArr4[i21], fArr4[i22], fArr4[i23], fArr4[i24]);
                                    f15 = fArr4[i21];
                                    f14 = fArr4[i22];
                                    f43 = fArr4[i23];
                                    f44 = fArr4[i24];
                                } else if (c13 == 'V') {
                                    float[] fArr5 = fArr2;
                                    i10 = i19;
                                    c3 = c13;
                                    aVar = aVar3;
                                    i11 = i18;
                                    int i25 = i10 + 0;
                                    path2.lineTo(f43, fArr5[i25]);
                                    f44 = fArr5[i25];
                                } else if (c13 != 'a') {
                                    if (c13 != 'c') {
                                        if (c13 == 'h') {
                                            float[] fArr6 = fArr2;
                                            i10 = i19;
                                            float f45 = f44;
                                            int i26 = i10 + 0;
                                            path2.rLineTo(fArr6[i26], 0.0f);
                                            f43 += fArr6[i26];
                                        } else if (c13 != 'q') {
                                            if (c13 != 'v') {
                                                if (c13 != 'L') {
                                                    if (c13 == 'M') {
                                                        float[] fArr7 = fArr2;
                                                        i10 = i19;
                                                        f26 = fArr7[i10 + 0];
                                                        f25 = fArr7[i10 + 1];
                                                        if (i10 > 0) {
                                                            path2.lineTo(f26, f25);
                                                        } else {
                                                            path2.moveTo(f26, f25);
                                                            f41 = f26;
                                                            f42 = f25;
                                                        }
                                                    } else if (c13 == 'S') {
                                                        float[] fArr8 = fArr2;
                                                        i15 = i19;
                                                        float f46 = f44;
                                                        float f47 = f43;
                                                        if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                            f27 = (f46 * 2.0f) - f10;
                                                            f28 = (f47 * 2.0f) - f11;
                                                        } else {
                                                            f28 = f47;
                                                            f27 = f46;
                                                        }
                                                        int i27 = i15 + 0;
                                                        int i28 = i15 + 1;
                                                        int i29 = i15 + 2;
                                                        int i30 = i15 + 3;
                                                        path.cubicTo(f28, f27, fArr8[i27], fArr8[i28], fArr8[i29], fArr8[i30]);
                                                        float f48 = fArr8[i27];
                                                        float f49 = fArr8[i28];
                                                        f17 = fArr8[i29];
                                                        f16 = fArr8[i30];
                                                        f11 = f48;
                                                        f10 = f49;
                                                        f43 = f17;
                                                        f44 = f16;
                                                    } else if (c13 == 'T') {
                                                        float[] fArr9 = fArr2;
                                                        i10 = i19;
                                                        float f50 = f44;
                                                        float f51 = f43;
                                                        if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                            f29 = (f51 * 2.0f) - f11;
                                                            f30 = (f50 * 2.0f) - f10;
                                                        } else {
                                                            f29 = f51;
                                                            f30 = f50;
                                                        }
                                                        int i31 = i10 + 0;
                                                        int i32 = i10 + 1;
                                                        path2.quadTo(f29, f30, fArr9[i31], fArr9[i32]);
                                                        f10 = f30;
                                                        f11 = f29;
                                                        c3 = c13;
                                                        aVar = aVar3;
                                                        i11 = i18;
                                                        f43 = fArr9[i31];
                                                        f44 = fArr9[i32];
                                                    } else if (c13 == 'l') {
                                                        float[] fArr10 = fArr2;
                                                        i10 = i19;
                                                        f23 = f44;
                                                        int i33 = i10 + 0;
                                                        int i34 = i10 + 1;
                                                        path2.rLineTo(fArr10[i33], fArr10[i34]);
                                                        f43 += fArr10[i33];
                                                        f24 = fArr10[i34];
                                                    } else if (c13 == c11) {
                                                        float[] fArr11 = fArr2;
                                                        i10 = i19;
                                                        float f52 = fArr11[i10 + 0];
                                                        f43 += f52;
                                                        float f53 = fArr11[i10 + 1];
                                                        f44 += f53;
                                                        if (i10 > 0) {
                                                            path2.rLineTo(f52, f53);
                                                        } else {
                                                            path2.rMoveTo(f52, f53);
                                                            f42 = f44;
                                                            f41 = f43;
                                                        }
                                                    } else if (c13 != 's') {
                                                        if (c13 == 't') {
                                                            if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                                f33 = f43 - f11;
                                                                f34 = f44 - f10;
                                                            } else {
                                                                f34 = 0.0f;
                                                                f33 = 0.0f;
                                                            }
                                                            int i35 = i19 + 0;
                                                            int i36 = i19 + 1;
                                                            path2.rQuadTo(f33, f34, fArr2[i35], fArr2[i36]);
                                                            float f54 = f33 + f43;
                                                            float f55 = f34 + f44;
                                                            f43 += fArr2[i35];
                                                            f44 += fArr2[i36];
                                                            f10 = f55;
                                                            f11 = f54;
                                                        }
                                                        i10 = i19;
                                                    } else {
                                                        if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                            float f56 = f43 - f11;
                                                            f32 = f44 - f10;
                                                            f31 = f56;
                                                        } else {
                                                            f32 = 0.0f;
                                                            f31 = 0.0f;
                                                        }
                                                        int i37 = i19 + 0;
                                                        int i38 = i19 + 1;
                                                        int i39 = i19 + 2;
                                                        int i40 = i19 + 3;
                                                        float[] fArr12 = fArr2;
                                                        i15 = i19;
                                                        f18 = f44;
                                                        float f57 = f43;
                                                        path.rCubicTo(f31, f32, fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                                        f21 = fArr12[i37] + f57;
                                                        f20 = fArr12[i38] + f18;
                                                        f19 = f57 + fArr12[i39];
                                                        f22 = fArr12[i40];
                                                    }
                                                    f43 = f41;
                                                    f44 = f42;
                                                } else {
                                                    float[] fArr13 = fArr2;
                                                    i10 = i19;
                                                    int i41 = i10 + 0;
                                                    int i42 = i10 + 1;
                                                    path2.lineTo(fArr13[i41], fArr13[i42]);
                                                    f26 = fArr13[i41];
                                                    f25 = fArr13[i42];
                                                }
                                                f43 = f26;
                                                f44 = f25;
                                            } else {
                                                float[] fArr14 = fArr2;
                                                i10 = i19;
                                                f23 = f44;
                                                float f58 = f43;
                                                int i43 = i10 + 0;
                                                path2.rLineTo(0.0f, fArr14[i43]);
                                                f24 = fArr14[i43];
                                            }
                                            f44 = f23 + f24;
                                        } else {
                                            float[] fArr15 = fArr2;
                                            i15 = i19;
                                            f18 = f44;
                                            float f59 = f43;
                                            int i44 = i15 + 0;
                                            int i45 = i15 + 1;
                                            int i46 = i15 + 2;
                                            int i47 = i15 + 3;
                                            path2.rQuadTo(fArr15[i44], fArr15[i45], fArr15[i46], fArr15[i47]);
                                            f21 = fArr15[i44] + f59;
                                            f20 = fArr15[i45] + f18;
                                            float f60 = f59 + fArr15[i46];
                                            float f61 = fArr15[i47];
                                            f19 = f60;
                                            f22 = f61;
                                        }
                                        c3 = c13;
                                        aVar = aVar3;
                                        i11 = i18;
                                    } else {
                                        float[] fArr16 = fArr2;
                                        i15 = i19;
                                        f18 = f44;
                                        float f62 = f43;
                                        int i48 = i15 + 2;
                                        int i49 = i15 + 3;
                                        int i50 = i15 + 4;
                                        int i51 = i15 + 5;
                                        path.rCubicTo(fArr16[i15 + 0], fArr16[i15 + 1], fArr16[i48], fArr16[i49], fArr16[i50], fArr16[i51]);
                                        f21 = fArr16[i48] + f62;
                                        f20 = fArr16[i49] + f18;
                                        f19 = f62 + fArr16[i50];
                                        f22 = fArr16[i51];
                                    }
                                    f16 = f18 + f22;
                                    f11 = f21;
                                    f10 = f20;
                                    f17 = f19;
                                    f43 = f17;
                                    f44 = f16;
                                    c3 = c13;
                                    aVar = aVar3;
                                    i11 = i18;
                                } else {
                                    float[] fArr17 = fArr2;
                                    i12 = i19;
                                    float f63 = f44;
                                    float f64 = f43;
                                    int i52 = i12 + 5;
                                    int i53 = i12 + 6;
                                    c10 = c13;
                                    aVar2 = aVar3;
                                    i13 = i18;
                                    a(path, f64, f63, fArr17[i52] + f64, fArr17[i53] + f63, fArr17[i12 + 0], fArr17[i12 + 1], fArr17[i12 + 2], fArr17[i12 + 3] != 0.0f, fArr17[i12 + 4] != 0.0f);
                                    f12 = f64 + fArr17[i52];
                                    f13 = f63 + fArr17[i53];
                                }
                                i19 = i10 + i8;
                                aVar3 = aVar;
                                c12 = c3;
                                c13 = c12;
                                i18 = i11;
                                c11 = 'm';
                                i17 = 0;
                                a[] aVarArr3 = aVarArr;
                            } else {
                                float[] fArr18 = fArr2;
                                i14 = i19;
                                c3 = c13;
                                aVar = aVar3;
                                i11 = i18;
                                int i54 = i14 + 2;
                                int i55 = i14 + 3;
                                int i56 = i14 + 4;
                                int i57 = i14 + 5;
                                path.cubicTo(fArr18[i14 + 0], fArr18[i14 + 1], fArr18[i54], fArr18[i55], fArr18[i56], fArr18[i57]);
                                float f65 = fArr18[i56];
                                float f66 = fArr18[i57];
                                f15 = fArr18[i54];
                                f43 = f65;
                                f44 = f66;
                                f14 = fArr18[i55];
                            }
                            f11 = f15;
                            f10 = f14;
                            i19 = i10 + i8;
                            aVar3 = aVar;
                            c12 = c3;
                            c13 = c12;
                            i18 = i11;
                            c11 = 'm';
                            i17 = 0;
                            a[] aVarArr32 = aVarArr;
                        } else {
                            float[] fArr19 = fArr2;
                            i12 = i19;
                            c10 = c13;
                            aVar2 = aVar3;
                            i13 = i18;
                            int i58 = i12 + 5;
                            int i59 = i12 + 6;
                            a(path, f43, f44, fArr19[i58], fArr19[i59], fArr19[i12 + 0], fArr19[i12 + 1], fArr19[i12 + 2], fArr19[i12 + 3] != 0.0f, fArr19[i12 + 4] != 0.0f);
                            f12 = fArr19[i58];
                            f13 = fArr19[i59];
                        }
                        f10 = f44;
                        f11 = f43;
                        i19 = i10 + i8;
                        aVar3 = aVar;
                        c12 = c3;
                        c13 = c12;
                        i18 = i11;
                        c11 = 'm';
                        i17 = 0;
                        a[] aVarArr322 = aVarArr;
                    } else {
                        int i60 = i18;
                        int i61 = i17;
                        fArr[i61] = f43;
                        fArr[1] = f44;
                        fArr[2] = f11;
                        fArr[3] = f10;
                        fArr[4] = f41;
                        fArr[5] = f42;
                        i18 = i60 + 1;
                        i16 = 6;
                        c11 = 'm';
                        i17 = i61;
                        c12 = aVarArr[i60].f16126a;
                        aVarArr2 = aVarArr;
                    }
                }
            }
        }

        public a(a aVar) {
            this.f16126a = aVar.f16126a;
            float[] fArr = aVar.f16127b;
            this.f16127b = g.b(fArr, fArr.length);
        }
    }
}
