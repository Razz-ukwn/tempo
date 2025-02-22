package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1740k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1741a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1742b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1743c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1744d;

    /* renamed from: e  reason: collision with root package name */
    public int f1745e;

    /* renamed from: f  reason: collision with root package name */
    public int f1746f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1747g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1748h;

    /* renamed from: i  reason: collision with root package name */
    public String f1749i;

    /* renamed from: j  reason: collision with root package name */
    public String f1750j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f1741a
                switch(r0) {
                    case -1: goto L_0x012f;
                    case 0: goto L_0x0005;
                    case 1: goto L_0x0116;
                    case 2: goto L_0x00d3;
                    case 3: goto L_0x00c6;
                    case 4: goto L_0x00bd;
                    case 5: goto L_0x00b4;
                    case 6: goto L_0x000d;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L_0x000d:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L_0x001d
                android.net.Uri r5 = r4.c()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto L_0x011e
            L_0x001d:
                if (r5 == 0) goto L_0x009c
                android.net.Uri r0 = r4.c()
                java.lang.String r1 = r0.getScheme()
                java.lang.String r2 = "content"
                boolean r2 = r2.equals(r1)
                java.lang.String r3 = "IconCompat"
                if (r2 != 0) goto L_0x005c
                java.lang.String r2 = "file"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L_0x003a
                goto L_0x005c
            L_0x003a:
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0049 }
                java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0049 }
                java.lang.Object r2 = r4.f1742b     // Catch:{ FileNotFoundException -> 0x0049 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ FileNotFoundException -> 0x0049 }
                r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0049 }
                r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0049 }
                goto L_0x0078
            L_0x0049:
                r5 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to load image from path: "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                android.util.Log.w(r3, r0, r5)
                goto L_0x0077
            L_0x005c:
                android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0065 }
                java.io.InputStream r5 = r5.openInputStream(r0)     // Catch:{ Exception -> 0x0065 }
                goto L_0x0078
            L_0x0065:
                r5 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to load image from URI: "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                android.util.Log.w(r3, r0, r5)
            L_0x0077:
                r5 = 0
            L_0x0078:
                if (r5 == 0) goto L_0x0084
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto L_0x011e
            L_0x0084:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.<init>(r1)
                android.net.Uri r4 = r4.c()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x009c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.<init>(r1)
                android.net.Uri r4 = r4.c()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x00b4:
                java.lang.Object r5 = r4.f1742b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto L_0x011e
            L_0x00bd:
                java.lang.Object r5 = r4.f1742b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L_0x011e
            L_0x00c6:
                java.lang.Object r5 = r4.f1742b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f1745e
                int r1 = r4.f1746f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L_0x011e
            L_0x00d3:
                r5 = -1
                if (r0 != r5) goto L_0x00dd
                java.lang.Object r5 = r4.f1742b
                java.lang.String r5 = b(r5)
                goto L_0x00fb
            L_0x00dd:
                r1 = 2
                if (r0 != r1) goto L_0x0102
                java.lang.String r0 = r4.f1750j
                if (r0 == 0) goto L_0x00ee
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00eb
                goto L_0x00ee
            L_0x00eb:
                java.lang.String r5 = r4.f1750j
                goto L_0x00fb
            L_0x00ee:
                java.lang.Object r0 = r4.f1742b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = ":"
                java.lang.String[] r5 = r0.split(r1, r5)
                r0 = 0
                r5 = r5[r0]
            L_0x00fb:
                int r0 = r4.f1745e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L_0x011e
            L_0x0102:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "called getResPackage() on "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0116:
                java.lang.Object r5 = r4.f1742b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            L_0x011e:
                android.content.res.ColorStateList r0 = r4.f1747g
                if (r0 == 0) goto L_0x0125
                r5.setTintList(r0)
            L_0x0125:
                android.graphics.PorterDuff$Mode r4 = r4.f1748h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1740k
                if (r4 == r0) goto L_0x012e
                r5.setTintMode(r4)
            L_0x012e:
                return r5
            L_0x012f:
                java.lang.Object r4 = r4.f1742b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1741a = -1;
        this.f1743c = null;
        this.f1744d = null;
        this.f1745e = 0;
        this.f1746f = 0;
        this.f1747g = null;
        this.f1748h = f1740k;
        this.f1749i = null;
    }

    public static IconCompat a(String str, int i8) {
        str.getClass();
        if (i8 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1745e = i8;
            iconCompat.f1742b = str;
            iconCompat.f1750j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int b() {
        int i8 = this.f1741a;
        if (i8 == -1) {
            return a.a(this.f1742b);
        }
        if (i8 == 2) {
            return this.f1745e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri c() {
        int i8 = this.f1741a;
        if (i8 == -1) {
            return a.d(this.f1742b);
        }
        if (i8 == 4 || i8 == 6) {
            return Uri.parse((String) this.f1742b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f1741a == -1) {
            return String.valueOf(this.f1742b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1741a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1741a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1742b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1742b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1750j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(b())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1745e);
                if (this.f1746f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1746f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1742b);
                break;
        }
        if (this.f1747g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1747g);
        }
        if (this.f1748h != f1740k) {
            sb2.append(" mode=");
            sb2.append(this.f1748h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i8) {
        this.f1743c = null;
        this.f1744d = null;
        this.f1745e = 0;
        this.f1746f = 0;
        this.f1747g = null;
        this.f1748h = f1740k;
        this.f1749i = null;
        this.f1741a = i8;
    }
}
