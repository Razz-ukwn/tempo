package w1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class a {

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    public static class C0303a {
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i8) {
            return drawableContainerState.getChild(i8);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    public static class b {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        public static void f(Drawable drawable, int i8, int i10, int i11, int i12) {
            drawable.setHotspotBounds(i8, i10, i11, i12);
        }

        public static void g(Drawable drawable, int i8) {
            drawable.setTint(i8);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static class c {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i8) {
            return drawable.setLayoutDirection(i8);
        }
    }

    public static void a(Drawable drawable, int i8) {
        b.g(drawable, i8);
    }

    public static void b(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void c(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }
}
