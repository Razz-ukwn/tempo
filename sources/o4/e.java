package o4;

import android.graphics.Bitmap;
import c5.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import o4.a;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12157a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12158b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0230a f12159c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f12160d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f12161e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f12162f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f12163g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f12164h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f12165i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f12166j;

    /* renamed from: k  reason: collision with root package name */
    public int f12167k;

    /* renamed from: l  reason: collision with root package name */
    public c f12168l;
    public Bitmap m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12169n;

    /* renamed from: o  reason: collision with root package name */
    public int f12170o;

    /* renamed from: p  reason: collision with root package name */
    public int f12171p;

    /* renamed from: q  reason: collision with root package name */
    public int f12172q;

    /* renamed from: r  reason: collision with root package name */
    public int f12173r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f12174s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f12175t = Bitmap.Config.ARGB_8888;

    public e(b bVar, c cVar, ByteBuffer byteBuffer, int i8) {
        this.f12159c = bVar;
        this.f12168l = new c();
        synchronized (this) {
            if (i8 > 0) {
                int highestOneBit = Integer.highestOneBit(i8);
                this.f12170o = 0;
                this.f12168l = cVar;
                this.f12167k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f12160d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f12160d.order(ByteOrder.LITTLE_ENDIAN);
                this.f12169n = false;
                Iterator it = cVar.f12146e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((b) it.next()).f12137g == 3) {
                            this.f12169n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f12171p = highestOneBit;
                int i10 = cVar.f12147f;
                this.f12173r = i10 / highestOneBit;
                int i11 = cVar.f12148g;
                this.f12172q = i11 / highestOneBit;
                int i12 = i10 * i11;
                s4.b bVar2 = ((b) this.f12159c).f3725b;
                this.f12165i = bVar2 == null ? new byte[i12] : (byte[]) bVar2.c(i12, byte[].class);
                a.C0230a aVar = this.f12159c;
                int i13 = this.f12173r * this.f12172q;
                s4.b bVar3 = ((b) aVar).f3725b;
                this.f12166j = bVar3 == null ? new int[i13] : (int[]) bVar3.c(i13, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap a() {
        /*
            r9 = this;
            java.lang.String r0 = "No valid color table found for frame #"
            java.lang.String r1 = "Unable to decode frame, status="
            java.lang.String r2 = "Unable to decode frame, frameCount="
            monitor-enter(r9)
            o4.c r3 = r9.f12168l     // Catch:{ all -> 0x00ee }
            int r3 = r3.f12144c     // Catch:{ all -> 0x00ee }
            r4 = 3
            r5 = 1
            if (r3 <= 0) goto L_0x0013
            int r3 = r9.f12167k     // Catch:{ all -> 0x00ee }
            if (r3 >= 0) goto L_0x003c
        L_0x0013:
            java.lang.String r3 = "e"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x00ee }
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "e"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r6.<init>(r2)     // Catch:{ all -> 0x00ee }
            o4.c r2 = r9.f12168l     // Catch:{ all -> 0x00ee }
            int r2 = r2.f12144c     // Catch:{ all -> 0x00ee }
            r6.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = ", framePointer="
            r6.append(r2)     // Catch:{ all -> 0x00ee }
            int r2 = r9.f12167k     // Catch:{ all -> 0x00ee }
            r6.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r3, r2)     // Catch:{ all -> 0x00ee }
        L_0x003a:
            r9.f12170o = r5     // Catch:{ all -> 0x00ee }
        L_0x003c:
            int r2 = r9.f12170o     // Catch:{ all -> 0x00ee }
            r3 = 0
            if (r2 == r5) goto L_0x00d1
            r6 = 2
            if (r2 != r6) goto L_0x0046
            goto L_0x00d1
        L_0x0046:
            r1 = 0
            r9.f12170o = r1     // Catch:{ all -> 0x00ee }
            byte[] r2 = r9.f12161e     // Catch:{ all -> 0x00ee }
            if (r2 != 0) goto L_0x0064
            o4.a$a r2 = r9.f12159c     // Catch:{ all -> 0x00ee }
            c5.b r2 = (c5.b) r2     // Catch:{ all -> 0x00ee }
            s4.b r2 = r2.f3725b     // Catch:{ all -> 0x00ee }
            r7 = 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x005a
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x00ee }
            goto L_0x0062
        L_0x005a:
            java.lang.Class<byte[]> r8 = byte[].class
            java.lang.Object r2 = r2.c(r7, r8)     // Catch:{ all -> 0x00ee }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x00ee }
        L_0x0062:
            r9.f12161e = r2     // Catch:{ all -> 0x00ee }
        L_0x0064:
            o4.c r2 = r9.f12168l     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r2 = r2.f12146e     // Catch:{ all -> 0x00ee }
            int r7 = r9.f12167k     // Catch:{ all -> 0x00ee }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x00ee }
            o4.b r2 = (o4.b) r2     // Catch:{ all -> 0x00ee }
            int r7 = r9.f12167k     // Catch:{ all -> 0x00ee }
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x0080
            o4.c r8 = r9.f12168l     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r8 = r8.f12146e     // Catch:{ all -> 0x00ee }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00ee }
            o4.b r7 = (o4.b) r7     // Catch:{ all -> 0x00ee }
            goto L_0x0081
        L_0x0080:
            r7 = r3
        L_0x0081:
            int[] r8 = r2.f12141k     // Catch:{ all -> 0x00ee }
            if (r8 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            o4.c r8 = r9.f12168l     // Catch:{ all -> 0x00ee }
            int[] r8 = r8.f12142a     // Catch:{ all -> 0x00ee }
        L_0x008a:
            r9.f12157a = r8     // Catch:{ all -> 0x00ee }
            if (r8 != 0) goto L_0x00ad
            java.lang.String r1 = "e"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00a9
            java.lang.String r1 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r2.<init>(r0)     // Catch:{ all -> 0x00ee }
            int r0 = r9.f12167k     // Catch:{ all -> 0x00ee }
            r2.append(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x00ee }
        L_0x00a9:
            r9.f12170o = r5     // Catch:{ all -> 0x00ee }
            monitor-exit(r9)
            return r3
        L_0x00ad:
            boolean r0 = r2.f12136f     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00cb
            int[] r0 = r9.f12158b     // Catch:{ all -> 0x00ee }
            int r3 = r8.length     // Catch:{ all -> 0x00ee }
            java.lang.System.arraycopy(r8, r1, r0, r1, r3)     // Catch:{ all -> 0x00ee }
            int[] r0 = r9.f12158b     // Catch:{ all -> 0x00ee }
            r9.f12157a = r0     // Catch:{ all -> 0x00ee }
            int r3 = r2.f12138h     // Catch:{ all -> 0x00ee }
            r0[r3] = r1     // Catch:{ all -> 0x00ee }
            int r0 = r2.f12137g     // Catch:{ all -> 0x00ee }
            if (r0 != r6) goto L_0x00cb
            int r0 = r9.f12167k     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00cb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ee }
            r9.f12174s = r0     // Catch:{ all -> 0x00ee }
        L_0x00cb:
            android.graphics.Bitmap r0 = r9.i(r2, r7)     // Catch:{ all -> 0x00ee }
            monitor-exit(r9)
            return r0
        L_0x00d1:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r2.<init>(r1)     // Catch:{ all -> 0x00ee }
            int r1 = r9.f12170o     // Catch:{ all -> 0x00ee }
            r2.append(r1)     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r9)
            return r3
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.e.a():android.graphics.Bitmap");
    }

    public final void b() {
        this.f12167k = (this.f12167k + 1) % this.f12168l.f12144c;
    }

    public final int c() {
        return this.f12168l.f12144c;
    }

    public final void clear() {
        s4.b bVar;
        s4.b bVar2;
        s4.b bVar3;
        this.f12168l = null;
        byte[] bArr = this.f12165i;
        a.C0230a aVar = this.f12159c;
        if (!(bArr == null || (bVar3 = ((b) aVar).f3725b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f12166j;
        if (!(iArr == null || (bVar2 = ((b) aVar).f3725b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            ((b) aVar).f3724a.d(bitmap);
        }
        this.m = null;
        this.f12160d = null;
        this.f12174s = null;
        byte[] bArr2 = this.f12161e;
        if (bArr2 != null && (bVar = ((b) aVar).f3725b) != null) {
            bVar.put(bArr2);
        }
    }

    public final int d() {
        int i8;
        c cVar = this.f12168l;
        int i10 = cVar.f12144c;
        if (i10 <= 0 || (i8 = this.f12167k) < 0) {
            return 0;
        }
        if (i8 < 0 || i8 >= i10) {
            return -1;
        }
        return ((b) cVar.f12146e.get(i8)).f12139i;
    }

    public final int e() {
        return this.f12167k;
    }

    public final int f() {
        return (this.f12166j.length * 4) + this.f12160d.limit() + this.f12165i.length;
    }

    public final Bitmap g() {
        Boolean bool = this.f12174s;
        Bitmap c3 = ((b) this.f12159c).f3724a.c(this.f12173r, this.f12172q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f12175t);
        c3.setHasAlpha(true);
        return c3;
    }

    public final ByteBuffer getData() {
        return this.f12160d;
    }

    public final void h(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f12175t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r3.f12151j == r1.f12138h) goto L_0x0048;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap i(o4.b r36, o4.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f12166j
            o4.a$a r11 = r0.f12159c
            r12 = 0
            if (r2 != 0) goto L_0x001f
            android.graphics.Bitmap r3 = r0.m
            if (r3 == 0) goto L_0x0019
            r4 = r11
            c5.b r4 = (c5.b) r4
            s4.c r4 = r4.f3724a
            r4.d(r3)
        L_0x0019:
            r3 = 0
            r0.m = r3
            java.util.Arrays.fill(r10, r12)
        L_0x001f:
            r13 = 3
            if (r2 == 0) goto L_0x002d
            int r3 = r2.f12137g
            if (r3 != r13) goto L_0x002d
            android.graphics.Bitmap r3 = r0.m
            if (r3 != 0) goto L_0x002d
            java.util.Arrays.fill(r10, r12)
        L_0x002d:
            r14 = 2
            if (r2 == 0) goto L_0x007f
            int r3 = r2.f12137g
            if (r3 <= 0) goto L_0x007f
            if (r3 != r14) goto L_0x006d
            boolean r3 = r1.f12136f
            if (r3 != 0) goto L_0x0048
            o4.c r3 = r0.f12168l
            int r4 = r3.f12152k
            int[] r5 = r1.f12141k
            if (r5 == 0) goto L_0x0049
            int r3 = r3.f12151j
            int r5 = r1.f12138h
            if (r3 != r5) goto L_0x0049
        L_0x0048:
            r4 = r12
        L_0x0049:
            int r3 = r2.f12134d
            int r5 = r0.f12171p
            int r3 = r3 / r5
            int r6 = r2.f12132b
            int r6 = r6 / r5
            int r7 = r2.f12133c
            int r7 = r7 / r5
            int r2 = r2.f12131a
            int r2 = r2 / r5
            int r5 = r0.f12173r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005d:
            if (r6 >= r3) goto L_0x007f
            int r2 = r6 + r7
            r5 = r6
        L_0x0062:
            if (r5 >= r2) goto L_0x0069
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0069:
            int r2 = r0.f12173r
            int r6 = r6 + r2
            goto L_0x005d
        L_0x006d:
            if (r3 != r13) goto L_0x007f
            android.graphics.Bitmap r2 = r0.m
            if (r2 == 0) goto L_0x007f
            r4 = 0
            int r8 = r0.f12173r
            r6 = 0
            r7 = 0
            int r9 = r0.f12172q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007f:
            java.nio.ByteBuffer r2 = r0.f12160d
            int r3 = r1.f12140j
            r2.position(r3)
            int r2 = r1.f12133c
            int r3 = r1.f12134d
            int r2 = r2 * r3
            byte[] r3 = r0.f12165i
            if (r3 == 0) goto L_0x0092
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a5
        L_0x0092:
            c5.b r11 = (c5.b) r11
            s4.b r3 = r11.f3725b
            if (r3 != 0) goto L_0x009b
            byte[] r3 = new byte[r2]
            goto L_0x00a3
        L_0x009b:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a3:
            r0.f12165i = r3
        L_0x00a5:
            byte[] r3 = r0.f12165i
            short[] r4 = r0.f12162f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b1
            short[] r4 = new short[r5]
            r0.f12162f = r4
        L_0x00b1:
            short[] r4 = r0.f12162f
            byte[] r6 = r0.f12163g
            if (r6 != 0) goto L_0x00bb
            byte[] r6 = new byte[r5]
            r0.f12163g = r6
        L_0x00bb:
            byte[] r6 = r0.f12163g
            byte[] r7 = r0.f12164h
            if (r7 != 0) goto L_0x00c7
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f12164h = r7
        L_0x00c7:
            byte[] r7 = r0.f12164h
            java.nio.ByteBuffer r8 = r0.f12160d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r11 = r9 << r8
            int r15 = r11 + 1
            int r16 = r11 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r14 = -1
            int r17 = r17 + -1
            r5 = r12
        L_0x00df:
            if (r5 >= r11) goto L_0x00ea
            r4[r5] = r12
            byte r14 = (byte) r5
            r6[r5] = r14
            int r5 = r5 + 1
            r14 = -1
            goto L_0x00df
        L_0x00ea:
            byte[] r5 = r0.f12161e
            r13 = r0
            r26 = r8
            r9 = r12
            r20 = r9
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r27 = r24
            r29 = r27
            r25 = r16
            r28 = r17
            r14 = -1
        L_0x0103:
            r30 = 8
            if (r9 >= r2) goto L_0x0200
            if (r21 != 0) goto L_0x0143
            java.nio.ByteBuffer r12 = r0.f12160d
            byte r12 = r12.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r12 > 0) goto L_0x011c
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r14
            goto L_0x0134
        L_0x011c:
            r31 = r8
            java.nio.ByteBuffer r8 = r13.f12160d
            r32 = r9
            byte[] r9 = r13.f12161e
            r33 = r14
            int r14 = r8.remaining()
            int r14 = java.lang.Math.min(r12, r14)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r14)
        L_0x0134:
            if (r12 > 0) goto L_0x013e
            r8 = 3
            r13.f12170o = r8
            r12 = r20
            r10 = 0
            goto L_0x0205
        L_0x013e:
            r21 = r12
            r22 = 0
            goto L_0x014b
        L_0x0143:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r14
        L_0x014b:
            byte r8 = r5[r22]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r23
            int r24 = r24 + r8
            int r23 = r23 + 8
            r8 = 1
            int r22 = r22 + 1
            r8 = -1
            int r21 = r21 + -1
            r10 = r23
            r12 = r25
            r8 = r26
            r9 = r32
            r14 = r33
            r23 = r5
            r5 = r27
        L_0x0169:
            if (r10 < r8) goto L_0x01ec
            r25 = r13
            r13 = r24 & r28
            int r24 = r24 >> r8
            int r10 = r10 - r8
            if (r13 != r11) goto L_0x0185
            r26 = r10
            r12 = r16
            r28 = r17
            r13 = r25
            r8 = r31
            r14 = -1
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e6
        L_0x0185:
            if (r13 != r15) goto L_0x018f
            r27 = r5
            r13 = r25
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01f1
        L_0x018f:
            r26 = r10
            r10 = -1
            if (r14 != r10) goto L_0x01a2
            byte r5 = r6[r13]
            r3[r20] = r5
            int r20 = r20 + 1
            int r9 = r9 + 1
            r5 = r13
            r14 = r5
            r10 = r26
            r13 = r0
            goto L_0x0169
        L_0x01a2:
            if (r13 < r12) goto L_0x01ab
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r14
            goto L_0x01ac
        L_0x01ab:
            r5 = r13
        L_0x01ac:
            if (r5 < r11) goto L_0x01b7
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01ac
        L_0x01b7:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r20] = r10
        L_0x01be:
            r19 = 1
            int r20 = r20 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01cd
            int r29 = r29 + -1
            byte r25 = r7[r29]
            r3[r20] = r25
            goto L_0x01be
        L_0x01cd:
            r25 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r12 >= r5) goto L_0x01e4
            short r14 = (short) r14
            r4[r12] = r14
            r6[r12] = r10
            int r12 = r12 + 1
            r10 = r12 & r28
            if (r10 != 0) goto L_0x01e4
            if (r12 >= r5) goto L_0x01e4
            int r8 = r8 + 1
            int r28 = r28 + r12
        L_0x01e4:
            r14 = r13
            r13 = r0
        L_0x01e6:
            r5 = r25
            r10 = r26
            goto L_0x0169
        L_0x01ec:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r13 = r0
        L_0x01f1:
            r26 = r8
            r25 = r12
            r5 = r23
            r8 = r31
            r12 = 0
            r23 = r10
            r10 = r34
            goto L_0x0103
        L_0x0200:
            r34 = r10
            r10 = r12
            r12 = r20
        L_0x0205:
            java.util.Arrays.fill(r3, r12, r2, r10)
            boolean r2 = r1.f12135e
            if (r2 != 0) goto L_0x027f
            int r2 = r0.f12171p
            r3 = 1
            if (r2 == r3) goto L_0x0213
            goto L_0x027f
        L_0x0213:
            int[] r2 = r0.f12166j
            int r3 = r1.f12134d
            int r4 = r1.f12132b
            int r5 = r1.f12133c
            int r6 = r1.f12131a
            int r7 = r0.f12167k
            if (r7 != 0) goto L_0x0223
            r7 = 1
            goto L_0x0224
        L_0x0223:
            r7 = r10
        L_0x0224:
            int r8 = r0.f12173r
            byte[] r9 = r0.f12165i
            int[] r11 = r0.f12157a
            r13 = r10
            r12 = -1
        L_0x022c:
            if (r13 >= r3) goto L_0x0261
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0239
            r10 = r14
        L_0x0239:
            int r14 = r1.f12133c
            int r14 = r14 * r13
        L_0x023c:
            if (r15 >= r10) goto L_0x0259
            r16 = r3
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x0250
            r4 = r11[r4]
            if (r4 == 0) goto L_0x024f
            r2[r15] = r4
            goto L_0x0250
        L_0x024f:
            r12 = r3
        L_0x0250:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x023c
        L_0x0259:
            r16 = r3
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x022c
        L_0x0261:
            java.lang.Boolean r2 = r0.f12174s
            if (r2 == 0) goto L_0x026b
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0274
        L_0x026b:
            java.lang.Boolean r2 = r0.f12174s
            if (r2 != 0) goto L_0x0276
            if (r7 == 0) goto L_0x0276
            r2 = -1
            if (r12 == r2) goto L_0x0276
        L_0x0274:
            r12 = 1
            goto L_0x0277
        L_0x0276:
            r12 = 0
        L_0x0277:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f12174s = r2
            goto L_0x040a
        L_0x027f:
            int[] r2 = r0.f12166j
            int r3 = r1.f12134d
            int r4 = r0.f12171p
            int r3 = r3 / r4
            int r5 = r1.f12132b
            int r5 = r5 / r4
            int r6 = r1.f12133c
            int r6 = r6 / r4
            int r7 = r1.f12131a
            int r7 = r7 / r4
            int r8 = r0.f12167k
            if (r8 != 0) goto L_0x0295
            r10 = 1
            goto L_0x0296
        L_0x0295:
            r10 = 0
        L_0x0296:
            int r8 = r0.f12173r
            int r9 = r0.f12172q
            byte[] r11 = r0.f12165i
            int[] r12 = r0.f12157a
            java.lang.Boolean r13 = r0.f12174s
            r14 = r13
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x02a7:
            if (r13 >= r3) goto L_0x03f6
            r37 = r14
            boolean r14 = r1.f12135e
            if (r14 == 0) goto L_0x02d6
            if (r15 < r3) goto L_0x02d1
            int r14 = r16 + 1
            r18 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02cc
            r3 = 3
            if (r14 == r3) goto L_0x02c5
            r3 = 4
            if (r14 == r3) goto L_0x02bf
            goto L_0x02ce
        L_0x02bf:
            r16 = r14
            r15 = 1
            r17 = 2
            goto L_0x02d3
        L_0x02c5:
            r3 = 4
            r17 = r3
            r16 = r14
            r15 = 2
            goto L_0x02d3
        L_0x02cc:
            r3 = 4
            r15 = r3
        L_0x02ce:
            r16 = r14
            goto L_0x02d3
        L_0x02d1:
            r18 = r3
        L_0x02d3:
            int r3 = r15 + r17
            goto L_0x02da
        L_0x02d6:
            r18 = r3
            r3 = r15
            r15 = r13
        L_0x02da:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02e0
            r14 = 1
            goto L_0x02e1
        L_0x02e0:
            r14 = 0
        L_0x02e1:
            if (r15 >= r9) goto L_0x03d6
            int r15 = r15 * r8
            int r20 = r15 + r7
            r21 = r3
            int r3 = r20 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02ee
            r3 = r15
        L_0x02ee:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f12133c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0317
            r14 = r37
            r5 = r20
        L_0x02fb:
            r23 = r6
            if (r5 >= r3) goto L_0x03cf
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x030a
            r2[r5] = r6
            goto L_0x0311
        L_0x030a:
            if (r10 == 0) goto L_0x0311
            if (r14 != 0) goto L_0x0311
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x0311:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02fb
        L_0x0317:
            r23 = r6
            int r5 = r3 - r20
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r20
        L_0x0321:
            if (r6 >= r3) goto L_0x03cf
            r20 = r3
            int r3 = r1.f12133c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0336:
            int r8 = r0.f12171p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x036b
            byte[] r8 = r0.f12165i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x036d
            if (r7 >= r5) goto L_0x036d
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f12157a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0366
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0366:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0336
        L_0x036b:
            r32 = r9
        L_0x036d:
            int r3 = r3 + r15
            r7 = r3
        L_0x036f:
            int r8 = r0.f12171p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x03a0
            byte[] r8 = r0.f12165i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x03a0
            if (r7 >= r5) goto L_0x03a0
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f12157a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x039d
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x039d:
            int r7 = r7 + 1
            goto L_0x036f
        L_0x03a0:
            if (r28 != 0) goto L_0x03a4
            r3 = 0
            goto L_0x03b6
        L_0x03a4:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b6:
            if (r3 == 0) goto L_0x03bb
            r2[r6] = r3
            goto L_0x03c2
        L_0x03bb:
            if (r10 == 0) goto L_0x03c2
            if (r14 != 0) goto L_0x03c2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03c2:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r20
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0321
        L_0x03cf:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e4
        L_0x03d6:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e4:
            int r13 = r13 + 1
            r3 = r18
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a7
        L_0x03f6:
            r37 = r14
            java.lang.Boolean r2 = r0.f12174s
            if (r2 != 0) goto L_0x040a
            if (r37 != 0) goto L_0x0400
            r12 = 0
            goto L_0x0404
        L_0x0400:
            boolean r12 = r37.booleanValue()
        L_0x0404:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f12174s = r2
        L_0x040a:
            boolean r2 = r0.f12169n
            if (r2 == 0) goto L_0x042e
            int r1 = r1.f12137g
            if (r1 == 0) goto L_0x0415
            r2 = 1
            if (r1 != r2) goto L_0x042e
        L_0x0415:
            android.graphics.Bitmap r1 = r0.m
            if (r1 != 0) goto L_0x041f
            android.graphics.Bitmap r1 = r35.g()
            r0.m = r1
        L_0x041f:
            android.graphics.Bitmap r1 = r0.m
            r3 = 0
            int r7 = r0.f12173r
            r5 = 0
            r6 = 0
            int r8 = r0.f12172q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042e:
            android.graphics.Bitmap r9 = r35.g()
            r3 = 0
            int r7 = r0.f12173r
            r5 = 0
            r6 = 0
            int r8 = r0.f12172q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.e.i(o4.b, o4.b):android.graphics.Bitmap");
    }
}
