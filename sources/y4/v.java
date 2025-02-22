package y4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import s4.b;

public final class v extends FilterInputStream {
    public final b B;

    /* renamed from: a  reason: collision with root package name */
    public volatile byte[] f17239a;

    /* renamed from: b  reason: collision with root package name */
    public int f17240b;

    /* renamed from: c  reason: collision with root package name */
    public int f17241c;

    /* renamed from: d  reason: collision with root package name */
    public int f17242d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f17243e;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public v(InputStream inputStream, b bVar) {
        super(inputStream);
        this.B = bVar;
        this.f17239a = (byte[]) bVar.c(65536, byte[].class);
    }

    public static void e() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f17239a == null || inputStream == null) {
            e();
            throw null;
        }
        return (this.f17240b - this.f17243e) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) {
        int i8;
        int i10 = this.f17242d;
        if (i10 == -1 || this.f17243e - i10 >= (i8 = this.f17241c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f17242d = -1;
                this.f17243e = 0;
                this.f17240b = read;
            }
            return read;
        }
        if (i10 == 0 && i8 > bArr.length && this.f17240b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i8) {
                i8 = length;
            }
            byte[] bArr2 = (byte[]) this.B.c(i8, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f17239a = bArr2;
            this.B.put(bArr);
            bArr = bArr2;
        } else if (i10 > 0) {
            System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
        }
        int i11 = this.f17243e - this.f17242d;
        this.f17243e = i11;
        this.f17242d = 0;
        this.f17240b = 0;
        int read2 = inputStream.read(bArr, i11, bArr.length - i11);
        int i12 = this.f17243e;
        if (read2 > 0) {
            i12 += read2;
        }
        this.f17240b = i12;
        return read2;
    }

    public final void close() {
        if (this.f17239a != null) {
            this.B.put(this.f17239a);
            this.f17239a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void d() {
        if (this.f17239a != null) {
            this.B.put(this.f17239a);
            this.f17239a = null;
        }
    }

    public final synchronized void mark(int i8) {
        this.f17241c = Math.max(this.f17241c, i8);
        this.f17242d = this.f17243e;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f17239a     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f17243e     // Catch:{ all -> 0x003d }
            int r4 = r6.f17240b     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.c(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f17239a     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f17239a     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            e()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f17240b     // Catch:{ all -> 0x003d }
            int r2 = r6.f17243e     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f17243e = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            e()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.v.read():int");
    }

    public final synchronized void reset() {
        if (this.f17239a != null) {
            int i8 = this.f17242d;
            if (-1 != i8) {
                this.f17243e = i8;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f17243e + " markLimit: " + this.f17241c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0;
        }
        byte[] bArr = this.f17239a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i8 = this.f17240b;
                int i10 = this.f17243e;
                if (((long) (i8 - i10)) >= j10) {
                    this.f17243e = (int) (((long) i10) + j10);
                    return j10;
                }
                long j11 = ((long) i8) - ((long) i10);
                this.f17243e = i8;
                if (this.f17242d == -1 || j10 > ((long) this.f17241c)) {
                    long skip = inputStream.skip(j10 - j11);
                    if (skip > 0) {
                        this.f17242d = -1;
                    }
                    return j11 + skip;
                } else if (c(inputStream, bArr) == -1) {
                    return j11;
                } else {
                    int i11 = this.f17240b;
                    int i12 = this.f17243e;
                    if (((long) (i11 - i12)) >= j10 - j11) {
                        this.f17243e = (int) ((((long) i12) + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + ((long) i11)) - ((long) i12);
                    this.f17243e = i11;
                    return j12;
                }
            } else {
                e();
                throw null;
            }
        } else {
            e();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0052, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f17239a     // Catch:{ all -> 0x0088 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            if (r9 != 0) goto L_0x000b
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0080
            int r3 = r6.f17243e     // Catch:{ all -> 0x0088 }
            int r4 = r6.f17240b     // Catch:{ all -> 0x0088 }
            if (r3 >= r4) goto L_0x0030
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r3 = r6.f17243e     // Catch:{ all -> 0x0088 }
            int r3 = r3 + r4
            r6.f17243e = r3     // Catch:{ all -> 0x0088 }
            if (r4 == r9) goto L_0x002e
            int r3 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r3 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0031
        L_0x002e:
            monitor-exit(r6)
            return r4
        L_0x0030:
            r3 = r9
        L_0x0031:
            int r4 = r6.f17242d     // Catch:{ all -> 0x0088 }
            r5 = -1
            if (r4 != r5) goto L_0x0046
            int r4 = r0.length     // Catch:{ all -> 0x0088 }
            if (r3 < r4) goto L_0x0046
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0070
            if (r3 != r9) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            int r5 = r9 - r3
        L_0x0044:
            monitor-exit(r6)
            return r5
        L_0x0046:
            int r4 = r6.c(r2, r0)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0053
            if (r3 != r9) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            int r5 = r9 - r3
        L_0x0051:
            monitor-exit(r6)
            return r5
        L_0x0053:
            byte[] r4 = r6.f17239a     // Catch:{ all -> 0x0088 }
            if (r0 == r4) goto L_0x0060
            byte[] r0 = r6.f17239a     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            e()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0060:
            int r4 = r6.f17240b     // Catch:{ all -> 0x0088 }
            int r5 = r6.f17243e     // Catch:{ all -> 0x0088 }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0068
            r4 = r3
        L_0x0068:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r5 = r6.f17243e     // Catch:{ all -> 0x0088 }
            int r5 = r5 + r4
            r6.f17243e = r5     // Catch:{ all -> 0x0088 }
        L_0x0070:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0075
            monitor-exit(r6)
            return r9
        L_0x0075:
            int r5 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x007e
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x007e:
            int r8 = r8 + r4
            goto L_0x0031
        L_0x0080:
            e()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0084:
            e()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.v.read(byte[], int, int):int");
    }
}
