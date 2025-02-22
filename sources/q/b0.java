package q;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public float f12656a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public double f12657b = Math.sqrt(50.0d);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12658c;

    /* renamed from: d  reason: collision with root package name */
    public double f12659d;

    /* renamed from: e  reason: collision with root package name */
    public double f12660e;

    /* renamed from: f  reason: collision with root package name */
    public double f12661f;

    /* renamed from: g  reason: collision with root package name */
    public float f12662g = 1.0f;

    public final long a(float f10, float f11, long j10) {
        double d10;
        double d11;
        float f12 = f11;
        boolean z10 = false;
        if (!this.f12658c) {
            if (!(this.f12656a == Float.MAX_VALUE)) {
                float f13 = this.f12662g;
                double d12 = (double) f13;
                double d13 = d12 * d12;
                if (f13 > 1.0f) {
                    double d14 = this.f12657b;
                    double d15 = d13 - ((double) 1);
                    this.f12659d = (Math.sqrt(d15) * d14) + (((double) (-f13)) * d14);
                    double d16 = this.f12657b;
                    this.f12660e = (((double) (-this.f12662g)) * d16) - (Math.sqrt(d15) * d16);
                } else if (f13 >= 0.0f && f13 < 1.0f) {
                    this.f12661f = Math.sqrt(((double) 1) - d13) * this.f12657b;
                }
                this.f12658c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f14 = f10 - this.f12656a;
        double d17 = ((double) j10) / 1000.0d;
        float f15 = this.f12662g;
        if (f15 > 1.0f) {
            double d18 = (double) f14;
            double d19 = this.f12660e;
            double d20 = (double) f12;
            double d21 = this.f12659d;
            double d22 = d18 - (((d19 * d18) - d20) / (d19 - d21));
            double d23 = ((d18 * d19) - d20) / (d19 - d21);
            d10 = (Math.exp(this.f12659d * d17) * d23) + (Math.exp(d19 * d17) * d22);
            double d24 = this.f12660e;
            double exp = Math.exp(d24 * d17) * d22 * d24;
            double d25 = this.f12659d;
            d11 = (Math.exp(d25 * d17) * d23 * d25) + exp;
        } else {
            if (f15 == 1.0f) {
                z10 = true;
            }
            if (z10) {
                double d26 = (double) f12;
                double d27 = this.f12657b;
                double d28 = (double) f14;
                double d29 = (d27 * d28) + d26;
                double d30 = (d29 * d17) + d28;
                double exp2 = Math.exp((-d27) * d17) * d30;
                double exp3 = Math.exp((-this.f12657b) * d17) * d30;
                double d31 = this.f12657b;
                d11 = (Math.exp((-d31) * d17) * d29) + (exp3 * (-d31));
                d10 = exp2;
            } else {
                double d32 = ((double) 1) / this.f12661f;
                double d33 = this.f12657b;
                double d34 = (double) f14;
                double d35 = ((((double) f15) * d33 * d34) + ((double) f12)) * d32;
                double exp4 = Math.exp(((double) (-f15)) * d33 * d17) * ((Math.sin(this.f12661f * d17) * d35) + (Math.cos(this.f12661f * d17) * d34));
                double d36 = this.f12657b;
                float f16 = this.f12662g;
                double d37 = exp4;
                double d38 = (-d36) * exp4 * ((double) f16);
                double exp5 = Math.exp(((double) (-f16)) * d36 * d17);
                double d39 = this.f12661f;
                double d40 = this.f12661f;
                d11 = (((Math.cos(d40 * d17) * d35 * d40) + (Math.sin(d39 * d17) * (-d39) * d34)) * exp5) + d38;
                d10 = d37;
            }
        }
        return (((long) Float.floatToIntBits((float) d11)) & 4294967295L) | (((long) Float.floatToIntBits((float) (d10 + ((double) this.f12656a)))) << 32);
    }
}
