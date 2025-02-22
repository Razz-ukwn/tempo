package wg;

import ag.d;
import cb.b;
import gf.l;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import sf.j;

public class i implements Serializable, Comparable<i> {

    /* renamed from: d  reason: collision with root package name */
    public static final i f16760d = new i(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16761a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f16762b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f16763c;

    public static final class a {
        public static i a(String str) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    int i10 = i8 * 2;
                    bArr[i8] = (byte) (b.h(str.charAt(i10 + 1)) + (b.h(str.charAt(i10)) << 4));
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }

        public static i b(String str) {
            j.f(str, "<this>");
            byte[] bytes = str.getBytes(zf.a.f17962b);
            j.e(bytes, "this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.f16763c = str;
            return iVar;
        }

        public static i c(byte[] bArr) {
            i iVar = i.f16760d;
            int length = bArr.length;
            d.d((long) bArr.length, (long) 0, (long) length);
            return new i(l.Y(bArr, 0, length + 0));
        }
    }

    static {
        new a();
    }

    public i(byte[] bArr) {
        j.f(bArr, "data");
        this.f16761a = bArr;
    }

    public static int g(i iVar, i iVar2) {
        iVar.getClass();
        j.f(iVar2, "other");
        return iVar.f(iVar2.f16761a, 0);
    }

    public static int k(i iVar, i iVar2) {
        iVar.getClass();
        j.f(iVar2, "other");
        return iVar.j(iVar2.f16761a, -1234567890);
    }

    public static /* synthetic */ i o(i iVar, int i8, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i8 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return iVar.n(i8, i10);
    }

    public String a() {
        byte[] bArr = l0.f16786a;
        byte[] bArr2 = this.f16761a;
        j.f(bArr2, "<this>");
        j.f(bArr, "map");
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i8 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = i8 + 1;
            byte b10 = bArr2[i8];
            int i12 = i11 + 1;
            byte b11 = bArr2[i11];
            int i13 = i12 + 1;
            byte b12 = bArr2[i12];
            int i14 = i10 + 1;
            bArr3[i10] = bArr[(b10 & 255) >> 2];
            int i15 = i14 + 1;
            bArr3[i14] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i16 = i15 + 1;
            bArr3[i15] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 = i16 + 1;
            bArr3[i16] = bArr[b12 & 63];
            i8 = i13;
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b13 = bArr2[i8];
            int i17 = i10 + 1;
            bArr3[i10] = bArr[(b13 & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i18] = b14;
            bArr3[i18 + 1] = b14;
        } else if (length2 == 2) {
            int i19 = i8 + 1;
            byte b15 = bArr2[i8];
            byte b16 = bArr2[i19];
            int i20 = i10 + 1;
            bArr3[i10] = bArr[(b15 & 255) >> 2];
            int i21 = i20 + 1;
            bArr3[i20] = bArr[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i21] = bArr[(b16 & 15) << 2];
            bArr3[i21 + 1] = (byte) 61;
        }
        return new String(bArr3, zf.a.f17962b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r0 < r1) goto L_0x0030;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(wg.i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            sf.j.f(r10, r0)
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r6
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.i.compareTo(wg.i):int");
    }

    public i c(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f16761a, 0, d());
        byte[] digest = instance.digest();
        j.e(digest, "digestBytes");
        return new i(digest);
    }

    public int d() {
        return this.f16761a.length;
    }

    public String e() {
        byte[] bArr = this.f16761a;
        char[] cArr = new char[(bArr.length * 2)];
        int i8 = 0;
        for (byte b10 : bArr) {
            int i10 = i8 + 1;
            char[] cArr2 = b.D;
            cArr[i8] = cArr2[(b10 >> 4) & 15];
            i8 = i10 + 1;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int d10 = iVar.d();
            byte[] bArr = this.f16761a;
            if (d10 == bArr.length && iVar.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i8) {
        j.f(bArr, "other");
        byte[] bArr2 = this.f16761a;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i8, 0);
        if (max <= length) {
            while (!d.c(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f16761a;
    }

    public int hashCode() {
        int i8 = this.f16762b;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = Arrays.hashCode(this.f16761a);
        this.f16762b = hashCode;
        return hashCode;
    }

    public byte i(int i8) {
        return this.f16761a[i8];
    }

    public int j(byte[] bArr, int i8) {
        j.f(bArr, "other");
        int i10 = d.i(this, i8);
        byte[] bArr2 = this.f16761a;
        for (int min = Math.min(i10, bArr2.length - bArr.length); -1 < min; min--) {
            if (d.c(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i8, i iVar, int i10) {
        j.f(iVar, "other");
        return iVar.m(0, this.f16761a, i8, i10);
    }

    public boolean m(int i8, byte[] bArr, int i10, int i11) {
        j.f(bArr, "other");
        if (i8 >= 0) {
            byte[] bArr2 = this.f16761a;
            return i8 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && d.c(i8, i10, i11, bArr2, bArr);
        }
    }

    public i n(int i8, int i10) {
        int i11 = d.i(this, i10);
        boolean z10 = true;
        if (i8 >= 0) {
            byte[] bArr = this.f16761a;
            if (i11 <= bArr.length) {
                if (i11 - i8 < 0) {
                    z10 = false;
                }
                if (z10) {
                    return (i8 == 0 && i11 == bArr.length) ? this : new i(l.Y(bArr, i8, i11));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(rb.b.a(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public i p() {
        byte b10;
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f16761a;
            if (i8 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i8];
            byte b12 = (byte) 65;
            if (b11 < b12 || b11 > (b10 = (byte) 90)) {
                i8++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                j.e(copyOf, "copyOf(this, size)");
                copyOf[i8] = (byte) (b11 + 32);
                for (int i10 = i8 + 1; i10 < copyOf.length; i10++) {
                    byte b13 = copyOf[i10];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i10] = (byte) (b13 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
    }

    public final String q() {
        String str = this.f16763c;
        if (str != null) {
            return str;
        }
        byte[] h3 = h();
        j.f(h3, "<this>");
        String str2 = new String(h3, zf.a.f17962b);
        this.f16763c = str2;
        return str2;
    }

    public void r(e eVar, int i8) {
        j.f(eVar, "buffer");
        eVar.write(this.f16761a, 0, i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00fa, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x010b, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x011a, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x012c, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0139, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0181, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0192, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01a3, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x01b2, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01c8, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x01d5, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x01dc, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x021b, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x021e, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0098, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00a7, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00b2, code lost:
        if (r3 == 64) goto L_0x021f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x021e A[EDGE_INSN: B:244:0x021e->B:214:0x021e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x021e A[EDGE_INSN: B:253:0x021e->B:214:0x021e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x021e A[EDGE_INSN: B:256:0x021e->B:214:0x021e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x021e A[EDGE_INSN: B:260:0x021e->B:214:0x021e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x021e A[EDGE_INSN: B:271:0x021e->B:214:0x021e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r15 = this;
            byte[] r0 = r15.f16761a
            int r1 = r0.length
            if (r1 != 0) goto L_0x0007
            r1 = 1
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            if (r1 == 0) goto L_0x000e
            java.lang.String r0 = "[size=0]"
            goto L_0x02fe
        L_0x000e:
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0012:
            r5 = 64
            if (r2 >= r1) goto L_0x021f
            byte r6 = r0[r2]
            r7 = 13
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 160(0xa0, float:2.24E-43)
            r10 = 32
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 65536(0x10000, float:9.18355E-41)
            r13 = 10
            if (r6 < 0) goto L_0x008d
            int r14 = r3 + 1
            if (r3 != r5) goto L_0x002f
            goto L_0x021f
        L_0x002f:
            if (r6 == r13) goto L_0x004b
            if (r6 == r7) goto L_0x004b
            if (r6 < 0) goto L_0x0039
            if (r6 >= r10) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 != 0) goto L_0x0048
            if (r8 > r6) goto L_0x0042
            if (r6 >= r9) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            if (r3 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r3 = 0
            goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 != 0) goto L_0x021e
        L_0x004b:
            if (r6 != r11) goto L_0x004f
            goto L_0x021e
        L_0x004f:
            if (r6 >= r12) goto L_0x0053
            r3 = 1
            goto L_0x0054
        L_0x0053:
            r3 = 2
        L_0x0054:
            int r4 = r4 + r3
            int r2 = r2 + 1
        L_0x0057:
            r3 = r14
            if (r2 >= r1) goto L_0x0012
            byte r6 = r0[r2]
            if (r6 < 0) goto L_0x0012
            int r2 = r2 + 1
            int r14 = r3 + 1
            if (r3 != r5) goto L_0x0066
            goto L_0x021f
        L_0x0066:
            if (r6 == r13) goto L_0x0082
            if (r6 == r7) goto L_0x0082
            if (r6 < 0) goto L_0x0070
            if (r6 >= r10) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 != 0) goto L_0x007f
            if (r8 > r6) goto L_0x0079
            if (r6 >= r9) goto L_0x0079
            r3 = 1
            goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r3 = 0
            goto L_0x0080
        L_0x007f:
            r3 = 1
        L_0x0080:
            if (r3 != 0) goto L_0x021e
        L_0x0082:
            if (r6 != r11) goto L_0x0086
            goto L_0x021e
        L_0x0086:
            if (r6 >= r12) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 2
        L_0x008b:
            int r4 = r4 + r3
            goto L_0x0057
        L_0x008d:
            int r11 = r6 >> 5
            r12 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r11 != r12) goto L_0x00ec
            int r11 = r2 + 1
            if (r1 > r11) goto L_0x009c
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x009c:
            byte r11 = r0[r11]
            r12 = r11 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x00a4
            r12 = 1
            goto L_0x00a5
        L_0x00a4:
            r12 = 0
        L_0x00a5:
            if (r12 != 0) goto L_0x00ab
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x00ab:
            r11 = r11 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r11
            if (r6 >= r14) goto L_0x00b6
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x00b6:
            int r11 = r3 + 1
            if (r3 != r5) goto L_0x00bc
            goto L_0x021f
        L_0x00bc:
            if (r6 == r13) goto L_0x00d8
            if (r6 == r7) goto L_0x00d8
            if (r6 < 0) goto L_0x00c6
            if (r6 >= r10) goto L_0x00c6
            r3 = 1
            goto L_0x00c7
        L_0x00c6:
            r3 = 0
        L_0x00c7:
            if (r3 != 0) goto L_0x00d5
            if (r8 > r6) goto L_0x00cf
            if (r6 >= r9) goto L_0x00cf
            r3 = 1
            goto L_0x00d0
        L_0x00cf:
            r3 = 0
        L_0x00d0:
            if (r3 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r3 = 0
            goto L_0x00d6
        L_0x00d5:
            r3 = 1
        L_0x00d6:
            if (r3 != 0) goto L_0x021e
        L_0x00d8:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r3) goto L_0x00df
            goto L_0x021e
        L_0x00df:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r3) goto L_0x00e5
            r3 = 1
            goto L_0x00e6
        L_0x00e5:
            r3 = 2
        L_0x00e6:
            int r4 = r4 + r3
            int r2 = r2 + 2
            r3 = r11
            goto L_0x0012
        L_0x00ec:
            int r8 = r6 >> 4
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r8 != r12) goto L_0x0179
            int r8 = r2 + 2
            if (r1 > r8) goto L_0x00fe
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x00fe:
            int r11 = r2 + 1
            byte r11 = r0[r11]
            r12 = r11 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x0108
            r12 = 1
            goto L_0x0109
        L_0x0108:
            r12 = 0
        L_0x0109:
            if (r12 != 0) goto L_0x010f
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x010f:
            byte r8 = r0[r8]
            r12 = r8 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x0117
            r12 = 1
            goto L_0x0118
        L_0x0117:
            r12 = 0
        L_0x0118:
            if (r12 != 0) goto L_0x011e
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x011e:
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r8 = r8 ^ r12
            int r11 = r11 << 6
            r8 = r8 ^ r11
            int r6 = r6 << 12
            r6 = r6 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r6 >= r8) goto L_0x0130
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x0130:
            if (r10 > r6) goto L_0x0136
            if (r6 >= r9) goto L_0x0136
            r8 = 1
            goto L_0x0137
        L_0x0136:
            r8 = 0
        L_0x0137:
            if (r8 == 0) goto L_0x013d
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x013d:
            int r8 = r3 + 1
            if (r3 != r5) goto L_0x0143
            goto L_0x021f
        L_0x0143:
            if (r6 == r13) goto L_0x0165
            if (r6 == r7) goto L_0x0165
            if (r6 < 0) goto L_0x014f
            r3 = 32
            if (r6 >= r3) goto L_0x014f
            r3 = 1
            goto L_0x0150
        L_0x014f:
            r3 = 0
        L_0x0150:
            if (r3 != 0) goto L_0x0162
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r6) goto L_0x015c
            r3 = 160(0xa0, float:2.24E-43)
            if (r6 >= r3) goto L_0x015c
            r3 = 1
            goto L_0x015d
        L_0x015c:
            r3 = 0
        L_0x015d:
            if (r3 == 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r3 = 0
            goto L_0x0163
        L_0x0162:
            r3 = 1
        L_0x0163:
            if (r3 != 0) goto L_0x021e
        L_0x0165:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r3) goto L_0x016c
            goto L_0x021e
        L_0x016c:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r3) goto L_0x0172
            r3 = 1
            goto L_0x0173
        L_0x0172:
            r3 = 2
        L_0x0173:
            int r4 = r4 + r3
            int r2 = r2 + 3
            r3 = r8
            goto L_0x0012
        L_0x0179:
            int r7 = r6 >> 3
            if (r7 != r12) goto L_0x021b
            int r7 = r2 + 3
            if (r1 > r7) goto L_0x0185
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x0185:
            int r8 = r2 + 1
            byte r8 = r0[r8]
            r11 = r8 & 192(0xc0, float:2.69E-43)
            if (r11 != r14) goto L_0x018f
            r11 = 1
            goto L_0x0190
        L_0x018f:
            r11 = 0
        L_0x0190:
            if (r11 != 0) goto L_0x0196
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x0196:
            int r11 = r2 + 2
            byte r11 = r0[r11]
            r12 = r11 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x01a0
            r12 = 1
            goto L_0x01a1
        L_0x01a0:
            r12 = 0
        L_0x01a1:
            if (r12 != 0) goto L_0x01a7
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x01a7:
            byte r7 = r0[r7]
            r12 = r7 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x01af
            r12 = 1
            goto L_0x01b0
        L_0x01af:
            r12 = 0
        L_0x01b0:
            if (r12 != 0) goto L_0x01b6
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x01b6:
            r12 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r12
            int r11 = r11 << 6
            r7 = r7 ^ r11
            int r8 = r8 << 12
            r7 = r7 ^ r8
            int r6 = r6 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L_0x01cc
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x01cc:
            if (r10 > r6) goto L_0x01d2
            if (r6 >= r9) goto L_0x01d2
            r7 = 1
            goto L_0x01d3
        L_0x01d2:
            r7 = 0
        L_0x01d3:
            if (r7 == 0) goto L_0x01d8
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x01d8:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r7) goto L_0x01df
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x01df:
            int r7 = r3 + 1
            if (r3 != r5) goto L_0x01e4
            goto L_0x021f
        L_0x01e4:
            if (r6 == r13) goto L_0x0208
            r3 = 13
            if (r6 == r3) goto L_0x0208
            if (r6 < 0) goto L_0x01f2
            r3 = 32
            if (r6 >= r3) goto L_0x01f2
            r3 = 1
            goto L_0x01f3
        L_0x01f2:
            r3 = 0
        L_0x01f3:
            if (r3 != 0) goto L_0x0205
            r3 = 127(0x7f, float:1.78E-43)
            if (r3 > r6) goto L_0x01ff
            r3 = 160(0xa0, float:2.24E-43)
            if (r6 >= r3) goto L_0x01ff
            r3 = 1
            goto L_0x0200
        L_0x01ff:
            r3 = 0
        L_0x0200:
            if (r3 == 0) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r3 = 0
            goto L_0x0206
        L_0x0205:
            r3 = 1
        L_0x0206:
            if (r3 != 0) goto L_0x021e
        L_0x0208:
            r3 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r3) goto L_0x020e
            goto L_0x021e
        L_0x020e:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r3) goto L_0x0214
            r3 = 1
            goto L_0x0215
        L_0x0214:
            r3 = 2
        L_0x0215:
            int r4 = r4 + r3
            int r2 = r2 + 4
            r3 = r7
            goto L_0x0012
        L_0x021b:
            if (r3 != r5) goto L_0x021e
            goto L_0x021f
        L_0x021e:
            r4 = -1
        L_0x021f:
            java.lang.String r1 = "…]"
            java.lang.String r2 = "[size="
            r3 = 93
            r6 = -1
            if (r4 != r6) goto L_0x02a8
            int r4 = r0.length
            if (r4 > r5) goto L_0x0242
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r15.e()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x02fe
        L_0x0242:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r2 = r0.length
            r3.append(r2)
            java.lang.String r2 = " hex="
            r3.append(r2)
            int r2 = ag.d.i(r15, r5)
            int r4 = r0.length
            if (r2 > r4) goto L_0x0259
            r4 = 1
            goto L_0x025a
        L_0x0259:
            r4 = 0
        L_0x025a:
            if (r4 == 0) goto L_0x0290
            int r4 = r2 + 0
            if (r4 < 0) goto L_0x0262
            r4 = 1
            goto L_0x0263
        L_0x0262:
            r4 = 0
        L_0x0263:
            if (r4 == 0) goto L_0x0284
            int r4 = r0.length
            if (r2 != r4) goto L_0x026a
            r4 = r15
            goto L_0x0274
        L_0x026a:
            wg.i r4 = new wg.i
            r5 = 0
            byte[] r0 = gf.l.Y(r0, r5, r2)
            r4.<init>(r0)
        L_0x0274:
            java.lang.String r0 = r4.e()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x02fe
        L_0x0284:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "endIndex < beginIndex"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0290:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "endIndex > length("
            r1.<init>(r2)
            int r0 = r0.length
            r2 = 41
            java.lang.String r0 = rb.b.a(r1, r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02a8:
            java.lang.String r5 = r15.q()
            r6 = 0
            java.lang.String r6 = r5.substring(r6, r4)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            sf.j.e(r6, r7)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = zf.j.v0(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = zf.j.v0(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = zf.j.v0(r6, r7, r8)
            int r5 = r5.length()
            if (r4 >= r5) goto L_0x02ed
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            r3.append(r0)
            java.lang.String r0 = " text="
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x02fe
        L_0x02ed:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x02fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.i.toString():java.lang.String");
    }
}
