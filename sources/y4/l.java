package y4;

import ag.b1;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p4.g;
import p4.h;
import p4.i;
import s4.c;
import y4.k;

public final class l {

    /* renamed from: f  reason: collision with root package name */
    public static final g<p4.b> f17199f = g.a(p4.b.f12451a, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final g<i> f17200g = new g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, g.f12459e);

    /* renamed from: h  reason: collision with root package name */
    public static final g<Boolean> f17201h;

    /* renamed from: i  reason: collision with root package name */
    public static final g<Boolean> f17202i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f17203j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final a f17204k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f17205l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    public static final ArrayDeque m = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f17206a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f17207b;

    /* renamed from: c  reason: collision with root package name */
    public final s4.b f17208c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f17209d;

    /* renamed from: e  reason: collision with root package name */
    public final q f17210e;

    public class a implements b {
        public final void a() {
        }

        public final void b(Bitmap bitmap, c cVar) {
        }
    }

    public interface b {
        void a();

        void b(Bitmap bitmap, c cVar);
    }

    static {
        k.e eVar = k.f17192a;
        Boolean bool = Boolean.FALSE;
        f17201h = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f17202i = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        char[] cArr = l5.l.f11007a;
    }

    public l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, c cVar, s4.b bVar) {
        if (q.f17218j == null) {
            synchronized (q.class) {
                if (q.f17218j == null) {
                    q.f17218j = new q();
                }
            }
        }
        this.f17210e = q.f17218j;
        this.f17209d = list;
        b1.b(displayMetrics);
        this.f17207b = displayMetrics;
        b1.b(cVar);
        this.f17206a = cVar;
        b1.b(bVar);
        this.f17208c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(y4.r r5, android.graphics.BitmapFactory.Options r6, y4.l.b r7, s4.c r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.a()
            r5.c()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = y4.y.f17251b
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.d(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = y4.y.f17251b
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = y4.y.f17251b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.l.c(y4.r, android.graphics.BitmapFactory$Options, y4.l$b, s4.c):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i8, int i10, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i8 + ", outHeight: " + i10 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(r rVar, int i8, int i10, h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f17208c.c(65536, byte[].class);
        synchronized (l.class) {
            arrayDeque = m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        p4.b bVar2 = (p4.b) hVar2.c(f17199f);
        i iVar = (i) hVar2.c(f17200g);
        k kVar = (k) hVar2.c(k.f17197f);
        boolean booleanValue = ((Boolean) hVar2.c(f17201h)).booleanValue();
        g gVar = f17202i;
        try {
            d e10 = d.e(b(rVar, options2, kVar, bVar2, iVar, hVar2.c(gVar) != null && ((Boolean) hVar2.c(gVar)).booleanValue(), i8, i10, booleanValue, bVar), this.f17206a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f17208c.put(bArr);
            return e10;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f17208c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x033d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x054d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(y4.r r38, android.graphics.BitmapFactory.Options r39, y4.k r40, p4.b r41, p4.i r42, boolean r43, int r44, int r45, boolean r46, y4.l.b r47) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            r3 = r39
            r0 = r40
            r4 = r41
            r5 = r42
            r6 = r44
            r7 = r45
            r8 = r47
            int r9 = l5.h.f10997b
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()
            r11 = 1
            r3.inJustDecodeBounds = r11
            s4.c r12 = r1.f17206a
            c(r2, r3, r8, r12)
            r13 = 0
            r3.inJustDecodeBounds = r13
            int r14 = r3.outWidth
            int r15 = r3.outHeight
            java.lang.String r13 = r3.outMimeType
            r11 = -1
            if (r14 == r11) goto L_0x0032
            if (r15 != r11) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r11 = r43
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r16 = r38.a()
            r17 = r9
            switch(r16) {
                case 3: goto L_0x0044;
                case 4: goto L_0x0044;
                case 5: goto L_0x0041;
                case 6: goto L_0x0041;
                case 7: goto L_0x003e;
                case 8: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            r9 = 0
            goto L_0x0048
        L_0x003e:
            r19 = 270(0x10e, float:3.78E-43)
            goto L_0x0046
        L_0x0041:
            r19 = 90
            goto L_0x0046
        L_0x0044:
            r19 = 180(0xb4, float:2.52E-43)
        L_0x0046:
            r9 = r19
        L_0x0048:
            switch(r16) {
                case 2: goto L_0x004e;
                case 3: goto L_0x004e;
                case 4: goto L_0x004e;
                case 5: goto L_0x004e;
                case 6: goto L_0x004e;
                case 7: goto L_0x004e;
                case 8: goto L_0x004e;
                default: goto L_0x004b;
            }
        L_0x004b:
            r20 = 0
            goto L_0x0050
        L_0x004e:
            r20 = 1
        L_0x0050:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r10) goto L_0x0068
            r10 = 90
            if (r9 == r10) goto L_0x005f
            r10 = 270(0x10e, float:3.78E-43)
            if (r9 != r10) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r10 = 0
            goto L_0x0060
        L_0x005f:
            r10 = 1
        L_0x0060:
            if (r10 == 0) goto L_0x0064
            r10 = r15
            goto L_0x0065
        L_0x0064:
            r10 = r14
        L_0x0065:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x006d
        L_0x0068:
            r36 = r10
            r10 = r6
            r6 = r36
        L_0x006d:
            if (r7 != r6) goto L_0x0081
            r6 = 90
            if (r9 == r6) goto L_0x007a
            r6 = 270(0x10e, float:3.78E-43)
            if (r9 != r6) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r6 = 0
            goto L_0x007b
        L_0x007a:
            r6 = 1
        L_0x007b:
            if (r6 == 0) goto L_0x007f
            r6 = r14
            goto L_0x0082
        L_0x007f:
            r6 = r15
            goto L_0x0082
        L_0x0081:
            r6 = r7
        L_0x0082:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r38.d()
            r21 = r13
            java.lang.String r13 = ", target density: "
            java.lang.String r5 = ", density: "
            java.lang.String r4 = "x"
            r23 = r11
            java.lang.String r11 = "Downsampler"
            java.lang.String r1 = "]"
            if (r14 <= 0) goto L_0x02aa
            if (r15 > 0) goto L_0x00a3
            r0 = r1
            r1 = r4
            r2 = r11
            r32 = r12
            r4 = r13
            r11 = r15
            r9 = 3
            r15 = r10
            goto L_0x02b3
        L_0x00a3:
            r24 = r1
            r1 = 90
            if (r9 == r1) goto L_0x00b0
            r1 = 270(0x10e, float:3.78E-43)
            if (r9 != r1) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r1 = 0
            goto L_0x00b1
        L_0x00b0:
            r1 = 1
        L_0x00b1:
            r43 = r5
            r19 = r13
            if (r1 == 0) goto L_0x00ba
            r5 = r14
            r1 = r15
            goto L_0x00bc
        L_0x00ba:
            r1 = r14
            r5 = r15
        L_0x00bc:
            float r13 = r0.b(r1, r5, r10, r6)
            r22 = 0
            int r25 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r25 <= 0) goto L_0x026a
            r25 = r9
            int r9 = r0.a(r1, r5, r10, r6)
            if (r9 == 0) goto L_0x0262
            r26 = r15
            float r15 = (float) r1
            r27 = r4
            float r4 = r13 * r15
            r28 = r10
            r29 = r11
            double r10 = (double) r4
            r30 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 + r30
            int r4 = (int) r10
            float r10 = (float) r5
            float r11 = r13 * r10
            r32 = r12
            double r11 = (double) r11
            double r11 = r11 + r30
            int r11 = (int) r11
            int r4 = r1 / r4
            int r11 = r5 / r11
            r12 = 1
            if (r9 != r12) goto L_0x00f4
            int r4 = java.lang.Math.max(r4, r11)
            goto L_0x00f8
        L_0x00f4:
            int r4 = java.lang.Math.min(r4, r11)
        L_0x00f8:
            int r4 = java.lang.Integer.highestOneBit(r4)
            int r4 = java.lang.Math.max(r12, r4)
            if (r9 != r12) goto L_0x010d
            float r9 = (float) r4
            r11 = 1065353216(0x3f800000, float:1.0)
            float r12 = r11 / r13
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x010d
            int r4 = r4 << 1
        L_0x010d:
            r3.inSampleSize = r4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r7 != r9) goto L_0x012f
            r1 = 8
            int r1 = java.lang.Math.min(r4, r1)
            float r1 = (float) r1
            float r15 = r15 / r1
            double r11 = (double) r15
            double r11 = java.lang.Math.ceil(r11)
            int r5 = (int) r11
            float r10 = r10 / r1
            double r9 = (double) r10
            double r9 = java.lang.Math.ceil(r9)
            int r1 = (int) r9
            int r7 = r4 / 8
            if (r7 <= 0) goto L_0x015a
            int r5 = r5 / r7
            int r1 = r1 / r7
            goto L_0x015a
        L_0x012f:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r7 == r9) goto L_0x0176
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r7 != r9) goto L_0x0138
            goto L_0x0176
        L_0x0138:
            boolean r7 = r7.isWebp()
            if (r7 == 0) goto L_0x014a
            float r1 = (float) r4
            float r15 = r15 / r1
            int r5 = java.lang.Math.round(r15)
            float r10 = r10 / r1
            int r1 = java.lang.Math.round(r10)
            goto L_0x015a
        L_0x014a:
            int r7 = r1 % r4
            if (r7 != 0) goto L_0x0161
            int r7 = r5 % r4
            if (r7 == 0) goto L_0x0153
            goto L_0x0161
        L_0x0153:
            int r1 = r1 / r4
            int r5 = r5 / r4
            r36 = r5
            r5 = r1
            r1 = r36
        L_0x015a:
            r7 = r5
            r15 = r28
            r5 = r1
            r1 = r32
            goto L_0x0189
        L_0x0161:
            r1 = 1
            r3.inJustDecodeBounds = r1
            r1 = r32
            c(r2, r3, r8, r1)
            r5 = 0
            r3.inJustDecodeBounds = r5
            int r5 = r3.outWidth
            int r7 = r3.outHeight
            r36 = r7
            r7 = r5
            r5 = r36
            goto L_0x0187
        L_0x0176:
            r1 = r32
            float r5 = (float) r4
            float r15 = r15 / r5
            double r11 = (double) r15
            double r11 = java.lang.Math.floor(r11)
            int r7 = (int) r11
            float r10 = r10 / r5
            double r9 = (double) r10
            double r9 = java.lang.Math.floor(r9)
            int r5 = (int) r9
        L_0x0187:
            r15 = r28
        L_0x0189:
            float r0 = r0.b(r7, r5, r15, r6)
            double r9 = (double) r0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0197
            r32 = r9
            goto L_0x0199
        L_0x0197:
            double r32 = r11 / r9
        L_0x0199:
            r34 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r32 = r32 * r34
            long r11 = java.lang.Math.round(r32)
            int r11 = (int) r11
            r32 = r1
            double r1 = (double) r11
            double r1 = r1 * r9
            double r1 = r1 + r30
            int r1 = (int) r1
            float r2 = (float) r1
            float r11 = (float) r11
            float r2 = r2 / r11
            double r11 = (double) r2
            double r11 = r9 / r11
            double r1 = (double) r1
            double r11 = r11 * r1
            double r11 = r11 + r30
            int r1 = (int) r11
            r3.inTargetDensity = r1
            if (r0 > 0) goto L_0x01bd
            r11 = r9
            goto L_0x01c1
        L_0x01bd:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r0 / r9
        L_0x01c1:
            double r11 = r11 * r34
            long r0 = java.lang.Math.round(r11)
            int r0 = (int) r0
            r3.inDensity = r0
            int r1 = r3.inTargetDensity
            if (r1 <= 0) goto L_0x01d4
            if (r0 <= 0) goto L_0x01d4
            if (r1 == r0) goto L_0x01d4
            r0 = 1
            goto L_0x01d5
        L_0x01d4:
            r0 = 0
        L_0x01d5:
            if (r0 == 0) goto L_0x01db
            r1 = 1
            r3.inScaled = r1
            goto L_0x01e0
        L_0x01db:
            r1 = 0
            r3.inTargetDensity = r1
            r3.inDensity = r1
        L_0x01e0:
            r2 = r29
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x0258
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Calculate scaling, source: ["
            r0.<init>(r1)
            r0.append(r14)
            r1 = r27
            r0.append(r1)
            r11 = r26
            r0.append(r11)
            java.lang.String r12 = "], degreesToRotate: "
            r0.append(r12)
            r12 = r25
            r0.append(r12)
            java.lang.String r12 = ", target: ["
            r0.append(r12)
            r0.append(r15)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r12 = "], power of two scaled: ["
            r0.append(r12)
            r0.append(r7)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "], exact scale factor: "
            r0.append(r5)
            r0.append(r13)
            java.lang.String r5 = ", power of 2 sample size: "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = ", adjusted scale factor: "
            r0.append(r4)
            r0.append(r9)
            r4 = r19
            r0.append(r4)
            int r5 = r3.inTargetDensity
            r0.append(r5)
            r5 = r43
            r0.append(r5)
            int r7 = r3.inDensity
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
            goto L_0x02db
        L_0x0258:
            r5 = r43
            r4 = r19
            r11 = r26
            r1 = r27
            goto L_0x02db
        L_0x0262:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r1 = r4
            r11 = r15
            r15 = r10
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot scale with factor: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r4 = " from: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", source: ["
            r3.append(r0)
            r3.append(r14)
            r3.append(r1)
            r3.append(r11)
            java.lang.String r0 = "], target: ["
            r3.append(r0)
            r3.append(r15)
            r3.append(r1)
            r3.append(r6)
            r0 = r24
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x02aa:
            r0 = r1
            r1 = r4
            r2 = r11
            r32 = r12
            r4 = r13
            r11 = r15
            r15 = r10
            r9 = 3
        L_0x02b3:
            boolean r10 = android.util.Log.isLoggable(r2, r9)
            if (r10 == 0) goto L_0x02db
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to determine dimensions for: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = " with target ["
            r9.append(r7)
            r9.append(r15)
            r9.append(r1)
            r9.append(r6)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            android.util.Log.d(r2, r0)
        L_0x02db:
            r7 = r37
            y4.q r0 = r7.f17210e
            r10 = r20
            r9 = r23
            boolean r0 = r0.a(r15, r6, r9, r10)
            if (r0 == 0) goto L_0x02f1
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r9
            r12 = 0
            r3.inMutable = r12
            goto L_0x02f2
        L_0x02f1:
            r12 = 0
        L_0x02f2:
            if (r0 == 0) goto L_0x02f7
            r9 = r1
        L_0x02f5:
            r1 = 1
            goto L_0x0337
        L_0x02f7:
            p4.b r0 = p4.b.f12451a
            r9 = r1
            r1 = r41
            if (r1 == r0) goto L_0x0332
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r38.d()     // Catch:{ IOException -> 0x0307 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x0307 }
            goto L_0x0321
        L_0x0307:
            r0 = move-exception
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r2, r10)
            if (r10 == 0) goto L_0x0320
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "Cannot determine whether the image has alpha or not from header, format "
            r10.<init>(r13)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            android.util.Log.d(r2, r1, r0)
        L_0x0320:
            r0 = r12
        L_0x0321:
            if (r0 == 0) goto L_0x0326
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0328
        L_0x0326:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x0328:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r1) goto L_0x02f5
            r1 = 1
            r3.inDither = r1
            goto L_0x0337
        L_0x0332:
            r1 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x0337:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r10 = r3.inSampleSize
            if (r14 < 0) goto L_0x0345
            if (r11 < 0) goto L_0x0345
            if (r46 == 0) goto L_0x0345
            r13 = r2
            r10 = r15
            goto L_0x03cd
        L_0x0345:
            int r6 = r3.inTargetDensity
            if (r6 <= 0) goto L_0x0351
            int r13 = r3.inDensity
            if (r13 <= 0) goto L_0x0351
            if (r6 == r13) goto L_0x0351
            r13 = r1
            goto L_0x0352
        L_0x0351:
            r13 = r12
        L_0x0352:
            if (r13 == 0) goto L_0x035a
            float r6 = (float) r6
            int r13 = r3.inDensity
            float r13 = (float) r13
            float r6 = r6 / r13
            goto L_0x035c
        L_0x035a:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x035c:
            float r13 = (float) r14
            float r15 = (float) r10
            float r13 = r13 / r15
            double r12 = (double) r13
            double r12 = java.lang.Math.ceil(r12)
            int r12 = (int) r12
            float r13 = (float) r11
            float r13 = r13 / r15
            r29 = r2
            double r1 = (double) r13
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = (float) r12
            float r2 = r2 * r6
            int r2 = java.lang.Math.round(r2)
            float r1 = (float) r1
            float r1 = r1 * r6
            int r1 = java.lang.Math.round(r1)
            r13 = r29
            r12 = 2
            boolean r15 = android.util.Log.isLoggable(r13, r12)
            if (r15 == 0) goto L_0x03cb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "Calculated target ["
            r12.<init>(r15)
            r12.append(r2)
            r12.append(r9)
            r12.append(r1)
            java.lang.String r15 = "] for source ["
            r12.append(r15)
            r12.append(r14)
            r12.append(r9)
            r12.append(r11)
            java.lang.String r15 = "], sampleSize: "
            r12.append(r15)
            r12.append(r10)
            java.lang.String r10 = ", targetDensity: "
            r12.append(r10)
            int r10 = r3.inTargetDensity
            r12.append(r10)
            r12.append(r5)
            int r10 = r3.inDensity
            r12.append(r10)
            java.lang.String r10 = ", density multiplier: "
            r12.append(r10)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            android.util.Log.v(r13, r6)
        L_0x03cb:
            r6 = r1
            r10 = r2
        L_0x03cd:
            if (r10 <= 0) goto L_0x03e7
            if (r6 <= 0) goto L_0x03e7
            android.graphics.Bitmap$Config r1 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r2) goto L_0x03d8
            goto L_0x03e7
        L_0x03d8:
            android.graphics.Bitmap$Config r2 = r3.outConfig
            if (r2 != 0) goto L_0x03dd
            goto L_0x03de
        L_0x03dd:
            r1 = r2
        L_0x03de:
            r2 = r32
            android.graphics.Bitmap r1 = r2.c(r10, r6, r1)
            r3.inBitmap = r1
            goto L_0x03e9
        L_0x03e7:
            r2 = r32
        L_0x03e9:
            r1 = r42
            if (r1 == 0) goto L_0x0418
            r6 = 28
            if (r0 < r6) goto L_0x0410
            p4.i r0 = p4.i.f12465a
            if (r1 != r0) goto L_0x0401
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x0401
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0401
            r12 = 1
            goto L_0x0402
        L_0x0401:
            r12 = 0
        L_0x0402:
            if (r12 == 0) goto L_0x0407
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0409
        L_0x0407:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0409:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0418
        L_0x0410:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0418:
            r1 = r38
            android.graphics.Bitmap r0 = c(r1, r3, r8, r2)
            r8.b(r0, r2)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r13, r1)
            if (r1 == 0) goto L_0x04ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "Decoded "
            r1.<init>(r6)
            java.lang.String r6 = d(r0)
            r1.append(r6)
            java.lang.String r6 = " from ["
            r1.append(r6)
            r1.append(r14)
            r1.append(r9)
            r1.append(r11)
            java.lang.String r6 = "] "
            r1.append(r6)
            r6 = r21
            r1.append(r6)
            java.lang.String r6 = " with inBitmap "
            r1.append(r6)
            android.graphics.Bitmap r6 = r3.inBitmap
            java.lang.String r6 = d(r6)
            r1.append(r6)
            java.lang.String r6 = " for ["
            r1.append(r6)
            r6 = r44
            r1.append(r6)
            r1.append(r9)
            r6 = r45
            r1.append(r6)
            java.lang.String r6 = "], sample size: "
            r1.append(r6)
            int r6 = r3.inSampleSize
            r1.append(r6)
            r1.append(r5)
            int r5 = r3.inDensity
            r1.append(r5)
            r1.append(r4)
            int r3 = r3.inTargetDensity
            r1.append(r3)
            java.lang.String r3 = ", thread: "
            r1.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = ", duration: "
            r1.append(r3)
            double r3 = l5.h.a(r17)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L_0x04ab:
            if (r0 == 0) goto L_0x054d
            android.util.DisplayMetrics r1 = r7.f17207b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            switch(r16) {
                case 2: goto L_0x04b9;
                case 3: goto L_0x04b9;
                case 4: goto L_0x04b9;
                case 5: goto L_0x04b9;
                case 6: goto L_0x04b9;
                case 7: goto L_0x04b9;
                case 8: goto L_0x04b9;
                default: goto L_0x04b7;
            }
        L_0x04b7:
            r11 = 0
            goto L_0x04ba
        L_0x04b9:
            r11 = 1
        L_0x04ba:
            if (r11 != 0) goto L_0x04bf
            r4 = r0
            goto L_0x0543
        L_0x04bf:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r16) {
                case 2: goto L_0x04f7;
                case 3: goto L_0x04f3;
                case 4: goto L_0x04ea;
                case 5: goto L_0x04e1;
                case 6: goto L_0x04dd;
                case 7: goto L_0x04d4;
                case 8: goto L_0x04d0;
                default: goto L_0x04cf;
            }
        L_0x04cf:
            goto L_0x04fc
        L_0x04d0:
            r1.setRotate(r3)
            goto L_0x04fc
        L_0x04d4:
            r1.setRotate(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.postScale(r6, r3)
            goto L_0x04fc
        L_0x04dd:
            r1.setRotate(r4)
            goto L_0x04fc
        L_0x04e1:
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setRotate(r4)
            r1.postScale(r6, r3)
            goto L_0x04fc
        L_0x04ea:
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setRotate(r5)
            r1.postScale(r6, r3)
            goto L_0x04fc
        L_0x04f3:
            r1.setRotate(r5)
            goto L_0x04fc
        L_0x04f7:
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setScale(r6, r3)
        L_0x04fc:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r5 = r0.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r1.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            if (r6 == 0) goto L_0x052a
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            goto L_0x052c
        L_0x052a:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x052c:
            android.graphics.Bitmap r4 = r2.e(r4, r5, r6)
            float r5 = r3.left
            float r5 = -r5
            float r3 = r3.top
            float r3 = -r3
            r1.postTranslate(r5, r3)
            boolean r3 = r0.hasAlpha()
            r4.setHasAlpha(r3)
            y4.y.a(r0, r4, r1)
        L_0x0543:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L_0x054e
            r2.d(r0)
            goto L_0x054e
        L_0x054d:
            r4 = 0
        L_0x054e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.l.b(y4.r, android.graphics.BitmapFactory$Options, y4.k, p4.b, p4.i, boolean, int, int, boolean, y4.l$b):android.graphics.Bitmap");
    }
}
