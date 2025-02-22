package ac;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f288a;

    /* renamed from: b  reason: collision with root package name */
    public final float f289b;

    /* renamed from: c  reason: collision with root package name */
    public final float f290c;

    /* renamed from: d  reason: collision with root package name */
    public final float f291d;

    /* renamed from: e  reason: collision with root package name */
    public final int f292e;

    /* renamed from: f  reason: collision with root package name */
    public final PointF f293f;

    static {
        new Matrix();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0064, code lost:
        r1 = r6 - r8;
        r6 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        r6 = r6 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        r0.x = r1;
        r0.y = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(int r6, com.lassi.presentation.cropper.e r7, float r8, float r9) {
        /*
            r5 = this;
            r5.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r5.f293f = r0
            r5.f292e = r6
            float r1 = r7.f6636c
            float r2 = r7.f6640g
            float r3 = r7.f6644k
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            r5.f288a = r1
            float r1 = r7.f6637d
            float r2 = r7.f6641h
            float r3 = r7.f6645l
            float r2 = r2 / r3
            float r1 = java.lang.Math.max(r1, r2)
            r5.f289b = r1
            float r1 = r7.f6638e
            float r2 = r7.f6642i
            float r3 = r7.f6644k
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            r5.f290c = r1
            float r1 = r7.f6639f
            float r2 = r7.f6643j
            float r3 = r7.f6645l
            float r2 = r2 / r3
            float r1 = java.lang.Math.min(r1, r2)
            r5.f291d = r1
            android.graphics.RectF r7 = r7.a()
            if (r6 == 0) goto L_0x008a
            int r6 = r6 + -1
            r1 = 0
            switch(r6) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0077;
                case 2: goto L_0x0070;
                case 3: goto L_0x0069;
                case 4: goto L_0x0062;
                case 5: goto L_0x005f;
                case 6: goto L_0x005c;
                case 7: goto L_0x0059;
                case 8: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            r6 = r1
            goto L_0x0085
        L_0x004e:
            float r6 = r7.centerX()
            float r1 = r6 - r8
            float r6 = r7.centerY()
            goto L_0x0084
        L_0x0059:
            float r6 = r7.bottom
            goto L_0x0084
        L_0x005c:
            float r6 = r7.right
            goto L_0x0064
        L_0x005f:
            float r6 = r7.top
            goto L_0x0084
        L_0x0062:
            float r6 = r7.left
        L_0x0064:
            float r6 = r6 - r8
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x0085
        L_0x0069:
            float r6 = r7.right
            float r1 = r6 - r8
            float r6 = r7.bottom
            goto L_0x0084
        L_0x0070:
            float r6 = r7.left
            float r1 = r6 - r8
            float r6 = r7.bottom
            goto L_0x0084
        L_0x0077:
            float r6 = r7.right
            float r1 = r6 - r8
            float r6 = r7.top
            goto L_0x0084
        L_0x007e:
            float r6 = r7.left
            float r1 = r6 - r8
            float r6 = r7.top
        L_0x0084:
            float r6 = r6 - r9
        L_0x0085:
            r0.x = r1
            r0.y = r6
            return
        L_0x008a:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.d.<init>(int, com.lassi.presentation.cropper.e, float, float):void");
    }

    public static void c(RectF rectF, RectF rectF2, float f10) {
        rectF.inset((rectF.width() - (rectF.height() * f10)) / 2.0f, 0.0f);
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.right;
        float f14 = rectF2.right;
        if (f13 > f14) {
            rectF.offset(f14 - f13, 0.0f);
        }
    }

    public static void f(RectF rectF, RectF rectF2, float f10) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f10)) / 2.0f);
        float f11 = rectF.top;
        float f12 = rectF2.top;
        if (f11 < f12) {
            rectF.offset(0.0f, f12 - f11);
        }
        float f13 = rectF.bottom;
        float f14 = rectF2.bottom;
        if (f13 > f14) {
            rectF.offset(0.0f, f14 - f13);
        }
    }

    public final void a(RectF rectF, float f10, RectF rectF2, int i8, float f11, float f12, boolean z10, boolean z11) {
        float f13 = (float) i8;
        int i10 = (f10 > f13 ? 1 : (f10 == f13 ? 0 : -1));
        PointF pointF = this.f293f;
        if (i10 > 0) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            pointF.y -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.bottom;
        if (f10 > f14) {
            pointF.y -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.top;
        float f16 = this.f289b;
        if (f10 - f15 < f16) {
            f10 = f15 + f16;
        }
        float f17 = this.f291d;
        if (f10 - f15 > f17) {
            f10 = f15 + f17;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f18 = (f10 - f15) * f12;
            float f19 = this.f288a;
            if (f18 < f19) {
                f10 = Math.min(f14, (f19 / f12) + f15);
                f18 = (f10 - rectF.top) * f12;
            }
            float f20 = this.f290c;
            if (f18 > f20) {
                f10 = Math.min(rectF2.bottom, (f20 / f12) + rectF.top);
                f18 = (f10 - rectF.top) * f12;
            }
            if (!z10 || !z11) {
                if (z10) {
                    float f21 = rectF.right;
                    float f22 = rectF2.left;
                    if (f21 - f18 < f22) {
                        f10 = Math.min(rectF2.bottom, ((f21 - f22) / f12) + rectF.top);
                        f18 = (f10 - rectF.top) * f12;
                    }
                }
                if (z11) {
                    float f23 = rectF.left;
                    float f24 = rectF2.right;
                    if (f18 + f23 > f24) {
                        f10 = Math.min(f10, Math.min(rectF2.bottom, ((f24 - f23) / f12) + rectF.top));
                    }
                }
            } else {
                f10 = Math.min(f10, Math.min(rectF2.bottom, (rectF2.width() / f12) + rectF.top));
            }
        }
        rectF.bottom = f10;
    }

    public final void b(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z10, boolean z11) {
        int i8 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        PointF pointF = this.f293f;
        if (i8 < 0) {
            f10 /= 1.05f;
            pointF.x -= f10 / 1.1f;
        }
        float f13 = rectF2.left;
        if (f10 < f13) {
            pointF.x -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.right;
        float f15 = this.f288a;
        if (f14 - f10 < f15) {
            f10 = f14 - f15;
        }
        float f16 = this.f290c;
        if (f14 - f10 > f16) {
            f10 = f14 - f16;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f17 = (f14 - f10) / f12;
            float f18 = this.f289b;
            if (f17 < f18) {
                f10 = Math.max(f13, f14 - (f18 * f12));
                f17 = (rectF.right - f10) / f12;
            }
            float f19 = this.f291d;
            if (f17 > f19) {
                f10 = Math.max(rectF2.left, rectF.right - (f19 * f12));
                f17 = (rectF.right - f10) / f12;
            }
            if (!z10 || !z11) {
                if (z10) {
                    float f20 = rectF.bottom;
                    float f21 = rectF2.top;
                    if (f20 - f17 < f21) {
                        f10 = Math.max(rectF2.left, rectF.right - ((f20 - f21) * f12));
                        f17 = (rectF.right - f10) / f12;
                    }
                }
                if (z11) {
                    float f22 = rectF.top;
                    float f23 = rectF2.bottom;
                    if (f17 + f22 > f23) {
                        f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - ((f23 - f22) * f12)));
                    }
                }
            } else {
                f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - (rectF2.height() * f12)));
            }
        }
        rectF.left = f10;
    }

    public final void d(RectF rectF, float f10, RectF rectF2, int i8, float f11, float f12, boolean z10, boolean z11) {
        float f13 = (float) i8;
        int i10 = (f10 > f13 ? 1 : (f10 == f13 ? 0 : -1));
        PointF pointF = this.f293f;
        if (i10 > 0) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            pointF.x -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.right;
        if (f10 > f14) {
            pointF.x -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.left;
        float f16 = this.f288a;
        if (f10 - f15 < f16) {
            f10 = f15 + f16;
        }
        float f17 = this.f290c;
        if (f10 - f15 > f17) {
            f10 = f15 + f17;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f18 = (f10 - f15) / f12;
            float f19 = this.f289b;
            if (f18 < f19) {
                f10 = Math.min(f14, (f19 * f12) + f15);
                f18 = (f10 - rectF.left) / f12;
            }
            float f20 = this.f291d;
            if (f18 > f20) {
                f10 = Math.min(rectF2.right, (f20 * f12) + rectF.left);
                f18 = (f10 - rectF.left) / f12;
            }
            if (!z10 || !z11) {
                if (z10) {
                    float f21 = rectF.bottom;
                    float f22 = rectF2.top;
                    if (f21 - f18 < f22) {
                        f10 = Math.min(rectF2.right, ((f21 - f22) * f12) + rectF.left);
                        f18 = (f10 - rectF.left) / f12;
                    }
                }
                if (z11) {
                    float f23 = rectF.top;
                    float f24 = rectF2.bottom;
                    if (f18 + f23 > f24) {
                        f10 = Math.min(f10, Math.min(rectF2.right, ((f24 - f23) * f12) + rectF.left));
                    }
                }
            } else {
                f10 = Math.min(f10, Math.min(rectF2.right, (rectF2.height() * f12) + rectF.left));
            }
        }
        rectF.right = f10;
    }

    public final void e(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z10, boolean z11) {
        int i8 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        PointF pointF = this.f293f;
        if (i8 < 0) {
            f10 /= 1.05f;
            pointF.y -= f10 / 1.1f;
        }
        float f13 = rectF2.top;
        if (f10 < f13) {
            pointF.y -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.bottom;
        float f15 = this.f289b;
        if (f14 - f10 < f15) {
            f10 = f14 - f15;
        }
        float f16 = this.f291d;
        if (f14 - f10 > f16) {
            f10 = f14 - f16;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f17 = (f14 - f10) * f12;
            float f18 = this.f288a;
            if (f17 < f18) {
                f10 = Math.max(f13, f14 - (f18 / f12));
                f17 = (rectF.bottom - f10) * f12;
            }
            float f19 = this.f290c;
            if (f17 > f19) {
                f10 = Math.max(rectF2.top, rectF.bottom - (f19 / f12));
                f17 = (rectF.bottom - f10) * f12;
            }
            if (!z10 || !z11) {
                if (z10) {
                    float f20 = rectF.right;
                    float f21 = rectF2.left;
                    if (f20 - f17 < f21) {
                        f10 = Math.max(rectF2.top, rectF.bottom - ((f20 - f21) / f12));
                        f17 = (rectF.bottom - f10) * f12;
                    }
                }
                if (z11) {
                    float f22 = rectF.left;
                    float f23 = rectF2.right;
                    if (f17 + f22 > f23) {
                        f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - ((f23 - f22) / f12)));
                    }
                }
            } else {
                f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f12)));
            }
        }
        rectF.top = f10;
    }
}
