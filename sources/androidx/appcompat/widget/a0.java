package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.q;
import d2.d1;
import d2.i0;
import h2.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import u1.f;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f925a;

    /* renamed from: b  reason: collision with root package name */
    public f1 f926b;

    /* renamed from: c  reason: collision with root package name */
    public f1 f927c;

    /* renamed from: d  reason: collision with root package name */
    public f1 f928d;

    /* renamed from: e  reason: collision with root package name */
    public f1 f929e;

    /* renamed from: f  reason: collision with root package name */
    public f1 f930f;

    /* renamed from: g  reason: collision with root package name */
    public f1 f931g;

    /* renamed from: h  reason: collision with root package name */
    public f1 f932h;

    /* renamed from: i  reason: collision with root package name */
    public final e0 f933i;

    /* renamed from: j  reason: collision with root package name */
    public int f934j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f935k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f936l;
    public boolean m;

    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f937a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f938b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f939c;

        public a(int i8, int i10, WeakReference weakReference) {
            this.f937a = i8;
            this.f938b = i10;
            this.f939c = weakReference;
        }

        public final void c(int i8) {
        }

        public final void d(Typeface typeface) {
            int i8;
            if (Build.VERSION.SDK_INT >= 28 && (i8 = this.f937a) != -1) {
                typeface = e.a(typeface, i8, (this.f938b & 2) != 0);
            }
            a0 a0Var = a0.this;
            if (a0Var.m) {
                a0Var.f936l = typeface;
                TextView textView = (TextView) this.f939c.get();
                if (textView != null) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    if (i0.g.b(textView)) {
                        textView.post(new b0(textView, typeface, a0Var.f934j));
                    } else {
                        textView.setTypeface(typeface, a0Var.f934j);
                    }
                }
            }
        }
    }

    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i8, int i10, int i11, int i12) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i8, i10, i11, i12);
        }

        public static void c(TextView textView, int[] iArr, int i8) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class e {
        public static Typeface a(Typeface typeface, int i8, boolean z10) {
            return Typeface.create(typeface, i8, z10);
        }
    }

    public a0(TextView textView) {
        this.f925a = textView;
        this.f933i = new e0(textView);
    }

    public static f1 c(Context context, j jVar, int i8) {
        ColorStateList h3;
        synchronized (jVar) {
            h3 = jVar.f1027a.h(context, i8);
        }
        if (h3 == null) {
            return null;
        }
        f1 f1Var = new f1();
        f1Var.f1000d = true;
        f1Var.f997a = h3;
        return f1Var;
    }

    public final void a(Drawable drawable, f1 f1Var) {
        if (drawable != null && f1Var != null) {
            j.e(drawable, f1Var, this.f925a.getDrawableState());
        }
    }

    public final void b() {
        f1 f1Var = this.f926b;
        TextView textView = this.f925a;
        if (!(f1Var == null && this.f927c == null && this.f928d == null && this.f929e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f926b);
            a(compoundDrawables[1], this.f927c);
            a(compoundDrawables[2], this.f928d);
            a(compoundDrawables[3], this.f929e);
        }
        if (this.f930f != null || this.f931g != null) {
            Drawable[] a10 = b.a(textView);
            a(a10[0], this.f930f);
            a(a10[2], this.f931g);
        }
    }

    public final ColorStateList d() {
        f1 f1Var = this.f932h;
        if (f1Var != null) {
            return f1Var.f997a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        f1 f1Var = this.f932h;
        if (f1Var != null) {
            return f1Var.f998b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i8) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int resourceId;
        int i13;
        AttributeSet attributeSet2 = attributeSet;
        int i14 = i8;
        TextView textView = this.f925a;
        Context context = textView.getContext();
        j a10 = j.a();
        int[] iArr = cb.e.E;
        h1 m10 = h1.m(context, attributeSet2, iArr, i14);
        i0.m(textView, textView.getContext(), iArr, attributeSet, m10.f1015b, i8);
        int i15 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f926b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.f927c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f928d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f929e = c(context, a10, m10.i(2, 0));
        }
        int i16 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f930f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f931g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = cb.e.T;
        if (i15 != -1) {
            h1 h1Var = new h1(context, context.obtainStyledAttributes(i15, iArr2));
            if (z12 || !h1Var.l(14)) {
                z11 = false;
                z10 = false;
            } else {
                z11 = h1Var.a(14, false);
                z10 = true;
            }
            m(context, h1Var);
            if (h1Var.l(15)) {
                str2 = h1Var.j(15);
                i13 = 13;
            } else {
                i13 = 13;
                str2 = null;
            }
            str = h1Var.l(i13) ? h1Var.j(i13) : null;
            h1Var.n();
        } else {
            z11 = false;
            z10 = false;
            str2 = null;
            str = null;
        }
        h1 h1Var2 = new h1(context, context.obtainStyledAttributes(attributeSet2, iArr2, i14, 0));
        if (z12 || !h1Var2.l(14)) {
            i10 = 15;
        } else {
            z11 = h1Var2.a(14, false);
            i10 = 15;
            z10 = true;
        }
        if (h1Var2.l(i10)) {
            str2 = h1Var2.j(i10);
        }
        if (h1Var2.l(13)) {
            str = h1Var2.j(13);
        }
        String str3 = str;
        if (i16 >= 28 && h1Var2.l(0) && h1Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, h1Var2);
        h1Var2.n();
        if (!z12 && z10) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f936l;
        if (typeface != null) {
            if (this.f935k == -1) {
                textView.setTypeface(typeface, this.f934j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            d.d(textView, str3);
        }
        if (str2 != null) {
            c.b(textView, c.a(str2));
        }
        int[] iArr3 = cb.e.F;
        e0 e0Var = this.f933i;
        Context context2 = e0Var.f990j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr3, i14, 0);
        TextView textView2 = e0Var.f989i;
        TypedArray typedArray = obtainStyledAttributes;
        Context context3 = context2;
        e0 e0Var2 = e0Var;
        i0.m(textView2, textView2.getContext(), iArr3, attributeSet, typedArray, i8);
        TypedArray typedArray2 = typedArray;
        if (typedArray2.hasValue(5)) {
            e0Var2.f981a = typedArray2.getInt(5, 0);
        }
        float dimension = typedArray2.hasValue(4) ? typedArray2.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArray2.hasValue(2) ? typedArray2.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArray2.hasValue(1) ? typedArray2.getDimension(1, -1.0f) : -1.0f;
        if (typedArray2.hasValue(3) && (resourceId = typedArray2.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray2.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = obtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                e0Var2.f986f = e0.b(iArr4);
                e0Var2.h();
            }
            obtainTypedArray.recycle();
        }
        typedArray2.recycle();
        if (!e0Var2.i()) {
            e0Var2.f981a = 0;
        } else if (e0Var2.f981a == 1) {
            if (!e0Var2.f987g) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i12 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                e0Var2.j(dimension2, dimension3, dimension);
            }
            e0Var2.g();
        }
        if (q1.f1114b && e0Var2.f981a != 0) {
            int[] iArr5 = e0Var2.f986f;
            if (iArr5.length > 0) {
                if (((float) d.a(textView)) != -1.0f) {
                    d.b(textView, Math.round(e0Var2.f984d), Math.round(e0Var2.f985e), Math.round(e0Var2.f983c), 0);
                } else {
                    d.c(textView, iArr5, 0);
                }
            }
        }
        h1 h1Var3 = new h1(context, context.obtainStyledAttributes(attributeSet2, iArr3));
        int i18 = h1Var3.i(8, -1);
        Drawable b10 = i18 != -1 ? a10.b(context, i18) : null;
        int i19 = h1Var3.i(13, -1);
        Drawable b11 = i19 != -1 ? a10.b(context, i19) : null;
        int i20 = h1Var3.i(9, -1);
        Drawable b12 = i20 != -1 ? a10.b(context, i20) : null;
        int i21 = h1Var3.i(6, -1);
        Drawable b13 = i21 != -1 ? a10.b(context, i21) : null;
        int i22 = h1Var3.i(10, -1);
        Drawable b14 = i22 != -1 ? a10.b(context, i22) : null;
        int i23 = h1Var3.i(7, -1);
        Drawable b15 = i23 != -1 ? a10.b(context, i23) : null;
        if (b14 != null || b15 != null) {
            Drawable[] a11 = b.a(textView);
            if (b14 == null) {
                b14 = a11[0];
            }
            if (b11 == null) {
                b11 = a11[1];
            }
            if (b15 == null) {
                b15 = a11[2];
            }
            if (b13 == null) {
                b13 = a11[3];
            }
            b.b(textView, b14, b11, b15, b13);
        } else if (!(b10 == null && b11 == null && b12 == null && b13 == null)) {
            Drawable[] a12 = b.a(textView);
            Drawable drawable = a12[0];
            if (drawable == null && a12[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b10 == null) {
                    b10 = compoundDrawables[0];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[2];
                }
                if (b13 == null) {
                    b13 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, b13);
            } else {
                if (b11 == null) {
                    b11 = a12[1];
                }
                Drawable drawable2 = a12[2];
                if (b13 == null) {
                    b13 = a12[3];
                }
                b.b(textView, drawable, b11, drawable2, b13);
            }
        }
        if (h1Var3.l(11)) {
            l.c.f(textView, h1Var3.b(11));
        }
        if (h1Var3.l(12)) {
            i11 = -1;
            l.c.g(textView, j0.b(h1Var3.h(12, -1), (PorterDuff.Mode) null));
        } else {
            i11 = -1;
        }
        int d10 = h1Var3.d(15, i11);
        int d11 = h1Var3.d(18, i11);
        int d12 = h1Var3.d(19, i11);
        h1Var3.n();
        if (d10 != i11) {
            l.b(textView, d10);
        }
        if (d11 != i11) {
            l.c(textView, d11);
        }
        if (d12 != i11) {
            b7.a.p(d12);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (d12 != fontMetricsInt) {
                textView.setLineSpacing((float) (d12 - fontMetricsInt), 1.0f);
            }
        }
    }

    public final void g(Context context, int i8) {
        String j10;
        h1 h1Var = new h1(context, context.obtainStyledAttributes(i8, cb.e.T));
        boolean l10 = h1Var.l(14);
        TextView textView = this.f925a;
        if (l10) {
            textView.setAllCaps(h1Var.a(14, false));
        }
        if (h1Var.l(0) && h1Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, h1Var);
        if (h1Var.l(13) && (j10 = h1Var.j(13)) != null) {
            d.d(textView, j10);
        }
        h1Var.n();
        Typeface typeface = this.f936l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f934j);
        }
    }

    public final void h(int i8, int i10, int i11, int i12) {
        e0 e0Var = this.f933i;
        if (e0Var.i()) {
            DisplayMetrics displayMetrics = e0Var.f990j.getResources().getDisplayMetrics();
            e0Var.j(TypedValue.applyDimension(i12, (float) i8, displayMetrics), TypedValue.applyDimension(i12, (float) i10, displayMetrics), TypedValue.applyDimension(i12, (float) i11, displayMetrics));
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i8) {
        e0 e0Var = this.f933i;
        if (e0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i8 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e0Var.f990j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i8, (float) iArr[i10], displayMetrics));
                    }
                }
                e0Var.f986f = e0.b(iArr2);
                if (!e0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                e0Var.f987g = false;
            }
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public final void j(int i8) {
        e0 e0Var = this.f933i;
        if (!e0Var.i()) {
            return;
        }
        if (i8 == 0) {
            e0Var.f981a = 0;
            e0Var.f984d = -1.0f;
            e0Var.f985e = -1.0f;
            e0Var.f983c = -1.0f;
            e0Var.f986f = new int[0];
            e0Var.f982b = false;
        } else if (i8 == 1) {
            DisplayMetrics displayMetrics = e0Var.f990j.getResources().getDisplayMetrics();
            e0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e0Var.g()) {
                e0Var.a();
            }
        } else {
            throw new IllegalArgumentException(q.a("Unknown auto-size text type: ", i8));
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f932h == null) {
            this.f932h = new f1();
        }
        f1 f1Var = this.f932h;
        f1Var.f997a = colorStateList;
        f1Var.f1000d = colorStateList != null;
        this.f926b = f1Var;
        this.f927c = f1Var;
        this.f928d = f1Var;
        this.f929e = f1Var;
        this.f930f = f1Var;
        this.f931g = f1Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f932h == null) {
            this.f932h = new f1();
        }
        f1 f1Var = this.f932h;
        f1Var.f998b = mode;
        f1Var.f999c = mode != null;
        this.f926b = f1Var;
        this.f927c = f1Var;
        this.f928d = f1Var;
        this.f929e = f1Var;
        this.f930f = f1Var;
        this.f931g = f1Var;
    }

    public final void m(Context context, h1 h1Var) {
        String j10;
        this.f934j = h1Var.h(2, this.f934j);
        int i8 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i8 >= 28) {
            int h3 = h1Var.h(11, -1);
            this.f935k = h3;
            if (h3 != -1) {
                this.f934j = (this.f934j & 2) | 0;
            }
        }
        int i10 = 10;
        if (h1Var.l(10) || h1Var.l(12)) {
            this.f936l = null;
            if (h1Var.l(12)) {
                i10 = 12;
            }
            int i11 = this.f935k;
            int i12 = this.f934j;
            if (!context.isRestricted()) {
                try {
                    Typeface g10 = h1Var.g(i10, this.f934j, new a(i11, i12, new WeakReference(this.f925a)));
                    if (g10 != null) {
                        if (i8 < 28 || this.f935k == -1) {
                            this.f936l = g10;
                        } else {
                            this.f936l = e.a(Typeface.create(g10, 0), this.f935k, (this.f934j & 2) != 0);
                        }
                    }
                    this.m = this.f936l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f936l == null && (j10 = h1Var.j(i10)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f935k == -1) {
                    this.f936l = Typeface.create(j10, this.f934j);
                    return;
                }
                Typeface create = Typeface.create(j10, 0);
                int i13 = this.f935k;
                if ((this.f934j & 2) != 0) {
                    z10 = true;
                }
                this.f936l = e.a(create, i13, z10);
            }
        } else if (h1Var.l(1)) {
            this.m = false;
            int h10 = h1Var.h(1, 1);
            if (h10 == 1) {
                this.f936l = Typeface.SANS_SERIF;
            } else if (h10 == 2) {
                this.f936l = Typeface.SERIF;
            } else if (h10 == 3) {
                this.f936l = Typeface.MONOSPACE;
            }
        }
    }
}
