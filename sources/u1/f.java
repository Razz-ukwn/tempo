package u1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f15671a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f15672b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f15673c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getDrawable(i8, theme);
        }

        public static Drawable b(Resources resources, int i8, int i10, Resources.Theme theme) {
            return resources.getDrawableForDensity(i8, i10, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColor(i8, theme);
        }

        public static ColorStateList b(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColorStateList(i8, theme);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f15674a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f15675b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15676c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f15674a = colorStateList;
            this.f15675b = configuration;
            this.f15676c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f15677a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f15678b;

        public d(Resources resources, Resources.Theme theme) {
            this.f15677a = resources;
            this.f15678b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15677a.equals(dVar.f15677a) && c2.b.a(this.f15678b, dVar.f15678b);
        }

        public final int hashCode() {
            return c2.b.b(this.f15677a, this.f15678b);
        }
    }

    public static abstract class e {
        public final void a(int i8) {
            new Handler(Looper.getMainLooper()).post(new h(this, i8));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new g(0, this, typeface));
        }

        public abstract void c(int i8);

        public abstract void d(Typeface typeface);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, u1.f.e r19, boolean r20, boolean r21) {
        /*
            r10 = r16
            r0 = r17
            r7 = r18
            r11 = r19
            android.content.res.Resources r8 = r15.getResources()
            r1 = 1
            r8.getValue(r10, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00de
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r13.startsWith(r1)
            r14 = -3
            if (r1 != 0) goto L_0x002a
            if (r11 == 0) goto L_0x00b8
            r11.a(r14)
            goto L_0x00b8
        L_0x002a:
            int r1 = r0.assetCookie
            o.e<java.lang.String, android.graphics.Typeface> r9 = v1.h.f16129b
            java.lang.String r1 = v1.h.b(r8, r10, r13, r1, r7)
            java.lang.Object r1 = r9.c(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0041
            if (r11 == 0) goto L_0x00b9
            r11.b(r1)
            goto L_0x00b9
        L_0x0041:
            if (r21 == 0) goto L_0x0045
            goto L_0x00b8
        L_0x0045:
            java.lang.String r1 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x007c
            android.content.res.XmlResourceParser r1 = r8.getXml(r10)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            u1.d$b r2 = u1.d.a(r1, r8)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r2 != 0) goto L_0x0066
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r11 == 0) goto L_0x00b8
            r11.a(r14)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b8
        L_0x0066:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r1 = r15
            r3 = r8
            r4 = r16
            r5 = r13
            r7 = r18
            r8 = r19
            r9 = r20
            android.graphics.Typeface r1 = v1.h.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b9
        L_0x0078:
            r0 = move-exception
            goto L_0x00a0
        L_0x007a:
            r0 = move-exception
            goto L_0x00aa
        L_0x007c:
            int r0 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            v1.n r1 = v1.h.f16128a     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r2 = r15
            r3 = r8
            r4 = r16
            r5 = r13
            r6 = r18
            android.graphics.Typeface r1 = r1.c(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = v1.h.b(r8, r10, r13, r0, r7)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            r9.d(r0, r1)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
        L_0x0094:
            if (r11 == 0) goto L_0x00b9
            if (r1 == 0) goto L_0x009c
            r11.b(r1)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b9
        L_0x009c:
            r11.a(r14)     // Catch:{ XmlPullParserException -> 0x007a, IOException -> 0x0078 }
            goto L_0x00b9
        L_0x00a0:
            java.lang.String r1 = "Failed to read xml resource "
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
            goto L_0x00b3
        L_0x00aa:
            java.lang.String r1 = "Failed to parse xml resource "
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
        L_0x00b3:
            if (r11 == 0) goto L_0x00b8
            r11.a(r14)
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r1 != 0) goto L_0x00dd
            if (r11 != 0) goto L_0x00dd
            if (r21 == 0) goto L_0x00c0
            goto L_0x00dd
        L_0x00c0:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            return r1
        L_0x00de:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r8.getResourceName(r10)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r16)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.f.a(android.content.Context, int, android.util.TypedValue, int, u1.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
