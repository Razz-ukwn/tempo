package q;

import rf.l;
import sf.k;

public final class a0 extends k implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f12642a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ double f12643b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f12644c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ double f12645d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(double d10, double d11, double d12, double d13) {
        super(1);
        this.f12642a = d10;
        this.f12643b = d11;
        this.f12644c = d12;
        this.f12645d = d13;
    }

    public final Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        double d10 = this.f12642a;
        double d11 = this.f12643b;
        double exp = Math.exp(d11 * doubleValue) * d10 * d11;
        double d12 = this.f12644c;
        double d13 = this.f12645d;
        return Double.valueOf((Math.exp(d13 * doubleValue) * d12 * d13) + exp);
    }
}
