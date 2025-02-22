package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import q2.a;

public abstract class l extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1861a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final q f1862b;

    /* renamed from: c  reason: collision with root package name */
    public short f1863c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f1864d = 1.0f;

    public l(q qVar) {
        if (qVar != null) {
            this.f1862b = qVar;
            return;
        }
        throw new NullPointerException("rasterizer cannot be null");
    }

    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i8, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1861a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        q qVar = this.f1862b;
        a c3 = qVar.c();
        int a10 = c3.a(14);
        short s10 = 0;
        this.f1864d = abs / ((float) (a10 != 0 ? c3.f12831b.getShort(a10 + c3.f12830a) : 0));
        a c10 = qVar.c();
        int a11 = c10.a(14);
        if (a11 != 0) {
            c10.f12831b.getShort(a11 + c10.f12830a);
        }
        a c11 = qVar.c();
        int a12 = c11.a(12);
        if (a12 != 0) {
            s10 = c11.f12831b.getShort(a12 + c11.f12830a);
        }
        short s11 = (short) ((int) (((float) s10) * this.f1864d));
        this.f1863c = s11;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s11;
    }
}
