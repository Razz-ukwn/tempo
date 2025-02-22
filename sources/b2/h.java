package b2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.f;
import androidx.appcompat.widget.a1;
import c2.b;

public final class h implements Spannable {
    public final char charAt(int i8) {
        throw null;
    }

    public final int getSpanEnd(Object obj) {
        throw null;
    }

    public final int getSpanFlags(Object obj) {
        throw null;
    }

    public final int getSpanStart(Object obj) {
        throw null;
    }

    public final <T> T[] getSpans(int i8, int i10, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            f.b(i8, i10, cls);
            throw null;
        }
        throw null;
    }

    public final int length() {
        throw null;
    }

    public final int nextSpanTransition(int i8, int i10, Class cls) {
        throw null;
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            c.b(obj);
            throw null;
        } else {
            throw null;
        }
    }

    public final void setSpan(Object obj, int i8, int i10, int i11) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            a1.c(obj, i8, i10, i11);
            throw null;
        } else {
            throw null;
        }
    }

    public final CharSequence subSequence(int i8, int i10) {
        throw null;
    }

    public final String toString() {
        throw null;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f3012a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f3013b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3014c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3015d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i8, int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i8).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
            }
            this.f3012a = textPaint;
            this.f3013b = textDirectionHeuristic;
            this.f3014c = i8;
            this.f3015d = i10;
        }

        public final boolean a(a aVar) {
            if (this.f3014c != aVar.f3014c || this.f3015d != aVar.f3015d) {
                return false;
            }
            TextPaint textPaint = this.f3012a;
            if (textPaint.getTextSize() != aVar.f3012a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f3012a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f3013b == aVar.f3013b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f3012a;
            return b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3013b, Integer.valueOf(this.f3014c), Integer.valueOf(this.f3015d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f3012a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb2.append(", textDir=" + this.f3013b);
            sb2.append(", breakStrategy=" + this.f3014c);
            sb2.append(", hyphenationFrequency=" + this.f3015d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f3012a = params.getTextPaint();
            this.f3013b = params.getTextDirection();
            this.f3014c = params.getBreakStrategy();
            this.f3015d = params.getHyphenationFrequency();
        }
    }
}
