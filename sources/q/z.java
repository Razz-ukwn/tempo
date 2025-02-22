package q;

import rf.l;
import sf.k;

public final class z extends k implements l<Double, Double> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f12793a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ double f12794b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ double f12795c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ double f12796d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ double f12797e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(double d10, double d11, double d12, double d13, double d14) {
        super(1);
        this.f12793a = d10;
        this.f12794b = d11;
        this.f12795c = d12;
        this.f12796d = d13;
        this.f12797e = d14;
    }

    public final Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf((Math.exp(this.f12796d * doubleValue) * this.f12795c) + (Math.exp(this.f12794b * doubleValue) * this.f12793a) + this.f12797e);
    }
}
