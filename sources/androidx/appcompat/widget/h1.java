package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.a0;
import u1.f;

public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1014a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1015b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1016c;

    public h1(Context context, TypedArray typedArray) {
        this.f1014a = context;
        this.f1015b = typedArray;
    }

    public static h1 m(Context context, AttributeSet attributeSet, int[] iArr, int i8) {
        return new h1(context, context.obtainStyledAttributes(attributeSet, iArr, i8, 0));
    }

    public final boolean a(int i8, boolean z10) {
        return this.f1015b.getBoolean(i8, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = t1.a.b(r3.f1014a, (r1 = r0.getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList b(int r4) {
        /*
            r3 = this;
            android.content.res.TypedArray r0 = r3.f1015b
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L_0x0018
            r1 = 0
            int r1 = r0.getResourceId(r4, r1)
            if (r1 == 0) goto L_0x0018
            android.content.Context r2 = r3.f1014a
            android.content.res.ColorStateList r1 = t1.a.b(r2, r1)
            if (r1 == 0) goto L_0x0018
            return r1
        L_0x0018:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h1.b(int):android.content.res.ColorStateList");
    }

    public final int c(int i8, int i10) {
        return this.f1015b.getDimensionPixelOffset(i8, i10);
    }

    public final int d(int i8, int i10) {
        return this.f1015b.getDimensionPixelSize(i8, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r0.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1015b
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x0016
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x0016
            android.content.Context r3 = r2.f1014a
            android.graphics.drawable.Drawable r3 = f.a.a(r3, r1)
            return r3
        L_0x0016:
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h1.e(int):android.graphics.drawable.Drawable");
    }

    public final Drawable f(int i8) {
        int resourceId;
        Drawable f10;
        if (!this.f1015b.hasValue(i8) || (resourceId = this.f1015b.getResourceId(i8, 0)) == 0) {
            return null;
        }
        j a10 = j.a();
        Context context = this.f1014a;
        synchronized (a10) {
            f10 = a10.f1027a.f(context, resourceId, true);
        }
        return f10;
    }

    public final Typeface g(int i8, int i10, a0.a aVar) {
        int resourceId = this.f1015b.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1016c == null) {
            this.f1016c = new TypedValue();
        }
        TypedValue typedValue = this.f1016c;
        ThreadLocal<TypedValue> threadLocal = f.f15671a;
        Context context = this.f1014a;
        if (context.isRestricted()) {
            return null;
        }
        return f.a(context, resourceId, typedValue, i10, aVar, true, false);
    }

    public final int h(int i8, int i10) {
        return this.f1015b.getInt(i8, i10);
    }

    public final int i(int i8, int i10) {
        return this.f1015b.getResourceId(i8, i10);
    }

    public final String j(int i8) {
        return this.f1015b.getString(i8);
    }

    public final CharSequence k(int i8) {
        return this.f1015b.getText(i8);
    }

    public final boolean l(int i8) {
        return this.f1015b.hasValue(i8);
    }

    public final void n() {
        this.f1015b.recycle();
    }
}
