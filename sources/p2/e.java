package p2;

import p2.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public double f12431a;

    /* renamed from: b  reason: collision with root package name */
    public double f12432b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12433c;

    /* renamed from: d  reason: collision with root package name */
    public double f12434d;

    /* renamed from: e  reason: collision with root package name */
    public double f12435e;

    /* renamed from: f  reason: collision with root package name */
    public double f12436f;

    /* renamed from: g  reason: collision with root package name */
    public double f12437g;

    /* renamed from: h  reason: collision with root package name */
    public double f12438h;

    /* renamed from: i  reason: collision with root package name */
    public double f12439i;

    /* renamed from: j  reason: collision with root package name */
    public final b.g f12440j;

    public e() {
        this.f12431a = Math.sqrt(1500.0d);
        this.f12432b = 0.5d;
        this.f12433c = false;
        this.f12439i = Double.MAX_VALUE;
        this.f12440j = new b.g();
    }

    public final b.g a(double d10, double d11, long j10) {
        double d12;
        double d13;
        if (!this.f12433c) {
            if (this.f12439i != Double.MAX_VALUE) {
                double d14 = this.f12432b;
                if (d14 > 1.0d) {
                    double d15 = this.f12431a;
                    this.f12436f = (Math.sqrt((d14 * d14) - 1.0d) * d15) + ((-d14) * d15);
                    double d16 = this.f12432b;
                    double d17 = this.f12431a;
                    this.f12437g = ((-d16) * d17) - (Math.sqrt((d16 * d16) - 1.0d) * d17);
                } else if (d14 >= 0.0d && d14 < 1.0d) {
                    this.f12438h = Math.sqrt(1.0d - (d14 * d14)) * this.f12431a;
                }
                this.f12433c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d18 = ((double) j10) / 1000.0d;
        double d19 = d10 - this.f12439i;
        double d20 = this.f12432b;
        if (d20 > 1.0d) {
            double d21 = this.f12437g;
            double d22 = this.f12436f;
            double d23 = d19 - (((d21 * d19) - d11) / (d21 - d22));
            double d24 = ((d19 * d21) - d11) / (d21 - d22);
            d12 = (Math.pow(2.718281828459045d, this.f12436f * d18) * d24) + (Math.pow(2.718281828459045d, d21 * d18) * d23);
            double d25 = this.f12437g;
            double pow = Math.pow(2.718281828459045d, d25 * d18) * d23 * d25;
            double d26 = this.f12436f;
            d13 = (Math.pow(2.718281828459045d, d26 * d18) * d24 * d26) + pow;
        } else if (d20 == 1.0d) {
            double d27 = this.f12431a;
            double d28 = (d27 * d19) + d11;
            double d29 = (d28 * d18) + d19;
            double pow2 = Math.pow(2.718281828459045d, (-d27) * d18) * d29;
            double pow3 = Math.pow(2.718281828459045d, (-this.f12431a) * d18) * d29;
            double d30 = this.f12431a;
            d13 = (Math.pow(2.718281828459045d, (-d30) * d18) * d28) + (pow3 * (-d30));
            d12 = pow2;
        } else {
            double d31 = 1.0d / this.f12438h;
            double d32 = this.f12431a;
            double d33 = ((d20 * d32 * d19) + d11) * d31;
            double sin = ((Math.sin(this.f12438h * d18) * d33) + (Math.cos(this.f12438h * d18) * d19)) * Math.pow(2.718281828459045d, (-d20) * d32 * d18);
            double d34 = this.f12431a;
            double d35 = this.f12432b;
            double d36 = (-d34) * sin * d35;
            double pow4 = Math.pow(2.718281828459045d, (-d35) * d34 * d18);
            double d37 = this.f12438h;
            double d38 = sin;
            double d39 = (-d37) * d19;
            double d40 = this.f12438h;
            d13 = (((Math.cos(d40 * d18) * d33 * d40) + (Math.sin(d37 * d18) * d39)) * pow4) + d36;
            d12 = d38;
        }
        b.g gVar = this.f12440j;
        gVar.f12425a = (float) (d12 + this.f12439i);
        gVar.f12426b = (float) d13;
        return gVar;
    }

    public e(float f10) {
        this.f12431a = Math.sqrt(1500.0d);
        this.f12432b = 0.5d;
        this.f12433c = false;
        this.f12440j = new b.g();
        this.f12439i = (double) f10;
    }
}
