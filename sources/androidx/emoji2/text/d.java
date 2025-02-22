package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

public final class d implements f.e {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f1819b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1820a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1820a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
