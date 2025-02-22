package i3;

import ag.f2;
import ag.n1;
import android.os.CancellationSignal;
import ff.m;
import java.util.concurrent.CancellationException;
import rf.l;
import sf.j;
import sf.k;

public final class d extends k implements l<Throwable, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f9443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n1 f9444b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(CancellationSignal cancellationSignal, f2 f2Var) {
        super(1);
        this.f9443a = cancellationSignal;
        this.f9444b = f2Var;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        CancellationSignal cancellationSignal = this.f9443a;
        j.f(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
        this.f9444b.e((CancellationException) null);
        return m.f8717a;
    }
}
