package s1;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public final class n extends t {

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f14507b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f14508c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14509d;

    public static class a {
        public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            return bigPictureStyle.bigPicture(bitmap);
        }

        public static Notification.BigPictureStyle b(Notification.Builder builder) {
            return new Notification.BigPictureStyle(builder);
        }

        public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            return bigPictureStyle.setBigContentTitle(charSequence);
        }

        public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    public final void b(u uVar) {
        Bitmap bitmap;
        u uVar2 = uVar;
        int i8 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle c3 = a.c(a.b(uVar2.f14532b), (CharSequence) null);
        IconCompat iconCompat = this.f14507b;
        Context context = uVar2.f14531a;
        if (iconCompat != null) {
            if (i8 >= 31) {
                c.a(c3, IconCompat.a.f(iconCompat, context));
            } else {
                int i10 = iconCompat.f1741a;
                if (i10 == -1) {
                    i10 = IconCompat.a.c(iconCompat.f1742b);
                }
                if (i10 == 1) {
                    IconCompat iconCompat2 = this.f14507b;
                    int i11 = iconCompat2.f1741a;
                    if (i11 == -1) {
                        Object obj = iconCompat2.f1742b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i11 == 1) {
                        bitmap = (Bitmap) iconCompat2.f1742b;
                    } else if (i11 == 5) {
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f1742b;
                        int min = (int) (((float) Math.min(bitmap2.getWidth(), bitmap2.getHeight())) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f10 = (float) min;
                        float f11 = 0.5f * f10;
                        float f12 = 0.9166667f * f11;
                        float f13 = 0.010416667f * f10;
                        paint.setColor(0);
                        paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate(((float) (-(bitmap2.getWidth() - min))) / 2.0f, ((float) (-(bitmap2.getHeight() - min))) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f11, f11, f12, paint);
                        canvas.setBitmap((Bitmap) null);
                        bitmap = createBitmap;
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    c3 = a.a(c3, bitmap);
                }
            }
        }
        if (this.f14509d) {
            IconCompat iconCompat3 = this.f14508c;
            if (iconCompat3 == null) {
                a.d(c3, (Bitmap) null);
            } else {
                b.a(c3, IconCompat.a.f(iconCompat3, context));
            }
        }
        if (i8 >= 31) {
            c.c(c3, false);
            c.b(c3, (CharSequence) null);
        }
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
