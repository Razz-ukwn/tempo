package vb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import tb.g;
import u.b;

public final class e extends View {
    public static final int C = Color.argb(160, 255, 255, 255);
    public final ColorDrawable B = new ColorDrawable(this.f16378d);

    /* renamed from: a  reason: collision with root package name */
    public final float f16375a;

    /* renamed from: b  reason: collision with root package name */
    public final b f16376b = new b();

    /* renamed from: c  reason: collision with root package name */
    public g f16377c;

    /* renamed from: d  reason: collision with root package name */
    public int f16378d = C;

    /* renamed from: e  reason: collision with root package name */
    public final ColorDrawable f16379e = new ColorDrawable(this.f16378d);

    public e(Context context) {
        super(context, (AttributeSet) null);
        this.f16375a = TypedValue.applyDimension(1, 0.9f, context.getResources().getDisplayMetrics());
    }

    private int getLineCount() {
        int ordinal = this.f16377c.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    public int getGridColor() {
        return this.f16378d;
    }

    public g getGridMode() {
        return this.f16377c;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b bVar = this.f16376b;
        bVar.e();
        int lineCount = getLineCount();
        int i8 = 0;
        while (i8 < lineCount) {
            float lineCount2 = this.f16377c == g.DRAW_PHI ? i8 == 1 ? 0.38196602f : 0.618034f : (1.0f / ((float) (getLineCount() + 1))) * (((float) i8) + 1.0f);
            canvas.translate(0.0f, ((float) getHeight()) * lineCount2);
            this.f16379e.draw(canvas);
            float f10 = -lineCount2;
            canvas.translate(0.0f, ((float) getHeight()) * f10);
            canvas.translate(lineCount2 * ((float) getWidth()), 0.0f);
            this.B.draw(canvas);
            canvas.translate(f10 * ((float) getWidth()), 0.0f);
            i8++;
        }
        bVar.a(Integer.valueOf(lineCount));
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        ColorDrawable colorDrawable = this.f16379e;
        float f10 = this.f16375a;
        colorDrawable.setBounds(i8, 0, i11, (int) f10);
        this.B.setBounds(0, i10, (int) f10, i12);
    }

    public void setGridColor(int i8) {
        this.f16378d = i8;
        this.f16379e.setColor(i8);
        this.B.setColor(i8);
        postInvalidate();
    }

    public void setGridMode(g gVar) {
        this.f16377c = gVar;
        postInvalidate();
    }
}
