package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import cb.e;
import t1.a;
import v1.d;

public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f956a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f957b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f958c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f959d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f960e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f961f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f962g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.G);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i8) {
        ColorStateList d10 = d(context, i8);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f957b, d10.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f956a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f10 = typedValue.getFloat();
        int c3 = c(context, i8);
        return d.c(c3, Math.round(((float) Color.alpha(c3)) * f10));
    }

    public static int c(Context context, int i8) {
        int[] iArr = f962g;
        iArr[0] = i8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i8) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f962g;
        iArr[0] = i8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = a.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
