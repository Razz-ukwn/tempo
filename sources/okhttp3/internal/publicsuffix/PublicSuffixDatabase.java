package okhttp3.internal.publicsuffix;

import cb.d;
import gf.q;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.b;
import sf.j;
import zf.n;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f12381e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f12382f = d.O("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f12383g = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f12384a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f12385b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f12386c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f12387d;

    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i8) {
            int i10;
            boolean z10;
            byte b10;
            int i11;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            byte[] bArr5 = PublicSuffixDatabase.f12381e;
            int length = bArr3.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr3[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i10 = i14 + i15;
                    if (bArr3[i10] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i10 - i14;
                int i17 = i8;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        b10 = 46;
                        z10 = false;
                    } else {
                        byte b11 = bArr4[i17][i18];
                        byte[] bArr6 = b.f10474a;
                        byte b12 = b11 & 255;
                        z10 = z11;
                        b10 = b12;
                    }
                    byte b13 = bArr3[i14 + i19];
                    byte[] bArr7 = b.f10474a;
                    i11 = b10 - (b13 & 255);
                    if (i11 == 0) {
                        i19++;
                        i18++;
                        if (i19 == i16) {
                            break;
                        } else if (bArr4[i17].length != i18) {
                            z11 = z10;
                        } else if (i17 == bArr4.length - 1) {
                            break;
                        } else {
                            i17++;
                            i18 = -1;
                            z11 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i11 >= 0) {
                    if (i11 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr4[i17].length - i18;
                        int length3 = bArr4.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr4[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                j.e(charset, "UTF_8");
                                return new String(bArr3, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i10 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }
    }

    static {
        new a();
    }

    public static List c(String str) {
        int i8 = 0;
        List R0 = n.R0(str, new char[]{'.'});
        if (!j.a(q.B0(R0), "")) {
            return R0;
        }
        Iterable iterable = R0;
        int size = R0.size() - 1;
        if (size >= 0) {
            i8 = size;
        }
        return q.K0(iterable, i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x0038;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0141 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r1 = "unicodeDomain"
            sf.j.e(r0, r1)
            java.util.List r0 = c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f12384a
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.f12384a
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x004f
            r1 = r2
        L_0x0020:
            r13.b()     // Catch:{ InterruptedIOException -> 0x0040, IOException -> 0x0028 }
            if (r1 == 0) goto L_0x005c
            goto L_0x0038
        L_0x0026:
            r14 = move-exception
            goto L_0x0045
        L_0x0028:
            r4 = move-exception
            rg.h r5 = rg.h.f14273a     // Catch:{ all -> 0x0026 }
            rg.h r5 = rg.h.f14273a     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Failed to read public suffix list"
            r5.getClass()     // Catch:{ all -> 0x0026 }
            r5 = 5
            rg.h.i(r5, r6, r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x005c
        L_0x0038:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x005c
        L_0x0040:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0026 }
            r1 = r3
            goto L_0x0020
        L_0x0045:
            if (r1 == 0) goto L_0x004e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004e:
            throw r14
        L_0x004f:
            java.util.concurrent.CountDownLatch r1 = r13.f12385b     // Catch:{ InterruptedException -> 0x0055 }
            r1.await()     // Catch:{ InterruptedException -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x005c:
            byte[] r1 = r13.f12386c
            if (r1 == 0) goto L_0x0062
            r1 = r3
            goto L_0x0063
        L_0x0062:
            r1 = r2
        L_0x0063:
            if (r1 == 0) goto L_0x01cf
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r2
        L_0x006c:
            if (r5 >= r1) goto L_0x0089
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            sf.j.e(r7, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            sf.j.e(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006c
        L_0x0089:
            r5 = r2
        L_0x008a:
            r6 = 0
            java.lang.String r7 = "publicSuffixListBytes"
            if (r5 >= r1) goto L_0x00a2
            int r8 = r5 + 1
            byte[] r9 = r13.f12386c
            if (r9 == 0) goto L_0x009e
            java.lang.String r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r9, r4, r5)
            if (r5 == 0) goto L_0x009c
            goto L_0x00a3
        L_0x009c:
            r5 = r8
            goto L_0x008a
        L_0x009e:
            sf.j.l(r7)
            throw r6
        L_0x00a2:
            r5 = r6
        L_0x00a3:
            if (r1 <= r3) goto L_0x00c7
            java.lang.Object r8 = r4.clone()
            byte[][] r8 = (byte[][]) r8
            int r9 = r8.length
            int r9 = r9 - r3
            r10 = r2
        L_0x00ae:
            if (r10 >= r9) goto L_0x00c7
            int r11 = r10 + 1
            byte[] r12 = f12381e
            r8[r10] = r12
            byte[] r12 = r13.f12386c
            if (r12 == 0) goto L_0x00c3
            java.lang.String r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r12, r8, r10)
            if (r10 == 0) goto L_0x00c1
            goto L_0x00c8
        L_0x00c1:
            r10 = r11
            goto L_0x00ae
        L_0x00c3:
            sf.j.l(r7)
            throw r6
        L_0x00c7:
            r10 = r6
        L_0x00c8:
            if (r10 == 0) goto L_0x00e3
            int r1 = r1 - r3
            r7 = r2
        L_0x00cc:
            if (r7 >= r1) goto L_0x00e3
            int r8 = r7 + 1
            byte[] r9 = r13.f12387d
            if (r9 == 0) goto L_0x00dd
            java.lang.String r7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r9, r4, r7)
            if (r7 == 0) goto L_0x00db
            goto L_0x00e4
        L_0x00db:
            r7 = r8
            goto L_0x00cc
        L_0x00dd:
            java.lang.String r14 = "publicSuffixExceptionListBytes"
            sf.j.l(r14)
            throw r6
        L_0x00e3:
            r7 = r6
        L_0x00e4:
            r1 = 46
            if (r7 == 0) goto L_0x00f7
            java.lang.String r4 = "!"
            java.lang.String r4 = sf.j.k(r7, r4)
            char[] r5 = new char[r3]
            r5[r2] = r1
            java.util.List r1 = zf.n.R0(r4, r5)
            goto L_0x0129
        L_0x00f7:
            if (r5 != 0) goto L_0x00fe
            if (r10 != 0) goto L_0x00fe
            java.util.List<java.lang.String> r1 = f12382f
            goto L_0x0129
        L_0x00fe:
            if (r5 != 0) goto L_0x0102
            r4 = r6
            goto L_0x010a
        L_0x0102:
            char[] r4 = new char[r3]
            r4[r2] = r1
            java.util.List r4 = zf.n.R0(r5, r4)
        L_0x010a:
            gf.s r5 = gf.s.f8978a
            if (r4 != 0) goto L_0x010f
            r4 = r5
        L_0x010f:
            if (r10 != 0) goto L_0x0113
            r1 = r6
            goto L_0x011b
        L_0x0113:
            char[] r7 = new char[r3]
            r7[r2] = r1
            java.util.List r1 = zf.n.R0(r10, r7)
        L_0x011b:
            if (r1 != 0) goto L_0x011e
            r1 = r5
        L_0x011e:
            int r5 = r4.size()
            int r7 = r1.size()
            if (r5 <= r7) goto L_0x0129
            r1 = r4
        L_0x0129:
            int r4 = r0.size()
            int r5 = r1.size()
            r7 = 33
            if (r4 != r5) goto L_0x0142
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 == r7) goto L_0x0142
            return r6
        L_0x0142:
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r2)
            if (r4 != r7) goto L_0x0157
            int r0 = r0.size()
            int r1 = r1.size()
            goto L_0x0160
        L_0x0157:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + r3
        L_0x0160:
            int r0 = r0 - r1
            java.util.List r14 = c(r14)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            gf.p r1 = new gf.p
            r1.<init>(r14)
            if (r0 < 0) goto L_0x0170
            r14 = r3
            goto L_0x0171
        L_0x0170:
            r14 = r2
        L_0x0171:
            if (r14 == 0) goto L_0x01bd
            if (r0 != 0) goto L_0x0176
            goto L_0x0187
        L_0x0176:
            boolean r14 = r1 instanceof yf.c
            if (r14 == 0) goto L_0x0181
            yf.c r1 = (yf.c) r1
            yf.g r1 = r1.a(r0)
            goto L_0x0187
        L_0x0181:
            yf.b r14 = new yf.b
            r14.<init>(r1, r0)
            r1 = r14
        L_0x0187:
            java.lang.String r14 = "<this>"
            sf.j.f(r1, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = ""
            r14.append(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x019a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01b0
            java.lang.Object r4 = r1.next()
            int r2 = r2 + r3
            if (r2 <= r3) goto L_0x01ac
            java.lang.String r5 = "."
            r14.append(r5)
        L_0x01ac:
            cb.d.l(r14, r4, r6)
            goto L_0x019a
        L_0x01b0:
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            sf.j.e(r14, r0)
            return r14
        L_0x01bd:
            java.lang.String r14 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r14 = d.a.a(r14, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x01cf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        e9.c.c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            wg.q r1 = new wg.q
            wg.s r0 = d2.f1.J(r0)
            r1.<init>(r0)
            wg.c0 r0 = d2.f1.j(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x0049 }
            long r1 = (long) r1     // Catch:{ all -> 0x0049 }
            r0.z0(r1)     // Catch:{ all -> 0x0049 }
            wg.e r3 = r0.f16741b     // Catch:{ all -> 0x0049 }
            byte[] r1 = r3.L(r1)     // Catch:{ all -> 0x0049 }
            int r2 = r0.readInt()     // Catch:{ all -> 0x0049 }
            long r2 = (long) r2     // Catch:{ all -> 0x0049 }
            r0.z0(r2)     // Catch:{ all -> 0x0049 }
            wg.e r4 = r0.f16741b     // Catch:{ all -> 0x0049 }
            byte[] r2 = r4.L(r2)     // Catch:{ all -> 0x0049 }
            ff.m r3 = ff.m.f8717a     // Catch:{ all -> 0x0049 }
            r3 = 0
            e9.c.c(r0, r3)
            monitor-enter(r5)
            r5.f12386c = r1     // Catch:{ all -> 0x0046 }
            r5.f12387d = r2     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f12385b
            r0.countDown()
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            e9.c.c(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }
}
