package q;

import rf.l;
import sf.k;

public final class x extends k implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f12786a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ double f12787b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f12788c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ double f12789d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(double d10, double d11, double d12, double d13) {
        super(1);
        this.f12786a = d10;
        this.f12787b = d11;
        this.f12788c = d12;
        this.f12789d = d13;
    }

    public final Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf((Math.exp(this.f12788c * doubleValue) * ((this.f12787b * doubleValue) + this.f12786a)) + this.f12789d);
    }
}
