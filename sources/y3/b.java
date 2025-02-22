package y3;

import h4.l;
import kotlinx.coroutines.sync.f;
import kotlinx.coroutines.sync.g;
import sf.k;
import wg.e;
import wg.h;
import wg.o;
import y3.e;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final k f17135a;

    /* renamed from: b  reason: collision with root package name */
    public final l f17136b;

    /* renamed from: c  reason: collision with root package name */
    public final f f17137c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17138d;

    public static final class a extends o {

        /* renamed from: b  reason: collision with root package name */
        public Exception f17139b;

        public a(h hVar) {
            super(hVar);
        }

        public final long a0(e eVar, long j10) {
            try {
                return super.a0(eVar, j10);
            } catch (Exception e10) {
                this.f17139b = e10;
                throw e10;
            }
        }
    }

    /* renamed from: y3.b$b  reason: collision with other inner class name */
    public static final class C0321b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17140a;

        /* renamed from: b  reason: collision with root package name */
        public final g f17141b;

        public C0321b(int i8, int i10) {
            this.f17140a = i10;
            int i11 = kotlinx.coroutines.sync.h.f10799a;
            this.f17141b = new g(i8, 0);
        }

        public final b a(b4.l lVar, l lVar2) {
            return new b(lVar.f3245a, lVar2, this.f17141b, this.f17140a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof C0321b;
        }

        public final int hashCode() {
            return C0321b.class.hashCode();
        }
    }

    @lf.e(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {232, 46}, m = "decode")
    public static final class c extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public Object f17142a;

        /* renamed from: b  reason: collision with root package name */
        public f f17143b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f17144c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f17145d;

        /* renamed from: e  reason: collision with root package name */
        public int f17146e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, jf.d<? super c> dVar) {
            super(dVar);
            this.f17145d = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17144c = obj;
            this.f17146e |= Integer.MIN_VALUE;
            return this.f17145d.a(this);
        }
    }

    public static final class d extends k implements rf.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17147a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar) {
            super(0);
            this.f17147a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
            if (y3.i.f17156a.contains(r9) != false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0232, code lost:
            if ((r4 > 0 ? true : r9) == false) goto L_0x02dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0284, code lost:
            if ((r2.top == 0.0f ? true : r9) == false) goto L_0x0286;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
            if ((r11 > 0) != false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
            if ((r9 == android.graphics.Bitmap.Config.HARDWARE) != false) goto L_0x00ce;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x030e  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d() {
            /*
                r21 = this;
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
                r0.<init>()
                y3.b$a r1 = new y3.b$a
                r2 = r21
                y3.b r3 = r2.f17147a
                y3.k r4 = r3.f17135a
                wg.h r5 = r4.d()
                r1.<init>(r5)
                wg.c0 r5 = d2.f1.j(r1)
                r6 = 1
                r0.inJustDecodeBounds = r6
                wg.a0 r7 = new wg.a0
                r7.<init>(r5)
                wg.c0 r7 = d2.f1.j(r7)
                wg.c0$a r8 = new wg.c0$a
                r8.<init>(r7)
                r7 = 0
                android.graphics.BitmapFactory.decodeStream(r8, r7, r0)
                java.lang.Exception r8 = r1.f17139b
                if (r8 != 0) goto L_0x030f
                r8 = 0
                r0.inJustDecodeBounds = r8
                android.graphics.Paint r9 = y3.h.f17155a
                java.lang.String r9 = r0.outMimeType
                java.util.Set<java.lang.String> r10 = y3.i.f17156a
                int r10 = r3.f17138d
                int r10 = q.g.c(r10)
                r11 = 2
                if (r10 == 0) goto L_0x005a
                if (r10 == r6) goto L_0x004e
                if (r10 != r11) goto L_0x0048
                goto L_0x0058
            L_0x0048:
                ff.e r0 = new ff.e
                r0.<init>()
                throw r0
            L_0x004e:
                if (r9 == 0) goto L_0x005a
                java.util.Set<java.lang.String> r10 = y3.i.f17156a
                boolean r9 = r10.contains(r9)
                if (r9 == 0) goto L_0x005a
            L_0x0058:
                r9 = r6
                goto L_0x005b
            L_0x005a:
                r9 = r8
            L_0x005b:
                r10 = 90
                r12 = 270(0x10e, float:3.78E-43)
                if (r9 == 0) goto L_0x00a0
                s2.a r9 = new s2.a
                y3.g r13 = new y3.g
                wg.a0 r14 = new wg.a0
                r14.<init>(r5)
                wg.c0 r14 = d2.f1.j(r14)
                wg.c0$a r15 = new wg.c0$a
                r15.<init>(r14)
                r13.<init>(r15)
                r9.<init>(r13)
                y3.f r13 = new y3.f
                int r14 = r9.c()
                if (r14 == r11) goto L_0x008c
                r11 = 7
                if (r14 == r11) goto L_0x008c
                r11 = 4
                if (r14 == r11) goto L_0x008c
                r11 = 5
                if (r14 == r11) goto L_0x008c
                r11 = r8
                goto L_0x008d
            L_0x008c:
                r11 = r6
            L_0x008d:
                int r9 = r9.c()
                switch(r9) {
                    case 3: goto L_0x009a;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x0098;
                    case 6: goto L_0x0096;
                    case 7: goto L_0x0096;
                    case 8: goto L_0x0098;
                    default: goto L_0x0094;
                }
            L_0x0094:
                r9 = r8
                goto L_0x009c
            L_0x0096:
                r9 = r10
                goto L_0x009c
            L_0x0098:
                r9 = r12
                goto L_0x009c
            L_0x009a:
                r9 = 180(0xb4, float:2.52E-43)
            L_0x009c:
                r13.<init>(r9, r11)
                goto L_0x00a2
            L_0x00a0:
                y3.f r13 = y3.f.f17150c
            L_0x00a2:
                java.lang.Exception r9 = r1.f17139b
                if (r9 != 0) goto L_0x030e
                r0.inMutable = r8
                h4.l r3 = r3.f17136b
                android.graphics.ColorSpace r9 = r3.f9197c
                if (r9 == 0) goto L_0x00b0
                r0.inPreferredColorSpace = r9
            L_0x00b0:
                boolean r9 = r3.f9202h
                r0.inPremultiplied = r9
                android.graphics.Bitmap$Config r9 = r3.f9196b
                int r11 = r13.f17152b
                boolean r14 = r13.f17151a
                if (r14 != 0) goto L_0x00c3
                if (r11 <= 0) goto L_0x00c0
                r15 = r6
                goto L_0x00c1
            L_0x00c0:
                r15 = r8
            L_0x00c1:
                if (r15 == 0) goto L_0x00d0
            L_0x00c3:
                if (r9 == 0) goto L_0x00ce
                android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.HARDWARE
                if (r9 != r15) goto L_0x00cb
                r15 = r6
                goto L_0x00cc
            L_0x00cb:
                r15 = r8
            L_0x00cc:
                if (r15 == 0) goto L_0x00d0
            L_0x00ce:
                android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            L_0x00d0:
                boolean r15 = r3.f9201g
                if (r15 == 0) goto L_0x00e4
                android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
                if (r9 != r15) goto L_0x00e4
                java.lang.String r15 = r0.outMimeType
                java.lang.String r7 = "image/jpeg"
                boolean r7 = sf.j.a(r15, r7)
                if (r7 == 0) goto L_0x00e4
                android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565
            L_0x00e4:
                android.graphics.Bitmap$Config r7 = r0.outConfig
                android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.RGBA_F16
                if (r7 != r15) goto L_0x00f0
                android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.HARDWARE
                if (r9 == r7) goto L_0x00f0
                android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGBA_F16
            L_0x00f0:
                r0.inPreferredConfig = r9
                y3.k$a r4 = r4.c()
                boolean r7 = r4 instanceof y3.l
                int r9 = r13.f17152b
                android.content.Context r13 = r3.f9195a
                i4.e r15 = r3.f9198d
                if (r7 == 0) goto L_0x0125
                boolean r7 = e9.c.h(r15)
                if (r7 == 0) goto L_0x0125
                r0.inSampleSize = r6
                r0.inScaled = r6
                y3.l r4 = (y3.l) r4
                int r3 = r4.f17162a
                r0.inDensity = r3
                android.content.res.Resources r3 = r13.getResources()
                android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
                int r3 = r3.densityDpi
                r0.inTargetDensity = r3
                r18 = r9
                r4 = r11
                r20 = r13
                r2 = r14
                r9 = r8
                goto L_0x020b
            L_0x0125:
                int r4 = r0.outWidth
                if (r4 <= 0) goto L_0x01ff
                int r7 = r0.outHeight
                if (r7 > 0) goto L_0x0136
                r3 = r6
                r18 = r9
                r4 = r11
                r20 = r13
                r2 = r14
                goto L_0x0206
            L_0x0136:
                if (r9 == r10) goto L_0x013e
                if (r9 != r12) goto L_0x013b
                goto L_0x013e
            L_0x013b:
                r16 = r8
                goto L_0x0140
            L_0x013e:
                r16 = r6
            L_0x0140:
                if (r16 == 0) goto L_0x0144
                r8 = r7
                goto L_0x0145
            L_0x0144:
                r8 = r4
            L_0x0145:
                if (r9 == r10) goto L_0x014d
                if (r9 != r12) goto L_0x014a
                goto L_0x014d
            L_0x014a:
                r17 = 0
                goto L_0x014f
            L_0x014d:
                r17 = r6
            L_0x014f:
                if (r17 == 0) goto L_0x0152
                goto L_0x0153
            L_0x0152:
                r4 = r7
            L_0x0153:
                boolean r7 = e9.c.h(r15)
                int r12 = r3.f9199e
                if (r7 == 0) goto L_0x015d
                r7 = r8
                goto L_0x0163
            L_0x015d:
                i4.a r7 = r15.f9573a
                int r7 = m4.c.d(r7, r12)
            L_0x0163:
                boolean r18 = e9.c.h(r15)
                if (r18 == 0) goto L_0x016b
                r15 = r4
                goto L_0x0171
            L_0x016b:
                i4.a r15 = r15.f9574b
                int r15 = m4.c.d(r15, r12)
            L_0x0171:
                int r18 = r8 / r7
                int r10 = java.lang.Integer.highestOneBit(r18)
                int r18 = r4 / r15
                int r6 = java.lang.Integer.highestOneBit(r18)
                int r2 = q.g.c(r12)
                if (r2 == 0) goto L_0x0193
                r18 = r9
                r9 = 1
                if (r2 != r9) goto L_0x018d
                int r2 = java.lang.Math.max(r10, r6)
                goto L_0x019a
            L_0x018d:
                ff.e r0 = new ff.e
                r0.<init>()
                throw r0
            L_0x0193:
                r18 = r9
                r9 = 1
                int r2 = java.lang.Math.min(r10, r6)
            L_0x019a:
                if (r2 >= r9) goto L_0x019d
                r2 = 1
            L_0x019d:
                r0.inSampleSize = r2
                double r8 = (double) r8
                r6 = r11
                double r10 = (double) r2
                double r8 = r8 / r10
                r20 = r13
                r2 = r14
                double r13 = (double) r4
                double r13 = r13 / r10
                double r10 = (double) r7
                r4 = r6
                double r6 = (double) r15
                double r10 = r10 / r8
                double r6 = r6 / r13
                int r8 = q.g.c(r12)
                if (r8 == 0) goto L_0x01c1
                r9 = 1
                if (r8 != r9) goto L_0x01bb
                double r6 = java.lang.Math.min(r10, r6)
                goto L_0x01c5
            L_0x01bb:
                ff.e r0 = new ff.e
                r0.<init>()
                throw r0
            L_0x01c1:
                double r6 = java.lang.Math.max(r10, r6)
            L_0x01c5:
                boolean r3 = r3.f9200f
                r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                if (r3 == 0) goto L_0x01d0
                int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r3 <= 0) goto L_0x01d0
                r6 = r8
            L_0x01d0:
                int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r3 != 0) goto L_0x01d8
                r3 = 1
                r19 = 1
                goto L_0x01db
            L_0x01d8:
                r3 = 1
                r19 = 0
            L_0x01db:
                r10 = r19 ^ 1
                r0.inScaled = r10
                if (r10 == 0) goto L_0x01fd
                int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r8 = 2147483647(0x7fffffff, float:NaN)
                if (r3 <= 0) goto L_0x01f3
                double r9 = (double) r8
                double r9 = r9 / r6
                int r3 = q4.a.f(r9)
                r0.inDensity = r3
                r0.inTargetDensity = r8
                goto L_0x01fd
            L_0x01f3:
                r0.inDensity = r8
                double r8 = (double) r8
                double r8 = r8 * r6
                int r3 = q4.a.f(r8)
                r0.inTargetDensity = r3
            L_0x01fd:
                r9 = 0
                goto L_0x020b
            L_0x01ff:
                r18 = r9
                r4 = r11
                r20 = r13
                r2 = r14
                r3 = r6
            L_0x0206:
                r0.inSampleSize = r3
                r9 = 0
                r0.inScaled = r9
            L_0x020b:
                wg.c0$a r3 = new wg.c0$a     // Catch:{ all -> 0x0305 }
                r3.<init>(r5)     // Catch:{ all -> 0x0305 }
                r6 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3, r6, r0)     // Catch:{ all -> 0x0305 }
                e9.c.c(r5, r6)
                java.lang.Exception r1 = r1.f17139b
                if (r1 != 0) goto L_0x0304
                if (r3 == 0) goto L_0x02f8
                android.content.res.Resources r1 = r20.getResources()
                android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
                int r1 = r1.densityDpi
                r3.setDensity(r1)
                if (r2 != 0) goto L_0x0236
                if (r4 <= 0) goto L_0x0231
                r1 = 1
                goto L_0x0232
            L_0x0231:
                r1 = r9
            L_0x0232:
                if (r1 != 0) goto L_0x0236
                goto L_0x02dc
            L_0x0236:
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                int r5 = r3.getWidth()
                float r5 = (float) r5
                r6 = 1073741824(0x40000000, float:2.0)
                float r5 = r5 / r6
                int r7 = r3.getHeight()
                float r7 = (float) r7
                float r7 = r7 / r6
                if (r2 == 0) goto L_0x0252
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r6 = 1065353216(0x3f800000, float:1.0)
                r1.postScale(r2, r6, r5, r7)
            L_0x0252:
                if (r4 <= 0) goto L_0x0256
                r2 = 1
                goto L_0x0257
            L_0x0256:
                r2 = r9
            L_0x0257:
                if (r2 == 0) goto L_0x025d
                float r2 = (float) r4
                r1.postRotate(r2, r5, r7)
            L_0x025d:
                android.graphics.RectF r2 = new android.graphics.RectF
                int r4 = r3.getWidth()
                float r4 = (float) r4
                int r5 = r3.getHeight()
                float r5 = (float) r5
                r6 = 0
                r2.<init>(r6, r6, r4, r5)
                r1.mapRect(r2)
                float r4 = r2.left
                int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x0278
                r5 = 1
                goto L_0x0279
            L_0x0278:
                r5 = r9
            L_0x0279:
                if (r5 == 0) goto L_0x0286
                float r5 = r2.top
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x0283
                r5 = 1
                goto L_0x0284
            L_0x0283:
                r5 = r9
            L_0x0284:
                if (r5 != 0) goto L_0x028d
            L_0x0286:
                float r4 = -r4
                float r2 = r2.top
                float r2 = -r2
                r1.postTranslate(r4, r2)
            L_0x028d:
                r4 = r18
                r2 = 90
                if (r4 == r2) goto L_0x029a
                r2 = 270(0x10e, float:3.78E-43)
                if (r4 != r2) goto L_0x0298
                goto L_0x029a
            L_0x0298:
                r2 = r9
                goto L_0x029b
            L_0x029a:
                r2 = 1
            L_0x029b:
                java.lang.String r4 = "createBitmap(width, height, config)"
                if (r2 == 0) goto L_0x02b7
                int r2 = r3.getHeight()
                int r5 = r3.getWidth()
                android.graphics.Bitmap$Config r6 = r3.getConfig()
                if (r6 != 0) goto L_0x02af
                android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            L_0x02af:
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r5, r6)
                sf.j.e(r2, r4)
                goto L_0x02ce
            L_0x02b7:
                int r2 = r3.getWidth()
                int r5 = r3.getHeight()
                android.graphics.Bitmap$Config r6 = r3.getConfig()
                if (r6 != 0) goto L_0x02c7
                android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            L_0x02c7:
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r5, r6)
                sf.j.e(r2, r4)
            L_0x02ce:
                android.graphics.Canvas r4 = new android.graphics.Canvas
                r4.<init>(r2)
                android.graphics.Paint r5 = y3.h.f17155a
                r4.drawBitmap(r3, r1, r5)
                r3.recycle()
                r3 = r2
            L_0x02dc:
                y3.d r1 = new y3.d
                android.content.res.Resources r2 = r20.getResources()
                android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
                r4.<init>(r2, r3)
                int r2 = r0.inSampleSize
                r3 = 1
                if (r2 > r3) goto L_0x02f3
                boolean r0 = r0.inScaled
                if (r0 == 0) goto L_0x02f1
                goto L_0x02f3
            L_0x02f1:
                r6 = r9
                goto L_0x02f4
            L_0x02f3:
                r6 = r3
            L_0x02f4:
                r1.<init>(r4, r6)
                return r1
            L_0x02f8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0304:
                throw r1
            L_0x0305:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x0308 }
            L_0x0308:
                r0 = move-exception
                r2 = r0
                e9.c.c(r5, r1)
                throw r2
            L_0x030e:
                throw r9
            L_0x030f:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y3.b.d.d():java.lang.Object");
        }
    }

    public b(k kVar, l lVar, g gVar, int i8) {
        this.f17135a = kVar;
        this.f17136b = lVar;
        this.f17137c = gVar;
        this.f17138d = i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(jf.d<? super y3.d> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof y3.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            y3.b$c r0 = (y3.b.c) r0
            int r1 = r0.f17146e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17146e = r1
            goto L_0x0018
        L_0x0013:
            y3.b$c r0 = new y3.b$c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f17144c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f17146e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.f17142a
            kotlinx.coroutines.sync.f r0 = (kotlinx.coroutines.sync.f) r0
            cb.b.J(r7)     // Catch:{ all -> 0x002e }
            goto L_0x0070
        L_0x002e:
            r7 = move-exception
            goto L_0x0076
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0038:
            kotlinx.coroutines.sync.f r2 = r0.f17143b
            java.lang.Object r4 = r0.f17142a
            y3.b r4 = (y3.b) r4
            cb.b.J(r7)
            goto L_0x0055
        L_0x0042:
            cb.b.J(r7)
            r0.f17142a = r6
            kotlinx.coroutines.sync.f r2 = r6.f17137c
            r0.f17143b = r2
            r0.f17146e = r4
            java.lang.Object r7 = r2.b(r0)
            if (r7 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r4 = r6
        L_0x0055:
            y3.b$d r7 = new y3.b$d     // Catch:{ all -> 0x0078 }
            r7.<init>(r4)     // Catch:{ all -> 0x0078 }
            r0.f17142a = r2     // Catch:{ all -> 0x0078 }
            r4 = 0
            r0.f17143b = r4     // Catch:{ all -> 0x0078 }
            r0.f17146e = r3     // Catch:{ all -> 0x0078 }
            jf.g r3 = jf.g.f10014a     // Catch:{ all -> 0x0078 }
            ag.j1 r5 = new ag.j1     // Catch:{ all -> 0x0078 }
            r5.<init>(r7, r4)     // Catch:{ all -> 0x0078 }
            java.lang.Object r7 = cb.b.M(r3, r5, r0)     // Catch:{ all -> 0x0078 }
            if (r7 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r0 = r2
        L_0x0070:
            y3.d r7 = (y3.d) r7     // Catch:{ all -> 0x002e }
            r0.a()
            return r7
        L_0x0076:
            r2 = r0
            goto L_0x0079
        L_0x0078:
            r7 = move-exception
        L_0x0079:
            r2.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.b.a(jf.d):java.lang.Object");
    }
}
