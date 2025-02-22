package q;

import rf.l;
import sf.k;

public final class y extends k implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f12790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ double f12791b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f12792c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(double d10, double d11, double d12) {
        super(1);
        this.f12790a = d10;
        this.f12791b = d11;
        this.f12792c = d12;
    }

    public final Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        double d10 = this.f12791b;
        double d11 = doubleValue * d10;
        double d12 = (((double) 1) + d11) * this.f12790a;
        return Double.valueOf(Math.exp(d11) * ((this.f12792c * d10) + d12));
    }
}
