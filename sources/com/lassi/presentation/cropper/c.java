package com.lassi.presentation.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f6599a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public static final RectF f6600b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public static final String f6601c = c.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public static final RectF f6602d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f6603e = new float[6];

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f6604f = new float[6];

    /* renamed from: g  reason: collision with root package name */
    public static Pair<String, WeakReference<Bitmap>> f6605g;

    /* renamed from: h  reason: collision with root package name */
    public static int f6606h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6607a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6608b;

        public a(Bitmap bitmap, int i8) {
            this.f6607a = bitmap;
            this.f6608b = i8;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6609a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6610b;

        public b(Bitmap bitmap, int i8) {
            this.f6609a = bitmap;
            this.f6610b = i8;
        }
    }

    public static int a(int i8, int i10) {
        int i11 = 1;
        if (f6606h == 0) {
            int i12 = 2048;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
                int i13 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i13];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i13, iArr);
                int[] iArr2 = new int[1];
                int i14 = 0;
                for (int i15 = 0; i15 < iArr[0]; i15++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i15], 12332, iArr2);
                    int i16 = iArr2[0];
                    if (i14 < i16) {
                        i14 = i16;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i12 = Math.max(i14, 2048);
            } catch (Exception e10) {
                e10.toString();
                j.f(f6601c, "tag");
            }
            f6606h = i12;
        }
        if (f6606h > 0) {
            while (true) {
                int i17 = i10 / i11;
                int i18 = f6606h;
                if (i17 <= i18 && i8 / i11 <= i18) {
                    break;
                }
                i11 *= 2;
            }
        }
        return i11;
    }

    public static int b(int i8, int i10, int i11, int i12) {
        int i13 = 1;
        if (i10 > i12 || i8 > i11) {
            while ((i10 / 2) / i13 > i12 && (i8 / 2) / i13 > i11) {
                i13 *= 2;
            }
        }
        return i13;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                new StringBuilder("closeSafe >> ").append(e10);
                j.f(f6601c, "tag");
            }
        }
    }

    public static a d(Context context, Uri uri, float[] fArr, int i8, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, boolean z11, boolean z12) {
        OutOfMemoryError outOfMemoryError;
        int i16 = 1;
        do {
            try {
                return e(context, uri, fArr, i8, i10, i11, z10, i12, i13, i14, i15, z11, z12, i16);
            } catch (OutOfMemoryError e10) {
                outOfMemoryError = e10;
                new StringBuilder("cropBitmap >> ").append(outOfMemoryError);
                j.f(f6601c, "tag");
                i16 *= 2;
                if (i16 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i16 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
                }
            }
        } while (i16 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i16 + "): " + uri + "\r\n" + outOfMemoryError.getMessage(), outOfMemoryError);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0124, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0126, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:65:0x0113, B:72:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7 A[SYNTHETIC, Splitter:B:53:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0124 A[ExcHandler: Exception (e java.lang.Exception), PHI: r3 r4 
      PHI: (r3v9 java.lang.String) = (r3v10 java.lang.String), (r3v13 java.lang.String), (r3v13 java.lang.String) binds: [B:72:0x0120, B:65:0x0113, B:66:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v6 java.lang.String) = (r4v7 java.lang.String), (r4v10 java.lang.String), (r4v10 java.lang.String) binds: [B:72:0x0120, B:65:0x0113, B:66:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:65:0x0113] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.lassi.presentation.cropper.c.a e(android.content.Context r18, android.net.Uri r19, float[] r20, int r21, int r22, int r23, boolean r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, int r31) {
        /*
            r7 = r19
            r8 = r20
            r10 = r21
            java.lang.String r9 = "cropBitmap >> "
            java.lang.String r15 = "tag"
            java.lang.String r14 = f6601c
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            android.graphics.Rect r11 = n(r1, r2, r3, r4, r5, r6)
            if (r27 <= 0) goto L_0x0021
            r12 = r27
            goto L_0x0026
        L_0x0021:
            int r0 = r11.width()
            r12 = r0
        L_0x0026:
            if (r28 <= 0) goto L_0x002b
            r13 = r28
            goto L_0x0030
        L_0x002b:
            int r0 = r11.height()
            r13 = r0
        L_0x0030:
            r17 = 0
            r1 = r18
            r2 = r19
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r31
            com.lassi.presentation.cropper.c$a r0 = k(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0046 }
            android.graphics.Bitmap r1 = r0.f6607a     // Catch:{ Exception -> 0x0046 }
            int r0 = r0.f6608b     // Catch:{ Exception -> 0x0044 }
            goto L_0x0055
        L_0x0044:
            r0 = move-exception
            goto L_0x0049
        L_0x0046:
            r0 = move-exception
            r1 = r17
        L_0x0049:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r9)
            r2.append(r0)
            sf.j.f(r14, r15)
            r0 = 1
        L_0x0055:
            r6 = r1
            if (r6 == 0) goto L_0x00c7
            if (r10 > 0) goto L_0x0061
            if (r29 != 0) goto L_0x0061
            if (r30 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r12 = r6
            goto L_0x0096
        L_0x0061:
            android.graphics.Matrix r7 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x00b3 }
            r7.<init>()     // Catch:{ OutOfMemoryError -> 0x00b3 }
            float r1 = (float) r10     // Catch:{ OutOfMemoryError -> 0x00b3 }
            r7.setRotate(r1)     // Catch:{ OutOfMemoryError -> 0x00b3 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r29 == 0) goto L_0x0072
            r3 = r1
            goto L_0x0073
        L_0x0072:
            r3 = r2
        L_0x0073:
            if (r30 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r2
        L_0x0077:
            r7.postScale(r3, r1)     // Catch:{ OutOfMemoryError -> 0x00b3 }
            r2 = 0
            r3 = 0
            int r4 = r6.getWidth()     // Catch:{ OutOfMemoryError -> 0x00b3 }
            int r5 = r6.getHeight()     // Catch:{ OutOfMemoryError -> 0x00b3 }
            r12 = 0
            r1 = r6
            r13 = r6
            r6 = r7
            r7 = r12
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0093 }
            if (r1 == r13) goto L_0x0095
            r13.recycle()     // Catch:{ OutOfMemoryError -> 0x0093 }
            goto L_0x0095
        L_0x0093:
            r0 = move-exception
            goto L_0x00b5
        L_0x0095:
            r12 = r1
        L_0x0096:
            int r1 = r10 % 90
            if (r1 == 0) goto L_0x00aa
            r1 = r12
            r2 = r20
            r3 = r11
            r4 = r21
            r5 = r24
            r6 = r25
            r7 = r26
            android.graphics.Bitmap r12 = h(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x00b0 }
        L_0x00aa:
            com.lassi.presentation.cropper.c$a r1 = new com.lassi.presentation.cropper.c$a
            r1.<init>(r12, r0)
            return r1
        L_0x00b0:
            r0 = move-exception
            r6 = r12
            goto L_0x00b6
        L_0x00b3:
            r0 = move-exception
            r13 = r6
        L_0x00b5:
            r6 = r13
        L_0x00b6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r0)
            sf.j.f(r14, r15)
            if (r6 == 0) goto L_0x00c6
            r6.recycle()
        L_0x00c6:
            throw r0
        L_0x00c7:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            int r1 = r11.width()     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            int r2 = r11.height()     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            int r1 = b(r1, r2, r12, r13)     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            int r1 = r1 * r31
            r0.inSampleSize = r1     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            android.graphics.Bitmap r2 = i(r2, r7, r0)     // Catch:{ OutOfMemoryError -> 0x0159, Exception -> 0x0130 }
            if (r2 == 0) goto L_0x0128
            int r3 = r8.length     // Catch:{ all -> 0x011d }
            float[] r9 = new float[r3]     // Catch:{ all -> 0x011d }
            int r4 = r8.length     // Catch:{ all -> 0x011d }
            r5 = 0
            java.lang.System.arraycopy(r8, r5, r9, r5, r4)     // Catch:{ all -> 0x011d }
        L_0x00ee:
            if (r5 >= r3) goto L_0x00fb
            r4 = r9[r5]     // Catch:{ all -> 0x011d }
            int r6 = r0.inSampleSize     // Catch:{ all -> 0x011d }
            float r6 = (float) r6     // Catch:{ all -> 0x011d }
            float r4 = r4 / r6
            r9[r5] = r4     // Catch:{ all -> 0x011d }
            int r5 = r5 + 1
            goto L_0x00ee
        L_0x00fb:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = r2
            r10 = r21
            r11 = r24
            r12 = r25
            r13 = r26
            r3 = r14
            r14 = r0
            r4 = r15
            r15 = r29
            r16 = r30
            android.graphics.Bitmap r5 = g(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x011b }
            if (r5 == r2) goto L_0x012a
            r2.recycle()     // Catch:{ OutOfMemoryError -> 0x0117, Exception -> 0x0124 }
            goto L_0x012a
        L_0x0117:
            r0 = move-exception
            r17 = r5
            goto L_0x015c
        L_0x011b:
            r0 = move-exception
            goto L_0x0120
        L_0x011d:
            r0 = move-exception
            r3 = r14
            r4 = r15
        L_0x0120:
            r2.recycle()     // Catch:{ OutOfMemoryError -> 0x0126, Exception -> 0x0124 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0126, Exception -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            goto L_0x0133
        L_0x0126:
            r0 = move-exception
            goto L_0x015c
        L_0x0128:
            r5 = r17
        L_0x012a:
            com.lassi.presentation.cropper.c$a r0 = new com.lassi.presentation.cropper.c$a
            r0.<init>(r5, r1)
            return r0
        L_0x0130:
            r0 = move-exception
            r3 = r14
            r4 = r15
        L_0x0133:
            r0.toString()
            sf.j.f(r3, r4)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load sampled bitmap: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = "\r\n"
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0159:
            r0 = move-exception
            r3 = r14
            r4 = r15
        L_0x015c:
            r0.toString()
            sf.j.f(r3, r4)
            if (r17 == 0) goto L_0x0167
            r17.recycle()
        L_0x0167:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.c.e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.lassi.presentation.cropper.c$a");
    }

    public static a f(Bitmap bitmap, float[] fArr, int i8, boolean z10, int i10, int i11, boolean z11, boolean z12) {
        int i12 = 1;
        do {
            try {
                return new a(g(bitmap, fArr, i8, z10, i10, i11, 1.0f / ((float) i12), z11, z12), i12);
            } catch (OutOfMemoryError e10) {
                new StringBuilder("cropBitmapObjectHandleOOM >> ").append(e10);
                j.f(f6601c, "tag");
                i12 *= 2;
                if (i12 > 8) {
                    throw e10;
                }
            }
        } while (i12 > 8);
        throw e10;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, int i8, boolean z10, int i10, int i11, float f10, boolean z11, boolean z12) {
        Bitmap bitmap2 = bitmap;
        int i12 = i8;
        float f11 = f10;
        Rect n2 = n(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i10, i11);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i12, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        float f12 = z11 ? -f11 : f11;
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, n2.left, n2.top, n2.width(), n2.height(), matrix, true);
        if (createBitmap == bitmap2) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i12 % 90 != 0 ? h(createBitmap, fArr, n2, i8, z10, i10, i11) : createBitmap;
    }

    public static Bitmap h(Bitmap bitmap, float[] fArr, Rect rect, int i8, boolean z10, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i8 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i8);
        int i15 = (i8 < 90 || (i8 > 180 && i8 < 270)) ? rect.left : rect.right;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i17 >= fArr.length) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
                break;
            }
            float f10 = fArr[i17];
            if (f10 >= ((float) (i15 - 1)) && f10 <= ((float) (i15 + 1))) {
                int i18 = i17 + 1;
                int abs = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i18])));
                int abs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i18] - ((float) rect.top))));
                int abs3 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i18])) / Math.cos(radians));
                i14 = abs2;
                i13 = abs3;
                i12 = abs;
                i16 = (int) Math.abs(((double) (fArr[i18] - ((float) rect.top))) / Math.sin(radians));
                break;
            }
            i17 += 2;
        }
        rect.set(i12, i14, i16 + i12, i13 + i14);
        if (z10) {
            l(rect, i10, i11);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX INFO: finally extract failed */
    public static Bitmap i(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            try {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, f6599a, options);
                c(openInputStream);
                return decodeStream;
            } catch (OutOfMemoryError e10) {
                options.inSampleSize *= 2;
                String str = f6601c;
                e10.toString();
                j.f(str, "tag");
                c((Closeable) null);
                if (options.inSampleSize > 512) {
                    throw new RuntimeException("Failed to decode image: " + uri);
                }
            } catch (Throwable th) {
                c((Closeable) null);
                throw th;
            }
        } while (options.inSampleSize > 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    public static a j(Context context, Uri uri, int i8, int i10) {
        InputStream inputStream;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, f6599a, options);
                    options.inJustDecodeBounds = false;
                    c(inputStream);
                    int i11 = options.outWidth;
                    if (i11 == -1) {
                        if (options.outHeight == -1) {
                            throw new RuntimeException("File is not a picture");
                        }
                    }
                    options.inSampleSize = Math.max(b(i11, options.outHeight, i8, i10), a(options.outWidth, options.outHeight));
                    return new a(i(contentResolver, uri, options), options.inSampleSize);
                } catch (Throwable th) {
                    th = th;
                    c(inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                c(inputStream);
                throw th;
            }
        } catch (Exception e10) {
            new StringBuilder("decodeSampledBitmap >> ").append(e10);
            j.f(f6601c, "tag");
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e10.getMessage(), e10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.lassi.presentation.cropper.c.a k(android.content.Context r7, android.net.Uri r8, android.graphics.Rect r9, int r10, int r11, int r12) {
        /*
            java.lang.String r0 = "tag"
            java.lang.String r1 = f6601c
            r2 = 0
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            r3.<init>()     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            int r4 = r9.width()     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            int r5 = r9.height()     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            int r10 = b(r4, r5, r10, r11)     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            int r12 = r12 * r10
            r3.inSampleSize = r12     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            java.io.InputStream r7 = r7.openInputStream(r8)     // Catch:{ Exception -> 0x0070, all -> 0x006c }
            r10 = 0
            android.graphics.BitmapRegionDecoder r10 = android.graphics.BitmapRegionDecoder.newInstance(r7, r10)     // Catch:{ Exception -> 0x0067, all -> 0x0062 }
        L_0x0026:
            com.lassi.presentation.cropper.c$a r11 = new com.lassi.presentation.cropper.c$a     // Catch:{ OutOfMemoryError -> 0x003c }
            android.graphics.Bitmap r12 = r10.decodeRegion(r9, r3)     // Catch:{ OutOfMemoryError -> 0x003c }
            int r4 = r3.inSampleSize     // Catch:{ OutOfMemoryError -> 0x003c }
            r11.<init>(r12, r4)     // Catch:{ OutOfMemoryError -> 0x003c }
            c(r7)
            r10.recycle()
            return r11
        L_0x0038:
            r8 = move-exception
            goto L_0x005e
        L_0x003a:
            r9 = move-exception
            goto L_0x0060
        L_0x003c:
            r11 = move-exception
            int r12 = r3.inSampleSize     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            int r12 = r12 * 2
            r3.inSampleSize = r12     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            r11.toString()     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            sf.j.f(r1, r0)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            int r11 = r3.inSampleSize     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            r12 = 512(0x200, float:7.175E-43)
            if (r11 <= r12) goto L_0x0026
            c(r7)
            if (r10 == 0) goto L_0x0057
            r10.recycle()
        L_0x0057:
            com.lassi.presentation.cropper.c$a r7 = new com.lassi.presentation.cropper.c$a
            r8 = 1
            r7.<init>(r2, r8)
            return r7
        L_0x005e:
            r2 = r10
            goto L_0x0063
        L_0x0060:
            r2 = r10
            goto L_0x0068
        L_0x0062:
            r8 = move-exception
        L_0x0063:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L_0x009d
        L_0x0067:
            r9 = move-exception
        L_0x0068:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L_0x0073
        L_0x006c:
            r7 = move-exception
            r8 = r7
            r7 = r2
            goto L_0x009d
        L_0x0070:
            r7 = move-exception
            r9 = r7
            r7 = r2
        L_0x0073:
            r9.toString()     // Catch:{ all -> 0x009c }
            sf.j.f(r1, r0)     // Catch:{ all -> 0x009c }
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r11.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r12 = "Failed to load sampled bitmap: "
            r11.append(r12)     // Catch:{ all -> 0x009c }
            r11.append(r8)     // Catch:{ all -> 0x009c }
            java.lang.String r8 = "\r\n"
            r11.append(r8)     // Catch:{ all -> 0x009c }
            java.lang.String r8 = r9.getMessage()     // Catch:{ all -> 0x009c }
            r11.append(r8)     // Catch:{ all -> 0x009c }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x009c }
            r10.<init>(r8, r9)     // Catch:{ all -> 0x009c }
            throw r10     // Catch:{ all -> 0x009c }
        L_0x009c:
            r8 = move-exception
        L_0x009d:
            c(r2)
            if (r7 == 0) goto L_0x00a5
            r7.recycle()
        L_0x00a5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.c.k(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.lassi.presentation.cropper.c$a");
    }

    public static void l(Rect rect, int i8, int i10) {
        if (i8 == i10 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    public static float m(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Rect n(float[] fArr, int i8, int i10, boolean z10, int i11, int i12) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, o(fArr))), Math.round(Math.max(0.0f, q(fArr))), Math.round(Math.min((float) i8, p(fArr))), Math.round(Math.min((float) i10, m(fArr))));
        if (z10) {
            l(rect, i11, i12);
        }
        return rect;
    }

    public static float o(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Bitmap r(Bitmap bitmap, int i8, int i10, int i11) {
        Bitmap bitmap2;
        if (i8 > 0 && i10 > 0 && (i11 == 4 || i11 == 3 || i11 == 5)) {
            if (i11 == 5) {
                try {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, i8, i10, false);
                } catch (Exception e10) {
                    Log.e(f6601c, "Failed to resize cropped image, return bitmap before resize", e10);
                }
            } else {
                float width = (float) bitmap.getWidth();
                float height = (float) bitmap.getHeight();
                float max = Math.max(width / ((float) i8), height / ((float) i10));
                if (max <= 1.0f) {
                    if (i11 != 4) {
                        bitmap2 = null;
                    }
                }
                bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
            }
            if (bitmap2 != null) {
                if (bitmap2 != bitmap) {
                    bitmap.recycle();
                }
                return bitmap2;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.lassi.presentation.cropper.c.b s(android.content.Context r1, android.graphics.Bitmap r2, android.net.Uri r3) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0018 }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ Exception -> 0x0018 }
            if (r1 == 0) goto L_0x0023
            s2.a r3 = new s2.a     // Catch:{ Exception -> 0x0018 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0018 }
            r1.close()     // Catch:{ Exception -> 0x0015 }
            r0 = r3
            goto L_0x0023
        L_0x0015:
            r1 = move-exception
            r0 = r3
            goto L_0x0019
        L_0x0018:
            r1 = move-exception
        L_0x0019:
            r1.toString()
            java.lang.String r1 = "tag"
            java.lang.String r3 = f6601c
            sf.j.f(r3, r1)
        L_0x0023:
            r1 = 0
            if (r0 == 0) goto L_0x0043
            int r3 = r0.c()
            r0 = 3
            if (r3 == r0) goto L_0x003b
            r0 = 6
            if (r3 == r0) goto L_0x0038
            r0 = 8
            if (r3 == r0) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x003d
        L_0x0038:
            r1 = 90
            goto L_0x003d
        L_0x003b:
            r1 = 180(0xb4, float:2.52E-43)
        L_0x003d:
            com.lassi.presentation.cropper.c$b r3 = new com.lassi.presentation.cropper.c$b
            r3.<init>(r2, r1)
            goto L_0x0048
        L_0x0043:
            com.lassi.presentation.cropper.c$b r3 = new com.lassi.presentation.cropper.c$b
            r3.<init>(r2, r1)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cropper.c.s(android.content.Context, android.graphics.Bitmap, android.net.Uri):com.lassi.presentation.cropper.c$b");
    }
}
