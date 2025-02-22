package q7;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import u6.q;

public final class o5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13248a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c7 f13249b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x5 f13250c;

    public o5(x5 x5Var, AtomicReference atomicReference, c7 c7Var) {
        this.f13250c = x5Var;
        this.f13248a = atomicReference;
        this.f13249b = c7Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f13248a) {
            try {
                g3 g3Var = ((x3) this.f13250c.f13121a).D;
                x3.j(g3Var);
                if (!g3Var.o().f(g.f13016c)) {
                    s2 s2Var = ((x3) this.f13250c.f13121a).E;
                    x3.l(s2Var);
                    s2Var.G.b("Analytics storage consent denied; will not get app instance id");
                    a5 a5Var = ((x3) this.f13250c.f13121a).L;
                    x3.k(a5Var);
                    a5Var.C.set((Object) null);
                    g3 g3Var2 = ((x3) this.f13250c.f13121a).D;
                    x3.j(g3Var2);
                    g3Var2.B.b((String) null);
                    this.f13248a.set((Object) null);
                    this.f13248a.notify();
                    return;
                }
                x5 x5Var = this.f13250c;
                j2 j2Var = x5Var.f13433d;
                if (j2Var == null) {
                    s2 s2Var2 = ((x3) x5Var.f13121a).E;
                    x3.l(s2Var2);
                    s2Var2.B.b("Failed to get app instance id");
                    this.f13248a.notify();
                    return;
                }
                q.i(this.f13249b);
                this.f13248a.set(j2Var.G(this.f13249b));
                String str = (String) this.f13248a.get();
                if (str != null) {
                    a5 a5Var2 = ((x3) this.f13250c.f13121a).L;
                    x3.k(a5Var2);
                    a5Var2.C.set(str);
                    g3 g3Var3 = ((x3) this.f13250c.f13121a).D;
                    x3.j(g3Var3);
                    g3Var3.B.b(str);
                }
                this.f13250c.t();
                atomicReference = this.f13248a;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    s2 s2Var3 = ((x3) this.f13250c.f13121a).E;
                    x3.l(s2Var3);
                    s2Var3.B.c(e10, "Failed to get app instance id");
                    atomicReference = this.f13248a;
                } catch (Throwable th) {
                    this.f13248a.notify();
                    throw th;
                }
            }
        }
    }
}
