package hb;

import ab.s;
import androidx.fragment.app.z;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import db.f;
import h0.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class a implements Closeable {
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public long E;
    public int F;
    public String G;
    public int[] H;
    public int I;
    public String[] J;
    public int[] K;

    /* renamed from: a  reason: collision with root package name */
    public final Reader f9287a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9288b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f9289c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    public int f9290d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f9291e = 0;

    /* renamed from: hb.a$a  reason: collision with other inner class name */
    public class C0164a extends z {
        public final void F(a aVar) {
            if (aVar instanceof f) {
                f fVar = (f) aVar;
                fVar.x0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) fVar.E0()).next();
                fVar.G0(entry.getValue());
                fVar.G0(new s((String) entry.getKey()));
                return;
            }
            int i8 = aVar.D;
            if (i8 == 0) {
                i8 = aVar.j();
            }
            if (i8 == 13) {
                aVar.D = 9;
            } else if (i8 == 12) {
                aVar.D = 8;
            } else if (i8 == 14) {
                aVar.D = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + e.d(aVar.k0()) + aVar.L());
            }
        }
    }

    static {
        z.f2174a = new C0164a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.H = iArr;
        this.I = 1;
        iArr[0] = 6;
        this.J = new String[32];
        this.K = new int[32];
        this.f9287a = reader;
    }

    public String D() {
        return z(true);
    }

    public boolean F() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        return (i8 == 2 || i8 == 4 || i8 == 17) ? false : true;
    }

    public final boolean K(char c3) {
        if (c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (!(c3 == '/' || c3 == '=')) {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public final String L() {
        return " at line " + (this.B + 1) + " column " + ((this.f9290d - this.C) + 1) + " path " + u();
    }

    public boolean Q() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 5) {
            this.D = 0;
            int[] iArr = this.K;
            int i10 = this.I - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i8 == 6) {
            this.D = 0;
            int[] iArr2 = this.K;
            int i11 = this.I - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + e.d(k0()) + L());
        }
    }

    public double R() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 15) {
            this.D = 0;
            int[] iArr = this.K;
            int i10 = this.I - 1;
            iArr[i10] = iArr[i10] + 1;
            return (double) this.E;
        }
        if (i8 == 16) {
            this.G = new String(this.f9289c, this.f9290d, this.F);
            this.f9290d += this.F;
        } else if (i8 == 8 || i8 == 9) {
            this.G = e0(i8 == 8 ? '\'' : '\"');
        } else if (i8 == 10) {
            this.G = g0();
        } else if (i8 != 11) {
            throw new IllegalStateException("Expected a double but was " + e.d(k0()) + L());
        }
        this.D = 11;
        double parseDouble = Double.parseDouble(this.G);
        if (this.f9288b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.G = null;
            this.D = 0;
            int[] iArr2 = this.K;
            int i11 = this.I - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return parseDouble;
        }
        throw new c("JSON forbids NaN and infinities: " + parseDouble + L());
    }

    public int T() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 15) {
            long j10 = this.E;
            int i10 = (int) j10;
            if (j10 == ((long) i10)) {
                this.D = 0;
                int[] iArr = this.K;
                int i11 = this.I - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.E + L());
        }
        if (i8 == 16) {
            this.G = new String(this.f9289c, this.f9290d, this.F);
            this.f9290d += this.F;
        } else if (i8 == 8 || i8 == 9 || i8 == 10) {
            if (i8 == 10) {
                this.G = g0();
            } else {
                this.G = e0(i8 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.G);
                this.D = 0;
                int[] iArr2 = this.K;
                int i12 = this.I - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + e.d(k0()) + L());
        }
        this.D = 11;
        double parseDouble = Double.parseDouble(this.G);
        int i13 = (int) parseDouble;
        if (((double) i13) == parseDouble) {
            this.G = null;
            this.D = 0;
            int[] iArr3 = this.K;
            int i14 = this.I - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        }
        throw new NumberFormatException("Expected an int but was " + this.G + L());
    }

    public long X() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 15) {
            this.D = 0;
            int[] iArr = this.K;
            int i10 = this.I - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.E;
        }
        if (i8 == 16) {
            this.G = new String(this.f9289c, this.f9290d, this.F);
            this.f9290d += this.F;
        } else if (i8 == 8 || i8 == 9 || i8 == 10) {
            if (i8 == 10) {
                this.G = g0();
            } else {
                this.G = e0(i8 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.G);
                this.D = 0;
                int[] iArr2 = this.K;
                int i11 = this.I - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + e.d(k0()) + L());
        }
        this.D = 11;
        double parseDouble = Double.parseDouble(this.G);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.G = null;
            this.D = 0;
            int[] iArr3 = this.K;
            int i12 = this.I - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.G + L());
    }

    public String Y() {
        String str;
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 14) {
            str = g0();
        } else if (i8 == 12) {
            str = e0('\'');
        } else if (i8 == 13) {
            str = e0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + e.d(k0()) + L());
        }
        this.D = 0;
        this.J[this.I - 1] = str;
        return str;
    }

    public final int b0(boolean z10) {
        int i8 = this.f9290d;
        int i10 = this.f9291e;
        while (true) {
            boolean z11 = true;
            if (i8 == i10) {
                this.f9290d = i8;
                if (s(1)) {
                    i8 = this.f9290d;
                    i10 = this.f9291e;
                } else if (!z10) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + L());
                }
            }
            int i11 = i8 + 1;
            char[] cArr = this.f9289c;
            char c3 = cArr[i8];
            if (c3 == 10) {
                this.B++;
                this.C = i11;
            } else if (!(c3 == ' ' || c3 == 13 || c3 == 9)) {
                if (c3 == '/') {
                    this.f9290d = i11;
                    if (i11 == i10) {
                        this.f9290d = i11 - 1;
                        boolean s10 = s(2);
                        this.f9290d++;
                        if (!s10) {
                            return c3;
                        }
                    }
                    e();
                    int i12 = this.f9290d;
                    char c10 = cArr[i12];
                    if (c10 == '*') {
                        this.f9290d = i12 + 1;
                        while (true) {
                            int i13 = 0;
                            if (this.f9290d + 2 > this.f9291e && !s(2)) {
                                z11 = false;
                                break;
                            }
                            int i14 = this.f9290d;
                            if (cArr[i14] != 10) {
                                while (i13 < 2) {
                                    if (cArr[this.f9290d + i13] == "*/".charAt(i13)) {
                                        i13++;
                                    }
                                }
                                break;
                            }
                            this.B++;
                            this.C = i14 + 1;
                            this.f9290d++;
                        }
                        if (z11) {
                            i8 = this.f9290d + 2;
                            i10 = this.f9291e;
                        } else {
                            w0("Unterminated comment");
                            throw null;
                        }
                    } else if (c10 != '/') {
                        return c3;
                    } else {
                        this.f9290d = i12 + 1;
                        q0();
                        i8 = this.f9290d;
                        i10 = this.f9291e;
                    }
                } else if (c3 == '#') {
                    this.f9290d = i11;
                    e();
                    q0();
                    i8 = this.f9290d;
                    i10 = this.f9291e;
                } else {
                    this.f9290d = i11;
                    return c3;
                }
            }
            i8 = i11;
        }
    }

    public void c() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 3) {
            m0(1);
            this.K[this.I - 1] = 0;
            this.D = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + e.d(k0()) + L());
    }

    public void close() {
        this.D = 0;
        this.H[0] = 8;
        this.I = 1;
        this.f9287a.close();
    }

    public void d() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 1) {
            m0(3);
            this.D = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + e.d(k0()) + L());
    }

    public void d0() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 7) {
            this.D = 0;
            int[] iArr = this.K;
            int i10 = this.I - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + e.d(k0()) + L());
    }

    public final void e() {
        if (!this.f9288b) {
            w0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r10.f9290d = r8;
        r8 = (r8 - r2) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r8 + 1) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r7, r2, r4 - r2);
        r10.f9290d = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e0(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r10.f9290d
            int r3 = r10.f9291e
        L_0x0006:
            r4 = r2
        L_0x0007:
            r5 = 1
            r6 = 16
            char[] r7 = r10.f9289c
            if (r4 >= r3) goto L_0x005c
            int r8 = r4 + 1
            char r4 = r7[r4]
            if (r4 != r11) goto L_0x0028
            r10.f9290d = r8
            int r8 = r8 - r2
            int r8 = r8 - r5
            if (r1 != 0) goto L_0x0020
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r2, r8)
            return r11
        L_0x0020:
            r1.append(r7, r2, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x0028:
            r9 = 92
            if (r4 != r9) goto L_0x004f
            r10.f9290d = r8
            int r8 = r8 - r2
            int r8 = r8 - r5
            if (r1 != 0) goto L_0x0040
            int r1 = r8 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r3.<init>(r1)
            r1 = r3
        L_0x0040:
            r1.append(r7, r2, r8)
            char r2 = r10.n0()
            r1.append(r2)
            int r2 = r10.f9290d
            int r3 = r10.f9291e
            goto L_0x0006
        L_0x004f:
            r6 = 10
            if (r4 != r6) goto L_0x005a
            int r4 = r10.B
            int r4 = r4 + r5
            r10.B = r4
            r10.C = r8
        L_0x005a:
            r4 = r8
            goto L_0x0007
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r4 - r2
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r3.<init>(r1)
            r1 = r3
        L_0x006c:
            int r3 = r4 - r2
            r1.append(r7, r2, r3)
            r10.f9290d = r4
            boolean r2 = r10.s(r5)
            if (r2 == 0) goto L_0x007a
            goto L_0x0002
        L_0x007a:
            java.lang.String r11 = "Unterminated string"
            r10.w0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.a.e0(char):java.lang.String");
    }

    public String f0() {
        String str;
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 10) {
            str = g0();
        } else if (i8 == 8) {
            str = e0('\'');
        } else if (i8 == 9) {
            str = e0('\"');
        } else if (i8 == 11) {
            str = this.G;
            this.G = null;
        } else if (i8 == 15) {
            str = Long.toString(this.E);
        } else if (i8 == 16) {
            str = new String(this.f9289c, this.f9290d, this.F);
            this.f9290d += this.F;
        } else {
            throw new IllegalStateException("Expected a string but was " + e.d(k0()) + L());
        }
        this.D = 0;
        int[] iArr = this.K;
        int i10 = this.I - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g0() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r7.f9290d
            int r4 = r3 + r2
            int r5 = r7.f9291e
            char[] r6 = r7.f9289c
            if (r4 >= r5) goto L_0x004e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x004a;
                case 93: goto L_0x005a;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r7.e()
            goto L_0x005a
        L_0x004e:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r7.s(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r1 = r2
            goto L_0x007a
        L_0x005c:
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x0069:
            int r3 = r7.f9290d
            r0.append(r6, r3, r2)
            int r3 = r7.f9290d
            int r3 = r3 + r2
            r7.f9290d = r3
            r2 = 1
            boolean r2 = r7.s(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f9290d
            r0.<init>(r6, r2, r1)
            goto L_0x008d
        L_0x0084:
            int r2 = r7.f9290d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L_0x008d:
            int r2 = r7.f9290d
            int r2 = r2 + r1
            r7.f9290d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.a.g0():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0208, code lost:
        if (K(r1) != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x020a, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x020b, code lost:
        if (r5 != 2) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x020d, code lost:
        if (r13 == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0213, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0215, code lost:
        if (r12 == 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x021b, code lost:
        if (r7 != 0) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x021d, code lost:
        if (r12 != 0) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x021f, code lost:
        if (r12 == 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0222, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0223, code lost:
        r0.E = r7;
        r0.f9290d += r11;
        r7 = 15;
        r0.D = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0230, code lost:
        if (r5 == r1) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0233, code lost:
        if (r5 == 4) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0236, code lost:
        if (r5 != 7) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0238, code lost:
        r0.F = r11;
        r7 = 16;
        r0.D = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0179 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j() {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.H
            int r2 = r0.I
            int r3 = r2 + -1
            r3 = r1[r3]
            r9 = 0
            r10 = 39
            r11 = 93
            r12 = 59
            r13 = 44
            r14 = 3
            r15 = 6
            char[] r6 = r0.f9289c
            r5 = 2
            r7 = 4
            r8 = 5
            r4 = 1
            if (r3 != r4) goto L_0x0023
            int r2 = r2 - r4
            r1[r2] = r5
        L_0x0020:
            r5 = 7
            goto L_0x00be
        L_0x0023:
            if (r3 != r5) goto L_0x003c
            int r1 = r0.b0(r4)
            if (r1 == r13) goto L_0x0020
            if (r1 == r12) goto L_0x0038
            if (r1 != r11) goto L_0x0032
            r0.D = r7
            return r7
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.w0(r1)
            throw r9
        L_0x0038:
            r19.e()
            goto L_0x0020
        L_0x003c:
            r5 = 125(0x7d, float:1.75E-43)
            if (r3 == r14) goto L_0x02c6
            if (r3 != r8) goto L_0x0044
            goto L_0x02c6
        L_0x0044:
            if (r3 != r7) goto L_0x0076
            int r2 = r2 - r4
            r1[r2] = r8
            int r1 = r0.b0(r4)
            r2 = 58
            if (r1 == r2) goto L_0x0020
            r2 = 61
            if (r1 != r2) goto L_0x0070
            r19.e()
            int r1 = r0.f9290d
            int r2 = r0.f9291e
            if (r1 < r2) goto L_0x0064
            boolean r1 = r0.s(r4)
            if (r1 == 0) goto L_0x0020
        L_0x0064:
            int r1 = r0.f9290d
            char r2 = r6[r1]
            r5 = 62
            if (r2 != r5) goto L_0x0020
            int r1 = r1 + r4
            r0.f9290d = r1
            goto L_0x0020
        L_0x0070:
            java.lang.String r1 = "Expected ':'"
            r0.w0(r1)
            throw r9
        L_0x0076:
            if (r3 != r15) goto L_0x00c0
            boolean r1 = r0.f9288b
            if (r1 == 0) goto L_0x00b6
            r0.b0(r4)
            int r1 = r0.f9290d
            int r1 = r1 - r4
            r0.f9290d = r1
            int r1 = r1 + r8
            int r2 = r0.f9291e
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r0.s(r8)
            if (r1 != 0) goto L_0x0090
            goto L_0x00b6
        L_0x0090:
            int r1 = r0.f9290d
            char r2 = r6[r1]
            r9 = 41
            if (r2 != r9) goto L_0x00b6
            int r2 = r1 + 1
            char r2 = r6[r2]
            if (r2 != r11) goto L_0x00b6
            int r2 = r1 + 2
            char r2 = r6[r2]
            if (r2 != r5) goto L_0x00b6
            int r2 = r1 + 3
            char r2 = r6[r2]
            if (r2 != r10) goto L_0x00b6
            int r2 = r1 + 4
            char r2 = r6[r2]
            r5 = 10
            if (r2 == r5) goto L_0x00b3
            goto L_0x00b6
        L_0x00b3:
            int r1 = r1 + r8
            r0.f9290d = r1
        L_0x00b6:
            int[] r1 = r0.H
            int r2 = r0.I
            int r2 = r2 - r4
            r5 = 7
            r1[r2] = r5
        L_0x00be:
            r1 = 0
            goto L_0x00de
        L_0x00c0:
            r5 = 7
            if (r3 != r5) goto L_0x00d9
            r1 = 0
            int r2 = r0.b0(r1)
            r5 = -1
            if (r2 != r5) goto L_0x00d0
            r1 = 17
            r0.D = r1
            return r1
        L_0x00d0:
            r19.e()
            int r2 = r0.f9290d
            int r2 = r2 - r4
            r0.f9290d = r2
            goto L_0x00de
        L_0x00d9:
            r1 = 0
            r2 = 8
            if (r3 == r2) goto L_0x02be
        L_0x00de:
            int r2 = r0.b0(r4)
            r5 = 34
            if (r2 == r5) goto L_0x02b9
            if (r2 == r10) goto L_0x02b1
            if (r2 == r13) goto L_0x0298
            if (r2 == r12) goto L_0x0298
            r5 = 91
            if (r2 == r5) goto L_0x0295
            if (r2 == r11) goto L_0x028f
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L_0x028c
            int r2 = r0.f9290d
            int r2 = r2 - r4
            r0.f9290d = r2
            char r2 = r6[r2]
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x0123
            r3 = 84
            if (r2 != r3) goto L_0x0106
            goto L_0x0123
        L_0x0106:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x011d
            r3 = 70
            if (r2 != r3) goto L_0x010f
            goto L_0x011d
        L_0x010f:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x0117
            r3 = 78
            if (r2 != r3) goto L_0x016e
        L_0x0117:
            java.lang.String r2 = "null"
            java.lang.String r3 = "NULL"
            r5 = 7
            goto L_0x0128
        L_0x011d:
            java.lang.String r2 = "false"
            java.lang.String r3 = "FALSE"
            r5 = r15
            goto L_0x0128
        L_0x0123:
            java.lang.String r2 = "true"
            java.lang.String r3 = "TRUE"
            r5 = r8
        L_0x0128:
            int r9 = r2.length()
            r10 = r4
        L_0x012d:
            if (r10 >= r9) goto L_0x0154
            int r11 = r0.f9290d
            int r11 = r11 + r10
            int r12 = r0.f9291e
            if (r11 < r12) goto L_0x013f
            int r11 = r10 + 1
            boolean r11 = r0.s(r11)
            if (r11 != 0) goto L_0x013f
            goto L_0x016e
        L_0x013f:
            int r11 = r0.f9290d
            int r11 = r11 + r10
            char r11 = r6[r11]
            char r12 = r2.charAt(r10)
            if (r11 == r12) goto L_0x0151
            char r12 = r3.charAt(r10)
            if (r11 == r12) goto L_0x0151
            goto L_0x016e
        L_0x0151:
            int r10 = r10 + 1
            goto L_0x012d
        L_0x0154:
            int r2 = r0.f9290d
            int r2 = r2 + r9
            int r3 = r0.f9291e
            if (r2 < r3) goto L_0x0163
            int r2 = r9 + 1
            boolean r2 = r0.s(r2)
            if (r2 == 0) goto L_0x0170
        L_0x0163:
            int r2 = r0.f9290d
            int r2 = r2 + r9
            char r2 = r6[r2]
            boolean r2 = r0.K(r2)
            if (r2 == 0) goto L_0x0170
        L_0x016e:
            r5 = r1
            goto L_0x0177
        L_0x0170:
            int r2 = r0.f9290d
            int r2 = r2 + r9
            r0.f9290d = r2
            r0.D = r5
        L_0x0177:
            if (r5 == 0) goto L_0x017a
            return r5
        L_0x017a:
            int r2 = r0.f9290d
            int r3 = r0.f9291e
            r9 = 0
            r5 = r1
            r11 = r5
            r12 = r11
            r13 = r4
            r7 = r9
        L_0x0185:
            int r1 = r2 + r11
            if (r1 != r3) goto L_0x019e
            int r1 = r6.length
            if (r11 != r1) goto L_0x018e
            goto L_0x026f
        L_0x018e:
            int r1 = r11 + 1
            boolean r1 = r0.s(r1)
            if (r1 != 0) goto L_0x0198
            goto L_0x020a
        L_0x0198:
            int r1 = r0.f9290d
            int r2 = r0.f9291e
            r3 = r2
            r2 = r1
        L_0x019e:
            int r1 = r2 + r11
            char r1 = r6[r1]
            r15 = 43
            if (r1 == r15) goto L_0x0260
            r15 = 69
            if (r1 == r15) goto L_0x0254
            r15 = 101(0x65, float:1.42E-43)
            if (r1 == r15) goto L_0x0254
            r15 = 45
            if (r1 == r15) goto L_0x0247
            r15 = 46
            if (r1 == r15) goto L_0x023f
            r15 = 48
            if (r1 < r15) goto L_0x0204
            r15 = 57
            if (r1 <= r15) goto L_0x01bf
            goto L_0x0204
        L_0x01bf:
            if (r5 == r4) goto L_0x01fa
            if (r5 != 0) goto L_0x01c4
            goto L_0x01fa
        L_0x01c4:
            r15 = 2
            if (r5 != r15) goto L_0x01ed
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x01cd
            goto L_0x026f
        L_0x01cd:
            r17 = 10
            long r17 = r17 * r7
            int r1 = r1 + -48
            long r9 = (long) r1
            long r17 = r17 - r9
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x01e8
            if (r1 != 0) goto L_0x01e6
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r1 = 0
            goto L_0x01e9
        L_0x01e8:
            r1 = r4
        L_0x01e9:
            r13 = r13 & r1
            r7 = r17
            goto L_0x01f0
        L_0x01ed:
            if (r5 != r14) goto L_0x01f2
            r5 = 4
        L_0x01f0:
            r9 = 6
            goto L_0x0200
        L_0x01f2:
            r1 = 5
            r9 = 6
            if (r5 == r1) goto L_0x01f8
            if (r5 != r9) goto L_0x0200
        L_0x01f8:
            r5 = 7
            goto L_0x0200
        L_0x01fa:
            r9 = 6
            int r1 = r1 + -48
            int r1 = -r1
            long r7 = (long) r1
            r5 = 2
        L_0x0200:
            r16 = 0
            goto L_0x0268
        L_0x0204:
            boolean r1 = r0.K(r1)
            if (r1 != 0) goto L_0x026f
        L_0x020a:
            r1 = 2
            if (r5 != r1) goto L_0x0230
            if (r13 == 0) goto L_0x022f
            r1 = -9223372036854775808
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0217
            if (r12 == 0) goto L_0x022f
        L_0x0217:
            r16 = 0
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x021f
            if (r12 != 0) goto L_0x022f
        L_0x021f:
            if (r12 == 0) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            long r7 = -r7
        L_0x0223:
            r0.E = r7
            int r1 = r0.f9290d
            int r1 = r1 + r11
            r0.f9290d = r1
            r7 = 15
            r0.D = r7
            goto L_0x0270
        L_0x022f:
            r1 = 2
        L_0x0230:
            if (r5 == r1) goto L_0x0238
            r1 = 4
            if (r5 == r1) goto L_0x0238
            r1 = 7
            if (r5 != r1) goto L_0x026f
        L_0x0238:
            r0.F = r11
            r7 = 16
            r0.D = r7
            goto L_0x0270
        L_0x023f:
            r16 = r9
            r1 = 2
            r9 = 6
            if (r5 != r1) goto L_0x026f
            r1 = r14
            goto L_0x0267
        L_0x0247:
            r16 = r9
            r1 = 2
            r9 = 6
            if (r5 != 0) goto L_0x0250
            r5 = r4
            r12 = r5
            goto L_0x0268
        L_0x0250:
            r10 = 5
            if (r5 != r10) goto L_0x026f
            goto L_0x0266
        L_0x0254:
            r16 = r9
            r1 = 2
            r9 = 6
            r10 = 5
            if (r5 == r1) goto L_0x025e
            r1 = 4
            if (r5 != r1) goto L_0x026f
        L_0x025e:
            r5 = r10
            goto L_0x0268
        L_0x0260:
            r16 = r9
            r9 = 6
            r10 = 5
            if (r5 != r10) goto L_0x026f
        L_0x0266:
            r1 = r9
        L_0x0267:
            r5 = r1
        L_0x0268:
            int r11 = r11 + 1
            r15 = r9
            r9 = r16
            goto L_0x0185
        L_0x026f:
            r7 = 0
        L_0x0270:
            if (r7 == 0) goto L_0x0273
            return r7
        L_0x0273:
            int r1 = r0.f9290d
            char r1 = r6[r1]
            boolean r1 = r0.K(r1)
            if (r1 == 0) goto L_0x0285
            r19.e()
            r1 = 10
            r0.D = r1
            return r1
        L_0x0285:
            java.lang.String r1 = "Expected value"
            r0.w0(r1)
            r1 = 0
            throw r1
        L_0x028c:
            r0.D = r4
            return r4
        L_0x028f:
            if (r3 != r4) goto L_0x0298
            r1 = 4
            r0.D = r1
            return r1
        L_0x0295:
            r0.D = r14
            return r14
        L_0x0298:
            if (r3 == r4) goto L_0x02a5
            r1 = 2
            if (r3 != r1) goto L_0x029e
            goto L_0x02a5
        L_0x029e:
            java.lang.String r1 = "Unexpected value"
            r0.w0(r1)
            r1 = 0
            throw r1
        L_0x02a5:
            r19.e()
            int r1 = r0.f9290d
            int r1 = r1 - r4
            r0.f9290d = r1
            r1 = 7
            r0.D = r1
            return r1
        L_0x02b1:
            r19.e()
            r1 = 8
            r0.D = r1
            return r1
        L_0x02b9:
            r1 = 9
            r0.D = r1
            return r1
        L_0x02be:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c6:
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 5
            if (r3 != r1) goto L_0x02e5
            int r1 = r0.b0(r4)
            if (r1 == r13) goto L_0x02e5
            if (r1 == r12) goto L_0x02e2
            if (r1 != r5) goto L_0x02db
            r1 = 2
            r0.D = r1
            return r1
        L_0x02db:
            java.lang.String r1 = "Unterminated object"
            r0.w0(r1)
            r1 = 0
            throw r1
        L_0x02e2:
            r19.e()
        L_0x02e5:
            int r1 = r0.b0(r4)
            r2 = 34
            if (r1 == r2) goto L_0x0320
            if (r1 == r10) goto L_0x0318
            java.lang.String r2 = "Expected name"
            if (r1 == r5) goto L_0x030c
            r19.e()
            int r3 = r0.f9290d
            int r3 = r3 - r4
            r0.f9290d = r3
            char r1 = (char) r1
            boolean r1 = r0.K(r1)
            if (r1 == 0) goto L_0x0307
            r1 = 14
            r0.D = r1
            return r1
        L_0x0307:
            r0.w0(r2)
            r1 = 0
            throw r1
        L_0x030c:
            r1 = 0
            r4 = 5
            if (r3 == r4) goto L_0x0314
            r3 = 2
            r0.D = r3
            return r3
        L_0x0314:
            r0.w0(r2)
            throw r1
        L_0x0318:
            r19.e()
            r1 = 12
            r0.D = r1
            return r1
        L_0x0320:
            r1 = 13
            r0.D = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.a.j():int");
    }

    public int k0() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        switch (i8) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void m0(int i8) {
        int i10 = this.I;
        int[] iArr = this.H;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.H = Arrays.copyOf(iArr, i11);
            this.K = Arrays.copyOf(this.K, i11);
            this.J = (String[]) Arrays.copyOf(this.J, i11);
        }
        int[] iArr2 = this.H;
        int i12 = this.I;
        this.I = i12 + 1;
        iArr2[i12] = i8;
    }

    public final char n0() {
        int i8;
        int i10;
        if (this.f9290d != this.f9291e || s(1)) {
            int i11 = this.f9290d;
            int i12 = i11 + 1;
            this.f9290d = i12;
            char[] cArr = this.f9289c;
            char c3 = cArr[i11];
            if (c3 == 10) {
                this.B++;
                this.C = i12;
            } else if (!(c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\')) {
                if (c3 == 'b') {
                    return 8;
                }
                if (c3 == 'f') {
                    return 12;
                }
                if (c3 == 'n') {
                    return 10;
                }
                if (c3 == 'r') {
                    return 13;
                }
                if (c3 == 't') {
                    return 9;
                }
                if (c3 != 'u') {
                    w0("Invalid escape sequence");
                    throw null;
                } else if (i12 + 4 <= this.f9291e || s(4)) {
                    int i13 = this.f9290d;
                    int i14 = i13 + 4;
                    char c10 = 0;
                    while (i13 < i14) {
                        char c11 = cArr[i13];
                        char c12 = (char) (c10 << 4);
                        if (c11 < '0' || c11 > '9') {
                            if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'a';
                            } else if (c11 < 'A' || c11 > 'F') {
                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f9290d, 4)));
                            } else {
                                i10 = c11 - 'A';
                            }
                            i8 = i10 + 10;
                        } else {
                            i8 = c11 - '0';
                        }
                        c10 = (char) (i8 + c12);
                        i13++;
                    }
                    this.f9290d += 4;
                    return c10;
                } else {
                    w0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c3;
        }
        w0("Unterminated escape sequence");
        throw null;
    }

    public void p() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 4) {
            int i10 = this.I - 1;
            this.I = i10;
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.D = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + e.d(k0()) + L());
    }

    public final void p0(char c3) {
        do {
            int i8 = this.f9290d;
            int i10 = this.f9291e;
            while (i8 < i10) {
                int i11 = i8 + 1;
                char c10 = this.f9289c[i8];
                if (c10 == c3) {
                    this.f9290d = i11;
                    return;
                } else if (c10 == '\\') {
                    this.f9290d = i11;
                    n0();
                    i8 = this.f9290d;
                    i10 = this.f9291e;
                } else {
                    if (c10 == 10) {
                        this.B++;
                        this.C = i11;
                    }
                    i8 = i11;
                }
            }
            this.f9290d = i8;
        } while (s(1));
        w0("Unterminated string");
        throw null;
    }

    public void q() {
        int i8 = this.D;
        if (i8 == 0) {
            i8 = j();
        }
        if (i8 == 2) {
            int i10 = this.I - 1;
            this.I = i10;
            this.J[i10] = null;
            int[] iArr = this.K;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.D = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + e.d(k0()) + L());
    }

    public final void q0() {
        char c3;
        do {
            if (this.f9290d < this.f9291e || s(1)) {
                int i8 = this.f9290d;
                int i10 = i8 + 1;
                this.f9290d = i10;
                c3 = this.f9289c[i8];
                if (c3 == 10) {
                    this.B++;
                    this.C = i10;
                    return;
                }
            } else {
                return;
            }
        } while (c3 != 13);
    }

    public final boolean s(int i8) {
        int i10;
        int i11;
        int i12 = this.C;
        int i13 = this.f9290d;
        this.C = i12 - i13;
        int i14 = this.f9291e;
        char[] cArr = this.f9289c;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f9291e = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f9291e = 0;
        }
        this.f9290d = 0;
        do {
            int i16 = this.f9291e;
            int read = this.f9287a.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f9291e + read;
            this.f9291e = i10;
            if (this.B == 0 && (i11 = this.C) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f9290d++;
                this.C = i11 + 1;
                i8++;
                continue;
            }
        } while (i10 < i8);
        return true;
    }

    public String toString() {
        return getClass().getSimpleName() + L();
    }

    public String u() {
        return z(false);
    }

    public void v0() {
        int i8;
        int i10 = 0;
        do {
            int i11 = this.D;
            if (i11 == 0) {
                i11 = j();
            }
            if (i11 == 3) {
                m0(1);
            } else if (i11 == 1) {
                m0(3);
            } else {
                if (i11 == 4) {
                    this.I--;
                } else if (i11 == 2) {
                    this.I--;
                } else if (i11 == 14 || i11 == 10) {
                    while (true) {
                        i8 = 0;
                        while (true) {
                            int i12 = this.f9290d + i8;
                            if (i12 < this.f9291e) {
                                char c3 = this.f9289c[i12];
                                if (!(c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ')) {
                                    if (c3 != '#') {
                                        if (c3 != ',') {
                                            if (!(c3 == '/' || c3 == '=')) {
                                                if (!(c3 == '{' || c3 == '}' || c3 == ':')) {
                                                    if (c3 != ';') {
                                                        switch (c3) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i8++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f9290d = i12;
                                if (!s(1)) {
                                }
                            }
                        }
                    }
                    e();
                    this.f9290d += i8;
                    this.D = 0;
                } else if (i11 == 8 || i11 == 12) {
                    p0('\'');
                    this.D = 0;
                } else if (i11 == 9 || i11 == 13) {
                    p0('\"');
                    this.D = 0;
                } else {
                    if (i11 == 16) {
                        this.f9290d += this.F;
                    }
                    this.D = 0;
                }
                i10--;
                this.D = 0;
            }
            i10++;
            this.D = 0;
        } while (i10 != 0);
        int[] iArr = this.K;
        int i13 = this.I;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.J[i13 - 1] = "null";
    }

    public final void w0(String str) {
        StringBuilder c3 = e.c(str);
        c3.append(L());
        throw new c(c3.toString());
    }

    public final String z(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i8 = 0;
        while (true) {
            int i10 = this.I;
            if (i8 >= i10) {
                return sb2.toString();
            }
            int i11 = this.H[i8];
            if (i11 == 1 || i11 == 2) {
                int i12 = this.K[i8];
                if (z10 && i12 > 0 && i8 == i10 - 1) {
                    i12--;
                }
                sb2.append('[');
                sb2.append(i12);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = this.J[i8];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i8++;
        }
    }
}
