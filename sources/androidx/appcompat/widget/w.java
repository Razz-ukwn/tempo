package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.i0;
import w1.a;

public final class w extends r {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1132d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1133e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1134f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1135g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1136h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1137i = false;

    public w(SeekBar seekBar) {
        super(seekBar);
        this.f1132d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i8) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1132d;
        Context context = seekBar.getContext();
        int[] iArr = e.D;
        h1 m = h1.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        i0.m(seekBar, seekBar.getContext(), iArr, attributeSet, m.f1015b, R.attr.seekBarStyle);
        Drawable f10 = m.f(0);
        if (f10 != null) {
            seekBar.setThumb(f10);
        }
        Drawable e10 = m.e(1);
        Drawable drawable = this.f1133e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1133e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            a.c.b(e10, i0.e.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m.l(3)) {
            this.f1135g = j0.b(m.h(3, -1), this.f1135g);
            this.f1137i = true;
        }
        if (m.l(2)) {
            this.f1134f = m.b(2);
            this.f1136h = true;
        }
        m.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1133e;
        if (drawable == null) {
            return;
        }
        if (this.f1136h || this.f1137i) {
            Drawable mutate = drawable.mutate();
            this.f1133e = mutate;
            if (this.f1136h) {
                a.b.h(mutate, this.f1134f);
            }
            if (this.f1137i) {
                a.b.i(this.f1133e, this.f1135g);
            }
            if (this.f1133e.isStateful()) {
                this.f1133e.setState(this.f1132d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f1133e != null) {
            SeekBar seekBar = this.f1132d;
            int max = seekBar.getMax();
            int i8 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1133e.getIntrinsicWidth();
                int intrinsicHeight = this.f1133e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i8 = intrinsicHeight / 2;
                }
                this.f1133e.setBounds(-i10, -i8, i10, i8);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f1133e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
