package l5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<byte[]> f10981a = new AtomicReference<>();

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10984a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10985b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f10986c;

        public b(byte[] bArr, int i8, int i10) {
            this.f10986c = bArr;
            this.f10984a = i8;
            this.f10985b = i10;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0054 A[SYNTHETIC, Splitter:B:33:0x0054] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.MappedByteBuffer a(java.io.File r9) {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004b }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0043
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003b
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004b }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0031 }
            r9.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            goto L_0x0037
        L_0x0033:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x0037:
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x004d
        L_0x003b:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r9     // Catch:{ all -> 0x004b }
        L_0x0043:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r9     // Catch:{ all -> 0x004b }
        L_0x004b:
            r9 = move-exception
            r7 = r0
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            if (r7 == 0) goto L_0x0057
            r7.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.a(java.io.File):java.nio.MappedByteBuffer");
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f10981a;
        byte[] andSet = atomicReference.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC, Splitter:B:18:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
            r0 = 0
            java.nio.Buffer r1 = r4.position(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0028 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0026 }
            r1.write(r4)     // Catch:{ all -> 0x0026 }
            r1.force(r0)     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ all -> 0x0026 }
            r2.close()     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            r2.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return
        L_0x0026:
            r4 = move-exception
            goto L_0x002a
        L_0x0028:
            r4 = move-exception
            r2 = r1
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.c(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: l5.a$a  reason: collision with other inner class name */
    public static class C0207a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f10982a;

        /* renamed from: b  reason: collision with root package name */
        public int f10983b = -1;

        public C0207a(ByteBuffer byteBuffer) {
            this.f10982a = byteBuffer;
        }

        public final int available() {
            return this.f10982a.remaining();
        }

        public final synchronized void mark(int i8) {
            this.f10983b = this.f10982a.position();
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read() {
            ByteBuffer byteBuffer = this.f10982a;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            return byteBuffer.get() & 255;
        }

        public final synchronized void reset() {
            int i8 = this.f10983b;
            if (i8 != -1) {
                this.f10982a.position(i8);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f10982a;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j10, (long) available());
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public final int read(byte[] bArr, int i8, int i10) {
            ByteBuffer byteBuffer = this.f10982a;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i10, available());
            byteBuffer.get(bArr, i8, min);
            return min;
        }
    }
}
