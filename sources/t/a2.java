package t;

import androidx.fragment.app.z0;
import ff.m;
import java.util.concurrent.CancellationException;
import rf.l;
import sf.k;
import t.z1;

public final class a2 extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z1 f14985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f14986b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2(z1 z1Var, Throwable th) {
        super(1);
        this.f14985a = z1Var;
        this.f14986b = th;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        z1 z1Var = this.f14985a;
        Object obj2 = z1Var.f15298b;
        Throwable th2 = this.f14986b;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                if (!(!(th instanceof CancellationException))) {
                    th = null;
                }
                if (th != null) {
                    z0.c(th2, th);
                }
            }
            z1Var.f15300d = th2;
            z1Var.f15310o.setValue(z1.d.f15314a);
        }
        return m.f8717a;
    }
}
