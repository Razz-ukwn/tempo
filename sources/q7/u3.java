package q7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class u3 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final long f13356a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13357b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13358c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w3 f13359d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Runnable runnable, boolean z10, String str) {
        super(runnable, (Object) null);
        this.f13359d = w3Var;
        long andIncrement = w3.G.getAndIncrement();
        this.f13356a = andIncrement;
        this.f13358c = str;
        this.f13357b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            s2 s2Var = ((x3) w3Var.f13121a).E;
            x3.l(s2Var);
            s2Var.B.b("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        u3 u3Var = (u3) obj;
        boolean z10 = u3Var.f13357b;
        boolean z11 = this.f13357b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = u3Var.f13356a;
        long j11 = this.f13356a;
        int i8 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i8 < 0) {
            return -1;
        }
        if (i8 > 0) {
            return 1;
        }
        s2 s2Var = ((x3) this.f13359d.f13121a).E;
        x3.l(s2Var);
        s2Var.C.c(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    public final void setException(Throwable th) {
        s2 s2Var = ((x3) this.f13359d.f13121a).E;
        x3.l(s2Var);
        s2Var.B.c(th, this.f13358c);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u3(w3 w3Var, Callable callable, boolean z10) {
        super(callable);
        this.f13359d = w3Var;
        long andIncrement = w3.G.getAndIncrement();
        this.f13356a = andIncrement;
        this.f13358c = "Task exception on worker thread";
        this.f13357b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            s2 s2Var = ((x3) w3Var.f13121a).E;
            x3.l(s2Var);
            s2Var.B.b("Tasks index overflow");
        }
    }
}
