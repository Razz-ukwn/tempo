package ag;

import ff.m;
import java.util.concurrent.CancellationException;
import jf.f;
import lf.c;
import rf.l;
import yf.j;

public interface n1 extends f.b {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f446f = 0;

    public static final class a {
        public static /* synthetic */ u0 a(n1 n1Var, boolean z10, r1 r1Var, int i8) {
            boolean z11 = false;
            if ((i8 & 1) != 0) {
                z10 = false;
            }
            if ((i8 & 2) != 0) {
                z11 = true;
            }
            return n1Var.Q(z10, z11, r1Var);
        }
    }

    public static final class b implements f.c<n1> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f447a = new b();
    }

    CancellationException F();

    u0 Q(boolean z10, boolean z11, l<? super Throwable, m> lVar);

    p R(s1 s1Var);

    boolean c();

    void e(CancellationException cancellationException);

    Object e0(c cVar);

    boolean isCancelled();

    u0 k0(l<? super Throwable, m> lVar);

    j q();

    boolean start();

    boolean v0();
}
