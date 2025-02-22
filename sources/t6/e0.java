package t6;

import java.util.concurrent.Callable;

public final class e0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    public final Callable f15394e;

    public /* synthetic */ e0(o oVar) {
        super(false, (String) null, (Exception) null);
        this.f15394e = oVar;
    }

    public final String a() {
        try {
            return (String) this.f15394e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
