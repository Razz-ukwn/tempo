package v7;

import android.animation.TypeEvaluator;

public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16233a = new b();

    public static Integer a(float f10, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float b10 = a2.b.b(((float) ((intValue2 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float b11 = a2.b.b(pow4, pow, f10, pow);
        float b12 = a2.b.b((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, f10, pow2);
        float b13 = a2.b.b((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow((double) b11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) b13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(b10 * 255.0f) << 24) | (Math.round(((float) Math.pow((double) b12, 0.45454545454545453d)) * 255.0f) << 8));
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f10, Object obj, Object obj2) {
        return a(f10, (Integer) obj, (Integer) obj2);
    }
}
