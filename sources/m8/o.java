package m8;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f11286a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f11287b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11288c;

    /* renamed from: d  reason: collision with root package name */
    public int f11289d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f11290e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f11291f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f11292g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f11293h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f11294i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11295j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11296k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f11297l = null;

    public static class a extends Exception {
    }

    public o(CharSequence charSequence, TextPaint textPaint, int i8) {
        this.f11286a = charSequence;
        this.f11287b = textPaint;
        this.f11288c = i8;
        this.f11289d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f11286a == null) {
            this.f11286a = "";
        }
        int max = Math.max(0, this.f11288c);
        CharSequence charSequence = this.f11286a;
        int i8 = this.f11291f;
        TextPaint textPaint = this.f11287b;
        if (i8 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.f11297l);
        }
        int min = Math.min(charSequence.length(), this.f11289d);
        this.f11289d = min;
        if (this.f11296k && this.f11291f == 1) {
            this.f11290e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f11290e);
        obtain.setIncludePad(this.f11295j);
        obtain.setTextDirection(this.f11296k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f11297l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f11291f);
        float f10 = this.f11292g;
        if (!(f10 == 0.0f && this.f11293h == 1.0f)) {
            obtain.setLineSpacing(f10, this.f11293h);
        }
        if (this.f11291f > 1) {
            obtain.setHyphenationFrequency(this.f11294i);
        }
        return obtain.build();
    }
}
