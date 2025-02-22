package v8;

import ag.v1;

public final class d extends v1 {
    public final float L = -1.0f;

    public final void k(float f10, float f11, l lVar) {
        lVar.e(f11 * f10, 180.0f, 90.0f);
        double d10 = (double) f11;
        double d11 = (double) f10;
        lVar.d((float) (Math.sin(Math.toRadians((double) 90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d10 * d11));
    }
}
