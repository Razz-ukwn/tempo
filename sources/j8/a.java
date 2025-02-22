package j8;

import android.content.Context;
import android.graphics.Color;
import com.quickkonnect.silencio.R;
import r8.b;
import v1.d;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f9862f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9863a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9864b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9865c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9866d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9867e;

    public a(Context context) {
        boolean b10 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int e10 = b1.b.e(context, R.attr.elevationOverlayColor, 0);
        int e11 = b1.b.e(context, R.attr.elevationOverlayAccentColor, 0);
        int e12 = b1.b.e(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f9863a = b10;
        this.f9864b = e10;
        this.f9865c = e11;
        this.f9866d = e12;
        this.f9867e = f10;
    }

    public final int a(int i8, float f10) {
        int i10;
        if (!this.f9863a) {
            return i8;
        }
        if (!(d.c(i8, 255) == this.f9866d)) {
            return i8;
        }
        float f11 = this.f9867e;
        float min = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i8);
        int h3 = b1.b.h(min, d.c(i8, 255), this.f9864b);
        if (min > 0.0f && (i10 = this.f9865c) != 0) {
            h3 = d.b(d.c(i10, f9862f), h3);
        }
        return d.c(h3, alpha);
    }
}
