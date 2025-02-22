package aa;

import b3.x;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;

public final class e implements Closeable {
    public static final Logger C = Logger.getLogger(e.class.getName());
    public final byte[] B;

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f221a;

    /* renamed from: b  reason: collision with root package name */
    public int f222b;

    /* renamed from: c  reason: collision with root package name */
    public int f223c;

    /* renamed from: d  reason: collision with root package name */
    public a f224d;

    /* renamed from: e  reason: collision with root package name */
    public a f225e;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f226c = new a(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f227a;

        /* renamed from: b  reason: collision with root package name */
        public final int f228b;

        public a(int i8, int i10) {
            this.f227a = i8;
            this.f228b = i10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f227a);
            sb2.append(", length = ");
            return x.b(sb2, this.f228b, "]");
        }
    }

    /* JADX INFO: finally extract failed */
    public e(File file) {
        File file2 = file;
        byte[] bArr = new byte[16];
        this.B = bArr;
        if (!file.exists()) {
            File file3 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i8 = 0;
                int i10 = 0;
                for (int i11 = 4; i8 < i11; i11 = 4) {
                    int i12 = iArr[i8];
                    bArr2[i10] = (byte) (i12 >> 24);
                    bArr2[i10 + 1] = (byte) (i12 >> 16);
                    bArr2[i10 + 2] = (byte) (i12 >> 8);
                    bArr2[i10 + 3] = (byte) i12;
                    i10 += 4;
                    i8++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file3.renameTo(file2)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rwd");
        this.f221a = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(bArr);
        int j10 = j(bArr, 0);
        this.f222b = j10;
        if (((long) j10) <= randomAccessFile2.length()) {
            this.f223c = j(bArr, 4);
            int j11 = j(bArr, 8);
            int j12 = j(bArr, 12);
            this.f224d = e(j11);
            this.f225e = e(j12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f222b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int j(byte[] bArr, int i8) {
        return ((bArr[i8] & 255) << 24) + ((bArr[i8 + 1] & 255) << 16) + ((bArr[i8 + 2] & 255) << 8) + (bArr[i8 + 3] & 255);
    }

    public final void D(int i8, int i10, int i11, int i12) {
        int i13 = 0;
        int[] iArr = {i8, i10, i11, i12};
        int i14 = 0;
        while (true) {
            byte[] bArr = this.B;
            if (i13 < 4) {
                int i15 = iArr[i13];
                bArr[i14] = (byte) (i15 >> 24);
                bArr[i14 + 1] = (byte) (i15 >> 16);
                bArr[i14 + 2] = (byte) (i15 >> 8);
                bArr[i14 + 3] = (byte) i15;
                i14 += 4;
                i13++;
            } else {
                RandomAccessFile randomAccessFile = this.f221a;
                randomAccessFile.seek(0);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void c(byte[] r10) {
        /*
            r9 = this;
            int r0 = r10.length
            monitor-enter(r9)
            r1 = r0 | 0
            if (r1 < 0) goto L_0x006d
            int r1 = r10.length     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x006d
            r9.d(r0)     // Catch:{ all -> 0x0073 }
            monitor-enter(r9)     // Catch:{ all -> 0x0073 }
            int r1 = r9.f223c     // Catch:{ all -> 0x006a }
            r3 = 1
            if (r1 != 0) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            r4 = 4
            if (r1 == 0) goto L_0x001e
            r5 = 16
            goto L_0x002a
        L_0x001e:
            aa.e$a r5 = r9.f225e     // Catch:{ all -> 0x0073 }
            int r6 = r5.f227a     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r4
            int r5 = r5.f228b     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r5
            int r5 = r9.z(r6)     // Catch:{ all -> 0x0073 }
        L_0x002a:
            aa.e$a r6 = new aa.e$a     // Catch:{ all -> 0x0073 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0073 }
            byte[] r7 = r9.B     // Catch:{ all -> 0x0073 }
            int r8 = r0 >> 24
            byte r8 = (byte) r8     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            int r2 = r0 >> 16
            byte r2 = (byte) r2     // Catch:{ all -> 0x0073 }
            r7[r3] = r2     // Catch:{ all -> 0x0073 }
            int r2 = r0 >> 8
            byte r2 = (byte) r2     // Catch:{ all -> 0x0073 }
            r8 = 2
            r7[r8] = r2     // Catch:{ all -> 0x0073 }
            r2 = 3
            byte r8 = (byte) r0     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            r9.s(r5, r7, r4)     // Catch:{ all -> 0x0073 }
            int r2 = r5 + 4
            r9.s(r2, r10, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0051
            r10 = r5
            goto L_0x0055
        L_0x0051:
            aa.e$a r10 = r9.f224d     // Catch:{ all -> 0x0073 }
            int r10 = r10.f227a     // Catch:{ all -> 0x0073 }
        L_0x0055:
            int r0 = r9.f222b     // Catch:{ all -> 0x0073 }
            int r2 = r9.f223c     // Catch:{ all -> 0x0073 }
            int r2 = r2 + r3
            r9.D(r0, r2, r10, r5)     // Catch:{ all -> 0x0073 }
            r9.f225e = r6     // Catch:{ all -> 0x0073 }
            int r10 = r9.f223c     // Catch:{ all -> 0x0073 }
            int r10 = r10 + r3
            r9.f223c = r10     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0068
            r9.f224d = r6     // Catch:{ all -> 0x0073 }
        L_0x0068:
            monitor-exit(r9)
            return
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x006d:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0073 }
            r10.<init>()     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.c(byte[]):void");
    }

    public final synchronized void close() {
        this.f221a.close();
    }

    public final void d(int i8) {
        int i10 = i8 + 4;
        int u7 = this.f222b - u();
        if (u7 < i10) {
            int i11 = this.f222b;
            do {
                u7 += i11;
                i11 <<= 1;
            } while (u7 < i10);
            RandomAccessFile randomAccessFile = this.f221a;
            randomAccessFile.setLength((long) i11);
            randomAccessFile.getChannel().force(true);
            a aVar = this.f225e;
            int z10 = z(aVar.f227a + 4 + aVar.f228b);
            if (z10 < this.f224d.f227a) {
                FileChannel channel = randomAccessFile.getChannel();
                channel.position((long) this.f222b);
                long j10 = (long) (z10 - 4);
                if (channel.transferTo(16, j10, channel) != j10) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i12 = this.f225e.f227a;
            int i13 = this.f224d.f227a;
            if (i12 < i13) {
                int i14 = (this.f222b + i12) - 16;
                D(i11, this.f223c, i13, i14);
                this.f225e = new a(i14, this.f225e.f228b);
            } else {
                D(i11, this.f223c, i13, i12);
            }
            this.f222b = i11;
        }
    }

    public final a e(int i8) {
        if (i8 == 0) {
            return a.f226c;
        }
        RandomAccessFile randomAccessFile = this.f221a;
        randomAccessFile.seek((long) i8);
        return new a(i8, randomAccessFile.readInt());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void p() {
        /*
            r6 = this;
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x006e }
            int r0 = r6.f223c     // Catch:{ all -> 0x0070 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r3 = r2
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0068
            if (r0 != r2) goto L_0x0036
            monitor-enter(r6)     // Catch:{ all -> 0x006e }
            r0 = 4096(0x1000, float:5.74E-42)
            r6.D(r0, r1, r1, r1)     // Catch:{ all -> 0x0033 }
            r6.f223c = r1     // Catch:{ all -> 0x0033 }
            aa.e$a r1 = aa.e.a.f226c     // Catch:{ all -> 0x0033 }
            r6.f224d = r1     // Catch:{ all -> 0x0033 }
            r6.f225e = r1     // Catch:{ all -> 0x0033 }
            int r1 = r6.f222b     // Catch:{ all -> 0x0033 }
            if (r1 <= r0) goto L_0x002f
            java.io.RandomAccessFile r1 = r6.f221a     // Catch:{ all -> 0x0033 }
            long r3 = (long) r0     // Catch:{ all -> 0x0033 }
            r1.setLength(r3)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x0033 }
            r1.force(r2)     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r6.f222b = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0066
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0036:
            aa.e$a r0 = r6.f224d     // Catch:{ all -> 0x006e }
            int r3 = r0.f227a     // Catch:{ all -> 0x006e }
            r4 = 4
            int r3 = r3 + r4
            int r0 = r0.f228b     // Catch:{ all -> 0x006e }
            int r3 = r3 + r0
            int r0 = r6.z(r3)     // Catch:{ all -> 0x006e }
            byte[] r3 = r6.B     // Catch:{ all -> 0x006e }
            r6.q(r0, r3, r1, r4)     // Catch:{ all -> 0x006e }
            byte[] r3 = r6.B     // Catch:{ all -> 0x006e }
            int r1 = j(r3, r1)     // Catch:{ all -> 0x006e }
            int r3 = r6.f222b     // Catch:{ all -> 0x006e }
            int r4 = r6.f223c     // Catch:{ all -> 0x006e }
            int r4 = r4 - r2
            aa.e$a r5 = r6.f225e     // Catch:{ all -> 0x006e }
            int r5 = r5.f227a     // Catch:{ all -> 0x006e }
            r6.D(r3, r4, r0, r5)     // Catch:{ all -> 0x006e }
            int r3 = r6.f223c     // Catch:{ all -> 0x006e }
            int r3 = r3 - r2
            r6.f223c = r3     // Catch:{ all -> 0x006e }
            aa.e$a r2 = new aa.e$a     // Catch:{ all -> 0x006e }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x006e }
            r6.f224d = r2     // Catch:{ all -> 0x006e }
        L_0x0066:
            monitor-exit(r6)
            return
        L_0x0068:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            goto L_0x0073
        L_0x0070:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0073:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.p():void");
    }

    public final void q(int i8, byte[] bArr, int i10, int i11) {
        int z10 = z(i8);
        int i12 = z10 + i11;
        int i13 = this.f222b;
        RandomAccessFile randomAccessFile = this.f221a;
        if (i12 <= i13) {
            randomAccessFile.seek((long) z10);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - z10;
        randomAccessFile.seek((long) z10);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void s(int i8, byte[] bArr, int i10) {
        int z10 = z(i8);
        int i11 = z10 + i10;
        int i12 = this.f222b;
        RandomAccessFile randomAccessFile = this.f221a;
        if (i11 <= i12) {
            randomAccessFile.seek((long) z10);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - z10;
        randomAccessFile.seek((long) z10);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16);
        randomAccessFile.write(bArr, 0 + i13, i10 - i13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        C.log(java.util.logging.Level.WARNING, "read error", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<aa.e> r1 = aa.e.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "[fileLength="
            r0.append(r1)
            int r1 = r7.f222b
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r7.f223c
            r0.append(r1)
            java.lang.String r1 = ", first="
            r0.append(r1)
            aa.e$a r1 = r7.f224d
            r0.append(r1)
            java.lang.String r1 = ", last="
            r0.append(r1)
            aa.e$a r1 = r7.f225e
            r0.append(r1)
            java.lang.String r1 = ", element lengths=["
            r0.append(r1)
            monitor-enter(r7)     // Catch:{ IOException -> 0x0071 }
            aa.e$a r1 = r7.f224d     // Catch:{ all -> 0x006e }
            int r1 = r1.f227a     // Catch:{ all -> 0x006e }
            r2 = 1
            r3 = 0
            r4 = r3
        L_0x0043:
            int r5 = r7.f223c     // Catch:{ all -> 0x006e }
            if (r4 >= r5) goto L_0x006c
            aa.e$a r1 = r7.e(r1)     // Catch:{ all -> 0x006e }
            aa.e$b r5 = new aa.e$b     // Catch:{ all -> 0x006e }
            r5.<init>(r1)     // Catch:{ all -> 0x006e }
            int r5 = r1.f228b     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0056
            r2 = r3
            goto L_0x005b
        L_0x0056:
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x006e }
        L_0x005b:
            r0.append(r5)     // Catch:{ all -> 0x006e }
            int r5 = r1.f227a     // Catch:{ all -> 0x006e }
            int r5 = r5 + 4
            int r1 = r1.f228b     // Catch:{ all -> 0x006e }
            int r5 = r5 + r1
            int r1 = r7.z(r5)     // Catch:{ all -> 0x006e }
            int r4 = r4 + 1
            goto L_0x0043
        L_0x006c:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x006e:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0071 }
            throw r1     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            java.util.logging.Logger r2 = C
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "read error"
            r2.log(r3, r4, r1)
        L_0x007b:
            java.lang.String r1 = "]]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.toString():java.lang.String");
    }

    public final int u() {
        if (this.f223c == 0) {
            return 16;
        }
        a aVar = this.f225e;
        int i8 = aVar.f227a;
        int i10 = this.f224d.f227a;
        return i8 >= i10 ? (i8 - i10) + 4 + aVar.f228b + 16 : (((i8 + 4) + aVar.f228b) + this.f222b) - i10;
    }

    public final int z(int i8) {
        int i10 = this.f222b;
        return i8 < i10 ? i8 : (i8 + 16) - i10;
    }

    public final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public int f229a;

        /* renamed from: b  reason: collision with root package name */
        public int f230b;

        public b(a aVar) {
            this.f229a = e.this.z(aVar.f227a + 4);
            this.f230b = aVar.f228b;
        }

        public final int read(byte[] bArr, int i8, int i10) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i8 | i10) < 0 || i10 > bArr.length - i8) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i11 = this.f230b;
                if (i11 <= 0) {
                    return -1;
                }
                if (i10 > i11) {
                    i10 = i11;
                }
                int i12 = this.f229a;
                e eVar = e.this;
                eVar.q(i12, bArr, i8, i10);
                this.f229a = eVar.z(this.f229a + i10);
                this.f230b -= i10;
                return i10;
            }
        }

        public final int read() {
            if (this.f230b == 0) {
                return -1;
            }
            e eVar = e.this;
            eVar.f221a.seek((long) this.f229a);
            int read = eVar.f221a.read();
            this.f229a = eVar.z(this.f229a + 1);
            this.f230b--;
            return read;
        }
    }
}
