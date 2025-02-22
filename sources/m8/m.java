package m8;

import ag.n2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.z;
import java.util.WeakHashMap;
import v1.e;

public class m extends FrameLayout {
    public boolean B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f11276a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f11277b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f11278c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11279d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11280e;

    public class a implements z {
        public a() {
        }

        public final j1 a(View view, j1 j1Var) {
            m mVar = m.this;
            if (mVar.f11277b == null) {
                mVar.f11277b = new Rect();
            }
            mVar.f11277b.set(j1Var.b(), j1Var.d(), j1Var.c(), j1Var.a());
            mVar.a(j1Var);
            j1.k kVar = j1Var.f7237a;
            boolean z10 = true;
            if ((!kVar.j().equals(e.f16120e)) && mVar.f11276a != null) {
                z10 = false;
            }
            mVar.setWillNotDraw(z10);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(mVar);
            return kVar.c();
        }
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(j1 j1Var) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f11277b != null && this.f11276a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            boolean z10 = this.f11279d;
            Rect rect = this.f11278c;
            if (z10) {
                rect.set(0, 0, width, this.f11277b.top);
                this.f11276a.setBounds(rect);
                this.f11276a.draw(canvas);
            }
            if (this.f11280e) {
                rect.set(0, height - this.f11277b.bottom, width, height);
                this.f11276a.setBounds(rect);
                this.f11276a.draw(canvas);
            }
            if (this.B) {
                Rect rect2 = this.f11277b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f11276a.setBounds(rect);
                this.f11276a.draw(canvas);
            }
            if (this.C) {
                Rect rect3 = this.f11277b;
                rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
                this.f11276a.setBounds(rect);
                this.f11276a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f11276a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f11276a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f11280e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.B = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.C = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f11279d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f11276a = drawable;
    }

    public m(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f11278c = new Rect();
        this.f11279d = true;
        this.f11280e = true;
        this.B = true;
        this.C = true;
        TypedArray d10 = s.d(context, attributeSet, n2.f457e0, i8, 2132018004, new int[0]);
        this.f11276a = d10.getDrawable(0);
        d10.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.i.u(this, aVar);
    }
}
