package r8;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.z;
import u1.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f14091a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14092b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14093c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14094d;

    /* renamed from: e  reason: collision with root package name */
    public final float f14095e;

    /* renamed from: f  reason: collision with root package name */
    public final float f14096f;

    /* renamed from: g  reason: collision with root package name */
    public final float f14097g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14098h;

    /* renamed from: i  reason: collision with root package name */
    public final float f14099i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f14100j;

    /* renamed from: k  reason: collision with root package name */
    public float f14101k;

    /* renamed from: l  reason: collision with root package name */
    public final int f14102l;
    public boolean m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f14103n;

    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z f14104a;

        public a(z zVar) {
            this.f14104a = zVar;
        }

        public final void c(int i8) {
            d.this.m = true;
            this.f14104a.t(i8);
        }

        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f14103n = Typeface.create(typeface, dVar.f14093c);
            dVar.m = true;
            this.f14104a.y(dVar.f14103n, false);
        }
    }

    public d(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, n2.f463k0);
        this.f14101k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f14100j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f14093c = obtainStyledAttributes.getInt(2, 0);
        this.f14094d = obtainStyledAttributes.getInt(1, 1);
        int i10 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f14102l = obtainStyledAttributes.getResourceId(i10, 0);
        this.f14092b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f14091a = c.a(context, obtainStyledAttributes, 6);
        this.f14095e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f14096f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f14097g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i8, n2.X);
        this.f14098h = obtainStyledAttributes2.hasValue(0);
        this.f14099i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f14103n;
        int i8 = this.f14093c;
        if (typeface == null && (str = this.f14092b) != null) {
            this.f14103n = Typeface.create(str, i8);
        }
        if (this.f14103n == null) {
            int i10 = this.f14094d;
            if (i10 == 1) {
                this.f14103n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f14103n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f14103n = Typeface.DEFAULT;
            } else {
                this.f14103n = Typeface.MONOSPACE;
            }
            this.f14103n = Typeface.create(this.f14103n, i8);
        }
    }

    public final Typeface b(Context context) {
        Typeface typeface;
        if (this.m) {
            return this.f14103n;
        }
        if (!context.isRestricted()) {
            try {
                int i8 = this.f14102l;
                ThreadLocal<TypedValue> threadLocal = f.f15671a;
                if (context.isRestricted()) {
                    typeface = null;
                } else {
                    typeface = f.a(context, i8, new TypedValue(), 0, (f.e) null, false, false);
                }
                this.f14103n = typeface;
                if (typeface != null) {
                    this.f14103n = Typeface.create(typeface, this.f14093c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f14092b, e10);
            }
        }
        a();
        this.m = true;
        return this.f14103n;
    }

    public final void c(Context context, z zVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i8 = this.f14102l;
        if (i8 == 0) {
            this.m = true;
        }
        if (this.m) {
            zVar.y(this.f14103n, true);
            return;
        }
        try {
            a aVar = new a(zVar);
            ThreadLocal<TypedValue> threadLocal = f.f15671a;
            if (context.isRestricted()) {
                aVar.a(-4);
                return;
            }
            f.a(context, i8, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            zVar.t(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f14092b, e10);
            this.m = true;
            zVar.t(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f14102l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = u1.f.f15671a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = u1.f.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, z zVar) {
        f(context, textPaint, zVar);
        ColorStateList colorStateList = this.f14100j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f14091a;
        textPaint.setShadowLayer(this.f14097g, this.f14095e, this.f14096f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, z zVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f14103n);
        c(context, new e(this, context, textPaint, zVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = f.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i8 = (~typeface.getStyle()) & this.f14093c;
        textPaint.setFakeBoldText((i8 & 1) != 0);
        textPaint.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f14101k);
        if (this.f14098h) {
            textPaint.setLetterSpacing(this.f14099i);
        }
    }
}
