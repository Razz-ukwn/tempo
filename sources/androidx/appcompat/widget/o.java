package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import cb.e;
import d2.i0;
import f.a;
import h2.g;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1094a;

    /* renamed from: b  reason: collision with root package name */
    public f1 f1095b;

    /* renamed from: c  reason: collision with root package name */
    public int f1096c = 0;

    public o(ImageView imageView) {
        this.f1094a = imageView;
    }

    public final void a() {
        f1 f1Var;
        ImageView imageView = this.f1094a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j0.a(drawable);
        }
        if (drawable != null && (f1Var = this.f1095b) != null) {
            j.e(drawable, f1Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i8) {
        int i10;
        ImageView imageView = this.f1094a;
        Context context = imageView.getContext();
        int[] iArr = e.C;
        h1 m = h1.m(context, attributeSet, iArr, i8);
        i0.m(imageView, imageView.getContext(), iArr, attributeSet, m.f1015b, i8);
        try {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable != null || (i10 = m.i(1, -1)) == -1 || (drawable = a.a(imageView.getContext(), i10)) == null)) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j0.a(drawable);
            }
            if (m.l(2)) {
                g.c(imageView, m.b(2));
            }
            if (m.l(3)) {
                g.d(imageView, j0.b(m.h(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m.n();
        }
    }

    public final void c(int i8) {
        ImageView imageView = this.f1094a;
        if (i8 != 0) {
            Drawable a10 = a.a(imageView.getContext(), i8);
            if (a10 != null) {
                j0.a(a10);
            }
            imageView.setImageDrawable(a10);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        a();
    }
}
