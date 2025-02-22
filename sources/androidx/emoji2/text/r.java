package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class r extends l {

    /* renamed from: e  reason: collision with root package name */
    public TextPaint f1889e;

    public r(q qVar) {
        super(qVar);
    }

    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i8, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence2 instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(i8, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint3 = this.f1889e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.f1889e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (!(textPaint2 == null || textPaint2.bgColor == 0)) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, (float) i11, f10 + ((float) this.f1863c), (float) i13, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        f.a().getClass();
        float f11 = (float) i12;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        q qVar = this.f1862b;
        o oVar = qVar.f1887b;
        Typeface typeface = oVar.f1878d;
        Typeface typeface2 = textPaint.getTypeface();
        textPaint.setTypeface(typeface);
        canvas.drawText(oVar.f1876b, qVar.f1886a * 2, 2, f10, f11, textPaint);
        textPaint.setTypeface(typeface2);
    }
}
