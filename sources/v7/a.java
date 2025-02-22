package v7;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import v2.b;
import v2.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f16228a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final b f16229b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final v2.a f16230c = new v2.a();

    /* renamed from: d  reason: collision with root package name */
    public static final c f16231d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f16232e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a2.b.b(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(float f10, int i8, int i10) {
        return Math.round(f10 * ((float) (i10 - i8))) + i8;
    }
}
