package x7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import m8.p;
import m8.s;
import r8.d;
import v8.f;
import x7.b;

public final class a extends Drawable implements p.b {
    public float B;
    public float C;
    public int D;
    public float E;
    public float F;
    public float G;
    public WeakReference<View> H;
    public WeakReference<FrameLayout> I;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f16971a;

    /* renamed from: b  reason: collision with root package name */
    public final f f16972b;

    /* renamed from: c  reason: collision with root package name */
    public final p f16973c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f16974d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final b f16975e;

    public a(Context context, b.a aVar) {
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f16971a = weakReference;
        s.c(context, s.f11307b, "Theme.MaterialComponents");
        f fVar = new f();
        this.f16972b = fVar;
        p pVar = new p(this);
        this.f16973c = pVar;
        TextPaint textPaint = pVar.f11298a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (!(context3 == null || pVar.f11303f == (dVar = new d(context3, 2132017679)) || (context2 = weakReference.get()) == null)) {
            pVar.b(dVar, context2);
            h();
        }
        b bVar = new b(context, aVar);
        this.f16975e = bVar;
        b.a aVar2 = bVar.f16977b;
        this.D = ((int) Math.pow(10.0d, ((double) aVar2.B) - 1.0d)) - 1;
        pVar.f11301d = true;
        h();
        invalidateSelf();
        pVar.f11301d = true;
        h();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(aVar2.f16982b.intValue());
        if (fVar.f16250a.f16258c != valueOf) {
            fVar.m(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar2.f16983c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.H;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = this.H.get();
            WeakReference<FrameLayout> weakReference3 = this.I;
            g(view, weakReference3 != null ? weakReference3.get() : null);
        }
        h();
        setVisible(aVar2.H.booleanValue(), false);
    }

    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int e10 = e();
        int i8 = this.D;
        b bVar = this.f16975e;
        if (e10 <= i8) {
            return NumberFormat.getInstance(bVar.f16977b.C).format((long) e());
        }
        Context context = this.f16971a.get();
        if (context == null) {
            return "";
        }
        return String.format(bVar.f16977b.C, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.D), "+"});
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean f10 = f();
        b bVar = this.f16975e;
        if (!f10) {
            return bVar.f16977b.D;
        }
        if (bVar.f16977b.E == 0 || (context = this.f16971a.get()) == null) {
            return null;
        }
        int e10 = e();
        int i8 = this.D;
        b.a aVar = bVar.f16977b;
        if (e10 <= i8) {
            return context.getResources().getQuantityString(aVar.E, e(), new Object[]{Integer.valueOf(e())});
        }
        return context.getString(aVar.F, new Object[]{Integer.valueOf(i8)});
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.I;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f16972b.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                p pVar = this.f16973c;
                pVar.f11298a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.B, this.C + ((float) (rect.height() / 2)), pVar.f11298a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f16975e.f16977b.f16985e;
        }
        return 0;
    }

    public final boolean f() {
        return this.f16975e.f16977b.f16985e != -1;
    }

    public final void g(View view, FrameLayout frameLayout) {
        this.H = new WeakReference<>(view);
        this.I = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        h();
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f16975e.f16977b.f16984d;
    }

    public final int getIntrinsicHeight() {
        return this.f16974d.height();
    }

    public final int getIntrinsicWidth() {
        return this.f16974d.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = this.f16971a.get();
        WeakReference<View> weakReference = this.H;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f16974d;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<FrameLayout> weakReference2 = this.I;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean f10 = f();
            b bVar = this.f16975e;
            int intValue = bVar.f16977b.N.intValue() + (f10 ? bVar.f16977b.L.intValue() : bVar.f16977b.J.intValue());
            b.a aVar = bVar.f16977b;
            int intValue2 = aVar.G.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                this.C = (float) (rect3.bottom - intValue);
            } else {
                this.C = (float) (rect3.top + intValue);
            }
            int e10 = e();
            float f11 = bVar.f16979d;
            if (e10 <= 9) {
                if (!f()) {
                    f11 = bVar.f16978c;
                }
                this.E = f11;
                this.G = f11;
                this.F = f11;
            } else {
                this.E = f11;
                this.G = f11;
                this.F = (this.f16973c.a(b()) / 2.0f) + bVar.f16980e;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
            int intValue3 = aVar.M.intValue() + (f() ? aVar.K.intValue() : aVar.I.intValue());
            int intValue4 = aVar.G.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                this.B = i0.e.d(view) == 0 ? (((float) rect3.left) - this.F) + ((float) dimensionPixelSize) + ((float) intValue3) : ((((float) rect3.right) + this.F) - ((float) dimensionPixelSize)) - ((float) intValue3);
            } else {
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                this.B = i0.e.d(view) == 0 ? ((((float) rect3.right) + this.F) - ((float) dimensionPixelSize)) - ((float) intValue3) : (((float) rect3.left) - this.F) + ((float) dimensionPixelSize) + ((float) intValue3);
            }
            float f12 = this.B;
            float f13 = this.C;
            float f14 = this.F;
            float f15 = this.G;
            rect2.set((int) (f12 - f14), (int) (f13 - f15), (int) (f12 + f14), (int) (f13 + f15));
            float f16 = this.E;
            f fVar = this.f16972b;
            fVar.setShapeAppearanceModel(fVar.f16250a.f16256a.e(f16));
            if (!rect.equals(rect2)) {
                fVar.setBounds(rect2);
            }
        }
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i8) {
        b bVar = this.f16975e;
        bVar.f16976a.f16984d = i8;
        bVar.f16977b.f16984d = i8;
        this.f16973c.f11298a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
